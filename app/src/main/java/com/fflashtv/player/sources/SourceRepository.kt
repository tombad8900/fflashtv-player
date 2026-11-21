package com.fflashtv.player.sources

import android.content.Context
import com.fflashtv.player.model.ContentType
import com.fflashtv.player.model.DrmConfig
import com.fflashtv.player.model.DrmType
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.util.UUID
import java.util.concurrent.TimeUnit

class SourceRepository(context: Context) {

    private val rootDir = File(context.applicationContext.filesDir, "fflashtv_sources").apply { mkdirs() }
    private val indexFile = File(rootDir, "sources_index.json")

    private val httpClient = OkHttpClient.Builder()
        .connectTimeout(15, TimeUnit.SECONDS)
        .readTimeout(25, TimeUnit.SECONDS)
        .followRedirects(true)
        .followSslRedirects(true)
        .build()

    @Synchronized
    fun loadAllSources(): List<SourceConfig> {
        if (!indexFile.exists()) return emptyList()
        return try {
            val arr = JSONArray(indexFile.readText())
            (0 until arr.length()).map { i -> parseConfig(arr.getJSONObject(i)) }
        } catch (_: Throwable) {
            emptyList()
        }
    }

    @Synchronized
    fun saveAllSources(sources: List<SourceConfig>) {
        val arr = JSONArray()
        for (s in sources) arr.put(serializeConfig(s))
        indexFile.writeText(arr.toString())
    }

    @Synchronized
    fun loadPayload(sourceId: String): SourcePayload {
        val file = File(rootDir, "source_$sourceId.json")
        if (!file.exists()) return SourcePayload(emptyList(), emptyList(), emptySet())
        return try {
            val obj = JSONObject(file.readText())
            val groupsArr = obj.optJSONArray("groups") ?: JSONArray()
            val groups = (0 until groupsArr.length()).map { i ->
                val g = groupsArr.getJSONObject(i)
                GroupItem(
                    name = g.optString("name"),
                    channelCount = g.optInt("channelCount", 0),
                    originalOrder = g.optInt("originalOrder", i),
                    customOrder = g.optInt("customOrder", i),
                    isHidden = g.optBoolean("isHidden", false)
                )
            }
            val chArr = obj.optJSONArray("channels") ?: JSONArray()
            val channels = (0 until chArr.length()).map { i ->
                val c = chArr.getJSONObject(i)
                val headersObj = c.optJSONObject("headers")
                val headers = mutableMapOf<String, String>()
                if (headersObj != null) {
                    val keys = headersObj.keys()
                    while (keys.hasNext()) {
                        val k = keys.next()
                        headers[k] = headersObj.optString(k)
                    }
                }
                ChannelItem(
                    id = c.optString("id"),
                    name = c.optString("name"),
                    url = c.optString("url"),
                    groupName = c.optString("groupName", "عام"),
                    logoUrl = c.optString("logoUrl", ""),
                    channelNumber = c.optString("channelNumber", ""),
                    headers = headers,
                    contentType = runCatching { ContentType.valueOf(c.optString("contentType", "LIVE")) }
                        .getOrDefault(ContentType.LIVE)
                )
            }
            val favArr = obj.optJSONArray("favorites") ?: JSONArray()
            val favs = (0 until favArr.length()).map { favArr.getString(it) }.toSet()
            SourcePayload(
                groups = groups,
                channels = channels,
                favoriteIds = favs,
                accountInfo = obj.optString("accountInfo", "")
            )
        } catch (_: Throwable) {
            SourcePayload(emptyList(), emptyList(), emptySet())
        }
    }

    @Synchronized
    fun savePayload(sourceId: String, payload: SourcePayload) {
        val file = File(rootDir, "source_$sourceId.json")
        val obj = JSONObject()
        val groupsArr = JSONArray()
        for (g in payload.groups) {
            groupsArr.put(JSONObject().apply {
                put("name", g.name)
                put("channelCount", g.channelCount)
                put("originalOrder", g.originalOrder)
                put("customOrder", g.customOrder)
                put("isHidden", g.isHidden)
            })
        }
        val chArr = JSONArray()
        for (c in payload.channels) {
            chArr.put(JSONObject().apply {
                put("id", c.id)
                put("name", c.name)
                put("url", c.url)
                put("groupName", c.groupName)
                put("logoUrl", c.logoUrl)
                put("channelNumber", c.channelNumber)
                put("contentType", c.contentType.name)
                if (c.headers.isNotEmpty()) {
                    put("headers", JSONObject(c.headers))
                }
            })
        }
        val favArr = JSONArray()
        for (f in payload.favoriteIds) favArr.put(f)

        obj.put("groups", groupsArr)
        obj.put("channels", chArr)
        obj.put("favorites", favArr)
        obj.put("accountInfo", payload.accountInfo)
        file.writeText(obj.toString())
    }

    @Synchronized
    fun deletePayload(sourceId: String) {
        File(rootDir, "source_$sourceId.json").delete()
    }

