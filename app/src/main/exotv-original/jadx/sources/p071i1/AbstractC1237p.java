package p071i1;

import androidx.media3.common.C0216l;
import androidx.media3.common.C0228p;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import p002a1.AbstractC0008a1;
import p002a1.C0022h;
import p052f6.AbstractC0965g0;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0974j0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.C1131v;
import p068h6.AbstractC1196c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i1.p */
/* loaded from: classes.dex */
public abstract class AbstractC1237p {

    /* renamed from: a */
    public static final byte[] f5170a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f5171b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f5172c = new Object();

    /* renamed from: d */
    public static int[] f5173d = new int[10];

    /* renamed from: a */
    public static void m2680a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static int m2681b(byte[] bArr, int i, int i4, boolean[] zArr) {
        int i8 = i4 - i;
        AbstractC1101a.m2359j(i8 >= 0);
        if (i8 == 0) {
            return i4;
        }
        if (zArr[0]) {
            m2680a(zArr);
            return i - 3;
        }
        if (i8 > 1 && zArr[1] && bArr[i] == 1) {
            m2680a(zArr);
            return i - 2;
        }
        if (i8 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m2680a(zArr);
            return i - 1;
        }
        int i9 = i4 - 1;
        int i10 = i + 2;
        while (i10 < i9) {
            byte b7 = bArr[i10];
            if ((b7 & 254) == 0) {
                int i11 = i10 - 2;
                if (bArr[i11] == 0 && bArr[i10 - 1] == 0 && b7 == 1) {
                    m2680a(zArr);
                    return i11;
                }
                i10 -= 2;
            }
            i10 += 3;
        }
        zArr[0] = i8 <= 2 ? !(i8 != 2 ? !(zArr[1] && bArr[i9] == 1) : !(zArr[2] && bArr[i4 + (-2)] == 0 && bArr[i9] == 1)) : bArr[i4 + (-3)] == 0 && bArr[i4 + (-2)] == 0 && bArr[i9] == 1;
        zArr[1] = i8 <= 1 ? zArr[2] && bArr[i9] == 0 : bArr[i4 + (-2)] == 0 && bArr[i9] == 0;
        zArr[2] = bArr[i9] == 0;
        return i4;
    }

    /* renamed from: c */
    public static boolean m2682c(byte b7) {
        if (((b7 & 96) >> 5) != 0) {
            return true;
        }
        int i = b7 & 31;
        return (i == 1 || i == 9 || i == 14) ? false : true;
    }

