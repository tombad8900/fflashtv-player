package p168t2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0216l;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import java.util.Collections;
import p005a4.C0073c;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1105c;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p071i1.AbstractC1237p;
import p071i1.C1229h;
import p071i1.C1233l;
import p071i1.C1240s;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.r */
/* loaded from: classes.dex */
public final class C2424r implements InterfaceC2412h {

    /* renamed from: a */
    public final C0073c f8685a;

    /* renamed from: b */
    public String f8686b;

    /* renamed from: c */
    public InterfaceC1980i0 f8687c;

    /* renamed from: d */
    public C2423q f8688d;

    /* renamed from: e */
    public boolean f8689e;

    /* renamed from: l */
    public long f8696l;

    /* renamed from: f */
    public final boolean[] f8690f = new boolean[3];

    /* renamed from: g */
    public final C2430x f8691g = new C2430x(32);

    /* renamed from: h */
    public final C2430x f8692h = new C2430x(33);

    /* renamed from: i */
    public final C2430x f8693i = new C2430x(34);

    /* renamed from: j */
    public final C2430x f8694j = new C2430x(39);

    /* renamed from: k */
    public final C2430x f8695k = new C2430x(40);

    /* renamed from: m */
    public long f8697m = -9223372036854775807L;

    /* renamed from: n */
    public final C1132w f8698n = new C1132w();

