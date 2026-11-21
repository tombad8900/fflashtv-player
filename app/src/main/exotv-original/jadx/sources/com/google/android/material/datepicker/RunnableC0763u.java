package com.google.android.material.datepicker;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.u */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0763u implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ MaterialCalendarGridView f3318j;

    /* renamed from: k */
    public final /* synthetic */ int f3319k;

    public /* synthetic */ RunnableC0763u(C0766x c0766x, MaterialCalendarGridView materialCalendarGridView, int i) {
        this.f3318j = materialCalendarGridView;
        this.f3319k = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int iM1866a;
        MaterialCalendarGridView materialCalendarGridView = this.f3318j;
        if (!materialCalendarGridView.hasFocus() || (i = this.f3319k) == 0) {
            return;
        }
        C0762t c0762tM1842b = materialCalendarGridView.m1842b();
        if (i == 1) {
            iM1866a = c0762tM1842b.m1867b(c0762tM1842b.m1871f() + 1);
            if (iM1866a == -1) {
                iM1866a = c0762tM1842b.m1871f();
            }
        } else {
            iM1866a = c0762tM1842b.m1866a(c0762tM1842b.m1868c() - 1);
            if (iM1866a == -1) {
                iM1866a = c0762tM1842b.m1868c();
            }
        }
        materialCalendarGridView.setSelection(iM1866a);
    }
}
