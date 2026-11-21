package p158s1;

import androidx.media3.common.C0241t0;
import androidx.media3.common.C0247v0;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.source.preload.C0456a;
import java.util.Arrays;
import p052f6.AbstractC0983m0;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p063h1.C1132w;
import p115n1.AbstractC1965b;
import p115n1.C1964a0;
import p115n1.C1991r;
import p115n1.C1992s;
import p115n1.C1993t;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;
import p215z1.C2870a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s1.c */
/* loaded from: classes.dex */
public final class C2340c implements InterfaceC1987n {

    /* renamed from: e */
    public InterfaceC1989p f8201e;

    /* renamed from: f */
    public InterfaceC1980i0 f8202f;

    /* renamed from: h */
    public C0241t0 f8204h;

    /* renamed from: i */
    public C1993t f8205i;

    /* renamed from: j */
    public int f8206j;

    /* renamed from: k */
    public int f8207k;

    /* renamed from: l */
    public C2339b f8208l;

    /* renamed from: m */
    public int f8209m;

    /* renamed from: n */
    public long f8210n;

    /* renamed from: a */
    public final byte[] f8197a = new byte[42];

    /* renamed from: b */
    public final C1132w f8198b = new C1132w(new byte[DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE], 0);

    /* renamed from: c */
    public final boolean f8199c = false;

    /* renamed from: d */
    public final C1991r f8200d = new C1991r();

