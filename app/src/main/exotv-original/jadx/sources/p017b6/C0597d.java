package p017b6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.d */
/* loaded from: classes.dex */
public final class C0597d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f2388a;

    /* renamed from: b */
    public final /* synthetic */ C0599e f2389b;

    public /* synthetic */ C0597d(C0599e c0599e, int i) {
        this.f2388a = i;
        this.f2389b = c0599e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2388a) {
            case 1:
                this.f2389b.f2465b.m1381i(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2388a) {
            case 0:
                this.f2389b.f2465b.m1381i(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
