package p168t2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import java.util.Collections;
import p063h1.AbstractC1101a;
import p063h1.C1131v;
import p063h1.C1132w;
import p115n1.AbstractC1965b;
import p115n1.C1963a;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.s */
/* loaded from: classes.dex */
public final class C2425s implements InterfaceC2412h {

    /* renamed from: a */
    public final String f8699a;

    /* renamed from: b */
    public final int f8700b;

    /* renamed from: c */
    public final C1132w f8701c;

    /* renamed from: d */
    public final C1131v f8702d;

    /* renamed from: e */
    public InterfaceC1980i0 f8703e;

    /* renamed from: f */
    public String f8704f;

    /* renamed from: g */
    public C0249w f8705g;

    /* renamed from: h */
    public int f8706h;

    /* renamed from: i */
    public int f8707i;

    /* renamed from: j */
    public int f8708j;

    /* renamed from: k */
    public int f8709k;

    /* renamed from: l */
    public long f8710l;

    /* renamed from: m */
    public boolean f8711m;

    /* renamed from: n */
    public int f8712n;

    /* renamed from: o */
    public int f8713o;

    /* renamed from: p */
    public int f8714p;

    /* renamed from: q */
    public boolean f8715q;

    /* renamed from: r */
    public long f8716r;

    /* renamed from: s */
    public int f8717s;

    /* renamed from: t */
    public long f8718t;

    /* renamed from: u */
    public int f8719u;

    /* renamed from: v */
    public String f8720v;

