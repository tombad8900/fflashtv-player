package p195w4;

import java.util.Set;
import p010b.C0533w;
import p111m6.C1923r;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.k */
/* loaded from: classes.dex */
public final class C2671k {

    /* renamed from: a */
    public final C2675m f9706a;

    /* renamed from: b */
    public final EnumC2681p f9707b;

    /* renamed from: c */
    public final InterfaceC2840a f9708c;

    /* renamed from: d */
    public final Set f9709d;

    public C2671k(C2675m c2675m, EnumC2681p enumC2681p, C0533w c0533w, Set set, int i) {
        c0533w = (i & 4) != 0 ? null : c0533w;
        set = (i & 8) != 0 ? C1923r.f7189j : set;
        AbstractC2980h.m5136e("excludeGenres", set);
        this.f9706a = c2675m;
        this.f9707b = enumC2681p;
        this.f9708c = c0533w;
        this.f9709d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2671k)) {
            return false;
        }
        C2671k c2671k = (C2671k) obj;
        return AbstractC2980h.m5132a(this.f9706a, c2671k.f9706a) && this.f9707b == c2671k.f9707b && AbstractC2980h.m5132a(this.f9708c, c2671k.f9708c) && AbstractC2980h.m5132a(this.f9709d, c2671k.f9709d);
    }

    public final int hashCode() {
        int iHashCode = (this.f9707b.hashCode() + (this.f9706a.hashCode() * 31)) * 31;
        InterfaceC2840a interfaceC2840a = this.f9708c;
        return this.f9709d.hashCode() + ((iHashCode + (interfaceC2840a == null ? 0 : interfaceC2840a.hashCode())) * 31);
    }

    public final String toString() {
        return "Block(cat=" + this.f9706a + ", shape=" + this.f9707b + ", query=" + this.f9708c + ", excludeGenres=" + this.f9709d + ")";
    }
}
