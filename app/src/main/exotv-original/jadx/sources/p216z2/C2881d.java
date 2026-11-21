package p216z2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.d */
/* loaded from: classes.dex */
public final class C2881d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AbstractC2920v0 f10632a;

    /* renamed from: b */
    public final /* synthetic */ int f10633b;

    /* renamed from: c */
    public final /* synthetic */ View f10634c;

    /* renamed from: d */
    public final /* synthetic */ int f10635d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f10636e;

    /* renamed from: f */
    public final /* synthetic */ C2891h f10637f;

    public C2881d(C2891h c2891h, AbstractC2920v0 abstractC2920v0, int i, View view, int i4, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10637f = c2891h;
        this.f10632a = abstractC2920v0;
        this.f10633b = i;
        this.f10634c = view;
        this.f10635d = i4;
        this.f10636e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f10633b;
        View view = this.f10634c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f10635d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f10636e.setListener(null);
        C2891h c2891h = this.f10637f;
        AbstractC2920v0 abstractC2920v0 = this.f10632a;
        c2891h.m4973c(abstractC2920v0);
        c2891h.f10703p.remove(abstractC2920v0);
        c2891h.m5016i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10637f.getClass();
    }
}
