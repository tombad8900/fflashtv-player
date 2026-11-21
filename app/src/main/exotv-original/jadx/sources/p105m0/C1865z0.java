package p105m0;

import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.lifecycle.AbstractC0150o;
import p037e0.C0851b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.z0 */
/* loaded from: classes.dex */
public final class C1865z0 extends AbstractC1793a1 {

    /* renamed from: e */
    public final WindowInsetsAnimation f6967e;

    public C1865z0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f6967e = windowInsetsAnimation;
    }

    /* renamed from: f */
    public static C0851b m3654f(WindowInsetsAnimation.Bounds bounds) {
        return C0851b.m2023d(bounds.getUpperBound());
    }

    /* renamed from: g */
    public static C0851b m3655g(WindowInsetsAnimation.Bounds bounds) {
        return C0851b.m2023d(bounds.getLowerBound());
    }

    /* renamed from: h */
    public static void m3656h(View view, AbstractC0150o abstractC0150o) {
        view.setWindowInsetsAnimationCallback(new C1863y0(abstractC0150o));
    }

    @Override // p105m0.AbstractC1793a1
    /* renamed from: a */
    public final float mo3496a() {
        return this.f6967e.getAlpha();
    }

    @Override // p105m0.AbstractC1793a1
    /* renamed from: b */
    public final long mo3497b() {
        return this.f6967e.getDurationMillis();
    }

    @Override // p105m0.AbstractC1793a1
    /* renamed from: c */
    public final float mo3498c() {
        return this.f6967e.getInterpolatedFraction();
    }

    @Override // p105m0.AbstractC1793a1
    /* renamed from: d */
    public final int mo3499d() {
        return this.f6967e.getTypeMask();
    }

    @Override // p105m0.AbstractC1793a1
    /* renamed from: e */
    public final void mo3500e(float f8) {
        this.f6967e.setFraction(f8);
    }
}
