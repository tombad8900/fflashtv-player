package p132p1;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import p005a4.C0073c;
import p023c4.C0644h;
import p052f6.C0977k0;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p090k2.C1584b;
import p090k2.InterfaceC1597o;
import p115n1.C1964a0;
import p115n1.C1992s;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p1.b */
/* loaded from: classes.dex */
public final class C2199b implements InterfaceC1987n {

    /* renamed from: a */
    public final C1132w f7673a;

    /* renamed from: b */
    public final C0644h f7674b;

    /* renamed from: c */
    public final boolean f7675c;

    /* renamed from: d */
    public final InterfaceC1597o f7676d;

    /* renamed from: e */
    public int f7677e;

    /* renamed from: f */
    public InterfaceC1989p f7678f;

    /* renamed from: g */
    public C2200c f7679g;

    /* renamed from: h */
    public long f7680h;

    /* renamed from: i */
    public C2202e[] f7681i;

    /* renamed from: j */
    public long f7682j;

    /* renamed from: k */
    public C2202e f7683k;

    /* renamed from: l */
    public int f7684l;

    /* renamed from: m */
    public long f7685m;

    /* renamed from: n */
    public long f7686n;

    /* renamed from: o */
    public int f7687o;

    /* renamed from: p */
    public boolean f7688p;

