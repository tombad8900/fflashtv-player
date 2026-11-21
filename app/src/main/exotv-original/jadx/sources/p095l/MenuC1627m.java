package p095l;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p046f0.AbstractC0928a;
import p105m0.AbstractC1831n0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.m */
/* loaded from: classes.dex */
public class MenuC1627m implements Menu {

    /* renamed from: H */
    public static final int[] f6201H = {1, 4, 5, 3, 2, 0};

    /* renamed from: E */
    public C1630p f6206E;

    /* renamed from: G */
    public boolean f6208G;

    /* renamed from: j */
    public final Context f6209j;

    /* renamed from: k */
    public final Resources f6210k;

    /* renamed from: l */
    public boolean f6211l;

    /* renamed from: m */
    public final boolean f6212m;

    /* renamed from: n */
    public InterfaceC1625k f6213n;

    /* renamed from: o */
    public final ArrayList f6214o;

    /* renamed from: p */
    public final ArrayList f6215p;

    /* renamed from: q */
    public boolean f6216q;

    /* renamed from: r */
    public final ArrayList f6217r;

    /* renamed from: s */
    public final ArrayList f6218s;

    /* renamed from: t */
    public boolean f6219t;

    /* renamed from: v */
    public CharSequence f6221v;

    /* renamed from: w */
    public Drawable f6222w;

    /* renamed from: x */
    public View f6223x;

    /* renamed from: u */
    public int f6220u = 0;

    /* renamed from: y */
    public boolean f6224y = false;

    /* renamed from: z */
    public boolean f6225z = false;

    /* renamed from: A */
    public boolean f6202A = false;

    /* renamed from: B */
    public boolean f6203B = false;

    /* renamed from: C */
    public final ArrayList f6204C = new ArrayList();

    /* renamed from: D */
    public final CopyOnWriteArrayList f6205D = new CopyOnWriteArrayList();

    /* renamed from: F */
    public boolean f6207F = false;

    public MenuC1627m(Context context) {
        boolean zM2096k;
        boolean z7 = false;
        this.f6209j = context;
        Resources resources = context.getResources();
        this.f6210k = resources;
        this.f6214o = new ArrayList();
        this.f6215p = new ArrayList();
        this.f6216q = true;
        this.f6217r = new ArrayList();
        this.f6218s = new ArrayList();
        this.f6219t = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC1831n0.f6917a;
            if (Build.VERSION.SDK_INT >= 28) {
                zM2096k = AbstractC0928a.m2096k(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM2096k = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM2096k) {
                z7 = true;
            }
        }
        this.f6212m = z7;
    }

