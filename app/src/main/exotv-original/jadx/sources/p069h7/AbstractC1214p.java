package p069h7;

import okhttp3.C2181z;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h7.p */
/* loaded from: classes.dex */
public abstract class AbstractC1214p extends AbstractC1213o {
    /* renamed from: m0 */
    public static boolean m2660m0(String str, String str2, boolean z7) {
        AbstractC2980h.m5136e("<this>", str);
        AbstractC2980h.m5136e("suffix", str2);
        return !z7 ? str.endsWith(str2) : m2662o0(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    /* renamed from: n0 */
    public static boolean m2661n0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    /* renamed from: o0 */
    public static final boolean m2662o0(int i, int i4, int i8, String str, String str2, boolean z7) {
        AbstractC2980h.m5136e("<this>", str);
        AbstractC2980h.m5136e("other", str2);
        return !z7 ? str.regionMatches(i, str2, i4, i8) : str.regionMatches(z7, i, str2, i4, i8);
    }

    /* renamed from: p0 */
    public static String m2663p0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
        if (i == 1) {
            return "=";
        }
        char cCharAt = "=".charAt(0);
        char[] cArr = new char[i];
        for (int i4 = 0; i4 < i; i4++) {
            cArr[i4] = cCharAt;
        }
        return new String(cArr);
    }

    /* renamed from: q0 */
    public static String m2664q0(String str, char c8, char c9) {
        AbstractC2980h.m5136e("<this>", str);
        String strReplace = str.replace(c8, c9);
        AbstractC2980h.m5135d("replace(...)", strReplace);
        return strReplace;
    }

    /* renamed from: r0 */
    public static String m2665r0(String str, String str2, String str3) {
        AbstractC2980h.m5136e("<this>", str);
        int iM2653y0 = AbstractC1206h.m2653y0(str, str2, 0, false);
        if (iM2653y0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i4 = 0;
        do {
            sb.append((CharSequence) str, i4, iM2653y0);
            sb.append(str3);
            i4 = iM2653y0 + length;
            if (iM2653y0 >= str.length()) {
                break;
            }
            iM2653y0 = AbstractC1206h.m2653y0(str, str2, iM2653y0 + i, false);
        } while (iM2653y0 > 0);
        sb.append((CharSequence) str, i4, str.length());
        String string = sb.toString();
        AbstractC2980h.m5135d("toString(...)", string);
        return string;
    }

    /* renamed from: s0 */
    public static boolean m2666s0(String str, String str2, int i, boolean z7) {
        AbstractC2980h.m5136e("<this>", str);
        return !z7 ? str.startsWith(str2, i) : m2662o0(i, 0, str2.length(), str, str2, z7);
    }

    /* renamed from: t0 */
    public static boolean m2667t0(String str, String str2, boolean z7) {
        AbstractC2980h.m5136e("<this>", str);
        AbstractC2980h.m5136e("prefix", str2);
        return !z7 ? str.startsWith(str2) : m2662o0(0, 0, str2.length(), str, str2, z7);
    }
}
