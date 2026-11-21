package p055g0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p095l.ActionProviderVisibilityListenerC1631q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g0.a */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC1027a extends MenuItem {
    /* renamed from: a */
    ActionProviderVisibilityListenerC1631q mo2223a();

    /* renamed from: b */
    InterfaceMenuItemC1027a mo2224b(ActionProviderVisibilityListenerC1631q actionProviderVisibilityListenerC1631q);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c8, int i);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1027a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c8, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c8, char c9, int i, int i4);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1027a setTooltipText(CharSequence charSequence);
}
