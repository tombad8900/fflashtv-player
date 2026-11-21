package p204x4;

import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.b */
/* loaded from: classes.dex */
public final class C2759b {

    /* renamed from: a */
    public final String f10209a;

    /* renamed from: b */
    public final String f10210b;

    public C2759b(String str, String str2) {
        this.f10209a = str;
        this.f10210b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2759b)) {
            return false;
        }
        C2759b c2759b = (C2759b) obj;
        return AbstractC2980h.m5132a(this.f10209a, c2759b.f10209a) && AbstractC2980h.m5132a(this.f10210b, c2759b.f10210b);
    }

    public final int hashCode() {
        String str = this.f10209a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10210b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Meta(fileName=" + this.f10209a + ", imdbId=" + this.f10210b + ")";
    }
}
