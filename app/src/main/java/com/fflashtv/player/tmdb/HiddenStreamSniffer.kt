package com.fflashtv.player.tmdb

import android.annotation.SuppressLint
import android.app.Activity
import android.net.Uri
import android.util.Base64
import android.view.View
import android.view.ViewGroup
import android.webkit.ConsoleMessage
import android.webkit.CookieManager
import android.webkit.JavascriptInterface
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import java.io.ByteArrayInputStream
import java.net.URLDecoder
import java.util.concurrent.CopyOnWriteArrayList
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import kotlin.coroutines.resume

object HiddenStreamSniffer {

    private const val BROWSER_UA =
        "Mozilla/5.0 (Linux; Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36"

    private val ARABIC_SUB_REGEX = Regex("""[._/\-=](ar|ara|arabic)[._/\-=]""", RegexOption.IGNORE_CASE)

    private val adKeywords = listOf(
        "doubleclick", "googlesyndication", "adsterra", "popads", "propellerads",
        "exoclick", "juicyads", "taboola", "outbrain", "mgid", "clickadu",
        "hilltopads", "adcash", "bet365", "1xbet", "yandex.ru/ads",
        "ads.", "/ads/", "adservice", "popcash", "popunder", "onclickads",
        "trafficjunky", "tsyndicate", "acscdn", "whos.amung.us", "mc.yandex",
        "histats", "google-analytics", "googletagmanager", "cloudflareinsights"
    )

    private fun isAdUrl(url: String): Boolean {
        val lower = url.lowercase()
        return adKeywords.any { lower.contains(it) }
    }

    private fun unwrapWrappedUrl(raw: String): String? {
        val uri = runCatching { Uri.parse(raw) }.getOrNull() ?: return null
        if (!uri.isHierarchical) return null
        val accepted = setOf("url", "file", "src", "source", "link", "stream", "video", "media", "data")
        fun valid(value: String): Boolean {
            val parsed = runCatching { Uri.parse(value) }.getOrNull() ?: return false
            return (parsed.scheme.equals("http", true) || parsed.scheme.equals("https", true)) &&
                !parsed.host.isNullOrBlank()
        }
        for (key in uri.queryParameterNames) {
            if (key.lowercase() !in accepted) continue
            val candidate = uri.getQueryParameter(key)?.trim().orEmpty()
            if (candidate.isBlank()) continue
            if (valid(candidate)) return candidate
            val decoded = runCatching { URLDecoder.decode(candidate.replace("+", "%2B"), "UTF-8") }.getOrDefault(candidate)
            if (decoded != candidate && valid(decoded)) return decoded
            val compact = candidate.replace('-', '+').replace('_', '/')
            val padded = compact + "=".repeat((4 - compact.length % 4) % 4)
            val base64 = runCatching { String(Base64.decode(padded, Base64.DEFAULT), Charsets.UTF_8).trim() }.getOrNull()
            if (!base64.isNullOrBlank() && valid(base64)) return base64
        }
        return null
    }

    private data class ClassifiedResource(
        val url: String,
        val kind: String,
        val playable: Boolean
    )

    private fun classifyResource(url: String): ClassifiedResource? {
        val unwrapped = unwrapWrappedUrl(url)
        if (!unwrapped.isNullOrBlank() && unwrapped != url) {
            classifyResource(unwrapped)?.let { return it }
        }
        val uri = runCatching { Uri.parse(url) }.getOrNull() ?: return null
        if (uri.scheme != "http" && uri.scheme != "https") return null
        val path = uri.path.orEmpty().lowercase()
        val query = uri.encodedQuery.orEmpty().lowercase()
        val full = url.lowercase()

        val subtitleHint = listOf(".srt", ".vtt", ".ass", ".ssa", ".ttml", ".dfxp", "subtitle", "subtitles", "captions", "texttrack")
            .any { it in path || it in query || it in full }
        if (subtitleHint) {
            val isAr = ARABIC_SUB_REGEX.containsMatchIn("$path?$query") || full.contains("عربي")
            return ClassifiedResource(url, if (isAr) "SUB_AR" else "SUB", false)
        }

        val isSegment = path.endsWith(".ts") || query.contains(".ts") || path.endsWith(".m4s") || query.contains(".m4s")
        if (isSegment) return null

        val videoExts = listOf(".m3u8", ".mpd", ".mp4", ".mkv", ".webm")
        val hasExt = videoExts.any { path.endsWith(it) || query.contains(it) }
        val videoKws = listOf("master.m3u8", "index.m3u8", "playlist.m3u8", "manifest", "hls", "dash", "stream", "video", "embed", "player")
        val hasKw = videoKws.any { it in path || it in query || it in full }
        val isMedia = hasExt || (hasKw && (full.contains(".m3u8") || full.contains(".mpd") || full.contains(".mp4")))

        if (isMedia) {
            val kind = when {
                full.contains(".m3u8") || full.contains("hls") -> "HLS"
                full.contains(".mpd") || full.contains("dash") -> "DASH"
                full.contains(".mp4") -> "MP4"
                else -> "VIDEO"
            }
            return ClassifiedResource(url, kind, true)
        }
        return null
    }

