package com.fflashtv.player.ui

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.fflashtv.player.sources.SourceConfig
import androidx.compose.ui.text.input.PasswordVisualTransformation
import com.fflashtv.player.sources.SourceType
import com.fflashtv.player.tmdb.JsonServersStore
import com.fflashtv.player.tmdb.TmdbClient
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun SourcesScreen(ui: LibraryUiState, viewModel: LibraryViewModel) {
    var showAddDialog by remember { mutableStateOf(false) }
    var editingSource by remember { mutableStateOf<SourceConfig?>(null) }
    var detailsSource by remember { mutableStateOf<SourceConfig?>(null) }
    var renameSource by remember { mutableStateOf<SourceConfig?>(null) }
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val tmdbClient = remember { TmdbClient(context) }
    val savedTmdbKey by tmdbClient.apiKeyFlow.collectAsState()
    var tmdbKeyInput by remember(savedTmdbKey) { mutableStateOf(savedTmdbKey) }
    var tmdbStatusMsg by remember { mutableStateOf<String?>(null) }

    val serversStore = remember { JsonServersStore(context) }
    val jsonServers by serversStore.servers.collectAsState()
    var serverSearch by remember { mutableStateOf("") }
    var jsonStatusMsg by remember { mutableStateOf<String?>(null) }
    var showJsonSection by remember { mutableStateOf(true) }

    val jsonPicker = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocument()) { uri: Uri? ->
        if (uri != null) {
            try {
                val raw = context.contentResolver.openInputStream(uri)?.bufferedReader()?.use { it.readText() } ?: ""
                val res = serversStore.importFromJson(raw)
                jsonStatusMsg = res.fold(
                    onSuccess = { "تم استيراد $it مصدر بنجاح" },
                    onFailure = { it.message ?: "فشل الاستيراد" }
                )
            } catch (t: Throwable) {
                jsonStatusMsg = "تعذر قراءة الملف: ${t.message}"
            }
        }
    }

    Column(modifier = Modifier.fillMaxSize().padding(12.dp)) {
        if (ui.isLoading) {
            LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
            Spacer(Modifier.height(6.dp))
        }
        if (!ui.bannerMessage.isNullOrBlank()) {
            Card(modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)) {
                Row(modifier = Modifier.padding(10.dp), verticalAlignment = Alignment.CenterVertically) {
                    Text(ui.bannerMessage, modifier = Modifier.weight(1f), style = MaterialTheme.typography.bodySmall)
                    TextButton(onClick = { viewModel.clearBanner() }) { Text("إخفاء") }
                }
            }
        }
        Button(onClick = { editingSource = null; showAddDialog = true }, modifier = Modifier.fillMaxWidth()) {
            Icon(Icons.Default.Add, null)
            Text("  إضافة مصدر جديد")
        }
        Spacer(Modifier.height(10.dp))
        LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp), contentPadding = PaddingValues(bottom = 24.dp)) {
            if (ui.sources.isEmpty()) {
                item { Text("لا توجد مصادر IPTV محفوظة بعد.", style = MaterialTheme.typography.bodyMedium) }
            } else {
                items(ui.sources, key = { it.id }) { src ->
                    SourceCard(
                        src = src,
                        onActivate = { viewModel.activateSource(src.id) },
                        onRefresh = { viewModel.refreshSource(src.id) },
                        onTest = { viewModel.testSource(src.id) },
                        onEdit = { editingSource = src; showAddDialog = true },
                        onRename = { renameSource = src },
                        onDetails = { detailsSource = src },
                        onToggleAutoUpdate = { viewModel.toggleAutoUpdate(src.id) },
                        onDelete = { viewModel.deleteSource(src.id) }
                    )
                }
            }

            item {
                Card(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text("إعدادات TMDB", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.titleMedium)
                        Text("أدخل مفتاح API v3 لجلب الأفلام والمسلسلات من قاعدة بيانات TMDB.", style = MaterialTheme.typography.bodySmall)
                        OutlinedTextField(
                            value = tmdbKeyInput,
                            onValueChange = { tmdbKeyInput = it },
                            label = { Text("TMDB API Key") },
                            visualTransformation = PasswordVisualTransformation(),
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )
                        tmdbStatusMsg?.let { Text(it, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.primary) }
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
                            TextButton(onClick = {
                                tmdbClient.deleteKey()
                                tmdbKeyInput = ""
                                tmdbStatusMsg = "تم حذف المفتاح"
                            }) { Text("حذف") }
                            Button(
                                onClick = {
                                    tmdbStatusMsg = "جاري التحقق..."
                                    scope.launch {
                                        val res = tmdbClient.testAndSave(tmdbKeyInput)
                                        tmdbStatusMsg = res.fold(onSuccess = { it }, onFailure = { it.message })
                                    }
                                },
                                modifier = Modifier.weight(1f),
                                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE6C27A), contentColor = Color.Black)
                            ) { Text("اختبار وحفظ", fontWeight = FontWeight.Bold) }
                        }
                    }
                }
            }

            item {
                Card(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text("مصادر التشغيل (JSON)", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.titleMedium, color = Color(0xFFE6C27A))
                                Text("استيراد وإدارة مصادر الفيديو لـ TMDB", style = MaterialTheme.typography.bodySmall)
                            }
                            IconButton(onClick = { showJsonSection = !showJsonSection }) {
                                Icon(if (showJsonSection) Icons.Default.ExpandLess else Icons.Default.ExpandMore, null)
                            }
                        }
                        if (showJsonSection) {
                            Text("استورد ملف JSON يحتوي على data.servers دون تغيير المفضلة أو سجل المشاهدة.", style = MaterialTheme.typography.bodySmall)
                            Button(
                                onClick = { jsonPicker.launch(arrayOf("application/json", "*/*")) },
                                modifier = Modifier.fillMaxWidth(),
                                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE6C27A), contentColor = Color.Black)
                            ) { Text("استيراد مصادر من ملف JSON", fontWeight = FontWeight.Bold) }
                            jsonStatusMsg?.let { Text(it, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.primary) }
                            val visibleCount = jsonServers.count { it.enabled && !it.hiddenFromPicker }
                            Text("المصادر المحفوظة: ${jsonServers.size} • الظاهرة: $visibleCount", fontWeight = FontWeight.SemiBold)
                            if (jsonServers.isNotEmpty()) {
                                OutlinedTextField(
                                    value = serverSearch,
                                    onValueChange = { serverSearch = it },
                                    label = { Text("بحث عن مصدر") },
                                    singleLine = true,
                                    modifier = Modifier.fillMaxWidth()
                                )
                            }
                        }
                    }
                }
            }

            if (showJsonSection && jsonServers.isNotEmpty()) {
                val filteredServers = jsonServers.filter {
                    serverSearch.isBlank() || it.name.contains(serverSearch, true) || it.id.contains(serverSearch, true)
                }
                items(filteredServers, key = { "json_${it.id}" }) { srv ->
                    Card(modifier = Modifier.fillMaxWidth()) {
                        Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                TextButton(onClick = { serversStore.deleteServer(srv.id) }) { Text("حذف", color = MaterialTheme.colorScheme.error) }
                                Spacer(Modifier.weight(1f))
                                Column(horizontalAlignment = Alignment.End) {
                                    Text(srv.name, fontWeight = FontWeight.Bold)
                                    Text("المعرف: ${srv.id} • الأولوية: ${srv.priority}", style = MaterialTheme.typography.bodySmall)
                                }
                            }
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Switch(checked = srv.enabled, onCheckedChange = { serversStore.toggleEnabled(srv.id) })
                                Spacer(Modifier.weight(1f))
                                Text("تفعيل المصدر")
                            }
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Switch(checked = srv.hiddenFromPicker, onCheckedChange = { serversStore.toggleHidden(srv.id) })
                                Spacer(Modifier.weight(1f))
                                Text("إخفاء المصدر من الاختيار")
                            }
                            if (srv.description.isNotBlank()) {
                                Text(srv.description, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                            }
                        }
                    }
                }
            }
        }
    }

    if (showAddDialog) {
        AddOrEditSourceDialog(
            existing = editingSource,
            onDismiss = { showAddDialog = false },
            onSave = { name, type, url, rawText, host, user, pass, headers ->
                viewModel.addOrUpdateSource(
                    existingId = editingSource?.id, name = name, type = type, url = url,
                    rawText = rawText, host = host, username = user, password = pass,
                    headers = headers, activateImmediately = editingSource?.isActive ?: true
                )
                showAddDialog = false
            }
        )
    }

    detailsSource?.let { src ->
        val dateStr = if (src.lastUpdatedMs > 0L) SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(Date(src.lastUpdatedMs)) else "غير محدث"
        AlertDialog(
            onDismissRequest = { detailsSource = null },
            title = { Text("تفاصيل المصدر: ${src.name}") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text("النوع: ${src.type.name}")
                    Text("الحالة: ${src.status.name} (${src.statusMessage})")
                    Text("آخر تحديث: $dateStr")
                    Text("المجموعات: ${src.groupCount} | القنوات: ${src.channelCount}")
                    if (src.accountInfo.isNotBlank()) Text("الحساب: ${src.accountInfo}")
                    if (src.url.isNotBlank()) Text("الرابط: ${src.url}")
                    if (src.host.isNotBlank()) Text("الخادم: ${src.host}")
                }
            },
            confirmButton = { TextButton(onClick = { detailsSource = null }) { Text("إغلاق") } }
        )
    }

    renameSource?.let { src ->
        var newName by remember { mutableStateOf(src.name) }
        AlertDialog(
            onDismissRequest = { renameSource = null },
            title = { Text("إعادة تسمية المصدر") },
            text = { OutlinedTextField(value = newName, onValueChange = { newName = it }, label = { Text("الاسم الجديد") }, singleLine = true, modifier = Modifier.fillMaxWidth()) },
            confirmButton = { Button(onClick = { viewModel.renameSource(src.id, newName); renameSource = null }) { Text("حفظ") } },
            dismissButton = { TextButton(onClick = { renameSource = null }) { Text("إلغاء") } }
        )
    }
}

