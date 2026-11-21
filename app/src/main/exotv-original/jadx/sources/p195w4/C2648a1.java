package p195w4;

import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.a1 */
/* loaded from: classes.dex */
public final class C2648a1 {

    /* renamed from: a */
    public final int f9636a;

    /* renamed from: b */
    public final String f9637b;

    /* renamed from: c */
    public final String f9638c;

    /* renamed from: d */
    public final int f9639d;

    /* renamed from: e */
    public final String f9640e;

    /* renamed from: f */
    public final String f9641f;

    /* renamed from: g */
    public final int f9642g;

    public C2648a1(int i, String str, String str2, int i4, String str3, String str4, int i8) {
        this.f9636a = i;
        this.f9637b = str;
        this.f9638c = str2;
        this.f9639d = i4;
        this.f9640e = str3;
        this.f9641f = str4;
        this.f9642g = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2648a1)) {
            return false;
        }
        C2648a1 c2648a1 = (C2648a1) obj;
        return this.f9636a == c2648a1.f9636a && AbstractC2980h.m5132a(this.f9637b, c2648a1.f9637b) && AbstractC2980h.m5132a(this.f9638c, c2648a1.f9638c) && this.f9639d == c2648a1.f9639d && AbstractC2980h.m5132a(this.f9640e, c2648a1.f9640e) && AbstractC2980h.m5132a(this.f9641f, c2648a1.f9641f) && this.f9642g == c2648a1.f9642g;
    }

    public final int hashCode() {
        int iM9e = AbstractC0008a1.m9e(this.f9637b, Integer.hashCode(this.f9636a) * 31, 31);
        String str = this.f9638c;
        int iM9e2 = AbstractC0008a1.m9e(this.f9640e, (Integer.hashCode(this.f9639d) + ((iM9e + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        String str2 = this.f9641f;
        return Integer.hashCode(this.f9642g) + ((iM9e2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Episode(number=" + this.f9636a + ", name=" + this.f9637b + ", still=" + this.f9638c + ", runtime=" + this.f9639d + ", overview=" + this.f9640e + ", airDate=" + this.f9641f + ", tmdbNumber=" + this.f9642g + ")";
    }
}
