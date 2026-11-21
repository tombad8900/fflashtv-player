package p002a1;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p105m0.ViewTreeObserverOnPreDrawListenerC1836p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.a0 */
/* loaded from: classes.dex */
public final class RunnableC0007a0 extends AnimationSet implements Runnable {

    /* renamed from: j */
    public final ViewGroup f29j;

    /* renamed from: k */
    public final View f30k;

    /* renamed from: l */
    public boolean f31l;

    /* renamed from: m */
    public boolean f32m;

    /* renamed from: n */
    public boolean f33n;

    public RunnableC0007a0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f33n = true;
        this.f29j = viewGroup;
        this.f30k = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f33n = true;
        if (this.f31l) {
            return !this.f32m;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f31l = true;
            ViewTreeObserverOnPreDrawListenerC1836p.m3612a(this.f29j, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7 = this.f31l;
        ViewGroup viewGroup = this.f29j;
        if (z7 || !this.f33n) {
            viewGroup.endViewTransition(this.f30k);
            this.f32m = true;
        } else {
            this.f33n = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f8) {
        this.f33n = true;
        if (this.f31l) {
            return !this.f32m;
        }
        if (!super.getTransformation(j, transformation, f8)) {
            this.f31l = true;
            ViewTreeObserverOnPreDrawListenerC1836p.m3612a(this.f29j, this);
        }
        return true;
    }
}
