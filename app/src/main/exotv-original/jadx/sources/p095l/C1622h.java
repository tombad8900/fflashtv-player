package p095l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.exotv.net.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.h */
/* loaded from: classes.dex */
public final class C1622h extends BaseAdapter {

    /* renamed from: a */
    public int f6187a = -1;

    /* renamed from: b */
    public final /* synthetic */ C1623i f6188b;

    public C1622h(C1623i c1623i) {
        this.f6188b = c1623i;
        m3299a();
    }

    /* renamed from: a */
    public final void m3299a() {
        MenuC1627m menuC1627m = this.f6188b.f6191l;
        C1630p c1630p = menuC1627m.f6206E;
        if (c1630p != null) {
            menuC1627m.m3311i();
            ArrayList arrayList = menuC1627m.f6218s;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1630p) arrayList.get(i)) == c1630p) {
                    this.f6187a = i;
                    return;
                }
            }
        }
        this.f6187a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1630p getItem(int i) {
        C1623i c1623i = this.f6188b;
        MenuC1627m menuC1627m = c1623i.f6191l;
        menuC1627m.m3311i();
        ArrayList arrayList = menuC1627m.f6218s;
        c1623i.getClass();
        int i4 = this.f6187a;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (C1630p) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C1623i c1623i = this.f6188b;
        MenuC1627m menuC1627m = c1623i.f6191l;
        menuC1627m.m3311i();
        int size = menuC1627m.f6218s.size();
        c1623i.getClass();
        return this.f6187a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f6188b.f6190k.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC1610a0) view).mo437b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m3299a();
        super.notifyDataSetChanged();
    }
}
