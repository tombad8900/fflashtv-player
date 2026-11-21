package p181u7;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p111m6.AbstractC1913h;
import p111m6.C1921p;
import p147q7.AbstractC2276a;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u7.d */
/* loaded from: classes.dex */
public final class C2484d implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final C2484d INSTANCE = new C2484d();

    private C2484d() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        AbstractC2980h.m5135d("US", locale);
        String lowerCase = str.toLowerCase(locale);
        AbstractC2980h.m5135d("this as java.lang.String).toLowerCase(locale)", lowerCase);
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Object obj;
        C1921p c1921p = C1921p.f7187j;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return c1921p;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC2980h.m5132a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return c1921p;
        }
    }

    private final boolean isAscii(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m11g(length2, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j = 0;
        int i4 = 0;
        while (i4 < length2) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < '\u0080') {
                j++;
            } else {
                if (cCharAt < '\u0800') {
                    i = 2;
                } else if (cCharAt < '\ud800' || cCharAt > '\udfff') {
                    i = 3;
                } else {
                    int i8 = i4 + 1;
                    char cCharAt2 = i8 < length2 ? str.charAt(i8) : (char) 0;
                    if (cCharAt > '\udbff' || cCharAt2 < '\udc00' || cCharAt2 > '\udfff') {
                        j++;
                        i4 = i8;
                    } else {
                        j += 4;
                        i4 += 2;
                    }
                }
                j += i;
            }
            i4++;
        }
        return length == ((int) j);
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strAsciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String canonicalHost = AbstractC2276a.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (AbstractC2980h.m5132a(canonicalHost, AbstractC2276a.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        AbstractC2980h.m5136e("certificate", x509Certificate);
        return AbstractC1913h.m3743H0(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        AbstractC2980h.m5136e("host", str);
        AbstractC2980h.m5136e("session", sSLSession);
        if (!isAscii(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            AbstractC2980h.m5134c("null cannot be cast to non-null type java.security.cert.X509Certificate", certificate);
            return verify(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        AbstractC2980h.m5136e("host", str);
        AbstractC2980h.m5136e("certificate", x509Certificate);
        return AbstractC2278c.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        int length;
        if (str != null && str.length() != 0 && !AbstractC1214p.m2667t0(str, ".", false) && !AbstractC1214p.m2660m0(str, "..", false) && str2 != null && str2.length() != 0 && !AbstractC1214p.m2667t0(str2, ".", false) && !AbstractC1214p.m2660m0(str2, "..", false)) {
            if (!AbstractC1214p.m2660m0(str, ".", false)) {
                str = str.concat(".");
            }
            if (!AbstractC1214p.m2660m0(str2, ".", false)) {
                str2 = str2.concat(".");
            }
            String strAsciiToLowercase = asciiToLowercase(str2);
            if (!AbstractC1206h.m2649u0(strAsciiToLowercase, "*", false)) {
                return AbstractC2980h.m5132a(str, strAsciiToLowercase);
            }
            if (AbstractC1214p.m2667t0(strAsciiToLowercase, "*.", false) && AbstractC1206h.m2627A0(strAsciiToLowercase, '*', 1, 4) == -1 && str.length() >= strAsciiToLowercase.length() && !"*.".equals(strAsciiToLowercase)) {
                String strSubstring = strAsciiToLowercase.substring(1);
                AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring);
                if (AbstractC1214p.m2660m0(str, strSubstring, false) && ((length = str.length() - strSubstring.length()) <= 0 || AbstractC1206h.m2631E0(str, '.', length - 1, 4) == -1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
