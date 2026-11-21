package p204x4;

import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.l */
/* loaded from: classes.dex */
public final class C2769l {

    /* renamed from: a */
    public final long f10241a;

    /* renamed from: b */
    public final String f10242b;

    /* renamed from: c */
    public final String f10243c;

    /* renamed from: d */
    public final String f10244d;

    /* renamed from: e */
    public final String f10245e;

    /* renamed from: f */
    public final Double f10246f;

    public C2769l(long j, String str, String str2, String str3, String str4, Double d8) {
        this.f10241a = j;
        this.f10242b = str;
        this.f10243c = str2;
        this.f10244d = str3;
        this.f10245e = str4;
        this.f10246f = d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2769l)) {
            return false;
        }
        C2769l c2769l = (C2769l) obj;
        return this.f10241a == c2769l.f10241a && AbstractC2980h.m5132a(this.f10242b, c2769l.f10242b) && AbstractC2980h.m5132a(this.f10243c, c2769l.f10243c) && AbstractC2980h.m5132a(this.f10244d, c2769l.f10244d) && AbstractC2980h.m5132a(this.f10245e, c2769l.f10245e) && AbstractC2980h.m5132a(this.f10246f, c2769l.f10246f);
    }

    public final int hashCode() {
        int iM9e = AbstractC0008a1.m9e(this.f10243c, AbstractC0008a1.m9e(this.f10242b, Long.hashCode(this.f10241a) * 31, 31), 31);
        String str = this.f10244d;
        int iHashCode = (iM9e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10245e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d8 = this.f10246f;
        return iHashCode2 + (d8 != null ? d8.hashCode() : 0);
    }

    public final String toString() {
        return "MediaCard(id=" + this.f10241a + ", title=" + this.f10242b + ", year=" + this.f10243c + ", poster=" + this.f10244d + ", backdrop=" + this.f10245e + ", rating=" + this.f10246f + ")";
    }
}
