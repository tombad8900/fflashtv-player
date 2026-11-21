package p095l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import p055g0.InterfaceMenuItemC1027a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.p */
/* loaded from: classes.dex */
public final class C1630p implements InterfaceMenuItemC1027a {

    /* renamed from: A */
    public CharSequence f6230A;

    /* renamed from: H */
    public int f6237H;

    /* renamed from: I */
    public View f6238I;

    /* renamed from: J */
    public ActionProviderVisibilityListenerC1631q f6239J;

    /* renamed from: K */
    public MenuItem.OnActionExpandListener f6240K;

    /* renamed from: j */
    public final int f6242j;

    /* renamed from: k */
    public final int f6243k;

    /* renamed from: l */
    public final int f6244l;

    /* renamed from: m */
    public final int f6245m;

    /* renamed from: n */
    public CharSequence f6246n;

    /* renamed from: o */
    public CharSequence f6247o;

    /* renamed from: p */
    public Intent f6248p;

    /* renamed from: q */
    public char f6249q;

    /* renamed from: s */
    public char f6251s;

    /* renamed from: u */
    public Drawable f6253u;

    /* renamed from: w */
    public final MenuC1627m f6255w;

    /* renamed from: x */
    public SubMenuC1620f0 f6256x;

    /* renamed from: y */
    public MenuItem.OnMenuItemClickListener f6257y;

    /* renamed from: z */
    public CharSequence f6258z;

    /* renamed from: r */
    public int f6250r = DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;

    /* renamed from: t */
    public int f6252t = DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;

    /* renamed from: v */
    public int f6254v = 0;

    /* renamed from: B */
    public ColorStateList f6231B = null;

    /* renamed from: C */
    public PorterDuff.Mode f6232C = null;

    /* renamed from: D */
    public boolean f6233D = false;

    /* renamed from: E */
    public boolean f6234E = false;

    /* renamed from: F */
    public boolean f6235F = false;

    /* renamed from: G */
    public int f6236G = 16;

    /* renamed from: L */
    public boolean f6241L = false;

    public C1630p(MenuC1627m menuC1627m, int i, int i4, int i8, int i9, CharSequence charSequence, int i10) {
        this.f6255w = menuC1627m;
        this.f6242j = i4;
        this.f6243k = i;
        this.f6244l = i8;
        this.f6245m = i9;
        this.f6246n = charSequence;
        this.f6237H = i10;
    }

    /* renamed from: c */
    public static void m3333c(int i, int i4, String str, StringBuilder sb) {
        if ((i & i4) == i4) {
            sb.append(str);
        }
    }

    @Override // p055g0.InterfaceMenuItemC1027a
    /* renamed from: a */
    public final ActionProviderVisibilityListenerC1631q mo2223a() {
        return this.f6239J;
    }

