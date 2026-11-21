package p095l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.common.AbstractC0195e;
import com.exotv.net.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p002a1.C0036o;
import p002a1.ViewOnAttachStateChangeListenerC0047t0;
import p104m.C1697a0;
import p104m.C1730i1;
import p104m.C1781w1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.g */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1621g extends AbstractC1636v implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A */
    public boolean f6161A;

    /* renamed from: B */
    public boolean f6162B;

    /* renamed from: C */
    public int f6163C;

    /* renamed from: D */
    public int f6164D;

    /* renamed from: F */
    public boolean f6166F;

    /* renamed from: G */
    public InterfaceC1639y f6167G;

    /* renamed from: H */
    public ViewTreeObserver f6168H;

    /* renamed from: I */
    public PopupWindow.OnDismissListener f6169I;

    /* renamed from: J */
    public boolean f6170J;

    /* renamed from: k */
    public final Context f6171k;

    /* renamed from: l */
    public final int f6172l;

    /* renamed from: m */
    public final int f6173m;

    /* renamed from: n */
    public final int f6174n;

    /* renamed from: o */
    public final boolean f6175o;

    /* renamed from: p */
    public final Handler f6176p;

    /* renamed from: x */
    public View f6184x;

    /* renamed from: y */
    public View f6185y;

    /* renamed from: z */
    public int f6186z;

    /* renamed from: q */
    public final ArrayList f6177q = new ArrayList();

    /* renamed from: r */
    public final ArrayList f6178r = new ArrayList();

    /* renamed from: s */
    public final ViewTreeObserverOnGlobalLayoutListenerC1615d f6179s = new ViewTreeObserverOnGlobalLayoutListenerC1615d(0, this);

    /* renamed from: t */
    public final ViewOnAttachStateChangeListenerC0047t0 f6180t = new ViewOnAttachStateChangeListenerC0047t0(4, this);

    /* renamed from: u */
    public final C0036o f6181u = new C0036o(29, this);

    /* renamed from: v */
    public int f6182v = 0;

    /* renamed from: w */
    public int f6183w = 0;

    /* renamed from: E */
    public boolean f6165E = false;

    public ViewOnKeyListenerC1621g(Context context, View view, int i, int i4, boolean z7) {
        this.f6171k = context;
        this.f6184x = view;
        this.f6173m = i;
        this.f6174n = i4;
        this.f6175o = z7;
        this.f6186z = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f6172l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f6176p = new Handler();
    }

    @Override // p095l.InterfaceC1616d0
    /* renamed from: a */
    public final boolean mo3274a() {
        ArrayList arrayList = this.f6178r;
        return arrayList.size() > 0 && ((C1619f) arrayList.get(0)).f6156a.f6760I.isShowing();
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: b */
    public final void mo3277b(MenuC1627m menuC1627m, boolean z7) {
        ArrayList arrayList = this.f6178r;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC1627m == ((C1619f) arrayList.get(i)).f6157b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i4 = i + 1;
        if (i4 < arrayList.size()) {
            ((C1619f) arrayList.get(i4)).f6157b.m3308c(false);
        }
        C1619f c1619f = (C1619f) arrayList.remove(i);
        MenuC1627m menuC1627m2 = c1619f.f6157b;
        C1781w1 c1781w1 = c1619f.f6156a;
        C1697a0 c1697a0 = c1781w1.f6760I;
        menuC1627m2.m3315r(this);
        if (this.f6170J) {
            c1697a0.setExitTransition(null);
            c1697a0.setAnimationStyle(0);
        }
        c1781w1.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f6186z = ((C1619f) arrayList.get(size2 - 1)).f6158c;
        } else {
            this.f6186z = this.f6184x.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z7) {
                ((C1619f) arrayList.get(0)).f6157b.m3308c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1639y interfaceC1639y = this.f6167G;
        if (interfaceC1639y != null) {
            interfaceC1639y.mo2315b(menuC1627m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f6168H;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f6168H.removeGlobalOnLayoutListener(this.f6179s);
            }
            this.f6168H = null;
        }
        this.f6185y.removeOnAttachStateChangeListener(this.f6180t);
        this.f6169I.onDismiss();
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: d */
    public final boolean mo3278d() {
        return false;
    }

    @Override // p095l.InterfaceC1616d0
    public final void dismiss() {
        ArrayList arrayList = this.f6178r;
        int size = arrayList.size();
        if (size > 0) {
            C1619f[] c1619fArr = (C1619f[]) arrayList.toArray(new C1619f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1619f c1619f = c1619fArr[i];
                if (c1619f.f6156a.f6760I.isShowing()) {
                    c1619f.f6156a.dismiss();
                }
            }
        }
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: e */
    public final void mo3279e() {
        ArrayList arrayList = this.f6178r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((C1619f) obj).f6156a.f6763l.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1624j) adapter).notifyDataSetChanged();
        }
    }

    @Override // p095l.InterfaceC1616d0
    /* renamed from: f */
    public final void mo3275f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (mo3274a()) {
            return;
        }
        ArrayList arrayList = this.f6177q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m3298u((MenuC1627m) obj);
        }
        arrayList.clear();
        View view = this.f6184x;
        this.f6185y = view;
        if (view != null) {
            boolean z7 = this.f6168H == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f6168H = viewTreeObserver;
            if (z7) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f6179s);
            }
            this.f6185y.addOnAttachStateChangeListener(this.f6180t);
        }
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: g */
    public final void mo3280g(InterfaceC1639y interfaceC1639y) {
        this.f6167G = interfaceC1639y;
    }

    @Override // p095l.InterfaceC1616d0
    /* renamed from: h */
    public final C1730i1 mo3276h() {
        ArrayList arrayList = this.f6178r;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1619f) arrayList.get(arrayList.size() - 1)).f6156a.f6763l;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: j */
    public final boolean mo3281j(SubMenuC1620f0 subMenuC1620f0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = this.f6178r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1619f c1619f = (C1619f) obj;
            if (subMenuC1620f0 == c1619f.f6157b) {
                c1619f.f6156a.f6763l.requestFocus();
                return true;
            }
        }
        if (!subMenuC1620f0.hasVisibleItems()) {
            return false;
        }
        mo3282l(subMenuC1620f0);
        InterfaceC1639y interfaceC1639y = this.f6167G;
        if (interfaceC1639y != null) {
            interfaceC1639y.mo2316i(subMenuC1620f0);
        }
        return true;
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: l */
    public final void mo3282l(MenuC1627m menuC1627m) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        menuC1627m.m3307b(this, this.f6171k);
        if (mo3274a()) {
            m3298u(menuC1627m);
        } else {
            this.f6177q.add(menuC1627m);
        }
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: n */
    public final void mo3283n(View view) {
        if (this.f6184x != view) {
            this.f6184x = view;
            this.f6183w = Gravity.getAbsoluteGravity(this.f6182v, view.getLayoutDirection());
        }
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: o */
    public final void mo3284o(boolean z7) {
        this.f6165E = z7;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1619f c1619f;
        ArrayList arrayList = this.f6178r;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1619f = null;
                break;
            }
            c1619f = (C1619f) arrayList.get(i);
            if (!c1619f.f6156a.f6760I.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c1619f != null) {
            c1619f.f6157b.m3308c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: p */
    public final void mo3285p(int i) {
        if (this.f6182v != i) {
            this.f6182v = i;
            this.f6183w = Gravity.getAbsoluteGravity(i, this.f6184x.getLayoutDirection());
        }
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: q */
    public final void mo3286q(int i) {
        this.f6161A = true;
        this.f6163C = i;
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: r */
    public final void mo3287r(PopupWindow.OnDismissListener onDismissListener) {
        this.f6169I = onDismissListener;
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: s */
    public final void mo3288s(boolean z7) {
        this.f6166F = z7;
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: t */
    public final void mo3289t(int i) {
        this.f6162B = true;
        this.f6164D = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3298u(MenuC1627m menuC1627m) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z7;
        int i;
        int i4;
        C1619f c1619f;
        View childAt;
        int i8;
        int i9;
        int i10;
        int width;
        MenuItem item;
        C1624j c1624j;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f6171k;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C1624j c1624j2 = new C1624j(menuC1627m, layoutInflaterFrom, this.f6175o, R.layout.abc_cascading_menu_item_layout);
        if (!mo3274a() && this.f6165E) {
            c1624j2.f6197c = true;
        } else if (mo3274a()) {
            int size = menuC1627m.f6214o.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z7 = false;
                    break;
                }
                MenuItem item2 = menuC1627m.getItem(i11);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z7 = true;
                    break;
                }
                i11++;
            }
            c1624j2.f6197c = z7;
        }
        int iM3337m = AbstractC1636v.m3337m(c1624j2, context, this.f6172l);
        C1781w1 c1781w1 = new C1781w1(context, null, this.f6173m, this.f6174n);
        c1781w1.f6803L = this.f6181u;
        c1781w1.f6776y = this;
        c1781w1.f6760I.setOnDismissListener(this);
        c1781w1.f6775x = this.f6184x;
        c1781w1.f6772u = this.f6183w;
        c1781w1.f6759H = true;
        c1781w1.f6760I.setFocusable(true);
        c1781w1.f6760I.setInputMethodMode(2);
        c1781w1.mo3411p(c1624j2);
        c1781w1.m3465r(iM3337m);
        c1781w1.f6772u = this.f6183w;
        ArrayList arrayList = this.f6178r;
        if (arrayList.size() > 0) {
            c1619f = (C1619f) arrayList.get(arrayList.size() - 1);
            MenuC1627m menuC1627m2 = c1619f.f6157b;
            int size2 = menuC1627m2.f6214o.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    item = null;
                    break;
                }
                item = menuC1627m2.getItem(i12);
                if (item.hasSubMenu() && menuC1627m == item.getSubMenu()) {
                    break;
                } else {
                    i12++;
                }
            }
            if (item == null) {
                i = 1;
                childAt = null;
                i4 = 0;
            } else {
                C1730i1 c1730i1 = c1619f.f6156a.f6763l;
                ListAdapter adapter = c1730i1.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c1624j = (C1624j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1624j = (C1624j) adapter;
                    headersCount = 0;
                }
                int count = c1624j.getCount();
                i = 1;
                int i13 = 0;
                i4 = 0;
                while (true) {
                    if (i13 >= count) {
                        i13 = -1;
                        break;
                    } else if (item == c1624j.getItem(i13)) {
                        break;
                    } else {
                        i13++;
                    }
                }
                childAt = (i13 != -1 && (firstVisiblePosition = (i13 + headersCount) - c1730i1.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c1730i1.getChildCount()) ? c1730i1.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i = 1;
            i4 = 0;
            c1619f = null;
            childAt = null;
        }
        if (childAt != null) {
            int i14 = Build.VERSION.SDK_INT;
            C1697a0 c1697a0 = c1781w1.f6760I;
            if (i14 <= 28) {
                Method method = C1781w1.f6802M;
                if (method != null) {
                    try {
                        method.invoke(c1697a0, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                AbstractC0195e.m617g(c1697a0);
            }
            c1781w1.f6760I.setEnterTransition(null);
            C1730i1 c1730i12 = ((C1619f) arrayList.get(arrayList.size() - 1)).f6156a.f6763l;
            int[] iArr = new int[2];
            c1730i12.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f6185y.getWindowVisibleDisplayFrame(rect);
            if (this.f6186z == i) {
                i8 = (c1730i12.getWidth() + iArr[i4]) + iM3337m > rect.right ? i4 : 1;
            } else if (iArr[i4] - iM3337m < 0) {
            }
            int i15 = i8 == 1 ? 1 : i4;
            this.f6186z = i8;
            if (Build.VERSION.SDK_INT >= 26) {
                c1781w1.f6775x = childAt;
                i10 = i4;
                i9 = i10;
            } else {
                int[] iArr2 = new int[2];
                this.f6184x.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f6183w & 7) == 5) {
                    iArr2[i4] = this.f6184x.getWidth() + iArr2[i4];
                    iArr3[i4] = childAt.getWidth() + iArr3[i4];
                }
                i9 = iArr3[i4] - iArr2[i4];
                i10 = iArr3[1] - iArr2[1];
            }
            if ((this.f6183w & 5) != 5) {
                width = i15 != 0 ? i9 + childAt.getWidth() : i9 - iM3337m;
                c1781w1.f6766o = width;
                c1781w1.f6771t = true;
                c1781w1.f6770s = true;
                c1781w1.m3462k(i10);
            } else if (i15 != 0) {
                width = i9 + iM3337m;
                c1781w1.f6766o = width;
                c1781w1.f6771t = true;
                c1781w1.f6770s = true;
                c1781w1.m3462k(i10);
            } else {
                iM3337m = childAt.getWidth();
                c1781w1.f6766o = width;
                c1781w1.f6771t = true;
                c1781w1.f6770s = true;
                c1781w1.m3462k(i10);
            }
        } else {
            if (this.f6161A) {
                c1781w1.f6766o = this.f6163C;
            }
            if (this.f6162B) {
                c1781w1.m3462k(this.f6164D);
            }
            Rect rect2 = this.f6268j;
            c1781w1.f6758G = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new C1619f(c1781w1, menuC1627m, this.f6186z));
        c1781w1.mo3275f();
        C1730i1 c1730i13 = c1781w1.f6763l;
        c1730i13.setOnKeyListener(this);
        if (c1619f == null && this.f6166F && menuC1627m.f6221v != null) {
            boolean z8 = i4;
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, c1730i13, z8);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(z8);
            textView.setText(menuC1627m.f6221v);
            c1730i13.addHeaderView(frameLayout, null, z8);
            c1781w1.mo3275f();
        }
    }
}
