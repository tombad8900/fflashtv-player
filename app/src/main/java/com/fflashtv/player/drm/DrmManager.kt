package com.fflashtv.player.drm

import android.net.Uri
import android.util.Base64
import androidx.annotation.OptIn
import androidx.media3.common.C
import androidx.media3.common.MediaItem
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager
import androidx.media3.exoplayer.drm.DrmSessionManager
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider
import androidx.media3.exoplayer.drm.FrameworkMediaDrm
import androidx.media3.exoplayer.drm.LocalMediaDrmCallback
import com.fflashtv.player.model.DrmConfig
import com.fflashtv.player.model.DrmType
import org.json.JSONArray
import org.json.JSONObject

object ClearKeyProvider {

    fun buildKeySetJson(kidInput: String, keyInput: String): String {
        val normalizedKid = normalizeToBase64Url(kidInput)
        val normalizedKey = normalizeToBase64Url(keyInput)

        val keyObj = JSONObject().apply {
            put("kty", "oct")
            put("k", normalizedKey)
            put("kid", normalizedKid)
        }
        return JSONObject().apply {
            put("keys", JSONArray().put(keyObj))
            put("type", "temporary")
        }.toString()
    }

    private fun normalizeToBase64Url(raw: String): String {
        val cleaned = raw.trim()
        // If hex (32 chars), decode hex to bytes then Base64URL without padding
        if (cleaned.length == 32 && cleaned.all { it in '0'..'9' || it in 'a'..'f' || it in 'A'..'F' }) {
            val bytes = cleaned.chunked(2).map { it.toInt(16).toByte() }.toByteArray()
            return Base64.encodeToString(bytes, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)
        }
        // Otherwise decode Base64 (standard or URL_SAFE) and re-encode as URL_SAFE NO_PADDING
        return try {
            val flags = if (cleaned.contains('-') || cleaned.contains('_')) Base64.URL_SAFE else Base64.DEFAULT
            val decoded = Base64.decode(cleaned, flags)
            Base64.encodeToString(decoded, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)
        } catch (_: Throwable) {
            cleaned
        }
    }

    @OptIn(UnstableApi::class)
    fun createSessionManager(kid: String, key: String): DrmSessionManager {
        val json = buildKeySetJson(kid, key)
        val callback = LocalMediaDrmCallback(json.toByteArray(Charsets.UTF_8))
        return DefaultDrmSessionManager.Builder()
            .setUuidAndExoMediaDrmProvider(C.CLEARKEY_UUID, FrameworkMediaDrm.DEFAULT_PROVIDER)
            .build(callback)
    }
}

object WidevineProvider {

    fun isValidLicenseUrl(url: String): Boolean {
        if (url.isBlank()) return false
        val uri = runCatching { Uri.parse(url.trim()) }.getOrNull() ?: return false
        val scheme = uri.scheme?.lowercase()
        return (scheme == "http" || scheme == "https") && !uri.host.isNullOrBlank()
    }

    fun buildMediaItemDrmConfig(drmConfig: DrmConfig): MediaItem.DrmConfiguration? {
        if (!isValidLicenseUrl(drmConfig.licenseUrl)) return null
        val builder = MediaItem.DrmConfiguration.Builder(C.WIDEVINE_UUID)
            .setLicenseUri(drmConfig.licenseUrl.trim())
        if (drmConfig.licenseHeaders.isNotEmpty()) {
            builder.setLicenseRequestHeaders(drmConfig.licenseHeaders)
        }
        return builder.build()
    }
}

class DrmManager {

    @OptIn(UnstableApi::class)
    fun createDrmSessionManagerProvider(drmConfig: DrmConfig): DrmSessionManagerProvider? {
        if (drmConfig.type == DrmType.CLEARKEY &&
            drmConfig.kid.isNotBlank() &&
            drmConfig.key.isNotBlank()
        ) {
            val manager = ClearKeyProvider.createSessionManager(drmConfig.kid, drmConfig.key)
            return DrmSessionManagerProvider { manager }
        }
        return null
    }

    fun applyWidevineConfig(builder: MediaItem.Builder, drmConfig: DrmConfig) {
        if (drmConfig.type == DrmType.WIDEVINE) {
            WidevineProvider.buildMediaItemDrmConfig(drmConfig)?.let {
                builder.setDrmConfiguration(it)
            }
        }
    }
}