    suspend fun fetchSourcePayload(config: SourceConfig): Result<SourcePayload> = withContext(Dispatchers.IO) {
        when (config.type) {
            SourceType.M3U_URL -> {
                try {
                    val req = Request.Builder().url(config.url.trim()).get()
                    for ((k, v) in config.headers) {
                        if (k.isNotBlank()) req.header(k.trim(), v)
                    }
                    val text = httpClient.newCall(req.build()).execute().use { resp ->
                        if (!resp.isSuccessful) {
                            return@withContext Result.failure(IllegalStateException("فشل الاتصال بالخادم (HTTP ${resp.code})"))
                        }
                        resp.body?.string() ?: ""
                    }
                    if (text.isBlank()) {
                        return@withContext Result.failure(IllegalStateException("قائمة التشغيل فارغة"))
                    }
                    val parsed = M3uParser.parse(text, config.headers)
                    if (parsed.channels.isEmpty()) {
                        return@withContext Result.failure(IllegalStateException("تعذر استخراج أي قناة من القائمة"))
                    }
                    Result.success(parsed)
                } catch (t: Throwable) {
                    Result.failure(IllegalStateException("تعذر الاتصال بالرابط: ${t.message ?: "خطأ شبكة"}"))
                }
            }

            SourceType.M3U_FILE, SourceType.M3U_TEXT -> {
                if (config.rawText.isBlank()) {
                    return@withContext Result.failure(IllegalStateException("محتوى القائمة فارغ"))
                }
                val parsed = M3uParser.parse(config.rawText, config.headers)
                if (parsed.channels.isEmpty()) {
                    return@withContext Result.failure(IllegalStateException("تعذر تحليل القائمة أو الملف غير مدعوم"))
                }
                Result.success(parsed)
            }

            SourceType.XTREAM -> {
                XtreamClient.fetchLive(
                    rawHost = config.host,
                    username = config.username,
                    password = config.password,
                    headers = config.headers
                )
            }

            SourceType.SINGLE_CHANNEL -> {
                if (config.url.isBlank()) {
                    return@withContext Result.failure(IllegalStateException("رابط القناة فارغ"))
                }
                val group = config.rawText.ifBlank { "قنوات منفردة" }
                val ch = ChannelItem(
                    id = "single_${config.id}",
                    name = config.name.ifBlank { "قناة" },
                    url = config.url.trim(),
                    groupName = group,
                    logoUrl = config.host, // reused for optional logo on single channel
                    headers = config.headers,
                    contentType = ContentType.LIVE
                )
                Result.success(
                    SourcePayload(
                        groups = listOf(GroupItem(name = group, channelCount = 1, originalOrder = 0)),
                        channels = listOf(ch)
                    )
                )
            }
        }
    }

    fun mergePreservingSettings(oldPayload: SourcePayload, fresh: SourcePayload): SourcePayload {
        // Preserve favorites across refresh by matching URL or channel ID
        val oldFavUrls = oldPayload.channels
            .filter { it.id in oldPayload.favoriteIds }
            .map { it.url }
            .toSet()

        val newFavIds = fresh.channels
            .filter { it.id in oldPayload.favoriteIds || it.url in oldFavUrls }
            .map { it.id }
            .toSet()

        // Preserve hidden groups and custom group order
        val oldGroupMap = oldPayload.groups.associateBy { it.name }
        val mergedGroups = fresh.groups.map { g ->
            val old = oldGroupMap[g.name]
            if (old != null) {
                g.copy(isHidden = old.isHidden, customOrder = old.customOrder)
            } else {
                g
            }
        }

        return fresh.copy(groups = mergedGroups, favoriteIds = newFavIds)
    }

    fun newId(): String = UUID.randomUUID().toString().take(8)

    private fun serializeConfig(s: SourceConfig): JSONObject = JSONObject().apply {
        put("id", s.id)
        put("name", s.name)
        put("type", s.type.name)
        put("url", s.url)
        put("rawText", s.rawText)
        put("host", s.host)
        put("username", s.username)
        put("password", s.password)
        put("headers", JSONObject(s.headers))
        put("status", s.status.name)
        put("statusMessage", s.statusMessage)
        put("lastUpdatedMs", s.lastUpdatedMs)
        put("groupCount", s.groupCount)
        put("channelCount", s.channelCount)
        put("accountInfo", s.accountInfo)
        put("isActive", s.isActive)
        put("autoUpdate", s.autoUpdate)
        put("showEmptyGroups", s.showEmptyGroups)
        put("useCustomGroupOrder", s.useCustomGroupOrder)
    }

    private fun parseConfig(o: JSONObject): SourceConfig {
        val hObj = o.optJSONObject("headers")
        val headers = mutableMapOf<String, String>()
        if (hObj != null) {
            val keys = hObj.keys()
            while (keys.hasNext()) {
                val k = keys.next()
                headers[k] = hObj.optString(k)
            }
        }
        return SourceConfig(
            id = o.optString("id"),
            name = o.optString("name"),
            type = runCatching { SourceType.valueOf(o.optString("type")) }.getOrDefault(SourceType.M3U_URL),
            url = o.optString("url", ""),
            rawText = o.optString("rawText", ""),
            host = o.optString("host", ""),
            username = o.optString("username", ""),
            password = o.optString("password", ""),
            headers = headers,
            status = runCatching { SourceStatus.valueOf(o.optString("status")) }.getOrDefault(SourceStatus.IDLE),
            statusMessage = o.optString("statusMessage", ""),
            lastUpdatedMs = o.optLong("lastUpdatedMs", 0L),
            groupCount = o.optInt("groupCount", 0),
            channelCount = o.optInt("channelCount", 0),
            accountInfo = o.optString("accountInfo", ""),
            isActive = o.optBoolean("isActive", false),
            autoUpdate = o.optBoolean("autoUpdate", false),
            showEmptyGroups = o.optBoolean("showEmptyGroups", false),
            useCustomGroupOrder = o.optBoolean("useCustomGroupOrder", false)
        )
    }
}
