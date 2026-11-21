package p105m0;

import android.view.WindowInsets;
import p037e0.C0851b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.e1 */
/* loaded from: classes.dex */
public class C1805e1 extends AbstractC1814h1 {

    /* renamed from: c */
    public final WindowInsets.Builder f6868c;

    public C1805e1() {
        this.f6868c = AbstractC1802d1.m3527a();
    }

    @Override // p105m0.AbstractC1814h1
    /* renamed from: b */
    public C1844r1 mo3518b() {
        m3554a();
        C1844r1 c1844r1M3621g = C1844r1.m3621g(null, this.f6868c.build());
        c1844r1M3621g.f6934a.mo3568p(this.f6877b);
        return c1844r1M3621g;
    }

    @Override // p105m0.AbstractC1814h1
    /* renamed from: d */
    public void mo3540d(C0851b c0851b) {
        this.f6868c.setMandatorySystemGestureInsets(c0851b.m2024e());
    }

    @Override // p105m0.AbstractC1814h1
    /* renamed from: e */
    public void mo3519e(C0851b c0851b) {
        this.f6868c.setStableInsets(c0851b.m2024e());
    }

    @Override // p105m0.AbstractC1814h1
    /* renamed from: f */
    public void mo3541f(C0851b c0851b) {
        this.f6868c.setSystemGestureInsets(c0851b.m2024e());
    }

    @Override // p105m0.AbstractC1814h1
    /* renamed from: g */
    public void mo3520g(C0851b c0851b) {
        this.f6868c.setSystemWindowInsets(c0851b.m2024e());
    }

    @Override // p105m0.AbstractC1814h1
    /* renamed from: h */
    public void mo3542h(C0851b c0851b) {
        this.f6868c.setTappableElementInsets(c0851b.m2024e());
    }

    public C1805e1(C1844r1 c1844r1) {
        WindowInsets.Builder builderM3527a;
        super(c1844r1);
        WindowInsets windowInsetsM3626f = c1844r1.m3626f();
        if (windowInsetsM3626f != null) {
            builderM3527a = AbstractC1802d1.m3528b(windowInsetsM3626f);
        } else {
            builderM3527a = AbstractC1802d1.m3527a();
        }
        this.f6868c = builderM3527a;
    }
}
