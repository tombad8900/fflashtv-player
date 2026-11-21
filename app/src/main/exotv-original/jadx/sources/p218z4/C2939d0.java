package p218z4;

import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.json.JSONObject;
import p024c5.C0649b;
import p069h7.AbstractC1206h;
import p076i7.C1313m;
import p111m6.C1921p;
import p220z6.AbstractC2980h;
import p220z6.C2983k;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z4.d0 */
/* loaded from: classes.dex */
public final class C2939d0 {

    /* renamed from: a */
    public final /* synthetic */ Handler f10923a;

    /* renamed from: b */
    public final /* synthetic */ C2983k f10924b;

    /* renamed from: c */
    public final /* synthetic */ C2986n f10925c;

    /* renamed from: d */
    public final /* synthetic */ C1313m f10926d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f10927e;

    /* renamed from: f */
    public final /* synthetic */ C2986n f10928f;

    /* renamed from: g */
    public final /* synthetic */ C2986n f10929g;

    /* renamed from: h */
    public final /* synthetic */ WebView f10930h;

    /* renamed from: i */
    public final /* synthetic */ C0649b f10931i;

    /* renamed from: j */
    public final /* synthetic */ LinkedHashSet f10932j;

    public C2939d0(Handler handler, C2983k c2983k, C2986n c2986n, C1313m c1313m, ArrayList arrayList, C2986n c2986n2, C2986n c2986n3, WebView webView, C0649b c0649b, LinkedHashSet linkedHashSet) {
        this.f10923a = handler;
        this.f10924b = c2983k;
        this.f10925c = c2986n;
        this.f10926d = c1313m;
        this.f10927e = arrayList;
        this.f10928f = c2986n2;
        this.f10929g = c2986n3;
        this.f10930h = webView;
        this.f10931i = c0649b;
        this.f10932j = linkedHashSet;
    }

    @JavascriptInterface
    public final void onEvent(final String str) {
        AbstractC2980h.m5136e("raw", str);
        if (str.length() > 262144) {
            return;
        }
        final C2983k c2983k = this.f10924b;
        final C2986n c2986n = this.f10925c;
        final C1313m c1313m = this.f10926d;
        final ArrayList arrayList = this.f10927e;
        final C2986n c2986n2 = this.f10928f;
        final C2986n c2986n3 = this.f10929g;
        final WebView webView = this.f10930h;
        final C0649b c0649b = this.f10931i;
        final LinkedHashSet linkedHashSet = this.f10932j;
        final Handler handler = this.f10923a;
        handler.post(new Runnable() { // from class: z4.c0
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString("type");
                    if (strOptString != null) {
                        int iHashCode = strOptString.hashCode();
                        C2986n c2986n4 = c2986n;
                        C1313m c1313m2 = c1313m;
                        Handler handler2 = handler;
                        C1921p c1921p = C1921p.f7187j;
                        switch (iHashCode) {
                            case -1309235419:
                                if (strOptString.equals("expired")) {
                                    c2983k.f11114j = true;
                                    Log.i("ResolverChain", "expired session: ".concat(AbstractC1206h.m2644R0(90, (String) c2986n4.f11117j)));
                                    C2941e0.m5096n(c1313m2, handler2, c2986n4, c1921p);
                                    break;
                                }
                                break;
                            case -891990144:
                                if (strOptString.equals("stream")) {
                                    C2941e0.m5095m(c1313m2, linkedHashSet, handler2, c2986n4, jSONObject.optJSONArray("urls"));
                                    break;
                                }
                                break;
                            case 100709:
                                if (strOptString.equals("err")) {
                                    Log.w("ResolverChain", "page error: " + jSONObject.optString("message"));
                                    break;
                                }
                                break;
                            case 103497:
                                if (strOptString.equals("hop")) {
                                    String strOptString2 = jSONObject.optString("url");
                                    AbstractC2980h.m5135d("optString(...)", strOptString2);
                                    if (!AbstractC1206h.m2630D0(strOptString2) && !c1313m2.m2748E()) {
                                        ArrayList arrayList2 = arrayList;
                                        if (!arrayList2.contains(strOptString2)) {
                                            arrayList2.add(strOptString2);
                                            C2986n c2986n5 = c2986n3;
                                            c2986n2.f11117j = c2986n5.f11117j;
                                            c2986n5.f11117j = strOptString2;
                                            c2986n4.f11117j = strOptString2;
                                            C2941e0.m5097o(webView, c0649b, strOptString2);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 109757344:
                                if (strOptString.equals("stall")) {
                                    C2941e0.m5096n(c1313m2, handler2, c2986n4, c1921p);
                                    break;
                                }
                                break;
                            case 176117146:
                                if (strOptString.equals("limited")) {
                                    Log.w("ResolverChain", "refused: the site is rate limiting this connection");
                                    C2941e0.m5096n(c1313m2, handler2, c2986n4, c1921p);
                                    break;
                                }
                                break;
                            case 1514258249:
                                if (strOptString.equals("exhausted")) {
                                    Log.i("ResolverChain", "backup exhausted its servers (" + jSONObject.optInt("fails") + " refused)");
                                    C2941e0.m5096n(c1313m2, handler2, c2986n4, c1921p);
                                    break;
                                }
                                break;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        });
    }
}
