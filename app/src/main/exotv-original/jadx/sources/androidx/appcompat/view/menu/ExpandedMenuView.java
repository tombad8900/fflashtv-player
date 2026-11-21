package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p005a4.C0073c;
import p095l.C1630p;
import p095l.InterfaceC1612b0;
import p095l.InterfaceC1626l;
import p095l.MenuC1627m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1626l, InterfaceC1612b0, AdapterView.OnItemClickListener {

    /* renamed from: k */
    public static final int[] f621k = {R.attr.background, R.attr.divider};

    /* renamed from: j */
    public MenuC1627m f622j;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0073c c0073cM263F = C0073c.m263F(R.attr.listViewStyle, 0, context, attributeSet, f621k);
        TypedArray typedArray = (TypedArray) c0073cM263F.f325l;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0073cM263F.m299x(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0073cM263F.m299x(1));
        }
        c0073cM263F.m275I();
    }

    @Override // p095l.InterfaceC1626l
    /* renamed from: a */
    public final boolean mo441a(C1630p c1630p) {
        return this.f622j.m3314q(c1630p, null, 0);
    }

    @Override // p095l.InterfaceC1612b0
    /* renamed from: c */
    public final void mo442c(MenuC1627m menuC1627m) {
        this.f622j = menuC1627m;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo441a((C1630p) getAdapter().getItem(i));
    }
}
