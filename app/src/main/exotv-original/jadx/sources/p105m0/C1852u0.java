package p105m0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p037e0.C0851b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.u0 */
/* loaded from: classes.dex */
public final class C1852u0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C1796b1 f6941a;

    /* renamed from: b */
    public final /* synthetic */ C1844r1 f6942b;

    /* renamed from: c */
    public final /* synthetic */ C1844r1 f6943c;

    /* renamed from: d */
    public final /* synthetic */ int f6944d;

    /* renamed from: e */
    public final /* synthetic */ View f6945e;

    public C1852u0(C1796b1 c1796b1, C1844r1 c1844r1, C1844r1 c1844r12, int i, View view) {
        this.f6941a = c1796b1;
        this.f6942b = c1844r1;
        this.f6943c = c1844r12;
        this.f6944d = i;
        this.f6945e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C1796b1 c1796b1 = this.f6941a;
        AbstractC1793a1 abstractC1793a1 = c1796b1.f6856a;
        abstractC1793a1.mo3500e(animatedFraction);
        C1844r1 c1844r1 = this.f6942b;
        C1835o1 c1835o1 = c1844r1.f6934a;
        float fMo3498c = abstractC1793a1.mo3498c();
        PathInterpolator pathInterpolator = C1858w0.f6952e;
        int i = Build.VERSION.SDK_INT;
        AbstractC1814h1 c1811g1 = i >= 34 ? new C1811g1(c1844r1) : i >= 30 ? new C1808f1(c1844r1) : i >= 29 ? new C1805e1(c1844r1) : new C1799c1(c1844r1);
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((this.f6944d & i4) == 0) {
                c1811g1.mo3545c(i4, c1835o1.mo3563f(i4));
            } else {
                C0851b c0851bMo3563f = c1835o1.mo3563f(i4);
                C0851b c0851bMo3563f2 = this.f6943c.f6934a.mo3563f(i4);
                float f8 = 1.0f - fMo3498c;
                c1811g1.mo3545c(i4, C1844r1.m3620e(c0851bMo3563f, (int) (((c0851bMo3563f.f3769a - c0851bMo3563f2.f3769a) * f8) + 0.5d), (int) (((c0851bMo3563f.f3770b - c0851bMo3563f2.f3770b) * f8) + 0.5d), (int) (((c0851bMo3563f.f3771c - c0851bMo3563f2.f3771c) * f8) + 0.5d), (int) (((c0851bMo3563f.f3772d - c0851bMo3563f2.f3772d) * f8) + 0.5d)));
            }
        }
        C1858w0.m3646h(this.f6945e, c1811g1.mo3518b(), Collections.singletonList(c1796b1));
    }
}
