package p174u;

import java.util.ArrayList;
import p156s.C2330c;
import p182v.C2487b;
import p199x.C2719f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u.g */
/* loaded from: classes.dex */
public final class C2445g extends AbstractC2447i {

    /* renamed from: A0 */
    public int f8928A0;

    /* renamed from: B0 */
    public C2487b f8929B0;

    /* renamed from: C0 */
    public C2719f f8930C0;

    /* renamed from: D0 */
    public int f8931D0;

    /* renamed from: E0 */
    public int f8932E0;

    /* renamed from: F0 */
    public int f8933F0;

    /* renamed from: G0 */
    public int f8934G0;

    /* renamed from: H0 */
    public int f8935H0;

    /* renamed from: I0 */
    public int f8936I0;

    /* renamed from: J0 */
    public float f8937J0;

    /* renamed from: K0 */
    public float f8938K0;

    /* renamed from: L0 */
    public float f8939L0;

    /* renamed from: M0 */
    public float f8940M0;

    /* renamed from: N0 */
    public float f8941N0;

    /* renamed from: O0 */
    public float f8942O0;

    /* renamed from: P0 */
    public int f8943P0;

    /* renamed from: Q0 */
    public int f8944Q0;

    /* renamed from: R0 */
    public int f8945R0;

    /* renamed from: S0 */
    public int f8946S0;

    /* renamed from: T0 */
    public int f8947T0;

    /* renamed from: U0 */
    public int f8948U0;

    /* renamed from: V0 */
    public int f8949V0;

    /* renamed from: W0 */
    public ArrayList f8950W0;

    /* renamed from: X0 */
    public C2442d[] f8951X0;

    /* renamed from: Y0 */
    public C2442d[] f8952Y0;

    /* renamed from: Z0 */
    public int[] f8953Z0;

    /* renamed from: a1 */
    public C2442d[] f8954a1;

    /* renamed from: b1 */
    public int f8955b1;

    /* renamed from: s0 */
    public int f8956s0;

    /* renamed from: t0 */
    public int f8957t0;

    /* renamed from: u0 */
    public int f8958u0;

    /* renamed from: v0 */
    public int f8959v0;

    /* renamed from: w0 */
    public int f8960w0;

    /* renamed from: x0 */
    public int f8961x0;

    /* renamed from: y0 */
    public boolean f8962y0;

    /* renamed from: z0 */
    public int f8963z0;

    @Override // p174u.AbstractC2447i
    /* renamed from: S */
    public final void mo4418S() {
        for (int i = 0; i < this.f8971r0; i++) {
            C2442d c2442d = this.f8970q0[i];
            if (c2442d != null) {
                c2442d.f8825F = true;
            }
        }
    }

