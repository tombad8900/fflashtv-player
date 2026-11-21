package com.fflashtv.player.tmdb

import android.annotation.SuppressLint
import android.app.Activity
import android.net.Uri
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.webkit.*
import android.widget.FrameLayout
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import com.fflashtv.player.adblock.BraveAdBlockEngine
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import org.json.JSONObject
import org.json.JSONArray
import java.io.ByteArrayInputStream
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicReference
import kotlin.coroutines.resume

/** Port of EXO TV z4/e0, z4/b0, z4/d0, z4/c0 and z4/g0 capture flow. */
object ExoWebViewResolver {
    private const val TAG = "ExoWebViewResolver"
    private const val UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36"
    private val MEDIA = Regex("""\.(m3u8|mp4|m4s)(?:[?#]|$)""", RegexOption.IGNORE_CASE)
    private val SUB = Regex("""\.(vtt|srt|ass|ssa|ttml|dfxp)(?:[?#]|$)""", RegexOption.IGNORE_CASE)

    private data class Candidate(val url: String, val kind: String, val headers: Map<String, String>, val time: Long)

    @SuppressLint("SetJavaScriptEnabled")
    suspend fun capture(activity: Activity, embedUrl: String, sourceHeaders: Map<String, String> = emptyMap(), timeoutMs: Long = 90_000L): Result<SniffedStream> =
        withContext(Dispatchers.Main.immediate) {
            val loaded = AtomicBoolean(false)
            val count = AtomicReference(0)
            val terminal = AtomicReference("")
            val page = AtomicReference(embedUrl)
            val outcome = withTimeoutOrNull(timeoutMs) {
                suspendCancellableCoroutine<SniffedStream?> { cont ->
                    val handler = Handler(Looper.getMainLooper())
                    val done = AtomicBoolean(false)
                    val candidates = LinkedHashMap<String, Candidate>()
                    val subtitles = LinkedHashSet<String>()
                    val hops = LinkedHashSet<String>()
                    val root = activity.window.decorView as? ViewGroup
                    var view: WebView? = null
                    var attached = false
                    var back: OnBackPressedCallback? = null

                    fun cleanup() {
                        handler.removeCallbacksAndMessages(null)
                        runCatching { back?.remove() }
                        back = null
                        view?.let { w ->
                            runCatching { w.stopLoading() }
                            if (attached) runCatching { root?.removeView(w) }
                            runCatching { w.removeJavascriptInterface("ExoBridge") }
                            runCatching { w.destroy() }
                        }
                        view = null
                        attached = false
                    }
                    fun fail(reason: String) {
                        if (!done.compareAndSet(false, true)) return
                        terminal.set(reason)
                        cleanup()
                        if (cont.isActive) cont.resume(null)
                    }
                    fun headers(url: String, raw: Map<String, String>, ref: String): Map<String, String> {
                        val allowed = setOf("user-agent", "referer", "origin", "cookie", "authorization", "accept")
                        val out = LinkedHashMap<String, String>()
                        sourceHeaders.forEach { (k, v) ->
                            if (k.lowercase() in allowed && !k.equals("User-Agent", true) && v.isNotBlank()) out[k] = v
                        }
                        raw.forEach { (k, v) -> if (k.lowercase() in allowed && v.isNotBlank()) {
                            val oldKey = out.keys.firstOrNull { it.equals(k, true) }
                            if (oldKey != null) out.remove(oldKey)
                            out[k] = v
                        } }
                        if (out.keys.none { it.equals("User-Agent", true) }) out["User-Agent"] = UA
                        if (out.keys.none { it.equals("Referer", true) }) out["Referer"] = ref
                        if (out.keys.none { it.equals("Cookie", true) }) {
                            CookieManager.getInstance().getCookie(url)?.takeIf { it.isNotBlank() }?.let { out["Cookie"] = it }
                        }
                        return out
                    }
                    fun offer(url: String, raw: Map<String, String> = emptyMap(), ref: String = page.get()) {
                        if (done.get() || !url.startsWith("http", true)) return
                        if (SUB.containsMatchIn(url)) { subtitles.add(url); return }
                        if (!MEDIA.containsMatchIn(url)) return
                        val host = runCatching { Uri.parse(url).host.orEmpty().lowercase() }.getOrDefault("")
                        if (host.isBlank() || isAdHost(host)) return
                        val incoming = headers(url, raw, ref)
                        val old = candidates[url]
                        val merged = old?.headers?.toMutableMap() ?: LinkedHashMap()
                        incoming.forEach { (k, v) ->
                            val key = merged.keys.firstOrNull { it.equals(k, true) }
                            val value = key?.let { merged[it] }.orEmpty()
                            val fallback = (k.equals("Referer", true) && value == embedUrl) ||
                                (k.equals("User-Agent", true) && value == UA)
                            if (key == null || value.isBlank() || fallback || raw.isNotEmpty()) {
                                if (key != null) merged.remove(key)
                                merged[k] = v
                            }
                        }
                        val kind = when {
                            url.contains(".m3u8", true) -> "HLS"
                            url.contains(".m4s", true) -> "M4S"
                            else -> "MP4"
                        }
                        candidates[url] = Candidate(url, kind, merged, old?.time ?: android.os.SystemClock.elapsedRealtime())
                        count.set(candidates.size)
                    }
                    fun success(urls: List<String>) {
                        urls.forEach { offer(it) }
                        if (candidates.isEmpty()) return
                        val ordered = candidates.values.sortedWith(
                            compareByDescending<Candidate> { when (it.kind) { "HLS" -> 100; "MP4" -> 80; else -> 40 } }.thenBy { it.time }
                        )
                        val first = ordered.first()
                        val ref = first.headers.entries.firstOrNull { it.key.equals("Referer", true) }?.value ?: embedUrl
                        val ua = first.headers.entries.firstOrNull { it.key.equals("User-Agent", true) }?.value ?: UA
                        val cookie = first.headers.entries.firstOrNull { it.key.equals("Cookie", true) }?.value.orEmpty()
                        val stream = SniffedStream(
                            streamUrl = first.url, streamType = first.kind, referer = ref, userAgent = ua,
                            cookies = cookie, subtitles = subtitles.toList(),
                            diagnostics = "EXO capture; hops=" + hops.size + "; candidates=" + ordered.size,
                            requestHeaders = first.headers,
                            candidates = ordered.map { SniffedCandidate(it.url, it.kind, it.headers) }
                        )
                        if (!done.compareAndSet(false, true)) return
                        cleanup()
                        if (cont.isActive) cont.resume(stream)
                    }
                    fun loadHop(url: String) {
                        if (done.get() || hops.size >= 5) return
                        val uri = runCatching { Uri.parse(url) }.getOrNull() ?: return
                        val host = uri.host?.lowercase().orEmpty()
                        if (uri.scheme !in listOf("http", "https") || host.isBlank() || isAdHost(host) || !hops.add(url)) return
                        val previous = page.get()
                        page.set(url)
                        view?.loadUrl(url, mapOf("Referer" to previous, "User-Agent" to UA))
                    }
                    fun event(raw: String) {
                        if (done.get() || raw.length > 256 * 1024) return
                        val obj = runCatching { JSONObject(raw) }.getOrNull() ?: return
                        when (obj.optString("type")) {
                            "stream" -> {
                                val array = obj.optJSONArray("urls") ?: JSONArray()
                                val urls = (0 until array.length()).map { array.optString(it) }.filter { it.isNotBlank() }
                                handler.postDelayed({ success(urls) }, 250L)
                            }
                            "hop" -> loadHop(obj.optString("url"))
                            "expired" -> fail("انتهت صلاحية جلسة المصدر (EXO expired)")
                            "limited" -> fail("المصدر يرفض الاتصالات بسبب حد الطلبات (EXO limited)")
                            "exhausted" -> fail("استنفد المصدر خوادمه البديلة دون بث (EXO exhausted)")
                            "stall" -> if (candidates.isNotEmpty()) success(candidates.keys.toList()) else fail("لم يظهر بث خلال مهلة EXO")
                            "err" -> Log.w(TAG, obj.optString("message"))
                        }
                    }

                    try {
                        val w = WebView(activity)
                        view = w
                        w.visibility = View.VISIBLE
                        w.alpha = 0.01f
                        w.isFocusable = false
                        w.isClickable = false
                        w.setLayerType(View.LAYER_TYPE_SOFTWARE, null)
                        w.settings.apply {
                            javaScriptEnabled = true
                            domStorageEnabled = true
                            allowFileAccess = true
                            loadWithOverviewMode = true
                            useWideViewPort = true
                            mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                            userAgentString = UA
                            mediaPlaybackRequiresUserGesture = false
                            javaScriptCanOpenWindowsAutomatically = false
                            setSupportMultipleWindows(false)
                        }
                        CookieManager.getInstance().apply {
                            setAcceptCookie(true)
                            setAcceptThirdPartyCookies(w, true)
                        }
                        w.addJavascriptInterface(object {
                            @JavascriptInterface fun onEvent(raw: String) {
                                if (raw.length <= 256 * 1024) handler.post { event(raw) }
                            }
                        }, "ExoBridge")
                        w.webChromeClient = object : WebChromeClient() {
                            override fun onCreateWindow(v: WebView?, d: Boolean, g: Boolean, m: android.os.Message?) = false
                        }
                        w.webViewClient = object : WebViewClient() {
                            override fun onPageStarted(v: WebView?, url: String?, icon: android.graphics.Bitmap?) {
                                if (!url.isNullOrBlank()) page.set(url)
                            }
                            override fun onPageFinished(v: WebView?, url: String?) {
                                if (!url.isNullOrBlank()) page.set(url)
                                loaded.set(true)
                                v?.evaluateJavascript(VIEWPORT_SCRIPT, null)
                                v?.evaluateJavascript(NETWORK_SCRIPT, null)
                                v?.evaluateJavascript(CHAIN_SCRIPT, null)
                            }
                            override fun shouldOverrideUrlLoading(v: WebView?, req: WebResourceRequest?): Boolean {
                                val url = req?.url?.toString() ?: return true
                                return isAdHost(req.url.host?.lowercase().orEmpty()) && !MEDIA.containsMatchIn(url)
                            }
                            override fun shouldInterceptRequest(v: WebView?, req: WebResourceRequest?): WebResourceResponse? {
                                val url = req?.url?.toString() ?: return null
                                val h = req.requestHeaders ?: emptyMap()
                                val accept = h.entries.firstOrNull { it.key.equals("Accept", true) }?.value.orEmpty()
                                val media = MEDIA.containsMatchIn(url) || SUB.containsMatchIn(url) ||
                                    accept.contains("video/", true) || accept.contains("audio/", true) || accept.contains("text/vtt", true)
                                if (!media) {
                                    val blocked = runCatching {
                                        BraveAdBlockEngine.shouldBlock(url, page.get().ifBlank { embedUrl }, accept, req.isForMainFrame)
                                    }.getOrDefault(false)
                                    if (blocked || isAdHost(req.url.host?.lowercase().orEmpty())) {
                                        return WebResourceResponse("text/plain", "UTF-8", 204, "No Content", emptyMap(), ByteArrayInputStream(ByteArray(0)))
                                    }
                                }
                                if (MEDIA.containsMatchIn(url) || SUB.containsMatchIn(url)) {
                                    val ref = h.entries.firstOrNull { it.key.equals("Referer", true) }?.value ?: page.get()
                                    handler.post { offer(url, h, ref) }
                                }
                                return null
                            }
                            override fun onReceivedHttpError(v: WebView?, req: WebResourceRequest?, response: WebResourceResponse?) {
                                if (req?.isForMainFrame != true) return
                                val status = response?.statusCode ?: return
                                if (status == 403 || status == 410) handler.post { fail("انتهت صلاحية صفحة المصدر (HTTP " + status + ")") }
                                else if (status in 400..499) handler.post { fail("صفحة المصدر غير متاحة (HTTP " + status + ")") }
                            }
                        }
                        root?.addView(w, ViewGroup.LayoutParams(1, 1))
                        attached = root != null
                        (activity as? ComponentActivity)?.let { owner ->
                            back = object : OnBackPressedCallback(true) {
                                override fun handleOnBackPressed() { fail("CAPTURE_CANCELLED") }
                            }.also { owner.onBackPressedDispatcher.addCallback(owner, it) }
                        }
                        w.loadUrl(embedUrl, sourceHeaders + mapOf("User-Agent" to UA))
                        cont.invokeOnCancellation { handler.post { if (done.compareAndSet(false, true)) cleanup() } }
                    } catch (t: Throwable) {
                        Log.e(TAG, "EXO resolver setup failed", t)
                        fail(t.message ?: "تعذر تهيئة كاشف EXO")
                    }
                }
            }
            when {
                outcome != null -> Result.success(outcome)
                terminal.get() == "CAPTURE_CANCELLED" -> Result.failure(IllegalStateException("CAPTURE_CANCELLED"))
                else -> Result.failure(IllegalStateException(
                    "انتهت مهلة EXO دون التقاط بث. تحميل الصفحة: " +
                        (if (loaded.get()) "نعم" else "لا") + " | المرشحون: " + count.get()
                ))
            }
        }

