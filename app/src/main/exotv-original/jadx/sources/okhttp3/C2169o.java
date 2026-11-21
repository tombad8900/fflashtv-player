package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http.AbstractC2105d;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p111m6.C1921p;
import p147q7.AbstractC2276a;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.o */
/* loaded from: classes.dex */
public final class C2169o {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final a Companion = new a(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.o$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        private final int dateCharacterOffset(String str, int i, int i4, boolean z7) {
            while (i < i4) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= '\u007f' || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z7)) {
                    return i;
                }
                i++;
            }
            return i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            return AbstractC2980h.m5132a(str, str2) || (AbstractC1214p.m2660m0(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.' && !AbstractC2278c.canParseAsIpAddress(str));
        }

        private final String parseDomain(String str) {
            if (AbstractC1214p.m2660m0(str, ".", false)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String canonicalHost = AbstractC2276a.toCanonicalHost(AbstractC1206h.m2635I0(str, "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        private final long parseExpires(String str, int i, int i4) throws NumberFormatException {
            int iDateCharacterOffset = dateCharacterOffset(str, i, i4, false);
            Matcher matcher = C2169o.TIME_PATTERN.matcher(str);
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int iM2628B0 = -1;
            int i11 = -1;
            int i12 = -1;
            while (iDateCharacterOffset < i4) {
                int iDateCharacterOffset2 = dateCharacterOffset(str, iDateCharacterOffset + 1, i4, true);
                matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
                if (i9 == -1 && matcher.usePattern(C2169o.TIME_PATTERN).matches()) {
                    String strGroup = matcher.group(1);
                    AbstractC2980h.m5135d("matcher.group(1)", strGroup);
                    i9 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    AbstractC2980h.m5135d("matcher.group(2)", strGroup2);
                    i11 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    AbstractC2980h.m5135d("matcher.group(3)", strGroup3);
                    i12 = Integer.parseInt(strGroup3);
                } else if (i10 == -1 && matcher.usePattern(C2169o.DAY_OF_MONTH_PATTERN).matches()) {
                    String strGroup4 = matcher.group(1);
                    AbstractC2980h.m5135d("matcher.group(1)", strGroup4);
                    i10 = Integer.parseInt(strGroup4);
                } else if (iM2628B0 == -1 && matcher.usePattern(C2169o.MONTH_PATTERN).matches()) {
                    String strGroup5 = matcher.group(1);
                    AbstractC2980h.m5135d("matcher.group(1)", strGroup5);
                    Locale locale = Locale.US;
                    AbstractC2980h.m5135d("US", locale);
                    String lowerCase = strGroup5.toLowerCase(locale);
                    AbstractC2980h.m5135d("this as java.lang.String).toLowerCase(locale)", lowerCase);
                    String strPattern = C2169o.MONTH_PATTERN.pattern();
                    AbstractC2980h.m5135d("MONTH_PATTERN.pattern()", strPattern);
                    iM2628B0 = AbstractC1206h.m2628B0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i8 == -1 && matcher.usePattern(C2169o.YEAR_PATTERN).matches()) {
                    String strGroup6 = matcher.group(1);
                    AbstractC2980h.m5135d("matcher.group(1)", strGroup6);
                    i8 = Integer.parseInt(strGroup6);
                }
                iDateCharacterOffset = dateCharacterOffset(str, iDateCharacterOffset2 + 1, i4, false);
            }
            if (70 <= i8 && i8 < 100) {
                i8 += 1900;
            }
            if (i8 >= 0 && i8 < 70) {
                i8 += 2000;
            }
            if (i8 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iM2628B0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i10 || i10 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i9 < 0 || i9 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i11 < 0 || i11 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i12 < 0 || i12 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC2278c.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i8);
            gregorianCalendar.set(2, iM2628B0 - 1);
            gregorianCalendar.set(5, i10);
            gregorianCalendar.set(11, i9);
            gregorianCalendar.set(12, i11);
            gregorianCalendar.set(13, i12);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long parseMaxAge(String str) throws NumberFormatException {
            try {
                long j = Long.parseLong(str);
                if (j <= 0) {
                    return Long.MIN_VALUE;
                }
                return j;
            } catch (NumberFormatException e) {
                Pattern patternCompile = Pattern.compile("-?\\d+");
                AbstractC2980h.m5135d("compile(...)", patternCompile);
                AbstractC2980h.m5136e("input", str);
                if (patternCompile.matcher(str).matches()) {
                    return AbstractC1214p.m2667t0(str, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(C2181z c2181z, String str) {
            String strEncodedPath = c2181z.encodedPath();
            if (AbstractC2980h.m5132a(strEncodedPath, str)) {
                return true;
            }
            return AbstractC1214p.m2667t0(strEncodedPath, str, false) && (AbstractC1214p.m2660m0(str, "/", false) || strEncodedPath.charAt(str.length()) == '/');
        }

        public final C2169o parse(C2181z c2181z, String str) {
            AbstractC2980h.m5136e("url", c2181z);
            AbstractC2980h.m5136e("setCookie", str);
            return parse$okhttp(System.currentTimeMillis(), c2181z, str);
        }

        public final C2169o parse$okhttp(long j, C2181z c2181z, String str) throws NumberFormatException {
            long j8;
            String str2;
            AbstractC2980h.m5136e("url", c2181z);
            AbstractC2980h.m5136e("setCookie", str);
            int iDelimiterOffset$default = AbstractC2278c.delimiterOffset$default(str, ';', 0, 0, 6, (Object) null);
            int iDelimiterOffset$default2 = AbstractC2278c.delimiterOffset$default(str, '=', 0, iDelimiterOffset$default, 2, (Object) null);
            String domain = null;
            if (iDelimiterOffset$default2 != iDelimiterOffset$default) {
                String strTrimSubstring$default = AbstractC2278c.trimSubstring$default(str, 0, iDelimiterOffset$default2, 1, null);
                if (strTrimSubstring$default.length() != 0 && AbstractC2278c.indexOfControlOrNonAscii(strTrimSubstring$default) == -1) {
                    String strTrimSubstring = AbstractC2278c.trimSubstring(str, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
                    if (AbstractC2278c.indexOfControlOrNonAscii(strTrimSubstring) == -1) {
                        int i = iDelimiterOffset$default + 1;
                        int length = str.length();
                        boolean z7 = false;
                        boolean z8 = false;
                        boolean z9 = false;
                        boolean z10 = true;
                        long maxAge = -1;
                        long expires = AbstractC2105d.MAX_DATE;
                        String str3 = null;
                        while (i < length) {
                            int iDelimiterOffset = AbstractC2278c.delimiterOffset(str, ';', i, length);
                            int iDelimiterOffset2 = AbstractC2278c.delimiterOffset(str, '=', i, iDelimiterOffset);
                            String strTrimSubstring2 = AbstractC2278c.trimSubstring(str, i, iDelimiterOffset2);
                            String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? AbstractC2278c.trimSubstring(str, iDelimiterOffset2 + 1, iDelimiterOffset) : C2181z.FRAGMENT_ENCODE_SET;
                            if (AbstractC1214p.m2661n0(strTrimSubstring2, "expires")) {
                                try {
                                    expires = parseExpires(strTrimSubstring3, 0, strTrimSubstring3.length());
                                    z8 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (AbstractC1214p.m2661n0(strTrimSubstring2, "max-age")) {
                                maxAge = parseMaxAge(strTrimSubstring3);
                                z8 = true;
                            } else if (AbstractC1214p.m2661n0(strTrimSubstring2, "domain")) {
                                domain = parseDomain(strTrimSubstring3);
                                z10 = false;
                            } else if (AbstractC1214p.m2661n0(strTrimSubstring2, "path")) {
                                str3 = strTrimSubstring3;
                            } else if (AbstractC1214p.m2661n0(strTrimSubstring2, "secure")) {
                                z9 = true;
                            } else if (AbstractC1214p.m2661n0(strTrimSubstring2, "httponly")) {
                                z7 = true;
                            }
                            i = iDelimiterOffset + 1;
                        }
                        if (maxAge == Long.MIN_VALUE) {
                            j8 = Long.MIN_VALUE;
                        } else if (maxAge != -1) {
                            long j9 = j + (maxAge <= 9223372036854775L ? maxAge * 1000 : Long.MAX_VALUE);
                            j8 = (j9 < j || j9 > AbstractC2105d.MAX_DATE) ? 253402300799999L : j9;
                        } else {
                            j8 = expires;
                        }
                        String strHost = c2181z.host();
                        if (domain == null) {
                            str2 = strHost;
                        } else {
                            if (!domainMatch(strHost, domain)) {
                                return null;
                            }
                            str2 = domain;
                        }
                        if (strHost.length() != str2.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(str2) == null) {
                            return null;
                        }
                        String strSubstring = "/";
                        if (str3 == null || !AbstractC1214p.m2667t0(str3, "/", false)) {
                            String strEncodedPath = c2181z.encodedPath();
                            int iM2631E0 = AbstractC1206h.m2631E0(strEncodedPath, '/', 0, 6);
                            if (iM2631E0 != 0) {
                                strSubstring = strEncodedPath.substring(0, iM2631E0);
                                AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
                            }
                            str3 = strSubstring;
                        }
                        return new C2169o(strTrimSubstring$default, strTrimSubstring, j8, str2, str3, z9, z7, z8, z10, null);
                    }
                }
            }
            return null;
        }

        public final List<C2169o> parseAll(C2181z c2181z, C2180y c2180y) {
            AbstractC2980h.m5136e("url", c2181z);
            AbstractC2980h.m5136e("headers", c2180y);
            List<String> listValues = c2180y.values("Set-Cookie");
            int size = listValues.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                C2169o c2169o = parse(c2181z, listValues.get(i));
                if (c2169o != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c2169o);
                }
            }
            if (arrayList == null) {
                return C1921p.f7187j;
            }
            List<C2169o> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC2980h.m5135d("{\n        Collections.un\u2026ableList(cookies)\n      }", listUnmodifiableList);
            return listUnmodifiableList;
        }

        private a() {
        }
    }

    public /* synthetic */ C2169o(String str, String str2, long j, String str3, String str4, boolean z7, boolean z8, boolean z9, boolean z10, AbstractC2977e abstractC2977e) {
        this(str, str2, j, str3, str4, z7, z8, z9, z10);
    }

    public static final C2169o parse(C2181z c2181z, String str) {
        return Companion.parse(c2181z, str);
    }

    public static final List<C2169o> parseAll(C2181z c2181z, C2180y c2180y) {
        return Companion.parseAll(c2181z, c2180y);
    }

    /* renamed from: -deprecated_domain, reason: not valid java name */
    public final String m5245deprecated_domain() {
        return this.domain;
    }

    /* renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m5246deprecated_expiresAt() {
        return this.expiresAt;
    }

    /* renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m5247deprecated_hostOnly() {
        return this.hostOnly;
    }

    /* renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m5248deprecated_httpOnly() {
        return this.httpOnly;
    }

    /* renamed from: -deprecated_name, reason: not valid java name */
    public final String m5249deprecated_name() {
        return this.name;
    }

    /* renamed from: -deprecated_path, reason: not valid java name */
    public final String m5250deprecated_path() {
        return this.path;
    }

    /* renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m5251deprecated_persistent() {
        return this.persistent;
    }

    /* renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m5252deprecated_secure() {
        return this.secure;
    }

    /* renamed from: -deprecated_value, reason: not valid java name */
    public final String m5253deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2169o)) {
            return false;
        }
        C2169o c2169o = (C2169o) obj;
        return AbstractC2980h.m5132a(c2169o.name, this.name) && AbstractC2980h.m5132a(c2169o.value, this.value) && c2169o.expiresAt == this.expiresAt && AbstractC2980h.m5132a(c2169o.domain, this.domain) && AbstractC2980h.m5132a(c2169o.path, this.path) && c2169o.secure == this.secure && c2169o.httpOnly == this.httpOnly && c2169o.persistent == this.persistent && c2169o.hostOnly == this.hostOnly;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return Boolean.hashCode(this.hostOnly) + ((Boolean.hashCode(this.persistent) + ((Boolean.hashCode(this.httpOnly) + ((Boolean.hashCode(this.secure) + AbstractC0008a1.m9e(this.path, AbstractC0008a1.m9e(this.domain, (Long.hashCode(this.expiresAt) + AbstractC0008a1.m9e(this.value, AbstractC0008a1.m9e(this.name, 527, 31), 31)) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(C2181z c2181z) {
        AbstractC2980h.m5136e("url", c2181z);
        if ((this.hostOnly ? AbstractC2980h.m5132a(c2181z.host(), this.domain) : Companion.domainMatch(c2181z.host(), this.domain)) && Companion.pathMatch(c2181z, this.path)) {
            return !this.secure || c2181z.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(AbstractC2105d.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (z7) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        AbstractC2980h.m5135d("toString()", string);
        return string;
    }

    public final String value() {
        return this.value;
    }

    private C2169o(String str, String str2, long j, String str3, String str4, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z7;
        this.httpOnly = z8;
        this.persistent = z9;
        this.hostOnly = z10;
    }
}
