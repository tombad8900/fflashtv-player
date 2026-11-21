package p002a1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.g */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0020g implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C0059z0 f73a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f74b;

    /* renamed from: c */
    public final /* synthetic */ View f75c;

    /* renamed from: d */
    public final /* synthetic */ C0024i f76d;

    public AnimationAnimationListenerC0020g(C0024i c0024i, C0059z0 c0059z0, View view, ViewGroup viewGroup) {
        this.f73a = c0059z0;
        this.f74b = viewGroup;
        this.f75c = view;
        this.f76d = c0024i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f74b.post(new RunnableC0018f(0, this));
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f73a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f73a + " has reached onAnimationStart.");
        }
    }
}
