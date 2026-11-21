package p099l3;

import p073i3.AbstractC1266o;
import p073i3.EnumC1257f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l3.n */
/* loaded from: classes.dex */
public final class C1672n extends AbstractC1664f {

    /* renamed from: a */
    public final AbstractC1266o f6409a;

    /* renamed from: b */
    public final String f6410b;

    /* renamed from: c */
    public final EnumC1257f f6411c;

    public C1672n(AbstractC1266o abstractC1266o, String str, EnumC1257f enumC1257f) {
        this.f6409a = abstractC1266o;
        this.f6410b = str;
        this.f6411c = enumC1257f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1672n)) {
            return false;
        }
        C1672n c1672n = (C1672n) obj;
        return AbstractC2980h.m5132a(this.f6409a, c1672n.f6409a) && AbstractC2980h.m5132a(this.f6410b, c1672n.f6410b) && this.f6411c == c1672n.f6411c;
    }

    public final int hashCode() {
        int iHashCode = this.f6409a.hashCode() * 31;
        String str = this.f6410b;
        return this.f6411c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
