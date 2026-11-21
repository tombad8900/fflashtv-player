package com.fflashtv.player.exotv

import android.util.Base64
import com.fflashtv.player.model.BackupSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONArray
import org.json.JSONObject
import java.nio.charset.StandardCharsets
import java.util.concurrent.TimeUnit

/**
 * Runtime model of EXO TV's remote appConfig.php + channelsURL contract.
 * The server configuration and channel payload are decoded in memory only.
 */
data class ExoTvAppConfig(
    val version: String = "",
    val forceUpdate: Boolean = false,
    val message: String = "",
    val apkUrl: String = "",
    val updateUrl: String = "",
    val smartLinkUrl: String = "",
    val adsRefreshHours: Double? = null,
    val channelsUrl: String = "",
    val ytApi: String = "",
    val ytApiHeaders: Map<String, String> = emptyMap(),
    val ostApi: String = "",
    val ostApiHeaders: Map<String, String> = emptyMap(),
    val ytvBase: String = "",
    val ytvHeaders: Map<String, String> = emptyMap(),
    val genApi: String = "",
    val genApiHeaders: Map<String, String> = emptyMap(),
    val genStreamHeaders: Map<String, String> = emptyMap(),
    val tmdbApiKey: String = "",
    val gateBase: String = "",
    val gateInfoBase: String = "",
    val wasmOrigin: String = "",
    val openSubtitlesBase: String = "",
    val ipLookupUrl: String = "",
    val vidcoreBase: String = ""
) {
    companion object {
        fun parse(json: JSONObject): ExoTvAppConfig = ExoTvAppConfig(
            version = json.optString("version"),
            forceUpdate = json.optBoolean("forceUpdate"),
            message = json.optString("message"),
            apkUrl = json.optString("apkUrl"),
            updateUrl = json.optString("updateUrl"),
            smartLinkUrl = json.optString("smartLinkURL"),
            adsRefreshHours = json.optDouble("adsRefreshHours").takeIf { it > 0.0 },
            channelsUrl = json.optString("channelsURL"),
            ytApi = json.optString("ytapi"),
            ytApiHeaders = json.optJSONObject("ytapihd")?.optJSONObject("headers").toStringMap(),
            ostApi = json.optString("ostapi"),
            ostApiHeaders = json.optJSONObject("ostapihd")?.optJSONObject("headers").toStringMap(),
            ytvBase = json.optString("ytvbase"),
            ytvHeaders = json.optJSONObject("ytvhd")?.optJSONObject("headers").toStringMap(),
            genApi = json.optString("genapi"),
            genApiHeaders = json.optJSONObject("genapihd")?.optJSONObject("api_headers").toStringMap(),
            genStreamHeaders = json.optJSONObject("genapihd")?.optJSONObject("stream_headers").toStringMap(),
            tmdbApiKey = json.optString("tmdbApiKey"),
            gateBase = json.optString("gateBase"),
            gateInfoBase = json.optString("gateInfoBase"),
            wasmOrigin = json.optString("wasmOrigin"),
            openSubtitlesBase = json.optString("opensubtitlesBase"),
            ipLookupUrl = json.optString("ipLookupUrl"),
            vidcoreBase = json.optString("vidcoreBase")
        )
    }
}

enum class ExoTvResolverKind {
    BACKUP, YTV, O, GEN, DEFAULT
}

data class ExoTvChannel(
    val id: String = "",
    val idO: String = "",
    val name: String = "",
    val title: String = "",
    val icon: String = "",
    val type: String = "",
    val catO: String = "",
    val catRealName: String = "",
    val chRealName: String = "",
    val idGen: String = "",
    val parent: String = "",
    val server: String = "",
    val isSub: Boolean = false,
    val isBackup: Boolean = false,
    val backups: List<BackupSource> = emptyList(),
    val xCatInfo: String = ""
) {
    val displayName: String get() = name.ifBlank { title }
    val resolverKind: ExoTvResolverKind
        get() = when {
            isBackup && backups.isNotEmpty() -> ExoTvResolverKind.BACKUP
            type.equals("ytv", true) || (catRealName.isNotBlank() && chRealName.isNotBlank()) -> ExoTvResolverKind.YTV
            idO.isNotBlank() && catO.isNotBlank() -> ExoTvResolverKind.O
            idGen.isNotBlank() && parent.isNotBlank() -> ExoTvResolverKind.GEN
            else -> ExoTvResolverKind.DEFAULT
        }
}

data class ExoTvChannelCategory(
    val id: String,
    val idO: String = "",
    val title: String = "",
    val channels: List<ExoTvChannel> = emptyList()
)

data class ExoTvCatalog(
    val config: ExoTvAppConfig,
    val categories: List<ExoTvChannelCategory>,
    val loadedAtMs: Long
)

