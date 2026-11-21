package p104m;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.o1 */
/* loaded from: classes.dex */
public final class C1754o1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: j */
    public final /* synthetic */ C1772t1 f6693j;

    public C1754o1(C1772t1 c1772t1) {
        this.f6693j = c1772t1;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C1730i1 c1730i1;
        if (i == -1 || (c1730i1 = this.f6693j.f6763l) == null) {
            return;
        }
        c1730i1.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
