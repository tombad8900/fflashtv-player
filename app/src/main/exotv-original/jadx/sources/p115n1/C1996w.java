package p115n1;

import androidx.media3.common.C0247v0;
import java.util.Collections;
import java.util.List;
import p002a1.C0022h;
import p052f6.AbstractC0983m0;
import p063h1.AbstractC1105c;
import p063h1.C1132w;
import p071i1.AbstractC1237p;
import p071i1.C1228g;
import p071i1.C1229h;
import p071i1.C1232k;
import p071i1.C1233l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.w */
/* loaded from: classes.dex */
public final class C1996w {

    /* renamed from: a */
    public final List f7393a;

    /* renamed from: b */
    public final int f7394b;

    /* renamed from: c */
    public final int f7395c;

    /* renamed from: d */
    public final int f7396d;

    /* renamed from: e */
    public final int f7397e;

    /* renamed from: f */
    public final int f7398f;

    /* renamed from: g */
    public final int f7399g;

    /* renamed from: h */
    public final int f7400h;

    /* renamed from: i */
    public final float f7401i;

    /* renamed from: j */
    public final int f7402j;

    /* renamed from: k */
    public final String f7403k;

    /* renamed from: l */
    public final C0022h f7404l;

    public C1996w(List list, int i, int i4, int i8, int i9, int i10, int i11, int i12, float f8, int i13, String str, C0022h c0022h) {
        this.f7393a = list;
        this.f7394b = i;
        this.f7395c = i4;
        this.f7396d = i8;
        this.f7397e = i9;
        this.f7398f = i10;
        this.f7399g = i11;
        this.f7400h = i12;
        this.f7401i = f8;
        this.f7402j = i13;
        this.f7403k = str;
        this.f7404l = c0022h;
    }

    /* renamed from: a */
    public static C1996w m3878a(C1132w c1132w, boolean z7, C0022h c0022h) throws C0247v0 {
        boolean z8;
        C1232k c1232kM2685f;
        int i;
        int i4 = 4;
        try {
            if (z7) {
                c1132w.m2514H(4);
            } else {
                c1132w.m2514H(21);
            }
            int iM2535u = c1132w.m2535u() & 3;
            int iM2535u2 = c1132w.m2535u();
            int i8 = c1132w.f4800b;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                z8 = true;
                if (i10 >= iM2535u2) {
                    break;
                }
                c1132w.m2514H(1);
                int iM2507A = c1132w.m2507A();
                for (int i12 = 0; i12 < iM2507A; i12++) {
                    int iM2507A2 = c1132w.m2507A();
                    i11 += iM2507A2 + 4;
                    c1132w.m2514H(iM2507A2);
                }
                i10++;
            }
            c1132w.m2513G(i8);
            byte[] bArr = new byte[i11];
            C0022h c0022h2 = c0022h;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            float f8 = 1.0f;
            String strM2385a = null;
            int i20 = 0;
            int i21 = 0;
            while (i20 < iM2535u2) {
                int iM2535u3 = c1132w.m2535u() & 63;
                int iM2507A3 = c1132w.m2507A();
                int i22 = i9;
                C0022h c0022hM2687h = c0022h2;
                while (i22 < iM2507A3) {
                    boolean z9 = z8;
                    int iM2507A4 = c1132w.m2507A();
                    int i23 = iM2535u;
                    System.arraycopy(AbstractC1237p.f5170a, i9, bArr, i21, i4);
                    int i24 = i21 + 4;
                    System.arraycopy(c1132w.f4799a, c1132w.f4800b, bArr, i24, iM2507A4);
                    if (iM2535u3 == 32 && i22 == 0) {
                        c0022hM2687h = AbstractC1237p.m2687h(bArr, i24, i24 + iM2507A4);
                    } else {
                        if (iM2535u3 == 33 && i22 == 0) {
                            C1233l c1233lM2686g = AbstractC1237p.m2686g(bArr, i24, i24 + iM2507A4, c0022hM2687h);
                            i13 = c1233lM2686g.f5137b + 8;
                            i14 = c1233lM2686g.f5138c + 8;
                            int i25 = c1233lM2686g.f5143h;
                            int i26 = c1233lM2686g.f5144i;
                            i15 = i25;
                            int i27 = c1233lM2686g.f5145j;
                            float f9 = c1233lM2686g.f5141f;
                            int i28 = c1233lM2686g.f5142g;
                            C1229h c1229h = c1233lM2686g.f5136a;
                            if (c1229h != null) {
                                i = i28;
                                strM2385a = AbstractC1105c.m2385a(c1229h.f5122a, c1229h.f5123b, c1229h.f5124c, c1229h.f5125d, c1229h.f5126e, c1229h.f5127f);
                            } else {
                                i = i28;
                            }
                            i19 = i;
                            f8 = f9;
                            i17 = i27;
                            i16 = i26;
                        } else if (iM2535u3 == 39 && i22 == 0 && (c1232kM2685f = AbstractC1237p.m2685f(bArr, i24, i24 + iM2507A4)) != null && c0022hM2687h != null) {
                            i9 = 0;
                            i18 = c1232kM2685f.f5135a == ((C1228g) ((AbstractC0983m0) c0022hM2687h.f78j).get(0)).f5121b ? 4 : 5;
                        }
                        i9 = 0;
                    }
                    i21 = i24 + iM2507A4;
                    c1132w.m2514H(iM2507A4);
                    i22++;
                    z8 = z9;
                    iM2535u = i23;
                    i4 = 4;
                }
                i20++;
                c0022h2 = c0022hM2687h;
                i4 = 4;
            }
            return new C1996w(i11 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM2535u + 1, i13, i14, i15, i16, i17, i18, f8, i19, strM2385a, c0022h2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C0247v0.createForMalformedContainer("Error parsing".concat(z7 ? "L-HEVC config" : "HEVC config"), e);
        }
    }
}
