package okhttp3.internal.p129ws;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.bumptech.glide.AbstractC0715d;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC2170o0;
import okhttp3.AbstractC2177v;
import okhttp3.C2072e0;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.EnumC2074f0;
import okhttp3.InterfaceC2075g;
import okhttp3.InterfaceC2077h;
import okhttp3.InterfaceC2168n0;
import okhttp3.internal.concurrent.AbstractC2086a;
import okhttp3.internal.concurrent.C2088c;
import okhttp3.internal.concurrent.C2090e;
import okhttp3.internal.connection.C2093c;
import okhttp3.internal.connection.C2095e;
import p044e7.C0926c;
import p090k2.C1584b;
import p147q7.AbstractC2278c;
import p189v7.C2579m;
import p189v7.InterfaceC2575k;
import p189v7.InterfaceC2577l;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.ws.d */
/* loaded from: classes.dex */
public final class C2153d implements InterfaceC2168n0, InterfaceC2156g {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private InterfaceC2075g call;
    private boolean enqueuedClose;
    private C2154e extensions;
    private boolean failed;
    private final String key;
    private final AbstractC2170o0 listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final C2076g0 originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<C2579m> pongQueue;
    private long queueSize;
    private final Random random;
    private C2157h reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private d streams;
    private C2088c taskQueue;
    private C2158i writer;
    private AbstractC2086a writerTask;
    public static final b Companion = new b(null);
    private static final List<EnumC2074f0> ONLY_HTTP1 = AbstractC0715d.m1551T(EnumC2074f0.HTTP_1_1);

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.ws.d$a */
    public static final class a {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final C2579m reason;

