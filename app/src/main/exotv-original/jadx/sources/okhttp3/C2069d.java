package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2180y;
import okhttp3.internal.cache.C2083c;
import okhttp3.internal.cache.C2084d;
import okhttp3.internal.cache.InterfaceC2082b;
import okhttp3.internal.concurrent.C2090e;
import okhttp3.internal.http.C2109h;
import okhttp3.internal.http.C2114m;
import okhttp3.internal.p128io.InterfaceC2134b;
import p008a7.InterfaceC0113a;
import p069h7.AbstractC1206h;
import p090k2.C1584b;
import p111m6.C1921p;
import p111m6.C1923r;
import p147q7.AbstractC2278c;
import p164s7.C2385h;
import p171t5.AbstractC2436a;
import p189v7.AbstractC2557b;
import p189v7.AbstractC2586q;
import p189v7.AbstractC2587r;
import p189v7.C2562d0;
import p189v7.C2564e0;
import p189v7.C2571i;
import p189v7.C2573j;
import p189v7.C2579m;
import p189v7.InterfaceC2572i0;
import p189v7.InterfaceC2575k;
import p189v7.InterfaceC2576k0;
import p189v7.InterfaceC2577l;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.d */
/* loaded from: classes.dex */
public final class C2069d implements Closeable, Flushable {
    public static final b Companion = new b(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final C2084d cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.d$a */
    public static final class a extends AbstractC2160j0 {
        private final InterfaceC2577l bodySource;
        private final String contentLength;
        private final String contentType;
        private final C2084d.d snapshot;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.d$a$a, reason: collision with other inner class name */
        public static final class C2990a extends AbstractC2587r {
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2990a(InterfaceC2576k0 interfaceC2576k0, a aVar) {
                super(interfaceC2576k0);
                this.this$0 = aVar;
            }

            @Override // p189v7.AbstractC2587r, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.this$0.getSnapshot().close();
                super.close();
            }
        }

        public a(C2084d.d dVar, String str, String str2) {
            AbstractC2980h.m5136e("snapshot", dVar);
            this.snapshot = dVar;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = AbstractC2557b.m4578c(new C2990a(dVar.getSource(1), this));
        }

        @Override // okhttp3.AbstractC2160j0
        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return AbstractC2278c.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.AbstractC2160j0
        public C2070d0 contentType() {
            String str = this.contentType;
            if (str != null) {
                return C2070d0.Companion.parse(str);
            }
            return null;
        }

        public final C2084d.d getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.AbstractC2160j0
        public InterfaceC2577l source() {
            return this.bodySource;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.d$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        private final Set<String> varyFields(C2180y c2180y) {
            int size = c2180y.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if ("Vary".equalsIgnoreCase(c2180y.name(i))) {
                    String strValue = c2180y.value(i);
                    if (treeSet == null) {
                        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                        AbstractC2980h.m5135d("CASE_INSENSITIVE_ORDER", comparator);
                        treeSet = new TreeSet(comparator);
                    }
                    Iterator it = AbstractC1206h.m2638L0(strValue, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(AbstractC1206h.m2645S0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? C1923r.f7189j : treeSet;
        }

        public final boolean hasVaryAll(C2080i0 c2080i0) {
            AbstractC2980h.m5136e("<this>", c2080i0);
            return varyFields(c2080i0.headers()).contains("*");
        }

        public final String key(C2181z c2181z) {
            AbstractC2980h.m5136e("url", c2181z);
            C2579m c2579m = C2579m.f9316m;
            return C1584b.m3251p(c2181z.toString()).mo4633c("MD5").mo4635e();
        }

        public final int readInt$okhttp(InterfaceC2577l interfaceC2577l) throws IOException {
            AbstractC2980h.m5136e("source", interfaceC2577l);
            try {
                long jMo4616m = interfaceC2577l.mo4616m();
                String strMo4622v = interfaceC2577l.mo4622v();
                if (jMo4616m >= 0 && jMo4616m <= 2147483647L && strMo4622v.length() <= 0) {
                    return (int) jMo4616m;
                }
                throw new IOException("expected an int but was \"" + jMo4616m + strMo4622v + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final C2180y varyHeaders(C2080i0 c2080i0) {
            AbstractC2980h.m5136e("<this>", c2080i0);
            C2080i0 c2080i0NetworkResponse = c2080i0.networkResponse();
            AbstractC2980h.m5133b(c2080i0NetworkResponse);
            return varyHeaders(c2080i0NetworkResponse.request().headers(), c2080i0.headers());
        }

        public final boolean varyMatches(C2080i0 c2080i0, C2180y c2180y, C2076g0 c2076g0) {
            AbstractC2980h.m5136e("cachedResponse", c2080i0);
            AbstractC2980h.m5136e("cachedRequest", c2180y);
            AbstractC2980h.m5136e("newRequest", c2076g0);
            Set<String> setVaryFields = varyFields(c2080i0.headers());
            if (setVaryFields != null && setVaryFields.isEmpty()) {
                return true;
            }
            for (String str : setVaryFields) {
                if (!AbstractC2980h.m5132a(c2180y.values(str), c2076g0.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private b() {
        }

        private final C2180y varyHeaders(C2180y c2180y, C2180y c2180y2) {
            Set<String> setVaryFields = varyFields(c2180y2);
            if (setVaryFields.isEmpty()) {
                return AbstractC2278c.EMPTY_HEADERS;
            }
            C2180y.a aVar = new C2180y.a();
            int size = c2180y.size();
            for (int i = 0; i < size; i++) {
                String strName = c2180y.name(i);
                if (setVaryFields.contains(strName)) {
                    aVar.add(strName, c2180y.value(i));
                }
            }
            return aVar.build();
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.d$d */
    public final class d implements InterfaceC2082b {
        private final InterfaceC2572i0 body;
        private final InterfaceC2572i0 cacheOut;
        private boolean done;
        private final C2084d.b editor;
        final /* synthetic */ C2069d this$0;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.d$d$a */
        public static final class a extends AbstractC2586q {
            final /* synthetic */ C2069d this$0;
            final /* synthetic */ d this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2069d c2069d, d dVar, InterfaceC2572i0 interfaceC2572i0) {
                super(interfaceC2572i0);
                this.this$0 = c2069d;
                this.this$1 = dVar;
            }

            @Override // p189v7.AbstractC2586q, p189v7.InterfaceC2572i0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                C2069d c2069d = this.this$0;
                d dVar = this.this$1;
                synchronized (c2069d) {
                    if (dVar.getDone()) {
                        return;
                    }
                    dVar.setDone(true);
                    c2069d.setWriteSuccessCount$okhttp(c2069d.getWriteSuccessCount$okhttp() + 1);
                    super.close();
                    this.this$1.editor.commit();
                }
            }
        }

        public d(C2069d c2069d, C2084d.b bVar) {
            AbstractC2980h.m5136e("editor", bVar);
            this.this$0 = c2069d;
            this.editor = bVar;
            InterfaceC2572i0 interfaceC2572i0NewSink = bVar.newSink(1);
            this.cacheOut = interfaceC2572i0NewSink;
            this.body = new a(c2069d, this, interfaceC2572i0NewSink);
        }

        @Override // okhttp3.internal.cache.InterfaceC2082b
        public void abort() throws IOException {
            C2069d c2069d = this.this$0;
            synchronized (c2069d) {
                if (this.done) {
                    return;
                }
                this.done = true;
                c2069d.setWriteAbortCount$okhttp(c2069d.getWriteAbortCount$okhttp() + 1);
                AbstractC2278c.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.InterfaceC2082b
        public InterfaceC2572i0 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z7) {
            this.done = z7;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.d$e */
    public static final class e implements Iterator, InterfaceC0113a {
        private boolean canRemove;
        private final Iterator<C2084d.d> delegate;
        private String nextUrl;

        public e(C2069d c2069d) {
            this.delegate = c2069d.getCache$okhttp().snapshots();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    C2084d.d next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = AbstractC2557b.m4578c(next.getSource(0)).mo4617n(Long.MAX_VALUE);
                        AbstractC2436a.m4330b(next, null);
                        return true;
                    } finally {
                        try {
                            continue;
                        } catch (Throwable th) {
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                throw new IllegalStateException("remove() before next()");
            }
            this.delegate.remove();
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextUrl;
            AbstractC2980h.m5133b(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
    }

    public C2069d(File file, long j, InterfaceC2134b interfaceC2134b) {
        AbstractC2980h.m5136e("directory", file);
        AbstractC2980h.m5136e("fileSystem", interfaceC2134b);
        this.cache = new C2084d(interfaceC2134b, file, VERSION, 2, j, C2090e.INSTANCE);
    }

    private final void abortQuietly(C2084d.b bVar) {
        if (bVar != null) {
            try {
                bVar.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(C2181z c2181z) {
        return Companion.key(c2181z);
    }

    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final File m5171deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    public final void delete() {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    public final C2080i0 get$okhttp(C2076g0 c2076g0) throws IOException {
        AbstractC2980h.m5136e("request", c2076g0);
        try {
            C2084d.d dVar = this.cache.get(Companion.key(c2076g0.url()));
            if (dVar == null) {
                return null;
            }
            try {
                c cVar = new c(dVar.getSource(0));
                C2080i0 c2080i0Response = cVar.response(dVar);
                if (cVar.matches(c2076g0, c2080i0Response)) {
                    return c2080i0Response;
                }
                AbstractC2160j0 abstractC2160j0Body = c2080i0Response.body();
                if (abstractC2160j0Body != null) {
                    AbstractC2278c.closeQuietly(abstractC2160j0Body);
                }
                return null;
            } catch (IOException unused) {
                AbstractC2278c.closeQuietly(dVar);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final C2084d getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final InterfaceC2082b put$okhttp(C2080i0 c2080i0) throws Throwable {
        C2084d.b bVarEdit$default;
        AbstractC2980h.m5136e("response", c2080i0);
        String strMethod = c2080i0.request().method();
        if (C2109h.INSTANCE.invalidatesCache(c2080i0.request().method())) {
            try {
                remove$okhttp(c2080i0.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!AbstractC2980h.m5132a(strMethod, "GET")) {
            return null;
        }
        b bVar = Companion;
        if (bVar.hasVaryAll(c2080i0)) {
            return null;
        }
        c cVar = new c(c2080i0);
        try {
            bVarEdit$default = C2084d.edit$default(this.cache, bVar.key(c2080i0.request().url()), 0L, 2, null);
            if (bVarEdit$default == null) {
                return null;
            }
            try {
                cVar.writeTo(bVarEdit$default);
                return new d(this, bVarEdit$default);
            } catch (IOException unused2) {
                abortQuietly(bVarEdit$default);
                return null;
            }
        } catch (IOException unused3) {
            bVarEdit$default = null;
        }
    }

    public final void remove$okhttp(C2076g0 c2076g0) {
        AbstractC2980h.m5136e("request", c2076g0);
        this.cache.remove(Companion.key(c2076g0.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(C2083c c2083c) {
        try {
            AbstractC2980h.m5136e("cacheStrategy", c2083c);
            this.requestCount++;
            if (c2083c.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (c2083c.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void update$okhttp(C2080i0 c2080i0, C2080i0 c2080i02) throws Throwable {
        C2084d.b bVarEdit;
        AbstractC2980h.m5136e("cached", c2080i0);
        AbstractC2980h.m5136e("network", c2080i02);
        c cVar = new c(c2080i02);
        AbstractC2160j0 abstractC2160j0Body = c2080i0.body();
        AbstractC2980h.m5134c("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody", abstractC2160j0Body);
        try {
            bVarEdit = ((a) abstractC2160j0Body).getSnapshot().edit();
            if (bVarEdit == null) {
                return;
            }
            try {
                cVar.writeTo(bVarEdit);
                bVarEdit.commit();
            } catch (IOException unused) {
                abortQuietly(bVarEdit);
            }
        } catch (IOException unused2) {
            bVarEdit = null;
        }
    }

    public final Iterator<String> urls() {
        return new e(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2069d(File file, long j) {
        this(file, j, InterfaceC2134b.SYSTEM);
        AbstractC2980h.m5136e("directory", file);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.d$c */
    public static final class c {
        public static final a Companion = new a(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final C2179x handshake;
        private final String message;
        private final EnumC2074f0 protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final C2180y responseHeaders;
        private final long sentRequestMillis;
        private final C2181z url;
        private final C2180y varyHeaders;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.d$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC2977e abstractC2977e) {
                this();
            }

            private a() {
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            C2385h.a aVar = C2385h.Companion;
            sb.append(aVar.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = aVar.get().getPrefix() + "-Received-Millis";
        }

        public c(InterfaceC2576k0 interfaceC2576k0) throws IOException {
            AbstractC2980h.m5136e("rawSource", interfaceC2576k0);
            try {
                C2564e0 c2564e0M4578c = AbstractC2557b.m4578c(interfaceC2576k0);
                String strMo4617n = c2564e0M4578c.mo4617n(Long.MAX_VALUE);
                C2181z c2181z = C2181z.Companion.parse(strMo4617n);
                if (c2181z == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(strMo4617n));
                    C2385h.Companion.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = c2181z;
                this.requestMethod = c2564e0M4578c.mo4617n(Long.MAX_VALUE);
                C2180y.a aVar = new C2180y.a();
                int int$okhttp = C2069d.Companion.readInt$okhttp(c2564e0M4578c);
                for (int i = 0; i < int$okhttp; i++) {
                    aVar.addLenient$okhttp(c2564e0M4578c.mo4617n(Long.MAX_VALUE));
                }
                this.varyHeaders = aVar.build();
                C2114m c2114m = C2114m.Companion.parse(c2564e0M4578c.mo4617n(Long.MAX_VALUE));
                this.protocol = c2114m.protocol;
                this.code = c2114m.code;
                this.message = c2114m.message;
                C2180y.a aVar2 = new C2180y.a();
                int int$okhttp2 = C2069d.Companion.readInt$okhttp(c2564e0M4578c);
                for (int i4 = 0; i4 < int$okhttp2; i4++) {
                    aVar2.addLenient$okhttp(c2564e0M4578c.mo4617n(Long.MAX_VALUE));
                }
                String str = SENT_MILLIS;
                String str2 = aVar2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = aVar2.get(str3);
                aVar2.removeAll(str);
                aVar2.removeAll(str3);
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                this.responseHeaders = aVar2.build();
                if (isHttps()) {
                    String strMo4617n2 = c2564e0M4578c.mo4617n(Long.MAX_VALUE);
                    if (strMo4617n2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strMo4617n2 + '\"');
                    }
                    this.handshake = C2179x.Companion.get(!c2564e0M4578c.mo4614j() ? EnumC2164l0.Companion.forJavaName(c2564e0M4578c.mo4617n(Long.MAX_VALUE)) : EnumC2164l0.SSL_3_0, C2161k.Companion.forJavaName(c2564e0M4578c.mo4617n(Long.MAX_VALUE)), readCertificateList(c2564e0M4578c), readCertificateList(c2564e0M4578c));
                } else {
                    this.handshake = null;
                }
                interfaceC2576k0.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2436a.m4330b(interfaceC2576k0, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return AbstractC2980h.m5132a(this.url.scheme(), "https");
        }

        private final List<Certificate> readCertificateList(InterfaceC2577l interfaceC2577l) throws IOException, CertificateException {
            int int$okhttp = C2069d.Companion.readInt$okhttp(interfaceC2577l);
            if (int$okhttp == -1) {
                return C1921p.f7187j;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(int$okhttp);
                for (int i = 0; i < int$okhttp; i++) {
                    String strMo4622v = interfaceC2577l.mo4622v();
                    C2573j c2573j = new C2573j();
                    C2579m c2579m = C2579m.f9316m;
                    C2579m c2579mM3248m = C1584b.m3248m(strMo4622v);
                    if (c2579mM3248m == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c2573j.m4654J(c2579mM3248m);
                    arrayList.add(certificateFactory.generateCertificate(new C2571i(c2573j, 0)));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(InterfaceC2575k interfaceC2575k, List<? extends Certificate> list) throws IOException, CertificateEncodingException {
            try {
                interfaceC2575k.mo4603z(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    C2579m c2579m = C2579m.f9316m;
                    AbstractC2980h.m5135d("bytes", encoded);
                    interfaceC2575k.mo4600o(C1584b.m3253t(encoded).mo4632a()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(C2076g0 c2076g0, C2080i0 c2080i0) {
            AbstractC2980h.m5136e("request", c2076g0);
            AbstractC2980h.m5136e("response", c2080i0);
            return AbstractC2980h.m5132a(this.url, c2076g0.url()) && AbstractC2980h.m5132a(this.requestMethod, c2076g0.method()) && C2069d.Companion.varyMatches(c2080i0, this.varyHeaders, c2076g0);
        }

        public final C2080i0 response(C2084d.d dVar) {
            AbstractC2980h.m5136e("snapshot", dVar);
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new C2080i0.a().request(new C2076g0.a().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new a(dVar, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(C2084d.b bVar) throws Throwable {
            AbstractC2980h.m5136e("editor", bVar);
            C2562d0 c2562d0M4577b = AbstractC2557b.m4577b(bVar.newSink(0));
            try {
                c2562d0M4577b.mo4600o(this.url.toString());
                c2562d0M4577b.writeByte(10);
                c2562d0M4577b.mo4600o(this.requestMethod);
                c2562d0M4577b.writeByte(10);
                c2562d0M4577b.mo4603z(this.varyHeaders.size());
                c2562d0M4577b.writeByte(10);
                int size = this.varyHeaders.size();
                for (int i = 0; i < size; i++) {
                    c2562d0M4577b.mo4600o(this.varyHeaders.name(i));
                    c2562d0M4577b.mo4600o(": ");
                    c2562d0M4577b.mo4600o(this.varyHeaders.value(i));
                    c2562d0M4577b.writeByte(10);
                }
                c2562d0M4577b.mo4600o(new C2114m(this.protocol, this.code, this.message).toString());
                c2562d0M4577b.writeByte(10);
                c2562d0M4577b.mo4603z(this.responseHeaders.size() + 2);
                c2562d0M4577b.writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    c2562d0M4577b.mo4600o(this.responseHeaders.name(i4));
                    c2562d0M4577b.mo4600o(": ");
                    c2562d0M4577b.mo4600o(this.responseHeaders.value(i4));
                    c2562d0M4577b.writeByte(10);
                }
                c2562d0M4577b.mo4600o(SENT_MILLIS);
                c2562d0M4577b.mo4600o(": ");
                c2562d0M4577b.mo4603z(this.sentRequestMillis);
                c2562d0M4577b.writeByte(10);
                c2562d0M4577b.mo4600o(RECEIVED_MILLIS);
                c2562d0M4577b.mo4600o(": ");
                c2562d0M4577b.mo4603z(this.receivedResponseMillis);
                c2562d0M4577b.writeByte(10);
                if (isHttps()) {
                    c2562d0M4577b.writeByte(10);
                    C2179x c2179x = this.handshake;
                    AbstractC2980h.m5133b(c2179x);
                    c2562d0M4577b.mo4600o(c2179x.cipherSuite().javaName());
                    c2562d0M4577b.writeByte(10);
                    writeCertList(c2562d0M4577b, this.handshake.peerCertificates());
                    writeCertList(c2562d0M4577b, this.handshake.localCertificates());
                    c2562d0M4577b.mo4600o(this.handshake.tlsVersion().javaName());
                    c2562d0M4577b.writeByte(10);
                }
                c2562d0M4577b.close();
            } finally {
            }
        }

        public c(C2080i0 c2080i0) {
            AbstractC2980h.m5136e("response", c2080i0);
            this.url = c2080i0.request().url();
            this.varyHeaders = C2069d.Companion.varyHeaders(c2080i0);
            this.requestMethod = c2080i0.request().method();
            this.protocol = c2080i0.protocol();
            this.code = c2080i0.code();
            this.message = c2080i0.message();
            this.responseHeaders = c2080i0.headers();
            this.handshake = c2080i0.handshake();
            this.sentRequestMillis = c2080i0.sentRequestAtMillis();
            this.receivedResponseMillis = c2080i0.receivedResponseAtMillis();
        }
    }
}
