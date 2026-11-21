package p168t2;

import p063h1.C1132w;
import p115n1.AbstractC1965b;
import p115n1.C1964a0;
import p115n1.C1992s;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.a */
/* loaded from: classes.dex */
public final class C2398a implements InterfaceC1987n {

    /* renamed from: a */
    public final C2400b f8448a = new C2400b();

    /* renamed from: b */
    public final C1132w f8449b = new C1132w(2786);

    /* renamed from: c */
    public boolean f8450c;

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        this.f8448a.mo4248e(interfaceC1989p, new C2411g0(0, 1));
        interfaceC1989p.endTracks();
        interfaceC1989p.seekMap(new C1992s(-9223372036854775807L));
    }

    @Override // p115n1.InterfaceC1987n
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) {
        C1132w c1132w = this.f8449b;
        int i = interfaceC1988o.read(c1132w.f4799a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        c1132w.m2513G(0);
        c1132w.m2512F(i);
        boolean z7 = this.f8450c;
        C2400b c2400b = this.f8448a;
        if (!z7) {
            c2400b.f8471n = 0L;
            this.f8450c = true;
        }
        c2400b.mo4245a(c1132w);
        return 0;
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        this.f8450c = false;
        this.f8448a.mo4246c();
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        int iM3831g;
        C1132w c1132w = new C1132w(10);
        int i = 0;
        while (true) {
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
        int i4 = 0;
        int i8 = i;
        while (true) {
            interfaceC1988o.mo3862i(c1132w.f4799a, 0, 6);
            c1132w.m2513G(0);
            if (c1132w.m2507A() != 2935) {
                interfaceC1988o.mo3860g();
                i8++;
                if (i8 - i >= 8192) {
                    break;
                }
                interfaceC1988o.mo3857d(i8);
                i4 = 0;
            } else {
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] bArr = c1132w.f4799a;
                if (bArr.length < 6) {
                    iM3831g = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iM3831g = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b7 = bArr[4];
                    iM3831g = AbstractC1965b.m3831g((b7 & 192) >> 6, b7 & 63);
                }
                if (iM3831g == -1) {
                    break;
                }
                interfaceC1988o.mo3857d(iM3831g - 6);
            }
        }
        return false;
    }
}
