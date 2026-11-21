package okhttp3;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import okhttp3.C2180y;
import okhttp3.internal.connection.C2093c;
import okhttp3.internal.http.AbstractC2108g;
import p002a1.AbstractC0008a1;
import p111m6.C1921p;
import p189v7.C2564e0;
import p189v7.C2573j;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.i0 */
/* loaded from: classes.dex */
public final class C2080i0 implements Closeable {
    private final AbstractC2160j0 body;
    private final C2080i0 cacheResponse;
    private final int code;
    private final C2093c exchange;
    private final C2179x handshake;
    private final C2180y headers;
    private C2071e lazyCacheControl;
    private final String message;
    private final C2080i0 networkResponse;
    private final C2080i0 priorResponse;
    private final EnumC2074f0 protocol;
    private final long receivedResponseAtMillis;
    private final C2076g0 request;
    private final long sentRequestAtMillis;

    public C2080i0(C2076g0 c2076g0, EnumC2074f0 enumC2074f0, String str, int i, C2179x c2179x, C2180y c2180y, AbstractC2160j0 abstractC2160j0, C2080i0 c2080i0, C2080i0 c2080i02, C2080i0 c2080i03, long j, long j8, C2093c c2093c) {
        AbstractC2980h.m5136e("request", c2076g0);
        AbstractC2980h.m5136e("protocol", enumC2074f0);
        AbstractC2980h.m5136e("message", str);
        AbstractC2980h.m5136e("headers", c2180y);
        this.request = c2076g0;
        this.protocol = enumC2074f0;
        this.message = str;
        this.code = i;
        this.handshake = c2179x;
        this.headers = c2180y;
        this.body = abstractC2160j0;
        this.networkResponse = c2080i0;
        this.cacheResponse = c2080i02;
        this.priorResponse = c2080i03;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j8;
        this.exchange = c2093c;
    }

    public static /* synthetic */ String header$default(C2080i0 c2080i0, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c2080i0.header(str, str2);
    }

    /* renamed from: -deprecated_body, reason: not valid java name */
    public final AbstractC2160j0 m5219deprecated_body() {
        return this.body;
    }

    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final C2071e m5220deprecated_cacheControl() {
        return cacheControl();
    }

    /* renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final C2080i0 m5221deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    /* renamed from: -deprecated_code, reason: not valid java name */
    public final int m5222deprecated_code() {
        return this.code;
    }

    /* renamed from: -deprecated_handshake, reason: not valid java name */
    public final C2179x m5223deprecated_handshake() {
        return this.handshake;
    }

    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final C2180y m5224deprecated_headers() {
        return this.headers;
    }

    /* renamed from: -deprecated_message, reason: not valid java name */
    public final String m5225deprecated_message() {
        return this.message;
    }

    /* renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final C2080i0 m5226deprecated_networkResponse() {
        return this.networkResponse;
    }

    /* renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final C2080i0 m5227deprecated_priorResponse() {
        return this.priorResponse;
    }

    /* renamed from: -deprecated_protocol, reason: not valid java name */
    public final EnumC2074f0 m5228deprecated_protocol() {
        return this.protocol;
    }

    /* renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m5229deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* renamed from: -deprecated_request, reason: not valid java name */
    public final C2076g0 m5230deprecated_request() {
        return this.request;
    }

