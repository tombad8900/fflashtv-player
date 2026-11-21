package okhttp3.internal.connection;

import androidx.media3.exoplayer.source.preload.C0456a;
import com.bumptech.glide.AbstractC0715d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.AbstractC2177v;
import okhttp3.C2063a;
import okhttp3.C2072e0;
import okhttp3.C2076g0;
import okhttp3.C2079i;
import okhttp3.C2080i0;
import okhttp3.C2174s;
import okhttp3.C2181z;
import okhttp3.InterfaceC2075g;
import okhttp3.InterfaceC2077h;
import okhttp3.internal.cache.C2081a;
import okhttp3.internal.http.C2102a;
import okhttp3.internal.http.C2103b;
import okhttp3.internal.http.C2110i;
import okhttp3.internal.http.C2113l;
import p111m6.AbstractC1919n;
import p147q7.AbstractC2278c;
import p164s7.C2385h;
import p189v7.C2565f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.connection.e */
/* loaded from: classes.dex */
public final class C2095e implements InterfaceC2075g {
    private Object callStackTrace;
    private volatile boolean canceled;
    private final C2072e0 client;
    private C2096f connection;
    private final C2098h connectionPool;
    private volatile C2096f connectionToCancel;
    private final AbstractC2177v eventListener;
    private volatile C2093c exchange;
    private C2094d exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private C2093c interceptorScopedExchange;
    private final C2076g0 originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private final c timeout;
    private boolean timeoutEarlyExit;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.connection.e$a */
    public final class a implements Runnable {
        private volatile AtomicInteger callsPerHost;
        private final InterfaceC2077h responseCallback;
        final /* synthetic */ C2095e this$0;

        public a(C2095e c2095e, InterfaceC2077h interfaceC2077h) {
            AbstractC2980h.m5136e("responseCallback", interfaceC2077h);
            this.this$0 = c2095e;
            this.responseCallback = interfaceC2077h;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void executeOn(ExecutorService executorService) {
            AbstractC2980h.m5136e("executorService", executorService);
            C2174s c2174sDispatcher = this.this$0.getClient().dispatcher();
            if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(c2174sDispatcher)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c2174sDispatcher);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.this$0.noMoreExchanges$okhttp(interruptedIOException);
                    this.responseCallback.onFailure(this.this$0, interruptedIOException);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th) {
                this.this$0.getClient().dispatcher().finished$okhttp(this);
                throw th;
            }
        }

