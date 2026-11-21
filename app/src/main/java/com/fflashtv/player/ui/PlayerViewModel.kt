package com.fflashtv.player.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.fflashtv.player.history.WatchHistoryRepository
import com.fflashtv.player.model.ContentType
import com.fflashtv.player.model.DrmConfig
import com.fflashtv.player.model.DrmType
import com.fflashtv.player.model.HistoryEntry
import com.fflashtv.player.model.PlaybackInput
import com.fflashtv.player.session.PlaybackSessionManager
import com.fflashtv.player.session.PlaybackState
import com.fflashtv.player.tracks.TrackInfo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

enum class ActiveDialog {
    NONE, VOLUME, SERVERS, QUALITY, TRACKS, SPEED, FORMAT, ERROR, OPEN_STREAM
}

class PlayerViewModel(application: Application) : AndroidViewModel(application) {
    val sessionManager = PlaybackSessionManager(application)
    private val historyRepo = WatchHistoryRepository(application)

    val playbackState: StateFlow<PlaybackState> = sessionManager.state
    val playerFlow = sessionManager.playerFlow

    private val _activeDialog = MutableStateFlow(ActiveDialog.NONE)
    val activeDialog: StateFlow<ActiveDialog> = _activeDialog.asStateFlow()

    private val _history = MutableStateFlow<List<HistoryEntry>>(emptyList())
    val history: StateFlow<List<HistoryEntry>> = _history.asStateFlow()

    private val _formatMessage = MutableStateFlow<String?>(null)
    val formatMessage: StateFlow<String?> = _formatMessage.asStateFlow()

    fun addExternalSubtitle(url: String): Result<Unit> = sessionManager.addExternalSubtitle(url)

    fun setPlaybackSpeed(speed: Float) { sessionManager.setPlaybackSpeed(speed) }

    fun retryCurrent() {
        sessionManager.retryCurrent()
    }

    fun loadPlaylist(items: List<PlaybackInput>, startIndex: Int) {
        if (items.isNotEmpty()) {
            sessionManager.setPlaylist(items, startIndex)
        }
    }

    fun openDialog(dialog: ActiveDialog) {
        if (dialog == ActiveDialog.OPEN_STREAM) {
            _history.value = historyRepo.loadAll()
        }
        _formatMessage.value = null
        _activeDialog.value = dialog
    }

    fun closeDialog() {
        _activeDialog.value = ActiveDialog.NONE
        _formatMessage.value = null
    }

    fun openCustomStream(
        url: String,
        title: String,
        contentType: ContentType,
        userAgent: String,
        referer: String,
        cookie: String,
        drmType: DrmType,
        kid: String,
        key: String,
        licenseUrl: String
    ) {
        val headers = buildMap {
            if (userAgent.isNotBlank()) put("User-Agent", userAgent.trim())
            if (referer.isNotBlank()) put("Referer", referer.trim())
            if (cookie.isNotBlank()) put("Cookie", cookie.trim())
        }
        val drm = DrmConfig(
            type = drmType,
            kid = kid.trim(),
            key = key.trim(),
            licenseUrl = licenseUrl.trim()
        )
        sessionManager.openSource(
            PlaybackInput(
                url = url.trim(),
                title = title.ifBlank { "Custom Stream" },
                contentType = contentType,
                headers = headers,
                drmConfig = drm
            )
        )
        closeDialog()
    }

    fun selectTrack(track: TrackInfo) {
        val player = playerFlow.value ?: return
        sessionManager.trackManager.selectTrack(player, track)
    }

    fun disableSubtitles() {
        val player = playerFlow.value ?: return
        sessionManager.trackManager.disableSubtitles(player)
    }

    fun switchFormat(ext: String) {
        val result = sessionManager.switchFormat(ext)
        result.onSuccess {
            closeDialog()
        }.onFailure { err ->
            _formatMessage.value = err.message ?: "تعذر تبديل الصيغة"
        }
    }

    override fun onCleared() {
        super.onCleared()
        sessionManager.release()
    }
}
