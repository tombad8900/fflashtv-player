package com.fflashtv.player.tmdb

import android.annotation.SuppressLint
import android.app.Activity
import android.net.Uri
import android.util.Base64
import android.view.View
import android.view.ViewGroup
import android.view.MotionEvent
import android.view.Gravity
import android.graphics.Color
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
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
import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.atomic.AtomicReference
import kotlin.coroutines.resume
import com.fflashtv.player.adblock.BraveAdBlockEngine

object HiddenStreamSniffer {

    private const val BROWSER_UA =
        "Mozilla/5.0 (Linux; Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36"

    private val ARABIC_SUB_REGEX = Regex("""[._/\-=](ar|ara|arabic)[._/\-=]""", RegexOption.IGNORE_CASE)

    private fun isProtectedPlaybackRequest(url: String, accept: String?): Boolean {
        if (classifyResource(url) != null) return true
        val uri = runCatching { Uri.parse(url) }.getOrNull() ?: return false
        val path = uri.encodedPath.orEmpty().lowercase()
        val query = uri.encodedQuery.orEmpty().lowercase()
        val value = (accept ?: "").lowercase()
        val mediaAndSubtitleExtensions = listOf(
            ".m3u8", ".mpd", ".mp4", ".m4v", ".mkv", ".webm", ".mov", ".flv", ".avi",
            ".ts", ".m4s", ".aac", ".mp3", ".m4a", ".ac3", ".ec3",
            ".vtt", ".srt", ".ass", ".ssa", ".ttml", ".dfxp", ".sub", ".idx"
        )
        return value.contains("video/") || value.contains("audio/") ||
            value.contains("text/vtt") || mediaAndSubtitleExtensions.any {
                path.endsWith(it) || query.contains(it)
            }
    }