    public C2425s(String str, int i) {
        this.f8699a = str;
        this.f8700b = i;
        C1132w c1132w = new C1132w(1024);
        this.f8701c = c1132w;
        byte[] bArr = c1132w.f4799a;
        this.f8702d = new C1131v(bArr, bArr.length);
        this.f8710l = -9223372036854775807L;
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: a */
    public final void mo4245a(C1132w c1132w) throws C0247v0 {
        int iM2494k;
        boolean zM2493j;
        AbstractC1101a.m2360k(this.f8703e);
        while (c1132w.m2515a() > 0) {
            int i = this.f8706h;
            if (i != 0) {
                if (i != 1) {
                    C1132w c1132w2 = this.f8701c;
                    C1131v c1131v = this.f8702d;
                    if (i == 2) {
                        int iM2535u = ((this.f8709k & (-225)) << 8) | c1132w.m2535u();
                        this.f8708j = iM2535u;
                        if (iM2535u > c1132w2.f4799a.length) {
                            c1132w2.m2510D(iM2535u);
                            byte[] bArr = c1132w2.f4799a;
                            c1131v.getClass();
                            c1131v.m2501r(bArr, bArr.length);
                        }
                        this.f8707i = 0;
                        this.f8706h = 3;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(c1132w.m2515a(), this.f8708j - this.f8707i);
                        c1132w.m2519e((byte[]) c1131v.f4792b, this.f8707i, iMin);
                        int i4 = this.f8707i + iMin;
                        this.f8707i = i4;
                        if (i4 == this.f8708j) {
                            c1131v.m2502s(0);
                            if (c1131v.m2493j()) {
                                if (this.f8711m) {
                                }
                                this.f8706h = 0;
                            } else {
                                this.f8711m = true;
                                int iM2494k2 = c1131v.m2494k(1);
                                int iM2494k3 = iM2494k2 == 1 ? c1131v.m2494k(1) : 0;
                                this.f8712n = iM2494k3;
                                if (iM2494k3 != 0) {
                                    throw C0247v0.createForMalformedContainer(null, null);
                                }
                                if (iM2494k2 == 1) {
                                    c1131v.m2494k((c1131v.m2494k(2) + 1) * 8);
                                }
                                if (!c1131v.m2493j()) {
                                    throw C0247v0.createForMalformedContainer(null, null);
                                }
                                this.f8713o = c1131v.m2494k(6);
                                int iM2494k4 = c1131v.m2494k(4);
                                int iM2494k5 = c1131v.m2494k(3);
                                if (iM2494k4 != 0 || iM2494k5 != 0) {
                                    throw C0247v0.createForMalformedContainer(null, null);
                                }
                                if (iM2494k2 == 0) {
                                    int iM2492i = c1131v.m2492i();
                                    int iM2486c = c1131v.m2486c();
                                    C1963a c1963aM3838n = AbstractC1965b.m3838n(c1131v, true);
                                    this.f8720v = c1963aM3838n.f7261a;
                                    this.f8717s = c1963aM3838n.f7262b;
                                    this.f8719u = c1963aM3838n.f7263c;
                                    int iM2486c2 = iM2486c - c1131v.m2486c();
                                    c1131v.m2502s(iM2492i);
                                    byte[] bArr2 = new byte[(iM2486c2 + 7) / 8];
                                    c1131v.m2495l(bArr2, iM2486c2);
                                    C0246v c0246v = new C0246v();
                                    c0246v.f1435a = this.f8704f;
                                    c0246v.f1447m = AbstractC0244u0.m687p("audio/mp4a-latm");
                                    c0246v.f1444j = this.f8720v;
                                    c0246v.f1425B = this.f8719u;
                                    c0246v.f1426C = this.f8717s;
                                    c0246v.f1450p = Collections.singletonList(bArr2);
                                    c0246v.f1438d = this.f8699a;
                                    c0246v.f1440f = this.f8700b;
                                    C0249w c0249w = new C0249w(c0246v);
                                    if (!c0249w.equals(this.f8705g)) {
                                        this.f8705g = c0249w;
                                        this.f8718t = 1024000000 / c0249w.f1499D;
                                        this.f8703e.format(c0249w);
                                    }
                                } else {
                                    int iM2486c3 = c1131v.m2486c();
                                    C1963a c1963aM3838n2 = AbstractC1965b.m3838n(c1131v, true);
                                    this.f8720v = c1963aM3838n2.f7261a;
                                    this.f8717s = c1963aM3838n2.f7262b;
                                    this.f8719u = c1963aM3838n2.f7263c;
                                    c1131v.m2505v(c1131v.m2494k((c1131v.m2494k(2) + 1) * 8) - (iM2486c3 - c1131v.m2486c()));
                                }
                                int iM2494k6 = c1131v.m2494k(3);
                                this.f8714p = iM2494k6;
                                if (iM2494k6 == 0) {
                                    c1131v.m2505v(8);
                                } else if (iM2494k6 == 1) {
                                    c1131v.m2505v(9);
                                } else if (iM2494k6 == 3 || iM2494k6 == 4 || iM2494k6 == 5) {
                                    c1131v.m2505v(6);
                                } else {
                                    if (iM2494k6 != 6 && iM2494k6 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c1131v.m2505v(1);
                                }
                                boolean zM2493j2 = c1131v.m2493j();
                                this.f8715q = zM2493j2;
                                this.f8716r = 0L;
                                if (zM2493j2) {
                                    if (iM2494k2 == 1) {
                                        this.f8716r = c1131v.m2494k((c1131v.m2494k(2) + 1) * 8);
                                    } else {
                                        do {
                                            zM2493j = c1131v.m2493j();
                                            this.f8716r = (this.f8716r << 8) + c1131v.m2494k(8);
                                        } while (zM2493j);
                                    }
                                }
                                if (c1131v.m2493j()) {
                                    c1131v.m2505v(8);
                                }
                            }
                            if (this.f8712n != 0) {
                                throw C0247v0.createForMalformedContainer(null, null);
                            }
                            if (this.f8713o != 0) {
                                throw C0247v0.createForMalformedContainer(null, null);
                            }
                            if (this.f8714p != 0) {
                                throw C0247v0.createForMalformedContainer(null, null);
                            }
                            int i8 = 0;
                            do {
                                iM2494k = c1131v.m2494k(8);
                                i8 += iM2494k;
                            } while (iM2494k == 255);
                            int iM2492i2 = c1131v.m2492i();
                            if ((iM2492i2 & 7) == 0) {
                                c1132w2.m2513G(iM2492i2 >> 3);
                            } else {
                                c1131v.m2495l(c1132w2.f4799a, i8 * 8);
                                c1132w2.m2513G(0);
                            }
                            this.f8703e.sampleData(c1132w2, i8);
                            AbstractC1101a.m2359j(this.f8710l != -9223372036854775807L);
                            this.f8703e.sampleMetadata(this.f8710l, 1, i8, 0, null);
                            this.f8710l += this.f8718t;
                            if (this.f8715q) {
                                c1131v.m2505v((int) this.f8716r);
                            }
                            this.f8706h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iM2535u2 = c1132w.m2535u();
                    if ((iM2535u2 & 224) == 224) {
                        this.f8709k = iM2535u2;
                        this.f8706h = 2;
                    } else if (iM2535u2 != 86) {
                        this.f8706h = 0;
                    }
                }
            } else if (c1132w.m2535u() == 86) {
                this.f8706h = 1;
            }
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: c */
    public final void mo4246c() {
        this.f8706h = 0;
        this.f8710l = -9223372036854775807L;
        this.f8711m = false;
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
        this.f8703e = interfaceC1989p.track(c2411g0.f8572d, 1);
        c2411g0.m4256b();
        this.f8704f = c2411g0.f8573e;
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: f */
    public final void mo4249f(int i, long j) {
        this.f8710l = j;
    }
}
