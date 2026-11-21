package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.C2072e0;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2180y;
import okhttp3.C2181z;
import okhttp3.InterfaceC2172q;
import okhttp3.internal.connection.C2096f;
import okhttp3.internal.http.AbstractC2108g;
import okhttp3.internal.http.C2112k;
import okhttp3.internal.http.C2114m;
import okhttp3.internal.http.InterfaceC2107f;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p147q7.AbstractC2278c;
import p189v7.C2573j;
import p189v7.C2582n0;
import p189v7.C2588s;
import p189v7.InterfaceC2572i0;
import p189v7.InterfaceC2575k;
import p189v7.InterfaceC2576k0;
import p189v7.InterfaceC2577l;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http1.b */
/* loaded from: classes.dex */
public final class C2116b implements InterfaceC2107f {
    public static final d Companion = new d(null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final C2072e0 client;
    private final C2096f connection;
    private final C2115a headersReader;
    private final InterfaceC2575k sink;
    private final InterfaceC2577l source;
    private int state;
    private C2180y trailers;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http1.b$a */
    public abstract class a implements InterfaceC2576k0 {
        private boolean closed;
        private final C2588s timeout;

        public a() {
            this.timeout = new C2588s(C2116b.this.source.timeout());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close();

        public final boolean getClosed() {
            return this.closed;
        }

        public final C2588s getTimeout() {
            return this.timeout;
        }

        @Override // p189v7.InterfaceC2576k0
        public long read(C2573j c2573j, long j) throws IOException {
            AbstractC2980h.m5136e("sink", c2573j);
            try {
                return C2116b.this.source.read(c2573j, j);
            } catch (IOException e) {
                C2116b.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e;
            }
        }

        public final void responseBodyComplete() {
            if (C2116b.this.state == 6) {
                return;
            }
            if (C2116b.this.state == 5) {
                C2116b.this.detachTimeout(this.timeout);
                C2116b.this.state = 6;
            } else {
                throw new IllegalStateException("state: " + C2116b.this.state);
            }
        }

        public final void setClosed(boolean z7) {
            this.closed = z7;
        }

        @Override // p189v7.InterfaceC2576k0
        public C2582n0 timeout() {
            return this.timeout;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http1.b$b */
    public final class b implements InterfaceC2572i0 {
        private boolean closed;
        private final C2588s timeout;

        public b() {
            this.timeout = new C2588s(C2116b.this.sink.timeout());
        }

        @Override // p189v7.InterfaceC2572i0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            C2116b.this.sink.mo4600o("0\r\n\r\n");
            C2116b.this.detachTimeout(this.timeout);
            C2116b.this.state = 3;
        }

        @Override // p189v7.InterfaceC2572i0, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            C2116b.this.sink.flush();
        }

        @Override // p189v7.InterfaceC2572i0
        public C2582n0 timeout() {
            return this.timeout;
        }

        @Override // p189v7.InterfaceC2572i0
        public void write(C2573j c2573j, long j) {
            AbstractC2980h.m5136e("source", c2573j);
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            C2116b.this.sink.mo4601r(j);
            C2116b.this.sink.mo4600o("\r\n");
            C2116b.this.sink.write(c2573j, j);
            C2116b.this.sink.mo4600o("\r\n");
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http1.b$c */
    public final class c extends a {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ C2116b this$0;
        private final C2181z url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C2116b c2116b, C2181z c2181z) {
            super();
            AbstractC2980h.m5136e("url", c2181z);
            this.this$0 = c2116b;
            this.url = c2181z;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() throws ProtocolException {
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.mo4622v();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.mo4605B();
                String string = AbstractC1206h.m2645S0(this.this$0.source.mo4622v()).toString();
                if (this.bytesRemainingInChunk < 0 || (string.length() > 0 && !AbstractC1214p.m2667t0(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
                }
                if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    C2116b c2116b = this.this$0;
                    c2116b.trailers = c2116b.headersReader.readHeaders();
                    C2072e0 c2072e0 = this.this$0.client;
                    AbstractC2980h.m5133b(c2072e0);
                    InterfaceC2172q interfaceC2172qCookieJar = c2072e0.cookieJar();
                    C2181z c2181z = this.url;
                    C2180y c2180y = this.this$0.trailers;
                    AbstractC2980h.m5133b(c2180y);
                    AbstractC2108g.receiveHeaders(interfaceC2172qCookieJar, c2181z, c2180y);
                    responseBodyComplete();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.C2116b.a, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !AbstractC2278c.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.C2116b.a, p189v7.InterfaceC2576k0
        public long read(C2573j c2573j, long j) throws IOException {
            AbstractC2980h.m5136e("sink", c2573j);
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount < 0: ", j).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j8 = this.bytesRemainingInChunk;
            if (j8 == 0 || j8 == -1) {
                readChunkSize();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long j9 = super.read(c2573j, Math.min(j, this.bytesRemainingInChunk));
            if (j9 != -1) {
                this.bytesRemainingInChunk -= j9;
                return j9;
            }
            this.this$0.getConnection().noNewExchanges$okhttp();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            responseBodyComplete();
            throw protocolException;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http1.b$d */
    public static final class d {
        public /* synthetic */ d(AbstractC2977e abstractC2977e) {
            this();
        }

        private d() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http1.b$e */
    public final class e extends a {
        private long bytesRemaining;

        public e(long j) {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.C2116b.a, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !AbstractC2278c.discard(this, 100, TimeUnit.MILLISECONDS)) {
                C2116b.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.C2116b.a, p189v7.InterfaceC2576k0
        public long read(C2573j c2573j, long j) throws IOException {
            AbstractC2980h.m5136e("sink", c2573j);
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount < 0: ", j).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            long j8 = this.bytesRemaining;
            if (j8 == 0) {
                return -1L;
            }
            long j9 = super.read(c2573j, Math.min(j8, j));
            if (j9 == -1) {
                C2116b.this.getConnection().noNewExchanges$okhttp();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                responseBodyComplete();
                throw protocolException;
            }
            long j10 = this.bytesRemaining - j9;
            this.bytesRemaining = j10;
            if (j10 == 0) {
                responseBodyComplete();
            }
            return j9;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http1.b$f */
    public final class f implements InterfaceC2572i0 {
        private boolean closed;
        private final C2588s timeout;

        public f() {
            this.timeout = new C2588s(C2116b.this.sink.timeout());
        }

        @Override // p189v7.InterfaceC2572i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            C2116b.this.detachTimeout(this.timeout);
            C2116b.this.state = 3;
        }

        @Override // p189v7.InterfaceC2572i0, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            C2116b.this.sink.flush();
        }

        @Override // p189v7.InterfaceC2572i0
        public C2582n0 timeout() {
            return this.timeout;
        }

        @Override // p189v7.InterfaceC2572i0
        public void write(C2573j c2573j, long j) {
            AbstractC2980h.m5136e("source", c2573j);
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            AbstractC2278c.checkOffsetAndCount(c2573j.f9314k, 0L, j);
            C2116b.this.sink.write(c2573j, j);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http1.b$g */
    public final class g extends a {
        private boolean inputExhausted;

        public g() {
            super();
        }

        @Override // okhttp3.internal.http1.C2116b.a, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.C2116b.a, p189v7.InterfaceC2576k0
        public long read(C2573j c2573j, long j) throws IOException {
            AbstractC2980h.m5136e("sink", c2573j);
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC0008a1.m15k("byteCount < 0: ", j).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long j8 = super.read(c2573j, j);
            if (j8 != -1) {
                return j8;
            }
            this.inputExhausted = true;
            responseBodyComplete();
            return -1L;
        }
    }

    public C2116b(C2072e0 c2072e0, C2096f c2096f, InterfaceC2577l interfaceC2577l, InterfaceC2575k interfaceC2575k) {
        AbstractC2980h.m5136e("connection", c2096f);
        AbstractC2980h.m5136e("source", interfaceC2577l);
        AbstractC2980h.m5136e("sink", interfaceC2575k);
        this.client = c2072e0;
        this.connection = c2096f;
        this.source = interfaceC2577l;
        this.sink = interfaceC2575k;
        this.headersReader = new C2115a(interfaceC2577l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(C2588s c2588s) {
        C2582n0 c2582n0 = c2588s.f9331a;
        C2582n0 c2582n02 = C2582n0.NONE;
        AbstractC2980h.m5136e("delegate", c2582n02);
        c2588s.f9331a = c2582n02;
        c2582n0.clearDeadline();
        c2582n0.clearTimeout();
    }

    private final boolean isChunked(C2080i0 c2080i0) {
        return "chunked".equalsIgnoreCase(C2080i0.header$default(c2080i0, "Transfer-Encoding", null, 2, null));
    }

    private final InterfaceC2572i0 newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new b();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC2576k0 newChunkedSource(C2181z c2181z) {
        if (this.state == 4) {
            this.state = 5;
            return new c(this, c2181z);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC2576k0 newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new e(j);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC2572i0 newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final InterfaceC2576k0 newUnknownLengthSource() {
        if (this.state == 4) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public InterfaceC2572i0 createRequestBody(C2076g0 c2076g0, long j) throws ProtocolException {
        AbstractC2980h.m5136e("request", c2076g0);
        if (c2076g0.body() != null && c2076g0.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(c2076g0)) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public C2096f getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public InterfaceC2576k0 openResponseBodySource(C2080i0 c2080i0) {
        AbstractC2980h.m5136e("response", c2080i0);
        if (!AbstractC2108g.promisesBody(c2080i0)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(c2080i0)) {
            return newChunkedSource(c2080i0.request().url());
        }
        long jHeadersContentLength = AbstractC2278c.headersContentLength(c2080i0);
        return jHeadersContentLength != -1 ? newFixedLengthSource(jHeadersContentLength) : newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public C2080i0.a readResponseHeaders(boolean z7) {
        int i = this.state;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            C2114m c2114m = C2114m.Companion.parse(this.headersReader.readLine());
            C2080i0.a aVarHeaders = new C2080i0.a().protocol(c2114m.protocol).code(c2114m.code).message(c2114m.message).headers(this.headersReader.readHeaders());
            if (z7 && c2114m.code == 100) {
                return null;
            }
            int i4 = c2114m.code;
            if (i4 == 100) {
                this.state = 3;
                return aVarHeaders;
            }
            if (102 > i4 || i4 >= 200) {
                this.state = 4;
                return aVarHeaders;
            }
            this.state = 3;
            return aVarHeaders;
        } catch (EOFException e8) {
            throw new IOException(AbstractC0008a1.m25u("unexpected end of stream on ", getConnection().route().address().url().redact()), e8);
        }
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public long reportedContentLength(C2080i0 c2080i0) {
        AbstractC2980h.m5136e("response", c2080i0);
        if (!AbstractC2108g.promisesBody(c2080i0)) {
            return 0L;
        }
        if (isChunked(c2080i0)) {
            return -1L;
        }
        return AbstractC2278c.headersContentLength(c2080i0);
    }

    public final void skipConnectBody(C2080i0 c2080i0) {
        AbstractC2980h.m5136e("response", c2080i0);
        long jHeadersContentLength = AbstractC2278c.headersContentLength(c2080i0);
        if (jHeadersContentLength == -1) {
            return;
        }
        InterfaceC2576k0 interfaceC2576k0NewFixedLengthSource = newFixedLengthSource(jHeadersContentLength);
        AbstractC2278c.skipAll(interfaceC2576k0NewFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        interfaceC2576k0NewFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public C2180y trailers() {
        if (this.state != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        C2180y c2180y = this.trailers;
        return c2180y == null ? AbstractC2278c.EMPTY_HEADERS : c2180y;
    }

    public final void writeRequest(C2180y c2180y, String str) {
        AbstractC2980h.m5136e("headers", c2180y);
        AbstractC2980h.m5136e("requestLine", str);
        if (this.state != 0) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.sink.mo4600o(str).mo4600o("\r\n");
        int size = c2180y.size();
        for (int i = 0; i < size; i++) {
            this.sink.mo4600o(c2180y.name(i)).mo4600o(": ").mo4600o(c2180y.value(i)).mo4600o("\r\n");
        }
        this.sink.mo4600o("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public void writeRequestHeaders(C2076g0 c2076g0) {
        AbstractC2980h.m5136e("request", c2076g0);
        C2112k c2112k = C2112k.INSTANCE;
        Proxy.Type type = getConnection().route().proxy().type();
        AbstractC2980h.m5135d("connection.route().proxy.type()", type);
        writeRequest(c2076g0.headers(), c2112k.get(c2076g0, type));
    }

    private final boolean isChunked(C2076g0 c2076g0) {
        return "chunked".equalsIgnoreCase(c2076g0.header("Transfer-Encoding"));
    }
}
