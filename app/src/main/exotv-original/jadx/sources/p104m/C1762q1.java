package p104m;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.q1 */
/* loaded from: classes.dex */
public final class C1762q1 extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ C1772t1 f6714a;

    public C1762q1(C1772t1 c1772t1) {
        this.f6714a = c1772t1;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C1772t1 c1772t1 = this.f6714a;
        if (c1772t1.f6760I.isShowing()) {
            c1772t1.mo3275f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f6714a.dismiss();
    }
}
