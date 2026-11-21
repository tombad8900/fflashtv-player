package p174u;

import java.util.ArrayList;
import p156s.C2329b;
import p156s.C2330c;
import p156s.C2335h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u.j */
/* loaded from: classes.dex */
public abstract class AbstractC2448j {

    /* renamed from: a */
    public static final boolean[] f8972a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:188:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4425a(C2443e c2443e, C2330c c2330c, ArrayList arrayList, int i) {
        int i4;
        C2440b[] c2440bArr;
        int i8;
        int i9;
        C2441c[] c2441cArr;
        boolean z7;
        C2442d c2442d;
        float f8;
        boolean z8;
        boolean z9;
        int i10;
        C2442d c2442d2;
        C2330c c2330c2;
        C2442d c2442d3;
        C2335h c2335h;
        C2441c c2441c;
        C2335h c2335h2;
        C2442d c2442d4;
        int i11;
        C2441c c2441c2;
        C2335h c2335h3;
        C2442d c2442d5;
        C2441c[] c2441cArr2;
        C2442d c2442d6;
        int i12;
        C2335h c2335h4;
        int size;
        ArrayList arrayList2;
        int i13;
        C2442d c2442d7;
        int i14;
        float f9;
        int i15;
        float f10;
        C2442d c2442d8;
        int i16;
        boolean z10;
        int i17;
        int i18;
        C2442d c2442d9;
        C2443e c2443e2 = c2443e;
        C2330c c2330c3 = c2330c;
        ArrayList arrayList3 = arrayList;
        if (i == 0) {
            i4 = c2443e2.f8909z0;
            c2440bArr = c2443e2.f8890C0;
            i8 = 0;
        } else {
            i4 = c2443e2.f8888A0;
            c2440bArr = c2443e2.f8889B0;
            i8 = 2;
        }
        int i19 = i4;
        C2440b[] c2440bArr2 = c2440bArr;
        int i20 = 0;
        while (i20 < i19) {
            C2440b c2440b = c2440bArr2[i20];
            boolean z11 = c2440b.f8810q;
            C2442d c2442d10 = c2440b.f8794a;
            C2441c[] c2441cArr3 = c2442d10.f8836Q;
            int i21 = 3;
            int i22 = 8;
            float f11 = 0.0f;
            if (z11) {
                i9 = i20;
            } else {
                int i23 = c2440b.f8805l;
                int i24 = i23 * 2;
                C2442d c2442d11 = c2442d10;
                C2442d c2442d12 = c2442d11;
                boolean z12 = false;
                while (!z12) {
                    c2440b.f8802i++;
                    C2442d[] c2442dArr = c2442d11.f8871m0;
                    C2441c[] c2441cArr4 = c2442d11.f8836Q;
                    c2442dArr[i23] = null;
                    c2442d11.f8869l0[i23] = null;
                    if (c2442d11.f8859g0 != i22) {
                        c2442d11.m4391j(i23);
                        c2441cArr4[i24].m4359e();
                        int i25 = i24 + 1;
                        c2441cArr4[i25].m4359e();
                        c2441cArr4[i24].m4359e();
                        c2441cArr4[i25].m4359e();
                        if (c2440b.f8795b == null) {
                            c2440b.f8795b = c2442d11;
                        }
                        c2440b.f8797d = c2442d11;
                        int i26 = c2442d11.f8877p0[i23];
                        if (i26 == i21) {
                            int i27 = c2442d11.f8881t[i23];
                            if (i27 == 0 || i27 == i21 || i27 == 2) {
                                c2440b.f8803j++;
                                float f12 = c2442d11.f8867k0[i23];
                                if (f12 > 0.0f) {
                                    i17 = i20;
                                    c2440b.f8804k += f12;
                                } else {
                                    i17 = i20;
                                }
                                i18 = i23;
                                if (c2442d11.f8859g0 != 8 && i26 == 3 && (i27 == 0 || i27 == 3)) {
                                    if (f12 < 0.0f) {
                                        c2440b.f8807n = true;
                                    } else {
                                        c2440b.f8808o = true;
                                    }
                                    if (c2440b.f8801h == null) {
                                        c2440b.f8801h = new ArrayList();
                                    }
                                    c2440b.f8801h.add(c2442d11);
                                }
                                if (c2440b.f8799f == null) {
                                    c2440b.f8799f = c2442d11;
                                }
                                C2442d c2442d13 = c2440b.f8800g;
                                if (c2442d13 != null) {
                                    c2442d13.f8869l0[i18] = c2442d11;
                                }
                                c2440b.f8800g = c2442d11;
                            } else {
                                i17 = i20;
                                i18 = i23;
                            }
                            if (i18 == 0) {
                                if (c2442d11.f8879r == 0 && c2442d11.f8882u == 0) {
                                    int i28 = c2442d11.f8883v;
                                }
                            } else if (c2442d11.f8880s == 0 && c2442d11.f8885x == 0) {
                                int i29 = c2442d11.f8886y;
                            }
                        } else {
                            i17 = i20;
                            i18 = i23;
                        }
                    }
                    C2442d c2442d14 = c2442d12;
                    if (c2442d14 != c2442d11) {
                        c2442d14.f8871m0[i18] = c2442d11;
                    }
                    C2441c c2441c3 = c2441cArr4[i24 + 1].f8816f;
                    if (c2441c3 != null) {
                        c2442d9 = c2441c3.f8814d;
                        C2441c c2441c4 = c2442d9.f8836Q[i24].f8816f;
                        if (c2441c4 == null || c2441c4.f8814d != c2442d11) {
                            c2442d9 = null;
                        }
                    }
                    if (c2442d9 == null) {
                        c2442d9 = c2442d11;
                        z12 = true;
                    }
                    c2442d12 = c2442d11;
                    i23 = i18;
                    i21 = 3;
                    i22 = 8;
                    c2442d11 = c2442d9;
                    i20 = i17;
                }
                i9 = i20;
                int i30 = i23;
                C2442d c2442d15 = c2440b.f8795b;
                if (c2442d15 != null) {
                    c2442d15.f8836Q[i24].m4359e();
                }
                C2442d c2442d16 = c2440b.f8797d;
                if (c2442d16 != null) {
                    c2442d16.f8836Q[i24 + 1].m4359e();
                }
                c2440b.f8796c = c2442d11;
                if (i30 == 0 && c2440b.f8806m) {
                    c2440b.f8798e = c2442d11;
                } else {
                    c2440b.f8798e = c2442d10;
                }
                c2440b.f8809p = c2440b.f8808o && c2440b.f8807n;
            }
            c2440b.f8810q = true;
            if (arrayList3 == null || arrayList3.contains(c2442d10)) {
                C2442d c2442d17 = c2440b.f8796c;
                C2442d c2442d18 = c2440b.f8795b;
                C2442d c2442d19 = c2440b.f8797d;
                C2442d c2442d20 = c2440b.f8798e;
                float f13 = c2440b.f8804k;
                int[] iArr = c2443e2.f8877p0;
                C2441c[] c2441cArr5 = c2443e2.f8836Q;
                boolean z13 = iArr[i] == 2;
                if (i == 0) {
                    int i31 = c2442d20.f8863i0;
                    boolean z14 = i31 == 0;
                    c2441cArr = c2441cArr3;
                    boolean z15 = i31 == 1;
                    z7 = i31 == 2;
                    c2442d = c2442d10;
                    f8 = f13;
                    z9 = z15;
                    z8 = z14;
                } else {
                    c2441cArr = c2441cArr3;
                    int i32 = c2442d20.f8865j0;
                    boolean z16 = i32 == 0;
                    boolean z17 = i32 == 1;
                    z7 = i32 == 2;
                    c2442d = c2442d10;
                    f8 = f13;
                    z8 = z16;
                    z9 = z17;
                }
                boolean z18 = false;
                while (!z18) {
                    C2441c[] c2441cArr6 = c2442d.f8836Q;
                    int[] iArr2 = c2442d.f8877p0;
                    C2441c c2441c5 = c2441cArr6[i8];
                    int i33 = z7 ? 1 : 4;
                    int iM4359e = c2441c5.m4359e();
                    boolean z19 = z13;
                    boolean z20 = z7;
                    boolean z21 = iArr2[i] == 3 && c2442d.f8881t[i] == 0;
                    C2441c c2441c6 = c2441c5.f8816f;
                    if (c2441c6 != null && c2442d != c2442d10) {
                        iM4359e = c2441c6.m4359e() + iM4359e;
                    }
                    int i34 = iM4359e;
                    if (z20 && c2442d != c2442d10 && c2442d != c2442d18) {
                        i33 = 8;
                    }
                    C2442d c2442d21 = c2442d10;
                    C2441c c2441c7 = c2441c5.f8816f;
                    if (c2441c7 != null) {
                        if (c2442d == c2442d18) {
                            z10 = z21;
                            c2330c3.m4131f(c2441c5.f8819i, c2441c7.f8819i, i34, 6);
                        } else {
                            z10 = z21;
                            c2330c3.m4131f(c2441c5.f8819i, c2441c7.f8819i, i34, 8);
                        }
                        if (z10 && !z20) {
                            i33 = 5;
                        }
                        c2330c3.m4130e(c2441c5.f8819i, c2441c5.f8816f.f8819i, i34, (c2442d == c2442d18 && z20 && c2442d.f8838S[i]) ? 5 : i33);
                    }
                    if (z19) {
                        if (c2442d.f8859g0 == 8 || iArr2[i] != 3) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                            c2330c3.m4131f(c2441cArr6[i8 + 1].f8819i, c2441cArr6[i8].f8819i, 0, 5);
                        }
                        c2330c3.m4131f(c2441cArr6[i8].f8819i, c2441cArr5[i8].f8819i, i16, 8);
                    }
                    C2441c c2441c8 = c2441cArr6[i8 + 1].f8816f;
                    if (c2441c8 != null) {
                        c2442d8 = c2441c8.f8814d;
                        C2441c c2441c9 = c2442d8.f8836Q[i8].f8816f;
                        if (c2441c9 == null || c2441c9.f8814d != c2442d) {
                            c2442d8 = null;
                        }
                    }
                    if (c2442d8 != null) {
                        c2442d = c2442d8;
                    } else {
                        z18 = true;
                    }
                    c2442d10 = c2442d21;
                    z13 = z19;
                    z7 = z20;
                }
                boolean z22 = z13;
                boolean z23 = z7;
                if (c2442d19 != null) {
                    int i35 = i8 + 1;
                    if (c2442d17.f8836Q[i35].f8816f != null) {
                        C2441c c2441c10 = c2442d19.f8836Q[i35];
                        if (c2442d19.f8877p0[i] == 3 && c2442d19.f8881t[i] == 0 && !z23) {
                            C2441c c2441c11 = c2441c10.f8816f;
                            if (c2441c11.f8814d == c2443e2) {
                                c2330c3.m4130e(c2441c10.f8819i, c2441c11.f8819i, -c2441c10.m4359e(), 5);
                            }
                            c2330c3.m4132g(c2441c10.f8819i, c2442d17.f8836Q[i35].f8816f.f8819i, -c2441c10.m4359e(), 6);
                        } else {
                            if (z23) {
                                C2441c c2441c12 = c2441c10.f8816f;
                                if (c2441c12.f8814d == c2443e2) {
                                    c2330c3.m4130e(c2441c10.f8819i, c2441c12.f8819i, -c2441c10.m4359e(), 4);
                                }
                            }
                            c2330c3.m4132g(c2441c10.f8819i, c2442d17.f8836Q[i35].f8816f.f8819i, -c2441c10.m4359e(), 6);
                        }
                    }
                }
                if (z22) {
                    int i36 = i8 + 1;
                    C2335h c2335h5 = c2441cArr5[i36].f8819i;
                    C2441c c2441c13 = c2442d17.f8836Q[i36];
                    c2330c3.m4131f(c2335h5, c2441c13.f8819i, c2441c13.m4359e(), 8);
                }
                ArrayList arrayList4 = c2440b.f8801h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (c2440b.f8807n && !c2440b.f8809p) {
                        f8 = c2440b.f8803j;
                    }
                    C2442d c2442d22 = null;
                    float f14 = 0.0f;
                    int i37 = 0;
                    while (i37 < size) {
                        C2442d c2442d23 = (C2442d) arrayList4.get(i37);
                        float[] fArr = c2442d23.f8867k0;
                        C2441c[] c2441cArr7 = c2442d23.f8836Q;
                        float f15 = fArr[i];
                        if (f15 >= f11) {
                            arrayList2 = arrayList4;
                            i13 = size;
                            if (f15 != f11) {
                                f10 = f14;
                                c2330c3.m4130e(c2441cArr7[i8 + 1].f8819i, c2441cArr7[i8].f8819i, 0, 8);
                                i14 = i37;
                                f9 = f11;
                                f14 = f10;
                                i15 = i19;
                            } else {
                                float f16 = f14;
                                if (c2442d22 != null) {
                                    C2441c[] c2441cArr8 = c2442d22.f8836Q;
                                    C2335h c2335h6 = c2441cArr8[i8].f8819i;
                                    int i38 = i8 + 1;
                                    C2335h c2335h7 = c2441cArr8[i38].f8819i;
                                    C2335h c2335h8 = c2441cArr7[i8].f8819i;
                                    C2335h c2335h9 = c2441cArr7[i38].f8819i;
                                    C2329b c2329bM4137l = c2330c3.m4137l();
                                    c2442d7 = c2442d23;
                                    float f17 = f11;
                                    c2329bM4137l.f8147b = f17;
                                    f9 = f17;
                                    if (f8 == f17 || f16 == f15) {
                                        i14 = i37;
                                        i15 = i19;
                                        c2329bM4137l.f8149d.m4114g(c2335h6, 1.0f);
                                        c2329bM4137l.f8149d.m4114g(c2335h7, -1.0f);
                                        c2329bM4137l.f8149d.m4114g(c2335h9, 1.0f);
                                        c2329bM4137l.f8149d.m4114g(c2335h8, -1.0f);
                                    } else {
                                        if (f16 == f9) {
                                            c2329bM4137l.f8149d.m4114g(c2335h6, 1.0f);
                                            c2329bM4137l.f8149d.m4114g(c2335h7, -1.0f);
                                        } else if (f15 == f11) {
                                            c2329bM4137l.f8149d.m4114g(c2335h8, 1.0f);
                                            c2329bM4137l.f8149d.m4114g(c2335h9, -1.0f);
                                        } else {
                                            i14 = i37;
                                            float f18 = (f16 / f8) / (f15 / f8);
                                            i15 = i19;
                                            c2329bM4137l.f8149d.m4114g(c2335h6, 1.0f);
                                            c2329bM4137l.f8149d.m4114g(c2335h7, -1.0f);
                                            c2329bM4137l.f8149d.m4114g(c2335h9, f18);
                                            c2329bM4137l.f8149d.m4114g(c2335h8, -f18);
                                        }
                                        i14 = i37;
                                        i15 = i19;
                                    }
                                    c2330c3.m4128c(c2329bM4137l);
                                } else {
                                    c2442d7 = c2442d23;
                                    i14 = i37;
                                    f9 = f11;
                                    i15 = i19;
                                }
                                f14 = f15;
                                c2442d22 = c2442d7;
                            }
                        } else if (c2440b.f8809p) {
                            arrayList2 = arrayList4;
                            i13 = size;
                            c2330c3.m4130e(c2441cArr7[i8 + 1].f8819i, c2441cArr7[i8].f8819i, 0, 4);
                            f10 = f14;
                            i14 = i37;
                            f9 = f11;
                            f14 = f10;
                            i15 = i19;
                        } else {
                            f15 = 1.0f;
                            arrayList2 = arrayList4;
                            i13 = size;
                            if (f15 != f11) {
                            }
                        }
                        i37 = i14 + 1;
                        i19 = i15;
                        arrayList4 = arrayList2;
                        size = i13;
                        f11 = f9;
                    }
                }
                i10 = i19;
                if (c2442d18 == null || !(c2442d18 == c2442d19 || z23)) {
                    c2442d2 = c2442d19;
                    if (!z8 || c2442d18 == null) {
                        C2441c[] c2441cArr9 = c2441cArr;
                        int i39 = 8;
                        if (z9 && c2442d18 != null) {
                            int i40 = c2440b.f8803j;
                            boolean z24 = i40 > 0 && c2440b.f8802i == i40;
                            C2442d c2442d24 = c2442d18;
                            C2442d c2442d25 = c2442d24;
                            while (c2442d25 != null) {
                                C2441c[] c2441cArr10 = c2442d25.f8836Q;
                                C2442d c2442d26 = c2442d25.f8871m0[i];
                                while (c2442d26 != null && c2442d26.f8859g0 == i39) {
                                    c2442d26 = c2442d26.f8871m0[i];
                                }
                                if (c2442d25 == c2442d18 || c2442d25 == c2442d2 || c2442d26 == null) {
                                    c2442d3 = c2442d24;
                                } else {
                                    if (c2442d26 == c2442d2) {
                                        c2442d26 = null;
                                    }
                                    C2441c c2441c14 = c2441cArr10[i8];
                                    C2335h c2335h10 = c2441c14.f8819i;
                                    int i41 = i8 + 1;
                                    C2335h c2335h11 = c2442d24.f8836Q[i41].f8819i;
                                    int iM4359e2 = c2441c14.m4359e();
                                    int iM4359e3 = c2441cArr10[i41].m4359e();
                                    if (c2442d26 != null) {
                                        c2441c = c2442d26.f8836Q[i8];
                                        c2335h2 = c2441c.f8819i;
                                        C2441c c2441c15 = c2441c.f8816f;
                                        c2335h = c2441c15 != null ? c2441c15.f8819i : null;
                                    } else {
                                        C2441c c2441c16 = c2442d2.f8836Q[i8];
                                        C2335h c2335h12 = c2441c16 != null ? c2441c16.f8819i : null;
                                        c2335h = c2441cArr10[i41].f8819i;
                                        c2441c = c2441c16;
                                        c2335h2 = c2335h12;
                                    }
                                    if (c2441c != null) {
                                        iM4359e3 += c2441c.m4359e();
                                    }
                                    int iM4359e4 = iM4359e2 + c2442d24.f8836Q[i41].m4359e();
                                    C2442d c2442d27 = c2442d26;
                                    C2335h c2335h13 = c2335h2;
                                    int i42 = z24 ? 8 : 4;
                                    if (c2335h10 == null || c2335h11 == null || c2335h13 == null || c2335h == null) {
                                        c2442d3 = c2442d24;
                                        c2442d4 = c2442d27;
                                    } else {
                                        c2442d4 = c2442d27;
                                        C2335h c2335h14 = c2335h;
                                        c2442d3 = c2442d24;
                                        c2330c.m4127b(c2335h10, c2335h11, iM4359e4, 0.5f, c2335h13, c2335h14, iM4359e3, i42);
                                    }
                                    c2442d26 = c2442d4;
                                }
                                if (c2442d25.f8859g0 != 8) {
                                    c2442d3 = c2442d25;
                                }
                                c2442d25 = c2442d26;
                                c2442d24 = c2442d3;
                                i39 = 8;
                            }
                            c2330c2 = c2330c;
                            C2441c c2441c17 = c2442d18.f8836Q[i8];
                            C2441c c2441c18 = c2441cArr9[i8].f8816f;
                            int i43 = i8 + 1;
                            C2441c c2441c19 = c2442d2.f8836Q[i43];
                            C2441c c2441c20 = c2442d17.f8836Q[i43].f8816f;
                            if (c2441c18 != null) {
                                if (c2442d18 != c2442d2) {
                                    c2330c2.m4130e(c2441c17.f8819i, c2441c18.f8819i, c2441c17.m4359e(), 5);
                                } else if (c2441c20 != null) {
                                    c2330c2.m4127b(c2441c17.f8819i, c2441c18.f8819i, c2441c17.m4359e(), 0.5f, c2441c19.f8819i, c2441c20.f8819i, c2441c19.m4359e(), 5);
                                }
                            }
                            if (c2441c20 != null && c2442d18 != c2442d2) {
                                c2330c2.m4130e(c2441c19.f8819i, c2441c20.f8819i, -c2441c19.m4359e(), 5);
                            }
                        }
                        if ((z8 || z9) && c2442d18 != null && c2442d18 != c2442d2) {
                            C2441c[] c2441cArr11 = c2442d18.f8836Q;
                            C2441c c2441c21 = c2441cArr11[i8];
                            if (c2442d2 == null) {
                                c2442d2 = c2442d18;
                            }
                            C2441c[] c2441cArr12 = c2442d2.f8836Q;
                            int i44 = i8 + 1;
                            C2441c c2441c22 = c2441cArr12[i44];
                            C2441c c2441c23 = c2441c21.f8816f;
                            c2335h4 = c2441c23 != null ? c2441c23.f8819i : null;
                            C2441c c2441c24 = c2441c22.f8816f;
                            C2335h c2335h15 = c2441c24 != null ? c2441c24.f8819i : null;
                            if (c2442d17 != c2442d2) {
                                C2441c c2441c25 = c2442d17.f8836Q[i44].f8816f;
                                c2335h15 = c2441c25 != null ? c2441c25.f8819i : null;
                            }
                            if (c2442d18 == c2442d2) {
                                c2441c22 = c2441cArr11[i44];
                            }
                            if (c2335h4 != null && c2335h15 != null) {
                                c2330c2.m4127b(c2441c21.f8819i, c2335h4, c2441c21.m4359e(), 0.5f, c2335h15, c2441c22.f8819i, c2441cArr12[i44].m4359e(), 5);
                            }
                        }
                    } else {
                        int i45 = c2440b.f8803j;
                        boolean z25 = i45 > 0 && c2440b.f8802i == i45;
                        C2442d c2442d28 = c2442d18;
                        C2442d c2442d29 = c2442d28;
                        while (c2442d28 != null) {
                            C2441c[] c2441cArr13 = c2442d28.f8836Q;
                            C2442d c2442d30 = c2442d28.f8871m0[i];
                            while (true) {
                                if (c2442d30 == null) {
                                    i11 = 8;
                                    break;
                                }
                                i11 = 8;
                                if (c2442d30.f8859g0 != 8) {
                                    break;
                                } else {
                                    c2442d30 = c2442d30.f8871m0[i];
                                }
                            }
                            if (c2442d30 != null || c2442d28 == c2442d2) {
                                C2441c c2441c26 = c2441cArr13[i8];
                                C2335h c2335h16 = c2441c26.f8819i;
                                C2441c c2441c27 = c2441c26.f8816f;
                                C2335h c2335h17 = c2441c27 != null ? c2441c27.f8819i : null;
                                if (c2442d29 != c2442d28) {
                                    c2335h17 = c2442d29.f8836Q[i8 + 1].f8819i;
                                } else if (c2442d28 == c2442d18) {
                                    C2441c c2441c28 = c2441cArr[i8].f8816f;
                                    c2335h17 = c2441c28 != null ? c2441c28.f8819i : null;
                                }
                                int iM4359e5 = c2441c26.m4359e();
                                int i46 = i8 + 1;
                                int iM4359e6 = c2441cArr13[i46].m4359e();
                                if (c2442d30 != null) {
                                    c2441c2 = c2442d30.f8836Q[i8];
                                    c2335h3 = c2441c2.f8819i;
                                } else {
                                    c2441c2 = c2442d17.f8836Q[i46].f8816f;
                                    c2335h3 = c2441c2 != null ? c2441c2.f8819i : null;
                                }
                                C2335h c2335h18 = c2441cArr13[i46].f8819i;
                                if (c2441c2 != null) {
                                    iM4359e6 += c2441c2.m4359e();
                                }
                                int iM4359e7 = c2442d29.f8836Q[i46].m4359e() + iM4359e5;
                                if (c2335h16 == null || c2335h17 == null || c2335h3 == null || c2335h18 == null) {
                                    c2442d5 = c2442d30;
                                    c2441cArr2 = c2441cArr;
                                    c2442d6 = c2442d29;
                                    i12 = 8;
                                } else {
                                    if (c2442d28 == c2442d18) {
                                        iM4359e7 = c2442d18.f8836Q[i8].m4359e();
                                    }
                                    if (c2442d28 == c2442d2) {
                                        iM4359e6 = c2442d2.f8836Q[i46].m4359e();
                                    }
                                    c2442d5 = c2442d30;
                                    c2441cArr2 = c2441cArr;
                                    c2442d6 = c2442d29;
                                    i12 = 8;
                                    c2330c.m4127b(c2335h16, c2335h17, iM4359e7, 0.5f, c2335h3, c2335h18, iM4359e6, z25 ? 8 : 5);
                                }
                            } else {
                                c2442d5 = c2442d30;
                                c2441cArr2 = c2441cArr;
                                c2442d6 = c2442d29;
                                i12 = i11;
                            }
                            if (c2442d28.f8859g0 != i12) {
                                c2442d6 = c2442d28;
                            }
                            c2442d28 = c2442d5;
                            c2442d29 = c2442d6;
                            c2441cArr = c2441cArr2;
                        }
                    }
                } else {
                    C2441c c2441c29 = c2441cArr[i8];
                    int i47 = i8 + 1;
                    C2441c c2441c30 = c2442d17.f8836Q[i47];
                    C2441c c2441c31 = c2441c29.f8816f;
                    C2335h c2335h19 = c2441c31 != null ? c2441c31.f8819i : null;
                    C2441c c2441c32 = c2441c30.f8816f;
                    C2335h c2335h20 = c2441c32 != null ? c2441c32.f8819i : null;
                    C2441c c2441c33 = c2442d18.f8836Q[i8];
                    if (c2442d19 != null) {
                        c2441c30 = c2442d19.f8836Q[i47];
                    }
                    if (c2335h19 == null || c2335h20 == null) {
                        c2442d2 = c2442d19;
                    } else {
                        float f19 = i == 0 ? c2442d20.f8853d0 : c2442d20.f8855e0;
                        int iM4359e8 = c2441c33.m4359e();
                        int iM4359e9 = c2441c30.m4359e();
                        C2335h c2335h21 = c2441c33.f8819i;
                        C2335h c2335h22 = c2441c30.f8819i;
                        C2335h c2335h23 = c2335h19;
                        c2442d2 = c2442d19;
                        c2330c3.m4127b(c2335h21, c2335h23, iM4359e8, f19, c2335h20, c2335h22, iM4359e9, 7);
                    }
                }
                c2330c2 = c2330c;
                if (z8) {
                    C2441c[] c2441cArr112 = c2442d18.f8836Q;
                    C2441c c2441c212 = c2441cArr112[i8];
                    if (c2442d2 == null) {
                    }
                    C2441c[] c2441cArr122 = c2442d2.f8836Q;
                    int i442 = i8 + 1;
                    C2441c c2441c222 = c2441cArr122[i442];
                    C2441c c2441c232 = c2441c212.f8816f;
                    if (c2441c232 != null) {
                    }
                    C2441c c2441c242 = c2441c222.f8816f;
                    if (c2441c242 != null) {
                    }
                    if (c2442d17 != c2442d2) {
                    }
                    if (c2442d18 == c2442d2) {
                    }
                    if (c2335h4 != null) {
                    }
                } else {
                    C2441c[] c2441cArr1122 = c2442d18.f8836Q;
                    C2441c c2441c2122 = c2441cArr1122[i8];
                    if (c2442d2 == null) {
                    }
                    C2441c[] c2441cArr1222 = c2442d2.f8836Q;
                    int i4422 = i8 + 1;
                    C2441c c2441c2222 = c2441cArr1222[i4422];
                    C2441c c2441c2322 = c2441c2122.f8816f;
                    if (c2441c2322 != null) {
                    }
                    C2441c c2441c2422 = c2441c2222.f8816f;
                    if (c2441c2422 != null) {
                    }
                    if (c2442d17 != c2442d2) {
                    }
                    if (c2442d18 == c2442d2) {
                    }
                    if (c2335h4 != null) {
                    }
                }
            } else {
                i10 = i19;
            }
            i20 = i9 + 1;
            c2443e2 = c2443e;
            c2330c3 = c2330c;
            arrayList3 = arrayList;
            i19 = i10;
        }
    }

    /* renamed from: b */
    public static void m4426b(C2443e c2443e, C2330c c2330c, C2442d c2442d) {
        c2442d.f8874o = -1;
        C2441c c2441c = c2442d.f8832M;
        int[] iArr = c2442d.f8877p0;
        C2441c c2441c2 = c2442d.f8831L;
        C2441c c2441c3 = c2442d.f8829J;
        C2441c c2441c4 = c2442d.f8830K;
        C2441c c2441c5 = c2442d.f8828I;
        c2442d.f8876p = -1;
        int[] iArr2 = c2443e.f8877p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = c2441c5.f8817g;
            int iM4396q = c2443e.m4396q() - c2441c4.f8817g;
            c2441c5.f8819i = c2330c.m4136k(c2441c5);
            c2441c4.f8819i = c2330c.m4136k(c2441c4);
            c2330c.m4129d(c2441c5.f8819i, i);
            c2330c.m4129d(c2441c4.f8819i, iM4396q);
            c2442d.f8874o = 2;
            c2442d.f8844Y = i;
            int i4 = iM4396q - i;
            c2442d.f8840U = i4;
            int i8 = c2442d.f8849b0;
            if (i4 < i8) {
                c2442d.f8840U = i8;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i9 = c2441c3.f8817g;
        int iM4392k = c2443e.m4392k() - c2441c2.f8817g;
        c2441c3.f8819i = c2330c.m4136k(c2441c3);
        c2441c2.f8819i = c2330c.m4136k(c2441c2);
        c2330c.m4129d(c2441c3.f8819i, i9);
        c2330c.m4129d(c2441c2.f8819i, iM4392k);
        if (c2442d.f8847a0 > 0 || c2442d.f8859g0 == 8) {
            C2335h c2335hM4136k = c2330c.m4136k(c2441c);
            c2441c.f8819i = c2335hM4136k;
            c2330c.m4129d(c2335hM4136k, c2442d.f8847a0 + i9);
        }
        c2442d.f8876p = 2;
        c2442d.f8845Z = i9;
        int i10 = iM4392k - i9;
        c2442d.f8841V = i10;
        int i11 = c2442d.f8851c0;
        if (i10 < i11) {
            c2442d.f8841V = i11;
        }
    }

    /* renamed from: c */
    public static final boolean m4427c(int i, int i4) {
        return (i & i4) == i4;
    }
}
