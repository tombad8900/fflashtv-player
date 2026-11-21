package p095l;

import android.view.ActionProvider;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.q */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC1631q implements ActionProvider.VisibilityListener {

    /* renamed from: a */
    public C1629o f6259a;

    /* renamed from: b */
    public final ActionProvider f6260b;

    public ActionProviderVisibilityListenerC1631q(MenuItemC1635u menuItemC1635u, ActionProvider actionProvider) {
        this.f6260b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z7) {
        C1629o c1629o = this.f6259a;
        if (c1629o != null) {
            MenuC1627m menuC1627m = ((C1630p) c1629o.f6229j).f6255w;
            menuC1627m.f6216q = true;
            menuC1627m.m3313p(true);
        }
    }
}
