package p216z2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.e */
/* loaded from: classes.dex */
public final class C2884e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f10650a;

    /* renamed from: b */
    public final /* synthetic */ C2887f f10651b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f10652c;

    /* renamed from: d */
    public final /* synthetic */ View f10653d;

    /* renamed from: e */
    public final /* synthetic */ C2891h f10654e;

    public /* synthetic */ C2884e(C2891h c2891h, C2887f c2887f, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f10650a = i;
        this.f10654e = c2891h;
        this.f10651b = c2887f;
        this.f10652c = viewPropertyAnimator;
        this.f10653d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10650a) {
            case 0:
                this.f10652c.setListener(null);
                View view = this.f10653d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C2887f c2887f = this.f10651b;
                AbstractC2920v0 abstractC2920v0 = c2887f.f10663a;
                C2891h c2891h = this.f10654e;
                c2891h.m4973c(abstractC2920v0);
                c2891h.f10705r.remove(c2887f.f10663a);
                c2891h.m5016i();
                break;
            default:
                this.f10652c.setListener(null);
                View view2 = this.f10653d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C2887f c2887f2 = this.f10651b;
                AbstractC2920v0 abstractC2920v02 = c2887f2.f10664b;
                C2891h c2891h2 = this.f10654e;
                c2891h2.m4973c(abstractC2920v02);
                c2891h2.f10705r.remove(c2887f2.f10664b);
                c2891h2.m5016i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f10650a) {
            case 0:
                AbstractC2920v0 abstractC2920v0 = this.f10651b.f10663a;
                this.f10654e.getClass();
                break;
            default:
                AbstractC2920v0 abstractC2920v02 = this.f10651b.f10664b;
                this.f10654e.getClass();
                break;
        }
    }
}
