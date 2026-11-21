package p187v5;

import android.graphics.Typeface;
import p095l.C1629o;
import p162s5.C2365c;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v5.a */
/* loaded from: classes.dex */
public final class C2549a extends AbstractC2415i0 {

    /* renamed from: a */
    public final Typeface f9242a;

    /* renamed from: b */
    public final C1629o f9243b;

    /* renamed from: c */
    public boolean f9244c;

    public C2549a(C1629o c1629o, Typeface typeface) {
        this.f9242a = typeface;
        this.f9243b = c1629o;
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: v */
    public final void mo3675v(int i) {
        if (this.f9244c) {
            return;
        }
        C2365c c2365c = (C2365c) this.f9243b.f6229j;
        if (c2365c.m4203l(this.f9242a)) {
            c2365c.m4201j(false);
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: w */
    public final void mo3676w(Typeface typeface, boolean z7) {
        if (this.f9244c) {
            return;
        }
        C2365c c2365c = (C2365c) this.f9243b.f6229j;
        if (c2365c.m4203l(typeface)) {
            c2365c.m4201j(false);
        }
    }
}
