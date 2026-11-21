package p002a1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.d */
/* loaded from: classes.dex */
public final class C0014d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f53a;

    /* renamed from: b */
    public final /* synthetic */ View f54b;

    /* renamed from: c */
    public final /* synthetic */ boolean f55c;

    /* renamed from: d */
    public final /* synthetic */ C0059z0 f56d;

    /* renamed from: e */
    public final /* synthetic */ C0024i f57e;

    public C0014d(ViewGroup viewGroup, View view, boolean z7, C0059z0 c0059z0, C0024i c0024i) {
        this.f53a = viewGroup;
        this.f54b = view;
        this.f55c = z7;
        this.f56d = c0059z0;
        this.f57e = c0024i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f53a;
        View view = this.f54b;
        viewGroup.endViewTransition(view);
        boolean z7 = this.f55c;
        C0059z0 c0059z0 = this.f56d;
        if (z7) {
            AbstractC0008a1.m5a(view, c0059z0.f282a);
        }
        this.f57e.m91d();
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Animator from operation " + c0059z0 + " has ended.");
        }
    }
}
