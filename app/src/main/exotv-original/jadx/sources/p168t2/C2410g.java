package p168t2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import java.util.Collections;
import java.util.List;
import p063h1.AbstractC1101a;
import p063h1.C1132w;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.g */
/* loaded from: classes.dex */
public final class C2410g implements InterfaceC2412h {

    /* renamed from: a */
    public final /* synthetic */ int f8562a;

    /* renamed from: b */
    public boolean f8563b;

    /* renamed from: c */
    public long f8564c;

    /* renamed from: d */
    public int f8565d;

    /* renamed from: e */
    public int f8566e;

    /* renamed from: f */
    public final Object f8567f;

    /* renamed from: g */
    public Object f8568g;

    public C2410g(List list) {
        this.f8562a = 0;
        this.f8567f = list;
        this.f8568g = new InterfaceC1980i0[list.size()];
        this.f8564c = -9223372036854775807L;
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: a */
    public final void mo4245a(C1132w c1132w) {
        boolean z7;
        boolean z8;
        switch (this.f8562a) {
            case 0:
                if (this.f8563b) {
                    if (this.f8565d == 2) {
                        if (c1132w.m2515a() == 0) {
                            z8 = false;
                        } else {
                            if (c1132w.m2535u() != 32) {
                                this.f8563b = false;
                            }
                            this.f8565d--;
                            z8 = this.f8563b;
                        }
                        if (!z8) {
                        }
                    }
                    if (this.f8565d == 1) {
                        if (c1132w.m2515a() == 0) {
                            z7 = false;
                        } else {
                            if (c1132w.m2535u() != 0) {
                                this.f8563b = false;
                            }
                            this.f8565d--;
                            z7 = this.f8563b;
                        }
                        if (!z7) {
                        }
                    }
                    int i = c1132w.f4800b;
                    int iM2515a = c1132w.m2515a();
                    for (InterfaceC1980i0 interfaceC1980i0 : (InterfaceC1980i0[]) this.f8568g) {
                        c1132w.m2513G(i);
                        interfaceC1980i0.sampleData(c1132w, iM2515a);
                    }
                    this.f8566e += iM2515a;
                    break;
                }
                break;
            default:
                C1132w c1132w2 = (C1132w) this.f8567f;
                AbstractC1101a.m2360k((InterfaceC1980i0) this.f8568g);
                if (this.f8563b) {
                    int iM2515a2 = c1132w.m2515a();
                    int i4 = this.f8566e;
                    if (i4 < 10) {
                        int iMin = Math.min(iM2515a2, 10 - i4);
                        System.arraycopy(c1132w.f4799a, c1132w.f4800b, c1132w2.f4799a, this.f8566e, iMin);
                        if (this.f8566e + iMin == 10) {
                            c1132w2.m2513G(0);
                            if (73 != c1132w2.m2535u() || 68 != c1132w2.m2535u() || 51 != c1132w2.m2535u()) {
                                AbstractC1101a.m2348F("Id3Reader", "Discarding invalid ID3 tag");
                                this.f8563b = false;
                                break;
                            } else {
                                c1132w2.m2514H(3);
                                this.f8565d = c1132w2.m2534t() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iM2515a2, this.f8565d - this.f8566e);
                    ((InterfaceC1980i0) this.f8568g).sampleData(c1132w, iMin2);
                    this.f8566e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: c */
    public final void mo4246c() {
        switch (this.f8562a) {
            case 0:
                this.f8563b = false;
                this.f8564c = -9223372036854775807L;
                break;
            default:
                this.f8563b = false;
                this.f8564c = -9223372036854775807L;
                break;
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: d */
    public final void mo4247d(boolean z7) {
        int i;
        switch (this.f8562a) {
            case 0:
                if (this.f8563b) {
                    AbstractC1101a.m2359j(this.f8564c != -9223372036854775807L);
                    for (InterfaceC1980i0 interfaceC1980i0 : (InterfaceC1980i0[]) this.f8568g) {
                        interfaceC1980i0.sampleMetadata(this.f8564c, 1, this.f8566e, 0, null);
                    }
                    this.f8563b = false;
                    break;
                }
                break;
            default:
                AbstractC1101a.m2360k((InterfaceC1980i0) this.f8568g);
                if (this.f8563b && (i = this.f8565d) != 0 && this.f8566e == i) {
                    AbstractC1101a.m2359j(this.f8564c != -9223372036854775807L);
                    ((InterfaceC1980i0) this.f8568g).sampleMetadata(this.f8564c, 1, this.f8565d, 0, null);
                    this.f8563b = false;
                    break;
                }
                break;
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: e */
    public final void mo4248e(InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
        switch (this.f8562a) {
            case 0:
                InterfaceC1980i0[] interfaceC1980i0Arr = (InterfaceC1980i0[]) this.f8568g;
                for (int i = 0; i < interfaceC1980i0Arr.length; i++) {
                    C2409f0 c2409f0 = (C2409f0) ((List) this.f8567f).get(i);
                    c2411g0.m4255a();
                    c2411g0.m4256b();
                    InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(c2411g0.f8572d, 3);
                    C0246v c0246v = new C0246v();
                    c2411g0.m4256b();
                    c0246v.f1435a = c2411g0.f8573e;
                    c0246v.f1447m = AbstractC0244u0.m687p("application/dvbsubs");
                    c0246v.f1450p = Collections.singletonList(c2409f0.f8561b);
                    c0246v.f1438d = c2409f0.f8560a;
                    interfaceC1980i0Track.format(new C0249w(c0246v));
                    interfaceC1980i0Arr[i] = interfaceC1980i0Track;
                }
                break;
            default:
                c2411g0.m4255a();
                c2411g0.m4256b();
                InterfaceC1980i0 interfaceC1980i0Track2 = interfaceC1989p.track(c2411g0.f8572d, 5);
                this.f8568g = interfaceC1980i0Track2;
                C0246v c0246v2 = new C0246v();
                c2411g0.m4256b();
                c0246v2.f1435a = c2411g0.f8573e;
                c0246v2.f1447m = AbstractC0244u0.m687p("application/id3");
                interfaceC1980i0Track2.format(new C0249w(c0246v2));
                break;
        }
    }

    @Override // p168t2.InterfaceC2412h
    /* renamed from: f */
    public final void mo4249f(int i, long j) {
        switch (this.f8562a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f8563b = true;
                    this.f8564c = j;
                    this.f8566e = 0;
                    this.f8565d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f8563b = true;
                    this.f8564c = j;
                    this.f8565d = 0;
                    this.f8566e = 0;
                    break;
                }
                break;
        }
    }

    public C2410g() {
        this.f8562a = 1;
        this.f8567f = new C1132w(10);
        this.f8564c = -9223372036854775807L;
    }
}
