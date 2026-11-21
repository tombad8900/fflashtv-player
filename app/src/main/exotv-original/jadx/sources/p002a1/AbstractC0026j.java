package p002a1;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import java.io.File;
import java.util.HashSet;
import p041e4.C0907x;
import p041e4.InterfaceC0901r;
import p041e4.InterfaceC0902s;
import p050f4.C0943d;
import p055g0.InterfaceMenuItemC1027a;
import p062h.C1095u;
import p062h.LayoutInflaterFactory2C1098x;
import p070i0.C1217b;
import p095l.MenuItemC1635u;
import p130p.C2192k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.j */
/* loaded from: classes.dex */
public abstract class AbstractC0026j implements InterfaceC0902s {

    /* renamed from: j */
    public Object f88j;

    /* renamed from: k */
    public Object f89k;

    public /* synthetic */ AbstractC0026j(Object obj, Object obj2) {
        this.f88j = obj;
        this.f89k = obj2;
    }

    /* renamed from: c */
    public void m90c() {
        C1095u c1095u = (C1095u) this.f88j;
        if (c1095u != null) {
            try {
                ((LayoutInflaterFactory2C1098x) this.f89k).f4699t.unregisterReceiver(c1095u);
            } catch (IllegalArgumentException unused) {
            }
            this.f88j = null;
        }
    }

    /* renamed from: d */
    public void m91d() {
        C0059z0 c0059z0 = (C0059z0) this.f88j;
        C1217b c1217b = (C1217b) this.f89k;
        HashSet hashSet = c0059z0.f286e;
        if (hashSet.remove(c1217b) && hashSet.isEmpty()) {
            c0059z0.m244b();
        }
    }

    /* renamed from: e */
    public abstract IntentFilter mo92e();

    /* renamed from: f */
    public abstract int mo93f();

    @Override // p041e4.InterfaceC0902s
    /* renamed from: g */
    public InterfaceC0901r mo94g(C0907x c0907x) {
        Context context = (Context) this.f88j;
        Class cls = (Class) this.f89k;
        return new C0943d(context, c0907x.m2070a(File.class, cls), c0907x.m2070a(Uri.class, cls), cls);
    }

    /* renamed from: h */
    public MenuItem m95h(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC1027a)) {
            return menuItem;
        }
        InterfaceMenuItemC1027a interfaceMenuItemC1027a = (InterfaceMenuItemC1027a) menuItem;
        if (((C2192k) this.f89k) == null) {
            this.f89k = new C2192k(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C2192k) this.f89k).get(interfaceMenuItemC1027a);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC1635u menuItemC1635u = new MenuItemC1635u((Context) this.f88j, interfaceMenuItemC1027a);
        ((C2192k) this.f89k).put(interfaceMenuItemC1027a, menuItemC1635u);
        return menuItemC1635u;
    }

    /* renamed from: i */
    public abstract void mo96i();

    /* renamed from: j */
    public void m97j() {
        m90c();
        IntentFilter intentFilterMo92e = mo92e();
        if (intentFilterMo92e.countActions() == 0) {
            return;
        }
        if (((C1095u) this.f88j) == null) {
            this.f88j = new C1095u(0, this);
        }
        ((LayoutInflaterFactory2C1098x) this.f89k).f4699t.registerReceiver((C1095u) this.f88j, intentFilterMo92e);
    }

    public AbstractC0026j(Context context) {
        this.f88j = context;
    }

    public AbstractC0026j(LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x) {
        this.f89k = layoutInflaterFactory2C1098x;
    }
}
