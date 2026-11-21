package p029d0;

import android.graphics.Color;
import p037e0.AbstractC0850a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d0.a */
/* loaded from: classes.dex */
public final class C0785a {

    /* renamed from: a */
    public final float f3537a;

    /* renamed from: b */
    public final float f3538b;

    /* renamed from: c */
    public final float f3539c;

    /* renamed from: d */
    public final float f3540d;

    /* renamed from: e */
    public final float f3541e;

    /* renamed from: f */
    public final float f3542f;

    public C0785a(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.f3537a = f8;
        this.f3538b = f9;
        this.f3539c = f10;
        this.f3540d = f11;
        this.f3541e = f12;
        this.f3542f = f13;
    }

    /* renamed from: a */
    public static C0785a m1929a(int i) {
        C0796l c0796l = C0796l.f3571k;
        float fM1935e = AbstractC0786b.m1935e(Color.red(i));
        float fM1935e2 = AbstractC0786b.m1935e(Color.green(i));
        float fM1935e3 = AbstractC0786b.m1935e(Color.blue(i));
        float[][] fArr = AbstractC0786b.f3546d;
        float[] fArr2 = fArr[0];
        float f8 = (fArr2[2] * fM1935e3) + (fArr2[1] * fM1935e2) + (fArr2[0] * fM1935e);
        float[] fArr3 = fArr[1];
        float f9 = (fArr3[2] * fM1935e3) + (fArr3[1] * fM1935e2) + (fArr3[0] * fM1935e);
        float[] fArr4 = fArr[2];
        float f10 = (fM1935e3 * fArr4[2]) + (fM1935e2 * fArr4[1]) + (fM1935e * fArr4[0]);
        float[][] fArr5 = AbstractC0786b.f3543a;
        float[] fArr6 = fArr5[0];
        float f11 = (fArr6[2] * f10) + (fArr6[1] * f9) + (fArr6[0] * f8);
        float[] fArr7 = fArr5[1];
        float f12 = (fArr7[2] * f10) + (fArr7[1] * f9) + (fArr7[0] * f8);
        float[] fArr8 = fArr5[2];
        float f13 = (f10 * fArr8[2]) + (f9 * fArr8[1]) + (f8 * fArr8[0]);
        float[] fArr9 = c0796l.f3578g;
        float f14 = c0796l.f3580i;
        float f15 = c0796l.f3575d;
        float f16 = c0796l.f3572a;
        float f17 = fArr9[0] * f11;
        float f18 = fArr9[1] * f12;
        float f19 = fArr9[2] * f13;
        float f20 = c0796l.f3579h;
        float fPow = (float) Math.pow((Math.abs(f17) * f20) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f18) * f20) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f19) * f20) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f17) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f18) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f19) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d8 = fSignum3;
        float f21 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d8)) / 11.0f;
        float f22 = ((float) ((fSignum + fSignum2) - (d8 * 2.0d))) / 9.0f;
        float f23 = fSignum2 * 20.0f;
        float f24 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f23)) / 20.0f;
        float f25 = (((fSignum * 40.0f) + f23) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f26 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f25 * c0796l.f3573b) / f16, c0796l.f3581j * f15)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f27 = f16 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0796l.f3577f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0796l.f3576e) * c0796l.f3574c) * ((float) Math.sqrt((f22 * f22) + (f21 * f21)))) / (f24 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        Math.sqrt((r0 * f15) / f27);
        float f28 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f14 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d9 = f26;
        return new C0785a(fAtan2, fPow5, fPow4, f28, fLog * ((float) Math.cos(d9)), fLog * ((float) Math.sin(d9)));
    }

    /* renamed from: b */
    public static C0785a m1930b(float f8, float f9, float f10) {
        C0796l c0796l = C0796l.f3571k;
        float f11 = c0796l.f3575d;
        Math.sqrt(f8 / 100.0d);
        float f12 = c0796l.f3572a + 4.0f;
        float f13 = c0796l.f3580i * f9;
        Math.sqrt(((f9 / ((float) Math.sqrt(r1))) * c0796l.f3575d) / f12);
        float f14 = (1.7f * f8) / ((0.007f * f8) + 1.0f);
        float fLog = ((float) Math.log((f13 * 0.0228d) + 1.0d)) * 43.85965f;
        double d8 = (3.1415927f * f10) / 180.0f;
        return new C0785a(f10, f9, f8, f14, fLog * ((float) Math.cos(d8)), fLog * ((float) Math.sin(d8)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m1931c(C0796l c0796l) {
        float fSqrt;
        float f8 = this.f3538b;
        double d8 = f8;
        float f9 = this.f3539c;
        if (d8 != 0.0d) {
            double d9 = f9;
            fSqrt = d9 == 0.0d ? 0.0f : f8 / ((float) Math.sqrt(d9 / 100.0d));
        }
        float f10 = c0796l.f3577f;
        float f11 = c0796l.f3579h;
        float fPow = (float) Math.pow(fSqrt / Math.pow(1.64d - Math.pow(0.29d, f10), 0.73d), 1.1111111111111112d);
        double d10 = (this.f3537a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d10) + 3.8d)) * 0.25f;
        float fPow2 = c0796l.f3572a * ((float) Math.pow(f9 / 100.0d, (1.0d / c0796l.f3575d) / c0796l.f3581j));
        float f12 = fCos * 3846.1538f * c0796l.f3576e * c0796l.f3574c;
        float f13 = fPow2 / c0796l.f3573b;
        float fSin = (float) Math.sin(d10);
        float fCos2 = (float) Math.cos(d10);
        float f14 = (((0.305f + f13) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f12 * 23.0f)));
        float f15 = fCos2 * f14;
        float f16 = f14 * fSin;
        float f17 = f13 * 460.0f;
        float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
        float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
        float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
        float f21 = 100.0f / f11;
        float fSignum = Math.signum(f18) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
        float fSignum2 = Math.signum(f19) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
        float fSignum3 = Math.signum(f20) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
        float[] fArr = c0796l.f3578g;
        float f22 = fSignum / fArr[0];
        float f23 = fSignum2 / fArr[1];
        float f24 = fSignum3 / fArr[2];
        float[][] fArr2 = AbstractC0786b.f3544b;
        float[] fArr3 = fArr2[0];
        float f25 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
        float[] fArr4 = fArr2[1];
        float f26 = (fArr4[2] * f24) + (fArr4[1] * f23) + (fArr4[0] * f22);
        float[] fArr5 = fArr2[2];
        return AbstractC0850a.m2016a(f25, f26, (f24 * fArr5[2]) + (f23 * fArr5[1]) + (f22 * fArr5[0]));
    }
}
