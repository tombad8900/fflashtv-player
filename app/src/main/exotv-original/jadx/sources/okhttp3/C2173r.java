package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p002a1.AbstractC0008a1;
import p189v7.C2579m;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.r */
/* loaded from: classes.dex */
public final class C2173r {
    public static final C2173r INSTANCE = new C2173r();

    private C2173r() {
    }

    public static final String basic(String str, String str2) {
        AbstractC2980h.m5136e("username", str);
        AbstractC2980h.m5136e("password", str2);
        return basic$default(str, str2, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            AbstractC2980h.m5135d("ISO_8859_1", charset);
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2, Charset charset) {
        AbstractC2980h.m5136e("username", str);
        AbstractC2980h.m5136e("password", str2);
        AbstractC2980h.m5136e("charset", charset);
        String str3 = str + ':' + str2;
        C2579m c2579m = C2579m.f9316m;
        AbstractC2980h.m5136e("<this>", str3);
        byte[] bytes = str3.getBytes(charset);
        AbstractC2980h.m5135d("getBytes(...)", bytes);
        return AbstractC0008a1.m25u("Basic ", new C2579m(bytes).mo4632a());
    }
}
