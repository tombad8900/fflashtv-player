package p072i2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import java.util.ArrayList;
import java.util.Arrays;
import p002a1.C0016e;
import p052f6.AbstractC0983m0;
import p063h1.AbstractC1101a;
import p063h1.C1131v;
import p063h1.C1132w;
import p095l.C1629o;
import p115n1.AbstractC1965b;
import p115n1.C1984k0;
import p115n1.C1999z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i2.k */
/* loaded from: classes.dex */
public final class C1251k extends AbstractC1249i {

    /* renamed from: n */
    public C1250j f5234n;

    /* renamed from: o */
    public int f5235o;

    /* renamed from: p */
    public boolean f5236p;

    /* renamed from: q */
    public C1999z f5237q;

    /* renamed from: r */
    public C1629o f5238r;

    @Override // p072i2.AbstractC1249i
    /* renamed from: a */
    public final void mo2723a(long j) {
        this.f5221g = j;
        this.f5236p = j != 0;
        C1999z c1999z = this.f5237q;
        this.f5235o = c1999z != null ? c1999z.f7413e : 0;
    }

    @Override // p072i2.AbstractC1249i
    /* renamed from: b */
    public final long mo2714b(C1132w c1132w) {
        byte b7 = c1132w.f4799a[0];
        if ((b7 & 1) == 1) {
            return -1L;
        }
        C1250j c1250j = this.f5234n;
        AbstractC1101a.m2360k(c1250j);
        int i = c1250j.f5229k;
        C1999z c1999z = (C1999z) c1250j.f5230l;
        int i4 = !((C1984k0[]) c1250j.f5233o)[(b7 >> 1) & (255 >>> (8 - i))].f7362a ? c1999z.f7413e : c1999z.f7414f;
        long j = this.f5236p ? (this.f5235o + i4) / 4 : 0;
        byte[] bArr = c1132w.f4799a;
        int length = bArr.length;
        int i8 = c1132w.f4801c + 4;
        if (length < i8) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i8);
            c1132w.m2511E(bArrCopyOf, bArrCopyOf.length);
        } else {
            c1132w.m2512F(i8);
        }
        byte[] bArr2 = c1132w.f4799a;
        int i9 = c1132w.f4801c;
        bArr2[i9 - 4] = (byte) (j & 255);
        bArr2[i9 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i9 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i9 - 1] = (byte) ((j >>> 24) & 255);
        this.f5236p = true;
        this.f5235o = i4;
        return j;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    @Override // p072i2.AbstractC1249i
    /* renamed from: c */
    public final boolean mo2715c(C1132w c1132w, long j, C0016e c0016e) throws C0247v0 {
        C1250j c1250j;
        if (this.f5234n != null) {
            ((C0249w) c0016e.f62k).getClass();
            return false;
        }
        C1999z c1999z = this.f5237q;
        int i = 4;
        if (c1999z == null) {
            AbstractC1965b.m3848x(1, c1132w, false);
            c1132w.m2527m();
            int iM2535u = c1132w.m2535u();
            int iM2527m = c1132w.m2527m();
            int iM2523i = c1132w.m2523i();
            if (iM2523i <= 0) {
                iM2523i = -1;
            }
            int iM2523i2 = c1132w.m2523i();
            int i4 = iM2523i2 > 0 ? iM2523i2 : -1;
            c1132w.m2523i();
            int iM2535u2 = c1132w.m2535u();
            int iPow = (int) Math.pow(2.0d, iM2535u2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iM2535u2 & 240) >> 4);
            c1132w.m2535u();
            ?? CopyOf = Arrays.copyOf(c1132w.f4799a, c1132w.f4801c);
            C1999z c1999z2 = new C1999z();
            c1999z2.f7409a = iM2535u;
            c1999z2.f7410b = iM2527m;
            c1999z2.f7411c = iM2523i;
            c1999z2.f7412d = i4;
            c1999z2.f7413e = iPow;
            c1999z2.f7414f = iPow2;
            c1999z2.f7415g = CopyOf;
            this.f5237q = c1999z2;
        } else {
            C1629o c1629o = this.f5238r;
            if (c1629o == null) {
                this.f5238r = AbstractC1965b.m3846v(c1132w, true, true);
            } else {
                int i8 = c1132w.f4801c;
                byte[] bArr = new byte[i8];
                System.arraycopy(c1132w.f4799a, 0, bArr, 0, i8);
                int i9 = c1999z.f7409a;
                int i10 = 5;
                AbstractC1965b.m3848x(5, c1132w, false);
                int iM2535u3 = c1132w.m2535u() + 1;
                C1131v c1131v = new C1131v(c1132w.f4799a);
                int i11 = 8;
                c1131v.m2505v(c1132w.f4800b * 8);
                int i12 = 0;
                while (true) {
                    int i13 = 16;
                    if (i12 < iM2535u3) {
                        int i14 = i11;
                        if (c1131v.m2494k(24) != 5653314) {
                            throw C0247v0.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + ((c1131v.f4794d * 8) + c1131v.f4795e), null);
                        }
                        int iM2494k = c1131v.m2494k(16);
                        int iM2494k2 = c1131v.m2494k(24);
                        if (c1131v.m2493j()) {
                            c1131v.m2505v(i10);
                            int iM2494k3 = 0;
                            while (iM2494k3 < iM2494k2) {
                                int i15 = 0;
                                for (int i16 = iM2494k2 - iM2494k3; i16 > 0; i16 >>>= 1) {
                                    i15++;
                                }
                                iM2494k3 += c1131v.m2494k(i15);
                            }
                        } else {
                            boolean zM2493j = c1131v.m2493j();
                            for (int i17 = 0; i17 < iM2494k2; i17++) {
                                if (!zM2493j) {
                                    c1131v.m2505v(i10);
                                } else if (c1131v.m2493j()) {
                                    c1131v.m2505v(i10);
                                }
                            }
                        }
                        int iM2494k4 = c1131v.m2494k(4);
                        if (iM2494k4 > 2) {
                            throw C0247v0.createForMalformedContainer("lookup type greater than 2 not decodable: " + iM2494k4, null);
                        }
                        if (iM2494k4 == 1 || iM2494k4 == 2) {
                            c1131v.m2505v(32);
                            c1131v.m2505v(32);
                            int iM2494k5 = c1131v.m2494k(4) + 1;
                            c1131v.m2505v(1);
                            c1131v.m2505v((int) ((iM2494k4 == 1 ? iM2494k != 0 ? (long) Math.floor(Math.pow(iM2494k2, 1.0d / iM2494k)) : 0L : iM2494k2 * iM2494k) * iM2494k5));
                        }
                        i12++;
                        i11 = i14;
                        i10 = 5;
                    } else {
                        int i18 = i11;
                        int i19 = 6;
                        int iM2494k6 = c1131v.m2494k(6) + 1;
                        for (int i20 = 0; i20 < iM2494k6; i20++) {
                            if (c1131v.m2494k(16) != 0) {
                                throw C0247v0.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i21 = 1;
                        int iM2494k7 = c1131v.m2494k(6) + 1;
                        int i22 = 0;
                        while (true) {
                            int i23 = 3;
                            if (i22 < iM2494k7) {
                                int iM2494k8 = c1131v.m2494k(i13);
                                if (iM2494k8 == 0) {
                                    int i24 = i18;
                                    c1131v.m2505v(i24);
                                    c1131v.m2505v(16);
                                    c1131v.m2505v(16);
                                    c1131v.m2505v(6);
                                    c1131v.m2505v(i24);
                                    int iM2494k9 = c1131v.m2494k(4) + 1;
                                    int i25 = 0;
                                    while (i25 < iM2494k9) {
                                        c1131v.m2505v(i24);
                                        i25++;
                                        i24 = 8;
                                    }
                                } else {
                                    if (iM2494k8 != i21) {
                                        throw C0247v0.createForMalformedContainer("floor type greater than 1 not decodable: " + iM2494k8, null);
                                    }
                                    int iM2494k10 = c1131v.m2494k(5);
                                    int[] iArr = new int[iM2494k10];
                                    int i26 = -1;
                                    for (int i27 = 0; i27 < iM2494k10; i27++) {
                                        int iM2494k11 = c1131v.m2494k(i);
                                        iArr[i27] = iM2494k11;
                                        if (iM2494k11 > i26) {
                                            i26 = iM2494k11;
                                        }
                                    }
                                    int i28 = i26 + 1;
                                    int[] iArr2 = new int[i28];
                                    int i29 = 0;
                                    while (i29 < i28) {
                                        iArr2[i29] = c1131v.m2494k(i23) + 1;
                                        int iM2494k12 = c1131v.m2494k(2);
                                        int i30 = i18;
                                        if (iM2494k12 > 0) {
                                            c1131v.m2505v(i30);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i31 = 0;
                                        for (int i32 = 1; i31 < (i32 << iM2494k12); i32 = 1) {
                                            c1131v.m2505v(i30);
                                            i31++;
                                            i30 = 8;
                                        }
                                        i29++;
                                        iArr2 = iArr3;
                                        i18 = 8;
                                        i23 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    c1131v.m2505v(2);
                                    int iM2494k13 = c1131v.m2494k(4);
                                    int i33 = 0;
                                    int i34 = 0;
                                    for (int i35 = 0; i35 < iM2494k10; i35++) {
                                        i33 += iArr4[iArr[i35]];
                                        while (i34 < i33) {
                                            c1131v.m2505v(iM2494k13);
                                            i34++;
                                        }
                                    }
                                }
                                i22++;
                                i18 = 8;
                                i19 = 6;
                                i = 4;
                                i13 = 16;
                                i21 = 1;
                            } else {
                                int iM2494k14 = c1131v.m2494k(i19) + 1;
                                int i36 = 0;
                                while (i36 < iM2494k14) {
                                    if (c1131v.m2494k(16) > 2) {
                                        throw C0247v0.createForMalformedContainer("residueType greater than 2 is not decodable", null);
                                    }
                                    c1131v.m2505v(24);
                                    c1131v.m2505v(24);
                                    c1131v.m2505v(24);
                                    int iM2494k15 = c1131v.m2494k(i19) + 1;
                                    int i37 = 8;
                                    c1131v.m2505v(8);
                                    int[] iArr5 = new int[iM2494k15];
                                    for (int i38 = 0; i38 < iM2494k15; i38++) {
                                        iArr5[i38] = ((c1131v.m2493j() ? c1131v.m2494k(5) : 0) * 8) + c1131v.m2494k(3);
                                    }
                                    int i39 = 0;
                                    while (i39 < iM2494k15) {
                                        int i40 = 0;
                                        while (i40 < i37) {
                                            if ((iArr5[i39] & (1 << i40)) != 0) {
                                                c1131v.m2505v(i37);
                                            }
                                            i40++;
                                            i37 = 8;
                                        }
                                        i39++;
                                        i37 = 8;
                                    }
                                    i36++;
                                    i19 = 6;
                                }
                                int iM2494k16 = c1131v.m2494k(i19) + 1;
                                for (int i41 = 0; i41 < iM2494k16; i41++) {
                                    int iM2494k17 = c1131v.m2494k(16);
                                    if (iM2494k17 != 0) {
                                        AbstractC1101a.m2364o("VorbisUtil", "mapping type other than 0 not supported: " + iM2494k17);
                                    } else {
                                        int iM2494k18 = c1131v.m2493j() ? c1131v.m2494k(4) + 1 : 1;
                                        if (c1131v.m2493j()) {
                                            int iM2494k19 = c1131v.m2494k(8) + 1;
                                            for (int i42 = 0; i42 < iM2494k19; i42++) {
                                                int i43 = i9 - 1;
                                                int i44 = 0;
                                                for (int i45 = i43; i45 > 0; i45 >>>= 1) {
                                                    i44++;
                                                }
                                                c1131v.m2505v(i44);
                                                int i46 = 0;
                                                while (i43 > 0) {
                                                    i46++;
                                                    i43 >>>= 1;
                                                }
                                                c1131v.m2505v(i46);
                                            }
                                        }
                                        if (c1131v.m2494k(2) != 0) {
                                            throw C0247v0.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iM2494k18 > 1) {
                                            for (int i47 = 0; i47 < i9; i47++) {
                                                c1131v.m2505v(4);
                                            }
                                        }
                                        for (int i48 = 0; i48 < iM2494k18; i48++) {
                                            c1131v.m2505v(8);
                                            c1131v.m2505v(8);
                                            c1131v.m2505v(8);
                                        }
                                    }
                                }
                                int iM2494k20 = c1131v.m2494k(6);
                                int i49 = iM2494k20 + 1;
                                C1984k0[] c1984k0Arr = new C1984k0[i49];
                                for (int i50 = 0; i50 < i49; i50++) {
                                    boolean zM2493j2 = c1131v.m2493j();
                                    c1131v.m2494k(16);
                                    c1131v.m2494k(16);
                                    c1131v.m2494k(8);
                                    c1984k0Arr[i50] = new C1984k0(zM2493j2);
                                }
                                if (!c1131v.m2493j()) {
                                    throw C0247v0.createForMalformedContainer("framing bit after modes not set as expected", null);
                                }
                                int i51 = 0;
                                while (iM2494k20 > 0) {
                                    i51++;
                                    iM2494k20 >>>= 1;
                                }
                                c1250j = new C1250j(c1999z, c1629o, bArr, c1984k0Arr, i51);
                            }
                        }
                    }
                }
            }
        }
        c1250j = null;
        this.f5234n = c1250j;
        if (c1250j == null) {
            return true;
        }
        C1999z c1999z3 = (C1999z) c1250j.f5230l;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) c1999z3.f7415g);
        arrayList.add((byte[]) c1250j.f5232n);
        C0241t0 c0241t0M3842r = AbstractC1965b.m3842r(AbstractC0983m0.m2166k((String[]) ((C1629o) c1250j.f5231m).f6229j));
        C0246v c0246v = new C0246v();
        c0246v.f1447m = AbstractC0244u0.m687p("audio/vorbis");
        c0246v.f1442h = c1999z3.f7412d;
        c0246v.f1443i = c1999z3.f7411c;
        c0246v.f1425B = c1999z3.f7409a;
        c0246v.f1426C = c1999z3.f7410b;
        c0246v.f1450p = arrayList;
        c0246v.f1445k = c0241t0M3842r;
        c0016e.f62k = new C0249w(c0246v);
        return true;
    }

    @Override // p072i2.AbstractC1249i
    /* renamed from: d */
    public final void mo2716d(boolean z7) {
        super.mo2716d(z7);
        if (z7) {
            this.f5234n = null;
            this.f5237q = null;
            this.f5238r = null;
        }
        this.f5235o = 0;
        this.f5236p = false;
    }
}
