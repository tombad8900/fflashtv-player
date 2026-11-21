package p105m0;

import android.view.WindowInsets;
import p037e0.C0851b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.j1 */
/* loaded from: classes.dex */
public class C1820j1 extends AbstractC1817i1 {

    /* renamed from: n */
    public C0851b f6898n;

    public C1820j1(C1844r1 c1844r1, WindowInsets windowInsets) {
        super(c1844r1, windowInsets);
        this.f6898n = null;
    }

    @Override // p105m0.C1835o1
    /* renamed from: b */
    public C1844r1 mo3575b() {
        return C1844r1.m3621g(null, this.f6891c.consumeStableInsets());
    }

    @Override // p105m0.C1835o1
    /* renamed from: c */
    public C1844r1 mo3576c() {
        return C1844r1.m3621g(null, this.f6891c.consumeSystemWindowInsets());
    }

    @Override // p105m0.C1835o1
    /* renamed from: i */
    public final C0851b mo3577i() {
        if (this.f6898n == null) {
            WindowInsets windowInsets = this.f6891c;
            this.f6898n = C0851b.m2022c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f6898n;
    }

    @Override // p105m0.C1835o1
    /* renamed from: n */
    public boolean mo3578n() {
        return this.f6891c.isConsumed();
    }

    @Override // p105m0.C1835o1
    /* renamed from: r */
    public void mo3579r(C0851b c0851b) {
        this.f6898n = c0851b;
    }
}
