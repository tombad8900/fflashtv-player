package p204x4;

import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.c */
/* loaded from: classes.dex */
public final class C2760c {

    /* renamed from: a */
    public final String f10211a;

    /* renamed from: b */
    public final String f10212b;

    /* renamed from: c */
    public final String f10213c;

    /* renamed from: d */
    public final String f10214d;

    /* renamed from: e */
    public final String f10215e;

    public C2760c(String str, String str2, String str3, String str4, String str5) {
        AbstractC2980h.m5136e("gateUrl", str);
        AbstractC2980h.m5136e("playerUrl", str2);
        this.f10211a = str;
        this.f10212b = str2;
        this.f10213c = str3;
        this.f10214d = str4;
        this.f10215e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2760c)) {
            return false;
        }
        C2760c c2760c = (C2760c) obj;
        return AbstractC2980h.m5132a(this.f10211a, c2760c.f10211a) && AbstractC2980h.m5132a(this.f10212b, c2760c.f10212b) && AbstractC2980h.m5132a(this.f10213c, c2760c.f10213c) && AbstractC2980h.m5132a(this.f10214d, c2760c.f10214d) && AbstractC2980h.m5132a(this.f10215e, c2760c.f10215e);
    }

    public final int hashCode() {
        int iM9e = AbstractC0008a1.m9e(this.f10212b, this.f10211a.hashCode() * 31, 31);
        String str = this.f10213c;
        int iHashCode = (iM9e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10214d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10215e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Context(gateUrl=");
        sb.append(this.f10211a);
        sb.append(", playerUrl=");
        sb.append(this.f10212b);
        sb.append(", fileName=");
        sb.append(this.f10213c);
        sb.append(", imdbId=");
        sb.append(this.f10214d);
        sb.append(", apiToken=");
        return AbstractC0008a1.m18n(sb, this.f10215e, ")");
    }
}
