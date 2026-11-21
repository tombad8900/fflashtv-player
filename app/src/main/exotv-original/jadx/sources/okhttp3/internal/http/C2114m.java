package okhttp3.internal.http;

import java.net.ProtocolException;
import okhttp3.C2080i0;
import okhttp3.C2181z;
import okhttp3.EnumC2074f0;
import p069h7.AbstractC1214p;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http.m */
/* loaded from: classes.dex */
public final class C2114m {
    public static final a Companion = new a(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final EnumC2074f0 protocol;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http.m$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public final C2114m get(C2080i0 c2080i0) {
            AbstractC2980h.m5136e("response", c2080i0);
            return new C2114m(c2080i0.protocol(), c2080i0.code(), c2080i0.message());
        }

        public final C2114m parse(String str) throws ProtocolException, NumberFormatException {
            EnumC2074f0 enumC2074f0;
            int i;
            String strSubstring;
            AbstractC2980h.m5136e("statusLine", str);
            if (AbstractC1214p.m2667t0(str, "HTTP/1.", false)) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    enumC2074f0 = EnumC2074f0.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    enumC2074f0 = EnumC2074f0.HTTP_1_1;
                }
            } else {
                if (!AbstractC1214p.m2667t0(str, "ICY ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC2074f0 = EnumC2074f0.HTTP_1_0;
                i = 4;
            }
            int i4 = i + 3;
            if (str.length() < i4) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            try {
                String strSubstring2 = str.substring(i, i4);
                AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring2);
                int i8 = Integer.parseInt(strSubstring2);
                if (str.length() <= i4) {
                    strSubstring = C2181z.FRAGMENT_ENCODE_SET;
                } else {
                    if (str.charAt(i4) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    strSubstring = str.substring(i + 4);
                    AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring);
                }
                return new C2114m(enumC2074f0, i8, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }

        private a() {
        }
    }

    public C2114m(EnumC2074f0 enumC2074f0, int i, String str) {
        AbstractC2980h.m5136e("protocol", enumC2074f0);
        AbstractC2980h.m5136e("message", str);
        this.protocol = enumC2074f0;
        this.code = i;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == EnumC2074f0.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String string = sb.toString();
        AbstractC2980h.m5135d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }
}
