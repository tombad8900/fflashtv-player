package p032d3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import p105m0.C1796b1;
import p105m0.C1858w0;
import p105m0.InterfaceC1846s0;
import p130p.C2186e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.j */
/* loaded from: classes.dex */
public final class C0825j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f3667a;

    /* renamed from: b */
    public final /* synthetic */ Object f3668b;

    /* renamed from: c */
    public final /* synthetic */ Object f3669c;

    public /* synthetic */ C0825j(Object obj, int i, Object obj2) {
        this.f3667a = i;
        this.f3669c = obj;
        this.f3668b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3667a) {
            case 3:
                ((InterfaceC1846s0) this.f3668b).mo1588a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3667a) {
            case 0:
                ((C2186e) this.f3668b).remove(animator);
                ((AbstractC0829n) this.f3669c).f3703w.remove(animator);
                break;
            case 1:
                View view = (View) this.f3668b;
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f3669c;
                hideBottomViewOnScrollBehavior.f3067k = null;
                if (hideBottomViewOnScrollBehavior.f3066j == 1 && view.getVisibility() == 0) {
                    view.setVisibility(4);
                    break;
                }
                break;
            case 2:
                View view2 = (View) this.f3668b;
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f3669c;
                hideViewOnScrollBehavior.f3080k = null;
                if (hideViewOnScrollBehavior.f3079j == 1 && view2.getVisibility() == 0) {
                    view2.setVisibility(4);
                    break;
                }
                break;
            case 3:
                ((InterfaceC1846s0) this.f3668b).mo2256c();
                break;
            default:
                C1796b1 c1796b1 = (C1796b1) this.f3668b;
                c1796b1.f6856a.mo3500e(1.0f);
                C1858w0.m3644f((View) this.f3669c, c1796b1);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3667a) {
            case 0:
                ((AbstractC0829n) this.f3669c).f3703w.add(animator);
                break;
            case 3:
                ((InterfaceC1846s0) this.f3668b).mo1589b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ C0825j(Object obj, View view, int i) {
        this.f3667a = i;
        this.f3668b = obj;
        this.f3669c = view;
    }
}
