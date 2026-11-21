package p115n1;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import java.util.Collections;
import p002a1.C0016e;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.t */
/* loaded from: classes.dex */
public final class C1993t {

    /* renamed from: a */
    public final int f7378a;

    /* renamed from: b */
    public final int f7379b;

    /* renamed from: c */
    public final int f7380c;

    /* renamed from: d */
    public final int f7381d;

    /* renamed from: e */
    public final int f7382e;

    /* renamed from: f */
    public final int f7383f;

    /* renamed from: g */
    public final int f7384g;

    /* renamed from: h */
    public final int f7385h;

    /* renamed from: i */
    public final int f7386i;

    /* renamed from: j */
    public final long f7387j;

    /* renamed from: k */
    public final C0016e f7388k;

    /* renamed from: l */
    public final C0241t0 f7389l;

    public C1993t(byte[] bArr, int i) {
        C1131v c1131v = new C1131v(bArr, bArr.length);
        c1131v.m2502s(i * 8);
        this.f7378a = c1131v.m2494k(16);
        this.f7379b = c1131v.m2494k(16);
        this.f7380c = c1131v.m2494k(24);
        this.f7381d = c1131v.m2494k(24);
        int iM2494k = c1131v.m2494k(20);
        this.f7382e = iM2494k;
        this.f7383f = m3873d(iM2494k);
        this.f7384g = c1131v.m2494k(3) + 1;
        int iM2494k2 = c1131v.m2494k(5) + 1;
        this.f7385h = iM2494k2;
        this.f7386i = m3872a(iM2494k2);
        this.f7387j = c1131v.m2496m(36);
        this.f7388k = null;
        this.f7389l = null;
    }

    /* renamed from: a */
    public static int m3872a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: d */
    public static int m3873d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public final long m3874b() {
        long j = this.f7387j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f7382e;
    }

    /* renamed from: c */
    public final C0249w m3875c(byte[] bArr, C0241t0 c0241t0) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f7381d;
        if (i <= 0) {
            i = -1;
        }
        C0241t0 c0241t02 = this.f7389l;
        if (c0241t02 != null) {
            c0241t0 = c0241t02.m669b(c0241t0);
        }
        C0246v c0246v = new C0246v();
        c0246v.f1447m = AbstractC0244u0.m687p("audio/flac");
        c0246v.f1448n = i;
        c0246v.f1425B = this.f7384g;
        c0246v.f1426C = this.f7382e;
        c0246v.f1427D = AbstractC1118i0.m2413D(this.f7385h);
        c0246v.f1450p = Collections.singletonList(bArr);
        c0246v.f1445k = c0241t0;
        return new C0249w(c0246v);
    }

    public C1993t(int i, int i4, int i8, int i9, int i10, int i11, int i12, long j, C0016e c0016e, C0241t0 c0241t0) {
        this.f7378a = i;
        this.f7379b = i4;
        this.f7380c = i8;
        this.f7381d = i9;
        this.f7382e = i10;
        this.f7383f = m3873d(i10);
        this.f7384g = i11;
        this.f7385h = i12;
        this.f7386i = m3872a(i12);
        this.f7387j = j;
        this.f7388k = c0016e;
        this.f7389l = c0241t0;
    }
}
