package com.fflashtv.player.mpv

import android.app.Activity
import android.view.SurfaceHolder
import android.view.SurfaceView
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.detectVerticalDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import kotlinx.coroutines.delay

private val MpvCyan = Color(0xFF00E5FF)
private val MpvAmber = Color(0xFFFFB300)
private val MpvGreen = Color(0xFF00E676)
private val MpvPill = Color(0xFF0F172A).copy(alpha = 0.72f)

enum class MpvDialog { NONE, TRACKS, SPEED, VOLUME, INFO }

@Composable
fun MpvPlayerScreen(
    engine: MpvEngine,
    onToggleFullscreen: (Boolean) -> Unit,
    onEnterPip: () -> Unit,
    onBack: () -> Unit
) {
    val state by engine.state.collectAsState()
    val context = LocalContext.current
    val activity = context as? Activity

    var controlsVisible by remember { mutableStateOf(true) }
    var isLocked by remember { mutableStateOf(false) }
    var activeDialog by remember { mutableStateOf(MpvDialog.NONE) }
    var hudText by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(controlsVisible, activeDialog, state.isPlaying, state.isInPip, isLocked) {
        if (state.isInPip) controlsVisible = false
        else if (controlsVisible && activeDialog == MpvDialog.NONE && state.isPlaying) {
            delay(4_000L)
            controlsVisible = false
        }
    }

    LaunchedEffect(hudText) {
        if (hudText != null) {
            delay(1_200L)
            hudText = null
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        // Native libmpv SurfaceView
        AndroidView(
            modifier = Modifier.fillMaxSize(),
            factory = { ctx ->
                SurfaceView(ctx).apply {
                    keepScreenOn = true
                    holder.addCallback(object : SurfaceHolder.Callback {
                        override fun surfaceCreated(holder: SurfaceHolder) {
                            engine.attachSurface(holder.surface)
                        }
                        override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) { engine.onSurfaceChanged(width, height) }
                        override fun surfaceDestroyed(holder: SurfaceHolder) {
                            engine.detachSurface()
                        }
                    })
                }
            }
        )

        // Touch Gesture Layer (Tap, Double Tap Seek, Left Brightness, Right Volume)
        if (!state.isInPip) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .pointerInput(isLocked) {
                        detectTapGestures(
                            onTap = { controlsVisible = !controlsVisible },
                            onDoubleTap = { offset ->
                                if (!isLocked) {
                                    if (offset.x < size.width / 2f) {
                                        engine.seekBy(-10.0)
                                        hudText = "⏪ -10s"
                                    } else {
                                        engine.seekBy(10.0)
                                        hudText = "⏩ +10s"
                                    }
                                }
                            }
                        )
                    }
                    .pointerInput(isLocked) {
                        if (!isLocked) {
                            detectVerticalDragGestures { change, dragAmount ->
                                change.consume()
                                val isLeft = change.position.x < size.width / 2f
                                if (isLeft && activity != null) {
                                    val lp = activity.window.attributes
                                    val cur = if (lp.screenBrightness < 0f) 0.5f else lp.screenBrightness
                                    val next = (cur - dragAmount / 600f).coerceIn(0.05f, 1.0f)
                                    lp.screenBrightness = next
                                    activity.window.attributes = lp
                                    hudText = "السطوع: ${(next * 100).toInt()}%"
                                } else if (!isLeft) {
                                    val curVol = state.volume
                                    val delta = (-dragAmount / 8f).toInt()
                                    val nextVol = (curVol + delta).coerceIn(0, 150)
                                    engine.setVolume(nextVol)
                                    hudText = "الصوت: $nextVol%"
                                }
                            }
                        }
                    }
            )
        }

        // Backdrop before first frame
        if (state.showBackdrop && !state.isPlaying) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF090D16)),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(24.dp)) {
                    Text("libmpv", color = MpvCyan, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    Spacer(Modifier.height(6.dp))
                    Text(state.title, color = Color.White, style = MaterialTheme.typography.titleLarge)
                    if (!state.errorMessage.isNullOrBlank()) {
                        Spacer(Modifier.height(8.dp))
                        Text(state.errorMessage!!, color = MpvAmber, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }

        // Buffering Indicator
        if (state.isBuffering && !state.isInPip) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center),
                color = MpvCyan
            )
        }

        // Gesture HUD Pill
        hudText?.let { text ->
            Surface(
                color = Color(0xFF0F172A).copy(alpha = 0.88f),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 72.dp)
            ) {
                Text(
                    text = text,
                    color = MpvCyan,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }

        // Controls Overlay
        if (controlsVisible && !state.isInPip) {
            if (isLocked) {
                Box(modifier = Modifier.fillMaxSize().safeDrawingPadding().padding(16.dp)) {
                    MpvCircleBtn(Icons.Default.Lock, "فتح القفل", { isLocked = false }, Modifier.align(Alignment.TopStart))
                }
            } else {
                MpvControlsOverlay(
                    state = state,
                    onBack = onBack,
                    onPlayPause = { engine.togglePlayPause() },
                    onSeekTo = { engine.seekTo(it) },
                    onSeekBy = { engine.seekBy(it) },
                    onPrevious = { engine.playPrevious() },
                    onNext = { engine.playNext() },
                    onCycleDecoder = { engine.cycleDecoderMode() },
                    onCycleAspect = { engine.cycleAspectMode() },
                    onOpenTracks = { activeDialog = MpvDialog.TRACKS },
                    onOpenSpeed = { activeDialog = MpvDialog.SPEED },
                    onOpenVolume = { activeDialog = MpvDialog.VOLUME },
                    onOpenInfo = { activeDialog = MpvDialog.INFO },
                    onLock = { isLocked = true },
                    onEnterPip = onEnterPip,
                    onToggleFullscreen = {
                        val next = !state.isFullscreen
                        engine.setFullscreen(next)
                        onToggleFullscreen(next)
                    }
                )
            }
        }

        if (!state.isInPip) {
            MpvDialogs(
                dialog = activeDialog,
                state = state,
                onDismiss = { activeDialog = MpvDialog.NONE },
                onSelectTrack = { engine.selectTrack(it) },
                onDisableSub = { engine.disableSubtitles() },
                onSpeedSelect = { engine.setSpeed(it) },
                onVolumeChange = { engine.setVolume(it) },
                onToggleMute = { engine.toggleMute() }
            )
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun MpvControlsOverlay(
    state: MpvPlayerState,
    onBack: () -> Unit,
    onPlayPause: () -> Unit,
    onSeekTo: (Double) -> Unit,
    onSeekBy: (Double) -> Unit,
    onPrevious: () -> Unit,
    onNext: () -> Unit,
    onCycleDecoder: () -> Unit,
    onCycleAspect: () -> Unit,
    onOpenTracks: () -> Unit,
    onOpenSpeed: () -> Unit,
    onOpenVolume: () -> Unit,
    onOpenInfo: () -> Unit,
    onLock: () -> Unit,
    onEnterPip: () -> Unit,
    onToggleFullscreen: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0.0f to Color(0xFF090D16).copy(alpha = 0.85f),
                    0.3f to Color.Transparent,
                    0.7f to Color.Transparent,
                    1.0f to Color(0xFF090D16).copy(alpha = 0.90f)
                )
            )
            .safeDrawingPadding()
            .padding(horizontal = 16.dp, vertical = 10.dp)
    ) {
        // Top Header with Live Telemetry Chips
        Row(
            modifier = Modifier.fillMaxWidth().align(Alignment.TopCenter),
            verticalAlignment = Alignment.CenterVertically
        ) {
            MpvCircleBtn(Icons.Default.ArrowBack, "رجوع", onBack)
            Spacer(Modifier.width(10.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(state.title, color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold, maxLines = 1, overflow = TextOverflow.Ellipsis)
                Spacer(Modifier.height(3.dp))
                val shortCodec = when {
                    state.videoCodec.contains("264") || state.videoCodec.contains("AVC") -> "H264"
                    state.videoCodec.contains("265") || state.videoCodec.contains("HEVC") -> "HEVC"
                    state.videoCodec.contains("AV1") -> "AV1"
                    else -> state.videoCodec.take(6)
                }
                FlowRow(horizontalArrangement = Arrangement.spacedBy(6.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    MpvTag("libmpv", MpvCyan, Color.Black)
                    if (state.isLive) MpvTag("LIVE", MpvGreen, Color.Black)
                    if (state.videoHeight > 0) MpvTag("${state.videoHeight}p $shortCodec".trim(), MpvPill, Color.White)
                    if (state.cacheDurationSec > 0.5) MpvTag("Cache ${state.cacheDurationSec.toInt()}s", MpvPill, MpvCyan)
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
                Surface(
                    onClick = onCycleDecoder,
                    shape = RoundedCornerShape(14.dp),
                    color = MpvAmber.copy(alpha = 0.22f)
                ) {
                    Text(
                        text = state.decoderMode.label,
                        color = MpvAmber,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                    )
                }
                MpvCircleBtn(Icons.Default.PictureInPictureAlt, "PiP", onEnterPip)
                MpvCircleBtn(Icons.Default.LockOpen, "قفل", onLock)
                MpvCircleBtn(Icons.Default.Info, "معلومات", onOpenInfo)
            }
        }

        // Center Transport
        Row(
            modifier = Modifier.align(Alignment.Center),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            MpvCircleBtn(Icons.Default.SkipPrevious, "السابق", onPrevious, enabled = state.previousAvailable, size = 44.dp)
            MpvCircleBtn(Icons.Default.Replay10, "-10s", { onSeekBy(-10.0) }, size = 48.dp)
            Surface(
                onClick = onPlayPause,
                shape = CircleShape,
                color = MpvCyan,
                modifier = Modifier.size(64.dp)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Icon(
                        imageVector = if (state.isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
                        contentDescription = null,
                        tint = Color.Black,
                        modifier = Modifier.size(36.dp)
                    )
                }
            }
            MpvCircleBtn(Icons.Default.Forward10, "+10s", { onSeekBy(10.0) }, size = 48.dp)
            MpvCircleBtn(Icons.Default.SkipNext, "التالي", onNext, enabled = state.nextAvailable, size = 44.dp)
        }

        // Bottom Controls
        Column(modifier = Modifier.fillMaxWidth().align(Alignment.BottomCenter)) {
            if (!state.isLive && state.durationSec > 1.0) {
                val pos = state.positionSec.toFloat().coerceIn(0f, state.durationSec.toFloat())
                Slider(
                    value = pos,
                    onValueChange = { onSeekTo(it.toDouble()) },
                    valueRange = 0f..state.durationSec.toFloat(),
                    colors = SliderDefaults.colors(
                        thumbColor = MpvCyan,
                        activeTrackColor = MpvCyan,
                        inactiveTrackColor = Color.White.copy(alpha = 0.25f)
                    ),
                    modifier = Modifier.fillMaxWidth().height(28.dp)
                )
            }
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = if (state.isLive) "● بث مباشر (mpv)" else "${fmtSec(state.positionSec)} / ${fmtSec(state.durationSec)}",
                    color = Color.White,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(Modifier.weight(1f))
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
                    Surface(onClick = onOpenSpeed, shape = RoundedCornerShape(14.dp), color = MpvPill) {
                        Text("${state.speed}x", color = Color.White, fontSize = 12.sp, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp))
                    }
                    Surface(onClick = onCycleAspect, shape = RoundedCornerShape(14.dp), color = MpvPill) {
                        Text(state.aspectMode.label, color = Color.White, fontSize = 12.sp, modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp))
                    }
                    MpvCircleBtn(if (state.isMuted || state.volume == 0) Icons.Default.VolumeOff else Icons.Default.VolumeUp, "الصوت", onOpenVolume)
                    MpvCircleBtn(Icons.Default.Subtitles, "المسارات", onOpenTracks)
                    MpvCircleBtn(if (state.isFullscreen) Icons.Default.FullscreenExit else Icons.Default.Fullscreen, "ملء الشاشة", onToggleFullscreen)
                }
            }
        }
    }
}

