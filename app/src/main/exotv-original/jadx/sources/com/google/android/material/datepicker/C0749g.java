package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p216z2.C2912r0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes.dex */
public final class C0749g extends LinearLayoutManager {

    /* renamed from: E */
    public final /* synthetic */ int f3249E;

    /* renamed from: F */
    public final /* synthetic */ C0755m f3250F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0749g(C0755m c0755m, int i, int i4) {
        super(i);
        this.f3250F = c0755m;
        this.f3249E = i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: C0 */
    public final void mo1099C0(C2912r0 c2912r0, int[] iArr) {
        int i = this.f3249E;
        C0755m c0755m = this.f3250F;
        if (i == 0) {
            iArr[0] = c0755m.f3264j0.getWidth();
            iArr[1] = c0755m.f3264j0.getWidth();
        } else {
            iArr[0] = c0755m.f3264j0.getHeight();
            iArr[1] = c0755m.f3264j0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p216z2.AbstractC2888f0
    /* renamed from: z0 */
    public final void mo1141z0(RecyclerView recyclerView, int i) {
        C0768z c0768z = new C0768z(recyclerView.getContext());
        c0768z.f10803a = i;
        m4990A0(c0768z);
    }
}
