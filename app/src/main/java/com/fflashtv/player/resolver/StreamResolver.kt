package com.fflashtv.player.resolver

import android.net.Uri
import com.fflashtv.player.model.ContentType
import com.fflashtv.player.model.ParsedPlayback
import com.fflashtv.player.model.PlaybackInput
import com.fflashtv.player.network.NetworkClient
import com.fflashtv.player.network.NetworkDefaults
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.Request

object MimeTypes {
    const val HLS = "application/x-mpegURL"
    const val MPEG_TS = "video/mp2t"
    const val MP4 = "video/mp4"
    const val MKV = "video/x-matroska"
    const val WEBM = "video/webm"
    const val MP3 = "audio/mpeg"
    const val AAC = "audio/mp4a-latm"
    const val M4A = "audio/mp4"
    const val OGG = "audio/ogg"
    const val WAV = "audio/wav"
    const val DASH = "application/dash+xml"
}

data class ProbeResult(
    val detectedMime: String?,
    val contentTypeHeader: String?,
    val firstBytesHex: String = ""
)

class StreamProbe(private val networkClient: NetworkClient) {

    suspend fun probe(
        url: String,
        headers: Map<String, String>,
        userAgent: String,
        allowInsecureTls: Boolean
    ): ProbeResult = withContext(Dispatchers.IO) {
        if (!url.startsWith("http://", ignoreCase = true) &&
            !url.startsWith("https://", ignoreCase = true)
        ) {
            return@withContext ProbeResult(detectedMime = null, contentTypeHeader = null)
        }

        val reqBuilder = Request.Builder()
            .url(url)
            .get()
            .header("Range", "bytes=0-1024")
            .header("User-Agent", userAgent.ifBlank { NetworkDefaults.DEFAULT_USER_AGENT })

        for ((k, v) in headers) {
            val lower = k.trim().lowercase()
            if (lower !in setOf("host", "connection", "content-length", "range", "accept-encoding")) {
                reqBuilder.header(k.trim(), v)
            }
        }

        try {
            val client = networkClient.clientFor(allowInsecureTls)
            client.newCall(reqBuilder.build()).execute().use { response ->
                val ct = response.header("Content-Type")?.lowercase()
                val body = response.body
                val bytes = ByteArray(16)
                var readCount = 0
                if (body != null) {
                    body.byteStream().use { stream ->
                        while (readCount < 16) {
                            val n = stream.read(bytes, readCount, 16 - readCount)
                            if (n <= 0) break
                            readCount += n
                        }
                    }
                }
                val prefixBytes = bytes.copyOf(readCount)
                val prefixText = String(prefixBytes, Charsets.UTF_8).trimStart()
                val hex = prefixBytes.joinToString(" ") { "%02X".format(it) }

                val mime = detectFromProbe(url, ct, prefixBytes, prefixText)
                ProbeResult(detectedMime = mime, contentTypeHeader = ct, firstBytesHex = hex)
            }
        } catch (_: Throwable) {
            ProbeResult(detectedMime = null, contentTypeHeader = null)
        }
    }

    private fun detectFromProbe(
        url: String,
        contentType: String?,
        bytes: ByteArray,
        prefixText: String
    ): String? {
        val cleanUrl = url.substringBefore('?').lowercase()

        // 1. HLS rules
        if (contentType?.contains("mpegurl") == true ||
            prefixText.startsWith("#EXTM3U") ||
            cleanUrl.endsWith(".m3u8")
        ) {
            return MimeTypes.HLS
        }

        // 2. MPEG-TS rules
        if (contentType?.contains("mp2t") == true ||
            (bytes.isNotEmpty() && bytes[0] == 0x47.toByte()) ||
            cleanUrl.endsWith(".ts")
        ) {
            return MimeTypes.MPEG_TS
        }

        // 3. DASH
        if (contentType?.contains("dash+xml") == true ||
            prefixText.contains("<MPD", ignoreCase = true) ||
            cleanUrl.endsWith(".mpd")
        ) {
            return MimeTypes.DASH
        }

        // 4. Other containers & audio
        return when {
            contentType?.contains("video/mp4") == true -> MimeTypes.MP4
            contentType?.contains("matroska") == true -> MimeTypes.MKV
            contentType?.contains("webm") == true -> MimeTypes.WEBM
            contentType?.contains("audio/mpeg") == true -> MimeTypes.MP3
            contentType?.contains("audio/aac") == true -> MimeTypes.AAC
            contentType?.contains("audio/mp4") == true -> MimeTypes.M4A
            contentType?.contains("audio/ogg") == true || contentType?.contains("application/ogg") == true -> MimeTypes.OGG
            contentType?.contains("audio/wav") == true || contentType?.contains("audio/x-wav") == true -> MimeTypes.WAV
            else -> null
        }
    }
}

