package p204x4;

import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.o */
/* loaded from: classes.dex */
public final class C2772o {

    /* renamed from: a */
    public final Integer f10262a;

    /* renamed from: b */
    public final Integer f10263b;

    /* renamed from: c */
    public final EnumC2773p f10264c;

    /* renamed from: d */
    public final String f10265d;

    /* renamed from: e */
    public final double f10266e;

    /* renamed from: f */
    public final Integer f10267f;

    /* renamed from: g */
    public final Integer f10268g;

    /* renamed from: h */
    public final String f10269h;

    public C2772o(Integer num, Integer num2, EnumC2773p enumC2773p, String str, double d8, Integer num3, Integer num4, String str2) {
        this.f10262a = num;
        this.f10263b = num2;
        this.f10264c = enumC2773p;
        this.f10265d = str;
        this.f10266e = d8;
        this.f10267f = num3;
        this.f10268g = num4;
        this.f10269h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2772o)) {
            return false;
        }
        C2772o c2772o = (C2772o) obj;
        return AbstractC2980h.m5132a(this.f10262a, c2772o.f10262a) && AbstractC2980h.m5132a(this.f10263b, c2772o.f10263b) && this.f10264c == c2772o.f10264c && AbstractC2980h.m5132a(this.f10265d, c2772o.f10265d) && Double.compare(this.f10266e, c2772o.f10266e) == 0 && AbstractC2980h.m5132a(this.f10267f, c2772o.f10267f) && AbstractC2980h.m5132a(this.f10268g, c2772o.f10268g) && AbstractC2980h.m5132a(this.f10269h, c2772o.f10269h);
    }

    public final int hashCode() {
        Integer num = this.f10262a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10263b;
        int iHashCode2 = (Double.hashCode(this.f10266e) + AbstractC0008a1.m9e(this.f10265d, (this.f10264c.hashCode() + ((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31, 31)) * 31;
        Integer num3 = this.f10267f;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10268g;
        return this.f10269h.hashCode() + ((iHashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Release(year=" + this.f10262a + ", height=" + this.f10263b + ", source=" + this.f10264c + ", group=" + this.f10265d + ", fps=" + this.f10266e + ", season=" + this.f10267f + ", episode=" + this.f10268g + ", edition=" + this.f10269h + ")";
    }
}
