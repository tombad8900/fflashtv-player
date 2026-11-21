package p048f2;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.AbstractC0213k;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0216l;
import androidx.media3.common.C0234r;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okhttp3.C2181z;
import okhttp3.internal.p129ws.C2153d;
import p002a1.AbstractC0008a1;
import p002a1.C0036o;
import p005a4.C0073c;
import p005a4.C0087j;
import p052f6.AbstractC0983m0;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p063h1.C1132w;
import p071i1.AbstractC1237p;
import p090k2.InterfaceC1597o;
import p112m7.C1943s;
import p115n1.AbstractC1965b;
import p115n1.C1963a;
import p115n1.C1964a0;
import p115n1.C1969d;
import p115n1.C1978h0;
import p115n1.C1981j;
import p115n1.C1982j0;
import p115n1.C1992s;
import p115n1.C1996w;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f2.d */
/* loaded from: classes.dex */
public final class C0935d implements InterfaceC1987n {

    /* renamed from: e0 */
    public static final byte[] f4057e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: f0 */
    public static final byte[] f4058f0;

    /* renamed from: g0 */
    public static final byte[] f4059g0;

    /* renamed from: h0 */
    public static final byte[] f4060h0;

    /* renamed from: i0 */
    public static final UUID f4061i0;

    /* renamed from: j0 */
    public static final Map f4062j0;

    /* renamed from: A */
    public boolean f4063A;

    /* renamed from: B */
    public long f4064B;

    /* renamed from: C */
    public long f4065C;

    /* renamed from: D */
    public long f4066D;

    /* renamed from: E */
    public C0087j f4067E;

    /* renamed from: F */
    public C0087j f4068F;

    /* renamed from: G */
    public boolean f4069G;

    /* renamed from: H */
    public boolean f4070H;

    /* renamed from: I */
    public int f4071I;

    /* renamed from: J */
    public long f4072J;

    /* renamed from: K */
    public long f4073K;

    /* renamed from: L */
    public int f4074L;

    /* renamed from: M */
    public int f4075M;

    /* renamed from: N */
    public int[] f4076N;

    /* renamed from: O */
    public int f4077O;

    /* renamed from: P */
    public int f4078P;

    /* renamed from: Q */
    public int f4079Q;

    /* renamed from: R */
    public int f4080R;

    /* renamed from: S */
    public boolean f4081S;

    /* renamed from: T */
    public long f4082T;

    /* renamed from: U */
    public int f4083U;

    /* renamed from: V */
    public int f4084V;

    /* renamed from: W */
    public int f4085W;

    /* renamed from: X */
    public boolean f4086X;

    /* renamed from: Y */
    public boolean f4087Y;

    /* renamed from: Z */
    public boolean f4088Z;

    /* renamed from: a */
    public final C0933b f4089a;

    /* renamed from: a0 */
    public int f4090a0;

    /* renamed from: b */
    public final C0936e f4091b;

    /* renamed from: b0 */
    public byte f4092b0;

    /* renamed from: c */
    public final SparseArray f4093c;

    /* renamed from: c0 */
    public boolean f4094c0;

    /* renamed from: d */
    public final boolean f4095d;

    /* renamed from: d0 */
    public InterfaceC1989p f4096d0;

    /* renamed from: e */
    public final boolean f4097e;

    /* renamed from: f */
    public final InterfaceC1597o f4098f;

    /* renamed from: g */
    public final C1132w f4099g;

    /* renamed from: h */
    public final C1132w f4100h;

    /* renamed from: i */
    public final C1132w f4101i;

    /* renamed from: j */
    public final C1132w f4102j;

    /* renamed from: k */
    public final C1132w f4103k;

    /* renamed from: l */
    public final C1132w f4104l;

    /* renamed from: m */
    public final C1132w f4105m;

    /* renamed from: n */
    public final C1132w f4106n;

    /* renamed from: o */
    public final C1132w f4107o;

    /* renamed from: p */
    public final C1132w f4108p;

    /* renamed from: q */
    public ByteBuffer f4109q;

    /* renamed from: r */
    public long f4110r;

    /* renamed from: s */
    public long f4111s;

    /* renamed from: t */
    public long f4112t;

    /* renamed from: u */
    public long f4113u;

    /* renamed from: v */
    public long f4114v;

    /* renamed from: w */
    public C0934c f4115w;

    /* renamed from: x */
    public boolean f4116x;

    /* renamed from: y */
    public int f4117y;

    /* renamed from: z */
    public long f4118z;

