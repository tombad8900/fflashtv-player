package p105m0;

import android.view.WindowInsets;
import p037e0.C0851b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.l1 */
/* loaded from: classes.dex */
public class C1826l1 extends C1823k1 {

    /* renamed from: o */
    public C0851b f6908o;

    /* renamed from: p */
    public C0851b f6909p;

    /* renamed from: q */
    public C0851b f6910q;

    public C1826l1(C1844r1 c1844r1, WindowInsets windowInsets) {
        super(c1844r1, windowInsets);
        this.f6908o = null;
        this.f6909p = null;
        this.f6910q = null;
    }

    @Override // p105m0.C1835o1
    /* renamed from: h */
    public C0851b mo3593h() {
        if (this.f6909p == null) {
            this.f6909p = C0851b.m2023d(this.f6891c.getMandatorySystemGestureInsets());
        }
        return this.f6909p;
    }

    @Override // p105m0.C1835o1
    /* renamed from: j */
    public C0851b mo3594j() {
        if (this.f6908o == null) {
            this.f6908o = C0851b.m2023d(this.f6891c.getSystemGestureInsets());
        }
        return this.f6908o;
    }

    @Override // p105m0.C1835o1
    /* renamed from: l */
    public C0851b mo3595l() {
        if (this.f6910q == null) {
            this.f6910q = C0851b.m2023d(this.f6891c.getTappableElementInsets());
        }
        return this.f6910q;
    }

    @Override // p105m0.AbstractC1817i1, p105m0.C1835o1
    /* renamed from: m */
    public C1844r1 mo3566m(int i, int i4, int i8, int i9) {
        return C1844r1.m3621g(null, this.f6891c.inset(i, i4, i8, i9));
    }

    @Override // p105m0.C1820j1, p105m0.C1835o1
    /* renamed from: r */
    public void mo3579r(C0851b c0851b) {
    }
}
