package p168t2;

import p063h1.AbstractC1118i0;
import p063h1.C1108d0;
import p063h1.C1132w;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.d0 */
/* loaded from: classes.dex */
public final class C2405d0 implements InterfaceC2413h0 {

    /* renamed from: a */
    public final InterfaceC2403c0 f8495a;

    /* renamed from: b */
    public final C1132w f8496b = new C1132w(32);

    /* renamed from: c */
    public int f8497c;

    /* renamed from: d */
    public int f8498d;

    /* renamed from: e */
    public boolean f8499e;

    /* renamed from: f */
    public boolean f8500f;

    public C2405d0(InterfaceC2403c0 interfaceC2403c0) {
        this.f8495a = interfaceC2403c0;
    }

    @Override // p168t2.InterfaceC2413h0
    /* renamed from: a */
    public final void mo4250a(C1132w c1132w, int i) {
        boolean z7 = (i & 1) != 0;
        int iM2535u = z7 ? c1132w.f4800b + c1132w.m2535u() : -1;
        if (this.f8500f) {
            if (!z7) {
                return;
            }
            this.f8500f = false;
            c1132w.m2513G(iM2535u);
            this.f8498d = 0;
        }
        while (c1132w.m2515a() > 0) {
            int i4 = this.f8498d;
            C1132w c1132w2 = this.f8496b;
            if (i4 < 3) {
                if (i4 == 0) {
                    int iM2535u2 = c1132w.m2535u();
                    c1132w.m2513G(c1132w.f4800b - 1);
                    if (iM2535u2 == 255) {
                        this.f8500f = true;
                        return;
                    }
                }
                int iMin = Math.min(c1132w.m2515a(), 3 - this.f8498d);
                c1132w.m2519e(c1132w2.f4799a, this.f8498d, iMin);
                int i8 = this.f8498d + iMin;
                this.f8498d = i8;
                if (i8 == 3) {
                    c1132w2.m2513G(0);
                    c1132w2.m2512F(3);
                    c1132w2.m2514H(1);
                    int iM2535u3 = c1132w2.m2535u();
                    int iM2535u4 = c1132w2.m2535u();
                    this.f8499e = (iM2535u3 & 128) != 0;
                    int i9 = (((iM2535u3 & 15) << 8) | iM2535u4) + 3;
                    this.f8497c = i9;
                    byte[] bArr = c1132w2.f4799a;
                    if (bArr.length < i9) {
                        c1132w2.m2516b(Math.min(4098, Math.max(i9, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c1132w.m2515a(), this.f8497c - this.f8498d);
                c1132w.m2519e(c1132w2.f4799a, this.f8498d, iMin2);
                int i10 = this.f8498d + iMin2;
                this.f8498d = i10;
                int i11 = this.f8497c;
                if (i10 != i11) {
                    continue;
                } else {
                    if (!this.f8499e) {
                        c1132w2.m2512F(i11);
                    } else {
                        if (AbstractC1118i0.m2456o(0, i11, -1, c1132w2.f4799a) != 0) {
                            this.f8500f = true;
                            return;
                        }
                        c1132w2.m2512F(this.f8497c - 4);
                    }
                    c1132w2.m2513G(0);
                    this.f8495a.mo279a(c1132w2);
                    this.f8498d = 0;
                }
            }
        }
    }

    @Override // p168t2.InterfaceC2413h0
    /* renamed from: b */
    public final void mo4251b(C1108d0 c1108d0, InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
        this.f8495a.mo280b(c1108d0, interfaceC1989p, c2411g0);
        this.f8500f = true;
    }

    @Override // p168t2.InterfaceC2413h0
    /* renamed from: c */
    public final void mo4252c() {
        this.f8500f = true;
    }
}