    private fun isAdUrl(url: String): Boolean {
        val uri = runCatching { Uri.parse(url) }.getOrNull() ?: return false
        val host = uri.host?.lowercase().orEmpty()
        val path = uri.encodedPath?.lowercase().orEmpty()
        val query = uri.encodedQuery?.lowercase().orEmpty()
        val adHosts = listOf(
            "doubleclick.net", "googlesyndication.com", "googleadservices.com",
            "adsterra.com", "popads.net", "propellerads.com", "exoclick.com",
            "juicyads.com", "taboola.com", "outbrain.com", "mgid.com",
            "clickadu.com", "hilltopads.net", "adcash.com", "popcash.net",
            "trafficjunky.net", "histats.com", "google-analytics.com",
            "googletagmanager.com", "cloudflareinsights.com", "whos.amung.us"
        )
        if (adHosts.any { host == it || host.endsWith(".$it") }) return true
        if (host.startsWith("ads.") || host.startsWith("adserver.") ||
            host.contains("popunder") || host.contains("onclickads")) return true
        val pathTokens = listOf("/ads/", "/adserver/", "/popunder", "/pop-up", "/popup/",
            "clickadu", "trafficjunky", "googletagmanager", "google-analytics")
        return pathTokens.any { it in path || it in query }
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

    private data class CapturedCandidate(
        val url: String,
        val kind: String,
        val headers: Map<String, String>,
        val score: Int,
        val capturedAt: Long
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
        timeoutMs: Long = 90_000L
    ): Result<SniffedStream> = withContext(Dispatchers.Main) {
        val visitedHosts = CopyOnWriteArrayList<String>()
        val protectedMediaHosts = CopyOnWriteArrayList<String>()
        val pageLoaded = AtomicBoolean(false)
        val videoTagsFound = AtomicInteger(0)
        val jsErrorCount = AtomicInteger(0)
        val candidateCount = AtomicInteger(0)
        val lastCandidateAt = AtomicLong(0L)
        val userRequestedPlay = AtomicBoolean(false)
        val playRequestedAt = AtomicLong(0L)
        // WebView callbacks such as shouldInterceptRequest run on background threads.
        // Keep the top-level page URL in a thread-safe snapshot updated on the UI thread.
        val currentPageUrl = AtomicReference(embedUrl)

        val result = withTimeoutOrNull(timeoutMs) {
            suspendCancellableCoroutine<SniffedStream?> { cont ->
                val done = AtomicBoolean(false)
                val subs = CopyOnWriteArrayList<String>()
                var webView: WebView? = null
                var captureContainer: FrameLayout? = null
                var backCallback: OnBackPressedCallback? = null
                var pulseJob: Job? = null
                val root = activity.window.decorView as? ViewGroup
                val cancelledByBack = AtomicBoolean(false)

                fun cleanup() {
                    pulseJob?.cancel()
                    runCatching {
                        backCallback?.remove()
                        backCallback = null
                        webView?.stopLoading()
                        captureContainer?.let { root?.removeView(it) }
                        captureContainer = null
                        webView?.destroy()
                        webView = null
                    }
                }

                val candidates = CopyOnWriteArrayList<CapturedCandidate>()

                fun scoreCandidate(item: ClassifiedResource): Int {
                    val value = item.url.lowercase()
                    return when {
                        value.contains(".m3u8") -> 100
                        value.contains(".mpd") -> 95
                        value.contains(".mp4") -> 80
                        value.contains(".webm") -> 70
                        else -> 50
                    } + if (value.contains("master")) 8 else 0
                }

                fun offerCandidate(url: String, kind: String, hdrs: Map<String, String>) {
                    if (done.get() || isAdUrl(url)) return
                    val item = classifyResource(url)?.takeIf { it.playable } ?: return
                    if (candidates.any { it.url == item.url }) return
                    val allowed = setOf("user-agent", "referer", "origin", "cookie", "authorization", "accept")
                    val clean = hdrs.filterKeys { it.lowercase() in allowed }.toMutableMap()
                    if (clean.keys.none { it.equals("User-Agent", true) }) clean["User-Agent"] = BROWSER_UA
                    if (clean.keys.none { it.equals("Referer", true) }) clean["Referer"] = embedUrl
                    if (clean.keys.none { it.equals("Cookie", true) }) {
                        val cookie = runCatching { CookieManager.getInstance().getCookie(item.url) }.getOrNull()
                        if (!cookie.isNullOrBlank()) clean["Cookie"] = cookie
                    }
                    candidates.add(CapturedCandidate(item.url, item.kind.ifBlank { kind }, clean, scoreCandidate(item), android.os.SystemClock.elapsedRealtime()))
                    candidateCount.set(candidates.size)
                    lastCandidateAt.set(android.os.SystemClock.elapsedRealtime())
                }

                fun finishBest() {
                    if (done.get() || !userRequestedPlay.get() || candidates.isEmpty()) return
                    val best = candidates.maxWithOrNull(compareBy<CapturedCandidate> { it.score }.thenBy { it.capturedAt }) ?: return
                    if (!done.compareAndSet(false, true)) return
                    val referer = best.headers.entries.firstOrNull { it.key.equals("Referer", true) }?.value ?: embedUrl
                    val userAgent = best.headers.entries.firstOrNull { it.key.equals("User-Agent", true) }?.value ?: BROWSER_UA
                    val cookies = best.headers.entries.firstOrNull { it.key.equals("Cookie", true) }?.value.orEmpty()
                    val found = SniffedStream(
                        streamUrl = best.url,
                        streamType = best.kind,
                        referer = referer,
                        userAgent = userAgent,
                        cookies = cookies,
                        subtitles = subs.toList(),
                        diagnostics = "captured=${candidates.size}; selectedScore=${best.score}",
                        requestHeaders = best.headers
                    )
                    activity.runOnUiThread {
                        cleanup()
                        if (cont.isActive) cont.resume(found)
                    }
                }

                try {
                    val wv = WebView(activity).apply {
                        // The source page must remain visible and touchable: many embeds
                        // only request the real stream after the user presses their own
                        // play control, which cannot be triggered reliably by selectors.
                        visibility = View.VISIBLE
                        alpha = 1f
                        isClickable = true
                        isFocusable = true
                        isFocusableInTouchMode = true
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
                            if (url.startsWith("http") && !subs.contains(url)) {
                                subs.add(url)
                                lastCandidateAt.set(android.os.SystemClock.elapsedRealtime())
                            }
                        }

                        @JavascriptInterface
                        fun onVideoFound(url: String) {
                            if (url.startsWith("http") && !isAdUrl(url)) {
                                classifyResource(url)?.takeIf { it.playable }?.let {
                                    offerCandidate(it.url, it.kind, mapOf("Referer" to embedUrl, "User-Agent" to ua))
                                }
                            }
                        }

                        @JavascriptInterface
                        fun onVideoTagCount(c: Int) {
                            videoTagsFound.set(c)
                        }

                        // Dispatch a real Android touch sequence to the WebView so players
                        // that reject synthetic JavaScript clicks can still receive a trusted tap.
                        @JavascriptInterface
                        fun tapPlayer(cssX: Float, cssY: Float) {
                            activity.runOnUiThread {
                                val density = wv.resources.displayMetrics.density
                                val x = cssX * density
                                val y = cssY * density
                                val downTime = android.os.SystemClock.uptimeMillis()
                                val down = MotionEvent.obtain(
                                    downTime, downTime, MotionEvent.ACTION_DOWN, x, y, 0
                                )
                                val up = MotionEvent.obtain(
                                    downTime, downTime + 70L, MotionEvent.ACTION_UP, x, y, 0
                                )
                                try {
                                    wv.dispatchTouchEvent(down)
                                    wv.dispatchTouchEvent(up)
                                } finally {
                                    down.recycle()
                                    up.recycle()
                                }
                            }
                        }
                    }, "CinemaCapture")

                    wv.webChromeClient = object : WebChromeClient() {
                        override fun onCreateWindow(view: WebView?, isDialog: Boolean, isUserGesture: Boolean, resultMsg: android.os.Message?): Boolean = false

                        override fun onConsoleMessage(cm: ConsoleMessage?): Boolean {
                            if (cm?.messageLevel() == ConsoleMessage.MessageLevel.ERROR) jsErrorCount.incrementAndGet()
                            return true
                        }
                    }

                    wv.webViewClient = object : WebViewClient() {
                        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                            val reqUrl = request?.url?.toString() ?: return true
                            val accept = request.requestHeaders.entries
                                .firstOrNull { it.key.equals("Accept", true) }?.value
                            if (!isProtectedPlaybackRequest(reqUrl, accept) && isAdUrl(reqUrl)) return true
                            return false
                        }

                        override fun onPageStarted(view: WebView?, url: String?, favicon: android.graphics.Bitmap?) {
                            super.onPageStarted(view, url, favicon)
                            if (!url.isNullOrBlank()) currentPageUrl.set(url)
                        }

                        override fun onPageFinished(view: WebView?, url: String?) {
                            super.onPageFinished(view, url)
                            if (!url.isNullOrBlank()) currentPageUrl.set(url)
                            pageLoaded.set(true)
                        }

                        override fun shouldInterceptRequest(view: WebView?, request: WebResourceRequest?): WebResourceResponse? {
                            val reqUrl = request?.url?.toString() ?: return null
                            val requestHeaders = request.requestHeaders ?: emptyMap()
                            val accept = requestHeaders.entries
                                .firstOrNull { it.key.equals("Accept", true) }?.value
                            val requestHost = runCatching { Uri.parse(reqUrl).host }.getOrNull()
                            val protectedPlaybackRequest = isProtectedPlaybackRequest(reqUrl, accept) ||
                                (!requestHost.isNullOrBlank() && protectedMediaHosts.contains(requestHost))
                            if (!protectedPlaybackRequest) {
                                val pageUrl = currentPageUrl.get().ifBlank { embedUrl }
                                val blockedByBrave = runCatching {
                                    BraveAdBlockEngine.shouldBlock(
                                        reqUrl,
                                        pageUrl,
                                        accept,
                                        request.isForMainFrame
                                    )
                                }.getOrDefault(false)
                                if (isAdUrl(reqUrl) || blockedByBrave) {
                                    return WebResourceResponse("text/plain", "UTF-8", 204, "No Content", emptyMap(), ByteArrayInputStream(ByteArray(0)))
                                }
                            }
                            runCatching { Uri.parse(reqUrl).host }.getOrNull()?.let { h ->
                                if (visitedHosts.size < 10 && h !in visitedHosts) visitedHosts.add(h)
                            }
                            classifyResource(reqUrl)?.let { item ->
                                if (!item.playable) {
                                    if (!subs.contains(item.url)) {
                                    subs.add(item.url)
                                    lastCandidateAt.set(android.os.SystemClock.elapsedRealtime())
                                }
                                } else {
                                    runCatching { Uri.parse(item.url).host }.getOrNull()?.let { mediaHost ->
                                        if (mediaHost !in protectedMediaHosts) protectedMediaHosts.add(mediaHost)
                                    }
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
                                    offerCandidate(item.url, item.kind, hdrs)
                                }
                            }
                            return null
                        }
                    }

                    webView = wv
                    // Keep the WebView interactive so the user can press play in custom
                    // players. Popup windows remain blocked by WebChromeClient above.
                    wv.importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_AUTO
                    val density = activity.resources.displayMetrics.density
                    val container = FrameLayout(activity).apply {
                        setBackgroundColor(Color.BLACK)
                        addView(wv, FrameLayout.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.MATCH_PARENT
                        ))
                    }
                    val topBar = LinearLayout(activity).apply {
                        orientation = LinearLayout.HORIZONTAL
                        gravity = Gravity.CENTER_VERTICAL
                        setPadding((8 * density).toInt(), 0, (12 * density).toInt(), 0)
                        setBackgroundColor(Color.argb(190, 12, 15, 20))
                        val close = ImageButton(activity).apply {
                            setImageResource(android.R.drawable.ic_menu_close_clear_cancel)
                            contentDescription = "إغلاق صفحة المصدر"
                            setBackgroundColor(Color.TRANSPARENT)
                            setOnClickListener { backCallback?.handleOnBackPressed() }
                        }
                        addView(close, LinearLayout.LayoutParams((44 * density).toInt(), (48 * density).toInt()))
                        val status = TextView(activity).apply {
                            text = "رصد مصدر التشغيل"
                            setTextColor(Color.WHITE)
                            textSize = 14f
                        }
                        addView(status, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
                    }
                    container.addView(topBar, FrameLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        (52 * density).toInt(),
                        Gravity.TOP
                    ))
                    captureContainer = container
                    root?.addView(container, ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                    ))