object MimeResolver {

    fun resolve(
        url: String,
        probeMime: String?,
        mimeHint: String?,
        explicitExtension: String?
    ): String {
        // Priority 1: Reliable StreamProbe MIME
        if (!probeMime.isNullOrBlank()) return probeMime

        // Priority 2: Explicit MIME provided with source
        if (!mimeHint.isNullOrBlank()) return normalizeMime(mimeHint)

        // Priority 3: Query parameters (extension, type)
        val uri = runCatching { Uri.parse(url) }.getOrNull()
        val queryExt = uri?.getQueryParameter("extension") ?: uri?.getQueryParameter("type")
        if (!queryExt.isNullOrBlank()) {
            mimeFromExtension(queryExt)?.let { return it }
        }

        // Priority 4: Explicit extension or URL path extension
        if (!explicitExtension.isNullOrBlank()) {
            mimeFromExtension(explicitExtension)?.let { return it }
        }
        val path = uri?.path ?: url.substringBefore('?')
        val ext = path.substringAfterLast('.', "")
        if (ext.isNotBlank() && ext.length <= 6) {
            mimeFromExtension(ext)?.let { return it }
        }

        // Priority 5: Default fallback HLS
        return MimeTypes.HLS
    }

    fun mimeFromExtension(ext: String): String? {
        return when (ext.trim().lowercase().removePrefix(".")) {
            "m3u8", "m3u" -> MimeTypes.HLS
            "ts" -> MimeTypes.MPEG_TS
            "mp4", "m4v" -> MimeTypes.MP4
            "mkv" -> MimeTypes.MKV
            "webm" -> MimeTypes.WEBM
            "mp3" -> MimeTypes.MP3
            "aac" -> MimeTypes.AAC
            "m4a" -> MimeTypes.M4A
            "ogg", "oga" -> MimeTypes.OGG
            "wav" -> MimeTypes.WAV
            "mpd" -> MimeTypes.DASH
            else -> null
        }
    }

    private fun normalizeMime(hint: String): String {
        val h = hint.trim().lowercase()
        return when {
            h == "hls" || h.contains("mpegurl") -> MimeTypes.HLS
            h == "ts" || h.contains("mp2t") -> MimeTypes.MPEG_TS
            h == "dash" || h.contains("dash+xml") -> MimeTypes.DASH
            else -> hint.trim()
        }
    }
}

object PlaybackInputParser {

    fun parse(input: PlaybackInput, resolvedMime: String? = null): ParsedPlayback {
        val ua = input.headers.entries
            .firstOrNull { it.key.equals("User-Agent", ignoreCase = true) }
            ?.value
            ?.takeIf { it.isNotBlank() }
            ?: NetworkDefaults.DEFAULT_USER_AGENT

        val lowerUrl = input.url.lowercase()
        val isLive = input.contentType == ContentType.LIVE ||
            lowerUrl.contains("/live/") ||
            lowerUrl.contains("live.php") ||
            lowerUrl.contains("/play/") ||
            (input.contentType == ContentType.AUDIO && resolvedMime == MimeTypes.HLS)

        val id = input.id.ifBlank { input.url.hashCode().toString() }

        return ParsedPlayback(
            id = id,
            originalInput = input,
            url = input.url.trim(),
            title = input.title.ifBlank { "Untitled Stream" },
            contentType = input.contentType,
            isLive = isLive,
            resolvedMimeType = resolvedMime ?: input.mimeHint,
            headers = input.headers,
            userAgent = ua,
            drmConfig = input.drmConfig,
            resumePositionMs = if (isLive) 0L else input.resumePositionMs.coerceAtLeast(0L),
            playWhenReady = input.playWhenReady,
            qualities = input.qualities,
            backupSources = input.backupSources,
            posterUrl = input.posterUrl,
            allowInsecureTls = input.allowInsecureTls,
            subtitles = input.subtitles
        )
    }
}
