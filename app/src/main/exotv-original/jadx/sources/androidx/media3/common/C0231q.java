package androidx.media3.common;

import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.q */
/* loaded from: classes.dex */
public final class C0231q {

    /* renamed from: a */
    public final int f1280a;

    /* renamed from: b */
    public final int f1281b;

    static {
        AbstractC1118i0.m2422M(0);
        AbstractC1118i0.m2422M(1);
        AbstractC1118i0.m2422M(2);
        AbstractC1118i0.m2422M(3);
    }

    public C0231q(C0228p c0228p) {
        this.f1280a = c0228p.f1276a;
        this.f1281b = c0228p.f1277b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0231q)) {
            return false;
        }
        C0231q c0231q = (C0231q) obj;
        if (this.f1280a != c0231q.f1280a || this.f1281b != c0231q.f1281b) {
            return false;
        }
        int i = AbstractC1118i0.f4750a;
        return true;
    }

    public final int hashCode() {
        return (((16337 + this.f1280a) * 31) + this.f1281b) * 31;
    }
}
