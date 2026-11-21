package p016b5;

import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b5.j */
/* loaded from: classes.dex */
public final class C0587j {

    /* renamed from: a */
    public final String f2350a;

    /* renamed from: b */
    public final String f2351b;

    public C0587j(String str, String str2) {
        this.f2350a = str;
        this.f2351b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0587j)) {
            return false;
        }
        C0587j c0587j = (C0587j) obj;
        return AbstractC2980h.m5132a(this.f2350a, c0587j.f2350a) && AbstractC2980h.m5132a(this.f2351b, c0587j.f2351b);
    }

    public final int hashCode() {
        int iHashCode = this.f2350a.hashCode() * 31;
        String str = this.f2351b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BodyWithT(body=" + this.f2350a + ", t=" + this.f2351b + ")";
    }
}
