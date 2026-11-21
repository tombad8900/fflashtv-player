package p069h7;

import android.support.v4.media.session.AbstractC0120b;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p044e7.C0924a;
import p044e7.C0926c;
import p061g7.C1058e;
import p061g7.C1066m;
import p111m6.AbstractC1912g;
import p111m6.AbstractC1915j;
import p220z6.AbstractC2980h;

/* renamed from: h7.h */
/* loaded from: classes.dex */
public abstract class AbstractC1206h extends AbstractC1214p {
    /* renamed from: A0 */
    public static int m2627A0(CharSequence charSequence, char c8, int i, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        AbstractC2980h.m5136e("<this>", charSequence);
        return !(charSequence instanceof String) ? m2629C0(charSequence, new char[]{c8}, i, false) : ((String) charSequence).indexOf(c8, i);
    }

    /* renamed from: B0 */
    public static /* synthetic */ int m2628B0(CharSequence charSequence, String str, int i, boolean z7, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            z7 = false;
        }
        return m2653y0(charSequence, str, i, z7);
    }

    /* renamed from: C0 */
    public static final int m2629C0(CharSequence charSequence, char[] cArr, int i, boolean z7) {
        AbstractC2980h.m5136e("<this>", charSequence);
        if (!z7 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC1912g.m3734r0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int iM2652x0 = m2652x0(charSequence);
        if (i > iM2652x0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c8 : cArr) {
                if (AbstractC0120b.m423s(c8, cCharAt, z7)) {
                    return i;
                }
            }
            if (i == iM2652x0) {
                return -1;
            }
            i++;
        }
    }

    /* renamed from: D0 */
    public static boolean m2630D0(CharSequence charSequence) {
        AbstractC2980h.m5136e("<this>", charSequence);
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC0120b.m429y(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E0 */
    public static int m2631E0(CharSequence charSequence, char c8, int i, int i4) {
        if ((i4 & 2) != 0) {
            i = m2652x0(charSequence);
        }
        AbstractC2980h.m5136e("<this>", charSequence);
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c8, i);
        }
        char[] cArr = {c8};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(AbstractC1912g.m3734r0(cArr), i);
        }
        int iM2652x0 = m2652x0(charSequence);
        if (i > iM2652x0) {
            i = iM2652x0;
        }
        while (-1 < i) {
            if (AbstractC0120b.m423s(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* renamed from: F0 */
    public static String m2632F0(int i, String str) {
        CharSequence charSequenceSubSequence;
        AbstractC2980h.m5136e("<this>", str);
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m14j("Desired length ", i, " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i4 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* renamed from: G0 */
    public static String m2633G0(String str) {
        CharSequence charSequenceSubSequence;
        if (8 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(8);
            int length = 8 - str.length();
            int i = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* renamed from: H0 */
    public static final boolean m2634H0(CharSequence charSequence, int i, CharSequence charSequence2, int i4, int i8, boolean z7) {
        AbstractC2980h.m5136e("<this>", charSequence);
        AbstractC2980h.m5136e("other", charSequence2);
        if (i4 < 0 || i < 0 || i > charSequence.length() - i8 || i4 > charSequence2.length() - i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (!AbstractC0120b.m423s(charSequence.charAt(i + i9), charSequence2.charAt(i4 + i9), z7)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I0 */
    public static String m2635I0(String str, String str2) {
        AbstractC2980h.m5136e("<this>", str);
        if (!AbstractC1214p.m2667t0(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        AbstractC2980h.m5135d("substring(...)", strSubstring);
        return strSubstring;
    }

    /* renamed from: J0 */
    public static final List m2636J0(CharSequence charSequence, String str) {
        int iM2653y0 = m2653y0(charSequence, str, 0, false);
        if (iM2653y0 == -1) {
            return AbstractC0715d.m1551T(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM2653y0).toString());
            length = str.length() + iM2653y0;
            iM2653y0 = m2653y0(charSequence, str, length, false);
        } while (iM2653y0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: K0 */
    public static List m2637K0(CharSequence charSequence, String[] strArr) {
        AbstractC2980h.m5136e("<this>", charSequence);
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m2636J0(charSequence, str);
            }
        }
        C1066m c1066m = new C1066m(new C1058e(charSequence, new C1215q(1, AbstractC1912g.m3724h0(strArr))));
        ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(c1066m));
        Iterator it = c1066m.iterator();
        while (true) {
            C1200b c1200b = (C1200b) it;
            if (!c1200b.hasNext()) {
                return arrayList;
            }
            C0926c c0926c = (C0926c) c1200b.next();
            AbstractC2980h.m5136e("range", c0926c);
            arrayList.add(charSequence.subSequence(c0926c.f3986j, c0926c.f3987k + 1).toString());
        }
    }

    /* renamed from: L0 */
    public static List m2638L0(String str, char[] cArr) {
        AbstractC2980h.m5136e("<this>", str);
        if (cArr.length == 1) {
            return m2636J0(str, String.valueOf(cArr[0]));
        }
        C1066m c1066m = new C1066m(new C1058e(str, new C1215q(0, cArr)));
        ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(c1066m));
        Iterator it = c1066m.iterator();
        while (true) {
            C1200b c1200b = (C1200b) it;
            if (!c1200b.hasNext()) {
                return arrayList;
            }
            C0926c c0926c = (C0926c) c1200b.next();
            AbstractC2980h.m5136e("range", c0926c);
            arrayList.add(str.subSequence(c0926c.f3986j, c0926c.f3987k + 1).toString());
        }
    }

    /* renamed from: M0 */
    public static String m2639M0(String str, char c8, String str2) {
        int iM2627A0 = m2627A0(str, c8, 0, 6);
        if (iM2627A0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM2627A0 + 1, str.length());
        AbstractC2980h.m5135d("substring(...)", strSubstring);
        return strSubstring;
    }

    /* renamed from: N0 */
    public static String m2640N0(String str, String str2, String str3) {
        AbstractC2980h.m5136e("<this>", str);
        AbstractC2980h.m5136e("delimiter", str2);
        int iM2628B0 = m2628B0(str, str2, 0, false, 6);
        if (iM2628B0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iM2628B0, str.length());
        AbstractC2980h.m5135d("substring(...)", strSubstring);
        return strSubstring;
    }

    /* renamed from: O0 */
    public static String m2641O0(String str, char c8, String str2) {
        AbstractC2980h.m5136e("<this>", str);
        AbstractC2980h.m5136e("missingDelimiterValue", str2);
        int iM2631E0 = m2631E0(str, c8, 0, 6);
        if (iM2631E0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM2631E0 + 1, str.length());
        AbstractC2980h.m5135d("substring(...)", strSubstring);
        return strSubstring;
    }

    /* renamed from: P0 */
    public static String m2642P0(String str, char c8, String str2) {
        AbstractC2980h.m5136e("<this>", str);
        AbstractC2980h.m5136e("missingDelimiterValue", str2);
        int iM2627A0 = m2627A0(str, c8, 0, 6);
        if (iM2627A0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iM2627A0);
        AbstractC2980h.m5135d("substring(...)", strSubstring);
        return strSubstring;
    }

    /* renamed from: Q0 */
    public static String m2643Q0(String str, char c8) {
        AbstractC2980h.m5136e("<this>", str);
        AbstractC2980h.m5136e("missingDelimiterValue", str);
        int iM2631E0 = m2631E0(str, c8, 0, 6);
        if (iM2631E0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iM2631E0);
        AbstractC2980h.m5135d("substring(...)", strSubstring);
        return strSubstring;
    }

    /* renamed from: R0 */
    public static String m2644R0(int i, String str) {
        AbstractC2980h.m5136e("<this>", str);
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m14j("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        AbstractC2980h.m5135d("substring(...)", strSubstring);
        return strSubstring;
    }

    /* renamed from: S0 */
    public static CharSequence m2645S0(CharSequence charSequence) {
        AbstractC2980h.m5136e("<this>", charSequence);
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z7 = false;
        while (i <= length) {
            boolean zM429y = AbstractC0120b.m429y(charSequence.charAt(!z7 ? i : length));
            if (z7) {
                if (!zM429y) {
                    break;
                }
                length--;
            } else if (zM429y) {
                i++;
            } else {
                z7 = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: T0 */
    public static String m2646T0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        AbstractC2980h.m5136e("<this>", str);
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = str.charAt(length);
                int length2 = cArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (cCharAt == cArr[i4]) {
                        break;
                    }
                    i4++;
                }
                if (!(i4 >= 0)) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = C2181z.FRAGMENT_ENCODE_SET;
        } else {
            charSequenceSubSequence = C2181z.FRAGMENT_ENCODE_SET;
        }
        return charSequenceSubSequence.toString();
    }

    /* renamed from: U0 */
    public static CharSequence m2647U0(String str) {
        AbstractC2980h.m5136e("<this>", str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!AbstractC0120b.m429y(str.charAt(i))) {
                return str.subSequence(i, str.length());
            }
        }
        return C2181z.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: V0 */
    public static String m2648V0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        AbstractC2980h.m5136e("<this>", str);
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = C2181z.FRAGMENT_ENCODE_SET;
                break;
            }
            char cCharAt = str.charAt(i);
            int length2 = cArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    i4 = -1;
                    break;
                }
                if (cCharAt == cArr[i4]) {
                    break;
                }
                i4++;
            }
            if (!(i4 >= 0)) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    /* renamed from: u0 */
    public static boolean m2649u0(CharSequence charSequence, CharSequence charSequence2, boolean z7) {
        AbstractC2980h.m5136e("<this>", charSequence);
        AbstractC2980h.m5136e("other", charSequence2);
        if (charSequence2 instanceof String) {
            if (m2628B0(charSequence, (String) charSequence2, 0, z7, 2) >= 0) {
                return true;
            }
        } else if (m2654z0(charSequence, charSequence2, 0, charSequence.length(), z7, false) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v0 */
    public static boolean m2650v0(CharSequence charSequence, char c8) {
        AbstractC2980h.m5136e("<this>", charSequence);
        return m2627A0(charSequence, c8, 0, 2) >= 0;
    }

    /* renamed from: w0 */
    public static boolean m2651w0(String str, char c8) {
        return str.length() > 0 && AbstractC0120b.m423s(str.charAt(m2652x0(str)), c8, false);
    }

    /* renamed from: x0 */
    public static final int m2652x0(CharSequence charSequence) {
        AbstractC2980h.m5136e("<this>", charSequence);
        return charSequence.length() - 1;
    }

    /* renamed from: y0 */
    public static final int m2653y0(CharSequence charSequence, String str, int i, boolean z7) {
        AbstractC2980h.m5136e("<this>", charSequence);
        AbstractC2980h.m5136e("string", str);
        return (z7 || !(charSequence instanceof String)) ? m2654z0(charSequence, str, i, charSequence.length(), z7, false) : ((String) charSequence).indexOf(str, i);
    }

    /* renamed from: z0 */
    public static final int m2654z0(CharSequence charSequence, CharSequence charSequence2, int i, int i4, boolean z7, boolean z8) {
        C0924a c0924a;
        if (z8) {
            int iM2652x0 = m2652x0(charSequence);
            if (i > iM2652x0) {
                i = iM2652x0;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            c0924a = new C0924a(i, i4, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            c0924a = new C0926c(i, i4, 1);
        }
        boolean z9 = charSequence instanceof String;
        int i8 = c0924a.f3988l;
        int i9 = c0924a.f3987k;
        int i10 = c0924a.f3986j;
        if (!z9 || !(charSequence2 instanceof String)) {
            boolean z10 = z7;
            if ((i8 > 0 && i10 <= i9) || (i8 < 0 && i9 <= i10)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z11 = z10;
                    z10 = z11;
                    if (!m2634H0(charSequence4, 0, charSequence3, i10, charSequence2.length(), z11)) {
                        if (i10 == i9) {
                            break;
                        }
                        i10 += i8;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i10;
                    }
                }
            }
        } else if ((i8 > 0 && i10 <= i9) || (i8 < 0 && i9 <= i10)) {
            int i11 = i10;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z7;
                if (!AbstractC1214p.m2662o0(0, i11, str.length(), str, (String) charSequence, z12)) {
                    if (i11 == i9) {
                        break;
                    }
                    i11 += i8;
                    z7 = z12;
                } else {
                    return i11;
                }
            }
        }
        return -1;
    }
}