    /* renamed from: T */
    public final int m4419T(C2442d c2442d, int i) {
        C2442d c2442d2;
        if (c2442d != null) {
            int[] iArr = c2442d.f8877p0;
            if (iArr[1] == 3) {
                int i4 = c2442d.f8880s;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int i8 = (int) (c2442d.f8887z * i);
                        if (i8 != c2442d.m4392k()) {
                            c2442d.f8858g = true;
                            m4421V(iArr[0], c2442d.m4396q(), 1, i8, c2442d);
                        }
                        return i8;
                    }
                    c2442d2 = c2442d;
                    if (i4 == 1) {
                        return c2442d2.m4392k();
                    }
                    if (i4 == 3) {
                        return (int) ((c2442d2.m4396q() * c2442d2.f8842W) + 0.5f);
                    }
                }
            } else {
                c2442d2 = c2442d;
            }
            return c2442d2.m4392k();
        }
        return 0;
    }

    /* renamed from: U */
    public final int m4420U(C2442d c2442d, int i) {
        C2442d c2442d2;
        if (c2442d != null) {
            int[] iArr = c2442d.f8877p0;
            if (iArr[0] == 3) {
                int i4 = c2442d.f8879r;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int i8 = (int) (c2442d.f8884w * i);
                        if (i8 != c2442d.m4396q()) {
                            c2442d.f8858g = true;
                            m4421V(1, i8, iArr[1], c2442d.m4392k(), c2442d);
                        }
                        return i8;
                    }
                    c2442d2 = c2442d;
                    if (i4 == 1) {
                        return c2442d2.m4396q();
                    }
                    if (i4 == 3) {
                        return (int) ((c2442d2.m4392k() * c2442d2.f8842W) + 0.5f);
                    }
                }
            } else {
                c2442d2 = c2442d;
            }
            return c2442d2.m4396q();
        }
        return 0;
    }

    /* renamed from: V */
    public final void m4421V(int i, int i4, int i8, int i9, C2442d c2442d) {
        C2719f c2719f;
        C2442d c2442d2;
        C2487b c2487b = this.f8929B0;
        while (true) {
            c2719f = this.f8930C0;
            if (c2719f != null || (c2442d2 = this.f8839T) == null) {
                break;
            } else {
                this.f8930C0 = ((C2443e) c2442d2).f8904u0;
            }
        }
        c2487b.f9076a = i;
        c2487b.f9077b = i8;
        c2487b.f9078c = i4;
        c2487b.f9079d = i9;
        c2719f.m4786b(c2442d, c2487b);
        c2442d.m4381O(c2487b.f9080e);
        c2442d.m4378L(c2487b.f9081f);
        c2442d.f8824E = c2487b.f9083h;
        c2442d.m4375I(c2487b.f9082g);
    }

    @Override // p174u.C2442d
    /* renamed from: b */
    public final void mo4353b(C2330c c2330c, boolean z7) {
        C2442d c2442d;
        float f8;
        int i;
        ArrayList arrayList = this.f8950W0;
        super.mo4353b(c2330c, z7);
        C2442d c2442d2 = this.f8839T;
        boolean z8 = c2442d2 != null && ((C2443e) c2442d2).f8905v0;
        int i4 = this.f8947T0;
        if (i4 != 0) {
            if (i4 == 1) {
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    ((C2444f) arrayList.get(i8)).m4413b(i8, z8, i8 == size + (-1));
                    i8++;
                }
            } else if (i4 != 2) {
                if (i4 == 3) {
                    int size2 = arrayList.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        ((C2444f) arrayList.get(i9)).m4413b(i9, z8, i9 == size2 + (-1));
                        i9++;
                    }
                }
            } else if (this.f8953Z0 != null && this.f8952Y0 != null && this.f8951X0 != null) {
                for (int i10 = 0; i10 < this.f8955b1; i10++) {
                    this.f8954a1[i10].m4372D();
                }
                int[] iArr = this.f8953Z0;
                int i11 = iArr[0];
                int i12 = iArr[1];
                float f9 = this.f8937J0;
                C2442d c2442d3 = null;
                int i13 = 0;
                while (i13 < i11) {
                    if (z8) {
                        i = (i11 - i13) - 1;
                        f8 = 1.0f - this.f8937J0;
                    } else {
                        f8 = f9;
                        i = i13;
                    }
                    C2442d c2442d4 = this.f8952Y0[i];
                    if (c2442d4 != null) {
                        C2441c c2441c = c2442d4.f8828I;
                        if (c2442d4.f8859g0 != 8) {
                            if (i13 == 0) {
                                c2442d4.m4387f(c2441c, this.f8828I, this.f8960w0);
                                c2442d4.f8863i0 = this.f8931D0;
                                c2442d4.f8853d0 = f8;
                            }
                            if (i13 == i11 - 1) {
                                c2442d4.m4387f(c2442d4.f8830K, this.f8830K, this.f8961x0);
                            }
                            if (i13 > 0 && c2442d3 != null) {
                                C2441c c2441c2 = c2442d3.f8830K;
                                c2442d4.m4387f(c2441c, c2441c2, this.f8943P0);
                                c2442d3.m4387f(c2441c2, c2441c, 0);
                            }
                            c2442d3 = c2442d4;
                        }
                    }
                    i13++;
                    f9 = f8;
                }
                for (int i14 = 0; i14 < i12; i14++) {
                    C2442d c2442d5 = this.f8951X0[i14];
                    if (c2442d5 != null) {
                        C2441c c2441c3 = c2442d5.f8829J;
                        if (c2442d5.f8859g0 != 8) {
                            if (i14 == 0) {
                                c2442d5.m4387f(c2441c3, this.f8829J, this.f8956s0);
                                c2442d5.f8865j0 = this.f8932E0;
                                c2442d5.f8855e0 = this.f8938K0;
                            }
                            if (i14 == i12 - 1) {
                                c2442d5.m4387f(c2442d5.f8831L, this.f8831L, this.f8957t0);
                            }
                            if (i14 > 0 && c2442d3 != null) {
                                C2441c c2441c4 = c2442d3.f8831L;
                                c2442d5.m4387f(c2441c3, c2441c4, this.f8944Q0);
                                c2442d3.m4387f(c2441c4, c2441c3, 0);
                            }
                            c2442d3 = c2442d5;
                        }
                    }
                }
                for (int i15 = 0; i15 < i11; i15++) {
                    for (int i16 = 0; i16 < i12; i16++) {
                        int i17 = (i16 * i11) + i15;
                        if (this.f8949V0 == 1) {
                            i17 = (i15 * i12) + i16;
                        }
                        C2442d[] c2442dArr = this.f8954a1;
                        if (i17 < c2442dArr.length && (c2442d = c2442dArr[i17]) != null && c2442d.f8859g0 != 8) {
                            C2442d c2442d6 = this.f8952Y0[i15];
                            C2442d c2442d7 = this.f8951X0[i16];
                            if (c2442d != c2442d6) {
                                c2442d.m4387f(c2442d.f8828I, c2442d6.f8828I, 0);
                                c2442d.m4387f(c2442d.f8830K, c2442d6.f8830K, 0);
                            }
                            if (c2442d != c2442d7) {
                                c2442d.m4387f(c2442d.f8829J, c2442d7.f8829J, 0);
                                c2442d.m4387f(c2442d.f8831L, c2442d7.f8831L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C2444f) arrayList.get(0)).m4413b(0, z8, true);
        }
        this.f8962y0 = false;
    }
}