        public a(int i, C2579m c2579m, long j) {
            this.code = i;
            this.reason = c2579m;
            this.cancelAfterCloseMillis = j;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final C2579m getReason() {
            return this.reason;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.ws.d$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.ws.d$c */
    public static final class c {
        private final C2579m data;
        private final int formatOpcode;

        public c(int i, C2579m c2579m) {
            AbstractC2980h.m5136e("data", c2579m);
            this.formatOpcode = i;
            this.data = c2579m;
        }

        public final C2579m getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.ws.d$d */
    public static abstract class d implements Closeable {
        private final boolean client;
        private final InterfaceC2575k sink;
        private final InterfaceC2577l source;

        public d(boolean z7, InterfaceC2577l interfaceC2577l, InterfaceC2575k interfaceC2575k) {
            AbstractC2980h.m5136e("source", interfaceC2577l);
            AbstractC2980h.m5136e("sink", interfaceC2575k);
            this.client = z7;
            this.source = interfaceC2577l;
            this.sink = interfaceC2575k;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final InterfaceC2575k getSink() {
            return this.sink;
        }

        public final InterfaceC2577l getSource() {
            return this.source;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.ws.d$e */
    public final class e extends AbstractC2086a {
        public e() {
            super(C2153d.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() throws IOException {
            try {
                return C2153d.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e) {
                C2153d.this.failWebSocket(e, null);
                return -1L;
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.ws.d$f */
    public static final class f implements InterfaceC2077h {
        final /* synthetic */ C2076g0 $request;

        public f(C2076g0 c2076g0) {
            this.$request = c2076g0;
        }

        @Override // okhttp3.InterfaceC2077h
        public void onFailure(InterfaceC2075g interfaceC2075g, IOException iOException) throws IOException {
            AbstractC2980h.m5136e("call", interfaceC2075g);
            AbstractC2980h.m5136e("e", iOException);
            C2153d.this.failWebSocket(iOException, null);
        }

        @Override // okhttp3.InterfaceC2077h
        public void onResponse(InterfaceC2075g interfaceC2075g, C2080i0 c2080i0) throws Throwable {
            AbstractC2980h.m5136e("call", interfaceC2075g);
            AbstractC2980h.m5136e("response", c2080i0);
            C2093c c2093cExchange = c2080i0.exchange();
            try {
                C2153d.this.checkUpgradeSuccess$okhttp(c2080i0, c2093cExchange);
                AbstractC2980h.m5133b(c2093cExchange);
                d dVarNewWebSocketStreams = c2093cExchange.newWebSocketStreams();
                C2154e c2154e = C2154e.Companion.parse(c2080i0.headers());
                C2153d.this.extensions = c2154e;
                if (!C2153d.this.isValid(c2154e)) {
                    C2153d c2153d = C2153d.this;
                    synchronized (c2153d) {
                        c2153d.messageAndCloseQueue.clear();
                        c2153d.close(AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    C2153d.this.initReaderAndWriter(AbstractC2278c.okHttpName + " WebSocket " + this.$request.url().redact(), dVarNewWebSocketStreams);
                    C2153d.this.getListener$okhttp().onOpen(C2153d.this, c2080i0);
                    C2153d.this.loopReader();
                } catch (Exception e) {
                    C2153d.this.failWebSocket(e, null);
                }
            } catch (IOException e8) {
                C2153d.this.failWebSocket(e8, c2080i0);
                AbstractC2278c.closeQuietly(c2080i0);
                if (c2093cExchange != null) {
                    c2093cExchange.webSocketUpgradeFailed();
                }
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.ws.d$g */
    public static final class g extends AbstractC2086a {
        final /* synthetic */ long $pingIntervalNanos$inlined;
        final /* synthetic */ C2153d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, C2153d c2153d, long j) {
            super(str, false, 2, null);
            this.this$0 = c2153d;
            this.$pingIntervalNanos$inlined = j;
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() throws IOException {
            this.this$0.writePingFrame$okhttp();
            return this.$pingIntervalNanos$inlined;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.ws.d$h */
    public static final class h extends AbstractC2086a {
        final /* synthetic */ C2153d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z7, C2153d c2153d) {
            super(str, z7);
            this.this$0 = c2153d;
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() {
            this.this$0.cancel();
            return -1L;
        }
    }

    public C2153d(C2090e c2090e, C2076g0 c2076g0, AbstractC2170o0 abstractC2170o0, Random random, long j, C2154e c2154e, long j8) {
        AbstractC2980h.m5136e("taskRunner", c2090e);
        AbstractC2980h.m5136e("originalRequest", c2076g0);
        AbstractC2980h.m5136e("listener", abstractC2170o0);
        AbstractC2980h.m5136e("random", random);
        this.originalRequest = c2076g0;
        this.listener = abstractC2170o0;
        this.random = random;
        this.pingIntervalMillis = j;
        this.extensions = c2154e;
        this.minimumDeflateSize = j8;
        this.taskQueue = c2090e.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!"GET".equals(c2076g0.method())) {
            throw new IllegalArgumentException(("Request must be GET: " + c2076g0.method()).toString());
        }
        C2579m c2579m = C2579m.f9316m;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.key = C1584b.m3253t(bArr).mo4632a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(C2154e c2154e) {
        if (c2154e.unknownValues || c2154e.clientMaxWindowBits != null) {
            return false;
        }
        if (c2154e.serverMaxWindowBits != null) {
            C0926c c0926c = new C0926c(8, 15, 1);
            int iIntValue = c2154e.serverMaxWindowBits.intValue();
            if (8 > iIntValue || iIntValue > c0926c.f3987k) {
                return false;
            }
        }
        return true;
    }

    private final void runWriter() {
        if (!AbstractC2278c.assertionsEnabled || Thread.holdsLock(this)) {
            AbstractC2086a abstractC2086a = this.writerTask;
            if (abstractC2086a != null) {
                C2088c.schedule$default(this.taskQueue, abstractC2086a, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final void awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        AbstractC2980h.m5136e("timeUnit", timeUnit);
        this.taskQueue.idleLatch().await(j, timeUnit);
    }

    @Override // okhttp3.InterfaceC2168n0
    public void cancel() {
        InterfaceC2075g interfaceC2075g = this.call;
        AbstractC2980h.m5133b(interfaceC2075g);
        interfaceC2075g.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(C2080i0 c2080i0, C2093c c2093c) throws ProtocolException {
        AbstractC2980h.m5136e("response", c2080i0);
        if (c2080i0.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + c2080i0.code() + ' ' + c2080i0.message() + '\'');
        }
        String strHeader$default = C2080i0.header$default(c2080i0, "Connection", null, 2, null);
        if (!"Upgrade".equalsIgnoreCase(strHeader$default)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strHeader$default + '\'');
        }
        String strHeader$default2 = C2080i0.header$default(c2080i0, "Upgrade", null, 2, null);
        if (!"websocket".equalsIgnoreCase(strHeader$default2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strHeader$default2 + '\'');
        }
        String strHeader$default3 = C2080i0.header$default(c2080i0, "Sec-WebSocket-Accept", null, 2, null);
        C2579m c2579m = C2579m.f9316m;
        String strMo4632a = C1584b.m3251p(this.key + C2155f.ACCEPT_MAGIC).mo4633c("SHA-1").mo4632a();
        if (AbstractC2980h.m5132a(strMo4632a, strHeader$default3)) {
            if (c2093c == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strMo4632a + "' but was '" + strHeader$default3 + '\'');
    }

    @Override // okhttp3.InterfaceC2168n0
    public boolean close(int i, String str) {
        return close(i, str, 60000L);
    }

    public final void connect(C2072e0 c2072e0) {
        AbstractC2980h.m5136e("client", c2072e0);
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        C2072e0 c2072e0Build = c2072e0.newBuilder().eventListener(AbstractC2177v.NONE).protocols(ONLY_HTTP1).build();
        C2076g0 c2076g0Build = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        C2095e c2095e = new C2095e(c2072e0Build, c2076g0Build, true);
        this.call = c2095e;
        c2095e.enqueue(new f(c2076g0Build));
    }

    public final void failWebSocket(Exception exc, C2080i0 c2080i0) throws IOException {
        AbstractC2980h.m5136e("e", exc);
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            d dVar = this.streams;
            this.streams = null;
            C2157h c2157h = this.reader;
            this.reader = null;
            C2158i c2158i = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            try {
                this.listener.onFailure(this, exc, c2080i0);
            } finally {
                if (dVar != null) {
                    AbstractC2278c.closeQuietly(dVar);
                }
                if (c2157h != null) {
                    AbstractC2278c.closeQuietly(c2157h);
                }
                if (c2158i != null) {
                    AbstractC2278c.closeQuietly(c2158i);
                }
            }
        }
    }

    public final AbstractC2170o0 getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(String str, d dVar) throws Throwable {
        Throwable th;
        AbstractC2980h.m5136e("name", str);
        AbstractC2980h.m5136e("streams", dVar);
        C2154e c2154e = this.extensions;
        AbstractC2980h.m5133b(c2154e);
        synchronized (this) {
            try {
                this.name = str;
                this.streams = dVar;
                this.writer = new C2158i(dVar.getClient(), dVar.getSink(), this.random, c2154e.perMessageDeflate, c2154e.noContextTakeover(dVar.getClient()), this.minimumDeflateSize);
                this.writerTask = new e();
                long j = this.pingIntervalMillis;
                if (j != 0) {
                    try {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                        this.taskQueue.schedule(new g(str.concat(" ping"), this, nanos), nanos);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    runWriter();
                }
                this.reader = new C2157h(dVar.getClient(), dVar.getSource(), this, c2154e.perMessageDeflate, c2154e.noContextTakeover(!dVar.getClient()));
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void loopReader() {
        while (this.receivedCloseCode == -1) {
            C2157h c2157h = this.reader;
            AbstractC2980h.m5133b(c2157h);
            c2157h.processNextFrame();
        }
    }

    @Override // okhttp3.internal.p129ws.InterfaceC2156g
    public void onReadClose(int i, String str) throws IOException {
        d dVar;
        C2157h c2157h;
        C2158i c2158i;
        AbstractC2980h.m5136e("reason", str);
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                throw new IllegalStateException("already closed");
            }
            this.receivedCloseCode = i;
            this.receivedCloseReason = str;
            dVar = null;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                d dVar2 = this.streams;
                this.streams = null;
                c2157h = this.reader;
                this.reader = null;
                c2158i = this.writer;
                this.writer = null;
                this.taskQueue.shutdown();
                dVar = dVar2;
            } else {
                c2157h = null;
                c2158i = null;
            }
        }
        try {
            this.listener.onClosing(this, i, str);
            if (dVar != null) {
                this.listener.onClosed(this, i, str);
            }
        } finally {
            if (dVar != null) {
                AbstractC2278c.closeQuietly(dVar);
            }
            if (c2157h != null) {
                AbstractC2278c.closeQuietly(c2157h);
            }
            if (c2158i != null) {
                AbstractC2278c.closeQuietly(c2158i);
            }
        }
    }

    @Override // okhttp3.internal.p129ws.InterfaceC2156g
    public void onReadMessage(String str) {
        AbstractC2980h.m5136e("text", str);
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.p129ws.InterfaceC2156g
    public synchronized void onReadPing(C2579m c2579m) {
        try {
            AbstractC2980h.m5136e("payload", c2579m);
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(c2579m);
                runWriter();
                this.receivedPingCount++;
            }
        } finally {
        }
    }

    @Override // okhttp3.internal.p129ws.InterfaceC2156g
    public synchronized void onReadPong(C2579m c2579m) {
        AbstractC2980h.m5136e("payload", c2579m);
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(C2579m c2579m) {
        try {
            AbstractC2980h.m5136e("payload", c2579m);
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(c2579m);
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final boolean processNextFrame() throws IOException {
        try {
            C2157h c2157h = this.reader;
            AbstractC2980h.m5133b(c2157h);
            c2157h.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e8) {
            failWebSocket(e8, null);
            return false;
        }
    }

    @Override // okhttp3.InterfaceC2168n0
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.InterfaceC2168n0
    public C2076g0 request() {
        return this.originalRequest;
    }

    @Override // okhttp3.InterfaceC2168n0
    public boolean send(String str) {
        AbstractC2980h.m5136e("text", str);
        C2579m c2579m = C2579m.f9316m;
        return send(C1584b.m3251p(str), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final boolean writeOneFrame$okhttp() throws IOException {
        String str;
        C2157h c2157h;
        C2158i c2158i;
        int i;
        d dVar;
        synchronized (this) {
            try {
                if (this.failed) {
                    return false;
                }
                C2158i c2158i2 = this.writer;
                C2579m c2579mPoll = this.pongQueue.poll();
                Object obj = null;
                if (c2579mPoll == null) {
                    Object objPoll = this.messageAndCloseQueue.poll();
                    if (objPoll instanceof a) {
                        i = this.receivedCloseCode;
                        str = this.receivedCloseReason;
                        if (i != -1) {
                            dVar = this.streams;
                            this.streams = null;
                            c2157h = this.reader;
                            this.reader = null;
                            c2158i = this.writer;
                            this.writer = null;
                            this.taskQueue.shutdown();
                        } else {
                            long cancelAfterCloseMillis = ((a) objPoll).getCancelAfterCloseMillis();
                            this.taskQueue.schedule(new h(this.name + " cancel", true, this), TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
                            dVar = null;
                            c2157h = null;
                            c2158i = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        c2157h = null;
                        c2158i = null;
                        i = -1;
                        dVar = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    c2157h = null;
                    c2158i = null;
                    i = -1;
                    dVar = null;
                }
                try {
                    if (c2579mPoll != null) {
                        AbstractC2980h.m5133b(c2158i2);
                        c2158i2.writePong(c2579mPoll);
                    } else if (obj instanceof c) {
                        c cVar = (c) obj;
                        AbstractC2980h.m5133b(c2158i2);
                        c2158i2.writeMessageFrame(cVar.getFormatOpcode(), cVar.getData());
                        synchronized (this) {
                            this.queueSize -= cVar.getData().mo4634d();
                        }
                    } else {
                        if (!(obj instanceof a)) {
                            throw new AssertionError();
                        }
                        a aVar = (a) obj;
                        AbstractC2980h.m5133b(c2158i2);
                        c2158i2.writeClose(aVar.getCode(), aVar.getReason());
                        if (dVar != null) {
                            AbstractC2170o0 abstractC2170o0 = this.listener;
                            AbstractC2980h.m5133b(str);
                            abstractC2170o0.onClosed(this, i, str);
                        }
                    }
                    return true;
                } finally {
                    if (dVar != null) {
                        AbstractC2278c.closeQuietly(dVar);
                    }
                    if (c2157h != null) {
                        AbstractC2278c.closeQuietly(c2157h);
                    }
                    if (c2158i != null) {
                        AbstractC2278c.closeQuietly(c2158i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void writePingFrame$okhttp() throws IOException {
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                C2158i c2158i = this.writer;
                if (c2158i == null) {
                    return;
                }
                int i = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                if (i == -1) {
                    try {
                        c2158i.writePing(C2579m.f9316m);
                        return;
                    } catch (IOException e8) {
                        failWebSocket(e8, null);
                        return;
                    }
                }
                failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean close(int i, String str, long j) {
        C2579m c2579mM3251p;
        try {
            C2155f.INSTANCE.validateCloseCode(i);
            if (str != null) {
                C2579m c2579m = C2579m.f9316m;
                c2579mM3251p = C1584b.m3251p(str);
                if (c2579mM3251p.f9317j.length > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                }
            } else {
                c2579mM3251p = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new a(i, c2579mM3251p, j));
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // okhttp3.internal.p129ws.InterfaceC2156g
    public void onReadMessage(C2579m c2579m) {
        AbstractC2980h.m5136e("bytes", c2579m);
        this.listener.onMessage(this, c2579m);
    }

    @Override // okhttp3.InterfaceC2168n0
    public boolean send(C2579m c2579m) {
        AbstractC2980h.m5136e("bytes", c2579m);
        return send(c2579m, 2);
    }

    private final synchronized boolean send(C2579m c2579m, int i) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + c2579m.mo4634d() > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += c2579m.mo4634d();
            this.messageAndCloseQueue.add(new c(i, c2579m));
            runWriter();
            return true;
        }
        return false;
    }
}
