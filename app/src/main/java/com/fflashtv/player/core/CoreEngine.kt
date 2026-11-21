package com.fflashtv.player.core

import android.content.Context
import android.net.Uri
import androidx.annotation.OptIn
import androidx.media3.common.C
import androidx.media3.common.MediaItem
import androidx.media3.common.MediaMetadata
import androidx.media3.common.Player
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import androidx.media3.datasource.DefaultHttpDataSource
import com.fflashtv.player.drm.DrmManager
import com.fflashtv.player.model.ParsedPlayback

interface PlayerController {
    fun play()
    fun pause()
    fun seekTo(positionMs: Long)
    fun seekForward()
    fun seekBackward()
    fun setVolume(volumePercent: Int)
    fun setPlaybackSpeed(speed: Float)
    fun release()
}

class MediaItemFactory(
    private val drmManager: DrmManager
) {
    fun create(playback: ParsedPlayback, overrideMime: String? = null): MediaItem {
        val mime = overrideMime ?: playback.resolvedMimeType
        val builder = MediaItem.Builder()
            .setUri(Uri.parse(playback.url))
            .setMediaId(playback.id)
            .setMediaMetadata(
                MediaMetadata.Builder()
                    .setTitle(playback.title)
                    .build()
            )

        if (!mime.isNullOrBlank()) {
            builder.setMimeType(mime)
        }

        if (playback.isLive) {
            builder.setLiveConfiguration(
                MediaItem.LiveConfiguration.Builder()
                    .setMinPlaybackSpeed(0.98f)
                    .setMaxPlaybackSpeed(1.02f)
                    .build()
            )
        }

        if (playback.subtitles.isNotEmpty()) {
            val subConfigs = playback.subtitles.mapIndexed { idx, subUrl ->
                val mime = when {
                    subUrl.contains(".srt", true) -> androidx.media3.common.MimeTypes.APPLICATION_SUBRIP
                    subUrl.contains(".ass", true) -> androidx.media3.common.MimeTypes.TEXT_SSA
                    else -> androidx.media3.common.MimeTypes.TEXT_VTT
                }
                MediaItem.SubtitleConfiguration.Builder(Uri.parse(subUrl))
                    .setMimeType(mime)
                    .setLabel("ترجمة ${idx + 1}")
                    .setSelectionFlags(C.SELECTION_FLAG_DEFAULT)
                    .build()
            }
            builder.setSubtitleConfigurations(subConfigs)
        }
        drmManager.applyWidevineConfig(builder, playback.drmConfig)
        return builder.build()
    }
}

object FormatSwitcher {
    fun switchFormat(currentUrl: String, targetExt: String): Result<String> {
        val cleanTarget = targetExt.trim().lowercase().removePrefix(".")
        if (cleanTarget != "ts" && cleanTarget != "m3u8") {
            return Result.failure(IllegalArgumentException("Unsupported format: $targetExt"))
        }

        val uri = runCatching { Uri.parse(currentUrl) }.getOrNull()
            ?: return Result.failure(IllegalArgumentException("Invalid URL"))
        val path = uri.path ?: ""

        val newPath = when {
            path.endsWith(".ts", ignoreCase = true) ->
                path.dropLast(3) + ".$cleanTarget"
            path.endsWith(".m3u8", ignoreCase = true) ->
                path.dropLast(5) + ".$cleanTarget"
            path.contains("/live/", ignoreCase = true) &&
                path.substringAfterLast('/').all { it.isDigit() } &&
                path.substringAfterLast('/').isNotEmpty() ->
                "$path.$cleanTarget"
            else ->
                return Result.failure(
                    IllegalStateException("لا يمكن تبديل الصيغة: الرابط لا ينتهي بـ .ts أو .m3u8 ولا يطابق نمط /live/ID")
                )
        }

        val rebuilt = uri.buildUpon().path(newPath).build().toString()
        return Result.success(rebuilt)
    }
}

class LiveStreamManager {
    fun handlePlaybackEnded(player: Player, isLive: Boolean, onSaveSnapshot: () -> Unit) {
        onSaveSnapshot()
        if (isLive) {
            player.seekToDefaultPosition()
            player.prepare()
            player.playWhenReady = true
        }
    }
}

class ExoTvOriginalPlayerEngine(
    private val context: Context,
    private val drmManager: DrmManager
) : PlayerController {

    var exoPlayer: ExoPlayer? = null
        private set

    @OptIn(UnstableApi::class)
    fun createOrReplacePlayer(playback: ParsedPlayback, mimeType: String?): ExoPlayer {
        exoPlayer?.release()

        val hasExplicitUserAgent = playback.headers.keys.any { it.equals("User-Agent", ignoreCase = true) }
        val defaultUserAgent = if (hasExplicitUserAgent) null else ORIGINAL_DEFAULT_USER_AGENT
        val httpFactory = DefaultHttpDataSource.Factory()
            .setAllowCrossProtocolRedirects(true)
            .setConnectTimeoutMs(5_000)
            .setReadTimeoutMs(12_000)
            .setUserAgent(defaultUserAgent)
            .setDefaultRequestProperties(playback.headers)

        val mediaSourceFactory = DefaultMediaSourceFactory(context)
            .setDataSourceFactory(httpFactory)

        drmManager.createDrmSessionManagerProvider(playback.drmConfig)?.let { provider ->
            mediaSourceFactory.setDrmSessionManagerProvider(provider)
        }

        // EXO TV's original player uses Media3's default LoadControl and renderer stack.
        val player = ExoPlayer.Builder(context)
            .setMediaSourceFactory(mediaSourceFactory)
            .build()

        player.volume = 1.0f
        exoPlayer = player
        return player
    }

    override fun play() {
        exoPlayer?.playWhenReady = true
        exoPlayer?.play()
    }

    override fun pause() {
        exoPlayer?.pause()
    }

    override fun seekTo(positionMs: Long) {
        exoPlayer?.seekTo(positionMs.coerceAtLeast(0L))
    }

    override fun seekForward() {
        exoPlayer?.seekForward()
    }

    override fun seekBackward() {
        exoPlayer?.seekBack()
    }

    override fun setVolume(volumePercent: Int) {
        exoPlayer?.volume = volumePercent.coerceIn(0, 100) / 100f
    }

    override fun setPlaybackSpeed(speed: Float) {
        exoPlayer?.setPlaybackSpeed(speed.coerceIn(0.25f, 3.0f))
    }

    override fun release() {
        exoPlayer?.release()
        exoPlayer = null
    }

    companion object {
        private const val ORIGINAL_DEFAULT_USER_AGENT =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36"
    }
}
