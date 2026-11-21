package androidx.media3.common;

import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.d2 */
/* loaded from: classes.dex */
public final class C0194d2 {

    /* renamed from: d */
    public static final C0194d2 f1085d = new C0194d2(0, 0);

    /* renamed from: a */
    public final int f1086a;

    /* renamed from: b */
    public final int f1087b;

    /* renamed from: c */
    public final float f1088c;

    static {
        AbstractC1118i0.m2422M(0);
        AbstractC1118i0.m2422M(1);
        AbstractC1118i0.m2422M(3);
    }

    public C0194d2(int i, int i4) {
        this(1.0f, i, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0194d2) {
            C0194d2 c0194d2 = (C0194d2) obj;
            if (this.f1086a == c0194d2.f1086a && this.f1087b == c0194d2.f1087b && this.f1088c == c0194d2.f1088c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1088c) + ((((217 + this.f1086a) * 31) + this.f1087b) * 31);
    }

    public C0194d2(float f8, int i, int i4) {
        this.f1086a = i;
        this.f1087b = i4;
        this.f1088c = f8;
    }
}
