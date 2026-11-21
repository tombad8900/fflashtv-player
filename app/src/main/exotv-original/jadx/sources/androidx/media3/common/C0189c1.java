package androidx.media3.common;

import android.support.v4.media.session.AbstractC0120b;
import java.util.Arrays;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.c1 */
/* loaded from: classes.dex */
public final class C0189c1 {

    /* renamed from: a */
    public final Object f1061a;

    /* renamed from: b */
    public final int f1062b;

    /* renamed from: c */
    public final C0226o0 f1063c;

    /* renamed from: d */
    public final Object f1064d;

    /* renamed from: e */
    public final int f1065e;

    /* renamed from: f */
    public final long f1066f;

    /* renamed from: g */
    public final long f1067g;

    /* renamed from: h */
    public final int f1068h;

    /* renamed from: i */
    public final int f1069i;

    static {
        AbstractC1118i0.m2422M(0);
        AbstractC1118i0.m2422M(1);
        AbstractC1118i0.m2422M(2);
        AbstractC1118i0.m2422M(3);
        AbstractC1118i0.m2422M(4);
        AbstractC1118i0.m2422M(5);
        AbstractC1118i0.m2422M(6);
    }

    public C0189c1(Object obj, int i, C0226o0 c0226o0, Object obj2, int i4, long j, long j8, int i8, int i9) {
        this.f1061a = obj;
        this.f1062b = i;
        this.f1063c = c0226o0;
        this.f1064d = obj2;
        this.f1065e = i4;
        this.f1066f = j;
        this.f1067g = j8;
        this.f1068h = i8;
        this.f1069i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0189c1.class == obj.getClass()) {
            C0189c1 c0189c1 = (C0189c1) obj;
            if (this.f1062b == c0189c1.f1062b && this.f1065e == c0189c1.f1065e && this.f1066f == c0189c1.f1066f && this.f1067g == c0189c1.f1067g && this.f1068h == c0189c1.f1068h && this.f1069i == c0189c1.f1069i && AbstractC0120b.m422r(this.f1063c, c0189c1.f1063c) && AbstractC0120b.m422r(this.f1061a, c0189c1.f1061a) && AbstractC0120b.m422r(this.f1064d, c0189c1.f1064d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1061a, Integer.valueOf(this.f1062b), this.f1063c, this.f1064d, Integer.valueOf(this.f1065e), Long.valueOf(this.f1066f), Long.valueOf(this.f1067g), Integer.valueOf(this.f1068h), Integer.valueOf(this.f1069i)});
    }
}
