package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC2160j0;
import okhttp3.AbstractC2177v;
import okhttp3.C2069d;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2180y;
import okhttp3.EnumC2074f0;
import okhttp3.InterfaceC2064a0;
import okhttp3.InterfaceC2068c0;
import okhttp3.InterfaceC2075g;
import okhttp3.internal.cache.C2083c;
import okhttp3.internal.connection.C2095e;
import okhttp3.internal.http.AbstractC2108g;
import okhttp3.internal.http.C2109h;
import okhttp3.internal.http.C2111j;
import p069h7.AbstractC1214p;
import p147q7.AbstractC2278c;
import p189v7.AbstractC2557b;
import p189v7.C2573j;
import p189v7.C2582n0;
import p189v7.InterfaceC2572i0;
import p189v7.InterfaceC2575k;
import p189v7.InterfaceC2576k0;
import p189v7.InterfaceC2577l;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.cache.a */
/* loaded from: classes.dex */
public final class C2081a implements InterfaceC2068c0 {
    public static final a Companion = new a(null);
    private final C2069d cache;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.cache.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C2180y combine(C2180y c2180y, C2180y c2180y2) {
            C2180y.a aVar = new C2180y.a();
            int size = c2180y.size();
            for (int i = 0; i < size; i++) {
                String strName = c2180y.name(i);
                String strValue = c2180y.value(i);
                if ((!"Warning".equalsIgnoreCase(strName) || !AbstractC1214p.m2667t0(strValue, "1", false)) && (isContentSpecificHeader(strName) || !isEndToEnd(strName) || c2180y2.get(strName) == null)) {
                    aVar.addLenient$okhttp(strName, strValue);
                }
            }
            int size2 = c2180y2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String strName2 = c2180y2.name(i4);
                if (!isContentSpecificHeader(strName2) && isEndToEnd(strName2)) {
                    aVar.addLenient$okhttp(strName2, c2180y2.value(i4));
                }
            }
            return aVar.build();
        }

        private final boolean isContentSpecificHeader(String str) {
            return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
        }

        private final boolean isEndToEnd(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C2080i0 stripBody(C2080i0 c2080i0) {
            return (c2080i0 != null ? c2080i0.body() : null) != null ? c2080i0.newBuilder().body(null).build() : c2080i0;
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.cache.a$b */
    public static final class b implements InterfaceC2576k0 {
        final /* synthetic */ InterfaceC2575k $cacheBody;
        final /* synthetic */ InterfaceC2082b $cacheRequest;
        final /* synthetic */ InterfaceC2577l $source;
        private boolean cacheRequestClosed;

        public b(InterfaceC2577l interfaceC2577l, InterfaceC2082b interfaceC2082b, InterfaceC2575k interfaceC2575k) {
            this.$source = interfaceC2577l;
            this.$cacheRequest = interfaceC2082b;
            this.$cacheBody = interfaceC2575k;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.cacheRequestClosed && !AbstractC2278c.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.cacheRequestClosed = true;
                this.$cacheRequest.abort();
            }
            this.$source.close();
        }

        @Override // p189v7.InterfaceC2576k0
        public long read(C2573j c2573j, long j) throws IOException {
            AbstractC2980h.m5136e("sink", c2573j);
            try {
                long j8 = this.$source.read(c2573j, j);
                if (j8 != -1) {
                    c2573j.m4665c(this.$cacheBody.mo4596a(), c2573j.f9314k - j8, j8);
                    this.$cacheBody.mo4599l();
                    return j8;
                }
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.$cacheBody.close();
                }
                return -1L;
            } catch (IOException e) {
                if (this.cacheRequestClosed) {
                    throw e;
                }
                this.cacheRequestClosed = true;
                this.$cacheRequest.abort();
                throw e;
            }
        }

        @Override // p189v7.InterfaceC2576k0
        public C2582n0 timeout() {
            return this.$source.timeout();
        }
    }

    public C2081a(C2069d c2069d) {
        this.cache = c2069d;
    }

    private final C2080i0 cacheWritingResponse(InterfaceC2082b interfaceC2082b, C2080i0 c2080i0) {
        if (interfaceC2082b == null) {
            return c2080i0;
        }
        InterfaceC2572i0 interfaceC2572i0Body = interfaceC2082b.body();
        AbstractC2160j0 abstractC2160j0Body = c2080i0.body();
        AbstractC2980h.m5133b(abstractC2160j0Body);
        b bVar = new b(abstractC2160j0Body.source(), interfaceC2082b, AbstractC2557b.m4577b(interfaceC2572i0Body));
        return c2080i0.newBuilder().body(new C2111j(C2080i0.header$default(c2080i0, "Content-Type", null, 2, null), c2080i0.body().contentLength(), AbstractC2557b.m4578c(bVar))).build();
    }

    public final C2069d getCache$okhttp() {
        return this.cache;
    }

    @Override // okhttp3.InterfaceC2068c0
    public C2080i0 intercept(InterfaceC2064a0 interfaceC2064a0) throws Throwable {
        AbstractC2177v eventListener$okhttp;
        AbstractC2160j0 abstractC2160j0Body;
        AbstractC2160j0 abstractC2160j0Body2;
        AbstractC2980h.m5136e("chain", interfaceC2064a0);
        InterfaceC2075g interfaceC2075gCall = interfaceC2064a0.call();
        C2069d c2069d = this.cache;
        C2080i0 c2080i0 = c2069d != null ? c2069d.get$okhttp(interfaceC2064a0.request()) : null;
        C2083c c2083cCompute = new C2083c.b(System.currentTimeMillis(), interfaceC2064a0.request(), c2080i0).compute();
        C2076g0 networkRequest = c2083cCompute.getNetworkRequest();
        C2080i0 cacheResponse = c2083cCompute.getCacheResponse();
        C2069d c2069d2 = this.cache;
        if (c2069d2 != null) {
            c2069d2.trackResponse$okhttp(c2083cCompute);
        }
        C2095e c2095e = interfaceC2075gCall instanceof C2095e ? (C2095e) interfaceC2075gCall : null;
        if (c2095e == null || (eventListener$okhttp = c2095e.getEventListener$okhttp()) == null) {
            eventListener$okhttp = AbstractC2177v.NONE;
        }
        if (c2080i0 != null && cacheResponse == null && (abstractC2160j0Body2 = c2080i0.body()) != null) {
            AbstractC2278c.closeQuietly(abstractC2160j0Body2);
        }
        if (networkRequest == null && cacheResponse == null) {
            C2080i0 c2080i0Build = new C2080i0.a().request(interfaceC2064a0.request()).protocol(EnumC2074f0.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(AbstractC2278c.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener$okhttp.satisfactionFailure(interfaceC2075gCall, c2080i0Build);
            return c2080i0Build;
        }
        if (networkRequest == null) {
            AbstractC2980h.m5133b(cacheResponse);
            C2080i0 c2080i0Build2 = cacheResponse.newBuilder().cacheResponse(Companion.stripBody(cacheResponse)).build();
            eventListener$okhttp.cacheHit(interfaceC2075gCall, c2080i0Build2);
            return c2080i0Build2;
        }
        if (cacheResponse != null) {
            eventListener$okhttp.cacheConditionalHit(interfaceC2075gCall, cacheResponse);
        } else if (this.cache != null) {
            eventListener$okhttp.cacheMiss(interfaceC2075gCall);
        }
        try {
            C2080i0 c2080i0Proceed = interfaceC2064a0.proceed(networkRequest);
            if (c2080i0Proceed == null && c2080i0 != null && abstractC2160j0Body != null) {
            }
            if (cacheResponse != null) {
                if (c2080i0Proceed != null && c2080i0Proceed.code() == 304) {
                    C2080i0.a aVarNewBuilder = cacheResponse.newBuilder();
                    a aVar = Companion;
                    C2080i0 c2080i0Build3 = aVarNewBuilder.headers(aVar.combine(cacheResponse.headers(), c2080i0Proceed.headers())).sentRequestAtMillis(c2080i0Proceed.sentRequestAtMillis()).receivedResponseAtMillis(c2080i0Proceed.receivedResponseAtMillis()).cacheResponse(aVar.stripBody(cacheResponse)).networkResponse(aVar.stripBody(c2080i0Proceed)).build();
                    AbstractC2160j0 abstractC2160j0Body3 = c2080i0Proceed.body();
                    AbstractC2980h.m5133b(abstractC2160j0Body3);
                    abstractC2160j0Body3.close();
                    C2069d c2069d3 = this.cache;
                    AbstractC2980h.m5133b(c2069d3);
                    c2069d3.trackConditionalCacheHit$okhttp();
                    this.cache.update$okhttp(cacheResponse, c2080i0Build3);
                    eventListener$okhttp.cacheHit(interfaceC2075gCall, c2080i0Build3);
                    return c2080i0Build3;
                }
                AbstractC2160j0 abstractC2160j0Body4 = cacheResponse.body();
                if (abstractC2160j0Body4 != null) {
                    AbstractC2278c.closeQuietly(abstractC2160j0Body4);
                }
            }
            AbstractC2980h.m5133b(c2080i0Proceed);
            C2080i0.a aVarNewBuilder2 = c2080i0Proceed.newBuilder();
            a aVar2 = Companion;
            C2080i0 c2080i0Build4 = aVarNewBuilder2.cacheResponse(aVar2.stripBody(cacheResponse)).networkResponse(aVar2.stripBody(c2080i0Proceed)).build();
            if (this.cache != null) {
                if (AbstractC2108g.promisesBody(c2080i0Build4) && C2083c.Companion.isCacheable(c2080i0Build4, networkRequest)) {
                    C2080i0 c2080i0CacheWritingResponse = cacheWritingResponse(this.cache.put$okhttp(c2080i0Build4), c2080i0Build4);
                    if (cacheResponse != null) {
                        eventListener$okhttp.cacheMiss(interfaceC2075gCall);
                    }
                    return c2080i0CacheWritingResponse;
                }
                if (C2109h.INSTANCE.invalidatesCache(networkRequest.method())) {
                    try {
                        this.cache.remove$okhttp(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return c2080i0Build4;
        } finally {
            if (c2080i0 != null && (abstractC2160j0Body = c2080i0.body()) != null) {
                AbstractC2278c.closeQuietly(abstractC2160j0Body);
            }
        }
    }
}
