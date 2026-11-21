package p072i2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import java.util.ArrayList;
import java.util.Arrays;
import p002a1.C0016e;
import p052f6.AbstractC0983m0;
import p063h1.AbstractC1101a;
import p063h1.C1132w;
import p115n1.AbstractC1965b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i2.h */
/* loaded from: classes.dex */
public final class C1248h extends AbstractC1249i {

    /* renamed from: o */
    public static final byte[] f5212o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    public static final byte[] f5213p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    public boolean f5214n;

    /* renamed from: e */
    public static boolean m2722e(C1132w c1132w, byte[] bArr) {
        if (c1132w.m2515a() < bArr.length) {
            return false;
        }
        int i = c1132w.f4800b;
        byte[] bArr2 = new byte[bArr.length];
        c1132w.m2519e(bArr2, 0, bArr.length);
        c1132w.m2513G(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p072i2.AbstractC1249i
    /* renamed from: b */
    public final long mo2714b(C1132w c1132w) {
        byte[] bArr = c1132w.f4799a;
        return (this.f5223i * AbstractC1965b.m3835k(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // p072i2.AbstractC1249i
    /* renamed from: c */
    public final boolean mo2715c(C1132w c1132w, long j, C0016e c0016e) {
        if (m2722e(c1132w, f5212o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c1132w.f4799a, c1132w.f4801c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListM3826b = AbstractC1965b.m3826b(bArrCopyOf);
            if (((C0249w) c0016e.f62k) == null) {
                C0246v c0246v = new C0246v();
                c0246v.f1447m = AbstractC0244u0.m687p("audio/opus");
                c0246v.f1425B = i;
                c0246v.f1426C = 48000;
                c0246v.f1450p = arrayListM3826b;
                c0016e.f62k = new C0249w(c0246v);
                return true;
            }
        } else {
            if (!m2722e(c1132w, f5213p)) {
                AbstractC1101a.m2360k((C0249w) c0016e.f62k);
                return false;
            }
            AbstractC1101a.m2360k((C0249w) c0016e.f62k);
            if (!this.f5214n) {
                this.f5214n = true;
                c1132w.m2514H(8);
                C0241t0 c0241t0M3842r = AbstractC1965b.m3842r(AbstractC0983m0.m2166k((String[]) AbstractC1965b.m3846v(c1132w, false, false).f6229j));
                if (c0241t0M3842r != null) {
                    C0246v c0246vM692a = ((C0249w) c0016e.f62k).m692a();
                    c0246vM692a.f1445k = c0241t0M3842r.m669b(((C0249w) c0016e.f62k).f1520l);
                    c0016e.f62k = new C0249w(c0246vM692a);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // p072i2.AbstractC1249i
    /* renamed from: d */
    public final void mo2716d(boolean z7) {
        super.mo2716d(z7);
        if (z7) {
            this.f5214n = false;
        }
    }
}
