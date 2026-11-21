package p168t2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import java.util.Arrays;
import java.util.Collections;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p063h1.C1132w;
import p115n1.AbstractC1965b;
import p115n1.C1963a;
import p115n1.C1986m;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.e */
/* loaded from: classes.dex */
public final class C2406e implements InterfaceC2412h {

    /* renamed from: w */
    public static final byte[] f8501w = {73, 68, 51};

    /* renamed from: a */
    public final boolean f8502a;

    /* renamed from: d */
    public final String f8505d;

    /* renamed from: e */
    public final int f8506e;

    /* renamed from: f */
    public String f8507f;

    /* renamed from: g */
    public InterfaceC1980i0 f8508g;

    /* renamed from: h */
    public InterfaceC1980i0 f8509h;

    /* renamed from: l */
    public boolean f8513l;

    /* renamed from: m */
    public boolean f8514m;

    /* renamed from: p */
    public int f8517p;

    /* renamed from: q */
    public boolean f8518q;

    /* renamed from: s */
    public int f8520s;

    /* renamed from: u */
    public InterfaceC1980i0 f8522u;

    /* renamed from: v */
    public long f8523v;

    /* renamed from: b */
    public final C1131v f8503b = new C1131v(new byte[7], 7);

    /* renamed from: c */
    public final C1132w f8504c = new C1132w(Arrays.copyOf(f8501w, 10));

    /* renamed from: i */
    public int f8510i = 0;

    /* renamed from: j */
    public int f8511j = 0;

    /* renamed from: k */
    public int f8512k = 256;

    /* renamed from: n */
    public int f8515n = -1;

    /* renamed from: o */
    public int f8516o = -1;

    /* renamed from: r */
    public long f8519r = -9223372036854775807L;

    /* renamed from: t */
    public long f8521t = -9223372036854775807L;

