package p159s2;

import java.util.regex.Pattern;
import okhttp3.C2181z;
import p063h1.C1132w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s2.a */
/* loaded from: classes.dex */
public final class C2341a {

    /* renamed from: c */
    public static final Pattern f8211c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    public static final Pattern f8212d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    public final C1132w f8213a = new C1132w();

    /* renamed from: b */
    public final StringBuilder f8214b = new StringBuilder();

    /* renamed from: a */
    public static String m4173a(C1132w c1132w, StringBuilder sb) {
        boolean z7 = false;
        sb.setLength(0);
        int i = c1132w.f4800b;
        int i4 = c1132w.f4801c;
        while (i < i4 && !z7) {
            char c8 = (char) c1132w.f4799a[i];
            if ((c8 < 'A' || c8 > 'Z') && ((c8 < 'a' || c8 > 'z') && !((c8 >= '0' && c8 <= '9') || c8 == '#' || c8 == '-' || c8 == '.' || c8 == '_'))) {
                z7 = true;
            } else {
                i++;
                sb.append(c8);
            }
        }
        c1132w.m2514H(i - c1132w.f4800b);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m4174b(C1132w c1132w, StringBuilder sb) {
        m4175c(c1132w);
        if (c1132w.m2515a() == 0) {
            return null;
        }
        String strM4173a = m4173a(c1132w, sb);
        if (!C2181z.FRAGMENT_ENCODE_SET.equals(strM4173a)) {
            return strM4173a;
        }
        return C2181z.FRAGMENT_ENCODE_SET + ((char) c1132w.m2535u());
    }

    /* renamed from: c */
    public static void m4175c(C1132w c1132w) {
        while (true) {
            for (boolean z7 = true; c1132w.m2515a() > 0 && z7; z7 = false) {
                int i = c1132w.f4800b;
                byte[] bArr = c1132w.f4799a;
                byte b7 = bArr[i];
                char c8 = (char) b7;
                if (c8 == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
                    c1132w.m2514H(1);
                } else {
                    int i4 = c1132w.f4801c;
                    int i8 = i + 2;
                    if (i8 <= i4) {
                        int i9 = i + 1;
                        if (b7 == 47 && bArr[i9] == 42) {
                            while (true) {
                                int i10 = i8 + 1;
                                if (i10 >= i4) {
                                    break;
                                }
                                if (((char) bArr[i8]) == '*' && ((char) bArr[i10]) == '/') {
                                    i8 += 2;
                                    i4 = i8;
                                } else {
                                    i8 = i10;
                                }
                            }
                            c1132w.m2514H(i4 - c1132w.f4800b);
                        }
                    }
                }
            }
            return;
        }
    }
}
