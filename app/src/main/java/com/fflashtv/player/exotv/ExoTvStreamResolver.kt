package com.fflashtv.player.exotv

import android.util.Base64
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONArray
import org.json.JSONObject
import java.nio.charset.StandardCharsets
import java.util.concurrent.TimeUnit
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

data class ExoTvResolvedStream(
    val url: String,
    val headers: Map<String, String> = emptyMap(),
    val name: String = ""
)

class ExoTvStreamResolver(
    private val client: OkHttpClient = OkHttpClient.Builder()
        .connectTimeout(12, TimeUnit.SECONDS)
        .readTimeout(20, TimeUnit.SECONDS)
        .callTimeout(25, TimeUnit.SECONDS)
        .build()
) {
    suspend fun resolve(
        channel: ExoTvChannel,
        config: ExoTvAppConfig
    ): Result<List<ExoTvResolvedStream>> = withContext(Dispatchers.IO) {
        runCatching {
            when (channel.resolverKind) {
                ExoTvResolverKind.BACKUP -> {
                    val first = channel.backups.firstOrNull()
                        ?: error("EXO backup channel has no backup URLs")
                    listOf(ExoTvResolvedStream(first.url, first.headers, first.name.orEmpty()))
                }
                ExoTvResolverKind.YTV -> resolveYtv(channel, config)
                ExoTvResolverKind.O -> resolveO(channel, config)
                ExoTvResolverKind.DEFAULT -> resolveDefault(channel.id ?: error("EXO channel id is missing"), config)
                ExoTvResolverKind.GEN -> error("EXO GEN resolver is not yet connected")
            }.filter { it.url.isNotBlank() }.distinctBy { it.url }
        }
    }

    private fun resolveDefault(id: String, config: ExoTvAppConfig): List<ExoTvResolvedStream> {
        require(config.ytApi.isNotBlank()) { "EXO ytapi is missing from appConfig" }
        val response = getText(config.ytApi + id + "?_=" + System.currentTimeMillis(), config.ytApiHeaders)
        val json = decodeTokenPayload(response.body, response.token)
        return parseResolvedStreams(json)
    }

    private fun resolveYtv(channel: ExoTvChannel, config: ExoTvAppConfig): List<ExoTvResolvedStream> {
        val categoryName = channel.catRealName ?: error("EXO YTV category name is missing")
        val channelName = channel.chRealName ?: error("EXO YTV channel name is missing")
        val base = (config.ytvBase.ifBlank { config.ytApi }).substringBefore("/api").trimEnd('/')
        require(base.isNotBlank()) { "EXO ytvbase/ytapi is missing from appConfig" }
        val headers = config.ytvHeaders.ifEmpty { config.ytApiHeaders }

        val categoriesResponse = getText("$base/api/categories", headers)
        val categories = parseFlexibleArray(JSONObject(decodeTokenPayload(categoriesResponse.body, categoriesResponse.token)))
        val category = categories.firstOrNull { it.optString("name") == categoryName }
            ?: error("EXO YTV category not found: $categoryName")
        val categoryId = category.optString("id")
        require(categoryId.isNotBlank()) { "EXO YTV category has no id" }

        val channelsResponse = getText("$base/api/categories/$categoryId/channels", headers)
        val channels = parseFlexibleArray(JSONObject(decodeTokenPayload(channelsResponse.body, channelsResponse.token)))
        val item = channels.firstOrNull { it.optString("name") == channelName }
            ?: error("EXO YTV channel not found: $channelName")
        val id = item.optString("id")
        require(id.isNotBlank()) { "EXO YTV channel has no id" }
        return resolveDefault(id, config)
    }

    private fun resolveO(channel: ExoTvChannel, config: ExoTvAppConfig): List<ExoTvResolvedStream> {
        require(config.ostApi.isNotBlank()) { "EXO ostapi is missing from appConfig" }
        val category = channel.catO ?: error("EXO O resolver category id is missing")
        val channelId = channel.idO ?: error("EXO O resolver channel id is missing")
        val response = getText(config.ostApi + category + "?page=1", config.ostApiHeaders)
        val decrypted = decryptOResponse(response.body)
        val data = JSONObject(decrypted).optJSONObject("data")
        val items = data?.optJSONArray("items") ?: JSONArray()
        val item = (0 until items.length())
            .mapNotNull { items.optJSONObject(it) }
            .firstOrNull { it.opt("id")?.toString() == channelId }
            ?: error("EXO O resolver did not return channel $channelId")
        val source = item.optString("source")
        val start = source.indexOf("http", ignoreCase = true)
        val url = if (start >= 0) source.substring(start).trim() else source.trim()
        require(url.startsWith("http://") || url.startsWith("https://")) { "EXO O resolver returned an invalid stream URL" }
        val headers = linkedMapOf(
            "Referer" to "https://www2.maziika.shop/",
            "User-Agent" to item.optString("agent")
        ).filterValues { it.isNotBlank() }
        return listOf(ExoTvResolvedStream(url, headers, "EXO O"))
    }

    private data class ApiResponse(val body: String, val token: String)

    private fun getText(url: String, headers: Map<String, String>): ApiResponse {
        val builder = Request.Builder()
            .url(url)
            .header("User-Agent", DEFAULT_USER_AGENT)
            .header("Accept", "application/json,text/plain,*/*")
        headers.forEach { (name, value) ->
            if (name.isNotBlank() && value.isNotBlank()) builder.header(name, value)
        }
        return client.newCall(builder.build()).execute().use { response ->
            if (!response.isSuccessful) error("EXO resolver returned HTTP ${response.code}")
            ApiResponse(response.body?.string().orEmpty(), response.header("t").orEmpty())
        }
    }

    private fun decodeTokenPayload(encoded: String, token: String): String {
        val bytes = decodeBase64(encoded)
        val key = ("c!xZj+N9&G@Ev@vw" + token).toByteArray(StandardCharsets.UTF_8)
        val decoded = ByteArray(bytes.size) { index ->
            (bytes[index].toInt() xor key[index % key.size].toInt()).toByte()
        }
        return String(decoded, StandardCharsets.UTF_8)
    }

    private fun decryptOResponse(encoded: String): String {
        val encrypted = decodeBase64(encoded)
        val key = hexToBytes("4e5c6d1a8b3fe8137a3b9df26a9c4de195267b8e6f6c0b4e1c3ae1d27f2b4e6f")
        val iv = hexToBytes("a9c21f8d7e6b4a9db12e4f9d5c1a7b8e")
        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        cipher.init(Cipher.DECRYPT_MODE, SecretKeySpec(key, "AES"), IvParameterSpec(iv))
        return String(cipher.doFinal(encrypted), StandardCharsets.UTF_8)
    }

    private fun parseResolvedStreams(json: JSONObject): List<ExoTvResolvedStream> {
        val data = json.optJSONArray("data") ?: return emptyList()
        return (0 until data.length()).mapNotNull { index ->
            val item = data.optJSONObject(index) ?: return@mapNotNull null
            val url = item.optString("url").takeIf { it.startsWith("http://") || it.startsWith("https://") }
                ?: return@mapNotNull null
            val headers = linkedMapOf<String, String>().apply {
                putAll(item.optJSONObject("headers").toStringMap())
                item.optString("user_agent").takeIf { it.isNotBlank() }?.let { put("User-Agent", it) }
                item.optString("referer").takeIf { it.isNotBlank() }?.let { put("Referer", it) }
            }
            val userAgentKey = headers.keys.firstOrNull { it.equals("User-Agent", true) }
            if (userAgentKey != null && headers[userAgentKey].orEmpty().startsWith("\u3164 ")) {
                headers[userAgentKey] = ""
            }
            ExoTvResolvedStream(url, headers, item.optString("name"))
        }.take(6)
    }

    private fun parseFlexibleArray(json: JSONObject): List<JSONObject> {
        for (key in listOf("data", "categories", "items", "channels", "list")) {
            json.optJSONArray(key)?.let { array ->
                return (0 until array.length()).mapNotNull { array.optJSONObject(it) }
            }
        }
        val data = json.optJSONObject("data")
        val items = data?.optJSONArray("items") ?: return emptyList()
        return (0 until items.length()).mapNotNull { items.optJSONObject(it) }
    }

    private fun decodeBase64(value: String): ByteArray {
        val normalized = value.trim().replace('-', '+').replace('_', '/').filterNot { it.isWhitespace() }
        val padded = normalized + "=".repeat((4 - normalized.length % 4) % 4)
        return Base64.decode(padded, Base64.DEFAULT)
    }

    private fun hexToBytes(value: String): ByteArray =
        ByteArray(value.length / 2) { index ->
            value.substring(index * 2, index * 2 + 2).toInt(16).toByte()
        }

    companion object {
        private const val DEFAULT_USER_AGENT =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/153.0.0.0 Safari/537.36"
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
