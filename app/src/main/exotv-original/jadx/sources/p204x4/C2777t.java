package p204x4;

import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.t */
/* loaded from: classes.dex */
public final class C2777t {

    /* renamed from: a */
    public final String f10297a;

    /* renamed from: b */
    public final String f10298b;

    /* renamed from: c */
    public final String f10299c;

    /* renamed from: d */
    public final String f10300d;

    /* renamed from: e */
    public final String f10301e;

    /* renamed from: f */
    public final String f10302f;

    /* renamed from: g */
    public final int f10303g;

    /* renamed from: h */
    public final int f10304h;

    /* renamed from: i */
    public final int f10305i;

    /* renamed from: j */
    public final String f10306j;

    /* renamed from: k */
    public final double f10307k;

    /* renamed from: l */
    public final int f10308l;

    /* renamed from: m */
    public final boolean f10309m;

    /* renamed from: n */
    public final boolean f10310n;

    /* renamed from: o */
    public final boolean f10311o;

    public C2777t(String str, String str2, String str3, String str4, String str5, String str6, int i, int i4, int i8, String str7, double d8, int i9, boolean z7, boolean z8, boolean z9) {
        this.f10297a = str;
        this.f10298b = str2;
        this.f10299c = str3;
        this.f10300d = str4;
        this.f10301e = str5;
        this.f10302f = str6;
        this.f10303g = i;
        this.f10304h = i4;
        this.f10305i = i8;
        this.f10306j = str7;
        this.f10307k = d8;
        this.f10308l = i9;
        this.f10309m = z7;
        this.f10310n = z8;
        this.f10311o = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2777t)) {
            return false;
        }
        C2777t c2777t = (C2777t) obj;
        return AbstractC2980h.m5132a(this.f10297a, c2777t.f10297a) && AbstractC2980h.m5132a(this.f10298b, c2777t.f10298b) && AbstractC2980h.m5132a(this.f10299c, c2777t.f10299c) && AbstractC2980h.m5132a(this.f10300d, c2777t.f10300d) && AbstractC2980h.m5132a(this.f10301e, c2777t.f10301e) && AbstractC2980h.m5132a(this.f10302f, c2777t.f10302f) && this.f10303g == c2777t.f10303g && this.f10304h == c2777t.f10304h && this.f10305i == c2777t.f10305i && AbstractC2980h.m5132a(this.f10306j, c2777t.f10306j) && Double.compare(this.f10307k, c2777t.f10307k) == 0 && this.f10308l == c2777t.f10308l && this.f10309m == c2777t.f10309m && this.f10310n == c2777t.f10310n && this.f10311o == c2777t.f10311o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10311o) + ((Boolean.hashCode(this.f10310n) + ((Boolean.hashCode(this.f10309m) + ((Integer.hashCode(this.f10308l) + ((Double.hashCode(this.f10307k) + AbstractC0008a1.m9e(this.f10306j, (Integer.hashCode(this.f10305i) + ((Integer.hashCode(this.f10304h) + ((Integer.hashCode(this.f10303g) + AbstractC0008a1.m9e(this.f10302f, AbstractC0008a1.m9e(this.f10301e, AbstractC0008a1.m9e(this.f10300d, AbstractC0008a1.m9e(this.f10299c, AbstractC0008a1.m9e(this.f10298b, this.f10297a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Subtitle(id=" + this.f10297a + ", name=" + this.f10298b + ", release=" + this.f10299c + ", language=" + this.f10300d + ", format=" + this.f10301e + ", encoding=" + this.f10302f + ", downloads=" + this.f10303g + ", season=" + this.f10304h + ", episode=" + this.f10305i + ", download=" + this.f10306j + ", fps=" + this.f10307k + ", sumCd=" + this.f10308l + ", autoTranslation=" + this.f10309m + ", hearingImpaired=" + this.f10310n + ", foreignPartsOnly=" + this.f10311o + ")";
    }
}
