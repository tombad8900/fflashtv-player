package p141q1;

import p063h1.C1132w;
import p115n1.C1964a0;
import p115n1.C1972e0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q1.a */
/* loaded from: classes.dex */
public final class C2251a implements InterfaceC1987n {

    /* renamed from: a */
    public final /* synthetic */ int f7805a;

    /* renamed from: b */
    public final C1132w f7806b;

    /* renamed from: c */
    public final C1972e0 f7807c;

    public C2251a(int i) {
        this.f7805a = i;
        switch (i) {
            case 1:
                this.f7806b = new C1132w(4);
                this.f7807c = new C1972e0("image/heif", -1, -1);
                break;
            case 2:
                this.f7806b = new C1132w(4);
                this.f7807c = new C1972e0("image/webp", -1, -1);
                break;
            default:
                this.f7806b = new C1132w(4);
                this.f7807c = new C1972e0("image/avif", -1, -1);
                break;
        }
    }

    /* renamed from: a */
    private final void m4025a() {
    }

    /* renamed from: b */
    private final void m4026b() {
    }

    /* renamed from: c */
    private final void m4027c() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        switch (this.f7805a) {
            case 0:
                this.f7807c.init(interfaceC1989p);
                break;
            case 1:
                this.f7807c.init(interfaceC1989p);
                break;
            default:
                this.f7807c.init(interfaceC1989p);
                break;
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) {
        switch (this.f7805a) {
        }
        return this.f7807c.read(interfaceC1988o, c1964a0);
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
        int i = this.f7805a;
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        switch (this.f7805a) {
            case 0:
                this.f7807c.seek(j, j8);
                break;
            case 1:
                this.f7807c.seek(j, j8);
                break;
            default:
                this.f7807c.seek(j, j8);
                break;
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        switch (this.f7805a) {
            case 0:
                interfaceC1988o.mo3857d(4);
                C1132w c1132w = this.f7806b;
                c1132w.m2510D(4);
                interfaceC1988o.mo3862i(c1132w.f4799a, 0, 4);
                if (c1132w.m2537w() == 1718909296) {
                    c1132w.m2510D(4);
                    interfaceC1988o.mo3862i(c1132w.f4799a, 0, 4);
                    if (c1132w.m2537w() == 1635150182) {
                    }
                }
                break;
            case 1:
                interfaceC1988o.mo3857d(4);
                C1132w c1132w2 = this.f7806b;
                c1132w2.m2510D(4);
                interfaceC1988o.mo3862i(c1132w2.f4799a, 0, 4);
                if (c1132w2.m2537w() == 1718909296) {
                    c1132w2.m2510D(4);
                    interfaceC1988o.mo3862i(c1132w2.f4799a, 0, 4);
                    if (c1132w2.m2537w() == 1751476579) {
                    }
                }
                break;
            default:
                C1132w c1132w3 = this.f7806b;
                c1132w3.m2510D(4);
                interfaceC1988o.mo3862i(c1132w3.f4799a, 0, 4);
                if (c1132w3.m2537w() == 1380533830) {
                    interfaceC1988o.mo3857d(4);
                    c1132w3.m2510D(4);
                    interfaceC1988o.mo3862i(c1132w3.f4799a, 0, 4);
                    if (c1132w3.m2537w() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }
}
