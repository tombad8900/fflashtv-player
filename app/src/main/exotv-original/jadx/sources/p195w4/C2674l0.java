package p195w4;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.l0 */
/* loaded from: classes.dex */
public final class C2674l0 {

    /* renamed from: a */
    public final int f9717a;

    /* renamed from: b */
    public final int f9718b;

    public C2674l0(int i, int i4) {
        this.f9717a = i;
        this.f9718b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2674l0)) {
            return false;
        }
        C2674l0 c2674l0 = (C2674l0) obj;
        return this.f9717a == c2674l0.f9717a && this.f9718b == c2674l0.f9718b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9718b) + (Integer.hashCode(this.f9717a) * 31);
    }

    public final String toString() {
        return "QualityTier(name=" + this.f9717a + ", height=" + this.f9718b + ")";
    }
}
