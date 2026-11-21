package com.fflashtv.player.ui

import android.app.PictureInPictureParams
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.util.Rational
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.fflashtv.player.model.ContentType
import com.fflashtv.player.model.PlaybackInput
import com.fflashtv.player.model.QualityOption
import com.fflashtv.player.tmdb.ExoWebViewResolver
import kotlinx.coroutines.launch

class ExoTvPlayerActivity : ComponentActivity() {
    private val viewModel: PlayerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE
        viewModel.sessionManager.setFullscreen(true)
        applyFullscreen(true)
        if (savedInstanceState == null) {
            loadPendingPlayback()
        }
        setContent {
            MaterialTheme(colorScheme = darkColorScheme()) {
                ExoTvPlayerScreen(
                    viewModel = viewModel,
                    onExit = { finish() },
                    onToggleFullscreen = { full ->
                        requestedOrientation = if (full) ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE
                        else ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                        applyFullscreen(full)
                    },
                    onEnterPip = { enterPip() }
                )
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        loadPendingPlayback()
    }

    private fun loadPendingPlayback() {
        val embed = PlayerLaunchBridge.consumePendingEmbed()
        if (embed == null) {
            viewModel.loadPlaylist(PlayerLaunchBridge.pendingPlaylist, PlayerLaunchBridge.pendingStartIndex)
            return
        }

        lifecycleScope.launch {
            var lastError = "لم يتم العثور على مصدر صالح."
            for (source in embed.sources) {
                val result = ExoWebViewResolver.capture(this@ExoTvPlayerActivity, source.url, source.headers)
                val sniffed = result.getOrNull()
                if (sniffed == null) {
                    lastError = source.name + ": " + (result.exceptionOrNull()?.message ?: "لم يتم التقاط رابط")
                    continue
                }

                val headers = LinkedHashMap(sniffed.requestHeaders)
                if (sniffed.referer.isNotBlank()) headers["Referer"] = sniffed.referer
                if (sniffed.userAgent.isNotBlank()) headers["User-Agent"] = sniffed.userAgent
                if (sniffed.cookies.isNotBlank()) headers["Cookie"] = sniffed.cookies

                viewModel.sessionManager.openSource(
                    PlaybackInput(
                        id = embed.mediaId,
                        url = sniffed.streamUrl,
                        title = embed.title,
                        contentType = ContentType.VOD,
                        headers = headers,
                        qualities = sniffed.candidates.drop(1).mapIndexed { index, candidate ->
                            QualityOption(
                                label = "بديل EXO " + (index + 1) + " (" + candidate.type + ")",
                                url = candidate.url,
                                qualityType = candidate.type,
                                headers = candidate.headers
                            )
                        },
                        posterUrl = embed.posterUrl.takeIf { it.isNotBlank() },
                        subtitles = sniffed.subtitles,
                        extraInfo = mapOf("source" to source.name, "resolver" to sniffed.diagnostics)
                    )
                )
                return@launch
            }

            Toast.makeText(this@ExoTvPlayerActivity, lastError, Toast.LENGTH_LONG).show()
            finish()
        }
    }

    private fun applyFullscreen(fullscreen: Boolean) {
        val controller = WindowCompat.getInsetsController(window, window.decorView)
        controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        if (fullscreen) controller.hide(WindowInsetsCompat.Type.systemBars())
        else controller.show(WindowInsetsCompat.Type.systemBars())
    }

    private fun enterPip() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            enterPictureInPictureMode(
                PictureInPictureParams.Builder().setAspectRatio(Rational(16, 9)).build()
            )
        }
    }

    override fun onPictureInPictureModeChanged(inPip: Boolean, newConfig: Configuration) {
        super.onPictureInPictureModeChanged(inPip, newConfig)
        viewModel.sessionManager.setInPip(inPip)
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        if (viewModel.playbackState.value.isPlaying) enterPip()
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
