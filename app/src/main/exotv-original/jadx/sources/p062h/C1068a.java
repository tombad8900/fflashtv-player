package p062h;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.a */
/* loaded from: classes.dex */
public final class C1068a implements AdapterView.OnItemClickListener {

    /* renamed from: j */
    public final /* synthetic */ C1076e f4496j;

    /* renamed from: k */
    public final /* synthetic */ C1070b f4497k;

    public C1068a(C1070b c1070b, C1076e c1076e) {
        this.f4497k = c1070b;
        this.f4496j = c1076e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C1070b c1070b = this.f4497k;
        DialogInterface.OnClickListener onClickListener = c1070b.f4517l;
        C1076e c1076e = this.f4496j;
        onClickListener.onClick(c1076e.f4535b, i);
        if (c1070b.f4519n) {
            return;
        }
        c1076e.f4535b.dismiss();
    }
}
