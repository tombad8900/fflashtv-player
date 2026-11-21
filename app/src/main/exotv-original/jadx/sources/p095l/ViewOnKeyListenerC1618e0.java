package p095l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.exotv.net.R;
import p002a1.ViewOnAttachStateChangeListenerC0047t0;
import p104m.C1697a0;
import p104m.C1730i1;
import p104m.C1781w1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.e0 */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1618e0 extends AbstractC1636v implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A */
    public boolean f6136A;

    /* renamed from: B */
    public int f6137B;

    /* renamed from: D */
    public boolean f6139D;

    /* renamed from: k */
    public final Context f6140k;

    /* renamed from: l */
    public final MenuC1627m f6141l;

    /* renamed from: m */
    public final C1624j f6142m;

    /* renamed from: n */
    public final boolean f6143n;

    /* renamed from: o */
    public final int f6144o;

    /* renamed from: p */
    public final int f6145p;

    /* renamed from: q */
    public final int f6146q;

    /* renamed from: r */
    public final C1781w1 f6147r;

    /* renamed from: u */
    public PopupWindow.OnDismissListener f6150u;

    /* renamed from: v */
    public View f6151v;

    /* renamed from: w */
    public View f6152w;

    /* renamed from: x */
    public InterfaceC1639y f6153x;

    /* renamed from: y */
    public ViewTreeObserver f6154y;

    /* renamed from: z */
    public boolean f6155z;

    /* renamed from: s */
    public final ViewTreeObserverOnGlobalLayoutListenerC1615d f6148s = new ViewTreeObserverOnGlobalLayoutListenerC1615d(1, this);

    /* renamed from: t */
    public final ViewOnAttachStateChangeListenerC0047t0 f6149t = new ViewOnAttachStateChangeListenerC0047t0(5, this);

    /* renamed from: C */
    public int f6138C = 0;

    public ViewOnKeyListenerC1618e0(int i, int i4, Context context, View view, MenuC1627m menuC1627m, boolean z7) {
        this.f6140k = context;
        this.f6141l = menuC1627m;
        this.f6143n = z7;
        this.f6142m = new C1624j(menuC1627m, LayoutInflater.from(context), z7, R.layout.abc_popup_menu_item_layout);
        this.f6145p = i;
        this.f6146q = i4;
        Resources resources = context.getResources();
        this.f6144o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f6151v = view;
        this.f6147r = new C1781w1(context, null, i, i4);
        menuC1627m.m3307b(this, context);
    }

    @Override // p095l.InterfaceC1616d0
    /* renamed from: a */
    public final boolean mo3274a() {
        return !this.f6155z && this.f6147r.f6760I.isShowing();
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: b */
    public final void mo3277b(MenuC1627m menuC1627m, boolean z7) {
        if (menuC1627m != this.f6141l) {
            return;
        }
        dismiss();
        InterfaceC1639y interfaceC1639y = this.f6153x;
        if (interfaceC1639y != null) {
            interfaceC1639y.mo2315b(menuC1627m, z7);
        }
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: d */
    public final boolean mo3278d() {
        return false;
    }

    @Override // p095l.InterfaceC1616d0
    public final void dismiss() {
        if (mo3274a()) {
            this.f6147r.dismiss();
        }
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: e */
    public final void mo3279e() {
        this.f6136A = false;
        C1624j c1624j = this.f6142m;
        if (c1624j != null) {
            c1624j.notifyDataSetChanged();
        }
    }

    @Override // p095l.InterfaceC1616d0
    /* renamed from: f */
    public final void mo3275f() {
        View view;
        if (mo3274a()) {
            return;
        }
        if (this.f6155z || (view = this.f6151v) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f6152w = view;
        C1781w1 c1781w1 = this.f6147r;
        C1697a0 c1697a0 = c1781w1.f6760I;
        C1697a0 c1697a02 = c1781w1.f6760I;
        c1697a0.setOnDismissListener(this);
        c1781w1.f6776y = this;
        c1781w1.f6759H = true;
        c1697a02.setFocusable(true);
        View view2 = this.f6152w;
        boolean z7 = this.f6154y == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f6154y = viewTreeObserver;
        if (z7) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f6148s);
        }
        view2.addOnAttachStateChangeListener(this.f6149t);
        c1781w1.f6775x = view2;
        c1781w1.f6772u = this.f6138C;
        boolean z8 = this.f6136A;
        Context context = this.f6140k;
        C1624j c1624j = this.f6142m;
        if (!z8) {
            this.f6137B = AbstractC1636v.m3337m(c1624j, context, this.f6144o);
            this.f6136A = true;
        }
        c1781w1.m3465r(this.f6137B);
        c1697a02.setInputMethodMode(2);
        Rect rect = this.f6268j;
        c1781w1.f6758G = rect != null ? new Rect(rect) : null;
        c1781w1.mo3275f();
        C1730i1 c1730i1 = c1781w1.f6763l;
        c1730i1.setOnKeyListener(this);
        if (this.f6139D) {
            MenuC1627m menuC1627m = this.f6141l;
            if (menuC1627m.f6221v != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1730i1, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC1627m.f6221v);
                }
                frameLayout.setEnabled(false);
                c1730i1.addHeaderView(frameLayout, null, false);
            }
        }
        c1781w1.mo3411p(c1624j);
        c1781w1.mo3275f();
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: g */
    public final void mo3280g(InterfaceC1639y interfaceC1639y) {
        this.f6153x = interfaceC1639y;
    }

    @Override // p095l.InterfaceC1616d0
    /* renamed from: h */
    public final C1730i1 mo3276h() {
        return this.f6147r.f6763l;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: j */
    public final boolean mo3281j(SubMenuC1620f0 subMenuC1620f0) {
        boolean z7;
        if (subMenuC1620f0.hasVisibleItems()) {
            C1638x c1638x = new C1638x(this.f6145p, this.f6146q, this.f6140k, this.f6152w, subMenuC1620f0, this.f6143n);
            InterfaceC1639y interfaceC1639y = this.f6153x;
            c1638x.f6278i = interfaceC1639y;
            AbstractC1636v abstractC1636v = c1638x.f6279j;
            if (abstractC1636v != null) {
                abstractC1636v.mo3280g(interfaceC1639y);
            }
            int size = subMenuC1620f0.f6214o.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z7 = false;
                    break;
                }
                MenuItem item = subMenuC1620f0.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z7 = true;
                    break;
                }
                i++;
            }
            c1638x.f6277h = z7;
            AbstractC1636v abstractC1636v2 = c1638x.f6279j;
            if (abstractC1636v2 != null) {
                abstractC1636v2.mo3284o(z7);
            }
            c1638x.f6280k = this.f6150u;
            this.f6150u = null;
            this.f6141l.m3308c(false);
            C1781w1 c1781w1 = this.f6147r;
            int width = c1781w1.f6766o;
            int iM3463o = c1781w1.m3463o();
            if ((Gravity.getAbsoluteGravity(this.f6138C, this.f6151v.getLayoutDirection()) & 7) == 5) {
                width += this.f6151v.getWidth();
            }
            if (!c1638x.m3339b()) {
                if (c1638x.f6275f != null) {
                    c1638x.m3341d(width, iM3463o, true, true);
                }
            }
            InterfaceC1639y interfaceC1639y2 = this.f6153x;
            if (interfaceC1639y2 != null) {
                interfaceC1639y2.mo2316i(subMenuC1620f0);
            }
            return true;
        }
        return false;
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: l */
    public final void mo3282l(MenuC1627m menuC1627m) {
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: n */
    public final void mo3283n(View view) {
        this.f6151v = view;
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: o */
    public final void mo3284o(boolean z7) {
        this.f6142m.f6197c = z7;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f6155z = true;
        this.f6141l.m3308c(true);
        ViewTreeObserver viewTreeObserver = this.f6154y;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f6154y = this.f6152w.getViewTreeObserver();
            }
            this.f6154y.removeGlobalOnLayoutListener(this.f6148s);
            this.f6154y = null;
        }
        this.f6152w.removeOnAttachStateChangeListener(this.f6149t);
        PopupWindow.OnDismissListener onDismissListener = this.f6150u;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f6138C = i;
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: q */
    public final void mo3286q(int i) {
        this.f6147r.f6766o = i;
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: r */
    public final void mo3287r(PopupWindow.OnDismissListener onDismissListener) {
        this.f6150u = onDismissListener;
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: s */
    public final void mo3288s(boolean z7) {
        this.f6139D = z7;
    }

    @Override // p095l.AbstractC1636v
    /* renamed from: t */
    public final void mo3289t(int i) {
        this.f6147r.m3462k(i);
    }
}
