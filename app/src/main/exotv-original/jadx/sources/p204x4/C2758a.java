package p204x4;

import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.a */
/* loaded from: classes.dex */
public final class C2758a {

    /* renamed from: a */
    public final long f10205a;

    /* renamed from: b */
    public final String f10206b;

    /* renamed from: c */
    public final String f10207c;

    /* renamed from: d */
    public final String f10208d;

    public C2758a(long j, String str, String str2, String str3) {
        this.f10205a = j;
        this.f10206b = str;
        this.f10207c = str2;
        this.f10208d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2758a)) {
            return false;
        }
        C2758a c2758a = (C2758a) obj;
        return this.f10205a == c2758a.f10205a && AbstractC2980h.m5132a(this.f10206b, c2758a.f10206b) && AbstractC2980h.m5132a(this.f10207c, c2758a.f10207c) && AbstractC2980h.m5132a(this.f10208d, c2758a.f10208d);
    }

    public final int hashCode() {
        int iM9e = AbstractC0008a1.m9e(this.f10207c, AbstractC0008a1.m9e(this.f10206b, Long.hashCode(this.f10205a) * 31, 31), 31);
        String str = this.f10208d;
        return iM9e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CastMember(id=" + this.f10205a + ", name=" + this.f10206b + ", character=" + this.f10207c + ", profile=" + this.f10208d + ")";
    }
}
