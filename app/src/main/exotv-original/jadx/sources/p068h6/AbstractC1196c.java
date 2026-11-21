package p068h6;

import com.bumptech.glide.AbstractC0715d;
import java.math.RoundingMode;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h6.c */
/* loaded from: classes.dex */
public abstract class AbstractC1196c {

    /* renamed from: a */
    public static final /* synthetic */ int f5074a = 0;

    static {
        Math.log(2.0d);
    }

    /* renamed from: a */
    public static boolean m2617a(double d8) {
        if (AbstractC0715d.m1549R(d8)) {
            return d8 == 0.0d || 52 - Long.numberOfTrailingZeros(AbstractC0715d.m1543E(d8)) <= Math.getExponent(d8);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m2618b(double d8) {
        if (d8 > 0.0d && AbstractC0715d.m1549R(d8)) {
            long jM1543E = AbstractC0715d.m1543E(d8);
            if ((jM1543E & (jM1543E - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2619c(double d8) {
        boolean zM2618b;
        RoundingMode roundingMode = RoundingMode.CEILING;
        if (!(d8 > 0.0d && AbstractC0715d.m1549R(d8))) {
            throw new IllegalArgumentException("x must be positive and finite");
        }
        int exponent = Math.getExponent(d8);
        if (Math.getExponent(d8) < -1022) {
            return m2619c(d8 * 4.503599627370496E15d) - 52;
        }
        switch (AbstractC1195b.f5073a[roundingMode.ordinal()]) {
            case 1:
                if (!m2618b(d8)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                return !z ? exponent + 1 : exponent;
            case 2:
                if (!z) {
                }
                break;
            case 3:
                z = !m2618b(d8);
                if (!z) {
                }
                break;
            case 4:
                z = exponent < 0;
                zM2618b = m2618b(d8);
                z &= !zM2618b;
                if (!z) {
                }
                break;
            case 5:
                z = exponent >= 0;
                zM2618b = m2618b(d8);
                z &= !zM2618b;
                if (!z) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d8) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z = true;
                }
                if (!z) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}
