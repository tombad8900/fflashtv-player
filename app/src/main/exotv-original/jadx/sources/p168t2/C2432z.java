package p168t2;

import p063h1.AbstractC1118i0;
import p063h1.C1108d0;
import p063h1.C1132w;
import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.z */
/* loaded from: classes.dex */
public final class C2432z {

    /* renamed from: a */
    public final /* synthetic */ int f8776a;

    /* renamed from: b */
    public final C1108d0 f8777b;

    /* renamed from: c */
    public final C1132w f8778c;

    /* renamed from: d */
    public boolean f8779d;

    /* renamed from: e */
    public boolean f8780e;

    /* renamed from: f */
    public boolean f8781f;

    /* renamed from: g */
    public long f8782g;

    /* renamed from: h */
    public long f8783h;

    /* renamed from: i */
    public long f8784i;

    public C2432z(int i) {
        this.f8776a = i;
        switch (i) {
            case 1:
                this.f8777b = new C1108d0(0L);
                this.f8782g = -9223372036854775807L;
                this.f8783h = -9223372036854775807L;
                this.f8784i = -9223372036854775807L;
                this.f8778c = new C1132w();
                break;
            default:
                this.f8777b = new C1108d0(0L);
                this.f8782g = -9223372036854775807L;
                this.f8783h = -9223372036854775807L;
                this.f8784i = -9223372036854775807L;
                this.f8778c = new C1132w();
                break;
        }
    }

    /* renamed from: b */
    public static int m4324b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: c */
    public static long m4325c(C1132w c1132w) {
        int i = c1132w.f4800b;
        if (c1132w.m2515a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c1132w.m2519e(bArr, 0, 9);
        c1132w.m2513G(i);
        byte b7 = bArr[0];
        if ((b7 & 196) == 68) {
            byte b8 = bArr[2];
            if ((b8 & 4) == 4) {
                byte b9 = bArr[4];
                if ((b9 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b7;
                    long j8 = b8;
                    return ((j8 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j8 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b9 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public final void m4326a(InterfaceC1988o interfaceC1988o) {
        switch (this.f8776a) {
            case 0:
                byte[] bArr = AbstractC1118i0.f4755f;
                C1132w c1132w = this.f8778c;
                c1132w.getClass();
                c1132w.m2511E(bArr, bArr.length);
                this.f8779d = true;
                interfaceC1988o.mo3860g();
                break;
            default:
                byte[] bArr2 = AbstractC1118i0.f4755f;
                C1132w c1132w2 = this.f8778c;
                c1132w2.getClass();
                c1132w2.m2511E(bArr2, bArr2.length);
                this.f8779d = true;
                interfaceC1988o.mo3860g();
                break;
        }
    }
}
