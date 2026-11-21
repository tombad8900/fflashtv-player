package p195w4;

import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.o */
/* loaded from: classes.dex */
public final class C2679o {

    /* renamed from: a */
    public final boolean f9728a;

    /* renamed from: b */
    public final String f9729b;

    /* renamed from: c */
    public final boolean f9730c;

    public C2679o(String str, boolean z7, boolean z8) {
        this.f9728a = z7;
        this.f9729b = str;
        this.f9730c = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2679o)) {
            return false;
        }
        C2679o c2679o = (C2679o) obj;
        return this.f9728a == c2679o.f9728a && AbstractC2980h.m5132a(this.f9729b, c2679o.f9729b) && this.f9730c == c2679o.f9730c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f9728a) * 31;
        String str = this.f9729b;
        return Boolean.hashCode(this.f9730c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PageState(loading=" + this.f9728a + ", message=" + this.f9729b + ", canReload=" + this.f9730c + ")";
    }
}
