package androidx.media3.common;

import android.os.Bundle;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.i0 */
/* loaded from: classes.dex */
public final class C0208i0 {

    /* renamed from: f */
    public static final C0208i0 f1122f = new C0208i0(new C0205h0());

    /* renamed from: g */
    public static final String f1123g;

    /* renamed from: h */
    public static final String f1124h;

    /* renamed from: i */
    public static final String f1125i;

    /* renamed from: j */
    public static final String f1126j;

    /* renamed from: k */
    public static final String f1127k;

    /* renamed from: a */
    public final long f1128a;

    /* renamed from: b */
    public final long f1129b;

    /* renamed from: c */
    public final long f1130c;

    /* renamed from: d */
    public final float f1131d;

    /* renamed from: e */
    public final float f1132e;

    static {
        int i = AbstractC1118i0.f4750a;
        f1123g = Integer.toString(0, 36);
        f1124h = Integer.toString(1, 36);
        f1125i = Integer.toString(2, 36);
        f1126j = Integer.toString(3, 36);
        f1127k = Integer.toString(4, 36);
    }

    public C0208i0(C0205h0 c0205h0) {
        long j = c0205h0.f1116a;
        long j8 = c0205h0.f1117b;
        long j9 = c0205h0.f1118c;
        float f8 = c0205h0.f1119d;
        float f9 = c0205h0.f1120e;
        this.f1128a = j;
        this.f1129b = j8;
        this.f1130c = j9;
        this.f1131d = f8;
        this.f1132e = f9;
    }

    /* renamed from: b */
    public static C0208i0 m625b(Bundle bundle) {
        C0205h0 c0205h0 = new C0205h0();
        C0208i0 c0208i0 = f1122f;
        c0205h0.f1116a = bundle.getLong(f1123g, c0208i0.f1128a);
        c0205h0.f1117b = bundle.getLong(f1124h, c0208i0.f1129b);
        c0205h0.f1118c = bundle.getLong(f1125i, c0208i0.f1130c);
        c0205h0.f1119d = bundle.getFloat(f1126j, c0208i0.f1131d);
        c0205h0.f1120e = bundle.getFloat(f1127k, c0208i0.f1132e);
        return new C0208i0(c0205h0);
    }

    /* renamed from: a */
    public final C0205h0 m626a() {
        C0205h0 c0205h0 = new C0205h0();
        c0205h0.f1116a = this.f1128a;
        c0205h0.f1117b = this.f1129b;
        c0205h0.f1118c = this.f1130c;
        c0205h0.f1119d = this.f1131d;
        c0205h0.f1120e = this.f1132e;
        return c0205h0;
    }

    /* renamed from: c */
    public final Bundle m627c() {
        Bundle bundle = new Bundle();
        C0208i0 c0208i0 = f1122f;
        long j = c0208i0.f1128a;
        long j8 = this.f1128a;
        if (j8 != j) {
            bundle.putLong(f1123g, j8);
        }
        long j9 = c0208i0.f1129b;
        long j10 = this.f1129b;
        if (j10 != j9) {
            bundle.putLong(f1124h, j10);
        }
        long j11 = c0208i0.f1130c;
        long j12 = this.f1130c;
        if (j12 != j11) {
            bundle.putLong(f1125i, j12);
        }
        float f8 = c0208i0.f1131d;
        float f9 = this.f1131d;
        if (f9 != f8) {
            bundle.putFloat(f1126j, f9);
        }
        float f10 = c0208i0.f1132e;
        float f11 = this.f1132e;
        if (f11 != f10) {
            bundle.putFloat(f1127k, f11);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0208i0)) {
            return false;
        }
        C0208i0 c0208i0 = (C0208i0) obj;
        return this.f1128a == c0208i0.f1128a && this.f1129b == c0208i0.f1129b && this.f1130c == c0208i0.f1130c && this.f1131d == c0208i0.f1131d && this.f1132e == c0208i0.f1132e;
    }

    public final int hashCode() {
        long j = this.f1128a;
        long j8 = this.f1129b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f1130c;
        int i4 = (i + ((int) ((j9 >>> 32) ^ j9))) * 31;
        float f8 = this.f1131d;
        int iFloatToIntBits = (i4 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31;
        float f9 = this.f1132e;
        return iFloatToIntBits + (f9 != 0.0f ? Float.floatToIntBits(f9) : 0);
    }
}
