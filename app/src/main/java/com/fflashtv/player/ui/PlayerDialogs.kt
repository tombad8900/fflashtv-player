package com.fflashtv.player.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fflashtv.player.model.ContentType
import com.fflashtv.player.model.DrmType
import com.fflashtv.player.model.HistoryEntry
import com.fflashtv.player.model.QualityOption
import com.fflashtv.player.session.PlaybackState
import com.fflashtv.player.tracks.MediaTrackType
import com.fflashtv.player.tracks.TrackInfo

@Composable
fun PlayerDialogs(
    activeDialog: ActiveDialog,
    state: PlaybackState,
    history: List<HistoryEntry>,
    formatMessage: String?,
    onDismiss: () -> Unit,
    onVolumeChange: (Int) -> Unit,
    onToggleMute: () -> Unit,
    onSelectQuality: (QualityOption) -> Unit,
    onPlaybackSpeedChange: (Float) -> Unit,
    onAddSubtitle: (String) -> Unit,
    onSelectTrack: (TrackInfo) -> Unit,
    onDisableSubtitles: () -> Unit,
    onSwitchFormat: (String) -> Unit,
    onOpenCustomStream: (
        url: String,
        title: String,
        type: ContentType,
        ua: String,
        referer: String,
        cookie: String,
        drmType: DrmType,
        kid: String,
        key: String,
        licenseUrl: String
    ) -> Unit
) {
    when (activeDialog) {
        ActiveDialog.NONE -> Unit

        ActiveDialog.VOLUME -> {
            AlertDialog(
                onDismissRequest = onDismiss,
                title = { Text("الصوت") },
                text = {
                    Column {
                        Text("المستوى الحالي: ${state.volume}%")
                        Slider(
                            value = state.volume.toFloat(),
                            onValueChange = { onVolumeChange(it.toInt()) },
                            valueRange = 0f..100f
                        )
                        TextButton(onClick = onToggleMute) {
                            Text(if (state.isMuted) "إلغاء الكتم" else "كتم الصوت")
                        }
                    }
                },
                confirmButton = {
                    TextButton(onClick = onDismiss) { Text("إغلاق") }
                }
            )
        }

        ActiveDialog.SERVERS -> {
            AlertDialog(
                onDismissRequest = onDismiss,
                title = { Text("السيرفرات والروابط البديلة") },
                text = {
                    if (state.qualities.isEmpty()) {
                        Text("لا توجد سيرفرات أو روابط بديلة لهذا المصدر.")
                    } else {
                        Column {
                            state.qualities.forEach { q ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable {
                                            onSelectQuality(q)
                                            onDismiss()
                                        }
                                        .padding(vertical = 6.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    RadioButton(selected = q.isSelected, onClick = null)
                                    Text(q.label, modifier = Modifier.padding(start = 8.dp))
                                }
                            }
                        }
                    }
                },
                confirmButton = {
                    TextButton(onClick = onDismiss) { Text("إغلاق") }
                }
            )
        }

        ActiveDialog.QUALITY -> {
            val videoTracks = state.tracks.filter { it.type == MediaTrackType.VIDEO }
            AlertDialog(
                onDismissRequest = onDismiss,
                title = { Text("جودة الفيديو") },
                text = {
                    if (videoTracks.isEmpty()) Text("اختيار الجودة غير متاح؛ يعتمد ذلك على المسارات التي يرسلها المصدر.")
                    else Column {
                        videoTracks.forEach { track ->
                            Row(
                                modifier = Modifier.fillMaxWidth().clickable { onSelectTrack(track); onDismiss() }.padding(vertical = 6.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                RadioButton(selected = track.isSelected, onClick = null)
                                Text(track.label, modifier = Modifier.padding(start = 8.dp))
                            }
                        }
                    }
                },
                confirmButton = { TextButton(onClick = onDismiss) { Text("إغلاق") } }
            )
        }

        ActiveDialog.SPEED -> {
            AlertDialog(
                onDismissRequest = onDismiss,
                title = { Text("سرعة التشغيل") },
                text = {
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        listOf(0.5f, 0.75f, 1f, 1.25f, 1.5f, 1.75f, 2f).chunked(3).forEach { row ->
                            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                row.forEach { rate ->
                                    FilterChip(selected = false, onClick = { onPlaybackSpeedChange(rate); onDismiss() }, label = { Text("${rate}x") })
                                }
                            }
                        }
                    }
                },
                confirmButton = { TextButton(onClick = onDismiss) { Text("إغلاق") } }
            )
        }

        ActiveDialog.TRACKS -> {
            var subtitleUrl by remember(activeDialog) { mutableStateOf("") }
            AlertDialog(
                onDismissRequest = onDismiss,
                title = { Text("المسارات والترجمة") },
                text = {
                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                        val audioTracks = state.tracks.filter { it.type == MediaTrackType.AUDIO }
                        val subTracks = state.tracks.filter { it.type == MediaTrackType.SUBTITLE }
                        val videoTracks = state.tracks.filter { it.type == MediaTrackType.VIDEO }

                        Text("الصوت", style = MaterialTheme.typography.titleSmall)
                        if (audioTracks.isEmpty()) {
                            Text("لا توجد مسارات صوتية إضافية", style = MaterialTheme.typography.bodySmall)
                        } else {
                            audioTracks.forEach { t ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { onSelectTrack(t) }
                                        .padding(vertical = 4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    RadioButton(selected = t.isSelected, onClick = null)
                                    Text(t.label, modifier = Modifier.padding(start = 8.dp))
                                }
                            }
                        }

                        Spacer(Modifier.height(8.dp))
                        Text("الترجمة", style = MaterialTheme.typography.titleSmall)
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { onDisableSubtitles() }
                                .padding(vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(selected = subTracks.none { it.isSelected }, onClick = null)
                            Text("تعطيل الترجمة", modifier = Modifier.padding(start = 8.dp))
                        }
                        subTracks.forEach { t ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable { onSelectTrack(t) }
                                    .padding(vertical = 4.dp)
                                    .padding(vertical = 4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                RadioButton(selected = t.isSelected, onClick = null)
                                Text(t.label, modifier = Modifier.padding(start = 8.dp))
                            }
                        }
                        Spacer(Modifier.height(8.dp))
                        OutlinedTextField(
                            value = subtitleUrl,
                            onValueChange = { subtitleUrl = it },
                            label = { Text("رابط ترجمة خارجي (SRT / VTT / ASS)") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Button(
                            enabled = subtitleUrl.startsWith("http://", true) || subtitleUrl.startsWith("https://", true),
                            onClick = { onAddSubtitle(subtitleUrl.trim()); onDismiss() }
                        ) { Text("إضافة الترجمة") }

                        if (videoTracks.isNotEmpty()) {
                            Spacer(Modifier.height(8.dp))
                            Text("الجودات المرئية", style = MaterialTheme.typography.titleSmall)
                            videoTracks.forEach { t ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { onSelectTrack(t) }
                                        .padding(vertical = 4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    RadioButton(selected = t.isSelected, onClick = null)
                                    Text(t.label, modifier = Modifier.padding(start = 8.dp))
                                }
                            }
                        }
                    }
                },
                confirmButton = {
                    TextButton(onClick = onDismiss) { Text("إغلاق") }
                }
            )
        }

        ActiveDialog.FORMAT -> {
            AlertDialog(
                onDismissRequest = onDismiss,
                title = { Text("تبديل الصيغة") },
                text = {
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text("الصيغة الحالية: ${state.mimeType ?: "غير محددة"}")
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            Button(onClick = { onSwitchFormat("ts") }) { Text("MPEG-TS (.ts)") }
                            Button(onClick = { onSwitchFormat("m3u8") }) { Text("HLS (.m3u8)") }
                        }
                        if (!formatMessage.isNullOrBlank()) {
                            Text(formatMessage, color = MaterialTheme.colorScheme.error)
                        }
                    }
                },
                confirmButton = {
                    TextButton(onClick = onDismiss) { Text("إغلاق") }
                }
            )
        }

        ActiveDialog.ERROR -> {
            AlertDialog(
                onDismissRequest = onDismiss,
                title = { Text("معلومات الخطأ والمصدر") },
                text = {
                    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                        Text("العنوان: ${state.title}")
                        Text("الرابط: ${state.url}")
                        Text("النوع: ${state.mimeType ?: "غير محدد"}")
                        Text("الحالة: ${state.lifecycle.name}")
                        if (!state.errorMessage.isNullOrBlank()) {
                            Text("الرسالة: ${state.errorMessage}", color = MaterialTheme.colorScheme.error)
                        }
                    }
                },
                confirmButton = {
                    TextButton(onClick = onDismiss) { Text("حسناً") }
                }
            )
        }

        ActiveDialog.OPEN_STREAM -> {
            var url by remember { mutableStateOf(state.url) }
            var title by remember { mutableStateOf("") }
            var contentType by remember { mutableStateOf(ContentType.LIVE) }
            var ua by remember { mutableStateOf("") }
            var referer by remember { mutableStateOf("") }
            var cookie by remember { mutableStateOf("") }
            var drmType by remember { mutableStateOf(DrmType.NONE) }
            var kid by remember { mutableStateOf("") }
            var key by remember { mutableStateOf("") }
            var licenseUrl by remember { mutableStateOf("") }

            AlertDialog(
                onDismissRequest = onDismiss,
                title = { Text("تشغيل رابط / بث جديد") },
                text = {
                    Column(
                        modifier = Modifier.verticalScroll(rememberScrollState()),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        OutlinedTextField(
                            value = url,
                            onValueChange = { url = it },
                            label = { Text("رابط البث أو الفيديو (URL)") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )
                        OutlinedTextField(
                            value = title,
                            onValueChange = { title = it },
                            label = { Text("الاسم (اختياري)") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                            ContentType.entries.forEach { t ->
                                FilterChip(
                                    selected = contentType == t,
                                    onClick = { contentType = t },
                                    label = { Text(t.name) }
                                )
                            }
                        }
                        OutlinedTextField(
                            value = ua,
                            onValueChange = { ua = it },
                            label = { Text("User-Agent (اختياري)") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )
                        OutlinedTextField(
                            value = referer,
                            onValueChange = { referer = it },
                            label = { Text("Referer (اختياري)") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )
                        OutlinedTextField(
                            value = cookie,
                            onValueChange = { cookie = it },
                            label = { Text("Cookie (اختياري)") },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                            DrmType.entries.forEach { d ->
                                FilterChip(
                                    selected = drmType == d,
                                    onClick = { drmType = d },
                                    label = { Text(d.name) }
                                )
                            }
                        }
                        if (drmType == DrmType.CLEARKEY) {
                            OutlinedTextField(
                                value = kid,
                                onValueChange = { kid = it },
                                label = { Text("ClearKey KID") },
                                singleLine = true,
                                modifier = Modifier.fillMaxWidth()
                            )
                            OutlinedTextField(
                                value = key,
                                onValueChange = { key = it },
                                label = { Text("ClearKey KEY") },
                                singleLine = true,
                                modifier = Modifier.fillMaxWidth()
                            )
                        } else if (drmType == DrmType.WIDEVINE) {
                            OutlinedTextField(
                                value = licenseUrl,
                                onValueChange = { licenseUrl = it },
                                label = { Text("Widevine License URL") },
                                singleLine = true,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }

                        if (history.isNotEmpty()) {
                            Spacer(Modifier.height(4.dp))
                            Text("سجل المشاهدة الأخير:", style = MaterialTheme.typography.titleSmall)
                            history.take(5).forEach { h ->
                                Text(
                                    text = "• ${h.title} (${h.category})",
                                    style = MaterialTheme.typography.bodySmall,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { url = h.url; title = h.title }
                                        .padding(vertical = 2.dp)
                                )
                            }
                        }
                    }
                },
                confirmButton = {
                    Button(
                        enabled = url.isNotBlank(),
                        onClick = {
                            onOpenCustomStream(url, title, contentType, ua, referer, cookie, drmType, kid, key, licenseUrl)
                        }
                    ) {
                        Text("تشغيل")
                    }
                },
                dismissButton = {
                    TextButton(onClick = onDismiss) { Text("إلغاء") }
                }
            )
        }
    }
}
