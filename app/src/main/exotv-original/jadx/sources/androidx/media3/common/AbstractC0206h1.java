package androidx.media3.common;

import android.os.Bundle;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.h1 */
/* loaded from: classes.dex */
public abstract class AbstractC0206h1 {

    /* renamed from: a */
    public static final String f1121a;

    static {
        int i = AbstractC1118i0.f4750a;
        f1121a = Integer.toString(0, 36);
    }

    /* renamed from: a */
    public static AbstractC0206h1 m621a(Bundle bundle) {
        String str = f1121a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = C0252x.f1542d;
            AbstractC1101a.m2353d(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(C0252x.f1542d, false) ? new C0252x(bundle.getBoolean(C0252x.f1543e, false)) : new C0252x();
        }
        if (i == 1) {
            String str3 = C0250w0.f1535c;
            AbstractC1101a.m2353d(bundle.getInt(str, -1) == 1);
            float f8 = bundle.getFloat(C0250w0.f1535c, -1.0f);
            return f8 == -1.0f ? new C0250w0() : new C0250w0(f8);
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Unknown RatingType: "));
            }
            String str4 = C0215k1.f1174d;
            AbstractC1101a.m2353d(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(C0215k1.f1174d, false) ? new C0215k1(bundle.getBoolean(C0215k1.f1175e, false)) : new C0215k1();
        }
        String str5 = C0209i1.f1133d;
        AbstractC1101a.m2353d(bundle.getInt(str, -1) == 2);
        int i4 = bundle.getInt(C0209i1.f1133d, 5);
        float f9 = bundle.getFloat(C0209i1.f1134e, -1.0f);
        return f9 == -1.0f ? new C0209i1(i4) : new C0209i1(i4, f9);
    }

    /* renamed from: b */
    public abstract Bundle mo622b();
}