@Composable
private fun MpvCircleBtn(
    icon: ImageVector, desc: String, onClick: () -> Unit,
    modifier: Modifier = Modifier, enabled: Boolean = true, size: androidx.compose.ui.unit.Dp = 38.dp
) {
    IconButton(
        onClick = onClick, enabled = enabled,
        modifier = modifier.size(size).clip(CircleShape).background(MpvPill)
    ) {
        Icon(icon, desc, tint = if (enabled) Color.White else Color.White.copy(alpha = 0.35f), modifier = Modifier.size(20.dp))
    }
}

@Composable
private fun MpvTag(text: String, bg: Color, fg: Color) {
    Text(
        text = text, color = fg, fontSize = 10.sp, fontWeight = FontWeight.Bold, maxLines = 1, softWrap = false,
        modifier = Modifier.background(bg, RoundedCornerShape(4.dp)).padding(horizontal = 6.dp, vertical = 2.dp)
    )
}

@Composable
private fun MpvDialogs(
    dialog: MpvDialog, state: MpvPlayerState, onDismiss: () -> Unit,
    onSelectTrack: (MpvTrack) -> Unit, onDisableSub: () -> Unit,
    onSpeedSelect: (Double) -> Unit, onVolumeChange: (Int) -> Unit, onToggleMute: () -> Unit
) {
    when (dialog) {
        MpvDialog.NONE -> Unit
        MpvDialog.VOLUME -> AlertDialog(
            onDismissRequest = onDismiss,
            title = { Text("صوت libmpv (${state.volume}%)") },
            text = {
                Column {
                    Slider(value = state.volume.toFloat(), onValueChange = { onVolumeChange(it.toInt()) }, valueRange = 0f..150f)
                    TextButton(onClick = onToggleMute) { Text(if (state.isMuted) "إلغاء الكتم" else "كتم") }
                }
            },
            confirmButton = { TextButton(onClick = onDismiss) { Text("إغلاق") } }
        )
        MpvDialog.SPEED -> AlertDialog(
            onDismissRequest = onDismiss,
            title = { Text("سرعة التشغيل") },
            text = {
                Column {
                    listOf(0.5, 0.75, 1.0, 1.25, 1.5, 2.0).forEach { sp ->
                        Row(Modifier.fillMaxWidth().clickable { onSpeedSelect(sp); onDismiss() }.padding(vertical = 6.dp), verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(selected = state.speed == sp, onClick = null)
                            Text("${sp}x", modifier = Modifier.padding(start = 8.dp))
                        }
                    }
                }
            },
            confirmButton = { TextButton(onClick = onDismiss) { Text("إغلاق") } }
        )
        MpvDialog.TRACKS -> AlertDialog(
            onDismissRequest = onDismiss,
            title = { Text("مسارات الصوت والترجمة (mpv)") },
            text = {
                Column(Modifier.verticalScroll(rememberScrollState())) {
                    val audio = state.tracks.filter { it.type == "audio" }
                    val subs = state.tracks.filter { it.type == "sub" }
                    Text("الصوت", style = MaterialTheme.typography.titleSmall)
                    if (audio.isEmpty()) Text("لا توجد مسارات إضافية", style = MaterialTheme.typography.bodySmall)
                    audio.forEach { t ->
                        Row(Modifier.fillMaxWidth().clickable { onSelectTrack(t) }.padding(vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(selected = t.isSelected, onClick = null)
                            Text("${t.title.ifBlank { t.lang.ifBlank { "مسار ${t.id}" } }} (${t.codec})", modifier = Modifier.padding(start = 8.dp))
                        }
                    }
                    Spacer(Modifier.height(8.dp))
                    Text("الترجمة", style = MaterialTheme.typography.titleSmall)
                    Row(Modifier.fillMaxWidth().clickable { onDisableSub() }.padding(vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(selected = subs.none { it.isSelected }, onClick = null)
                        Text("تعطيل الترجمة", modifier = Modifier.padding(start = 8.dp))
                    }
                    subs.forEach { t ->
                        Row(Modifier.fillMaxWidth().clickable { onSelectTrack(t) }.padding(vertical = 4.dp), verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(selected = t.isSelected, onClick = null)
                            Text("${t.title.ifBlank { t.lang.ifBlank { "ترجمة ${t.id}" } }} (${t.codec})", modifier = Modifier.padding(start = 8.dp))
                        }
                    }
                }
            },
            confirmButton = { TextButton(onClick = onDismiss) { Text("إغلاق") } }
        )
        MpvDialog.INFO -> AlertDialog(
            onDismissRequest = onDismiss,
            title = { Text("معلومات محرك libmpv") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text("العنوان: ${state.title}")
                    Text("الدقة: ${state.videoWidth}x${state.videoHeight}")
                    Text("الكودك: ${state.videoCodec.ifBlank { "-" }}")
                    Text("فك التشفير: ${state.decoderMode.label} (${state.activeHwdec.ifBlank { "auto" }})")
                    Text("الكاش: ${state.cacheDurationSec.toInt()} ثانية")
                    if (!state.errorMessage.isNullOrBlank()) Text(state.errorMessage!!, color = MpvAmber)
                }
            },
            confirmButton = { TextButton(onClick = onDismiss) { Text("حسناً") } }
        )
    }
}

private fun fmtSec(sec: Double): String {
    val t = sec.toLong().coerceAtLeast(0L)
    val h = t / 3600
    val m = (t % 3600) / 60
    val s = t % 60
    return if (h > 0) "%d:%02d:%02d".format(h, m, s) else "%02d:%02d".format(m, s)
}
