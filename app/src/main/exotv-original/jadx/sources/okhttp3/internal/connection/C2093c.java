package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.AbstractC2078h0;
import okhttp3.AbstractC2160j0;
import okhttp3.AbstractC2177v;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2180y;
import okhttp3.internal.http.C2111j;
import okhttp3.internal.http.InterfaceC2107f;
import okhttp3.internal.p129ws.C2153d;
import p189v7.AbstractC2557b;
import p189v7.AbstractC2586q;
import p189v7.AbstractC2587r;
import p189v7.C2573j;
import p189v7.InterfaceC2572i0;
import p189v7.InterfaceC2576k0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.connection.c */
/* loaded from: classes.dex */
public final class C2093c {
    private final C2095e call;
    private final InterfaceC2107f codec;
    private final C2096f connection;
    private final AbstractC2177v eventListener;
    private final C2094d finder;
    private boolean hasFailure;
    private boolean isDuplex;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.connection.c$a */
    public final class a extends AbstractC2586q {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ C2093c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2093c c2093c, InterfaceC2572i0 interfaceC2572i0, long j) {
            super(interfaceC2572i0);
            AbstractC2980h.m5136e("delegate", interfaceC2572i0);
            this.this$0 = c2093c;
            this.contentLength = j;
        }

        private final <E extends IOException> E complete(E e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            return (E) this.this$0.bodyComplete(this.bytesReceived, false, true, e);
        }

