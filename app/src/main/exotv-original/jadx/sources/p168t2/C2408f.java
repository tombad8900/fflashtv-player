package p168t2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.RendererCapabilities;
import com.bumptech.glide.AbstractC0715d;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.C2131o;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p063h1.C1132w;
import p115n1.AbstractC1965b;
import p115n1.C1963a;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.f */
/* loaded from: classes.dex */
public final class C2408f implements InterfaceC2412h {

    /* renamed from: a */
    public final C1132w f8544a;

    /* renamed from: c */
    public final String f8546c;

    /* renamed from: d */
    public final int f8547d;

    /* renamed from: e */
    public String f8548e;

    /* renamed from: f */
    public InterfaceC1980i0 f8549f;

    /* renamed from: h */
    public int f8551h;

    /* renamed from: i */
    public int f8552i;

    /* renamed from: j */
    public long f8553j;

    /* renamed from: k */
    public C0249w f8554k;

    /* renamed from: l */
    public int f8555l;

    /* renamed from: m */
    public int f8556m;

    /* renamed from: g */
    public int f8550g = 0;

    /* renamed from: p */
    public long f8559p = -9223372036854775807L;

    /* renamed from: b */
    public final AtomicInteger f8545b = new AtomicInteger();

    /* renamed from: n */
    public int f8557n = -1;

    /* renamed from: o */
    public int f8558o = -1;

