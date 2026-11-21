package p174u;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u.f */
/* loaded from: classes.dex */
public final class C2444f {

    /* renamed from: a */
    public int f8910a;

    /* renamed from: d */
    public C2441c f8913d;

    /* renamed from: e */
    public C2441c f8914e;

    /* renamed from: f */
    public C2441c f8915f;

    /* renamed from: g */
    public C2441c f8916g;

    /* renamed from: h */
    public int f8917h;

    /* renamed from: i */
    public int f8918i;

    /* renamed from: j */
    public int f8919j;

    /* renamed from: k */
    public int f8920k;

    /* renamed from: q */
    public int f8926q;

    /* renamed from: r */
    public final /* synthetic */ C2445g f8927r;

    /* renamed from: b */
    public C2442d f8911b = null;

    /* renamed from: c */
    public int f8912c = 0;

    /* renamed from: l */
    public int f8921l = 0;

    /* renamed from: m */
    public int f8922m = 0;

    /* renamed from: n */
    public int f8923n = 0;

    /* renamed from: o */
    public int f8924o = 0;

    /* renamed from: p */
    public int f8925p = 0;

    public C2444f(C2445g c2445g, int i, C2441c c2441c, C2441c c2441c2, C2441c c2441c3, C2441c c2441c4, int i4) {
        this.f8927r = c2445g;
        this.f8910a = i;
        this.f8913d = c2441c;
        this.f8914e = c2441c2;
        this.f8915f = c2441c3;
        this.f8916g = c2441c4;
        this.f8917h = c2445g.f8960w0;
        this.f8918i = c2445g.f8956s0;
        this.f8919j = c2445g.f8961x0;
        this.f8920k = c2445g.f8957t0;
        this.f8926q = i4;
    }

    /* renamed from: a */
    public final void m4412a(C2442d c2442d) {
        int i = this.f8910a;
        C2445g c2445g = this.f8927r;
        if (i == 0) {
            int iM4420U = c2445g.m4420U(c2442d, this.f8926q);
            if (c2442d.f8877p0[0] == 3) {
                this.f8925p++;
                iM4420U = 0;
            }
            this.f8921l = iM4420U + (c2442d.f8859g0 != 8 ? c2445g.f8943P0 : 0) + this.f8921l;
            int iM4419T = c2445g.m4419T(c2442d, this.f8926q);
            if (this.f8911b == null || this.f8912c < iM4419T) {
                this.f8911b = c2442d;
                this.f8912c = iM4419T;
                this.f8922m = iM4419T;
            }
        } else {
            int iM4420U2 = c2445g.m4420U(c2442d, this.f8926q);
            int iM4419T2 = c2445g.m4419T(c2442d, this.f8926q);
            if (c2442d.f8877p0[1] == 3) {
                this.f8925p++;
                iM4419T2 = 0;
            }
            this.f8922m = iM4419T2 + (c2442d.f8859g0 != 8 ? c2445g.f8944Q0 : 0) + this.f8922m;
            if (this.f8911b == null || this.f8912c < iM4420U2) {
                this.f8911b = c2442d;
                this.f8912c = iM4420U2;
                this.f8921l = iM4420U2;
            }
        }
        this.f8924o++;
    }

