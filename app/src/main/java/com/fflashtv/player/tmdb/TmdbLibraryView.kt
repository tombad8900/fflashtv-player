package com.fflashtv.player.tmdb

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
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
import com.fflashtv.player.model.ContentType
import com.fflashtv.player.sources.ChannelItem
import com.fflashtv.player.ui.PlayerLaunchBridge
import kotlinx.coroutines.launch

@Composable
fun TmdbLibraryView(
    tmdbClient: TmdbClient,
    serversStore: JsonServersStore
) {
    val context = LocalContext.current
    val activity = context as? Activity
    val scope = rememberCoroutineScope()

    var selectedCategory by remember { mutableStateOf(TmdbCategory.POPULAR_MOVIES) }
    var searchQuery by remember { mutableStateOf("") }
    var items by remember { mutableStateOf<List<TmdbItem>>(emptyList()) }
    var isLoading by remember { mutableStateOf(false) }
    var errorMsg by remember { mutableStateOf<String?>(null) }

    var selectedItem by remember { mutableStateOf<TmdbItem?>(null) }
    var seasonCount by remember { mutableIntStateOf(1) }
    var selectedSeason by remember { mutableIntStateOf(1) }
    var episodes by remember { mutableStateOf<List<TmdbEpisode>>(emptyList()) }
    var selectedEpisode by remember { mutableIntStateOf(1) }

    var isSniffing by remember { mutableStateOf(false) }
    var sniffStatus by remember { mutableStateOf<String?>(null) }
    var readyStream by remember { mutableStateOf<Pair<String, SniffedStream>?>(null) }

    val servers by serversStore.servers.collectAsState()
    val visibleServers = remember(servers) { serversStore.visibleEnabledServers() }

    LaunchedEffect(selectedCategory, searchQuery) {
        isLoading = true
        errorMsg = null
        val res = if (searchQuery.isNotBlank()) {
            tmdbClient.search(searchQuery)
        } else {
            tmdbClient.fetchCategory(selectedCategory)
        }
        res.onSuccess { items = it }.onFailure { errorMsg = it.message }
        isLoading = false
    }

    Column(modifier = Modifier.fillMaxSize()) {
        // Search Bar
        Surface(
            shape = RoundedCornerShape(10.dp),
            color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.55f),
            modifier = Modifier.fillMaxWidth().height(42.dp)
        ) {
            Row(modifier = Modifier.fillMaxSize().padding(horizontal = 12.dp), verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.Search, null, tint = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(8.dp))
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.CenterStart) {
                    if (searchQuery.isEmpty()) Text("ابحث في أفلام ومسلسلات TMDB...", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 13.sp)
                    BasicTextField(
                        value = searchQuery,
                        onValueChange = { searchQuery = it },
                        singleLine = true,
                        textStyle = TextStyle(color = MaterialTheme.colorScheme.onSurface, fontSize = 14.sp),
                        cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                if (searchQuery.isNotEmpty()) {
                    IconButton(onClick = { searchQuery = "" }, modifier = Modifier.size(28.dp)) {
                        Icon(Icons.Default.Close, null, modifier = Modifier.size(16.dp))
                    }
                }
            }
        }

        if (searchQuery.isBlank()) {
            LazyRow(horizontalArrangement = Arrangement.spacedBy(6.dp), contentPadding = PaddingValues(vertical = 6.dp)) {
                items(TmdbCategory.entries) { cat ->
                    FilterChip(
                        selected = selectedCategory == cat,
                        onClick = { selectedCategory = cat },
                        label = { Text(cat.label, fontSize = 12.sp) }
                    )
                }
            }
        }

        if (isLoading) LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
        errorMsg?.let { Text(it, color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.bodySmall, modifier = Modifier.padding(vertical = 4.dp)) }

        LazyColumn(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.spacedBy(6.dp), contentPadding = PaddingValues(bottom = 12.dp)) {
            items(items, key = { "${it.isTv}_${it.id}" }) { item ->
                Card(
                    modifier = Modifier.fillMaxWidth().clickable {
                        selectedItem = item
                        sniffStatus = null
                        if (item.isTv) {
                            scope.launch {
                                seasonCount = tmdbClient.fetchSeasonCount(item.id)
                                selectedSeason = 1
                                episodes = tmdbClient.fetchEpisodes(item.id, 1)
                                selectedEpisode = 1
                            }
                        }
                    },
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.42f))
                ) {
                    Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier.width(54.dp).height(78.dp).clip(RoundedCornerShape(8.dp)).background(Color.Black.copy(alpha = 0.25f)),
                            contentAlignment = Alignment.Center
                        ) {
                            if (item.posterUrl.isNotBlank()) {
                                AsyncImage(model = item.posterUrl, contentDescription = item.title, contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
                            } else {
                                Icon(Icons.Default.Movie, null, tint = MaterialTheme.colorScheme.primary)
                            }
                        }
                        Spacer(Modifier.width(10.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(item.title, fontWeight = FontWeight.Bold, fontSize = 14.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                Icon(Icons.Default.Star, null, tint = Color(0xFFFFB300), modifier = Modifier.size(14.dp))
                                Text(String.format("%.1f", item.voteAverage), fontSize = 12.sp)
                                if (item.releaseDate.isNotBlank()) Text("• ${item.releaseDate.take(4)}", fontSize = 12.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                                Text(if (item.isTv) "• مسلسل" else "• فيلم", fontSize = 11.sp, color = MaterialTheme.colorScheme.primary)
                            }
                            if (item.overview.isNotBlank()) {
                                Text(item.overview, fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant, maxLines = 2, overflow = TextOverflow.Ellipsis)
                            }
                        }
                    }
                }
            }
        }
    }

    // Detail + Server Picker + Hidden Sniffer Dialog
    selectedItem?.let { item ->
        AlertDialog(
            onDismissRequest = { if (!isSniffing) selectedItem = null },
            title = { Text(item.title, maxLines = 1, overflow = TextOverflow.Ellipsis) },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    if (item.isTv) {
                        Text("الموسم:", style = MaterialTheme.typography.labelMedium)
                        LazyRow(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            items((1..seasonCount).toList()) { sNum ->
                                FilterChip(
                                    selected = selectedSeason == sNum,
                                    onClick = {
                                        selectedSeason = sNum
                                        scope.launch {
                                            episodes = tmdbClient.fetchEpisodes(item.id, sNum)
                                            selectedEpisode = 1
                                        }
                                    },
                                    label = { Text("م$sNum") }
                                )
                            }
                        }
                        Text("الحلقة:", style = MaterialTheme.typography.labelMedium)
                        LazyRow(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            val epList = if (episodes.isNotEmpty()) episodes.map { it.episodeNumber } else (1..12).toList()
                            items(epList) { ep ->
                                FilterChip(
                                    selected = selectedEpisode == ep,
                                    onClick = { selectedEpisode = ep },
                                    label = { Text("ح$ep") }
                                )
                            }
                        }
                    }

                    if (isSniffing) {
                        LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
                    }
                    sniffStatus?.let {
                        Text(it, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.primary)
                    }

                    Text("اختر خادم التشغيل:", style = MaterialTheme.typography.labelLarge)
                    if (visibleServers.isEmpty()) {
                        Text("لا توجد مصادر JSON مفعّلة. استورد ملف المصادر من قسم المصادر والإعدادات.", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.error)
                    } else {
                        LazyColumn(modifier = Modifier.heightIn(max = 200.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                            items(visibleServers, key = { it.id }) { srv ->
                                OutlinedButton(
                                    enabled = !isSniffing,
                                    onClick = {
                                        if (activity == null) return@OutlinedButton
                                        isSniffing = true
                                        sniffStatus = "جاري اقتناص البث من ${srv.name} (مع فلترة الإعلانات)..."
                                        // Remove the Compose picker before the sniffer attaches its interactive WebView.
                                        selectedItem = null
                                        scope.launch {
                                            val imdbId = tmdbClient.fetchExternalImdbId(item.id, item.isTv)
                                            val embedUrl = serversStore.buildEmbedUrl(srv, item.id, imdbId, item.isTv, selectedSeason, selectedEpisode)
                                            val res = HiddenStreamSniffer.sniff(activity, embedUrl, srv.headers)
                                            isSniffing = false
                                            res.onSuccess { sniffed ->
                                                val displayTitle = if (item.isTv) "${item.title} - S${selectedSeason}E${selectedEpisode}" else item.title
                                                selectedItem = null
                                                readyStream = displayTitle to sniffed
                                            }.onFailure { err ->
                                                sniffStatus = err.message ?: "فشل الاقتناص"
                                                selectedItem = item
                                            }
                                        }
                                    },
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Text("${srv.name} (أولوية ${srv.priority})", maxLines = 1, overflow = TextOverflow.Ellipsis)
                                }
                            }
                        }
                    }
                }
            },
            confirmButton = {},
            dismissButton = {
                TextButton(enabled = !isSniffing, onClick = { selectedItem = null }) { Text("إغلاق") }
            }
        )
    }

    // Engine Chooser after Stream Sniffed
    readyStream?.let { (title, sniffed) ->
        val channel = ChannelItem(
            id = "tmdb_${title.hashCode()}",
            name = title,
            url = sniffed.streamUrl,
            groupName = "TMDB",
            headers = buildMap {
                putAll(sniffed.requestHeaders)
                put("Referer", sniffed.referer)
                put("User-Agent", sniffed.userAgent)
                if (sniffed.cookies.isNotBlank()) put("Cookie", sniffed.cookies)
            },
            subtitles = sniffed.subtitles,
            contentType = ContentType.VOD
        )
        AlertDialog(
            onDismissRequest = { readyStream = null },
            title = { Text("تم التقاط البث بنجاح") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    Text(title, fontWeight = FontWeight.Bold)
                    if (sniffed.subtitles.isNotEmpty()) {
                        Text("تم التقاط ${sniffed.subtitles.size} ملف ترجمة", style = MaterialTheme.typography.bodySmall, color = Color(0xFF4CAF50))
                    }
                    Button(
                        onClick = {
                            readyStream = null
                            PlayerLaunchBridge.launch(context, listOf(channel), 0, PlayerLaunchBridge.EngineType.MEDIA3)
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) { Text("تشغيل عبر Media3 ExoPlayer") }
                    OutlinedButton(
                        onClick = {
                            readyStream = null
                            PlayerLaunchBridge.launch(context, listOf(channel), 0, PlayerLaunchBridge.EngineType.LIBMPV)
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) { Text("تشغيل عبر libmpv") }
                }
            },
            confirmButton = {},
            dismissButton = { TextButton(onClick = { readyStream = null }) { Text("إلغاء") } }
        )
    }
}