                    val callback = object : OnBackPressedCallback(true) {
                        override fun handleOnBackPressed() {
                            cancelledByBack.set(true)
                            done.set(true)
                            cleanup()
                            if (cont.isActive) cont.resume(null)
                        }
                    }
                    backCallback = callback
                    activity.onBackPressedDispatcher.addCallback(activity, callback)

                    // Capture starts immediately. The source player's own play control
                    // remains available; no generic overlay button or synthetic click is shown.
                    wv.setOnTouchListener { _, event ->
                        if (event.action == MotionEvent.ACTION_UP) {
                            val density = wv.resources.displayMetrics.density.coerceAtLeast(1f)
                            val cssX = event.x / density
                            val cssY = event.y / density
                            val gestureProbe = """
                                (function(x,y){
                                  var el = document.elementFromPoint(x,y);
                                  var playerSelector = 'video, .jwplayer, .video-js, .plyr, .dplayer, .artplayer, .flowplayer, [data-player], [class*="player-container"]';
                                  while (el) {
                                    try { if (el.matches && el.matches(playerSelector)) return true; } catch(e) {}
                                    el = el.parentElement;
                                  }
                                  return false;
                                })($cssX,$cssY)
                            """.trimIndent()
                            wv.evaluateJavascript(gestureProbe) { value ->
                                if (value?.trim() == "true") {
                                    userRequestedPlay.set(true)
                                    playRequestedAt.set(android.os.SystemClock.elapsedRealtime())
                                }
                            }
                        }
                        false
                    }

