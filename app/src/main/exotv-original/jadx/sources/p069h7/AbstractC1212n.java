package p069h7;

import okhttp3.internal.http2.C2131o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h7.n */
/* loaded from: classes.dex */
public abstract class AbstractC1212n extends AbstractC1211m {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m2656i0(String str) {
        char c8;
        boolean z7;
        boolean z8;
        int i;
        boolean z9;
        boolean z10;
        boolean z11 = true;
        int length = str.length() - 1;
        int i4 = 0;
        while (true) {
            c8 = ' ';
            if (i4 > length || str.charAt(i4) > ' ') {
                break;
            }
            i4++;
        }
        if (i4 > length) {
            return false;
        }
        while (length > i4 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i4) == '+' || str.charAt(i4) == '-') {
            i4++;
        }
        if (i4 > length) {
            return false;
        }
        if (str.charAt(i4) != '0') {
            z7 = true;
            z8 = false;
        } else {
            int i8 = i4 + 1;
            if (i8 > length) {
                return true;
            }
            if ((str.charAt(i8) | ' ') == 120) {
                int i9 = i4 + 2;
                int i10 = i9;
                while (true) {
                    if (i10 > length) {
                        z7 = z11;
                        break;
                    }
                    z7 = z11;
                    if (((str.charAt(i10) - '0') & C2131o.DEFAULT_INITIAL_WINDOW_SIZE) >= 10 && (((r15 | ' ') - 97) & C2131o.DEFAULT_INITIAL_WINDOW_SIZE) >= 6) {
                        break;
                    }
                    i10++;
                    z11 = z7;
                }
                boolean z12 = i9 != i10 ? z7 : false;
                if (i10 <= length) {
                    if (str.charAt(i10) == '.') {
                        int i11 = i10 + 1;
                        int i12 = i11;
                        while (i12 <= length) {
                            char c9 = c8;
                            if (((str.charAt(i12) - '0') & C2131o.DEFAULT_INITIAL_WINDOW_SIZE) >= 10 && (((r15 | ' ') - 97) & C2131o.DEFAULT_INITIAL_WINDOW_SIZE) >= 6) {
                                break;
                            }
                            i12++;
                            c8 = c9;
                        }
                        z10 = i11 != i12 ? z7 : false;
                        i10 = i12;
                    } else {
                        z10 = false;
                    }
                    if (z12 || z10) {
                        i4 = i10;
                    }
                    if (i4 != -1 || i4 > length) {
                        return false;
                    }
                    z8 = z7;
                }
                i4 = -1;
                if (i4 != -1) {
                }
                return false;
            }
        }
        if (!z8) {
            int i13 = i4;
            while (i13 <= length && ((str.charAt(i13) - '0') & C2131o.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
                i13++;
            }
            boolean z13 = i4 != i13 ? z7 : false;
            if (i13 > length) {
                i4 = i13;
            } else {
                if (str.charAt(i13) == '.') {
                    int i14 = i13 + 1;
                    i = i14;
                    while (i <= length && ((str.charAt(i) - '0') & C2131o.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
                        i++;
                    }
                    if (i14 != i) {
                        z9 = z7;
                    }
                    if (!z13 || z9) {
                        i4 = i;
                    } else {
                        String str2 = length == i + 2 ? "NaN" : length == i + 7 ? "Infinity" : null;
                        i4 = (str2 != null && AbstractC1206h.m2653y0(str, str2, i, false) == i) ? length + 1 : -1;
                    }
                } else {
                    i = i13;
                }
                z9 = false;
                if (z13) {
                    i4 = i;
                }
            }
            if (i4 == -1) {
                return false;
            }
            if (i4 > length) {
                return z7;
            }
        }
        int i15 = i4 + 1;
        int iCharAt = str.charAt(i4) | ' ';
        if (iCharAt != (z8 ? 112 : 101)) {
            if (z8 || (!(iCharAt == 102 || iCharAt == 100) || i15 <= length)) {
                return false;
            }
            return z7;
        }
        if (i15 > length) {
            return false;
        }
        if ((str.charAt(i15) == '+' || str.charAt(i15) == '-') && (i15 = i4 + 2) > length) {
            return false;
        }
        while (i15 <= length && ((str.charAt(i15) - '0') & C2131o.DEFAULT_INITIAL_WINDOW_SIZE) < 10) {
            i15++;
        }
        if (i15 > length) {
            return z7;
        }
        if (i15 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i15) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z7;
        }
        return false;
    }
}
