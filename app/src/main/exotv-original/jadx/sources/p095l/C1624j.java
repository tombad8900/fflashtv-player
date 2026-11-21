package p095l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.j */
/* loaded from: classes.dex */
public final class C1624j extends BaseAdapter {

    /* renamed from: a */
    public final MenuC1627m f6195a;

    /* renamed from: b */
    public int f6196b = -1;

    /* renamed from: c */
    public boolean f6197c;

    /* renamed from: d */
    public final boolean f6198d;

    /* renamed from: e */
    public final LayoutInflater f6199e;

    /* renamed from: f */
    public final int f6200f;

    public C1624j(MenuC1627m menuC1627m, LayoutInflater layoutInflater, boolean z7, int i) {
        this.f6198d = z7;
        this.f6199e = layoutInflater;
        this.f6195a = menuC1627m;
        this.f6200f = i;
        m3304a();
    }

    /* renamed from: a */
    public final void m3304a() {
        MenuC1627m menuC1627m = this.f6195a;
        C1630p c1630p = menuC1627m.f6206E;
        if (c1630p != null) {
            menuC1627m.m3311i();
            ArrayList arrayList = menuC1627m.f6218s;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1630p) arrayList.get(i)) == c1630p) {
                    this.f6196b = i;
                    return;
                }
            }
        }
        this.f6196b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1630p getItem(int i) {
        ArrayList arrayListM3312l;
        boolean z7 = this.f6198d;
        MenuC1627m menuC1627m = this.f6195a;
        if (z7) {
            menuC1627m.m3311i();
            arrayListM3312l = menuC1627m.f6218s;
        } else {
            arrayListM3312l = menuC1627m.m3312l();
        }
        int i4 = this.f6196b;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (C1630p) arrayListM3312l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM3312l;
        boolean z7 = this.f6198d;
        MenuC1627m menuC1627m = this.f6195a;
        if (z7) {
            menuC1627m.m3311i();
            arrayListM3312l = menuC1627m.f6218s;
        } else {
            arrayListM3312l = menuC1627m.m3312l();
        }
        return this.f6196b < 0 ? arrayListM3312l.size() : arrayListM3312l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z7 = false;
        if (view == null) {
            view = this.f6199e.inflate(this.f6200f, viewGroup, false);
        }
        int i4 = getItem(i).f6243k;
        int i8 = i - 1;
        int i9 = i8 >= 0 ? getItem(i8).f6243k : i4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f6195a.mo3295m() && i4 != i9) {
            z7 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z7);
        InterfaceC1610a0 interfaceC1610a0 = (InterfaceC1610a0) view;
        if (this.f6197c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1610a0.mo437b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m3304a();
        super.notifyDataSetChanged();
    }
}
