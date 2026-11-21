package com.fflashtv.player.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.fflashtv.player.model.BackupSource
import com.fflashtv.player.model.ContentType
import com.fflashtv.player.exotv.ExoTvCatalog
import com.fflashtv.player.exotv.ExoTvCatalogRepository
import com.fflashtv.player.exotv.ExoTvResolvedStream
import com.fflashtv.player.exotv.ExoTvStreamResolver
import com.fflashtv.player.sources.ChannelItem
import kotlinx.coroutines.launch

@Composable
fun ExoTvCatalogView() {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val repository = remember { ExoTvCatalogRepository() }
    val resolver = remember(context) { ExoTvStreamResolver(context) }

    var catalog by remember { mutableStateOf<ExoTvCatalog?>(null) }
    var loading by remember { mutableStateOf(false) }
    var error by remember { mutableStateOf<String?>(null) }
    var selectedCategoryId by remember { mutableStateOf("") }
    var resolvingKey by remember { mutableStateOf<String?>(null) }
    var channelMessage by remember { mutableStateOf<String?>(null) }

    fun refresh() {
        scope.launch {
            loading = true
            error = null
            val result = repository.loadCatalog()
            result.onSuccess { loaded ->
                catalog = loaded
                if (selectedCategoryId !in loaded.categories.map { it.id }) {
                    selectedCategoryId = loaded.categories.firstOrNull()?.id.orEmpty()
                }
            }.onFailure {
                error = it.message ?: "تعذر تحميل قنوات EXO"
            }
            loading = false
        }
    }

    LaunchedEffect(Unit) { refresh() }

    val categories = catalog?.categories.orEmpty()
    val selectedCategory = categories.firstOrNull { it.id == selectedCategoryId }

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 10.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(modifier = Modifier.weight(1f)) {
                Text("قنوات EXO TV", style = MaterialTheme.typography.titleLarge)
                Text(
                    text = catalog?.let { "${it.categories.size} مجموعة • ${it.categories.sumOf { c -> c.channels.size }} قناة" }
                        ?: "كتالوج القنوات الأصلي",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Button(onClick = { refresh() }, enabled = !loading) { Text("تحديث") }
        }

        if (loading && catalog == null) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                CircularProgressIndicator()
                Spacer(Modifier.height(8.dp))
                Text("جاري تحميل إعدادات وقنوات EXO…")
            }
            return@Column
        }

        error?.let {
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(it, color = MaterialTheme.colorScheme.error)
                    Text("تعذر الاتصال بخادم إعدادات EXO. تحقق من الاتصال ثم أعد المحاولة.", style = MaterialTheme.typography.bodySmall)
                    Button(onClick = { refresh() }, enabled = !loading) { Text("إعادة المحاولة") }
                }
            }
        }

        if (categories.isNotEmpty()) {
            LazyRow(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                items(categories, key = { it.id }) { category ->
                    FilterChip(
                        selected = selectedCategoryId == category.id,
                        onClick = { selectedCategoryId = category.id; channelMessage = null },
                        label = { Text("${category.title} (${category.channels.size})") }
                    )
                }
            }
        }

        channelMessage?.let {
            Surface(color = MaterialTheme.colorScheme.surfaceVariant, shape = RoundedCornerShape(8.dp)) {
                Text(it, modifier = Modifier.fillMaxWidth().padding(10.dp), style = MaterialTheme.typography.bodySmall)
            }
        }

        if (selectedCategory == null) {
            Text("لا توجد مجموعات قنوات متاحة.")
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                items(selectedCategory.channels, key = { it.id ?: it.idO ?: it.displayName }) { channel ->
                    val key = channel.id ?: channel.idO ?: channel.displayName
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable(enabled = resolvingKey == null) {
                                scope.launch {
                                    resolvingKey = key
                                    channelMessage = "جاري حل مصدر ${channel.displayName}…"
                                    val result = resolver.resolve(channel, catalog!!.config)
                                    result.onSuccess { streams ->
                                        val primary = streams.firstOrNull()
                                        if (primary == null) {
                                            channelMessage = "لم يُرجع EXO رابط تشغيل صالحًا لهذه القناة."
                                        } else {
                                            val fallbackServers = (
                                                streams.drop(1) +
                                                    channel.backups.drop(1).map { backup ->
                                                        ExoTvResolvedStream(backup.url, backup.headers, backup.name.orEmpty())
                                                    } +
                                                    channel.backups.filter { it.url != primary.url }.map { backup ->
                                                        ExoTvResolvedStream(backup.url, backup.headers, backup.name.orEmpty())
                                                    }
                                                ).distinctBy { it.url }.filter { it.url != primary.url }
                                            val item = ChannelItem(
                                                id = key,
                                                name = channel.displayName,
                                                url = primary.url,
                                                groupName = selectedCategory.title,
                                                logoUrl = channel.icon.orEmpty(),
                                                headers = primary.headers,
                                                contentType = ContentType.LIVE,
                                                backupSources = fallbackServers.map { backup ->
                                                    BackupSource(backup.url, backup.headers, backup.name)
                                                }
                                            )
                                            channelMessage = null
                                            PlayerLaunchBridge.launch(context, listOf(item), 0)
                                        }
                                    }.onFailure {
                                        channelMessage = it.message ?: "فشل حل مصدر القناة."
                                    }
                                    resolvingKey = null
                                }
                            }
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(channel.displayName, style = MaterialTheme.typography.titleSmall)
                                Text(
                                    "${channel.resolverKind.name} • ${channel.backups.size} سيرفر احتياطي",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                            if (resolvingKey == key) CircularProgressIndicator()
                            else Text("تشغيل", color = MaterialTheme.colorScheme.primary)
                        }
                    }
                }
            }
        }
    }
}
