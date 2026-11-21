package com.fflashtv.player.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddLink
import androidx.compose.material.icons.filled.AspectRatio
import androidx.compose.material.icons.filled.Forward10
import androidx.compose.material.icons.filled.Fullscreen
import androidx.compose.material.icons.filled.FullscreenExit
import androidx.compose.material.icons.filled.HighQuality
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.LockOpen
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PictureInPictureAlt
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Replay10
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material.icons.filled.Subtitles
import androidx.compose.material.icons.filled.SwapHoriz
import androidx.compose.material.icons.filled.VolumeOff
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fflashtv.player.session.PlaybackState

private val AccentRed = Color(0xFFE50914)
private val PillBg = Color.Black.copy(alpha = 0.45f)

@Composable
fun PlayerControls(
    state: PlaybackState,
    isLocked: Boolean,
    onToggleLock: () -> Unit,
    onPlayPause: () -> Unit,
    onSeekTo: (Long) -> Unit,
    onSeekForward: () -> Unit,
    onSeekBackward: () -> Unit,
    onPrevious: () -> Unit,
    onNext: () -> Unit,
    onOpenVolume: () -> Unit,
    onOpenQuality: () -> Unit,
    onOpenTracks: () -> Unit,
    onOpenFormat: () -> Unit,
    onOpenErrorInfo: () -> Unit,
    onOpenStream: () -> Unit,
    onCycleAspect: () -> Unit,
    onToggleFullscreen: () -> Unit,
    onEnterPip: () -> Unit
) {
    if (isLocked) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .safeDrawingPadding()
                .padding(16.dp)
        ) {
            CircleControlButton(
                icon = Icons.Default.Lock,
                contentDescription = "Unlock",
                onClick = onToggleLock,
                modifier = Modifier.align(Alignment.TopStart)
            )
        }
        return
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0.0f to Color.Black.copy(alpha = 0.78f),
                    0.28f to Color.Transparent,
                    0.72f to Color.Transparent,
                    1.0f to Color.Black.copy(alpha = 0.85f)
                )
            )
            .safeDrawingPadding()
            .padding(horizontal = 16.dp, vertical = 10.dp)
    ) {
        // Top Bar: Title + Live/Format Badges + Quick Top Actions
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = state.title,
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(3.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (state.isLive) {
                        BadgeChip(text = "LIVE", bgColor = AccentRed)
                    }
                    val shortMime = when {
                        state.mimeType?.contains("mpegurl", true) == true -> "HLS"
                        state.mimeType?.contains("mp2t", true) == true -> "TS"
                        state.mimeType?.contains("dash", true) == true -> "DASH"
                        state.mimeType?.contains("mp4", true) == true -> "MP4"
                        else -> "STREAM"
                    }
                    BadgeChip(text = shortMime, bgColor = Color.White.copy(alpha = 0.18f))
                }
            }

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                CircleControlButton(Icons.Default.AddLink, "Open Link", onOpenStream)
                CircleControlButton(Icons.Default.PictureInPictureAlt, "PiP", onEnterPip)
                CircleControlButton(Icons.Default.LockOpen, "Lock", onToggleLock)
                CircleControlButton(Icons.Default.Info, "Info", onOpenErrorInfo)
            }
        }

        // Center Transport Controls
        Row(
            modifier = Modifier.align(Alignment.Center),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CircleControlButton(
                icon = Icons.Default.SkipPrevious,
                contentDescription = "Previous",
                onClick = onPrevious,
                enabled = state.previousAvailable,
                size = 44.dp,
                iconSize = 24.dp
            )
            CircleControlButton(
                icon = Icons.Default.Replay10,
                contentDescription = "Back 10s",
                onClick = onSeekBackward,
                size = 48.dp,
                iconSize = 26.dp
            )
            Surface(
                onClick = onPlayPause,
                shape = CircleShape,
                color = AccentRed,
                modifier = Modifier.size(64.dp)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Icon(
                        imageVector = if (state.isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
                        contentDescription = "Play/Pause",
                        tint = Color.White,
                        modifier = Modifier.size(36.dp)
                    )
                }
            }
            CircleControlButton(
                icon = Icons.Default.Forward10,
                contentDescription = "Forward 10s",
                onClick = onSeekForward,
                size = 48.dp,
                iconSize = 26.dp
            )
            CircleControlButton(
                icon = Icons.Default.SkipNext,
                contentDescription = "Next",
                onClick = onNext,
                enabled = state.nextAvailable,
                size = 44.dp,
                iconSize = 24.dp
            )
        }

        // Bottom Bar: Sleek Seekbar + Time + Player Tool Buttons
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        ) {
            val duration = state.durationMs.coerceAtLeast(0L)
            val pos = state.positionMs.coerceIn(0L, duration.coerceAtLeast(1L))
            if (!state.isLive && duration > 0L) {
                Slider(
                    value = pos.toFloat(),
                    onValueChange = { onSeekTo(it.toLong()) },
                    valueRange = 0f..duration.toFloat(),
                    colors = SliderDefaults.colors(
                        thumbColor = AccentRed,
                        activeTrackColor = AccentRed,
                        inactiveTrackColor = Color.White.copy(alpha = 0.28f)
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(28.dp)
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = if (state.isLive) "● بث مباشر" else "${formatTime(pos)}  /  ${formatTime(duration)}",
                    color = Color.White,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(Modifier.weight(1f))
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    CircleControlButton(
                        icon = if (state.isMuted || state.volume == 0) Icons.Default.VolumeOff else Icons.Default.VolumeUp,
                        contentDescription = "Volume",
                        onClick = onOpenVolume
                    )
                    CircleControlButton(Icons.Default.HighQuality, "Quality", onOpenQuality)
                    CircleControlButton(Icons.Default.Subtitles, "Tracks", onOpenTracks)
                    CircleControlButton(Icons.Default.SwapHoriz, "Switch Format", onOpenFormat)
                    CircleControlButton(Icons.Default.AspectRatio, "Aspect Ratio", onCycleAspect)
                    CircleControlButton(
                        icon = if (state.isFullscreen) Icons.Default.FullscreenExit else Icons.Default.Fullscreen,
                        contentDescription = "Fullscreen",
                        onClick = onToggleFullscreen
                    )
                }
            }
        }
    }
}

@Composable
private fun CircleControlButton(
    icon: ImageVector,
    contentDescription: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    size: androidx.compose.ui.unit.Dp = 38.dp,
    iconSize: androidx.compose.ui.unit.Dp = 20.dp
) {
    IconButton(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier
            .size(size)
            .clip(CircleShape)
            .background(PillBg)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            tint = if (enabled) Color.White else Color.White.copy(alpha = 0.35f),
            modifier = Modifier.size(iconSize)
        )
    }
}

@Composable
private fun BadgeChip(text: String, bgColor: Color) {
    Text(
        text = text,
        color = Color.White,
        fontSize = 10.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .background(bgColor, RoundedCornerShape(4.dp))
            .padding(horizontal = 6.dp, vertical = 2.dp)
    )
}

private fun formatTime(ms: Long): String {
    val totalSec = ms / 1000L
    val h = totalSec / 3600L
    val m = (totalSec % 3600L) / 60L
    val s = totalSec % 60L
    return if (h > 0) "%d:%02d:%02d".format(h, m, s) else "%02d:%02d".format(m, s)
}
