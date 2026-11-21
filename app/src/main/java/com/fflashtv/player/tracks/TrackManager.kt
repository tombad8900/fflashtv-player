package com.fflashtv.player.tracks

import androidx.annotation.OptIn
import androidx.media3.common.C
import androidx.media3.common.Player
import androidx.media3.common.TrackGroup
import androidx.media3.common.TrackSelectionOverride
import androidx.media3.common.Tracks
import androidx.media3.common.util.UnstableApi

enum class MediaTrackType {
    AUDIO, SUBTITLE, VIDEO
}

data class TrackInfo(
    val type: MediaTrackType,
    val groupIndex: Int,
    val trackIndex: Int,
    val label: String,
    val language: String?,
    val width: Int = 0,
    val height: Int = 0,
    val frameRate: Float = 0f,
    val codecs: String? = null,
    val isSelected: Boolean = false,
    internal val mediaTrackGroup: TrackGroup? = null
)

class TrackManager {

    private val preferredArabicCodes = listOf("ar", "ara", "arabic")

    @OptIn(UnstableApi::class)
    fun extractTracks(tracks: Tracks): List<TrackInfo> {
        val result = mutableListOf<TrackInfo>()
        tracks.groups.forEachIndexed { groupIdx, group ->
            val mediaType = when (group.type) {
                C.TRACK_TYPE_AUDIO -> MediaTrackType.AUDIO
                C.TRACK_TYPE_TEXT -> MediaTrackType.SUBTITLE
                C.TRACK_TYPE_VIDEO -> MediaTrackType.VIDEO
                else -> null
            } ?: return@forEachIndexed

            for (i in 0 until group.length) {
                if (!group.isTrackSupported(i)) continue
                val format = group.getTrackFormat(i)
                val lang = format.language
                val label = buildString {
                    if (!format.label.isNullOrBlank()) append(format.label)
                    else if (!lang.isNullOrBlank()) append(lang.uppercase())
                    else append("${mediaType.name} #${i + 1}")

                    if (mediaType == MediaTrackType.VIDEO && format.height > 0) {
                        append(" (${format.width}x${format.height}")
                        if (format.frameRate > 0f) append(" @${format.frameRate.toInt()}fps")
                        append(")")
                    }
                    if (!format.codecs.isNullOrBlank()) {
                        append(" [${format.codecs}]")
                    }
                }
                result.add(
                    TrackInfo(
                        type = mediaType,
                        groupIndex = groupIdx,
                        trackIndex = i,
                        label = label,
                        language = lang,
                        width = format.width,
                        height = format.height,
                        frameRate = format.frameRate,
                        codecs = format.codecs,
                        isSelected = group.isTrackSelected(i),
                        mediaTrackGroup = group.mediaTrackGroup
                    )
                )
            }
        }
        return result
    }

    fun selectTrack(player: Player, track: TrackInfo) {
        val group = track.mediaTrackGroup ?: return
        val paramsBuilder = player.trackSelectionParameters.buildUpon()
        if (track.type == MediaTrackType.SUBTITLE) {
            paramsBuilder.setTrackTypeDisabled(C.TRACK_TYPE_TEXT, false)
        }
        paramsBuilder.setOverrideForType(TrackSelectionOverride(group, track.trackIndex))
        player.trackSelectionParameters = paramsBuilder.build()
    }

    fun disableSubtitles(player: Player) {
        player.trackSelectionParameters = player.trackSelectionParameters
            .buildUpon()
            .setTrackTypeDisabled(C.TRACK_TYPE_TEXT, true)
            .build()
    }

    fun applyPreferredAudioLanguages(player: Player) {
        player.trackSelectionParameters = player.trackSelectionParameters
            .buildUpon()
            .setPreferredAudioLanguages(*preferredArabicCodes.toTypedArray())
            .build()
    }
}
