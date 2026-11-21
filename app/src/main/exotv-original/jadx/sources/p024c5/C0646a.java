package p024c5;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.media3.exoplayer.audio.RunnableC0320i;
import com.exotv.net.p027ui.AdActivity;
import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.Set;
import okhttp3.C2181z;
import p069h7.AbstractC1214p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.a */
/* loaded from: classes.dex */
public final class C0646a extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ View f2546a;

    /* renamed from: b */
    public final /* synthetic */ AdActivity f2547b;

    public C0646a(View view, AdActivity adActivity) {
        this.f2546a = view;
        this.f2547b = adActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f2546a.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f2546a.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Log.w("AdActivity", "web error main=" + (webResourceRequest != null ? Boolean.valueOf(webResourceRequest.isForMainFrame()) : null) + " code=" + (webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null) + " desc=" + ((Object) (webResourceError != null ? webResourceError.getDescription() : null)));
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        AdActivity.m1750s(this.f2547b, url != null ? url.toString() : null);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null && AbstractC1214p.m2661n0(webResourceRequest.getUrl().getScheme(), "intent")) {
            String string = webResourceRequest.getUrl().toString();
            AbstractC2980h.m5135d("toString(...)", string);
            AdActivity adActivity = this.f2547b;
            if (!AbstractC2980h.m5132a(adActivity.f3042M, string)) {
                adActivity.f3042M = string;
                WebView webView2 = adActivity.f3037H;
                if (webView2 != null) {
                    webView2.post(new RunnableC0320i(adActivity, 4, string));
                    return new WebResourceResponse("text/plain", "utf-8", new ByteArrayInputStream(new byte[0]));
                }
                AbstractC2980h.m5139h("webView");
                throw null;
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String lowerCase;
        if (webResourceRequest == null) {
            return false;
        }
        Set set = AdActivity.f3036P;
        Uri url = webResourceRequest.getUrl();
        String scheme = url.getScheme();
        if (scheme != null) {
            lowerCase = scheme.toLowerCase(Locale.ROOT);
            AbstractC2980h.m5135d("toLowerCase(...)", lowerCase);
        } else {
            lowerCase = null;
        }
        String string = url.toString();
        AdActivity adActivity = this.f2547b;
        adActivity.f3040K = string;
        if (!AbstractC2980h.m5132a(lowerCase, "http") && !AbstractC2980h.m5132a(lowerCase, "https")) {
            adActivity.m1753v(webView, url.toString());
            return true;
        }
        if (webResourceRequest.isRedirect() || AbstractC1214p.m2661n0(webResourceRequest.getMethod(), "POST")) {
            return false;
        }
        if (webView != null) {
            webView.loadUrl(url.toString());
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        AdActivity.m1750s(this.f2547b, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String lowerCase;
        if (str == null) {
            str = C2181z.FRAGMENT_ENCODE_SET;
        }
        Uri uri = Uri.parse(str);
        AbstractC2980h.m5135d("parse(...)", uri);
        Set set = AdActivity.f3036P;
        String scheme = uri.getScheme();
        if (scheme != null) {
            lowerCase = scheme.toLowerCase(Locale.ROOT);
            AbstractC2980h.m5135d("toLowerCase(...)", lowerCase);
        } else {
            lowerCase = null;
        }
        if (!AbstractC2980h.m5132a(lowerCase, "http") && !AbstractC2980h.m5132a(lowerCase, "https")) {
            this.f2547b.m1753v(webView, uri.toString());
            return true;
        }
        if (webView == null) {
            return true;
        }
        webView.loadUrl(uri.toString());
        return true;
    }
}
