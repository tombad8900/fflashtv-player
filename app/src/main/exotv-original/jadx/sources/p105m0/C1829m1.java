package p105m0;

import android.view.View;
import android.view.WindowInsets;
import p037e0.C0851b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.m1 */
/* loaded from: classes.dex */
public class C1829m1 extends C1826l1 {

    /* renamed from: r */
    public static final C1844r1 f6916r = C1844r1.m3621g(null, WindowInsets.CONSUMED);

    public C1829m1(C1844r1 c1844r1, WindowInsets windowInsets) {
        super(c1844r1, windowInsets);
    }

    @Override // p105m0.AbstractC1817i1, p105m0.C1835o1
    /* renamed from: d */
    public final void mo3562d(View view) {
    }

    @Override // p105m0.AbstractC1817i1, p105m0.C1835o1
    /* renamed from: f */
    public C0851b mo3563f(int i) {
        return C0851b.m2023d(this.f6891c.getInsets(AbstractC1838p1.m3613a(i)));
    }

    @Override // p105m0.AbstractC1817i1, p105m0.C1835o1
    /* renamed from: g */
    public C0851b mo3564g(int i) {
        return C0851b.m2023d(this.f6891c.getInsetsIgnoringVisibility(AbstractC1838p1.m3613a(i)));
    }
}
