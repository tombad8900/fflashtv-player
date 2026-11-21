package p032d3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.exotv.net.R;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.g */
/* loaded from: classes.dex */
public final class C0821g extends AnimatorListenerAdapter implements InterfaceC0827l {

    /* renamed from: a */
    public final View f3657a;

    /* renamed from: b */
    public boolean f3658b = false;

    public C0821g(View view) {
        this.f3657a = view;
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: a */
    public final void mo1971a() {
        View view = this.f3657a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC0839x.f3720a.mo1578G(view) : 0.0f));
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: b */
    public final void mo1972b(AbstractC0829n abstractC0829n) {
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: c */
    public final void mo1975c(AbstractC0829n abstractC0829n) {
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: d */
    public final void mo1973d(AbstractC0829n abstractC0829n) {
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: e */
    public final void mo1981e(AbstractC0829n abstractC0829n) {
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: f */
    public final void mo1974f() {
        this.f3657a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC0839x.f3720a.mo1598l0(this.f3657a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f3657a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f3658b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z7) {
        boolean z8 = this.f3658b;
        View view = this.f3657a;
        if (z8) {
            view.setLayerType(0, null);
        }
        if (z7) {
            return;
        }
        C0814c0 c0814c0 = AbstractC0839x.f3720a;
        c0814c0.mo1598l0(view, 1.0f);
        c0814c0.getClass();
    }
}
