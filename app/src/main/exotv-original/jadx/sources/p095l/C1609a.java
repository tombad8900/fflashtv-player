package p095l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p055g0.InterfaceMenuItemC1027a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.a */
/* loaded from: classes.dex */
public final class C1609a implements InterfaceMenuItemC1027a {

    /* renamed from: j */
    public CharSequence f6110j;

    /* renamed from: k */
    public CharSequence f6111k;

    /* renamed from: l */
    public Intent f6112l;

    /* renamed from: m */
    public char f6113m;

    /* renamed from: n */
    public int f6114n;

    /* renamed from: o */
    public char f6115o;

    /* renamed from: p */
    public int f6116p;

    /* renamed from: q */
    public Drawable f6117q;

    /* renamed from: r */
    public Context f6118r;

    /* renamed from: s */
    public CharSequence f6119s;

    /* renamed from: t */
    public CharSequence f6120t;

    /* renamed from: u */
    public ColorStateList f6121u;

    /* renamed from: v */
    public PorterDuff.Mode f6122v;

    /* renamed from: w */
    public boolean f6123w;

    /* renamed from: x */
    public boolean f6124x;

    /* renamed from: y */
    public int f6125y;

    @Override // p055g0.InterfaceMenuItemC1027a
    /* renamed from: a */
    public final ActionProviderVisibilityListenerC1631q mo2223a() {
        return null;
    }

    @Override // p055g0.InterfaceMenuItemC1027a
    /* renamed from: b */
    public final InterfaceMenuItemC1027a mo2224b(ActionProviderVisibilityListenerC1631q actionProviderVisibilityListenerC1631q) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void m3270c() {
        Drawable drawable = this.f6117q;
        if (drawable != null) {
            if (this.f6123w || this.f6124x) {
                this.f6117q = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f6117q = drawableMutate;
                if (this.f6123w) {
                    drawableMutate.setTintList(this.f6121u);
                }
                if (this.f6124x) {
                    this.f6117q.setTintMode(this.f6122v);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6116p;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6115o;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f6119s;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f6117q;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f6121u;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6122v;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6112l;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6114n;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6113m;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f6110j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6111k;
        return charSequence != null ? charSequence : this.f6110j;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6120t;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f6125y & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f6125y & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f6125y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f6125y & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8) {
        this.f6115o = Character.toLowerCase(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z7) {
        this.f6125y = (z7 ? 1 : 0) | (this.f6125y & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z7) {
        this.f6125y = (z7 ? 2 : 0) | (this.f6125y & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f6119s = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z7) {
        this.f6125y = (z7 ? 16 : 0) | (this.f6125y & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6117q = drawable;
        m3270c();
        return this;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6121u = colorStateList;
        this.f6123w = true;
        m3270c();
        return this;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6122v = mode;
        this.f6124x = true;
        m3270c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6112l = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8) {
        this.f6113m = c8;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c9) {
        this.f6113m = c8;
        this.f6115o = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6110j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6111k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f6120t = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z7) {
        this.f6125y = (this.f6125y & 8) | (z7 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8, int i) {
        this.f6115o = Character.toLowerCase(c8);
        this.f6116p = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final InterfaceMenuItemC1027a setContentDescription(CharSequence charSequence) {
        this.f6119s = charSequence;
        return this;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8, int i) {
        this.f6113m = c8;
        this.f6114n = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f6110j = this.f6118r.getResources().getString(i);
        return this;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final InterfaceMenuItemC1027a setTooltipText(CharSequence charSequence) {
        this.f6120t = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f6117q = this.f6118r.getDrawable(i);
        m3270c();
        return this;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c9, int i, int i4) {
        this.f6113m = c8;
        this.f6114n = KeyEvent.normalizeMetaState(i);
        this.f6115o = Character.toLowerCase(c9);
        this.f6116p = KeyEvent.normalizeMetaState(i4);
        return this;
    }
}
