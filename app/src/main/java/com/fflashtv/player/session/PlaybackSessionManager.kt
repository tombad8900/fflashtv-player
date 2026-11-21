package com.fflashtv.player.session

import android.content.Context
import androidx.media3.common.PlaybackException
import androidx.media3.common.Player
import androidx.media3.common.Tracks
import androidx.media3.exoplayer.ExoPlayer
import com.fflashtv.player.buffer.BufferManager
import com.fflashtv.player.core.FormatSwitcher
import com.fflashtv.player.core.LiveStreamManager
import com.fflashtv.player.core.MediaItemFactory
import com.fflashtv.player.core.ExoPlayerEngine
import com.fflashtv.player.core.PlayerController
import com.fflashtv.player.drm.DrmManager
import com.fflashtv.player.history.WatchHistoryRepository
import com.fflashtv.player.history.WatchProgressStore
import com.fflashtv.player.history.WatchTracker
import com.fflashtv.player.model.ParsedPlayback
import com.fflashtv.player.model.PlaybackInput
import com.fflashtv.player.model.QualityOption
import com.fflashtv.player.netlimit.ConnectionAuditLog
import com.fflashtv.player.netlimit.ConnectionLimitManager
import com.fflashtv.player.network.NetworkClient
import com.fflashtv.player.network.StreamDataSourceFactory
import com.fflashtv.player.recovery.RecoveryController
import com.fflashtv.player.resolver.MimeResolver
import com.fflashtv.player.resolver.PlaybackInputParser
import com.fflashtv.player.resolver.StreamProbe
import com.fflashtv.player.tracks.TrackInfo
import com.fflashtv.player.tracks.TrackManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.util.UUID

enum class SessionLifecycleState {
    IDLE,
    PREPARING,
    BUFFERING,
    READY,
    PLAYING,
    PAUSED,
    RECOVERING,
    ENDED,
    ERROR,
    RELEASED
}

data class PlaybackState(
    val sessionId: String = "",
    val lifecycle: SessionLifecycleState = SessionLifecycleState.IDLE,
    val title: String = "FFlashTV Player",
    val url: String = "",
    val mimeType: String? = null,
    val isLive: Boolean = false,
    val isPlaying: Boolean = false,
    val isBuffering: Boolean = false,
    val showPoster: Boolean = true,
    val posterUrl: String? = null,
    val positionMs: Long = 0L,
    val durationMs: Long = 0L,
    val bufferedPositionMs: Long = 0L,
    val volume: Int = 100,
    val lastAudibleVolume: Int = 100,
    val isMuted: Boolean = false,
    val errorMessage: String? = null,
    val retryAttempt: Int = 0,
    val tracks: List<TrackInfo> = emptyList(),
    val qualities: List<QualityOption> = emptyList(),
    val resizeIndex: Int = 0,
    val isFullscreen: Boolean = false,
    val isInPip: Boolean = false,
    val previousAvailable: Boolean = false,
    val nextAvailable: Boolean = false,
    val navigationBusy: Boolean = false
)

data class PlaybackSession(
    val id: String = UUID.randomUUID().toString(),
    val parsed: ParsedPlayback
)

