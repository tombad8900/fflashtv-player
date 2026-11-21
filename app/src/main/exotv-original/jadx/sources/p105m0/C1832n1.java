package p105m0;

import android.view.WindowInsets;
import p037e0.C0851b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.n1 */
/* loaded from: classes.dex */
public final class C1832n1 extends C1829m1 {

    /* renamed from: s */
    public static final C1844r1 f6918s = C1844r1.m3621g(null, WindowInsets.CONSUMED);

    public C1832n1(C1844r1 c1844r1, WindowInsets windowInsets) {
        super(c1844r1, windowInsets);
    }

    @Override // p105m0.C1829m1, p105m0.AbstractC1817i1, p105m0.C1835o1
    /* renamed from: f */
    public C0851b mo3563f(int i) {
        return C0851b.m2023d(this.f6891c.getInsets(AbstractC1841q1.m3614a(i)));
    }

    @Override // p105m0.C1829m1, p105m0.AbstractC1817i1, p105m0.C1835o1
    /* renamed from: g */
    public C0851b mo3564g(int i) {
        return C0851b.m2023d(this.f6891c.getInsetsIgnoringVisibility(AbstractC1841q1.m3614a(i)));
    }
}