class ExoTvCatalogRepository(
    private val baseUrl: String = DEFAULT_BASE_URL,
    private val client: OkHttpClient = OkHttpClient.Builder()
        .connectTimeout(12, TimeUnit.SECONDS)
        .readTimeout(20, TimeUnit.SECONDS)
        .callTimeout(25, TimeUnit.SECONDS)
        .build()
) {
    suspend fun loadCatalog(): Result<ExoTvCatalog> = withContext(Dispatchers.IO) {
        runCatching {
            val config = loadConfig()
            require(config.channelsUrl.isNotBlank()) { "EXO config has no channelsURL" }
            val encodedChannels = getText(config.channelsUrl)
            val categories = parseCategories(JSONObjectPayload.decode(encodedChannels))
            ExoTvCatalog(config, categories, System.currentTimeMillis())
        }
    }

    suspend fun loadConfig(): ExoTvAppConfig = withContext(Dispatchers.IO) {
        val root = baseUrl.trimEnd('/')
        val encoded = getText("$root/exel/appConfig.php")
        ExoTvAppConfig.parse(JSONObject(JSONObjectPayload.decode(encoded)))
    }

    private fun getText(url: String): String {
        val request = Request.Builder()
            .url(url)
            .header("User-Agent", DESKTOP_USER_AGENT)
            .header("Accept", "application/json,text/plain,*/*")
            .build()
        return client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) error("EXO server returned HTTP ${response.code}")
            response.body?.string().orEmpty()
        }
    }

    private fun parseCategories(array: JSONArray): List<ExoTvChannelCategory> =
        (0 until array.length()).mapNotNull { categoryIndex ->
            val category = array.optJSONObject(categoryIndex) ?: return@mapNotNull null
            val channelsArray = category.optJSONArray("channels")
            val channels = if (channelsArray == null) emptyList() else {
                (0 until channelsArray.length()).mapNotNull { channelIndex ->
                    val item = channelsArray.optJSONObject(channelIndex) ?: return@mapNotNull null
                    ExoTvChannel(
                        id = item.optString("id"),
                        idO = item.optString("id_o"),
                        name = item.optString("name"),
                        title = item.optString("title"),
                        icon = item.optString("icon"),
                        type = item.optString("type"),
                        catO = item.optString("cat_o"),
                        catRealName = item.optString("cat_real_name"),
                        chRealName = item.optString("ch_real_name"),
                        idGen = item.optString("id_gen"),
                        parent = item.optString("parent"),
                        server = item.optString("server"),
                        isSub = item.optBoolean("isSub"),
                        isBackup = item.optBoolean("isBackup"),
                        backups = parseBackups(item.optJSONArray("backupURLs")),
                        xCatInfo = item.optString("x_cat_info")
                    )
                }
            }
            val id = category.optString("id").ifBlank { category.optString("id_o") }
            ExoTvChannelCategory(
                id = id,
                idO = category.optString("id_o"),
                title = category.optString("title"),
                channels = channels
            )
        }

    private fun parseBackups(array: JSONArray?): List<BackupSource> {
        if (array == null) return emptyList()
        return (0 until array.length()).mapNotNull { index ->
            when (val item = array.opt(index)) {
                is String -> item.takeIf { it.isNotBlank() }?.let { BackupSource(url = it) }
                is JSONObject -> {
                    val url = item.optString("url")
                    if (url.isBlank()) null else BackupSource(
                        url = url,
                        headers = item.optJSONObject("headers").toStringMap(),
                        name = item.optString("name").takeIf { it.isNotBlank() }
                    )
                }
                else -> null
            }
        }
    }

    companion object {
        const val DEFAULT_BASE_URL = "https://smarthomeapi.space"
        private const val DESKTOP_USER_AGENT =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/153.0.0.0 Safari/537.36"
    }
}

private object JSONObjectPayload {
    private const val XOR_KEY = "Fwph96bT8hY8OQyZKUfxHA"

    fun decode(encoded: String): String {
        val normalized = encoded.trim()
            .replace('-', '+')
            .replace('_', '/')
            .filterNot { it.isWhitespace() }
        val padded = normalized + "=".repeat((4 - normalized.length % 4) % 4)
        val bytes = Base64.decode(padded, Base64.DEFAULT)
        val key = XOR_KEY.toByteArray(StandardCharsets.UTF_8)
        val decoded = ByteArray(bytes.size) { index ->
            (bytes[index].toInt() xor key[index % key.size].toInt()).toByte()
        }
        return String(decoded, StandardCharsets.UTF_8)
    }
}

private fun JSONObject?.toStringMap(): Map<String, String> {
    if (this == null) return emptyMap()
    val result = linkedMapOf<String, String>()
    val keys = keys()
    while (keys.hasNext()) {
        val key = keys.next()
        result[key] = optString(key)
    }
    return result
}
