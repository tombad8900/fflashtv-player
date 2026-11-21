package p193w2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.r */
/* loaded from: classes.dex */
public final class C2630r extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f9563a;

    /* renamed from: b */
    public final /* synthetic */ C2632t f9564b;

    public /* synthetic */ C2630r(C2632t c2632t, int i) {
        this.f9563a = i;
        this.f9564b = c2632t;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f9563a) {
            case 0:
                C2632t c2632t = this.f9564b;
                View view = c2632t.f9572b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = c2632t.f9573c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = c2632t.f9575e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                this.f9564b.m4730i(0);
                break;
            case 3:
                this.f9564b.m4730i(0);
                break;
            case 4:
                ViewGroup viewGroup3 = this.f9564b.f9576f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    break;
                }
                break;
            case 5:
                ViewGroup viewGroup4 = this.f9564b.f9578h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f9563a;
        C2632t c2632t = this.f9564b;
        switch (i) {
            case 0:
                View view = c2632t.f9580j;
                if ((view instanceof C2607d) && !c2632t.f9568A) {
                    C2607d c2607d = (C2607d) view;
                    ValueAnimator valueAnimator = c2607d.f9387N;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(c2607d.f9388O, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = c2632t.f9572b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = c2632t.f9573c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = c2632t.f9575e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(c2632t.f9568A ? 0 : 4);
                }
                View view3 = c2632t.f9580j;
                if ((view3 instanceof C2607d) && !c2632t.f9568A) {
                    C2607d c2607d2 = (C2607d) view3;
                    ValueAnimator valueAnimator2 = c2607d2.f9387N;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    c2607d2.f9389P = false;
                    valueAnimator2.setFloatValues(c2607d2.f9388O, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                c2632t.m4730i(4);
                break;
            case 3:
                c2632t.m4730i(4);
                break;
            case 4:
                ViewGroup viewGroup3 = c2632t.f9578h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    c2632t.f9578h.setTranslationX(r9.getWidth());
                    ViewGroup viewGroup4 = c2632t.f9578h;
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    break;
                }
                break;
            default:
                ViewGroup viewGroup5 = c2632t.f9576f;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
