package p024c5;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.exotv.net.p027ui.AdActivity;
import p220z6.AbstractC2980h;
import p220z6.C2983k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.d */
/* loaded from: classes.dex */
public final class C0655d extends WebChromeClient {

    /* renamed from: a */
    public final /* synthetic */ AdActivity f2584a;

    public C0655d(AdActivity adActivity) {
        this.f2584a = adActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z7, boolean z8, Message message) {
        AbstractC2980h.m5136e("view", webView);
        AbstractC2980h.m5136e("resultMsg", message);
        Object obj = message.obj;
        WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
        if (webViewTransport == null) {
            return false;
        }
        AdActivity adActivity = this.f2584a;
        WebView webView2 = new WebView(adActivity);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.getSettings().setDomStorageEnabled(true);
        webView2.setWebViewClient(new C0652c(new C0649b(new C2983k(), adActivity, webView2, 0)));
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
