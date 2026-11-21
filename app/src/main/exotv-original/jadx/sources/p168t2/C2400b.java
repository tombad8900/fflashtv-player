package p168t2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import java.util.Objects;
import p023c4.C0644h;
import p063h1.AbstractC1101a;
import p063h1.C1131v;
import p063h1.C1132w;
import p115n1.AbstractC1965b;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.b */
/* loaded from: classes.dex */
public final class C2400b implements InterfaceC2412h {

    /* renamed from: a */
    public final /* synthetic */ int f8458a;

    /* renamed from: b */
    public final C1131v f8459b;

    /* renamed from: c */
    public final C1132w f8460c;

    /* renamed from: d */
    public final String f8461d;

    /* renamed from: e */
    public final int f8462e;

    /* renamed from: f */
    public String f8463f;

    /* renamed from: g */
    public InterfaceC1980i0 f8464g;

    /* renamed from: h */
    public int f8465h;

    /* renamed from: i */
    public int f8466i;

    /* renamed from: j */
    public boolean f8467j;

    /* renamed from: k */
    public long f8468k;

    /* renamed from: l */
    public C0249w f8469l;

    /* renamed from: m */
    public int f8470m;

    /* renamed from: n */
    public long f8471n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2400b() {
        this(null, 0, 0);
        this.f8458a = 0;
    }

    /* renamed from: b */
    private final void m4243b(boolean z7) {
    }

