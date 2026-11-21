package com.fflashtv.player.ui

import android.content.Context
import android.content.Intent
import com.fflashtv.player.model.PlaybackInput
import com.fflashtv.player.sources.ChannelItem

/**
 * One official playback entry point. All content types use the EXO TV presentation.
 */
object PlayerLaunchBridge {
    @Deprecated("EXO TV is the only supported player presentation")
    enum class EngineType { MEDIA3, LIBMPV, EXOTV }

    @Volatile
    var pendingPlaylist: List<PlaybackInput> = emptyList()
        private set

    @Volatile
    var pendingStartIndex: Int = 0
        private set

    fun launch(context: Context, items: List<ChannelItem>, startIndex: Int, engine: EngineType) {
        if (items.isEmpty() || startIndex !in items.indices) return
        pendingPlaylist = items.map(ChannelItem::toPlaybackInput)
        pendingStartIndex = startIndex
        // Retain the parameter temporarily for source compatibility; never launch legacy players.
        val intent = Intent(context, ExoTvPlayerActivity::class.java)
        if (context !is android.app.Activity) intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}
