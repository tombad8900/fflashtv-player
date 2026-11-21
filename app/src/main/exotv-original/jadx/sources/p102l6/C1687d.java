package p102l6;

import java.io.Serializable;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l6.d */
/* loaded from: classes.dex */
public final class C1687d implements Serializable {

    /* renamed from: j */
    public final Object f6486j;

    /* renamed from: k */
    public final Object f6487k;

    public C1687d(Object obj, Object obj2) {
        this.f6486j = obj;
        this.f6487k = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1687d)) {
            return false;
        }
        C1687d c1687d = (C1687d) obj;
        return AbstractC2980h.m5132a(this.f6486j, c1687d.f6486j) && AbstractC2980h.m5132a(this.f6487k, c1687d.f6487k);
    }

    public final int hashCode() {
        Object obj = this.f6486j;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f6487k;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f6486j + ", " + this.f6487k + ')';
    }
}