    private fun isAdHost(host: String): Boolean {
        val blocked = listOf("doubleclick.net", "googlesyndication.com", "googleadservices.com", "adsterra.com",
            "popads.net", "propellerads.com", "exoclick.com", "juicyads.com", "taboola.com", "outbrain.com",
            "mgid.com", "clickadu.com", "hilltopads.net", "adcash.com", "popcash.net", "trafficjunky.net",
            "histats.com", "googletagmanager.com", "google-analytics.com")
        return blocked.any { host == it || host.endsWith(".$it") } || host.startsWith("ads.") ||
            host.startsWith("adserver.") || host.contains("popunder") || host.contains("onclickads")
    }

    private val VIEWPORT_SCRIPT = """
        (function(){var W=1280,H=720;
        try{
          Object.defineProperty(document,'hidden',{configurable:true,get:function(){return false;}});
          Object.defineProperty(document,'visibilityState',{configurable:true,get:function(){return 'visible';}});
          Object.defineProperty(document,'webkitHidden',{configurable:true,get:function(){return false;}});
          Object.defineProperty(document,'webkitVisibilityState',{configurable:true,get:function(){return 'visible';}});
          ['innerWidth','outerWidth'].forEach(function(k){Object.defineProperty(window,k,{configurable:true,get:function(){return W;}});});
          ['innerHeight','outerHeight'].forEach(function(k){Object.defineProperty(window,k,{configurable:true,get:function(){return H;}});});
          ['width','availWidth'].forEach(function(k){Object.defineProperty(screen,k,{configurable:true,get:function(){return W;}});});
          ['height','availHeight'].forEach(function(k){Object.defineProperty(screen,k,{configurable:true,get:function(){return H;}});});
          var old=Element.prototype.getBoundingClientRect;
          Element.prototype.getBoundingClientRect=function(){var r=old.call(this);if(this&&(this.tagName==='VIDEO'||this.id==='player')&&r.width<=2)return {width:W,height:H,top:0,left:0,right:W,bottom:H,x:0,y:0,toJSON:function(){return this;}};return r;};
        }catch(e){}})();true;
    """.trimIndent()

