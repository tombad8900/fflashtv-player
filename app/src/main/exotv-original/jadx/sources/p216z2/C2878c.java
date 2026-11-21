package p216z2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.c */
/* loaded from: classes.dex */
public final class C2878c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f10623a = 1;

    /* renamed from: b */
    public final /* synthetic */ AbstractC2920v0 f10624b;

    /* renamed from: c */
    public final /* synthetic */ View f10625c;

    /* renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f10626d;

    /* renamed from: e */
    public final /* synthetic */ C2891h f10627e;

    public C2878c(C2891h c2891h, AbstractC2920v0 abstractC2920v0, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f10627e = c2891h;
        this.f10624b = abstractC2920v0;
        this.f10626d = viewPropertyAnimator;
        this.f10625c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f10623a) {
            case 1:
                this.f10625c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10623a) {
            case 0:
                this.f10626d.setListener(null);
                this.f10625c.setAlpha(1.0f);
                C2891h c2891h = this.f10627e;
                AbstractC2920v0 abstractC2920v0 = this.f10624b;
                c2891h.m4973c(abstractC2920v0);
                c2891h.f10704q.remove(abstractC2920v0);
                c2891h.m5016i();
                break;
            default:
                this.f10626d.setListener(null);
                C2891h c2891h2 = this.f10627e;
                AbstractC2920v0 abstractC2920v02 = this.f10624b;
                c2891h2.m4973c(abstractC2920v02);
                c2891h2.f10702o.remove(abstractC2920v02);
                c2891h2.m5016i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f10623a) {
            case 0:
                this.f10627e.getClass();
                break;
            default:
                this.f10627e.getClass();
                break;
        }
    }

    public C2878c(C2891h c2891h, AbstractC2920v0 abstractC2920v0, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10627e = c2891h;
        this.f10624b = abstractC2920v0;
        this.f10625c = view;
        this.f10626d = viewPropertyAnimator;
    }
}
