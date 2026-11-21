package p151r3;

import android.graphics.drawable.Drawable;
import p073i3.EnumC1257f;
import p134p3.C2207a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r3.r */
/* loaded from: classes.dex */
public final class C2306r extends AbstractC2300l {

    /* renamed from: a */
    public final Drawable f8072a;

    /* renamed from: b */
    public final C2299k f8073b;

    /* renamed from: c */
    public final EnumC1257f f8074c;

    /* renamed from: d */
    public final C2207a f8075d;

    /* renamed from: e */
    public final String f8076e;

    /* renamed from: f */
    public final boolean f8077f;

    /* renamed from: g */
    public final boolean f8078g;

    public C2306r(Drawable drawable, C2299k c2299k, EnumC1257f enumC1257f, C2207a c2207a, String str, boolean z7, boolean z8) {
        this.f8072a = drawable;
        this.f8073b = c2299k;
        this.f8074c = enumC1257f;
        this.f8075d = c2207a;
        this.f8076e = str;
        this.f8077f = z7;
        this.f8078g = z8;
    }

    @Override // p151r3.AbstractC2300l
    /* renamed from: a */
    public final Drawable mo4094a() {
        return this.f8072a;
    }

    @Override // p151r3.AbstractC2300l
    /* renamed from: b */
    public final C2299k mo4095b() {
        return this.f8073b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2306r)) {
            return false;
        }
        C2306r c2306r = (C2306r) obj;
        return AbstractC2980h.m5132a(this.f8072a, c2306r.f8072a) && AbstractC2980h.m5132a(this.f8073b, c2306r.f8073b) && this.f8074c == c2306r.f8074c && AbstractC2980h.m5132a(this.f8075d, c2306r.f8075d) && AbstractC2980h.m5132a(this.f8076e, c2306r.f8076e) && this.f8077f == c2306r.f8077f && this.f8078g == c2306r.f8078g;
    }

    public final int hashCode() {
        int iHashCode = (this.f8074c.hashCode() + ((this.f8073b.hashCode() + (this.f8072a.hashCode() * 31)) * 31)) * 31;
        C2207a c2207a = this.f8075d;
        int iHashCode2 = (iHashCode + (c2207a != null ? c2207a.hashCode() : 0)) * 31;
        String str = this.f8076e;
        return Boolean.hashCode(this.f8078g) + ((Boolean.hashCode(this.f8077f) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }
}
