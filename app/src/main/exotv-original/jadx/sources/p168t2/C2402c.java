package p168t2;

import p063h1.C1132w;
import p115n1.C1964a0;
import p115n1.C1992s;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.c */
/* loaded from: classes.dex */
public final class C2402c implements InterfaceC1987n {

    /* renamed from: a */
    public final C2400b f8483a = new C2400b(null, 0, 1);

    /* renamed from: b */
    public final C1132w f8484b = new C1132w(16384);

    /* renamed from: c */
    public boolean f8485c;

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        this.f8483a.mo4248e(interfaceC1989p, new C2411g0(0, 1));
        interfaceC1989p.endTracks();
        interfaceC1989p.seekMap(new C1992s(-9223372036854775807L));
    }

    @Override // p115n1.InterfaceC1987n
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) {
        C1132w c1132w = this.f8484b;
        int i = interfaceC1988o.read(c1132w.f4799a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        c1132w.m2513G(0);
        c1132w.m2512F(i);
        boolean z7 = this.f8485c;
        C2400b c2400b = this.f8483a;
        if (!z7) {
            c2400b.f8471n = 0L;
            this.f8485c = true;
        }
        c2400b.mo4245a(c1132w);
        return 0;
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        this.f8485c = false;
        this.f8483a.mo4246c();
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        int i;
        C1132w c1132w = new C1132w(10);
        int i4 = 0;
        while (true) {
            interfaceC1988o.mo3862i(c1132w.f4799a, 0, 10);
            c1132w.m2513G(0);
            if (c1132w.m2538x() != 4801587) {
                break;
            }
            c1132w.m2514H(3);
            int iM2534t = c1132w.m2534t();
            i4 += iM2534t + 10;
            interfaceC1988o.mo3857d(iM2534t);
        }
        interfaceC1988o.mo3860g();
        interfaceC1988o.mo3857d(i4);
        int i8 = 0;
        int i9 = i4;
        while (true) {
            int i10 = 7;
            interfaceC1988o.mo3862i(c1132w.f4799a, 0, 7);
            c1132w.m2513G(0);
            int iM2507A = c1132w.m2507A();
            if (iM2507A == 44096 || iM2507A == 44097) {
                i8++;
                if (i8 >= 4) {
                    return true;
                }
                byte[] bArr = c1132w.f4799a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i11 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i11 == 65535) {
                        i11 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i10 = 4;
                    }
                    if (iM2507A == 44097) {
                        i10 += 2;
                    }
                    i = i11 + i10;
                }
                if (i == -1) {
                    break;
                }
                interfaceC1988o.mo3857d(i - 7);
            } else {
                interfaceC1988o.mo3860g();
                i9++;
                if (i9 - i4 >= 8192) {
                    break;
                }
                interfaceC1988o.mo3857d(i9);
                i8 = 0;
            }
        }
        return false;
    }
}