    /* renamed from: b */
    public final void m4413b(int i, boolean z7, boolean z8) {
        C2445g c2445g;
        int i4;
        int i8;
        C2442d c2442d;
        boolean z9;
        int i9;
        int i10;
        char c8;
        float f8;
        float f9;
        float f10;
        int i11;
        float f11;
        float f12;
        int i12;
        int i13 = this.f8924o;
        int i14 = 0;
        while (true) {
            c2445g = this.f8927r;
            if (i14 >= i13 || (i12 = this.f8923n + i14) >= c2445g.f8955b1) {
                break;
            }
            C2442d c2442d2 = c2445g.f8954a1[i12];
            if (c2442d2 != null) {
                c2442d2.m4372D();
            }
            i14++;
        }
        if (i13 == 0 || this.f8911b == null) {
            return;
        }
        boolean z10 = z8 && i == 0;
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = this.f8923n + (z7 ? (i13 - 1) - i17 : i17);
            if (i18 >= c2445g.f8955b1) {
                break;
            }
            C2442d c2442d3 = c2445g.f8954a1[i18];
            if (c2442d3 != null && c2442d3.f8859g0 == 0) {
                if (i15 == -1) {
                    i15 = i17;
                }
                i16 = i17;
            }
        }
        if (this.f8910a == 0) {
            C2442d c2442d4 = this.f8911b;
            c2442d4.f8865j0 = c2445g.f8932E0;
            C2441c c2441c = c2442d4.f8831L;
            C2441c c2441c2 = c2442d4.f8829J;
            int i19 = this.f8918i;
            if (i > 0) {
                i19 += c2445g.f8944Q0;
            }
            c2441c2.m4355a(this.f8914e, i19);
            if (z8) {
                c2441c.m4355a(this.f8916g, this.f8920k);
            }
            if (i > 0) {
                this.f8914e.f8814d.f8831L.m4355a(c2441c2, 0);
            }
            if (c2445g.f8946S0 != 3 || c2442d4.f8824E) {
                c2442d = c2442d4;
            } else {
                for (int i20 = 0; i20 < i13; i20++) {
                    int i21 = this.f8923n + (z7 ? (i13 - 1) - i20 : i20);
                    if (i21 >= c2445g.f8955b1) {
                        break;
                    }
                    c2442d = c2445g.f8954a1[i21];
                    if (c2442d.f8824E) {
                        break;
                    }
                }
                c2442d = c2442d4;
            }
            int i22 = 0;
            C2442d c2442d5 = null;
            while (i22 < i13) {
                int i23 = z7 ? (i13 - 1) - i22 : i22;
                int i24 = this.f8923n + i23;
                if (i24 >= c2445g.f8955b1) {
                    return;
                }
                C2442d c2442d6 = c2445g.f8954a1[i24];
                if (c2442d6 == null) {
                    i10 = i13;
                    z9 = z10;
                    i9 = i16;
                    c8 = 3;
                } else {
                    C2441c c2441c3 = c2442d6.f8831L;
                    C2441c c2441c4 = c2442d6.f8829J;
                    C2441c c2441c5 = c2442d6.f8828I;
                    z9 = z10;
                    if (i22 == 0) {
                        i9 = i16;
                        c2442d6.m4387f(c2441c5, this.f8913d, this.f8917h);
                    } else {
                        i9 = i16;
                    }
                    if (i23 == 0) {
                        int i25 = c2445g.f8931D0;
                        if (z7) {
                            f8 = 1.0f;
                            f9 = 1.0f - c2445g.f8937J0;
                        } else {
                            f8 = 1.0f;
                            f9 = c2445g.f8937J0;
                        }
                        if (this.f8923n == 0) {
                            i11 = c2445g.f8933F0;
                            f10 = f9;
                            if (i11 != -1) {
                                if (z7) {
                                    f12 = c2445g.f8939L0;
                                    f11 = f8 - f12;
                                    c2442d6.f8863i0 = i11;
                                    c2442d6.f8853d0 = f11;
                                } else {
                                    f11 = c2445g.f8939L0;
                                    c2442d6.f8863i0 = i11;
                                    c2442d6.f8853d0 = f11;
                                }
                            }
                        } else {
                            f10 = f9;
                        }
                        if (!z8 || (i11 = c2445g.f8935H0) == -1) {
                            i11 = i25;
                            f11 = f10;
                        } else if (z7) {
                            f12 = c2445g.f8941N0;
                            f11 = f8 - f12;
                        } else {
                            f11 = c2445g.f8941N0;
                        }
                        c2442d6.f8863i0 = i11;
                        c2442d6.f8853d0 = f11;
                    }
                    if (i22 == i13 - 1) {
                        i10 = i13;
                        c2442d6.m4387f(c2442d6.f8830K, this.f8915f, this.f8919j);
                    } else {
                        i10 = i13;
                    }
                    if (c2442d5 != null) {
                        C2441c c2441c6 = c2442d5.f8830K;
                        c2441c5.m4355a(c2441c6, c2445g.f8943P0);
                        if (i22 == i15) {
                            int i26 = this.f8917h;
                            if (c2441c5.m4362h()) {
                                c2441c5.f8818h = i26;
                            }
                        }
                        c2441c6.m4355a(c2441c5, 0);
                        if (i22 == i9 + 1) {
                            int i27 = this.f8919j;
                            if (c2441c6.m4362h()) {
                                c2441c6.f8818h = i27;
                            }
                        }
                    }
                    if (c2442d6 != c2442d4) {
                        int i28 = c2445g.f8946S0;
                        c8 = 3;
                        if (i28 == 3 && c2442d.f8824E && c2442d6 != c2442d && c2442d6.f8824E) {
                            c2442d6.f8832M.m4355a(c2442d.f8832M, 0);
                        } else if (i28 == 0) {
                            c2441c4.m4355a(c2441c2, 0);
                        } else if (i28 == 1) {
                            c2441c3.m4355a(c2441c, 0);
                        } else if (z9) {
                            c2441c4.m4355a(this.f8914e, this.f8918i);
                            c2441c3.m4355a(this.f8916g, this.f8920k);
                        } else {
                            c2441c4.m4355a(c2441c2, 0);
                            c2441c3.m4355a(c2441c, 0);
                        }
                    } else {
                        c8 = 3;
                    }
                    c2442d5 = c2442d6;
                }
                i22++;
                z10 = z9;
                i16 = i9;
                i13 = i10;
            }
            return;
        }
        int i29 = i13;
        boolean z11 = z10;
        int i30 = i16;
        C2442d c2442d7 = this.f8911b;
        c2442d7.f8863i0 = c2445g.f8931D0;
        C2441c c2441c7 = c2442d7.f8828I;
        C2441c c2441c8 = c2442d7.f8830K;
        int i31 = this.f8917h;
        if (i > 0) {
            i31 += c2445g.f8943P0;
        }
        if (z7) {
            c2441c8.m4355a(this.f8915f, i31);
            if (z8) {
                c2441c7.m4355a(this.f8913d, this.f8919j);
            }
            if (i > 0) {
                this.f8915f.f8814d.f8828I.m4355a(c2441c8, 0);
            }
        } else {
            c2441c7.m4355a(this.f8913d, i31);
            if (z8) {
                c2441c8.m4355a(this.f8915f, this.f8919j);
            }
            if (i > 0) {
                this.f8913d.f8814d.f8830K.m4355a(c2441c7, 0);
            }
        }
        int i32 = 0;
        C2442d c2442d8 = null;
        while (true) {
            int i33 = i29;
            if (i32 >= i33 || (i4 = this.f8923n + i32) >= c2445g.f8955b1) {
                return;
            }
            C2442d c2442d9 = c2445g.f8954a1[i4];
            if (c2442d9 == null) {
                i29 = i33;
            } else {
                C2441c c2441c9 = c2442d9.f8829J;
                C2441c c2441c10 = c2442d9.f8830K;
                C2441c c2441c11 = c2442d9.f8828I;
                if (i32 == 0) {
                    c2442d9.m4387f(c2441c9, this.f8914e, this.f8918i);
                    int i34 = c2445g.f8932E0;
                    float f13 = c2445g.f8938K0;
                    if (this.f8923n == 0) {
                        int i35 = c2445g.f8934G0;
                        i29 = i33;
                        i8 = -1;
                        if (i35 != -1) {
                            f13 = c2445g.f8940M0;
                        }
                        i34 = i35;
                        c2442d9.f8865j0 = i34;
                        c2442d9.f8855e0 = f13;
                    } else {
                        i29 = i33;
                        i8 = -1;
                    }
                    if (z8 && (i35 = c2445g.f8936I0) != i8) {
                        f13 = c2445g.f8942O0;
                        i34 = i35;
                    }
                    c2442d9.f8865j0 = i34;
                    c2442d9.f8855e0 = f13;
                } else {
                    i29 = i33;
                }
                if (i32 == i29 - 1) {
                    c2442d9.m4387f(c2442d9.f8831L, this.f8916g, this.f8920k);
                }
                if (c2442d8 != null) {
                    C2441c c2441c12 = c2442d8.f8831L;
                    c2441c9.m4355a(c2441c12, c2445g.f8944Q0);
                    if (i32 == i15) {
                        int i36 = this.f8918i;
                        if (c2441c9.m4362h()) {
                            c2441c9.f8818h = i36;
                        }
                    }
                    c2441c12.m4355a(c2441c9, 0);
                    if (i32 == i30 + 1) {
                        int i37 = this.f8920k;
                        if (c2441c12.m4362h()) {
                            c2441c12.f8818h = i37;
                        }
                    }
                }
                if (c2442d9 == c2442d7) {
                    c2442d8 = c2442d9;
                } else if (z7) {
                    int i38 = c2445g.f8945R0;
                    if (i38 == 0) {
                        c2441c10.m4355a(c2441c8, 0);
                    } else if (i38 == 1) {
                        c2441c11.m4355a(c2441c7, 0);
                    } else if (i38 == 2) {
                        c2441c11.m4355a(c2441c7, 0);
                        c2441c10.m4355a(c2441c8, 0);
                    }
                    c2442d8 = c2442d9;
                } else {
                    int i39 = c2445g.f8945R0;
                    if (i39 == 0) {
                        c2441c11.m4355a(c2441c7, 0);
                    } else if (i39 == 1) {
                        c2441c10.m4355a(c2441c8, 0);
                    } else if (i39 == 2) {
                        if (z11) {
                            c2441c11.m4355a(this.f8913d, this.f8917h);
                            c2441c10.m4355a(this.f8915f, this.f8919j);
                        } else {
                            c2441c11.m4355a(c2441c7, 0);
                            c2441c10.m4355a(c2441c8, 0);
                        }
                    }
                    c2442d8 = c2442d9;
                }
            }
            i32++;
        }
    }

    /* renamed from: c */
    public final int m4414c() {
        return this.f8910a == 1 ? this.f8922m - this.f8927r.f8944Q0 : this.f8922m;
    }

    /* renamed from: d */
    public final int m4415d() {
        return this.f8910a == 0 ? this.f8921l - this.f8927r.f8943P0 : this.f8921l;
    }

    /* renamed from: e */
    public final void m4416e(int i) {
        C2445g c2445g;
        int i4;
        int i8 = this.f8925p;
        if (i8 == 0) {
            return;
        }
        int i9 = this.f8924o;
        int i10 = i / i8;
        int i11 = 0;
        while (true) {
            c2445g = this.f8927r;
            if (i11 >= i9 || (i4 = this.f8923n + i11) >= c2445g.f8955b1) {
                break;
            }
            C2442d c2442d = c2445g.f8954a1[i4];
            if (this.f8910a == 0) {
                if (c2442d != null) {
                    int[] iArr = c2442d.f8877p0;
                    if (iArr[0] == 3 && c2442d.f8879r == 0) {
                        c2445g.m4421V(1, i10, iArr[1], c2442d.m4392k(), c2442d);
                    }
                }
            } else if (c2442d != null) {
                int[] iArr2 = c2442d.f8877p0;
                if (iArr2[1] == 3 && c2442d.f8880s == 0) {
                    int i12 = i10;
                    c2445g.m4421V(iArr2[0], c2442d.m4396q(), 1, i12, c2442d);
                    i10 = i12;
                }
            }
            i11++;
        }
        this.f8921l = 0;
        this.f8922m = 0;
        this.f8911b = null;
        this.f8912c = 0;
        int i13 = this.f8924o;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = this.f8923n + i14;
            if (i15 >= c2445g.f8955b1) {
                return;
            }
            C2442d c2442d2 = c2445g.f8954a1[i15];
            if (this.f8910a == 0) {
                int iM4396q = c2442d2.m4396q();
                int i16 = c2445g.f8943P0;
                if (c2442d2.f8859g0 == 8) {
                    i16 = 0;
                }
                this.f8921l = iM4396q + i16 + this.f8921l;
                int iM4419T = c2445g.m4419T(c2442d2, this.f8926q);
                if (this.f8911b == null || this.f8912c < iM4419T) {
                    this.f8911b = c2442d2;
                    this.f8912c = iM4419T;
                    this.f8922m = iM4419T;
                }
            } else {
                int iM4420U = c2445g.m4420U(c2442d2, this.f8926q);
                int iM4419T2 = c2445g.m4419T(c2442d2, this.f8926q);
                int i17 = c2445g.f8944Q0;
                if (c2442d2.f8859g0 == 8) {
                    i17 = 0;
                }
                this.f8922m = iM4419T2 + i17 + this.f8922m;
                if (this.f8911b == null || this.f8912c < iM4420U) {
                    this.f8911b = c2442d2;
                    this.f8912c = iM4420U;
                    this.f8921l = iM4420U;
                }
            }
        }
    }

    /* renamed from: f */
    public final void m4417f(int i, C2441c c2441c, C2441c c2441c2, C2441c c2441c3, C2441c c2441c4, int i4, int i8, int i9, int i10, int i11) {
        this.f8910a = i;
        this.f8913d = c2441c;
        this.f8914e = c2441c2;
        this.f8915f = c2441c3;
        this.f8916g = c2441c4;
        this.f8917h = i4;
        this.f8918i = i8;
        this.f8919j = i9;
        this.f8920k = i10;
        this.f8926q = i11;
    }
}