    public C2424r(C0073c c0073c) {
        this.f8685a = c0073c;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0240  */
    @Override // p168t2.InterfaceC2412h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4245a(C1132w c1132w) {
        int i;
        byte[] bArr;
        boolean z7;
        int i4;
        int i8;
        int i9;
        int i10;
        byte[] bArr2;
        boolean zM4320e;
        C2430x c2430x;
        int i11;
        boolean z8;
        boolean z9;
        boolean z10;
        byte[] bArr3;
        C1132w c1132w2 = c1132w;
        AbstractC1101a.m2360k(this.f8687c);
        int i12 = AbstractC1118i0.f4750a;
        while (c1132w2.m2515a() > 0) {
            int i13 = c1132w2.f4800b;
            int i14 = c1132w2.f4801c;
            byte[] bArr4 = c1132w2.f4799a;
            this.f8696l += c1132w2.m2515a();
            this.f8687c.sampleData(c1132w2, c1132w2.m2515a());
            while (i13 < i14) {
                int iM2681b = AbstractC1237p.m2681b(bArr4, i13, i14, this.f8690f);
                if (iM2681b == i14) {
                    m4295b(bArr4, i13, i14);
                    return;
                }
                int i15 = iM2681b + 3;
                int i16 = (bArr4[i15] & 126) >> 1;
                int i17 = iM2681b - i13;
                if (i17 > 0) {
                    m4295b(bArr4, i13, iM2681b);
                }
                int i18 = i14 - iM2681b;
                long j = this.f8696l - i18;
                int i19 = i17 < 0 ? -i17 : 0;
                long j8 = this.f8697m;
                C1240s c1240s = (C1240s) this.f8685a.f326m;
                C2423q c2423q = this.f8688d;
                boolean z11 = this.f8689e;
                if (c2423q.f8681j && c2423q.f8678g) {
                    c2423q.f8684m = c2423q.f8674c;
                    c2423q.f8681j = false;
                } else {
                    if (c2423q.f8679h || c2423q.f8678g) {
                        if (z11 && c2423q.f8680i) {
                            i = i14;
                            bArr = bArr4;
                            c2423q.m4294a(((int) (j - c2423q.f8673b)) + i18);
                        } else {
                            i = i14;
                            bArr = bArr4;
                        }
                        c2423q.f8682k = c2423q.f8673b;
                        c2423q.f8683l = c2423q.f8676e;
                        c2423q.f8684m = c2423q.f8674c;
                        c2423q.f8680i = true;
                    }
                    z7 = this.f8689e;
                    C2430x c2430x2 = this.f8691g;
                    C2430x c2430x3 = this.f8692h;
                    C2430x c2430x4 = this.f8693i;
                    if (z7) {
                        c2430x2.m4320e(i19);
                        c2430x3.m4320e(i19);
                        c2430x4.m4320e(i19);
                        if (c2430x2.f8762e && c2430x3.f8762e && c2430x4.f8762e) {
                            String str = this.f8686b;
                            i8 = i;
                            int i20 = c2430x2.f8760c;
                            i9 = i15;
                            byte[] bArr5 = new byte[c2430x3.f8760c + i20 + c2430x4.f8760c];
                            bArr2 = bArr;
                            i4 = i18;
                            System.arraycopy((byte[]) c2430x2.f8763f, 0, bArr5, 0, i20);
                            i10 = i16;
                            System.arraycopy((byte[]) c2430x3.f8763f, 0, bArr5, c2430x2.f8760c, c2430x3.f8760c);
                            System.arraycopy((byte[]) c2430x4.f8763f, 0, bArr5, c2430x2.f8760c + c2430x3.f8760c, c2430x4.f8760c);
                            String strM2385a = null;
                            C1233l c1233lM2686g = AbstractC1237p.m2686g((byte[]) c2430x3.f8763f, 3, c2430x3.f8760c, null);
                            C1229h c1229h = c1233lM2686g.f5136a;
                            if (c1229h != null) {
                                bArr3 = bArr5;
                                strM2385a = AbstractC1105c.m2385a(c1229h.f5122a, c1229h.f5123b, c1229h.f5124c, c1229h.f5125d, c1229h.f5126e, c1229h.f5127f);
                            } else {
                                bArr3 = bArr5;
                            }
                            C0246v c0246v = new C0246v();
                            c0246v.f1435a = str;
                            c0246v.f1447m = AbstractC0244u0.m687p("video/hevc");
                            c0246v.f1444j = strM2385a;
                            c0246v.f1454t = c1233lM2686g.f5139d;
                            c0246v.f1455u = c1233lM2686g.f5140e;
                            c0246v.f1424A = new C0216l(c1233lM2686g.f5143h, c1233lM2686g.f5144i, c1233lM2686g.f5145j, c1233lM2686g.f5137b + 8, c1233lM2686g.f5138c + 8, null);
                            c0246v.f1458x = c1233lM2686g.f5141f;
                            c0246v.f1449o = c1233lM2686g.f5142g;
                            c0246v.f1450p = Collections.singletonList(bArr3);
                            C0249w c0249w = new C0249w(c0246v);
                            this.f8687c.format(c0249w);
                            int i21 = c0249w.f1524p;
                            if (i21 == -1) {
                                throw new IllegalStateException();
                            }
                            c1240s.getClass();
                            AbstractC1101a.m2359j(i21 >= 0);
                            c1240s.f5176a = i21;
                            c1240s.m2699i(i21);
                            this.f8689e = true;
                        } else {
                            i4 = i18;
                            i8 = i;
                            i9 = i15;
                            i10 = i16;
                            bArr2 = bArr;
                        }
                    }
                    C2430x c2430x5 = this.f8694j;
                    zM4320e = c2430x5.m4320e(i19);
                    C1132w c1132w3 = this.f8698n;
                    if (zM4320e) {
                        c1132w3.m2511E((byte[]) c2430x5.f8763f, AbstractC1237p.m2690k((byte[]) c2430x5.f8763f, c2430x5.f8760c));
                        c1132w3.m2514H(5);
                        c1240s.m2691a(j8, c1132w3);
                    }
                    c2430x = this.f8695k;
                    if (c2430x.m4320e(i19)) {
                        c1132w3.m2511E((byte[]) c2430x.f8763f, AbstractC1237p.m2690k((byte[]) c2430x.f8763f, c2430x.f8760c));
                        c1132w3.m2514H(5);
                        c1240s.m2691a(j8, c1132w3);
                    }
                    long j9 = this.f8697m;
                    C2423q c2423q2 = this.f8688d;
                    boolean z12 = this.f8689e;
                    c2423q2.f8678g = false;
                    c2423q2.f8679h = false;
                    c2423q2.f8676e = j9;
                    c2423q2.f8675d = 0;
                    c2423q2.f8673b = j;
                    i11 = i10;
                    if (i11 >= 32 || i11 == 40) {
                        z8 = true;
                        z9 = false;
                    } else {
                        if (!c2423q2.f8680i || c2423q2.f8681j) {
                            z9 = false;
                        } else {
                            if (z12) {
                                c2423q2.m4294a(i4);
                            }
                            z9 = false;
                            c2423q2.f8680i = false;
                        }
                        if ((32 > i11 || i11 > 35) && i11 != 39) {
                            z8 = true;
                        } else {
                            z8 = true;
                            c2423q2.f8679h = !c2423q2.f8681j;
                            c2423q2.f8681j = true;
                        }
                    }
                    z10 = (i11 >= 16 || i11 > 21) ? z9 : z8;
                    c2423q2.f8674c = z10;
                    if (!z10 && i11 > 9) {
                        z8 = z9;
                    }
                    c2423q2.f8677f = z8;
                    if (this.f8689e) {
                        c2430x2.m4322g(i11);
                        c2430x3.m4322g(i11);
                        c2430x4.m4322g(i11);
                    }
                    c2430x5.m4322g(i11);
                    c2430x.m4322g(i11);
                    i14 = i8;
                    i13 = i9;
                    bArr4 = bArr2;
                }
                i = i14;
                bArr = bArr4;
                z7 = this.f8689e;
                C2430x c2430x22 = this.f8691g;
                C2430x c2430x32 = this.f8692h;
                C2430x c2430x42 = this.f8693i;
                if (z7) {
                }
                C2430x c2430x52 = this.f8694j;
                zM4320e = c2430x52.m4320e(i19);
                C1132w c1132w32 = this.f8698n;
                if (zM4320e) {
                }
                c2430x = this.f8695k;
                if (c2430x.m4320e(i19)) {
                }
                long j92 = this.f8697m;
                C2423q c2423q22 = this.f8688d;
                boolean z122 = this.f8689e;
                c2423q22.f8678g = false;
                c2423q22.f8679h = false;
                c2423q22.f8676e = j92;
                c2423q22.f8675d = 0;
                c2423q22.f8673b = j;
                i11 = i10;
                if (i11 >= 32) {
                    z8 = true;
                    z9 = false;
                }
                if (i11 >= 16) {
                }
                c2423q22.f8674c = z10;
                if (!z10) {
                    z8 = z9;
                }
                c2423q22.f8677f = z8;
                if (this.f8689e) {
                }
                c2430x52.m4322g(i11);
                c2430x.m4322g(i11);
                i14 = i8;
                i13 = i9;
                bArr4 = bArr2;
            }
            c1132w2 = c1132w;
        }
    }

