package p104m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p002a1.C0036o;
import p095l.C1630p;
import p095l.MenuC1627m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.w1 */
/* loaded from: classes.dex */
public final class C1781w1 extends C1772t1 implements InterfaceC1775u1 {

    /* renamed from: M */
    public static final Method f6802M;

    /* renamed from: L */
    public C0036o f6803L;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f6802M = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p104m.InterfaceC1775u1
    /* renamed from: d */
    public final void mo165d(MenuC1627m menuC1627m, MenuItem menuItem) {
        C0036o c0036o = this.f6803L;
        if (c0036o != null) {
            c0036o.mo165d(menuC1627m, menuItem);
        }
    }

    @Override // p104m.InterfaceC1775u1
    /* renamed from: n */
    public final void mo171n(MenuC1627m menuC1627m, C1630p c1630p) {
        C0036o c0036o = this.f6803L;
        if (c0036o != null) {
            c0036o.mo171n(menuC1627m, c1630p);
        }
    }

    @Override // p104m.C1772t1
    /* renamed from: q */
    public final C1730i1 mo3464q(Context context, boolean z7) {
        C1778v1 c1778v1 = new C1778v1(context, z7);
        c1778v1.setHoverListener(this);
        return c1778v1;
    }
}
