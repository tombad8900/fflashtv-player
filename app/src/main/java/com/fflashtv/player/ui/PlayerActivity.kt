package com.fflashtv.player.ui

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
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class PlayerActivity : ComponentActivity() {

    private val viewModel: PlayerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE
        viewModel.sessionManager.setFullscreen(true)
        applyFullscreen(true)

        if (savedInstanceState == null) {
            viewModel.loadPlaylist(
                PlayerLaunchBridge.pendingPlaylist,
                PlayerLaunchBridge.pendingStartIndex
            )
        }

        setContent {
            MaterialTheme(colorScheme = darkColorScheme()) {
                PlayerScreen(
                    viewModel = viewModel,
                    onToggleFullscreen = { fullscreen ->
                        requestedOrientation = if (fullscreen) {
                            ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE
                        } else {
                            ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                        }
                        applyFullscreen(fullscreen)
                    },
                    onEnterPip = { enterPip() }
                )
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        viewModel.loadPlaylist(
            PlayerLaunchBridge.pendingPlaylist,
            PlayerLaunchBridge.pendingStartIndex
        )
    }

    private fun applyFullscreen(fullscreen: Boolean) {
        val controller = WindowCompat.getInsetsController(window, window.decorView)
        controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        if (fullscreen) {
            controller.hide(WindowInsetsCompat.Type.systemBars())
        } else {
            controller.show(WindowInsetsCompat.Type.systemBars())
        }
    }

    private fun enterPip() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val params = PictureInPictureParams.Builder()
                .setAspectRatio(Rational(16, 9))
                .build()
            enterPictureInPictureMode(params)
        }
    }

    override fun onPictureInPictureModeChanged(
        isInPictureInPictureMode: Boolean,
        newConfig: Configuration
    ) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig)
        viewModel.sessionManager.setInPip(isInPictureInPictureMode)
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        if (viewModel.playbackState.value.isPlaying) {
            enterPip()
        }
    }

    override fun onPause() {
        super.onPause()
        viewModel.sessionManager.onActivityPause()
    }

    override fun onResume() {
        super.onResume()
        viewModel.sessionManager.onActivityResume()
        applyFullscreen(viewModel.playbackState.value.isFullscreen)
    }
}
