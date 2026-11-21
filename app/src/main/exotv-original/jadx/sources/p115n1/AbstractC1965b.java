package p115n1;

import android.util.Base64;
import androidx.media3.common.C0222n;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0253x0;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p002a1.AbstractC0008a1;
import p002a1.C0016e;
import p013b2.C0557i;
import p023c4.C0644h;
import p039e2.C0862a;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p063h1.C1132w;
import p095l.C1629o;
import p215z1.C2870a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.b */
/* loaded from: classes.dex */
public abstract class AbstractC1965b {

    /* renamed from: a */
    public static final int[] f7265a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    public static final int[] f7266b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c */
    public static final int[] f7267c = {1, 2, 3, 6};

    /* renamed from: d */
    public static final int[] f7268d = {48000, 44100, 32000};

    /* renamed from: e */
    public static final int[] f7269e = {24000, 22050, 16000};

    /* renamed from: f */
    public static final int[] f7270f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g */
    public static final int[] f7271g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 576, 640};

    /* renamed from: h */
    public static final int[] f7272h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i */
    public static final int[] f7273i = {C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: j */
    public static final int[] f7274j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k */
    public static final int[] f7275k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l */
    public static final int[] f7276l = {64, 112, 128, 192, 224, 256, RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED, 6144, 7680};

    /* renamed from: m */
    public static final int[] f7277m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: n */
    public static final int[] f7278n = {5, 8, 10, 12};

    /* renamed from: o */
    public static final int[] f7279o = {6, 9, 12, 15};

    /* renamed from: p */
    public static final int[] f7280p = {2, 4, 6, 8};

    /* renamed from: q */
    public static final int[] f7281q = {9, 11, 13, 16};

    /* renamed from: r */
    public static final int[] f7282r = {5, 8, 10, 12};

    /* renamed from: s */
    public static final String[] f7283s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: t */
    public static final int[] f7284t = {44100, 48000, 32000};

    /* renamed from: u */
    public static final int[] f7285u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: v */
    public static final int[] f7286v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: w */
    public static final int[] f7287w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: x */
    public static final int[] f7288x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: y */
    public static final int[] f7289y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: a */
    public static byte[] m3825a(int i, int i4, int i8) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i4 >> 1) & 7)), (byte) (((i4 << 7) & 128) | ((i8 << 3) & 120))};
    }

    /* renamed from: b */
    public static ArrayList m3826b(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m3827c(C1132w c1132w, C1993t c1993t, int i, C1991r c1991r) {
        long jM2537w = c1132w.m2537w();
        long j = jM2537w >>> 16;
        if (j != i) {
            return false;
        }
        boolean z7 = (j & 1) == 1;
        int i4 = (int) ((jM2537w >> 12) & 15);
        int i8 = (int) ((jM2537w >> 8) & 15);
        int i9 = (int) ((jM2537w >> 4) & 15);
        int i10 = (int) ((jM2537w >> 1) & 7);
        boolean z8 = (jM2537w & 1) == 1;
        if (i9 <= 7) {
            if (i9 != c1993t.f7384g - 1) {
                return false;
            }
        } else if (i9 > 10 || c1993t.f7384g != 2) {
            return false;
        }
        if (!(i10 == 0 || i10 == c1993t.f7386i) || z8) {
            return false;
        }
        try {
            long jM2508B = c1132w.m2508B();
            if (!z7) {
                jM2508B *= c1993t.f7379b;
            }
            c1991r.f7374a = jM2508B;
            int iM3844t = m3844t(c1132w, i4);
            if (iM3844t == -1 || iM3844t > c1993t.f7379b) {
                return false;
            }
            int i11 = c1993t.f7382e;
            if (i8 != 0) {
                if (i8 <= 11) {
                    if (i8 != c1993t.f7383f) {
                        return false;
                    }
                } else if (i8 != 12) {
                    if (i8 > 14) {
                        return false;
                    }
                    int iM2507A = c1132w.m2507A();
                    if (i8 == 14) {
                        iM2507A *= 10;
                    }
                    if (iM2507A != i11) {
                        return false;
                    }
                } else if (c1132w.m2535u() * 1000 != i11) {
                    return false;
                }
            }
            int iM2535u = c1132w.m2535u();
            int i12 = c1132w.f4800b;
            byte[] bArr = c1132w.f4799a;
            int i13 = i12 - 1;
            int i14 = 0;
            for (int i15 = c1132w.f4800b; i15 < i13; i15++) {
                i14 = AbstractC1118i0.f4765p[i14 ^ (bArr[i15] & 255)];
            }
            int i16 = AbstractC1118i0.f4750a;
            return iM2535u == i14;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static void m3828d(String str, boolean z7) throws C0247v0 {
        if (!z7) {
            throw C0247v0.createForMalformedContainer(str, null);
        }
    }

    /* renamed from: e */
    public static void m3829e(long j, C1132w c1132w, InterfaceC1980i0[] interfaceC1980i0Arr) {
        int i;
        while (true) {
            if (c1132w.m2515a() <= 1) {
                return;
            }
            int i4 = 0;
            while (true) {
                if (c1132w.m2515a() == 0) {
                    i = -1;
                    break;
                }
                int iM2535u = c1132w.m2535u();
                i4 += iM2535u;
                if (iM2535u != 255) {
                    i = i4;
                    break;
                }
            }
            int i8 = 0;
            while (true) {
                if (c1132w.m2515a() == 0) {
                    i8 = -1;
                    break;
                }
                int iM2535u2 = c1132w.m2535u();
                i8 += iM2535u2;
                if (iM2535u2 != 255) {
                    break;
                }
            }
            int i9 = c1132w.f4800b + i8;
            if (i8 == -1 || i8 > c1132w.m2515a()) {
                AbstractC1101a.m2348F("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i9 = c1132w.f4801c;
            } else if (i == 4 && i8 >= 8) {
                int iM2535u3 = c1132w.m2535u();
                int iM2507A = c1132w.m2507A();
                int iM2521g = iM2507A == 49 ? c1132w.m2521g() : 0;
                int iM2535u4 = c1132w.m2535u();
                if (iM2507A == 47) {
                    c1132w.m2514H(1);
                }
                boolean z7 = iM2535u3 == 181 && (iM2507A == 49 || iM2507A == 47) && iM2535u4 == 3;
                if (iM2507A == 49) {
                    z7 &= iM2521g == 1195456820;
                }
                if (z7) {
                    m3830f(j, c1132w, interfaceC1980i0Arr);
                }
            }
            c1132w.m2513G(i9);
        }
    }

    /* renamed from: f */
    public static void m3830f(long j, C1132w c1132w, InterfaceC1980i0[] interfaceC1980i0Arr) {
        int iM2535u = c1132w.m2535u();
        if ((iM2535u & 64) != 0) {
            c1132w.m2514H(1);
            int i = (iM2535u & 31) * 3;
            int i4 = c1132w.f4800b;
            for (InterfaceC1980i0 interfaceC1980i0 : interfaceC1980i0Arr) {
                c1132w.m2513G(i4);
                interfaceC1980i0.sampleData(c1132w, i);
                AbstractC1101a.m2359j(j != -9223372036854775807L);
                interfaceC1980i0.sampleMetadata(j, 1, i, 0, null);
            }
        }
    }

    /* renamed from: g */
    public static int m3831g(int i, int i4) {
        int i8 = i4 / 2;
        if (i < 0 || i >= 3 || i4 < 0 || i8 >= 19) {
            return -1;
        }
        int i9 = f7268d[i];
        if (i9 == 44100) {
            return ((i4 % 2) + f7272h[i8]) * 2;
        }
        int i10 = f7271g[i8];
        return i9 == 32000 ? i10 * 6 : i10 * 4;
    }

    /* renamed from: h */
    public static void m3832h(C1132w c1132w, int i) {
        c1132w.m2510D(7);
        byte[] bArr = c1132w.f4799a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* renamed from: i */
    public static int m3833i(int i) {
        int i4;
        int i8;
        int i9;
        int i10;
        if ((i & (-2097152)) != -2097152 || (i4 = (i >>> 19) & 3) == 1 || (i8 = (i >>> 17) & 3) == 0 || (i9 = (i >>> 12) & 15) == 0 || i9 == 15 || (i10 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i11 = f7284t[i10];
        if (i4 == 2) {
            i11 /= 2;
        } else if (i4 == 0) {
            i11 /= 4;
        }
        int i12 = (i >>> 9) & 1;
        if (i8 == 3) {
            return ((((i4 == 3 ? f7285u[i9 - 1] : f7286v[i9 - 1]) * 12) / i11) + i12) * 4;
        }
        int i13 = i4 == 3 ? i8 == 2 ? f7287w[i9 - 1] : f7288x[i9 - 1] : f7289y[i9 - 1];
        if (i4 == 3) {
            return ((i13 * 144) / i11) + i12;
        }
        return (((i8 == 1 ? 72 : 144) * i13) / i11) + i12;
    }

    /* renamed from: j */
    public static C1131v m3834j(byte[] bArr) {
        byte b7 = bArr[0];
        if (b7 == Byte.MAX_VALUE || b7 == 100 || b7 == 64 || b7 == 113) {
            return new C1131v(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b8 = bArrCopyOf[0];
        if (b8 == -2 || b8 == -1 || b8 == 37 || b8 == -14 || b8 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b9 = bArrCopyOf[i];
                int i4 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i4];
                bArrCopyOf[i4] = b9;
            }
        }
        C1131v c1131v = new C1131v(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            C1131v c1131v2 = new C1131v(bArrCopyOf, bArrCopyOf.length);
            while (c1131v2.m2486c() >= 16) {
                c1131v2.m2505v(2);
                int iM2494k = c1131v2.m2494k(14) & 16383;
                int iMin = Math.min(8 - c1131v.f4794d, 14);
                int i8 = c1131v.f4794d;
                int i9 = (8 - i8) - iMin;
                byte[] bArr2 = (byte[]) c1131v.f4792b;
                int i10 = c1131v.f4793c;
                byte b10 = (byte) (((65280 >> i8) | ((1 << i9) - 1)) & bArr2[i10]);
                bArr2[i10] = b10;
                int i11 = 14 - iMin;
                bArr2[i10] = (byte) (b10 | ((iM2494k >>> i11) << i9));
                int i12 = i10 + 1;
                while (i11 > 8) {
                    ((byte[]) c1131v.f4792b)[i12] = (byte) (iM2494k >>> (i11 - 8));
                    i11 -= 8;
                    i12++;
                }
                int i13 = 8 - i11;
                byte[] bArr3 = (byte[]) c1131v.f4792b;
                byte b11 = (byte) (bArr3[i12] & ((1 << i13) - 1));
                bArr3[i12] = b11;
                bArr3[i12] = (byte) (((iM2494k & ((1 << i11) - 1)) << i13) | b11);
                c1131v.m2505v(14);
                c1131v.m2485b();
            }
        }
        c1131v.m2501r(bArrCopyOf, bArrCopyOf.length);
        return c1131v;
    }

    /* renamed from: k */
    public static long m3835k(byte b7, byte b8) {
        int i;
        int i4 = b7 & 255;
        int i8 = b7 & 3;
        if (i8 != 0) {
            i = 2;
            if (i8 != 1 && i8 != 2) {
                i = b8 & 63;
            }
        } else {
            i = 1;
        }
        int i9 = i4 >> 3;
        return i * (i9 >= 16 ? DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS << r6 : i9 >= 12 ? 10000 << (i9 & 1) : (i9 & 3) == 3 ? 60000 : 10000 << r6);
    }

    /* renamed from: l */
    public static int m3836l(C1131v c1131v) throws C0247v0 {
        int iM2494k = c1131v.m2494k(4);
        if (iM2494k == 15) {
            if (c1131v.m2486c() >= 24) {
                return c1131v.m2494k(24);
            }
            throw C0247v0.createForMalformedContainer("AAC header insufficient data", null);
        }
        if (iM2494k < 13) {
            return f7265a[iM2494k];
        }
        throw C0247v0.createForMalformedContainer("AAC header wrong Sampling Frequency Index", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0644h m3837m(C1131v c1131v) {
        int i;
        int i4;
        int iM2494k = c1131v.m2494k(16);
        int iM2494k2 = c1131v.m2494k(16);
        if (iM2494k2 == 65535) {
            iM2494k2 = c1131v.m2494k(24);
            i = 7;
        } else {
            i = 4;
        }
        int i8 = iM2494k2 + i;
        if (iM2494k == 44097) {
            i8 += 2;
        }
        if (c1131v.m2494k(2) == 3) {
            do {
                c1131v.m2494k(2);
            } while (c1131v.m2493j());
        }
        int iM2494k3 = c1131v.m2494k(10);
        if (c1131v.m2493j() && c1131v.m2494k(3) > 0) {
            c1131v.m2505v(2);
        }
        int i9 = c1131v.m2493j() ? 48000 : 44100;
        int iM2494k4 = c1131v.m2494k(4);
        int[] iArr = f7273i;
        if (i9 == 44100 && iM2494k4 == 13) {
            i4 = iArr[iM2494k4];
        } else if (i9 != 48000 || iM2494k4 >= 14) {
            i4 = 0;
        } else {
            int i10 = iArr[iM2494k4];
            int i11 = iM2494k3 % 5;
            if (i11 == 1) {
                i4 = (iM2494k4 == 3 || iM2494k4 == 8) ? i10 + 1 : i10;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4 && (iM2494k4 == 3 || iM2494k4 == 8 || iM2494k4 == 11)) {
                    }
                }
            } else if (iM2494k4 == 8 || iM2494k4 == 11) {
            }
        }
        C0644h c0644h = new C0644h();
        c0644h.f2541a = i9;
        c0644h.f2542b = i8;
        c0644h.f2543c = i4;
        return c0644h;
    }

    /* renamed from: n */
    public static C1963a m3838n(C1131v c1131v, boolean z7) throws C0247v0 {
        int iM2494k = c1131v.m2494k(5);
        if (iM2494k == 31) {
            iM2494k = c1131v.m2494k(6) + 32;
        }
        int iM3836l = m3836l(c1131v);
        int iM2494k2 = c1131v.m2494k(4);
        String strM12h = AbstractC0008a1.m12h(iM2494k, "mp4a.40.");
        if (iM2494k == 5 || iM2494k == 29) {
            iM3836l = m3836l(c1131v);
            int iM2494k3 = c1131v.m2494k(5);
            if (iM2494k3 == 31) {
                iM2494k3 = c1131v.m2494k(6) + 32;
            }
            iM2494k = iM2494k3;
            if (iM2494k == 22) {
                iM2494k2 = c1131v.m2494k(4);
            }
        }
        if (z7) {
            if (iM2494k != 1 && iM2494k != 2 && iM2494k != 3 && iM2494k != 4 && iM2494k != 6 && iM2494k != 7 && iM2494k != 17) {
                switch (iM2494k) {
                    case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                    case 20:
                    case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                    case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                    case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                        break;
                    default:
                        throw C0247v0.createForUnsupportedContainerFeature("Unsupported audio object type: " + iM2494k);
                }
            }
            if (c1131v.m2493j()) {
                AbstractC1101a.m2348F("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c1131v.m2493j()) {
                c1131v.m2505v(14);
            }
            boolean zM2493j = c1131v.m2493j();
            if (iM2494k2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM2494k == 6 || iM2494k == 20) {
                c1131v.m2505v(3);
            }
            if (zM2493j) {
                if (iM2494k == 22) {
                    c1131v.m2505v(16);
                }
                if (iM2494k == 17 || iM2494k == 19 || iM2494k == 20 || iM2494k == 23) {
                    c1131v.m2505v(3);
                }
                c1131v.m2505v(1);
            }
            switch (iM2494k) {
                case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                case 20:
                case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                    int iM2494k4 = c1131v.m2494k(2);
                    if (iM2494k4 == 2 || iM2494k4 == 3) {
                        throw C0247v0.createForUnsupportedContainerFeature("Unsupported epConfig: " + iM2494k4);
                    }
            }
        }
        int i = f7266b[iM2494k2];
        if (i != -1) {
            return new C1963a(strM12h, iM3836l, i);
        }
        throw C0247v0.createForMalformedContainer(null, null);
    }

    /* renamed from: o */
    public static void m3839o(C1131v c1131v, C1967c c1967c) throws C0247v0 {
        int iM2494k = c1131v.m2494k(5);
        c1131v.m2505v(2);
        if (c1131v.m2493j()) {
            c1131v.m2505v(5);
        }
        if (iM2494k >= 7 && iM2494k <= 10) {
            c1131v.m2504u();
        }
        if (c1131v.m2493j()) {
            int iM2494k2 = c1131v.m2494k(3);
            if (c1967c.f7293b == -1 && iM2494k >= 0 && iM2494k <= 15 && (iM2494k2 == 0 || iM2494k2 == 1)) {
                c1967c.f7293b = iM2494k;
            }
            if (c1131v.m2493j()) {
                m3847w(c1131v);
            }
        }
    }

    /* renamed from: p */
    public static void m3840p(C1131v c1131v, C1967c c1967c) throws C0247v0 {
        c1131v.m2505v(2);
        boolean zM2493j = c1131v.m2493j();
        int iM2494k = c1131v.m2494k(8);
        for (int i = 0; i < iM2494k; i++) {
            c1131v.m2505v(2);
            if (c1131v.m2493j()) {
                c1131v.m2505v(5);
            }
            if (zM2493j) {
                c1131v.m2505v(24);
            } else {
                if (c1131v.m2493j()) {
                    if (!c1131v.m2493j()) {
                        c1131v.m2505v(4);
                    }
                    c1967c.f7294c = c1131v.m2494k(6) + 1;
                }
                c1131v.m2505v(4);
            }
        }
        if (c1131v.m2493j()) {
            c1131v.m2505v(3);
            if (c1131v.m2493j()) {
                m3847w(c1131v);
            }
        }
    }

    /* renamed from: q */
    public static int m3841q(C1131v c1131v, int[] iArr) {
        int i = 0;
        for (int i4 = 0; i4 < 3 && c1131v.m2493j(); i4++) {
            i++;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i8 += 1 << iArr[i9];
        }
        return c1131v.m2494k(iArr[i]) + i8;
    }

    /* renamed from: r */
    public static C0241t0 m3842r(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i4 = AbstractC1118i0.f4750a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                AbstractC1101a.m2348F("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C2870a.m4969a(new C1132w(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    AbstractC1101a.m2349G("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new C0862a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0241t0(arrayList);
    }

    /* renamed from: s */
    public static C0241t0 m3843s(InterfaceC1988o interfaceC1988o, boolean z7) throws Throwable {
        C0222n c0222n = z7 ? null : C0557i.f2251b;
        C1132w c1132w = new C1132w(10);
        C0241t0 c0241t0M1301v = null;
        int i = 0;
        while (true) {
            try {
                interfaceC1988o.mo3862i(c1132w.f4799a, 0, 10);
                c1132w.m2513G(0);
                if (c1132w.m2538x() != 4801587) {
                    break;
                }
                c1132w.m2514H(3);
                int iM2534t = c1132w.m2534t();
                int i4 = iM2534t + 10;
                if (c0241t0M1301v == null) {
                    byte[] bArr = new byte[i4];
                    System.arraycopy(c1132w.f4799a, 0, bArr, 0, 10);
                    interfaceC1988o.mo3862i(bArr, 10, iM2534t);
                    c0241t0M1301v = new C0557i(c0222n).m1301v(bArr, i4);
                } else {
                    interfaceC1988o.mo3857d(iM2534t);
                }
                i += i4;
            } catch (EOFException unused) {
            }
        }
        interfaceC1988o.mo3860g();
        interfaceC1988o.mo3857d(i);
        if (c0241t0M1301v == null || c0241t0M1301v.f1412j.length == 0) {
            return null;
        }
        return c0241t0M1301v;
    }

    /* renamed from: t */
    public static int m3844t(C1132w c1132w, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c1132w.m2535u() + 1;
            case 7:
                return c1132w.m2507A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* renamed from: u */
    public static C0016e m3845u(C1132w c1132w) {
        c1132w.m2514H(1);
        int iM2538x = c1132w.m2538x();
        long j = c1132w.f4800b + iM2538x;
        int i = iM2538x / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                break;
            }
            long jM2529o = c1132w.m2529o();
            if (jM2529o == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i4);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i4);
                break;
            }
            jArrCopyOf[i4] = jM2529o;
            jArrCopyOf2[i4] = c1132w.m2529o();
            c1132w.m2514H(2);
            i4++;
        }
        c1132w.m2514H((int) (j - c1132w.f4800b));
        return new C0016e(jArrCopyOf, 25, jArrCopyOf2);
    }

    /* renamed from: v */
    public static C1629o m3846v(C1132w c1132w, boolean z7, boolean z8) throws C0247v0 {
        if (z7) {
            m3848x(3, c1132w, false);
        }
        c1132w.m2533s((int) c1132w.m2526l(), StandardCharsets.UTF_8);
        long jM2526l = c1132w.m2526l();
        String[] strArr = new String[(int) jM2526l];
        for (int i = 0; i < jM2526l; i++) {
            strArr[i] = c1132w.m2533s((int) c1132w.m2526l(), StandardCharsets.UTF_8);
        }
        if (z8 && (c1132w.m2535u() & 1) == 0) {
            throw C0247v0.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new C1629o(strArr);
    }

    /* renamed from: w */
    public static void m3847w(C1131v c1131v) throws C0247v0 {
        int iM2494k = c1131v.m2494k(6);
        if (iM2494k < 2 || iM2494k > 42) {
            throw C0247v0.createForUnsupportedContainerFeature(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iM2494k)));
        }
        c1131v.m2505v(iM2494k * 8);
    }

    /* renamed from: x */
    public static boolean m3848x(int i, C1132w c1132w, boolean z7) throws C0247v0 {
        if (c1132w.m2515a() < 7) {
            if (z7) {
                return false;
            }
            throw C0247v0.createForMalformedContainer("too short header: " + c1132w.m2515a(), null);
        }
        if (c1132w.m2535u() != i) {
            if (z7) {
                return false;
            }
            throw C0247v0.createForMalformedContainer("expected header type " + Integer.toHexString(i), null);
        }
        if (c1132w.m2535u() == 118 && c1132w.m2535u() == 111 && c1132w.m2535u() == 114 && c1132w.m2535u() == 98 && c1132w.m2535u() == 105 && c1132w.m2535u() == 115) {
            return true;
        }
        if (z7) {
            return false;
        }
        throw C0247v0.createForMalformedContainer("expected characters 'vorbis'", null);
    }
}
