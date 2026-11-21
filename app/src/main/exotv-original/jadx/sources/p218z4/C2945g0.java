package p218z4;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bumptech.glide.AbstractC0714c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONObject;
import p002a1.C0048u;
import p016b5.C0581d;
import p016b5.C0585h;
import p016b5.C0586i;
import p024c5.C0649b;
import p024c5.C0667h;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1213o;
import p069h7.C1204f;
import p069h7.EnumC1205g;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.C1313m;
import p077j$.time.LocalDate;
import p077j$.time.format.DateTimeFormatter;
import p077j$.time.format.DateTimeParseException;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2320c;
import p204x4.C2759b;
import p204x4.C2760c;
import p204x4.C2762e;
import p204x4.C2765h;
import p204x4.C2768k;
import p220z6.AbstractC2980h;
import p220z6.C2983k;
import p220z6.C2984l;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z4.g0 */
/* loaded from: classes.dex */
public final class C2945g0 {

    /* renamed from: b */
    public static boolean f10966b;

    /* renamed from: c */
    public static volatile EnumC2954l f10967c;

    /* renamed from: e */
    public static final C1204f f10969e;

    /* renamed from: f */
    public static final String f10970f;

    /* renamed from: g */
    public static final String f10971g;

    /* renamed from: h */
    public static final String f10972h;

    /* renamed from: a */
    public static final C2945g0 f10965a = new C2945g0();

    /* renamed from: d */
    public static final HashMap f10968d = new HashMap();

