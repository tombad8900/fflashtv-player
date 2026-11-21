package p105m0;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.p */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1836p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: j */
    public final View f6922j;

    /* renamed from: k */
    public ViewTreeObserver f6923k;

    /* renamed from: l */
    public final Runnable f6924l;

    public ViewTreeObserverOnPreDrawListenerC1836p(View view, Runnable runnable) {
        this.f6922j = view;
        this.f6923k = view.getViewTreeObserver();
        this.f6924l = runnable;
    }

    /* renamed from: a */
    public static void m3612a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC1836p viewTreeObserverOnPreDrawListenerC1836p = new ViewTreeObserverOnPreDrawListenerC1836p(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1836p);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1836p);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f6923k.isAlive();
        View view = this.f6922j;
        if (zIsAlive) {
            this.f6923k.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f6924l.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6923k = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f6923k.isAlive();
        View view2 = this.f6922j;
        if (zIsAlive) {
            this.f6923k.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
