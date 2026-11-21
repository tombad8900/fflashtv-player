package p087k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p017b6.AbstractC0622v;
import p055g0.InterfaceMenuItemC1027a;
import p095l.ActionProviderVisibilityListenerC1631q;
import p095l.C1630p;
import p095l.MenuItemC1635u;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k.g */
/* loaded from: classes.dex */
public final class C1542g {

    /* renamed from: A */
    public CharSequence f5876A;

    /* renamed from: B */
    public CharSequence f5877B;

    /* renamed from: E */
    public final /* synthetic */ C1543h f5880E;

    /* renamed from: a */
    public final Menu f5881a;

    /* renamed from: h */
    public boolean f5888h;

    /* renamed from: i */
    public int f5889i;

    /* renamed from: j */
    public int f5890j;

    /* renamed from: k */
    public CharSequence f5891k;

    /* renamed from: l */
    public CharSequence f5892l;

    /* renamed from: m */
    public int f5893m;

    /* renamed from: n */
    public char f5894n;

    /* renamed from: o */
    public int f5895o;

    /* renamed from: p */
    public char f5896p;

    /* renamed from: q */
    public int f5897q;

    /* renamed from: r */
    public int f5898r;

    /* renamed from: s */
    public boolean f5899s;

    /* renamed from: t */
    public boolean f5900t;

    /* renamed from: u */
    public boolean f5901u;

    /* renamed from: v */
    public int f5902v;

    /* renamed from: w */
    public int f5903w;

    /* renamed from: x */
    public String f5904x;

    /* renamed from: y */
    public String f5905y;

    /* renamed from: z */
    public ActionProviderVisibilityListenerC1631q f5906z;

    /* renamed from: C */
    public ColorStateList f5878C = null;

    /* renamed from: D */
    public PorterDuff.Mode f5879D = null;

    /* renamed from: b */
    public int f5882b = 0;

    /* renamed from: c */
    public int f5883c = 0;

    /* renamed from: d */
    public int f5884d = 0;

    /* renamed from: e */
    public int f5885e = 0;

    /* renamed from: f */
    public boolean f5886f = true;

    /* renamed from: g */
    public boolean f5887g = true;

    public C1542g(C1543h c1543h, Menu menu) {
        this.f5880E = c1543h;
        this.f5881a = menu;
    }

    /* renamed from: a */
    public final Object m3218a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f5880E.f5911c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public final void m3219b(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C1543h c1543h = this.f5880E;
        Context context = c1543h.f5911c;
        boolean z7 = false;
        menuItem.setChecked(this.f5899s).setVisible(this.f5900t).setEnabled(this.f5901u).setCheckable(this.f5898r >= 1).setTitleCondensed(this.f5892l).setIcon(this.f5893m);
        int i = this.f5902v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f5905y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c1543h.f5912d == null) {
                c1543h.f5912d = C1543h.m3220a(context);
            }
            Object obj = c1543h.f5912d;
            String str = this.f5905y;
            MenuItemOnMenuItemClickListenerC1541f menuItemOnMenuItemClickListenerC1541f = new MenuItemOnMenuItemClickListenerC1541f();
            menuItemOnMenuItemClickListenerC1541f.f5874a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC1541f.f5875b = cls.getMethod(str, MenuItemOnMenuItemClickListenerC1541f.f5873c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC1541f);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f5898r >= 2) {
            if (menuItem instanceof C1630p) {
                C1630p c1630p = (C1630p) menuItem;
                c1630p.f6236G = (c1630p.f6236G & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC1635u) {
                MenuItemC1635u menuItemC1635u = (MenuItemC1635u) menuItem;
                InterfaceMenuItemC1027a interfaceMenuItemC1027a = menuItemC1635u.f6266l;
                try {
                    if (menuItemC1635u.f6267m == null) {
                        menuItemC1635u.f6267m = interfaceMenuItemC1027a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC1635u.f6267m.invoke(interfaceMenuItemC1027a, Boolean.TRUE);
                } catch (Exception e8) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e8);
                }
            }
        }
        String str2 = this.f5904x;
        if (str2 != null) {
            menuItem.setActionView((View) m3218a(str2, C1543h.f5907e, c1543h.f5909a));
            z7 = true;
        }
        int i4 = this.f5903w;
        if (i4 > 0) {
            if (z7) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i4);
            }
        }
        ActionProviderVisibilityListenerC1631q actionProviderVisibilityListenerC1631q = this.f5906z;
        if (actionProviderVisibilityListenerC1631q != null) {
            if (menuItem instanceof InterfaceMenuItemC1027a) {
                ((InterfaceMenuItemC1027a) menuItem).mo2224b(actionProviderVisibilityListenerC1631q);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f5876A;
        boolean z8 = menuItem instanceof InterfaceMenuItemC1027a;
        if (z8) {
            ((InterfaceMenuItemC1027a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0622v.m1400l(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f5877B;
        if (z8) {
            ((InterfaceMenuItemC1027a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0622v.m1405q(menuItem, charSequence2);
        }
        char c8 = this.f5894n;
        int i8 = this.f5895o;
        if (z8) {
            ((InterfaceMenuItemC1027a) menuItem).setAlphabeticShortcut(c8, i8);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0622v.m1399k(menuItem, c8, i8);
        }
        char c9 = this.f5896p;
        int i9 = this.f5897q;
        if (z8) {
            ((InterfaceMenuItemC1027a) menuItem).setNumericShortcut(c9, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0622v.m1404p(menuItem, c9, i9);
        }
        PorterDuff.Mode mode = this.f5879D;
        if (mode != null) {
            if (z8) {
                ((InterfaceMenuItemC1027a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0622v.m1403o(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f5878C;
        if (colorStateList != null) {
            if (z8) {
                ((InterfaceMenuItemC1027a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0622v.m1402n(menuItem, colorStateList);
            }
        }
    }
}
