package p167t1;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1101a;
import p063h1.C1131v;
import p063h1.C1132w;
import p115n1.AbstractC1965b;
import p115n1.C1963a;
import p115n1.C1964a0;
import p115n1.C1969d;
import p115n1.C1986m;
import p115n1.C1992s;
import p115n1.C1998y;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t1.b */
/* loaded from: classes.dex */
public final class C2394b implements InterfaceC1987n {

    /* renamed from: a */
    public final C1132w f8423a = new C1132w(4);

    /* renamed from: b */
    public final C1132w f8424b = new C1132w(9);

    /* renamed from: c */
    public final C1132w f8425c = new C1132w(11);

    /* renamed from: d */
    public final C1132w f8426d = new C1132w();

    /* renamed from: e */
    public final C2395c f8427e;

    /* renamed from: f */
    public InterfaceC1989p f8428f;

    /* renamed from: g */
    public int f8429g;

    /* renamed from: h */
    public boolean f8430h;

    /* renamed from: i */
    public long f8431i;

    /* renamed from: j */
    public int f8432j;

    /* renamed from: k */
    public int f8433k;

    /* renamed from: l */
    public int f8434l;

    /* renamed from: m */
    public long f8435m;

    /* renamed from: n */
    public boolean f8436n;

    /* renamed from: o */
    public C2393a f8437o;

    /* renamed from: p */
    public C2397e f8438p;

    public C2394b() {
        C2395c c2395c = new C2395c(new C1986m());
        c2395c.f8439k = -9223372036854775807L;
        c2395c.f8440l = new long[0];
        c2395c.f8441m = new long[0];
        this.f8427e = c2395c;
        this.f8429g = 1;
    }

