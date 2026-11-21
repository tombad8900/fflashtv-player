package p104m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.exotv.net.R;
import java.util.ArrayList;
import p095l.AbstractC1636v;
import p095l.ActionProviderVisibilityListenerC1631q;
import p095l.C1629o;
import p095l.C1630p;
import p095l.InterfaceC1610a0;
import p095l.InterfaceC1612b0;
import p095l.InterfaceC1639y;
import p095l.InterfaceC1640z;
import p095l.MenuC1627m;
import p095l.SubMenuC1620f0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.k */
/* loaded from: classes.dex */
public final class C1736k implements InterfaceC1640z {

    /* renamed from: B */
    public C1720g f6585B;

    /* renamed from: C */
    public C1720g f6586C;

    /* renamed from: D */
    public RunnableC1728i f6587D;

    /* renamed from: E */
    public C1724h f6588E;

    /* renamed from: j */
    public final Context f6590j;

    /* renamed from: k */
    public Context f6591k;

    /* renamed from: l */
    public MenuC1627m f6592l;

    /* renamed from: m */
    public final LayoutInflater f6593m;

    /* renamed from: n */
    public InterfaceC1639y f6594n;

    /* renamed from: q */
    public InterfaceC1612b0 f6597q;

    /* renamed from: r */
    public C1732j f6598r;

    /* renamed from: s */
    public Drawable f6599s;

    /* renamed from: t */
    public boolean f6600t;

    /* renamed from: u */
    public boolean f6601u;

    /* renamed from: v */
    public boolean f6602v;

    /* renamed from: w */
    public int f6603w;

    /* renamed from: x */
    public int f6604x;

    /* renamed from: y */
    public int f6605y;

    /* renamed from: z */
    public boolean f6606z;

    /* renamed from: o */
    public final int f6595o = R.layout.abc_action_menu_layout;

    /* renamed from: p */
    public final int f6596p = R.layout.abc_action_menu_item_layout;

    /* renamed from: A */
    public final SparseBooleanArray f6584A = new SparseBooleanArray();

    /* renamed from: F */
    public final C1629o f6589F = new C1629o(this);

