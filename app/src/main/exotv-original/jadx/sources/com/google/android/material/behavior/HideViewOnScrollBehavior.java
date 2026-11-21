package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p002a1.AbstractC0008a1;
import p002a1.ViewOnAttachStateChangeListenerC0047t0;
import p032d3.C0825j;
import p042e5.AbstractC0910a;
import p059g5.AccessibilityManagerTouchExplorationStateChangeListenerC1049a;
import p059g5.C1050b;
import p171t5.AbstractC2436a;
import p213z.AbstractC2863a;
import p213z.C2866d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends AbstractC2863a {

    /* renamed from: a */
    public AbstractC0715d f3070a;

    /* renamed from: b */
    public AccessibilityManager f3071b;

    /* renamed from: c */
    public AccessibilityManagerTouchExplorationStateChangeListenerC1049a f3072c;

    /* renamed from: e */
    public int f3074e;

    /* renamed from: f */
    public int f3075f;

    /* renamed from: g */
    public TimeInterpolator f3076g;

    /* renamed from: h */
    public TimeInterpolator f3077h;

    /* renamed from: k */
    public ViewPropertyAnimator f3080k;

    /* renamed from: d */
    public final LinkedHashSet f3073d = new LinkedHashSet();

    /* renamed from: i */
    public int f3078i = 0;

    /* renamed from: j */
    public int f3079j = 2;

    /* renamed from: l */
    public int f3081l = 0;

    /* renamed from: m */
    public int f3082m = 0;

    public HideViewOnScrollBehavior() {
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: g */
    public final boolean mo1755g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.f3071b == null) {
            this.f3071b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f3071b;
        if (accessibilityManager != null && this.f3072c == null) {
            AccessibilityManagerTouchExplorationStateChangeListenerC1049a accessibilityManagerTouchExplorationStateChangeListenerC1049a = new AccessibilityManagerTouchExplorationStateChangeListenerC1049a(this, view, 1);
            this.f3072c = accessibilityManagerTouchExplorationStateChangeListenerC1049a;
            accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC1049a);
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0047t0(3, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i4 = ((C2866d) view.getLayoutParams()).f10574c;
        if (i4 == 80 || i4 == 81) {
            m1772r(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
            m1772r((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.f3078i = this.f3070a.mo1577F(view, marginLayoutParams);
        this.f3074e = AbstractC2436a.m4342q(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f3075f = AbstractC2436a.m4342q(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f3076g = AbstractC2436a.m4343r(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0910a.f3959d);
        this.f3077h = AbstractC2436a.m4343r(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0910a.f3958c);
        return false;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: k */
    public final void mo1758k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i8, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                m1773s(view);
                return;
            }
            return;
        }
        if (this.f3079j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f3071b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f3080k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            m1774t(view, 1);
            this.f3080k = this.f3070a.mo1581J(view, this.f3078i).setInterpolator(this.f3077h).setDuration(this.f3075f).setListener(new C0825j(this, 2, view));
        }
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: o */
    public final boolean mo1761o(View view, int i, int i4) {
        return i == 2;
    }

    /* renamed from: r */
    public final void m1772r(int i) {
        AbstractC0715d abstractC0715d = this.f3070a;
        if (abstractC0715d == null || abstractC0715d.mo1579H() != i) {
            if (i == 0) {
                this.f3070a = new C1050b(2);
            } else if (i == 1) {
                this.f3070a = new C1050b(0);
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(AbstractC0008a1.m14j("Invalid view edge position value: ", i, ". Must be 0, 1 or 2."));
                }
                this.f3070a = new C1050b(1);
            }
        }
    }

    /* renamed from: s */
    public final void m1773s(View view) {
        if (this.f3079j == 2) {
            return;
        }
        m1774t(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f3080k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f3070a.getClass();
        this.f3080k = this.f3070a.mo1581J(view, 0).setInterpolator(this.f3076g).setDuration(this.f3074e).setListener(new C0825j(this, 2, view));
    }

    /* renamed from: t */
    public final void m1774t(View view, int i) {
        this.f3079j = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f3081l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f3082m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f3081l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f3082m);
            }
        }
        Iterator it = this.f3073d.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
