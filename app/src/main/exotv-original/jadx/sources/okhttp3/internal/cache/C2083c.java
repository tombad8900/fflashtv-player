package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.C2071e;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2180y;
import okhttp3.internal.http.AbstractC2105d;
import p069h7.AbstractC1214p;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.cache.c */
/* loaded from: classes.dex */
public final class C2083c {
    public static final a Companion = new a(null);
    private final C2080i0 cacheResponse;
    private final C2076g0 networkRequest;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.cache.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean isCacheable(C2080i0 c2080i0, C2076g0 c2076g0) {
            AbstractC2980h.m5136e("response", c2080i0);
            AbstractC2980h.m5136e("request", c2076g0);
            int iCode = c2080i0.code();
            if (iCode != 200 && iCode != 410 && iCode != 414 && iCode != 501 && iCode != 203 && iCode != 204) {
                if (iCode == 307) {
                    if (C2080i0.header$default(c2080i0, "Expires", null, 2, null) == null && c2080i0.cacheControl().maxAgeSeconds() == -1 && !c2080i0.cacheControl().isPublic() && !c2080i0.cacheControl().isPrivate()) {
                        return false;
                    }
                } else if (iCode != 308 && iCode != 404 && iCode != 405) {
                    switch (iCode) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (c2080i0.cacheControl().noStore() || c2076g0.cacheControl().noStore()) ? false : true;
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.cache.c$b */
    public static final class b {
        private int ageSeconds;
        private final C2080i0 cacheResponse;
        private String etag;
        private Date expires;
        private Date lastModified;
        private String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;
        private final C2076g0 request;
        private long sentRequestMillis;
        private Date servedDate;
        private String servedDateString;

        public b(long j, C2076g0 c2076g0, C2080i0 c2080i0) {
            AbstractC2980h.m5136e("request", c2076g0);
            this.nowMillis = j;
            this.request = c2076g0;
            this.cacheResponse = c2080i0;
            this.ageSeconds = -1;
            if (c2080i0 != null) {
                this.sentRequestMillis = c2080i0.sentRequestAtMillis();
                this.receivedResponseMillis = c2080i0.receivedResponseAtMillis();
                C2180y c2180yHeaders = c2080i0.headers();
                int size = c2180yHeaders.size();
                for (int i = 0; i < size; i++) {
                    String strName = c2180yHeaders.name(i);
                    String strValue = c2180yHeaders.value(i);
                    if (AbstractC1214p.m2661n0(strName, "Date")) {
                        this.servedDate = AbstractC2105d.toHttpDateOrNull(strValue);
                        this.servedDateString = strValue;
                    } else if (AbstractC1214p.m2661n0(strName, "Expires")) {
                        this.expires = AbstractC2105d.toHttpDateOrNull(strValue);
                    } else if (AbstractC1214p.m2661n0(strName, "Last-Modified")) {
                        this.lastModified = AbstractC2105d.toHttpDateOrNull(strValue);
                        this.lastModifiedString = strValue;
                    } else if (AbstractC1214p.m2661n0(strName, "ETag")) {
                        this.etag = strValue;
                    } else if (AbstractC1214p.m2661n0(strName, "Age")) {
                        this.ageSeconds = AbstractC2278c.toNonNegativeInt(strValue, -1);
                    }
                }
            }
        }

        private final long cacheResponseAge() {
            Date date = this.servedDate;
            long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i = this.ageSeconds;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.receivedResponseMillis;
            return jMax + (j - this.sentRequestMillis) + (this.nowMillis - j);
        }

        private final C2083c computeCandidate() {
            String str;
            if (this.cacheResponse == null) {
                return new C2083c(this.request, null);
            }
            if (this.request.isHttps() && this.cacheResponse.handshake() == null) {
                return new C2083c(this.request, null);
            }
            if (!C2083c.Companion.isCacheable(this.cacheResponse, this.request)) {
                return new C2083c(this.request, null);
            }
            C2071e c2071eCacheControl = this.request.cacheControl();
            if (c2071eCacheControl.noCache() || hasConditions(this.request)) {
                return new C2083c(this.request, null);
            }
            C2071e c2071eCacheControl2 = this.cacheResponse.cacheControl();
            long jCacheResponseAge = cacheResponseAge();
            long jComputeFreshnessLifetime = computeFreshnessLifetime();
            if (c2071eCacheControl.maxAgeSeconds() != -1) {
                jComputeFreshnessLifetime = Math.min(jComputeFreshnessLifetime, TimeUnit.SECONDS.toMillis(c2071eCacheControl.maxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = c2071eCacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(c2071eCacheControl.minFreshSeconds()) : 0L;
            if (!c2071eCacheControl2.mustRevalidate() && c2071eCacheControl.maxStaleSeconds() != -1) {
                millis = TimeUnit.SECONDS.toMillis(c2071eCacheControl.maxStaleSeconds());
            }
            if (!c2071eCacheControl2.noCache()) {
                long j = millis2 + jCacheResponseAge;
                if (j < millis + jComputeFreshnessLifetime) {
                    C2080i0.a aVarNewBuilder = this.cacheResponse.newBuilder();
                    if (j >= jComputeFreshnessLifetime) {
                        aVarNewBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jCacheResponseAge > 86400000 && isFreshnessLifetimeHeuristic()) {
                        aVarNewBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C2083c(null, aVarNewBuilder.build());
                }
            }
            String str2 = this.etag;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.lastModified != null) {
                    str2 = this.lastModifiedString;
                } else {
                    if (this.servedDate == null) {
                        return new C2083c(this.request, null);
                    }
                    str2 = this.servedDateString;
                }
                str = "If-Modified-Since";
            }
            C2180y.a aVarNewBuilder2 = this.request.headers().newBuilder();
            AbstractC2980h.m5133b(str2);
            aVarNewBuilder2.addLenient$okhttp(str, str2);
            return new C2083c(this.request.newBuilder().headers(aVarNewBuilder2.build()).build(), this.cacheResponse);
        }

        private final long computeFreshnessLifetime() {
            C2080i0 c2080i0 = this.cacheResponse;
            AbstractC2980h.m5133b(c2080i0);
            if (c2080i0.cacheControl().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified != null && this.cacheResponse.request().url().query() == null) {
                Date date3 = this.servedDate;
                long time2 = date3 != null ? date3.getTime() : this.sentRequestMillis;
                Date date4 = this.lastModified;
                AbstractC2980h.m5133b(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
            }
            return 0L;
        }

        private final boolean hasConditions(C2076g0 c2076g0) {
            return (c2076g0.header("If-Modified-Since") == null && c2076g0.header("If-None-Match") == null) ? false : true;
        }

        private final boolean isFreshnessLifetimeHeuristic() {
            C2080i0 c2080i0 = this.cacheResponse;
            AbstractC2980h.m5133b(c2080i0);
            return c2080i0.cacheControl().maxAgeSeconds() == -1 && this.expires == null;
        }

        public final C2083c compute() {
            C2083c c2083cComputeCandidate = computeCandidate();
            return (c2083cComputeCandidate.getNetworkRequest() == null || !this.request.cacheControl().onlyIfCached()) ? c2083cComputeCandidate : new C2083c(null, null);
        }

        public final C2076g0 getRequest$okhttp() {
            return this.request;
        }
    }

    public C2083c(C2076g0 c2076g0, C2080i0 c2080i0) {
        this.networkRequest = c2076g0;
        this.cacheResponse = c2080i0;
    }

    public final C2080i0 getCacheResponse() {
        return this.cacheResponse;
    }

    public final C2076g0 getNetworkRequest() {
        return this.networkRequest;
    }
}