    /* renamed from: g */
    public int f8203g = 0;

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        this.f8201e = interfaceC1989p;
        this.f8202f = interfaceC1989p.track(0, 1);
        interfaceC1989p.endTracks();
    }

    @Override // p115n1.InterfaceC1987n
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws Throwable {
        C1993t c1993t;
        int i;
        InterfaceC1968c0 c1992s;
        long j;
        long j8;
        boolean zM3827c;
        int i4 = this.f8203g;
        if (i4 == 0) {
            boolean z7 = !this.f8199c;
            interfaceC1988o.mo3860g();
            long jMo3856c = interfaceC1988o.mo3856c();
            C0241t0 c0241t0M3843s = AbstractC1965b.m3843s(interfaceC1988o, z7);
            interfaceC1988o.mo3861h((int) (interfaceC1988o.mo3856c() - jMo3856c));
            this.f8204h = c0241t0M3843s;
            this.f8203g = 1;
            return 0;
        }
        byte[] bArr = this.f8197a;
        if (i4 == 1) {
            interfaceC1988o.mo3862i(bArr, 0, bArr.length);
            interfaceC1988o.mo3860g();
            this.f8203g = 2;
            return 0;
        }
        int i8 = 4;
        int i9 = 3;
        if (i4 == 2) {
            C1132w c1132w = new C1132w(4);
            interfaceC1988o.readFully(c1132w.f4799a, 0, 4);
            if (c1132w.m2537w() != 1716281667) {
                throw C0247v0.createForMalformedContainer("Failed to read FLAC stream marker.", null);
            }
            this.f8203g = 3;
            return 0;
        }
        int i10 = 6;
        if (i4 == 3) {
            int i11 = 0;
            C1993t c1993t2 = this.f8205i;
            boolean z8 = false;
            while (!z8) {
                interfaceC1988o.mo3860g();
                byte[] bArr2 = new byte[i8];
                C1131v c1131v = new C1131v(bArr2, i8);
                int i12 = i11;
                interfaceC1988o.mo3862i(bArr2, i12, i8);
                boolean zM2493j = c1131v.m2493j();
                int iM2494k = c1131v.m2494k(i);
                int iM2494k2 = c1131v.m2494k(24) + i8;
                if (iM2494k == 0) {
                    byte[] bArr3 = new byte[38];
                    interfaceC1988o.readFully(bArr3, i12, 38);
                    c1993t2 = new C1993t(bArr3, i8);
                } else {
                    if (c1993t2 == null) {
                        throw new IllegalArgumentException();
                    }
                    C0241t0 c0241t0 = c1993t2.f7389l;
                    if (iM2494k == i9) {
                        C1132w c1132w2 = new C1132w(iM2494k2);
                        interfaceC1988o.readFully(c1132w2.f4799a, i12, iM2494k2);
                        c1993t2 = new C1993t(c1993t2.f7378a, c1993t2.f7379b, c1993t2.f7380c, c1993t2.f7381d, c1993t2.f7382e, c1993t2.f7384g, c1993t2.f7385h, c1993t2.f7387j, AbstractC1965b.m3845u(c1132w2), c1993t2.f7389l);
                    } else {
                        if (iM2494k == i8) {
                            C1132w c1132w3 = new C1132w(iM2494k2);
                            interfaceC1988o.readFully(c1132w3.f4799a, 0, iM2494k2);
                            c1132w3.m2514H(i8);
                            C0241t0 c0241t0M3842r = AbstractC1965b.m3842r(Arrays.asList((String[]) AbstractC1965b.m3846v(c1132w3, false, false).f6229j));
                            if (c0241t0 != null) {
                                c0241t0M3842r = c0241t0.m669b(c0241t0M3842r);
                            }
                            c1993t = new C1993t(c1993t2.f7378a, c1993t2.f7379b, c1993t2.f7380c, c1993t2.f7381d, c1993t2.f7382e, c1993t2.f7384g, c1993t2.f7385h, c1993t2.f7387j, c1993t2.f7388k, c0241t0M3842r);
                        } else if (iM2494k == i10) {
                            C1132w c1132w4 = new C1132w(iM2494k2);
                            interfaceC1988o.readFully(c1132w4.f4799a, 0, iM2494k2);
                            c1132w4.m2514H(4);
                            C0241t0 c0241t02 = new C0241t0(AbstractC0983m0.m2168n(C2870a.m4969a(c1132w4)));
                            if (c0241t0 != null) {
                                c0241t02 = c0241t0.m669b(c0241t02);
                            }
                            c1993t = new C1993t(c1993t2.f7378a, c1993t2.f7379b, c1993t2.f7380c, c1993t2.f7381d, c1993t2.f7382e, c1993t2.f7384g, c1993t2.f7385h, c1993t2.f7387j, c1993t2.f7388k, c0241t02);
                        } else {
                            interfaceC1988o.mo3861h(iM2494k2);
                        }
                        c1993t2 = c1993t;
                    }
                }
                int i13 = AbstractC1118i0.f4750a;
                this.f8205i = c1993t2;
                z8 = zM2493j;
                i8 = 4;
                i9 = 3;
                i = 7;
                i10 = 6;
                i11 = 0;
            }
            this.f8205i.getClass();
            this.f8206j = Math.max(this.f8205i.f7380c, 6);
            InterfaceC1980i0 interfaceC1980i0 = this.f8202f;
            int i14 = AbstractC1118i0.f4750a;
            interfaceC1980i0.format(this.f8205i.m3875c(bArr, this.f8204h));
            this.f8203g = 4;
            return 0;
        }
        long j9 = 0;
        if (i4 == 4) {
            interfaceC1988o.mo3860g();
            C1132w c1132w5 = new C1132w(2);
            interfaceC1988o.mo3862i(c1132w5.f4799a, 0, 2);
            int iM2507A = c1132w5.m2507A();
            if ((iM2507A >> 2) != 16382) {
                interfaceC1988o.mo3860g();
                throw C0247v0.createForMalformedContainer("First frame does not start with sync code.", null);
            }
            interfaceC1988o.mo3860g();
            this.f8207k = iM2507A;
            InterfaceC1989p interfaceC1989p = this.f8201e;
            int i15 = AbstractC1118i0.f4750a;
            long position = interfaceC1988o.getPosition();
            long length = interfaceC1988o.getLength();
            this.f8205i.getClass();
            C1993t c1993t3 = this.f8205i;
            if (c1993t3.f7388k != null) {
                c1992s = new C1992s(c1993t3, position, 0);
                i = 0;
            } else if (length == -1 || c1993t3.f7387j <= 0) {
                i = 0;
                c1992s = new C1992s(c1993t3.m3874b());
            } else {
                int i16 = this.f8207k;
                int i17 = c1993t3.f7380c;
                C0456a c0456a = new C0456a(13, c1993t3);
                C2338a c2338a = new C2338a(c1993t3, i16);
                long jM3874b = c1993t3.m3874b();
                long j10 = c1993t3.f7387j;
                int i18 = c1993t3.f7381d;
                if (i18 > 0) {
                    i = 0;
                    j = ((i18 + i17) / 2) + 1;
                } else {
                    i = 0;
                    int i19 = c1993t3.f7378a;
                    j = 64 + (((((i19 != c1993t3.f7379b || i19 <= 0) ? 4096L : i19) * c1993t3.f7384g) * c1993t3.f7385h) / 8);
                }
                C2339b c2339b = new C2339b(c0456a, c2338a, jM3874b, j10, position, length, j, Math.max(6, i17));
                this.f8208l = c2339b;
                c1992s = c2339b.f8193a;
            }
            interfaceC1989p.seekMap(c1992s);
            this.f8203g = 5;
            return i;
        }
        if (i4 != 5) {
            throw new IllegalStateException();
        }
        this.f8202f.getClass();
        this.f8205i.getClass();
        C2339b c2339b2 = this.f8208l;
        if (c2339b2 != null && c2339b2.f8195c != null) {
            return c2339b2.m4171b(interfaceC1988o, c1964a0);
        }
        if (this.f8210n == -1) {
            C1993t c1993t4 = this.f8205i;
            interfaceC1988o.mo3860g();
            interfaceC1988o.mo3857d(1);
            byte[] bArr4 = new byte[1];
            interfaceC1988o.mo3862i(bArr4, 0, 1);
            boolean z9 = (bArr4[0] & 1) == 1;
            interfaceC1988o.mo3857d(2);
            i = z9 ? 7 : 6;
            C1132w c1132w6 = new C1132w(i);
            byte[] bArr5 = c1132w6.f4799a;
            int i20 = 0;
            while (i20 < i) {
                int iMo3859f = interfaceC1988o.mo3859f(bArr5, i20, i - i20);
                if (iMo3859f == -1) {
                    break;
                }
                i20 += iMo3859f;
            }
            c1132w6.m2512F(i20);
            interfaceC1988o.mo3860g();
            try {
                long jM2508B = c1132w6.m2508B();
                if (!z9) {
                    jM2508B *= c1993t4.f7379b;
                }
                j9 = jM2508B;
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (!z) {
                throw C0247v0.createForMalformedContainer(null, null);
            }
            this.f8210n = j9;
        } else {
            C1132w c1132w7 = this.f8198b;
            int i21 = c1132w7.f4801c;
            if (i21 < 32768) {
                int i22 = interfaceC1988o.read(c1132w7.f4799a, i21, DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE - i21);
                z = i22 == -1;
                if (!z) {
                    c1132w7.m2512F(i21 + i22);
                } else if (c1132w7.m2515a() == 0) {
                    long j11 = this.f8210n * 1000000;
                    C1993t c1993t5 = this.f8205i;
                    int i23 = AbstractC1118i0.f4750a;
                    this.f8202f.sampleMetadata(j11 / c1993t5.f7382e, 1, this.f8209m, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i24 = c1132w7.f4800b;
            int i25 = this.f8209m;
            int i26 = this.f8206j;
            if (i25 < i26) {
                c1132w7.m2514H(Math.min(i26 - i25, c1132w7.m2515a()));
            }
            this.f8205i.getClass();
            int i27 = c1132w7.f4800b;
            while (true) {
                int i28 = c1132w7.f4801c - 16;
                C1991r c1991r = this.f8200d;
                if (i27 <= i28) {
                    c1132w7.m2513G(i27);
                    if (AbstractC1965b.m3827c(c1132w7, this.f8205i, this.f8207k, c1991r)) {
                        c1132w7.m2513G(i27);
                        j8 = c1991r.f7374a;
                        break;
                    }
                    i27++;
                } else {
                    if (z) {
                        while (true) {
                            int i29 = c1132w7.f4801c;
                            if (i27 > i29 - this.f8206j) {
                                c1132w7.m2513G(i29);
                                break;
                            }
                            c1132w7.m2513G(i27);
                            try {
                                zM3827c = AbstractC1965b.m3827c(c1132w7, this.f8205i, this.f8207k, c1991r);
                            } catch (IndexOutOfBoundsException unused2) {
                                zM3827c = false;
                            }
                            if (c1132w7.f4800b > c1132w7.f4801c) {
                                zM3827c = false;
                            }
                            if (zM3827c) {
                                c1132w7.m2513G(i27);
                                j8 = c1991r.f7374a;
                                break;
                            }
                            i27++;
                        }
                    } else {
                        c1132w7.m2513G(i27);
                    }
                    j8 = -1;
                }
            }
            int i30 = c1132w7.f4800b - i24;
            c1132w7.m2513G(i24);
            this.f8202f.sampleData(c1132w7, i30);
            int i31 = this.f8209m + i30;
            this.f8209m = i31;
            if (j8 != -1) {
                long j12 = this.f8210n * 1000000;
                C1993t c1993t6 = this.f8205i;
                int i32 = AbstractC1118i0.f4750a;
                this.f8202f.sampleMetadata(j12 / c1993t6.f7382e, 1, i31, 0, null);
                this.f8209m = 0;
                this.f8210n = j8;
            }
            if (c1132w7.m2515a() < 16) {
                int iM2515a = c1132w7.m2515a();
                byte[] bArr6 = c1132w7.f4799a;
                System.arraycopy(bArr6, c1132w7.f4800b, bArr6, 0, iM2515a);
                c1132w7.m2513G(0);
                c1132w7.m2512F(iM2515a);
            }
        }
        return 0;
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        if (j == 0) {
            this.f8203g = 0;
        } else {
            C2339b c2339b = this.f8208l;
            if (c2339b != null) {
                c2339b.m4172d(j8);
            }
        }
        this.f8210n = j8 != 0 ? -1L : 0L;
        this.f8209m = 0;
        this.f8198b.m2510D(0);
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) throws Throwable {
        AbstractC1965b.m3843s(interfaceC1988o, false);
        C1132w c1132w = new C1132w(4);
        interfaceC1988o.mo3862i(c1132w.f4799a, 0, 4);
        return c1132w.m2537w() == 1716281667;
    }
}
