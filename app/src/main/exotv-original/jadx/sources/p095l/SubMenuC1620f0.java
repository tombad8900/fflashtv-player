package p095l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.f0 */
/* loaded from: classes.dex */
public final class SubMenuC1620f0 extends MenuC1627m implements SubMenu {

    /* renamed from: I */
    public final MenuC1627m f6159I;

    /* renamed from: J */
    public final C1630p f6160J;

    public SubMenuC1620f0(Context context, MenuC1627m menuC1627m, C1630p c1630p) {
        super(context);
        this.f6159I = menuC1627m;
        this.f6160J = c1630p;
    }

    @Override // p095l.MenuC1627m
    /* renamed from: d */
    public final boolean mo3290d(C1630p c1630p) {
        return this.f6159I.mo3290d(c1630p);
    }

    @Override // p095l.MenuC1627m
    /* renamed from: e */
    public final boolean mo3291e(MenuC1627m menuC1627m, MenuItem menuItem) {
        return super.mo3291e(menuC1627m, menuItem) || this.f6159I.mo3291e(menuC1627m, menuItem);
    }

    @Override // p095l.MenuC1627m
    /* renamed from: f */
    public final boolean mo3292f(C1630p c1630p) {
        return this.f6159I.mo3292f(c1630p);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f6160J;
    }

    @Override // p095l.MenuC1627m
    /* renamed from: j */
    public final String mo3293j() {
        C1630p c1630p = this.f6160J;
        int i = c1630p != null ? c1630p.f6242j : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC0008a1.m12h(i, "android:menu:actionviewstates:");
    }

    @Override // p095l.MenuC1627m
    /* renamed from: k */
    public final MenuC1627m mo3294k() {
        return this.f6159I.mo3294k();
    }

    @Override // p095l.MenuC1627m
    /* renamed from: m */
    public final boolean mo3295m() {
        return this.f6159I.mo3295m();
    }

    @Override // p095l.MenuC1627m
    /* renamed from: n */
    public final boolean mo3296n() {
        return this.f6159I.mo3296n();
    }

    @Override // p095l.MenuC1627m
    /* renamed from: o */
    public final boolean mo3297o() {
        return this.f6159I.mo3297o();
    }

    @Override // p095l.MenuC1627m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z7) {
        this.f6159I.setGroupDividerEnabled(z7);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m3318u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m3318u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m3318u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f6160J.setIcon(drawable);
        return this;
    }

    @Override // p095l.MenuC1627m, android.view.Menu
    public final void setQwertyMode(boolean z7) {
        this.f6159I.setQwertyMode(z7);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m3318u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m3318u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f6160J.setIcon(i);
        return this;
    }
}
