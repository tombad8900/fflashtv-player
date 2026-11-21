package com.fflashtv.player.model

enum class ContentType {
    LIVE, VOD, SERIES, AUDIO
}

enum class DrmType {
    NONE, CLEARKEY, WIDEVINE
}

data class DrmConfig(
    val type: DrmType = DrmType.NONE,
    val kid: String = "",
    val key: String = "",
    val licenseUrl: String = "",
    val licenseHeaders: Map<String, String> = emptyMap()
)

data class QualityOption(
    val label: String,
    val url: String,
    val qualityType: String = "",
    val headers: Map<String, String> = emptyMap(),
    val drmConfig: DrmConfig = DrmConfig(),
    val isSelected: Boolean = false
)

data class PlaybackInput(
    val id: String = "",
    val url: String,
    val title: String = "Untitled Stream",
    val contentType: ContentType = ContentType.VOD,
    val mimeHint: String? = null,
    val extension: String? = null,
    val resumePositionMs: Long = 0L,
    val playWhenReady: Boolean = true,
    val headers: Map<String, String> = emptyMap(),
    val drmConfig: DrmConfig = DrmConfig(),
    val qualities: List<QualityOption> = emptyList(),
    val posterUrl: String? = null,
    val allowInsecureTls: Boolean = false,
    val extraInfo: Map<String, String> = emptyMap(),
    val subtitles: List<String> = emptyList()
)

data class ParsedPlayback(
    val id: String,
    val originalInput: PlaybackInput,
    val url: String,
    val title: String,
    val contentType: ContentType,
    val isLive: Boolean,
    val resolvedMimeType: String?,
    val headers: Map<String, String>,
    val userAgent: String,
    val drmConfig: DrmConfig,
    val resumePositionMs: Long,
    val playWhenReady: Boolean,
    val qualities: List<QualityOption>,
    val posterUrl: String?,
    val allowInsecureTls: Boolean,
    val subtitles: List<String> = emptyList()
)

data class WatchSnapshot(
    val mediaId: String,
    val title: String,
    val url: String,
    val contentType: ContentType,
    val positionMs: Long,
    val durationMs: Long,
    val started: Boolean,
    val completed: Boolean,
    val updatedAtMs: Long,
    val storageKey: String = "flash_pending_watch_v1",
    val revision: Int = 1
)

data class HistoryEntry(
    val mediaId: String,
    val title: String,
    val url: String,
    val category: String, // "Movies" or "Series"
    val positionMs: Long,
    val durationMs: Long,
    val updatedAtMs: Long
)