    private val NETWORK_SCRIPT = """
        (function(){
          if(window.__exoNetHooked)return;window.__exoNetHooked=true;
          var OPEN=/\.(m3u8|mp4|m4s)(?:[?#]|$)/i,live=[];
          function remember(u){try{u=String(u||'');if(OPEN.test(u)&&live.indexOf(u)<0)live.push(u);}catch(e){}}
          function report(u,t){if(u)remember(u);try{if(!t||t.length>4000000)return;var m=t.match(/https?:\/\/[^\s"'<>\\]+\.(m3u8|mp4|m4s)[^\s"'<>\\]*/gi);if(m)m.forEach(remember);}catch(e){}}
          function status(u,s){try{var a=new URL(u,location.href).href;if(a.indexOf(location.origin)!==0)return;if(s>=400)window.__exoNacFails=(window.__exoNacFails||0)+1;else if(s>=200&&s<300)window.__exoNacFails=0;}catch(e){}}
          window.__exoNacFails=0;
          window.__exoLiveStream=function(){
            var out=[];function push(u){if(typeof u==='string'&&OPEN.test(u)&&out.indexOf(u)<0)out.push(u);}
            try{var v=document.querySelector('video');if(v){push(v.currentSrc);push(v.src);push(v.getAttribute&&v.getAttribute('src'));}
            document.querySelectorAll('video source,source').forEach(function(s){push(s.src||(s.getAttribute&&s.getAttribute('src')));});
            performance.getEntriesByType('resource').forEach(function(e){push(e.name);});}catch(e){}
            live.forEach(push);return out;
          };
          var f=window.fetch;if(typeof f==='function')window.fetch=function(){var a=arguments,u=typeof a[0]==='string'?a[0]:(a[0]&&a[0].url);remember(u);var p=f.apply(this,a);try{p.then(function(r){if(!r)return;status(u,r.status);if(r.clone)r.clone().text().then(function(t){report(u,t);}).catch(function(){});}).catch(function(){});}catch(e){}return p;};
          try{var xo=XMLHttpRequest.prototype.open,xs=XMLHttpRequest.prototype.send;
            XMLHttpRequest.prototype.open=function(m,u){this.__exoUrl=u;remember(u);return xo.apply(this,arguments);};
            XMLHttpRequest.prototype.send=function(){var x=this;x.addEventListener('load',function(){try{status(x.__exoUrl,x.status);if(!x.responseType||x.responseType==='text')report(x.__exoUrl,x.responseText);}catch(e){}});return xs.apply(this,arguments);};
          }catch(e){}
          try{var sa=Element.prototype.setAttribute;Element.prototype.setAttribute=function(n,v){try{if(typeof v==='string'&&/^(src|data-src|data-hls)$/i.test(n))report(new URL(v,document.baseURI).href,null);}catch(e){}return sa.apply(this,arguments);};}catch(e){}
          try{var P=HTMLMediaElement.prototype;['src','currentSrc'].forEach(function(k){var d=Object.getOwnPropertyDescriptor(P,k);if(!d||!d.set||!d.get)return;Object.defineProperty(P,k,{configurable:true,enumerable:d.enumerable,get:function(){return d.get.call(this);},set:function(v){try{if(v)remember(new URL(String(v),document.baseURI).href);}catch(e){}return d.set.call(this,v);}});});}catch(e){}
          window.open=function(){return null;};
        })();true;
    """.trimIndent()

