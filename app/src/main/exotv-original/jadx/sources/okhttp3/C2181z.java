package okhttp3;

import com.bumptech.glide.AbstractC0714c;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p002a1.AbstractC0008a1;
import p044e7.C0924a;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p111m6.AbstractC1915j;
import p111m6.C1921p;
import p111m6.C1923r;
import p147q7.AbstractC2276a;
import p147q7.AbstractC2278c;
import p168t2.AbstractC2429w;
import p189v7.C2573j;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.z */
/* loaded from: classes.dex */
public final class C2181z {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final b Companion = new b(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.z$a */
    public static final class a {
        public static final C2996a Companion = new C2996a(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = C2181z.FRAGMENT_ENCODE_SET;
        private String encodedPassword = C2181z.FRAGMENT_ENCODE_SET;
        private int port = -1;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.z$a$a, reason: collision with other inner class name */
        public static final class C2996a {
            public /* synthetic */ C2996a(AbstractC2977e abstractC2977e) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i, int i4) throws NumberFormatException {
                int i8;
                try {
                    i8 = Integer.parseInt(b.canonicalize$okhttp$default(C2181z.Companion, str, i, i4, C2181z.FRAGMENT_ENCODE_SET, false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > i8 || i8 >= 65536) {
                    return -1;
                }
                return i8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i4) {
                while (i < i4) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '[') {
                        do {
                            i++;
                            if (i < i4) {
                            }
                        } while (str.charAt(i) != ']');
                    } else if (cCharAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i4) {
                if (i4 - i < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i);
                if ((AbstractC2980h.m5137f(cCharAt, 97) >= 0 && AbstractC2980h.m5137f(cCharAt, 122) <= 0) || (AbstractC2980h.m5137f(cCharAt, 65) >= 0 && AbstractC2980h.m5137f(cCharAt, 90) <= 0)) {
                    while (true) {
                        i++;
                        if (i >= i4) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i, int i4) {
                int i8 = 0;
                while (i < i4) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i8++;
                    i++;
                }
                return i8;
            }

            private C2996a() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add(C2181z.FRAGMENT_ENCODE_SET);
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            b bVar = C2181z.Companion;
            String str = this.scheme;
            AbstractC2980h.m5133b(str);
            return bVar.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return AbstractC2980h.m5132a(str, ".") || AbstractC1214p.m2661n0(str, "%2e");
        }

        private final boolean isDotDot(String str) {
            return AbstractC2980h.m5132a(str, "..") || AbstractC1214p.m2661n0(str, "%2e.") || AbstractC1214p.m2661n0(str, ".%2e") || AbstractC1214p.m2661n0(str, "%2e%2e");
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(C2181z.FRAGMENT_ENCODE_SET);
            } else {
                this.encodedPathSegments.set(r0.size() - 1, C2181z.FRAGMENT_ENCODE_SET);
            }
        }

        private final void push(String str, int i, int i4, boolean z7, boolean z8) {
            String strCanonicalize$okhttp$default = b.canonicalize$okhttp$default(C2181z.Companion, str, i, i4, C2181z.PATH_SEGMENT_ENCODE_SET, z8, false, false, false, null, 240, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            if (this.encodedPathSegments.get(r14.size() - 1).length() == 0) {
                this.encodedPathSegments.set(r14.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (z7) {
                this.encodedPathSegments.add(C2181z.FRAGMENT_ENCODE_SET);
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            AbstractC2980h.m5133b(list);
            int size = list.size() - 2;
            int iM4305j = AbstractC2429w.m4305j(size, 0, -2);
            if (iM4305j > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                AbstractC2980h.m5133b(list2);
                if (AbstractC2980h.m5132a(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    AbstractC2980h.m5133b(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    AbstractC2980h.m5133b(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    AbstractC2980h.m5133b(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == iM4305j) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        private final void resolvePath(String str, int i, int i4) {
            if (i == i4) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add(C2181z.FRAGMENT_ENCODE_SET);
                i++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, C2181z.FRAGMENT_ENCODE_SET);
            }
            int i8 = i;
            while (i8 < i4) {
                int iDelimiterOffset = AbstractC2278c.delimiterOffset(str, "/\\", i8, i4);
                boolean z7 = iDelimiterOffset < i4;
                String str2 = str;
                push(str2, i8, iDelimiterOffset, z7, true);
                if (z7) {
                    i8 = iDelimiterOffset + 1;
                    str = str2;
                } else {
                    str = str2;
                    i8 = iDelimiterOffset;
                }
            }
        }

        public final a addEncodedPathSegment(String str) {
            AbstractC2980h.m5136e("encodedPathSegment", str);
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final a addEncodedPathSegments(String str) {
            AbstractC2980h.m5136e("encodedPathSegments", str);
            return addPathSegments(str, true);
        }

        public final a addEncodedQueryParameter(String str, String str2) {
            AbstractC2980h.m5136e("encodedName", str);
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            AbstractC2980h.m5133b(list);
            b bVar = C2181z.Companion;
            list.add(b.canonicalize$okhttp$default(bVar, str, 0, 0, C2181z.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            AbstractC2980h.m5133b(list2);
            list2.add(str2 != null ? b.canonicalize$okhttp$default(bVar, str2, 0, 0, C2181z.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final a addPathSegment(String str) {
            AbstractC2980h.m5136e("pathSegment", str);
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final a addPathSegments(String str) {
            AbstractC2980h.m5136e("pathSegments", str);
            return addPathSegments(str, false);
        }

        public final a addQueryParameter(String str, String str2) {
            AbstractC2980h.m5136e("name", str);
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            AbstractC2980h.m5133b(list);
            b bVar = C2181z.Companion;
            list.add(b.canonicalize$okhttp$default(bVar, str, 0, 0, C2181z.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            AbstractC2980h.m5133b(list2);
            list2.add(str2 != null ? b.canonicalize$okhttp$default(bVar, str2, 0, 0, C2181z.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final C2181z build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = C2181z.Companion;
            String strPercentDecode$okhttp$default = b.percentDecode$okhttp$default(bVar, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = b.percentDecode$okhttp$default(bVar, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(AbstractC1915j.m3756w0(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.percentDecode$okhttp$default(C2181z.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                arrayList = new ArrayList(AbstractC1915j.m3756w0(list2));
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? b.percentDecode$okhttp$default(C2181z.Companion, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new C2181z(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? b.percentDecode$okhttp$default(C2181z.Companion, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final a encodedFragment(String str) {
            this.encodedFragment = str != null ? b.canonicalize$okhttp$default(C2181z.Companion, str, 0, 0, C2181z.FRAGMENT_ENCODE_SET, true, false, false, true, null, 179, null) : null;
            return this;
        }

        public final a encodedPassword(String str) {
            AbstractC2980h.m5136e("encodedPassword", str);
            this.encodedPassword = b.canonicalize$okhttp$default(C2181z.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final a encodedPath(String str) {
            AbstractC2980h.m5136e("encodedPath", str);
            if (!AbstractC1214p.m2667t0(str, "/", false)) {
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(str).toString());
            }
            resolvePath(str, 0, str.length());
            return this;
        }

        public final a encodedQuery(String str) {
            b bVar;
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize$okhttp$default = b.canonicalize$okhttp$default((bVar = C2181z.Companion), str, 0, 0, C2181z.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) == null) ? null : bVar.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final a encodedUsername(String str) {
            AbstractC2980h.m5136e("encodedUsername", str);
            this.encodedUsername = b.canonicalize$okhttp$default(C2181z.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final a fragment(String str) {
            this.encodedFragment = str != null ? b.canonicalize$okhttp$default(C2181z.Companion, str, 0, 0, C2181z.FRAGMENT_ENCODE_SET, false, false, false, true, null, 187, null) : null;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final a host(String str) {
            AbstractC2980h.m5136e("host", str);
            String canonicalHost = AbstractC2276a.toCanonicalHost(b.percentDecode$okhttp$default(C2181z.Companion, str, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.host = canonicalHost;
            return this;
        }

        public final a parse$okhttp(C2181z c2181z, String str) throws NumberFormatException {
            int iDelimiterOffset;
            int i;
            String str2;
            int i4;
            String str3;
            boolean z7;
            char c8;
            int i8;
            int i9;
            char c9;
            int i10;
            String str4 = str;
            AbstractC2980h.m5136e("input", str4);
            int iIndexOfFirstNonAsciiWhitespace$default = AbstractC2278c.indexOfFirstNonAsciiWhitespace$default(str4, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = AbstractC2278c.indexOfLastNonAsciiWhitespace$default(str4, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            C2996a c2996a = Companion;
            int iSchemeDelimiterOffset = c2996a.schemeDelimiterOffset(str4, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            String str5 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
            boolean z8 = true;
            char c10 = '\uffff';
            if (iSchemeDelimiterOffset != -1) {
                if (AbstractC1214p.m2666s0(str4, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!AbstractC1214p.m2666s0(str4, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                        StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = str4.substring(0, iSchemeDelimiterOffset);
                        AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (c2181z == null) {
                    throw new IllegalArgumentException(AbstractC0008a1.m25u("Expected URL scheme 'http' or 'https' but no scheme was found for ", str4.length() > 6 ? AbstractC1206h.m2644R0(6, str4).concat("...") : str4));
                }
                this.scheme = c2181z.scheme();
            }
            int iSlashCount = c2996a.slashCount(str4, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            char c11 = '?';
            char c12 = '#';
            if (iSlashCount >= 2 || c2181z == null || !AbstractC2980h.m5132a(c2181z.scheme(), this.scheme)) {
                int i11 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                boolean z9 = false;
                boolean z10 = false;
                while (true) {
                    iDelimiterOffset = AbstractC2278c.delimiterOffset(str4, "@/\\?#", i11, iIndexOfLastNonAsciiWhitespace$default);
                    char cCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? str4.charAt(iDelimiterOffset) : c10;
                    if (cCharAt == c10 || cCharAt == c12 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c11) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z9) {
                            i4 = iIndexOfLastNonAsciiWhitespace$default;
                            str3 = str5;
                            z7 = z8;
                            c8 = c10;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            str4 = str;
                            i8 = iDelimiterOffset;
                            sb2.append(b.canonicalize$okhttp$default(C2181z.Companion, str4, i11, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                        } else {
                            int iDelimiterOffset2 = AbstractC2278c.delimiterOffset(str4, ':', i11, iDelimiterOffset);
                            b bVar = C2181z.Companion;
                            str3 = str5;
                            c8 = c10;
                            i4 = iIndexOfLastNonAsciiWhitespace$default;
                            z7 = z8;
                            String strCanonicalize$okhttp$default = b.canonicalize$okhttp$default(bVar, str4, i11, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z10) {
                                strCanonicalize$okhttp$default = this.encodedUsername + "%40" + strCanonicalize$okhttp$default;
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                i9 = iDelimiterOffset;
                                this.encodedPassword = b.canonicalize$okhttp$default(bVar, str, iDelimiterOffset2 + 1, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z9 = z7;
                            } else {
                                i9 = iDelimiterOffset;
                            }
                            str4 = str;
                            i8 = i9;
                            z10 = z7;
                        }
                        i11 = i8 + 1;
                        c10 = c8;
                        iIndexOfLastNonAsciiWhitespace$default = i4;
                        str5 = str3;
                        z8 = z7;
                        c11 = '?';
                        c12 = '#';
                    }
                }
                i = iIndexOfLastNonAsciiWhitespace$default;
                String str6 = str5;
                char c13 = c10;
                C2996a c2996a2 = Companion;
                int iPortColonOffset = c2996a2.portColonOffset(str4, i11, iDelimiterOffset);
                int i12 = iPortColonOffset + 1;
                if (i12 < iDelimiterOffset) {
                    this.host = AbstractC2276a.toCanonicalHost(b.percentDecode$okhttp$default(C2181z.Companion, str4, i11, iPortColonOffset, false, 4, null));
                    int port = c2996a2.parsePort(str4, i12, iDelimiterOffset);
                    this.port = port;
                    if (port == c13) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = str4.substring(i12, iDelimiterOffset);
                        AbstractC2980h.m5135d(str6, strSubstring2);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    str2 = str6;
                } else {
                    str2 = str6;
                    b bVar2 = C2181z.Companion;
                    this.host = AbstractC2276a.toCanonicalHost(b.percentDecode$okhttp$default(bVar2, str4, i11, iPortColonOffset, false, 4, null));
                    String str7 = this.scheme;
                    AbstractC2980h.m5133b(str7);
                    this.port = bVar2.defaultPort(str7);
                }
                if (this.host == null) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = str4.substring(i11, iPortColonOffset);
                    AbstractC2980h.m5135d(str2, strSubstring3);
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = c2181z.encodedUsername();
                this.encodedPassword = c2181z.encodedPassword();
                this.host = c2181z.host();
                this.port = c2181z.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(c2181z.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || str4.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(c2181z.encodedQuery());
                }
                i = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i13 = i;
            int iDelimiterOffset3 = AbstractC2278c.delimiterOffset(str4, "?#", iIndexOfFirstNonAsciiWhitespace$default, i13);
            resolvePath(str4, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 >= i13 || str4.charAt(iDelimiterOffset3) != '?') {
                c9 = '#';
                i10 = iDelimiterOffset3;
            } else {
                c9 = '#';
                int iDelimiterOffset4 = AbstractC2278c.delimiterOffset(str4, '#', iDelimiterOffset3, i13);
                b bVar3 = C2181z.Companion;
                this.encodedQueryNamesAndValues = bVar3.toQueryNamesAndValues$okhttp(b.canonicalize$okhttp$default(bVar3, str4, iDelimiterOffset3 + 1, iDelimiterOffset4, C2181z.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                i10 = iDelimiterOffset4;
            }
            if (i10 < i13 && str4.charAt(i10) == c9) {
                this.encodedFragment = b.canonicalize$okhttp$default(C2181z.Companion, str4, i10 + 1, i13, C2181z.FRAGMENT_ENCODE_SET, true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a password(String str) {
            AbstractC2980h.m5136e("password", str);
            this.encodedPassword = b.canonicalize$okhttp$default(C2181z.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final a port(int i) {
            if (1 > i || i >= 65536) {
                throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "unexpected port: ").toString());
            }
            this.port = i;
            return this;
        }

        public final a query(String str) {
            b bVar;
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize$okhttp$default = b.canonicalize$okhttp$default((bVar = C2181z.Companion), str, 0, 0, C2181z.QUERY_ENCODE_SET, false, false, true, false, null, 219, null)) == null) ? null : bVar.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final a reencodeForUri$okhttp() {
            String strReplaceAll;
            String str = this.host;
            if (str != null) {
                Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
                AbstractC2980h.m5135d("compile(...)", patternCompile);
                strReplaceAll = patternCompile.matcher(str).replaceAll(C2181z.FRAGMENT_ENCODE_SET);
                AbstractC2980h.m5135d("replaceAll(...)", strReplaceAll);
            } else {
                strReplaceAll = null;
            }
            this.host = strReplaceAll;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, b.canonicalize$okhttp$default(C2181z.Companion, list.get(i), 0, 0, C2181z.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    String str2 = list2.get(i4);
                    list2.set(i4, str2 != null ? b.canonicalize$okhttp$default(C2181z.Companion, str2, 0, 0, C2181z.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? b.canonicalize$okhttp$default(C2181z.Companion, str3, 0, 0, C2181z.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final a removeAllEncodedQueryParameters(String str) {
            AbstractC2980h.m5136e("encodedName", str);
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(b.canonicalize$okhttp$default(C2181z.Companion, str, 0, 0, C2181z.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final a removeAllQueryParameters(String str) {
            AbstractC2980h.m5136e("name", str);
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(b.canonicalize$okhttp$default(C2181z.Companion, str, 0, 0, C2181z.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final a removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(C2181z.FRAGMENT_ENCODE_SET);
            }
            return this;
        }

        public final a scheme(String str) {
            AbstractC2980h.m5136e("scheme", str);
            if (str.equalsIgnoreCase("http")) {
                this.scheme = "http";
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.scheme = "https";
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            AbstractC2980h.m5136e("<set-?>", str);
            this.encodedPassword = str;
        }

        public final a setEncodedPathSegment(int i, String str) {
            AbstractC2980h.m5136e("encodedPathSegment", str);
            String strCanonicalize$okhttp$default = b.canonicalize$okhttp$default(C2181z.Companion, str, 0, 0, C2181z.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i, strCanonicalize$okhttp$default);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(str).toString());
            }
            return this;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final a setEncodedQueryParameter(String str, String str2) {
            AbstractC2980h.m5136e("encodedName", str);
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            AbstractC2980h.m5136e("<set-?>", str);
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final a setPathSegment(int i, String str) {
            AbstractC2980h.m5136e("pathSegment", str);
            String strCanonicalize$okhttp$default = b.canonicalize$okhttp$default(C2181z.Companion, str, 0, 0, C2181z.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(str).toString());
            }
            this.encodedPathSegments.set(i, strCanonicalize$okhttp$default);
            return this;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final a setQueryParameter(String str, String str2) {
            AbstractC2980h.m5136e("name", str);
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (AbstractC1206h.m2650v0(str2, ':')) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int iEffectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 == null || iEffectivePort != C2181z.Companion.defaultPort(str3)) {
                    sb.append(':');
                    sb.append(iEffectivePort);
                }
            }
            b bVar = C2181z.Companion;
            bVar.toPathString$okhttp(this.encodedPathSegments, sb);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                List<String> list = this.encodedQueryNamesAndValues;
                AbstractC2980h.m5133b(list);
                bVar.toQueryString$okhttp(list, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            String string = sb.toString();
            AbstractC2980h.m5135d("StringBuilder().apply(builderAction).toString()", string);
            return string;
        }

        public final a username(String str) {
            AbstractC2980h.m5136e("username", str);
            this.encodedUsername = b.canonicalize$okhttp$default(C2181z.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final a addPathSegments(String str, boolean z7) {
            boolean z8;
            a aVar;
            String str2;
            boolean z9;
            int i = 0;
            while (true) {
                int iDelimiterOffset = AbstractC2278c.delimiterOffset(str, "/\\", i, str.length());
                if (iDelimiterOffset < str.length()) {
                    z8 = true;
                    str2 = str;
                    z9 = z7;
                    aVar = this;
                } else {
                    z8 = false;
                    aVar = this;
                    str2 = str;
                    z9 = z7;
                }
                aVar.push(str2, i, iDelimiterOffset, z8, z9);
                i = iDelimiterOffset + 1;
                if (i > str2.length()) {
                    return aVar;
                }
                str = str2;
                z7 = z9;
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.z$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(b bVar, String str, int i, int i4, String str2, boolean z7, boolean z8, boolean z9, boolean z10, Charset charset, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                i = 0;
            }
            if ((i8 & 2) != 0) {
                i4 = str.length();
            }
            if ((i8 & 8) != 0) {
                z7 = false;
            }
            if ((i8 & 16) != 0) {
                z8 = false;
            }
            if ((i8 & 32) != 0) {
                z9 = false;
            }
            if ((i8 & 64) != 0) {
                z10 = false;
            }
            if ((i8 & 128) != 0) {
                charset = null;
            }
            return bVar.canonicalize$okhttp(str, i, i4, str2, z7, z8, z9, z10, charset);
        }

        private final boolean isPercentEncoded(String str, int i, int i4) {
            int i8 = i + 2;
            return i8 < i4 && str.charAt(i) == '%' && AbstractC2278c.parseHexDigit(str.charAt(i + 1)) != -1 && AbstractC2278c.parseHexDigit(str.charAt(i8)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(b bVar, String str, int i, int i4, boolean z7, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                i = 0;
            }
            if ((i8 & 2) != 0) {
                i4 = str.length();
            }
            if ((i8 & 4) != 0) {
                z7 = false;
            }
            return bVar.percentDecode$okhttp(str, i, i4, z7);
        }

        private final void writeCanonicalized(C2573j c2573j, String str, int i, int i4, String str2, boolean z7, boolean z8, boolean z9, boolean z10, Charset charset) throws EOFException {
            C2573j c2573j2 = null;
            while (i < i4) {
                int iCodePointAt = str.codePointAt(i);
                if (!z7 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z9) {
                        c2573j.m4661Q(z7 ? "+" : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z10) || AbstractC1206h.m2650v0(str2, (char) iCodePointAt) || (iCodePointAt == 37 && (!z7 || (z8 && !isPercentEncoded(str, i, i4)))))) {
                        if (c2573j2 == null) {
                            c2573j2 = new C2573j();
                        }
                        if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                            c2573j2.m4663S(iCodePointAt);
                        } else {
                            c2573j2.m4660P(str, i, Character.charCount(iCodePointAt) + i, charset);
                        }
                        while (!c2573j2.mo4614j()) {
                            byte b7 = c2573j2.readByte();
                            c2573j.m4655K(37);
                            c2573j.m4655K(C2181z.HEX_DIGITS[((b7 & 255) >> 4) & 15]);
                            c2573j.m4655K(C2181z.HEX_DIGITS[b7 & 15]);
                        }
                    } else {
                        c2573j.m4663S(iCodePointAt);
                    }
                }
                i += Character.charCount(iCodePointAt);
            }
        }

        private final void writePercentDecoded(C2573j c2573j, String str, int i, int i4, boolean z7) {
            int i8;
            while (i < i4) {
                int iCodePointAt = str.codePointAt(i);
                if (iCodePointAt == 37 && (i8 = i + 2) < i4) {
                    int hexDigit = AbstractC2278c.parseHexDigit(str.charAt(i + 1));
                    int hexDigit2 = AbstractC2278c.parseHexDigit(str.charAt(i8));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        c2573j.m4663S(iCodePointAt);
                        i += Character.charCount(iCodePointAt);
                    } else {
                        c2573j.m4655K((hexDigit << 4) + hexDigit2);
                        i = Character.charCount(iCodePointAt) + i8;
                    }
                } else if (iCodePointAt == 43 && z7) {
                    c2573j.m4655K(32);
                    i++;
                } else {
                    c2573j.m4663S(iCodePointAt);
                    i += Character.charCount(iCodePointAt);
                }
            }
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final C2181z m5284deprecated_get(String str) {
            AbstractC2980h.m5136e("url", str);
            return get(str);
        }

        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final C2181z m5287deprecated_parse(String str) {
            AbstractC2980h.m5136e("url", str);
            return parse(str);
        }

        public final String canonicalize$okhttp(String str, int i, int i4, String str2, boolean z7, boolean z8, boolean z9, boolean z10, Charset charset) throws EOFException {
            AbstractC2980h.m5136e("<this>", str);
            AbstractC2980h.m5136e("encodeSet", str2);
            int iCharCount = i;
            while (iCharCount < i4) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z10) || AbstractC1206h.m2650v0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z7 || (z8 && !isPercentEncoded(str, iCharCount, i4)))) || (iCodePointAt == 43 && z9)))) {
                    C2573j c2573j = new C2573j();
                    c2573j.m4662R(str, i, iCharCount);
                    writeCanonicalized(c2573j, str, iCharCount, i4, str2, z7, z8, z9, z10, charset);
                    return c2573j.m4651G();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i, i4);
            AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
            return strSubstring;
        }

        public final int defaultPort(String str) {
            AbstractC2980h.m5136e("scheme", str);
            if (str.equals("http")) {
                return 80;
            }
            return str.equals("https") ? 443 : -1;
        }

        public final C2181z get(String str) {
            AbstractC2980h.m5136e("<this>", str);
            return new a().parse$okhttp(null, str).build();
        }

        public final C2181z parse(String str) {
            AbstractC2980h.m5136e("<this>", str);
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i, int i4, boolean z7) {
            AbstractC2980h.m5136e("<this>", str);
            for (int i8 = i; i8 < i4; i8++) {
                char cCharAt = str.charAt(i8);
                if (cCharAt == '%' || (cCharAt == '+' && z7)) {
                    C2573j c2573j = new C2573j();
                    c2573j.m4662R(str, i, i8);
                    writePercentDecoded(c2573j, str, i8, i4, z7);
                    return c2573j.m4651G();
                }
            }
            String strSubstring = str.substring(i, i4);
            AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
            return strSubstring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
            AbstractC2980h.m5136e("<this>", list);
            AbstractC2980h.m5136e("out", sb);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            AbstractC2980h.m5136e("<this>", str);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iM2627A0 = AbstractC1206h.m2627A0(str, '&', i, 4);
                if (iM2627A0 == -1) {
                    iM2627A0 = str.length();
                }
                int iM2627A02 = AbstractC1206h.m2627A0(str, '=', i, 4);
                if (iM2627A02 == -1 || iM2627A02 > iM2627A0) {
                    String strSubstring = str.substring(i, iM2627A0);
                    AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iM2627A02);
                    AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring2);
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iM2627A02 + 1, iM2627A0);
                    AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring3);
                    arrayList.add(strSubstring3);
                }
                i = iM2627A0 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
            AbstractC2980h.m5136e("<this>", list);
            AbstractC2980h.m5136e("out", sb);
            C0924a c0924aM1513b0 = AbstractC0714c.m1513b0(AbstractC0714c.m1521g0(0, list.size()), 2);
            int i = c0924aM1513b0.f3986j;
            int i4 = c0924aM1513b0.f3987k;
            int i8 = c0924aM1513b0.f3988l;
            if ((i8 <= 0 || i > i4) && (i8 >= 0 || i4 > i)) {
                return;
            }
            while (true) {
                String str = list.get(i);
                String str2 = list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i == i4) {
                    return;
                } else {
                    i += i8;
                }
            }
        }

        private b() {
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final C2181z m5286deprecated_get(URL url) {
            AbstractC2980h.m5136e("url", url);
            return get(url);
        }

        public final C2181z get(URL url) {
            AbstractC2980h.m5136e("<this>", url);
            String string = url.toString();
            AbstractC2980h.m5135d("toString()", string);
            return parse(string);
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final C2181z m5285deprecated_get(URI uri) {
            AbstractC2980h.m5136e("uri", uri);
            return get(uri);
        }

        public final C2181z get(URI uri) {
            AbstractC2980h.m5136e("<this>", uri);
            String string = uri.toString();
            AbstractC2980h.m5135d("toString()", string);
            return parse(string);
        }
    }

    public C2181z(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        AbstractC2980h.m5136e("scheme", str);
        AbstractC2980h.m5136e("username", str2);
        AbstractC2980h.m5136e("password", str3);
        AbstractC2980h.m5136e("host", str4);
        AbstractC2980h.m5136e("pathSegments", list);
        AbstractC2980h.m5136e("url", str6);
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = AbstractC2980h.m5132a(str, "https");
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final C2181z get(String str) {
        return Companion.get(str);
    }

    public static final C2181z parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m5265deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m5266deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m5267deprecated_encodedPath() {
        return encodedPath();
    }

    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m5268deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m5269deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m5270deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m5271deprecated_fragment() {
        return this.fragment;
    }

    /* renamed from: -deprecated_host, reason: not valid java name */
    public final String m5272deprecated_host() {
        return this.host;
    }

    /* renamed from: -deprecated_password, reason: not valid java name */
    public final String m5273deprecated_password() {
        return this.password;
    }

    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m5274deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m5275deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_port, reason: not valid java name */
    public final int m5276deprecated_port() {
        return this.port;
    }

    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m5277deprecated_query() {
        return query();
    }

    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m5278deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m5279deprecated_querySize() {
        return querySize();
    }

    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m5280deprecated_scheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m5281deprecated_uri() {
        return uri();
    }

    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m5282deprecated_url() {
        return url();
    }

    /* renamed from: -deprecated_username, reason: not valid java name */
    public final String m5283deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(AbstractC1206h.m2627A0(this.url, '#', 0, 6) + 1);
        AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring);
        return strSubstring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        String strSubstring = this.url.substring(AbstractC1206h.m2627A0(this.url, ':', this.scheme.length() + 3, 4) + 1, AbstractC1206h.m2627A0(this.url, '@', 0, 6));
        AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final String encodedPath() {
        int iM2627A0 = AbstractC1206h.m2627A0(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        String strSubstring = this.url.substring(iM2627A0, AbstractC2278c.delimiterOffset(str, "?#", iM2627A0, str.length()));
        AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final List<String> encodedPathSegments() {
        int iM2627A0 = AbstractC1206h.m2627A0(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        int iDelimiterOffset = AbstractC2278c.delimiterOffset(str, "?#", iM2627A0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iM2627A0 < iDelimiterOffset) {
            int i = iM2627A0 + 1;
            int iDelimiterOffset2 = AbstractC2278c.delimiterOffset(this.url, '/', i, iDelimiterOffset);
            String strSubstring = this.url.substring(i, iDelimiterOffset2);
            AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
            arrayList.add(strSubstring);
            iM2627A0 = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iM2627A0 = AbstractC1206h.m2627A0(this.url, '?', 0, 6) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iM2627A0, AbstractC2278c.delimiterOffset(str, '#', iM2627A0, str.length()));
        AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, AbstractC2278c.delimiterOffset(str, ":@", length, str.length()));
        AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2181z) && AbstractC2980h.m5132a(((C2181z) obj).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final a newBuilder() {
        a aVar = new a();
        aVar.setScheme$okhttp(this.scheme);
        aVar.setEncodedUsername$okhttp(encodedUsername());
        aVar.setEncodedPassword$okhttp(encodedPassword());
        aVar.setHost$okhttp(this.host);
        aVar.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        aVar.getEncodedPathSegments$okhttp().clear();
        aVar.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        aVar.encodedQuery(encodedQuery());
        aVar.setEncodedFragment$okhttp(encodedFragment());
        return aVar;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String str) {
        AbstractC2980h.m5136e("name", str);
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        C0924a c0924aM1513b0 = AbstractC0714c.m1513b0(AbstractC0714c.m1521g0(0, list.size()), 2);
        int i = c0924aM1513b0.f3986j;
        int i4 = c0924aM1513b0.f3987k;
        int i8 = c0924aM1513b0.f3988l;
        if ((i8 <= 0 || i > i4) && (i8 >= 0 || i4 > i)) {
            return null;
        }
        while (!str.equals(this.queryNamesAndValues.get(i))) {
            if (i == i4) {
                return null;
            }
            i += i8;
        }
        return this.queryNamesAndValues.get(i + 1);
    }

    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i * 2);
        AbstractC2980h.m5133b(str);
        return str;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return C1923r.f7189j;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C0924a c0924aM1513b0 = AbstractC0714c.m1513b0(AbstractC0714c.m1521g0(0, this.queryNamesAndValues.size()), 2);
        int i = c0924aM1513b0.f3986j;
        int i4 = c0924aM1513b0.f3987k;
        int i8 = c0924aM1513b0.f3988l;
        if ((i8 > 0 && i <= i4) || (i8 < 0 && i4 <= i)) {
            while (true) {
                String str = this.queryNamesAndValues.get(i);
                AbstractC2980h.m5133b(str);
                linkedHashSet.add(str);
                if (i == i4) {
                    break;
                }
                i += i8;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        AbstractC2980h.m5135d("unmodifiableSet(result)", setUnmodifiableSet);
        return setUnmodifiableSet;
    }

    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String str) {
        AbstractC2980h.m5136e("name", str);
        if (this.queryNamesAndValues == null) {
            return C1921p.f7187j;
        }
        ArrayList arrayList = new ArrayList();
        C0924a c0924aM1513b0 = AbstractC0714c.m1513b0(AbstractC0714c.m1521g0(0, this.queryNamesAndValues.size()), 2);
        int i = c0924aM1513b0.f3986j;
        int i4 = c0924aM1513b0.f3987k;
        int i8 = c0924aM1513b0.f3988l;
        if ((i8 > 0 && i <= i4) || (i8 < 0 && i4 <= i)) {
            while (true) {
                if (str.equals(this.queryNamesAndValues.get(i))) {
                    arrayList.add(this.queryNamesAndValues.get(i + 1));
                }
                if (i == i4) {
                    break;
                }
                i += i8;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        AbstractC2980h.m5135d("unmodifiableList(result)", listUnmodifiableList);
        return listUnmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        a aVarNewBuilder = newBuilder("/...");
        AbstractC2980h.m5133b(aVarNewBuilder);
        return aVarNewBuilder.username(FRAGMENT_ENCODE_SET).password(FRAGMENT_ENCODE_SET).build().toString();
    }

    public final C2181z resolve(String str) {
        AbstractC2980h.m5136e("link", str);
        a aVarNewBuilder = newBuilder(str);
        if (aVarNewBuilder != null) {
            return aVarNewBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (AbstractC2278c.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC2980h.m5135d("compile(...)", patternCompile);
                AbstractC2980h.m5136e("input", string);
                String strReplaceAll = patternCompile.matcher(string).replaceAll(FRAGMENT_ENCODE_SET);
                AbstractC2980h.m5135d("replaceAll(...)", strReplaceAll);
                URI uriCreate = URI.create(strReplaceAll);
                AbstractC2980h.m5135d("{\n      // Unlikely edge\u2026Unexpected!\n      }\n    }", uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String username() {
        return this.username;
    }

    public static final C2181z get(URI uri) {
        return Companion.get(uri);
    }

    public static final C2181z get(URL url) {
        return Companion.get(url);
    }

    public final a newBuilder(String str) {
        AbstractC2980h.m5136e("link", str);
        try {
            return new a().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
