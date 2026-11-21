package p168t2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.bumptech.glide.AbstractC0714c;
import p052f6.AbstractC0983m0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p063h1.C1132w;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.u */
/* loaded from: classes.dex */
public final class C2427u implements InterfaceC2412h {

    /* renamed from: e */
    public String f8738e;

    /* renamed from: f */
    public InterfaceC1980i0 f8739f;

    /* renamed from: i */
    public boolean f8742i;

    /* renamed from: k */
    public int f8744k;

    /* renamed from: l */
    public int f8745l;

    /* renamed from: n */
    public int f8747n;

    /* renamed from: o */
    public int f8748o;

    /* renamed from: s */
    public int f8752s;

    /* renamed from: u */
    public boolean f8754u;

    /* renamed from: d */
    public int f8737d = 0;

    /* renamed from: a */
    public final C1132w f8734a = new C1132w(new byte[15], 2);

    /* renamed from: b */
    public final C1131v f8735b = new C1131v(0);

    /* renamed from: c */
    public final C1132w f8736c = new C1132w();

    /* renamed from: p */
    public final C2428v f8749p = new C2428v();

    /* renamed from: q */
    public int f8750q = -2147483647;

    /* renamed from: r */
    public int f8751r = -1;

    /* renamed from: t */
    public long f8753t = -1;

    /* renamed from: j */
    public boolean f8743j = true;

    /* renamed from: m */
    public boolean f8746m = true;

    /* renamed from: g */
    public double f8740g = -9.223372036854776E18d;

