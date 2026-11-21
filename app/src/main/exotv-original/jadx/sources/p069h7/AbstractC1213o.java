package p069h7;

import android.support.v4.media.session.AbstractC0120b;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h7.o */
/* loaded from: classes.dex */
public abstract class AbstractC1213o extends AbstractC1212n {
    /* renamed from: j0 */
    public static Integer m2657j0(int i, String str) {
        boolean z7;
        int i4;
        int i8;
        AbstractC2980h.m5136e("<this>", str);
        AbstractC0120b.m411g(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char cCharAt = str.charAt(0);
        int i10 = -2147483647;
        if (AbstractC2980h.m5137f(cCharAt, 48) < 0) {
            i4 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z7 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i10 = Integer.MIN_VALUE;
                z7 = true;
            }
        } else {
            z7 = false;
            i4 = 0;
        }
        int i11 = -59652323;
        while (i4 < length) {
            int iDigit = Character.digit((int) str.charAt(i4), i);
            if (iDigit < 0) {
                return null;
            }
            if ((i9 < i11 && (i11 != -59652323 || i9 < (i11 = i10 / i))) || (i8 = i9 * i) < i10 + iDigit) {
                return null;
            }
            i9 = i8 - iDigit;
            i4++;
        }
        return z7 ? Integer.valueOf(i9) : Integer.valueOf(-i9);
    }

    /* renamed from: k0 */
    public static Integer m2658k0(String str) {
        AbstractC2980h.m5136e("<this>", str);
        return m2657j0(10, str);
    }

    /* renamed from: l0 */
    public static Long m2659l0(String str) {
        boolean z7;
        AbstractC2980h.m5136e("<this>", str);
        AbstractC0120b.m411g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (AbstractC2980h.m5137f(cCharAt, 48) < 0) {
            z7 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z7 = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z7 = false;
        }
        long j8 = 0;
        long j9 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j8 < j9) {
                if (j9 != -256204778801521550L) {
                    return null;
                }
                j9 = j / 10;
                if (j8 < j9) {
                    return null;
                }
            }
            long j10 = j8 * 10;
            long j11 = iDigit;
            if (j10 < j + j11) {
                return null;
            }
            j8 = j10 - j11;
            i++;
        }
        return z7 ? Long.valueOf(j8) : Long.valueOf(-j8);
    }
}
