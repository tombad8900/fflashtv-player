package p057g2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.common.InterfaceC0238s0;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.io.EOFException;
import java.math.RoundingMode;
import p013b2.C0557i;
import p013b2.C0561m;
import p013b2.C0563o;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p115n1.AbstractC1965b;
import p115n1.C1964a0;
import p115n1.C1986m;
import p115n1.C1995v;
import p115n1.C1997x;
import p115n1.C1999z;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g2.e */
/* loaded from: classes.dex */
public final class C1041e implements InterfaceC1987n {

    /* renamed from: a */
    public final long f4422a;

    /* renamed from: b */
    public final C1132w f4423b;

    /* renamed from: c */
    public final C1999z f4424c;

    /* renamed from: d */
    public final C1995v f4425d;

    /* renamed from: e */
    public final C1997x f4426e;

    /* renamed from: f */
    public final C1986m f4427f;

    /* renamed from: g */
    public InterfaceC1989p f4428g;

    /* renamed from: h */
    public InterfaceC1980i0 f4429h;

    /* renamed from: i */
    public InterfaceC1980i0 f4430i;

    /* renamed from: j */
    public int f4431j;

    /* renamed from: k */
    public C0241t0 f4432k;

    /* renamed from: l */
    public long f4433l;

    /* renamed from: m */
    public long f4434m;

    /* renamed from: n */
    public long f4435n;

    /* renamed from: o */
    public long f4436o;

    /* renamed from: p */
    public int f4437p;

    /* renamed from: q */
    public InterfaceC1043g f4438q;

    /* renamed from: r */
    public boolean f4439r;

    /* renamed from: s */
    public boolean f4440s;

    /* renamed from: t */
    public long f4441t;

    public C1041e(int i) {
        this(-9223372036854775807L);
    }