class PlaybackSessionManager(
    context: Context
) : PlayerController {

    private val appContext = context.applicationContext
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)

    private val limitManager = ConnectionLimitManager.get(appContext)
    private val networkClient = NetworkClient()
    private val dataSourceFactory = StreamDataSourceFactory(networkClient)
    private val streamProbe = StreamProbe(networkClient)
    private val bufferManager = BufferManager()
    private val drmManager = DrmManager()
    private val mediaItemFactory = MediaItemFactory(drmManager)
    private val engine = ExoPlayerEngine(appContext, dataSourceFactory, bufferManager, drmManager)
    private val recoveryController = RecoveryController(scope)
    private val liveStreamManager = LiveStreamManager()
    val trackManager = TrackManager()

    private val progressStore = WatchProgressStore(appContext)
    private val historyRepo = WatchHistoryRepository(appContext)
    private val watchTracker = WatchTracker(scope, progressStore, historyRepo)

    private val volumePrefs = appContext.getSharedPreferences("fflashtv_audio_prefs", Context.MODE_PRIVATE)

    private val _state = MutableStateFlow(
        PlaybackState(
            volume = volumePrefs.getInt("volume", 100).coerceIn(0, 100),
            lastAudibleVolume = volumePrefs.getInt("last_audible_volume", 100).coerceIn(1, 100)
        ).let { s ->
            s.copy(isMuted = s.volume == 0)
        }
    )
    val state: StateFlow<PlaybackState> = _state.asStateFlow()

    private val _playerFlow = MutableStateFlow<ExoPlayer?>(null)
    val playerFlow: StateFlow<ExoPlayer?> = _playerFlow.asStateFlow()

    private var activeSession: PlaybackSession? = null
    private var openJob: Job? = null
    private var positionJob: Job? = null
    private var activeListener: Player.Listener? = null

    private var playlist: List<PlaybackInput> = emptyList()
    private var resumeOnReturn: Boolean = false
    private var currentIndex: Int = -1

    fun setPlaylist(items: List<PlaybackInput>, startIndex: Int = 0) {
        playlist = items
        if (items.isNotEmpty() && startIndex in items.indices) {
            currentIndex = startIndex
            openSource(items[startIndex])
        }
    }

    fun retryCurrent() {
        val input = activeSession?.parsed?.originalInput ?: return
        openSource(input, preservePosition = !_state.value.isLive)
    }

    fun openSource(input: PlaybackInput, preservePosition: Boolean = false) {
        val savedPos = if (preservePosition) _state.value.positionMs else {
            if (input.resumePositionMs > 0L) input.resumePositionMs
            else progressStore.getPositionFor(input.id.ifBlank { input.url.hashCode().toString() })
        }

        val limitActive = limitManager.isEnabled
        // Cancel any previous session tasks immediately
        cancelPendingWork()
        watchTracker.detach()
        activeListener?.let { l -> engine.exoPlayer?.removeListener(l) }
        activeListener = null
        engine.release()
        if (limitManager.isEnabled) limitManager.terminateActiveConnections("Media3 release")
        if (limitActive) {
            limitManager.terminateActiveConnections("Media3 channel switch")
        }
        _playerFlow.value = null
        networkClient.headerStore.clear()

        val initialParsed = PlaybackInputParser.parse(input)
        val session = PlaybackSession(parsed = initialParsed)
        activeSession = session

        _state.update {
            it.copy(
                sessionId = session.id,
                lifecycle = SessionLifecycleState.PREPARING,
                title = initialParsed.title,
                url = initialParsed.url,
                mimeType = initialParsed.resolvedMimeType,
                isLive = initialParsed.isLive,
                isPlaying = false,
                isBuffering = true,
                showPoster = true,
                posterUrl = initialParsed.posterUrl,
                positionMs = savedPos,
                durationMs = 0L,
                errorMessage = null,
                retryAttempt = 0,
                tracks = emptyList(),
                qualities = initialParsed.qualities,
                previousAvailable = currentIndex > 0,
                nextAvailable = currentIndex in 0 until (playlist.size - 1)
            )
        }

        openJob = scope.launch {
            val extFromUrl = initialParsed.url.substringBefore('?').substringAfterLast('.', "")
            val quickMime = input.mimeHint ?: MimeResolver.mimeFromExtension(extFromUrl)
            val probeMime = if (quickMime != null || limitActive) quickMime else {
                streamProbe.probe(
                    url = initialParsed.url,
                    headers = initialParsed.headers,
                    userAgent = initialParsed.userAgent,
                    allowInsecureTls = initialParsed.allowInsecureTls
                ).detectedMime
            }

            if (activeSession?.id != session.id) return@launch

            val finalMime = MimeResolver.resolve(
                url = initialParsed.url,
                probeMime = probeMime,
                mimeHint = input.mimeHint,
                explicitExtension = input.extension
            )
            _state.update { it.copy(mimeType = finalMime) }

            val finalParsed = initialParsed.copy(
                resolvedMimeType = finalMime,
                resumePositionMs = if (initialParsed.isLive) 0L else savedPos
            )
            activeSession = session.copy(parsed = finalParsed)

            startPlayerForSession(session.id, finalParsed, finalMime, limitActive)
        }
    }

    private fun startPlayerForSession(sessionId: String, parsed: ParsedPlayback, mimeType: String?, limitActive: Boolean = limitManager.isEnabled) {
        if (activeSession?.id != sessionId) return

        networkClient.headerStore.update(parsed.headers, parsed.userAgent)
        recoveryController.attachSession(sessionId, mimeType)

        if (limitActive) ConnectionAuditLog.log("Media3", "Starting strict session: ${parsed.title}")
        val player = engine.createOrReplacePlayer(parsed, mimeType, if (limitActive) limitManager.strictStreamClient else null)
        trackManager.applyPreferredAudioLanguages(player)

        val currentVol = _state.value.volume
        engine.setVolume(currentVol)

        val listener = object : Player.Listener {
            override fun onPlaybackStateChanged(playbackState: Int) {
                if (activeSession?.id != sessionId) return
                when (playbackState) {
                    Player.STATE_BUFFERING -> _state.update {
                        it.copy(lifecycle = SessionLifecycleState.BUFFERING, isBuffering = true)
                    }
                    Player.STATE_READY -> _state.update {
                        it.copy(
                            lifecycle = if (player.isPlaying) SessionLifecycleState.PLAYING else SessionLifecycleState.READY,
                            isBuffering = false,
                            durationMs = player.duration.coerceAtLeast(0L)
                        )
                    }
                    Player.STATE_ENDED -> {
                        _state.update { it.copy(lifecycle = SessionLifecycleState.ENDED, isPlaying = false) }
                        liveStreamManager.handlePlaybackEnded(player, parsed.isLive) {
                            watchTracker.emitSnapshot(completed = !parsed.isLive)
                        }
                    }
                    Player.STATE_IDLE -> Unit
                }
            }

            override fun onIsPlayingChanged(isPlaying: Boolean) {
                if (activeSession?.id != sessionId) return
                _state.update {
                    it.copy(
                        isPlaying = isPlaying,
                        lifecycle = when {
                            isPlaying -> SessionLifecycleState.PLAYING
                            it.lifecycle == SessionLifecycleState.ENDED -> SessionLifecycleState.ENDED
                            it.lifecycle == SessionLifecycleState.ERROR -> SessionLifecycleState.ERROR
                            else -> SessionLifecycleState.PAUSED
                        }
                    )
                }
            }

            override fun onRenderedFirstFrame() {
                if (activeSession?.id != sessionId) return
                recoveryController.onFirstFrameRendered(sessionId)
                _state.update {
                    it.copy(showPoster = false, errorMessage = null, retryAttempt = 0)
                }
            }

            override fun onTracksChanged(tracks: Tracks) {
                if (activeSession?.id != sessionId) return
                val extracted = trackManager.extractTracks(tracks)
                _state.update { it.copy(tracks = extracted) }
            }

            override fun onPlayerError(error: PlaybackException) {
                if (activeSession?.id != sessionId) return
                _state.update {
                    it.copy(
                        lifecycle = SessionLifecycleState.RECOVERING,
                        showPoster = true,
                        isBuffering = true,
                        errorMessage = "خطأ تشغيل (${error.errorCodeName}) — جاري الاسترداد..."
                    )
                }
                recoveryController.scheduleRecovery(
                    sessionId = sessionId,
                    currentMime = mimeType,
                    error = error,
                    onRetryWithMime = { nextMime, attempt, _ ->
                        if (activeSession?.id != sessionId) return@scheduleRecovery
                        _state.update { it.copy(retryAttempt = attempt, mimeType = nextMime) }
                        val resumePos = if (parsed.isLive) 0L else player.currentPosition.coerceAtLeast(0L)
                        if (limitActive) limitManager.terminateActiveConnections("Media3 retry")
                        startPlayerForSession(sessionId, parsed.copy(resumePositionMs = resumePos), nextMime, limitActive)
                    },
                    onFatalError = { msg ->
                        if (activeSession?.id != sessionId) return@scheduleRecovery
                        _state.update {
                            it.copy(
                                lifecycle = SessionLifecycleState.ERROR,
                                isBuffering = false,
                                errorMessage = msg
                            )
                        }
                    }
                )
            }
        }

        activeListener = listener
        player.addListener(listener)

        watchTracker.attach(
            player = player,
            mediaId = parsed.id,
            title = parsed.title,
            url = parsed.url,
            contentType = parsed.contentType
        )

        val mediaItem = mediaItemFactory.create(parsed, mimeType)
        player.setMediaItem(mediaItem)
        if (!parsed.isLive && parsed.resumePositionMs > 0L) {
            player.seekTo(parsed.resumePositionMs)
        }
        player.playWhenReady = parsed.playWhenReady
        player.prepare()

        _playerFlow.value = player
        startPositionTicker(sessionId, player)
    }

    private fun startPositionTicker(sessionId: String, player: ExoPlayer) {
        positionJob?.cancel()
        positionJob = scope.launch {
            while (isActive && activeSession?.id == sessionId) {
                _state.update {
                    it.copy(
                        positionMs = player.currentPosition.coerceAtLeast(0L),
                        durationMs = player.duration.coerceAtLeast(0L),
                        bufferedPositionMs = player.bufferedPosition.coerceAtLeast(0L)
                    )
                }
                delay(500L)
            }
        }
    }

    fun selectQuality(option: QualityOption) {
        val current = activeSession?.parsed?.originalInput ?: return
        val updatedQualities = current.qualities.map {
            it.copy(isSelected = it.url == option.url && it.label == option.label)
        }
        val nextInput = current.copy(
            url = option.url,
            headers = option.headers.ifEmpty { current.headers },
            drmConfig = if (option.drmConfig.type != com.fflashtv.player.model.DrmType.NONE) option.drmConfig else current.drmConfig,
            qualities = updatedQualities
        )
        openSource(nextInput, preservePosition = !(_state.value.isLive))
    }

    fun switchFormat(targetExt: String): Result<String> {
        val current = activeSession?.parsed?.originalInput
            ?: return Result.failure(IllegalStateException("لا توجد جلسة نشطة"))
        val switched = FormatSwitcher.switchFormat(current.url, targetExt)
        switched.onSuccess { newUrl ->
            openSource(
                current.copy(url = newUrl, mimeHint = null, resumePositionMs = 0L),
                preservePosition = false
            )
        }
        return switched
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

    fun toggleMute() {
        val current = _state.value
        if (current.isMuted || current.volume == 0) {
            setVolume(current.lastAudibleVolume.coerceIn(1, 100))
        } else {
            setVolume(0)
        }
    }

    override fun setVolume(volumePercent: Int) {
        val clamped = volumePercent.coerceIn(0, 100)
        val lastAudible = if (clamped > 0) clamped else _state.value.lastAudibleVolume
        volumePrefs.edit()
            .putInt("volume", clamped)
            .putInt("last_audible_volume", lastAudible)
            .apply()
        engine.setVolume(clamped)
        _state.update {
            it.copy(volume = clamped, lastAudibleVolume = lastAudible, isMuted = clamped == 0)
        }
    }

    fun cycleAspectRatio() {
        _state.update { it.copy(resizeIndex = (it.resizeIndex + 1) % 4) }
    }

    fun setFullscreen(enabled: Boolean) {
        _state.update { it.copy(isFullscreen = enabled) }
    }

    fun setInPip(inPip: Boolean) {
        _state.update { it.copy(isInPip = inPip) }
    }

    fun onActivityPause() {
        watchTracker.emitSnapshot(completed = false)
        recoveryController.cancel()
        if (!_state.value.isInPip) {
            resumeOnReturn = _state.value.isPlaying || _state.value.lifecycle == SessionLifecycleState.PREPARING || _state.value.lifecycle == SessionLifecycleState.BUFFERING
            engine.pause()
        }
    }

    fun onActivityResume() {
        if (resumeOnReturn) {
            resumeOnReturn = false
            engine.play()
        }
    }

    override fun play() = engine.play()
    override fun pause() = engine.pause()
    override fun seekTo(positionMs: Long) = engine.seekTo(positionMs)
    override fun seekForward() = engine.seekForward()
    override fun seekBackward() = engine.seekBackward()
    override fun setPlaybackSpeed(speed: Float) = engine.setPlaybackSpeed(speed)

    private fun cancelPendingWork() {
        openJob?.cancel()
        openJob = null
        positionJob?.cancel()
        positionJob = null
        recoveryController.cancel()
    }

    override fun release() {
        cancelPendingWork()
        watchTracker.detach()
        activeListener?.let { l -> engine.exoPlayer?.removeListener(l) }
        activeListener = null
        engine.release()
        if (limitManager.isEnabled) limitManager.terminateActiveConnections("Media3 release")
        if (limitManager.isEnabled) {
            limitManager.terminateActiveConnections("Media3 release")
        }
        _playerFlow.value = null
        networkClient.headerStore.clear()
        activeSession = null
        _state.update { it.copy(lifecycle = SessionLifecycleState.RELEASED) }
    }
}
