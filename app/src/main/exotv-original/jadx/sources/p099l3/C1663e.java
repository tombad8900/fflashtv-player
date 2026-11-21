package p099l3;

import android.graphics.drawable.Drawable;
import p073i3.EnumC1257f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l3.e */
/* loaded from: classes.dex */
public final class C1663e extends AbstractC1664f {

    /* renamed from: a */
    public final Drawable f6386a;

    /* renamed from: b */
    public final boolean f6387b;

    /* renamed from: c */
    public final EnumC1257f f6388c;

    public C1663e(Drawable drawable, boolean z7, EnumC1257f enumC1257f) {
        this.f6386a = drawable;
        this.f6387b = z7;
        this.f6388c = enumC1257f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1663e)) {
            return false;
        }
        C1663e c1663e = (C1663e) obj;
        return AbstractC2980h.m5132a(this.f6386a, c1663e.f6386a) && this.f6387b == c1663e.f6387b && this.f6388c == c1663e.f6388c;
    }

    public final int hashCode() {
        return this.f6388c.hashCode() + ((Boolean.hashCode(this.f6387b) + (this.f6386a.hashCode() * 31)) * 31);
    }
}
