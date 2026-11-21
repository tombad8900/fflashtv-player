package p158s1;

import p063h1.AbstractC1101a;
import p115n1.C1964a0;
import p115n1.C1971e;
import p115n1.C1973f;
import p115n1.C1977h;
import p115n1.InterfaceC1975g;
import p115n1.InterfaceC1979i;
import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s1.b */
/* loaded from: classes.dex */
public final class C2339b {

    /* renamed from: a */
    public final C1971e f8193a;

    /* renamed from: b */
    public final InterfaceC1979i f8194b;

    /* renamed from: c */
    public C1973f f8195c;

    /* renamed from: d */
    public final int f8196d;

    public C2339b(InterfaceC1975g interfaceC1975g, InterfaceC1979i interfaceC1979i, long j, long j8, long j9, long j10, long j11, int i) {
        this.f8194b = interfaceC1979i;
        this.f8196d = i;
        this.f8193a = new C1971e(interfaceC1975g, j, j8, j9, j10, j11);
    }

    /* renamed from: a */
    public static int m4169a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: c */
    public static int m4170c(InterfaceC1988o interfaceC1988o, long j, C1964a0 c1964a0) {
        if (j == interfaceC1988o.getPosition()) {
            return 0;
        }
        c1964a0.f7264a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
    
        return m4170c(r28, r8, r29);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m4171b(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) {
        while (true) {
            C1973f c1973f = this.f8195c;
            AbstractC1101a.m2360k(c1973f);
            long j = c1973f.f7331f;
            long j8 = c1973f.f7332g;
            long j9 = c1973f.f7333h;
            long j10 = j8 - j;
            long j11 = this.f8196d;
            InterfaceC1979i interfaceC1979i = this.f8194b;
            if (j10 <= j11) {
                this.f8195c = null;
                interfaceC1979i.mo352i();
                return m4170c(interfaceC1988o, j, c1964a0);
            }
            long position = j9 - interfaceC1988o.getPosition();
            if (position < 0 || position > 262144) {
                break;
            }
            interfaceC1988o.mo3861h((int) position);
            interfaceC1988o.mo3860g();
            C1977h c1977hMo348c = interfaceC1979i.mo348c(interfaceC1988o, c1973f.f7327b);
            int i = c1977hMo348c.f7335a;
            long j12 = c1977hMo348c.f7336b;
            long j13 = c1977hMo348c.f7337c;
            if (i == -3) {
                this.f8195c = null;
                interfaceC1979i.mo352i();
                return m4170c(interfaceC1988o, j9, c1964a0);
            }
            if (i == -2) {
                c1973f.f7329d = j12;
                c1973f.f7331f = j13;
                c1973f.f7333h = C1973f.m3850a(c1973f.f7327b, j12, c1973f.f7330e, j13, c1973f.f7332g, c1973f.f7328c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j13 - interfaceC1988o.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        interfaceC1988o.mo3861h((int) position2);
                    }
                    this.f8195c = null;
                    interfaceC1979i.mo352i();
                    return m4170c(interfaceC1988o, j13, c1964a0);
                }
                c1973f.f7330e = j12;
                c1973f.f7332g = j13;
                c1973f.f7333h = C1973f.m3850a(c1973f.f7327b, c1973f.f7329d, j12, c1973f.f7331f, j13, c1973f.f7328c);
            }
        }
    }

    /* renamed from: d */
    public final void m4172d(long j) {
        C1973f c1973f = this.f8195c;
        if (c1973f == null || c1973f.f7326a != j) {
            C1971e c1971e = this.f8193a;
            this.f8195c = new C1973f(j, c1971e.f7313a.mo998d(j), c1971e.f7315c, c1971e.f7316d, c1971e.f7317e, c1971e.f7318f);
        }
    }
}
