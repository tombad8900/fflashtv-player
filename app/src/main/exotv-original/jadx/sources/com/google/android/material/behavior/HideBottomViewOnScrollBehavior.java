package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.exotv.net.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p002a1.ViewOnAttachStateChangeListenerC0047t0;
import p032d3.C0825j;
import p042e5.AbstractC0910a;
import p059g5.AccessibilityManagerTouchExplorationStateChangeListenerC1049a;
import p171t5.AbstractC2436a;
import p213z.AbstractC2863a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC2863a {

    /* renamed from: b */
    public int f3058b;

    /* renamed from: c */
    public int f3059c;

    /* renamed from: d */
    public TimeInterpolator f3060d;

    /* renamed from: e */
    public TimeInterpolator f3061e;

    /* renamed from: g */
    public AccessibilityManager f3063g;

    /* renamed from: h */
    public AccessibilityManagerTouchExplorationStateChangeListenerC1049a f3064h;

    /* renamed from: k */
    public ViewPropertyAnimator f3067k;

    /* renamed from: a */
    public final LinkedHashSet f3057a = new LinkedHashSet();

    /* renamed from: f */
    public int f3062f = 0;

    /* renamed from: i */
    public final boolean f3065i = true;

    /* renamed from: j */
    public int f3066j = 2;

    /* renamed from: l */
    public int f3068l = 0;

    /* renamed from: m */
    public int f3069m = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: g */
    public boolean mo1755g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f3062f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f3058b = AbstractC2436a.m4342q(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f3059c = AbstractC2436a.m4342q(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f3060d = AbstractC2436a.m4343r(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0910a.f3959d);
        this.f3061e = AbstractC2436a.m4343r(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0910a.f3958c);
        if (this.f3063g == null) {
            this.f3063g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f3063g;
        if (accessibilityManager == null || this.f3064h != null) {
            return false;
        }
        AccessibilityManagerTouchExplorationStateChangeListenerC1049a accessibilityManagerTouchExplorationStateChangeListenerC1049a = new AccessibilityManagerTouchExplorationStateChangeListenerC1049a(this, view, 0);
        this.f3064h = accessibilityManagerTouchExplorationStateChangeListenerC1049a;
        accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC1049a);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0047t0(2, this));
        return false;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: k */
    public final void mo1758k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i8, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                m1770r(view);
            }
        } else {
            if (this.f3066j == 1) {
                return;
            }
            if (this.f3065i && (accessibilityManager = this.f3063g) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f3067k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            m1771s(view, 1);
            this.f3067k = view.animate().translationY(this.f3062f).setInterpolator(this.f3061e).setDuration(this.f3059c).setListener(new C0825j(this, 1, view));
        }
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: o */
    public boolean mo1761o(View view, int i, int i4) {
        return i == 2;
    }

    /* renamed from: r */
    public final void m1770r(View view) {
        if (this.f3066j == 2) {
            return;
        }
        m1771s(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f3067k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f3067k = view.animate().translationY(0).setInterpolator(this.f3060d).setDuration(this.f3058b).setListener(new C0825j(this, 1, view));
    }

    /* renamed from: s */
    public final void m1771s(View view, int i) {
        this.f3066j = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f3068l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f3069m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f3068l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f3069m);
            }
        }
        Iterator it = this.f3057a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
