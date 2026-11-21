package p081j2;

import p115n1.C1964a0;
import p115n1.C1972e0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;
import p184v1.C2526a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j2.a */
/* loaded from: classes.dex */
public final class C1487a implements InterfaceC1987n {

    /* renamed from: a */
    public final /* synthetic */ int f5719a;

    /* renamed from: b */
    public final InterfaceC1987n f5720b;

    public C1487a(byte b7, int i) {
        this.f5719a = i;
        switch (i) {
            case 1:
                this.f5720b = new C1972e0("image/bmp", 16973, 2);
                break;
            default:
                this.f5720b = new C1972e0("image/png", 35152, 2);
                break;
        }
    }

    /* renamed from: a */
    private final void m3148a() {
    }

    /* renamed from: b */
    private final void m3149b() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        switch (this.f5719a) {
            case 0:
                ((C1972e0) this.f5720b).init(interfaceC1989p);
                break;
            case 1:
                ((C1972e0) this.f5720b).init(interfaceC1989p);
                break;
            default:
                this.f5720b.init(interfaceC1989p);
                break;
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) {
        switch (this.f5719a) {
            case 0:
                return ((C1972e0) this.f5720b).read(interfaceC1988o, c1964a0);
            case 1:
                return ((C1972e0) this.f5720b).read(interfaceC1988o, c1964a0);
            default:
                return this.f5720b.read(interfaceC1988o, c1964a0);
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
        switch (this.f5719a) {
            case 0:
            case 1:
                break;
            default:
                this.f5720b.release();
                break;
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        switch (this.f5719a) {
            case 0:
                ((C1972e0) this.f5720b).seek(j, j8);
                break;
            case 1:
                ((C1972e0) this.f5720b).seek(j, j8);
                break;
            default:
                this.f5720b.seek(j, j8);
                break;
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        switch (this.f5719a) {
            case 0:
                return ((C1972e0) this.f5720b).sniff(interfaceC1988o);
            case 1:
                return ((C1972e0) this.f5720b).sniff(interfaceC1988o);
            default:
                return this.f5720b.sniff(interfaceC1988o);
        }
    }

    public C1487a(int i) {
        this.f5719a = 2;
        if ((i & 1) != 0) {
            this.f5720b = new C1972e0("image/jpeg", 65496, 2);
        } else {
            this.f5720b = new C2526a();
        }
    }
}