    /* renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m5231deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final AbstractC2160j0 body() {
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

    public final C2080i0 cacheResponse() {
        return this.cacheResponse;
    }

    public final List<C2159j> challenges() {
        String str;
        C2180y c2180y = this.headers;
        int i = this.code;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return C1921p.f7187j;
            }
            str = "Proxy-Authenticate";
        }
        return AbstractC2108g.parseChallenges(c2180y, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        AbstractC2160j0 abstractC2160j0 = this.body;
        if (abstractC2160j0 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC2160j0.close();
    }

    public final int code() {
        return this.code;
    }

    public final C2093c exchange() {
        return this.exchange;
    }

    public final C2179x handshake() {
        return this.handshake;
    }

    public final String header(String str) {
        AbstractC2980h.m5136e("name", str);
        return header$default(this, str, null, 2, null);
    }

    public final C2180y headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i = this.code;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final boolean isSuccessful() {
        int i = this.code;
        return 200 <= i && i < 300;
    }

    public final String message() {
        return this.message;
    }

    public final C2080i0 networkResponse() {
        return this.networkResponse;
    }

    public final a newBuilder() {
        return new a(this);
    }

    public final AbstractC2160j0 peekBody(long j) throws EOFException {
        AbstractC2160j0 abstractC2160j0 = this.body;
        AbstractC2980h.m5133b(abstractC2160j0);
        C2564e0 c2564e0Peek = abstractC2160j0.source().peek();
        C2573j c2573j = new C2573j();
        c2564e0Peek.request(j);
        long jMin = Math.min(j, c2564e0Peek.f9290k.f9314k);
        while (jMin > 0) {
            long j8 = c2564e0Peek.read(c2573j, jMin);
            if (j8 == -1) {
                throw new EOFException();
            }
            jMin -= j8;
        }
        return AbstractC2160j0.Companion.create(c2573j, this.body.contentType(), c2573j.f9314k);
    }

    public final C2080i0 priorResponse() {
        return this.priorResponse;
    }

    public final EnumC2074f0 protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final C2076g0 request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    public final C2180y trailers() {
        C2093c c2093c = this.exchange;
        if (c2093c != null) {
            return c2093c.trailers();
        }
        throw new IllegalStateException("trailers not available");
    }

    public final String header(String str, String str2) {
        AbstractC2980h.m5136e("name", str);
        String str3 = this.headers.get(str);
        return str3 == null ? str2 : str3;
    }

    public final List<String> headers(String str) {
        AbstractC2980h.m5136e("name", str);
        return this.headers.values(str);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.i0$a */
    public static class a {
        private AbstractC2160j0 body;
        private C2080i0 cacheResponse;
        private int code;
        private C2093c exchange;
        private C2179x handshake;
        private C2180y.a headers;
        private String message;
        private C2080i0 networkResponse;
        private C2080i0 priorResponse;
        private EnumC2074f0 protocol;
        private long receivedResponseAtMillis;
        private C2076g0 request;
        private long sentRequestAtMillis;

        public a() {
            this.code = -1;
            this.headers = new C2180y.a();
        }