        public final C2095e getCall() {
            return this.this$0;
        }

        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final C2076g0 getRequest() {
            return this.this$0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(a aVar) {
            AbstractC2980h.m5136e("other", aVar);
            this.callsPerHost = aVar.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2072e0 client;
            String str = "OkHttp " + this.this$0.redactedUrl$okhttp();
            C2095e c2095e = this.this$0;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                c2095e.timeout.enter();
                boolean z7 = false;
                try {
                    try {
                        try {
                            this.responseCallback.onResponse(c2095e, c2095e.getResponseWithInterceptorChain$okhttp());
                            client = c2095e.getClient();
                        } catch (IOException e) {
                            e = e;
                            z7 = true;
                            if (z7) {
                                C2385h.Companion.get().log("Callback failure for " + c2095e.toLoggableString(), 4, e);
                            } else {
                                this.responseCallback.onFailure(c2095e, e);
                            }
                            client = c2095e.getClient();
                            client.dispatcher().finished$okhttp(this);
                        } catch (Throwable th) {
                            th = th;
                            z7 = true;
                            c2095e.cancel();
                            if (!z7) {
                                IOException iOException = new IOException("canceled due to " + th);
                                AbstractC0715d.m1557e(iOException, th);
                                this.responseCallback.onFailure(c2095e, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c2095e.getClient().dispatcher().finished$okhttp(this);
                        throw th2;
                    }
                } catch (IOException e8) {
                    e = e8;
                } catch (Throwable th3) {
                    th = th3;
                }
                client.dispatcher().finished$okhttp(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.connection.e$b */
    public static final class b extends WeakReference {
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2095e c2095e, Object obj) {
            super(c2095e);
            AbstractC2980h.m5136e("referent", c2095e);
            this.callStackTrace = obj;
        }

        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.connection.e$c */
    public static final class c extends C2565f {
        public c() {
        }

        @Override // p189v7.C2565f
        public void timedOut() {
            C2095e.this.cancel();
        }
    }

    public C2095e(C2072e0 c2072e0, C2076g0 c2076g0, boolean z7) {
        AbstractC2980h.m5136e("client", c2072e0);
        AbstractC2980h.m5136e("originalRequest", c2076g0);
        this.client = c2072e0;
        this.originalRequest = c2076g0;
        this.forWebSocket = z7;
        this.connectionPool = c2072e0.connectionPool().getDelegate$okhttp();
        this.eventListener = AbstractC2278c.asFactory$lambda$8((AbstractC2177v) ((C0456a) c2072e0.eventListenerFactory()).f1850k, this);
        c cVar = new c();
        cVar.timeout(c2072e0.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = cVar;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    private final <E extends IOException> E callDone(E e) throws IOException {
        Socket socketReleaseConnectionNoEvents$okhttp;
        boolean z7 = AbstractC2278c.assertionsEnabled;
        if (z7 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        C2096f c2096f = this.connection;
        if (c2096f != null) {
            if (z7 && Thread.holdsLock(c2096f)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c2096f);
            }
            synchronized (c2096f) {
                socketReleaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    AbstractC2278c.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, c2096f);
            } else if (socketReleaseConnectionNoEvents$okhttp != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        E e8 = (E) timeoutExit(e);
        if (e == null) {
            this.eventListener.callEnd(this);
            return e8;
        }
        AbstractC2177v abstractC2177v = this.eventListener;
        AbstractC2980h.m5133b(e8);
        abstractC2177v.callFailed(this, e8);
        return e8;
    }

    private final void callStart() {
        this.callStackTrace = C2385h.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    private final C2063a createAddress(C2181z c2181z) {
        SSLSocketFactory sslSocketFactory;
        HostnameVerifier hostnameVerifier;
        C2079i c2079iCertificatePinner;
        if (c2181z.isHttps()) {
            sslSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            c2079iCertificatePinner = this.client.certificatePinner();
        } else {
            sslSocketFactory = null;
            hostnameVerifier = null;
            c2079iCertificatePinner = null;
        }
        return new C2063a(c2181z.host(), c2181z.port(), this.client.dns(), this.client.socketFactory(), sslSocketFactory, hostnameVerifier, c2079iCertificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    private final <E extends IOException> E timeoutExit(E e) {
        if (this.timeoutEarlyExit || !this.timeout.exit()) {
            return e;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toLoggableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : C2181z.FRAGMENT_ENCODE_SET);
        sb.append(this.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(redactedUrl$okhttp());
        return sb.toString();
    }

    public final void acquireConnectionNoEvents(C2096f c2096f) {
        AbstractC2980h.m5136e("connection", c2096f);
        if (!AbstractC2278c.assertionsEnabled || Thread.holdsLock(c2096f)) {
            if (this.connection != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.connection = c2096f;
            c2096f.getCalls().add(new b(this, this.callStackTrace));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c2096f);
    }

    @Override // okhttp3.InterfaceC2075g
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        C2093c c2093c = this.exchange;
        if (c2093c != null) {
            c2093c.cancel();
        }
        C2096f c2096f = this.connectionToCancel;
        if (c2096f != null) {
            c2096f.cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // okhttp3.InterfaceC2075g
    public void enqueue(InterfaceC2077h interfaceC2077h) {
        AbstractC2980h.m5136e("responseCallback", interfaceC2077h);
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        callStart();
        this.client.dispatcher().enqueue$okhttp(new a(this, interfaceC2077h));
    }

    public final void enterNetworkInterceptorExchange(C2076g0 c2076g0, boolean z7) {
        AbstractC2980h.m5136e("request", c2076g0);
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            try {
                if (this.responseBodyOpen) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
                if (this.requestBodyOpen) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            this.exchangeFinder = new C2094d(this.connectionPool, createAddress(c2076g0.url()), this, this.eventListener);
        }
    }

    @Override // okhttp3.InterfaceC2075g
    public C2080i0 execute() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.timeout.enter();
        callStart();
        try {
            this.client.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            this.client.dispatcher().finished$okhttp(this);
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z7) {
        C2093c c2093c;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
        }
        if (z7 && (c2093c = this.exchange) != null) {
            c2093c.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    public final C2072e0 getClient() {
        return this.client;
    }

    public final C2096f getConnection() {
        return this.connection;
    }

    public final C2096f getConnectionToCancel() {
        return this.connectionToCancel;
    }

    public final AbstractC2177v getEventListener$okhttp() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    public final C2093c getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }

    public final C2076g0 getOriginalRequest() {
        return this.originalRequest;
    }

    public final C2080i0 getResponseWithInterceptorChain$okhttp() {
        ArrayList arrayList = new ArrayList();
        AbstractC1919n.m3757x0(arrayList, this.client.interceptors());
        arrayList.add(new C2113l(this.client));
        arrayList.add(new C2102a(this.client.cookieJar()));
        arrayList.add(new C2081a(this.client.cache()));
        arrayList.add(C2091a.INSTANCE);
        if (!this.forWebSocket) {
            AbstractC1919n.m3757x0(arrayList, this.client.networkInterceptors());
        }
        arrayList.add(new C2103b(this.forWebSocket));
        try {
            try {
                C2080i0 c2080i0Proceed = new C2110i(this, arrayList, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
                if (isCanceled()) {
                    AbstractC2278c.closeQuietly(c2080i0Proceed);
                    throw new IOException("Canceled");
                }
                noMoreExchanges$okhttp(null);
                return c2080i0Proceed;
            } catch (IOException e) {
                IOException iOExceptionNoMoreExchanges$okhttp = noMoreExchanges$okhttp(e);
                AbstractC2980h.m5134c("null cannot be cast to non-null type kotlin.Throwable", iOExceptionNoMoreExchanges$okhttp);
                throw iOExceptionNoMoreExchanges$okhttp;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                noMoreExchanges$okhttp(null);
            }
            throw th;
        }
    }

    public final C2093c initExchange$okhttp(C2110i c2110i) throws IOException {
        AbstractC2980h.m5136e("chain", c2110i);
        synchronized (this) {
            try {
                if (!this.expectMoreExchanges) {
                    throw new IllegalStateException("released");
                }
                if (this.responseBodyOpen) {
                    throw new IllegalStateException("Check failed.");
                }
                if (this.requestBodyOpen) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C2094d c2094d = this.exchangeFinder;
        AbstractC2980h.m5133b(c2094d);
        C2093c c2093c = new C2093c(this, this.eventListener, c2094d, c2094d.find(this.client, c2110i));
        this.interceptorScopedExchange = c2093c;
        this.exchange = c2093c;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (this.canceled) {
            throw new IOException("Canceled");
        }
        return c2093c;
    }

    @Override // okhttp3.InterfaceC2075g
    public boolean isCanceled() {
        return this.canceled;
    }

    @Override // okhttp3.InterfaceC2075g
    public boolean isExecuted() {
        return this.executed.get();
    }

    public final <E extends IOException> E messageDone$okhttp(C2093c c2093c, boolean z7, boolean z8, E e) {
        boolean z9;
        boolean z10;
        AbstractC2980h.m5136e("exchange", c2093c);
        if (c2093c.equals(this.exchange)) {
            synchronized (this) {
                z9 = false;
                if (z7) {
                    try {
                        if (!this.requestBodyOpen) {
                            if (z8 || !this.responseBodyOpen) {
                                z10 = false;
                            }
                        }
                        if (z7) {
                            this.requestBodyOpen = false;
                        }
                        if (z8) {
                            this.responseBodyOpen = false;
                        }
                        boolean z11 = this.requestBodyOpen;
                        boolean z12 = (z11 || this.responseBodyOpen) ? false : true;
                        if (!z11 && !this.responseBodyOpen) {
                            if (!this.expectMoreExchanges) {
                                z9 = true;
                            }
                        }
                        z10 = z9;
                        z9 = z12;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z8) {
                    }
                    z10 = false;
                }
            }
            if (z9) {
                this.exchange = null;
                C2096f c2096f = this.connection;
                if (c2096f != null) {
                    c2096f.incrementSuccessCount$okhttp();
                }
            }
            if (z10) {
                return (E) callDone(e);
            }
        }
        return e;
    }

    public final IOException noMoreExchanges$okhttp(IOException iOException) {
        boolean z7;
        synchronized (this) {
            z7 = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen) {
                    if (!this.responseBodyOpen) {
                        z7 = true;
                    }
                }
            }
        }
        return z7 ? callDone(iOException) : iOException;
    }

    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
        C2096f c2096f = this.connection;
        AbstractC2980h.m5133b(c2096f);
        if (AbstractC2278c.assertionsEnabled && !Thread.holdsLock(c2096f)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c2096f);
        }
        List<Reference<C2095e>> calls = c2096f.getCalls();
        Iterator<Reference<C2095e>> it = calls.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC2980h.m5132a(it.next().get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        calls.remove(i);
        this.connection = null;
        if (calls.isEmpty()) {
            c2096f.setIdleAtNs$okhttp(System.nanoTime());
            if (this.connectionPool.connectionBecameIdle(c2096f)) {
                return c2096f.socket();
            }
        }
        return null;
    }

    @Override // okhttp3.InterfaceC2075g
    public C2076g0 request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        C2094d c2094d = this.exchangeFinder;
        AbstractC2980h.m5133b(c2094d);
        return c2094d.retryAfterFailure();
    }

    public final void setConnectionToCancel(C2096f c2096f) {
        this.connectionToCancel = c2096f;
    }

    public final void timeoutEarlyExit() {
        if (this.timeoutEarlyExit) {
            throw new IllegalStateException("Check failed.");
        }
        this.timeoutEarlyExit = true;
        this.timeout.exit();
    }

    @Override // okhttp3.InterfaceC2075g
    public C2565f timeout() {
        return this.timeout;
    }

    @Override // okhttp3.InterfaceC2075g
    public C2095e clone() {
        return new C2095e(this.client, this.originalRequest, this.forWebSocket);
    }
}