    @SuppressLint("SetJavaScriptEnabled")
    suspend fun sniff(
        activity: Activity,
        embedUrl: String,
        headers: Map<String, String> = emptyMap(),
        timeoutMs: Long = 22_000L
    ): Result<SniffedStream> = withContext(Dispatchers.Main) {
        val visitedHosts = CopyOnWriteArrayList<String>()
        val pageLoaded = AtomicBoolean(false)
        val videoTagsFound = AtomicInteger(0)
        val jsErrorCount = AtomicInteger(0)

        val result = withTimeoutOrNull(timeoutMs) {
            suspendCancellableCoroutine<SniffedStream?> { cont ->
                val done = AtomicBoolean(false)
                val subs = CopyOnWriteArrayList<String>()
                var webView: WebView? = null
                var pulseJob: Job? = null
                val root = activity.window.decorView as? ViewGroup

                fun cleanup() {
                    pulseJob?.cancel()
                    runCatching {
                        webView?.stopLoading()
                        webView?.let { root?.removeView(it) }
                        webView?.destroy()
                        webView = null
                    }
                }

                fun completeWith(url: String, kind: String, hdrs: Map<String, String>) {
                    if (done.compareAndSet(false, true)) {
                        val ref = hdrs.entries.firstOrNull { it.key.equals("Referer", true) }?.value ?: embedUrl
                        val ua = hdrs.entries.firstOrNull { it.key.equals("User-Agent", true) }?.value ?: BROWSER_UA
                        val ck = hdrs.entries.firstOrNull { it.key.equals("Cookie", true) }?.value ?: ""
                        val found = SniffedStream(
                            streamUrl = url,
                            streamType = kind,
                            referer = ref,
                            userAgent = ua,
                            cookies = ck,
                            subtitles = subs.toList()
                        )
                        activity.runOnUiThread {
                            cleanup()
                            if (cont.isActive) cont.resume(found)
                        }
                    }
                }

                try {
                    val wv = WebView(activity).apply {
                        visibility = View.VISIBLE
                        alpha = 0f
                        setLayerType(View.LAYER_TYPE_HARDWARE, null)
                        settings.javaScriptEnabled = true
                        settings.domStorageEnabled = true
                        settings.mediaPlaybackRequiresUserGesture = false
                        settings.setSupportMultipleWindows(true)
                        settings.javaScriptCanOpenWindowsAutomatically = false
                        settings.useWideViewPort = true
                        settings.loadWithOverviewMode = true
                        settings.mixedContentMode = WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE
                        settings.userAgentString = headers.entries.firstOrNull { it.key.equals("User-Agent", true) }?.value ?: BROWSER_UA
                    }
                    CookieManager.getInstance().setAcceptCookie(true)
                    CookieManager.getInstance().setAcceptThirdPartyCookies(wv, true)
                    val ua = wv.settings.userAgentString ?: BROWSER_UA

                    wv.addJavascriptInterface(object {
                        @JavascriptInterface
                        fun subtitle(url: String) {
                            if (url.startsWith("http") && !subs.contains(url)) subs.add(url)
                        }

                        @JavascriptInterface
                        fun onVideoFound(url: String) {
                            if (url.startsWith("http") && !isAdUrl(url)) {
                                classifyResource(url)?.takeIf { it.playable }?.let {
                                    completeWith(it.url, it.kind, mapOf("Referer" to embedUrl, "User-Agent" to ua))
                                }
                            }
                        }

                        @JavascriptInterface
                        fun onVideoTagCount(c: Int) {
                            videoTagsFound.set(c)
                        }
                    }, "CinemaCapture")

                    wv.webChromeClient = object : WebChromeClient() {
                        override fun onConsoleMessage(cm: ConsoleMessage?): Boolean {
                            if (cm?.messageLevel() == ConsoleMessage.MessageLevel.ERROR) jsErrorCount.incrementAndGet()
                            return true
                        }
                    }

                    wv.webViewClient = object : WebViewClient() {
                        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                            val reqUrl = request?.url?.toString() ?: return true
                            if (isAdUrl(reqUrl)) return true
                            return false
                        }

                        override fun onPageFinished(view: WebView?, url: String?) {
                            super.onPageFinished(view, url)
                            pageLoaded.set(true)
                        }

                        override fun shouldInterceptRequest(view: WebView?, request: WebResourceRequest?): WebResourceResponse? {
                            val reqUrl = request?.url?.toString() ?: return null
                            if (isAdUrl(reqUrl)) {
                                return WebResourceResponse("text/plain", "UTF-8", 204, "No Content", emptyMap(), ByteArrayInputStream(ByteArray(0)))
                            }
                            runCatching { Uri.parse(reqUrl).host }.getOrNull()?.let { h ->
                                if (visitedHosts.size < 10 && h !in visitedHosts) visitedHosts.add(h)
                            }
                            classifyResource(reqUrl)?.let { item ->
                                if (!item.playable) {
                                    if (!subs.contains(item.url)) subs.add(item.url)
                                } else {
                                    val allowed = setOf("user-agent", "referer", "origin", "cookie", "authorization")
                                    val hdrs = (request.requestHeaders ?: emptyMap())
                                        .filterKeys { it.lowercase() in allowed }
                                        .toMutableMap()
                                    if (hdrs.keys.none { it.equals("Cookie", true) }) {
                                        val ck = runCatching { CookieManager.getInstance().getCookie(item.url) }.getOrNull()
                                        if (!ck.isNullOrBlank()) hdrs["Cookie"] = ck
                                    }
                                    if (hdrs.keys.none { it.equals("User-Agent", true) }) hdrs["User-Agent"] = ua
                                    if (hdrs.keys.none { it.equals("Referer", true) }) hdrs["Referer"] = embedUrl
                                    completeWith(item.url, item.kind, hdrs)
                                }
                            }
                            return null
                        }
                    }

                    webView = wv
                    root?.addView(wv, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
                    if (headers.isNotEmpty()) wv.loadUrl(embedUrl, headers) else wv.loadUrl(embedUrl)

                    pulseJob = CoroutineScope(Dispatchers.Main).launch {
                        while (isActive && !done.get()) {
                            delay(1_400L)
                            wv.evaluateJavascript(
                                """
                                (function(){
                                  try {
                                    window.open = function(){ return null; };
                                    var vids = document.querySelectorAll('video');
                                    CinemaCapture.onVideoTagCount(vids.length);
                                    vids.forEach(function(v){
                                      var s = v.currentSrc || v.src;
                                      if (s) CinemaCapture.onVideoFound(s);
                                      v.querySelectorAll('source').forEach(function(x){
                                        if (x.src) CinemaCapture.onVideoFound(x.src);
                                      });
                                    });
                                    document.querySelectorAll('video track, track').forEach(function(t){
                                      if (t.src) CinemaCapture.subtitle(t.src);
                                    });
                                    var btn = document.querySelector('video, .play-btn, .jw-icon-display, .vjs-big-play-button, #play, [aria-label*="Play"], button');
                                    if (btn) btn.click();
                                  } catch(e) {}
                                })();
                                """.trimIndent(),
                                null
                            )
                        }
                    }

                    cont.invokeOnCancellation { activity.runOnUiThread { cleanup() } }
                } catch (_: Throwable) {
                    cleanup()
                    if (cont.isActive) cont.resume(null)
                }
            }
        }

        if (result != null) {
            Result.success(result)
        } else {
            val report = buildString {
                append("انتهت المهلة دون التقاط بث صالح.\n")
                append("• تحميل الصفحة: ${if (pageLoaded.get()) "نعم" else "لا"}\n")
                append("• عناصر Video: ${videoTagsFound.get()} | أخطاء JS: ${jsErrorCount.get()}\n")
                if (visitedHosts.isNotEmpty()) append("• النطاقات: ${visitedHosts.joinToString(", ")}")
            }
            Result.failure(IllegalStateException(report))
        }
    }
}