                    if (headers.isNotEmpty()) wv.loadUrl(embedUrl, headers) else wv.loadUrl(embedUrl)

                    pulseJob = CoroutineScope(Dispatchers.Main).launch {
                        while (isActive && !done.get()) {
                            delay(1_000L)
                            val now = android.os.SystemClock.elapsedRealtime()
                            val stableSince = maxOf(lastCandidateAt.get(), playRequestedAt.get())
                            if (userRequestedPlay.get() && candidates.isNotEmpty() && stableSince > 0L && now - stableSince >= 8_000L) {
                                finishBest()
                                break
                            }
                            wv.evaluateJavascript(
                                """
                                (function(){
                                  try {
                                    if (!window.__fftvCaptureHooks) {
                                      window.__fftvCaptureHooks = true;
                                      var oldFetch = window.fetch;
                                      if (oldFetch) window.fetch = function(){
                                        var u = arguments[0] && (arguments[0].url || arguments[0]);
                                        if (u) try { CinemaCapture.onVideoFound(String(u)); } catch(e) {}
                                        return oldFetch.apply(this, arguments);
                                      };
                                      var oldOpen = XMLHttpRequest.prototype.open;
                                      XMLHttpRequest.prototype.open = function(m,u){
                                        if (u) try { CinemaCapture.onVideoFound(String(u)); } catch(e) {}
                                        return oldOpen.apply(this, arguments);
                                      };
                                    }
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
                                    // Called only after the user presses the app-owned Play button.
                                    // It targets known player controls and never generic page buttons.
                                    window.__fftvRequestPlay = function() {
                                      try {
                                        var selectors = [
                                          '.jw-icon-playback', '.jw-display-icon-container',
                                          '.vjs-big-play-button', '.plyr__control--overlaid',
                                          '[data-plyr="play"]', '.flowplayer .fp-play',
                                          '.fp-ui .fp-play', '.dplayer-play-icon',
                                          '.artplayer-play', 'button[aria-label*="play" i]',
                                          '[role="button"][aria-label*="play" i]',
                                          'button[title*="play" i]', '.play-button',
                                          '.play-btn', '.player-play', '.play-icon'
                                        ];
                                        function visible(el) {
                                          if (!el || !el.getBoundingClientRect) return false;
                                          var r = el.getBoundingClientRect();
                                          var st = getComputedStyle(el);
                                          return r.width > 8 && r.height > 8 &&
                                            st.display !== 'none' && st.visibility !== 'hidden' &&
                                            Number(st.opacity || 1) > 0.05;
                                        }
                                        function looksLikeAd(el) {
                                          for (var n = el, i = 0; n && i < 5; n = n.parentElement, i++) {
                                            var cls = typeof n.className === 'string' ? n.className : '';
                                            var marker = ((n.id || '') + ' ' + cls + ' ' +
                                              ((n.getAttribute && (n.getAttribute('aria-label') || '')) || '')).toLowerCase();
                                            if (/(^|[ _-])(ad|ads|advert|banner|popup|popunder|sponsor)([ _-]|$)/.test(marker)) return true;
                                          }
                                          return false;
                                        }
                                        for (var si = 0; si < selectors.length; si++) {
                                          var nodes = document.querySelectorAll(selectors[si]);
                                          for (var ni = 0; ni < nodes.length; ni++) {
                                            var el = nodes[ni];
                                            if (!visible(el) || looksLikeAd(el)) continue;
                                            var r = el.getBoundingClientRect();
                                            if (window.CinemaCapture && window.CinemaCapture.tapPlayer) {
                                              window.CinemaCapture.tapPlayer(r.left + r.width / 2, r.top + r.height / 2);
                                              return true;
                                            }
                                          }
                                        }
                                      } catch (e) {}
                                      return false;
                                    };

                                    // Strategy 6: inspect late-created controls after ad overlays are blocked.
                                    // Re-run the sequence on later polling ticks as players often mount asynchronously.
                                    try {
                                      document.querySelectorAll('video').forEach(function(video) {
                                        var src = video.currentSrc || video.src;
                                        if (src) CinemaCapture.onVideoFound(src);
                                        video.querySelectorAll('source').forEach(function(source) {
                                          if (source.src) CinemaCapture.onVideoFound(source.src);
                                        });
                                      });
                                    } catch(e) {}
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
        } else if (cancelledByBack.get()) {
            Result.failure(IllegalStateException("CAPTURE_CANCELLED"))
        } else {
            val report = buildString {
                append("انتهت المهلة دون التقاط بث صالح.\n")
                append("• تحميل الصفحة: ${if (pageLoaded.get()) "نعم" else "لا"}\n")
                append("• عناصر Video: ${videoTagsFound.get()} | مرشحو البث: ${candidateCount.get()} | أخطاء JS: ${jsErrorCount.get()}\n")
                if (visitedHosts.isNotEmpty()) append("• النطاقات: ${visitedHosts.joinToString(", ")}")
            }
            Result.failure(IllegalStateException(report))
        }
    }
}
