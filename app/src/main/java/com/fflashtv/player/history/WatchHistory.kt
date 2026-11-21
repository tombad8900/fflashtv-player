package com.fflashtv.player.history

import android.content.Context
import androidx.media3.common.Player
import com.fflashtv.player.model.ContentType
import com.fflashtv.player.model.HistoryEntry
import com.fflashtv.player.model.WatchSnapshot
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import org.json.JSONArray
import org.json.JSONObject

class WatchProgressStore(context: Context) {
    private val prefs = context.getSharedPreferences("fflashtv_watch_prefs", Context.MODE_PRIVATE)
    private val storageKey = "flash_pending_watch_v1"
    private val maxRecords = 120

    @Synchronized
    fun saveSnapshot(snapshot: WatchSnapshot) {
        val list = loadAll().toMutableList()
        list.removeAll { it.mediaId == snapshot.mediaId }
        list.add(0, snapshot)
        val trimmed = if (list.size > maxRecords) list.take(maxRecords) else list

        val arr = JSONArray()
        for (item in trimmed) {
            arr.put(JSONObject().apply {
                put("mediaId", item.mediaId)
                put("title", item.title)
                put("url", item.url)
                put("contentType", item.contentType.name)
                put("positionMs", item.positionMs)
                put("durationMs", item.durationMs)
                put("started", item.started)
                put("completed", item.completed)
                put("updated", item.updatedAtMs)
                put("storageKey", storageKey)
                put("revision", item.revision)
            })
        }
        prefs.edit().putString(storageKey, arr.toString()).apply()
    }

    @Synchronized
    fun loadAll(): List<WatchSnapshot> {
        val raw = prefs.getString(storageKey, null) ?: return emptyList()
        return try {
            val arr = JSONArray(raw)
            (0 until arr.length()).map { i ->
                val o = arr.getJSONObject(i)
                WatchSnapshot(
                    mediaId = o.optString("mediaId"),
                    title = o.optString("title"),
                    url = o.optString("url"),
                    contentType = runCatching { ContentType.valueOf(o.optString("contentType")) }
                        .getOrDefault(ContentType.VOD),
                    positionMs = o.optLong("positionMs", 0L),
                    durationMs = o.optLong("durationMs", 0L),
                    started = o.optBoolean("started", false),
                    completed = o.optBoolean("completed", false),
                    updatedAtMs = o.optLong("updated", 0L),
                    storageKey = o.optString("storageKey", storageKey),
                    revision = o.optInt("revision", 1)
                )
            }
        } catch (_: Throwable) {
            emptyList()
        }
    }

    fun getPositionFor(mediaId: String): Long {
        return loadAll().firstOrNull { it.mediaId == mediaId && !it.completed }?.positionMs ?: 0L
    }
}

class WatchHistoryRepository(context: Context) {
    private val prefs = context.getSharedPreferences("fflashtv_history_prefs", Context.MODE_PRIVATE)
    private val key = "watch_history_v1"
    private val maxRecords = 100

    @Synchronized
    fun record(snapshot: WatchSnapshot) {
        if (snapshot.contentType == ContentType.LIVE) return
        val category = if (snapshot.contentType == ContentType.SERIES) "Series" else "Movies"
        val list = loadAll().toMutableList()
        list.removeAll { it.mediaId == snapshot.mediaId }
        list.add(
            0,
            HistoryEntry(
                mediaId = snapshot.mediaId,
                title = snapshot.title,
                url = snapshot.url,
                category = category,
                positionMs = snapshot.positionMs,
                durationMs = snapshot.durationMs,
                updatedAtMs = snapshot.updatedAtMs
            )
        )
        val trimmed = if (list.size > maxRecords) list.take(maxRecords) else list
        val arr = JSONArray()
        for (item in trimmed) {
            arr.put(JSONObject().apply {
                put("mediaId", item.mediaId)
                put("title", item.title)
                put("url", item.url)
                put("category", item.category)
                put("positionMs", item.positionMs)
                put("durationMs", item.durationMs)
                put("updatedAtMs", item.updatedAtMs)
            })
        }
        prefs.edit().putString(key, arr.toString()).apply()
    }

    @Synchronized
    fun loadAll(): List<HistoryEntry> {
        val raw = prefs.getString(key, null) ?: return emptyList()
        return try {
            val arr = JSONArray(raw)
            (0 until arr.length()).map { i ->
                val o = arr.getJSONObject(i)
                HistoryEntry(
                    mediaId = o.optString("mediaId"),
                    title = o.optString("title"),
                    url = o.optString("url"),
                    category = o.optString("category", "Movies"),
                    positionMs = o.optLong("positionMs", 0L),
                    durationMs = o.optLong("durationMs", 0L),
                    updatedAtMs = o.optLong("updatedAtMs", 0L)
                )
            }
        } catch (_: Throwable) {
            emptyList()
        }
    }
}

class WatchTracker(
    private val scope: CoroutineScope,
    private val progressStore: WatchProgressStore,
    private val historyRepository: WatchHistoryRepository
) {
    private var tickerJob: Job? = null
    private var currentPlayer: Player? = null
    private var mediaId: String = ""
    private var title: String = ""
    private var url: String = ""
    private var contentType: ContentType = ContentType.VOD
    private var started: Boolean = false
    private var listener: Player.Listener? = null

    fun attach(
        player: Player,
        mediaId: String,
        title: String,
        url: String,
        contentType: ContentType
    ) {
        detach()
        this.currentPlayer = player
        this.mediaId = mediaId
        this.title = title
        this.url = url
        this.contentType = contentType
        this.started = false

        val l = object : Player.Listener {
            override fun onIsPlayingChanged(isPlaying: Boolean) {
                if (isPlaying) {
                    started = true
                    startTicker()
                } else {
                    stopTicker()
                    emitSnapshot(completed = false)
                }
            }

            override fun onPlaybackStateChanged(playbackState: Int) {
                if (playbackState == Player.STATE_ENDED) {
                    stopTicker()
                    emitSnapshot(completed = contentType != ContentType.LIVE)
                }
            }
        }
        listener = l
        player.addListener(l)
    }

    private fun startTicker() {
        if (tickerJob?.isActive == true) return
        tickerJob = scope.launch {
            while (isActive) {
                emitSnapshot(completed = false)
                delay(5_000L)
            }
        }
    }

    private fun stopTicker() {
        tickerJob?.cancel()
        tickerJob = null
    }

    fun emitSnapshot(completed: Boolean) {
        val player = currentPlayer ?: return
        if (mediaId.isBlank()) return
        val pos = player.currentPosition.coerceAtLeast(0L)
        val dur = player.duration.coerceAtLeast(0L)
        val snapshot = WatchSnapshot(
            mediaId = mediaId,
            title = title,
            url = url,
            contentType = contentType,
            positionMs = pos,
            durationMs = dur,
            started = started,
            completed = completed,
            updatedAtMs = System.currentTimeMillis()
        )
        progressStore.saveSnapshot(snapshot)
        historyRepository.record(snapshot)
    }

    fun detach() {
        emitSnapshot(completed = false)
        stopTicker()
        listener?.let { l -> currentPlayer?.removeListener(l) }
        listener = null
        currentPlayer = null
    }
}
