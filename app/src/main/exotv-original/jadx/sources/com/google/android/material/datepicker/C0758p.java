package com.google.android.material.datepicker;

import android.view.View;
import p037e0.C0851b;
import p063h1.C1132w;
import p064h2.InterfaceC1138c;
import p071i1.C1224c;
import p105m0.C1844r1;
import p105m0.InterfaceC1833o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: classes.dex */
public final class C0758p implements InterfaceC1833o, InterfaceC1138c {

    /* renamed from: j */
    public final int f3275j;

    /* renamed from: k */
    public final int f3276k;

    /* renamed from: l */
    public int f3277l;

    /* renamed from: m */
    public int f3278m;

    /* renamed from: n */
    public final Object f3279n;

    public C0758p(int i, int i4, int i8, int i9, int i10, byte[] bArr) {
        this.f3275j = i4;
        this.f3276k = i8;
        this.f3277l = i9;
        this.f3278m = i10;
        this.f3279n = bArr;
    }

    @Override // p064h2.InterfaceC1138c
    /* renamed from: a */
    public int mo1856a() {
        return -1;
    }

    @Override // p064h2.InterfaceC1138c
    /* renamed from: b */
    public int mo1857b() {
        return this.f3275j;
    }

    @Override // p064h2.InterfaceC1138c
    /* renamed from: c */
    public int mo1858c() {
        C1132w c1132w = (C1132w) this.f3279n;
        int i = this.f3276k;
        if (i == 8) {
            return c1132w.m2535u();
        }
        if (i == 16) {
            return c1132w.m2507A();
        }
        int i4 = this.f3277l;
        this.f3277l = i4 + 1;
        if (i4 % 2 != 0) {
            return this.f3278m & 15;
        }
        int iM2535u = c1132w.m2535u();
        this.f3278m = iM2535u;
        return (iM2535u & 240) >> 4;
    }

    @Override // p105m0.InterfaceC1833o
    /* renamed from: p */
    public C1844r1 mo649p(View view, C1844r1 c1844r1) {
        View view2 = (View) this.f3279n;
        C0851b c0851bMo3563f = c1844r1.f6934a.mo3563f(519);
        int i = this.f3275j;
        if (i >= 0) {
            view2.getLayoutParams().height = i + c0851bMo3563f.f3770b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f3276k + c0851bMo3563f.f3769a, this.f3277l + c0851bMo3563f.f3770b, this.f3278m + c0851bMo3563f.f3771c, view2.getPaddingBottom());
        return c1844r1;
    }

    public C0758p(View view, int i, int i4, int i8, int i9) {
        this.f3275j = i;
        this.f3279n = view;
        this.f3276k = i4;
        this.f3277l = i8;
        this.f3278m = i9;
    }

    public C0758p(C1224c c1224c) {
        C1132w c1132w = c1224c.f5112c;
        this.f3279n = c1132w;
        c1132w.m2513G(12);
        this.f3276k = c1132w.m2539y() & 255;
        this.f3275j = c1132w.m2539y();
    }
}
