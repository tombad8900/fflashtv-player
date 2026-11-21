package p037e0;

import android.graphics.Color;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0850a {

    /* renamed from: a */
    public static final ThreadLocal f3767a = new ThreadLocal();

    /* renamed from: a */
    public static int m2016a(double d8, double d9, double d10) {
        double d11 = (((-0.4986d) * d10) + (((-1.5372d) * d9) + (3.2406d * d8))) / 100.0d;
        double d12 = ((0.0415d * d10) + ((1.8758d * d9) + ((-0.9689d) * d8))) / 100.0d;
        double d13 = ((1.057d * d10) + (((-0.204d) * d9) + (0.0557d * d8))) / 100.0d;
        double dPow = d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d;
        double dPow2 = d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d;
        double dPow3 = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    /* renamed from: b */
    public static int m2017b(int i, int i4) {
        int iAlpha = Color.alpha(i4);
        int iAlpha2 = Color.alpha(i);
        int i8 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i8, m2018c(Color.red(i), iAlpha2, Color.red(i4), iAlpha, i8), m2018c(Color.green(i), iAlpha2, Color.green(i4), iAlpha, i8), m2018c(Color.blue(i), iAlpha2, Color.blue(i4), iAlpha, i8));
    }

    /* renamed from: c */
    public static int m2018c(int i, int i4, int i8, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        return (((255 - i4) * (i8 * i9)) + ((i * 255) * i4)) / (i10 * 255);
    }

    /* renamed from: d */
    public static int m2019d(int i, int i4) {
        if (i4 < 0 || i4 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i4 << 24);
    }
}