    private val CHAIN_SCRIPT = """
        (function(){
          if(window.__exoChained)return;window.__exoChained=true;
          var post=function(p){try{window.ExoBridge.onEvent(JSON.stringify(p));}catch(e){}};
          var abs=function(u){try{return new URL(u,location.href).href;}catch(e){return u;}};
          var ticks=window.__exoStallTicks||48,tries=0,nudged=false;
          var timer=setInterval(function(){
            tries++;var live=typeof window.__exoLiveStream==='function'?window.__exoLiveStream():[];
            if(live.length){clearInterval(timer);post({type:'stream',urls:live});return;}
            if((window.__exoNacFails||0)>=5){clearInterval(timer);post({type:'exhausted',fails:window.__exoNacFails});return;}
            if(tries<=12&&(tries<=1||tries%4===0)){
              var expired=false;try{if((document.title||'').toLowerCase()==='expired')expired=true;
                if(((document.body&&document.body.textContent)||'').indexOf('Session expired')!==-1)expired=true;}catch(e){}
              if(expired){clearInterval(timer);post({type:'expired',where:location.href});return;}
              try{if(window.CONFIG&&window.CONFIG.rateLimited){clearInterval(timer);post({type:'limited'});return;}}catch(e){}
            }
            if(!nudged&&tries>4){nudged=true;try{var b=document.querySelector("button[id*='play' i],button[class*='play' i],[role='button'][aria-label*='play' i],[role='button'][title*='play' i],.jw-icon-display,.jw-display-icon-container");if(b&&b.tagName!=='VIDEO'&&b.click)b.click();}catch(e){}
              try{var v=document.querySelector('video');if(v&&v.paused&&v.play){var p=v.play();if(p&&p.catch)p.catch(function(){});}}catch(e){}
            }
            if(window.__exoNoHops!==true){
              var C=window.CFG;if(C&&C.playerUrl){var f=document.getElementById('player_frame');if(f&&f.src){clearInterval(timer);post({type:'hop',url:abs(f.src)});return;}
                var b=document.getElementById('bigPlay')||document.getElementById('play');if(b)try{b.click();}catch(e){}
                clearInterval(timer);post({type:'hop',url:abs(C.playerUrl)});return;}
              var f2=document.getElementById('player_iframe');if(f2&&f2.src&&f2.src.indexOf('about:')!==0){clearInterval(timer);post({type:'hop',url:abs(f2.src)});return;}
              var frames=document.querySelectorAll('iframe[src]');for(var i=0;i<frames.length;i++){var s=frames[i].src;if(s&&s.indexOf('about:')!==0){try{var h=new URL(s,location.href).hostname.toLowerCase();if(/(^|\.)(doubleclick|googlesyndication|adsterra|popads|exoclick)\./.test(h))continue;}catch(e){}
                clearInterval(timer);post({type:'hop',url:abs(s)});return;}}
            }
            if(tries>ticks){clearInterval(timer);post({type:'stall',where:location.href,tries:tries});}
          },250);
        })();true;
    """.trimIndent()
}
