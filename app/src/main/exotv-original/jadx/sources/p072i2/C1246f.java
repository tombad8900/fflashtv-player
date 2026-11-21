package p072i2;

import androidx.media3.common.C0247v0;
import java.io.EOFException;
import p063h1.AbstractC1101a;
import p063h1.C1132w;
import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i2.f */
/* loaded from: classes.dex */
public final class C1246f {

    /* renamed from: a */
    public int f5205a;

    /* renamed from: b */
    public long f5206b;

    /* renamed from: c */
    public int f5207c;

    /* renamed from: d */
    public int f5208d;

    /* renamed from: e */
    public int f5209e;

    /* renamed from: f */
    public final int[] f5210f = new int[255];

    /* renamed from: g */
    public final C1132w f5211g = new C1132w(255);

    /* renamed from: a */
    public final boolean m2720a(InterfaceC1988o interfaceC1988o, boolean z7) throws EOFException, C0247v0 {
        boolean zMo3855b;
        boolean zMo3855b2;
        this.f5205a = 0;
        this.f5206b = 0L;
        this.f5207c = 0;
        this.f5208d = 0;
        this.f5209e = 0;
        C1132w c1132w = this.f5211g;
        c1132w.m2510D(27);
        try {
            zMo3855b = interfaceC1988o.mo3855b(c1132w.f4799a, 0, 27, z7);
        } catch (EOFException e) {
            if (!z7) {
                throw e;
            }
            zMo3855b = false;
        }
        if (zMo3855b && c1132w.m2537w() == 1332176723) {
            if (c1132w.m2535u() == 0) {
                this.f5205a = c1132w.m2535u();
                this.f5206b = c1132w.m2524j();
                c1132w.m2526l();
                c1132w.m2526l();
                c1132w.m2526l();
                int iM2535u = c1132w.m2535u();
                this.f5207c = iM2535u;
                this.f5208d = iM2535u + 27;
                c1132w.m2510D(iM2535u);
                try {
                    zMo3855b2 = interfaceC1988o.mo3855b(c1132w.f4799a, 0, this.f5207c, z7);
                } catch (EOFException e8) {
                    if (!z7) {
                        throw e8;
                    }
                    zMo3855b2 = false;
                }
                if (zMo3855b2) {
                    for (int i = 0; i < this.f5207c; i++) {
                        int iM2535u2 = c1132w.m2535u();
                        this.f5210f[i] = iM2535u2;
                        this.f5209e += iM2535u2;
                    }
                    return true;
                }
            } else if (!z7) {
                throw C0247v0.createForUnsupportedContainerFeature("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r10.getPosition() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r10.mo3858e(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        return false;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2721b(InterfaceC1988o interfaceC1988o, long j) {
        boolean zMo3855b;
        AbstractC1101a.m2353d(interfaceC1988o.getPosition() == interfaceC1988o.mo3856c());
        C1132w c1132w = this.f5211g;
        c1132w.m2510D(4);
        while (true) {
            if (j != -1 && interfaceC1988o.getPosition() + 4 >= j) {
                break;
            }
            try {
                zMo3855b = interfaceC1988o.mo3855b(c1132w.f4799a, 0, 4, true);
            } catch (EOFException unused) {
                zMo3855b = false;
            }
            if (!zMo3855b) {
                break;
            }
            c1132w.m2513G(0);
            if (c1132w.m2537w() == 1332176723) {
                interfaceC1988o.mo3860g();
                return true;
            }
            interfaceC1988o.mo3861h(1);
        }
    }
}
