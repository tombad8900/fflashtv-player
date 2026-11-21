package p187v5;

import android.graphics.Typeface;
import p029d0.AbstractC0786b;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v5.b */
/* loaded from: classes.dex */
public final class C2550b extends AbstractC0786b {

    /* renamed from: h */
    public final /* synthetic */ AbstractC2415i0 f9245h;

    /* renamed from: i */
    public final /* synthetic */ C2552d f9246i;

    public C2550b(C2552d c2552d, AbstractC2415i0 abstractC2415i0) {
        this.f9246i = c2552d;
        this.f9245h = abstractC2415i0;
    }

    @Override // p029d0.AbstractC0786b
    /* renamed from: g */
    public final void mo1942g(int i) {
        this.f9246i.f9264n = true;
        this.f9245h.mo3675v(i);
    }

    @Override // p029d0.AbstractC0786b
    /* renamed from: h */
    public final void mo1943h(Typeface typeface) {
        C2552d c2552d = this.f9246i;
        c2552d.f9266p = Typeface.create(typeface, c2552d.f9254d);
        c2552d.f9264n = true;
        this.f9245h.mo3676w(c2552d.f9266p, false);
    }
}
