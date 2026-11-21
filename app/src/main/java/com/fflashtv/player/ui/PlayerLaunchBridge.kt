package com.fflashtv.player.ui

import android.content.Context
import android.content.Intent
import com.fflashtv.player.model.PlaybackInput
import com.fflashtv.player.sources.ChannelItem

data class PendingEmbedSource(
    val name: String,
    val url: String,
    val headers: Map<String, String> = emptyMap()
)

data class PendingEmbedPlayback(
    val mediaId: String,
    val title: String,
    val posterUrl: String,
    val sources: List<PendingEmbedSource>
)

/**
 * One official playback entry point. IPTV playlists and TMDB embed requests
 * both enter the same EXO TV player Activity.
 */
object PlayerLaunchBridge {
    @Volatile
    var pendingPlaylist: List<PlaybackInput> = emptyList()
        private set

    @Volatile
    var pendingStartIndex: Int = 0
        private set

    @Volatile
    private var pendingEmbed: PendingEmbedPlayback? = null

    fun launch(context: Context, items: List<ChannelItem>, startIndex: Int) {
        if (items.isEmpty() || startIndex !in items.indices) return
        pendingEmbed = null
        pendingPlaylist = items.map(ChannelItem::toPlaybackInput)
        pendingStartIndex = startIndex
        launchActivity(context)
    }

    fun launchEmbed(context: Context, request: PendingEmbedPlayback) {
        if (request.sources.isEmpty()) return
        pendingPlaylist = emptyList()
        pendingStartIndex = 0
        pendingEmbed = request
        launchActivity(context)
    }

    fun consumePendingEmbed(): PendingEmbedPlayback? {
        val request = pendingEmbed
        pendingEmbed = null
        return request
    }

    private fun launchActivity(context: Context) {
        val intent = Intent(context, ExoTvPlayerActivity::class.java)
        if (context !is android.app.Activity) intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}
