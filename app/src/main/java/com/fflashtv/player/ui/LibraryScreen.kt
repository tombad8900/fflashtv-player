package com.fflashtv.player.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.fflashtv.player.netlimit.ActiveSocketRegistry
import com.fflashtv.player.netlimit.ConnectionAuditLog
import com.fflashtv.player.netlimit.ConnectionLimitManager
import com.fflashtv.player.sources.ChannelItem
import com.fflashtv.player.sources.GroupItem
import com.fflashtv.player.tmdb.JsonServersStore
import com.fflashtv.player.tmdb.TmdbClient
import com.fflashtv.player.tmdb.TmdbLibraryView

private fun normalizeArabic(text: String): String {
    return text.lowercase()
        .replace(Regex("[\u064B-\u065F\u0670]"), "")
        .replace('أ', 'ا').replace('إ', 'ا').replace('آ', 'ا')
        .replace('ة', 'ه').replace('ى', 'ي')
        .trim()
}

@Composable
fun LibraryScreen(ui: LibraryUiState, viewModel: LibraryViewModel, onGoToSources: () -> Unit) {
    val context = LocalContext.current
    var showSourcePicker by remember { mutableStateOf(false) }
    var showGroupManager by remember { mutableStateOf(false) }
    var showAuditLog by remember { mutableStateOf(false) }
    var pendingEngineChoice by remember { mutableStateOf<Pair<List<ChannelItem>, Int>?>(null) }

    val tmdbClient = remember { TmdbClient(context) }
    val serversStore = remember { JsonServersStore(context) }
    val tmdbKey by tmdbClient.apiKeyFlow.collectAsState()
    var librarySection by remember { mutableIntStateOf(0) }

    val limitManager = remember { ConnectionLimitManager.get(context) }
    val limitEnabled by limitManager.isEnabledFlow.collectAsState()
    val activeSockets by ActiveSocketRegistry.activeCount.collectAsState()
    val auditLogs by ConnectionAuditLog.entries.collectAsState()

    val activeSource = ui.activeSource

    Column(modifier = Modifier.fillMaxSize().padding(horizontal = 10.dp, vertical = 6.dp)) {
        if (tmdbKey.isNotBlank()) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 6.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                FilterChip(
                    selected = librarySection == 0,
                    onClick = { librarySection = 0 },
                    label = { Text("قنوات IPTV") },
                    modifier = Modifier.weight(1f)
                )
                FilterChip(
                    selected = librarySection == 1,
                    onClick = { librarySection = 1 },
                    label = { Text("TMDB أفلام ومسلسلات") },
                    modifier = Modifier.weight(1f)
                )
            }
        }

        if (tmdbKey.isNotBlank() && librarySection == 1) {
            TmdbLibraryView(tmdbClient = tmdbClient, serversStore = serversStore)
            return@Column
        }

        // Compact Connection Limit Bar
        Surface(
            color = if (limitEnabled) Color(0xFF00E5FF).copy(alpha = 0.14f) else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = if (limitEnabled) "حد الاتصالات: مفعّل (Sockets: $activeSockets)" else "حد الاتصالات: معطّل",
                    style = MaterialTheme.typography.labelMedium,
                    color = if (limitEnabled) Color(0xFF00E5FF) else MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.weight(1f)
                )
                TextButton(
                    onClick = { showAuditLog = true },
                    contentPadding = PaddingValues(horizontal = 8.dp, vertical = 0.dp),
                    modifier = Modifier.height(32.dp)
                ) { Text("السجل", fontSize = 12.sp) }
                Switch(checked = limitEnabled, onCheckedChange = { limitManager.setEnabled(it) })
            }
        }

        if (ui.isLoading) {
            Spacer(Modifier.height(4.dp))
            LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
        }

        if (activeSource == null) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Icon(Icons.Default.LiveTv, contentDescription = null, modifier = Modifier.size(56.dp), tint = MaterialTheme.colorScheme.primary)
                    Text("لا يوجد أي مصدر مضاف حالياً", style = MaterialTheme.typography.titleMedium)
                    Text("أضف قائمة M3U أو ملف أو حساب Xtream من قسم المصادر والإعدادات.", style = MaterialTheme.typography.bodySmall)
                    Button(onClick = onGoToSources) { Text("إضافة مصدر الآن") }
                }
            }
        } else {
            Spacer(Modifier.height(6.dp))
            // Compact Source + Actions Row
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.weight(1f)) {
                    OutlinedButton(
                        onClick = { showSourcePicker = true },
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                        modifier = Modifier.fillMaxWidth().height(38.dp)
                    ) {
                        Text("${activeSource.name} (${activeSource.channelCount})", maxLines = 1, overflow = TextOverflow.Ellipsis, fontSize = 13.sp)
                    }
                    DropdownMenu(expanded = showSourcePicker, onDismissRequest = { showSourcePicker = false }) {
                        ui.sources.forEach { src ->
                            DropdownMenuItem(
                                text = { Text("${src.name} (${src.channelCount})") },
                                onClick = { showSourcePicker = false; viewModel.activateSource(src.id) }
                            )
                        }
                    }
                }
                IconButton(
                    onClick = {
                        viewModel.setFilterMode(
                            if (ui.filterMode == LibraryFilterMode.FAVORITES) LibraryFilterMode.GROUPS else LibraryFilterMode.FAVORITES
                        )
                    },
                    modifier = Modifier.size(38.dp)
                ) {
                    Icon(
                        imageVector = if (ui.filterMode == LibraryFilterMode.FAVORITES) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                        contentDescription = "المفضلة",
                        tint = if (ui.filterMode == LibraryFilterMode.FAVORITES) Color(0xFFE50914) else MaterialTheme.colorScheme.onSurface
                    )
                }
                IconButton(onClick = { viewModel.refreshSource(activeSource.id) }, modifier = Modifier.size(38.dp)) {
                    Icon(Icons.Default.Refresh, "تحديث")
                }
                IconButton(onClick = { showGroupManager = true }, modifier = Modifier.size(38.dp)) {
                    Icon(Icons.Default.Sort, "المجموعات")
                }
            }

            Spacer(Modifier.height(6.dp))
            // Sleek Compact Search Bar (42dp)
            Surface(
                shape = RoundedCornerShape(10.dp),
                color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.55f),
                modifier = Modifier.fillMaxWidth().height(42.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize().padding(horizontal = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Default.Search, null, tint = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(8.dp))
                    Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.CenterStart) {
                        if (ui.searchQuery.isEmpty()) {
                            Text("بحث في كل القنوات (${activeSource.channelCount})...", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 13.sp, maxLines = 1)
                        }
                        BasicTextField(
                            value = ui.searchQuery,
                            onValueChange = { viewModel.setSearchQuery(it) },
                            singleLine = true,
                            textStyle = TextStyle(color = MaterialTheme.colorScheme.onSurface, fontSize = 14.sp),
                            cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    if (ui.searchQuery.isNotEmpty()) {
                        IconButton(onClick = { viewModel.setSearchQuery("") }, modifier = Modifier.size(28.dp)) {
                            Icon(Icons.Default.Close, null, modifier = Modifier.size(16.dp))
                        }
                    }
                }
            }

            val orderedGroups = remember(ui.groups, activeSource.useCustomGroupOrder, activeSource.showEmptyGroups, ui.showHiddenGroups) {
                val base = if (activeSource.useCustomGroupOrder) ui.groups.sortedBy { it.customOrder } else ui.groups.sortedBy { it.originalOrder }
                base.filter { g -> (ui.showHiddenGroups || !g.isHidden) && (activeSource.showEmptyGroups || g.channelCount > 0) }
            }

            if (ui.filterMode == LibraryFilterMode.GROUPS && ui.searchQuery.isBlank()) {
                LazyRow(horizontalArrangement = Arrangement.spacedBy(6.dp), contentPadding = PaddingValues(vertical = 4.dp)) {
                    items(orderedGroups, key = { it.name }) { grp ->
                        FilterChip(
                            selected = ui.selectedGroupName == grp.name,
                            onClick = { viewModel.selectGroup(grp.name) },
                            label = { Text("${grp.name} (${grp.channelCount})", fontSize = 12.sp) }
                        )
                    }
                }
            }

            val displayedChannels = remember(ui.channels, ui.searchQuery, ui.filterMode, ui.selectedGroupName, ui.favoriteIds) {
                when {
                    ui.searchQuery.isNotBlank() -> {
                        val normQ = normalizeArabic(ui.searchQuery)
                        ui.channels.filter { normalizeArabic(it.name).contains(normQ) }
                    }
                    ui.filterMode == LibraryFilterMode.FAVORITES -> ui.channels.filter { it.id in ui.favoriteIds }
                    else -> ui.selectedGroupName?.let { target -> ui.channels.filter { it.groupName == target } } ?: ui.channels
                }
            }

            if (ui.searchQuery.isNotBlank()) {
                Text(
                    text = "نتائج البحث في كامل المصدر: ${displayedChannels.size} قناة",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(vertical = 4.dp)
                )
            } else if (ui.filterMode == LibraryFilterMode.FAVORITES) {
                Text(
                    text = "المفضلة (${displayedChannels.size})",
                    style = MaterialTheme.typography.labelSmall,
                    color = Color(0xFFE50914),
                    modifier = Modifier.padding(vertical = 4.dp)
                )
            }

            if (displayedChannels.isEmpty()) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(if (ui.filterMode == LibraryFilterMode.FAVORITES) "لا توجد قنوات في المفضلة" else "لا توجد قنوات مطابقة")
                }
            } else {
                LazyColumn(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.spacedBy(5.dp), contentPadding = PaddingValues(bottom = 10.dp)) {
                    itemsIndexed(displayedChannels, key = { _, ch -> ch.id }) { idx, ch ->
                        val isFav = ch.id in ui.favoriteIds
                        Card(
                            modifier = Modifier.fillMaxWidth().clickable { pendingEngineChoice = displayedChannels to idx },
                            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.42f))
                        ) {
                            Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                                Box(modifier = Modifier.size(40.dp).clip(RoundedCornerShape(8.dp)).background(Color.Black.copy(alpha = 0.25f)), contentAlignment = Alignment.Center) {
                                    if (ch.logoUrl.isNotBlank()) AsyncImage(model = ch.logoUrl, contentDescription = ch.name, contentScale = ContentScale.Fit, modifier = Modifier.fillMaxSize().padding(3.dp))
                                    else Icon(Icons.Default.LiveTv, null, tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(20.dp))
                                }
                                Spacer(Modifier.width(10.dp))
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(if (ch.channelNumber.isNotBlank()) "${ch.channelNumber}. ${ch.name}" else ch.name, fontWeight = FontWeight.Medium, fontSize = 14.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
                                    Text(ch.groupName, style = MaterialTheme.typography.bodySmall, fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant, maxLines = 1, overflow = TextOverflow.Ellipsis)
                                }
                                IconButton(onClick = { viewModel.toggleFavorite(ch.id) }, modifier = Modifier.size(34.dp)) {
                                    Icon(if (isFav) Icons.Default.Favorite else Icons.Default.FavoriteBorder, "المفضلة", tint = if (isFav) Color(0xFFE50914) else MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.size(20.dp))
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    pendingEngineChoice?.let { (list, idx) ->
        val chName = list.getOrNull(idx)?.name ?: ""
        AlertDialog(
            onDismissRequest = { pendingEngineChoice = null },
            title = { Text("اختر محرك التشغيل") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(chName, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold)
                    Button(
                        onClick = {
                            pendingEngineChoice = null
                            PlayerLaunchBridge.launch(context, list, idx, PlayerLaunchBridge.EngineType.MEDIA3)
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) { Text("Media3 ExoPlayer (المحرك القياسي)") }
                    OutlinedButton(
                        onClick = {
                            pendingEngineChoice = null
                            PlayerLaunchBridge.launch(context, list, idx, PlayerLaunchBridge.EngineType.LIBMPV)
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) { Text("libmpv (المحرك المفتوح المصدر)") }
                }
            },
            confirmButton = {},
            dismissButton = { TextButton(onClick = { pendingEngineChoice = null }) { Text("إلغاء") } }
        )
    }

    if (showAuditLog) {
        AlertDialog(
            onDismissRequest = { showAuditLog = false },
            title = { Text("سجل مراقبة الاتصالات (Sockets: $activeSockets)") },
            text = {
                LazyColumn(modifier = Modifier.height(320.dp)) {
                    items(auditLogs.asReversed()) { line ->
                        Text(line, style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(vertical = 2.dp))
                    }
                }
            },
            confirmButton = { TextButton(onClick = { showAuditLog = false }) { Text("إغلاق") } },
            dismissButton = { TextButton(onClick = { ConnectionAuditLog.clear() }) { Text("مسح السجل") } }
        )
    }

    if (showGroupManager && activeSource != null) {
        GroupManagerDialog(
            groups = if (activeSource.useCustomGroupOrder) ui.groups.sortedBy { it.customOrder } else ui.groups.sortedBy { it.originalOrder },
            showEmptyGroups = activeSource.showEmptyGroups,
            onToggleShowEmpty = { viewModel.toggleShowEmptyGroups(activeSource.id) },
            onToggleHidden = { viewModel.toggleGroupHidden(it) },
            onMove = { name, up -> viewModel.moveGroup(name, up) },
            onResetOrder = { viewModel.resetGroupOrder() },
            onDismiss = { showGroupManager = false }
        )
    }
}

@Composable
private fun GroupManagerDialog(
    groups: List<GroupItem>, showEmptyGroups: Boolean, onToggleShowEmpty: () -> Unit,
    onToggleHidden: (String) -> Unit, onMove: (String, Boolean) -> Unit, onResetOrder: () -> Unit, onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("إدارة وترتيب المجموعات") },
        text = {
            Column {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    OutlinedButton(onClick = onToggleShowEmpty) { Text(if (showEmptyGroups) "إخفاء الفارغة" else "إظهار الفارغة") }
                    OutlinedButton(onClick = onResetOrder) { Text("الترتيب الأصلي") }
                }
                Spacer(Modifier.height(8.dp))
                LazyColumn(modifier = Modifier.height(300.dp)) {
                    items(groups, key = { it.name }) { g ->
                        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                            Text("${g.name} (${g.channelCount})", modifier = Modifier.weight(1f), maxLines = 1, overflow = TextOverflow.Ellipsis)
                            IconButton(onClick = { onMove(g.name, true) }) { Icon(Icons.Default.ArrowUpward, null) }
                            IconButton(onClick = { onMove(g.name, false) }) { Icon(Icons.Default.ArrowDownward, null) }
                            IconButton(onClick = { onToggleHidden(g.name) }) { Icon(if (g.isHidden) Icons.Default.VisibilityOff else Icons.Default.Visibility, null) }
                        }
                    }
                }
            }
        },
        confirmButton = { TextButton(onClick = onDismiss) { Text("تم") } }
    )
}
