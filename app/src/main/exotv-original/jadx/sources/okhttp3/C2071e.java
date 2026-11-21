package okhttp3;

import java.util.concurrent.TimeUnit;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.e */
/* loaded from: classes.dex */
public final class C2071e {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final b Companion = new b(null);
    public static final C2071e FORCE_NETWORK = new a().noCache().build();
    public static final C2071e FORCE_CACHE = new a().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.e$a */
    public static final class a {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final C2071e build() {
            return new C2071e(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final a immutable() {
            this.immutable = true;
            return this;
        }

        public final a maxAge(int i, TimeUnit timeUnit) {
            AbstractC2980h.m5136e("timeUnit", timeUnit);
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "maxAge < 0: ").toString());
            }
            this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i));
            return this;
        }

        public final a maxStale(int i, TimeUnit timeUnit) {
            AbstractC2980h.m5136e("timeUnit", timeUnit);
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "maxStale < 0: ").toString());
            }
            this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i));
            return this;
        }

        public final a minFresh(int i, TimeUnit timeUnit) {
            AbstractC2980h.m5136e("timeUnit", timeUnit);
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "minFresh < 0: ").toString());
            }
            this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i));
            return this;
        }

        public final a noCache() {
            this.noCache = true;
            return this;
        }

        public final a noStore() {
            this.noStore = true;
            return this;
        }

        public final a noTransform() {
            this.noTransform = true;
            return this;
        }

        public final a onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.e$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (AbstractC1206h.m2650v0(str2, str.charAt(i))) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(b bVar, String str, String str2, int i, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                i = 0;
            }
            return bVar.indexOfElement(str, str2, i);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C2071e parse(C2180y c2180y) {
            int i;
            int i4;
            int iIndexOfElement;
            String string;
            C2180y c2180y2 = c2180y;
            AbstractC2980h.m5136e("headers", c2180y2);
            int size = c2180y2.size();
            int i8 = 0;
            boolean z7 = true;
            String str = null;
            boolean z8 = false;
            boolean z9 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            while (i8 < size) {
                String strName = c2180y2.name(i8);
                String strValue = c2180y2.value(i8);
                if (AbstractC1214p.m2661n0(strName, "Cache-Control")) {
                    if (str == null) {
                        str = strValue;
                    }
                    i = 0;
                    while (i < strValue.length()) {
                        int iIndexOfElement2 = indexOfElement(strValue, "=,;", i);
                        String strSubstring = strValue.substring(i, iIndexOfElement2);
                        AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring);
                        String string2 = AbstractC1206h.m2645S0(strSubstring).toString();
                        if (iIndexOfElement2 != strValue.length()) {
                            i4 = size;
                            if (strValue.charAt(iIndexOfElement2) != ',' && strValue.charAt(iIndexOfElement2) != ';') {
                                int iIndexOfNonWhitespace = AbstractC2278c.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                                if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                                    iIndexOfElement = indexOfElement(strValue, ",;", iIndexOfNonWhitespace);
                                    String strSubstring2 = strValue.substring(iIndexOfNonWhitespace, iIndexOfElement);
                                    AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", strSubstring2);
                                    string = AbstractC1206h.m2645S0(strSubstring2).toString();
                                } else {
                                    int i9 = iIndexOfNonWhitespace + 1;
                                    int iM2627A0 = AbstractC1206h.m2627A0(strValue, '\"', i9, 4);
                                    string = strValue.substring(i9, iM2627A0);
                                    AbstractC2980h.m5135d("this as java.lang.String\u2026ing(startIndex, endIndex)", string);
                                    iIndexOfElement = iM2627A0 + 1;
                                }
                            }
                            if (!"no-cache".equalsIgnoreCase(string2)) {
                                i = iIndexOfElement;
                                z8 = true;
                            } else if ("no-store".equalsIgnoreCase(string2)) {
                                i = iIndexOfElement;
                                z9 = true;
                            } else {
                                if ("max-age".equalsIgnoreCase(string2)) {
                                    nonNegativeInt = AbstractC2278c.toNonNegativeInt(string, -1);
                                } else if ("s-maxage".equalsIgnoreCase(string2)) {
                                    nonNegativeInt2 = AbstractC2278c.toNonNegativeInt(string, -1);
                                } else if ("private".equalsIgnoreCase(string2)) {
                                    i = iIndexOfElement;
                                    z10 = true;
                                } else if ("public".equalsIgnoreCase(string2)) {
                                    i = iIndexOfElement;
                                    z11 = true;
                                } else if ("must-revalidate".equalsIgnoreCase(string2)) {
                                    i = iIndexOfElement;
                                    z12 = true;
                                } else if ("max-stale".equalsIgnoreCase(string2)) {
                                    nonNegativeInt3 = AbstractC2278c.toNonNegativeInt(string, Integer.MAX_VALUE);
                                } else if ("min-fresh".equalsIgnoreCase(string2)) {
                                    nonNegativeInt4 = AbstractC2278c.toNonNegativeInt(string, -1);
                                } else if ("only-if-cached".equalsIgnoreCase(string2)) {
                                    i = iIndexOfElement;
                                    z13 = true;
                                } else if ("no-transform".equalsIgnoreCase(string2)) {
                                    i = iIndexOfElement;
                                    z14 = true;
                                } else if ("immutable".equalsIgnoreCase(string2)) {
                                    i = iIndexOfElement;
                                    z15 = true;
                                }
                                i = iIndexOfElement;
                            }
                            size = i4;
                        } else {
                            i4 = size;
                        }
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string = null;
                        if (!"no-cache".equalsIgnoreCase(string2)) {
                        }
                        size = i4;
                    }
                    i8++;
                    c2180y2 = c2180y;
                    size = size;
                } else if (!AbstractC1214p.m2661n0(strName, "Pragma")) {
                    i8++;
                    c2180y2 = c2180y;
                    size = size;
                }
                z7 = false;
                i = 0;
                while (i < strValue.length()) {
                }
                i8++;
                c2180y2 = c2180y;
                size = size;
            }
            return new C2071e(z8, z9, nonNegativeInt, nonNegativeInt2, z10, z11, z12, nonNegativeInt3, nonNegativeInt4, z13, z14, z15, !z7 ? null : str, null);
        }

        private b() {
        }
    }

    public /* synthetic */ C2071e(boolean z7, boolean z8, int i, int i4, boolean z9, boolean z10, boolean z11, int i8, int i9, boolean z12, boolean z13, boolean z14, String str, AbstractC2977e abstractC2977e) {
        this(z7, z8, i, i4, z9, z10, z11, i8, i9, z12, z13, z14, str);
    }

    public static final C2071e parse(C2180y c2180y) {
        return Companion.parse(c2180y);
    }

    /* renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m5176deprecated_immutable() {
        return this.immutable;
    }

    /* renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m5177deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m5178deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m5179deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m5180deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m5181deprecated_noCache() {
        return this.noCache;
    }

    /* renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m5182deprecated_noStore() {
        return this.noStore;
    }

    /* renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m5183deprecated_noTransform() {
        return this.noTransform;
    }

    /* renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m5184deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m5185deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        AbstractC2980h.m5135d("StringBuilder().apply(builderAction).toString()", string);
        this.headerValue = string;
        return string;
    }

    private C2071e(boolean z7, boolean z8, int i, int i4, boolean z9, boolean z10, boolean z11, int i8, int i9, boolean z12, boolean z13, boolean z14, String str) {
        this.noCache = z7;
        this.noStore = z8;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i4;
        this.isPrivate = z9;
        this.isPublic = z10;
        this.mustRevalidate = z11;
        this.maxStaleSeconds = i8;
        this.minFreshSeconds = i9;
        this.onlyIfCached = z12;
        this.noTransform = z13;
        this.immutable = z14;
        this.headerValue = str;
    }
}
