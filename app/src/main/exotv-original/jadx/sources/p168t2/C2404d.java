package p168t2;

import p063h1.AbstractC1101a;
import p063h1.C1131v;
import p063h1.C1132w;
import p115n1.C1964a0;
import p115n1.C1992s;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.d */
/* loaded from: classes.dex */
public final class C2404d implements InterfaceC1987n {

    /* renamed from: c */
    public final C1132w f8488c;

    /* renamed from: d */
    public final C1131v f8489d;

    /* renamed from: e */
    public InterfaceC1989p f8490e;

    /* renamed from: f */
    public long f8491f;

    /* renamed from: h */
    public boolean f8493h;

    /* renamed from: i */
    public boolean f8494i;

    /* renamed from: a */
    public final C2406e f8486a = new C2406e(0, null, true);

    /* renamed from: b */
    public final C1132w f8487b = new C1132w(2048);

    /* renamed from: g */
    public long f8492g = -1;

    public C2404d(int i) {
        C1132w c1132w = new C1132w(10);
        this.f8488c = c1132w;
        byte[] bArr = c1132w.f4799a;
        this.f8489d = new C1131v(bArr, bArr.length);
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        this.f8490e = interfaceC1989p;
        this.f8486a.mo4248e(interfaceC1989p, new C2411g0(0, 1));
        interfaceC1989p.endTracks();
    }

    @Override // p115n1.InterfaceC1987n
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) {
        AbstractC1101a.m2360k(this.f8490e);
        interfaceC1988o.getLength();
        C1132w c1132w = this.f8487b;
        int i = interfaceC1988o.read(c1132w.f4799a, 0, 2048);
        boolean z7 = i == -1;
        if (!this.f8494i) {
            this.f8490e.seekMap(new C1992s(-9223372036854775807L));
            this.f8494i = true;
        }
        if (z7) {
            return -1;
        }
        c1132w.m2513G(0);
        c1132w.m2512F(i);
        boolean z8 = this.f8493h;
        C2406e c2406e = this.f8486a;
        if (!z8) {
            c2406e.f8521t = this.f8491f;
            this.f8493h = true;
        }
        c2406e.mo4245a(c1132w);
        return 0;
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        this.f8493h = false;
        this.f8486a.mo4246c();
        this.f8491f = j8;
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        int i = 0;
        while (true) {
            C1132w c1132w = this.f8488c;
            interfaceC1988o.mo3862i(c1132w.f4799a, 0, 10);
            c1132w.m2513G(0);
            if (c1132w.m2538x() != 4801587) {
                break;
            }
            c1132w.m2514H(3);
            int iM2534t = c1132w.m2534t();
            i += iM2534t + 10;
            interfaceC1988o.mo3857d(iM2534t);
        }
        interfaceC1988o.mo3860g();
        interfaceC1988o.mo3857d(i);
        if (this.f8492g == -1) {
            this.f8492g = i;
        }
        int i4 = i;
        int i8 = 0;
        int i9 = 0;
        do {
            C1132w c1132w2 = this.f8488c;
            interfaceC1988o.mo3862i(c1132w2.f4799a, 0, 2);
            c1132w2.m2513G(0);
            if ((c1132w2.m2507A() & 65526) == 65520) {
                i8++;
                if (i8 >= 4 && i9 > 188) {
                    return true;
                }
                interfaceC1988o.mo3862i(c1132w2.f4799a, 0, 4);
                C1131v c1131v = this.f8489d;
                c1131v.m2502s(14);
                int iM2494k = c1131v.m2494k(13);
                if (iM2494k <= 6) {
                    i4++;
                    interfaceC1988o.mo3860g();
                    interfaceC1988o.mo3857d(i4);
                } else {
                    interfaceC1988o.mo3857d(iM2494k - 6);
                    i9 += iM2494k;
                }
            } else {
                i4++;
                interfaceC1988o.mo3860g();
                interfaceC1988o.mo3857d(i4);
            }
            i8 = 0;
            i9 = 0;
        } while (i4 - i < 8192);
        return false;
    }
}
