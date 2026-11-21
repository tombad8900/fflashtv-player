package com.fflashtv.player.ui

import androidx.annotation.OptIn
import androidx.compose.foundation.background
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.type
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.foundation.focusable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.activity.compose.BackHandler
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
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
fun ExoTvPlayerScreen(
    viewModel: PlayerViewModel,
    onExit: () -> Unit,
    onToggleFullscreen: (Boolean) -> Unit,
    onEnterPip: () -> Unit
) {
    val state by viewModel.playbackState.collectAsState()
    val player by viewModel.playerFlow.collectAsState()
    val activeDialog by viewModel.activeDialog.collectAsState()
    val history by viewModel.history.collectAsState()
    val formatMessage by viewModel.formatMessage.collectAsState()
    var controlsVisible by remember { mutableStateOf(true) }
    val playerFocusRequester = remember { FocusRequester() }
    LaunchedEffect(Unit) { playerFocusRequester.requestFocus() }
    var scrubbing by remember { mutableStateOf(false) }
    var scrubPosition by remember(state.sessionId) { mutableFloatStateOf(state.positionMs.toFloat()) }

    LaunchedEffect(state.positionMs, scrubbing) {
        if (!scrubbing) scrubPosition = state.positionMs.toFloat()
    }

    LaunchedEffect(controlsVisible, state.isPlaying, activeDialog, state.isInPip) {
        if (state.isInPip) controlsVisible = false
        else if (controlsVisible && state.isPlaying && activeDialog == ActiveDialog.NONE) {
            delay(4_000L)
            controlsVisible = false
        }
    }

    BackHandler(enabled = !state.isInPip) { onExit() }

    val resize = when (state.resizeIndex) {
        1 -> AspectRatioFrameLayout.RESIZE_MODE_FILL
        2 -> AspectRatioFrameLayout.RESIZE_MODE_ZOOM
        3 -> AspectRatioFrameLayout.RESIZE_MODE_FIXED_WIDTH
        else -> AspectRatioFrameLayout.RESIZE_MODE_FIT
    }

    Box(
        Modifier.fillMaxSize().background(Color.Black).focusRequester(playerFocusRequester).focusable()
            .onPreviewKeyEvent { event ->
                if (event.type != KeyEventType.KeyDown) return@onPreviewKeyEvent false
                when (event.key) {
                    Key.DirectionLeft -> {
                        viewModel.sessionManager.seekBackward(); controlsVisible = true; true
                    }
                    Key.DirectionRight -> {
                        viewModel.sessionManager.seekForward(); controlsVisible = true; true
                    }
                    Key.DirectionUp, Key.DirectionDown -> {
                        controlsVisible = true; true
                    }
                    Key.DirectionCenter, Key.Enter, Key.NumPadEnter -> {
                        if (controlsVisible) {
                            if (state.isPlaying) viewModel.sessionManager.pause() else viewModel.sessionManager.play()
                        } else controlsVisible = true
                        true
                    }
                    Key.MediaPlayPause -> {
                        if (state.isPlaying) viewModel.sessionManager.pause() else viewModel.sessionManager.play()
                        controlsVisible = true; true
                    }
                    Key.MediaPlay -> { viewModel.sessionManager.play(); controlsVisible = true; true }
                    Key.MediaPause -> { viewModel.sessionManager.pause(); controlsVisible = true; true }
                    Key.MediaNext -> {
                        if (state.nextAvailable) viewModel.sessionManager.playNext()
                        controlsVisible = true; true
                    }
                    Key.MediaPrevious -> {
                        if (state.previousAvailable) viewModel.sessionManager.playPrevious()
                        controlsVisible = true; true
                    }
                    Key.VolumeUp -> {
                        viewModel.sessionManager.setVolume((state.volume + 5).coerceAtMost(100)); true
                    }
                    Key.VolumeDown -> {
                        viewModel.sessionManager.setVolume((state.volume - 5).coerceAtLeast(0)); true
                    }
                    else -> false
                }
            }
            .pointerInput(state.isInPip) {
            detectTapGestures(
                onTap = { if (!state.isInPip) controlsVisible = !controlsVisible },
                onDoubleTap = { point ->
                    if (!state.isInPip) {
                        if (point.x < size.width / 2f) viewModel.sessionManager.seekBackward()
                        else viewModel.sessionManager.seekForward()
                        controlsVisible = true
                    }
                }
            )
        }
    ) {
        AndroidView(
            modifier = Modifier.fillMaxSize(),
            factory = { context ->
                PlayerView(context).apply {
                    useController = false
                    keepScreenOn = true
                    setShowBuffering(PlayerView.SHOW_BUFFERING_NEVER)
                }
            },
            update = { it.player = player; it.resizeMode = resize }
        )

        if (state.showPoster && !state.isPlaying && !state.isBuffering) {
            Column(
                Modifier.align(Alignment.Center).padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(state.title, color = Color.White, style = MaterialTheme.typography.titleLarge)
                state.errorMessage?.let { Text(it, color = Color(0xFFFF7777), modifier = Modifier.padding(top = 8.dp)) }
                Button(onClick = {
                    viewModel.retryCurrent()
                }, modifier = Modifier.padding(top = 10.dp)) { Text("إعادة المحاولة") }
            }
        }

        if (state.isBuffering && !state.isInPip) {
            CircularProgressIndicator(Modifier.align(Alignment.Center), color = Color(0xFFFFD15C))
        }

        if (controlsVisible && !state.isInPip) {
            Text(
                text = state.title,
                color = Color.White,
                style = MaterialTheme.typography.titleMedium,
                maxLines = 1,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .fillMaxWidth(0.7f)
                    .padding(start = 20.dp, top = 20.dp, end = 12.dp)
            )
        }

        if (controlsVisible && !state.isInPip) {
            Column(
                Modifier.align(Alignment.BottomCenter).fillMaxWidth()

                    .background(Color(0xCC080A0E)).padding(horizontal = 18.dp, vertical = 12.dp)
            ) {
                if (!state.isLive && state.durationMs > 0L) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(formatTime(state.positionMs), color = Color.White, style = MaterialTheme.typography.labelSmall)
                        Slider(
                            value = scrubPosition.coerceIn(0f, state.durationMs.coerceAtLeast(1L).toFloat()),
                            onValueChange = { scrubPosition = it; scrubbing = true },
                            onValueChangeFinished = {
                                viewModel.sessionManager.seekTo(scrubPosition.toLong())
                                scrubbing = false
                            },
                            valueRange = 0f..state.durationMs.coerceAtLeast(1L).toFloat(),
                            modifier = Modifier.weight(1f).padding(horizontal = 8.dp)
                        )
                        Text(formatTime(state.durationMs), color = Color.White, style = MaterialTheme.typography.labelSmall)
                    }
                }

                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        modifier = Modifier.weight(1f),
                        onClick = {
                            if (state.isPlaying) viewModel.sessionManager.pause() else viewModel.sessionManager.play()
                            controlsVisible = true
                        }
                    ) {
                        Icon(
                            if (state.isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
                            "تشغيل وإيقاف",
                            tint = Color.White,
                            modifier = Modifier.size(27.dp)
                        )
                    }
                    IconButton(
                        modifier = Modifier.weight(1f),
                        onClick = { viewModel.sessionManager.toggleMute() }
                    ) {
                        Icon(
                            if (state.isMuted) Icons.Default.VolumeOff else Icons.Default.VolumeUp,
                            "كتم الصوت",
                            tint = Color.White,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                    IconButton(
                        modifier = Modifier.weight(1f),
                        onClick = { viewModel.openDialog(ActiveDialog.SERVERS) }
                    ) {
                        Icon(Icons.Default.Dvr, "السيرفرات", tint = Color.White, modifier = Modifier.size(25.dp))
                    }
                    IconButton(
                        modifier = Modifier.weight(1f),
                        onClick = { viewModel.sessionManager.cycleAspectRatio() }
                    ) {
                        Icon(Icons.Default.AspectRatio, "نمط العرض", tint = Color.White, modifier = Modifier.size(25.dp))
                    }
                    if (state.tracks.any { it.type.name == "SUBTITLE" }) {
                        IconButton(
                            modifier = Modifier.weight(1f),
                            onClick = { viewModel.openDialog(ActiveDialog.TRACKS) }
                        ) {
                            Icon(Icons.Default.Subtitles, "الترجمة", tint = Color.White, modifier = Modifier.size(25.dp))
                        }
                    }
                    IconButton(
                        modifier = Modifier.weight(1f),
                        onClick = { viewModel.openDialog(ActiveDialog.QUALITY) }
                    ) {
                        Icon(Icons.Default.HighQuality, "الجودة", tint = Color.White, modifier = Modifier.size(25.dp))
                    }
                    IconButton(
                        modifier = Modifier.weight(1f),
                        onClick = onExit
                    ) {
                        Icon(Icons.Default.Close, "إغلاق المشغل", tint = Color.White, modifier = Modifier.size(25.dp))
                    }
                }
                state.errorMessage?.let {
                    Text(it, color = Color(0xFFFF8A80), style = MaterialTheme.typography.bodySmall)
                }
            }
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
                onPlaybackSpeedChange = { viewModel.setPlaybackSpeed(it) },
                onAddSubtitle = { viewModel.addExternalSubtitle(it) },
                onSelectTrack = { viewModel.selectTrack(it) },
                onDisableSubtitles = { viewModel.disableSubtitles() },
                onSwitchFormat = { viewModel.switchFormat(it) },
                onOpenCustomStream = { url, title, type, ua, ref, cookie, drm, kid, key, license ->
                    viewModel.openCustomStream(url, title, type, ua, ref, cookie, drm, kid, key, license)
                }
            )
        }
    }
}

private fun formatTime(ms: Long): String {
    val seconds = (ms.coerceAtLeast(0L) / 1000L)
    return "%d:%02d:%02d".format(seconds / 3600L, (seconds / 60L) % 60L, seconds % 60L)
}