    public C2408f(String str, int i, int i4) {
        this.f8544a = new C1132w(new byte[i4]);
        this.f8546c = str;
        this.f8547d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04b3  */
    @Override // p168t2.InterfaceC2412h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4245a(C1132w c1132w) throws C0247v0 {
        int i;
        byte b7;
        boolean z7;
        int i4;
        int i8;
        byte b8;
        int i9;
        byte b9;
        int i10;
        byte b10;
        int i11;
        int i12;
        int iM2494k;
        int iM2494k2;
        int iM2494k3;
        int i13;
        long jM2437a0;
        int i14;
        long jM2437a02;
        int i15;
        int i16;
        int i17;
        int i18;
        AbstractC1101a.m2360k(this.f8549f);
        while (c1132w.m2515a() > 0) {
            int i19 = this.f8550g;
            int i20 = 8;
            C1132w c1132w2 = this.f8544a;
            switch (i19) {
                case 0:
                    while (true) {
                        if (c1132w.m2515a() > 0) {
                            int i21 = this.f8552i << 8;
                            this.f8552i = i21;
                            int iM2535u = i21 | c1132w.m2535u();
                            this.f8552i = iM2535u;
                            int i22 = (iM2535u == 2147385345 || iM2535u == -25230976 || iM2535u == 536864768 || iM2535u == -14745368) ? 1 : (iM2535u == 1683496997 || iM2535u == 622876772) ? 2 : (iM2535u == 1078008818 || iM2535u == -233094848) ? 3 : (iM2535u == 1908687592 || iM2535u == -398277519) ? 4 : 0;
                            this.f8556m = i22;
                            if (i22 != 0) {
                                byte[] bArr = c1132w2.f4799a;
                                bArr[0] = (byte) ((iM2535u >> 24) & 255);
                                bArr[1] = (byte) ((iM2535u >> 16) & 255);
                                bArr[2] = (byte) ((iM2535u >> 8) & 255);
                                bArr[3] = (byte) (iM2535u & 255);
                                this.f8551h = 4;
                                this.f8552i = 0;
                                if (i22 != 3 && i22 != 4) {
                                    if (i22 == 1) {
                                        this.f8550g = 1;
                                        break;
                                    } else {
                                        this.f8550g = 2;
                                        break;
                                    }
                                } else {
                                    this.f8550g = 4;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!m4253b(c1132w, c1132w2.f4799a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = c1132w2.f4799a;
                        if (this.f8554k == null) {
                            String str = this.f8548e;
                            C1131v c1131vM3834j = AbstractC1965b.m3834j(bArr2);
                            c1131vM3834j.m2505v(60);
                            int i23 = AbstractC1965b.f7274j[c1131vM3834j.m2494k(6)];
                            int i24 = AbstractC1965b.f7275k[c1131vM3834j.m2494k(4)];
                            int iM2494k4 = c1131vM3834j.m2494k(5);
                            int i25 = iM2494k4 >= 29 ? -1 : (AbstractC1965b.f7276l[iM2494k4] * 1000) / 2;
                            c1131vM3834j.m2505v(10);
                            int i26 = i23 + (c1131vM3834j.m2494k(2) > 0 ? 1 : 0);
                            C0246v c0246v = new C0246v();
                            c0246v.f1435a = str;
                            c0246v.f1447m = AbstractC0244u0.m687p("audio/vnd.dts");
                            c0246v.f1442h = i25;
                            c0246v.f1425B = i26;
                            c0246v.f1426C = i24;
                            c0246v.f1451q = null;
                            c0246v.f1438d = this.f8546c;
                            c0246v.f1440f = this.f8547d;
                            C0249w c0249w = new C0249w(c0246v);
                            this.f8554k = c0249w;
                            this.f8549f.format(c0249w);
                        }
                        byte b11 = bArr2[0];
                        if (b11 != -2) {
                            if (b11 == -1) {
                                i10 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b10 = bArr2[9];
                            } else if (b11 != 31) {
                                i = ((bArr2[5] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b7 = bArr2[7];
                            } else {
                                i10 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                b10 = bArr2[8];
                            }
                            i4 = (i10 | ((b10 & 60) >> 2)) + 1;
                            z7 = true;
                            if (z7) {
                                i4 = (i4 * 16) / 14;
                            }
                            this.f8555l = i4;
                            if (b11 == -2) {
                                if (b11 == -1) {
                                    i8 = (bArr2[4] & 7) << 4;
                                    b9 = bArr2[7];
                                } else if (b11 != 31) {
                                    i8 = (bArr2[4] & 1) << 6;
                                    b8 = bArr2[5];
                                } else {
                                    i8 = (bArr2[5] & 7) << 4;
                                    b9 = bArr2[6];
                                }
                                i9 = b9 & 60;
                                this.f8553j = AbstractC0715d.m1566m(AbstractC1118i0.m2434Y(this.f8554k.f1499D, (((i9 >> 2) | i8) + 1) * 32));
                                c1132w2.m2513G(0);
                                this.f8549f.sampleData(c1132w2, 18);
                                this.f8550g = 6;
                                break;
                            } else {
                                i8 = (bArr2[5] & 1) << 6;
                                b8 = bArr2[4];
                            }
                            i9 = b8 & 252;
                            this.f8553j = AbstractC0715d.m1566m(AbstractC1118i0.m2434Y(this.f8554k.f1499D, (((i9 >> 2) | i8) + 1) * 32));
                            c1132w2.m2513G(0);
                            this.f8549f.sampleData(c1132w2, 18);
                            this.f8550g = 6;
                        } else {
                            i = ((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4);
                            b7 = bArr2[6];
                        }
                        i4 = (i | ((b7 & 240) >> 4)) + 1;
                        z7 = false;
                        if (z7) {
                        }
                        this.f8555l = i4;
                        if (b11 == -2) {
                        }
                        i9 = b8 & 252;
                        this.f8553j = AbstractC0715d.m1566m(AbstractC1118i0.m2434Y(this.f8554k.f1499D, (((i9 >> 2) | i8) + 1) * 32));
                        c1132w2.m2513G(0);
                        this.f8549f.sampleData(c1132w2, 18);
                        this.f8550g = 6;
                    }
                case 2:
                    if (m4253b(c1132w, c1132w2.f4799a, 7)) {
                        C1131v c1131vM3834j2 = AbstractC1965b.m3834j(c1132w2.f4799a);
                        c1131vM3834j2.m2505v(42);
                        this.f8557n = c1131vM3834j2.m2494k(c1131vM3834j2.m2493j() ? 12 : 8) + 1;
                        this.f8550g = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m4253b(c1132w, c1132w2.f4799a, this.f8557n)) {
                        C1131v c1131vM3834j3 = AbstractC1965b.m3834j(c1132w2.f4799a);
                        c1131vM3834j3.m2505v(40);
                        int iM2494k5 = c1131vM3834j3.m2494k(2);
                        if (c1131vM3834j3.m2493j()) {
                            i11 = 20;
                            i12 = 12;
                        } else {
                            i11 = 16;
                            i12 = 8;
                        }
                        c1131vM3834j3.m2505v(i12);
                        int iM2494k6 = c1131vM3834j3.m2494k(i11) + 1;
                        boolean zM2493j = c1131vM3834j3.m2493j();
                        if (zM2493j) {
                            iM2494k = c1131vM3834j3.m2494k(2);
                            iM2494k2 = (c1131vM3834j3.m2494k(3) + 1) * 512;
                            if (c1131vM3834j3.m2493j()) {
                                c1131vM3834j3.m2505v(36);
                            }
                            int iM2494k7 = c1131vM3834j3.m2494k(3) + 1;
                            int iM2494k8 = c1131vM3834j3.m2494k(3) + 1;
                            if (iM2494k7 != 1 || iM2494k8 != 1) {
                                throw C0247v0.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
                            }
                            int i27 = iM2494k5 + 1;
                            int iM2494k9 = c1131vM3834j3.m2494k(i27);
                            int i28 = 0;
                            while (i28 < i27) {
                                if (((iM2494k9 >> i28) & 1) == 1) {
                                    c1131vM3834j3.m2505v(i20);
                                }
                                i28++;
                                i20 = 8;
                            }
                            if (c1131vM3834j3.m2493j()) {
                                c1131vM3834j3.m2505v(2);
                                int iM2494k10 = (c1131vM3834j3.m2494k(2) + 1) << 2;
                                int iM2494k11 = c1131vM3834j3.m2494k(2) + 1;
                                for (int i29 = 0; i29 < iM2494k11; i29++) {
                                    c1131vM3834j3.m2505v(iM2494k10);
                                }
                            }
                        } else {
                            iM2494k = -1;
                            iM2494k2 = 0;
                        }
                        c1131vM3834j3.m2505v(i11);
                        c1131vM3834j3.m2505v(12);
                        if (zM2493j) {
                            if (c1131vM3834j3.m2493j()) {
                                c1131vM3834j3.m2505v(4);
                            }
                            if (c1131vM3834j3.m2493j()) {
                                c1131vM3834j3.m2505v(24);
                            }
                            if (c1131vM3834j3.m2493j()) {
                                c1131vM3834j3.m2506w(c1131vM3834j3.m2494k(10) + 1);
                            }
                            c1131vM3834j3.m2505v(5);
                            int i30 = AbstractC1965b.f7277m[c1131vM3834j3.m2494k(4)];
                            iM2494k3 = c1131vM3834j3.m2494k(8) + 1;
                            i13 = i30;
                        } else {
                            iM2494k3 = -1;
                            i13 = -2147483647;
                        }
                        if (zM2493j) {
                            if (iM2494k == 0) {
                                i14 = 32000;
                            } else if (iM2494k == 1) {
                                i14 = 44100;
                            } else {
                                if (iM2494k != 2) {
                                    throw C0247v0.createForMalformedContainer("Unsupported reference clock code in DTS HD header: " + iM2494k, null);
                                }
                                i14 = 48000;
                            }
                            int i31 = AbstractC1118i0.f4750a;
                            jM2437a0 = AbstractC1118i0.m2437a0(iM2494k2, 1000000L, i14, RoundingMode.DOWN);
                        } else {
                            jM2437a0 = -9223372036854775807L;
                        }
                        m4254g(new C1963a(iM2494k3, jM2437a0, "audio/vnd.dts.hd;profile=lbr", i13, iM2494k6));
                        this.f8555l = iM2494k6;
                        this.f8553j = jM2437a0 == -9223372036854775807L ? 0L : jM2437a0;
                        c1132w2.m2513G(0);
                        this.f8549f.sampleData(c1132w2, this.f8557n);
                        this.f8550g = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (m4253b(c1132w, c1132w2.f4799a, 6)) {
                        C1131v c1131vM3834j4 = AbstractC1965b.m3834j(c1132w2.f4799a);
                        c1131vM3834j4.m2505v(32);
                        int iM3841q = AbstractC1965b.m3841q(c1131vM3834j4, AbstractC1965b.f7282r) + 1;
                        this.f8558o = iM3841q;
                        int i32 = this.f8551h;
                        if (i32 > iM3841q) {
                            int i33 = i32 - iM3841q;
                            this.f8551h = i32 - i33;
                            c1132w.m2513G(c1132w.f4800b - i33);
                        }
                        this.f8550g = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m4253b(c1132w, c1132w2.f4799a, this.f8558o)) {
                        byte[] bArr3 = c1132w2.f4799a;
                        C1131v c1131vM3834j5 = AbstractC1965b.m3834j(bArr3);
                        int i34 = c1131vM3834j5.m2494k(32) == 1078008818 ? 1 : 0;
                        int iM3841q2 = AbstractC1965b.m3841q(c1131vM3834j5, AbstractC1965b.f7278n);
                        int i35 = iM3841q2 + 1;
                        if (i34 == 0) {
                            jM2437a02 = -9223372036854775807L;
                            i15 = -2147483647;
                        } else {
                            if (!c1131vM3834j5.m2493j()) {
                                throw C0247v0.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
                            }
                            int i36 = iM3841q2 - 1;
                            int i37 = ((bArr3[i36] << 8) & C2131o.DEFAULT_INITIAL_WINDOW_SIZE) | (bArr3[iM3841q2] & 255);
                            int i38 = AbstractC1118i0.f4750a;
                            int i39 = 65535;
                            for (int i40 = 0; i40 < i36; i40++) {
                                byte b12 = bArr3[i40];
                                int i41 = (((i39 >> 12) & 255) ^ ((b12 & 255) >> 4)) & 255;
                                int i42 = (i39 << 4) & C2131o.DEFAULT_INITIAL_WINDOW_SIZE;
                                int[] iArr = AbstractC1118i0.f4764o;
                                int i43 = (iArr[i41] ^ i42) & C2131o.DEFAULT_INITIAL_WINDOW_SIZE;
                                i39 = (iArr[((b12 & 15) ^ ((i43 >> 12) & 255)) & 255] ^ ((i43 << 4) & C2131o.DEFAULT_INITIAL_WINDOW_SIZE)) & C2131o.DEFAULT_INITIAL_WINDOW_SIZE;
                            }
                            if (i37 != i39) {
                                throw C0247v0.createForMalformedContainer("CRC check failed", null);
                            }
                            int iM2494k12 = c1131vM3834j5.m2494k(2);
                            if (iM2494k12 != 0) {
                                if (iM2494k12 == 1) {
                                    i17 = 480;
                                } else {
                                    if (iM2494k12 != 2) {
                                        throw C0247v0.createForMalformedContainer("Unsupported base duration index in DTS UHD header: " + iM2494k12, null);
                                    }
                                    i17 = RendererCapabilities.DECODER_SUPPORT_MASK;
                                }
                                i16 = 3;
                            } else {
                                i16 = 3;
                                i17 = 512;
                            }
                            int iM2494k13 = (c1131vM3834j5.m2494k(i16) + 1) * i17;
                            int iM2494k14 = c1131vM3834j5.m2494k(2);
                            if (iM2494k14 == 0) {
                                i18 = 32000;
                            } else if (iM2494k14 == 1) {
                                i18 = 44100;
                            } else {
                                if (iM2494k14 != 2) {
                                    throw C0247v0.createForMalformedContainer("Unsupported clock rate index in DTS UHD header: " + iM2494k14, null);
                                }
                                i18 = 48000;
                            }
                            if (c1131vM3834j5.m2493j()) {
                                c1131vM3834j5.m2505v(36);
                            }
                            int iM2494k15 = i18 * (1 << c1131vM3834j5.m2494k(2));
                            jM2437a02 = AbstractC1118i0.m2437a0(iM2494k13, 1000000L, i18, RoundingMode.DOWN);
                            i15 = iM2494k15;
                        }
                        int iM3841q3 = 0;
                        for (int i44 = 0; i44 < i34; i44++) {
                            iM3841q3 += AbstractC1965b.m3841q(c1131vM3834j5, AbstractC1965b.f7279o);
                        }
                        AtomicInteger atomicInteger = this.f8545b;
                        if (i34 != 0) {
                            atomicInteger.set(AbstractC1965b.m3841q(c1131vM3834j5, AbstractC1965b.f7280p));
                        }
                        int iM3841q4 = iM3841q3 + (atomicInteger.get() != 0 ? AbstractC1965b.m3841q(c1131vM3834j5, AbstractC1965b.f7281q) : 0) + i35;
                        C1963a c1963a = new C1963a(2, jM2437a02, "audio/vnd.dts.uhd;profile=p2", i15, iM3841q4);
                        if (this.f8556m == 3) {
                            m4254g(c1963a);
                        }
                        this.f8555l = iM3841q4;
                        this.f8553j = jM2437a02 == -9223372036854775807L ? 0L : jM2437a02;
                        c1132w2.m2513G(0);
                        this.f8549f.sampleData(c1132w2, this.f8558o);
                        this.f8550g = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int iMin = Math.min(c1132w.m2515a(), this.f8555l - this.f8551h);
                    this.f8549f.sampleData(c1132w, iMin);
                    int i45 = this.f8551h + iMin;
                    this.f8551h = i45;
                    if (i45 != this.f8555l) {
                        break;
                    } else {
                        AbstractC1101a.m2359j(this.f8559p != -9223372036854775807L);
                        this.f8549f.sampleMetadata(this.f8559p, this.f8556m == 4 ? 0 : 1, this.f8555l, 0, null);
                        this.f8559p += this.f8553j;
                        this.f8550g = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* renamed from: b */
    public final boolean m4253b(C1132w c1132w, byte[] bArr, int i) {
        int iMin = Math.min(c1132w.m2515a(), i - this.f8551h);
        c1132w.m2519e(bArr, this.f8551h, iMin);
        int i4 = this.f8551h + iMin;
        this.f8551h = i4;
        return i4 == i;
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: c */
    public final void mo4246c() {
        this.f8550g = 0;
        this.f8551h = 0;
        this.f8552i = 0;
        this.f8559p = -9223372036854775807L;
        this.f8545b.set(0);
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
        this.f8548e = c2411g0.f8573e;
        c2411g0.m4256b();
        this.f8549f = interfaceC1989p.track(c2411g0.f8572d, 1);
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: f */
    public final void mo4249f(int i, long j) {
        this.f8559p = j;
    }

    /* renamed from: g */
    public final void m4254g(C1963a c1963a) {
        int i = c1963a.f7262b;
        String str = c1963a.f7261a;
        int i4 = c1963a.f7263c;
        if (i == -2147483647 || i4 == -1) {
            return;
        }
        C0249w c0249w = this.f8554k;
        if (c0249w != null && i4 == c0249w.f1498C && i == c0249w.f1499D && str.equals(c0249w.f1522n)) {
            return;
        }
        C0249w c0249w2 = this.f8554k;
        C0246v c0246v = c0249w2 == null ? new C0246v() : c0249w2.m692a();
        c0246v.f1435a = this.f8548e;
        c0246v.f1447m = AbstractC0244u0.m687p(str);
        c0246v.f1425B = i4;
        c0246v.f1426C = i;
        c0246v.f1438d = this.f8546c;
        c0246v.f1440f = this.f8547d;
        C0249w c0249w3 = new C0249w(c0246v);
        this.f8554k = c0249w3;
        this.f8549f.format(c0249w3);
    }
}
