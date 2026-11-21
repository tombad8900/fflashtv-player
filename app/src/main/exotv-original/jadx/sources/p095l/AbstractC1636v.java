package p095l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.v */
/* loaded from: classes.dex */
public abstract class AbstractC1636v implements InterfaceC1616d0, InterfaceC1640z, AdapterView.OnItemClickListener {

    /* renamed from: j */
    public Rect f6268j;

    /* renamed from: m */
    public static int m3337m(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i4 = 0;
        int i8 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = listAdapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i9, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        return i4;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: c */
    public final boolean mo3301c(C1630p c1630p) {
        return false;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: i */
    public final void mo3302i(Context context, MenuC1627m menuC1627m) {
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: k */
    public final boolean mo3303k(C1630p c1630p) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo3282l(MenuC1627m menuC1627m);

    /* renamed from: n */
    public abstract void mo3283n(View view);

    /* renamed from: o */
    public abstract void mo3284o(boolean z7);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C1624j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1624j) listAdapter).f6195a.m3314q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC1621g) ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo3285p(int i);

    /* renamed from: q */
    public abstract void mo3286q(int i);

    /* renamed from: r */
    public abstract void mo3287r(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: s */
    public abstract void mo3288s(boolean z7);

    /* renamed from: t */
    public abstract void mo3289t(int i);
}
