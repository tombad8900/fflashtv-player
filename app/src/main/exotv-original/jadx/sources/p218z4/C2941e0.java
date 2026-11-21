package p218z4;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bumptech.glide.AbstractC0714c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import p024c5.C0649b;
import p069h7.AbstractC1214p;
import p076i7.C1279a1;
import p076i7.C1313m;
import p076i7.InterfaceC1310l;
import p102l6.C1687d;
import p102l6.C1693j;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1924s;
import p111m6.C1921p;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;
import p220z6.C2983k;
import p220z6.C2984l;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z4.e0 */
/* loaded from: classes.dex */
public final class C2941e0 extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: A */
    public final /* synthetic */ C2986n f10939A;

    /* renamed from: B */
    public final /* synthetic */ C0649b f10940B;

    /* renamed from: n */
    public int f10941n;

    /* renamed from: o */
    public /* synthetic */ Object f10942o;

    /* renamed from: p */
    public final /* synthetic */ long f10943p;

    /* renamed from: q */
    public final /* synthetic */ String f10944q;

    /* renamed from: r */
    public final /* synthetic */ C1313m f10945r;

    /* renamed from: s */
    public final /* synthetic */ EnumC2959o f10946s;

    /* renamed from: t */
    public final /* synthetic */ C2984l f10947t;

    /* renamed from: u */
    public final /* synthetic */ C2986n f10948u;

    /* renamed from: v */
    public final /* synthetic */ LinkedHashSet f10949v;

    /* renamed from: w */
    public final /* synthetic */ int f10950w;

    /* renamed from: x */
    public final /* synthetic */ C2983k f10951x;

    /* renamed from: y */
    public final /* synthetic */ ArrayList f10952y;

    /* renamed from: z */
    public final /* synthetic */ C2986n f10953z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2941e0(long j, String str, C1313m c1313m, EnumC2959o enumC2959o, C2984l c2984l, C2986n c2986n, LinkedHashSet linkedHashSet, int i, C2983k c2983k, ArrayList arrayList, C2986n c2986n2, C2986n c2986n3, C0649b c0649b, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f10943p = j;
        this.f10944q = str;
        this.f10945r = c1313m;
        this.f10946s = enumC2959o;
        this.f10947t = c2984l;
        this.f10948u = c2986n;
        this.f10949v = linkedHashSet;
        this.f10950w = i;
        this.f10951x = c2983k;
        this.f10952y = arrayList;
        this.f10953z = c2986n2;
        this.f10939A = c2986n3;
        this.f10940B = c0649b;
    }

    /* renamed from: l */
    public static final void m5094l(EnumC2959o enumC2959o, int i, WebView webView) {
        webView.evaluateJavascript("window.__exoStallTicks = " + i + "; window.__exoNoHops = " + (enumC2959o == EnumC2959o.f11032l ? "true" : "false") + "; true;", null);
        webView.evaluateJavascript(C2945g0.f10970f, null);
        webView.evaluateJavascript(C2945g0.f10971g, null);
        webView.evaluateJavascript(C2945g0.f10972h, null);
    }

    /* renamed from: m */
    public static final void m5095m(C1313m c1313m, LinkedHashSet linkedHashSet, Handler handler, C2986n c2986n, JSONArray jSONArray) {
        if (jSONArray == null || c1313m.m2748E()) {
            return;
        }
        int length = jSONArray.length();
        int i = 0;
        for (int i4 = 0; i4 < length; i4++) {
            String strOptString = jSONArray.optString(i4);
            AbstractC2980h.m5133b(strOptString);
            if (AbstractC1214p.m2667t0(strOptString, "http", false) && C2945g0.f10969e.m2623a(strOptString) && linkedHashSet.add(strOptString)) {
                i++;
            }
        }
        if (i > 0) {
            m5096n(c1313m, handler, c2986n, AbstractC1913h.m3747L0(linkedHashSet));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final void m5096n(InterfaceC1310l interfaceC1310l, Handler handler, C2986n c2986n, List list) {
        if (((C1279a1) interfaceC1310l).m2748E()) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        String str = (String) c2986n.f11117j;
        Map mapSingletonMap = Collections.singletonMap("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
        AbstractC2980h.m5135d("singletonMap(...)", mapSingletonMap);
        ((C1313m) interfaceC1310l).m2750G(new C2958n(list, str, mapSingletonMap, null, null));
    }

    /* renamed from: o */
    public static final void m5097o(WebView webView, C0649b c0649b, String str) {
        webView.loadUrl(str, AbstractC1924s.m3760U(new C1687d("Referer", c0649b.invoke(str)), new C1687d("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36")));
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C2941e0) mo577g((WebView) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        C2941e0 c2941e0 = new C2941e0(this.f10943p, this.f10944q, this.f10945r, this.f10946s, this.f10947t, this.f10948u, this.f10949v, this.f10950w, this.f10951x, this.f10952y, this.f10953z, this.f10939A, this.f10940B, interfaceC2222c);
        c2941e0.f10942o = obj;
        return c2941e0;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [z4.z] */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i = this.f10941n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0714c.m1516d0(obj);
            return obj;
        }
        AbstractC0714c.m1516d0(obj);
        WebView webView = (WebView) this.f10942o;
        final Handler handler = new Handler(Looper.getMainLooper());
        WebSettings settings = webView.getSettings();
        AbstractC2980h.m5135d("getSettings(...)", settings);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setMixedContentMode(0);
        settings.setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        final C1313m c1313m = this.f10945r;
        final EnumC2959o enumC2959o = this.f10946s;
        final C2984l c2984l = this.f10947t;
        final C2986n c2986n = this.f10948u;
        ?? r42 = new Runnable() { // from class: z4.z
            @Override // java.lang.Runnable
            public final void run() {
                C1313m c1313m2 = c1313m;
                if (c1313m2.m2748E()) {
                    return;
                }
                Log.i("ResolverChain", enumC2959o.f11034j + " went quiet after " + c2984l.f11115j + " refusal(s)");
                C2941e0.m5096n(c1313m2, handler, c2986n, C1921p.f7187j);
            }
        };
        int i4 = this.f10950w;
        LinkedHashSet linkedHashSet = this.f10949v;
        String str = this.f10944q;
        C2983k c2983k = this.f10951x;
        webView.setWebViewClient(new C2935b0(c1313m, linkedHashSet, handler, c2986n, enumC2959o, i4, str, c2984l, r42, c2983k));
        C2986n c2986n2 = this.f10953z;
        C2986n c2986n3 = this.f10939A;
        ArrayList arrayList = this.f10952y;
        C0649b c0649b = this.f10940B;
        webView.addJavascriptInterface(new C2939d0(handler, c2983k, c2986n, c1313m, arrayList, c2986n2, c2986n3, webView, c0649b, linkedHashSet), "ExoBridge");
        final long j = this.f10943p;
        handler.postDelayed(new Runnable() { // from class: z4.a0
            @Override // java.lang.Runnable
            public final void run() {
                C1313m c1313m2 = c1313m;
                if (c1313m2.m2748E()) {
                    return;
                }
                Log.i("ResolverChain", enumC2959o.f11034j + " walk timed out after " + (j / 1000) + CmcdData.Factory.STREAMING_FORMAT_SS);
                C2941e0.m5096n(c1313m2, handler, c2986n, C1921p.f7187j);
            }
        }, j);
        m5097o(webView, c0649b, str);
        this.f10941n = 1;
        Object objM2829T = c1313m.m2829T(this);
        return objM2829T == enumC2273a ? enumC2273a : objM2829T;
    }
}