        @Override // p189v7.AbstractC2586q, p189v7.InterfaceC2572i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j = this.contentLength;
            if (j != -1 && this.bytesReceived != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e) {
                throw complete(e);
            }
        }

        @Override // p189v7.AbstractC2586q, p189v7.InterfaceC2572i0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw complete(e);
            }
        }

        @Override // p189v7.AbstractC2586q, p189v7.InterfaceC2572i0
        public void write(C2573j c2573j, long j) throws IOException {
            AbstractC2980h.m5136e("source", c2573j);
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long j8 = this.contentLength;
            if (j8 == -1 || this.bytesReceived + j <= j8) {
                try {
                    super.write(c2573j, j);
                    this.bytesReceived += j;
                    return;
                } catch (IOException e) {
                    throw complete(e);
                }
            }
            throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + j));
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.connection.c$b */
    public final class b extends AbstractC2587r {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final /* synthetic */ C2093c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2093c c2093c, InterfaceC2576k0 interfaceC2576k0, long j) {
            super(interfaceC2576k0);
            AbstractC2980h.m5136e("delegate", interfaceC2576k0);
            this.this$0 = c2093c;
            this.contentLength = j;
            this.invokeStartEvent = true;
            if (j == 0) {
                complete(null);
            }
        }

        @Override // p189v7.AbstractC2587r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e) {
                throw complete(e);
            }
        }

        public final <E extends IOException> E complete(E e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            if (e == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
            }
            return (E) this.this$0.bodyComplete(this.bytesReceived, true, false, e);
        }

        @Override // p189v7.AbstractC2587r, p189v7.InterfaceC2576k0
        public long read(C2573j c2573j, long j) throws IOException {
            AbstractC2980h.m5136e("sink", c2573j);
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            try {
                long j8 = delegate().read(c2573j, j);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
                }
                if (j8 == -1) {
                    complete(null);
                    return -1L;
                }
                long j9 = this.bytesReceived + j8;
                long j10 = this.contentLength;
                if (j10 != -1 && j9 > j10) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j9);
                }
                this.bytesReceived = j9;
                if (j9 == j10) {
                    complete(null);
                }
                return j8;
            } catch (IOException e) {
                throw complete(e);
            }
        }
    }

    public C2093c(C2095e c2095e, AbstractC2177v abstractC2177v, C2094d c2094d, InterfaceC2107f interfaceC2107f) {
        AbstractC2980h.m5136e("call", c2095e);
        AbstractC2980h.m5136e("eventListener", abstractC2177v);
        AbstractC2980h.m5136e("finder", c2094d);
        AbstractC2980h.m5136e("codec", interfaceC2107f);
        this.call = c2095e;
        this.eventListener = abstractC2177v;
        this.finder = c2094d;
        this.codec = interfaceC2107f;
        this.connection = interfaceC2107f.getConnection();
    }

    private final void trackFailure(IOException iOException) {
        this.hasFailure = true;
        this.finder.trackFailure(iOException);
        this.codec.getConnection().trackFailure$okhttp(this.call, iOException);
    }

    public final <E extends IOException> E bodyComplete(long j, boolean z7, boolean z8, E e) {
        if (e != null) {
            trackFailure(e);
        }
        if (z8) {
            if (e != null) {
                this.eventListener.requestFailed(this.call, e);
            } else {
                this.eventListener.requestBodyEnd(this.call, j);
            }
        }
        if (z7) {
            if (e != null) {
                this.eventListener.responseFailed(this.call, e);
            } else {
                this.eventListener.responseBodyEnd(this.call, j);
            }
        }
        return (E) this.call.messageDone$okhttp(this, z8, z7, e);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    public final InterfaceC2572i0 createRequestBody(C2076g0 c2076g0, boolean z7) {
        AbstractC2980h.m5136e("request", c2076g0);
        this.isDuplex = z7;
        AbstractC2078h0 abstractC2078h0Body = c2076g0.body();
        AbstractC2980h.m5133b(abstractC2078h0Body);
        long jContentLength = abstractC2078h0Body.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new a(this, this.codec.createRequestBody(c2076g0, jContentLength), jContentLength);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final C2095e getCall$okhttp() {
        return this.call;
    }

    public final C2096f getConnection$okhttp() {
        return this.connection;
    }

    public final AbstractC2177v getEventListener$okhttp() {
        return this.eventListener;
    }

    public final C2094d getFinder$okhttp() {
        return this.finder;
    }

    public final boolean getHasFailure$okhttp() {
        return this.hasFailure;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !AbstractC2980h.m5132a(this.finder.getAddress$okhttp().url().host(), this.connection.route().address().url().host());
    }

    public final boolean isDuplex$okhttp() {
        return this.isDuplex;
    }

    public final C2153d.d newWebSocketStreams() {
        this.call.timeoutEarlyExit();
        return this.codec.getConnection().newWebSocketStreams$okhttp(this);
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getConnection().noNewExchanges$okhttp();
    }

    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, null);
    }

    public final AbstractC2160j0 openResponseBody(C2080i0 c2080i0) throws IOException {
        AbstractC2980h.m5136e("response", c2080i0);
        try {
            String strHeader$default = C2080i0.header$default(c2080i0, "Content-Type", null, 2, null);
            long jReportedContentLength = this.codec.reportedContentLength(c2080i0);
            return new C2111j(strHeader$default, jReportedContentLength, AbstractC2557b.m4578c(new b(this, this.codec.openResponseBodySource(c2080i0), jReportedContentLength)));
        } catch (IOException e) {
            this.eventListener.responseFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final C2080i0.a readResponseHeaders(boolean z7) throws IOException {
        try {
            C2080i0.a responseHeaders = this.codec.readResponseHeaders(z7);
            if (responseHeaders == null) {
                return responseHeaders;
            }
            responseHeaders.initExchange$okhttp(this);
            return responseHeaders;
        } catch (IOException e) {
            this.eventListener.responseFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void responseHeadersEnd(C2080i0 c2080i0) {
        AbstractC2980h.m5136e("response", c2080i0);
        this.eventListener.responseHeadersEnd(this.call, c2080i0);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public final C2180y trailers() {
        return this.codec.trailers();
    }

    public final void webSocketUpgradeFailed() {
        bodyComplete(-1L, true, true, null);
    }

    public final void writeRequestHeaders(C2076g0 c2076g0) throws IOException {
        AbstractC2980h.m5136e("request", c2076g0);
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(c2076g0);
            this.eventListener.requestHeadersEnd(this.call, c2076g0);
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }
}
