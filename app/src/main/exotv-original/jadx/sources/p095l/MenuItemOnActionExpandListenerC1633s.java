package p095l;

import android.view.MenuItem;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.s */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC1633s implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    public final MenuItem.OnActionExpandListener f6262a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC1635u f6263b;

    public MenuItemOnActionExpandListenerC1633s(MenuItemC1635u menuItemC1635u, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6263b = menuItemC1635u;
        this.f6262a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f6262a.onMenuItemActionCollapse(this.f6263b.m95h(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f6262a.onMenuItemActionExpand(this.f6263b.m95h(menuItem));
    }
}
