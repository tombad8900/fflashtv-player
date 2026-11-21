package p002a1;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;
import p017b6.C0620t;
import p059g5.AccessibilityManagerTouchExplorationStateChangeListenerC1049a;
import p095l.ViewOnKeyListenerC1618e0;
import p095l.ViewOnKeyListenerC1621g;
import p105m0.AbstractC1798c0;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.t0 */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0047t0 implements View.OnAttachStateChangeListener {

    /* renamed from: j */
    public final /* synthetic */ int f201j;

    /* renamed from: k */
    public final /* synthetic */ Object f202k;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0047t0(int i, Object obj) {
        this.f201j = i;
        this.f202k = obj;
    }

    /* renamed from: a */
    private final void m195a(View view) {
    }

    /* renamed from: b */
    private final void m196b(View view) {
    }

    /* renamed from: c */
    private final void m197c(View view) {
    }

    /* renamed from: d */
    private final void m198d(View view) {
    }

    /* renamed from: e */
    private final void m199e(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f201j;
        Object obj = this.f202k;
        switch (i) {
            case 0:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                AbstractC1798c0.m3516c(view2);
                break;
            case 1:
                C0620t c0620t = (C0620t) obj;
                AccessibilityManager accessibilityManager = c0620t.f2444C;
                if (c0620t.f2445D != null && accessibilityManager != null && c0620t.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(c0620t.f2445D);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f201j) {
            case 0:
                break;
            case 1:
                C0620t c0620t = (C0620t) this.f202k;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = c0620t.f2445D;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = c0620t.f2444C) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 2:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f202k;
                AccessibilityManagerTouchExplorationStateChangeListenerC1049a accessibilityManagerTouchExplorationStateChangeListenerC1049a = hideBottomViewOnScrollBehavior.f3064h;
                if (accessibilityManagerTouchExplorationStateChangeListenerC1049a != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.f3063g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC1049a);
                    hideBottomViewOnScrollBehavior.f3064h = null;
                    break;
                }
                break;
            case 3:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f202k;
                AccessibilityManagerTouchExplorationStateChangeListenerC1049a accessibilityManagerTouchExplorationStateChangeListenerC1049a2 = hideViewOnScrollBehavior.f3072c;
                if (accessibilityManagerTouchExplorationStateChangeListenerC1049a2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f3071b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC1049a2);
                    hideViewOnScrollBehavior.f3072c = null;
                    break;
                }
                break;
            case 4:
                ViewOnKeyListenerC1621g viewOnKeyListenerC1621g = (ViewOnKeyListenerC1621g) this.f202k;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1621g.f6168H;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1621g.f6168H = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1621g.f6168H.removeGlobalOnLayoutListener(viewOnKeyListenerC1621g.f6179s);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC1618e0 viewOnKeyListenerC1618e0 = (ViewOnKeyListenerC1618e0) this.f202k;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1618e0.f6154y;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1618e0.f6154y = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1618e0.f6154y.removeGlobalOnLayoutListener(viewOnKeyListenerC1618e0.f6148s);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
