package p104m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p087k.InterfaceC1537b;
import p095l.C1630p;
import p095l.C1632r;
import p095l.InterfaceC1640z;
import p095l.MenuC1627m;
import p095l.SubMenuC1620f0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.g2 */
/* loaded from: classes.dex */
public final class C1723g2 implements InterfaceC1640z {

    /* renamed from: j */
    public MenuC1627m f6552j;

    /* renamed from: k */
    public C1630p f6553k;

    /* renamed from: l */
    public final /* synthetic */ Toolbar f6554l;

    public C1723g2(Toolbar toolbar) {
        this.f6554l = toolbar;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: b */
    public final void mo3277b(MenuC1627m menuC1627m, boolean z7) {
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: c */
    public final boolean mo3301c(C1630p c1630p) {
        Toolbar toolbar = this.f6554l;
        toolbar.m479c();
        ViewParent parent = toolbar.f769q.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f769q);
            }
            toolbar.addView(toolbar.f769q);
        }
        View actionView = c1630p.getActionView();
        toolbar.f770r = actionView;
        this.f6553k = c1630p;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f770r);
            }
            C1727h2 c1727h2M473h = Toolbar.m473h();
            c1727h2M473h.f6561a = (toolbar.f775w & 112) | 8388611;
            c1727h2M473h.f6562b = 2;
            toolbar.f770r.setLayoutParams(c1727h2M473h);
            toolbar.addView(toolbar.f770r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1727h2) childAt.getLayoutParams()).f6562b != 2 && childAt != toolbar.f762j) {
                toolbar.removeViewAt(childCount);
                toolbar.f749N.add(childAt);
            }
        }
        toolbar.requestLayout();
        c1630p.f6241L = true;
        c1630p.f6255w.m3313p(false);
        KeyEvent.Callback callback = toolbar.f770r;
        if (callback instanceof InterfaceC1537b) {
            ((C1632r) ((InterfaceC1537b) callback)).f6261j.onActionViewExpanded();
        }
        toolbar.m492t();
        return true;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: d */
    public final boolean mo3278d() {
        return false;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: e */
    public final void mo3279e() {
        if (this.f6553k != null) {
            MenuC1627m menuC1627m = this.f6552j;
            if (menuC1627m != null) {
                int size = menuC1627m.f6214o.size();
                for (int i = 0; i < size; i++) {
                    if (this.f6552j.getItem(i) == this.f6553k) {
                        return;
                    }
                }
            }
            mo3303k(this.f6553k);
        }
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: i */
    public final void mo3302i(Context context, MenuC1627m menuC1627m) {
        C1630p c1630p;
        MenuC1627m menuC1627m2 = this.f6552j;
        if (menuC1627m2 != null && (c1630p = this.f6553k) != null) {
            menuC1627m2.mo3290d(c1630p);
        }
        this.f6552j = menuC1627m;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: j */
    public final boolean mo3281j(SubMenuC1620f0 subMenuC1620f0) {
        return false;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: k */
    public final boolean mo3303k(C1630p c1630p) {
        Toolbar toolbar = this.f6554l;
        KeyEvent.Callback callback = toolbar.f770r;
        if (callback instanceof InterfaceC1537b) {
            ((C1632r) ((InterfaceC1537b) callback)).f6261j.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f770r);
        toolbar.removeView(toolbar.f769q);
        toolbar.f770r = null;
        ArrayList arrayList = toolbar.f749N;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f6553k = null;
        toolbar.requestLayout();
        c1630p.f6241L = false;
        c1630p.f6255w.m3313p(false);
        toolbar.m492t();
        return true;
    }
}
