package p017b6;

import android.view.View;
import android.widget.AdapterView;
import p104m.C1737k0;
import p104m.C1749n0;
import p104m.C1772t1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.y */
/* loaded from: classes.dex */
public final class C0625y implements AdapterView.OnItemClickListener {

    /* renamed from: j */
    public final /* synthetic */ int f2501j;

    /* renamed from: k */
    public final /* synthetic */ Object f2502k;

    public /* synthetic */ C0625y(int i, Object obj) {
        this.f2501j = i;
        this.f2502k = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.f2501j) {
            case 0:
                C0592a0 c0592a0 = (C0592a0) this.f2502k;
                C1772t1 c1772t1 = c0592a0.f2362n;
                c0592a0.setText(c0592a0.convertSelectionToString(i < 0 ? !c1772t1.f6760I.isShowing() ? null : c1772t1.f6763l.getSelectedItem() : c0592a0.getAdapter().getItem(i)), false);
                AdapterView.OnItemClickListener onItemClickListener = c0592a0.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !c1772t1.f6760I.isShowing() ? null : c1772t1.f6763l.getSelectedView();
                        i = !c1772t1.f6760I.isShowing() ? -1 : c1772t1.f6763l.getSelectedItemPosition();
                        j = !c1772t1.f6760I.isShowing() ? Long.MIN_VALUE : c1772t1.f6763l.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c1772t1.f6763l, view, i, j);
                }
                c1772t1.dismiss();
                break;
            default:
                C1737k0 c1737k0 = (C1737k0) this.f2502k;
                C1749n0 c1749n0 = c1737k0.f6611P;
                c1749n0.setSelection(i);
                if (c1749n0.getOnItemClickListener() != null) {
                    c1749n0.performItemClick(view, i, c1737k0.f6608M.getItemId(i));
                }
                c1737k0.dismiss();
                break;
        }
    }
}
