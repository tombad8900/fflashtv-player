package p037e0;

import android.graphics.Path;
import android.util.Log;
import com.bumptech.glide.AbstractC0714c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e0.d */
/* loaded from: classes.dex */
public final class C0853d {

    /* renamed from: a */
    public char f3774a;

    /* renamed from: b */
    public final float[] f3775b;

    public C0853d(char c8, float[] fArr) {
        this.f3774a = c8;
        this.f3775b = fArr;
    }

    /* renamed from: a */
    public static void m2025a(Path path, float f8, float f9, float f10, float f11, float f12, float f13, float f14, boolean z7, boolean z8) {
        double d8;
        double d9;
        double radians = Math.toRadians(f14);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = f8;
        double d11 = f9;
        double d12 = f12;
        double d13 = ((d11 * dSin) + (d10 * dCos)) / d12;
        double d14 = f13;
        double d15 = ((d11 * dCos) + ((-f8) * dSin)) / d14;
        double d16 = f11;
        double d17 = ((d16 * dSin) + (f10 * dCos)) / d12;
        double d18 = ((d16 * dCos) + ((-f10) * dSin)) / d14;
        double d19 = d13 - d17;
        double d20 = d15 - d18;
        double d21 = (d13 + d17) / 2.0d;
        double d22 = (d15 + d18) / 2.0d;
        double d23 = (d20 * d20) + (d19 * d19);
        if (d23 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d24 = (1.0d / d23) - 0.25d;
        if (d24 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d23);
            float fSqrt = (float) (Math.sqrt(d23) / 1.99999d);
            m2025a(path, f8, f9, f10, f11, f12 * fSqrt, fSqrt * f13, f14, z7, z8);
            return;
        }
        double dSqrt = Math.sqrt(d24);
        double d25 = dSqrt * d19;
        double d26 = dSqrt * d20;
        if (z7 == z8) {
            d8 = d21 - d26;
            d9 = d22 + d25;
        } else {
            d8 = d21 + d26;
            d9 = d22 - d25;
        }
        double dAtan2 = Math.atan2(d15 - d9, d13 - d8);
        double dAtan22 = Math.atan2(d18 - d9, d17 - d8) - dAtan2;
        if (z8 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d27 = d8 * d12;
        double d28 = d9 * d14;
        double d29 = (d27 * dCos) - (d28 * dSin);
        double d30 = (d28 * dCos) + (d27 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = -d12;
        double d32 = d31 * dCos2;
        double d33 = d14 * dSin2;
        double d34 = (d32 * dSin3) - (d33 * dCos3);
        double d35 = d31 * dSin2;
        double d36 = d14 * dCos2;
        double d37 = dAtan22 / iCeil;
        double d38 = (dCos3 * d36) + (dSin3 * d35);
        double d39 = d10;
        double d40 = d11;
        int i = 0;
        double d41 = dAtan2;
        while (i < iCeil) {
            double d42 = d41 + d37;
            double dSin4 = Math.sin(d42);
            double dCos4 = Math.cos(d42);
            int i4 = iCeil;
            double d43 = (((d12 * dCos2) * dCos4) + d29) - (d33 * dSin4);
            double d44 = (d36 * dSin4) + (d12 * dSin2 * dCos4) + d30;
            double d45 = (d32 * dSin4) - (d33 * dCos4);
            double d46 = (dCos4 * d36) + (dSin4 * d35);
            double d47 = d42 - d41;
            double dTan = Math.tan(d47 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d34 * dSqrt2) + d39), (float) ((d38 * dSqrt2) + d40), (float) (d43 - (dSqrt2 * d45)), (float) (d44 - (dSqrt2 * d46)), (float) d43, (float) d44);
            i++;
            d40 = d44;
            dCos2 = dCos2;
            d35 = d35;
            d41 = d42;
            d38 = d46;
            d39 = d43;
            iCeil = i4;
            d34 = d45;
            d37 = d37;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m2026b(C0853d[] c0853dArr, Path path) {
        int i;
        float[] fArr;
        int i4;
        C0853d c0853d;
        int i8;
        char c8;
        float f8;
        float f9;
        C0853d c0853d2;
        boolean z7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        C0853d[] c0853dArr2 = c0853dArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = c0853dArr2.length;
        int i9 = 0;
        int i10 = 0;
        char c9 = 'm';
        while (i10 < length) {
            C0853d c0853d3 = c0853dArr2[i10];
            char c10 = c0853d3.f3774a;
            float[] fArr3 = c0853d3.f3775b;
            float f18 = fArr2[i9];
            float f19 = fArr2[1];
            float f20 = fArr2[2];
            float f21 = fArr2[3];
            float f22 = fArr2[4];
            int i11 = i9;
            float f23 = fArr2[5];
            switch (c10) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f22, f23);
                    f18 = f22;
                    f20 = f18;
                    f19 = f23;
                    f21 = f19;
                default:
                    i = 2;
                    break;
            }
            float f24 = f22;
            float f25 = f23;
            float f26 = f18;
            float f27 = f19;
            int i12 = i11;
            while (i12 < fArr3.length) {
                if (c10 == 'A') {
                    fArr = fArr3;
                    i4 = i12;
                    c0853d = c0853d3;
                    float f28 = f26;
                    float f29 = f27;
                    i8 = i10;
                    c8 = c10;
                    int i13 = i4 + 5;
                    int i14 = i4 + 6;
                    m2025a(path, f28, f29, fArr[i13], fArr[i14], fArr[i4], fArr[i4 + 1], fArr[i4 + 2], fArr[i4 + 3] != 0.0f ? 1 : i11, fArr[i4 + 4] != 0.0f ? 1 : i11);
                    f20 = fArr[i13];
                    f8 = fArr[i14];
                    f21 = f8;
                    f9 = f20;
                } else if (c10 == 'C') {
                    fArr = fArr3;
                    i4 = i12;
                    i8 = i10;
                    c0853d = c0853d3;
                    c8 = c10;
                    int i15 = i4 + 2;
                    int i16 = i4 + 3;
                    int i17 = i4 + 4;
                    int i18 = i4 + 5;
                    path2.cubicTo(fArr[i4], fArr[i4 + 1], fArr[i15], fArr[i16], fArr[i17], fArr[i18]);
                    float f30 = fArr[i17];
                    float f31 = fArr[i18];
                    f20 = fArr[i15];
                    f21 = fArr[i16];
                    f8 = f31;
                    f9 = f30;
                } else if (c10 == 'H') {
                    fArr = fArr3;
                    i4 = i12;
                    c0853d = c0853d3;
                    c8 = c10;
                    f8 = f27;
                    i8 = i10;
                    path2.lineTo(fArr[i4], f8);
                    f9 = fArr[i4];
                } else if (c10 == 'Q') {
                    fArr = fArr3;
                    i4 = i12;
                    i8 = i10;
                    c0853d = c0853d3;
                    c8 = c10;
                    int i19 = i4 + 1;
                    int i20 = i4 + 2;
                    int i21 = i4 + 3;
                    path2.quadTo(fArr[i4], fArr[i19], fArr[i20], fArr[i21]);
                    float f32 = fArr[i4];
                    float f33 = fArr[i19];
                    float f34 = fArr[i20];
                    float f35 = fArr[i21];
                    f20 = f32;
                    f21 = f33;
                    f9 = f34;
                    f8 = f35;
                } else if (c10 == 'V') {
                    fArr = fArr3;
                    i4 = i12;
                    i8 = i10;
                    c0853d = c0853d3;
                    f9 = f26;
                    c8 = c10;
                    path2.lineTo(f9, fArr[i4]);
                    f8 = fArr[i4];
                } else if (c10 != 'a') {
                    if (c10 == 'c') {
                        fArr = fArr3;
                        i4 = i12;
                        int i22 = i4 + 2;
                        int i23 = i4 + 3;
                        int i24 = i4 + 4;
                        int i25 = i4 + 5;
                        path2.rCubicTo(fArr[i4], fArr[i4 + 1], fArr[i22], fArr[i23], fArr[i24], fArr[i25]);
                        float f36 = fArr[i22] + f26;
                        float f37 = fArr[i23] + f27;
                        f26 += fArr[i24];
                        f27 += fArr[i25];
                        f20 = f36;
                        f21 = f37;
                    } else if (c10 != 'h') {
                        if (c10 != 'q') {
                            if (c10 != 'v') {
                                if (c10 == 'L') {
                                    fArr = fArr3;
                                    i4 = i12;
                                    int i26 = i4 + 1;
                                    path2.lineTo(fArr[i4], fArr[i26]);
                                    f9 = fArr[i4];
                                    f8 = fArr[i26];
                                } else if (c10 == 'M') {
                                    fArr = fArr3;
                                    i4 = i12;
                                    f9 = fArr[i4];
                                    f8 = fArr[i4 + 1];
                                    if (i4 > 0) {
                                        path2.lineTo(f9, f8);
                                    } else {
                                        path2.moveTo(f9, f8);
                                        f24 = f9;
                                        f25 = f8;
                                    }
                                } else if (c10 != 'S') {
                                    if (c10 == 'T') {
                                        fArr = fArr3;
                                        i4 = i12;
                                        if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                            f26 = (f26 * 2.0f) - f20;
                                            f27 = (f27 * 2.0f) - f21;
                                        }
                                        int i27 = i4 + 1;
                                        path2.quadTo(f26, f27, fArr[i4], fArr[i27]);
                                        f9 = fArr[i4];
                                        f8 = fArr[i27];
                                        c0853d = c0853d3;
                                        f20 = f26;
                                        f21 = f27;
                                    } else if (c10 == 'l') {
                                        fArr = fArr3;
                                        i4 = i12;
                                        int i28 = i4 + 1;
                                        path2.rLineTo(fArr[i4], fArr[i28]);
                                        f26 += fArr[i4];
                                        f13 = fArr[i28];
                                    } else if (c10 == 'm') {
                                        fArr = fArr3;
                                        i4 = i12;
                                        float f38 = fArr[i4];
                                        f26 += f38;
                                        float f39 = fArr[i4 + 1];
                                        f27 += f39;
                                        if (i4 > 0) {
                                            path2.rLineTo(f38, f39);
                                        } else {
                                            path2.rMoveTo(f38, f39);
                                            c0853d = c0853d3;
                                            f9 = f26;
                                            f24 = f9;
                                            f8 = f27;
                                            f25 = f8;
                                        }
                                    } else if (c10 != 's') {
                                        if (c10 != 't') {
                                            fArr = fArr3;
                                            i4 = i12;
                                            c0853d = c0853d3;
                                            f9 = f26;
                                        } else {
                                            if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                f16 = f26 - f20;
                                                f17 = f27 - f21;
                                            } else {
                                                f17 = 0.0f;
                                                f16 = 0.0f;
                                            }
                                            int i29 = i12 + 1;
                                            path2.rQuadTo(f16, f17, fArr3[i12], fArr3[i29]);
                                            float f40 = f16 + f26;
                                            float f41 = f17 + f27;
                                            float f42 = f26 + fArr3[i12];
                                            f27 += fArr3[i29];
                                            f21 = f41;
                                            fArr = fArr3;
                                            i4 = i12;
                                            c0853d = c0853d3;
                                            f9 = f42;
                                            f20 = f40;
                                        }
                                        f8 = f27;
                                    } else {
                                        if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                            f14 = f27 - f21;
                                            f15 = f26 - f20;
                                        } else {
                                            f15 = 0.0f;
                                            f14 = 0.0f;
                                        }
                                        int i30 = i12;
                                        int i31 = i30 + 1;
                                        int i32 = i30 + 2;
                                        int i33 = i30 + 3;
                                        fArr = fArr3;
                                        i4 = i30;
                                        path2.rCubicTo(f15, f14, fArr3[i30], fArr3[i31], fArr3[i32], fArr3[i33]);
                                        f10 = fArr[i4] + f26;
                                        f11 = fArr[i31] + f27;
                                        f26 += fArr[i32];
                                        f12 = fArr[i33];
                                    }
                                    i8 = i10;
                                    c8 = c10;
                                } else {
                                    fArr = fArr3;
                                    i4 = i12;
                                    if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                        f26 = (f26 * 2.0f) - f20;
                                        f27 = (f27 * 2.0f) - f21;
                                    }
                                    float f43 = f26;
                                    float f44 = f27;
                                    int i34 = i4 + 1;
                                    int i35 = i4 + 2;
                                    int i36 = i4 + 3;
                                    path2.cubicTo(f43, f44, fArr[i4], fArr[i34], fArr[i35], fArr[i36]);
                                    f20 = fArr[i4];
                                    f21 = fArr[i34];
                                    f9 = fArr[i35];
                                    f8 = fArr[i36];
                                }
                                i8 = i10;
                                c0853d = c0853d3;
                                c8 = c10;
                            } else {
                                fArr = fArr3;
                                i4 = i12;
                                path2.rLineTo(0.0f, fArr[i4]);
                                f13 = fArr[i4];
                            }
                            f27 += f13;
                        } else {
                            fArr = fArr3;
                            i4 = i12;
                            int i37 = i4 + 1;
                            int i38 = i4 + 2;
                            int i39 = i4 + 3;
                            path2.rQuadTo(fArr[i4], fArr[i37], fArr[i38], fArr[i39]);
                            f10 = fArr[i4] + f26;
                            f11 = fArr[i37] + f27;
                            f26 += fArr[i38];
                            f12 = fArr[i39];
                        }
                        f27 += f12;
                        f20 = f10;
                        f21 = f11;
                    } else {
                        fArr = fArr3;
                        i4 = i12;
                        path2.rLineTo(fArr[i4], 0.0f);
                        f26 += fArr[i4];
                    }
                    c0853d = c0853d3;
                    f9 = f26;
                    f8 = f27;
                    i8 = i10;
                    c8 = c10;
                } else {
                    fArr = fArr3;
                    i4 = i12;
                    int i40 = i4 + 5;
                    float f45 = fArr[i40] + f26;
                    int i41 = i4 + 6;
                    float f46 = fArr[i41] + f27;
                    float f47 = fArr[i4];
                    float f48 = fArr[i4 + 1];
                    float f49 = fArr[i4 + 2];
                    if (fArr[i4 + 3] != 0.0f) {
                        c0853d2 = c0853d3;
                        z7 = 1;
                    } else {
                        c0853d2 = c0853d3;
                        z7 = i11;
                    }
                    c0853d = c0853d2;
                    float f50 = f26;
                    c8 = c10;
                    float f51 = f27;
                    i8 = i10;
                    m2025a(path, f50, f51, f45, f46, f47, f48, f49, z7, fArr[i4 + 4] != 0.0f ? 1 : i11);
                    f9 = f50 + fArr[i40];
                    f8 = f51 + fArr[i41];
                    f20 = f9;
                    f21 = f8;
                }
                i12 = i4 + i;
                path2 = path;
                c0853d3 = c0853d;
                c10 = c8;
                i10 = i8;
                f26 = f9;
                f27 = f8;
                c9 = c10;
                fArr3 = fArr;
            }
            fArr2[i11] = f26;
            fArr2[1] = f27;
            fArr2[2] = f20;
            fArr2[3] = f21;
            fArr2[4] = f24;
            fArr2[5] = f25;
            c9 = c0853d3.f3774a;
            i10++;
            c0853dArr2 = c0853dArr;
            path2 = path;
            i9 = i11;
        }
    }

    public C0853d(C0853d c0853d) {
        this.f3774a = c0853d.f3774a;
        float[] fArr = c0853d.f3775b;
        this.f3775b = AbstractC0714c.m1536v(fArr, fArr.length);
    }
}
