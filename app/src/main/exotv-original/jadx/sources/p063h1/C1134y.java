package p063h1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.y */
/* loaded from: classes.dex */
public final class C1134y {

    /* renamed from: c */
    public static final C1134y f4802c = new C1134y(-1, -1);

    /* renamed from: a */
    public final int f4803a;

    /* renamed from: b */
    public final int f4804b;

    static {
        new C1134y(0, 0);
    }

    public C1134y(int i, int i4) {
        AbstractC1101a.m2353d((i == -1 || i >= 0) && (i4 == -1 || i4 >= 0));
        this.f4803a = i;
        this.f4804b = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1134y) {
            C1134y c1134y = (C1134y) obj;
            if (this.f4803a == c1134y.f4803a && this.f4804b == c1134y.f4804b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4803a;
        return ((i >>> 16) | (i << 16)) ^ this.f4804b;
    }

    public final String toString() {
        return this.f4803a + "x" + this.f4804b;
    }
}
