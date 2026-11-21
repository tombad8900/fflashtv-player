package p076i7;

import p112m7.C1932h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.y0 */
/* loaded from: classes.dex */
public final class C1342y0 extends AbstractC1338w0 {

    /* renamed from: n */
    public final C1279a1 f5388n;

    /* renamed from: o */
    public final C1344z0 f5389o;

    /* renamed from: p */
    public final C1307k f5390p;

    /* renamed from: q */
    public final Object f5391q;

    public C1342y0(C1279a1 c1279a1, C1344z0 c1344z0, C1307k c1307k, Object obj) {
        this.f5388n = c1279a1;
        this.f5389o = c1344z0;
        this.f5390p = c1307k;
        this.f5391q = obj;
    }

    @Override // p076i7.AbstractC1338w0
    /* renamed from: j */
    public final boolean mo2816j() {
        return false;
    }

    @Override // p076i7.AbstractC1338w0
    /* renamed from: k */
    public final void mo2817k(Throwable th) {
        C1307k c1307k = this.f5390p;
        C1307k c1307kM2744J = C1279a1.m2744J(c1307k);
        C1279a1 c1279a1 = this.f5388n;
        C1344z0 c1344z0 = this.f5389o;
        Object obj = this.f5391q;
        if (c1307kM2744J == null || !c1279a1.m2759S(c1344z0, c1307kM2744J, obj)) {
            c1344z0.f5396j.m3778d(new C1932h(2), 2);
            C1307k c1307kM2744J2 = C1279a1.m2744J(c1307k);
            if (c1307kM2744J2 == null || !c1279a1.m2759S(c1344z0, c1307kM2744J2, obj)) {
                c1279a1.mo2763k(c1279a1.m2771u(c1344z0, obj));
            }
        }
    }
}
