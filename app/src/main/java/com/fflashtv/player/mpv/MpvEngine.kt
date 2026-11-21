package com.fflashtv.player.mpv

import android.content.Context
import android.view.Surface
import com.fflashtv.player.history.WatchHistoryRepository
import com.fflashtv.player.history.WatchProgressStore
import com.fflashtv.player.model.ContentType
import com.fflashtv.player.model.PlaybackInput
import com.fflashtv.player.model.WatchSnapshot
import com.fflashtv.player.netlimit.ConnectionAuditLog
import com.fflashtv.player.netlimit.ConnectionLimitManager
import com.fflashtv.player.netlimit.LocalStreamProxy
import com.fflashtv.player.network.NetworkDefaults
import dev.jdtech.mpv.MPVLib
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.math.min

class MpvEngine(context: Context) : MPVLib.EventObserver {

    private val appContext = context.applicationContext
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)
    private val progressStore = WatchProgressStore(appContext)
    private val historyRepo = WatchHistoryRepository(appContext)
    private val limitManager = ConnectionLimitManager.get(appContext)
    private var localProxy: LocalStreamProxy? = null
    private var switchJob: Job? = null

    private var surfaceAttached = false
    private var initialized = false

    private val _state = MutableStateFlow(MpvPlayerState())
    val state: StateFlow<MpvPlayerState> = _state.asStateFlow()

    private var playlist: List<PlaybackInput> = emptyList()
    private var currentIndex = -1
    private var currentInput: PlaybackInput? = null
    private var sessionToken = 0

    private var retryJob: Job? = null
    private var watchTickerJob: Job? = null
    private var errorCount = 0
    private var resumeOnReturn = false

    fun initIfNeeded() {
        if (initialized) return
        MPVLib.create(appContext)
        MPVLib.setOptionString("profile", "fast")
        MPVLib.setOptionString("vo", "gpu")
        MPVLib.setOptionString("gpu-context", "android")
        MPVLib.setOptionString("opengl-es", "yes")
        MPVLib.setOptionString("ao", "audiotrack")
        MPVLib.setOptionString("hwdec", MpvDecoderMode.HW_PLUS.hwdecValue)
        MPVLib.setOptionString("hwdec-codecs", "all")
        MPVLib.setOptionString("keep-open", "yes")
        MPVLib.setOptionString("cache", "yes")
        MPVLib.setOptionString("demuxer-max-bytes", "64MiB")
        MPVLib.setOptionString("demuxer-max-back-bytes", "32MiB")
        MPVLib.setOptionString("network-timeout", "15")
        MPVLib.setOptionString("sub-auto", "fuzzy")
        MPVLib.setOptionString("alang", "ar,ara,arabic,en,eng")
        MPVLib.setOptionString("slang", "ar,ara,arabic,en,eng")
        MPVLib.setOptionString("idle", "yes")
        MPVLib.init()

        MPVLib.observeProperty("time-pos", MPVLib.MPV_FORMAT_DOUBLE)
        MPVLib.observeProperty("duration", MPVLib.MPV_FORMAT_DOUBLE)
        MPVLib.observeProperty("pause", MPVLib.MPV_FORMAT_FLAG)
        MPVLib.observeProperty("paused-for-cache", MPVLib.MPV_FORMAT_FLAG)
        MPVLib.observeProperty("demuxer-cache-duration", MPVLib.MPV_FORMAT_DOUBLE)
        MPVLib.observeProperty("hwdec-current", MPVLib.MPV_FORMAT_STRING)
        MPVLib.observeProperty("video-codec", MPVLib.MPV_FORMAT_STRING)
        MPVLib.observeProperty("video-params/w", MPVLib.MPV_FORMAT_INT64)
        MPVLib.observeProperty("video-params/h", MPVLib.MPV_FORMAT_INT64)
        MPVLib.observeProperty("track-list/count", MPVLib.MPV_FORMAT_INT64)
        MPVLib.observeProperty("speed", MPVLib.MPV_FORMAT_DOUBLE)

        MPVLib.addObserver(this)
        initialized = true
    }

    fun attachSurface(surface: Surface) {
        initIfNeeded()
        if (!initialized) return
        MPVLib.attachSurface(surface)
        MPVLib.setOptionString("vo", "gpu")
        surfaceAttached = true
        currentInput?.let { input ->
            if (_state.value.url.isNotEmpty() && !_state.value.isPlaying && _state.value.showBackdrop) {
                loadInput(input, resetErrors = false)
            }
        }
    }

    fun onSurfaceChanged(width: Int, height: Int) {
        if (initialized && width > 0 && height > 0) {
            runCatching { MPVLib.setPropertyString("android-surface-size", "${width}x${height}") }
        }
    }

    fun detachSurface() {
        if (!initialized) return
        if (surfaceAttached) {
            MPVLib.setOptionString("vo", "null")
            MPVLib.detachSurface()
            surfaceAttached = false
        }
    }

    fun setPlaylist(items: List<PlaybackInput>, startIndex: Int) {
        playlist = items
        if (items.isNotEmpty() && startIndex in items.indices) {
            currentIndex = startIndex
            openSource(items[startIndex])
        }
    }

    fun openSource(input: PlaybackInput) {
        initIfNeeded()
        retryJob?.cancel()
        errorCount = 0
        currentInput = input
        sessionToken++

        val lower = input.url.lowercase()
        val isLive = input.contentType == ContentType.LIVE ||
            lower.contains("/live/") || lower.contains("live.php") || lower.contains("/play/")

        _state.update {
            it.copy(
                title = input.title,
                url = input.url,
                isLive = isLive,
                isPlaying = false,
                isBuffering = true,
                showBackdrop = true,
                positionSec = 0.0,
                durationSec = 0.0,
                errorMessage = null,
                retryAttempt = 0,
                tracks = emptyList(),
                previousAvailable = currentIndex > 0,
                nextAvailable = currentIndex in 0 until (playlist.size - 1)
            )
        }

        switchJob?.cancel()
        if (limitManager.isEnabled) {
            val token = sessionToken
            switchJob = scope.launch {
                MPVLib.command(arrayOf("stop"))
                localProxy?.stopCurrentUpstream()
                limitManager.terminateActiveConnections("libmpv channel switch")
                var waited = 0
                while (waited < 800 && (MPVLib.getPropertyBoolean("idle-active") != true)) {
                    delay(40L)
                    waited += 40
                }
                ConnectionAuditLog.log("libmpv", "idle-active=${MPVLib.getPropertyBoolean("idle-active")} after ${waited}ms")
                if (token == sessionToken && surfaceAttached) {
                    loadInput(input, resetErrors = true)
                }
            }
        } else if (surfaceAttached) {
            loadInput(input, resetErrors = true)
        }
    }

    private fun loadInput(input: PlaybackInput, resetErrors: Boolean) {
        if (!initialized) return
        if (resetErrors) errorCount = 0

        val ua = input.headers.entries.firstOrNull { it.key.equals("User-Agent", true) }?.value
            ?: NetworkDefaults.DEFAULT_USER_AGENT
        MPVLib.setOptionString("user-agent", ua)

        val extraHeaders = input.headers.entries
            .filter { !it.key.equals("User-Agent", true) && it.key.isNotBlank() }
            .joinToString(",") { "${it.key.trim()}: ${it.value}" }
        MPVLib.setOptionString("http-header-fields", extraHeaders)
        MPVLib.setOptionString("tls-verify", if (input.allowInsecureTls) "no" else "yes")
        MPVLib.setOptionString("sub-files", if (input.subtitles.isNotEmpty()) input.subtitles.joinToString(":") else "")

        val resumePos = if (input.resumePositionMs > 0L) input.resumePositionMs / 1000.0
        else progressStore.getPositionFor(input.id.ifBlank { input.url.hashCode().toString() }) / 1000.0

        if (!_state.value.isLive && resumePos > 1.0) {
            MPVLib.setOptionString("start", resumePos.toString())
        } else {
            MPVLib.setOptionString("start", "none")
        }

        val playUrl = if (limitManager.isEnabled) {
            MPVLib.setOptionString("idle", "yes")
            MPVLib.setOptionString("network-timeout", "5")
            val isHls = input.url.substringBefore('?').endsWith(".m3u8", ignoreCase = true)
            MPVLib.setOptionString("cache-secs", if (isHls) "8" else "3")
            MPVLib.setOptionString("readahead-secs", if (isHls) "6" else "2")
            MPVLib.setOptionString("demuxer-max-bytes", if (isHls) "16MiB" else "8MiB")
            MPVLib.setOptionString("demuxer-max-back-bytes", "2MiB")
            MPVLib.setOptionString("stream-lavf-o", "http_persistent=0,reconnect=0")
            val proxy = localProxy ?: LocalStreamProxy(limitManager.strictStreamClient).also { localProxy = it }
            ConnectionAuditLog.log("libmpv", "Starting strict session via LocalStreamProxy: ${input.title}")
            proxy.startFor(input.url.trim(), input.headers)
        } else {
            MPVLib.setOptionString("network-timeout", "15")
            MPVLib.setOptionString("demuxer-max-bytes", "64MiB")
            MPVLib.setOptionString("demuxer-max-back-bytes", "32MiB")
            input.url.trim()
        }
        MPVLib.setPropertyBoolean("pause", !input.playWhenReady)
        MPVLib.command(arrayOf("loadfile", playUrl, "replace"))
        startWatchTicker()
    }

    fun togglePlayPause() {
        if (!initialized) return
        val paused = MPVLib.getPropertyBoolean("pause") ?: false
        MPVLib.setPropertyBoolean("pause", !paused)
    }

    fun seekTo(sec: Double) {
        MPVLib.command(arrayOf("seek", sec.coerceAtLeast(0.0).toString(), "absolute"))
    }

    fun seekBy(deltaSec: Double) {
        MPVLib.command(arrayOf("seek", deltaSec.toString(), "relative"))
    }

    fun setSpeed(speed: Double) {
        val clamped = speed.coerceIn(0.25, 3.0)
        MPVLib.setPropertyDouble("speed", clamped)
        _state.update { it.copy(speed = clamped) }
    }

    fun setVolume(vol: Int) {
        val clamped = vol.coerceIn(0, 150)
        MPVLib.setPropertyDouble("volume", clamped.toDouble())
        _state.update { it.copy(volume = clamped, isMuted = clamped == 0) }
    }

    fun toggleMute() {
        val cur = _state.value
        if (cur.isMuted || cur.volume == 0) setVolume(100) else setVolume(0)
    }

    fun cycleDecoderMode() {
        val next = when (_state.value.decoderMode) {
            MpvDecoderMode.HW_PLUS -> MpvDecoderMode.HW
            MpvDecoderMode.HW -> MpvDecoderMode.SW
            MpvDecoderMode.SW -> MpvDecoderMode.HW_PLUS
        }
        MPVLib.setPropertyString("hwdec", next.hwdecValue)
        _state.update { it.copy(decoderMode = next) }
    }

    fun cycleAspectMode() {
        if (!initialized) return
        val modes = MpvAspectMode.entries
        val next = modes[(_state.value.aspectMode.ordinal + 1) % modes.size]
        when (next) {
            MpvAspectMode.FIT -> {
                MPVLib.setPropertyDouble("panscan", 0.0)
                MPVLib.setPropertyDouble("video-zoom", 0.0)
                MPVLib.setPropertyString("video-aspect-override", "-1")
            }
            MpvAspectMode.FILL -> {
                MPVLib.setPropertyDouble("panscan", 1.0)
                MPVLib.setPropertyDouble("video-zoom", 0.0)
                MPVLib.setPropertyString("video-aspect-override", "-1")
            }
            MpvAspectMode.ZOOM -> {
                MPVLib.setPropertyDouble("panscan", 0.0)
                MPVLib.setPropertyDouble("video-zoom", 0.35)
                MPVLib.setPropertyString("video-aspect-override", "-1")
            }
            MpvAspectMode.RATIO_16_9 -> {
                MPVLib.setPropertyDouble("panscan", 0.0)
                MPVLib.setPropertyDouble("video-zoom", 0.0)
                MPVLib.setPropertyString("video-aspect-override", "16:9")
            }
            MpvAspectMode.RATIO_4_3 -> {
                MPVLib.setPropertyDouble("panscan", 0.0)
                MPVLib.setPropertyDouble("video-zoom", 0.0)
                MPVLib.setPropertyString("video-aspect-override", "4:3")
            }
        }
        _state.update { it.copy(aspectMode = next) }
    }

    fun selectTrack(track: MpvTrack) {
        if (!initialized) return
        when (track.type) {
            "audio" -> MPVLib.setPropertyInt("aid", track.id)
            "sub" -> {
                MPVLib.setPropertyBoolean("sub-visibility", true)
                MPVLib.setPropertyInt("sid", track.id)
            }
        }
        refreshTracks()
    }

    fun disableSubtitles() {
        MPVLib.setPropertyString("sid", "no")
        refreshTracks()
    }

    fun playNext() {
        if (currentIndex + 1 in playlist.indices) {
            currentIndex++
            openSource(playlist[currentIndex])
        }
    }

    fun playPrevious() {
        if (currentIndex - 1 in playlist.indices) {
            currentIndex--
            openSource(playlist[currentIndex])
        }
    }

    fun setFullscreen(enabled: Boolean) {
        _state.update { it.copy(isFullscreen = enabled) }
    }

    fun setInPip(inPip: Boolean) {
        _state.update { it.copy(isInPip = inPip) }
    }

    fun onPause() {
        saveSnapshot(completed = false)
        retryJob?.cancel()
        if (!_state.value.isInPip) {
            resumeOnReturn = _state.value.isPlaying || _state.value.isBuffering
            MPVLib.setPropertyBoolean("pause", true)
        }
    }

    fun onResume() {
        if (resumeOnReturn) {
            resumeOnReturn = false
            MPVLib.setPropertyBoolean("pause", false)
        }
    }

    private fun refreshTracks() {
        if (!initialized) return
        val count = MPVLib.getPropertyInt("track-list/count") ?: 0
        val list = mutableListOf<MpvTrack>()
        for (i in 0 until count) {
            val type = MPVLib.getPropertyString("track-list/$i/type") ?: continue
            if (type != "audio" && type != "sub" && type != "video") continue
            val id = MPVLib.getPropertyInt("track-list/$i/id") ?: continue
            val title = MPVLib.getPropertyString("track-list/$i/title") ?: ""
            val lang = MPVLib.getPropertyString("track-list/$i/lang") ?: ""
            val codec = MPVLib.getPropertyString("track-list/$i/codec") ?: ""
            val selected = MPVLib.getPropertyBoolean("track-list/$i/selected") ?: false
            list.add(MpvTrack(id, type, title, lang, codec, selected))
        }
        _state.update { it.copy(tracks = list) }
    }

    private fun startWatchTicker() {
        watchTickerJob?.cancel()
        watchTickerJob = scope.launch {
            while (isActive) {
                if (_state.value.isPlaying) saveSnapshot(completed = false)
                delay(5_000L)
            }
        }
    }

    private fun saveSnapshot(completed: Boolean) {
        val input = currentInput ?: return
        val s = _state.value
        val snap = WatchSnapshot(
            mediaId = input.id.ifBlank { input.url.hashCode().toString() },
            title = input.title,
            url = input.url,
            contentType = input.contentType,
            positionMs = (s.positionSec * 1000).toLong().coerceAtLeast(0L),
            durationMs = (s.durationSec * 1000).toLong().coerceAtLeast(0L),
            started = !s.showBackdrop,
            completed = completed,
            updatedAtMs = System.currentTimeMillis()
        )
        progressStore.saveSnapshot(snap)
        historyRepo.record(snap)
    }

    private fun scheduleRecovery() {
        val token = sessionToken
        val input = currentInput ?: return
        if (retryJob?.isActive == true) return
        val delayMs = min((errorCount + 1) * 1_000L, 10_000L)
        errorCount++
        _state.update {
            it.copy(
                isBuffering = true,
                retryAttempt = errorCount,
                errorMessage = "انقطاع البث — محاولة إعادة الاتصال #$errorCount..."
            )
        }
        retryJob = scope.launch {
            delay(delayMs)
            if (token == sessionToken && surfaceAttached) {
                loadInput(input, resetErrors = false)
            }
        }
    }

    override fun event(eventId: Int) {
        scope.launch {
            when (eventId) {
                8 -> { // MPV_EVENT_FILE_LOADED
                    errorCount = 0
                    _state.update {
                        it.copy(
                            isBuffering = false,
                            showBackdrop = false,
                            errorMessage = null,
                            retryAttempt = 0
                        )
                    }
                    refreshTracks()
                }
                7 -> { // MPV_EVENT_END_FILE
                    if (_state.value.isLive) {
                        scheduleRecovery()
                    } else {
                        saveSnapshot(completed = true)
                        _state.update { it.copy(isPlaying = false, isBuffering = false) }
                    }
                }
            }
        }
    }

    override fun eventProperty(property: String) {}

    override fun eventProperty(property: String, value: Long) {
        scope.launch {
            when (property) {
                "video-params/w" -> _state.update { it.copy(videoWidth = value.toInt()) }
                "video-params/h" -> _state.update { it.copy(videoHeight = value.toInt()) }
                "track-list/count" -> refreshTracks()
            }
        }
    }

    override fun eventProperty(property: String, value: Double) {
        scope.launch {
            when (property) {
                "time-pos" -> _state.update { it.copy(positionSec = value.coerceAtLeast(0.0), showBackdrop = false) }
                "duration" -> _state.update { it.copy(durationSec = value.coerceAtLeast(0.0)) }
                "demuxer-cache-duration" -> _state.update { it.copy(cacheDurationSec = value.coerceAtLeast(0.0)) }
                "speed" -> _state.update { it.copy(speed = value) }
            }
        }
    }

    override fun eventProperty(property: String, value: Boolean) {
        scope.launch {
            when (property) {
                "pause" -> _state.update { it.copy(isPlaying = !value) }
                "paused-for-cache" -> _state.update { it.copy(isBuffering = value) }
            }
        }
    }

    override fun eventProperty(property: String, value: String) {
        scope.launch {
            when (property) {
                "hwdec-current" -> _state.update { it.copy(activeHwdec = value) }
                "video-codec" -> _state.update { it.copy(videoCodec = value.uppercase()) }
            }
        }
    }

    fun release() {
        saveSnapshot(completed = false)
        switchJob?.cancel()
        retryJob?.cancel()
        watchTickerJob?.cancel()
        localProxy?.shutdown()
        localProxy = null
        if (limitManager.isEnabled) limitManager.terminateActiveConnections("libmpv release")
        scope.cancel()
        detachSurface()
        MPVLib.removeObserver(this)
        MPVLib.destroy()
        initialized = false
    }
}
