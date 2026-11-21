package p218z4;

import java.util.List;
import java.util.Map;
import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z4.n */
/* loaded from: classes.dex */
public final class C2958n {

    /* renamed from: a */
    public final List f11026a;

    /* renamed from: b */
    public final String f11027b;

    /* renamed from: c */
    public final Map f11028c;

    /* renamed from: d */
    public final String f11029d;

    /* renamed from: e */
    public final String f11030e;

    public C2958n(List list, String str, Map map, String str2, String str3) {
        AbstractC2980h.m5136e("headers", map);
        this.f11026a = list;
        this.f11027b = str;
        this.f11028c = map;
        this.f11029d = str2;
        this.f11030e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2958n)) {
            return false;
        }
        C2958n c2958n = (C2958n) obj;
        return AbstractC2980h.m5132a(this.f11026a, c2958n.f11026a) && AbstractC2980h.m5132a(this.f11027b, c2958n.f11027b) && AbstractC2980h.m5132a(this.f11028c, c2958n.f11028c) && AbstractC2980h.m5132a(this.f11029d, c2958n.f11029d) && AbstractC2980h.m5132a(this.f11030e, c2958n.f11030e);
    }

    public final int hashCode() {
        int iHashCode = this.f11026a.hashCode() * 31;
        String str = this.f11027b;
        int iHashCode2 = (this.f11028c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f11029d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11030e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(urls=");
        sb.append(this.f11026a);
        sb.append(", referer=");
        sb.append(this.f11027b);
        sb.append(", headers=");
        sb.append(this.f11028c);
        sb.append(", fileName=");
        sb.append(this.f11029d);
        sb.append(", imdbId=");
        return AbstractC0008a1.m18n(sb, this.f11030e, ")");
    }
}
