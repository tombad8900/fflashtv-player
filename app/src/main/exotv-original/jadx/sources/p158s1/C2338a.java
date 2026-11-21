package p158s1;

import p063h1.C1132w;
import p115n1.AbstractC1965b;
import p115n1.C1977h;
import p115n1.C1991r;
import p115n1.C1993t;
import p115n1.InterfaceC1979i;
import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s1.a */
/* loaded from: classes.dex */
public final class C2338a implements InterfaceC1979i {

    /* renamed from: j */
    public final C1993t f8190j;

    /* renamed from: k */
    public final int f8191k;

    /* renamed from: l */
    public final C1991r f8192l = new C1991r();

    public C2338a(C1993t c1993t, int i) {
        this.f8190j = c1993t;
        this.f8191k = i;
    }

    /* renamed from: a */
    public final long m4168a(InterfaceC1988o interfaceC1988o) {
        C1991r c1991r;
        C1993t c1993t;
        int iMo3859f;
        while (true) {
            long jMo3856c = interfaceC1988o.mo3856c();
            long length = interfaceC1988o.getLength() - 6;
            c1991r = this.f8192l;
            c1993t = this.f8190j;
            if (jMo3856c >= length) {
                break;
            }
            long jMo3856c2 = interfaceC1988o.mo3856c();
            byte[] bArr = new byte[2];
            int i = 0;
            boolean zM3827c = false;
            interfaceC1988o.mo3862i(bArr, 0, 2);
            int i4 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i8 = this.f8191k;
            if (i4 != i8) {
                interfaceC1988o.mo3860g();
                interfaceC1988o.mo3857d((int) (jMo3856c2 - interfaceC1988o.getPosition()));
            } else {
                C1132w c1132w = new C1132w(16);
                System.arraycopy(bArr, 0, c1132w.f4799a, 0, 2);
                byte[] bArr2 = c1132w.f4799a;
                while (i < 14 && (iMo3859f = interfaceC1988o.mo3859f(bArr2, 2 + i, 14 - i)) != -1) {
                    i += iMo3859f;
                }
                c1132w.m2512F(i);
                interfaceC1988o.mo3860g();
                interfaceC1988o.mo3857d((int) (jMo3856c2 - interfaceC1988o.getPosition()));
                zM3827c = AbstractC1965b.m3827c(c1132w, c1993t, i8, c1991r);
            }
            if (zM3827c) {
                break;
            }
            interfaceC1988o.mo3857d(1);
        }
        if (interfaceC1988o.mo3856c() < interfaceC1988o.getLength() - 6) {
            return c1991r.f7374a;
        }
        interfaceC1988o.mo3857d((int) (interfaceC1988o.getLength() - interfaceC1988o.mo3856c()));
        return c1993t.f7387j;
    }

    @Override // p115n1.InterfaceC1979i
    /* renamed from: c */
    public final C1977h mo348c(InterfaceC1988o interfaceC1988o, long j) {
        long position = interfaceC1988o.getPosition();
        long jM4168a = m4168a(interfaceC1988o);
        long jMo3856c = interfaceC1988o.mo3856c();
        interfaceC1988o.mo3857d(Math.max(6, this.f8190j.f7380c));
        long jM4168a2 = m4168a(interfaceC1988o);
        return (jM4168a > j || jM4168a2 <= j) ? jM4168a2 <= j ? new C1977h(-2, jM4168a2, interfaceC1988o.mo3856c()) : new C1977h(-1, jM4168a, position) : new C1977h(0, -9223372036854775807L, jMo3856c);
    }
}
