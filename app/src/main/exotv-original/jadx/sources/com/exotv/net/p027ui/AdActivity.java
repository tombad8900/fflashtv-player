package com.exotv.net.p027ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import androidx.media3.exoplayer.analytics.C0287i;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.R;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import okhttp3.C2181z;
import p017b6.ViewOnClickListenerC0591a;
import p024c5.AbstractC0704z;
import p024c5.C0646a;
import p024c5.C0655d;
import p024c5.C0672j;
import p024c5.CountDownTimerC0658e;
import p062h.AbstractActivityC1083i;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class AdActivity extends AbstractActivityC1083i {

    /* renamed from: P */
    public static final Set f3036P;

    /* renamed from: H */
    public WebView f3037H;

    /* renamed from: I */
    public Button f3038I;

    /* renamed from: J */
    public CountDownTimer f3039J;

    /* renamed from: K */
    public String f3040K;

    /* renamed from: L */
    public boolean f3041L;

    /* renamed from: M */
    public String f3042M;

    /* renamed from: N */
    public String f3043N;

    /* renamed from: O */
    public long f3044O;

    static {
        Set setSingleton = Collections.singleton("market");
        AbstractC2980h.m5135d("singleton(...)", setSingleton);
        f3036P = setSingleton;
    }

    /* renamed from: r */
    public static void m1749r(AdActivity adActivity) {
        Intent intent = Build.VERSION.SDK_INT >= 33 ? (Intent) adActivity.getIntent().getParcelableExtra("ad_next", Intent.class) : (Intent) adActivity.getIntent().getParcelableExtra("ad_next");
        if (intent != null) {
            adActivity.startActivity(intent);
        }
        adActivity.finish();
    }

    /* renamed from: s */
    public static final void m1750s(AdActivity adActivity, String str) {
        if ((str == null && (str = adActivity.f3040K) == null) || adActivity.f3041L || !AbstractC1214p.m2667t0(str, "intent:", true)) {
            return;
        }
        adActivity.f3041L = true;
        WebView webView = adActivity.f3037H;
        if (webView != null) {
            adActivity.m1753v(webView, str);
        } else {
            AbstractC2980h.m5139h("webView");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m1751u(String str, Intent intent) throws UnsupportedEncodingException {
        String strSubstring;
        String strM1499L;
        String strM2635I0;
        Uri data;
        String string;
        AbstractC2980h.m5136e("intentUrl", str);
        int iM2627A0 = AbstractC1206h.m2627A0(str, '#', 0, 6);
        if (iM2627A0 < 0) {
            strSubstring = null;
        } else {
            strSubstring = str.substring(iM2627A0 + 1);
            AbstractC2980h.m5135d("substring(...)", strSubstring);
        }
        if (strSubstring != null && AbstractC1214p.m2667t0(str, "intent:", true)) {
            strM1499L = AbstractC0714c.m1499L(strSubstring, "S.browser_fallback_url");
            if (strM1499L != null || (strM1499L = AbstractC0714c.m1499L(strSubstring, "browser_fallback_url")) != null) {
                try {
                    strM1499L = URLDecoder.decode(strM1499L, StandardCharsets.UTF_8.name());
                } catch (Exception unused) {
                }
                AbstractC2980h.m5136e("url", strM1499L);
                String lowerCase = AbstractC1206h.m2642P0(strM1499L, ':', C2181z.FRAGMENT_ENCODE_SET).toLowerCase(Locale.ROOT);
                AbstractC2980h.m5135d("toLowerCase(...)", lowerCase);
                if (!lowerCase.equals("http") && !lowerCase.equals("https")) {
                    strM1499L = null;
                }
                if (strM1499L == null) {
                    String strM1499L2 = AbstractC0714c.m1499L(strSubstring, "scheme");
                    if (strM1499L2 != null) {
                        String lowerCase2 = strM1499L2.toLowerCase(Locale.ROOT);
                        AbstractC2980h.m5135d("toLowerCase(...)", lowerCase2);
                        if (lowerCase2.equals("http") || lowerCase2.equals("https")) {
                            String strM2640N0 = AbstractC1206h.m2640N0(str, "//", C2181z.FRAGMENT_ENCODE_SET);
                            if (strM2640N0.length() != 0 && !AbstractC1214p.m2667t0(strM2640N0, "/", false)) {
                                String strM2642P0 = AbstractC1206h.m2642P0(strM2640N0, '/', strM2640N0);
                                String strM2642P02 = AbstractC1206h.m2642P0(strM2642P0, '#', strM2642P0);
                                if (strM2642P02.length() == 0) {
                                    strM1499L = null;
                                } else {
                                    String strM2639M0 = AbstractC1206h.m2639M0(AbstractC1206h.m2642P0(strM2640N0, '#', strM2640N0), '?', C2181z.FRAGMENT_ENCODE_SET);
                                    String strM2642P03 = AbstractC1206h.m2642P0(strM2640N0, '#', strM2640N0);
                                    String strM2640N02 = AbstractC1206h.m2640N0(AbstractC1206h.m2642P0(strM2642P03, '?', strM2642P03), strM2642P02, C2181z.FRAGMENT_ENCODE_SET);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(lowerCase2);
                                    sb.append("://");
                                    sb.append(strM2642P02);
                                    sb.append(strM2640N02);
                                    if (strM2639M0.length() > 0) {
                                        sb.append('?');
                                        sb.append(strM2639M0);
                                    }
                                    int iM2628B0 = AbstractC1206h.m2628B0(strSubstring, ";end", 0, false, 6);
                                    if (iM2628B0 < 0) {
                                        strM2635I0 = C2181z.FRAGMENT_ENCODE_SET;
                                    } else {
                                        String strSubstring2 = strSubstring.substring(iM2628B0 + 4);
                                        AbstractC2980h.m5135d("substring(...)", strSubstring2);
                                        strM2635I0 = AbstractC1206h.m2635I0(strSubstring2, "#");
                                    }
                                    if (strM2635I0.length() > 0) {
                                        sb.append('#');
                                        sb.append(strM2635I0);
                                    }
                                    strM1499L = sb.toString();
                                }
                            }
                        }
                    }
                }
            }
        }
        if (strM1499L != null) {
            return strM1499L;
        }
        if (intent != null && (data = intent.getData()) != null && (string = data.toString()) != null) {
            String lowerCase3 = AbstractC1206h.m2642P0(string, ':', C2181z.FRAGMENT_ENCODE_SET).toLowerCase(Locale.ROOT);
            AbstractC2980h.m5135d("toLowerCase(...)", lowerCase3);
            if (lowerCase3.equals("http") || lowerCase3.equals("https")) {
                return string;
            }
        }
        return null;
    }

    @Override // p010b.AbstractActivityC0522l, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // p062h.AbstractActivityC1083i, p010b.AbstractActivityC0522l, p011b0.AbstractActivityC0539e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0672j.m1442a(this);
        setContentView(R.layout.activity_ad);
        C0672j.m1448g(this);
        String stringExtra = getIntent().getStringExtra("ad_url");
        long jM1535u = AbstractC0714c.m1535u(getIntent().getLongExtra("ad_duration_ms", 1L), 1L, 16000L);
        getSharedPreferences("exotv_ads", 0).edit().putLong("interstitial_last_shown_at", System.currentTimeMillis()).apply();
        Button button = (Button) findViewById(R.id.adClose);
        this.f3038I = button;
        if (button == null) {
            AbstractC2980h.m5139h("close");
            throw null;
        }
        button.setEnabled(false);
        View viewFindViewById = findViewById(R.id.adRoot);
        View viewFindViewById2 = findViewById(R.id.adNavBar);
        Button button2 = this.f3038I;
        if (button2 == null) {
            AbstractC2980h.m5139h("close");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = button2.getLayoutParams();
        AbstractC2980h.m5134c("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams", layoutParams);
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        viewFindViewById2.setBackgroundColor(AbstractC0704z.f2752b);
        C0287i c0287i = new C0287i(this, i, viewFindViewById2);
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        AbstractC1804e0.m3538j(viewFindViewById, c0287i);
        Button button3 = this.f3038I;
        if (button3 == null) {
            AbstractC2980h.m5139h("close");
            throw null;
        }
        button3.setText(getString(R.string.ad_close_countdown, Integer.valueOf((int) ((999 + jM1535u) / 1000))));
        Button button4 = this.f3038I;
        if (button4 == null) {
            AbstractC2980h.m5139h("close");
            throw null;
        }
        button4.setOnClickListener(new ViewOnClickListenerC0591a(3, this));
        WebView webView = (WebView) findViewById(R.id.adWebView);
        this.f3037H = webView;
        if (webView == null) {
            AbstractC2980h.m5139h("webView");
            throw null;
        }
        WebSettings settings = webView.getSettings();
        AbstractC2980h.m5135d("getSettings(...)", settings);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        settings.setCacheMode(-1);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(0);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        View viewFindViewById3 = findViewById(R.id.adLoading);
        WebView webView2 = this.f3037H;
        if (webView2 == null) {
            AbstractC2980h.m5139h("webView");
            throw null;
        }
        webView2.setWebViewClient(new C0646a(viewFindViewById3, this));
        WebView webView3 = this.f3037H;
        if (webView3 == null) {
            AbstractC2980h.m5139h("webView");
            throw null;
        }
        webView3.setWebChromeClient(new C0655d(this));
        WebView webView4 = this.f3037H;
        if (webView4 == null) {
            AbstractC2980h.m5139h("webView");
            throw null;
        }
        if (stringExtra == null) {
            finish();
        } else {
            webView4.loadUrl(stringExtra);
            this.f3039J = new CountDownTimerC0658e(jM1535u, this).start();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.removeConnection(BlockSplitter.java:166)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.removeExcHandler(BlockExceptionHandler.java:324)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.lambda$prepareTryBlocks$2(BlockExceptionHandler.java:207)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.prepareTryBlocks(BlockExceptionHandler.java:207)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:60)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    /* JADX WARN: Unreachable blocks removed: 21, instructions: 28 */
    @Override // p062h.AbstractActivityC1083i, android.app.Activity
    public final void onDestroy() {
        /*
            r4 = this;
            super.onDestroy()
            return
            android.os.CountDownTimer r0 = r4.f3039J
            if (r0 == 0) goto Lb
            r0.cancel()
        Lb:
            r0 = 0
            r4.f3039J = r0
            android.webkit.WebView r1 = r4.f3037H
            java.lang.String r2 = "webView"
            if (r1 == 0) goto L3f
            r1.stopLoading()
            android.webkit.WebView r1 = r4.f3037H
            if (r1 == 0) goto L3b
            java.lang.String r3 = "about:blank"
            r1.loadUrl(r3)
            android.webkit.WebView r1 = r4.f3037H
            if (r1 == 0) goto L37
            r1.destroy()
            android.webkit.CookieManager r0 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Throwable -> L2f
            r0.flush()     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r0 = move-exception
            com.bumptech.glide.AbstractC0714c.m1539y(r0)
        L33:
            super.onDestroy()
            return
        L37:
            p220z6.AbstractC2980h.m5139h(r2)
            throw r0
        L3b:
            p220z6.AbstractC2980h.m5139h(r2)
            throw r0
        L3f:
            p220z6.AbstractC2980h.m5139h(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.exotv.net.p027ui.AdActivity.onDestroy():void");
    }

    /* renamed from: t */
    public final void m1752t(WebView webView, String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f3043N) || jElapsedRealtime - this.f3044O >= 3000) {
            this.f3043N = str;
            this.f3044O = jElapsedRealtime;
            if (webView != null) {
                webView.loadUrl(str);
            }
        }
    }

    /* renamed from: v */
    public final void m1753v(WebView webView, String str) {
        String lowerCase;
        Intent uri;
        Uri data;
        String scheme;
        if (str == null) {
            return;
        }
        Uri uri2 = Uri.parse(str);
        String scheme2 = uri2.getScheme();
        String lowerCase2 = null;
        if (scheme2 != null) {
            lowerCase = scheme2.toLowerCase(Locale.ROOT);
            AbstractC2980h.m5135d("toLowerCase(...)", lowerCase);
        } else {
            lowerCase = null;
        }
        if (lowerCase == null || lowerCase.length() == 0) {
            return;
        }
        if (lowerCase.equals("http") || lowerCase.equals("https")) {
            if (webView != null) {
                webView.loadUrl(str);
                return;
            }
            return;
        }
        boolean zEquals = lowerCase.equals("intent");
        Set set = f3036P;
        if (!zEquals) {
            if (set.contains(lowerCase)) {
                Intent intent = new Intent("android.intent.action.VIEW", uri2);
                try {
                    startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused) {
                    Log.w("AdActivity", "nothing on this device can open " + intent.getData());
                    return;
                }
            }
            return;
        }
        try {
            uri = Intent.parseUri(str, 1);
        } catch (Exception e) {
            Log.w("AdActivity", "ad sent an intent link that could not be parsed", e);
            uri = null;
        }
        if (uri != null && (data = uri.getData()) != null && (scheme = data.getScheme()) != null) {
            lowerCase2 = scheme.toLowerCase(Locale.ROOT);
            AbstractC2980h.m5135d("toLowerCase(...)", lowerCase2);
        }
        if (lowerCase2 == null || !set.contains(lowerCase2)) {
            String strM1751u = m1751u(str, uri);
            if (strM1751u != null) {
                m1752t(webView, strM1751u);
                return;
            }
            return;
        }
        try {
            startActivity(uri);
        } catch (ActivityNotFoundException unused2) {
            Log.w("AdActivity", "nothing on this device can open " + uri.getData());
            String strM1751u2 = m1751u(str, uri);
            if (strM1751u2 != null) {
                m1752t(webView, strM1751u2);
            }
        }
    }
}