    public C1736k(Context context) {
        this.f6590j = context;
        this.f6593m = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.a0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: a */
    public final View m3414a(C1630p c1630p, View view, ViewGroup viewGroup) {
        View actionView = c1630p.getActionView();
        if (actionView == null || c1630p.m3335e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC1610a0 ? (InterfaceC1610a0) view : (InterfaceC1610a0) this.f6593m.inflate(this.f6596p, viewGroup, false);
            actionMenuItemView.mo437b(c1630p);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f6597q);
            if (this.f6588E == null) {
                this.f6588E = new C1724h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f6588E);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c1630p.f6241L ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1744m)) {
            actionView.setLayoutParams(ActionMenuView.m467k(layoutParams));
        }
        return actionView;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: b */
    public final void mo3277b(MenuC1627m menuC1627m, boolean z7) {
        m3415f();
        C1720g c1720g = this.f6586C;
        if (c1720g != null && c1720g.m3339b()) {
            c1720g.f6279j.dismiss();
        }
        InterfaceC1639y interfaceC1639y = this.f6594n;
        if (interfaceC1639y != null) {
            interfaceC1639y.mo2315b(menuC1627m, z7);
        }
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: c */
    public final boolean mo3301c(C1630p c1630p) {
        return false;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: d */
    public final boolean mo3278d() {
        int size;
        ArrayList arrayListM3312l;
        int i;
        boolean z7;
        C1736k c1736k = this;
        MenuC1627m menuC1627m = c1736k.f6592l;
        if (menuC1627m != null) {
            arrayListM3312l = menuC1627m.m3312l();
            size = arrayListM3312l.size();
        } else {
            size = 0;
            arrayListM3312l = null;
        }
        int i4 = c1736k.f6605y;
        int i8 = c1736k.f6604x;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1736k.f6597q;
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i = 2;
            z7 = true;
            if (i9 >= size) {
                break;
            }
            C1630p c1630p = (C1630p) arrayListM3312l.get(i9);
            int i12 = c1630p.f6237H;
            if ((i12 & 2) == 2) {
                i10++;
            } else if ((i12 & 1) == 1) {
                i11++;
            } else {
                z8 = true;
            }
            if (c1736k.f6606z && c1630p.f6241L) {
                i4 = 0;
            }
            i9++;
        }
        if (c1736k.f6601u && (z8 || i11 + i10 > i4)) {
            i4--;
        }
        int i13 = i4 - i10;
        SparseBooleanArray sparseBooleanArray = c1736k.f6584A;
        sparseBooleanArray.clear();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            C1630p c1630p2 = (C1630p) arrayListM3312l.get(i14);
            int i16 = c1630p2.f6237H;
            boolean z9 = (i16 & 2) == i ? z7 : false;
            int i17 = c1630p2.f6243k;
            if (z9) {
                View viewM3414a = c1736k.m3414a(c1630p2, null, viewGroup);
                viewM3414a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM3414a.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                if (i17 != 0) {
                    sparseBooleanArray.put(i17, z7);
                }
                c1630p2.m3336f(z7);
            } else if ((i16 & 1) == z7) {
                boolean z10 = sparseBooleanArray.get(i17);
                boolean z11 = ((i13 > 0 || z10) && i8 > 0) ? z7 : false;
                if (z11) {
                    View viewM3414a2 = c1736k.m3414a(c1630p2, null, viewGroup);
                    viewM3414a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM3414a2.getMeasuredWidth();
                    i8 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z11 &= i8 + i15 > 0;
                }
                if (z11 && i17 != 0) {
                    sparseBooleanArray.put(i17, true);
                } else if (z10) {
                    sparseBooleanArray.put(i17, false);
                    for (int i18 = 0; i18 < i14; i18++) {
                        C1630p c1630p3 = (C1630p) arrayListM3312l.get(i18);
                        if (c1630p3.f6243k == i17) {
                            if ((c1630p3.f6236G & 32) == 32) {
                                i13++;
                            }
                            c1630p3.m3336f(false);
                        }
                    }
                }
                if (z11) {
                    i13--;
                }
                c1630p2.m3336f(z11);
            } else {
                c1630p2.m3336f(false);
                i14++;
                i = 2;
                c1736k = this;
                z7 = true;
            }
            i14++;
            i = 2;
            c1736k = this;
            z7 = true;
        }
        return z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p095l.InterfaceC1640z
    /* renamed from: e */
    public final void mo3279e() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f6597q;
        ArrayList arrayList = null;
        boolean z7 = false;
        if (viewGroup != null) {
            MenuC1627m menuC1627m = this.f6592l;
            if (menuC1627m != null) {
                menuC1627m.m3311i();
                ArrayList arrayListM3312l = this.f6592l.m3312l();
                int size = arrayListM3312l.size();
                i = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    C1630p c1630p = (C1630p) arrayListM3312l.get(i4);
                    if ((c1630p.f6236G & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C1630p itemData = childAt instanceof InterfaceC1610a0 ? ((InterfaceC1610a0) childAt).getItemData() : null;
                        View viewM3414a = m3414a(c1630p, childAt, viewGroup);
                        if (c1630p != itemData) {
                            viewM3414a.setPressed(false);
                            viewM3414a.jumpDrawablesToCurrentState();
                        }
                        if (viewM3414a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM3414a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM3414a);
                            }
                            ((ViewGroup) this.f6597q).addView(viewM3414a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f6598r) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f6597q).requestLayout();
        MenuC1627m menuC1627m2 = this.f6592l;
        if (menuC1627m2 != null) {
            menuC1627m2.m3311i();
            ArrayList arrayList2 = menuC1627m2.f6217r;
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ActionProviderVisibilityListenerC1631q actionProviderVisibilityListenerC1631q = ((C1630p) arrayList2.get(i8)).f6239J;
            }
        }
        MenuC1627m menuC1627m3 = this.f6592l;
        if (menuC1627m3 != null) {
            menuC1627m3.m3311i();
            arrayList = menuC1627m3.f6218s;
        }
        if (this.f6601u && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z7 = !((C1630p) arrayList.get(0)).f6241L;
            } else if (size3 > 0) {
                z7 = true;
            }
        }
        if (z7) {
            if (this.f6598r == null) {
                this.f6598r = new C1732j(this, this.f6590j);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f6598r.getParent();
            if (viewGroup3 != this.f6597q) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f6598r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f6597q;
                C1732j c1732j = this.f6598r;
                actionMenuView.getClass();
                C1744m c1744mM466j = ActionMenuView.m466j();
                c1744mM466j.f6641a = true;
                actionMenuView.addView(c1732j, c1744mM466j);
            }
        } else {
            C1732j c1732j2 = this.f6598r;
            if (c1732j2 != null) {
                Object parent = c1732j2.getParent();
                Object obj = this.f6597q;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f6598r);
                }
            }
        }
        ((ActionMenuView) this.f6597q).setOverflowReserved(this.f6601u);
    }

    /* renamed from: f */
    public final boolean m3415f() {
        Object obj;
        RunnableC1728i runnableC1728i = this.f6587D;
        if (runnableC1728i != null && (obj = this.f6597q) != null) {
            ((View) obj).removeCallbacks(runnableC1728i);
            this.f6587D = null;
            return true;
        }
        C1720g c1720g = this.f6585B;
        if (c1720g == null) {
            return false;
        }
        if (c1720g.m3339b()) {
            c1720g.f6279j.dismiss();
        }
        return true;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: g */
    public final void mo3280g(InterfaceC1639y interfaceC1639y) {
        throw null;
    }

    /* renamed from: h */
    public final boolean m3416h() {
        C1720g c1720g = this.f6585B;
        return c1720g != null && c1720g.m3339b();
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: i */
    public final void mo3302i(Context context, MenuC1627m menuC1627m) {
        this.f6591k = context;
        LayoutInflater.from(context);
        this.f6592l = menuC1627m;
        Resources resources = context.getResources();
        if (!this.f6602v) {
            this.f6601u = true;
        }
        int i = 2;
        this.f6603w = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i8 > 720) || (i4 > 720 && i8 > 960))) {
            i = 5;
        } else if (i4 >= 500 || ((i4 > 640 && i8 > 480) || (i4 > 480 && i8 > 640))) {
            i = 4;
        } else if (i4 >= 360) {
            i = 3;
        }
        this.f6605y = i;
        int measuredWidth = this.f6603w;
        if (this.f6601u) {
            if (this.f6598r == null) {
                C1732j c1732j = new C1732j(this, this.f6590j);
                this.f6598r = c1732j;
                if (this.f6600t) {
                    c1732j.setImageDrawable(this.f6599s);
                    this.f6599s = null;
                    this.f6600t = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f6598r.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f6598r.getMeasuredWidth();
        } else {
            this.f6598r = null;
        }
        this.f6604x = measuredWidth;
        float f8 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p095l.InterfaceC1640z
    /* renamed from: j */
    public final boolean mo3281j(SubMenuC1620f0 subMenuC1620f0) {
        boolean z7;
        if (subMenuC1620f0.hasVisibleItems()) {
            SubMenuC1620f0 subMenuC1620f02 = subMenuC1620f0;
            while (true) {
                MenuC1627m menuC1627m = subMenuC1620f02.f6159I;
                if (menuC1627m == this.f6592l) {
                    break;
                }
                subMenuC1620f02 = (SubMenuC1620f0) menuC1627m;
            }
            C1630p c1630p = subMenuC1620f02.f6160J;
            ViewGroup viewGroup = (ViewGroup) this.f6597q;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof InterfaceC1610a0) && ((InterfaceC1610a0) childAt).getItemData() == c1630p) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                subMenuC1620f0.f6160J.getClass();
                int size = subMenuC1620f0.f6214o.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z7 = false;
                        break;
                    }
                    MenuItem item = subMenuC1620f0.getItem(i4);
                    if (item.isVisible() && item.getIcon() != null) {
                        z7 = true;
                        break;
                    }
                    i4++;
                }
                C1720g c1720g = new C1720g(this, this.f6591k, subMenuC1620f0, view);
                this.f6586C = c1720g;
                c1720g.f6277h = z7;
                AbstractC1636v abstractC1636v = c1720g.f6279j;
                if (abstractC1636v != null) {
                    abstractC1636v.mo3284o(z7);
                }
                C1720g c1720g2 = this.f6586C;
                if (!c1720g2.m3339b()) {
                    if (c1720g2.f6275f == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c1720g2.m3341d(0, 0, false, false);
                }
                InterfaceC1639y interfaceC1639y = this.f6594n;
                if (interfaceC1639y != null) {
                    interfaceC1639y.mo2316i(subMenuC1620f0);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: k */
    public final boolean mo3303k(C1630p c1630p) {
        return false;
    }

    /* renamed from: l */
    public final boolean m3417l() {
        MenuC1627m menuC1627m;
        if (!this.f6601u || m3416h() || (menuC1627m = this.f6592l) == null || this.f6597q == null || this.f6587D != null) {
            return false;
        }
        menuC1627m.m3311i();
        if (menuC1627m.f6218s.isEmpty()) {
            return false;
        }
        RunnableC1728i runnableC1728i = new RunnableC1728i(this, new C1720g(this, this.f6591k, this.f6592l, this.f6598r));
        this.f6587D = runnableC1728i;
        ((View) this.f6597q).post(runnableC1728i);
        return true;
    }
}
