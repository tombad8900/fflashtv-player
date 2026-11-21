package com.fflashtv.player.ui

import androidx.annotation.OptIn
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.util.UnstableApi
import androidx.media3.ui.AspectRatioFrameLayout
import androidx.media3.ui.PlayerView
import kotlinx.coroutines.delay

@OptIn(UnstableApi::class)
@Composable
fun PlayerScreen(
    viewModel: PlayerViewModel,
    onToggleFullscreen: (Boolean) -> Unit,
    onEnterPip: () -> Unit
) {
    val state by viewModel.playbackState.collectAsState()
    val player by viewModel.playerFlow.collectAsState()
    val activeDialog by viewModel.activeDialog.collectAsState()
    val history by viewModel.history.collectAsState()
    val formatMessage by viewModel.formatMessage.collectAsState()

    var controlsVisible by remember { mutableStateOf(true) }
    var isLocked by remember { mutableStateOf(false) }

    LaunchedEffect(controlsVisible, activeDialog, state.isPlaying, state.isInPip, isLocked) {
        if (state.isInPip) {
            controlsVisible = false
        } else if (controlsVisible && activeDialog == ActiveDialog.NONE && state.isPlaying) {
            delay(4_000L)
            controlsVisible = false
        }
    }

    val resizeMode = when (state.resizeIndex) {
        0 -> AspectRatioFrameLayout.RESIZE_MODE_FIT
        1 -> AspectRatioFrameLayout.RESIZE_MODE_FILL
        2 -> AspectRatioFrameLayout.RESIZE_MODE_ZOOM
        else -> AspectRatioFrameLayout.RESIZE_MODE_FIXED_WIDTH
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                if (!state.isInPip) {
                    controlsVisible = !controlsVisible
                }
            }
    ) {
        AndroidView(
            modifier = Modifier.fillMaxSize(),
            factory = { ctx ->
                PlayerView(ctx).apply {
                    useController = false
                    keepScreenOn = true
                }
            },
            update = { view ->
                view.player = player
                view.resizeMode = resizeMode
            }
        )

        if (state.showPoster && !state.isPlaying) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF0A0C10)),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(24.dp)
                ) {
                    Text(
                        text = state.title,
                        color = Color.White,
                        style = MaterialTheme.typography.titleLarge
                    )
                    if (!state.errorMessage.isNullOrBlank()) {
                        Spacer(Modifier.height(8.dp))
                        Text(
                            text = state.errorMessage!!,
                            color = Color(0xFFFF8A80),
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }

        if (state.isBuffering && !state.isInPip) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center),
                color = Color(0xFFE50914)
            )
        }

        if (controlsVisible && !state.isInPip) {
            PlayerControls(
                state = state,
                isLocked = isLocked,
                onToggleLock = { isLocked = !isLocked },
                onPlayPause = {
                    if (state.isPlaying) viewModel.sessionManager.pause()
                    else viewModel.sessionManager.play()
                },
                onSeekTo = { viewModel.sessionManager.seekTo(it) },
                onSeekForward = { viewModel.sessionManager.seekForward() },
                onSeekBackward = { viewModel.sessionManager.seekBackward() },
                onPrevious = { viewModel.sessionManager.playPrevious() },
                onNext = { viewModel.sessionManager.playNext() },
                onOpenVolume = { viewModel.openDialog(ActiveDialog.VOLUME) },
                onOpenQuality = { viewModel.openDialog(ActiveDialog.QUALITY) },
                onOpenTracks = { viewModel.openDialog(ActiveDialog.TRACKS) },
                onOpenFormat = { viewModel.openDialog(ActiveDialog.FORMAT) },
                onOpenErrorInfo = { viewModel.openDialog(ActiveDialog.ERROR) },
                onOpenStream = { viewModel.openDialog(ActiveDialog.OPEN_STREAM) },
                onCycleAspect = { viewModel.sessionManager.cycleAspectRatio() },
                onToggleFullscreen = {
                    val next = !state.isFullscreen
                    viewModel.sessionManager.setFullscreen(next)
                    onToggleFullscreen(next)
                },
                onEnterPip = onEnterPip
            )
        }

        if (!state.isInPip) {
            PlayerDialogs(
                activeDialog = activeDialog,
                state = state,
                history = history,
                formatMessage = formatMessage,
                onDismiss = { viewModel.closeDialog() },
                onVolumeChange = { viewModel.sessionManager.setVolume(it) },
                onToggleMute = { viewModel.sessionManager.toggleMute() },
                onSelectQuality = { viewModel.sessionManager.selectQuality(it) },
                onSelectTrack = { viewModel.selectTrack(it) },
                onDisableSubtitles = { viewModel.disableSubtitles() },
                onSwitchFormat = { viewModel.switchFormat(it) },
                onOpenCustomStream = { u, t, ct, ua, ref, ck, dt, kd, ky, lic ->
                    viewModel.openCustomStream(u, t, ct, ua, ref, ck, dt, kd, ky, lic)
                }
            )
        }
    }
}
