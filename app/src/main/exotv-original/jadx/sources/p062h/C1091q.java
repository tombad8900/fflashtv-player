package p062h;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.media3.common.AbstractC0195e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p037e0.C0851b;
import p095l.InterfaceC1639y;
import p095l.MenuC1627m;
import p104m.AbstractC1763q2;
import p104m.InterfaceC1702b1;
import p105m0.AbstractC1798c0;
import p105m0.AbstractC1814h1;
import p105m0.AbstractC1828m0;
import p105m0.C1799c1;
import p105m0.C1805e1;
import p105m0.C1808f1;
import p105m0.C1811g1;
import p105m0.C1844r1;
import p105m0.InterfaceC1833o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.q */
/* loaded from: classes.dex */
public final class C1091q implements InterfaceC1833o, InterfaceC1702b1, InterfaceC1639y {

    /* renamed from: j */
    public final /* synthetic */ int f4623j;

    /* renamed from: k */
    public final /* synthetic */ LayoutInflaterFactory2C1098x f4624k;

    public /* synthetic */ C1091q(LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x, int i) {
        this.f4623j = i;
        this.f4624k = layoutInflaterFactory2C1098x;
    }

    @Override // p095l.InterfaceC1639y
    /* renamed from: b */
    public void mo2315b(MenuC1627m menuC1627m, boolean z7) {
        C1097w c1097w;
        switch (this.f4623j) {
            case 2:
                this.f4624k.m2334q(menuC1627m);
                break;
            default:
                MenuC1627m menuC1627mMo3294k = menuC1627m.mo3294k();
                int i = 0;
                boolean z8 = menuC1627mMo3294k != menuC1627m;
                if (z8) {
                    menuC1627m = menuC1627mMo3294k;
                }
                LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = this.f4624k;
                C1097w[] c1097wArr = layoutInflaterFactory2C1098x.f4676T;
                int length = c1097wArr != null ? c1097wArr.length : 0;
                while (true) {
                    if (i >= length) {
                        c1097w = null;
                    } else {
                        c1097w = c1097wArr[i];
                        if (c1097w == null || c1097w.f4645h != menuC1627m) {
                            i++;
                        }
                    }
                }
                if (c1097w != null) {
                    if (!z8) {
                        layoutInflaterFactory2C1098x.m2335r(c1097w, z7);
                        break;
                    } else {
                        layoutInflaterFactory2C1098x.m2333p(c1097w.f4638a, c1097w, menuC1627mMo3294k);
                        layoutInflaterFactory2C1098x.m2335r(c1097w, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p095l.InterfaceC1639y
    /* renamed from: i */
    public boolean mo2316i(MenuC1627m menuC1627m) {
        Window.Callback callback;
        switch (this.f4623j) {
            case 2:
                Window.Callback callback2 = this.f4624k.f4700u.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC1627m);
                    break;
                }
                break;
            default:
                if (menuC1627m == menuC1627m.mo3294k()) {
                    LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = this.f4624k;
                    if (layoutInflaterFactory2C1098x.f4670N && (callback = layoutInflaterFactory2C1098x.f4700u.getCallback()) != null && !layoutInflaterFactory2C1098x.f4681Y) {
                        callback.onMenuOpened(108, menuC1627m);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // p105m0.InterfaceC1833o
    /* renamed from: p */
    public C1844r1 mo649p(View view, C1844r1 c1844r1) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C1844r1 c1844r1Mo3518b;
        boolean z7;
        int iM3625d = c1844r1.m3625d();
        int iM3625d2 = c1844r1.m3625d();
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = this.f4624k;
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C1098x.f4661E;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C1098x.f4661E.getLayoutParams();
            if (layoutInflaterFactory2C1098x.f4661E.isShown()) {
                if (layoutInflaterFactory2C1098x.f4693k0 == null) {
                    layoutInflaterFactory2C1098x.f4693k0 = new Rect();
                    layoutInflaterFactory2C1098x.f4694l0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C1098x.f4693k0;
                Rect rect2 = layoutInflaterFactory2C1098x.f4694l0;
                rect.set(c1844r1.m3623b(), c1844r1.m3625d(), c1844r1.m3624c(), c1844r1.m3622a());
                C0851b c0851bMo3563f = c1844r1.f6934a.mo3563f(2);
                ViewGroup viewGroup = layoutInflaterFactory2C1098x.f4666J;
                boolean z8 = true;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z9 = AbstractC1763q2.f6715a;
                    AbstractC0195e.m611a(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC1763q2.f6715a) {
                        AbstractC1763q2.f6715a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC1763q2.f6716b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC1763q2.f6716b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = AbstractC1763q2.f6716b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                C0851b c0851bM2022c = C0851b.m2022c(Math.max(0, c0851bMo3563f.f3769a - rect2.left), Math.max(0, c0851bMo3563f.f3770b - rect2.top), Math.max(0, c0851bMo3563f.f3771c - rect2.right), Math.max(0, c0851bMo3563f.f3772d - rect2.bottom));
                int i = c0851bM2022c.f3771c;
                int i4 = marginLayoutParams.leftMargin;
                int i8 = c0851bM2022c.f3769a;
                if (i4 == i8 && marginLayoutParams.rightMargin == i) {
                    z8 = false;
                } else {
                    marginLayoutParams.leftMargin = i8;
                    marginLayoutParams.rightMargin = i;
                }
                ActionBarContextView actionBarContextView2 = layoutInflaterFactory2C1098x.f4661E;
                int i9 = rect.left - i8;
                int i10 = rect.top;
                int i11 = rect.right - i;
                actionBarContextView2.f652D = i9;
                actionBarContextView2.f653E = i10;
                actionBarContextView2.f654F = i11;
                actionBarContextView2.m453k();
                if (!layoutInflaterFactory2C1098x.f4672P && rect.top > 0) {
                    iM3625d2 = 0;
                }
                z7 = z8;
            } else {
                z7 = false;
            }
            if (z7) {
                layoutInflaterFactory2C1098x.f4661E.setLayoutParams(marginLayoutParams);
            }
        }
        if (iM3625d != iM3625d2) {
            int iM3623b = c1844r1.m3623b();
            int iM3624c = c1844r1.m3624c();
            int iM3622a = c1844r1.m3622a();
            int i12 = Build.VERSION.SDK_INT;
            AbstractC1814h1 c1811g1 = i12 >= 34 ? new C1811g1(c1844r1) : i12 >= 30 ? new C1808f1(c1844r1) : i12 >= 29 ? new C1805e1(c1844r1) : new C1799c1(c1844r1);
            c1811g1.mo3520g(C0851b.m2022c(iM3623b, iM3625d2, iM3624c, iM3622a));
            c1844r1Mo3518b = c1811g1.mo3518b();
        } else {
            c1844r1Mo3518b = c1844r1;
        }
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        WindowInsets windowInsetsM3626f = c1844r1Mo3518b.m3626f();
        if (windowInsetsM3626f == null) {
            return c1844r1Mo3518b;
        }
        WindowInsets windowInsetsM3515b = AbstractC1798c0.m3515b(view, windowInsetsM3626f);
        return !windowInsetsM3515b.equals(windowInsetsM3626f) ? C1844r1.m3621g(view, windowInsetsM3515b) : c1844r1Mo3518b;
    }
}
