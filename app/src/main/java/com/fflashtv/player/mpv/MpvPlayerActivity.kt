package com.fflashtv.player.mpv

import android.app.PictureInPictureParams
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import android.util.Rational
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.fflashtv.player.ui.PlayerLaunchBridge

class MpvPlayerActivity : ComponentActivity() {

    private lateinit var engine: MpvEngine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE
        applyFullscreen(true)

        engine = MpvEngine(this)
        engine.setPlaylist(PlayerLaunchBridge.pendingPlaylist, PlayerLaunchBridge.pendingStartIndex)

        setContent {
            MaterialTheme(colorScheme = darkColorScheme()) {
                MpvPlayerScreen(
                    engine = engine,
                    onToggleFullscreen = { fs ->
                        requestedOrientation = if (fs) ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE else ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                        applyFullscreen(fs)
                    },
                    onEnterPip = { enterPip() },
                    onBack = { finish() }
                )
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        engine.setPlaylist(PlayerLaunchBridge.pendingPlaylist, PlayerLaunchBridge.pendingStartIndex)
    }

    private fun applyFullscreen(fullscreen: Boolean) {
        val controller = WindowCompat.getInsetsController(window, window.decorView)
        controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        if (fullscreen) controller.hide(WindowInsetsCompat.Type.systemBars())
        else controller.show(WindowInsetsCompat.Type.systemBars())
    }

    private fun enterPip() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            enterPictureInPictureMode(PictureInPictureParams.Builder().setAspectRatio(Rational(16, 9)).build())
        }
    }

    override fun onPictureInPictureModeChanged(isInPictureInPictureMode: Boolean, newConfig: Configuration) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig)
        engine.setInPip(isInPictureInPictureMode)
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        if (engine.state.value.isPlaying) enterPip()
    }

    override fun onPause() {
        super.onPause()
        engine.onPause()
    }

    override fun onResume() {
        super.onResume()
        engine.onResume()
        applyFullscreen(engine.state.value.isFullscreen)
    }

    override fun onDestroy() {
        super.onDestroy()
        engine.release()
    }
}
