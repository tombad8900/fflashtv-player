package com.fflashtv.player.sources

import com.fflashtv.player.model.ContentType
import com.fflashtv.player.model.DrmConfig
import com.fflashtv.player.model.PlaybackInput
import com.fflashtv.player.model.QualityOption

enum class SourceType {
    M3U_URL,
    M3U_FILE,
    M3U_TEXT,
    XTREAM,
    SINGLE_CHANNEL
}

enum class SourceStatus {
    IDLE,
    OK,
    UPDATING,
    ERROR
}

data class ChannelItem(
    val id: String,
    val name: String,
    val url: String,
    val groupName: String,
    val logoUrl: String = "",
    val channelNumber: String = "",
    val headers: Map<String, String> = emptyMap(),
    val drmConfig: DrmConfig = DrmConfig(),
    val contentType: ContentType = ContentType.LIVE,
    val metadata: Map<String, String> = emptyMap(),
    val subtitles: List<String> = emptyList(),
    val qualities: List<QualityOption> = emptyList()
) {
    fun toPlaybackInput(): PlaybackInput {
        return PlaybackInput(
            id = id,
            url = url,
            title = name,
            contentType = contentType,
            headers = headers,
            drmConfig = drmConfig,
            posterUrl = logoUrl.takeIf { it.isNotBlank() },
            extraInfo = metadata,
            subtitles = subtitles,
            qualities = qualities
        )
    }
}

data class GroupItem(
    val name: String,
    val channelCount: Int,
    val originalOrder: Int,
    val customOrder: Int = originalOrder,
    val isHidden: Boolean = false
)

data class SourceConfig(
    val id: String,
    val name: String,
    val type: SourceType,
    val url: String = "",
    val rawText: String = "",
    val host: String = "",
    val username: String = "",
    val password: String = "",
    val headers: Map<String, String> = emptyMap(),
    val status: SourceStatus = SourceStatus.IDLE,
    val statusMessage: String = "",
    val lastUpdatedMs: Long = 0L,
    val groupCount: Int = 0,
    val channelCount: Int = 0,
    val accountInfo: String = "",
    val isActive: Boolean = false,
    val autoUpdate: Boolean = false,
    val showEmptyGroups: Boolean = false,
    val useCustomGroupOrder: Boolean = false
)

data class SourcePayload(
    val groups: List<GroupItem>,
    val channels: List<ChannelItem>,
    val favoriteIds: Set<String> = emptySet(),
    val accountInfo: String = ""
)