    static {
        int i = AbstractC1118i0.f4750a;
        f4058f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f4059g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f4060h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f4061i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        AbstractC0008a1.m20p(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC0008a1.m20p(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f4062j0 = Collections.unmodifiableMap(map);
    }

    public C0935d(int i, InterfaceC1597o interfaceC1597o) {
        C0933b c0933b = new C0933b();
        this.f4111s = -1L;
        this.f4112t = -9223372036854775807L;
        this.f4113u = -9223372036854775807L;
        this.f4114v = -9223372036854775807L;
        this.f4064B = -1L;
        this.f4065C = -1L;
        this.f4066D = -9223372036854775807L;
        this.f4089a = c0933b;
        c0933b.f4001d = new C0036o(20, this);
        this.f4098f = interfaceC1597o;
        this.f4095d = (i & 1) == 0;
        this.f4097e = (i & 2) == 0;
        this.f4091b = new C0936e();
        this.f4093c = new SparseArray();
        this.f4101i = new C1132w(4);
        this.f4102j = new C1132w(ByteBuffer.allocate(4).putInt(-1).array());
        this.f4103k = new C1132w(4);
        this.f4099g = new C1132w(AbstractC1237p.f5170a);
        this.f4100h = new C1132w(4);
        this.f4104l = new C1132w();
        this.f4105m = new C1132w();
        this.f4106n = new C1132w(8);
        this.f4107o = new C1132w();
        this.f4108p = new C1132w();
        this.f4076N = new int[1];
    }

    /* renamed from: d */
    public static byte[] m2100d(String str, long j, long j8) {
        AbstractC1101a.m2353d(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j9 = j - (i * 3600000000L);
        int i4 = (int) (j9 / 60000000);
        long j10 = j9 - (i4 * 60000000);
        int i8 = (int) (j10 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i8), Integer.valueOf((int) ((j10 - (i8 * 1000000)) / j8)));
        int i9 = AbstractC1118i0.f4750a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* renamed from: a */
    public final void m2101a(int i) {
        if (this.f4067E == null || this.f4068F == null) {
            throw C0247v0.createForMalformedContainer("Element " + i + " must be in a Cues", null);
        }
    }

    /* renamed from: b */
    public final void m2102b(int i) {
        if (this.f4115w != null) {
            return;
        }
        throw C0247v0.createForMalformedContainer("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2103c(C0934c c0934c, long j, int i, int i4, int i8) {
        byte[] bArrM2100d;
        int i9;
        int i10;
        C1982j0 c1982j0 = c0934c.f4025U;
        if (c1982j0 != null) {
            c1982j0.m3852b(c0934c.f4029Y, j, i, i4, i8, c0934c.f4040j);
        } else if ("S_TEXT/UTF8".equals(c0934c.f4032b) || "S_TEXT/ASS".equals(c0934c.f4032b) || "S_TEXT/WEBVTT".equals(c0934c.f4032b)) {
            if (this.f4075M > 1) {
                AbstractC1101a.m2348F("MatroskaExtractor", "Skipping subtitle sample in laced block.");
            } else {
                long j8 = this.f4073K;
                if (j8 == -9223372036854775807L) {
                    AbstractC1101a.m2348F("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                } else {
                    String str = c0934c.f4032b;
                    C1132w c1132w = this.f4105m;
                    byte[] bArr = c1132w.f4799a;
                    str.getClass();
                    switch (str) {
                        case "S_TEXT/ASS":
                            bArrM2100d = m2100d("%01d:%02d:%02d:%02d", j8, Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
                            i9 = 21;
                            break;
                        case "S_TEXT/WEBVTT":
                            bArrM2100d = m2100d("%02d:%02d:%02d.%03d", j8, 1000L);
                            i9 = 25;
                            break;
                        case "S_TEXT/UTF8":
                            bArrM2100d = m2100d("%02d:%02d:%02d,%03d", j8, 1000L);
                            i9 = 19;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    System.arraycopy(bArrM2100d, 0, bArr, i9, bArrM2100d.length);
                    int i11 = c1132w.f4800b;
                    while (true) {
                        if (i11 < c1132w.f4801c) {
                            if (c1132w.f4799a[i11] == 0) {
                                c1132w.m2512F(i11);
                            } else {
                                i11++;
                            }
                        }
                    }
                    c0934c.f4029Y.sampleData(c1132w, c1132w.f4801c);
                    i10 = i4 + c1132w.f4801c;
                    if ((i & 268435456) != 0) {
                        int i12 = this.f4075M;
                        C1132w c1132w2 = this.f4108p;
                        if (i12 > 1) {
                            c1132w2.m2510D(0);
                        } else {
                            int i13 = c1132w2.f4801c;
                            c0934c.f4029Y.sampleData(c1132w2, i13, 2);
                            i10 += i13;
                        }
                    }
                    c0934c.f4029Y.sampleMetadata(j, i, i10, i8, c0934c.f4040j);
                }
            }
            i10 = i4;
            if ((i & 268435456) != 0) {
            }
            c0934c.f4029Y.sampleMetadata(j, i, i10, i8, c0934c.f4040j);
        } else {
            i10 = i4;
            if ((i & 268435456) != 0) {
            }
            c0934c.f4029Y.sampleMetadata(j, i, i10, i8, c0934c.f4040j);
        }
        this.f4070H = true;
    }

    /* renamed from: e */
    public final void m2104e(InterfaceC1988o interfaceC1988o, int i) {
        C1132w c1132w = this.f4101i;
        if (c1132w.f4801c >= i) {
            return;
        }
        byte[] bArr = c1132w.f4799a;
        if (bArr.length < i) {
            c1132w.m2516b(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = c1132w.f4799a;
        int i4 = c1132w.f4801c;
        interfaceC1988o.readFully(bArr2, i4, i - i4);
        c1132w.m2512F(i);
    }

    /* renamed from: f */
    public final void m2105f() {
        this.f4083U = 0;
        this.f4084V = 0;
        this.f4085W = 0;
        this.f4086X = false;
        this.f4087Y = false;
        this.f4088Z = false;
        this.f4090a0 = 0;
        this.f4092b0 = (byte) 0;
        this.f4094c0 = false;
        this.f4104l.m2510D(0);
    }

    /* renamed from: g */
    public final long m2106g(long j) throws C0247v0 {
        long j8 = this.f4112t;
        if (j8 == -9223372036854775807L) {
            throw C0247v0.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
        }
        int i = AbstractC1118i0.f4750a;
        return AbstractC1118i0.m2437a0(j, j8, 1000L, RoundingMode.DOWN);
    }

    /* renamed from: h */
    public final int m2107h(InterfaceC1988o interfaceC1988o, C0934c c0934c, int i, boolean z7) throws C0247v0 {
        int iSampleData;
        int iSampleData2;
        int i4;
        if ("S_TEXT/UTF8".equals(c0934c.f4032b)) {
            m2108i(interfaceC1988o, f4057e0, i);
            int i8 = this.f4084V;
            m2105f();
            return i8;
        }
        if ("S_TEXT/ASS".equals(c0934c.f4032b)) {
            m2108i(interfaceC1988o, f4059g0, i);
            int i9 = this.f4084V;
            m2105f();
            return i9;
        }
        if ("S_TEXT/WEBVTT".equals(c0934c.f4032b)) {
            m2108i(interfaceC1988o, f4060h0, i);
            int i10 = this.f4084V;
            m2105f();
            return i10;
        }
        InterfaceC1980i0 interfaceC1980i0 = c0934c.f4029Y;
        boolean z8 = this.f4086X;
        C1132w c1132w = this.f4104l;
        if (!z8) {
            boolean z9 = c0934c.f4038h;
            C1132w c1132w2 = this.f4101i;
            if (z9) {
                this.f4079Q &= -1073741825;
                if (!this.f4087Y) {
                    interfaceC1988o.readFully(c1132w2.f4799a, 0, 1);
                    this.f4083U++;
                    byte b7 = c1132w2.f4799a[0];
                    if ((b7 & 128) == 128) {
                        throw C0247v0.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.f4092b0 = b7;
                    this.f4087Y = true;
                }
                byte b8 = this.f4092b0;
                if ((b8 & 1) == 1) {
                    boolean z10 = (b8 & 2) == 2;
                    this.f4079Q |= 1073741824;
                    if (!this.f4094c0) {
                        C1132w c1132w3 = this.f4106n;
                        interfaceC1988o.readFully(c1132w3.f4799a, 0, 8);
                        this.f4083U += 8;
                        this.f4094c0 = true;
                        c1132w2.f4799a[0] = (byte) ((z10 ? 128 : 0) | 8);
                        c1132w2.m2513G(0);
                        interfaceC1980i0.sampleData(c1132w2, 1, 1);
                        this.f4084V++;
                        c1132w3.m2513G(0);
                        interfaceC1980i0.sampleData(c1132w3, 8, 1);
                        this.f4084V += 8;
                    }
                    if (z10) {
                        if (!this.f4088Z) {
                            interfaceC1988o.readFully(c1132w2.f4799a, 0, 1);
                            this.f4083U++;
                            c1132w2.m2513G(0);
                            this.f4090a0 = c1132w2.m2535u();
                            this.f4088Z = true;
                        }
                        int i11 = this.f4090a0 * 4;
                        c1132w2.m2510D(i11);
                        interfaceC1988o.readFully(c1132w2.f4799a, 0, i11);
                        this.f4083U += i11;
                        short s8 = (short) ((this.f4090a0 / 2) + 1);
                        int i12 = (s8 * 6) + 2;
                        ByteBuffer byteBuffer = this.f4109q;
                        if (byteBuffer == null || byteBuffer.capacity() < i12) {
                            this.f4109q = ByteBuffer.allocate(i12);
                        }
                        this.f4109q.position(0);
                        this.f4109q.putShort(s8);
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            i4 = this.f4090a0;
                            if (i13 >= i4) {
                                break;
                            }
                            int iM2539y = c1132w2.m2539y();
                            if (i13 % 2 == 0) {
                                this.f4109q.putShort((short) (iM2539y - i14));
                            } else {
                                this.f4109q.putInt(iM2539y - i14);
                            }
                            i13++;
                            i14 = iM2539y;
                        }
                        int i15 = (i - this.f4083U) - i14;
                        if (i4 % 2 == 1) {
                            this.f4109q.putInt(i15);
                        } else {
                            this.f4109q.putShort((short) i15);
                            this.f4109q.putInt(0);
                        }
                        byte[] bArrArray = this.f4109q.array();
                        C1132w c1132w4 = this.f4107o;
                        c1132w4.m2511E(bArrArray, i12);
                        interfaceC1980i0.sampleData(c1132w4, i12, 1);
                        this.f4084V += i12;
                    }
                }
            } else {
                byte[] bArr = c0934c.f4039i;
                if (bArr != null) {
                    c1132w.m2511E(bArr, bArr.length);
                }
            }
            if ("A_OPUS".equals(c0934c.f4032b) ? z7 : c0934c.f4036f > 0) {
                this.f4079Q |= 268435456;
                this.f4108p.m2510D(0);
                int i16 = (c1132w.f4801c + i) - this.f4083U;
                c1132w2.m2510D(4);
                byte[] bArr2 = c1132w2.f4799a;
                bArr2[0] = (byte) ((i16 >> 24) & 255);
                bArr2[1] = (byte) ((i16 >> 16) & 255);
                bArr2[2] = (byte) ((i16 >> 8) & 255);
                bArr2[3] = (byte) (i16 & 255);
                interfaceC1980i0.sampleData(c1132w2, 4, 2);
                this.f4084V += 4;
            }
            this.f4086X = true;
        }
        int i17 = i + c1132w.f4801c;
        if (!"V_MPEG4/ISO/AVC".equals(c0934c.f4032b) && !"V_MPEGH/ISO/HEVC".equals(c0934c.f4032b)) {
            if (c0934c.f4025U != null) {
                AbstractC1101a.m2359j(c1132w.f4801c == 0);
                c0934c.f4025U.m3853c(interfaceC1988o);
            }
            while (true) {
                int i18 = this.f4083U;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int iM2515a = c1132w.m2515a();
                if (iM2515a > 0) {
                    iSampleData2 = Math.min(i19, iM2515a);
                    interfaceC1980i0.sampleData(c1132w, iSampleData2);
                } else {
                    iSampleData2 = interfaceC1980i0.sampleData((InterfaceC0219m) interfaceC1988o, i19, false);
                }
                this.f4083U += iSampleData2;
                this.f4084V += iSampleData2;
            }
        } else {
            C1132w c1132w5 = this.f4100h;
            byte[] bArr3 = c1132w5.f4799a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i20 = c0934c.f4030Z;
            int i21 = 4 - i20;
            while (this.f4083U < i17) {
                int i22 = this.f4085W;
                if (i22 == 0) {
                    int iMin = Math.min(i20, c1132w.m2515a());
                    interfaceC1988o.readFully(bArr3, i21 + iMin, i20 - iMin);
                    if (iMin > 0) {
                        c1132w.m2519e(bArr3, i21, iMin);
                    }
                    this.f4083U += i20;
                    c1132w5.m2513G(0);
                    this.f4085W = c1132w5.m2539y();
                    C1132w c1132w6 = this.f4099g;
                    c1132w6.m2513G(0);
                    interfaceC1980i0.sampleData(c1132w6, 4);
                    this.f4084V += 4;
                } else {
                    int iM2515a2 = c1132w.m2515a();
                    if (iM2515a2 > 0) {
                        iSampleData = Math.min(i22, iM2515a2);
                        interfaceC1980i0.sampleData(c1132w, iSampleData);
                    } else {
                        iSampleData = interfaceC1980i0.sampleData((InterfaceC0219m) interfaceC1988o, i22, false);
                    }
                    this.f4083U += iSampleData;
                    this.f4084V += iSampleData;
                    this.f4085W -= iSampleData;
                }
            }
        }
        if ("A_VORBIS".equals(c0934c.f4032b)) {
            C1132w c1132w7 = this.f4102j;
            c1132w7.m2513G(0);
            interfaceC1980i0.sampleData(c1132w7, 4);
            this.f4084V += 4;
        }
        int i23 = this.f4084V;
        m2105f();
        return i23;
    }

    /* renamed from: i */
    public final void m2108i(InterfaceC1988o interfaceC1988o, byte[] bArr, int i) {
        int length = bArr.length + i;
        C1132w c1132w = this.f4105m;
        byte[] bArr2 = c1132w.f4799a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            c1132w.getClass();
            c1132w.m2511E(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        interfaceC1988o.readFully(c1132w.f4799a, bArr.length, i);
        c1132w.m2513G(0);
        c1132w.m2512F(length);
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        if (this.f4097e) {
            interfaceC1989p = new C0073c(interfaceC1989p, this.f4098f);
        }
        this.f4096d0 = interfaceC1989p;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x0bc7, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0bc8, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0f4c, code lost:
    
        if (r5 == false) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x0f4e, code lost:
    
        r1 = r0.getPosition();
        r3 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0f56, code lost:
    
        if (r3.f4063A == false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x0f58, code lost:
    
        r3.f4065C = r1;
        r43.f7264a = r3.f4064B;
        r3.f4063A = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0f64, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0f6b, code lost:
    
        if (r3.f4116x == false) goto L898;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x0f6d, code lost:
    
        r6 = r3.f4065C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x0f73, code lost:
    
        if (r6 == (-1)) goto L899;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x0f75, code lost:
    
        r43.f7264a = r6;
        r3.f4065C = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x0f79, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x0f7a, code lost:
    
        r3 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x0f98, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0f99, code lost:
    
        if (r5 != false) goto L859;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0f9b, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x0f9c, code lost:
    
        r1 = r3.f4093c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0fa2, code lost:
    
        if (r0 >= r1.size()) goto L925;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x0fa4, code lost:
    
        r1 = (p048f2.C0934c) r1.valueAt(r0);
        r1.f4029Y.getClass();
        r2 = r1.f4025U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x0fb1, code lost:
    
        if (r2 == null) goto L927;
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x0fb3, code lost:
    
        r2.m3851a(r1.f4029Y, r1.f4040j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x0fba, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x0fbd, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x0fc0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:898:0x0f80, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b8, code lost:
    
        throw androidx.media3.common.C0247v0.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01db  */
    /* JADX WARN: Type inference failed for: r3v41, types: [f2.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Throwable] */
    @Override // p115n1.InterfaceC1987n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws C0247v0 {
        InterfaceC1988o interfaceC1988o2;
        boolean z7;
        int i;
        boolean z8;
        String str;
        boolean z9;
        long j;
        int i4;
        char c8;
        int iM2109a;
        C0935d c0935d;
        char c9;
        InterfaceC1989p interfaceC1989p;
        C0935d c0935d2;
        List listSingletonList;
        int i8;
        int i9;
        String str2;
        C0935d c0935d3;
        Throwable th;
        Pair pair;
        C0935d c0935d4;
        String str3;
        C0935d c0935d5;
        C0935d c0935d6;
        C0246v c0246v;
        boolean zM682k;
        int i10;
        int i11;
        C0216l c0216l;
        int i12;
        byte[] bArr;
        int i13;
        String str4;
        C0935d c0935d7;
        C1943s c1943sM3797a;
        List list;
        InterfaceC1968c0 c1992s;
        int i14;
        long[] jArrCopyOf;
        C0935d c0935d8 = this;
        c0935d8.f4070H = false;
        boolean z10 = true;
        while (true) {
            int i15 = -1;
            if (z10 && !c0935d8.f4070H) {
                C0933b c0933b = c0935d8.f4089a;
                C0936e c0936e = c0933b.f4000c;
                ArrayDeque arrayDeque = c0933b.f3999b;
                AbstractC1101a.m2360k(c0933b.f4001d);
                while (true) {
                    C0932a c0932a = (C0932a) arrayDeque.peek();
                    char c10 = '\uae6b';
                    if (c0932a == null || interfaceC1988o.getPosition() < c0932a.f3997b) {
                        int i16 = 0;
                        if (c0933b.f4002e == 0) {
                            interfaceC1988o2 = interfaceC1988o;
                            int i17 = 4;
                            long jM2110b = c0936e.m2110b(interfaceC1988o2, true, false, 4);
                            if (jM2110b == -2) {
                                byte[] bArr2 = c0933b.f3998a;
                                interfaceC1988o2.mo3860g();
                                while (true) {
                                    interfaceC1988o2.mo3862i(bArr2, i16, i17);
                                    byte b7 = bArr2[i16];
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= 8) {
                                            i4 = -1;
                                        } else if ((C0936e.f4119d[i18] & b7) != 0) {
                                            i4 = i18 + 1;
                                        } else {
                                            i18++;
                                        }
                                    }
                                    if (i4 == -1 || i4 > 4) {
                                        c8 = c10;
                                    } else {
                                        iM2109a = (int) C0936e.m2109a(bArr2, i4, false);
                                        Object obj = c0933b.f4001d.f143k;
                                        if (iM2109a != 357149030 && iM2109a != 524531317 && iM2109a != 475249515) {
                                            c8 = '\uae6b';
                                            if (iM2109a == 374648427) {
                                            }
                                        }
                                    }
                                    interfaceC1988o2.mo3861h(1);
                                    c10 = c8;
                                    i16 = 0;
                                    i17 = 4;
                                }
                                interfaceC1988o2.mo3861h(i4);
                                j = iM2109a;
                            } else {
                                j = jM2110b;
                            }
                            z7 = true;
                            if (j == -1) {
                                z10 = false;
                                z8 = false;
                            } else {
                                c0933b.f4003f = (int) j;
                                c0933b.f4002e = 1;
                            }
                        } else {
                            interfaceC1988o2 = interfaceC1988o;
                            z7 = true;
                        }
                        if (c0933b.f4002e == z7) {
                            c0933b.f4004g = c0936e.m2110b(interfaceC1988o2, false, z7, 8);
                            c0933b.f4002e = 2;
                        }
                        C0036o c0036o = c0933b.f4001d;
                        int i19 = c0933b.f4003f;
                        Object obj2 = c0036o.f143k;
                        switch (i19) {
                            case 131:
                            case 136:
                            case 155:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 241:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21938:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                i = 2;
                                break;
                            case 134:
                            case 17026:
                            case 21358:
                            case 2274716:
                                i = 3;
                                break;
                            case 160:
                            case 166:
                            case 174:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                i = 1;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                i = 4;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                i = 5;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        if (i == 0) {
                            interfaceC1988o2.mo3861h((int) c0933b.f4004g);
                            c0933b.f4002e = 0;
                            i15 = -1;
                        } else if (i == 1) {
                            long position = interfaceC1988o2.getPosition();
                            arrayDeque.push(new C0932a(c0933b.f4003f, c0933b.f4004g + position));
                            C0036o c0036o2 = c0933b.f4001d;
                            int i20 = c0933b.f4003f;
                            long j8 = c0933b.f4004g;
                            C0935d c0935d9 = (C0935d) c0036o2.f143k;
                            AbstractC1101a.m2360k(c0935d9.f4096d0);
                            if (i20 != 160) {
                                if (i20 == 174) {
                                    C0934c c0934c = new C0934c();
                                    c0934c.f4043m = -1;
                                    c0934c.f4044n = -1;
                                    c0934c.f4045o = -1;
                                    c0934c.f4046p = -1;
                                    c0934c.f4047q = -1;
                                    c0934c.f4048r = 0;
                                    c0934c.f4049s = -1;
                                    c0934c.f4050t = 0.0f;
                                    c0934c.f4051u = 0.0f;
                                    c0934c.f4052v = 0.0f;
                                    c0934c.f4053w = null;
                                    c0934c.f4054x = -1;
                                    c0934c.f4055y = false;
                                    c0934c.f4056z = -1;
                                    c0934c.f4005A = -1;
                                    c0934c.f4006B = -1;
                                    c0934c.f4007C = 1000;
                                    c0934c.f4008D = 200;
                                    c0934c.f4009E = -1.0f;
                                    c0934c.f4010F = -1.0f;
                                    c0934c.f4011G = -1.0f;
                                    c0934c.f4012H = -1.0f;
                                    c0934c.f4013I = -1.0f;
                                    c0934c.f4014J = -1.0f;
                                    c0934c.f4015K = -1.0f;
                                    c0934c.f4016L = -1.0f;
                                    c0934c.f4017M = -1.0f;
                                    c0934c.f4018N = -1.0f;
                                    c0934c.f4020P = 1;
                                    c0934c.f4021Q = -1;
                                    c0934c.f4022R = 8000;
                                    c0934c.f4023S = 0L;
                                    c0934c.f4024T = 0L;
                                    c0934c.f4027W = true;
                                    c0934c.f4028X = "eng";
                                    c0935d9.f4115w = c0934c;
                                } else if (i20 == 187) {
                                    z8 = false;
                                    c0935d9.f4069G = false;
                                } else if (i20 == 19899) {
                                    c0935d9.f4117y = -1;
                                    c0935d9.f4118z = -1L;
                                } else if (i20 == 20533) {
                                    c0935d9.m2102b(i20);
                                    c0935d9.f4115w.f4038h = true;
                                } else if (i20 == 21968) {
                                    c0935d9.m2102b(i20);
                                    c0935d9.f4115w.f4055y = true;
                                } else if (i20 == 408125543) {
                                    long j9 = c0935d9.f4111s;
                                    if (j9 != -1 && j9 != position) {
                                        throw C0247v0.createForMalformedContainer("Multiple Segment elements not supported", null);
                                    }
                                    c0935d9.f4111s = position;
                                    c0935d9.f4110r = j8;
                                } else if (i20 == 475249515) {
                                    c0935d9.f4067E = new C0087j(2, false);
                                    c0935d9.f4068F = new C0087j(2, false);
                                } else if (i20 == 524531317 && !c0935d9.f4116x) {
                                    if (!c0935d9.f4095d || c0935d9.f4064B == -1) {
                                        c0935d9.f4096d0.seekMap(new C1992s(c0935d9.f4114v));
                                        c0935d9.f4116x = true;
                                    } else {
                                        c0935d9.f4063A = true;
                                    }
                                }
                                z8 = false;
                            } else {
                                z8 = false;
                                c0935d9.f4081S = false;
                                c0935d9.f4082T = 0L;
                            }
                            c0933b.f4002e = z8 ? 1 : 0;
                        } else if (i == 2) {
                            long j10 = c0933b.f4004g;
                            if (j10 > 8) {
                                throw C0247v0.createForMalformedContainer("Invalid integer size: " + c0933b.f4004g, null);
                            }
                            c0036o.m173p(i19, c0933b.m2098a(interfaceC1988o2, (int) j10));
                            z8 = false;
                            c0933b.f4002e = 0;
                        } else if (i == 3) {
                            long j11 = c0933b.f4004g;
                            if (j11 > 2147483647L) {
                                throw C0247v0.createForMalformedContainer("String element size: " + c0933b.f4004g, null);
                            }
                            int i21 = (int) j11;
                            if (i21 == 0) {
                                str = C2181z.FRAGMENT_ENCODE_SET;
                            } else {
                                byte[] bArr3 = new byte[i21];
                                interfaceC1988o2.readFully(bArr3, 0, i21);
                                while (i21 > 0 && bArr3[i21 - 1] == 0) {
                                    i21--;
                                }
                                str = new String(bArr3, 0, i21);
                            }
                            C0935d c0935d10 = (C0935d) c0036o.f143k;
                            if (i19 == 134) {
                                c0935d10.m2102b(i19);
                                c0935d10.f4115w.f4032b = str;
                            } else if (i19 != 17026) {
                                if (i19 == 21358) {
                                    c0935d10.m2102b(i19);
                                    c0935d10.f4115w.f4031a = str;
                                } else if (i19 == 2274716) {
                                    c0935d10.m2102b(i19);
                                    c0935d10.f4115w.f4028X = str;
                                }
                            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                throw C0247v0.createForMalformedContainer("DocType " + str + " not supported", null);
                            }
                            z8 = false;
                            c0933b.f4002e = 0;
                        } else if (i == 4) {
                            c0036o.m169i(i19, (int) c0933b.f4004g, interfaceC1988o2);
                            z8 = false;
                            c0933b.f4002e = 0;
                        } else {
                            if (i != 5) {
                                throw C0247v0.createForMalformedContainer("Invalid element type " + i, null);
                            }
                            long j12 = c0933b.f4004g;
                            if (j12 != 4 && j12 != 8) {
                                throw C0247v0.createForMalformedContainer("Invalid float size: " + c0933b.f4004g, null);
                            }
                            int i22 = (int) j12;
                            double dIntBitsToFloat = i22 == 4 ? Float.intBitsToFloat((int) r5) : Double.longBitsToDouble(c0933b.m2098a(interfaceC1988o2, i22));
                            C0935d c0935d11 = (C0935d) c0036o.f143k;
                            if (i19 == 181) {
                                c0935d11.m2102b(i19);
                                c0935d11.f4115w.f4022R = (int) dIntBitsToFloat;
                            } else if (i19 != 17545) {
                                switch (i19) {
                                    case 21969:
                                        c0935d11.m2102b(i19);
                                        c0935d11.f4115w.f4009E = (float) dIntBitsToFloat;
                                        break;
                                    case 21970:
                                        c0935d11.m2102b(i19);
                                        c0935d11.f4115w.f4010F = (float) dIntBitsToFloat;
                                        break;
                                    case 21971:
                                        c0935d11.m2102b(i19);
                                        c0935d11.f4115w.f4011G = (float) dIntBitsToFloat;
                                        break;
                                    case 21972:
                                        c0935d11.m2102b(i19);
                                        c0935d11.f4115w.f4012H = (float) dIntBitsToFloat;
                                        break;
                                    case 21973:
                                        c0935d11.m2102b(i19);
                                        c0935d11.f4115w.f4013I = (float) dIntBitsToFloat;
                                        break;
                                    case 21974:
                                        c0935d11.m2102b(i19);
                                        c0935d11.f4115w.f4014J = (float) dIntBitsToFloat;
                                        break;
                                    case 21975:
                                        c0935d11.m2102b(i19);
                                        c0935d11.f4115w.f4015K = (float) dIntBitsToFloat;
                                        break;
                                    case 21976:
                                        c0935d11.m2102b(i19);
                                        c0935d11.f4115w.f4016L = (float) dIntBitsToFloat;
                                        break;
                                    case 21977:
                                        c0935d11.m2102b(i19);
                                        c0935d11.f4115w.f4017M = (float) dIntBitsToFloat;
                                        break;
                                    case 21978:
                                        c0935d11.m2102b(i19);
                                        c0935d11.f4115w.f4018N = (float) dIntBitsToFloat;
                                        break;
                                    default:
                                        switch (i19) {
                                            case 30323:
                                                c0935d11.m2102b(i19);
                                                c0935d11.f4115w.f4050t = (float) dIntBitsToFloat;
                                                break;
                                            case 30324:
                                                c0935d11.m2102b(i19);
                                                c0935d11.f4115w.f4051u = (float) dIntBitsToFloat;
                                                break;
                                            case 30325:
                                                c0935d11.m2102b(i19);
                                                c0935d11.f4115w.f4052v = (float) dIntBitsToFloat;
                                                break;
                                        }
                                }
                            } else {
                                c0935d11.f4113u = (long) dIntBitsToFloat;
                            }
                            z9 = false;
                            c0933b.f4002e = 0;
                        }
                    } else {
                        C0036o c0036o3 = c0933b.f4001d;
                        int i23 = ((C0932a) arrayDeque.pop()).f3996a;
                        C0935d c0935d12 = (C0935d) c0036o3.f143k;
                        SparseArray sparseArray = c0935d12.f4093c;
                        AbstractC1101a.m2360k(c0935d12.f4096d0);
                        if (i23 == 160) {
                            if (c0935d12.f4071I == 2) {
                                C0934c c0934c2 = (C0934c) sparseArray.get(c0935d12.f4077O);
                                c0934c2.f4029Y.getClass();
                                if (c0935d12.f4082T > 0 && "A_OPUS".equals(c0934c2.f4032b)) {
                                    C1132w c1132w = c0935d12.f4108p;
                                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(c0935d12.f4082T).array();
                                    c1132w.getClass();
                                    c1132w.m2511E(bArrArray, bArrArray.length);
                                }
                                int i24 = 0;
                                for (int i25 = 0; i25 < c0935d12.f4075M; i25++) {
                                    i24 += c0935d12.f4076N[i25];
                                }
                                int i26 = 0;
                                while (i26 < c0935d12.f4075M) {
                                    long j13 = c0935d12.f4072J + ((c0934c2.f4035e * i26) / 1000);
                                    int i27 = c0935d12.f4079Q;
                                    if (i26 == 0 && !c0935d12.f4081S) {
                                        i27 |= 1;
                                    }
                                    int i28 = c0935d12.f4076N[i26];
                                    int i29 = i24 - i28;
                                    c0935d12.m2103c(c0934c2, j13, i27, i28, i29);
                                    i26++;
                                    i24 = i29;
                                }
                                z9 = false;
                                c0935d12.f4071I = 0;
                            }
                            interfaceC1988o2 = interfaceC1988o;
                        } else if (i23 == 174) {
                            ?? r32 = c0935d12.f4115w;
                            AbstractC1101a.m2360k(r32);
                            String str5 = r32.f4032b;
                            if (str5 == null) {
                                throw C0247v0.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
                            }
                            switch (str5) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    InterfaceC1989p interfaceC1989p2 = c0935d12.f4096d0;
                                    int i30 = r32.f4033c;
                                    switch (str5.hashCode()) {
                                        case -2095576542:
                                            if (str5.equals("V_MPEG4/ISO/AP")) {
                                                c9 = 0;
                                                break;
                                            } else {
                                                c9 = '\uffff';
                                                break;
                                            }
                                        case -2095575984:
                                            if (str5.equals("V_MPEG4/ISO/SP")) {
                                                c9 = 1;
                                                break;
                                            }
                                            break;
                                        case -1985379776:
                                            if (str5.equals("A_MS/ACM")) {
                                                c9 = 2;
                                                break;
                                            }
                                            break;
                                        case -1784763192:
                                            if (str5.equals("A_TRUEHD")) {
                                                c9 = 3;
                                                break;
                                            }
                                            break;
                                        case -1730367663:
                                            if (str5.equals("A_VORBIS")) {
                                                c9 = 4;
                                                break;
                                            }
                                            break;
                                        case -1482641358:
                                            if (str5.equals("A_MPEG/L2")) {
                                                c9 = 5;
                                                break;
                                            }
                                            break;
                                        case -1482641357:
                                            if (str5.equals("A_MPEG/L3")) {
                                                c9 = 6;
                                                break;
                                            }
                                            break;
                                        case -1373388978:
                                            if (str5.equals("V_MS/VFW/FOURCC")) {
                                                c9 = 7;
                                                break;
                                            }
                                            break;
                                        case -933872740:
                                            if (str5.equals("S_DVBSUB")) {
                                                c9 = '\b';
                                                break;
                                            }
                                            break;
                                        case -538363189:
                                            if (str5.equals("V_MPEG4/ISO/ASP")) {
                                                c9 = '\t';
                                                break;
                                            }
                                            break;
                                        case -538363109:
                                            if (str5.equals("V_MPEG4/ISO/AVC")) {
                                                c9 = '\n';
                                                break;
                                            }
                                            break;
                                        case -425012669:
                                            if (str5.equals("S_VOBSUB")) {
                                                c9 = 11;
                                                break;
                                            }
                                            break;
                                        case -356037306:
                                            if (str5.equals("A_DTS/LOSSLESS")) {
                                                c9 = '\f';
                                                break;
                                            }
                                            break;
                                        case 62923557:
                                            if (str5.equals("A_AAC")) {
                                                c9 = '\r';
                                                break;
                                            }
                                            break;
                                        case 62923603:
                                            if (str5.equals("A_AC3")) {
                                                c9 = 14;
                                                break;
                                            }
                                            break;
                                        case 62927045:
                                            if (str5.equals("A_DTS")) {
                                                c9 = 15;
                                                break;
                                            }
                                            break;
                                        case 82318131:
                                            if (str5.equals("V_AV1")) {
                                                c9 = 16;
                                                break;
                                            }
                                            break;
                                        case 82338133:
                                            if (str5.equals("V_VP8")) {
                                                c9 = 17;
                                                break;
                                            }
                                            break;
                                        case 82338134:
                                            if (str5.equals("V_VP9")) {
                                                c9 = 18;
                                                break;
                                            }
                                            break;
                                        case 99146302:
                                            if (str5.equals("S_HDMV/PGS")) {
                                                c9 = 19;
                                                break;
                                            }
                                            break;
                                        case 444813526:
                                            if (str5.equals("V_THEORA")) {
                                                c9 = 20;
                                                break;
                                            }
                                            break;
                                        case 542569478:
                                            if (str5.equals("A_DTS/EXPRESS")) {
                                                c9 = 21;
                                                break;
                                            }
                                            break;
                                        case 635596514:
                                            if (str5.equals("A_PCM/FLOAT/IEEE")) {
                                                c9 = 22;
                                                break;
                                            }
                                            break;
                                        case 725948237:
                                            if (str5.equals("A_PCM/INT/BIG")) {
                                                c9 = 23;
                                                break;
                                            }
                                            break;
                                        case 725957860:
                                            if (str5.equals("A_PCM/INT/LIT")) {
                                                c9 = 24;
                                                break;
                                            }
                                            break;
                                        case 738597099:
                                            if (str5.equals("S_TEXT/ASS")) {
                                                c9 = 25;
                                                break;
                                            }
                                            break;
                                        case 855502857:
                                            if (str5.equals("V_MPEGH/ISO/HEVC")) {
                                                c9 = 26;
                                                break;
                                            }
                                            break;
                                        case 1045209816:
                                            if (str5.equals("S_TEXT/WEBVTT")) {
                                                c9 = 27;
                                                break;
                                            }
                                            break;
                                        case 1422270023:
                                            if (str5.equals("S_TEXT/UTF8")) {
                                                c9 = 28;
                                                break;
                                            }
                                            break;
                                        case 1809237540:
                                            if (str5.equals("V_MPEG2")) {
                                                c9 = 29;
                                                break;
                                            }
                                            break;
                                        case 1950749482:
                                            if (str5.equals("A_EAC3")) {
                                                c9 = 30;
                                                break;
                                            }
                                            break;
                                        case 1950789798:
                                            if (str5.equals("A_FLAC")) {
                                                c9 = 31;
                                                break;
                                            }
                                            break;
                                        case 1951062397:
                                            if (str5.equals("A_OPUS")) {
                                                c9 = ' ';
                                                break;
                                            }
                                            break;
                                    }
                                    String str6 = "video/x-unknown";
                                    switch (c9) {
                                        case 0:
                                        case 1:
                                        case '\t':
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d2 = c0935d12;
                                            byte[] bArr4 = r32.f4041k;
                                            str6 = "video/mp4v-es";
                                            listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            i8 = -1;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null && (c1943sM3797a = C1943s.m3797a(new C1132w(r32.f4019O))) != null) {
                                                str2 = c1943sM3797a.f7233k;
                                                str6 = "video/dolby-vision";
                                            }
                                            int i31 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p3 = interfaceC1989p;
                                            Map map = f4062j0;
                                            if (zM682k) {
                                                c0246v.f1425B = r32.f4020P;
                                                c0246v.f1426C = r32.f4022R;
                                                c0246v.f1427D = i8;
                                                i10 = 1;
                                            } else if (AbstractC0244u0.m686o(str6)) {
                                                if (r32.f4048r == 0) {
                                                    int i32 = r32.f4046p;
                                                    i11 = -1;
                                                    if (i32 == -1) {
                                                        i32 = r32.f4043m;
                                                    }
                                                    r32.f4046p = i32;
                                                    int i33 = r32.f4047q;
                                                    if (i33 == -1) {
                                                        i33 = r32.f4044n;
                                                    }
                                                    r32.f4047q = i33;
                                                } else {
                                                    i11 = -1;
                                                }
                                                float f8 = (r32.f4046p == i11 || (i13 = r32.f4047q) == i11) ? -1.0f : (r32.f4044n * r0) / (r32.f4043m * i13);
                                                if (r32.f4055y) {
                                                    if (r32.f4009E == -1.0f || r32.f4010F == -1.0f || r32.f4011G == -1.0f || r32.f4012H == -1.0f || r32.f4013I == -1.0f || r32.f4014J == -1.0f || r32.f4015K == -1.0f || r32.f4016L == -1.0f || r32.f4017M == -1.0f || r32.f4018N == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((r32.f4009E * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r32.f4010F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r32.f4011G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r32.f4012H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r32.f4013I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r32.f4014J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r32.f4015K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r32.f4016L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (r32.f4017M + 0.5f));
                                                        byteBufferOrder.putShort((short) (r32.f4018N + 0.5f));
                                                        byteBufferOrder.putShort((short) r32.f4007C);
                                                        byteBufferOrder.putShort((short) r32.f4008D);
                                                        bArr = bArr5;
                                                    }
                                                    int i34 = r32.f4056z;
                                                    int i35 = r32.f4006B;
                                                    int i36 = r32.f4005A;
                                                    int i37 = r32.f4045o;
                                                    c0216l = new C0216l(i34, i35, i36, i37, i37, bArr);
                                                } else {
                                                    c0216l = null;
                                                }
                                                String str7 = r32.f4031a;
                                                int iIntValue = (str7 == null || !map.containsKey(str7)) ? -1 : ((Integer) map.get(r32.f4031a)).intValue();
                                                if (r32.f4049s == 0 && Float.compare(r32.f4050t, 0.0f) == 0 && Float.compare(r32.f4051u, 0.0f) == 0) {
                                                    if (Float.compare(r32.f4052v, 0.0f) == 0) {
                                                        i12 = 0;
                                                    } else if (Float.compare(r32.f4052v, 90.0f) == 0) {
                                                        i12 = 90;
                                                    } else if (Float.compare(r32.f4052v, -180.0f) == 0 || Float.compare(r32.f4052v, 180.0f) == 0) {
                                                        i12 = 180;
                                                    } else if (Float.compare(r32.f4052v, -90.0f) == 0) {
                                                        i12 = 270;
                                                    }
                                                    c0246v.f1454t = r32.f4043m;
                                                    c0246v.f1455u = r32.f4044n;
                                                    c0246v.f1458x = f8;
                                                    c0246v.f1457w = i12;
                                                    c0246v.f1459y = r32.f4053w;
                                                    c0246v.f1460z = r32.f4054x;
                                                    c0246v.f1424A = c0216l;
                                                    i10 = 2;
                                                } else {
                                                    i12 = iIntValue;
                                                    c0246v.f1454t = r32.f4043m;
                                                    c0246v.f1455u = r32.f4044n;
                                                    c0246v.f1458x = f8;
                                                    c0246v.f1457w = i12;
                                                    c0246v.f1459y = r32.f4053w;
                                                    c0246v.f1460z = r32.f4054x;
                                                    c0246v.f1424A = c0216l;
                                                    i10 = 2;
                                                }
                                            } else {
                                                if (!"application/x-subrip".equals(str6) && !"text/x-ssa".equals(str6) && !"text/vtt".equals(str6) && !"application/vobsub".equals(str6) && !"application/pgs".equals(str6) && !"application/dvbsubs".equals(str6)) {
                                                    throw C0247v0.createForMalformedContainer("Unexpected MIME type.", null);
                                                }
                                                i10 = 3;
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null && !map.containsKey(str4)) {
                                                c0246v.f1436b = r32.f4031a;
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i31;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p3.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track;
                                            interfaceC1980i0Track.format(c0249w);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case 2:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d2 = c0935d12;
                                            C1132w c1132w2 = new C1132w(r32.m2099a(r32.f4032b));
                                            try {
                                                int iM2528n = c1132w2.m2528n();
                                                if (iM2528n != 1) {
                                                    if (iM2528n == 65534) {
                                                        c1132w2.m2513G(24);
                                                        long jM2529o = c1132w2.m2529o();
                                                        UUID uuid = f4061i0;
                                                        if (jM2529o != uuid.getMostSignificantBits() || c1132w2.m2529o() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str6 = "audio/x-unknown";
                                                        i8 = -1;
                                                        listSingletonList = null;
                                                        i9 = -1;
                                                        str2 = null;
                                                        if (r32.f4019O != null) {
                                                            str2 = c1943sM3797a.f7233k;
                                                            str6 = "video/dolby-vision";
                                                            break;
                                                        }
                                                        int i312 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                                        c0246v = new C0246v();
                                                        zM682k = AbstractC0244u0.m682k(str6);
                                                        InterfaceC1989p interfaceC1989p32 = interfaceC1989p;
                                                        Map map2 = f4062j0;
                                                        if (zM682k) {
                                                        }
                                                        str4 = r32.f4031a;
                                                        if (str4 != null) {
                                                            c0246v.f1436b = r32.f4031a;
                                                            break;
                                                        }
                                                        c0246v.f1435a = Integer.toString(i30);
                                                        c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                                        c0246v.f1448n = i9;
                                                        c0246v.f1438d = r32.f4028X;
                                                        c0246v.f1439e = i312;
                                                        c0246v.f1450p = listSingletonList;
                                                        c0246v.f1444j = str2;
                                                        c0246v.f1451q = r32.f4042l;
                                                        C0249w c0249w2 = new C0249w(c0246v);
                                                        InterfaceC1980i0 interfaceC1980i0Track2 = interfaceC1989p32.track(r32.f4033c, i10);
                                                        r32.f4029Y = interfaceC1980i0Track2;
                                                        interfaceC1980i0Track2.format(c0249w2);
                                                        sparseArray.put(r32.f4033c, r32);
                                                        c0935d7 = c0935d2;
                                                        break;
                                                    }
                                                    AbstractC1101a.m2348F("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    i8 = -1;
                                                    listSingletonList = null;
                                                    i9 = -1;
                                                    str2 = null;
                                                    if (r32.f4019O != null) {
                                                    }
                                                    int i3122 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                                    c0246v = new C0246v();
                                                    zM682k = AbstractC0244u0.m682k(str6);
                                                    InterfaceC1989p interfaceC1989p322 = interfaceC1989p;
                                                    Map map22 = f4062j0;
                                                    if (zM682k) {
                                                    }
                                                    str4 = r32.f4031a;
                                                    if (str4 != null) {
                                                    }
                                                    c0246v.f1435a = Integer.toString(i30);
                                                    c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                                    c0246v.f1448n = i9;
                                                    c0246v.f1438d = r32.f4028X;
                                                    c0246v.f1439e = i3122;
                                                    c0246v.f1450p = listSingletonList;
                                                    c0246v.f1444j = str2;
                                                    c0246v.f1451q = r32.f4042l;
                                                    C0249w c0249w22 = new C0249w(c0246v);
                                                    InterfaceC1980i0 interfaceC1980i0Track22 = interfaceC1989p322.track(r32.f4033c, i10);
                                                    r32.f4029Y = interfaceC1980i0Track22;
                                                    interfaceC1980i0Track22.format(c0249w22);
                                                    sparseArray.put(r32.f4033c, r32);
                                                    c0935d7 = c0935d2;
                                                }
                                                int iM2413D = AbstractC1118i0.m2413D(r32.f4021Q);
                                                if (iM2413D == 0) {
                                                    AbstractC1101a.m2348F("MatroskaExtractor", "Unsupported PCM bit depth: " + r32.f4021Q + ". Setting mimeType to audio/x-unknown");
                                                    str6 = "audio/x-unknown";
                                                    i8 = -1;
                                                    listSingletonList = null;
                                                    i9 = -1;
                                                    str2 = null;
                                                    if (r32.f4019O != null) {
                                                    }
                                                    int i31222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                                    c0246v = new C0246v();
                                                    zM682k = AbstractC0244u0.m682k(str6);
                                                    InterfaceC1989p interfaceC1989p3222 = interfaceC1989p;
                                                    Map map222 = f4062j0;
                                                    if (zM682k) {
                                                    }
                                                    str4 = r32.f4031a;
                                                    if (str4 != null) {
                                                    }
                                                    c0246v.f1435a = Integer.toString(i30);
                                                    c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                                    c0246v.f1448n = i9;
                                                    c0246v.f1438d = r32.f4028X;
                                                    c0246v.f1439e = i31222;
                                                    c0246v.f1450p = listSingletonList;
                                                    c0246v.f1444j = str2;
                                                    c0246v.f1451q = r32.f4042l;
                                                    C0249w c0249w222 = new C0249w(c0246v);
                                                    InterfaceC1980i0 interfaceC1980i0Track222 = interfaceC1989p3222.track(r32.f4033c, i10);
                                                    r32.f4029Y = interfaceC1980i0Track222;
                                                    interfaceC1980i0Track222.format(c0249w222);
                                                    sparseArray.put(r32.f4033c, r32);
                                                    c0935d7 = c0935d2;
                                                } else {
                                                    i8 = iM2413D;
                                                    str6 = "audio/raw";
                                                    listSingletonList = null;
                                                    i9 = -1;
                                                    str2 = null;
                                                    if (r32.f4019O != null) {
                                                    }
                                                    int i312222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                                    c0246v = new C0246v();
                                                    zM682k = AbstractC0244u0.m682k(str6);
                                                    InterfaceC1989p interfaceC1989p32222 = interfaceC1989p;
                                                    Map map2222 = f4062j0;
                                                    if (zM682k) {
                                                    }
                                                    str4 = r32.f4031a;
                                                    if (str4 != null) {
                                                    }
                                                    c0246v.f1435a = Integer.toString(i30);
                                                    c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                                    c0246v.f1448n = i9;
                                                    c0246v.f1438d = r32.f4028X;
                                                    c0246v.f1439e = i312222;
                                                    c0246v.f1450p = listSingletonList;
                                                    c0246v.f1444j = str2;
                                                    c0246v.f1451q = r32.f4042l;
                                                    C0249w c0249w2222 = new C0249w(c0246v);
                                                    InterfaceC1980i0 interfaceC1980i0Track2222 = interfaceC1989p32222.track(r32.f4033c, i10);
                                                    r32.f4029Y = interfaceC1980i0Track2222;
                                                    interfaceC1980i0Track2222.format(c0249w2222);
                                                    sparseArray.put(r32.f4033c, r32);
                                                    c0935d7 = c0935d2;
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw C0247v0.createForMalformedContainer("Error parsing MS/ACM codec private", null);
                                            }
                                            break;
                                        case 3:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d2 = c0935d12;
                                            r32.f4025U = new C1982j0();
                                            str6 = "audio/true-hd";
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i3122222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p322222 = interfaceC1989p;
                                            Map map22222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i3122222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w22222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track22222 = interfaceC1989p322222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track22222;
                                            interfaceC1980i0Track22222.format(c0249w22222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case 4:
                                            interfaceC1989p = interfaceC1989p2;
                                            byte[] bArrM2099a = r32.m2099a(str5);
                                            try {
                                                try {
                                                    if (bArrM2099a[0] != 2) {
                                                        throw C0247v0.createForMalformedContainer("Error parsing vorbis codec private", null);
                                                    }
                                                    int i38 = 0;
                                                    int i39 = 1;
                                                    while (true) {
                                                        int i40 = bArrM2099a[i39] & 255;
                                                        if (i40 != 255) {
                                                            int i41 = i39 + 1;
                                                            int i42 = i38 + i40;
                                                            c0935d2 = c0935d12;
                                                            int i43 = 0;
                                                            while (true) {
                                                                int i44 = bArrM2099a[i41] & 255;
                                                                if (i44 != 255) {
                                                                    int i45 = i41 + 1;
                                                                    int i46 = i43 + i44;
                                                                    if (bArrM2099a[i45] != 1) {
                                                                        throw C0247v0.createForMalformedContainer("Error parsing vorbis codec private", null);
                                                                    }
                                                                    byte[] bArr6 = new byte[i42];
                                                                    System.arraycopy(bArrM2099a, i45, bArr6, 0, i42);
                                                                    int i47 = i45 + i42;
                                                                    if (bArrM2099a[i47] != 3) {
                                                                        throw C0247v0.createForMalformedContainer("Error parsing vorbis codec private", null);
                                                                    }
                                                                    int i48 = i47 + i46;
                                                                    if (bArrM2099a[i48] != 5) {
                                                                        throw C0247v0.createForMalformedContainer("Error parsing vorbis codec private", null);
                                                                    }
                                                                    byte[] bArr7 = new byte[bArrM2099a.length - i48];
                                                                    System.arraycopy(bArrM2099a, i48, bArr7, 0, bArrM2099a.length - i48);
                                                                    ArrayList arrayList = new ArrayList(2);
                                                                    arrayList.add(bArr6);
                                                                    arrayList.add(bArr7);
                                                                    str6 = "audio/vorbis";
                                                                    i9 = 8192;
                                                                    str2 = null;
                                                                    list = arrayList;
                                                                    listSingletonList = list;
                                                                    i8 = -1;
                                                                    if (r32.f4019O != null) {
                                                                    }
                                                                    int i31222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                                                    c0246v = new C0246v();
                                                                    zM682k = AbstractC0244u0.m682k(str6);
                                                                    InterfaceC1989p interfaceC1989p3222222 = interfaceC1989p;
                                                                    Map map222222 = f4062j0;
                                                                    if (zM682k) {
                                                                    }
                                                                    str4 = r32.f4031a;
                                                                    if (str4 != null) {
                                                                    }
                                                                    c0246v.f1435a = Integer.toString(i30);
                                                                    c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                                                    c0246v.f1448n = i9;
                                                                    c0246v.f1438d = r32.f4028X;
                                                                    c0246v.f1439e = i31222222;
                                                                    c0246v.f1450p = listSingletonList;
                                                                    c0246v.f1444j = str2;
                                                                    c0246v.f1451q = r32.f4042l;
                                                                    C0249w c0249w222222 = new C0249w(c0246v);
                                                                    InterfaceC1980i0 interfaceC1980i0Track222222 = interfaceC1989p3222222.track(r32.f4033c, i10);
                                                                    r32.f4029Y = interfaceC1980i0Track222222;
                                                                    interfaceC1980i0Track222222.format(c0249w222222);
                                                                    sparseArray.put(r32.f4033c, r32);
                                                                    c0935d7 = c0935d2;
                                                                    break;
                                                                } else {
                                                                    i43 += 255;
                                                                    i41++;
                                                                }
                                                            }
                                                        } else {
                                                            i38 += 255;
                                                            i39++;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw C0247v0.createForMalformedContainer("Error parsing vorbis codec private", r32);
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r32 = 0;
                                            }
                                            break;
                                        case 5:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d3 = c0935d12;
                                            str6 = "audio/mpeg-L2";
                                            c0935d2 = c0935d3;
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i312222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p32222222 = interfaceC1989p;
                                            Map map2222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i312222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w2222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track2222222 = interfaceC1989p32222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track2222222;
                                            interfaceC1980i0Track2222222.format(c0249w2222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case 6:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d3 = c0935d12;
                                            str6 = "audio/mpeg";
                                            c0935d2 = c0935d3;
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i3122222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p322222222 = interfaceC1989p;
                                            Map map22222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i3122222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w22222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track22222222 = interfaceC1989p322222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track22222222;
                                            interfaceC1980i0Track22222222.format(c0249w22222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case 7:
                                            interfaceC1989p = interfaceC1989p2;
                                            C1132w c1132w3 = new C1132w(r32.m2099a(r32.f4032b));
                                            try {
                                                c1132w3.m2514H(16);
                                                long jM2526l = c1132w3.m2526l();
                                                if (jM2526l == 1482049860) {
                                                    th = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        throw C0247v0.createForMalformedContainer("Error parsing FourCC private data", th);
                                                    }
                                                } else {
                                                    if (jM2526l == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (jM2526l == 826496599) {
                                                            byte[] bArr8 = c1132w3.f4799a;
                                                            for (int i49 = c1132w3.f4800b + 20; i49 < bArr8.length - 4; i49++) {
                                                                if (bArr8[i49] == 0 && bArr8[i49 + 1] == 0 && bArr8[i49 + 2] == 1) {
                                                                    if (bArr8[i49 + 3] == 15) {
                                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i49, bArr8.length)));
                                                                    }
                                                                }
                                                            }
                                                            try {
                                                                throw C0247v0.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
                                                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                th = null;
                                                                throw C0247v0.createForMalformedContainer("Error parsing FourCC private data", th);
                                                            }
                                                        }
                                                        AbstractC1101a.m2348F("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str2 = null;
                                                }
                                                str6 = (String) pair.first;
                                                c0935d2 = c0935d12;
                                                listSingletonList = (List) pair.second;
                                                i8 = -1;
                                                i9 = -1;
                                                if (r32.f4019O != null) {
                                                }
                                                int i31222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                                c0246v = new C0246v();
                                                zM682k = AbstractC0244u0.m682k(str6);
                                                InterfaceC1989p interfaceC1989p3222222222 = interfaceC1989p;
                                                Map map222222222 = f4062j0;
                                                if (zM682k) {
                                                }
                                                str4 = r32.f4031a;
                                                if (str4 != null) {
                                                }
                                                c0246v.f1435a = Integer.toString(i30);
                                                c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                                c0246v.f1448n = i9;
                                                c0246v.f1438d = r32.f4028X;
                                                c0246v.f1439e = i31222222222;
                                                c0246v.f1450p = listSingletonList;
                                                c0246v.f1444j = str2;
                                                c0246v.f1451q = r32.f4042l;
                                                C0249w c0249w222222222 = new C0249w(c0246v);
                                                InterfaceC1980i0 interfaceC1980i0Track222222222 = interfaceC1989p3222222222.track(r32.f4033c, i10);
                                                r32.f4029Y = interfaceC1980i0Track222222222;
                                                interfaceC1980i0Track222222222.format(c0249w222222222);
                                                sparseArray.put(r32.f4033c, r32);
                                                c0935d7 = c0935d2;
                                                break;
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                th = null;
                                            }
                                            break;
                                        case '\b':
                                            interfaceC1989p = interfaceC1989p2;
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(r32.m2099a(str5), 0, bArr9, 0, 4);
                                            listSingletonList = AbstractC0983m0.m2168n(bArr9);
                                            c0935d2 = c0935d12;
                                            str6 = "application/dvbsubs";
                                            i8 = -1;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i312222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p32222222222 = interfaceC1989p;
                                            Map map2222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i312222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w2222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track2222222222 = interfaceC1989p32222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track2222222222;
                                            interfaceC1980i0Track2222222222.format(c0249w2222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case '\n':
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d4 = c0935d12;
                                            C1969d c1969dM3849a = C1969d.m3849a(new C1132w(r32.m2099a(r32.f4032b)));
                                            listSingletonList = c1969dM3849a.f7298a;
                                            r32.f4030Z = c1969dM3849a.f7299b;
                                            str3 = c1969dM3849a.f7309l;
                                            str6 = "video/avc";
                                            str2 = str3;
                                            c0935d2 = c0935d4;
                                            i8 = -1;
                                            i9 = -1;
                                            if (r32.f4019O != null) {
                                            }
                                            int i3122222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p322222222222 = interfaceC1989p;
                                            Map map22222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i3122222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w22222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track22222222222 = interfaceC1989p322222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track22222222222;
                                            interfaceC1980i0Track22222222222.format(c0249w22222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case 11:
                                            interfaceC1989p = interfaceC1989p2;
                                            listSingletonList = AbstractC0983m0.m2168n(r32.m2099a(str5));
                                            c0935d2 = c0935d12;
                                            str6 = "application/vobsub";
                                            i8 = -1;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i31222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p3222222222222 = interfaceC1989p;
                                            Map map222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i31222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track222222222222 = interfaceC1989p3222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track222222222222;
                                            interfaceC1980i0Track222222222222.format(c0249w222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case '\f':
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d5 = c0935d12;
                                            str6 = "audio/vnd.dts.hd";
                                            c0935d2 = c0935d5;
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i312222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p32222222222222 = interfaceC1989p;
                                            Map map2222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i312222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w2222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track2222222222222 = interfaceC1989p32222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track2222222222222;
                                            interfaceC1980i0Track2222222222222.format(c0249w2222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case '\r':
                                            interfaceC1989p = interfaceC1989p2;
                                            List listSingletonList2 = Collections.singletonList(r32.m2099a(str5));
                                            byte[] bArr10 = r32.f4041k;
                                            C1963a c1963aM3838n = AbstractC1965b.m3838n(new C1131v(bArr10, bArr10.length), false);
                                            r32.f4022R = c1963aM3838n.f7262b;
                                            r32.f4020P = c1963aM3838n.f7263c;
                                            str6 = "audio/mp4a-latm";
                                            str2 = c1963aM3838n.f7261a;
                                            c0935d2 = c0935d12;
                                            i9 = -1;
                                            list = listSingletonList2;
                                            listSingletonList = list;
                                            i8 = -1;
                                            if (r32.f4019O != null) {
                                            }
                                            int i3122222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p322222222222222 = interfaceC1989p;
                                            Map map22222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i3122222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w22222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track22222222222222 = interfaceC1989p322222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track22222222222222;
                                            interfaceC1980i0Track22222222222222.format(c0249w22222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case 14:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d5 = c0935d12;
                                            str6 = "audio/ac3";
                                            c0935d2 = c0935d5;
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i31222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p3222222222222222 = interfaceC1989p;
                                            Map map222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i31222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track222222222222222 = interfaceC1989p3222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track222222222222222;
                                            interfaceC1980i0Track222222222222222.format(c0249w222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case 15:
                                        case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d5 = c0935d12;
                                            str6 = "audio/vnd.dts";
                                            c0935d2 = c0935d5;
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i312222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p32222222222222222 = interfaceC1989p;
                                            Map map2222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i312222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w2222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track2222222222222222 = interfaceC1989p32222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track2222222222222222;
                                            interfaceC1980i0Track2222222222222222.format(c0249w2222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case 16:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d5 = c0935d12;
                                            str6 = "video/av01";
                                            c0935d2 = c0935d5;
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i3122222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p322222222222222222 = interfaceC1989p;
                                            Map map22222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i3122222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w22222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track22222222222222222 = interfaceC1989p322222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track22222222222222222;
                                            interfaceC1980i0Track22222222222222222.format(c0249w22222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d5 = c0935d12;
                                            str6 = "video/x-vnd.on2.vp8";
                                            c0935d2 = c0935d5;
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i31222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p3222222222222222222 = interfaceC1989p;
                                            Map map222222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i31222222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w222222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track222222222222222222 = interfaceC1989p3222222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track222222222222222222;
                                            interfaceC1980i0Track222222222222222222.format(c0249w222222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d5 = c0935d12;
                                            str6 = "video/x-vnd.on2.vp9";
                                            c0935d2 = c0935d5;
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i312222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p32222222222222222222 = interfaceC1989p;
                                            Map map2222222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i312222222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w2222222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track2222222222222222222 = interfaceC1989p32222222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track2222222222222222222;
                                            interfaceC1980i0Track2222222222222222222.format(c0249w2222222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d2 = c0935d12;
                                            str6 = "application/pgs";
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i3122222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p322222222222222222222 = interfaceC1989p;
                                            Map map22222222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i3122222222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w22222222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track22222222222222222222 = interfaceC1989p322222222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track22222222222222222222;
                                            interfaceC1980i0Track22222222222222222222.format(c0249w22222222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case 20:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d2 = c0935d12;
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i31222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p3222222222222222222222 = interfaceC1989p;
                                            Map map222222222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i31222222222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w222222222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track222222222222222222222 = interfaceC1989p3222222222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track222222222222222222222;
                                            interfaceC1980i0Track222222222222222222222.format(c0249w222222222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d6 = c0935d12;
                                            if (r32.f4021Q == 32) {
                                                c0935d2 = c0935d6;
                                                str6 = "audio/raw";
                                                i8 = 4;
                                                listSingletonList = null;
                                                i9 = -1;
                                                str2 = null;
                                                if (r32.f4019O != null) {
                                                }
                                                int i312222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                                c0246v = new C0246v();
                                                zM682k = AbstractC0244u0.m682k(str6);
                                                InterfaceC1989p interfaceC1989p32222222222222222222222 = interfaceC1989p;
                                                Map map2222222222222222222222 = f4062j0;
                                                if (zM682k) {
                                                }
                                                str4 = r32.f4031a;
                                                if (str4 != null) {
                                                }
                                                c0246v.f1435a = Integer.toString(i30);
                                                c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                                c0246v.f1448n = i9;
                                                c0246v.f1438d = r32.f4028X;
                                                c0246v.f1439e = i312222222222222222222222;
                                                c0246v.f1450p = listSingletonList;
                                                c0246v.f1444j = str2;
                                                c0246v.f1451q = r32.f4042l;
                                                C0249w c0249w2222222222222222222222 = new C0249w(c0246v);
                                                InterfaceC1980i0 interfaceC1980i0Track2222222222222222222222 = interfaceC1989p32222222222222222222222.track(r32.f4033c, i10);
                                                r32.f4029Y = interfaceC1980i0Track2222222222222222222222;
                                                interfaceC1980i0Track2222222222222222222222.format(c0249w2222222222222222222222);
                                                sparseArray.put(r32.f4033c, r32);
                                                c0935d7 = c0935d2;
                                                break;
                                            } else {
                                                AbstractC1101a.m2348F("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + r32.f4021Q + ". Setting mimeType to audio/x-unknown");
                                                c0935d2 = c0935d6;
                                                str6 = "audio/x-unknown";
                                                i8 = -1;
                                                listSingletonList = null;
                                                i9 = -1;
                                                str2 = null;
                                                if (r32.f4019O != null) {
                                                }
                                                int i3122222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                                c0246v = new C0246v();
                                                zM682k = AbstractC0244u0.m682k(str6);
                                                InterfaceC1989p interfaceC1989p322222222222222222222222 = interfaceC1989p;
                                                Map map22222222222222222222222 = f4062j0;
                                                if (zM682k) {
                                                }
                                                str4 = r32.f4031a;
                                                if (str4 != null) {
                                                }
                                                c0246v.f1435a = Integer.toString(i30);
                                                c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                                c0246v.f1448n = i9;
                                                c0246v.f1438d = r32.f4028X;
                                                c0246v.f1439e = i3122222222222222222222222;
                                                c0246v.f1450p = listSingletonList;
                                                c0246v.f1444j = str2;
                                                c0246v.f1451q = r32.f4042l;
                                                C0249w c0249w22222222222222222222222 = new C0249w(c0246v);
                                                InterfaceC1980i0 interfaceC1980i0Track22222222222222222222222 = interfaceC1989p322222222222222222222222.track(r32.f4033c, i10);
                                                r32.f4029Y = interfaceC1980i0Track22222222222222222222222;
                                                interfaceC1980i0Track22222222222222222222222.format(c0249w22222222222222222222222);
                                                sparseArray.put(r32.f4033c, r32);
                                                c0935d7 = c0935d2;
                                            }
                                            break;
                                        case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d6 = c0935d12;
                                            int i50 = r32.f4021Q;
                                            if (i50 == 8) {
                                                c0935d2 = c0935d6;
                                                str6 = "audio/raw";
                                                i8 = 3;
                                                listSingletonList = null;
                                                i9 = -1;
                                                str2 = null;
                                                if (r32.f4019O != null) {
                                                }
                                                int i31222222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                                c0246v = new C0246v();
                                                zM682k = AbstractC0244u0.m682k(str6);
                                                InterfaceC1989p interfaceC1989p3222222222222222222222222 = interfaceC1989p;
                                                Map map222222222222222222222222 = f4062j0;
                                                if (zM682k) {
                                                }
                                                str4 = r32.f4031a;
                                                if (str4 != null) {
                                                }
                                                c0246v.f1435a = Integer.toString(i30);
                                                c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                                c0246v.f1448n = i9;
                                                c0246v.f1438d = r32.f4028X;
                                                c0246v.f1439e = i31222222222222222222222222;
                                                c0246v.f1450p = listSingletonList;
                                                c0246v.f1444j = str2;
                                                c0246v.f1451q = r32.f4042l;
                                                C0249w c0249w222222222222222222222222 = new C0249w(c0246v);
                                                InterfaceC1980i0 interfaceC1980i0Track222222222222222222222222 = interfaceC1989p3222222222222222222222222.track(r32.f4033c, i10);
                                                r32.f4029Y = interfaceC1980i0Track222222222222222222222222;
                                                interfaceC1980i0Track222222222222222222222222.format(c0249w222222222222222222222222);
                                                sparseArray.put(r32.f4033c, r32);
                                                c0935d7 = c0935d2;
                                                break;
                                            } else {
                                                if (i50 == 16) {
                                                    i8 = 268435456;
                                                } else if (i50 == 24) {
                                                    i8 = 1342177280;
                                                } else if (i50 == 32) {
                                                    i8 = 1610612736;
                                                } else {
                                                    AbstractC1101a.m2348F("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + r32.f4021Q + ". Setting mimeType to audio/x-unknown");
                                                    c0935d2 = c0935d6;
                                                    str6 = "audio/x-unknown";
                                                    i8 = -1;
                                                    listSingletonList = null;
                                                    i9 = -1;
                                                    str2 = null;
                                                    if (r32.f4019O != null) {
                                                    }
                                                    int i312222222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                                    c0246v = new C0246v();
                                                    zM682k = AbstractC0244u0.m682k(str6);
                                                    InterfaceC1989p interfaceC1989p32222222222222222222222222 = interfaceC1989p;
                                                    Map map2222222222222222222222222 = f4062j0;
                                                    if (zM682k) {
                                                    }
                                                    str4 = r32.f4031a;
                                                    if (str4 != null) {
                                                    }
                                                    c0246v.f1435a = Integer.toString(i30);
                                                    c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                                    c0246v.f1448n = i9;
                                                    c0246v.f1438d = r32.f4028X;
                                                    c0246v.f1439e = i312222222222222222222222222;
                                                    c0246v.f1450p = listSingletonList;
                                                    c0246v.f1444j = str2;
                                                    c0246v.f1451q = r32.f4042l;
                                                    C0249w c0249w2222222222222222222222222 = new C0249w(c0246v);
                                                    InterfaceC1980i0 interfaceC1980i0Track2222222222222222222222222 = interfaceC1989p32222222222222222222222222.track(r32.f4033c, i10);
                                                    r32.f4029Y = interfaceC1980i0Track2222222222222222222222222;
                                                    interfaceC1980i0Track2222222222222222222222222.format(c0249w2222222222222222222222222);
                                                    sparseArray.put(r32.f4033c, r32);
                                                    c0935d7 = c0935d2;
                                                }
                                                c0935d2 = c0935d6;
                                                str6 = "audio/raw";
                                                listSingletonList = null;
                                                i9 = -1;
                                                str2 = null;
                                                if (r32.f4019O != null) {
                                                }
                                                int i3122222222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                                c0246v = new C0246v();
                                                zM682k = AbstractC0244u0.m682k(str6);
                                                InterfaceC1989p interfaceC1989p322222222222222222222222222 = interfaceC1989p;
                                                Map map22222222222222222222222222 = f4062j0;
                                                if (zM682k) {
                                                }
                                                str4 = r32.f4031a;
                                                if (str4 != null) {
                                                }
                                                c0246v.f1435a = Integer.toString(i30);
                                                c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                                c0246v.f1448n = i9;
                                                c0246v.f1438d = r32.f4028X;
                                                c0246v.f1439e = i3122222222222222222222222222;
                                                c0246v.f1450p = listSingletonList;
                                                c0246v.f1444j = str2;
                                                c0246v.f1451q = r32.f4042l;
                                                C0249w c0249w22222222222222222222222222 = new C0249w(c0246v);
                                                InterfaceC1980i0 interfaceC1980i0Track22222222222222222222222222 = interfaceC1989p322222222222222222222222222.track(r32.f4033c, i10);
                                                r32.f4029Y = interfaceC1980i0Track22222222222222222222222222;
                                                interfaceC1980i0Track22222222222222222222222222.format(c0249w22222222222222222222222222);
                                                sparseArray.put(r32.f4033c, r32);
                                                c0935d7 = c0935d2;
                                            }
                                            break;
                                        case 24:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d6 = c0935d12;
                                            int iM2413D2 = AbstractC1118i0.m2413D(r32.f4021Q);
                                            if (iM2413D2 == 0) {
                                                AbstractC1101a.m2348F("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + r32.f4021Q + ". Setting mimeType to audio/x-unknown");
                                                c0935d2 = c0935d6;
                                                str6 = "audio/x-unknown";
                                                i8 = -1;
                                                listSingletonList = null;
                                                i9 = -1;
                                                str2 = null;
                                                if (r32.f4019O != null) {
                                                }
                                                int i31222222222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                                c0246v = new C0246v();
                                                zM682k = AbstractC0244u0.m682k(str6);
                                                InterfaceC1989p interfaceC1989p3222222222222222222222222222 = interfaceC1989p;
                                                Map map222222222222222222222222222 = f4062j0;
                                                if (zM682k) {
                                                }
                                                str4 = r32.f4031a;
                                                if (str4 != null) {
                                                }
                                                c0246v.f1435a = Integer.toString(i30);
                                                c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                                c0246v.f1448n = i9;
                                                c0246v.f1438d = r32.f4028X;
                                                c0246v.f1439e = i31222222222222222222222222222;
                                                c0246v.f1450p = listSingletonList;
                                                c0246v.f1444j = str2;
                                                c0246v.f1451q = r32.f4042l;
                                                C0249w c0249w222222222222222222222222222 = new C0249w(c0246v);
                                                InterfaceC1980i0 interfaceC1980i0Track222222222222222222222222222 = interfaceC1989p3222222222222222222222222222.track(r32.f4033c, i10);
                                                r32.f4029Y = interfaceC1980i0Track222222222222222222222222222;
                                                interfaceC1980i0Track222222222222222222222222222.format(c0249w222222222222222222222222222);
                                                sparseArray.put(r32.f4033c, r32);
                                                c0935d7 = c0935d2;
                                                break;
                                            } else {
                                                i8 = iM2413D2;
                                                c0935d2 = c0935d6;
                                                str6 = "audio/raw";
                                                listSingletonList = null;
                                                i9 = -1;
                                                str2 = null;
                                                if (r32.f4019O != null) {
                                                }
                                                int i312222222222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                                c0246v = new C0246v();
                                                zM682k = AbstractC0244u0.m682k(str6);
                                                InterfaceC1989p interfaceC1989p32222222222222222222222222222 = interfaceC1989p;
                                                Map map2222222222222222222222222222 = f4062j0;
                                                if (zM682k) {
                                                }
                                                str4 = r32.f4031a;
                                                if (str4 != null) {
                                                }
                                                c0246v.f1435a = Integer.toString(i30);
                                                c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                                c0246v.f1448n = i9;
                                                c0246v.f1438d = r32.f4028X;
                                                c0246v.f1439e = i312222222222222222222222222222;
                                                c0246v.f1450p = listSingletonList;
                                                c0246v.f1444j = str2;
                                                c0246v.f1451q = r32.f4042l;
                                                C0249w c0249w2222222222222222222222222222 = new C0249w(c0246v);
                                                InterfaceC1980i0 interfaceC1980i0Track2222222222222222222222222222 = interfaceC1989p32222222222222222222222222222.track(r32.f4033c, i10);
                                                r32.f4029Y = interfaceC1980i0Track2222222222222222222222222222;
                                                interfaceC1980i0Track2222222222222222222222222222.format(c0249w2222222222222222222222222222);
                                                sparseArray.put(r32.f4033c, r32);
                                                c0935d7 = c0935d2;
                                            }
                                            break;
                                        case AnalyticsListener.EVENT_VIDEO_SIZE_CHANGED /* 25 */:
                                            interfaceC1989p = interfaceC1989p2;
                                            listSingletonList = AbstractC0983m0.m2169o(f4058f0, r32.m2099a(str5));
                                            c0935d2 = c0935d12;
                                            str6 = "text/x-ssa";
                                            i8 = -1;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i3122222222222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p322222222222222222222222222222 = interfaceC1989p;
                                            Map map22222222222222222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i3122222222222222222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w22222222222222222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track22222222222222222222222222222 = interfaceC1989p322222222222222222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track22222222222222222222222222222;
                                            interfaceC1980i0Track22222222222222222222222222222.format(c0249w22222222222222222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case AnalyticsListener.EVENT_RENDERED_FIRST_FRAME /* 26 */:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d4 = c0935d12;
                                            C1996w c1996wM3878a = C1996w.m3878a(new C1132w(r32.m2099a(r32.f4032b)), false, null);
                                            listSingletonList = c1996wM3878a.f7393a;
                                            r32.f4030Z = c1996wM3878a.f7394b;
                                            str3 = c1996wM3878a.f7403k;
                                            str6 = "video/hevc";
                                            str2 = str3;
                                            c0935d2 = c0935d4;
                                            i8 = -1;
                                            i9 = -1;
                                            if (r32.f4019O != null) {
                                            }
                                            int i31222222222222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p3222222222222222222222222222222 = interfaceC1989p;
                                            Map map222222222222222222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i31222222222222222222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w222222222222222222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track222222222222222222222222222222 = interfaceC1989p3222222222222222222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track222222222222222222222222222222;
                                            interfaceC1980i0Track222222222222222222222222222222.format(c0249w222222222222222222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case AnalyticsListener.EVENT_CUES /* 27 */:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d2 = c0935d12;
                                            str6 = "text/vtt";
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i312222222222222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p32222222222222222222222222222222 = interfaceC1989p;
                                            Map map2222222222222222222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i312222222222222222222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w2222222222222222222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track2222222222222222222222222222222 = interfaceC1989p32222222222222222222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track2222222222222222222222222222222;
                                            interfaceC1980i0Track2222222222222222222222222222222.format(c0249w2222222222222222222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case AnalyticsListener.EVENT_METADATA /* 28 */:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d2 = c0935d12;
                                            str6 = "application/x-subrip";
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i3122222222222222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p322222222222222222222222222222222 = interfaceC1989p;
                                            Map map22222222222222222222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i3122222222222222222222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w22222222222222222222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track22222222222222222222222222222222 = interfaceC1989p322222222222222222222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track22222222222222222222222222222222;
                                            interfaceC1980i0Track22222222222222222222222222222222.format(c0249w22222222222222222222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case AnalyticsListener.EVENT_DEVICE_INFO_CHANGED /* 29 */:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d5 = c0935d12;
                                            str6 = "video/mpeg2";
                                            c0935d2 = c0935d5;
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i31222222222222222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p3222222222222222222222222222222222 = interfaceC1989p;
                                            Map map222222222222222222222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i31222222222222222222222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w222222222222222222222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track222222222222222222222222222222222 = interfaceC1989p3222222222222222222222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track222222222222222222222222222222222;
                                            interfaceC1980i0Track222222222222222222222222222222222.format(c0249w222222222222222222222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case AnalyticsListener.EVENT_DEVICE_VOLUME_CHANGED /* 30 */:
                                            interfaceC1989p = interfaceC1989p2;
                                            c0935d5 = c0935d12;
                                            str6 = "audio/eac3";
                                            c0935d2 = c0935d5;
                                            i8 = -1;
                                            listSingletonList = null;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i312222222222222222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p32222222222222222222222222222222222 = interfaceC1989p;
                                            Map map2222222222222222222222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i312222222222222222222222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w2222222222222222222222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track2222222222222222222222222222222222 = interfaceC1989p32222222222222222222222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track2222222222222222222222222222222222;
                                            interfaceC1980i0Track2222222222222222222222222222222222.format(c0249w2222222222222222222222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case 31:
                                            interfaceC1989p = interfaceC1989p2;
                                            str6 = "audio/flac";
                                            listSingletonList = Collections.singletonList(r32.m2099a(str5));
                                            c0935d2 = c0935d12;
                                            i8 = -1;
                                            i9 = -1;
                                            str2 = null;
                                            if (r32.f4019O != null) {
                                            }
                                            int i3122222222222222222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p322222222222222222222222222222222222 = interfaceC1989p;
                                            Map map22222222222222222222222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i3122222222222222222222222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w22222222222222222222222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track22222222222222222222222222222222222 = interfaceC1989p322222222222222222222222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track22222222222222222222222222222222222;
                                            interfaceC1980i0Track22222222222222222222222222222222222.format(c0249w22222222222222222222222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        case ' ':
                                            ArrayList arrayList2 = new ArrayList(3);
                                            arrayList2.add(r32.m2099a(r32.f4032b));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            interfaceC1989p = interfaceC1989p2;
                                            arrayList2.add(byteBufferAllocate.order(byteOrder).putLong(r32.f4023S).array());
                                            arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r32.f4024T).array());
                                            str6 = "audio/opus";
                                            c0935d2 = c0935d12;
                                            str2 = null;
                                            i9 = 5760;
                                            list = arrayList2;
                                            listSingletonList = list;
                                            i8 = -1;
                                            if (r32.f4019O != null) {
                                            }
                                            int i31222222222222222222222222222222222222 = (r32.f4027W ? 1 : 0) | (r32.f4026V ? 2 : 0);
                                            c0246v = new C0246v();
                                            zM682k = AbstractC0244u0.m682k(str6);
                                            InterfaceC1989p interfaceC1989p3222222222222222222222222222222222222 = interfaceC1989p;
                                            Map map222222222222222222222222222222222222 = f4062j0;
                                            if (zM682k) {
                                            }
                                            str4 = r32.f4031a;
                                            if (str4 != null) {
                                            }
                                            c0246v.f1435a = Integer.toString(i30);
                                            c0246v.f1447m = AbstractC0244u0.m687p(str6);
                                            c0246v.f1448n = i9;
                                            c0246v.f1438d = r32.f4028X;
                                            c0246v.f1439e = i31222222222222222222222222222222222222;
                                            c0246v.f1450p = listSingletonList;
                                            c0246v.f1444j = str2;
                                            c0246v.f1451q = r32.f4042l;
                                            C0249w c0249w222222222222222222222222222222222222 = new C0249w(c0246v);
                                            InterfaceC1980i0 interfaceC1980i0Track222222222222222222222222222222222222 = interfaceC1989p3222222222222222222222222222222222222.track(r32.f4033c, i10);
                                            r32.f4029Y = interfaceC1980i0Track222222222222222222222222222222222222;
                                            interfaceC1980i0Track222222222222222222222222222222222222.format(c0249w222222222222222222222222222222222222);
                                            sparseArray.put(r32.f4033c, r32);
                                            c0935d7 = c0935d2;
                                            break;
                                        default:
                                            throw C0247v0.createForMalformedContainer("Unrecognized codec identifier.", null);
                                    }
                                default:
                                    c0935d7 = c0935d12;
                                    break;
                            }
                            c0935d7.f4115w = null;
                        } else if (i23 == 19899) {
                            int i51 = c0935d12.f4117y;
                            if (i51 != i15) {
                                long j14 = c0935d12.f4118z;
                                if (j14 != -1) {
                                    if (i51 == 475249515) {
                                        c0935d12.f4064B = j14;
                                    }
                                }
                            }
                        } else if (i23 == 25152) {
                            c0935d12.m2102b(i23);
                            C0934c c0934c3 = c0935d12.f4115w;
                            if (c0934c3.f4038h) {
                                C1978h0 c1978h0 = c0934c3.f4040j;
                                if (c1978h0 == null) {
                                    throw C0247v0.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                                }
                                c0934c3.f4042l = new C0237s(new C0234r(AbstractC0213k.f1162a, null, "video/webm", c1978h0.f7339b));
                            }
                        } else if (i23 == 28032) {
                            c0935d12.m2102b(i23);
                            C0934c c0934c4 = c0935d12.f4115w;
                            if (c0934c4.f4038h && c0934c4.f4039i != null) {
                                throw C0247v0.createForMalformedContainer("Combining encryption and compression is not supported", null);
                            }
                        } else if (i23 == 357149030) {
                            if (c0935d12.f4112t == -9223372036854775807L) {
                                c0935d12.f4112t = 1000000L;
                            }
                            long j15 = c0935d12.f4113u;
                            if (j15 != -9223372036854775807L) {
                                c0935d12.f4114v = c0935d12.m2106g(j15);
                            }
                        } else if (i23 == 374648427) {
                            if (sparseArray.size() == 0) {
                                throw C0247v0.createForMalformedContainer("No valid tracks were found", null);
                            }
                            c0935d12.f4096d0.endTracks();
                        } else if (i23 == 475249515) {
                            if (!c0935d12.f4116x) {
                                InterfaceC1989p interfaceC1989p4 = c0935d12.f4096d0;
                                C0087j c0087j = c0935d12.f4067E;
                                C0087j c0087j2 = c0935d12.f4068F;
                                if (c0935d12.f4111s == -1 || c0935d12.f4114v == -9223372036854775807L || c0087j == null || (i14 = c0087j.f385j) == 0 || c0087j2 == null || c0087j2.f385j != i14) {
                                    c1992s = new C1992s(c0935d12.f4114v);
                                } else {
                                    int[] iArrCopyOf = new int[i14];
                                    long[] jArrCopyOf2 = new long[i14];
                                    long[] jArr = new long[i14];
                                    long[] jArrCopyOf3 = new long[i14];
                                    int i52 = 0;
                                    while (i52 < i14) {
                                        jArrCopyOf3[i52] = c0087j.m320f(i52);
                                        jArrCopyOf2[i52] = c0087j2.m320f(i52) + c0935d12.f4111s;
                                        i52++;
                                        jArr = jArr;
                                    }
                                    long[] jArr2 = jArr;
                                    int i53 = 0;
                                    while (true) {
                                        int i54 = i14 - 1;
                                        if (i53 < i54) {
                                            int i55 = i53 + 1;
                                            iArrCopyOf[i53] = (int) (jArrCopyOf2[i55] - jArrCopyOf2[i53]);
                                            jArr2[i53] = jArrCopyOf3[i55] - jArrCopyOf3[i53];
                                            i53 = i55;
                                        } else {
                                            int i56 = i54;
                                            while (i56 > 0 && jArrCopyOf3[i56] > c0935d12.f4114v) {
                                                i56--;
                                            }
                                            iArrCopyOf[i56] = (int) ((c0935d12.f4111s + c0935d12.f4110r) - jArrCopyOf2[i56]);
                                            jArr2[i56] = c0935d12.f4114v - jArrCopyOf3[i56];
                                            if (i56 < i54) {
                                                AbstractC1101a.m2348F("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                                                int i57 = i56 + 1;
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i57);
                                                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i57);
                                                jArrCopyOf = Arrays.copyOf(jArr2, i57);
                                                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i57);
                                            } else {
                                                jArrCopyOf = jArr2;
                                            }
                                            c1992s = new C1981j(iArrCopyOf, jArrCopyOf2, jArrCopyOf, jArrCopyOf3);
                                        }
                                    }
                                }
                                interfaceC1989p4.seekMap(c1992s);
                                c0935d12.f4116x = true;
                            }
                            c0935d12.f4067E = null;
                            c0935d12.f4068F = null;
                        }
                        z9 = false;
                        interfaceC1988o2 = interfaceC1988o;
                    }
                }
            }
            c0935d8 = c0935d;
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        this.f4066D = -9223372036854775807L;
        this.f4071I = 0;
        C0933b c0933b = this.f4089a;
        c0933b.f4002e = 0;
        c0933b.f3999b.clear();
        C0936e c0936e = c0933b.f4000c;
        c0936e.f4121b = 0;
        c0936e.f4122c = 0;
        C0936e c0936e2 = this.f4091b;
        c0936e2.f4121b = 0;
        c0936e2.f4122c = 0;
        m2105f();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f4093c;
            if (i >= sparseArray.size()) {
                return;
            }
            C1982j0 c1982j0 = ((C0934c) sparseArray.valueAt(i)).f4025U;
            if (c1982j0 != null) {
                c1982j0.f7349b = false;
                c1982j0.f7350c = 0;
            }
            i++;
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        C0087j c0087j = new C0087j(1, false);
        C1132w c1132w = (C1132w) c0087j.f386k;
        long length = interfaceC1988o.getLength();
        long j = C2153d.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (length != -1 && length <= C2153d.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j = length;
        }
        int i = (int) j;
        interfaceC1988o.mo3862i(c1132w.f4799a, 0, 4);
        long jM2537w = c1132w.m2537w();
        c0087j.f385j = 4;
        while (true) {
            if (jM2537w != 440786851) {
                int i4 = c0087j.f385j + 1;
                c0087j.f385j = i4;
                if (i4 == i) {
                    break;
                }
                interfaceC1988o.mo3862i(c1132w.f4799a, 0, 1);
                jM2537w = ((jM2537w << 8) & (-256)) | (c1132w.f4799a[0] & 255);
            } else {
                long jM321g = c0087j.m321g(interfaceC1988o);
                long j8 = c0087j.f385j;
                if (jM321g != Long.MIN_VALUE && (length == -1 || j8 + jM321g < length)) {
                    while (true) {
                        long j9 = c0087j.f385j;
                        long j10 = j8 + jM321g;
                        if (j9 < j10) {
                            if (c0087j.m321g(interfaceC1988o) == Long.MIN_VALUE) {
                                break;
                            }
                            long jM321g2 = c0087j.m321g(interfaceC1988o);
                            if (jM321g2 < 0 || jM321g2 > 2147483647L) {
                                break;
                            }
                            if (jM321g2 != 0) {
                                int i8 = (int) jM321g2;
                                interfaceC1988o.mo3857d(i8);
                                c0087j.f385j += i8;
                            }
                        } else if (j9 == j10) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
