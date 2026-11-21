package p024c5;

import android.webkit.WebView;
import androidx.lifecycle.RunnableC0127c0;
import com.exotv.net.p027ui.AdActivity;
import java.io.Serializable;
import p002a1.C0048u;
import p069h7.AbstractC1206h;
import p102l6.C1693j;
import p212y6.InterfaceC2851l;
import p218z4.EnumC2959o;
import p220z6.AbstractC2980h;
import p220z6.C2983k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0649b implements InterfaceC2851l {

    /* renamed from: j */
    public final /* synthetic */ int f2565j;

    /* renamed from: k */
    public final /* synthetic */ Serializable f2566k;

    /* renamed from: l */
    public final /* synthetic */ Object f2567l;

    /* renamed from: m */
    public final /* synthetic */ Object f2568m;

    public /* synthetic */ C0649b(Serializable serializable, Object obj, Object obj2, int i) {
        this.f2565j = i;
        this.f2566k = serializable;
        this.f2567l = obj;
        this.f2568m = obj2;
    }

    @Override // p212y6.InterfaceC2851l
    public final Object invoke(Object obj) {
        switch (this.f2565j) {
            case 0:
                C2983k c2983k = (C2983k) this.f2566k;
                AdActivity adActivity = (AdActivity) this.f2567l;
                WebView webView = (WebView) this.f2568m;
                String str = (String) obj;
                if (!c2983k.f11114j && str != null && !AbstractC1206h.m2630D0(str)) {
                    c2983k.f11114j = true;
                    WebView webView2 = adActivity.f3037H;
                    if (webView2 == null) {
                        AbstractC2980h.m5139h("webView");
                        throw null;
                    }
                    adActivity.m1753v(webView2, str);
                    WebView webView3 = adActivity.f3037H;
                    if (webView3 == null) {
                        AbstractC2980h.m5139h("webView");
                        throw null;
                    }
                    webView3.post(new RunnableC0127c0(11, webView));
                }
                return C1693j.f6497a;
            default:
                EnumC2959o enumC2959o = (EnumC2959o) this.f2566k;
                String str2 = (String) this.f2567l;
                String str3 = (String) this.f2568m;
                String str4 = (String) obj;
                AbstractC2980h.m5136e("target", str4);
                int iOrdinal = enumC2959o.ordinal();
                if (iOrdinal == 0) {
                    return (AbstractC1206h.m2649u0(str4, "/embed/player/", false) || str2 == null) ? str4 : str2;
                }
                if (iOrdinal == 1) {
                    return str3;
                }
                throw new C0048u();
        }
    }
}
