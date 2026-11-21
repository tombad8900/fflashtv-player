package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0747e implements View.OnClickListener {

    /* renamed from: j */
    public final /* synthetic */ int f3243j;

    /* renamed from: k */
    public final /* synthetic */ C0766x f3244k;

    /* renamed from: l */
    public final /* synthetic */ C0755m f3245l;

    public /* synthetic */ ViewOnClickListenerC0747e(C0755m c0755m, C0766x c0766x, int i) {
        this.f3243j = i;
        this.f3245l = c0755m;
        this.f3244k = c0766x;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3243j) {
            case 0:
                C0755m c0755m = this.f3245l;
                int iM1109M0 = ((LinearLayoutManager) c0755m.f3264j0.getLayoutManager()).m1109M0();
                C0766x c0766x = this.f3244k;
                c0766x.f3329i = 2;
                c0755m.m1851J(c0766x.m1872g(iM1109M0 + 1));
                break;
            default:
                C0755m c0755m2 = this.f3245l;
                int iM1110N0 = ((LinearLayoutManager) c0755m2.f3264j0.getLayoutManager()).m1110N0();
                C0766x c0766x2 = this.f3244k;
                c0766x2.f3329i = 1;
                c0755m2.m1851J(c0766x2.m1872g(iM1110N0 - 1));
                break;
        }
    }
}
