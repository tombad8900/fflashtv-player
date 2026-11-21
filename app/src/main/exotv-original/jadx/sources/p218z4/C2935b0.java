package p218z4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import p069h7.AbstractC1206h;
import p076i7.C1313m;
import p111m6.C1921p;
import p220z6.AbstractC2980h;
import p220z6.C2983k;
import p220z6.C2984l;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z4.b0 */
/* loaded from: classes.dex */
public final class C2935b0 extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C1313m f10894a;

    /* renamed from: b */
    public final /* synthetic */ LinkedHashSet f10895b;

    /* renamed from: c */
    public final /* synthetic */ Handler f10896c;

    /* renamed from: d */
    public final /* synthetic */ C2986n f10897d;

    /* renamed from: e */
    public final /* synthetic */ EnumC2959o f10898e;

    /* renamed from: f */
    public final /* synthetic */ int f10899f;

    /* renamed from: g */
    public final /* synthetic */ String f10900g;

    /* renamed from: h */
    public final /* synthetic */ C2984l f10901h;

    /* renamed from: i */
    public final /* synthetic */ RunnableC2970z f10902i;

    /* renamed from: j */
    public final /* synthetic */ C2983k f10903j;

    public C2935b0(C1313m c1313m, LinkedHashSet linkedHashSet, Handler handler, C2986n c2986n, EnumC2959o enumC2959o, int i, String str, C2984l c2984l, RunnableC2970z runnableC2970z, C2983k c2983k) {
        this.f10894a = c1313m;
        this.f10895b = linkedHashSet;
        this.f10896c = handler;
        this.f10897d = c2986n;
        this.f10898e = enumC2959o;
        this.f10899f = i;
        this.f10900g = str;
        this.f10901h = c2984l;
        this.f10902i = runnableC2970z;
        this.f10903j = c2983k;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        AbstractC2980h.m5136e("view", webView);
        AbstractC2980h.m5136e("url", str);
        this.f10897d.f11117j = str;
        C2941e0.m5094l(this.f10898e, this.f10899f, webView);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        AbstractC2980h.m5136e("view", webView);
        AbstractC2980h.m5136e("url", str);
        this.f10897d.f11117j = str;
        C2941e0.m5094l(this.f10898e, this.f10899f, webView);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String strM5100h;
        Uri url;
        AbstractC2980h.m5136e("view", webView);
        C1313m c1313m = this.f10894a;
        if (c1313m.m2748E() || webResourceResponse == null) {
            return;
        }
        int statusCode = webResourceResponse.getStatusCode();
        Handler handler = this.f10896c;
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            String string = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
            if (this.f10898e != EnumC2959o.f11032l || statusCode < 400) {
                return;
            }
            C2945g0 c2945g0 = C2945g0.f10965a;
            String strM5100h2 = C2945g0.m5100h(string);
            boolean zEquals = false;
            if (strM5100h2 != null && (strM5100h = C2945g0.m5100h(this.f10900g)) != null) {
                zEquals = strM5100h2.equals(strM5100h);
            }
            if (zEquals) {
                this.f10901h.f11115j++;
                Log.i("ResolverChain", "backup refused one of its calls: HTTP " + statusCode + " " + (string != null ? AbstractC1206h.m2644R0(80, string) : null));
                RunnableC2970z runnableC2970z = this.f10902i;
                handler.removeCallbacks(runnableC2970z);
                handler.postDelayed(runnableC2970z, 8000L);
                return;
            }
            return;
        }
        C1921p c1921p = C1921p.f7187j;
        C2986n c2986n = this.f10897d;
        if (statusCode == 403 || statusCode == 410) {
            this.f10903j.f11114j = true;
            String string2 = webResourceRequest.getUrl().toString();
            AbstractC2980h.m5135d("toString(...)", string2);
            Log.i("ResolverChain", "refused with HTTP " + statusCode + ": " + AbstractC1206h.m2644R0(90, string2));
            C2941e0.m5096n(c1313m, handler, c2986n, c1921p);
            return;
        }
        if (statusCode >= 400) {
            String string3 = webResourceRequest.getUrl().toString();
            AbstractC2980h.m5135d("toString(...)", string3);
            Log.i("ResolverChain", "missing page (HTTP " + statusCode + "): " + AbstractC1206h.m2644R0(90, string3));
            C2941e0.m5096n(c1313m, handler, c2986n, c1921p);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC2980h.m5136e("view", webView);
        AbstractC2980h.m5136e("req", webResourceRequest);
        String string = webResourceRequest.getUrl().toString();
        AbstractC2980h.m5135d("toString(...)", string);
        if (!C2945g0.f10969e.m2623a(string)) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(string);
        C2941e0.m5095m(this.f10894a, this.f10895b, this.f10896c, this.f10897d, jSONArray);
        return false;
    }
}
