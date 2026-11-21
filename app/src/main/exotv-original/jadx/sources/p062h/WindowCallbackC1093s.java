package p062h;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p002a1.AbstractC0008a1;
import p002a1.C0016e;
import p002a1.C0022h;
import p017b6.AbstractC0622v;
import p087k.AbstractC1536a;
import p087k.C1538c;
import p087k.C1539d;
import p095l.MenuC1627m;
import p105m0.AbstractC1798c0;
import p105m0.AbstractC1828m0;
import p105m0.C1843r0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.s */
/* loaded from: classes.dex */
public final class WindowCallbackC1093s implements Window.Callback {

    /* renamed from: j */
    public final Window.Callback f4627j;

    /* renamed from: k */
    public boolean f4628k;

    /* renamed from: l */
    public boolean f4629l;

    /* renamed from: m */
    public boolean f4630m;

    /* renamed from: n */
    public final /* synthetic */ LayoutInflaterFactory2C1098x f4631n;

    public WindowCallbackC1093s(LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x, Window.Callback callback) {
        this.f4631n = layoutInflaterFactory2C1098x;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f4627j = callback;
    }

    /* renamed from: a */
    public final void m2317a(Window.Callback callback) {
        try {
            this.f4628k = true;
            callback.onContentChanged();
        } finally {
            this.f4628k = false;
        }
    }

    /* renamed from: b */
    public final boolean m2318b(int i, Menu menu) {
        return this.f4627j.onMenuOpened(i, menu);
    }

    /* renamed from: c */
    public final void m2319c(int i, Menu menu) {
        this.f4627j.onPanelClosed(i, menu);
    }