    @Override // p055g0.InterfaceMenuItemC1027a
    /* renamed from: b */
    public final InterfaceMenuItemC1027a mo2224b(ActionProviderVisibilityListenerC1631q actionProviderVisibilityListenerC1631q) {
        this.f6238I = null;
        this.f6239J = actionProviderVisibilityListenerC1631q;
        this.f6255w.m3313p(true);
        ActionProviderVisibilityListenerC1631q actionProviderVisibilityListenerC1631q2 = this.f6239J;
        if (actionProviderVisibilityListenerC1631q2 != null) {
            actionProviderVisibilityListenerC1631q2.f6259a = new C1629o(this);
            actionProviderVisibilityListenerC1631q2.f6260b.setVisibilityListener(actionProviderVisibilityListenerC1631q2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f6237H & 8) == 0) {
            return false;
        }
        if (this.f6238I == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6240K;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f6255w.mo3290d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m3334d(Drawable drawable) {
        if (drawable != null && this.f6235F && (this.f6233D || this.f6234E)) {
            drawable = drawable.mutate();
            if (this.f6233D) {
                drawable.setTintList(this.f6231B);
            }
            if (this.f6234E) {
                drawable.setTintMode(this.f6232C);
            }
            this.f6235F = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public final boolean m3335e() {
        ActionProviderVisibilityListenerC1631q actionProviderVisibilityListenerC1631q;
        if ((this.f6237H & 8) != 0) {
            if (this.f6238I == null && (actionProviderVisibilityListenerC1631q = this.f6239J) != null) {
                this.f6238I = actionProviderVisibilityListenerC1631q.f6260b.onCreateActionView(this);
            }
            if (this.f6238I != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m3335e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f6240K;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f6255w.mo3292f(this);
        }
        return false;
    }

    /* renamed from: f */
    public final void m3336f(boolean z7) {
        if (z7) {
            this.f6236G |= 32;
        } else {
            this.f6236G &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f6238I;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC1631q actionProviderVisibilityListenerC1631q = this.f6239J;
        if (actionProviderVisibilityListenerC1631q == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC1631q.f6260b.onCreateActionView(this);
        this.f6238I = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f6252t;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f6251s;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f6258z;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f6243k;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f6253u;
        if (drawable != null) {
            return m3334d(drawable);
        }
        int i = this.f6254v;
        if (i == 0) {
            return null;
        }
        Drawable drawableM1542D = AbstractC0715d.m1542D(this.f6255w.f6209j, i);
        this.f6254v = 0;
        this.f6253u = drawableM1542D;
        return m3334d(drawableM1542D);
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f6231B;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6232C;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f6248p;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f6242j;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f6250r;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f6249q;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f6244l;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f6256x;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f6246n;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6247o;
        return charSequence != null ? charSequence : this.f6246n;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f6230A;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f6256x != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f6241L;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f6236G & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f6236G & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f6236G & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC1631q actionProviderVisibilityListenerC1631q = this.f6239J;
        return (actionProviderVisibilityListenerC1631q == null || !actionProviderVisibilityListenerC1631q.f6260b.overridesItemVisibility()) ? (this.f6236G & 8) == 0 : (this.f6236G & 8) == 0 && this.f6239J.f6260b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f6238I = view;
        this.f6239J = null;
        if (view != null && view.getId() == -1 && (i = this.f6242j) > 0) {
            view.setId(i);
        }
        MenuC1627m menuC1627m = this.f6255w;
        menuC1627m.f6219t = true;
        menuC1627m.m3313p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8) {
        if (this.f6251s == c8) {
            return this;
        }
        this.f6251s = Character.toLowerCase(c8);
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z7) {
        int i = this.f6236G;
        int i4 = (z7 ? 1 : 0) | (i & (-2));
        this.f6236G = i4;
        if (i != i4) {
            this.f6255w.m3313p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z7) {
        int i = this.f6236G;
        int i4 = i & 4;
        MenuC1627m menuC1627m = this.f6255w;
        if (i4 == 0) {
            int i8 = (i & (-3)) | (z7 ? 2 : 0);
            this.f6236G = i8;
            if (i != i8) {
                menuC1627m.m3313p(false);
            }
            return this;
        }
        ArrayList arrayList = menuC1627m.f6214o;
        int size = arrayList.size();
        menuC1627m.m3320w();
        for (int i9 = 0; i9 < size; i9++) {
            C1630p c1630p = (C1630p) arrayList.get(i9);
            if (c1630p.f6243k == this.f6243k && (c1630p.f6236G & 4) != 0 && c1630p.isCheckable()) {
                boolean z8 = c1630p == this;
                int i10 = c1630p.f6236G;
                int i11 = (z8 ? 2 : 0) | (i10 & (-3));
                c1630p.f6236G = i11;
                if (i10 != i11) {
                    c1630p.f6255w.m3313p(false);
                }
            }
        }
        menuC1627m.m3319v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z7) {
        if (z7) {
            this.f6236G |= 16;
        } else {
            this.f6236G &= -17;
        }
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f6254v = 0;
        this.f6253u = drawable;
        this.f6235F = true;
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6231B = colorStateList;
        this.f6233D = true;
        this.f6235F = true;
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6232C = mode;
        this.f6234E = true;
        this.f6235F = true;
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f6248p = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8) {
        if (this.f6249q == c8) {
            return this;
        }
        this.f6249q = c8;
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6240K = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6257y = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c9) {
        this.f6249q = c8;
        this.f6251s = Character.toLowerCase(c9);
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i4 = i & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f6237H = i;
        MenuC1627m menuC1627m = this.f6255w;
        menuC1627m.f6219t = true;
        menuC1627m.m3313p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6246n = charSequence;
        this.f6255w.m3313p(false);
        SubMenuC1620f0 subMenuC1620f0 = this.f6256x;
        if (subMenuC1620f0 != null) {
            subMenuC1620f0.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6247o = charSequence;
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z7) {
        int i = this.f6236G;
        int i4 = (z7 ? 0 : 8) | (i & (-9));
        this.f6236G = i4;
        if (i != i4) {
            MenuC1627m menuC1627m = this.f6255w;
            menuC1627m.f6216q = true;
            menuC1627m.m3313p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f6246n;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final InterfaceMenuItemC1027a setContentDescription(CharSequence charSequence) {
        this.f6258z = charSequence;
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final InterfaceMenuItemC1027a setTooltipText(CharSequence charSequence) {
        this.f6230A = charSequence;
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c8, int i) {
        if (this.f6251s == c8 && this.f6252t == i) {
            return this;
        }
        this.f6251s = Character.toLowerCase(c8);
        this.f6252t = KeyEvent.normalizeMetaState(i);
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c8, int i) {
        if (this.f6249q == c8 && this.f6250r == i) {
            return this;
        }
        this.f6249q = c8;
        this.f6250r = KeyEvent.normalizeMetaState(i);
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // p055g0.InterfaceMenuItemC1027a, android.view.MenuItem
    public final MenuItem setShortcut(char c8, char c9, int i, int i4) {
        this.f6249q = c8;
        this.f6250r = KeyEvent.normalizeMetaState(i);
        this.f6251s = Character.toLowerCase(c9);
        this.f6252t = KeyEvent.normalizeMetaState(i4);
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f6253u = null;
        this.f6254v = i;
        this.f6235F = true;
        this.f6255w.m3313p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f6255w.f6209j.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i4;
        MenuC1627m menuC1627m = this.f6255w;
        Context context = menuC1627m.f6209j;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f6238I = viewInflate;
        this.f6239J = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i4 = this.f6242j) > 0) {
            viewInflate.setId(i4);
        }
        menuC1627m.f6219t = true;
        menuC1627m.m3313p(true);
        return this;
    }
}
