package p017b6;

import android.animation.ValueAnimator;
import p193w2.C2607d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C0609j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f2411a;

    /* renamed from: b */
    public final /* synthetic */ Object f2412b;

    public /* synthetic */ C0609j(int i, Object obj) {
        this.f2411a = i;
        this.f2412b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2411a) {
            case 0:
                C0615o c0615o = (C0615o) this.f2412b;
                c0615o.getClass();
                c0615o.f2467d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                C2607d c2607d = (C2607d) this.f2412b;
                c2607d.getClass();
                c2607d.f9388O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2607d.invalidate(c2607d.f9398j);
                break;
        }
    }
}
