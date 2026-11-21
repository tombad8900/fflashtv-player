package p059g5;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import p213z.AbstractC2863a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g5.a */
/* loaded from: classes.dex */
public final /* synthetic */ class AccessibilityManagerTouchExplorationStateChangeListenerC1049a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f4462a;

    /* renamed from: b */
    public final /* synthetic */ View f4463b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC2863a f4464c;

    public /* synthetic */ AccessibilityManagerTouchExplorationStateChangeListenerC1049a(AbstractC2863a abstractC2863a, View view, int i) {
        this.f4462a = i;
        this.f4464c = abstractC2863a;
        this.f4463b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z7) {
        switch (this.f4462a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f4464c;
                if (z7 && hideBottomViewOnScrollBehavior.f3066j == 1) {
                    hideBottomViewOnScrollBehavior.m1770r(this.f4463b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f4464c;
                if (z7 && hideViewOnScrollBehavior.f3079j == 1) {
                    hideViewOnScrollBehavior.m1773s(this.f4463b);
                    break;
                }
                break;
        }
    }
}
