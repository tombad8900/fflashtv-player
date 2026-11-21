package p216z2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.i */
/* loaded from: classes.dex */
public final class C2893i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f10706a = false;

    /* renamed from: b */
    public final /* synthetic */ C2895j f10707b;

    public C2893i(C2895j c2895j) {
        this.f10707b = c2895j;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f10706a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f10706a) {
            this.f10706a = false;
            return;
        }
        C2895j c2895j = this.f10707b;
        if (((Float) c2895j.f10737z.getAnimatedValue()).floatValue() == 0.0f) {
            c2895j.f10710A = 0;
            c2895j.m5023g(0);
        } else {
            c2895j.f10710A = 2;
            c2895j.f10730s.invalidate();
        }
    }
}