    /* renamed from: a */
    public final C1132w m4239a(InterfaceC1988o interfaceC1988o) {
        int i = this.f8434l;
        C1132w c1132w = this.f8426d;
        byte[] bArr = c1132w.f4799a;
        if (i > bArr.length) {
            c1132w.m2511E(new byte[Math.max(bArr.length * 2, i)], 0);
        } else {
            c1132w.m2513G(0);
        }
        c1132w.m2512F(this.f8434l);
        interfaceC1988o.readFully(c1132w.f4799a, 0, this.f8434l);
        return c1132w;
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        this.f8428f = interfaceC1989p;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029f  */
    @Override // p115n1.InterfaceC1987n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws C0247v0 {
        long j;
        long j8;
        int i;
        long j9;
        int i4;
        boolean z7;
        int i8;
        AbstractC1101a.m2360k(this.f8428f);
        while (true) {
            int i9 = this.f8429g;
            if (i9 == 1) {
                C1132w c1132w = this.f8424b;
                if (!interfaceC1988o.mo3854a(c1132w.f4799a, 0, 9, true)) {
                    return -1;
                }
                c1132w.m2513G(0);
                c1132w.m2514H(4);
                int iM2535u = c1132w.m2535u();
                boolean z8 = (iM2535u & 4) != 0;
                boolean z9 = (iM2535u & 1) != 0;
                if (z8 && this.f8437o == null) {
                    this.f8437o = new C2393a(this.f8428f.track(8, 1));
                }
                if (z9 && this.f8438p == null) {
                    this.f8438p = new C2397e(this.f8428f.track(9, 2));
                }
                this.f8428f.endTracks();
                this.f8432j = c1132w.m2521g() - 5;
                this.f8429g = 2;
            } else if (i9 == 2) {
                interfaceC1988o.mo3861h(this.f8432j);
                this.f8432j = 0;
                this.f8429g = 3;
            } else if (i9 == 3) {
                C1132w c1132w2 = this.f8425c;
                if (!interfaceC1988o.mo3854a(c1132w2.f4799a, 0, 11, true)) {
                    return -1;
                }
                c1132w2.m2513G(0);
                this.f8433k = c1132w2.m2535u();
                this.f8434l = c1132w2.m2538x();
                this.f8435m = c1132w2.m2538x();
                this.f8435m = ((c1132w2.m2535u() << 24) | this.f8435m) * 1000;
                c1132w2.m2514H(3);
                this.f8429g = 4;
            } else {
                if (i9 != 4) {
                    throw new IllegalStateException();
                }
                boolean z10 = this.f8430h;
                C2395c c2395c = this.f8427e;
                if (z10) {
                    j = this.f8431i + this.f8435m;
                } else if (c2395c.f8439k == -9223372036854775807L) {
                    j8 = 0;
                    i = this.f8433k;
                    if (i == 8 || this.f8437o == null) {
                        if (i == 9 || this.f8438p == null) {
                            j9 = -9223372036854775807L;
                            i4 = 0;
                            if (i == 18 || this.f8436n) {
                                interfaceC1988o.mo3861h(this.f8434l);
                                z7 = false;
                                i8 = 0;
                            } else {
                                C1132w c1132wM4239a = m4239a(interfaceC1988o);
                                c2395c.getClass();
                                c2395c.getClass();
                                if (c1132wM4239a.m2535u() == 2 && "onMetaData".equals(C2395c.m4242l(c1132wM4239a)) && c1132wM4239a.m2515a() != 0 && c1132wM4239a.m2535u() == 8) {
                                    HashMap mapM4241k = C2395c.m4241k(c1132wM4239a);
                                    Object obj = mapM4241k.get("duration");
                                    double d8 = 1000000.0d;
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            c2395c.f8439k = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapM4241k.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            c2395c.f8440l = new long[size];
                                            c2395c.f8441m = new long[size];
                                            int i10 = 0;
                                            while (i10 < size) {
                                                Object obj5 = list.get(i10);
                                                Object obj6 = list2.get(i10);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    c2395c.f8440l = new long[0];
                                                    c2395c.f8441m = new long[0];
                                                    break;
                                                }
                                                double d9 = d8;
                                                c2395c.f8440l[i10] = (long) (((Double) obj6).doubleValue() * d9);
                                                c2395c.f8441m[i10] = ((Double) obj5).longValue();
                                                i10++;
                                                d8 = d9;
                                            }
                                        }
                                    }
                                }
                                long j10 = c2395c.f8439k;
                                if (j10 != -9223372036854775807L) {
                                    this.f8428f.seekMap(new C1998y(j10, c2395c.f8441m, c2395c.f8440l));
                                    this.f8436n = true;
                                }
                            }
                        } else {
                            if (!this.f8436n) {
                                this.f8428f.seekMap(new C1992s(-9223372036854775807L));
                                this.f8436n = true;
                            }
                            C2397e c2397e = this.f8438p;
                            C1132w c1132wM4239a2 = m4239a(interfaceC1988o);
                            c2397e.getClass();
                            int iM2535u2 = c1132wM4239a2.m2535u();
                            int i11 = (iM2535u2 >> 4) & 15;
                            int i12 = iM2535u2 & 15;
                            if (i12 != 7) {
                                throw new C2396d(AbstractC0008a1.m12h(i12, "Video format not supported: "));
                            }
                            c2397e.f8447p = i11;
                            if (i11 != 5) {
                                C1132w c1132w3 = c2397e.f8442k;
                                InterfaceC1980i0 interfaceC1980i0 = (InterfaceC1980i0) c2397e.f933j;
                                C1132w c1132w4 = c2397e.f8443l;
                                int iM2535u3 = c1132wM4239a2.m2535u();
                                byte[] bArr = c1132wM4239a2.f4799a;
                                j9 = -9223372036854775807L;
                                int i13 = c1132wM4239a2.f4800b;
                                int i14 = i13 + 1;
                                c1132wM4239a2.f4800b = i14;
                                i4 = 0;
                                int i15 = ((bArr[i13] & 255) << 24) >> 8;
                                c1132wM4239a2.f4800b = i13 + 2;
                                int i16 = i15 | ((bArr[i14] & 255) << 8);
                                c1132wM4239a2.f4800b = i13 + 3;
                                long j11 = (((bArr[r5] & 255) | i16) * 1000) + j8;
                                boolean z11 = false;
                                if (iM2535u3 == 0 && !c2397e.f8445n) {
                                    byte[] bArr2 = new byte[c1132wM4239a2.m2515a()];
                                    C1132w c1132w5 = new C1132w(bArr2);
                                    c1132wM4239a2.m2519e(bArr2, 0, c1132wM4239a2.m2515a());
                                    C1969d c1969dM3849a = C1969d.m3849a(c1132w5);
                                    c2397e.f8444m = c1969dM3849a.f7299b;
                                    C0246v c0246v = new C0246v();
                                    c0246v.f1447m = AbstractC0244u0.m687p("video/avc");
                                    c0246v.f1444j = c1969dM3849a.f7309l;
                                    c0246v.f1454t = c1969dM3849a.f7300c;
                                    c0246v.f1455u = c1969dM3849a.f7301d;
                                    c0246v.f1458x = c1969dM3849a.f7308k;
                                    c0246v.f1450p = c1969dM3849a.f7298a;
                                    interfaceC1980i0.format(new C0249w(c0246v));
                                    c2397e.f8445n = true;
                                } else if (iM2535u3 == 1 && c2397e.f8445n) {
                                    int i17 = c2397e.f8447p == 1 ? 1 : 0;
                                    if (c2397e.f8446o || i17 != 0) {
                                        byte[] bArr3 = c1132w4.f4799a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i18 = 4 - c2397e.f8444m;
                                        int i19 = 0;
                                        while (c1132wM4239a2.m2515a() > 0) {
                                            c1132wM4239a2.m2519e(c1132w4.f4799a, i18, c2397e.f8444m);
                                            c1132w4.m2513G(0);
                                            int iM2539y = c1132w4.m2539y();
                                            c1132w3.m2513G(0);
                                            interfaceC1980i0.sampleData(c1132w3, 4);
                                            interfaceC1980i0.sampleData(c1132wM4239a2, iM2539y);
                                            i19 = i19 + 4 + iM2539y;
                                        }
                                        ((InterfaceC1980i0) c2397e.f933j).sampleMetadata(j11, i17, i19, 0, null);
                                        c2397e.f8446o = true;
                                        z11 = true;
                                    }
                                }
                                if (z11) {
                                    i8 = 1;
                                }
                                z7 = true;
                            } else {
                                j9 = -9223372036854775807L;
                                i4 = 0;
                            }
                        }
                        i8 = i4;
                        z7 = true;
                    } else {
                        if (!this.f8436n) {
                            this.f8428f.seekMap(new C1992s(-9223372036854775807L));
                            this.f8436n = true;
                        }
                        C2393a c2393a = this.f8437o;
                        C1132w c1132wM4239a3 = m4239a(interfaceC1988o);
                        InterfaceC1980i0 interfaceC1980i02 = (InterfaceC1980i0) c2393a.f933j;
                        if (c2393a.f8420k) {
                            c1132wM4239a3.m2514H(1);
                        } else {
                            int iM2535u4 = c1132wM4239a3.m2535u();
                            int i20 = (iM2535u4 >> 4) & 15;
                            c2393a.f8422m = i20;
                            if (i20 == 2) {
                                int i21 = C2393a.f8419n[(iM2535u4 >> 2) & 3];
                                C0246v c0246v2 = new C0246v();
                                c0246v2.f1447m = AbstractC0244u0.m687p("audio/mpeg");
                                c0246v2.f1425B = 1;
                                c0246v2.f1426C = i21;
                                interfaceC1980i02.format(new C0249w(c0246v2));
                                c2393a.f8421l = true;
                            } else if (i20 == 7 || i20 == 8) {
                                String str = i20 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                C0246v c0246v3 = new C0246v();
                                c0246v3.f1447m = AbstractC0244u0.m687p(str);
                                c0246v3.f1425B = 1;
                                c0246v3.f1426C = 8000;
                                interfaceC1980i02.format(new C0249w(c0246v3));
                                c2393a.f8421l = true;
                            } else if (i20 != 10) {
                                throw new C2396d("Audio format not supported: " + c2393a.f8422m);
                            }
                            c2393a.f8420k = true;
                        }
                        InterfaceC1980i0 interfaceC1980i03 = (InterfaceC1980i0) c2393a.f933j;
                        i8 = 1;
                        if (c2393a.f8422m == 2) {
                            int iM2515a = c1132wM4239a3.m2515a();
                            interfaceC1980i03.sampleData(c1132wM4239a3, iM2515a);
                            ((InterfaceC1980i0) c2393a.f933j).sampleMetadata(j8, 1, iM2515a, 0, null);
                        } else {
                            int iM2535u5 = c1132wM4239a3.m2535u();
                            if (iM2535u5 == 0 && !c2393a.f8421l) {
                                int iM2515a2 = c1132wM4239a3.m2515a();
                                byte[] bArr4 = new byte[iM2515a2];
                                c1132wM4239a3.m2519e(bArr4, 0, iM2515a2);
                                C1963a c1963aM3838n = AbstractC1965b.m3838n(new C1131v(bArr4, iM2515a2), false);
                                C0246v c0246v4 = new C0246v();
                                c0246v4.f1447m = AbstractC0244u0.m687p("audio/mp4a-latm");
                                c0246v4.f1444j = c1963aM3838n.f7261a;
                                c0246v4.f1425B = c1963aM3838n.f7263c;
                                c0246v4.f1426C = c1963aM3838n.f7262b;
                                c0246v4.f1450p = Collections.singletonList(bArr4);
                                interfaceC1980i03.format(new C0249w(c0246v4));
                                c2393a.f8421l = true;
                            } else if (c2393a.f8422m != 10 || iM2535u5 == 1) {
                                int iM2515a3 = c1132wM4239a3.m2515a();
                                interfaceC1980i03.sampleData(c1132wM4239a3, iM2515a3);
                                ((InterfaceC1980i0) c2393a.f933j).sampleMetadata(j8, 1, iM2515a3, 0, null);
                            }
                            i8 = 0;
                        }
                        z7 = true;
                        j9 = -9223372036854775807L;
                        i4 = 0;
                    }
                    if (!this.f8430h && i8 != 0) {
                        this.f8430h = true;
                        this.f8431i = c2395c.f8439k != j9 ? -this.f8435m : 0L;
                    }
                    this.f8432j = 4;
                    this.f8429g = 2;
                    if (!z7) {
                        return i4;
                    }
                } else {
                    j = this.f8435m;
                }
                j8 = j;
                i = this.f8433k;
                if (i == 8) {
                    if (i == 9) {
                        j9 = -9223372036854775807L;
                        i4 = 0;
                        if (i == 18) {
                        }
                        interfaceC1988o.mo3861h(this.f8434l);
                        z7 = false;
                        i8 = 0;
                        if (!this.f8430h) {
                            this.f8430h = true;
                            this.f8431i = c2395c.f8439k != j9 ? -this.f8435m : 0L;
                        }
                        this.f8432j = 4;
                        this.f8429g = 2;
                        if (!z7) {
                        }
                    }
                }
            }
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        if (j == 0) {
            this.f8429g = 1;
            this.f8430h = false;
        } else {
            this.f8429g = 3;
        }
        this.f8432j = 0;
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        C1132w c1132w = this.f8423a;
        interfaceC1988o.mo3862i(c1132w.f4799a, 0, 3);
        c1132w.m2513G(0);
        if (c1132w.m2538x() == 4607062) {
            interfaceC1988o.mo3862i(c1132w.f4799a, 0, 2);
            c1132w.m2513G(0);
            if ((c1132w.m2507A() & 250) == 0) {
                interfaceC1988o.mo3862i(c1132w.f4799a, 0, 4);
                c1132w.m2513G(0);
                int iM2521g = c1132w.m2521g();
                interfaceC1988o.mo3860g();
                interfaceC1988o.mo3857d(iM2521g);
                interfaceC1988o.mo3862i(c1132w.f4799a, 0, 4);
                c1132w.m2513G(0);
                if (c1132w.m2521g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
