package p195w4;

import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.b1 */
/* loaded from: classes.dex */
public final class C2651b1 {

    /* renamed from: a */
    public final int f9651a;

    /* renamed from: b */
    public final String f9652b;

    /* renamed from: c */
    public final int f9653c;

    /* renamed from: d */
    public final String f9654d;

    /* renamed from: e */
    public final String f9655e;

    public /* synthetic */ C2651b1(int i) {
        this(1, 0, "Season 1", null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2651b1)) {
            return false;
        }
        C2651b1 c2651b1 = (C2651b1) obj;
        return this.f9651a == c2651b1.f9651a && AbstractC2980h.m5132a(this.f9652b, c2651b1.f9652b) && this.f9653c == c2651b1.f9653c && AbstractC2980h.m5132a(this.f9654d, c2651b1.f9654d) && AbstractC2980h.m5132a(this.f9655e, c2651b1.f9655e);
    }

    public final int hashCode() {
        int iHashCode = (Integer.hashCode(this.f9653c) + AbstractC0008a1.m9e(this.f9652b, Integer.hashCode(this.f9651a) * 31, 31)) * 31;
        String str = this.f9654d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9655e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Season(number=");
        sb.append(this.f9651a);
        sb.append(", name=");
        sb.append(this.f9652b);
        sb.append(", episodes=");
        sb.append(this.f9653c);
        sb.append(", poster=");
        sb.append(this.f9654d);
        sb.append(", airDate=");
        return AbstractC0008a1.m18n(sb, this.f9655e, ")");
    }

    public C2651b1(int i, int i4, String str, String str2, String str3) {
        AbstractC2980h.m5136e("name", str);
        this.f9651a = i;
        this.f9652b = str;
        this.f9653c = i4;
        this.f9654d = str2;
        this.f9655e = str3;
    }
}
