package p024c5;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.c */
/* loaded from: classes.dex */
public final class C0652c extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C0649b f2578a;

    public C0652c(C0649b c0649b) {
        this.f2578a = c0649b;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f2578a.invoke(str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        AbstractC2980h.m5136e("v", webView);
        AbstractC2980h.m5136e("request", webResourceRequest);
        Uri url = webResourceRequest.getUrl();
        this.f2578a.invoke(url != null ? url.toString() : null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        AbstractC2980h.m5136e("v", webView);
        this.f2578a.invoke(str);
        return true;
    }
}