    /* renamed from: g */
    private final void m4244g(boolean z7) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03e4  */
    @Override // p168t2.InterfaceC2412h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4245a(C1132w c1132w) {
        int i;
        int i4;
        int i8;
        String str;
        int i9;
        int iM2494k;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        switch (this.f8458a) {
            case 0:
                AbstractC1101a.m2360k(this.f8464g);
                while (c1132w.m2515a() > 0) {
                    int i22 = this.f8465h;
                    C1132w c1132w2 = this.f8460c;
                    if (i22 == 0) {
                        while (true) {
                            if (c1132w.m2515a() <= 0) {
                                break;
                            }
                            if (this.f8467j) {
                                int iM2535u = c1132w.m2535u();
                                if (iM2535u == 119) {
                                    this.f8467j = false;
                                    this.f8465h = 1;
                                    byte[] bArr = c1132w2.f4799a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f8466i = 2;
                                } else {
                                    this.f8467j = iM2535u == 11;
                                }
                            } else {
                                this.f8467j = c1132w.m2535u() == 11;
                            }
                        }
                    } else if (i22 == 1) {
                        byte[] bArr2 = c1132w2.f4799a;
                        int iMin = Math.min(c1132w.m2515a(), 128 - this.f8466i);
                        c1132w.m2519e(bArr2, this.f8466i, iMin);
                        int i23 = this.f8466i + iMin;
                        this.f8466i = i23;
                        if (i23 == 128) {
                            C1131v c1131v = this.f8459b;
                            c1131v.m2502s(0);
                            int[] iArr = AbstractC1965b.f7270f;
                            int[] iArr2 = AbstractC1965b.f7268d;
                            int iM2492i = c1131v.m2492i();
                            c1131v.m2505v(40);
                            Object[] objArr = c1131v.m2494k(5) > 10;
                            c1131v.m2502s(iM2492i);
                            if (objArr == true) {
                                c1131v.m2505v(16);
                                int iM2494k2 = c1131v.m2494k(2);
                                char c8 = iM2494k2 != 0 ? iM2494k2 != 1 ? iM2494k2 != 2 ? '\uffff' : (char) 2 : (char) 1 : (char) 0;
                                c1131v.m2505v(3);
                                iM2494k = (c1131v.m2494k(11) + 1) * 2;
                                int iM2494k3 = c1131v.m2494k(2);
                                if (iM2494k3 == 3) {
                                    i10 = AbstractC1965b.f7269e[c1131v.m2494k(2)];
                                    i11 = 3;
                                    i12 = 6;
                                } else {
                                    int iM2494k4 = c1131v.m2494k(2);
                                    int i24 = AbstractC1965b.f7267c[iM2494k4];
                                    i10 = iArr2[iM2494k3];
                                    i11 = iM2494k4;
                                    i12 = i24;
                                }
                                i8 = i12 * 256;
                                int i25 = (iM2494k * i10) / (i12 * 32);
                                int iM2494k5 = c1131v.m2494k(3);
                                boolean zM2493j = c1131v.m2493j();
                                i4 = iArr[iM2494k5] + (zM2493j ? 1 : 0);
                                c1131v.m2505v(10);
                                if (c1131v.m2493j()) {
                                    c1131v.m2505v(8);
                                }
                                if (iM2494k5 == 0) {
                                    c1131v.m2505v(5);
                                    if (c1131v.m2493j()) {
                                        c1131v.m2505v(8);
                                    }
                                }
                                if (c8 == 1 && c1131v.m2493j()) {
                                    c1131v.m2505v(16);
                                }
                                if (c1131v.m2493j()) {
                                    if (iM2494k5 > 2) {
                                        c1131v.m2505v(2);
                                    }
                                    if ((iM2494k5 & 1) == 0 || iM2494k5 <= 2) {
                                        i17 = 6;
                                    } else {
                                        i17 = 6;
                                        c1131v.m2505v(6);
                                    }
                                    if ((iM2494k5 & 4) != 0) {
                                        c1131v.m2505v(i17);
                                    }
                                    if (zM2493j && c1131v.m2493j()) {
                                        c1131v.m2505v(5);
                                    }
                                    if (c8 == 0) {
                                        if (c1131v.m2493j()) {
                                            i18 = 6;
                                            c1131v.m2505v(6);
                                        } else {
                                            i18 = 6;
                                        }
                                        if (iM2494k5 == 0 && c1131v.m2493j()) {
                                            c1131v.m2505v(i18);
                                        }
                                        if (c1131v.m2493j()) {
                                            c1131v.m2505v(i18);
                                        }
                                        int iM2494k6 = c1131v.m2494k(2);
                                        if (iM2494k6 == 1) {
                                            c1131v.m2505v(5);
                                            i20 = 2;
                                        } else {
                                            if (iM2494k6 == 2) {
                                                c1131v.m2505v(12);
                                            } else if (iM2494k6 == 3) {
                                                int iM2494k7 = c1131v.m2494k(5);
                                                if (c1131v.m2493j()) {
                                                    c1131v.m2505v(5);
                                                    if (c1131v.m2493j()) {
                                                        i21 = 4;
                                                        c1131v.m2505v(4);
                                                    } else {
                                                        i21 = 4;
                                                    }
                                                    if (c1131v.m2493j()) {
                                                        c1131v.m2505v(i21);
                                                    }
                                                    if (c1131v.m2493j()) {
                                                        c1131v.m2505v(i21);
                                                    }
                                                    if (c1131v.m2493j()) {
                                                        c1131v.m2505v(i21);
                                                    }
                                                    if (c1131v.m2493j()) {
                                                        c1131v.m2505v(i21);
                                                    }
                                                    if (c1131v.m2493j()) {
                                                        c1131v.m2505v(i21);
                                                    }
                                                    if (c1131v.m2493j()) {
                                                        c1131v.m2505v(i21);
                                                    }
                                                    if (c1131v.m2493j()) {
                                                        if (c1131v.m2493j()) {
                                                            c1131v.m2505v(i21);
                                                        }
                                                        if (c1131v.m2493j()) {
                                                            c1131v.m2505v(i21);
                                                        }
                                                    }
                                                }
                                                if (c1131v.m2493j()) {
                                                    c1131v.m2505v(5);
                                                    if (c1131v.m2493j()) {
                                                        c1131v.m2505v(7);
                                                        if (c1131v.m2493j()) {
                                                            i19 = 8;
                                                            c1131v.m2505v(8);
                                                        } else {
                                                            i19 = 8;
                                                        }
                                                        i20 = 2;
                                                        c1131v.m2505v((iM2494k7 + 2) * i19);
                                                        c1131v.m2487d();
                                                    }
                                                }
                                            }
                                            i20 = 2;
                                        }
                                        if (iM2494k5 < i20) {
                                            if (c1131v.m2493j()) {
                                                c1131v.m2505v(14);
                                            }
                                            if (iM2494k5 == 0 && c1131v.m2493j()) {
                                                c1131v.m2505v(14);
                                            }
                                        }
                                        if (c1131v.m2493j()) {
                                            i13 = i11;
                                            if (i13 == 0) {
                                                c1131v.m2505v(5);
                                            } else {
                                                for (int i26 = 0; i26 < i12; i26++) {
                                                    if (c1131v.m2493j()) {
                                                        c1131v.m2505v(5);
                                                    }
                                                }
                                            }
                                        }
                                        if (c1131v.m2493j()) {
                                        }
                                        if (c8 == 0) {
                                            c1131v.m2504u();
                                        }
                                        if (c8 == 2) {
                                            i15 = 6;
                                            if (!c1131v.m2493j()) {
                                                i9 = i25;
                                            }
                                        }
                                    }
                                } else {
                                    i13 = i11;
                                    if (c1131v.m2493j()) {
                                        i14 = 3;
                                    } else {
                                        c1131v.m2505v(5);
                                        if (iM2494k5 == 2) {
                                            c1131v.m2505v(4);
                                        }
                                        if (iM2494k5 >= 6) {
                                            c1131v.m2505v(2);
                                        }
                                        if (c1131v.m2493j()) {
                                            i16 = 8;
                                            c1131v.m2505v(8);
                                        } else {
                                            i16 = 8;
                                        }
                                        if (iM2494k5 == 0 && c1131v.m2493j()) {
                                            c1131v.m2505v(i16);
                                        }
                                        i14 = 3;
                                        if (iM2494k3 < 3) {
                                            c1131v.m2504u();
                                        }
                                    }
                                    if (c8 == 0 && i13 != i14) {
                                        c1131v.m2504u();
                                    }
                                    if (c8 == 2 || !(i13 == i14 || c1131v.m2493j())) {
                                        i15 = 6;
                                    } else {
                                        i15 = 6;
                                        c1131v.m2505v(6);
                                    }
                                    str = (!c1131v.m2493j() && c1131v.m2494k(i15) == 1 && c1131v.m2494k(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                    i9 = i25;
                                }
                            } else {
                                c1131v.m2505v(32);
                                int iM2494k8 = c1131v.m2494k(2);
                                String str2 = iM2494k8 == 3 ? null : "audio/ac3";
                                int iM2494k9 = c1131v.m2494k(6);
                                int i27 = AbstractC1965b.f7271g[iM2494k9 / 2] * 1000;
                                int iM3831g = AbstractC1965b.m3831g(iM2494k8, iM2494k9);
                                c1131v.m2505v(8);
                                int iM2494k10 = c1131v.m2494k(3);
                                if ((iM2494k10 & 1) == 0 || iM2494k10 == 1) {
                                    i = 2;
                                } else {
                                    i = 2;
                                    c1131v.m2505v(2);
                                }
                                if ((iM2494k10 & 4) != 0) {
                                    c1131v.m2505v(i);
                                }
                                if (iM2494k10 == i) {
                                    c1131v.m2505v(i);
                                }
                                int i28 = iM2494k8 < 3 ? iArr2[iM2494k8] : -1;
                                i4 = iArr[iM2494k10] + (c1131v.m2493j() ? 1 : 0);
                                i8 = 1536;
                                str = str2;
                                i9 = i27;
                                iM2494k = iM3831g;
                                i10 = i28;
                            }
                            C0249w c0249w = this.f8469l;
                            if (c0249w == null || i4 != c0249w.f1498C || i10 != c0249w.f1499D || !Objects.equals(str, c0249w.f1522n)) {
                                C0246v c0246v = new C0246v();
                                c0246v.f1435a = this.f8463f;
                                c0246v.f1447m = AbstractC0244u0.m687p(str);
                                c0246v.f1425B = i4;
                                c0246v.f1426C = i10;
                                c0246v.f1438d = this.f8461d;
                                c0246v.f1440f = this.f8462e;
                                c0246v.f1443i = i9;
                                if ("audio/ac3".equals(str)) {
                                    c0246v.f1442h = i9;
                                }
                                C0249w c0249w2 = new C0249w(c0246v);
                                this.f8469l = c0249w2;
                                this.f8464g.format(c0249w2);
                            }
                            this.f8470m = iM2494k;
                            this.f8468k = (i8 * 1000000) / this.f8469l.f1499D;
                            c1132w2.m2513G(0);
                            this.f8464g.sampleData(c1132w2, 128);
                            this.f8465h = 2;
                        }
                    } else if (i22 == 2) {
                        int iMin2 = Math.min(c1132w.m2515a(), this.f8470m - this.f8466i);
                        this.f8464g.sampleData(c1132w, iMin2);
                        int i29 = this.f8466i + iMin2;
                        this.f8466i = i29;
                        if (i29 == this.f8470m) {
                            AbstractC1101a.m2359j(this.f8471n != -9223372036854775807L);
                            this.f8464g.sampleMetadata(this.f8471n, 1, this.f8470m, 0, null);
                            this.f8471n += this.f8468k;
                            this.f8465h = 0;
                        }
                    }
                }
                break;
            default:
                AbstractC1101a.m2360k(this.f8464g);
                while (c1132w.m2515a() > 0) {
                    int i30 = this.f8465h;
                    C1132w c1132w3 = this.f8460c;
                    if (i30 == 0) {
                        while (c1132w.m2515a() > 0) {
                            if (this.f8467j) {
                                int iM2535u2 = c1132w.m2535u();
                                this.f8467j = iM2535u2 == 172;
                                if (iM2535u2 == 64 || iM2535u2 == 65) {
                                    Object[] objArr2 = iM2535u2 == 65;
                                    this.f8465h = 1;
                                    byte[] bArr3 = c1132w3.f4799a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr2 == true ? 65 : 64);
                                    this.f8466i = 2;
                                }
                            } else {
                                this.f8467j = c1132w.m2535u() == 172;
                            }
                        }
                    } else if (i30 == 1) {
                        byte[] bArr4 = c1132w3.f4799a;
                        int iMin3 = Math.min(c1132w.m2515a(), 16 - this.f8466i);
                        c1132w.m2519e(bArr4, this.f8466i, iMin3);
                        int i31 = this.f8466i + iMin3;
                        this.f8466i = i31;
                        if (i31 == 16) {
                            C1131v c1131v2 = this.f8459b;
                            c1131v2.m2502s(0);
                            C0644h c0644hM3837m = AbstractC1965b.m3837m(c1131v2);
                            int i32 = c0644hM3837m.f2541a;
                            C0249w c0249w3 = this.f8469l;
                            if (c0249w3 == null || 2 != c0249w3.f1498C || i32 != c0249w3.f1499D || !"audio/ac4".equals(c0249w3.f1522n)) {
                                C0246v c0246v2 = new C0246v();
                                c0246v2.f1435a = this.f8463f;
                                c0246v2.f1447m = AbstractC0244u0.m687p("audio/ac4");
                                c0246v2.f1425B = 2;
                                c0246v2.f1426C = i32;
                                c0246v2.f1438d = this.f8461d;
                                c0246v2.f1440f = this.f8462e;
                                C0249w c0249w4 = new C0249w(c0246v2);
                                this.f8469l = c0249w4;
                                this.f8464g.format(c0249w4);
                            }
                            this.f8470m = c0644hM3837m.f2542b;
                            this.f8468k = (c0644hM3837m.f2543c * 1000000) / this.f8469l.f1499D;
                            c1132w3.m2513G(0);
                            this.f8464g.sampleData(c1132w3, 16);
                            this.f8465h = 2;
                        }
                    } else if (i30 == 2) {
                        int iMin4 = Math.min(c1132w.m2515a(), this.f8470m - this.f8466i);
                        this.f8464g.sampleData(c1132w, iMin4);
                        int i33 = this.f8466i + iMin4;
                        this.f8466i = i33;
                        if (i33 == this.f8470m) {
                            AbstractC1101a.m2359j(this.f8471n != -9223372036854775807L);
                            this.f8464g.sampleMetadata(this.f8471n, 1, this.f8470m, 0, null);
                            this.f8471n += this.f8468k;
                            this.f8465h = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: c */
    public final void mo4246c() {
        switch (this.f8458a) {
            case 0:
                this.f8465h = 0;
                this.f8466i = 0;
                this.f8467j = false;
                this.f8471n = -9223372036854775807L;
                break;
            default:
                this.f8465h = 0;
                this.f8466i = 0;
                this.f8467j = false;
                this.f8471n = -9223372036854775807L;
                break;
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: d */
    public final void mo4247d(boolean z7) {
        int i = this.f8458a;
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: e */
    public final void mo4248e(InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
        switch (this.f8458a) {
            case 0:
                c2411g0.m4255a();
                c2411g0.m4256b();
                this.f8463f = c2411g0.f8573e;
                c2411g0.m4256b();
                this.f8464g = interfaceC1989p.track(c2411g0.f8572d, 1);
                break;
            default:
                c2411g0.m4255a();
                c2411g0.m4256b();
                this.f8463f = c2411g0.f8573e;
                c2411g0.m4256b();
                this.f8464g = interfaceC1989p.track(c2411g0.f8572d, 1);
                break;
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: f */
    public final void mo4249f(int i, long j) {
        switch (this.f8458a) {
            case 0:
                this.f8471n = j;
                break;
            default:
                this.f8471n = j;
                break;
        }
    }

    public C2400b(String str, int i, int i4) {
        this.f8458a = i4;
        switch (i4) {
            case 1:
                C1131v c1131v = new C1131v(new byte[16], 16);
                this.f8459b = c1131v;
                this.f8460c = new C1132w((byte[]) c1131v.f4792b);
                this.f8465h = 0;
                this.f8466i = 0;
                this.f8467j = false;
                this.f8471n = -9223372036854775807L;
                this.f8461d = str;
                this.f8462e = i;
                break;
            default:
                C1131v c1131v2 = new C1131v(new byte[128], 128);
                this.f8459b = c1131v2;
                this.f8460c = new C1132w((byte[]) c1131v2.f4792b);
                this.f8465h = 0;
                this.f8471n = -9223372036854775807L;
                this.f8461d = str;
                this.f8462e = i;
                break;
        }
    }
}
