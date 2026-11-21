package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p216z2.AbstractC2894i0;
import p216z2.C2917u;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes.dex */
public final class C0753k extends AbstractC2894i0 {

    /* renamed from: a */
    public final /* synthetic */ C0766x f3254a;

    /* renamed from: b */
    public final /* synthetic */ C0755m f3255b;

    public C0753k(C0755m c0755m, C0766x c0766x) {
        this.f3255b = c0755m;
        this.f3254a = c0766x;
    }

    @Override // p216z2.AbstractC2894i0
    /* renamed from: a */
    public final void mo1432a(RecyclerView recyclerView, int i) {
        C0755m c0755m;
        C2917u c2917u;
        int iM1143K;
        if (i != 0 || (c2917u = (c0755m = this.f3255b).f3271q0) == null) {
            return;
        }
        View viewMo1439d = c2917u.mo1439d((LinearLayoutManager) c0755m.f3264j0.getLayoutManager());
        if (viewMo1439d != null && (iM1143K = RecyclerView.m1143K(viewMo1439d)) != -1) {
            C0766x c0766x = this.f3254a;
            c0755m.f3260f0 = c0766x.m1872g(iM1143K);
            c0755m.f3269o0.setText(c0766x.m1872g(iM1143K).m1864c());
            c0755m.m1855N(iM1143K);
        }
        c0755m.m1854M();
    }

    @Override // p216z2.AbstractC2894i0
    /* renamed from: b */
    public final void mo1433b(RecyclerView recyclerView, int i, int i4) {
        C0755m c0755m = this.f3255b;
        int iM1109M0 = i < 0 ? ((LinearLayoutManager) c0755m.f3264j0.getLayoutManager()).m1109M0() : ((LinearLayoutManager) c0755m.f3264j0.getLayoutManager()).m1110N0();
        C2917u c2917u = c0755m.f3271q0;
        C0766x c0766x = this.f3254a;
        if (c2917u == null) {
            c0755m.f3260f0 = c0766x.m1872g(iM1109M0);
        }
        c0755m.f3269o0.setText(c0766x.m1872g(iM1109M0).m1864c());
        c0755m.m1855N(iM1109M0);
    }
}