    public C2406e(int i, String str, boolean z7) {
        this.f8502a = z7;
        this.f8505d = str;
        this.f8506e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f2  */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // p168t2.InterfaceC2412h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4245a(C1132w c1132w) {
        int i;
        int i4;
        byte b7;
        char c8;
        ?? r42;
        int i8;
        char c9;
        int i9;
        char c10;
        int i10;
        int i11;
        int i12;
        this.f8508g.getClass();
        int i13 = AbstractC1118i0.f4750a;
        while (c1132w.m2515a() > 0) {
            int i14 = this.f8510i;
            char c11 = '\uffff';
            C1132w c1132w2 = this.f8504c;
            int i15 = 3;
            C1131v c1131v = this.f8503b;
            int i16 = 0;
            int i17 = 4;
            int i18 = 1;
            if (i14 == 0) {
                byte[] bArr = c1132w.f4799a;
                int i19 = c1132w.f4800b;
                int i20 = c1132w.f4801c;
                while (true) {
                    if (i19 >= i20) {
                        c1132w.m2513G(i19);
                        break;
                    }
                    i = i19 + 1;
                    i4 = i15;
                    b7 = bArr[i19];
                    int i21 = b7 & 255;
                    if (this.f8512k != 512 || (((65280 | ((((byte) i21) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) != 65520) {
                        c8 = c11;
                        r42 = i18;
                    } else {
                        if (this.f8514m) {
                            break;
                        }
                        int i22 = i19 - 1;
                        c1132w.m2513G(i19);
                        byte[] bArr2 = (byte[]) c1131v.f4792b;
                        if (c1132w.m2515a() < i18) {
                            c8 = '\uffff';
                            r42 = true;
                        } else {
                            c1132w.m2519e(bArr2, i16, i18);
                            c1131v.m2502s(i17);
                            int iM2494k = c1131v.m2494k(i18);
                            int i23 = this.f8515n;
                            if (i23 == -1 || iM2494k == i23) {
                                if (this.f8516o != -1) {
                                    byte[] bArr3 = (byte[]) c1131v.f4792b;
                                    if (c1132w.m2515a() < i18) {
                                        break;
                                    }
                                    c1132w.m2519e(bArr3, i16, i18);
                                    c1131v.m2502s(2);
                                    i10 = 4;
                                    if (c1131v.m2494k(4) == this.f8516o) {
                                        c1132w.m2513G(i);
                                    }
                                    c8 = '\uffff';
                                } else {
                                    i10 = 4;
                                }
                                byte[] bArr4 = (byte[]) c1131v.f4792b;
                                if (c1132w.m2515a() >= i10) {
                                    c1132w.m2519e(bArr4, i16, i10);
                                    c1131v.m2502s(14);
                                    int iM2494k2 = c1131v.m2494k(13);
                                    if (iM2494k2 >= 7) {
                                        byte[] bArr5 = c1132w.f4799a;
                                        int i24 = c1132w.f4801c;
                                        int i25 = i22 + iM2494k2;
                                        if (i25 < i24) {
                                            byte b8 = bArr5[i25];
                                            c8 = '\uffff';
                                            if (b8 != -1) {
                                                if (b8 == 73 && ((i11 = i25 + 1) == i24 || (bArr5[i11] == 68 && ((i12 = i25 + 2) == i24 || bArr5[i12] == 51)))) {
                                                    break;
                                                }
                                            } else {
                                                int i26 = i25 + 1;
                                                if (i26 != i24) {
                                                    byte b9 = bArr5[i26];
                                                    if ((((65280 | ((b9 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b9 & 8) >> 3) == iM2494k) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                c8 = '\uffff';
                            }
                            r42 = true;
                        }
                    }
                    int i27 = this.f8512k;
                    int i28 = i21 | i27;
                    if (i28 == 329) {
                        i8 = 3;
                        c9 = '\u0100';
                        i9 = 0;
                        c10 = 2;
                        this.f8512k = 768;
                    } else if (i28 == 511) {
                        i8 = 3;
                        c9 = '\u0100';
                        i9 = 0;
                        c10 = 2;
                        this.f8512k = 512;
                    } else if (i28 == 836) {
                        i8 = 3;
                        c9 = '\u0100';
                        i9 = 0;
                        c10 = 2;
                        this.f8512k = 1024;
                    } else {
                        if (i28 == 1075) {
                            this.f8510i = 2;
                            this.f8511j = 3;
                            this.f8520s = 0;
                            c1132w2.m2513G(0);
                            c1132w.m2513G(i);
                            break;
                        }
                        c9 = '\u0100';
                        if (i27 != 256) {
                            this.f8512k = 256;
                            i8 = 3;
                            i9 = 0;
                            c10 = 2;
                            i18 = r42;
                            c11 = c8;
                            i17 = 4;
                            i16 = i9;
                            i15 = i8;
                        } else {
                            i8 = 3;
                            i9 = 0;
                            c10 = 2;
                        }
                    }
                    i19 = i;
                    i18 = r42;
                    c11 = c8;
                    i17 = 4;
                    i16 = i9;
                    i15 = i8;
                }
                this.f8517p = (b7 & 8) >> 3;
                this.f8513l = (b7 & 1) == 0;
                if (this.f8514m) {
                    this.f8510i = i4;
                    this.f8511j = 0;
                } else {
                    this.f8510i = 1;
                    this.f8511j = 0;
                }
                c1132w.m2513G(i);
            } else if (i14 != 1) {
                if (i14 == 2) {
                    byte[] bArr6 = c1132w2.f4799a;
                    int iMin = Math.min(c1132w.m2515a(), 10 - this.f8511j);
                    c1132w.m2519e(bArr6, this.f8511j, iMin);
                    int i29 = this.f8511j + iMin;
                    this.f8511j = i29;
                    if (i29 == 10) {
                        this.f8509h.sampleData(c1132w2, 10);
                        c1132w2.m2513G(6);
                        InterfaceC1980i0 interfaceC1980i0 = this.f8509h;
                        int iM2534t = c1132w2.m2534t() + 10;
                        this.f8510i = 4;
                        this.f8511j = 10;
                        this.f8522u = interfaceC1980i0;
                        this.f8523v = 0L;
                        this.f8520s = iM2534t;
                    }
                } else if (i14 == 3) {
                    int i30 = this.f8513l ? 7 : 5;
                    byte[] bArr7 = (byte[]) c1131v.f4792b;
                    int iMin2 = Math.min(c1132w.m2515a(), i30 - this.f8511j);
                    c1132w.m2519e(bArr7, this.f8511j, iMin2);
                    int i31 = this.f8511j + iMin2;
                    this.f8511j = i31;
                    if (i31 == i30) {
                        c1131v.m2502s(0);
                        if (this.f8518q) {
                            c1131v.m2505v(10);
                        } else {
                            int iM2494k3 = c1131v.m2494k(2) + 1;
                            if (iM2494k3 != 2) {
                                AbstractC1101a.m2348F("AdtsReader", "Detected audio object type: " + iM2494k3 + ", but assuming AAC LC.");
                                iM2494k3 = 2;
                            }
                            c1131v.m2505v(5);
                            byte[] bArrM3825a = AbstractC1965b.m3825a(iM2494k3, this.f8516o, c1131v.m2494k(3));
                            C1963a c1963aM3838n = AbstractC1965b.m3838n(new C1131v(bArrM3825a, 2), false);
                            C0246v c0246v = new C0246v();
                            c0246v.f1435a = this.f8507f;
                            c0246v.f1447m = AbstractC0244u0.m687p("audio/mp4a-latm");
                            c0246v.f1444j = c1963aM3838n.f7261a;
                            c0246v.f1425B = c1963aM3838n.f7263c;
                            c0246v.f1426C = c1963aM3838n.f7262b;
                            c0246v.f1450p = Collections.singletonList(bArrM3825a);
                            c0246v.f1438d = this.f8505d;
                            c0246v.f1440f = this.f8506e;
                            C0249w c0249w = new C0249w(c0246v);
                            this.f8519r = 1024000000 / c0249w.f1499D;
                            this.f8508g.format(c0249w);
                            this.f8518q = true;
                        }
                        c1131v.m2505v(4);
                        int iM2494k4 = c1131v.m2494k(13);
                        int i32 = iM2494k4 - 7;
                        if (this.f8513l) {
                            i32 = iM2494k4 - 9;
                        }
                        InterfaceC1980i0 interfaceC1980i02 = this.f8508g;
                        long j = this.f8519r;
                        this.f8510i = 4;
                        this.f8511j = 0;
                        this.f8522u = interfaceC1980i02;
                        this.f8523v = j;
                        this.f8520s = i32;
                    }
                } else {
                    if (i14 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(c1132w.m2515a(), this.f8520s - this.f8511j);
                    this.f8522u.sampleData(c1132w, iMin3);
                    int i33 = this.f8511j + iMin3;
                    this.f8511j = i33;
                    if (i33 == this.f8520s) {
                        AbstractC1101a.m2359j(this.f8521t != -9223372036854775807L);
                        this.f8522u.sampleMetadata(this.f8521t, 1, this.f8520s, 0, null);
                        this.f8521t += this.f8523v;
                        this.f8510i = 0;
                        this.f8511j = 0;
                        this.f8512k = 256;
                    }
                }
            } else if (c1132w.m2515a() != 0) {
                ((byte[]) c1131v.f4792b)[0] = c1132w.f4799a[c1132w.f4800b];
                c1131v.m2502s(2);
                int iM2494k5 = c1131v.m2494k(4);
                int i34 = this.f8516o;
                if (i34 == -1 || iM2494k5 == i34) {
                    if (!this.f8514m) {
                        this.f8514m = true;
                        this.f8515n = this.f8517p;
                        this.f8516o = iM2494k5;
                    }
                    this.f8510i = 3;
                    this.f8511j = 0;
                } else {
                    this.f8514m = false;
                    this.f8510i = 0;
                    this.f8511j = 0;
                    this.f8512k = 256;
                }
            }
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: c */
    public final void mo4246c() {
        this.f8521t = -9223372036854775807L;
        this.f8514m = false;
        this.f8510i = 0;
        this.f8511j = 0;
        this.f8512k = 256;
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: d */
    public final void mo4247d(boolean z7) {
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: e */
    public final void mo4248e(InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
        c2411g0.m4255a();
        c2411g0.m4256b();
        this.f8507f = c2411g0.f8573e;
        c2411g0.m4256b();
        InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(c2411g0.f8572d, 1);
        this.f8508g = interfaceC1980i0Track;
        this.f8522u = interfaceC1980i0Track;
        if (!this.f8502a) {
            this.f8509h = new C1986m();
            return;
        }
        c2411g0.m4255a();
        c2411g0.m4256b();
        InterfaceC1980i0 interfaceC1980i0Track2 = interfaceC1989p.track(c2411g0.f8572d, 5);
        this.f8509h = interfaceC1980i0Track2;
        C0246v c0246v = new C0246v();
        c2411g0.m4256b();
        c0246v.f1435a = c2411g0.f8573e;
        c0246v.f1447m = AbstractC0244u0.m687p("application/id3");
        interfaceC1980i0Track2.format(new C0249w(c0246v));
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: f */
    public final void mo4249f(int i, long j) {
        this.f8521t = j;
    }
}
