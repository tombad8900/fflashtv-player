package com.fflashtv.player.ui

import android.content.Context
import android.content.Intent
import com.fflashtv.player.model.PlaybackInput
import com.fflashtv.player.sources.ChannelItem
import com.fflashtv.player.mpv.MpvPlayerActivity

/**
 * Keeps one normalized playback playlist and routes it to the selected player UI.
 * The Media3-based EXO presentation is intentionally a separate Activity, not a fake decoder.
 */
object PlayerLaunchBridge {
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
        val target = when (engine) {
            EngineType.MEDIA3 -> PlayerActivity::class.java
            EngineType.LIBMPV -> MpvPlayerActivity::class.java
            EngineType.EXOTV -> ExoTvPlayerActivity::class.java
        }
        val intent = Intent(context, target)
        if (context !is android.app.Activity) intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}
