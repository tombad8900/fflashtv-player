package p204x4;

import java.util.List;
import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.n */
/* loaded from: classes.dex */
public final class C2771n {

    /* renamed from: a */
    public final long f10250a;

    /* renamed from: b */
    public final String f10251b;

    /* renamed from: c */
    public final String f10252c;

    /* renamed from: d */
    public final String f10253d;

    /* renamed from: e */
    public final String f10254e;

    /* renamed from: f */
    public final int f10255f;

    /* renamed from: g */
    public final String f10256g;

    /* renamed from: h */
    public final Object f10257h;

    /* renamed from: i */
    public final String f10258i;

    /* renamed from: j */
    public final String f10259j;

    /* renamed from: k */
    public final Double f10260k;

    /* renamed from: l */
    public final Object f10261l;

    public C2771n(long j, String str, String str2, String str3, String str4, int i, String str5, List list, String str6, String str7, Double d8, List list2) {
        this.f10250a = j;
        this.f10251b = str;
        this.f10252c = str2;
        this.f10253d = str3;
        this.f10254e = str4;
        this.f10255f = i;
        this.f10256g = str5;
        this.f10257h = list;
        this.f10258i = str6;
        this.f10259j = str7;
        this.f10260k = d8;
        this.f10261l = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2771n)) {
            return false;
        }
        C2771n c2771n = (C2771n) obj;
        return this.f10250a == c2771n.f10250a && this.f10251b.equals(c2771n.f10251b) && this.f10252c.equals(c2771n.f10252c) && this.f10253d.equals(c2771n.f10253d) && AbstractC2980h.m5132a(this.f10254e, c2771n.f10254e) && this.f10255f == c2771n.f10255f && this.f10256g.equals(c2771n.f10256g) && this.f10257h.equals(c2771n.f10257h) && AbstractC2980h.m5132a(this.f10258i, c2771n.f10258i) && AbstractC2980h.m5132a(this.f10259j, c2771n.f10259j) && AbstractC2980h.m5132a(this.f10260k, c2771n.f10260k) && this.f10261l.equals(c2771n.f10261l);
    }

    public final int hashCode() {
        int iM9e = AbstractC0008a1.m9e(this.f10253d, AbstractC0008a1.m9e(this.f10252c, AbstractC0008a1.m9e(this.f10251b, Long.hashCode(this.f10250a) * 31, 31), 31), 31);
        String str = this.f10254e;
        int iHashCode = (this.f10257h.hashCode() + AbstractC0008a1.m9e(this.f10256g, (Integer.hashCode(this.f10255f) + ((iM9e + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31)) * 31;
        String str2 = this.f10258i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10259j;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d8 = this.f10260k;
        return this.f10261l.hashCode() + ((iHashCode3 + (d8 != null ? d8.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MovieDetail(id=" + this.f10250a + ", title=" + this.f10251b + ", overview=" + this.f10252c + ", year=" + this.f10253d + ", releaseDate=" + this.f10254e + ", runtime=" + this.f10255f + ", status=" + this.f10256g + ", genres=" + this.f10257h + ", poster=" + this.f10258i + ", backdrop=" + this.f10259j + ", rating=" + this.f10260k + ", cast=" + this.f10261l + ")";
    }
}
