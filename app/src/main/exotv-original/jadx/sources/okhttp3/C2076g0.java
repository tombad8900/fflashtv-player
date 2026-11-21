package okhttp3;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.C2180y;
import okhttp3.C2181z;
import okhttp3.internal.http.C2109h;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1214p;
import p102l6.C1687d;
import p111m6.AbstractC1914i;
import p111m6.AbstractC1924s;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.g0 */
/* loaded from: classes.dex */
public final class C2076g0 {
    private final AbstractC2078h0 body;
    private final C2180y headers;
    private C2071e lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final C2181z url;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.g0$a */
    public static class a {
        private AbstractC2078h0 body;
        private C2180y.a headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private C2181z url;

        public a() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new C2180y.a();
        }

        public static /* synthetic */ a delete$default(a aVar, AbstractC2078h0 abstractC2078h0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 1) != 0) {
                abstractC2078h0 = AbstractC2278c.EMPTY_REQUEST;
            }
            return aVar.delete(abstractC2078h0);
        }

        public a addHeader(String str, String str2) {
            AbstractC2980h.m5136e("name", str);
            AbstractC2980h.m5136e("value", str2);
            this.headers.add(str, str2);
            return this;
        }

        public C2076g0 build() {
            C2181z c2181z = this.url;
            if (c2181z != null) {
                return new C2076g0(c2181z, this.method, this.headers.build(), this.body, AbstractC2278c.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null");
        }

        public a cacheControl(C2071e c2071e) {
            AbstractC2980h.m5136e("cacheControl", c2071e);
            String string = c2071e.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public final a delete() {
            return delete$default(this, null, 1, null);
        }

        public a get() {
            return method("GET", null);
        }

        public final AbstractC2078h0 getBody$okhttp() {
            return this.body;
        }

        public final C2180y.a getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final C2181z getUrl$okhttp() {
            return this.url;
        }

        public a head() {
            return method("HEAD", null);
        }

        public a header(String str, String str2) {
            AbstractC2980h.m5136e("name", str);
            AbstractC2980h.m5136e("value", str2);
            this.headers.set(str, str2);
            return this;
        }

        public a headers(C2180y c2180y) {
            AbstractC2980h.m5136e("headers", c2180y);
            this.headers = c2180y.newBuilder();
            return this;
        }

        public a method(String str, AbstractC2078h0 abstractC2078h0) {
            AbstractC2980h.m5136e("method", str);
            if (str.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (abstractC2078h0 == null) {
                if (C2109h.requiresRequestBody(str)) {
                    throw new IllegalArgumentException(AbstractC0008a1.m17m("method ", str, " must have a request body.").toString());
                }
            } else if (!C2109h.permitsRequestBody(str)) {
                throw new IllegalArgumentException(AbstractC0008a1.m17m("method ", str, " must not have a request body.").toString());
            }
            this.method = str;
            this.body = abstractC2078h0;
            return this;
        }

        public a patch(AbstractC2078h0 abstractC2078h0) {
            AbstractC2980h.m5136e("body", abstractC2078h0);
            return method("PATCH", abstractC2078h0);
        }

        public a post(AbstractC2078h0 abstractC2078h0) {
            AbstractC2980h.m5136e("body", abstractC2078h0);
            return method("POST", abstractC2078h0);
        }

        public a put(AbstractC2078h0 abstractC2078h0) {
            AbstractC2980h.m5136e("body", abstractC2078h0);
            return method("PUT", abstractC2078h0);
        }

        public a removeHeader(String str) {
            AbstractC2980h.m5136e("name", str);
            this.headers.removeAll(str);
            return this;
        }

        public final void setBody$okhttp(AbstractC2078h0 abstractC2078h0) {
            this.body = abstractC2078h0;
        }

        public final void setHeaders$okhttp(C2180y.a aVar) {
            AbstractC2980h.m5136e("<set-?>", aVar);
            this.headers = aVar;
        }

        public final void setMethod$okhttp(String str) {
            AbstractC2980h.m5136e("<set-?>", str);
            this.method = str;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            AbstractC2980h.m5136e("<set-?>", map);
            this.tags = map;
        }

        public final void setUrl$okhttp(C2181z c2181z) {
            this.url = c2181z;
        }

        public a tag(Object obj) {
            return tag(Object.class, obj);
        }

        public a url(C2181z c2181z) {
            AbstractC2980h.m5136e("url", c2181z);
            this.url = c2181z;
            return this;
        }

        public a delete(AbstractC2078h0 abstractC2078h0) {
            return method("DELETE", abstractC2078h0);
        }

        public <T> a tag(Class<? super T> cls, T t8) {
            AbstractC2980h.m5136e("type", cls);
            if (t8 == null) {
                this.tags.remove(cls);
                return this;
            }
            if (this.tags.isEmpty()) {
                this.tags = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.tags;
            T tCast = cls.cast(t8);
            AbstractC2980h.m5133b(tCast);
            map.put(cls, tCast);
            return this;
        }

        public a url(String str) {
            AbstractC2980h.m5136e("url", str);
            if (AbstractC1214p.m2667t0(str, "ws:", true)) {
                String strSubstring = str.substring(3);
                AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring);
                str = "http:".concat(strSubstring);
            } else if (AbstractC1214p.m2667t0(str, "wss:", true)) {
                String strSubstring2 = str.substring(4);
                AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring2);
                str = "https:".concat(strSubstring2);
            }
            return url(C2181z.Companion.get(str));
        }

        public a(C2076g0 c2076g0) {
            LinkedHashMap linkedHashMapM3764Y;
            AbstractC2980h.m5136e("request", c2076g0);
            this.tags = new LinkedHashMap();
            this.url = c2076g0.url();
            this.method = c2076g0.method();
            this.body = c2076g0.body();
            if (c2076g0.getTags$okhttp().isEmpty()) {
                linkedHashMapM3764Y = new LinkedHashMap();
            } else {
                linkedHashMapM3764Y = AbstractC1924s.m3764Y(c2076g0.getTags$okhttp());
            }
            this.tags = linkedHashMapM3764Y;
            this.headers = c2076g0.headers().newBuilder();
        }

        public a url(URL url) {
            AbstractC2980h.m5136e("url", url);
            C2181z.b bVar = C2181z.Companion;
            String string = url.toString();
            AbstractC2980h.m5135d("url.toString()", string);
            return url(bVar.get(string));
        }
    }

    public C2076g0(C2181z c2181z, String str, C2180y c2180y, AbstractC2078h0 abstractC2078h0, Map<Class<?>, ? extends Object> map) {
        AbstractC2980h.m5136e("url", c2181z);
        AbstractC2980h.m5136e("method", str);
        AbstractC2980h.m5136e("headers", c2180y);
        AbstractC2980h.m5136e("tags", map);
        this.url = c2181z;
        this.method = str;
        this.headers = c2180y;
        this.body = abstractC2078h0;
        this.tags = map;
    }

    /* renamed from: -deprecated_body, reason: not valid java name */
    public final AbstractC2078h0 m5214deprecated_body() {
        return this.body;
    }

    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final C2071e m5215deprecated_cacheControl() {
        return cacheControl();
    }

    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final C2180y m5216deprecated_headers() {
        return this.headers;
    }

    /* renamed from: -deprecated_method, reason: not valid java name */
    public final String m5217deprecated_method() {
        return this.method;
    }

    /* renamed from: -deprecated_url, reason: not valid java name */
    public final C2181z m5218deprecated_url() {
        return this.url;
    }

    public final AbstractC2078h0 body() {
        return this.body;
    }

    public final C2071e cacheControl() {
        C2071e c2071e = this.lazyCacheControl;
        if (c2071e != null) {
            return c2071e;
        }
        C2071e c2071e2 = C2071e.Companion.parse(this.headers);
        this.lazyCacheControl = c2071e2;
        return c2071e2;
    }

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String str) {
        AbstractC2980h.m5136e("name", str);
        return this.headers.get(str);
    }

    public final C2180y headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final a newBuilder() {
        return new a(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : this.headers) {
                int i4 = i + 1;
                if (i < 0) {
                    AbstractC1914i.m3755v0();
                    throw null;
                }
                C1687d c1687d = (C1687d) obj;
                String str = (String) c1687d.f6486j;
                String str2 = (String) c1687d.f6487k;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i4;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC2980h.m5135d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public final C2181z url() {
        return this.url;
    }

    public final List<String> headers(String str) {
        AbstractC2980h.m5136e("name", str);
        return this.headers.values(str);
    }

    public final <T> T tag(Class<? extends T> cls) {
        AbstractC2980h.m5136e("type", cls);
        return cls.cast(this.tags.get(cls));
    }
}
