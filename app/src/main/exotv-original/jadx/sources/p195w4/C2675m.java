package p195w4;

import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.m */
/* loaded from: classes.dex */
public final class C2675m {

    /* renamed from: a */
    public final String f9719a;

    /* renamed from: b */
    public final String f9720b;

    /* renamed from: c */
    public final String f9721c;

    public C2675m(String str, String str2, String str3) {
        AbstractC2980h.m5136e("endpoint", str3);
        this.f9719a = str;
        this.f9720b = str2;
        this.f9721c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2675m)) {
            return false;
        }
        C2675m c2675m = (C2675m) obj;
        return AbstractC2980h.m5132a(this.f9719a, c2675m.f9719a) && AbstractC2980h.m5132a(this.f9720b, c2675m.f9720b) && AbstractC2980h.m5132a(this.f9721c, c2675m.f9721c);
    }

    public final int hashCode() {
        return this.f9721c.hashCode() + AbstractC0008a1.m9e(this.f9720b, this.f9719a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Category(id=");
        sb.append(this.f9719a);
        sb.append(", title=");
        sb.append(this.f9720b);
        sb.append(", endpoint=");
        return AbstractC0008a1.m18n(sb, this.f9721c, ")");
    }
}
