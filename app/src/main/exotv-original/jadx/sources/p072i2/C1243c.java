package p072i2;

import androidx.media3.common.C0249w;
import java.util.Arrays;
import p002a1.C0016e;
import p063h1.C1132w;
import p064h2.C1137b;
import p115n1.AbstractC1965b;
import p115n1.C1993t;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i2.c */
/* loaded from: classes.dex */
public final class C1243c extends AbstractC1249i {

    /* renamed from: n */
    public C1993t f5195n;

    /* renamed from: o */
    public C1137b f5196o;

    @Override // p072i2.AbstractC1249i
    /* renamed from: b */
    public final long mo2714b(C1132w c1132w) {
        byte[] bArr = c1132w.f4799a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c1132w.m2514H(4);
            c1132w.m2508B();
        }
        int iM3844t = AbstractC1965b.m3844t(c1132w, i);
        c1132w.m2513G(0);
        return iM3844t;
    }

    @Override // p072i2.AbstractC1249i
    /* renamed from: c */
    public final boolean mo2715c(C1132w c1132w, long j, C0016e c0016e) {
        byte[] bArr = c1132w.f4799a;
        C1993t c1993t = this.f5195n;
        if (c1993t == null) {
            C1993t c1993t2 = new C1993t(bArr, 17);
            this.f5195n = c1993t2;
            c0016e.f62k = c1993t2.m3875c(Arrays.copyOfRange(bArr, 9, c1132w.f4801c), null);
            return true;
        }
        byte b7 = bArr[0];
        if ((b7 & Byte.MAX_VALUE) != 3) {
            if (b7 != -1) {
                return true;
            }
            C1137b c1137b = this.f5196o;
            if (c1137b != null) {
                c1137b.f4814j = j;
                c0016e.f63l = c1137b;
            }
            ((C0249w) c0016e.f62k).getClass();
            return false;
        }
        C0016e c0016eM3845u = AbstractC1965b.m3845u(c1132w);
        C1993t c1993t3 = new C1993t(c1993t.f7378a, c1993t.f7379b, c1993t.f7380c, c1993t.f7381d, c1993t.f7382e, c1993t.f7384g, c1993t.f7385h, c1993t.f7387j, c0016eM3845u, c1993t.f7389l);
        this.f5195n = c1993t3;
        C1137b c1137b2 = new C1137b();
        c1137b2.f4816l = c1993t3;
        c1137b2.f4817m = c0016eM3845u;
        c1137b2.f4814j = -1L;
        c1137b2.f4815k = -1L;
        this.f5196o = c1137b2;
        return true;
    }

    @Override // p072i2.AbstractC1249i
    /* renamed from: d */
    public final void mo2716d(boolean z7) {
        super.mo2716d(z7);
        if (z7) {
            this.f5195n = null;
            this.f5196o = null;
        }
    }
}
