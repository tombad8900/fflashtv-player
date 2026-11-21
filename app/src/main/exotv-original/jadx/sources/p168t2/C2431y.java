package p168t2;

import p002a1.AbstractC0008a1;
import p063h1.AbstractC1101a;
import p063h1.C1108d0;
import p063h1.C1131v;
import p063h1.C1132w;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.y */
/* loaded from: classes.dex */
public final class C2431y implements InterfaceC2413h0 {

    /* renamed from: a */
    public final InterfaceC2412h f8764a;

    /* renamed from: b */
    public final C1131v f8765b = new C1131v(new byte[10], 10);

    /* renamed from: c */
    public int f8766c = 0;

    /* renamed from: d */
    public int f8767d;

    /* renamed from: e */
    public C1108d0 f8768e;

    /* renamed from: f */
    public boolean f8769f;

    /* renamed from: g */
    public boolean f8770g;

    /* renamed from: h */
    public boolean f8771h;

    /* renamed from: i */
    public int f8772i;

    /* renamed from: j */
    public int f8773j;

    /* renamed from: k */
    public boolean f8774k;

    /* renamed from: l */
    public long f8775l;

    public C2431y(InterfaceC2412h interfaceC2412h) {
        this.f8764a = interfaceC2412h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [h1.v] */
    /* JADX WARN: Type inference failed for: r4v0, types: [t2.h] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // p168t2.InterfaceC2413h0
    /* renamed from: a */
    public final void mo4250a(C1132w c1132w, int i) {
        int i4;
        int i8;
        int i9;
        AbstractC1101a.m2360k(this.f8768e);
        int i10 = i & 1;
        ?? r42 = this.f8764a;
        int i11 = 2;
        ?? r8 = 0;
        if (i10 != 0) {
            int i12 = this.f8766c;
            if (i12 != 0 && i12 != 1) {
                if (i12 == 2) {
                    AbstractC1101a.m2348F("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f8773j != -1) {
                        AbstractC1101a.m2348F("PesReader", "Unexpected start indicator: expected " + this.f8773j + " more bytes");
                    }
                    r42.mo4247d(c1132w.f4801c == 0);
                }
            }
            this.f8766c = 1;
            this.f8767d = 0;
        }
        int i13 = i;
        while (c1132w.m2515a() > 0) {
            int i14 = this.f8766c;
            if (i14 != 0) {
                ?? r11 = this.f8765b;
                if (i14 != 1) {
                    if (i14 == i11) {
                        if (m4323d(c1132w, (byte[]) r11.f4792b, Math.min(10, this.f8772i)) && m4323d(c1132w, null, this.f8772i)) {
                            r11.m2502s(r8);
                            this.f8775l = -9223372036854775807L;
                            if (this.f8769f) {
                                r11.m2505v(4);
                                r11.m2505v(1);
                                r11.m2505v(1);
                                long jM2494k = (r11.m2494k(15) << 15) | (r11.m2494k(3) << 30) | r11.m2494k(15);
                                r11.m2505v(1);
                                if (!this.f8771h && this.f8770g) {
                                    r11.m2505v(4);
                                    r11.m2505v(1);
                                    r11.m2505v(1);
                                    r11.m2505v(1);
                                    this.f8768e.m2397b((r11.m2494k(3) << 30) | (r11.m2494k(15) << 15) | r11.m2494k(15));
                                    this.f8771h = true;
                                }
                                this.f8775l = this.f8768e.m2397b(jM2494k);
                            }
                            i13 |= this.f8774k ? 4 : 0;
                            r42.mo4249f(i13, this.f8775l);
                            this.f8766c = 3;
                            this.f8767d = 0;
                            r8 = 0;
                            i11 = 2;
                        }
                    } else {
                        if (i14 != 3) {
                            throw new IllegalStateException();
                        }
                        int iM2515a = c1132w.m2515a();
                        int i15 = this.f8773j;
                        int i16 = i15 == -1 ? r8 : iM2515a - i15;
                        if (i16 > 0) {
                            iM2515a -= i16;
                            c1132w.m2512F(c1132w.f4800b + iM2515a);
                        }
                        r42.mo4245a(c1132w);
                        int i17 = this.f8773j;
                        if (i17 != -1) {
                            int i18 = i17 - iM2515a;
                            this.f8773j = i18;
                            if (i18 == 0) {
                                r42.mo4247d(r8);
                                this.f8766c = 1;
                                this.f8767d = r8;
                            }
                        }
                    }
                    i4 = i11;
                    i8 = r8;
                } else {
                    i8 = r8;
                    if (m4323d(c1132w, (byte[]) r11.f4792b, 9)) {
                        r11.m2502s(i8);
                        int iM2494k = r11.m2494k(24);
                        if (iM2494k != 1) {
                            AbstractC0008a1.m23s("Unexpected start code prefix: ", iM2494k, "PesReader");
                            this.f8773j = -1;
                            i9 = 0;
                            i4 = 2;
                        } else {
                            r11.m2505v(8);
                            int iM2494k2 = r11.m2494k(16);
                            r11.m2505v(5);
                            this.f8774k = r11.m2493j();
                            i4 = 2;
                            r11.m2505v(2);
                            this.f8769f = r11.m2493j();
                            this.f8770g = r11.m2493j();
                            r11.m2505v(6);
                            int iM2494k3 = r11.m2494k(8);
                            this.f8772i = iM2494k3;
                            if (iM2494k2 == 0) {
                                this.f8773j = -1;
                            } else {
                                int i19 = (iM2494k2 - 3) - iM2494k3;
                                this.f8773j = i19;
                                if (i19 < 0) {
                                    AbstractC1101a.m2348F("PesReader", "Found negative packet payload size: " + this.f8773j);
                                    this.f8773j = -1;
                                }
                            }
                            i9 = 2;
                        }
                        this.f8766c = i9;
                        i8 = 0;
                        this.f8767d = 0;
                    } else {
                        i4 = 2;
                    }
                }
            } else {
                i4 = i11;
                i8 = r8;
                c1132w.m2514H(c1132w.m2515a());
            }
            r8 = i8;
            i11 = i4;
        }
    }

    @Override // p168t2.InterfaceC2413h0
    /* renamed from: b */
    public final void mo4251b(C1108d0 c1108d0, InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
        this.f8768e = c1108d0;
        this.f8764a.mo4248e(interfaceC1989p, c2411g0);
    }

    @Override // p168t2.InterfaceC2413h0
    /* renamed from: c */
    public final void mo4252c() {
        this.f8766c = 0;
        this.f8767d = 0;
        this.f8771h = false;
        this.f8764a.mo4246c();
    }

    /* renamed from: d */
    public final boolean m4323d(C1132w c1132w, byte[] bArr, int i) {
        int iMin = Math.min(c1132w.m2515a(), i - this.f8767d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c1132w.m2514H(iMin);
        } else {
            c1132w.m2519e(bArr, this.f8767d, iMin);
        }
        int i4 = this.f8767d + iMin;
        this.f8767d = i4;
        return i4 == i;
    }
}