    /* renamed from: a */
    public final void m2239a() {
        InterfaceC1043g interfaceC1043g = this.f4438q;
        if ((interfaceC1043g instanceof C1037a) && ((C1037a) interfaceC1043g).isSeekable()) {
            long j = this.f4436o;
            if (j == -1 || j == this.f4438q.mo2228a()) {
                return;
            }
            C1037a c1037a = (C1037a) this.f4438q;
            this.f4438q = new C1037a(this.f4436o, c1037a.f4413h, c1037a.f4414i, c1037a.f4415j, c1037a.f4416k);
            InterfaceC1989p interfaceC1989p = this.f4428g;
            interfaceC1989p.getClass();
            interfaceC1989p.seekMap(this.f4438q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2240b(InterfaceC1988o interfaceC1988o) {
        InterfaceC1043g interfaceC1043g = this.f4438q;
        if (interfaceC1043g != null) {
            long jMo2228a = interfaceC1043g.mo2228a();
            if (jMo2228a == -1 || interfaceC1988o.mo3856c() <= jMo2228a - 4) {
                try {
                    return !interfaceC1988o.mo3855b(this.f4423b.f4799a, 0, 4, true);
                } catch (EOFException unused) {
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m2241c(InterfaceC1988o interfaceC1988o, boolean z7) throws Throwable {
        int iMo3856c;
        int i;
        int iM3833i;
        int i4 = z7 ? DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE : 131072;
        interfaceC1988o.mo3860g();
        if (interfaceC1988o.getPosition() == 0) {
            C1132w c1132w = this.f4426e.f7405j;
            int i8 = 0;
            C0241t0 c0241t0M1301v = null;
            while (true) {
                try {
                    interfaceC1988o.mo3862i(c1132w.f4799a, 0, 10);
                    c1132w.m2513G(0);
                    if (c1132w.m2538x() != 4801587) {
                        break;
                    }
                    c1132w.m2514H(3);
                    int iM2534t = c1132w.m2534t();
                    int i9 = iM2534t + 10;
                    if (c0241t0M1301v == null) {
                        byte[] bArr = new byte[i9];
                        System.arraycopy(c1132w.f4799a, 0, bArr, 0, 10);
                        interfaceC1988o.mo3862i(bArr, 10, iM2534t);
                        c0241t0M1301v = new C0557i(null).m1301v(bArr, i9);
                    } else {
                        interfaceC1988o.mo3857d(iM2534t);
                    }
                    i8 += i9;
                } catch (EOFException unused) {
                }
            }
            interfaceC1988o.mo3860g();
            interfaceC1988o.mo3857d(i8);
            this.f4432k = c0241t0M1301v;
            if (c0241t0M1301v != null) {
                this.f4425d.m3877b(c0241t0M1301v);
            }
            iMo3856c = (int) interfaceC1988o.mo3856c();
            if (!z7) {
                interfaceC1988o.mo3861h(iMo3856c);
            }
            i = 0;
        } else {
            iMo3856c = 0;
            i = 0;
        }
        int i10 = i;
        int i11 = i10;
        while (true) {
            if (!m2240b(interfaceC1988o)) {
                C1132w c1132w2 = this.f4423b;
                c1132w2.m2513G(0);
                int iM2521g = c1132w2.m2521g();
                if ((i == 0 || ((-128000) & iM2521g) == (i & (-128000))) && (iM3833i = AbstractC1965b.m3833i(iM2521g)) != -1) {
                    i10++;
                    if (i10 != 1) {
                        if (i10 == 4) {
                            break;
                        }
                    } else {
                        this.f4424c.m3879a(iM2521g);
                        i = iM2521g;
                    }
                    interfaceC1988o.mo3857d(iM3833i - 4);
                } else {
                    int i12 = i11 + 1;
                    if (i11 == i4) {
                        if (z7) {
                            return false;
                        }
                        m2239a();
                        throw new EOFException();
                    }
                    if (z7) {
                        interfaceC1988o.mo3860g();
                        interfaceC1988o.mo3857d(iMo3856c + i12);
                    } else {
                        interfaceC1988o.mo3861h(1);
                    }
                    i10 = 0;
                    i11 = i12;
                    i = 0;
                }
            } else if (i10 <= 0) {
                m2239a();
                throw new EOFException();
            }
        }
        if (z7) {
            interfaceC1988o.mo3861h(iMo3856c + i11);
        } else {
            interfaceC1988o.mo3860g();
        }
        this.f4431j = i;
        return true;
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        this.f4428g = interfaceC1989p;
        InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(0, 1);
        this.f4429h = interfaceC1980i0Track;
        this.f4430i = interfaceC1980i0Track;
        this.f4428g.endTracks();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0358 A[LOOP:2: B:165:0x0356->B:166:0x0358, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // p115n1.InterfaceC1987n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws Throwable {
        Throwable th;
        int i;
        int i4;
        long j;
        InterfaceC1043g interfaceC1043g;
        long j8;
        int iSampleData;
        int i8;
        int iM2521g;
        long[] jArr;
        int i9;
        int i10;
        int i11;
        C1995v c1995v;
        int i12;
        long j9;
        InterfaceC1043g c1037a;
        C0241t0 c0241t0;
        C1039c c1039c;
        InterfaceC1043g c1037a2;
        long jM2428S;
        int length;
        int i13;
        int iM2535u;
        AbstractC1101a.m2360k(this.f4429h);
        int i14 = AbstractC1118i0.f4750a;
        int i15 = this.f4431j;
        C1999z c1999z = this.f4424c;
        if (i15 == 0) {
            try {
                m2241c(interfaceC1988o, false);
                interfaceC1043g = this.f4438q;
                C1132w c1132w = this.f4423b;
                if (interfaceC1043g != null) {
                    C1132w c1132w2 = new C1132w(c1999z.f7410b);
                    j = 1000000;
                    interfaceC1988o.mo3862i(c1132w2.f4799a, 0, c1999z.f7410b);
                    if ((c1999z.f7409a & 1) != 0) {
                        i8 = c1999z.f7412d != 1 ? 36 : 21;
                        th = null;
                        j8 = 0;
                        if (c1132w2.f4801c < i8 + 4) {
                            c1132w2.m2513G(i8);
                            int iM2521g2 = c1132w2.m2521g();
                            if (iM2521g2 != 1483304551 && iM2521g2 != 1231971951) {
                                if (c1132w2.f4801c >= 40) {
                                    c1132w2.m2513G(36);
                                    iM2521g2 = c1132w2.m2521g() == 1447187017 ? 1447187017 : 0;
                                }
                            }
                            C1995v c1995v2 = this.f4425d;
                            if (iM2521g2 == 1231971951) {
                                iM2521g = c1132w2.m2521g();
                                int iM2539y = (iM2521g & 1) == 0 ? c1132w2.m2539y() : -1;
                                long jM2537w = (iM2521g & 2) == 0 ? c1132w2.m2537w() : -1L;
                                if ((iM2521g & 4) != 4) {
                                    long[] jArr2 = new long[100];
                                    for (int i16 = 0; i16 < 100; i16++) {
                                        jArr2[i16] = c1132w2.m2535u();
                                    }
                                    jArr = jArr2;
                                } else {
                                    jArr = null;
                                }
                                if ((iM2521g & 8) != 0) {
                                    c1132w2.m2514H(4);
                                }
                                if (c1132w2.m2515a() < 24) {
                                    c1132w2.m2514H(21);
                                    int iM2538x = c1132w2.m2538x();
                                    i10 = (16773120 & iM2538x) >> 12;
                                    i9 = iM2538x & 4095;
                                } else {
                                    i9 = -1;
                                    i10 = -1;
                                }
                                long j10 = iM2539y;
                                int i17 = c1999z.f7410b;
                                int i18 = c1999z.f7411c;
                                i11 = c1999z.f7413e;
                                int i19 = c1999z.f7414f;
                                if ((c1995v2.f7391a != -1 || c1995v2.f7392b == -1) && i10 != -1 && i9 != -1) {
                                    c1995v2.f7391a = i10;
                                    c1995v2.f7392b = i9;
                                }
                                long position = interfaceC1988o.getPosition();
                                if (interfaceC1988o.getLength() == -1 || jM2537w == -1) {
                                    c1995v = c1995v2;
                                    i12 = i11;
                                } else {
                                    i12 = i11;
                                    long j11 = position + jM2537w;
                                    if (interfaceC1988o.getLength() != j11) {
                                        StringBuilder sb = new StringBuilder("Data size mismatch between stream (");
                                        c1995v = c1995v2;
                                        sb.append(interfaceC1988o.getLength());
                                        sb.append(") and Xing frame (");
                                        sb.append(j11);
                                        sb.append("), using Xing value.");
                                        AbstractC1101a.m2371v("Mp3Extractor", sb.toString());
                                    } else {
                                        c1995v = c1995v2;
                                    }
                                }
                                interfaceC1988o.mo3861h(c1999z.f7410b);
                                if (iM2521g2 != 1483304551) {
                                    long jM2434Y = (j10 == -1 || j10 == 0) ? -9223372036854775807L : AbstractC1118i0.m2434Y(i18, (j10 * i19) - 1);
                                    c1037a = jM2434Y == -9223372036854775807L ? null : (jM2537w == -1 || jArr == null) ? new C1045i(position, i17, jM2434Y, i12, -1L, null) : new C1045i(position, i17, jM2434Y, i12, jM2537w, jArr);
                                    c0241t0 = this.f4432k;
                                    long position2 = interfaceC1988o.getPosition();
                                    if (c0241t0 == null) {
                                        for (InterfaceC0238s0 interfaceC0238s0 : c0241t0.f1412j) {
                                            if (interfaceC0238s0 instanceof C0561m) {
                                                int[] iArr = ((C0561m) interfaceC0238s0).f2261n;
                                                if (c0241t0 != null) {
                                                    for (InterfaceC0238s0 interfaceC0238s02 : c0241t0.f1412j) {
                                                        if (interfaceC0238s02 instanceof C0563o) {
                                                            C0563o c0563o = (C0563o) interfaceC0238s02;
                                                            if (c0563o.f2253j.equals("TLEN")) {
                                                                jM2428S = AbstractC1118i0.m2428S(Long.parseLong((String) c0563o.f2266l.get(0)));
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    jM2428S = -9223372036854775807L;
                                                    length = iArr.length;
                                                    int i20 = length + 1;
                                                    long[] jArr3 = new long[i20];
                                                    long[] jArr4 = new long[i20];
                                                    jArr3[0] = position2;
                                                    jArr4[0] = 0;
                                                    long j12 = 0;
                                                    i13 = 1;
                                                    while (i13 <= length) {
                                                        int i21 = i13 - 1;
                                                        long j13 = position2 + r10.f2259l + iArr[i21];
                                                        j12 += r10.f2260m + r10.f2262o[i21];
                                                        jArr3[i13] = j13;
                                                        jArr4[i13] = j12;
                                                        i13++;
                                                        length = length;
                                                        position2 = j13;
                                                    }
                                                    c1039c = new C1039c(jM2428S, jArr3, jArr4);
                                                    if (this.f4439r) {
                                                        if (c1039c != null) {
                                                            c1037a = c1039c;
                                                        } else if (c1037a == null) {
                                                            c1037a = null;
                                                        }
                                                        if (c1037a != null) {
                                                            c1037a.isSeekable();
                                                            c1037a2 = c1037a;
                                                        } else {
                                                            interfaceC1988o.mo3862i(c1132w.f4799a, 0, 4);
                                                            c1132w.m2513G(0);
                                                            c1999z.m3879a(c1132w.m2521g());
                                                            c1037a2 = new C1037a(interfaceC1988o.getLength(), interfaceC1988o.getPosition(), c1999z.f7413e, c1999z.f7410b, false);
                                                        }
                                                    } else {
                                                        c1037a2 = new C1042f(-9223372036854775807L);
                                                    }
                                                    this.f4438q = c1037a2;
                                                    this.f4428g.seekMap(c1037a2);
                                                    C0246v c0246v = new C0246v();
                                                    c0246v.f1447m = AbstractC0244u0.m687p((String) c1999z.f7415g);
                                                    c0246v.f1448n = DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
                                                    c0246v.f1425B = c1999z.f7412d;
                                                    c0246v.f1426C = c1999z.f7411c;
                                                    c0246v.f1428E = c1995v.f7391a;
                                                    c0246v.f1429F = c1995v.f7392b;
                                                    c0246v.f1445k = this.f4432k;
                                                    if (this.f4438q.mo2229b() != -2147483647) {
                                                        c0246v.f1442h = this.f4438q.mo2229b();
                                                    }
                                                    this.f4430i.format(new C0249w(c0246v));
                                                    this.f4435n = interfaceC1988o.getPosition();
                                                } else {
                                                    jM2428S = -9223372036854775807L;
                                                    length = iArr.length;
                                                    int i202 = length + 1;
                                                    long[] jArr32 = new long[i202];
                                                    long[] jArr42 = new long[i202];
                                                    jArr32[0] = position2;
                                                    jArr42[0] = 0;
                                                    long j122 = 0;
                                                    i13 = 1;
                                                    while (i13 <= length) {
                                                    }
                                                    c1039c = new C1039c(jM2428S, jArr32, jArr42);
                                                    if (this.f4439r) {
                                                    }
                                                    this.f4438q = c1037a2;
                                                    this.f4428g.seekMap(c1037a2);
                                                    C0246v c0246v2 = new C0246v();
                                                    c0246v2.f1447m = AbstractC0244u0.m687p((String) c1999z.f7415g);
                                                    c0246v2.f1448n = DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
                                                    c0246v2.f1425B = c1999z.f7412d;
                                                    c0246v2.f1426C = c1999z.f7411c;
                                                    c0246v2.f1428E = c1995v.f7391a;
                                                    c0246v2.f1429F = c1995v.f7392b;
                                                    c0246v2.f1445k = this.f4432k;
                                                    if (this.f4438q.mo2229b() != -2147483647) {
                                                    }
                                                    this.f4430i.format(new C0249w(c0246v2));
                                                    this.f4435n = interfaceC1988o.getPosition();
                                                }
                                            }
                                        }
                                        c1039c = null;
                                        if (this.f4439r) {
                                        }
                                        this.f4438q = c1037a2;
                                        this.f4428g.seekMap(c1037a2);
                                        C0246v c0246v22 = new C0246v();
                                        c0246v22.f1447m = AbstractC0244u0.m687p((String) c1999z.f7415g);
                                        c0246v22.f1448n = DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
                                        c0246v22.f1425B = c1999z.f7412d;
                                        c0246v22.f1426C = c1999z.f7411c;
                                        c0246v22.f1428E = c1995v.f7391a;
                                        c0246v22.f1429F = c1995v.f7392b;
                                        c0246v22.f1445k = this.f4432k;
                                        if (this.f4438q.mo2229b() != -2147483647) {
                                        }
                                        this.f4430i.format(new C0249w(c0246v22));
                                        this.f4435n = interfaceC1988o.getPosition();
                                    } else {
                                        c1039c = null;
                                        if (this.f4439r) {
                                        }
                                        this.f4438q = c1037a2;
                                        this.f4428g.seekMap(c1037a2);
                                        C0246v c0246v222 = new C0246v();
                                        c0246v222.f1447m = AbstractC0244u0.m687p((String) c1999z.f7415g);
                                        c0246v222.f1448n = DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
                                        c0246v222.f1425B = c1999z.f7412d;
                                        c0246v222.f1426C = c1999z.f7411c;
                                        c0246v222.f1428E = c1995v.f7391a;
                                        c0246v222.f1429F = c1995v.f7392b;
                                        c0246v222.f1445k = this.f4432k;
                                        if (this.f4438q.mo2229b() != -2147483647) {
                                        }
                                        this.f4430i.format(new C0249w(c0246v222));
                                        this.f4435n = interfaceC1988o.getPosition();
                                    }
                                } else {
                                    long length2 = interfaceC1988o.getLength();
                                    long jM2434Y2 = (j10 == -1 || j10 == 0) ? -9223372036854775807L : AbstractC1118i0.m2434Y(i18, (i19 * j10) - 1);
                                    if (jM2434Y2 != -9223372036854775807L) {
                                        if (jM2537w != -1) {
                                            length2 = position + jM2537w;
                                            j9 = jM2537w - i17;
                                        } else {
                                            if (length2 != -1) {
                                                j9 = (length2 - position) - i17;
                                            }
                                            c0241t0 = this.f4432k;
                                            long position22 = interfaceC1988o.getPosition();
                                            if (c0241t0 == null) {
                                            }
                                        }
                                        long j14 = length2;
                                        long j15 = j9;
                                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                                        c1037a = new C1037a(j14, position + i17, AbstractC0715d.m1566m(AbstractC1118i0.m2437a0(j15, 8000000L, jM2434Y2, roundingMode)), AbstractC0715d.m1566m(AbstractC0714c.m1492E(j15, j10, roundingMode)), false);
                                        c0241t0 = this.f4432k;
                                        long position222 = interfaceC1988o.getPosition();
                                        if (c0241t0 == null) {
                                        }
                                    }
                                }
                            } else {
                                if (iM2521g2 != 1447187017) {
                                    if (iM2521g2 != 1483304551) {
                                        interfaceC1988o.mo3860g();
                                        c1037a = null;
                                    }
                                    iM2521g = c1132w2.m2521g();
                                    if ((iM2521g & 1) == 0) {
                                    }
                                    if ((iM2521g & 2) == 0) {
                                    }
                                    if ((iM2521g & 4) != 4) {
                                    }
                                    if ((iM2521g & 8) != 0) {
                                    }
                                    if (c1132w2.m2515a() < 24) {
                                    }
                                    long j102 = iM2539y;
                                    int i172 = c1999z.f7410b;
                                    int i182 = c1999z.f7411c;
                                    i11 = c1999z.f7413e;
                                    int i192 = c1999z.f7414f;
                                    if (c1995v2.f7391a != -1) {
                                        c1995v2.f7391a = i10;
                                        c1995v2.f7392b = i9;
                                        long position3 = interfaceC1988o.getPosition();
                                        if (interfaceC1988o.getLength() == -1) {
                                            c1995v = c1995v2;
                                            i12 = i11;
                                            interfaceC1988o.mo3861h(c1999z.f7410b);
                                            if (iM2521g2 != 1483304551) {
                                            }
                                        }
                                    } else {
                                        c1995v2.f7391a = i10;
                                        c1995v2.f7392b = i9;
                                        long position32 = interfaceC1988o.getPosition();
                                        if (interfaceC1988o.getLength() == -1) {
                                        }
                                    }
                                } else {
                                    long length3 = interfaceC1988o.getLength();
                                    long position4 = interfaceC1988o.getPosition();
                                    c1132w2.m2514H(6);
                                    long jM2521g = c1999z.f7410b + position4 + c1132w2.m2521g();
                                    int iM2521g3 = c1132w2.m2521g();
                                    if (iM2521g3 <= 0) {
                                        c1037a = null;
                                        interfaceC1988o.mo3861h(c1999z.f7410b);
                                    } else {
                                        int i22 = c1999z.f7411c;
                                        long jM2437a0 = AbstractC1118i0.m2437a0(iM2521g3, (i22 >= 32000 ? 1152 : 576) * 1000000, i22, RoundingMode.DOWN);
                                        int iM2507A = c1132w2.m2507A();
                                        int iM2507A2 = c1132w2.m2507A();
                                        int iM2507A3 = c1132w2.m2507A();
                                        c1132w2.m2514H(2);
                                        long j16 = position4 + c1999z.f7410b;
                                        long[] jArr5 = new long[iM2507A];
                                        long[] jArr6 = new long[iM2507A];
                                        int i23 = 0;
                                        while (i23 < iM2507A) {
                                            long[] jArr7 = jArr5;
                                            long[] jArr8 = jArr6;
                                            jArr7[i23] = (i23 * jM2437a0) / iM2507A;
                                            jArr8[i23] = j16;
                                            if (iM2507A3 == 1) {
                                                iM2535u = c1132w2.m2535u();
                                            } else if (iM2507A3 == 2) {
                                                iM2535u = c1132w2.m2507A();
                                            } else if (iM2507A3 == 3) {
                                                iM2535u = c1132w2.m2538x();
                                            } else {
                                                if (iM2507A3 != 4) {
                                                    c1037a = null;
                                                    break;
                                                }
                                                iM2535u = c1132w2.m2539y();
                                            }
                                            j16 += iM2535u * iM2507A2;
                                            i23++;
                                            iM2507A3 = iM2507A3;
                                            jArr5 = jArr7;
                                            jArr6 = jArr8;
                                        }
                                        long[] jArr9 = jArr5;
                                        long[] jArr10 = jArr6;
                                        if (length3 != -1 && length3 != jM2521g) {
                                            AbstractC1101a.m2348F("VbriSeeker", "VBRI data size mismatch: " + length3 + ", " + jM2521g);
                                        }
                                        if (jM2521g != j16) {
                                            AbstractC1101a.m2348F("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jM2521g + ", " + j16 + "\nSeeking will be inaccurate.");
                                            jM2521g = Math.max(jM2521g, j16);
                                        }
                                        c1037a = new C1044h(jArr9, jArr10, jM2437a0, jM2521g, c1999z.f7413e);
                                        interfaceC1988o.mo3861h(c1999z.f7410b);
                                    }
                                }
                                c1995v = c1995v2;
                                c0241t0 = this.f4432k;
                                long position2222 = interfaceC1988o.getPosition();
                                if (c0241t0 == null) {
                                }
                            }
                        }
                    } else {
                        if (c1999z.f7412d == 1) {
                            i8 = 13;
                        }
                        th = null;
                        j8 = 0;
                        if (c1132w2.f4801c < i8 + 4) {
                        }
                    }
                } else {
                    th = null;
                    j = 1000000;
                    j8 = 0;
                    if (this.f4435n != 0) {
                        long position5 = interfaceC1988o.getPosition();
                        long j17 = this.f4435n;
                        if (position5 < j17) {
                            interfaceC1988o.mo3861h((int) (j17 - position5));
                        }
                    }
                }
                if (this.f4437p != 0) {
                    interfaceC1988o.mo3860g();
                    if (!m2240b(interfaceC1988o)) {
                        c1132w.m2513G(0);
                        int iM2521g4 = c1132w.m2521g();
                        if (((-128000) & iM2521g4) != (this.f4431j & (-128000)) || AbstractC1965b.m3833i(iM2521g4) == -1) {
                            interfaceC1988o.mo3861h(1);
                            this.f4431j = 0;
                            i = 0;
                            i4 = -1;
                        } else {
                            c1999z.m3879a(iM2521g4);
                            if (this.f4433l == -9223372036854775807L) {
                                this.f4433l = this.f4438q.getTimeUs(interfaceC1988o.getPosition());
                                long j18 = this.f4422a;
                                if (j18 != -9223372036854775807L) {
                                    this.f4433l = (j18 - this.f4438q.getTimeUs(j8)) + this.f4433l;
                                }
                            }
                            this.f4437p = c1999z.f7410b;
                            this.f4436o = interfaceC1988o.getPosition() + c1999z.f7410b;
                            if (this.f4438q instanceof AbstractC1038b) {
                                long j19 = ((this.f4434m + c1999z.f7414f) * j) / c1999z.f7411c;
                                throw th;
                            }
                            iSampleData = this.f4430i.sampleData((InterfaceC0219m) interfaceC1988o, this.f4437p, true);
                            if (iSampleData != -1) {
                                int i24 = this.f4437p - iSampleData;
                                this.f4437p = i24;
                                if (i24 > 0) {
                                    i = 0;
                                } else {
                                    this.f4430i.sampleMetadata(((this.f4434m * j) / c1999z.f7411c) + this.f4433l, 1, c1999z.f7410b, 0, null);
                                    this.f4434m += c1999z.f7414f;
                                    this.f4437p = 0;
                                    i = 0;
                                }
                            }
                            i4 = -1;
                        }
                    }
                    i = -1;
                    i4 = -1;
                } else {
                    iSampleData = this.f4430i.sampleData((InterfaceC0219m) interfaceC1988o, this.f4437p, true);
                    if (iSampleData != -1) {
                        i = -1;
                    }
                    i4 = -1;
                }
            } catch (EOFException unused) {
                th = null;
                i = -1;
                i4 = -1;
                j = 1000000;
            }
        } else {
            interfaceC1043g = this.f4438q;
            C1132w c1132w3 = this.f4423b;
            if (interfaceC1043g != null) {
            }
            if (this.f4437p != 0) {
            }
        }
        if (i == i4) {
            InterfaceC1043g interfaceC1043g2 = this.f4438q;
            if (interfaceC1043g2 instanceof AbstractC1038b) {
                if (interfaceC1043g2.getDurationUs() != ((this.f4434m * j) / c1999z.f7411c) + this.f4433l) {
                    ((AbstractC1038b) this.f4438q).getClass();
                    throw th;
                }
            }
        }
        return i;
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        this.f4431j = 0;
        this.f4433l = -9223372036854775807L;
        this.f4434m = 0L;
        this.f4437p = 0;
        this.f4441t = j8;
        if (this.f4438q instanceof AbstractC1038b) {
            throw null;
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        return m2241c(interfaceC1988o, true);
    }

    public C1041e(long j) {
        this.f4422a = j;
        this.f4423b = new C1132w(10);
        this.f4424c = new C1999z();
        this.f4425d = new C1995v();
        this.f4433l = -9223372036854775807L;
        this.f4426e = new C1997x(0);
        C1986m c1986m = new C1986m();
        this.f4427f = c1986m;
        this.f4430i = c1986m;
        this.f4436o = -1L;
    }
}
