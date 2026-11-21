package p147q7;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p189v7.C2573j;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q7.a */
/* loaded from: classes.dex */
public abstract class AbstractC2276a {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (AbstractC2980h.m5137f(cCharAt, 31) <= 0 || AbstractC2980h.m5137f(cCharAt, 127) >= 0 || AbstractC1206h.m2627A0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i, int i4, byte[] bArr, int i8) {
        int i9 = i8;
        while (i < i4) {
            if (i9 == bArr.length) {
                return false;
            }
            if (i9 != i8) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i10 = i;
            int i11 = 0;
            while (i10 < i4) {
                char cCharAt = str.charAt(i10);
                if (AbstractC2980h.m5137f(cCharAt, 48) < 0 || AbstractC2980h.m5137f(cCharAt, 57) > 0) {
                    break;
                }
                if ((i11 == 0 && i != i10) || (i11 = ((i11 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i10++;
            }
            if (i10 - i == 0) {
                return false;
            }
            bArr[i9] = (byte) i11;
            i9++;
            i = i10;
        }
        return i9 == i8 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        if (r4 == 16) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        if (r5 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
    
        r10 = r4 - r5;
        java.lang.System.arraycopy(r1, r5, r1, 16 - r10, r10);
        java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        return java.net.InetAddress.getByAddress(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final InetAddress decodeIpv6(String str, int i, int i4) {
        int i8;
        byte[] bArr = new byte[16];
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        while (true) {
            if (i >= i4) {
                break;
            }
            if (i9 == 16) {
                return null;
            }
            int i12 = i + 2;
            if (i12 <= i4 && AbstractC1214p.m2666s0(str, "::", i, false)) {
                if (i10 != -1) {
                    return null;
                }
                i9 += 2;
                i10 = i9;
                if (i12 == i4) {
                    break;
                }
                i11 = i12;
                int i13 = 0;
                i = i11;
                while (i < i4) {
                }
                i8 = i - i11;
                return i8 == 0 ? null : null;
            }
            if (i9 != 0) {
                if (AbstractC1214p.m2666s0(str, ":", i, false)) {
                    i++;
                } else {
                    if (!AbstractC1214p.m2666s0(str, ".", i, false) || !decodeIpv4Suffix(str, i11, i4, bArr, i9 - 2)) {
                        return null;
                    }
                    i9 += 2;
                }
            }
            i11 = i;
            int i132 = 0;
            i = i11;
            while (i < i4) {
                int hexDigit = AbstractC2278c.parseHexDigit(str.charAt(i));
                if (hexDigit == -1) {
                    break;
                }
                i132 = (i132 << 4) + hexDigit;
                i++;
            }
            i8 = i - i11;
            if (i8 == 0 && i8 <= 4) {
                int i14 = i9 + 1;
                bArr[i9] = (byte) ((i132 >>> 8) & 255);
                i9 += 2;
                bArr[i14] = (byte) (i132 & 255);
            }
        }
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i = -1;
        int i4 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < bArr.length) {
            int i10 = i8;
            while (i10 < 16 && bArr[i10] == 0 && bArr[i10 + 1] == 0) {
                i10 += 2;
            }
            int i11 = i10 - i8;
            if (i11 > i9 && i11 >= 4) {
                i = i8;
                i9 = i11;
            }
            i8 = i10 + 2;
        }
        C2573j c2573j = new C2573j();
        while (i4 < bArr.length) {
            if (i4 == i) {
                c2573j.m4655K(58);
                i4 += i9;
                if (i4 == 16) {
                    c2573j.m4655K(58);
                }
            } else {
                if (i4 > 0) {
                    c2573j.m4655K(58);
                }
                c2573j.m4657M((AbstractC2278c.and(bArr[i4], 255) << 8) | AbstractC2278c.and(bArr[i4 + 1], 255));
                i4 += 2;
            }
        }
        return c2573j.m4651G();
    }

    public static final String toCanonicalHost(String str) {
        AbstractC2980h.m5136e("<this>", str);
        if (AbstractC1206h.m2649u0(str, ":", false)) {
            InetAddress inetAddressDecodeIpv6 = (AbstractC1214p.m2667t0(str, "[", false) && AbstractC1214p.m2660m0(str, "]", false)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
            if (inetAddressDecodeIpv6 == null) {
                return null;
            }
            byte[] address = inetAddressDecodeIpv6.getAddress();
            if (address.length == 16) {
                return inet6AddressToAscii(address);
            }
            if (address.length == 4) {
                return inetAddressDecodeIpv6.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        try {
            String ascii = IDN.toASCII(str);
            AbstractC2980h.m5135d("toASCII(host)", ascii);
            Locale locale = Locale.US;
            AbstractC2980h.m5135d("US", locale);
            String lowerCase = ascii.toLowerCase(locale);
            AbstractC2980h.m5135d("this as java.lang.String).toLowerCase(locale)", lowerCase);
            if (lowerCase.length() == 0) {
                return null;
            }
            if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
