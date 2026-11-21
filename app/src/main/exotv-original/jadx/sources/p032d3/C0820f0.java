package p032d3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.exotv.net.R;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.f0 */
/* loaded from: classes.dex */
public final class C0820f0 extends AnimatorListenerAdapter implements InterfaceC0827l {

    /* renamed from: a */
    public final ViewGroup f3652a;

    /* renamed from: b */
    public final View f3653b;

    /* renamed from: c */
    public final View f3654c;

    /* renamed from: d */
    public boolean f3655d = true;

    /* renamed from: e */
    public final /* synthetic */ C0823h f3656e;

    public C0820f0(C0823h c0823h, ViewGroup viewGroup, View view, View view2) {
        this.f3656e = c0823h;
        this.f3652a = viewGroup;
        this.f3653b = view;
        this.f3654c = view2;
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: a */
    public final void mo1971a() {
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: b */
    public final void mo1972b(AbstractC0829n abstractC0829n) {
        if (this.f3655d) {
            m1980g();
        }
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: c */
    public final void mo1975c(AbstractC0829n abstractC0829n) {
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: d */
    public final void mo1973d(AbstractC0829n abstractC0829n) {
        abstractC0829n.mo1962w(this);
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: f */
    public final void mo1974f() {
    }

    /* renamed from: g */
    public final void m1980g() {
        this.f3654c.setTag(R.id.save_overlay_view, null);
        this.f3652a.getOverlay().remove(this.f3653b);
        this.f3655d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m1980g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f3652a.getOverlay().remove(this.f3653b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f3653b;
        if (view.getParent() == null) {
            this.f3652a.getOverlay().add(view);
        } else {
            this.f3656e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z7) {
        if (z7) {
            View view = this.f3654c;
            View view2 = this.f3653b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f3652a.getOverlay().add(view2);
            this.f3655d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z7) {
        if (z7) {
            return;
        }
        m1980g();
    }
}
