package androidx.media3.common;

import android.os.Bundle;
import java.util.Arrays;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.i1 */
/* loaded from: classes.dex */
public final class C0209i1 extends AbstractC0206h1 {

    /* renamed from: d */
    public static final String f1133d;

    /* renamed from: e */
    public static final String f1134e;

    /* renamed from: b */
    public final int f1135b;

    /* renamed from: c */
    public final float f1136c;

    static {
        int i = AbstractC1118i0.f4750a;
        f1133d = Integer.toString(1, 36);
        f1134e = Integer.toString(2, 36);
    }

    public C0209i1(int i) {
        AbstractC1101a.m2352c("maxStars must be a positive integer", i > 0);
        this.f1135b = i;
        this.f1136c = -1.0f;
    }

    @Override // androidx.media3.common.AbstractC0206h1
    /* renamed from: b */
    public final Bundle mo622b() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC0206h1.f1121a, 2);
        bundle.putInt(f1133d, this.f1135b);
        bundle.putFloat(f1134e, this.f1136c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0209i1)) {
            return false;
        }
        C0209i1 c0209i1 = (C0209i1) obj;
        return this.f1135b == c0209i1.f1135b && this.f1136c == c0209i1.f1136c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1135b), Float.valueOf(this.f1136c)});
    }

    public C0209i1(int i, float f8) {
        boolean z7 = false;
        AbstractC1101a.m2352c("maxStars must be a positive integer", i > 0);
        if (f8 >= 0.0f && f8 <= i) {
            z7 = true;
        }
        AbstractC1101a.m2352c("starRating is out of range [0, maxStars]", z7);
        this.f1135b = i;
        this.f1136c = f8;
    }
}
