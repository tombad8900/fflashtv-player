package p195w4;

import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.m0 */
/* loaded from: classes.dex */
public final class C2676m0 {

    /* renamed from: a */
    public final String f9722a;

    /* renamed from: b */
    public final int f9723b;

    public C2676m0(String str, int i) {
        this.f9722a = str;
        this.f9723b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2676m0)) {
            return false;
        }
        C2676m0 c2676m0 = (C2676m0) obj;
        return AbstractC2980h.m5132a(this.f9722a, c2676m0.f9722a) && this.f9723b == c2676m0.f9723b;
    }

    public final int hashCode() {
        String str = this.f9722a;
        return Integer.hashCode(this.f9723b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SubLang(code=" + this.f9722a + ", label=" + this.f9723b + ")";
    }
}