    public C2199b(int i, InterfaceC1597o interfaceC1597o) {
        this.f7676d = interfaceC1597o;
        this.f7675c = (i & 1) == 0;
        this.f7673a = new C1132w(12);
        this.f7674b = new C0644h();
        this.f7678f = new C1584b(8);
        this.f7681i = new C2202e[0];
        this.f7685m = -1L;
        this.f7686n = -1L;
        this.f7684l = -1;
        this.f7680h = -9223372036854775807L;
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        this.f7677e = 0;
        if (this.f7675c) {
            interfaceC1989p = new C0073c(interfaceC1989p, this.f7676d);
        }
        this.f7678f = interfaceC1989p;
        this.f7682j = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    @Override // p115n1.InterfaceC1987n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws C0247v0 {
        boolean z7;
        C2202e c2202e;
        long j;
        int i;
        C2202e c2202e2;
        int i4 = 0;
        if (this.f7682j != -1) {
            long position = interfaceC1988o.getPosition();
            long j8 = this.f7682j;
            if (j8 < position || j8 > 262144 + position) {
                c1964a0.f7264a = j8;
                z7 = true;
            } else {
                interfaceC1988o.mo3861h((int) (j8 - position));
                z7 = false;
            }
        } else {
            z7 = false;
        }
        this.f7682j = -1L;
        if (z7) {
            return 1;
        }
        int i8 = this.f7677e;
        C2202e c2202e3 = null;
        C0644h c0644h = this.f7674b;
        C1132w c1132w = this.f7673a;
        switch (i8) {
            case 0:
                if (!sniff(interfaceC1988o)) {
                    throw C0247v0.createForMalformedContainer("AVI Header List not found", null);
                }
                interfaceC1988o.mo3861h(12);
                this.f7677e = 1;
                return 0;
            case 1:
                interfaceC1988o.readFully(c1132w.f4799a, 0, 12);
                c1132w.m2513G(0);
                c0644h.getClass();
                c0644h.f2541a = c1132w.m2523i();
                c0644h.f2542b = c1132w.m2523i();
                c0644h.f2543c = 0;
                if (c0644h.f2541a != 1414744396) {
                    throw C0247v0.createForMalformedContainer("LIST expected, found: " + c0644h.f2541a, null);
                }
                int iM2523i = c1132w.m2523i();
                c0644h.f2543c = iM2523i;
                if (iM2523i == 1819436136) {
                    this.f7684l = c0644h.f2542b;
                    this.f7677e = 2;
                    return 0;
                }
                throw C0247v0.createForMalformedContainer("hdrl expected, found: " + c0644h.f2543c, null);
            case 2:
                int i9 = this.f7684l - 4;
                C1132w c1132w2 = new C1132w(i9);
                interfaceC1988o.readFully(c1132w2.f4799a, 0, i9);
                C2203f c2203fM4002b = C2203f.m4002b(c1132w2, 1819436136);
                int i10 = c2203fM4002b.f7711b;
                if (i10 != 1819436136) {
                    throw C0247v0.createForMalformedContainer("Unexpected header list type " + i10, null);
                }
                C2200c c2200c = (C2200c) c2203fM4002b.m4003a(C2200c.class);
                if (c2200c == null) {
                    throw C0247v0.createForMalformedContainer("AviHeader not found", null);
                }
                this.f7679g = c2200c;
                this.f7680h = c2200c.f7691c * c2200c.f7689a;
                ArrayList arrayList = new ArrayList();
                C0977k0 c0977k0ListIterator = c2203fM4002b.f7710a.listIterator(0);
                int i11 = 0;
                while (c0977k0ListIterator.hasNext()) {
                    InterfaceC2198a interfaceC2198a = (InterfaceC2198a) c0977k0ListIterator.next();
                    if (interfaceC2198a.getType() == 1819440243) {
                        C2203f c2203f = (C2203f) interfaceC2198a;
                        int i12 = i11 + 1;
                        C2201d c2201d = (C2201d) c2203f.m4003a(C2201d.class);
                        C2204g c2204g = (C2204g) c2203f.m4003a(C2204g.class);
                        if (c2201d == null) {
                            AbstractC1101a.m2348F("AviExtractor", "Missing Stream Header");
                        } else if (c2204g == null) {
                            AbstractC1101a.m2348F("AviExtractor", "Missing Stream Format");
                        } else {
                            long j9 = c2201d.f7694c;
                            int i13 = AbstractC1118i0.f4750a;
                            long jM2437a0 = AbstractC1118i0.m2437a0(c2201d.f7695d, c2201d.f7693b * 1000000, j9, RoundingMode.DOWN);
                            C0249w c0249w = c2204g.f7712a;
                            C0246v c0246vM692a = c0249w.m692a();
                            c0246vM692a.f1435a = Integer.toString(i11);
                            int i14 = c2201d.f7696e;
                            if (i14 != 0) {
                                c0246vM692a.f1448n = i14;
                            }
                            C2205h c2205h = (C2205h) c2203f.m4003a(C2205h.class);
                            if (c2205h != null) {
                                c0246vM692a.f1436b = c2205h.f7713a;
                            }
                            int iM680i = AbstractC0244u0.m680i(c0249w.f1522n);
                            if (iM680i == 1 || iM680i == 2) {
                                InterfaceC1980i0 interfaceC1980i0Track = this.f7678f.track(i11, iM680i);
                                interfaceC1980i0Track.format(new C0249w(c0246vM692a));
                                c2202e = new C2202e(i11, iM680i, jM2437a0, c2201d.f7695d, interfaceC1980i0Track);
                                this.f7680h = Math.max(this.f7680h, jM2437a0);
                            }
                            if (c2202e != null) {
                                arrayList.add(c2202e);
                            }
                            i11 = i12;
                        }
                        c2202e = null;
                        if (c2202e != null) {
                        }
                        i11 = i12;
                    }
                }
                this.f7681i = (C2202e[]) arrayList.toArray(new C2202e[0]);
                this.f7678f.endTracks();
                this.f7677e = 3;
                return 0;
            case 3:
                if (this.f7685m != -1) {
                    long position2 = interfaceC1988o.getPosition();
                    long j10 = this.f7685m;
                    if (position2 != j10) {
                        this.f7682j = j10;
                        return 0;
                    }
                }
                interfaceC1988o.mo3862i(c1132w.f4799a, 0, 12);
                interfaceC1988o.mo3860g();
                c1132w.m2513G(0);
                c0644h.getClass();
                c0644h.f2541a = c1132w.m2523i();
                c0644h.f2542b = c1132w.m2523i();
                c0644h.f2543c = 0;
                int iM2523i2 = c1132w.m2523i();
                int i15 = c0644h.f2541a;
                if (i15 == 1179011410) {
                    interfaceC1988o.mo3861h(12);
                    return 0;
                }
                if (i15 != 1414744396 || iM2523i2 != 1769369453) {
                    this.f7682j = interfaceC1988o.getPosition() + c0644h.f2542b + 8;
                    return 0;
                }
                long position3 = interfaceC1988o.getPosition();
                this.f7685m = position3;
                this.f7686n = position3 + c0644h.f2542b + 8;
                if (!this.f7688p) {
                    C2200c c2200c2 = this.f7679g;
                    c2200c2.getClass();
                    if ((c2200c2.f7690b & 16) == 16) {
                        this.f7677e = 4;
                        this.f7682j = this.f7686n;
                        return 0;
                    }
                    this.f7678f.seekMap(new C1992s(this.f7680h));
                    this.f7688p = true;
                }
                this.f7682j = interfaceC1988o.getPosition() + 12;
                this.f7677e = 6;
                return 0;
            case 4:
                interfaceC1988o.readFully(c1132w.f4799a, 0, 8);
                c1132w.m2513G(0);
                int iM2523i3 = c1132w.m2523i();
                int iM2523i4 = c1132w.m2523i();
                if (iM2523i3 != 829973609) {
                    this.f7682j = interfaceC1988o.getPosition() + iM2523i4;
                    return 0;
                }
                this.f7677e = 5;
                this.f7687o = iM2523i4;
                return 0;
            case 5:
                C1132w c1132w3 = new C1132w(this.f7687o);
                interfaceC1988o.readFully(c1132w3.f4799a, 0, this.f7687o);
                if (c1132w3.m2515a() < 16) {
                    j = 0;
                } else {
                    int i16 = c1132w3.f4800b;
                    c1132w3.m2514H(8);
                    long jM2523i = c1132w3.m2523i();
                    long j11 = this.f7685m;
                    j = jM2523i > j11 ? 0L : j11 + 8;
                    c1132w3.m2513G(i16);
                }
                while (c1132w3.m2515a() >= 16) {
                    int iM2523i5 = c1132w3.m2523i();
                    int iM2523i6 = c1132w3.m2523i();
                    long jM2523i2 = c1132w3.m2523i() + j;
                    c1132w3.m2523i();
                    C2202e[] c2202eArr = this.f7681i;
                    int length = c2202eArr.length;
                    int i17 = i4;
                    while (true) {
                        if (i17 < length) {
                            i = i4;
                            c2202e2 = c2202eArr[i17];
                            if (c2202e2.f7698b != iM2523i5 && c2202e2.f7699c != iM2523i5) {
                                i17++;
                                i4 = i;
                            }
                        } else {
                            i = i4;
                            c2202e2 = null;
                        }
                    }
                    if (c2202e2 != null) {
                        int i18 = (iM2523i6 & 16) == 16 ? 1 : i;
                        if (c2202e2.f7707k == -1) {
                            c2202e2.f7707k = jM2523i2;
                        }
                        if (i18 != 0) {
                            if (c2202e2.f7706j == c2202e2.f7709m.length) {
                                long[] jArr = c2202e2.f7708l;
                                c2202e2.f7708l = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = c2202e2.f7709m;
                                c2202e2.f7709m = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = c2202e2.f7708l;
                            int i19 = c2202e2.f7706j;
                            jArr2[i19] = jM2523i2;
                            c2202e2.f7709m[i19] = c2202e2.f7705i;
                            c2202e2.f7706j = i19 + 1;
                        }
                        c2202e2.f7705i++;
                    }
                    i4 = i;
                }
                int i20 = i4;
                C2202e[] c2202eArr2 = this.f7681i;
                int length2 = c2202eArr2.length;
                for (int i21 = i20; i21 < length2; i21++) {
                    C2202e c2202e4 = c2202eArr2[i21];
                    c2202e4.f7708l = Arrays.copyOf(c2202e4.f7708l, c2202e4.f7706j);
                    c2202e4.f7709m = Arrays.copyOf(c2202e4.f7709m, c2202e4.f7706j);
                }
                this.f7688p = true;
                this.f7678f.seekMap(new C1992s(this, this.f7680h, 2));
                this.f7677e = 6;
                this.f7682j = this.f7685m;
                return i20;
            case 6:
                if (interfaceC1988o.getPosition() >= this.f7686n) {
                    return -1;
                }
                C2202e c2202e5 = this.f7683k;
                if (c2202e5 != null) {
                    int i22 = c2202e5.f7703g;
                    int iSampleData = i22 - c2202e5.f7697a.sampleData((InterfaceC0219m) interfaceC1988o, i22, false);
                    c2202e5.f7703g = iSampleData;
                    boolean z8 = iSampleData == 0;
                    if (z8) {
                        if (c2202e5.f7702f > 0) {
                            InterfaceC1980i0 interfaceC1980i0 = c2202e5.f7697a;
                            int i23 = c2202e5.f7704h;
                            interfaceC1980i0.sampleMetadata((c2202e5.f7700d * i23) / c2202e5.f7701e, Arrays.binarySearch(c2202e5.f7709m, i23) >= 0 ? 1 : 0, c2202e5.f7702f, 0, null);
                        }
                        c2202e5.f7704h++;
                    }
                    if (z8) {
                        this.f7683k = null;
                    }
                    return 0;
                }
                if ((interfaceC1988o.getPosition() & 1) == 1) {
                    interfaceC1988o.mo3861h(1);
                }
                interfaceC1988o.mo3862i(c1132w.f4799a, 0, 12);
                c1132w.m2513G(0);
                int iM2523i7 = c1132w.m2523i();
                if (iM2523i7 == 1414744396) {
                    c1132w.m2513G(8);
                    interfaceC1988o.mo3861h(c1132w.m2523i() == 1769369453 ? 12 : 8);
                    interfaceC1988o.mo3860g();
                    return 0;
                }
                int iM2523i8 = c1132w.m2523i();
                if (iM2523i7 == 1263424842) {
                    this.f7682j = interfaceC1988o.getPosition() + iM2523i8 + 8;
                    return 0;
                }
                interfaceC1988o.mo3861h(8);
                interfaceC1988o.mo3860g();
                for (C2202e c2202e6 : this.f7681i) {
                    if (c2202e6.f7698b == iM2523i7 || c2202e6.f7699c == iM2523i7) {
                        c2202e3 = c2202e6;
                        if (c2202e3 != null) {
                            this.f7682j = interfaceC1988o.getPosition() + iM2523i8;
                            return 0;
                        }
                        c2202e3.f7702f = iM2523i8;
                        c2202e3.f7703g = iM2523i8;
                        this.f7683k = c2202e3;
                        return 0;
                    }
                }
                if (c2202e3 != null) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        this.f7682j = -1L;
        this.f7683k = null;
        for (C2202e c2202e : this.f7681i) {
            if (c2202e.f7706j == 0) {
                c2202e.f7704h = 0;
            } else {
                c2202e.f7704h = c2202e.f7709m[AbstractC1118i0.m2444e(c2202e.f7708l, j, true)];
            }
        }
        if (j != 0) {
            this.f7677e = 6;
        } else if (this.f7681i.length == 0) {
            this.f7677e = 0;
        } else {
            this.f7677e = 3;
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        C1132w c1132w = this.f7673a;
        interfaceC1988o.mo3862i(c1132w.f4799a, 0, 12);
        c1132w.m2513G(0);
        if (c1132w.m2523i() == 1179011410) {
            c1132w.m2514H(4);
            if (c1132w.m2523i() == 541677121) {
                return true;
            }
        }
        return false;
    }
}