    static {
        EnumC1205g enumC1205g = EnumC1205g.f5092k;
        f10969e = new C1204f("\\.(m3u8|mp4|m4s)(\\?|#|$)", 0);
        f10970f = "(function () {\n  var W = 1280, H = 720;\n  try {\n    Object.defineProperty(document, 'hidden', { configurable: true, get: function () { return false; } });\n    Object.defineProperty(document, 'visibilityState', { configurable: true, get: function () { return 'visible'; } });\n    Object.defineProperty(document, 'webkitHidden', { configurable: true, get: function () { return false; } });\n    Object.defineProperty(document, 'webkitVisibilityState', { configurable: true, get: function () { return 'visible'; } });\n  } catch (e) {}\n  try {\n    Object.defineProperty(window, 'innerWidth', { configurable: true, get: function () { return W; } });\n    Object.defineProperty(window, 'innerHeight', { configurable: true, get: function () { return H; } });\n    Object.defineProperty(window, 'outerWidth', { configurable: true, get: function () { return W; } });\n    Object.defineProperty(window, 'outerHeight', { configurable: true, get: function () { return H; } });\n    var rect = function () { return { width: W, height: H, top: 0, left: 0, right: W, bottom: H, x: 0, y: 0 }; };\n    try {\n      Object.defineProperty(screen, 'width', { configurable: true, get: function () { return W; } });\n      Object.defineProperty(screen, 'height', { configurable: true, get: function () { return H; } });\n      Object.defineProperty(screen, 'availWidth', { configurable: true, get: function () { return W; } });\n      Object.defineProperty(screen, 'availHeight', { configurable: true, get: function () { return H; } });\n    } catch (e) {}\n    if (Element.prototype.getBoundingClientRect) {\n      var real = Element.prototype.getBoundingClientRect;\n      Element.prototype.getBoundingClientRect = function () {\n        var r = real.call(this);\n        // Only the page's own media element is replaced: everything else keeps its real box, so\n        // layout checks still see the page as the site laid it out.\n        if (this && (this.tagName === 'VIDEO' || (this.id && this.id === 'player')) && r.width <= 2) {\n          return { width: W, height: H, top: 0, left: 0, right: W, bottom: H, x: 0, y: 0, toJSON: rect };\n        }\n        return r;\n      };\n    }\n  } catch (e) {}\n})();\ntrue;";
        f10971g = "(function () {\n  if (window.__exoNetHooked) return;\n  window.__exoNetHooked = true;\n  var OPENABLE = /\\.(m3u8|mp4|m4s)(?:[?#]|$)/i;\n  /**\n   * The page's player has a source: a playlist on its media element, or one it requested. This -\n   * not \"a media-looking URL was seen\" - is what proves a stream exists.\n   */\n  var liveStream = function () {\n    var found = [];\n    var push = function (u) {\n      if (typeof u === 'string' && OPENABLE.test(u) && found.indexOf(u) === -1) found.push(u);\n    };\n    try {\n      var v = document.querySelector('video');\n      if (v) { push(v.currentSrc); push(v.src); push(v.getAttribute && v.getAttribute('src')); }\n      var srcs = document.querySelectorAll('video source, source');\n      for (var i = 0; i < srcs.length; i++) push(srcs[i].src || (srcs[i].getAttribute && srcs[i].getAttribute('src')));\n      var res = performance.getEntriesByType('resource');\n      for (var k = 0; k < res.length; k++) push(res[k].name);\n    } catch (e) {}\n    // A playlist fetched by the player's own scripts counts even before it is attached.\n    if (live) for (var n = 0; n < live.length; n++) push(live[n]);\n    return found;\n  };\n  /** Playlists the page has requested. */\n  var live = [];\n  var requestWasMade = function (u) {\n    try { if (typeof u === 'string' && OPENABLE.test(u)) live.push(u); } catch (e) {}\n  };\n  /** A response body naming a playlist is only a candidate: the poll decides whether it counts. */\n  var report = function (where, text) {\n    if (where) requestWasMade(where);\n    try {\n      if (!text || text.length > 4000000) return;\n      var m = text.match(/https?:\\/\\/[^\\s\"'<>\\\\]+\\.(m3u8|mp4)[^\\s\"'<>\\\\]*/gi);\n      if (m) for (var i = 0; i < m.length; i++) requestWasMade(m[i]);\n    } catch (e) {}\n  };\n\n  window.__exoLiveStream = liveStream;\n\n  /**\n   * Counts the backup's own calls that came back refused.\n   *\n   * That site asks each of its upstream servers in turn for a stream; when they all answer 404 it\n   * has nothing to offer, and it says so within a second or two. Without this the walk had no way\n   * to know, and sat on a page that would never change until its stall timeout - which the viewer\n   * experienced as a press that kept loading after the source had given up.\n   *\n   * The rule is the page's own origin, not a guessed path: naming the path meant a probe whose\n   * shape did not match it was never counted at all, so the same silence came back. Third-party\n   * ads and analytics are on other origins and stay out. A success resets the count.\n   */\n  window.__exoNacFails = 0;\n  var noteServerCheck = function (url, status) {\n    try {\n      if (typeof url !== 'string') return;\n      var abs = url;\n      try { abs = new URL(url, location.href).href; } catch (e) {}\n      if (abs.indexOf(location.origin) !== 0) return;\n      if (status >= 400) window.__exoNacFails++;\n      else if (status >= 200 && status < 300) window.__exoNacFails = 0;\n    } catch (e) {}\n  };\n\n  var origFetch = window.fetch;\n  if (typeof origFetch === 'function') {\n    window.fetch = function () {\n      var args = arguments;\n      var url = typeof args[0] === 'string' ? args[0] : (args[0] && args[0].url);\n      requestWasMade(url);\n      var p = origFetch.apply(this, args);\n      try {\n        p.then(function (res) {\n          if (!res) return;\n          noteServerCheck(url, res.status);\n          if (typeof res.clone !== 'function') return;\n          res.clone().text().then(function (t) { report(url, t); })['catch'](function () {});\n        })['catch'](function () {});\n      } catch (e) {}\n      return p;\n    };\n  }\n\n  try {\n    var xOpen = XMLHttpRequest.prototype.open;\n    var xSend = XMLHttpRequest.prototype.send;\n    XMLHttpRequest.prototype.open = function (m, u) { this.__vsUrl = u; requestWasMade(u); return xOpen.apply(this, arguments); };\n    XMLHttpRequest.prototype.send = function () {\n      var xhr = this;\n      xhr.addEventListener('load', function () {\n        try {\n          noteServerCheck(xhr.__vsUrl, xhr.status);\n          if (!xhr.responseType || xhr.responseType === 'text') report(xhr.__vsUrl, xhr.responseText);\n        } catch (e) {}\n      });\n      return xSend.apply(this, arguments);\n    };\n  } catch (e) {}\n\n  try {\n    var EA = Element.prototype.setAttribute;\n    Element.prototype.setAttribute = function (n, v) {\n      try {\n        if (typeof v === 'string' && (n === 'src' || n === 'data-src' || n === 'data-hls')) report(v, null);\n      } catch (e) {}\n      return EA.apply(this, arguments);\n    };\n  } catch (e) {}\n\n  try {\n    var MP = window.HTMLMediaElement && HTMLMediaElement.prototype;\n    if (MP) {\n      ['src', 'currentSrc'].forEach(function (prop) {\n        var d = Object.getOwnPropertyDescriptor(MP, prop);\n        if (!d || !d.set || !d.get) return;\n        Object.defineProperty(MP, prop, {\n          configurable: true,\n          enumerable: d.enumerable,\n          get: function () { return d.get.call(this); },\n          set: function (v) {\n            try { if (v && OPENABLE.test(v)) requestWasMade(v); } catch (e) {}\n            return d.set.call(this, v);\n          }\n        });\n      });\n    }\n  } catch (e) {}\n})();\ntrue;";
        f10972h = "(function () {\n  if (window.__exoChained) return;\n  window.__exoChained = true;\n  var post = function (p) {\n    try { window.ExoBridge.onEvent(JSON.stringify(p)); } catch (e) {}\n  };\n\n  var abs = function (u) {\n    try { return new URL(u, location.href).href; } catch (e) { return u; }\n  };\n\n  /** Ticks of the 250ms poll below: about 12s before a page with nothing on it is called dead. */\n  var STALL_TICKS = (window.__exoStallTicks || 48);\n\n  var tries = 0;\n  /** Set after the one nudge below: repeating it spams the page and burns the site's mint budget. */\n  var nudged = false;\n  var iv = setInterval(function () {\n    tries++;\n\n    // The player's own source is the only thing that ends the walk. Anything else a page mentions\n    // is a candidate, and ending on one hands the viewer a stream that was never addressable.\n    var live = (typeof window.__exoLiveStream === 'function') ? window.__exoLiveStream() : [];\n    if (live.length) {\n      clearInterval(iv);\n      post({ type: 'stream', urls: live });\n      return;\n    }\n\n    // The backup's own server checks all came back refused: it has nothing for this title. It\n    // reaches that verdict in a second or two, so the walk ends here rather than sitting on a page\n    // that will never change - which the viewer saw as an episode that kept loading.\n    if ((window.__exoNacFails || 0) >= 5) {\n      clearInterval(iv);\n      post({ type: 'exhausted', fails: window.__exoNacFails });\n      return;\n    }\n\n    // The site's own \"Session expired\u2026\" page: a verdict on the `vs` token, not a title without\n    // streams, and otherwise indistinguishable from a stall. Cheap checks, first ticks only.\n    if (tries <= 12 && (tries <= 1 || tries % 4 === 0)) {\n      var expired = false;\n      try {\n        if ((document.title || '').toLowerCase() === 'expired') expired = true;\n        var bodyText = (document.body && document.body.textContent) ? document.body.textContent : '';\n        if (bodyText.indexOf('Session expired') !== -1) expired = true;\n      } catch (e) {}\n      if (expired) {\n        clearInterval(iv);\n        post({ type: 'expired', where: location.href });\n        return;\n      }\n      // The same page carries this flag when the site is over its mint cap; its player then\n      // refuses to fetch at all, so the walk ends here rather than stalling.\n      try {\n        if (window.CONFIG && window.CONFIG.rateLimited) {\n          clearInterval(iv);\n          post({ type: 'limited' });\n          return;\n        }\n      } catch (e) {}\n    }\n\n    // One nudge per page, at a real control only: repeating it spams the page, and a player that\n    // re-requests its stream list on interaction turns clicks into token mints.\n    if (!nudged && tries > 4) {\n      nudged = true;\n      try {\n        // Not `[id*='play']`: that matches the player container, which is not a control.\n        var playBtn = document.querySelector(\n          \"button[id*='play' i], button[class*='play' i], [role='button'][aria-label*='play' i], \" +\n          \"[role='button'][title*='play' i], .jw-icon-display, .jw-display-icon-container\"\n        );\n        if (playBtn && playBtn.tagName && playBtn.tagName !== 'VIDEO' &&\n            typeof playBtn.click === 'function') {\n          playBtn.click();\n        }\n      } catch (e) {}\n      try {\n        var media = document.querySelector('video');\n        if (media && media.paused && typeof media.play === 'function') {\n          var p = media.play();\n          if (p && p.catch) p.catch(function () {});\n        }\n      } catch (e) {}\n    }\n\n    // Hop rules, which belong to the primary's two-page chain: its landing page names the player\n    // in window.CFG, and its embed fills #player_iframe from /vs_src.php. The backup is a single\n    // page whose iframes are ad slots - following one of those is a walk into an advert - so it\n    // disables this whole block.\n    if (window.__exoNoHops !== true) {\n      // Player landing: window.CFG carries the nested player URL, usually relative.\n      var CFG = window.CFG;\n      if (CFG && CFG.playerUrl) {\n        var landed = document.getElementById(\"player_frame\");\n        if (landed && landed.src) {\n          clearInterval(iv);\n          post({ type: 'hop', url: abs(landed.src) });\n          return;\n        }\n        var btn = document.getElementById(\"bigPlay\") || document.getElementById(\"play\");\n        if (btn) { try { btn.click(); } catch (e) {} }\n        clearInterval(iv);\n        post({ type: 'hop', url: abs(CFG.playerUrl) });\n        return;\n      }\n\n      // Embed landing: #player_iframe.src is filled in async from /vs_src.php.\n      var frame = document.getElementById(\"player_iframe\");\n      if (frame && frame.src && frame.src.indexOf(\"about:\") !== 0) {\n        clearInterval(iv);\n        post({ type: 'hop', url: abs(frame.src) });\n        return;\n      }\n\n      var others = document.querySelectorAll(\"iframe[src]\");\n      for (var i = 0; i < others.length; i++) {\n        var s = others[i].src;\n        if (s && s.indexOf(\"about:\") !== 0) {\n          clearInterval(iv);\n          post({ type: 'hop', url: abs(s) });\n          return;\n        }\n      }\n    }\n\n    if (tries > STALL_TICKS) {\n      clearInterval(iv);\n      post({ type: 'stall', where: location.href, tries: tries });\n    }\n  }, 250);\n})();\ntrue;";
    }

