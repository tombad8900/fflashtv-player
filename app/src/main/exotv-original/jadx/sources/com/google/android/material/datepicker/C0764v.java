package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.v */
/* loaded from: classes.dex */
public final class C0764v implements AdapterView.OnItemClickListener {

    /* renamed from: j */
    public final /* synthetic */ MaterialCalendarGridView f3320j;

    /* renamed from: k */
    public final /* synthetic */ C0766x f3321k;

    public C0764v(C0766x c0766x, MaterialCalendarGridView materialCalendarGridView) {
        this.f3321k = c0766x;
        this.f3320j = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f3320j;
        C0762t c0762tM1842b = materialCalendarGridView.m1842b();
        if (i < c0762tM1842b.m1868c() || i > c0762tM1842b.m1871f()) {
            return;
        }
        if (materialCalendarGridView.m1842b().getItem(i).longValue() >= this.f3321k.f3325e.f3251a.f3259e0.f3230l.f3236j) {
            throw null;
        }
    }
}