    /* renamed from: b */
    public final void m4295b(byte[] bArr, int i, int i4) {
        C2423q c2423q = this.f8688d;
        if (c2423q.f8677f) {
            int i8 = c2423q.f8675d;
            int i9 = (i + 2) - i8;
            if (i9 < i4) {
                c2423q.f8678g = (bArr[i9] & 128) != 0;
                c2423q.f8677f = false;
            } else {
                c2423q.f8675d = (i4 - i) + i8;
            }
        }
        if (!this.f8689e) {
            this.f8691g.m4316a(bArr, i, i4);
            this.f8692h.m4316a(bArr, i, i4);
            this.f8693i.m4316a(bArr, i, i4);
        }
        this.f8694j.m4316a(bArr, i, i4);
        this.f8695k.m4316a(bArr, i, i4);
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: c */
    public final void mo4246c() {
        this.f8696l = 0L;
        this.f8697m = -9223372036854775807L;
        AbstractC1237p.m2680a(this.f8690f);
        this.f8691g.m4321f();
        this.f8692h.m4321f();
        this.f8693i.m4321f();
        this.f8694j.m4321f();
        this.f8695k.m4321f();
        ((C1240s) this.f8685a.f326m).m2699i(0);
        C2423q c2423q = this.f8688d;
        if (c2423q != null) {
            c2423q.f8677f = false;
            c2423q.f8678g = false;
            c2423q.f8679h = false;
            c2423q.f8680i = false;
            c2423q.f8681j = false;
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: d */
    public final void mo4247d(boolean z7) {
        AbstractC1101a.m2360k(this.f8687c);
        int i = AbstractC1118i0.f4750a;
        if (z7) {
            ((C1240s) this.f8685a.f326m).m2699i(0);
            C2423q c2423q = this.f8688d;
            long j = this.f8696l;
            c2423q.f8684m = c2423q.f8674c;
            c2423q.m4294a((int) (j - c2423q.f8673b));
            c2423q.f8682k = c2423q.f8673b;
            c2423q.f8673b = j;
            c2423q.m4294a(0);
            c2423q.f8680i = false;
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: e */
    public final void mo4248e(InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
        c2411g0.m4255a();
        c2411g0.m4256b();
        this.f8686b = c2411g0.f8573e;
        c2411g0.m4256b();
        InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(c2411g0.f8572d, 2);
        this.f8687c = interfaceC1980i0Track;
        this.f8688d = new C2423q(interfaceC1980i0Track);
        this.f8685a.m296s(interfaceC1989p, c2411g0);
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: f */
    public final void mo4249f(int i, long j) {
        this.f8697m = j;
    }
}
