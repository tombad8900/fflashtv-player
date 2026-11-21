package p016b5;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.AbstractC2160j0;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2181z;
import p069h7.AbstractC1206h;
import p069h7.C1204f;
import p102l6.C1687d;
import p111m6.AbstractC1924s;
import p138p7.C2230b;
import p168t2.AbstractC2415i0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b5.l */
/* loaded from: classes.dex */
public final class C0589l {

    /* renamed from: a */
    public static final AtomicReference f2355a = new AtomicReference(null);

    /* renamed from: b */
    public static final C2230b f2356b = new C2230b();

    /* renamed from: c */
    public static final Object f2357c = AbstractC1924s.m3760U(new C1687d("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"), new C1687d("Accept-Language", "en-US,en;q=0.9,ar;q=0.8,fr;q=0.7"), new C1687d("Connection", "keep-alive"), new C1687d("sec-ch-ua", "\"Google Chrome\";v=\"153\", \"Not_A Brand\";v=\"8\", \"Chromium\";v=\"153\""), new C1687d("sec-ch-ua-mobile", "?0"), new C1687d("sec-ch-ua-platform", "\"Windows\""), new C1687d("Sec-Fetch-Dest", "document"), new C1687d("Sec-Fetch-Mode", "navigate"), new C1687d("Sec-Fetch-Site", "none"), new C1687d("Sec-Fetch-User", "?1"), new C1687d("Upgrade-Insecure-Requests", "1"), new C1687d("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/153.0.0.0 Safari/537.36"));

    /* renamed from: d */
    public static final C1204f f2358d = new C1204f("^https?://\\S+$");

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* renamed from: a */
    public static final String m1335a() {
        try {
            C2076g0.a aVarUrl = new C2076g0.a().url("https://raw.githubusercontent.com/nativedevonly/Spark_Game/master/credentials.js");
            for (Map.Entry entry : f2357c.entrySet()) {
                aVarUrl.header((String) entry.getKey(), (String) entry.getValue());
            }
            C2080i0 c2080i0Execute = AbstractC0590m.f2359a.newCall(aVarUrl.build()).execute();
            try {
                if (!c2080i0Execute.isSuccessful()) {
                    throw new IllegalStateException(("credentials request failed with status " + c2080i0Execute.code()).toString());
                }
                AbstractC2160j0 abstractC2160j0Body = c2080i0Execute.body();
                String strString = abstractC2160j0Body != null ? abstractC2160j0Body.string() : null;
                if (strString == null) {
                    strString = C2181z.FRAGMENT_ENCODE_SET;
                }
                String string = AbstractC1206h.m2645S0(strString).toString();
                AbstractC2980h.m5136e("encoded", string);
                byte[] bArrM4261I = AbstractC2415i0.m4261I(AbstractC2415i0.m4262a(string));
                char[] cArr = new char[bArrM4261I.length];
                int length = bArrM4261I.length;
                for (int i = 0; i < length; i++) {
                    cArr[i] = (char) (bArrM4261I[i] & 255);
                }
                String string2 = AbstractC1206h.m2645S0(new String(cArr)).toString();
                if (!f2358d.m2624c(string2)) {
                    throw new IllegalStateException("decrypted base url looks invalid");
                }
                c2080i0Execute.close();
                return string2;
            } finally {
            }
        } catch (Throwable th) {
            Log.w("Credentials", "credentials fetch failed, using pinned API base: " + th.getMessage());
            return null;
        }
    }
}
