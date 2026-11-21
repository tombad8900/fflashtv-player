package com.fflashtv.player.tmdb

import android.annotation.SuppressLint
import android.app.Activity
import android.net.Uri
import android.util.Base64
import android.view.View
import android.view.ViewGroup
import android.view.MotionEvent
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
import kotlin.coroutines.resume

object HiddenStreamSniffer {

    private const val BROWSER_UA =
        "Mozilla/5.0 (Linux; Android 13; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36"

    private val ARABIC_SUB_REGEX = Regex("""[._/\-=](ar|ara|arabic)[._/\-=]""", RegexOption.IGNORE_CASE)

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
        timeoutMs: Long = 60_000L
    ): Result<SniffedStream> = withContext(Dispatchers.Main) {
        val visitedHosts = CopyOnWriteArrayList<String>()
        val pageLoaded = AtomicBoolean(false)
        val videoTagsFound = AtomicInteger(0)
        val jsErrorCount = AtomicInteger(0)
        val candidateCount = AtomicInteger(0)
        val lastCandidateAt = AtomicLong(0L)

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
                    if (done.get() || candidates.isEmpty()) return
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
                            if (url.startsWith("http") && !subs.contains(url)) subs.add(url)
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
                    root?.addView(wv, ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
                    if (headers.isNotEmpty()) wv.loadUrl(embedUrl, headers) else wv.loadUrl(embedUrl)

                    pulseJob = CoroutineScope(Dispatchers.Main).launch {
                        while (isActive && !done.get()) {
                            delay(1_000L)
                            if (candidates.isNotEmpty() && android.os.SystemClock.elapsedRealtime() - lastCandidateAt.get() >= 6_500L) {
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
                                    // Multi-strategy playback activation. Only target recognizable player controls;
                                    // never click arbitrary links or buttons that may be advertisements.
                                    if (!window.__fftvAutoPlayState) {
                                      window.__fftvAutoPlayState = { tick: 0, clicked: new WeakSet() };
                                    }
                                    var state = window.__fftvAutoPlayState;
                                    state.tick++;

                                    function visible(el) {
                                      if (!el || !el.getBoundingClientRect) return false;
                                      var r = el.getBoundingClientRect();
                                      var st = getComputedStyle(el);
                                      return r.width > 8 && r.height > 8 &&
                                        st.display !== 'none' && st.visibility !== 'hidden' &&
                                        Number(st.opacity || 1) > 0.05;
                                    }
                                    function looksLikeAd(el) {
                                      var n = el;
                                      for (var i = 0; n && i < 5; i++, n = n.parentElement) {
                                        var marker = ((n.id || '') + ' ' + (n.className || '') + ' ' +
                                          (n.getAttribute && (n.getAttribute('aria-label') || '') || '')).toLowerCase();
                                        if (/(^|[ _-])(ad|ads|advert|banner|popup|popunder|sponsor)([ _-]|$)/.test(marker)) return true;
                                      }
                                      return false;
                                    }
                                    function activate(el) {
                                      if (!visible(el) || looksLikeAd(el) || state.clicked.has(el)) return false;
                                      state.clicked.add(el);
                                      try {
                                        var r = el.getBoundingClientRect();
                                        var x = r.left + r.width / 2, y = r.top + r.height / 2;
                                        // Prefer a native Android touch: unlike element.click(), it can
                                        // satisfy players that inspect trusted pointer/touch gestures.
                                        if (window.CinemaCapture && window.CinemaCapture.tapPlayer) {
                                          window.CinemaCapture.tapPlayer(x, y);
                                          return true;
                                        }
                                        ['pointerdown','mousedown','pointerup','mouseup','click'].forEach(function(type) {
                                          var C = type.indexOf('pointer') === 0 && window.PointerEvent ? PointerEvent : MouseEvent;
                                          el.dispatchEvent(new C(type, {
                                            bubbles: true, cancelable: true, view: window,
                                            clientX: x, clientY: y, pointerType: 'touch'
                                          }));
                                        });
                                        if (typeof el.click === 'function') el.click();
                                        return true;
                                      } catch(e) { return false; }
                                    }

                                    // Strategy 1: native HTML media API (gesture requirement is disabled in WebView).
                                    document.querySelectorAll('video').forEach(function(video) {
                                      try {
                                        video.muted = true;
                                        var p = video.play();
                                        if (p && p.catch) p.catch(function(){});
                                      } catch(e) {}
                                    });

                                    // Strategy 2: known player-specific play controls.
                                    var playerSelectors = [
                                      '.jw-icon-playback', '.jw-display-icon-container',
                                      '.vjs-big-play-button', '.plyr__control--overlaid',
                                      '[data-plyr="play"]', '.flowplayer .fp-play',
                                      '.fp-ui .fp-play', '.dplayer-play-icon',
                                      '.artplayer-play', '.video-js button[title*="Play" i]',
                                      'button[aria-label*="play" i]', '[role="button"][aria-label*="play" i]',
                                      '[title*="play" i]', '.play-button', '.play-btn',
                                      '.btn-play', '.player-play', '.play-icon'
                                    ];
                                    var activated = false;
                                    for (var si = 0; si < playerSelectors.length && !activated; si++) {
                                      var nodes = document.querySelectorAll(playerSelectors[si]);
                                      for (var ni = 0; ni < nodes.length && !activated; ni++) {
                                        activated = activate(nodes[ni]);
                                      }
                                    }

                                    // Strategy 3: semantic controls, in the page's language.
                                    if (!activated && state.tick >= 2) {
                                      var labels = /^(play|watch|start|continue|مشاهدة|شاهد|تشغيل|ابدأ|استمرار)(\s|$)/i;
                                      var controls = document.querySelectorAll('button,[role="button"],input[type="button"],input[type="submit"]');
                                      for (var ci = 0; ci < controls.length && !activated; ci++) {
                                        var el = controls[ci];
                                        var label = ((el.innerText || el.value || '') + ' ' +
                                          (el.getAttribute('aria-label') || '') + ' ' +
                                          (el.getAttribute('title') || '')).trim();
                                        if (labels.test(label)) activated = activate(el);
                                      }
                                    }

                                    // Strategy 4: player overlays with recognizable class names (never generic page buttons).
                                    if (!activated && state.tick >= 4) {
                                      var overlays = document.querySelectorAll(
                                        '[class*="play-overlay"],[class*="play_overlay"],[class*="playButton"],' +
                                        '[class*="play-button"],[class*="playButton"],[id*="play-button"]'
                                      );
                                      for (var oi = 0; oi < overlays.length && !activated; oi++) {
                                        activated = activate(overlays[oi]);
                                      }
                                    }

                                    // Strategy 5: keyboard activation for a focused player surface.
                                    if (!activated && state.tick === 6) {
                                      var player = document.querySelector('video,[class*="player"],[id*="player"]');
                                      if (player && visible(player)) {
                                        try {
                                          player.focus();
                                          ['keydown','keyup'].forEach(function(type) {
                                            player.dispatchEvent(new KeyboardEvent(type, {
                                              key: ' ', code: 'Space', keyCode: 32, which: 32,
                                              bubbles: true, cancelable: true
                                            }));
                                          });
                                        } catch(e) {}
                                      }
                                    }

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