    /* renamed from: e */
    public static boolean m5098e(String str) {
        LocalDate localDateNow = LocalDate.now();
        AbstractC2980h.m5136e("today", localDateNow);
        if (str == null || AbstractC1206h.m2630D0(str)) {
            return false;
        }
        try {
            return LocalDate.parse(AbstractC1206h.m2645S0(str).toString(), DateTimeFormatter.ISO_LOCAL_DATE).isAfter(localDateNow);
        } catch (DateTimeParseException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static String m5099f(String str) {
        String strM2646T0;
        String str2;
        AbstractC2980h.m5136e("tmdbId", str);
        C0586i c0586i = C0585h.f2325a;
        if (c0586i == null || (str2 = c0586i.f2345t) == null || (strM2646T0 = AbstractC1206h.m2646T0(str2, '/')) == null || strM2646T0.length() <= 0) {
            strM2646T0 = null;
        }
        if (strM2646T0 == null) {
            return null;
        }
        return strM2646T0 + "/movie/" + str + ".json";
    }

    /* renamed from: h */
    public static String m5100h(String str) {
        int iM2628B0;
        if (str == null || AbstractC1206h.m2630D0(str) || (iM2628B0 = AbstractC1206h.m2628B0(str, "://", 0, false, 6)) <= 0) {
            return null;
        }
        int iM2627A0 = AbstractC1206h.m2627A0(str, '/', iM2628B0 + 3, 4);
        if (iM2627A0 >= 0) {
            str = str.substring(0, iM2627A0);
            AbstractC2980h.m5135d("substring(...)", str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC2980h.m5135d("toLowerCase(...)", lowerCase);
        return lowerCase;
    }

    /* renamed from: l */
    public static String m5101l(String str) {
        String strM2646T0;
        String str2;
        AbstractC2980h.m5136e("tmdbId", str);
        C0586i c0586i = C0585h.f2325a;
        if (c0586i == null || (str2 = c0586i.f2345t) == null || (strM2646T0 = AbstractC1206h.m2646T0(str2, '/')) == null || strM2646T0.length() <= 0) {
            strM2646T0 = null;
        }
        if (strM2646T0 == null) {
            return null;
        }
        return strM2646T0 + "/tv/" + str + ".json";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5102a(Activity activity, String str, int i, int i4, boolean z7, AbstractC2320c abstractC2320c) throws Throwable {
        C2960p c2960p;
        String strM2646T0;
        String str2;
        String str3;
        if (abstractC2320c instanceof C2960p) {
            c2960p = (C2960p) abstractC2320c;
            int i8 = c2960p.f11037o;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2960p.f11037o = i8 - Integer.MIN_VALUE;
            } else {
                c2960p = new C2960p(this, abstractC2320c);
            }
        }
        C2960p c2960p2 = c2960p;
        Object objM5111n = c2960p2.f11035m;
        Object obj = EnumC2273a.f7953j;
        int i9 = c2960p2.f11037o;
        if (i9 == 0) {
            AbstractC0714c.m1516d0(objM5111n);
            C0586i c0586i = C0585h.f2325a;
            if (c0586i == null || (str3 = c0586i.f2349x) == null || (strM2646T0 = AbstractC1206h.m2646T0(str3, '/')) == null || strM2646T0.length() <= 0) {
                strM2646T0 = null;
            }
            if (strM2646T0 == null) {
                Log.w("ResolverChain", "backup: no vidcoreBase in the server config");
                return null;
            }
            if (z7) {
                EnumC2959o enumC2959o = EnumC2959o.f11031k;
                str2 = "primary gave nothing; trying vidcore";
            } else {
                EnumC2959o enumC2959o2 = EnumC2959o.f11031k;
                str2 = "trying vidcore";
            }
            Log.i("ResolverChain", str2);
            EnumC2959o enumC2959o3 = EnumC2959o.f11032l;
            c2960p2.f11037o = 1;
            objM5111n = m5111n(activity, enumC2959o3, str, i, i4, null, 1, c2960p2);
            if (objM5111n == obj) {
                return obj;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0714c.m1516d0(objM5111n);
        }
        C2958n c2958n = (C2958n) objM5111n;
        if (c2958n.f11026a.isEmpty()) {
            return null;
        }
        f10967c = null;
        return c2958n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r12 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5103b(String str, int i, int i4, AbstractC2320c abstractC2320c) throws Throwable {
        C2961q c2961q;
        C2760c c2760c;
        if (abstractC2320c instanceof C2961q) {
            c2961q = (C2961q) abstractC2320c;
            int i8 = c2961q.f11040o;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2961q.f11040o = i8 - Integer.MIN_VALUE;
            } else {
                c2961q = new C2961q(this, abstractC2320c);
            }
        }
        Object objM4848c = c2961q.f11038m;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i9 = c2961q.f11040o;
        try {
            if (i9 == 0) {
                AbstractC0714c.m1516d0(objM4848c);
                if (i < 0 || i4 < 0) {
                    C2768k c2768k = C2768k.f10237a;
                    c2961q.f11040o = 2;
                    objM4848c = C2768k.m4848c(str, c2961q);
                } else {
                    C2768k c2768k2 = C2768k.f10237a;
                    c2961q.f11040o = 1;
                    objM4848c = C2768k.m4849d(str, i, i4, c2961q);
                    if (objM4848c == enumC2273a) {
                    }
                    c2760c = (C2760c) objM4848c;
                }
                return enumC2273a;
            }
            if (i9 == 1) {
                AbstractC0714c.m1516d0(objM4848c);
                c2760c = (C2760c) objM4848c;
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0714c.m1516d0(objM4848c);
                c2760c = (C2760c) objM4848c;
            }
            return new C2956m(c2760c, false, false);
        } catch (CancellationException e) {
            throw e;
        } catch (C2762e unused) {
            Log.i("ResolverChain", "primary has no source for this title; skipping its walk");
            return new C2956m(null, false, true);
        } catch (Exception e8) {
            String message = e8.getMessage();
            boolean z7 = message != null && AbstractC1206h.m2649u0(message, "rate limit", true);
            Log.i("ResolverChain", "could not reach the gate's chain: " + e8.getMessage());
            return new C2956m(null, z7, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5104c(String str, AbstractC2320c abstractC2320c) {
        C2962r c2962r;
        if (abstractC2320c instanceof C2962r) {
            c2962r = (C2962r) abstractC2320c;
            int i = c2962r.f11044p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2962r.f11044p = i - Integer.MIN_VALUE;
            } else {
                c2962r = new C2962r(this, abstractC2320c);
            }
        }
        Object objM2857r = c2962r.f11042n;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c2962r.f11044p;
        HashMap map = f10968d;
        InterfaceC2222c interfaceC2222c = null;
        int i8 = 1;
        if (i4 == 0) {
            AbstractC0714c.m1516d0(objM2857r);
            if (str != null) {
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject != null) {
                    return jSONObject;
                }
                C2768k c2768k = C2768k.f10237a;
                c2962r.f11041m = str;
                c2962r.f11044p = 1;
                C2054e c2054e = AbstractC1290e0.f5316a;
                objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2765h(str, interfaceC2222c, i8), c2962r);
                if (objM2857r == enumC2273a) {
                    return enumC2273a;
                }
            }
            return null;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = c2962r.f11041m;
        AbstractC0714c.m1516d0(objM2857r);
        JSONObject jSONObject2 = (JSONObject) objM2857r;
        if (jSONObject2 != null) {
            if (map.size() > 128) {
                map.clear();
            }
            map.put(str, jSONObject2);
            return jSONObject2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5105d(int i, int i4, String str, String str2, AbstractC2320c abstractC2320c) throws Throwable {
        C2963s c2963s;
        String str3;
        String str4;
        if (abstractC2320c instanceof C2963s) {
            c2963s = (C2963s) abstractC2320c;
            int i8 = c2963s.f11047o;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2963s.f11047o = i8 - Integer.MIN_VALUE;
            } else {
                c2963s = new C2963s(this, abstractC2320c);
            }
        }
        Object objM4850e = c2963s.f11045m;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i9 = c2963s.f11047o;
        try {
            if (i9 == 0) {
                AbstractC0714c.m1516d0(objM4850e);
                if (i < 0 || i4 < 0) {
                    str3 = str + "/embed/movie/" + str2;
                } else {
                    str3 = str + "/embed/tv/" + str2 + "/" + i + "/" + i4;
                }
                C2768k c2768k = C2768k.f10237a;
                if (i < 0 || i4 < 0) {
                    str4 = str + "/vs_src.php?type=movie&id=" + str2;
                } else {
                    str4 = str + "/vs_src.php?type=tv&id=" + str2 + "&season=" + i + "&episode=" + i4;
                }
                c2963s.f11047o = 1;
                objM4850e = C2768k.m4850e(str4, str3, c2963s);
                if (objM4850e == enumC2273a) {
                    return enumC2273a;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0714c.m1516d0(objM4850e);
            }
            String strOptString = ((JSONObject) objM4850e).optString("src");
            AbstractC2980h.m5133b(strOptString);
            if (strOptString.length() > 0) {
                if (!strOptString.equals("null")) {
                    return strOptString;
                }
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e8) {
            Log.i("ResolverChain", "browser walk could not ask the gate for a player: " + e8.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5106g(String str, AbstractC2320c abstractC2320c) {
        C2964t c2964t;
        C2945g0 c2945g0;
        String strOptString;
        if (abstractC2320c instanceof C2964t) {
            c2964t = (C2964t) abstractC2320c;
            int i = c2964t.f11051p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2964t.f11051p = i - Integer.MIN_VALUE;
            } else {
                c2964t = new C2964t(this, abstractC2320c);
            }
        }
        Object objM5104c = c2964t.f11049n;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c2964t.f11051p;
        if (i4 == 0) {
            AbstractC0714c.m1516d0(objM5104c);
            String strM5099f = m5099f(str);
            c2964t.f11048m = this;
            c2964t.f11051p = 1;
            objM5104c = m5104c(strM5099f, c2964t);
            if (objM5104c == enumC2273a) {
                return enumC2273a;
            }
            c2945g0 = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2945g0 = c2964t.f11048m;
            AbstractC0714c.m1516d0(objM5104c);
        }
        JSONObject jSONObject = (JSONObject) objM5104c;
        c2945g0.getClass();
        if (jSONObject == null || (strOptString = jSONObject.optString("quality")) == null || AbstractC1206h.m2630D0(strOptString) || strOptString.equals("null")) {
            return null;
        }
        return strOptString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0103, code lost:
    
        if (r4 != r5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5107i(Activity activity, String str, int i, int i4, AbstractC2320c abstractC2320c) throws Throwable {
        C2965u c2965u;
        String strM2646T0;
        Activity activity2;
        Object objM5108j;
        C2945g0 c2945g0;
        String str2;
        Activity activity3;
        int i8;
        C2945g0 c2945g02;
        String str3;
        C2760c c2760c;
        String str4 = str;
        int i9 = i;
        int i10 = i4;
        if (abstractC2320c instanceof C2965u) {
            c2965u = (C2965u) abstractC2320c;
            int i11 = c2965u.f11059t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2965u.f11059t = i11 - Integer.MIN_VALUE;
            } else {
                c2965u = new C2965u(this, abstractC2320c);
            }
        }
        C2965u c2965u2 = c2965u;
        Object objM5111n = c2965u2.f11057r;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i12 = c2965u2.f11059t;
        if (i12 == 0) {
            AbstractC0714c.m1516d0(objM5111n);
            C0586i c0586i = C0585h.f2325a;
            if (c0586i == null || (str2 = c0586i.f2344s) == null || (strM2646T0 = AbstractC1206h.m2646T0(str2, '/')) == null || strM2646T0.length() <= 0) {
                strM2646T0 = null;
            }
            if (strM2646T0 == null) {
                Log.i("ResolverChain", "primary: no gateBase in the server config");
                return null;
            }
            c2965u2.f11052m = this;
            activity2 = activity;
            c2965u2.f11053n = activity2;
            c2965u2.f11054o = str4;
            c2965u2.f11055p = i9;
            c2965u2.f11056q = i10;
            c2965u2.f11059t = 1;
            objM5108j = m5108j(str4, i9, i10, c2965u2);
            if (objM5108j != enumC2273a) {
                c2945g0 = this;
            }
            return enumC2273a;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0714c.m1516d0(objM5111n);
                C2958n c2958n = (C2958n) objM5111n;
                if (c2958n.f11026a.isEmpty()) {
                    return null;
                }
                return c2958n;
            }
            int i13 = c2965u2.f11056q;
            i9 = c2965u2.f11055p;
            String str5 = c2965u2.f11054o;
            activity3 = c2965u2.f11053n;
            c2945g02 = c2965u2.f11052m;
            AbstractC0714c.m1516d0(objM5111n);
            i8 = i13;
            str3 = str5;
            C2956m c2956m = (C2956m) objM5111n;
            c2760c = c2956m.f11019a;
            if (c2760c == null || !c2956m.f11021c) {
                if (c2760c != null && c2956m.f11020b) {
                    f10967c = EnumC2954l.f11015j;
                    Log.w("ResolverChain", "primary: site is rate limiting this connection");
                    return null;
                }
                Activity activity4 = activity3;
                C2945g0 c2945g03 = c2945g02;
                EnumC2959o enumC2959o = EnumC2959o.f11031k;
                c2965u2.f11052m = null;
                c2965u2.f11053n = null;
                c2965u2.f11054o = null;
                c2965u2.f11059t = 3;
                objM5111n = c2945g03.m5111n(activity4, enumC2959o, str3, i9, i8, c2760c, 1, c2965u2);
            }
            return null;
        }
        int i14 = c2965u2.f11056q;
        i9 = c2965u2.f11055p;
        String str6 = c2965u2.f11054o;
        Activity activity5 = c2965u2.f11053n;
        c2945g0 = c2965u2.f11052m;
        AbstractC0714c.m1516d0(objM5111n);
        i10 = i14;
        str4 = str6;
        objM5108j = objM5111n;
        activity2 = activity5;
        if (!((Boolean) objM5108j).booleanValue()) {
            EnumC2959o enumC2959o2 = EnumC2959o.f11031k;
            Log.i("ResolverChain", "primary has no stream for this title; going straight to vidcore");
            return null;
        }
        c2965u2.f11052m = c2945g0;
        c2965u2.f11053n = activity2;
        c2965u2.f11054o = str4;
        c2965u2.f11055p = i9;
        c2965u2.f11056q = i10;
        c2965u2.f11059t = 2;
        Object objM5103b = c2945g0.m5103b(str4, i9, i10, c2965u2);
        if (objM5103b != enumC2273a) {
            activity3 = activity2;
            objM5111n = objM5103b;
            i8 = i10;
            c2945g02 = c2945g0;
            str3 = str4;
            C2956m c2956m2 = (C2956m) objM5111n;
            c2760c = c2956m2.f11019a;
            if (c2760c == null) {
            }
            if (c2760c != null) {
            }
            Activity activity42 = activity3;
            C2945g0 c2945g032 = c2945g02;
            EnumC2959o enumC2959o3 = EnumC2959o.f11031k;
            c2965u2.f11052m = null;
            c2965u2.f11053n = null;
            c2965u2.f11054o = null;
            c2965u2.f11059t = 3;
            objM5111n = c2945g032.m5111n(activity42, enumC2959o3, str3, i9, i8, c2760c, 1, c2965u2);
        }
        return enumC2273a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5108j(String str, int i, int i4, AbstractC2320c abstractC2320c) throws Throwable {
        C2966v c2966v;
        C2945g0 c2945g0;
        int i8;
        long j;
        Object objOpt;
        String string;
        Integer numM2658k0;
        JSONArray jSONArrayOptJSONArray;
        if (abstractC2320c instanceof C2966v) {
            c2966v = (C2966v) abstractC2320c;
            int i9 = c2966v.f11066s;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2966v.f11066s = i9 - Integer.MIN_VALUE;
            } else {
                c2966v = new C2966v(this, abstractC2320c);
            }
        }
        Object objM2858s = c2966v.f11064q;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i10 = c2966v.f11066s;
        boolean z7 = true;
        if (i10 == 0) {
            AbstractC0714c.m1516d0(objM2858s);
            String strM5099f = (i < 0 || i4 < 0) ? m5099f(str) : m5101l(str);
            if (strM5099f == null) {
                return Boolean.TRUE;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0581d c0581d = new C0581d(strM5099f, null, 1);
            c2966v.f11060m = this;
            c2966v.f11061n = i;
            c2966v.f11062o = i4;
            c2966v.f11063p = jCurrentTimeMillis;
            c2966v.f11066s = 1;
            objM2858s = AbstractC1339x.m2858s(6000L, c0581d, c2966v);
            if (objM2858s == enumC2273a) {
                return enumC2273a;
            }
            c2945g0 = this;
            i8 = i;
            j = jCurrentTimeMillis;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c2966v.f11063p;
            i4 = c2966v.f11062o;
            i8 = c2966v.f11061n;
            c2945g0 = c2966v.f11060m;
            AbstractC0714c.m1516d0(objM2858s);
        }
        JSONObject jSONObject = (JSONObject) objM2858s;
        c2945g0.getClass();
        if (jSONObject == null || (objOpt = jSONObject.opt("status_code")) == null || (string = objOpt.toString()) == null || (numM2658k0 = AbstractC1213o.m2658k0(string)) == null || numM2658k0.intValue() != 200) {
            z7 = false;
        } else if (i8 >= 0 && i4 >= 0 && (jSONArrayOptJSONArray = jSONObject.optJSONArray("seasons")) != null) {
            int length = jSONArrayOptJSONArray.length();
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt("season", -1) == i8) {
                    int iOptInt = jSONObjectOptJSONObject.optInt("first_episode", -1);
                    int iOptInt2 = jSONObjectOptJSONObject.optInt("last_episode", -1);
                    if (iOptInt >= 0 && iOptInt2 >= iOptInt && (iOptInt > i4 || i4 > iOptInt2)) {
                        break;
                    }
                } else {
                    i11++;
                }
            }
            z7 = false;
        }
        String str2 = z7 ? "has this title" : "does not have it";
        Log.i("ResolverChain", "primary info: " + str2 + " (" + (System.currentTimeMillis() - j) + "ms)");
        return Boolean.valueOf(z7);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4 A[Catch: CancellationException -> 0x0045, LinkageError -> 0x010b, Exception -> 0x010e, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x0045, blocks: (B:15:0x0038, B:63:0x0107, B:26:0x005c, B:57:0x00f0, B:59:0x00f4, B:33:0x0071, B:51:0x00c8, B:43:0x00a9, B:48:0x00b2, B:53:0x00cc), top: B:91:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5109k(Activity activity, String str, int i, int i4, AbstractC2320c abstractC2320c) {
        C2967w c2967w;
        C2958n c2958n;
        C2945g0 c2945g0;
        Activity activity2;
        String str2;
        int i8;
        int i9;
        String str3;
        String str4;
        String str5 = str;
        if (abstractC2320c instanceof C2967w) {
            c2967w = (C2967w) abstractC2320c;
            int i10 = c2967w.f11074t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2967w.f11074t = i10 - Integer.MIN_VALUE;
            } else {
                c2967w = new C2967w(this, abstractC2320c);
            }
        }
        C2967w c2967w2 = c2967w;
        Object objM5107i = c2967w2.f11072r;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        ?? r1 = c2967w2.f11074t;
        try {
            try {
                try {
                    if (r1 == 0) {
                        AbstractC0714c.m1516d0(objM5107i);
                        if (!f10966b) {
                            f10966b = true;
                            int i11 = Build.VERSION.SDK_INT;
                            if (i11 < 26) {
                                EnumC2959o enumC2959o = EnumC2959o.f11031k;
                                str3 = "vidcore only";
                            } else {
                                EnumC2959o enumC2959o2 = EnumC2959o.f11031k;
                                str3 = "BROWSER, vidcore fallback";
                            }
                            Log.i("ResolverChain", "API " + i11 + " mode: " + str3);
                        }
                        f10967c = null;
                        try {
                            if (Build.VERSION.SDK_INT < 26) {
                                c2967w2.f11067m = this;
                                c2967w2.f11068n = str5;
                                c2967w2.f11074t = 1;
                                objM5107i = m5102a(activity, str5, i, i4, false, c2967w2);
                                if (objM5107i == enumC2273a) {
                                }
                                c2958n = (C2958n) objM5107i;
                            } else {
                                c2967w2.f11067m = this;
                                c2967w2.f11068n = activity;
                                c2967w2.f11069o = str5;
                                c2967w2.f11070p = i;
                                c2967w2.f11071q = i4;
                                c2967w2.f11074t = 2;
                                objM5107i = m5107i(activity, str5, i, i4, c2967w2);
                                if (objM5107i != enumC2273a) {
                                    c2945g0 = this;
                                    activity2 = activity;
                                    str2 = str;
                                    i8 = i;
                                    i9 = i4;
                                    c2958n = (C2958n) objM5107i;
                                    if (c2958n != null) {
                                    }
                                }
                            }
                            return enumC2273a;
                        } catch (Exception e) {
                            e = e;
                            str5 = str;
                            Log.i("ResolverChain", "resolve failed: " + e.getMessage());
                            c2958n = null;
                            if (c2958n == null) {
                            }
                            if (f10967c == null) {
                            }
                            EnumC2954l enumC2954l = f10967c;
                            if (enumC2954l != null) {
                            }
                            Log.w("ResolverChain", "the resolve failed for " + str5 + " (" + (enumC2954l != null ? enumC2954l.name() : null) + ")");
                            return null;
                        } catch (LinkageError e8) {
                            e = e8;
                            str5 = str;
                            Log.i("ResolverChain", "resolve failed: " + e.getMessage());
                            c2958n = null;
                            if (c2958n == null) {
                            }
                            if (f10967c == null) {
                            }
                            EnumC2954l enumC2954l2 = f10967c;
                            if (enumC2954l2 != null) {
                            }
                            Log.w("ResolverChain", "the resolve failed for " + str5 + " (" + (enumC2954l2 != null ? enumC2954l2.name() : null) + ")");
                            return null;
                        }
                    }
                    if (r1 == 1) {
                        String str6 = (String) c2967w2.f11068n;
                        AbstractC0714c.m1516d0(objM5107i);
                        str5 = str6;
                        c2958n = (C2958n) objM5107i;
                    } else if (r1 == 2) {
                        i9 = c2967w2.f11071q;
                        int i12 = c2967w2.f11070p;
                        String str7 = c2967w2.f11069o;
                        Activity activity3 = (Activity) c2967w2.f11068n;
                        C2945g0 c2945g02 = c2967w2.f11067m;
                        AbstractC0714c.m1516d0(objM5107i);
                        i8 = i12;
                        c2945g0 = c2945g02;
                        str2 = str7;
                        activity2 = activity3;
                        try {
                            c2958n = (C2958n) objM5107i;
                            if (c2958n != null) {
                                c2967w2.f11067m = c2945g0;
                                c2967w2.f11068n = str2;
                                c2967w2.f11069o = null;
                                c2967w2.f11074t = 3;
                                objM5107i = c2945g0.m5102a(activity2, str2, i8, i9, true, c2967w2);
                                if (objM5107i != enumC2273a) {
                                    str4 = str2;
                                    c2958n = (C2958n) objM5107i;
                                    str5 = str4;
                                }
                                return enumC2273a;
                            }
                            str5 = str2;
                        } catch (Exception e9) {
                            e = e9;
                            str5 = str2;
                            Log.i("ResolverChain", "resolve failed: " + e.getMessage());
                            c2958n = null;
                            if (c2958n == null) {
                            }
                            if (f10967c == null) {
                            }
                            EnumC2954l enumC2954l22 = f10967c;
                            if (enumC2954l22 != null) {
                            }
                            Log.w("ResolverChain", "the resolve failed for " + str5 + " (" + (enumC2954l22 != null ? enumC2954l22.name() : null) + ")");
                            return null;
                        } catch (LinkageError e10) {
                            e = e10;
                            str5 = str2;
                            Log.i("ResolverChain", "resolve failed: " + e.getMessage());
                            c2958n = null;
                            if (c2958n == null) {
                            }
                            if (f10967c == null) {
                            }
                            EnumC2954l enumC2954l222 = f10967c;
                            if (enumC2954l222 != null) {
                            }
                            Log.w("ResolverChain", "the resolve failed for " + str5 + " (" + (enumC2954l222 != null ? enumC2954l222.name() : null) + ")");
                            return null;
                        }
                    } else {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str4 = (String) c2967w2.f11068n;
                        AbstractC0714c.m1516d0(objM5107i);
                        c2958n = (C2958n) objM5107i;
                        str5 = str4;
                    }
                } catch (CancellationException e11) {
                    throw e11;
                }
            } catch (Exception e12) {
                e = e12;
            } catch (LinkageError e13) {
                e = e13;
            }
        } catch (Exception e14) {
            e = e14;
            str5 = r1;
        } catch (LinkageError e15) {
            e = e15;
            str5 = r1;
        }
        if (c2958n == null && !c2958n.f11026a.isEmpty()) {
            return c2958n;
        }
        if (f10967c == null) {
            f10967c = EnumC2954l.f11016k;
        }
        EnumC2954l enumC2954l2222 = f10967c;
        Log.w("ResolverChain", "the resolve failed for " + str5 + " (" + (enumC2954l2222 != null ? enumC2954l2222.name() : null) + ")");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5110m(String str, AbstractC2320c abstractC2320c) {
        C2968x c2968x;
        C2945g0 c2945g0;
        String strOptString;
        if (abstractC2320c instanceof C2968x) {
            c2968x = (C2968x) abstractC2320c;
            int i = c2968x.f11078p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2968x.f11078p = i - Integer.MIN_VALUE;
            } else {
                c2968x = new C2968x(this, abstractC2320c);
            }
        }
        Object objM5104c = c2968x.f11076n;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c2968x.f11078p;
        if (i4 == 0) {
            AbstractC0714c.m1516d0(objM5104c);
            String strM5101l = m5101l(str);
            c2968x.f11075m = this;
            c2968x.f11078p = 1;
            objM5104c = m5104c(strM5101l, c2968x);
            if (objM5104c == enumC2273a) {
                return enumC2273a;
            }
            c2945g0 = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2945g0 = c2968x.f11075m;
            AbstractC0714c.m1516d0(objM5104c);
        }
        JSONObject jSONObject = (JSONObject) objM5104c;
        c2945g0.getClass();
        if (jSONObject == null || (strOptString = jSONObject.optString("quality")) == null || AbstractC1206h.m2630D0(strOptString) || strOptString.equals("null")) {
            return null;
        }
        return strOptString;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0274  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5111n(Activity activity, EnumC2959o enumC2959o, String str, int i, int i4, C2760c c2760c, int i8, AbstractC2320c abstractC2320c) throws Throwable {
        C2969y c2969y;
        C2945g0 c2945g0;
        String str2;
        String str3;
        Activity activity2;
        EnumC2959o enumC2959o2;
        int i9;
        String str4;
        int i10;
        C2945g0 c2945g02;
        String str5;
        Object objM5105d;
        String str6;
        C2945g0 c2945g03;
        String str7;
        String str8;
        C2945g0 c2945g04;
        String strM2646T0;
        String str9;
        String str10;
        String strM2646T02;
        Object objM5112o;
        C2983k c2983k;
        EnumC2959o enumC2959o3;
        String str11;
        int i11;
        int i12;
        Activity activity3;
        C2958n c2958n;
        String str12;
        C2759b c2759b;
        C2958n c2958n2;
        Object objM5103b;
        String str13;
        C2760c c2760c2;
        String str14 = str;
        int i13 = i;
        int i14 = i4;
        C2760c c2760c3 = c2760c;
        C2945g0 c2945g05 = f10965a;
        if (abstractC2320c instanceof C2969y) {
            c2969y = (C2969y) abstractC2320c;
            int i15 = c2969y.f11090x;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c2969y.f11090x = i15 - Integer.MIN_VALUE;
            } else {
                c2969y = new C2969y(this, abstractC2320c);
            }
        }
        C2969y c2969y2 = c2969y;
        Object objM2858s = c2969y2.f11088v;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i16 = c2969y2.f11090x;
        if (i16 == 0) {
            AbstractC0714c.m1516d0(objM2858s);
            C0586i c0586i = C0585h.f2325a;
            if (c0586i == null || (str10 = c0586i.f2344s) == null || (strM2646T02 = AbstractC1206h.m2646T0(str10, '/')) == null || strM2646T02.length() <= 0) {
                c2945g0 = c2945g05;
                str2 = null;
            } else {
                str2 = strM2646T02;
                c2945g0 = c2945g05;
            }
            if (str2 == null) {
                str3 = null;
            } else if (i13 < 0 || i14 < 0) {
                str3 = str2 + "/embed/movie/" + str14;
            } else {
                str3 = str2 + "/embed/tv/" + str14 + "/" + i13 + "/" + i14;
            }
            int iOrdinal = enumC2959o.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new C0048u();
                }
                C0586i c0586i2 = C0585h.f2325a;
                if (c0586i2 == null || (str9 = c0586i2.f2349x) == null || (strM2646T0 = AbstractC1206h.m2646T0(str9, '/')) == null || strM2646T0.length() <= 0) {
                    strM2646T0 = null;
                }
                if (strM2646T0 == null) {
                    throw new IOException("no vidcoreBase in the server config");
                }
                AbstractC2980h.m5136e("tmdbId", str14);
                if (i13 < 0 || i14 < 0) {
                    str7 = strM2646T0 + "/movie/" + str14 + "?autoplay=true";
                } else {
                    str7 = strM2646T0 + "/tv/" + str14 + "/" + i13 + "/" + i14 + "?autoPlay=true";
                }
            } else {
                if (c2760c3 != null && (str8 = c2760c3.f10212b) != null) {
                    activity2 = activity;
                    enumC2959o2 = enumC2959o;
                    i9 = i8;
                    str7 = str8;
                    c2945g04 = this;
                    C0649b c0649b = new C0649b(enumC2959o2, str3, str7, 1);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    ArrayList arrayList = new ArrayList();
                    C2986n c2986n = new C2986n();
                    c2986n.f11117j = str7;
                    C2986n c2986n2 = new C2986n();
                    c2986n2.f11117j = str7;
                    C2986n c2986n3 = new C2986n();
                    C2983k c2983k2 = new C2983k();
                    C2984l c2984l = new C2984l();
                    C1313m c1313m = new C1313m(true);
                    c1313m.m2746C(null);
                    EnumC2959o enumC2959o4 = EnumC2959o.f11032l;
                    int i17 = enumC2959o2 != enumC2959o4 ? 90 : 48;
                    long j = enumC2959o2 != enumC2959o4 ? 65000L : 25000L;
                    Log.i("ResolverChain", enumC2959o2.f11034j + " walk (attempt " + i9 + ") starts at " + AbstractC1206h.m2644R0(96, str7));
                    C2941e0 c2941e0 = new C2941e0(j, str7, c1313m, enumC2959o2, c2984l, c2986n2, linkedHashSet, i17, c2983k2, arrayList, c2986n3, c2986n, c0649b, null);
                    c2969y2.f11079m = activity2;
                    c2969y2.f11080n = enumC2959o2;
                    c2969y2.f11081o = str14;
                    c2969y2.f11082p = c2760c3;
                    c2969y2.f11083q = c2983k2;
                    c2969y2.f11084r = null;
                    c2969y2.f11085s = i13;
                    c2969y2.f11086t = i14;
                    c2969y2.f11087u = i9;
                    c2969y2.f11090x = 2;
                    objM5112o = c2945g04.m5112o(activity2, c2941e0, c2969y2);
                    if (objM5112o != enumC2273a) {
                    }
                }
                if (c2760c3 == null) {
                    if (str2 != null) {
                        c2969y2.f11079m = this;
                        activity2 = activity;
                        c2969y2.f11080n = activity2;
                        enumC2959o2 = enumC2959o;
                        c2969y2.f11081o = enumC2959o2;
                        c2969y2.f11082p = str14;
                        c2969y2.f11083q = c2760c3;
                        c2969y2.f11084r = str3;
                        c2969y2.f11085s = i13;
                        c2969y2.f11086t = i14;
                        i9 = i8;
                        c2969y2.f11087u = i9;
                        c2969y2.f11090x = 1;
                        objM5105d = c2945g0.m5105d(i13, i14, str2, str14, c2969y2);
                        if (objM5105d != enumC2273a) {
                            str4 = str;
                            i10 = i;
                            i14 = i4;
                            str6 = str3;
                            c2945g03 = this;
                        }
                    }
                    activity2 = activity;
                    enumC2959o2 = enumC2959o;
                    i9 = i8;
                    str4 = str;
                    i10 = i;
                    i14 = i4;
                    c2945g02 = this;
                    str5 = null;
                    if (str5 == null) {
                        int i18 = i10;
                        str14 = str4;
                        i13 = i18;
                        String str15 = str5;
                        c2945g04 = c2945g02;
                        str7 = str15;
                    } else {
                        if (str3 == null) {
                            throw new IOException("no gateBase in the server config");
                        }
                        int i19 = i10;
                        str14 = str4;
                        i13 = i19;
                        c2945g04 = c2945g02;
                        str7 = str3;
                    }
                    C0649b c0649b2 = new C0649b(enumC2959o2, str3, str7, 1);
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    ArrayList arrayList2 = new ArrayList();
                    C2986n c2986n4 = new C2986n();
                    c2986n4.f11117j = str7;
                    C2986n c2986n22 = new C2986n();
                    c2986n22.f11117j = str7;
                    C2986n c2986n32 = new C2986n();
                    C2983k c2983k22 = new C2983k();
                    C2984l c2984l2 = new C2984l();
                    C1313m c1313m2 = new C1313m(true);
                    c1313m2.m2746C(null);
                    EnumC2959o enumC2959o42 = EnumC2959o.f11032l;
                    int i172 = enumC2959o2 != enumC2959o42 ? 90 : 48;
                    long j8 = enumC2959o2 != enumC2959o42 ? 65000L : 25000L;
                    Log.i("ResolverChain", enumC2959o2.f11034j + " walk (attempt " + i9 + ") starts at " + AbstractC1206h.m2644R0(96, str7));
                    C2941e0 c2941e02 = new C2941e0(j8, str7, c1313m2, enumC2959o2, c2984l2, c2986n22, linkedHashSet2, i172, c2983k22, arrayList2, c2986n32, c2986n4, c0649b2, null);
                    c2969y2.f11079m = activity2;
                    c2969y2.f11080n = enumC2959o2;
                    c2969y2.f11081o = str14;
                    c2969y2.f11082p = c2760c3;
                    c2969y2.f11083q = c2983k22;
                    c2969y2.f11084r = null;
                    c2969y2.f11085s = i13;
                    c2969y2.f11086t = i14;
                    c2969y2.f11087u = i9;
                    c2969y2.f11090x = 2;
                    objM5112o = c2945g04.m5112o(activity2, c2941e02, c2969y2);
                    if (objM5112o != enumC2273a) {
                        c2983k = c2983k22;
                        enumC2959o3 = enumC2959o2;
                        str11 = str14;
                        i11 = i13;
                        i12 = i9;
                        activity3 = activity2;
                        c2958n = (C2958n) objM5112o;
                        if (!c2958n.f11026a.isEmpty()) {
                        }
                    }
                }
                str7 = c2760c3.f10211a;
            }
            activity2 = activity;
            enumC2959o2 = enumC2959o;
            i9 = i8;
            c2945g04 = this;
            C0649b c0649b22 = new C0649b(enumC2959o2, str3, str7, 1);
            LinkedHashSet linkedHashSet22 = new LinkedHashSet();
            ArrayList arrayList22 = new ArrayList();
            C2986n c2986n42 = new C2986n();
            c2986n42.f11117j = str7;
            C2986n c2986n222 = new C2986n();
            c2986n222.f11117j = str7;
            C2986n c2986n322 = new C2986n();
            C2983k c2983k222 = new C2983k();
            C2984l c2984l22 = new C2984l();
            C1313m c1313m22 = new C1313m(true);
            c1313m22.m2746C(null);
            EnumC2959o enumC2959o422 = EnumC2959o.f11032l;
            int i1722 = enumC2959o2 != enumC2959o422 ? 90 : 48;
            long j82 = enumC2959o2 != enumC2959o422 ? 65000L : 25000L;
            Log.i("ResolverChain", enumC2959o2.f11034j + " walk (attempt " + i9 + ") starts at " + AbstractC1206h.m2644R0(96, str7));
            C2941e0 c2941e022 = new C2941e0(j82, str7, c1313m22, enumC2959o2, c2984l22, c2986n222, linkedHashSet22, i1722, c2983k222, arrayList22, c2986n322, c2986n42, c0649b22, null);
            c2969y2.f11079m = activity2;
            c2969y2.f11080n = enumC2959o2;
            c2969y2.f11081o = str14;
            c2969y2.f11082p = c2760c3;
            c2969y2.f11083q = c2983k222;
            c2969y2.f11084r = null;
            c2969y2.f11085s = i13;
            c2969y2.f11086t = i14;
            c2969y2.f11087u = i9;
            c2969y2.f11090x = 2;
            objM5112o = c2945g04.m5112o(activity2, c2941e022, c2969y2);
            if (objM5112o != enumC2273a) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 != 3) {
                    if (i16 == 4) {
                        AbstractC0714c.m1516d0(objM2858s);
                        return objM2858s;
                    }
                    if (i16 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2958n2 = (C2958n) c2969y2.f11079m;
                    AbstractC0714c.m1516d0(objM2858s);
                    str12 = null;
                    c2759b = (C2759b) objM2858s;
                    c2958n = c2958n2;
                    String str16 = c2759b == null ? c2759b.f10209a : str12;
                    String str17 = c2759b == null ? c2759b.f10210b : str12;
                    List list = c2958n.f11026a;
                    String str18 = c2958n.f11027b;
                    Map map = c2958n.f11028c;
                    AbstractC2980h.m5136e("headers", map);
                    return new C2958n(list, str18, map, str16, str17);
                }
                i12 = c2969y2.f11087u;
                i14 = c2969y2.f11086t;
                i11 = c2969y2.f11085s;
                C2958n c2958n3 = (C2958n) c2969y2.f11082p;
                str13 = (String) c2969y2.f11081o;
                enumC2959o3 = (EnumC2959o) c2969y2.f11080n;
                activity3 = (Activity) c2969y2.f11079m;
                AbstractC0714c.m1516d0(objM2858s);
                objM5103b = objM2858s;
                c2945g0 = c2945g05;
                c2958n = c2958n3;
                int i20 = i14;
                EnumC2959o enumC2959o5 = enumC2959o3;
                c2760c2 = ((C2956m) objM5103b).f11019a;
                if (c2760c2 != null) {
                    Log.i("ResolverChain", "no fresh chain to retry the expired session with");
                    return c2958n;
                }
                c2969y2.f11079m = null;
                c2969y2.f11080n = null;
                c2969y2.f11081o = null;
                c2969y2.f11082p = null;
                c2969y2.f11090x = 4;
                Object objM5111n = c2945g0.m5111n(activity3, enumC2959o5, str13, i11, i20, c2760c2, i12 + 1, c2969y2);
                return objM5111n == enumC2273a ? enumC2273a : objM5111n;
            }
            i12 = c2969y2.f11087u;
            i14 = c2969y2.f11086t;
            i11 = c2969y2.f11085s;
            c2983k = (C2983k) c2969y2.f11083q;
            c2760c3 = (C2760c) c2969y2.f11082p;
            str11 = (String) c2969y2.f11081o;
            enumC2959o3 = (EnumC2959o) c2969y2.f11080n;
            activity3 = (Activity) c2969y2.f11079m;
            AbstractC0714c.m1516d0(objM2858s);
            objM5112o = objM2858s;
            c2945g0 = c2945g05;
            c2958n = (C2958n) objM5112o;
            if (!c2958n.f11026a.isEmpty()) {
                if (enumC2959o3 == EnumC2959o.f11031k && c2983k.f11114j && i12 < 2) {
                    c2969y2.f11079m = activity3;
                    c2969y2.f11080n = enumC2959o3;
                    c2969y2.f11081o = str11;
                    c2969y2.f11082p = c2958n;
                    c2969y2.f11083q = null;
                    c2969y2.f11085s = i11;
                    c2969y2.f11086t = i14;
                    c2969y2.f11087u = i12;
                    c2969y2.f11090x = 3;
                    objM5103b = c2945g0.m5103b(str11, i11, i14, c2969y2);
                    if (objM5103b != enumC2273a) {
                        str13 = str11;
                        int i202 = i14;
                        EnumC2959o enumC2959o52 = enumC2959o3;
                        c2760c2 = ((C2956m) objM5103b).f11019a;
                        if (c2760c2 != null) {
                        }
                    }
                }
                return c2958n;
            }
            if (enumC2959o3 != EnumC2959o.f11032l) {
                String str19 = c2760c3 != null ? c2760c3.f10215e : null;
                if (c2760c3 != null) {
                    c2759b = new C2759b(c2760c3.f10213c, c2760c3.f10214d);
                    str12 = null;
                } else {
                    if (str19 != null && str19.length() != 0) {
                        C0667h c0667h = new C0667h(str11, i11, i14, str19, (InterfaceC2222c) null);
                        c2969y2.f11079m = c2958n;
                        str12 = null;
                        c2969y2.f11080n = null;
                        c2969y2.f11081o = null;
                        c2969y2.f11082p = null;
                        c2969y2.f11083q = null;
                        c2969y2.f11090x = 5;
                        objM2858s = AbstractC1339x.m2858s(6000L, c0667h, c2969y2);
                        if (objM2858s != enumC2273a) {
                            c2958n2 = c2958n;
                            c2759b = (C2759b) objM2858s;
                            c2958n = c2958n2;
                        }
                    }
                    str12 = null;
                    c2759b = null;
                }
                if (c2759b == null) {
                }
                if (c2759b == null) {
                }
                List list2 = c2958n.f11026a;
                String str182 = c2958n.f11027b;
                Map map2 = c2958n.f11028c;
                AbstractC2980h.m5136e("headers", map2);
                return new C2958n(list2, str182, map2, str16, str17);
            }
            return c2958n;
        }
        int i21 = c2969y2.f11087u;
        i14 = c2969y2.f11086t;
        i10 = c2969y2.f11085s;
        str6 = c2969y2.f11084r;
        c2760c3 = (C2760c) c2969y2.f11083q;
        String str20 = (String) c2969y2.f11082p;
        EnumC2959o enumC2959o6 = (EnumC2959o) c2969y2.f11081o;
        Activity activity4 = (Activity) c2969y2.f11080n;
        C2945g0 c2945g06 = (C2945g0) c2969y2.f11079m;
        AbstractC0714c.m1516d0(objM2858s);
        objM5105d = objM2858s;
        c2945g0 = c2945g05;
        i9 = i21;
        str4 = str20;
        enumC2959o2 = enumC2959o6;
        c2945g03 = c2945g06;
        activity2 = activity4;
        String str21 = str6;
        str5 = (String) objM5105d;
        c2945g02 = c2945g03;
        str3 = str21;
        if (str5 == null) {
        }
        C0649b c0649b222 = new C0649b(enumC2959o2, str3, str7, 1);
        LinkedHashSet linkedHashSet222 = new LinkedHashSet();
        ArrayList arrayList222 = new ArrayList();
        C2986n c2986n422 = new C2986n();
        c2986n422.f11117j = str7;
        C2986n c2986n2222 = new C2986n();
        c2986n2222.f11117j = str7;
        C2986n c2986n3222 = new C2986n();
        C2983k c2983k2222 = new C2983k();
        C2984l c2984l222 = new C2984l();
        C1313m c1313m222 = new C1313m(true);
        c1313m222.m2746C(null);
        EnumC2959o enumC2959o4222 = EnumC2959o.f11032l;
        int i17222 = enumC2959o2 != enumC2959o4222 ? 90 : 48;
        long j822 = enumC2959o2 != enumC2959o4222 ? 65000L : 25000L;
        Log.i("ResolverChain", enumC2959o2.f11034j + " walk (attempt " + i9 + ") starts at " + AbstractC1206h.m2644R0(96, str7));
        C2941e0 c2941e0222 = new C2941e0(j822, str7, c1313m222, enumC2959o2, c2984l222, c2986n2222, linkedHashSet222, i17222, c2983k2222, arrayList222, c2986n3222, c2986n422, c0649b222, null);
        c2969y2.f11079m = activity2;
        c2969y2.f11080n = enumC2959o2;
        c2969y2.f11081o = str14;
        c2969y2.f11082p = c2760c3;
        c2969y2.f11083q = c2983k2222;
        c2969y2.f11084r = null;
        c2969y2.f11085s = i13;
        c2969y2.f11086t = i14;
        c2969y2.f11087u = i9;
        c2969y2.f11090x = 2;
        objM5112o = c2945g04.m5112o(activity2, c2941e0222, c2969y2);
        if (objM5112o != enumC2273a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5112o(Activity activity, C2941e0 c2941e0, AbstractC2320c abstractC2320c) throws Throwable {
        C2943f0 c2943f0;
        ViewGroup viewGroup;
        WebView webView;
        Throwable th;
        FrameLayout frameLayout;
        if (abstractC2320c instanceof C2943f0) {
            c2943f0 = (C2943f0) abstractC2320c;
            int i = c2943f0.f10961r;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2943f0.f10961r = i - Integer.MIN_VALUE;
            } else {
                c2943f0 = new C2943f0(this, abstractC2320c);
            }
        }
        Object obj = c2943f0.f10959p;
        Object obj2 = EnumC2273a.f7953j;
        int i4 = c2943f0.f10961r;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            frameLayout = c2943f0.f10958o;
            webView = c2943f0.f10957n;
            viewGroup = c2943f0.f10956m;
            try {
                AbstractC0714c.m1516d0(obj);
                frameLayout.removeView(webView);
                webView.destroy();
                viewGroup.removeView(frameLayout);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                frameLayout.removeView(webView);
                webView.destroy();
                viewGroup.removeView(frameLayout);
                throw th;
            }
        }
        AbstractC0714c.m1516d0(obj);
        ViewGroup viewGroup2 = (ViewGroup) activity.findViewById(R.id.content);
        if (viewGroup2 == null) {
            throw new IOException("no content view to host the resolver's WebView");
        }
        WebView webView2 = new WebView(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.addView(webView2, new FrameLayout.LayoutParams(1, 1));
        viewGroup2.addView(frameLayout2, new ViewGroup.LayoutParams(1, 1));
        try {
            c2943f0.f10956m = viewGroup2;
            c2943f0.f10957n = webView2;
            c2943f0.f10958o = frameLayout2;
            c2943f0.f10961r = 1;
            Object objMo576c = c2941e0.mo576c(webView2, c2943f0);
            if (objMo576c == obj2) {
                return obj2;
            }
            viewGroup = viewGroup2;
            webView = webView2;
            obj = objMo576c;
            frameLayout = frameLayout2;
            frameLayout.removeView(webView);
            webView.destroy();
            viewGroup.removeView(frameLayout);
            return obj;
        } catch (Throwable th3) {
            viewGroup = viewGroup2;
            webView = webView2;
            th = th3;
            frameLayout = frameLayout2;
            frameLayout.removeView(webView);
            webView.destroy();
            viewGroup.removeView(frameLayout);
            throw th;
        }
    }
}
