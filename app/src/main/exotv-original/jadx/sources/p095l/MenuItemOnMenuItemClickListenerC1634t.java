package p095l;

import android.view.MenuItem;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.t */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1634t implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final MenuItem.OnMenuItemClickListener f6264a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC1635u f6265b;

    public MenuItemOnMenuItemClickListenerC1634t(MenuItemC1635u menuItemC1635u, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6265b = menuItemC1635u;
        this.f6264a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f6264a.onMenuItemClick(this.f6265b.m95h(menuItem));
    }
}