    /* renamed from: a */
    public final C1630p m3306a(int i, int i4, int i8, CharSequence charSequence) {
        int i9;
        int i10 = ((-65536) & i8) >> 16;
        if (i10 < 0 || i10 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i11 = (f6201H[i10] << 16) | (65535 & i8);
        C1630p c1630p = new C1630p(this, i, i4, i8, i11, charSequence, this.f6220u);
        ArrayList arrayList = this.f6214o;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i9 = 0;
                break;
            }
            if (((C1630p) arrayList.get(size)).f6245m <= i11) {
                i9 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i9, c1630p);
        m3313p(true);
        return c1630p;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m3306a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i4, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        int i10;
        PackageManager packageManager = this.f6209j.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i9 & 1) == 0) {
            removeGroup(i);
        }
        for (int i11 = 0; i11 < size; i11++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i11);
            int i12 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i12 < 0 ? intent : intentArr[i12]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C1630p c1630pM3306a = m3306a(i, i4, i8, resolveInfo.loadLabel(packageManager));
            c1630pM3306a.setIcon(resolveInfo.loadIcon(packageManager));
            c1630pM3306a.f6248p = intent2;
            if (menuItemArr != null && (i10 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i10] = c1630pM3306a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void m3307b(InterfaceC1640z interfaceC1640z, Context context) {
        this.f6205D.add(new WeakReference(interfaceC1640z));
        interfaceC1640z.mo3302i(context, this);
        this.f6219t = true;
    }

    /* renamed from: c */
    public final void m3308c(boolean z7) {
        if (this.f6203B) {
            return;
        }
        this.f6203B = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6205D;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1640z interfaceC1640z = (InterfaceC1640z) weakReference.get();
            if (interfaceC1640z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1640z.mo3277b(this, z7);
            }
        }
        this.f6203B = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C1630p c1630p = this.f6206E;
        if (c1630p != null) {
            mo3290d(c1630p);
        }
        this.f6214o.clear();
        m3313p(true);
    }

    public final void clearHeader() {
        this.f6222w = null;
        this.f6221v = null;
        this.f6223x = null;
        m3313p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m3308c(true);
    }

    /* renamed from: d */
    public boolean mo3290d(C1630p c1630p) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6205D;
        boolean zMo3303k = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f6206E == c1630p) {
            m3320w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1640z interfaceC1640z = (InterfaceC1640z) weakReference.get();
                if (interfaceC1640z == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo3303k = interfaceC1640z.mo3303k(c1630p);
                    if (zMo3303k) {
                        break;
                    }
                }
            }
            m3319v();
            if (zMo3303k) {
                this.f6206E = null;
            }
        }
        return zMo3303k;
    }

    /* renamed from: e */
    public boolean mo3291e(MenuC1627m menuC1627m, MenuItem menuItem) {
        InterfaceC1625k interfaceC1625k = this.f6213n;
        return interfaceC1625k != null && interfaceC1625k.mo2267k(menuC1627m, menuItem);
    }

    /* renamed from: f */
    public boolean mo3292f(C1630p c1630p) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6205D;
        boolean zMo3301c = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m3320w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1640z interfaceC1640z = (InterfaceC1640z) weakReference.get();
            if (interfaceC1640z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zMo3301c = interfaceC1640z.mo3301c(c1630p);
                if (zMo3301c) {
                    break;
                }
            }
        }
        m3319v();
        if (zMo3301c) {
            this.f6206E = c1630p;
        }
        return zMo3301c;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f6214o;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1630p c1630p = (C1630p) arrayList.get(i4);
            if (c1630p.f6242j == i) {
                return c1630p;
            }
            if (c1630p.hasSubMenu() && (menuItemFindItem = c1630p.f6256x.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C1630p m3309g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f6204C;
        arrayList.clear();
        m3310h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1630p) arrayList.get(0);
        }
        boolean zMo3296n = mo3296n();
        for (int i4 = 0; i4 < size; i4++) {
            C1630p c1630p = (C1630p) arrayList.get(i4);
            char c8 = zMo3296n ? c1630p.f6251s : c1630p.f6249q;
            char[] cArr = keyData.meta;
            if ((c8 == cArr[0] && (metaState & 2) == 0) || ((c8 == cArr[2] && (metaState & 2) != 0) || (zMo3296n && c8 == '\b' && i == 67))) {
                return c1630p;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f6214o.get(i);
    }

    /* renamed from: h */
    public final void m3310h(List list, int i, KeyEvent keyEvent) {
        boolean zMo3296n = mo3296n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f6214o;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1630p c1630p = (C1630p) arrayList.get(i4);
                if (c1630p.hasSubMenu()) {
                    c1630p.f6256x.m3310h(list, i, keyEvent);
                }
                char c8 = zMo3296n ? c1630p.f6251s : c1630p.f6249q;
                if ((modifiers & 69647) == ((zMo3296n ? c1630p.f6252t : c1630p.f6250r) & 69647) && c8 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c8 == cArr[0] || c8 == cArr[2] || (zMo3296n && c8 == '\b' && i == 67)) && c1630p.isEnabled()) {
                        list.add(c1630p);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f6208G) {
            return true;
        }
        ArrayList arrayList = this.f6214o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C1630p) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m3311i() {
        ArrayList arrayListM3312l = m3312l();
        if (this.f6219t) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f6205D;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zMo3278d = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1640z interfaceC1640z = (InterfaceC1640z) weakReference.get();
                if (interfaceC1640z == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo3278d |= interfaceC1640z.mo3278d();
                }
            }
            ArrayList arrayList = this.f6217r;
            ArrayList arrayList2 = this.f6218s;
            if (zMo3278d) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM3312l.size();
                for (int i = 0; i < size; i++) {
                    C1630p c1630p = (C1630p) arrayListM3312l.get(i);
                    if ((c1630p.f6236G & 32) == 32) {
                        arrayList.add(c1630p);
                    } else {
                        arrayList2.add(c1630p);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m3312l());
            }
            this.f6219t = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m3309g(i, keyEvent) != null;
    }

    /* renamed from: j */
    public String mo3293j() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: k */
    public MenuC1627m mo3294k() {
        return this;
    }

    /* renamed from: l */
    public final ArrayList m3312l() {
        boolean z7 = this.f6216q;
        ArrayList arrayList = this.f6215p;
        if (!z7) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f6214o;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C1630p c1630p = (C1630p) arrayList2.get(i);
            if (c1630p.isVisible()) {
                arrayList.add(c1630p);
            }
        }
        this.f6216q = false;
        this.f6219t = true;
        return arrayList;
    }

    /* renamed from: m */
    public boolean mo3295m() {
        return this.f6207F;
    }

    /* renamed from: n */
    public boolean mo3296n() {
        return this.f6211l;
    }

    /* renamed from: o */
    public boolean mo3297o() {
        return this.f6212m;
    }

    /* renamed from: p */
    public final void m3313p(boolean z7) {
        if (this.f6224y) {
            this.f6225z = true;
            if (z7) {
                this.f6202A = true;
                return;
            }
            return;
        }
        if (z7) {
            this.f6216q = true;
            this.f6219t = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6205D;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m3320w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1640z interfaceC1640z = (InterfaceC1640z) weakReference.get();
            if (interfaceC1640z == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1640z.mo3279e();
            }
        }
        m3319v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i4) {
        return m3314q(findItem(i), null, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i4) {
        C1630p c1630pM3309g = m3309g(i, keyEvent);
        boolean zM3314q = c1630pM3309g != null ? m3314q(c1630pM3309g, null, i4) : false;
        if ((i4 & 2) != 0) {
            m3308c(true);
        }
        return zM3314q;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3314q(MenuItem menuItem, InterfaceC1640z interfaceC1640z, int i) {
        boolean zExpandActionView;
        C1630p c1630p = (C1630p) menuItem;
        if (c1630p == null || !c1630p.isEnabled()) {
            return false;
        }
        MenuC1627m menuC1627m = c1630p.f6255w;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c1630p.f6257y;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c1630p)) && !menuC1627m.mo3291e(menuC1627m, c1630p)) {
            Intent intent = c1630p.f6248p;
            if (intent != null) {
                try {
                    menuC1627m.f6209j.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                }
            } else {
                ActionProviderVisibilityListenerC1631q actionProviderVisibilityListenerC1631q = c1630p.f6239J;
                zExpandActionView = actionProviderVisibilityListenerC1631q != null && actionProviderVisibilityListenerC1631q.f6260b.onPerformDefaultAction();
            }
        }
        ActionProviderVisibilityListenerC1631q actionProviderVisibilityListenerC1631q2 = c1630p.f6239J;
        boolean z7 = actionProviderVisibilityListenerC1631q2 != null && actionProviderVisibilityListenerC1631q2.f6260b.hasSubMenu();
        if (c1630p.m3335e()) {
            zExpandActionView |= c1630p.expandActionView();
            if (zExpandActionView) {
                m3308c(true);
            }
        } else if (c1630p.hasSubMenu() || z7) {
            if ((i & 4) == 0) {
                m3308c(false);
            }
            if (!c1630p.hasSubMenu()) {
                SubMenuC1620f0 subMenuC1620f0 = new SubMenuC1620f0(this.f6209j, this, c1630p);
                c1630p.f6256x = subMenuC1620f0;
                subMenuC1620f0.setHeaderTitle(c1630p.f6246n);
            }
            SubMenuC1620f0 subMenuC1620f02 = c1630p.f6256x;
            if (z7) {
                actionProviderVisibilityListenerC1631q2.f6260b.onPrepareSubMenu(subMenuC1620f02);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f6205D;
            if (!copyOnWriteArrayList.isEmpty()) {
                zMo3281j = interfaceC1640z != null ? interfaceC1640z.mo3281j(subMenuC1620f02) : false;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    InterfaceC1640z interfaceC1640z2 = (InterfaceC1640z) weakReference.get();
                    if (interfaceC1640z2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo3281j) {
                        zMo3281j = interfaceC1640z2.mo3281j(subMenuC1620f02);
                    }
                }
            }
            zExpandActionView |= zMo3281j;
            if (!zExpandActionView) {
                m3308c(true);
            }
        } else if ((i & 1) == 0) {
            m3308c(true);
        }
        return zExpandActionView;
    }

    /* renamed from: r */
    public final void m3315r(InterfaceC1640z interfaceC1640z) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6205D;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1640z interfaceC1640z2 = (InterfaceC1640z) weakReference.get();
            if (interfaceC1640z2 == null || interfaceC1640z2 == interfaceC1640z) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f6214o;
        int size = arrayList.size();
        int i4 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (((C1630p) arrayList.get(i8)).f6243k == i) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            int size2 = arrayList.size() - i8;
            while (true) {
                int i9 = i4 + 1;
                if (i4 >= size2 || ((C1630p) arrayList.get(i8)).f6243k != i) {
                    break;
                }
                if (i8 >= 0 && i8 < arrayList.size()) {
                    arrayList.remove(i8);
                }
                i4 = i9;
            }
            m3313p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f6214o;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((C1630p) arrayList.get(i4)).f6242j == i) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0 || i4 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i4);
        m3313p(true);
    }

    /* renamed from: s */
    public final void m3316s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo3293j());
        int size = this.f6214o.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1620f0) item.getSubMenu()).m3316s(bundle);
            }
        }
        int i4 = bundle.getInt("android:menu:expandedactionview");
        if (i4 <= 0 || (menuItemFindItem = findItem(i4)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z7, boolean z8) {
        ArrayList arrayList = this.f6214o;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1630p c1630p = (C1630p) arrayList.get(i4);
            if (c1630p.f6243k == i) {
                c1630p.f6236G = (c1630p.f6236G & (-5)) | (z8 ? 4 : 0);
                c1630p.setCheckable(z7);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z7) {
        this.f6207F = z7;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z7) {
        ArrayList arrayList = this.f6214o;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1630p c1630p = (C1630p) arrayList.get(i4);
            if (c1630p.f6243k == i) {
                c1630p.setEnabled(z7);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z7) {
        ArrayList arrayList = this.f6214o;
        int size = arrayList.size();
        boolean z8 = false;
        for (int i4 = 0; i4 < size; i4++) {
            C1630p c1630p = (C1630p) arrayList.get(i4);
            if (c1630p.f6243k == i) {
                int i8 = c1630p.f6236G;
                int i9 = (i8 & (-9)) | (z7 ? 0 : 8);
                c1630p.f6236G = i9;
                if (i8 != i9) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            m3313p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z7) {
        this.f6211l = z7;
        m3313p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f6214o.size();
    }

    /* renamed from: t */
    public final void m3317t(Bundle bundle) {
        int size = this.f6214o.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1620f0) item.getSubMenu()).m3317t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo3293j(), sparseArray);
        }
    }

    /* renamed from: u */
    public final void m3318u(int i, CharSequence charSequence, int i4, Drawable drawable, View view) {
        if (view != null) {
            this.f6223x = view;
            this.f6221v = null;
            this.f6222w = null;
        } else {
            if (i > 0) {
                this.f6221v = this.f6210k.getText(i);
            } else if (charSequence != null) {
                this.f6221v = charSequence;
            }
            if (i4 > 0) {
                this.f6222w = this.f6209j.getDrawable(i4);
            } else if (drawable != null) {
                this.f6222w = drawable;
            }
            this.f6223x = null;
        }
        m3313p(false);
    }

    /* renamed from: v */
    public final void m3319v() {
        this.f6224y = false;
        if (this.f6225z) {
            this.f6225z = false;
            m3313p(this.f6202A);
        }
    }

    /* renamed from: w */
    public final void m3320w() {
        if (this.f6224y) {
            return;
        }
        this.f6224y = true;
        this.f6225z = false;
        this.f6202A = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m3306a(0, 0, 0, this.f6210k.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f6210k.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i8, CharSequence charSequence) {
        return m3306a(i, i4, i8, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i8, CharSequence charSequence) {
        C1630p c1630pM3306a = m3306a(i, i4, i8, charSequence);
        SubMenuC1620f0 subMenuC1620f0 = new SubMenuC1620f0(this.f6209j, this, c1630pM3306a);
        c1630pM3306a.f6256x = subMenuC1620f0;
        subMenuC1620f0.setHeaderTitle(c1630pM3306a.f6246n);
        return subMenuC1620f0;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i8, int i9) {
        return m3306a(i, i4, i8, this.f6210k.getString(i9));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i8, int i9) {
        return addSubMenu(i, i4, i8, this.f6210k.getString(i9));
    }
}
