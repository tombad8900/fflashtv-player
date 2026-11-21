package p031d2;

import androidx.media3.common.C0241t0;
import androidx.media3.common.InterfaceC0238s0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p063h1.C1108d0;
import p063h1.C1131v;
import p063h1.C1132w;
import p171t5.AbstractC2436a;
import p192w1.C2600b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d2.c */
/* loaded from: classes.dex */
public final class C0801c extends AbstractC2436a {

    /* renamed from: a */
    public final C1132w f3586a = new C1132w();

    /* renamed from: b */
    public final C1131v f3587b = new C1131v(0);

    /* renamed from: c */
    public C1108d0 f3588c;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    @Override // p171t5.AbstractC2436a
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0241t0 mo247d(C2600b c2600b, ByteBuffer byteBuffer) {
        int i;
        InterfaceC0238s0 c0804f;
        long j;
        long j8;
        long j9;
        boolean z7;
        boolean z8;
        boolean z9;
        int iM2507A;
        int iM2535u;
        int iM2535u2;
        long jM2537w;
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i4;
        int i8;
        int iM2535u3;
        char c8;
        long j12;
        boolean z15;
        long j13;
        C1132w c1132w = this.f3586a;
        C1131v c1131v = this.f3587b;
        C1108d0 c1108d0 = this.f3588c;
        if (c1108d0 != null) {
            long j14 = c2600b.f9349j;
            synchronized (c1108d0) {
                j13 = c1108d0.f4728b;
            }
            if (j14 != j13) {
                C1108d0 c1108d02 = new C1108d0(c2600b.timeUs);
                this.f3588c = c1108d02;
                c1108d02.m2396a(c2600b.timeUs - c2600b.f9349j);
            }
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        c1132w.m2511E(bArrArray, iLimit);
        c1131v.m2501r(bArrArray, iLimit);
        c1131v.m2505v(39);
        boolean z16 = true;
        long jM2494k = (c1131v.m2494k(1) << 32) | c1131v.m2494k(32);
        c1131v.m2505v(20);
        int iM2494k = c1131v.m2494k(12);
        int iM2494k2 = c1131v.m2494k(8);
        c1132w.m2514H(14);
        if (iM2494k2 == 0) {
            i = 0;
            c0804f = new C0804f();
        } else if (iM2494k2 != 255) {
            long j15 = 1;
            long jM2537w2 = -9223372036854775807L;
            if (iM2494k2 == 4) {
                int iM2535u4 = c1132w.m2535u();
                ArrayList arrayList = new ArrayList(iM2535u4);
                int i9 = 0;
                while (i9 < iM2535u4) {
                    long jM2537w3 = c1132w.m2537w();
                    boolean z17 = (c1132w.m2535u() & 128) != 0 ? z16 : false;
                    ArrayList arrayList2 = new ArrayList();
                    if (z17) {
                        j = j15;
                        j8 = -9223372036854775807L;
                        j9 = -9223372036854775807L;
                        z7 = false;
                        z8 = false;
                        z9 = false;
                        iM2507A = 0;
                        iM2535u = 0;
                        iM2535u2 = 0;
                    } else {
                        int iM2535u5 = c1132w.m2535u();
                        boolean z18 = (iM2535u5 & 128) != 0 ? z16 : false;
                        boolean z19 = (iM2535u5 & 64) != 0 ? z16 : false;
                        boolean z20 = (iM2535u5 & 32) != 0 ? z16 : false;
                        long jM2537w4 = z19 ? c1132w.m2537w() : -9223372036854775807L;
                        if (!z19) {
                            int iM2535u6 = c1132w.m2535u();
                            ArrayList arrayList3 = new ArrayList(iM2535u6);
                            int i10 = 0;
                            while (i10 < iM2535u6) {
                                arrayList3.add(new C0805g(c1132w.m2535u(), c1132w.m2537w()));
                                i10++;
                                j15 = j15;
                            }
                            arrayList2 = arrayList3;
                        }
                        j = j15;
                        if (z20) {
                            long jM2535u = c1132w.m2535u();
                            z10 = (jM2535u & 128) != 0;
                            jM2537w = ((((jM2535u & j) << 32) | c1132w.m2537w()) * 1000) / 90;
                        } else {
                            jM2537w = -9223372036854775807L;
                            z10 = false;
                        }
                        j9 = jM2537w;
                        z9 = z10;
                        iM2507A = c1132w.m2507A();
                        z7 = z18;
                        z8 = z19;
                        j8 = jM2537w4;
                        iM2535u = c1132w.m2535u();
                        iM2535u2 = c1132w.m2535u();
                    }
                    arrayList.add(new C0806h(jM2537w3, z17, z7, z8, arrayList2, j8, z9, j9, iM2507A, iM2535u, iM2535u2));
                    i9++;
                    j15 = j;
                    z16 = true;
                }
                c0804f = new C0807i(arrayList);
            } else if (iM2494k2 == 5) {
                C1108d0 c1108d03 = this.f3588c;
                long jM2537w5 = c1132w.m2537w();
                boolean z21 = (c1132w.m2535u() & 128) != 0;
                List list = Collections.EMPTY_LIST;
                if (z21) {
                    j10 = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                    z11 = false;
                    z12 = false;
                    z13 = false;
                    z14 = false;
                    i4 = 0;
                    i8 = 0;
                    iM2535u3 = 0;
                } else {
                    int iM2535u7 = c1132w.m2535u();
                    boolean z22 = (iM2535u7 & 128) != 0;
                    boolean z23 = (iM2535u7 & 64) != 0;
                    boolean z24 = (iM2535u7 & 32) != 0;
                    boolean z25 = (iM2535u7 & 16) != 0;
                    long jM1948a = (!z23 || z25) ? -9223372036854775807L : C0808j.m1948a(jM2494k, c1132w);
                    if (z23) {
                        c8 = ' ';
                        j12 = 90;
                    } else {
                        int iM2535u8 = c1132w.m2535u();
                        c8 = ' ';
                        ArrayList arrayList4 = new ArrayList(iM2535u8);
                        j12 = 90;
                        for (int i11 = 0; i11 < iM2535u8; i11++) {
                            int iM2535u9 = c1132w.m2535u();
                            long jM1948a2 = !z25 ? C0808j.m1948a(jM2494k, c1132w) : -9223372036854775807L;
                            arrayList4.add(new C0802d(iM2535u9, jM1948a2, c1108d03.m2397b(jM1948a2)));
                        }
                        list = arrayList4;
                    }
                    if (z24) {
                        long jM2535u2 = c1132w.m2535u();
                        z15 = (jM2535u2 & 128) != 0;
                        jM2537w2 = ((((jM2535u2 & 1) << c8) | c1132w.m2537w()) * 1000) / j12;
                    } else {
                        z15 = false;
                    }
                    int iM2507A2 = c1132w.m2507A();
                    int iM2535u10 = c1132w.m2535u();
                    iM2535u3 = c1132w.m2535u();
                    z14 = z15;
                    z11 = z22;
                    i4 = iM2507A2;
                    i8 = iM2535u10;
                    j11 = jM2537w2;
                    long j16 = jM1948a;
                    z13 = z25;
                    z12 = z23;
                    j10 = j16;
                }
                c0804f = new C0803e(jM2537w5, z21, z11, z12, z13, j10, c1108d03.m2397b(j10), list, z14, j11, i4, i8, iM2535u3);
            } else if (iM2494k2 != 6) {
                c0804f = null;
            } else {
                C1108d0 c1108d04 = this.f3588c;
                long jM1948a3 = C0808j.m1948a(jM2494k, c1132w);
                c0804f = new C0808j(jM1948a3, c1108d04.m2397b(jM1948a3));
            }
            i = 0;
        } else {
            long jM2537w6 = c1132w.m2537w();
            int i12 = iM2494k - 4;
            byte[] bArr = new byte[i12];
            i = 0;
            c1132w.m2519e(bArr, 0, i12);
            c0804f = new C0799a(jM2537w6, bArr, jM2494k);
        }
        if (c0804f == null) {
            return new C0241t0(new InterfaceC0238s0[i]);
        }
        InterfaceC0238s0[] interfaceC0238s0Arr = new InterfaceC0238s0[1];
        interfaceC0238s0Arr[i] = c0804f;
        return new C0241t0(interfaceC0238s0Arr);
    }
}
