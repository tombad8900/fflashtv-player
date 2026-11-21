package org.mlm.adblock

import android.net.Uri
import java.util.Locale

object RequestTypeMapper {
    fun from(url: Uri, accept: String?, isMainFrame: Boolean): String {
        if (isMainFrame) return "document"

        val value = (accept ?: "").lowercase(Locale.ROOT)
        val path = (url.lastPathSegment ?: "").lowercase(Locale.ROOT)

        if (value.contains("text/html") || value.contains("application/xhtml")) return "subdocument"
        if (value.contains("javascript") || path.endsWith(".js") || path.endsWith(".mjs")) return "script"
        if (value.contains("text/css") || path.endsWith(".css")) return "stylesheet"
        if (value.contains("image/") || listOf(".png", ".jpg", ".jpeg", ".gif", ".webp", ".svg", ".ico").any { path.endsWith(it) }) return "image"
        if (value.contains("font/") || listOf(".woff", ".woff2", ".ttf", ".otf").any { path.endsWith(it) }) return "font"
        if (value.contains("video/") || value.contains("audio/") ||
            listOf(".m3u8", ".mpd", ".mp4", ".webm", ".mp3", ".m4a").any { path.endsWith(it) }) return "media"
        if (value.contains("application/json") || value.contains("application/xml") || value.contains("*/*")) return "xmlhttprequest"
        return "other"
    }
}
