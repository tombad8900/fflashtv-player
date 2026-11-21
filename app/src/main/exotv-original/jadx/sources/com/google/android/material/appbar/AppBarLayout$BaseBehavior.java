package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p051f5.AbstractC0944a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC0944a {

    /* renamed from: b */
    public boolean f3045b;

    /* renamed from: d */
    public int f3047d;

    /* renamed from: f */
    public VelocityTracker f3049f;

    /* renamed from: c */
    public int f3046c = -1;

    /* renamed from: e */
    public int f3048e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    @Override // p213z.AbstractC2863a
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1754f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f3048e < 0) {
            this.f3048e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f3045b) {
            int i = this.f3046c;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y4 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y4 - this.f3047d) > this.f3048e) {
                    this.f3047d = y4;
                    return true;
                }
                if (motionEvent.getActionMasked() != 0) {
                }
            }
        } else {
            if (motionEvent.getActionMasked() != 0) {
                this.f3046c = -1;
                motionEvent.getX();
                motionEvent.getY();
                throw new ClassCastException();
            }
            VelocityTracker velocityTracker = this.f3049f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    @Override // p051f5.AbstractC0944a, p213z.AbstractC2863a
    /* renamed from: g */
    public final boolean mo1755g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: h */
    public final boolean mo1756h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i8) {
        throw new ClassCastException();
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: j */
    public final /* synthetic */ void mo1757j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i4, int[] iArr, int i8) {
        throw new ClassCastException();
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: k */
    public final void mo1758k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i8, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: m */
    public final void mo1759m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: n */
    public final Parcelable mo1760n(View view) {
        throw new ClassCastException();
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: o */
    public final boolean mo1761o(View view, int i, int i4) {
        throw new ClassCastException();
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: p */
    public final void mo1762p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[RETURN] */
    @Override // p213z.AbstractC2863a
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1763q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f3046c);
                if (iFindPointerIndex != -1) {
                    this.f3047d = (int) motionEvent.getY(iFindPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f3046c = motionEvent.getPointerId(i);
                    this.f3047d = (int) (motionEvent.getY(i) + 0.5f);
                }
            }
            velocityTracker = this.f3049f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return !this.f3045b;
        }
        VelocityTracker velocityTracker2 = this.f3049f;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f3049f.computeCurrentVelocity(1000);
            this.f3049f.getYVelocity(this.f3046c);
            view.getClass();
            throw new ClassCastException();
        }
        this.f3045b = false;
        this.f3046c = -1;
        VelocityTracker velocityTracker3 = this.f3049f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f3049f = null;
        }
        velocityTracker = this.f3049f;
        if (velocityTracker != null) {
        }
        if (!this.f3045b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