        private final void checkPriorResponse(C2080i0 c2080i0) {
            if (c2080i0 != null && c2080i0.body() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void checkSupportResponse(String str, C2080i0 c2080i0) {
            if (c2080i0 != null) {
                if (c2080i0.body() != null) {
                    throw new IllegalArgumentException(AbstractC0008a1.m16l(str, ".body != null").toString());
                }
                if (c2080i0.networkResponse() != null) {
                    throw new IllegalArgumentException(AbstractC0008a1.m16l(str, ".networkResponse != null").toString());
                }
                if (c2080i0.cacheResponse() != null) {
                    throw new IllegalArgumentException(AbstractC0008a1.m16l(str, ".cacheResponse != null").toString());
                }
                if (c2080i0.priorResponse() != null) {
                    throw new IllegalArgumentException(AbstractC0008a1.m16l(str, ".priorResponse != null").toString());
                }
            }
        }

        public a addHeader(String str, String str2) {
            AbstractC2980h.m5136e("name", str);
            AbstractC2980h.m5136e("value", str2);
            this.headers.add(str, str2);
            return this;
        }

        public a body(AbstractC2160j0 abstractC2160j0) {
            this.body = abstractC2160j0;
            return this;
        }

        public C2080i0 build() {
            int i = this.code;
            if (i < 0) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            C2076g0 c2076g0 = this.request;
            if (c2076g0 == null) {
                throw new IllegalStateException("request == null");
            }
            EnumC2074f0 enumC2074f0 = this.protocol;
            if (enumC2074f0 == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new C2080i0(c2076g0, enumC2074f0, str, i, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null");
        }

        public a cacheResponse(C2080i0 c2080i0) {
            checkSupportResponse("cacheResponse", c2080i0);
            this.cacheResponse = c2080i0;
            return this;
        }

        public a code(int i) {
            this.code = i;
            return this;
        }

        public final AbstractC2160j0 getBody$okhttp() {
            return this.body;
        }

        public final C2080i0 getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        public final C2093c getExchange$okhttp() {
            return this.exchange;
        }

        public final C2179x getHandshake$okhttp() {
            return this.handshake;
        }

        public final C2180y.a getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMessage$okhttp() {
            return this.message;
        }

        public final C2080i0 getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        public final C2080i0 getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        public final EnumC2074f0 getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        public final C2076g0 getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        public a handshake(C2179x c2179x) {
            this.handshake = c2179x;
            return this;
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

        public final void initExchange$okhttp(C2093c c2093c) {
            AbstractC2980h.m5136e("deferredTrailers", c2093c);
            this.exchange = c2093c;
        }

        public a message(String str) {
            AbstractC2980h.m5136e("message", str);
            this.message = str;
            return this;
        }

        public a networkResponse(C2080i0 c2080i0) {
            checkSupportResponse("networkResponse", c2080i0);
            this.networkResponse = c2080i0;
            return this;
        }

        public a priorResponse(C2080i0 c2080i0) {
            checkPriorResponse(c2080i0);
            this.priorResponse = c2080i0;
            return this;
        }

        public a protocol(EnumC2074f0 enumC2074f0) {
            AbstractC2980h.m5136e("protocol", enumC2074f0);
            this.protocol = enumC2074f0;
            return this;
        }

        public a receivedResponseAtMillis(long j) {
            this.receivedResponseAtMillis = j;
            return this;
        }

        public a removeHeader(String str) {
            AbstractC2980h.m5136e("name", str);
            this.headers.removeAll(str);
            return this;
        }

        public a request(C2076g0 c2076g0) {
            AbstractC2980h.m5136e("request", c2076g0);
            this.request = c2076g0;
            return this;
        }

        public a sentRequestAtMillis(long j) {
            this.sentRequestAtMillis = j;
            return this;
        }

        public final void setBody$okhttp(AbstractC2160j0 abstractC2160j0) {
            this.body = abstractC2160j0;
        }

        public final void setCacheResponse$okhttp(C2080i0 c2080i0) {
            this.cacheResponse = c2080i0;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        public final void setExchange$okhttp(C2093c c2093c) {
            this.exchange = c2093c;
        }

        public final void setHandshake$okhttp(C2179x c2179x) {
            this.handshake = c2179x;
        }

        public final void setHeaders$okhttp(C2180y.a aVar) {
            AbstractC2980h.m5136e("<set-?>", aVar);
            this.headers = aVar;
        }

        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(C2080i0 c2080i0) {
            this.networkResponse = c2080i0;
        }

        public final void setPriorResponse$okhttp(C2080i0 c2080i0) {
            this.priorResponse = c2080i0;
        }

        public final void setProtocol$okhttp(EnumC2074f0 enumC2074f0) {
            this.protocol = enumC2074f0;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        public final void setRequest$okhttp(C2076g0 c2076g0) {
            this.request = c2076g0;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        public a(C2080i0 c2080i0) {
            AbstractC2980h.m5136e("response", c2080i0);
            this.code = -1;
            this.request = c2080i0.request();
            this.protocol = c2080i0.protocol();
            this.code = c2080i0.code();
            this.message = c2080i0.message();
            this.handshake = c2080i0.handshake();
            this.headers = c2080i0.headers().newBuilder();
            this.body = c2080i0.body();
            this.networkResponse = c2080i0.networkResponse();
            this.cacheResponse = c2080i0.cacheResponse();
            this.priorResponse = c2080i0.priorResponse();
            this.sentRequestAtMillis = c2080i0.sentRequestAtMillis();
            this.receivedResponseAtMillis = c2080i0.receivedResponseAtMillis();
            this.exchange = c2080i0.exchange();
        }
    }
}
