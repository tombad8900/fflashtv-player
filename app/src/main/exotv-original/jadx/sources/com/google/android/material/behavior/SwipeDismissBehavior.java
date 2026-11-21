package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import p002a1.C0036o;
import p059g5.C1051c;
import p105m0.AbstractC1828m0;
import p114n0.C1951c;
import p166t0.C2392f;
import p213z.AbstractC2863a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC2863a {

    /* renamed from: a */
    public C2392f f3083a;

    /* renamed from: b */
    public boolean f3084b;

    /* renamed from: c */
    public boolean f3085c;

    /* renamed from: d */
    public int f3086d = 2;

    /* renamed from: e */
    public float f3087e = 0.0f;

    /* renamed from: f */
    public float f3088f = 0.5f;

    /* renamed from: g */
    public final C1051c f3089g = new C1051c(this);

    @Override // p213z.AbstractC2863a
    /* renamed from: f */
    public boolean mo1754f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM512o = this.f3084b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM512o = coordinatorLayout.m512o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3084b = zM512o;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3084b = false;
        }
        if (zM512o) {
            if (this.f3083a == null) {
                this.f3083a = new C2392f(coordinatorLayout.getContext(), coordinatorLayout, this.f3089g);
            }
            if (!this.f3085c && this.f3083a.m4237o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: g */
    public final boolean mo1755g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC1828m0.m3605j(view, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            AbstractC1828m0.m3603h(view, 0);
            if (mo1775r(view)) {
                AbstractC1828m0.m3606k(view, C1951c.f7250i, new C0036o(22, this));
            }
        }
        return false;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: q */
    public final boolean mo1763q(View view, MotionEvent motionEvent) {
        if (this.f3083a == null) {
            return false;
        }
        if (this.f3085c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f3083a.m4231i(motionEvent);
        return true;
    }

    /* renamed from: r */
    public boolean mo1775r(View view) {
        return true;
    }
}