    /* renamed from: d */
    public final void m2320d(List list, Menu menu, int i) {
        this.f4627j.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f4627j.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z7 = this.f4629l;
        Window.Callback callback = this.f4627j;
        return z7 ? callback.dispatchKeyEvent(keyEvent) : this.f4631n.m2336t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z7;
        MenuC1627m menuC1627m;
        boolean zPerformShortcut;
        if (!this.f4627j.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = this.f4631n;
            layoutInflaterFactory2C1098x.m2342z();
            C1081g0 c1081g0 = layoutInflaterFactory2C1098x.f4703x;
            if (c1081g0 == null) {
                C1097w c1097w = layoutInflaterFactory2C1098x.f4677U;
                if (c1097w == null || !layoutInflaterFactory2C1098x.m2327E(c1097w, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C1098x.f4677U == null) {
                        C1097w c1097wM2341y = layoutInflaterFactory2C1098x.m2341y(0);
                        layoutInflaterFactory2C1098x.m2328F(c1097wM2341y, keyEvent);
                        boolean zM2327E = layoutInflaterFactory2C1098x.m2327E(c1097wM2341y, keyEvent.getKeyCode(), keyEvent);
                        c1097wM2341y.f4648k = false;
                        if (zM2327E) {
                        }
                        if (z7) {
                            return false;
                        }
                    }
                    z7 = false;
                    if (z7) {
                    }
                } else {
                    C1097w c1097w2 = layoutInflaterFactory2C1098x.f4677U;
                    if (c1097w2 != null) {
                        c1097w2.f4649l = true;
                    }
                }
                z7 = true;
                if (z7) {
                }
            } else {
                C1079f0 c1079f0 = c1081g0.f4595x;
                if (c1079f0 == null || (menuC1627m = c1079f0.f4565m) == null) {
                    zPerformShortcut = false;
                } else {
                    menuC1627m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = menuC1627m.performShortcut(keyCode, keyEvent, 0);
                }
                if (zPerformShortcut) {
                    z7 = true;
                    if (z7) {
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f4627j.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f4627j.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f4627j.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f4627j.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f4627j.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f4627j.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f4628k) {
            this.f4627j.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC1627m)) {
            return this.f4627j.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f4627j.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f4627j.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f4627j.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        m2318b(i, menu);
        if (i == 108) {
            LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = this.f4631n;
            layoutInflaterFactory2C1098x.m2342z();
            C1081g0 c1081g0 = layoutInflaterFactory2C1098x.f4703x;
            if (c1081g0 != null) {
                ArrayList arrayList = c1081g0.f4575B;
                if (true != c1081g0.f4574A) {
                    c1081g0.f4574A = true;
                    if (arrayList.size() > 0) {
                        throw AbstractC0008a1.m10f(0, arrayList);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f4630m) {
            this.f4627j.onPanelClosed(i, menu);
            return;
        }
        m2319c(i, menu);
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = this.f4631n;
        if (i != 108) {
            if (i == 0) {
                C1097w c1097wM2341y = layoutInflaterFactory2C1098x.m2341y(i);
                if (c1097wM2341y.f4650m) {
                    layoutInflaterFactory2C1098x.m2335r(c1097wM2341y, false);
                    return;
                }
                return;
            }
            return;
        }
        layoutInflaterFactory2C1098x.m2342z();
        C1081g0 c1081g0 = layoutInflaterFactory2C1098x.f4703x;
        if (c1081g0 != null) {
            ArrayList arrayList = c1081g0.f4575B;
            if (c1081g0.f4574A) {
                c1081g0.f4574A = false;
                if (arrayList.size() > 0) {
                    throw AbstractC0008a1.m10f(0, arrayList);
                }
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z7) {
        AbstractC0622v.m1397i(this.f4627j, z7);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC1627m menuC1627m = menu instanceof MenuC1627m ? (MenuC1627m) menu : null;
        if (i == 0 && menuC1627m == null) {
            return false;
        }
        if (menuC1627m != null) {
            menuC1627m.f6208G = true;
        }
        boolean zOnPreparePanel = this.f4627j.onPreparePanel(i, view, menu);
        if (menuC1627m != null) {
            menuC1627m.f6208G = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC1627m menuC1627m = this.f4631n.m2341y(0).f4645h;
        if (menuC1627m != null) {
            m2320d(list, menuC1627m, i);
        } else {
            m2320d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f4627j.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f4627j.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z7) {
        this.f4627j.onWindowFocusChanged(z7);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f4627j.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = this.f4631n;
        Context context = layoutInflaterFactory2C1098x.f4699t;
        if (i != 0) {
            return this.f4627j.onWindowStartingActionMode(callback, i);
        }
        C0022h c0022h = new C0022h(context, callback);
        AbstractC1536a abstractC1536a = layoutInflaterFactory2C1098x.f4660D;
        if (abstractC1536a != null) {
            abstractC1536a.mo2257a();
        }
        C0016e c0016e = new C0016e(layoutInflaterFactory2C1098x, c0022h, 13, false);
        layoutInflaterFactory2C1098x.m2342z();
        C1081g0 c1081g0 = layoutInflaterFactory2C1098x.f4703x;
        int i4 = 1;
        if (c1081g0 != null) {
            C1079f0 c1079f0 = c1081g0.f4595x;
            if (c1079f0 != null) {
                c1079f0.mo2257a();
            }
            c1081g0.f4589r.setHideOnContentScrollEnabled(false);
            c1081g0.f4592u.m449e();
            C1079f0 c1079f02 = new C1079f0(c1081g0, c1081g0.f4592u.getContext(), c0016e);
            MenuC1627m menuC1627m = c1079f02.f4565m;
            menuC1627m.m3320w();
            try {
                if (((C0022h) c1079f02.f4566n.f62k).m84o(c1079f02, menuC1627m)) {
                    c1081g0.f4595x = c1079f02;
                    c1079f02.mo2263g();
                    c1081g0.f4592u.m447c(c1079f02);
                    c1081g0.m2278h0(true);
                } else {
                    c1079f02 = null;
                }
                layoutInflaterFactory2C1098x.f4660D = c1079f02;
            } finally {
                menuC1627m.m3319v();
            }
        }
        if (layoutInflaterFactory2C1098x.f4660D == null) {
            C1843r0 c1843r0 = layoutInflaterFactory2C1098x.f4664H;
            if (c1843r0 != null) {
                c1843r0.m3616b();
            }
            AbstractC1536a abstractC1536a2 = layoutInflaterFactory2C1098x.f4660D;
            if (abstractC1536a2 != null) {
                abstractC1536a2.mo2257a();
            }
            if (layoutInflaterFactory2C1098x.f4661E == null) {
                if (layoutInflaterFactory2C1098x.f4673Q) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C1538c c1538c = new C1538c(context, 0);
                        c1538c.getTheme().setTo(themeNewTheme);
                        context = c1538c;
                    }
                    layoutInflaterFactory2C1098x.f4661E = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C1098x.f4662F = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    layoutInflaterFactory2C1098x.f4662F.setContentView(layoutInflaterFactory2C1098x.f4661E);
                    layoutInflaterFactory2C1098x.f4662F.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C1098x.f4661E.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C1098x.f4662F.setHeight(-2);
                    layoutInflaterFactory2C1098x.f4663G = new RunnableC1090p(layoutInflaterFactory2C1098x, i4);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C1098x.f4666J.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C1098x.m2342z();
                        C1081g0 c1081g02 = layoutInflaterFactory2C1098x.f4703x;
                        Context contextM2279i0 = c1081g02 != null ? c1081g02.m2279i0() : null;
                        if (contextM2279i0 != null) {
                            context = contextM2279i0;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C1098x.f4661E = (ActionBarContextView) viewStubCompat.m493a();
                    }
                }
            }
            if (layoutInflaterFactory2C1098x.f4661E != null) {
                C1843r0 c1843r02 = layoutInflaterFactory2C1098x.f4664H;
                if (c1843r02 != null) {
                    c1843r02.m3616b();
                }
                layoutInflaterFactory2C1098x.f4661E.m449e();
                Context context2 = layoutInflaterFactory2C1098x.f4661E.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C1098x.f4661E;
                C1539d c1539d = new C1539d();
                c1539d.f5865l = context2;
                c1539d.f5866m = actionBarContextView;
                c1539d.f5867n = c0016e;
                MenuC1627m menuC1627m2 = new MenuC1627m(actionBarContextView.getContext());
                menuC1627m2.f6220u = 1;
                c1539d.f5870q = menuC1627m2;
                menuC1627m2.f6213n = c1539d;
                if (((C0022h) c0016e.f62k).m84o(c1539d, menuC1627m2)) {
                    c1539d.mo2263g();
                    layoutInflaterFactory2C1098x.f4661E.m447c(c1539d);
                    layoutInflaterFactory2C1098x.f4660D = c1539d;
                    if (layoutInflaterFactory2C1098x.f4665I && (viewGroup = layoutInflaterFactory2C1098x.f4666J) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C1098x.f4661E.setAlpha(0.0f);
                        C1843r0 c1843r0M3596a = AbstractC1828m0.m3596a(layoutInflaterFactory2C1098x.f4661E);
                        c1843r0M3596a.m3615a(1.0f);
                        layoutInflaterFactory2C1098x.f4664H = c1843r0M3596a;
                        c1843r0M3596a.m3618d(new C1092r(i4, layoutInflaterFactory2C1098x));
                    } else {
                        layoutInflaterFactory2C1098x.f4661E.setAlpha(1.0f);
                        layoutInflaterFactory2C1098x.f4661E.setVisibility(0);
                        if (layoutInflaterFactory2C1098x.f4661E.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C1098x.f4661E.getParent();
                            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                            AbstractC1798c0.m3516c(view);
                        }
                    }
                    if (layoutInflaterFactory2C1098x.f4662F != null) {
                        layoutInflaterFactory2C1098x.f4700u.getDecorView().post(layoutInflaterFactory2C1098x.f4663G);
                    }
                } else {
                    layoutInflaterFactory2C1098x.f4660D = null;
                }
            }
            layoutInflaterFactory2C1098x.m2330H();
            layoutInflaterFactory2C1098x.f4660D = layoutInflaterFactory2C1098x.f4660D;
        }
        layoutInflaterFactory2C1098x.m2330H();
        AbstractC1536a abstractC1536a3 = layoutInflaterFactory2C1098x.f4660D;
        if (abstractC1536a3 != null) {
            return c0022h.m76g(abstractC1536a3);
        }
        return null;
    }
}
