package com.fflashtv.player.buffer

import androidx.annotation.OptIn
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.DefaultLoadControl
import com.fflashtv.player.model.ContentType
import com.fflashtv.player.resolver.MimeTypes

enum class BufferProfileType {
    LIVE_HLS,
    LIVE_TS,
    VOD,
    AUDIO
}

data class BufferProfile(
    val type: BufferProfileType,
    val minBufferMs: Int,
    val maxBufferMs: Int,
    val bufferForPlaybackMs: Int,
    val bufferForPlaybackAfterRebufferMs: Int,
    val prioritizeTimeOverSizeThresholds: Boolean = true
)

class BufferManager {

    fun profileFor(contentType: ContentType, isLive: Boolean, mimeType: String?): BufferProfile {
        return when {
            contentType == ContentType.AUDIO -> BufferProfile(
                type = BufferProfileType.AUDIO,
                minBufferMs = 15_000,
                maxBufferMs = 45_000,
                bufferForPlaybackMs = 1_000,
                bufferForPlaybackAfterRebufferMs = 2_000
            )
            isLive && mimeType == MimeTypes.MPEG_TS -> BufferProfile(
                type = BufferProfileType.LIVE_TS,
                minBufferMs = 20_000,
                maxBufferMs = 60_000,
                bufferForPlaybackMs = 1_500,
                bufferForPlaybackAfterRebufferMs = 3_000
            )
            isLive -> BufferProfile(
                type = BufferProfileType.LIVE_HLS,
                minBufferMs = 25_000,
                maxBufferMs = 90_000,
                bufferForPlaybackMs = 2_000,
                bufferForPlaybackAfterRebufferMs = 4_000
            )
            else -> BufferProfile(
                type = BufferProfileType.VOD,
                minBufferMs = 30_000,
                maxBufferMs = 120_000,
                bufferForPlaybackMs = 2_000,
                bufferForPlaybackAfterRebufferMs = 4_000
            )
        }
    }

    @OptIn(UnstableApi::class)
    fun buildLoadControl(profile: BufferProfile): DefaultLoadControl {
        return DefaultLoadControl.Builder()
            .setBufferDurationsMs(
                profile.minBufferMs,
                profile.maxBufferMs,
                profile.bufferForPlaybackMs,
                profile.bufferForPlaybackAfterRebufferMs
            )
            .setPrioritizeTimeOverSizeThresholds(profile.prioritizeTimeOverSizeThresholds)
            .build()
    }
}