    /* renamed from: d */
    public static C0228p m2683d(C1131v c1131v) {
        c1131v.m2504u();
        int iM2494k = c1131v.m2494k(6);
        int iM2494k2 = c1131v.m2494k(6);
        c1131v.m2494k(3);
        return new C0228p(iM2494k, iM2494k2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1229h m2684e(C1131v c1131v, boolean z7, int i, C1229h c1229h) {
        int[] iArr;
        int i4;
        boolean z8;
        int i8;
        int i9;
        boolean zM2493j;
        int iM2494k;
        int i10;
        int[] iArr2 = new int[6];
        if (z7) {
            int iM2494k2 = c1131v.m2494k(2);
            zM2493j = c1131v.m2493j();
            iM2494k = c1131v.m2494k(5);
            i10 = 0;
            for (int i11 = 0; i11 < 32; i11++) {
                if (c1131v.m2493j()) {
                    i10 |= 1 << i11;
                }
            }
            for (int i12 = 0; i12 < 6; i12++) {
                iArr2[i12] = c1131v.m2494k(8);
            }
            i4 = iM2494k2;
        } else {
            if (c1229h == null) {
                iArr = iArr2;
                i4 = 0;
                z8 = false;
                i8 = 0;
                i9 = 0;
                int iM2494k3 = c1131v.m2494k(8);
                int i13 = 0;
                for (int i14 = 0; i14 < i; i14++) {
                    if (c1131v.m2493j()) {
                        i13 += 88;
                    }
                    if (c1131v.m2493j()) {
                        i13 += 8;
                    }
                }
                c1131v.m2505v(i13);
                if (i > 0) {
                    c1131v.m2505v((8 - i) * 2);
                }
                return new C1229h(i4, z8, i8, i9, iArr, iM2494k3);
            }
            int i15 = c1229h.f5122a;
            zM2493j = c1229h.f5123b;
            iM2494k = c1229h.f5124c;
            i10 = c1229h.f5125d;
            iArr2 = c1229h.f5126e;
            i4 = i15;
        }
        iArr = iArr2;
        z8 = zM2493j;
        i8 = iM2494k;
        i9 = i10;
        int iM2494k32 = c1131v.m2494k(8);
        int i132 = 0;
        while (i14 < i) {
        }
        c1131v.m2505v(i132);
        if (i > 0) {
        }
        return new C1229h(i4, z8, i8, i9, iArr, iM2494k32);
    }

    /* renamed from: f */
    public static C1232k m2685f(byte[] bArr, int i, int i4) {
        byte b7;
        int i8 = i + 2;
        do {
            i4--;
            b7 = bArr[i4];
            if (b7 != 0) {
                break;
            }
        } while (i4 > i8);
        if (b7 == 0 || i4 <= i8) {
            return null;
        }
        C1131v c1131v = new C1131v(bArr, i8, i4 + 1);
        while (c1131v.m2488e(16)) {
            int iM2494k = c1131v.m2494k(8);
            int i9 = 0;
            while (iM2494k == 255) {
                i9 += 255;
                iM2494k = c1131v.m2494k(8);
            }
            int i10 = i9 + iM2494k;
            int iM2494k2 = c1131v.m2494k(8);
            int i11 = 0;
            while (iM2494k2 == 255) {
                i11 += 255;
                iM2494k2 = c1131v.m2494k(8);
            }
            int i12 = i11 + iM2494k2;
            if (i12 == 0 || !c1131v.m2488e(i12)) {
                return null;
            }
            if (i10 == 176) {
                int iM2498o = c1131v.m2498o();
                boolean zM2493j = c1131v.m2493j();
                int iM2498o2 = zM2493j ? c1131v.m2498o() : 0;
                int iM2498o3 = c1131v.m2498o();
                int iM2498o4 = -1;
                for (int i13 = 0; i13 <= iM2498o3; i13++) {
                    iM2498o4 = c1131v.m2498o();
                    c1131v.m2498o();
                    int iM2494k3 = c1131v.m2494k(6);
                    if (iM2494k3 == 63) {
                        return null;
                    }
                    c1131v.m2494k(iM2494k3 == 0 ? Math.max(0, iM2498o - 30) : Math.max(0, (iM2494k3 + iM2498o) - 31));
                    if (zM2493j) {
                        int iM2494k4 = c1131v.m2494k(6);
                        if (iM2494k4 == 63) {
                            return null;
                        }
                        c1131v.m2494k(iM2494k4 == 0 ? Math.max(0, iM2498o2 - 30) : Math.max(0, (iM2494k4 + iM2498o2) - 31));
                    }
                    if (c1131v.m2493j()) {
                        c1131v.m2505v(10);
                    }
                }
                return new C1232k(iM2498o4);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019c  */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1233l m2686g(byte[] bArr, int i, int i4, C0022h c0022h) {
        int i8;
        int i9;
        int i10;
        int iM2498o;
        int iM2498o2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iM2498o3;
        int i16;
        float f8;
        int i17;
        int i18;
        int i19;
        int i20;
        int iM632f;
        int iM633g;
        ?? r52;
        C1230i c1230i;
        int i21;
        int i22;
        boolean z7;
        C1230i c1230i2;
        C0228p c0228pM2683d = m2683d(new C1131v(bArr, i, i4));
        C1131v c1131v = new C1131v(bArr, i + 2, i4);
        c1131v.m2505v(4);
        int iM2494k = c1131v.m2494k(3);
        int i23 = c0228pM2683d.f1277b;
        boolean z8 = true;
        boolean z9 = i23 != 0 && iM2494k == 7;
        if (c0022h != null) {
            AbstractC0983m0 abstractC0983m0 = (AbstractC0983m0) c0022h.f78j;
            i8 = !abstractC0983m0.isEmpty() ? ((C1228g) abstractC0983m0.get(Math.min(i23, abstractC0983m0.size() - 1))).f5120a : 0;
        }
        C1229h c1229hM2684e = null;
        if (!z9) {
            c1131v.m2504u();
            c1229hM2684e = m2684e(c1131v, true, iM2494k, null);
        } else if (c0022h != null) {
            C1230i c1230i3 = (C1230i) c0022h.f79k;
            int[] iArr = c1230i3.f5129b;
            AbstractC0983m0 abstractC0983m02 = c1230i3.f5128a;
            int i24 = iArr[i8];
            if (abstractC0983m02.size() > i24) {
                c1229hM2684e = (C1229h) abstractC0983m02.get(i24);
            }
        }
        C1229h c1229h = c1229hM2684e;
        c1131v.m2498o();
        if (z9) {
            int iM2494k2 = c1131v.m2493j() ? c1131v.m2494k(8) : -1;
            if (c0022h != null && (c1230i2 = (C1230i) c0022h.f80l) != null) {
                AbstractC0983m0 abstractC0983m03 = c1230i2.f5128a;
                if (iM2494k2 == -1) {
                    iM2494k2 = c1230i2.f5129b[i8];
                }
                if (iM2494k2 != -1 && abstractC0983m03.size() > iM2494k2) {
                    C1231j c1231j = (C1231j) abstractC0983m03.get(iM2494k2);
                    int i25 = c1231j.f5130a;
                    i10 = c1231j.f5133d;
                    i9 = c1231j.f5134e;
                    iM2498o = c1231j.f5131b;
                    iM2498o2 = c1231j.f5132c;
                }
            }
            i14 = 0;
            i13 = 0;
            i12 = 0;
            i11 = 0;
            int iM2498o4 = c1131v.m2498o();
            if (z9) {
                int iMax = -1;
                for (int i26 = c1131v.m2493j() ? 0 : iM2494k; i26 <= iM2494k; i26++) {
                    c1131v.m2498o();
                    iMax = Math.max(c1131v.m2498o(), iMax);
                    c1131v.m2498o();
                }
                i15 = iMax;
            } else {
                i15 = -1;
            }
            c1131v.m2498o();
            c1131v.m2498o();
            c1131v.m2498o();
            c1131v.m2498o();
            c1131v.m2498o();
            c1131v.m2498o();
            if (c1131v.m2493j()) {
                if (z9 ? c1131v.m2493j() : false) {
                    c1131v.m2505v(6);
                } else if (c1131v.m2493j()) {
                    int i27 = 0;
                    while (i27 < 4) {
                        for (int i28 = 0; i28 < 6; i28 += i27 == 3 ? 3 : 1) {
                            if (c1131v.m2493j()) {
                                int iMin = Math.min(64, 1 << ((i27 << 1) + 4));
                                if (i27 > 1) {
                                    c1131v.m2499p();
                                }
                                for (int i29 = 0; i29 < iMin; i29++) {
                                    c1131v.m2499p();
                                }
                            } else {
                                c1131v.m2498o();
                            }
                        }
                        i27++;
                    }
                }
            }
            c1131v.m2505v(2);
            if (c1131v.m2493j()) {
                c1131v.m2505v(8);
                c1131v.m2498o();
                c1131v.m2498o();
                c1131v.m2504u();
            }
            iM2498o3 = c1131v.m2498o();
            int[] iArr2 = new int[0];
            int[] iArrCopyOf = new int[0];
            i16 = 0;
            int i30 = -1;
            int i31 = -1;
            while (i16 < iM2498o3) {
                if (i16 == 0 || !c1131v.m2493j()) {
                    i21 = iM2498o3;
                    i22 = i8;
                    z7 = z8;
                    int iM2498o5 = c1131v.m2498o();
                    int iM2498o6 = c1131v.m2498o();
                    int[] iArr3 = new int[iM2498o5];
                    int i32 = 0;
                    while (i32 < iM2498o5) {
                        iArr3[i32] = (i32 > 0 ? iArr3[i32 - 1] : 0) - (c1131v.m2498o() + 1);
                        c1131v.m2504u();
                        i32++;
                    }
                    int[] iArr4 = new int[iM2498o6];
                    int i33 = 0;
                    while (i33 < iM2498o6) {
                        iArr4[i33] = c1131v.m2498o() + 1 + (i33 > 0 ? iArr4[i33 - 1] : 0);
                        c1131v.m2504u();
                        i33++;
                    }
                    i31 = iM2498o5;
                    iArr2 = iArr3;
                    iArrCopyOf = iArr4;
                    i30 = iM2498o6;
                } else {
                    z7 = z8;
                    int i34 = i31 + i30;
                    int iM2498o7 = (1 - ((c1131v.m2493j() ? 1 : 0) * 2)) * (c1131v.m2498o() + 1);
                    int i35 = i34 + 1;
                    i21 = iM2498o3;
                    boolean[] zArr = new boolean[i35];
                    for (int i36 = 0; i36 <= i34; i36++) {
                        if (c1131v.m2493j()) {
                            zArr[i36] = z7;
                        } else {
                            zArr[i36] = c1131v.m2493j();
                        }
                    }
                    int[] iArr5 = new int[i35];
                    int[] iArr6 = new int[i35];
                    int i37 = 0;
                    for (int i38 = i30 - 1; i38 >= 0; i38--) {
                        int i39 = iArrCopyOf[i38] + iM2498o7;
                        if (i39 < 0 && zArr[i31 + i38]) {
                            iArr5[i37] = i39;
                            i37++;
                        }
                    }
                    if (iM2498o7 < 0 && zArr[i34]) {
                        iArr5[i37] = iM2498o7;
                        i37++;
                    }
                    i22 = i8;
                    int i40 = i37;
                    int[] iArr7 = iArr2;
                    for (int i41 = 0; i41 < i31; i41++) {
                        int i42 = iArr7[i41] + iM2498o7;
                        if (i42 < 0 && zArr[i41]) {
                            iArr5[i40] = i42;
                            i40++;
                        }
                    }
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i40);
                    int i43 = 0;
                    for (int i44 = i31 - 1; i44 >= 0; i44--) {
                        int i45 = iArr7[i44] + iM2498o7;
                        if (i45 > 0 && zArr[i44]) {
                            iArr6[i43] = i45;
                            i43++;
                        }
                    }
                    if (iM2498o7 > 0 && zArr[i34]) {
                        iArr6[i43] = iM2498o7;
                        i43++;
                    }
                    int i46 = i43;
                    for (int i47 = 0; i47 < i30; i47++) {
                        int i48 = iArrCopyOf[i47] + iM2498o7;
                        if (i48 > 0 && zArr[i31 + i47]) {
                            iArr6[i46] = i48;
                            i46++;
                        }
                    }
                    iArrCopyOf = Arrays.copyOf(iArr6, i46);
                    i31 = i40;
                    i30 = i46;
                    iArr2 = iArrCopyOf2;
                }
                i16++;
                z8 = z7;
                iM2498o3 = i21;
                i8 = i22;
            }
            int i49 = i8;
            boolean z10 = z8;
            if (c1131v.m2493j()) {
                int iM2498o8 = c1131v.m2498o();
                for (int i50 = 0; i50 < iM2498o8; i50++) {
                    c1131v.m2505v(iM2498o4 + 5);
                }
            }
            c1131v.m2505v(2);
            float f9 = 1.0f;
            if (c1131v.m2493j()) {
                f8 = 1.0f;
                i17 = i14;
                i18 = -1;
                i19 = -1;
                i20 = -1;
            } else {
                if (c1131v.m2493j()) {
                    int iM2494k3 = c1131v.m2494k(8);
                    if (iM2494k3 == 255) {
                        int iM2494k4 = c1131v.m2494k(16);
                        int iM2494k5 = c1131v.m2494k(16);
                        if (iM2494k4 != 0 && iM2494k5 != 0) {
                            f9 = iM2494k4 / iM2494k5;
                        }
                    } else if (iM2494k3 < 17) {
                        f9 = f5171b[iM2494k3];
                    } else {
                        AbstractC0008a1.m23s("Unexpected aspect_ratio_idc value: ", iM2494k3, "NalUnitUtil");
                    }
                }
                if (c1131v.m2493j()) {
                    c1131v.m2504u();
                }
                if (c1131v.m2493j()) {
                    c1131v.m2505v(3);
                    boolean z11 = c1131v.m2493j() ? z10 : 2;
                    if (c1131v.m2493j()) {
                        int iM2494k6 = c1131v.m2494k(8);
                        int iM2494k7 = c1131v.m2494k(8);
                        c1131v.m2505v(8);
                        iM632f = C0216l.m632f(iM2494k6);
                        iM633g = C0216l.m633g(iM2494k7);
                        r52 = z11;
                    } else {
                        iM632f = -1;
                        iM633g = -1;
                        r52 = z11;
                    }
                } else if (c0022h == null || (c1230i = (C1230i) c0022h.f81m) == null) {
                    iM632f = -1;
                    iM633g = -1;
                    r52 = -1;
                } else {
                    AbstractC0983m0 abstractC0983m04 = c1230i.f5128a;
                    int i51 = c1230i.f5129b[i49];
                    if (abstractC0983m04.size() > i51) {
                        C1234m c1234m = (C1234m) abstractC0983m04.get(i51);
                        int i52 = c1234m.f5146a;
                        int i53 = c1234m.f5147b;
                        iM633g = c1234m.f5148c;
                        iM632f = i52;
                        r52 = i53;
                    }
                }
                if (c1131v.m2493j()) {
                    c1131v.m2498o();
                    c1131v.m2498o();
                }
                c1131v.m2504u();
                if (c1131v.m2493j()) {
                    i14 *= 2;
                }
                i18 = iM632f;
                i20 = iM633g;
                f8 = f9;
                i19 = r52;
                i17 = i14;
            }
            return new C1233l(c1229h, i13, i12, i11, i17, f8, i15, i18, i19, i20);
        }
        int iM2498o9 = c1131v.m2498o();
        if (iM2498o9 == 3) {
            c1131v.m2504u();
        }
        int iM2498o10 = c1131v.m2498o();
        int iM2498o11 = c1131v.m2498o();
        if (c1131v.m2493j()) {
            int iM2498o12 = c1131v.m2498o();
            int iM2498o13 = c1131v.m2498o();
            int iM2498o14 = c1131v.m2498o();
            int iM2498o15 = c1131v.m2498o();
            iM2498o10 -= (iM2498o12 + iM2498o13) * ((iM2498o9 == 1 || iM2498o9 == 2) ? 2 : 1);
            iM2498o11 -= (iM2498o14 + iM2498o15) * (iM2498o9 == 1 ? 2 : 1);
        }
        i9 = iM2498o11;
        i10 = iM2498o10;
        iM2498o = c1131v.m2498o();
        iM2498o2 = c1131v.m2498o();
        int i54 = iM2498o2;
        i13 = iM2498o;
        i14 = i9;
        i11 = i10;
        i12 = i54;
        int iM2498o42 = c1131v.m2498o();
        if (z9) {
        }
        c1131v.m2498o();
        c1131v.m2498o();
        c1131v.m2498o();
        c1131v.m2498o();
        c1131v.m2498o();
        c1131v.m2498o();
        if (c1131v.m2493j()) {
        }
        c1131v.m2505v(2);
        if (c1131v.m2493j()) {
        }
        iM2498o3 = c1131v.m2498o();
        int[] iArr22 = new int[0];
        int[] iArrCopyOf3 = new int[0];
        i16 = 0;
        int i302 = -1;
        int i312 = -1;
        while (i16 < iM2498o3) {
        }
        int i492 = i8;
        boolean z102 = z8;
        if (c1131v.m2493j()) {
        }
        c1131v.m2505v(2);
        float f92 = 1.0f;
        if (c1131v.m2493j()) {
        }
        return new C1233l(c1229h, i13, i12, i11, i17, f8, i15, i18, i19, i20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0022h m2687h(byte[] bArr, int i, int i4) {
        int[] iArr;
        int[] iArr2;
        C1230i c1230i;
        int iM2494k;
        int iM2494k2;
        int iM2494k3;
        boolean z7;
        int i8;
        C0981l1 c0981l1;
        boolean[][] zArr;
        int i9;
        boolean[][] zArr2;
        int[] iArr3;
        int[] iArr4;
        int i10;
        boolean z8;
        int i11;
        boolean zM2493j;
        int i12;
        int i13;
        int i14;
        boolean zM2493j2;
        int i15;
        int iM2498o;
        boolean z9;
        boolean z10;
        C1131v c1131v = new C1131v(bArr, i, i4);
        m2683d(c1131v);
        c1131v.m2505v(4);
        boolean zM2493j3 = c1131v.m2493j();
        boolean zM2493j4 = c1131v.m2493j();
        int iM2494k4 = c1131v.m2494k(6);
        int i16 = iM2494k4 + 1;
        int iM2494k5 = c1131v.m2494k(3);
        c1131v.m2505v(17);
        C1229h c1229hM2684e = m2684e(c1131v, true, iM2494k5, null);
        for (int i17 = c1131v.m2493j() ? 0 : iM2494k5; i17 <= iM2494k5; i17++) {
            c1131v.m2498o();
            c1131v.m2498o();
            c1131v.m2498o();
        }
        int iM2494k6 = c1131v.m2494k(6);
        int iM2498o2 = c1131v.m2498o() + 1;
        int i18 = 6;
        int i19 = 1;
        C1230i c1230i2 = new C1230i(AbstractC0983m0.m2168n(c1229hM2684e), new int[1], 0);
        boolean z11 = i16 >= 2 && iM2498o2 >= 2;
        boolean z12 = zM2493j3 && zM2493j4;
        int i20 = iM2494k6 + 1;
        boolean z13 = i20 >= i16;
        if (!z11 || !z12 || !z13) {
            return new C0022h((C0981l1) null, c1230i2, (C1230i) null, (C1230i) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, iM2498o2, i20);
        int[] iArr6 = new int[iM2498o2];
        int[] iArr7 = new int[iM2498o2];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i21 = 1; i21 < iM2498o2; i21++) {
            int i22 = 0;
            for (int i23 = 0; i23 <= iM2494k6; i23++) {
                if (c1131v.m2493j()) {
                    iArr5[i21][i22] = i23;
                    iArr7[i21] = i23;
                    i22++;
                }
                iArr6[i21] = i22;
            }
        }
        if (c1131v.m2493j()) {
            c1131v.m2505v(64);
            if (c1131v.m2493j()) {
                c1131v.m2498o();
            }
            int iM2498o3 = c1131v.m2498o();
            int i24 = 0;
            while (i24 < iM2498o3) {
                c1131v.m2498o();
                if (i24 == 0 || c1131v.m2493j()) {
                    boolean zM2493j5 = c1131v.m2493j();
                    boolean zM2493j6 = c1131v.m2493j();
                    z10 = zM2493j5;
                    z9 = zM2493j6;
                    if (zM2493j5 || zM2493j6) {
                        zM2493j = c1131v.m2493j();
                        if (zM2493j) {
                            c1131v.m2505v(19);
                        }
                        c1131v.m2505v(8);
                        if (zM2493j) {
                            c1131v.m2505v(4);
                        }
                        c1131v.m2505v(15);
                        i13 = zM2493j5;
                        i12 = zM2493j6;
                    }
                    i14 = 0;
                    while (i14 <= iM2494k5) {
                        boolean zM2493j7 = c1131v.m2493j();
                        if (!zM2493j7) {
                            zM2493j7 = c1131v.m2493j();
                        }
                        if (zM2493j7) {
                            c1131v.m2498o();
                            zM2493j2 = false;
                        } else {
                            zM2493j2 = c1131v.m2493j();
                        }
                        if (zM2493j2) {
                            i15 = i24;
                            iM2498o = 0;
                        } else {
                            i15 = i24;
                            iM2498o = c1131v.m2498o();
                        }
                        int[][] iArr8 = iArr5;
                        int i25 = i13 + i12;
                        int[] iArr9 = iArr7;
                        int i26 = 0;
                        while (i26 < i25) {
                            int i27 = i25;
                            for (int i28 = 0; i28 <= iM2498o; i28++) {
                                c1131v.m2498o();
                                c1131v.m2498o();
                                if (zM2493j) {
                                    c1131v.m2498o();
                                    c1131v.m2498o();
                                }
                                c1131v.m2504u();
                            }
                            i26++;
                            i25 = i27;
                        }
                        i14++;
                        i24 = i15;
                        iArr5 = iArr8;
                        iArr7 = iArr9;
                    }
                    i24++;
                } else {
                    z10 = false;
                    z9 = false;
                }
                zM2493j = false;
                i13 = z10;
                i12 = z9;
                i14 = 0;
                while (i14 <= iM2494k5) {
                }
                i24++;
            }
        }
        int[][] iArr10 = iArr5;
        int[] iArr11 = iArr7;
        if (!c1131v.m2493j()) {
            return new C0022h((C0981l1) null, c1230i2, (C1230i) null, (C1230i) null);
        }
        int i29 = c1131v.f4795e;
        if (i29 > 0) {
            c1131v.m2505v(8 - i29);
        }
        C1229h c1229hM2684e2 = m2684e(c1131v, false, iM2494k5, c1229hM2684e);
        boolean zM2493j8 = c1131v.m2493j();
        boolean[] zArr3 = new boolean[16];
        int i30 = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            boolean zM2493j9 = c1131v.m2493j();
            zArr3[i31] = zM2493j9;
            if (zM2493j9) {
                i30++;
            }
        }
        if (i30 == 0 || !zArr3[1]) {
            return new C0022h((C0981l1) null, c1230i2, (C1230i) null, (C1230i) null);
        }
        int[] iArr12 = new int[i30];
        for (int i32 = 0; i32 < i30 - (zM2493j8 ? 1 : 0); i32++) {
            iArr12[i32] = c1131v.m2494k(3);
        }
        int[] iArr13 = new int[i30 + 1];
        if (zM2493j8) {
            int i33 = 1;
            while (i33 < i30) {
                int[] iArr14 = iArr13;
                for (int i34 = 0; i34 < i33; i34++) {
                    iArr14[i33] = iArr12[i34] + 1 + iArr14[i33];
                }
                i33++;
                iArr13 = iArr14;
            }
            iArr = iArr13;
            iArr[i30] = 6;
        } else {
            iArr = iArr13;
        }
        int[][] iArr15 = (int[][]) Array.newInstance((Class<?>) cls, i16, i30);
        int[] iArr16 = new int[i16];
        iArr16[0] = 0;
        boolean zM2493j10 = c1131v.m2493j();
        int i35 = 1;
        while (i35 < i16) {
            if (zM2493j10) {
                i11 = i35;
                iArr16[i11] = c1131v.m2494k(i18);
            } else {
                i11 = i35;
                iArr16[i11] = i11;
            }
            if (zM2493j8) {
                for (int i36 = 0; i36 < i30; i36++) {
                    iArr15[i11][i36] = (iArr16[i11] & ((1 << iArr[r31]) - 1)) >> iArr[i36];
                }
            } else {
                int i37 = 0;
                while (i37 < i30) {
                    int i38 = i37;
                    iArr15[i11][i38] = c1131v.m2494k(iArr12[i37] + 1);
                    i37 = i38 + 1;
                }
            }
            i35 = i11 + 1;
            i18 = 6;
        }
        int[] iArr17 = new int[i20];
        int i39 = 1;
        int i40 = 0;
        while (i40 < i16) {
            iArr17[iArr16[i40]] = -1;
            int[] iArr18 = iArr17;
            int i41 = 0;
            int i42 = 0;
            while (i41 < 16) {
                if (zArr3[i41]) {
                    if (i41 == i19) {
                        iArr18[iArr16[i40]] = iArr15[i40][i42];
                    }
                    i42++;
                }
                i41++;
                i19 = 1;
            }
            if (i40 > 0) {
                int i43 = 0;
                while (true) {
                    if (i43 >= i40) {
                        z8 = true;
                        break;
                    }
                    int i44 = i43;
                    if (iArr18[iArr16[i40]] == iArr18[iArr16[i43]]) {
                        z8 = false;
                        break;
                    }
                    i43 = i44 + 1;
                }
                if (z8) {
                    i39++;
                }
            }
            i40++;
            iArr17 = iArr18;
            i19 = 1;
        }
        int[] iArr19 = iArr17;
        int iM2494k7 = c1131v.m2494k(4);
        if (i39 < 2 || iM2494k7 == 0) {
            return new C0022h((C0981l1) null, c1230i2, (C1230i) null, (C1230i) null);
        }
        int[] iArr20 = new int[i39];
        for (int i45 = 0; i45 < i39; i45++) {
            iArr20[i45] = c1131v.m2494k(iM2494k7);
        }
        int[] iArr21 = new int[i20];
        int i46 = 0;
        while (i46 < i16) {
            iArr21[Math.min(iArr16[i46], iM2494k6)] = i46;
            i46++;
            iArr20 = iArr20;
        }
        int[] iArr22 = iArr20;
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        int i47 = 0;
        while (i47 <= iM2494k6) {
            int i48 = i39;
            int[] iArr23 = iArr16;
            int iMin = Math.min(iArr19[i47], i48 - 1);
            int[] iArr24 = iArr21;
            c0974j0M2164i.m2141a(new C1228g(iArr24[i47], iMin >= 0 ? iArr22[iMin] : -1));
            i47++;
            i39 = i48;
            iArr21 = iArr24;
            iArr16 = iArr23;
        }
        int[] iArr25 = iArr16;
        C0981l1 c0981l1M2159f = c0974j0M2164i.m2159f();
        if (((C1228g) c0981l1M2159f.get(0)).f5121b == -1) {
            return new C0022h((C0981l1) null, c1230i2, (C1230i) null, (C1230i) null);
        }
        int i49 = 1;
        while (true) {
            if (i49 > iM2494k6) {
                i49 = -1;
                break;
            }
            if (((C1228g) c0981l1M2159f.get(i49)).f5121b != -1) {
                break;
            }
            i49++;
        }
        if (i49 == -1) {
            return new C0022h((C0981l1) null, c1230i2, (C1230i) null, (C1230i) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i16, i16);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i16, i16);
        int i50 = 1;
        while (i50 < i16) {
            boolean[][] zArr6 = zArr5;
            for (int i51 = 0; i51 < i50; i51++) {
                boolean[] zArr7 = zArr4[i50];
                boolean[] zArr8 = zArr6[i50];
                boolean zM2493j11 = c1131v.m2493j();
                zArr8[i51] = zM2493j11;
                zArr7[i51] = zM2493j11;
            }
            i50++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i52 = 1; i52 < i16; i52++) {
            int i53 = 0;
            while (i53 < iM2494k4) {
                boolean[][] zArr10 = zArr4;
                int i54 = 0;
                while (true) {
                    if (i54 < i52) {
                        boolean[] zArr11 = zArr9[i52];
                        if (zArr11[i54] && zArr9[i54][i53]) {
                            zArr11[i53] = true;
                            break;
                        }
                        i54++;
                    }
                }
                i53++;
                zArr4 = zArr10;
            }
        }
        boolean[][] zArr12 = zArr4;
        int[] iArr26 = new int[i20];
        for (int i55 = 0; i55 < i16; i55++) {
            int i56 = 0;
            for (int i57 = 0; i57 < i55; i57++) {
                i56 += zArr12[i55][i57] ? 1 : 0;
            }
            iArr26[iArr25[i55]] = i56;
        }
        int i58 = 0;
        for (int i59 = 0; i59 < i16; i59++) {
            if (iArr26[iArr25[i59]] == 0) {
                i58++;
            }
        }
        if (i58 > 1) {
            return new C0022h((C0981l1) null, c1230i2, (C1230i) null, (C1230i) null);
        }
        int[] iArr27 = new int[i16];
        int[] iArr28 = new int[iM2498o2];
        if (c1131v.m2493j()) {
            iArr2 = iArr26;
            int i60 = 0;
            while (i60 < i16) {
                int i61 = i60;
                iArr27[i61] = c1131v.m2494k(3);
                i60 = i61 + 1;
            }
        } else {
            iArr2 = iArr26;
            Arrays.fill(iArr27, 0, i16, iM2494k5);
        }
        int i62 = 0;
        while (i62 < iM2498o2) {
            int i63 = i62;
            int[] iArr29 = iArr27;
            int[] iArr30 = iArr28;
            int iMax = 0;
            for (int i64 = 0; i64 < iArr6[i63]; i64++) {
                iMax = Math.max(iMax, iArr29[((C1228g) c0981l1M2159f.get(iArr10[i63][i64])).f5120a]);
            }
            iArr30[i63] = iMax + 1;
            i62 = i63 + 1;
            iArr27 = iArr29;
            iArr28 = iArr30;
        }
        int[] iArr31 = iArr28;
        if (c1131v.m2493j()) {
            int i65 = 0;
            while (i65 < iM2494k4) {
                int i66 = i65 + 1;
                int i67 = i66;
                while (i67 < i16) {
                    if (zArr12[i67][i65]) {
                        i10 = iM2494k4;
                        c1131v.m2505v(3);
                    } else {
                        i10 = iM2494k4;
                    }
                    i67++;
                    iM2494k4 = i10;
                }
                i65 = i66;
            }
        }
        c1131v.m2504u();
        int iM2498o4 = c1131v.m2498o() + 1;
        C0974j0 c0974j0M2164i2 = AbstractC0983m0.m2164i();
        c0974j0M2164i2.m2141a(c1229hM2684e);
        if (iM2498o4 > 1) {
            c0974j0M2164i2.m2141a(c1229hM2684e2);
            for (int i68 = 2; i68 < iM2498o4; i68++) {
                c1229hM2684e2 = m2684e(c1131v, c1131v.m2493j(), iM2494k5, c1229hM2684e2);
                c0974j0M2164i2.m2141a(c1229hM2684e2);
            }
        }
        C0981l1 c0981l1M2159f2 = c0974j0M2164i2.m2159f();
        int iM2498o5 = c1131v.m2498o() + iM2498o2;
        if (iM2498o5 > iM2498o2) {
            return new C0022h((C0981l1) null, c1230i2, (C1230i) null, (C1230i) null);
        }
        int iM2494k8 = c1131v.m2494k(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM2498o5, i20);
        int[] iArr32 = new int[iM2498o5];
        int i69 = 0;
        int[] iArr33 = new int[iM2498o5];
        int i70 = 0;
        while (i70 < iM2498o2) {
            iArr32[i70] = i69;
            iArr33[i70] = iArr11[i70];
            if (iM2494k8 == 0) {
                i9 = i70;
                zArr2 = zArr13;
                iArr3 = iArr32;
                iArr4 = iArr6;
                Arrays.fill(zArr13[i9], i69, iArr6[i9], true);
                iArr3[i9] = iArr4[i9];
            } else {
                i9 = i70;
                zArr2 = zArr13;
                iArr3 = iArr32;
                iArr4 = iArr6;
                if (iM2494k8 == 1) {
                    int i71 = iArr11[i9];
                    for (int i72 = 0; i72 < iArr4[i9]; i72++) {
                        zArr2[i9][i72] = iArr10[i9][i72] == i71;
                    }
                    iArr3[i9] = 1;
                } else {
                    i69 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i70 = i9 + 1;
                    zArr13 = zArr2;
                    iArr32 = iArr3;
                    iArr6 = iArr4;
                }
            }
            i69 = 0;
            i70 = i9 + 1;
            zArr13 = zArr2;
            iArr32 = iArr3;
            iArr6 = iArr4;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr34 = iArr32;
        int[] iArr35 = iArr6;
        int[] iArr36 = new int[i20];
        int i73 = 2;
        int[] iArr37 = new int[2];
        iArr37[1] = i20;
        iArr37[i69] = iM2498o5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr37);
        int i74 = 1;
        int i75 = 0;
        while (i74 < iM2498o5) {
            if (iM2494k8 == i73) {
                for (int i76 = 0; i76 < iArr35[i74]; i76++) {
                    zArr14[i74][i76] = c1131v.m2493j();
                    int i77 = iArr34[i74];
                    boolean z14 = zArr14[i74][i76];
                    iArr34[i74] = i77 + (z14 ? 1 : 0);
                    if (z14) {
                        iArr33[i74] = iArr10[i74][i76];
                    }
                }
            }
            if (i75 == 0) {
                i8 = 0;
                if (iArr10[i74][0] == 0 && zArr14[i74][0]) {
                    for (int i78 = 1; i78 < iArr35[i74]; i78++) {
                        if (iArr10[i74][i78] == i49 && zArr14[i74][i49]) {
                            i75 = i74;
                        }
                    }
                }
            } else {
                i8 = 0;
            }
            int i79 = i8;
            while (i79 < iArr35[i74]) {
                if (iM2498o4 > 1) {
                    zArr15[i74][i79] = zArr14[i74][i79];
                    c0981l1 = c0981l1M2159f2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iM2619c = AbstractC1196c.m2619c(iM2498o4);
                    if (!zArr[i74][i79]) {
                        int i80 = ((C1228g) c0981l1M2159f.get(iArr10[i74][i79])).f5120a;
                        int i81 = i8;
                        while (true) {
                            if (i81 >= i79) {
                                break;
                            }
                            int i82 = i81;
                            if (zArr9[i80][((C1228g) c0981l1M2159f.get(iArr10[i74][i82])).f5120a]) {
                                zArr[i74][i79] = true;
                                break;
                            }
                            i81 = i82 + 1;
                        }
                    }
                    if (zArr[i74][i79]) {
                        if (i75 <= 0 || i74 != i75) {
                            c1131v.m2505v(iM2619c);
                        } else {
                            iArr36[i79] = c1131v.m2494k(iM2619c);
                        }
                    }
                } else {
                    c0981l1 = c0981l1M2159f2;
                    zArr = zArr15;
                }
                i79++;
                c0981l1M2159f2 = c0981l1;
                zArr15 = zArr;
            }
            C0981l1 c0981l12 = c0981l1M2159f2;
            boolean[][] zArr16 = zArr15;
            if (iArr34[i74] == 1 && iArr2[iArr33[i74]] > 0) {
                c1131v.m2504u();
            }
            i74++;
            c0981l1M2159f2 = c0981l12;
            zArr15 = zArr16;
            i73 = 2;
        }
        C0981l1 c0981l13 = c0981l1M2159f2;
        boolean[][] zArr17 = zArr15;
        if (i75 == 0) {
            return new C0022h((C0981l1) null, c1230i2, (C1230i) null, (C1230i) null);
        }
        int iM2498o6 = c1131v.m2498o();
        int i83 = iM2498o6 + 1;
        AbstractC1006u.m2188c(i83, "expectedSize");
        AbstractC1006u.m2188c(i83, "initialCapacity");
        int[] iArr38 = new int[i16];
        Object[] objArrCopyOf = new Object[i83];
        int i84 = 0;
        int i85 = 0;
        boolean z15 = false;
        while (i84 < i83) {
            int i86 = i84;
            int iM2494k9 = c1131v.m2494k(16);
            int iM2494k10 = c1131v.m2494k(16);
            boolean z16 = z15;
            if (c1131v.m2493j()) {
                iM2494k = c1131v.m2494k(2);
                if (iM2494k == 3) {
                    c1131v.m2504u();
                }
                iM2494k2 = c1131v.m2494k(4);
                iM2494k3 = c1131v.m2494k(4);
            } else {
                iM2494k = 0;
                iM2494k2 = 0;
                iM2494k3 = 0;
            }
            if (c1131v.m2493j()) {
                int iM2498o7 = c1131v.m2498o();
                int iM2498o8 = c1131v.m2498o();
                int iM2498o9 = c1131v.m2498o();
                int iM2498o10 = c1131v.m2498o();
                iM2494k9 -= (iM2498o7 + iM2498o8) * ((iM2494k == 1 || iM2494k == 2) ? 2 : 1);
                iM2494k10 -= (iM2498o9 + iM2498o10) * (iM2494k == 1 ? 2 : 1);
            }
            C1231j c1231j = new C1231j(iM2494k, iM2494k2, iM2494k3, iM2494k9, iM2494k10);
            int iM2140e = AbstractC0965g0.m2140e(objArrCopyOf.length, i85 + 1);
            if (iM2140e > objArrCopyOf.length || z16) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM2140e);
                z7 = false;
            } else {
                z7 = z16;
            }
            objArrCopyOf[i85] = c1231j;
            i85++;
            i84 = i86 + 1;
            z15 = z7;
        }
        if (i83 <= 1 || !c1131v.m2493j()) {
            for (int i87 = 1; i87 < i16; i87++) {
                iArr38[i87] = Math.min(i87, iM2498o6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iM2619c2 = AbstractC1196c.m2619c(i83);
            for (int i88 = 1; i88 < i16; i88++) {
                iArr38[i88] = c1131v.m2494k(iM2619c2);
            }
        }
        C1230i c1230i3 = new C1230i(AbstractC0983m0.m2163h(i85, objArrCopyOf), iArr38, 1);
        c1131v.m2505v(2);
        for (int i89 = 1; i89 < i16; i89++) {
            if (iArr2[iArr25[i89]] == 0) {
                c1131v.m2504u();
            }
        }
        for (int i90 = 1; i90 < iM2498o5; i90++) {
            boolean zM2493j12 = c1131v.m2493j();
            int i91 = 0;
            while (i91 < iArr31[i90]) {
                if ((i91 <= 0 || !zM2493j12) ? i91 == 0 : c1131v.m2493j()) {
                    for (int i92 = 0; i92 < iArr35[i90]; i92++) {
                        if (zArr17[i90][i92]) {
                            c1131v.m2498o();
                        }
                    }
                    c1131v.m2498o();
                    c1131v.m2498o();
                }
                i91++;
            }
        }
        int iM2498o11 = c1131v.m2498o() + 2;
        if (c1131v.m2493j()) {
            c1131v.m2505v(iM2498o11);
        } else {
            for (int i93 = 1; i93 < i16; i93++) {
                for (int i94 = 0; i94 < i93; i94++) {
                    if (zArr12[i93][i94]) {
                        c1131v.m2505v(iM2498o11);
                    }
                }
            }
        }
        int iM2498o12 = c1131v.m2498o();
        for (int i95 = 1; i95 <= iM2498o12; i95++) {
            c1131v.m2505v(8);
        }
        if (c1131v.m2493j()) {
            int i96 = c1131v.f4795e;
            if (i96 > 0) {
                c1131v.m2505v(8 - i96);
            }
            if (!c1131v.m2493j() ? c1131v.m2493j() : true) {
                c1131v.m2504u();
            }
            boolean zM2493j13 = c1131v.m2493j();
            boolean zM2493j14 = c1131v.m2493j();
            if (zM2493j13 || zM2493j14) {
                for (int i97 = 0; i97 < iM2498o2; i97++) {
                    for (int i98 = 0; i98 < iArr31[i97]; i98++) {
                        boolean zM2493j15 = zM2493j13 ? c1131v.m2493j() : false;
                        boolean zM2493j16 = zM2493j14 ? c1131v.m2493j() : false;
                        if (zM2493j15) {
                            c1131v.m2505v(32);
                        }
                        if (zM2493j16) {
                            c1131v.m2505v(18);
                        }
                    }
                }
            }
            boolean zM2493j17 = c1131v.m2493j();
            int iM2494k11 = zM2493j17 ? c1131v.m2494k(4) + 1 : i16;
            AbstractC1006u.m2188c(iM2494k11, "expectedSize");
            AbstractC1006u.m2188c(iM2494k11, "initialCapacity");
            int[] iArr39 = new int[i16];
            Object[] objArrCopyOf2 = new Object[iM2494k11];
            int i99 = 0;
            int i100 = 0;
            boolean z17 = false;
            while (i99 < iM2494k11) {
                c1131v.m2505v(3);
                int i101 = c1131v.m2493j() ? 1 : 2;
                int iM632f = C0216l.m632f(c1131v.m2494k(8));
                boolean z18 = zM2493j17;
                int iM633g = C0216l.m633g(c1131v.m2494k(8));
                c1131v.m2505v(8);
                C1234m c1234m = new C1234m(iM632f, i101, iM633g);
                int iM2140e2 = AbstractC0965g0.m2140e(objArrCopyOf2.length, i100 + 1);
                if (iM2140e2 > objArrCopyOf2.length || z17) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iM2140e2);
                    z17 = false;
                }
                objArrCopyOf2[i100] = c1234m;
                i99++;
                i100++;
                zM2493j17 = z18;
                z17 = z17;
            }
            if (zM2493j17 && iM2494k11 > 1) {
                for (int i102 = 0; i102 < i16; i102++) {
                    iArr39[i102] = c1131v.m2494k(4);
                }
            }
            c1230i = new C1230i(AbstractC0983m0.m2163h(i100, objArrCopyOf2), iArr39, 2);
        } else {
            c1230i = null;
        }
        return new C0022h(c0981l1M2159f, new C1230i(c0981l13, iArr36, 0), c1230i3, c1230i);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018c  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1236o m2688i(byte[] bArr, int i, int i4) {
        int iM2498o;
        int iM2498o2;
        int i8;
        boolean z7;
        int i9;
        int i10;
        int i11;
        int i12;
        int iM2498o3;
        boolean z8;
        boolean zM2493j;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float f8;
        int i19;
        int i20;
        int iM633g;
        boolean zM2493j2;
        boolean zM2493j3;
        int i21;
        C1131v c1131v = new C1131v(bArr, i + 1, i4);
        int iM2494k = c1131v.m2494k(8);
        int iM2494k2 = c1131v.m2494k(8);
        int iM2494k3 = c1131v.m2494k(8);
        int iM2498o4 = c1131v.m2498o();
        if (iM2494k == 100 || iM2494k == 110 || iM2494k == 122 || iM2494k == 244 || iM2494k == 44 || iM2494k == 83 || iM2494k == 86 || iM2494k == 118 || iM2494k == 128 || iM2494k == 138) {
            iM2498o = c1131v.m2498o();
            boolean zM2493j4 = iM2498o == 3 ? c1131v.m2493j() : false;
            int iM2498o5 = c1131v.m2498o();
            iM2498o2 = c1131v.m2498o();
            c1131v.m2504u();
            if (c1131v.m2493j()) {
                int i22 = iM2498o != 3 ? 8 : 12;
                i8 = 16;
                int i23 = 0;
                while (i23 < i22) {
                    if (c1131v.m2493j()) {
                        int i24 = i23 < 6 ? 16 : 64;
                        int iM2499p = 8;
                        int i25 = 8;
                        for (int i26 = 0; i26 < i24; i26++) {
                            if (iM2499p != 0) {
                                iM2499p = ((c1131v.m2499p() + i25) + 256) % 256;
                            }
                            if (iM2499p != 0) {
                                i25 = iM2499p;
                            }
                        }
                    }
                    i23++;
                }
            } else {
                i8 = 16;
            }
            z7 = zM2493j4;
            i9 = iM2498o5;
        } else {
            iM2498o = 1;
            i8 = 16;
            i9 = 0;
            z7 = false;
            iM2498o2 = 0;
        }
        int iM2498o6 = c1131v.m2498o() + 4;
        int iM2498o7 = c1131v.m2498o();
        if (iM2498o7 == 0) {
            iM2498o3 = c1131v.m2498o() + 4;
            i10 = iM2494k;
            i11 = iM2498o7;
            i12 = iM2498o2;
        } else {
            if (iM2498o7 == 1) {
                boolean zM2493j5 = c1131v.m2493j();
                c1131v.m2499p();
                c1131v.m2499p();
                i10 = iM2494k;
                long jM2498o = c1131v.m2498o();
                i11 = iM2498o7;
                for (int i27 = 0; i27 < jM2498o; i27++) {
                    c1131v.m2498o();
                }
                i12 = iM2498o2;
                z8 = zM2493j5;
                iM2498o3 = 0;
                c1131v.m2498o();
                c1131v.m2504u();
                int iM2498o8 = c1131v.m2498o() + 1;
                int iM2498o9 = c1131v.m2498o() + 1;
                zM2493j = c1131v.m2493j();
                int i28 = 2 - (zM2493j ? 1 : 0);
                int i29 = iM2498o9 * i28;
                if (!zM2493j) {
                    c1131v.m2504u();
                }
                c1131v.m2504u();
                int i30 = iM2498o8 * 16;
                int i31 = i29 * 16;
                if (c1131v.m2493j()) {
                    int iM2498o10 = c1131v.m2498o();
                    int iM2498o11 = c1131v.m2498o();
                    int iM2498o12 = c1131v.m2498o();
                    int iM2498o13 = c1131v.m2498o();
                    if (iM2498o == 0) {
                        i21 = 1;
                    } else {
                        i21 = iM2498o == 3 ? 1 : 2;
                        i28 *= iM2498o == 1 ? 2 : 1;
                    }
                    i30 -= (iM2498o10 + iM2498o11) * i21;
                    i31 -= (iM2498o12 + iM2498o13) * i28;
                }
                int i32 = i31;
                int i33 = i30;
                int i34 = i10;
                int iM2498o14 = ((i34 != 44 || i34 == 86 || i34 == 100 || i34 == 110 || i34 == 122 || i34 == 244) && (iM2494k2 & 16) != 0) ? 0 : i8;
                int iM632f = -1;
                float f9 = 1.0f;
                if (c1131v.m2493j()) {
                    i13 = iM2498o6;
                    i14 = i12;
                    i15 = iM2498o14;
                    i16 = -1;
                    i17 = -1;
                    i18 = iM2498o3;
                    f8 = 1.0f;
                    i19 = -1;
                } else if (c1131v.m2493j()) {
                    int iM2494k4 = c1131v.m2494k(8);
                    if (iM2494k4 == 255) {
                        int i35 = i8;
                        int iM2494k5 = c1131v.m2494k(i35);
                        int iM2494k6 = c1131v.m2494k(i35);
                        if (iM2494k5 != 0 && iM2494k6 != 0) {
                            f9 = iM2494k5 / iM2494k6;
                        }
                    } else if (iM2494k4 < 17) {
                        f9 = f5171b[iM2494k4];
                    } else {
                        i13 = iM2498o6;
                        AbstractC0008a1.m23s("Unexpected aspect_ratio_idc value: ", iM2494k4, "NalUnitUtil");
                        if (c1131v.m2493j()) {
                        }
                        if (c1131v.m2493j()) {
                        }
                        if (c1131v.m2493j()) {
                        }
                        if (c1131v.m2493j()) {
                        }
                        zM2493j2 = c1131v.m2493j();
                        if (zM2493j2) {
                        }
                        zM2493j3 = c1131v.m2493j();
                        if (zM2493j3) {
                        }
                        if (zM2493j2) {
                            c1131v.m2504u();
                            c1131v.m2504u();
                            if (c1131v.m2493j()) {
                            }
                            int i36 = iM632f;
                            i18 = iM2498o3;
                            f8 = f9;
                            i19 = i36;
                            i16 = i20;
                            i17 = iM633g;
                            i14 = i12;
                            i15 = iM2498o14;
                        }
                    }
                    i13 = iM2498o6;
                    if (c1131v.m2493j()) {
                    }
                    if (c1131v.m2493j()) {
                    }
                    if (c1131v.m2493j()) {
                    }
                    if (c1131v.m2493j()) {
                    }
                    zM2493j2 = c1131v.m2493j();
                    if (zM2493j2) {
                    }
                    zM2493j3 = c1131v.m2493j();
                    if (zM2493j3) {
                    }
                    if (zM2493j2) {
                    }
                } else {
                    i13 = iM2498o6;
                    if (c1131v.m2493j()) {
                        c1131v.m2504u();
                    }
                    if (c1131v.m2493j()) {
                        c1131v.m2505v(3);
                        i20 = c1131v.m2493j() ? 1 : 2;
                        if (c1131v.m2493j()) {
                            int iM2494k7 = c1131v.m2494k(8);
                            int iM2494k8 = c1131v.m2494k(8);
                            c1131v.m2505v(8);
                            iM632f = C0216l.m632f(iM2494k7);
                            iM633g = C0216l.m633g(iM2494k8);
                        } else {
                            iM633g = -1;
                        }
                    } else {
                        i20 = -1;
                        iM633g = -1;
                    }
                    if (c1131v.m2493j()) {
                        c1131v.m2498o();
                        c1131v.m2498o();
                    }
                    if (c1131v.m2493j()) {
                        c1131v.m2505v(65);
                    }
                    zM2493j2 = c1131v.m2493j();
                    if (zM2493j2) {
                        m2689j(c1131v);
                    }
                    zM2493j3 = c1131v.m2493j();
                    if (zM2493j3) {
                        m2689j(c1131v);
                    }
                    if (zM2493j2 || zM2493j3) {
                        c1131v.m2504u();
                    }
                    c1131v.m2504u();
                    if (c1131v.m2493j()) {
                        c1131v.m2504u();
                        c1131v.m2498o();
                        c1131v.m2498o();
                        c1131v.m2498o();
                        c1131v.m2498o();
                        iM2498o14 = c1131v.m2498o();
                        c1131v.m2498o();
                    }
                    int i362 = iM632f;
                    i18 = iM2498o3;
                    f8 = f9;
                    i19 = i362;
                    i16 = i20;
                    i17 = iM633g;
                    i14 = i12;
                    i15 = iM2498o14;
                }
                return new C1236o(i34, iM2494k2, iM2494k3, iM2498o4, i33, i32, f8, i9, i14, z7, zM2493j, i13, i11, i18, z8, i19, i16, i17, i15);
            }
            i10 = iM2494k;
            i11 = iM2498o7;
            i12 = iM2498o2;
            iM2498o3 = 0;
        }
        z8 = false;
        c1131v.m2498o();
        c1131v.m2504u();
        int iM2498o82 = c1131v.m2498o() + 1;
        int iM2498o92 = c1131v.m2498o() + 1;
        zM2493j = c1131v.m2493j();
        int i282 = 2 - (zM2493j ? 1 : 0);
        int i292 = iM2498o92 * i282;
        if (!zM2493j) {
        }
        c1131v.m2504u();
        int i302 = iM2498o82 * 16;
        int i312 = i292 * 16;
        if (c1131v.m2493j()) {
        }
        int i322 = i312;
        int i332 = i302;
        int i342 = i10;
        if (i342 != 44) {
        }
        int iM632f2 = -1;
        float f92 = 1.0f;
        if (c1131v.m2493j()) {
        }
        return new C1236o(i342, iM2494k2, iM2494k3, iM2498o4, i332, i322, f8, i9, i14, z7, zM2493j, i13, i11, i18, z8, i19, i16, i17, i15);
    }

    /* renamed from: j */
    public static void m2689j(C1131v c1131v) {
        int iM2498o = c1131v.m2498o() + 1;
        c1131v.m2505v(8);
        for (int i = 0; i < iM2498o; i++) {
            c1131v.m2498o();
            c1131v.m2498o();
            c1131v.m2504u();
        }
        c1131v.m2505v(20);
    }

    /* renamed from: k */
    public static int m2690k(byte[] bArr, int i) {
        int i4;
        synchronized (f5172c) {
            int i8 = 0;
            int i9 = 0;
            while (i8 < i) {
                while (true) {
                    if (i8 >= i - 2) {
                        i8 = i;
                        break;
                    }
                    try {
                        if (bArr[i8] == 0 && bArr[i8 + 1] == 0 && bArr[i8 + 2] == 3) {
                            break;
                        }
                        i8++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i8 < i) {
                    int[] iArr = f5173d;
                    if (iArr.length <= i9) {
                        f5173d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f5173d[i9] = i8;
                    i8 += 3;
                    i9++;
                }
            }
            i4 = i - i9;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < i9; i12++) {
                int i13 = f5173d[i12] - i11;
                System.arraycopy(bArr, i11, bArr, i10, i13);
                int i14 = i10 + i13;
                int i15 = i14 + 1;
                bArr[i14] = 0;
                i10 = i14 + 2;
                bArr[i15] = 0;
                i11 += i13 + 3;
            }
            System.arraycopy(bArr, i11, bArr, i10, i4 - i10);
        }
        return i4;
    }
}
