package p013b2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0222n;
import androidx.media3.common.C0241t0;
import com.bumptech.glide.AbstractC0714c;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p052f6.AbstractC0983m0;
import p052f6.C0974j0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p063h1.C1132w;
import p171t5.AbstractC2436a;
import p192w1.C2600b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b2.i */
/* loaded from: classes.dex */
public final class C0557i extends AbstractC2436a {

    /* renamed from: b */
    public static final C0222n f2251b = new C0222n(18);

    /* renamed from: a */
    public final InterfaceC0555g f2252a;

    public C0557i(InterfaceC0555g interfaceC0555g) {
        this.f2252a = interfaceC0555g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022f A[Catch: all -> 0x0216, Exception -> 0x0218, OutOfMemoryError -> 0x021a, TRY_LEAVE, TryCatch #8 {Exception -> 0x0218, OutOfMemoryError -> 0x021a, all -> 0x0216, blocks: (B:171:0x0211, B:184:0x022a, B:185:0x022f), top: B:199:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0251  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [b2.j] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [h1.w] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC0558j m1280A(int i, C1132w c1132w, boolean z7, int i4, InterfaceC0555g interfaceC0555g) throws Throwable {
        int iM2539y;
        int i8;
        ?? r1;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i9;
        int i10;
        int i11;
        C1132w c1132w2;
        Throwable th;
        C1132w c1132w3;
        ?? r12;
        C1132w c1132w4;
        AbstractC0558j c0550b;
        int i12 = i;
        int iM2535u = c1132w.m2535u();
        int iM2535u2 = c1132w.m2535u();
        int iM2535u3 = c1132w.m2535u();
        int iM2535u4 = i12 >= 3 ? c1132w.m2535u() : 0;
        if (i12 == 4) {
            iM2539y = c1132w.m2539y();
            if (!z7) {
                iM2539y = (((iM2539y >> 24) & 255) << 21) | (iM2539y & 255) | (((iM2539y >> 8) & 255) << 7) | (((iM2539y >> 16) & 255) << 14);
            }
        } else {
            iM2539y = i12 == 3 ? c1132w.m2539y() : c1132w.m2538x();
        }
        int iM1295P = iM2539y;
        int iM2507A = i12 >= 3 ? c1132w.m2507A() : 0;
        if (iM2535u == 0 && iM2535u2 == 0 && iM2535u3 == 0 && iM2535u4 == 0 && iM1295P == 0 && iM2507A == 0) {
            c1132w.m2513G(c1132w.f4801c);
            return null;
        }
        int i13 = c1132w.f4800b + iM1295P;
        if (i13 > c1132w.f4801c) {
            AbstractC1101a.m2348F("Id3Decoder", "Frame size exceeds remaining tag data");
            c1132w.m2513G(c1132w.f4801c);
            return null;
        }
        if (interfaceC0555g != null) {
            boolean zMo647b = interfaceC0555g.mo647b(i12, iM2535u, iM2535u2, iM2535u3, iM2535u4);
            i12 = i12;
            r1 = iM2535u;
            i8 = iM2535u2;
            if (!zMo647b) {
                c1132w.m2513G(i13);
                return null;
            }
        } else {
            i8 = iM2535u2;
            r1 = iM2535u;
        }
        if (i12 == 3) {
            z8 = (iM2507A & 128) != 0;
            z11 = (iM2507A & 64) != 0;
            z12 = false;
            z10 = (iM2507A & 32) != 0;
            z9 = z8;
        } else if (i12 == 4) {
            boolean z13 = (iM2507A & 64) != 0;
            boolean z14 = (iM2507A & 8) != 0;
            z11 = (iM2507A & 4) != 0;
            z12 = (iM2507A & 2) != 0;
            z9 = (iM2507A & 1) != 0;
            boolean z15 = z14;
            z10 = z13;
            z8 = z15;
        } else {
            z8 = false;
            z9 = false;
            z10 = false;
            z11 = false;
            z12 = false;
        }
        if (z8 || z11) {
            AbstractC1101a.m2348F("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            c1132w.m2513G(i13);
            return null;
        }
        if (z10) {
            iM1295P--;
            c1132w.m2514H(1);
        }
        if (z9) {
            iM1295P -= 4;
            c1132w.m2514H(4);
        }
        if (z12) {
            iM1295P = m1295P(c1132w, iM1295P);
        }
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                c1132w3 = c1132w;
            }
        } catch (Exception e) {
            e = e;
            int i14 = iM1295P;
            iM1295P = i8;
            i8 = i14;
            i9 = r1;
            i10 = iM2535u3;
            i11 = iM2535u4;
            c1132w2 = c1132w;
            th = null;
            c1132w2.m2513G(i13);
            r12 = th;
            if (r12 == 0) {
            }
            return r12;
        } catch (OutOfMemoryError e8) {
            e = e8;
            int i142 = iM1295P;
            iM1295P = i8;
            i8 = i142;
            i9 = r1;
            i10 = iM2535u3;
            i11 = iM2535u4;
            c1132w2 = c1132w;
            th = null;
            c1132w2.m2513G(i13);
            r12 = th;
            if (r12 == 0) {
            }
            return r12;
        }
        if (r1 == 84 && i8 == 88 && iM2535u3 == 88 && (i12 == 2 || iM2535u4 == 88)) {
            c0550b = m1287H(c1132w, iM1295P);
        } else if (r1 == 84) {
            c0550b = m1285F(iM1295P, c1132w, m1292M(i12, r1, i8, iM2535u3, iM2535u4));
        } else if (r1 == 87 && i8 == 88 && iM2535u3 == 88 && (i12 == 2 || iM2535u4 == 88)) {
            c0550b = m1289J(c1132w, iM1295P);
        } else if (r1 == 87) {
            c0550b = m1288I(iM1295P, c1132w, m1292M(i12, r1, i8, iM2535u3, iM2535u4));
        } else {
            if (r1 != 80 || i8 != 82 || iM2535u3 != 73 || iM2535u4 != 86) {
                th = null;
                try {
                } catch (Exception e9) {
                    e = e9;
                    int i15 = iM1295P;
                    iM1295P = i8;
                    i8 = i15;
                    i9 = r1;
                    i10 = iM2535u3;
                    i11 = iM2535u4;
                    c1132w2 = c1132w;
                    c1132w2.m2513G(i13);
                    r12 = th;
                    if (r12 == 0) {
                    }
                    return r12;
                } catch (OutOfMemoryError e10) {
                    e = e10;
                    int i152 = iM1295P;
                    iM1295P = i8;
                    i8 = i152;
                    i9 = r1;
                    i10 = iM2535u3;
                    i11 = iM2535u4;
                    c1132w2 = c1132w;
                    c1132w2.m2513G(i13);
                    r12 = th;
                    if (r12 == 0) {
                    }
                    return r12;
                }
                if (r1 != 71 || i8 != 69 || iM2535u3 != 79 || (iM2535u4 != 66 && i12 != 2)) {
                    if (i12 == 2) {
                        if (r1 == 80 && i8 == 73 && iM2535u3 == 67) {
                            c0550b = m1297w(c1132w, iM1295P, i12);
                        }
                        if (r1 != 67 && i8 == 79 && iM2535u3 == 77 && (iM2535u4 == 77 || i12 == 2)) {
                            c0550b = m1300z(c1132w, iM1295P);
                        } else if (r1 != 67 && i8 == 72 && iM2535u3 == 65 && iM2535u4 == 80) {
                            int i16 = iM1295P;
                            iM1295P = i8;
                            i8 = i16;
                            i9 = r1;
                            i10 = iM2535u3;
                            i11 = iM2535u4;
                            try {
                                c0550b = m1298x(c1132w, i8, i12, z7, i4, interfaceC0555g);
                                i12 = i;
                                r1 = c1132w;
                                r1.m2513G(i13);
                                r12 = c0550b;
                                e = th;
                            } catch (Exception e11) {
                                e = e11;
                                i12 = i;
                                c1132w2 = c1132w;
                                c1132w2.m2513G(i13);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (OutOfMemoryError e12) {
                                e = e12;
                                i12 = i;
                                c1132w2 = c1132w;
                                c1132w2.m2513G(i13);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (Throwable th3) {
                                th = th3;
                                c1132w3 = c1132w;
                                c1132w3.m2513G(i13);
                                throw th;
                            }
                        } else {
                            int i17 = iM1295P;
                            iM1295P = i8;
                            i8 = i17;
                            i9 = r1;
                            i10 = iM2535u3;
                            i11 = iM2535u4;
                            try {
                                if (i9 != 67 && iM1295P == 84 && i10 == 79 && i11 == 67) {
                                    i12 = i;
                                    C1132w c1132w5 = c1132w;
                                    c0550b = m1299y(c1132w5, i8, i12, z7, i4, interfaceC0555g);
                                    r1 = c1132w5;
                                } else {
                                    i12 = i;
                                    c1132w4 = c1132w;
                                    if (i9 != 77 && iM1295P == 76 && i10 == 76 && i11 == 84) {
                                        c0550b = m1282C(c1132w4, i8);
                                        r1 = c1132w4;
                                    } else {
                                        String strM1292M = m1292M(i12, i9, iM1295P, i10, i11);
                                        byte[] bArr = new byte[i8];
                                        c1132w4.m2519e(bArr, 0, i8);
                                        c0550b = new C0550b(strM1292M, bArr);
                                        r1 = c1132w4;
                                    }
                                }
                                r1.m2513G(i13);
                                r12 = c0550b;
                                e = th;
                            } catch (Exception e13) {
                                e = e13;
                                c1132w2 = r1;
                                c1132w2.m2513G(i13);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (OutOfMemoryError e14) {
                                e = e14;
                                c1132w2 = r1;
                                c1132w2.m2513G(i13);
                                r12 = th;
                                if (r12 == 0) {
                                }
                                return r12;
                            } catch (Throwable th4) {
                                th = th4;
                                c1132w3 = r1;
                                c1132w3.m2513G(i13);
                                throw th;
                            }
                        }
                    } else if (r1 == 65 && i8 == 80 && iM2535u3 == 73 && iM2535u4 == 67) {
                        c0550b = m1297w(c1132w, iM1295P, i12);
                    } else {
                        if (r1 != 67) {
                        }
                        if (r1 != 67) {
                            int i172 = iM1295P;
                            iM1295P = i8;
                            i8 = i172;
                            i9 = r1;
                            i10 = iM2535u3;
                            i11 = iM2535u4;
                            if (i9 != 67) {
                                i12 = i;
                                c1132w4 = c1132w;
                                if (i9 != 77) {
                                    String strM1292M2 = m1292M(i12, i9, iM1295P, i10, i11);
                                    byte[] bArr2 = new byte[i8];
                                    c1132w4.m2519e(bArr2, 0, i8);
                                    c0550b = new C0550b(strM1292M2, bArr2);
                                    r1 = c1132w4;
                                    r1.m2513G(i13);
                                    r12 = c0550b;
                                    e = th;
                                }
                            }
                        }
                    }
                    if (r12 == 0) {
                        AbstractC1101a.m2349G("Id3Decoder", "Failed to decode frame: id=" + m1292M(i12, i9, iM1295P, i10, i11) + ", frameSize=" + i8, e);
                    }
                    return r12;
                }
                c0550b = m1281B(c1132w, iM1295P);
                int i18 = iM1295P;
                iM1295P = i8;
                i8 = i18;
                i9 = r1;
                i10 = iM2535u3;
                i11 = iM2535u4;
                r1 = c1132w;
                r1.m2513G(i13);
                r12 = c0550b;
                e = th;
                if (r12 == 0) {
                }
                return r12;
            }
            c0550b = m1283D(c1132w, iM1295P);
        }
        int i19 = iM1295P;
        iM1295P = i8;
        i8 = i19;
        i9 = r1;
        i10 = iM2535u3;
        i11 = iM2535u4;
        r1 = c1132w;
        th = null;
        r1.m2513G(i13);
        r12 = c0550b;
        e = th;
        if (r12 == 0) {
        }
        return r12;
    }

    /* renamed from: B */
    public static C0554f m1281B(C1132w c1132w, int i) {
        int iM2535u = c1132w.m2535u();
        Charset charsetM1291L = m1291L(iM2535u);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        c1132w.m2519e(bArr, 0, i4);
        int iM1294O = m1294O(bArr, 0);
        String strM687p = AbstractC0244u0.m687p(new String(bArr, 0, iM1294O, StandardCharsets.ISO_8859_1));
        int i8 = iM1294O + 1;
        int iM1293N = m1293N(bArr, i8, iM2535u);
        String strM1284E = m1284E(bArr, i8, iM1293N, charsetM1291L);
        int iM1290K = m1290K(iM2535u) + iM1293N;
        int iM1293N2 = m1293N(bArr, iM1290K, iM2535u);
        String strM1284E2 = m1284E(bArr, iM1290K, iM1293N2, charsetM1291L);
        int iM1290K2 = m1290K(iM2535u) + iM1293N2;
        return new C0554f(strM687p, strM1284E, strM1284E2, i4 <= iM1290K2 ? AbstractC1118i0.f4755f : Arrays.copyOfRange(bArr, iM1290K2, i4));
    }

    /* renamed from: C */
    public static C0561m m1282C(C1132w c1132w, int i) {
        int iM2507A = c1132w.m2507A();
        int iM2538x = c1132w.m2538x();
        int iM2538x2 = c1132w.m2538x();
        int iM2535u = c1132w.m2535u();
        int iM2535u2 = c1132w.m2535u();
        C1131v c1131v = new C1131v(0);
        c1131v.m2500q(c1132w);
        int i4 = ((i - 10) * 8) / (iM2535u + iM2535u2);
        int[] iArr = new int[i4];
        int[] iArr2 = new int[i4];
        for (int i8 = 0; i8 < i4; i8++) {
            int iM2494k = c1131v.m2494k(iM2535u);
            int iM2494k2 = c1131v.m2494k(iM2535u2);
            iArr[i8] = iM2494k;
            iArr2[i8] = iM2494k2;
        }
        return new C0561m(iM2507A, iM2538x, iM2538x2, iArr, iArr2);
    }

    /* renamed from: D */
    public static C0562n m1283D(C1132w c1132w, int i) {
        byte[] bArr = new byte[i];
        c1132w.m2519e(bArr, 0, i);
        int iM1294O = m1294O(bArr, 0);
        String str = new String(bArr, 0, iM1294O, StandardCharsets.ISO_8859_1);
        int i4 = iM1294O + 1;
        return new C0562n(str, i <= i4 ? AbstractC1118i0.f4755f : Arrays.copyOfRange(bArr, i4, i));
    }

    /* renamed from: E */
    public static String m1284E(byte[] bArr, int i, int i4, Charset charset) {
        return (i4 <= i || i4 > bArr.length) ? C2181z.FRAGMENT_ENCODE_SET : new String(bArr, i, i4 - i, charset);
    }

    /* renamed from: F */
    public static C0563o m1285F(int i, C1132w c1132w, String str) {
        if (i < 1) {
            return null;
        }
        int iM2535u = c1132w.m2535u();
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        c1132w.m2519e(bArr, 0, i4);
        return new C0563o(str, null, m1286G(bArr, iM2535u, 0));
    }

    /* renamed from: G */
    public static C0981l1 m1286G(byte[] bArr, int i, int i4) {
        if (i4 >= bArr.length) {
            return AbstractC0983m0.m2168n(C2181z.FRAGMENT_ENCODE_SET);
        }
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        int iM1293N = m1293N(bArr, i4, i);
        while (i4 < iM1293N) {
            c0974j0M2164i.m2141a(new String(bArr, i4, iM1293N - i4, m1291L(i)));
            i4 = m1290K(i) + iM1293N;
            iM1293N = m1293N(bArr, i4, i);
        }
        C0981l1 c0981l1M2159f = c0974j0M2164i.m2159f();
        return c0981l1M2159f.isEmpty() ? AbstractC0983m0.m2168n(C2181z.FRAGMENT_ENCODE_SET) : c0981l1M2159f;
    }

    /* renamed from: H */
    public static C0563o m1287H(C1132w c1132w, int i) {
        if (i < 1) {
            return null;
        }
        int iM2535u = c1132w.m2535u();
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        c1132w.m2519e(bArr, 0, i4);
        int iM1293N = m1293N(bArr, 0, iM2535u);
        return new C0563o("TXXX", new String(bArr, 0, iM1293N, m1291L(iM2535u)), m1286G(bArr, iM2535u, m1290K(iM2535u) + iM1293N));
    }

    /* renamed from: I */
    public static C0564p m1288I(int i, C1132w c1132w, String str) {
        byte[] bArr = new byte[i];
        c1132w.m2519e(bArr, 0, i);
        return new C0564p(str, null, new String(bArr, 0, m1294O(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    /* renamed from: J */
    public static C0564p m1289J(C1132w c1132w, int i) {
        if (i < 1) {
            return null;
        }
        int iM2535u = c1132w.m2535u();
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        c1132w.m2519e(bArr, 0, i4);
        int iM1293N = m1293N(bArr, 0, iM2535u);
        String str = new String(bArr, 0, iM1293N, m1291L(iM2535u));
        int iM1290K = m1290K(iM2535u) + iM1293N;
        return new C0564p("WXXX", str, m1284E(bArr, iM1290K, m1294O(bArr, iM1290K), StandardCharsets.ISO_8859_1));
    }

    /* renamed from: K */
    public static int m1290K(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: L */
    public static Charset m1291L(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    /* renamed from: M */
    public static String m1292M(int i, int i4, int i8, int i9, int i10) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i9)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }

    /* renamed from: N */
    public static int m1293N(byte[] bArr, int i, int i4) {
        int iM1294O = m1294O(bArr, i);
        if (i4 == 0 || i4 == 3) {
            return iM1294O;
        }
        while (iM1294O < bArr.length - 1) {
            if ((iM1294O - i) % 2 == 0 && bArr[iM1294O + 1] == 0) {
                return iM1294O;
            }
            iM1294O = m1294O(bArr, iM1294O + 1);
        }
        return bArr.length;
    }

    /* renamed from: O */
    public static int m1294O(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: P */
    public static int m1295P(C1132w c1132w, int i) {
        byte[] bArr = c1132w.f4799a;
        int i4 = c1132w.f4800b;
        int i8 = i4;
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= i4 + i) {
                return i;
            }
            if ((bArr[i8] & 255) == 255 && bArr[i9] == 0) {
                System.arraycopy(bArr, i8 + 2, bArr, i9, (i - (i8 - i4)) - 2);
                i--;
            }
            i8 = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1296Q(C1132w c1132w, int i, int i4, boolean z7) {
        int iM2538x;
        long jM2538x;
        int iM2507A;
        int i8;
        int i9 = c1132w.f4800b;
        while (true) {
            try {
                boolean z8 = true;
                if (c1132w.m2515a() < i4) {
                    c1132w.m2513G(i9);
                    return true;
                }
                if (i >= 3) {
                    iM2538x = c1132w.m2521g();
                    jM2538x = c1132w.m2537w();
                    iM2507A = c1132w.m2507A();
                } else {
                    iM2538x = c1132w.m2538x();
                    jM2538x = c1132w.m2538x();
                    iM2507A = 0;
                }
                if (iM2538x == 0 && jM2538x == 0 && iM2507A == 0) {
                    c1132w.m2513G(i9);
                    return true;
                }
                if (i == 4 && !z7) {
                    if ((8421504 & jM2538x) != 0) {
                        c1132w.m2513G(i9);
                        return false;
                    }
                    jM2538x = (((jM2538x >> 24) & 255) << 21) | (jM2538x & 255) | (((jM2538x >> 8) & 255) << 7) | (((jM2538x >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i8 = (iM2507A & 64) != 0 ? 1 : 0;
                    if ((iM2507A & 1) == 0) {
                        z8 = false;
                    }
                } else if (i == 3) {
                    i8 = (iM2507A & 32) != 0 ? 1 : 0;
                    if ((iM2507A & 128) == 0) {
                    }
                } else {
                    i8 = 0;
                    z8 = false;
                }
                if (z8) {
                    i8 += 4;
                }
                if (jM2538x < i8) {
                    c1132w.m2513G(i9);
                    return false;
                }
                if (c1132w.m2515a() < jM2538x) {
                    c1132w.m2513G(i9);
                    return false;
                }
                c1132w.m2514H((int) jM2538x);
            } catch (Throwable th) {
                c1132w.m2513G(i9);
                throw th;
            }
        }
    }

    /* renamed from: w */
    public static C0549a m1297w(C1132w c1132w, int i, int i4) {
        int iM1294O;
        String strConcat;
        int iM2535u = c1132w.m2535u();
        Charset charsetM1291L = m1291L(iM2535u);
        int i8 = i - 1;
        byte[] bArr = new byte[i8];
        c1132w.m2519e(bArr, 0, i8);
        if (i4 == 2) {
            strConcat = "image/" + AbstractC0714c.m1517e0(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM1294O = 2;
        } else {
            iM1294O = m1294O(bArr, 0);
            String strM1517e0 = AbstractC0714c.m1517e0(new String(bArr, 0, iM1294O, StandardCharsets.ISO_8859_1));
            strConcat = strM1517e0.indexOf(47) == -1 ? "image/".concat(strM1517e0) : strM1517e0;
        }
        int i9 = bArr[iM1294O + 1] & 255;
        int i10 = iM1294O + 2;
        int iM1293N = m1293N(bArr, i10, iM2535u);
        String str = new String(bArr, i10, iM1293N - i10, charsetM1291L);
        int iM1290K = m1290K(iM2535u) + iM1293N;
        return new C0549a(strConcat, str, i9, i8 <= iM1290K ? AbstractC1118i0.f4755f : Arrays.copyOfRange(bArr, iM1290K, i8));
    }

    /* renamed from: x */
    public static C0551c m1298x(C1132w c1132w, int i, int i4, boolean z7, int i8, InterfaceC0555g interfaceC0555g) throws Throwable {
        int i9 = c1132w.f4800b;
        int iM1294O = m1294O(c1132w.f4799a, i9);
        String str = new String(c1132w.f4799a, i9, iM1294O - i9, StandardCharsets.ISO_8859_1);
        c1132w.m2513G(iM1294O + 1);
        int iM2521g = c1132w.m2521g();
        int iM2521g2 = c1132w.m2521g();
        long jM2537w = c1132w.m2537w();
        if (jM2537w == 4294967295L) {
            jM2537w = -1;
        }
        long jM2537w2 = c1132w.m2537w();
        long j = jM2537w2 == 4294967295L ? -1L : jM2537w2;
        ArrayList arrayList = new ArrayList();
        int i10 = i9 + i;
        while (c1132w.f4800b < i10) {
            AbstractC0558j abstractC0558jM1280A = m1280A(i4, c1132w, z7, i8, interfaceC0555g);
            if (abstractC0558jM1280A != null) {
                arrayList.add(abstractC0558jM1280A);
            }
        }
        return new C0551c(str, iM2521g, iM2521g2, jM2537w, j, (AbstractC0558j[]) arrayList.toArray(new AbstractC0558j[0]));
    }

    /* renamed from: y */
    public static C0552d m1299y(C1132w c1132w, int i, int i4, boolean z7, int i8, InterfaceC0555g interfaceC0555g) throws Throwable {
        int i9 = c1132w.f4800b;
        int iM1294O = m1294O(c1132w.f4799a, i9);
        String str = new String(c1132w.f4799a, i9, iM1294O - i9, StandardCharsets.ISO_8859_1);
        c1132w.m2513G(iM1294O + 1);
        int iM2535u = c1132w.m2535u();
        boolean z8 = (iM2535u & 2) != 0;
        boolean z9 = (iM2535u & 1) != 0;
        int iM2535u2 = c1132w.m2535u();
        String[] strArr = new String[iM2535u2];
        for (int i10 = 0; i10 < iM2535u2; i10++) {
            int i11 = c1132w.f4800b;
            int iM1294O2 = m1294O(c1132w.f4799a, i11);
            strArr[i10] = new String(c1132w.f4799a, i11, iM1294O2 - i11, StandardCharsets.ISO_8859_1);
            c1132w.m2513G(iM1294O2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i12 = i9 + i;
        while (c1132w.f4800b < i12) {
            AbstractC0558j abstractC0558jM1280A = m1280A(i4, c1132w, z7, i8, interfaceC0555g);
            if (abstractC0558jM1280A != null) {
                arrayList.add(abstractC0558jM1280A);
            }
        }
        return new C0552d(str, z8, z9, strArr, (AbstractC0558j[]) arrayList.toArray(new AbstractC0558j[0]));
    }

    /* renamed from: z */
    public static C0553e m1300z(C1132w c1132w, int i) {
        if (i < 4) {
            return null;
        }
        int iM2535u = c1132w.m2535u();
        Charset charsetM1291L = m1291L(iM2535u);
        byte[] bArr = new byte[3];
        c1132w.m2519e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i4 = i - 4;
        byte[] bArr2 = new byte[i4];
        c1132w.m2519e(bArr2, 0, i4);
        int iM1293N = m1293N(bArr2, 0, iM2535u);
        String str2 = new String(bArr2, 0, iM1293N, charsetM1291L);
        int iM1290K = m1290K(iM2535u) + iM1293N;
        return new C0553e(str, str2, m1284E(bArr2, iM1290K, m1293N(bArr2, iM1290K, iM2535u), charsetM1291L));
    }

    @Override // p171t5.AbstractC2436a
    /* renamed from: d */
    public final C0241t0 mo247d(C2600b c2600b, ByteBuffer byteBuffer) {
        return m1301v(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0241t0 m1301v(byte[] bArr, int i) throws Throwable {
        C0556h c0556h;
        ArrayList arrayList = new ArrayList();
        C1132w c1132w = new C1132w(bArr, i);
        boolean z7 = false;
        if (c1132w.m2515a() < 10) {
            AbstractC1101a.m2348F("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iM2538x = c1132w.m2538x();
            if (iM2538x == 4801587) {
                int iM2535u = c1132w.m2535u();
                c1132w.m2514H(1);
                int iM2535u2 = c1132w.m2535u();
                int iM2534t = c1132w.m2534t();
                if (iM2535u == 2) {
                    if ((iM2535u2 & 64) != 0) {
                        AbstractC1101a.m2348F("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    c0556h = new C0556h(iM2535u, iM2534t, iM2535u >= 4 && (iM2535u2 & 128) != 0);
                } else {
                    if (iM2535u == 3) {
                        if ((iM2535u2 & 64) != 0) {
                            int iM2521g = c1132w.m2521g();
                            c1132w.m2514H(iM2521g);
                            iM2534t -= iM2521g + 4;
                        }
                    } else if (iM2535u == 4) {
                        if ((iM2535u2 & 64) != 0) {
                            int iM2534t2 = c1132w.m2534t();
                            c1132w.m2514H(iM2534t2 - 4);
                            iM2534t -= iM2534t2;
                        }
                        if ((iM2535u2 & 16) != 0) {
                            iM2534t -= 10;
                        }
                    } else {
                        AbstractC0008a1.m23s("Skipped ID3 tag with unsupported majorVersion=", iM2535u, "Id3Decoder");
                    }
                    if (iM2535u >= 4) {
                        c0556h = new C0556h(iM2535u, iM2534t, iM2535u >= 4 && (iM2535u2 & 128) != 0);
                    }
                }
                if (c0556h != null) {
                    return null;
                }
                int i4 = c0556h.f2248a;
                int i8 = c1132w.f4800b;
                int i9 = i4 == 2 ? 6 : 10;
                int iM1295P = c0556h.f2250c;
                if (c0556h.f2249b) {
                    iM1295P = m1295P(c1132w, iM1295P);
                }
                c1132w.m2512F(i8 + iM1295P);
                if (!m1296Q(c1132w, i4, i9, false)) {
                    if (i4 != 4 || !m1296Q(c1132w, 4, i9, true)) {
                        AbstractC0008a1.m23s("Failed to validate ID3 tag with majorVersion=", i4, "Id3Decoder");
                        return null;
                    }
                    z7 = true;
                }
                while (c1132w.m2515a() >= i9) {
                    AbstractC0558j abstractC0558jM1280A = m1280A(i4, c1132w, z7, i9, this.f2252a);
                    if (abstractC0558jM1280A != null) {
                        arrayList.add(abstractC0558jM1280A);
                    }
                }
                return new C0241t0(arrayList);
            }
            AbstractC1101a.m2348F("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iM2538x))));
        }
        c0556h = null;
        if (c0556h != null) {
        }
    }
}