@Composable
private fun SourceCard(
    src: SourceConfig, onActivate: () -> Unit, onRefresh: () -> Unit, onTest: () -> Unit,
    onEdit: () -> Unit, onRename: () -> Unit, onDetails: () -> Unit, onToggleAutoUpdate: () -> Unit, onDelete: () -> Unit
) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(src.name, fontWeight = FontWeight.Bold)
                    Text("${src.type.name} • ${src.channelCount} قناة • ${src.groupCount} مجموعة", style = MaterialTheme.typography.bodySmall)
                    if (src.accountInfo.isNotBlank()) Text(src.accountInfo, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.primary)
                }
                if (src.isActive) Icon(Icons.Default.CheckCircle, "نشط", tint = Color(0xFF4CAF50))
                else OutlinedButton(onClick = onActivate) { Text("تفعيل") }
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("تحديث تلقائي عند الفتح", style = MaterialTheme.typography.bodySmall, modifier = Modifier.weight(1f))
                Switch(checked = src.autoUpdate, onCheckedChange = { onToggleAutoUpdate() })
            }
            FlowRow(horizontalArrangement = Arrangement.spacedBy(6.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                IconButton(onClick = onRefresh) { Icon(Icons.Default.Refresh, "تحديث") }
                TextButton(onClick = onTest) { Text("اختبار") }
                TextButton(onClick = onRename) { Text("تسمية") }
                IconButton(onClick = onEdit) { Icon(Icons.Default.Edit, "تعديل") }
                IconButton(onClick = onDetails) { Icon(Icons.Default.Info, "تفاصيل") }
                IconButton(onClick = onDelete) { Icon(Icons.Default.Delete, "حذف") }
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun AddOrEditSourceDialog(
    existing: SourceConfig?,
    onDismiss: () -> Unit,
    onSave: (String, SourceType, String, String, String, String, String, Map<String, String>) -> Unit
) {
    val context = LocalContext.current
    var type by remember { mutableStateOf(existing?.type ?: SourceType.M3U_URL) }
    var name by remember { mutableStateOf(existing?.name ?: "") }
    var url by remember { mutableStateOf(existing?.url ?: "") }
    var rawText by remember { mutableStateOf(existing?.rawText ?: "") }
    var host by remember { mutableStateOf(existing?.host ?: "") }
    var username by remember { mutableStateOf(existing?.username ?: "") }
    var password by remember { mutableStateOf(existing?.password ?: "") }
    var ua by remember { mutableStateOf(existing?.headers?.get("User-Agent") ?: "") }
    var referer by remember { mutableStateOf(existing?.headers?.get("Referer") ?: "") }
    var cookie by remember { mutableStateOf(existing?.headers?.get("Cookie") ?: "") }
    var extraHeaders by remember { mutableStateOf("") }
    var fileStatus by remember { mutableStateOf("") }

    val filePicker = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocument()) { uri: Uri? ->
        if (uri != null) {
            try {
                val text = context.contentResolver.openInputStream(uri)?.bufferedReader()?.use { it.readText() } ?: ""
                if (text.isBlank()) fileStatus = "الملف فارغ أو تعذرت قراءته"
                else { rawText = text; fileStatus = "تمت قراءة الملف (${text.length} حرف)" }
            } catch (t: Throwable) {
                fileStatus = "تعذر قراءة الملف: ${t.message}"
            }
        }
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(if (existing == null) "إضافة مصدر" else "تعديل المصدر") },
        text = {
            Column(modifier = Modifier.verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                if (existing == null) {
                    FlowRow(horizontalArrangement = Arrangement.spacedBy(6.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        listOf(
                            SourceType.M3U_URL to "رابط",
                            SourceType.M3U_FILE to "ملف",
                            SourceType.M3U_TEXT to "نص",
                            SourceType.XTREAM to "Xtream",
                            SourceType.SINGLE_CHANNEL to "قناة"
                        ).forEach { (t, label) ->
                            FilterChip(selected = type == t, onClick = { type = t }, label = { Text(label) })
                        }
                    }
                }
                OutlinedTextField(value = name, onValueChange = { name = it }, label = { Text(if (type == SourceType.SINGLE_CHANNEL) "اسم القناة" else "اسم المصدر (اختياري)") }, singleLine = true, modifier = Modifier.fillMaxWidth())
                when (type) {
                    SourceType.M3U_URL -> OutlinedTextField(value = url, onValueChange = { url = it }, label = { Text("رابط قائمة M3U") }, singleLine = true, modifier = Modifier.fillMaxWidth())
                    SourceType.M3U_FILE -> {
                        OutlinedButton(onClick = { filePicker.launch(arrayOf("*/*")) }, modifier = Modifier.fillMaxWidth()) { Text("اختيار ملف M3U من الهاتف") }
                        if (fileStatus.isNotBlank()) Text(fileStatus, style = MaterialTheme.typography.bodySmall)
                    }
                    SourceType.M3U_TEXT -> OutlinedTextField(value = rawText, onValueChange = { rawText = it }, label = { Text("ألصق محتوى M3U هنا") }, minLines = 4, maxLines = 8, modifier = Modifier.fillMaxWidth())
                    SourceType.XTREAM -> {
                        OutlinedTextField(value = host, onValueChange = { host = it }, label = { Text("Host (مثال: http://server:8080)") }, singleLine = true, modifier = Modifier.fillMaxWidth())
                        OutlinedTextField(value = username, onValueChange = { username = it }, label = { Text("Username") }, singleLine = true, modifier = Modifier.fillMaxWidth())
                        OutlinedTextField(value = password, onValueChange = { password = it }, label = { Text("Password") }, singleLine = true, modifier = Modifier.fillMaxWidth())
                    }
                    SourceType.SINGLE_CHANNEL -> {
                        OutlinedTextField(value = url, onValueChange = { url = it }, label = { Text("رابط التشغيل") }, singleLine = true, modifier = Modifier.fillMaxWidth())
                        OutlinedTextField(value = rawText, onValueChange = { rawText = it }, label = { Text("المجموعة (اختياري)") }, singleLine = true, modifier = Modifier.fillMaxWidth())
                        OutlinedTextField(value = host, onValueChange = { host = it }, label = { Text("رابط الشعار (اختياري)") }, singleLine = true, modifier = Modifier.fillMaxWidth())
                    }
                }
                OutlinedTextField(value = ua, onValueChange = { ua = it }, label = { Text("User-Agent (اختياري)") }, singleLine = true, modifier = Modifier.fillMaxWidth())
                OutlinedTextField(value = referer, onValueChange = { referer = it }, label = { Text("Referer (اختياري)") }, singleLine = true, modifier = Modifier.fillMaxWidth())
                OutlinedTextField(value = cookie, onValueChange = { cookie = it }, label = { Text("Cookie (اختياري)") }, singleLine = true, modifier = Modifier.fillMaxWidth())
                OutlinedTextField(value = extraHeaders, onValueChange = { extraHeaders = it }, label = { Text("ترويسات إضافية (Key: Value بكل سطر)") }, minLines = 2, modifier = Modifier.fillMaxWidth())
            }
        },
        confirmButton = {
            Button(onClick = {
                val headers = mutableMapOf<String, String>()
                if (ua.isNotBlank()) headers["User-Agent"] = ua.trim()
                if (referer.isNotBlank()) headers["Referer"] = referer.trim()
                if (cookie.isNotBlank()) headers["Cookie"] = cookie.trim()
                extraHeaders.lines().forEach { line ->
                    val idx = line.indexOf(':')
                    if (idx > 0) {
                        val k = line.substring(0, idx).trim()
                        val v = line.substring(idx + 1).trim()
                        if (k.isNotEmpty()) headers[k] = v
                    }
                }
                onSave(name, type, url, rawText, host, username, password, headers)
            }) { Text("حفظ") }
        },
        dismissButton = { TextButton(onClick = onDismiss) { Text("إلغاء") } }
    )
}