    /* renamed from: h */
    public double f8741h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0415  */
    @Override // p168t2.InterfaceC2412h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4245a(C1132w c1132w) throws C0247v0 {
        int i;
        int i4;
        int iM2494k;
        int iM2494k2;
        int i8;
        char c8;
        byte[] bArr;
        long j;
        long j8;
        int iM2494k3;
        long j9;
        int i9;
        AbstractC1101a.m2360k(this.f8739f);
        while (c1132w.m2515a() > 0) {
            int i10 = this.f8737d;
            int i11 = 8;
            int i12 = 3;
            int i13 = 1;
            if (i10 != 0) {
                C1132w c1132w2 = this.f8736c;
                C2428v c2428v = this.f8749p;
                if (i10 == 1) {
                    int iM2515a = c1132w.m2515a();
                    C1132w c1132w3 = this.f8734a;
                    int iMin = Math.min(iM2515a, c1132w3.m2515a());
                    c1132w.m2519e(c1132w3.f4799a, c1132w3.f4800b, iMin);
                    c1132w3.m2514H(iMin);
                    if (c1132w3.m2515a() == 0) {
                        int i14 = c1132w3.f4801c;
                        byte[] bArr2 = c1132w3.f4799a;
                        C1131v c1131v = this.f8735b;
                        c1131v.m2501r(bArr2, i14);
                        c1131v.m2491h();
                        int iM4309n = AbstractC2429w.m4309n(c1131v, 3, 8, 8);
                        c2428v.f8755a = iM4309n;
                        if (iM4309n != -1) {
                            AbstractC1101a.m2353d(Math.max(Math.max(2, 8), 32) <= 63);
                            AbstractC0714c.m1533s(AbstractC0714c.m1533s(3L, 255L), 4294967296L);
                            if (c1131v.m2486c() < 2) {
                                j9 = -1;
                                c2428v.f8756b = j9;
                                if (j9 != -1) {
                                    if (j9 > 16) {
                                        throw C0247v0.createForUnsupportedContainerFeature("Contains sub-stream with an invalid packet label " + c2428v.f8756b);
                                    }
                                    if (j9 == 0) {
                                        int i15 = c2428v.f8755a;
                                        if (i15 == 1) {
                                            throw C0247v0.createForMalformedContainer("Mpegh3daConfig packet with invalid packet label 0", null);
                                        }
                                        if (i15 == 2) {
                                            throw C0247v0.createForMalformedContainer("Mpegh3daFrame packet with invalid packet label 0", null);
                                        }
                                        if (i15 == 17) {
                                            throw C0247v0.createForMalformedContainer("AudioTruncation packet with invalid packet label 0", null);
                                        }
                                    }
                                    int iM4309n2 = AbstractC2429w.m4309n(c1131v, 11, 24, 24);
                                    c2428v.f8757c = iM4309n2;
                                    boolean z7 = iM4309n2 != -1;
                                    if (z7) {
                                        i9 = 0;
                                        this.f8747n = 0;
                                        this.f8748o = c2428v.f8757c + i14 + this.f8748o;
                                    } else {
                                        i9 = 0;
                                    }
                                    if (z7) {
                                        c1132w3.m2513G(i9);
                                        this.f8739f.sampleData(c1132w3, c1132w3.f4801c);
                                        c1132w3.m2510D(2);
                                        c1132w2.m2510D(c2428v.f8757c);
                                        this.f8746m = true;
                                        this.f8737d = 2;
                                    } else {
                                        int i16 = c1132w3.f4801c;
                                        if (i16 < 15) {
                                            c1132w3.m2512F(i16 + 1);
                                            this.f8746m = false;
                                        }
                                    }
                                }
                            } else {
                                long jM2496m = c1131v.m2496m(2);
                                if (jM2496m == 3) {
                                    if (c1131v.m2486c() >= 8) {
                                        long jM2496m2 = c1131v.m2496m(8);
                                        jM2496m += jM2496m2;
                                        if (jM2496m2 == 255) {
                                            if (c1131v.m2486c() >= 32) {
                                                jM2496m = c1131v.m2496m(32) + jM2496m;
                                            }
                                        }
                                    }
                                    j9 = -1;
                                    c2428v.f8756b = j9;
                                    if (j9 != -1) {
                                    }
                                }
                                j9 = jM2496m;
                                c2428v.f8756b = j9;
                                if (j9 != -1) {
                                }
                            }
                        }
                    } else {
                        this.f8746m = false;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int i17 = c2428v.f8755a;
                    if (i17 == 1 || i17 == 17) {
                        int i18 = c1132w.f4800b;
                        int iMin2 = Math.min(c1132w.m2515a(), c1132w2.m2515a());
                        c1132w.m2519e(c1132w2.f4799a, c1132w2.f4800b, iMin2);
                        c1132w2.m2514H(iMin2);
                        c1132w.m2513G(i18);
                    }
                    int iMin3 = Math.min(c1132w.m2515a(), c2428v.f8757c - this.f8747n);
                    this.f8739f.sampleData(c1132w, iMin3);
                    int i19 = this.f8747n + iMin3;
                    this.f8747n = i19;
                    if (i19 != c2428v.f8757c) {
                        continue;
                    } else {
                        int i20 = c2428v.f8755a;
                        if (i20 == 1) {
                            byte[] bArr3 = c1132w2.f4799a;
                            C1131v c1131v2 = new C1131v(bArr3, bArr3.length);
                            int iM2494k4 = c1131v2.m2494k(8);
                            int iM2494k5 = c1131v2.m2494k(5);
                            if (iM2494k5 != 31) {
                                switch (iM2494k5) {
                                    case 0:
                                        iM2494k2 = 96000;
                                        break;
                                    case 1:
                                        iM2494k2 = 88200;
                                        break;
                                    case 2:
                                        iM2494k2 = 64000;
                                        break;
                                    case 3:
                                        iM2494k2 = 48000;
                                        break;
                                    case 4:
                                        iM2494k2 = 44100;
                                        break;
                                    case 5:
                                        iM2494k2 = 32000;
                                        break;
                                    case 6:
                                        iM2494k2 = 24000;
                                        break;
                                    case 7:
                                        iM2494k2 = 22050;
                                        break;
                                    case 8:
                                        iM2494k2 = 16000;
                                        break;
                                    case 9:
                                        iM2494k2 = 12000;
                                        break;
                                    case 10:
                                        iM2494k2 = 11025;
                                        break;
                                    case 11:
                                        iM2494k2 = 8000;
                                        break;
                                    case 12:
                                        iM2494k2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw C0247v0.createForUnsupportedContainerFeature("Unsupported sampling rate index " + iM2494k5);
                                    case 15:
                                        iM2494k2 = 57600;
                                        break;
                                    case 16:
                                        iM2494k2 = 51200;
                                        break;
                                    case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                                        iM2494k2 = 40000;
                                        break;
                                    case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                                        iM2494k2 = 38400;
                                        break;
                                    case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                                        iM2494k2 = 34150;
                                        break;
                                    case 20:
                                        iM2494k2 = 28800;
                                        break;
                                    case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                                        iM2494k2 = 25600;
                                        break;
                                    case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                                        iM2494k2 = 20000;
                                        break;
                                    case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                                        iM2494k2 = 19200;
                                        break;
                                    case 24:
                                        iM2494k2 = 17075;
                                        break;
                                    case AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED /* 25 */:
                                        iM2494k2 = 14400;
                                        break;
                                    case AnalyticsListener.EVENT_RENDERED_FIRST_FRAME /* 26 */:
                                        iM2494k2 = 12800;
                                        break;
                                    case AnalyticsListener.EVENT_CUES /* 27 */:
                                        iM2494k2 = 9600;
                                        break;
                                }
                            } else {
                                iM2494k2 = c1131v2.m2494k(24);
                            }
                            int iM2494k6 = c1131v2.m2494k(3);
                            if (iM2494k6 == 0) {
                                i8 = 768;
                            } else if (iM2494k6 == 1) {
                                i8 = 1024;
                            } else if (iM2494k6 == 2 || iM2494k6 == 3) {
                                i8 = 2048;
                            } else {
                                if (iM2494k6 != 4) {
                                    throw C0247v0.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + iM2494k6);
                                }
                                i8 = DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
                            }
                            int i21 = i8;
                            if (iM2494k6 == 0 || iM2494k6 == 1) {
                                c8 = 0;
                            } else if (iM2494k6 == 2) {
                                c8 = 2;
                            } else if (iM2494k6 == 3) {
                                c8 = 3;
                            } else {
                                if (iM2494k6 != 4) {
                                    throw C0247v0.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + iM2494k6);
                                }
                                c8 = 1;
                            }
                            c1131v2.m2505v(2);
                            AbstractC2429w.m4313r(c1131v2);
                            int iM2494k7 = c1131v2.m2494k(5);
                            int i22 = 0;
                            int iM4309n3 = 0;
                            while (true) {
                                int i23 = i13;
                                int i24 = 16;
                                if (i22 < iM2494k7 + 1) {
                                    int iM2494k8 = c1131v2.m2494k(3);
                                    iM4309n3 = AbstractC2429w.m4309n(c1131v2, 5, 8, 16) + 1 + iM4309n3;
                                    if ((iM2494k8 == 0 || iM2494k8 == 2) && c1131v2.m2493j()) {
                                        AbstractC2429w.m4313r(c1131v2);
                                    }
                                    i22++;
                                    i13 = i23;
                                } else {
                                    int iM4309n4 = AbstractC2429w.m4309n(c1131v2, 4, 8, 16) + 1;
                                    c1131v2.m2504u();
                                    int i25 = 0;
                                    while (true) {
                                        double d8 = 2.0d;
                                        if (i25 < iM4309n4) {
                                            int iM2494k9 = c1131v2.m2494k(2);
                                            if (iM2494k9 == 0) {
                                                c1131v2.m2505v(i12);
                                                if (c1131v2.m2493j()) {
                                                    c1131v2.m2505v(13);
                                                }
                                                if (c8 > 0) {
                                                    AbstractC2429w.m4312q(c1131v2);
                                                }
                                            } else if (iM2494k9 == i23) {
                                                c1131v2.m2505v(i12);
                                                boolean zM2493j = c1131v2.m2493j();
                                                if (zM2493j) {
                                                    c1131v2.m2505v(13);
                                                }
                                                if (zM2493j) {
                                                    c1131v2.m2504u();
                                                }
                                                if (c8 > 0) {
                                                    AbstractC2429w.m4312q(c1131v2);
                                                    iM2494k3 = c1131v2.m2494k(2);
                                                } else {
                                                    iM2494k3 = 0;
                                                }
                                                if (iM2494k3 > 0) {
                                                    c1131v2.m2505v(6);
                                                    int iM2494k10 = c1131v2.m2494k(2);
                                                    c1131v2.m2505v(4);
                                                    if (c1131v2.m2493j()) {
                                                        c1131v2.m2505v(5);
                                                    }
                                                    if (iM2494k3 == 2 || iM2494k3 == i12) {
                                                        c1131v2.m2505v(6);
                                                    }
                                                    if (iM2494k10 == 2) {
                                                        c1131v2.m2504u();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iM4309n3 - 1) / Math.log(2.0d))) + 1;
                                                int iM2494k11 = c1131v2.m2494k(2);
                                                if (iM2494k11 > 0 && c1131v2.m2493j()) {
                                                    c1131v2.m2505v(iFloor);
                                                }
                                                if (c1131v2.m2493j()) {
                                                    c1131v2.m2505v(iFloor);
                                                }
                                                if (c8 == 0 && iM2494k11 == 0) {
                                                    c1131v2.m2504u();
                                                }
                                            } else if (iM2494k9 == i12) {
                                                AbstractC2429w.m4309n(c1131v2, 4, i11, i24);
                                                int iM4309n5 = AbstractC2429w.m4309n(c1131v2, 4, i11, i24);
                                                if (c1131v2.m2493j()) {
                                                    AbstractC2429w.m4309n(c1131v2, i11, i24, 0);
                                                }
                                                c1131v2.m2504u();
                                                if (iM4309n5 > 0) {
                                                    c1131v2.m2505v(iM4309n5 * 8);
                                                }
                                            }
                                            i25++;
                                            i11 = 8;
                                            i12 = 3;
                                            i24 = 16;
                                            i23 = 1;
                                        } else {
                                            if (c1131v2.m2493j()) {
                                                int i26 = 8;
                                                int iM4309n6 = AbstractC2429w.m4309n(c1131v2, 2, 4, 8) + 1;
                                                int i27 = 0;
                                                bArr = null;
                                                while (i27 < iM4309n6) {
                                                    int iM4309n7 = AbstractC2429w.m4309n(c1131v2, 4, i26, 16);
                                                    int iM4309n8 = AbstractC2429w.m4309n(c1131v2, 4, i26, 16);
                                                    if (iM4309n7 == 7) {
                                                        int iM2494k12 = c1131v2.m2494k(4) + 1;
                                                        c1131v2.m2505v(4);
                                                        byte[] bArr4 = new byte[iM2494k12];
                                                        for (int i28 = 0; i28 < iM2494k12; i28++) {
                                                            bArr4[i28] = (byte) c1131v2.m2494k(i26);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        c1131v2.m2505v(iM4309n8 * i26);
                                                    }
                                                    i27++;
                                                    i26 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iM2494k2) {
                                                case 14700:
                                                case 16000:
                                                    d8 = 3.0d;
                                                    this.f8750q = (int) (iM2494k2 * d8);
                                                    this.f8751r = (int) (i21 * d8);
                                                    j = this.f8753t;
                                                    j8 = c2428v.f8756b;
                                                    if (j != j8) {
                                                        this.f8753t = j8;
                                                        String strConcat = iM2494k4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iM2494k4))) : "mhm1";
                                                        C0981l1 c0981l1M2169o = (bArr == null || bArr.length <= 0) ? null : AbstractC0983m0.m2169o(AbstractC1118i0.f4755f, bArr);
                                                        C0246v c0246v = new C0246v();
                                                        c0246v.f1435a = this.f8738e;
                                                        c0246v.f1447m = AbstractC0244u0.m687p("audio/mhm1");
                                                        c0246v.f1426C = this.f8750q;
                                                        c0246v.f1444j = strConcat;
                                                        c0246v.f1450p = c0981l1M2169o;
                                                        this.f8739f.format(new C0249w(c0246v));
                                                    }
                                                    i4 = 1;
                                                    this.f8754u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f8750q = (int) (iM2494k2 * d8);
                                                    this.f8751r = (int) (i21 * d8);
                                                    j = this.f8753t;
                                                    j8 = c2428v.f8756b;
                                                    if (j != j8) {
                                                    }
                                                    i4 = 1;
                                                    this.f8754u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d8 = 1.5d;
                                                    this.f8750q = (int) (iM2494k2 * d8);
                                                    this.f8751r = (int) (i21 * d8);
                                                    j = this.f8753t;
                                                    j8 = c2428v.f8756b;
                                                    if (j != j8) {
                                                    }
                                                    i4 = 1;
                                                    this.f8754u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d8 = 1.0d;
                                                    this.f8750q = (int) (iM2494k2 * d8);
                                                    this.f8751r = (int) (i21 * d8);
                                                    j = this.f8753t;
                                                    j8 = c2428v.f8756b;
                                                    if (j != j8) {
                                                    }
                                                    i4 = 1;
                                                    this.f8754u = true;
                                                    break;
                                                default:
                                                    throw C0247v0.createForUnsupportedContainerFeature("Unsupported sampling rate " + iM2494k2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i20 == 17) {
                                byte[] bArr5 = c1132w2.f4799a;
                                C1131v c1131v3 = new C1131v(bArr5, bArr5.length);
                                if (c1131v3.m2493j()) {
                                    c1131v3.m2505v(2);
                                    iM2494k = c1131v3.m2494k(13);
                                } else {
                                    iM2494k = 0;
                                }
                                this.f8752s = iM2494k;
                            } else if (i20 == 2) {
                                if (this.f8754u) {
                                    this.f8743j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d9 = ((this.f8751r - this.f8752s) * 1000000.0d) / this.f8750q;
                                long jRound = Math.round(this.f8740g);
                                if (this.f8742i) {
                                    this.f8742i = false;
                                    this.f8740g = this.f8741h;
                                } else {
                                    this.f8740g += d9;
                                }
                                this.f8739f.sampleMetadata(jRound, i, this.f8748o, 0, null);
                                this.f8754u = false;
                                this.f8752s = 0;
                                this.f8748o = 0;
                            }
                            i4 = 1;
                        }
                        this.f8737d = i4;
                    }
                }
            } else {
                int i29 = this.f8744k;
                if ((i29 & 2) == 0) {
                    c1132w.m2513G(c1132w.f4801c);
                } else {
                    if ((i29 & 4) == 0) {
                        while (c1132w.m2515a() > 0) {
                            int i30 = this.f8745l << 8;
                            this.f8745l = i30;
                            int iM2535u = i30 | c1132w.m2535u();
                            this.f8745l = iM2535u;
                            if ((iM2535u & 16777215) == 12583333) {
                                c1132w.m2513G(c1132w.f4800b - 3);
                                this.f8745l = 0;
                            }
                        }
                    }
                    this.f8737d = 1;
                }
            }
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: c */
    public final void mo4246c() {
        this.f8737d = 0;
        this.f8745l = 0;
        this.f8734a.m2510D(2);
        this.f8747n = 0;
        this.f8748o = 0;
        this.f8750q = -2147483647;
        this.f8751r = -1;
        this.f8752s = 0;
        this.f8753t = -1L;
        this.f8754u = false;
        this.f8742i = false;
        this.f8746m = true;
        this.f8743j = true;
        this.f8740g = -9.223372036854776E18d;
        this.f8741h = -9.223372036854776E18d;
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
        this.f8738e = c2411g0.f8573e;
        c2411g0.m4256b();
        this.f8739f = interfaceC1989p.track(c2411g0.f8572d, 1);
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: f */
    public final void mo4249f(int i, long j) {
        this.f8744k = i;
        if (!this.f8743j && (this.f8748o != 0 || !this.f8746m)) {
            this.f8742i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f8742i) {
                this.f8741h = j;
            } else {
                this.f8740g = j;
            }
        }
    }
}
