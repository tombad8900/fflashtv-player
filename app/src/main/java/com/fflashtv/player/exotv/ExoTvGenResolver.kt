package com.fflashtv.player.exotv

import android.content.Context
import android.provider.Settings
import android.util.Base64
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONTokener
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.security.SecureRandom
import java.util.Locale
import java.util.concurrent.TimeUnit
import javax.crypto.Cipher
import javax.crypto.Mac
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

/**
 * EXO's GEN resolver: app_tv_box settings, x-v3 authentication, recursive
 * /get/ lookup, server selection and signed stream URL construction.
 */
class ExoTvGenResolver(
    private val context: Context,
    private val client: OkHttpClient = OkHttpClient.Builder()
        .connectTimeout(12, TimeUnit.SECONDS)
        .readTimeout(20, TimeUnit.SECONDS)
        .callTimeout(25, TimeUnit.SECONDS)
        .build()
) {
    private var cachedSettings: JSONObject? = null
    private var cachedSettingsAtMs: Long = 0L

    suspend fun resolve(
        channel: ExoTvChannel,
        config: ExoTvAppConfig
    ): Result<ExoTvResolvedStream> = withContext(Dispatchers.IO) {
        runCatching {
            val parent = channel.parent ?: error("EXO GEN channel parent is missing")
            val idGen = channel.idGen ?: error("EXO GEN channel id_gen is missing")
            val categoryInfo = channel.xCatInfo?.takeIf { it.isNotBlank() }
                ?: Base64.encodeToString(parent.toByteArray(StandardCharsets.UTF_8), Base64.NO_WRAP)
            val settings = loadSettings(config, categoryInfo)
            val path = if (channel.isSub) {
                "get/?from=channels2&parent=$parent&cat=channels"
            } else {
                "get/?from=channels&cat=categories&parent=$parent"
            }
            val payload = requestJson(path, config, categoryInfo)
            val matched = findServerRecord(payload, idGen, config, categoryInfo, 0)
                ?: error("EXO GEN did not find id_gen=$idGen under parent=$parent")

            val remoteAddressUrl = matched.optString("remote_addr_url")
                .takeIf { it.isNotBlank() }
                ?: config.ipLookupUrl.takeIf { it.isNotBlank() }
                ?: "https://api.ipify.org/"
            val userAgent = config.genApiHeaders["User-Agent"]?.takeIf { it.isNotBlank() } ?: "okhttp/5.4.0"
            val ip = requestText(remoteAddressUrl, mapOf("User-Agent" to userAgent)).trim()
            require(ip.isNotBlank()) { "EXO GEN remote address lookup returned an empty value" }

            val candidates = buildServerCandidates(matched, settings, ip)
            require(candidates.isNotEmpty()) { "EXO GEN returned no usable stream servers" }
            var serverNumber = channel.server?.toIntOrNull() ?: 0
            if (serverNumber == 0) serverNumber = 1
            val selectedIndex = if (serverNumber < 1 || serverNumber > candidates.size) {
                candidates.lastIndex
            } else {
                candidates.size - serverNumber
            }
            candidates[selectedIndex]
        }
    }

    private fun loadSettings(config: ExoTvAppConfig, categoryInfo: String): JSONObject {
        val now = System.currentTimeMillis()
        cachedSettings?.let { cached ->
            if (now - cachedSettingsAtMs < 6 * 60 * 60 * 1000L) return cached
        }

        val response = requestJson("settings/app_tv_box.php?v=", config, null)
        val source = when (response) {
            is JSONObject -> response
            is JSONArray -> response.optJSONObject(0) ?: JSONObject()
            else -> JSONObject()
        }
        val decoded = JSONObject()
        val keys = source.keys()
        while (keys.hasNext()) {
            val key = keys.next()
            val value = source.opt(key)
            if (value is String) {
                val unwrapped = value.removeSurrounding("\"", "\"")
                val decrypted = decryptSetting(unwrapped)
                decoded.put(key, decrypted ?: unwrapped)
            } else {
                decoded.put(key, value ?: JSONObject.NULL)
            }
        }

        val hosts = decoded.optString("stream_hosts")
            .split('|')
            .filter { it.isNotBlank() }
        decoded.put("stream_hosts", JSONArray(hosts))
        cachedSettings = decoded
        cachedSettingsAtMs = now
        return decoded
    }

    private fun requestJson(path: String, config: ExoTvAppConfig, categoryInfo: String?): Any {
        val url = if (path.startsWith("http://", true) || path.startsWith("https://", true)) {
            path
        } else {
            val base = config.genApi.ifBlank { DEFAULT_GEN_API }.trimEnd('/')
            base + "/" + path.trimStart('/')
        }
        val headers = authHeaders(config, categoryInfo)
        val request = Request.Builder().url(url).apply {
            headers.forEach { (name, value) -> header(name, value) }
        }.build()
        val body = client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) error("EXO GEN API returned HTTP ${response.code}")
            response.body?.string().orEmpty()
        }
        val parsed = runCatching { JSONTokener(body).nextValue() }.getOrNull() ?: return body
        if (parsed is JSONObject) {
            val data = parsed.opt("data")
            if (data is String) {
                val decrypted = decryptSetting(data)
                if (!decrypted.isNullOrBlank()) {
                    return runCatching { JSONTokener(decrypted).nextValue() }.getOrElse { parsed }
                }
            }
        }
        return parsed
    }

    private fun authHeaders(config: ExoTvAppConfig, categoryInfo: String?): Map<String, String> {
        val androidId = runCatching {
            Settings.Secure.getString(context.contentResolver, "android_id")
        }.getOrNull()?.takeIf { it.matches(Regex("[A-Fa-f0-9]{16,}")) } ?: FALLBACK_APP_ID

        val timeBucket = (System.currentTimeMillis() / 1000L) / 300L
        val data = "GENRAL TV|com.genraltvpro.app|2.19|29CA406BCB43A33B2FECBD228BDDC7A1E11E772D|$timeBucket"
        val mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(androidId.toByteArray(StandardCharsets.UTF_8), "HmacSHA256"))
        val signature = mac.doFinal(data.toByteArray(StandardCharsets.UTF_8)).toHex()
        val ua = config.genApiHeaders["User-Agent"]?.takeIf { it.isNotBlank() } ?: "okhttp/5.4.0"
        return buildMap {
            put("User-Agent", ua)
            put("x-v3-token", signature)
            put("x-app-id", androidId)
            if (!categoryInfo.isNullOrBlank()) put("x-cat-info", categoryInfo)
        }
    }

    private fun findServerRecord(
        value: Any?,
        idGen: String,
        config: ExoTvAppConfig,
        categoryInfo: String,
        depth: Int
    ): JSONObject? {
        if (depth > 3) return null
        val array = when (value) {
            is JSONArray -> value
            is JSONObject -> JSONArray().put(value)
            else -> return null
        }
        for (index in 0 until array.length()) {
            val item = array.optJSONObject(index) ?: continue
            if (item.has("servers")) {
                if (item.opt("id")?.toString() == idGen) return item
                continue
            }
            val url = item.optString("url")
            if (url.startsWith("/get/") && depth < 3) {
                val nested = requestJson(url.removePrefix("/"), config, categoryInfo)
                val found = findServerRecord(nested, idGen, config, categoryInfo, depth + 1)
                if (found != null) return found
            }
        }
        return null
    }

    private fun buildServerCandidates(
        matched: JSONObject,
        settings: JSONObject,
        ip: String
    ): List<ExoTvResolvedStream> {
        val rawServers = when (val raw = matched.opt("servers")) {
            is JSONArray -> raw
            is String -> runCatching { JSONArray(raw) }.getOrElse { JSONArray() }
            else -> JSONArray()
        }
        val result = mutableListOf<ExoTvResolvedStream>()
        for (index in 0 until rawServers.length()) {
            val server = rawServers.optJSONObject(index) ?: continue
            val source = server.optString("url")
            if (source.isBlank()) continue
            val headers = asJsonObject(server.opt("headers"))
            val generated = when {
                source.startsWith("stream=") -> resolveStreamTemplate(source.removePrefix("stream="), headers, settings, ip)
                source.startsWith("id=") -> resolveIdTemplate(source.removePrefix("id="), headers, settings, ip)
                source.startsWith("http", true) -> resolveDirectTemplate(source, headers, ip)
                else -> source
            }
            if (generated.isBlank()) continue
            result += ExoTvResolvedStream(
                url = generated,
                headers = buildStreamHeaders(server, headers),
                name = server.optString("name").takeIf { it.isNotBlank() } ?: "GEN ${index + 1}"
            )
        }
        return result.distinctBy { it.url }
    }

    private fun resolveStreamTemplate(path: String, headers: JSONObject, settings: JSONObject, ip: String): String {
        if (headers.optString("use-multi-hosts") == "true") {
            val hosts = settings.optJSONArray("stream_hosts") ?: JSONArray()
            if (hosts.length() > 0) {
                val host = hosts.optString(SecureRandom().nextInt(hosts.length())).trimEnd('/')
                val key = settings.optString("stream_key").ifBlank { "your_secret_key" }
                return "$host$path?token=${md5("$ip:$key")}&ip=$ip"
            }
        }
        val remoteBase = settings.optString("remote_url_2")
        val key = settings.optString("remote_key_2").ifBlank { settings.optString("stream_key") }
        if (remoteBase.isBlank() || key.isBlank()) return path
        return remoteBase.trimEnd('/') + path + "?token=" + md5("$ip:$key")
    }

    private fun resolveIdTemplate(id: String, headers: JSONObject, settings: JSONObject, ip: String): String {
        val remoteBase = settings.optString("remote_url")
        val key = settings.optString("stream_key").ifBlank { "your_secret_key" }
        if (remoteBase.isBlank()) return id
        val issued = System.currentTimeMillis() / 1000L - 1062L
        val expires = issued + 10800L
        val nonce = ByteArray(8).also { SecureRandom().nextBytes(it) }.toHex()
        val token = sha1("$id$ip$issued$expires$key$nonce")
        return remoteBase.trimEnd('/') + "/$id/index.m3u8?token=$token-$nonce-$expires-$issued&remote=$ip"
    }

    private fun resolveDirectTemplate(url: String, headers: JSONObject, ip: String): String {
        val id = headers.optString("id")
        val key = headers.optString("key")
        if (id.isBlank() || key.isBlank()) return url
        val issued = System.currentTimeMillis() / 1000L - 1062L
        val expires = issued + 10800L
        val nonce = ByteArray(8).also { SecureRandom().nextBytes(it) }.toHex()
        val base = url.substringBeforeLast('/')
        val token = sha1("$id$ip$issued$expires$key$nonce")
        return "$base/$id/index.m3u8?token=$token-$nonce-$expires-$issued&remote=$ip"
    }

    private fun buildStreamHeaders(server: JSONObject, rawHeaders: JSONObject): Map<String, String> {
        val result = linkedMapOf<String, String>()
        val keys = rawHeaders.keys()
        while (keys.hasNext()) {
            val key = keys.next()
            if (key.lowercase(Locale.ROOT) !in setOf("use-multi-hosts", "id", "key")) {
                rawHeaders.optString(key).takeIf { it.isNotBlank() }?.let { result[key] = it }
            }
        }
        server.optString("Referer").takeIf { it.isNotBlank() }?.let { result["Referer"] = it }
        server.optString("userAgent").takeIf { it.isNotBlank() }?.let { result["User-Agent"] = it }
        val other = server.optString("otherHeaders")
        if (other.isNotBlank()) {
            val parsed = runCatching { JSONObject(other) }.getOrNull()
            parsed?.let {
                val iter = it.keys()
                while (iter.hasNext()) {
                    val key = iter.next()
                    it.optString(key).takeIf { value -> value.isNotBlank() }?.let { value -> result[key] = value }
                }
            }
        }
        if (result["User-Agent"].isNullOrBlank()) {
            result["User-Agent"] = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36"
        }
        return result
    }

    private fun decryptSetting(encoded: String): String? = runCatching {
        val bytes = decodeBase64(encoded)
        require(bytes.size > 16)
        val iv = bytes.copyOfRange(0, 16)
        val ciphertext = bytes.copyOfRange(16, bytes.size)
        val key = MessageDigest.getInstance("SHA-256")
            .digest("yNPSFW@;Au,!ir%2".toByteArray(StandardCharsets.UTF_8))
        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        cipher.init(Cipher.DECRYPT_MODE, SecretKeySpec(key, "AES"), IvParameterSpec(iv))
        String(cipher.doFinal(ciphertext), StandardCharsets.UTF_8)
    }.getOrNull()

    private fun requestText(url: String, headers: Map<String, String>): String {
        val request = Request.Builder().url(url).apply {
            headers.forEach { (name, value) -> header(name, value) }
        }.build()
        return client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) error("EXO GEN IP lookup returned HTTP ${response.code}")
            response.body?.string().orEmpty()
        }
    }

    private fun asJsonObject(value: Any?): JSONObject = when (value) {
        is JSONObject -> value
        is String -> runCatching { JSONObject(value) }.getOrElse { JSONObject() }
        else -> JSONObject()
    }

    private fun decodeBase64(value: String): ByteArray {
        val normalized = value.trim().replace('-', '+').replace('_', '/').filterNot { it.isWhitespace() }
        val padded = normalized + "=".repeat((4 - normalized.length % 4) % 4)
        return Base64.decode(padded, Base64.DEFAULT)
    }

    private fun md5(value: String): String =
        MessageDigest.getInstance("MD5").digest(value.toByteArray(StandardCharsets.UTF_8)).toHex()

    private fun sha1(value: String): String =
        MessageDigest.getInstance("SHA-1").digest(value.toByteArray(StandardCharsets.UTF_8)).toHex()

    private fun ByteArray.toHex(): String {
        val alphabet = "0123456789abcdef"
        val out = StringBuilder(size * 2)
        for (byte in this) {
            val value = byte.toInt() and 0xff
            out.append(alphabet[value ushr 4])
            out.append(alphabet[value and 0x0f])
        }
        return out.toString()
    }

    companion object {
        private const val DEFAULT_GEN_API = "https://nonz.vevi-cobty-14-b.club/genral/api/v3"
        private const val FALLBACK_APP_ID = "43a5eaa56716eb6f"
    }
}
