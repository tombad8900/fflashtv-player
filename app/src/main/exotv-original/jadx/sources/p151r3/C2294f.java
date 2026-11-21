package p151r3;

import android.graphics.drawable.Drawable;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r3.f */
/* loaded from: classes.dex */
public final class C2294f extends AbstractC2300l {

    /* renamed from: a */
    public final Drawable f8006a;

    /* renamed from: b */
    public final C2299k f8007b;

    /* renamed from: c */
    public final Throwable f8008c;

    public C2294f(Drawable drawable, C2299k c2299k, Throwable th) {
        this.f8006a = drawable;
        this.f8007b = c2299k;
        this.f8008c = th;
    }

    @Override // p151r3.AbstractC2300l
    /* renamed from: a */
    public final Drawable mo4094a() {
        return this.f8006a;
    }

    @Override // p151r3.AbstractC2300l
    /* renamed from: b */
    public final C2299k mo4095b() {
        return this.f8007b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2294f)) {
            return false;
        }
        C2294f c2294f = (C2294f) obj;
        return AbstractC2980h.m5132a(this.f8006a, c2294f.f8006a) && AbstractC2980h.m5132a(this.f8007b, c2294f.f8007b) && AbstractC2980h.m5132a(this.f8008c, c2294f.f8008c);
    }

    public final int hashCode() {
        Drawable drawable = this.f8006a;
        return this.f8008c.hashCode() + ((this.f8007b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
