package p104m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p095l.C1624j;
import p095l.C1630p;
import p095l.MenuC1627m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.v1 */
/* loaded from: classes.dex */
public final class C1778v1 extends C1730i1 {

    /* renamed from: v */
    public final int f6788v;

    /* renamed from: w */
    public final int f6789w;

    /* renamed from: x */
    public InterfaceC1775u1 f6790x;

    /* renamed from: y */
    public C1630p f6791y;

    public C1778v1(Context context, boolean z7) {
        super(context, z7);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f6788v = 21;
            this.f6789w = 22;
        } else {
            this.f6788v = 22;
            this.f6789w = 21;
        }
    }

    @Override // p104m.C1730i1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1624j c1624j;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f6790x != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c1624j = (C1624j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1624j = (C1624j) adapter;
                headersCount = 0;
            }
            C1630p c1630pM3305b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c1624j.getCount()) ? null : c1624j.getItem(i);
            C1630p c1630p = this.f6791y;
            if (c1630p != c1630pM3305b) {
                MenuC1627m menuC1627m = c1624j.f6195a;
                if (c1630p != null) {
                    this.f6790x.mo165d(menuC1627m, c1630p);
                }
                this.f6791y = c1630pM3305b;
                if (c1630pM3305b != null) {
                    this.f6790x.mo171n(menuC1627m, c1630pM3305b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f6788v) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f6789w) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C1624j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C1624j) adapter).f6195a.m3308c(false);
        return true;
    }

    public void setHoverListener(InterfaceC1775u1 interfaceC1775u1) {
        this.f6790x = interfaceC1775u1;
    }

    @Override // p104m.C1730i1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
