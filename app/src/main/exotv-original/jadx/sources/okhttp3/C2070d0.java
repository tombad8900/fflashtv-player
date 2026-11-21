package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p069h7.AbstractC1214p;
import p168t2.AbstractC2429w;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.d0 */
/* loaded from: classes.dex */
public final class C2070d0 {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;
    public static final a Companion = new a(null);
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.d0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final C2070d0 m5174deprecated_get(String str) {
            AbstractC2980h.m5136e("mediaType", str);
            return get(str);
        }

        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final C2070d0 m5175deprecated_parse(String str) {
            AbstractC2980h.m5136e("mediaType", str);
            return parse(str);
        }

        public final C2070d0 get(String str) {
            AbstractC2980h.m5136e("<this>", str);
            Matcher matcher = C2070d0.TYPE_SUBTYPE.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            AbstractC2980h.m5135d("typeSubtype.group(1)", strGroup);
            Locale locale = Locale.US;
            AbstractC2980h.m5135d("US", locale);
            String lowerCase = strGroup.toLowerCase(locale);
            AbstractC2980h.m5135d("this as java.lang.String).toLowerCase(locale)", lowerCase);
            String strGroup2 = matcher.group(2);
            AbstractC2980h.m5135d("typeSubtype.group(2)", strGroup2);
            String lowerCase2 = strGroup2.toLowerCase(locale);
            AbstractC2980h.m5135d("this as java.lang.String).toLowerCase(locale)", lowerCase2);
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = C2070d0.PARAMETER.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring);
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (AbstractC1214p.m2667t0(strGroup4, "'", false) && AbstractC1214p.m2660m0(strGroup4, "'", false) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strGroup4);
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new C2070d0(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
        }

        public final C2070d0 parse(String str) {
            AbstractC2980h.m5136e("<this>", str);
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ C2070d0(String str, String str2, String str3, String[] strArr, AbstractC2977e abstractC2977e) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset charset$default(C2070d0 c2070d0, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return c2070d0.charset(charset);
    }

    public static final C2070d0 get(String str) {
        return Companion.get(str);
    }

    public static final C2070d0 parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_subtype, reason: not valid java name */
    public final String m5172deprecated_subtype() {
        return this.subtype;
    }

    /* renamed from: -deprecated_type, reason: not valid java name */
    public final String m5173deprecated_type() {
        return this.type;
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2070d0) && AbstractC2980h.m5132a(((C2070d0) obj).mediaType, this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String str) {
        AbstractC2980h.m5136e("name", str);
        int i = 0;
        int iM4305j = AbstractC2429w.m4305j(0, this.parameterNamesAndValues.length - 1, 2);
        if (iM4305j < 0) {
            return null;
        }
        while (!AbstractC1214p.m2661n0(this.parameterNamesAndValues[i], str)) {
            if (i == iM4305j) {
                return null;
            }
            i += 2;
        }
        return this.parameterNamesAndValues[i + 1];
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    private C2070d0(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public final Charset charset(Charset charset) {
        String strParameter = parameter("charset");
        if (strParameter == null) {
            return charset;
        }
        try {
            return Charset.forName(strParameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
