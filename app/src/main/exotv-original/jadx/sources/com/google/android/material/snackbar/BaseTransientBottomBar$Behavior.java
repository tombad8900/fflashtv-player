package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p002a1.C0036o;
import p007a6.AbstractC0110b;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h */
    public final C2819f f3399h;

    public BaseTransientBottomBar$Behavior() {
        C2819f c2819f = new C2819f(5);
        this.f3087e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f3088f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f3086d = 0;
        this.f3399h = c2819f;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p213z.AbstractC2863a
    /* renamed from: f */
    public final boolean mo1754f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f3399h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0036o.f141l == null) {
                    C0036o.f141l = new C0036o(5);
                }
                synchronized (C0036o.f141l.f143k) {
                }
            }
        } else if (coordinatorLayout.m512o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0036o.f141l == null) {
                C0036o.f141l = new C0036o(5);
            }
            synchronized (C0036o.f141l.f143k) {
            }
        }
        return super.mo1754f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: r */
    public final boolean mo1775r(View view) {
        this.f3399h.getClass();
        return view instanceof AbstractC0110b;
    }
}
