package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.concurrent.AbstractC2086a;
import okhttp3.internal.concurrent.C2088c;
import okhttp3.internal.concurrent.C2090e;
import p002a1.AbstractC0008a1;
import p102l6.C1693j;
import p147q7.AbstractC2278c;
import p164s7.C2385h;
import p189v7.AbstractC2557b;
import p189v7.C2573j;
import p189v7.C2579m;
import p189v7.InterfaceC2575k;
import p189v7.InterfaceC2577l;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http2.f */
/* loaded from: classes.dex */
public final class C2122f implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final b Companion = new b(null);
    private static final C2131o DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final c listener;
    private int nextStreamId;
    private final C2131o okHttpSettings;
    private C2131o peerSettings;
    private final InterfaceC2130n pushObserver;
    private final C2088c pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final d readerRunnable;
    private final C2088c settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, C2126j> streams;
    private final C2090e taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final C2127k writer;
    private final C2088c writerQueue;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.f$a */
    public static final class a {
        private boolean client;
        public String connectionName;
        private c listener;
        private int pingIntervalMillis;
        private InterfaceC2130n pushObserver;
        public InterfaceC2575k sink;
        public Socket socket;
        public InterfaceC2577l source;
        private final C2090e taskRunner;

        public a(boolean z7, C2090e c2090e) {
            AbstractC2980h.m5136e("taskRunner", c2090e);
            this.client = z7;
            this.taskRunner = c2090e;
            this.listener = c.REFUSE_INCOMING_STREAMS;
            this.pushObserver = InterfaceC2130n.CANCEL;
        }

        public static /* synthetic */ a socket$default(a aVar, Socket socket, String str, InterfaceC2577l interfaceC2577l, InterfaceC2575k interfaceC2575k, int i, Object obj) {
            if ((i & 2) != 0) {
                str = AbstractC2278c.peerName(socket);
            }
            if ((i & 4) != 0) {
                interfaceC2577l = AbstractC2557b.m4578c(AbstractC2557b.m4585j(socket));
            }
            if ((i & 8) != 0) {
                interfaceC2575k = AbstractC2557b.m4577b(AbstractC2557b.m4582g(socket));
            }
            return aVar.socket(socket, str, interfaceC2577l, interfaceC2575k);
        }

        public final C2122f build() {
            return new C2122f(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            AbstractC2980h.m5139h("connectionName");
            throw null;
        }

        public final c getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final InterfaceC2130n getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final InterfaceC2575k getSink$okhttp() {
            InterfaceC2575k interfaceC2575k = this.sink;
            if (interfaceC2575k != null) {
                return interfaceC2575k;
            }
            AbstractC2980h.m5139h("sink");
            throw null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            AbstractC2980h.m5139h("socket");
            throw null;
        }

        public final InterfaceC2577l getSource$okhttp() {
            InterfaceC2577l interfaceC2577l = this.source;
            if (interfaceC2577l != null) {
                return interfaceC2577l;
            }
            AbstractC2980h.m5139h("source");
            throw null;
        }

        public final C2090e getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final a listener(c cVar) {
            AbstractC2980h.m5136e("listener", cVar);
            this.listener = cVar;
            return this;
        }

        public final a pingIntervalMillis(int i) {
            this.pingIntervalMillis = i;
            return this;
        }

        public final a pushObserver(InterfaceC2130n interfaceC2130n) {
            AbstractC2980h.m5136e("pushObserver", interfaceC2130n);
            this.pushObserver = interfaceC2130n;
            return this;
        }

        public final void setClient$okhttp(boolean z7) {
            this.client = z7;
        }

        public final void setConnectionName$okhttp(String str) {
            AbstractC2980h.m5136e("<set-?>", str);
            this.connectionName = str;
        }

        public final void setListener$okhttp(c cVar) {
            AbstractC2980h.m5136e("<set-?>", cVar);
            this.listener = cVar;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public final void setPushObserver$okhttp(InterfaceC2130n interfaceC2130n) {
            AbstractC2980h.m5136e("<set-?>", interfaceC2130n);
            this.pushObserver = interfaceC2130n;
        }

        public final void setSink$okhttp(InterfaceC2575k interfaceC2575k) {
            AbstractC2980h.m5136e("<set-?>", interfaceC2575k);
            this.sink = interfaceC2575k;
        }

        public final void setSocket$okhttp(Socket socket) {
            AbstractC2980h.m5136e("<set-?>", socket);
            this.socket = socket;
        }

        public final void setSource$okhttp(InterfaceC2577l interfaceC2577l) {
            AbstractC2980h.m5136e("<set-?>", interfaceC2577l);
            this.source = interfaceC2577l;
        }

        public final a socket(Socket socket) {
            AbstractC2980h.m5136e("socket", socket);
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final a socket(Socket socket, String str) {
            AbstractC2980h.m5136e("socket", socket);
            AbstractC2980h.m5136e("peerName", str);
            return socket$default(this, socket, str, null, null, 12, null);
        }

        public final a socket(Socket socket, String str, InterfaceC2577l interfaceC2577l) {
            AbstractC2980h.m5136e("socket", socket);
            AbstractC2980h.m5136e("peerName", str);
            AbstractC2980h.m5136e("source", interfaceC2577l);
            return socket$default(this, socket, str, interfaceC2577l, null, 8, null);
        }

        public final a socket(Socket socket, String str, InterfaceC2577l interfaceC2577l, InterfaceC2575k interfaceC2575k) {
            String strConcat;
            AbstractC2980h.m5136e("socket", socket);
            AbstractC2980h.m5136e("peerName", str);
            AbstractC2980h.m5136e("source", interfaceC2577l);
            AbstractC2980h.m5136e("sink", interfaceC2575k);
            setSocket$okhttp(socket);
            if (this.client) {
                strConcat = AbstractC2278c.okHttpName + ' ' + str;
            } else {
                strConcat = "MockWebServer ".concat(str);
            }
            setConnectionName$okhttp(strConcat);
            setSource$okhttp(interfaceC2577l);
            setSink$okhttp(interfaceC2575k);
            return this;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.f$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        public final C2131o getDEFAULT_SETTINGS() {
            return C2122f.DEFAULT_SETTINGS;
        }

        private b() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.f$c */
    public static abstract class c {
        public static final b Companion = new b(null);
        public static final c REFUSE_INCOMING_STREAMS = new a();

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.internal.http2.f$c$a */
        public static final class a extends c {
            @Override // okhttp3.internal.http2.C2122f.c
            public void onStream(C2126j c2126j) {
                AbstractC2980h.m5136e("stream", c2126j);
                c2126j.close(EnumC2118b.REFUSED_STREAM, null);
            }
        }

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.internal.http2.f$c$b */
        public static final class b {
            public /* synthetic */ b(AbstractC2977e abstractC2977e) {
                this();
            }

            private b() {
            }
        }

        public void onSettings(C2122f c2122f, C2131o c2131o) {
            AbstractC2980h.m5136e("connection", c2122f);
            AbstractC2980h.m5136e("settings", c2131o);
        }

        public abstract void onStream(C2126j c2126j);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.f$d */
    public final class d implements InterfaceC2125i, InterfaceC2840a {
        private final C2124h reader;
        final /* synthetic */ C2122f this$0;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.internal.http2.f$d$a */
        public static final class a extends AbstractC2086a {
            final /* synthetic */ C2986n $newPeerSettings$inlined;
            final /* synthetic */ C2122f this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z7, C2122f c2122f, C2986n c2986n) {
                super(str, z7);
                this.this$0 = c2122f;
                this.$newPeerSettings$inlined = c2986n;
            }

            @Override // okhttp3.internal.concurrent.AbstractC2086a
            public long runOnce() {
                this.this$0.getListener$okhttp().onSettings(this.this$0, (C2131o) this.$newPeerSettings$inlined.f11117j);
                return -1L;
            }
        }

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.internal.http2.f$d$b */
        public static final class b extends AbstractC2086a {
            final /* synthetic */ C2126j $newStream$inlined;
            final /* synthetic */ C2122f this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z7, C2122f c2122f, C2126j c2126j) {
                super(str, z7);
                this.this$0 = c2122f;
                this.$newStream$inlined = c2126j;
            }

            @Override // okhttp3.internal.concurrent.AbstractC2086a
            public long runOnce() {
                try {
                    this.this$0.getListener$okhttp().onStream(this.$newStream$inlined);
                    return -1L;
                } catch (IOException e) {
                    C2385h.Companion.get().log("Http2Connection.Listener failure for " + this.this$0.getConnectionName$okhttp(), 4, e);
                    try {
                        this.$newStream$inlined.close(EnumC2118b.PROTOCOL_ERROR, e);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.internal.http2.f$d$c */
        public static final class c extends AbstractC2086a {
            final /* synthetic */ int $payload1$inlined;
            final /* synthetic */ int $payload2$inlined;
            final /* synthetic */ C2122f this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z7, C2122f c2122f, int i, int i4) {
                super(str, z7);
                this.this$0 = c2122f;
                this.$payload1$inlined = i;
                this.$payload2$inlined = i4;
            }

            @Override // okhttp3.internal.concurrent.AbstractC2086a
            public long runOnce() throws IOException {
                this.this$0.writePing(true, this.$payload1$inlined, this.$payload2$inlined);
                return -1L;
            }
        }

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.internal.http2.f$d$d, reason: collision with other inner class name */
        public static final class C2993d extends AbstractC2086a {
            final /* synthetic */ boolean $clearPrevious$inlined;
            final /* synthetic */ C2131o $settings$inlined;
            final /* synthetic */ d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2993d(String str, boolean z7, d dVar, boolean z8, C2131o c2131o) {
                super(str, z7);
                this.this$0 = dVar;
                this.$clearPrevious$inlined = z8;
                this.$settings$inlined = c2131o;
            }

            @Override // okhttp3.internal.concurrent.AbstractC2086a
            public long runOnce() {
                this.this$0.applyAndAckSettings(this.$clearPrevious$inlined, this.$settings$inlined);
                return -1L;
            }
        }

        public d(C2122f c2122f, C2124h c2124h) {
            AbstractC2980h.m5136e("reader", c2124h);
            this.this$0 = c2122f;
            this.reader = c2124h;
        }

        @Override // okhttp3.internal.http2.InterfaceC2125i
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.InterfaceC2125i
        public void alternateService(int i, String str, C2579m c2579m, String str2, int i4, long j) {
            AbstractC2980h.m5136e("origin", str);
            AbstractC2980h.m5136e("protocol", c2579m);
            AbstractC2980h.m5136e("host", str2);
        }

        public final void applyAndAckSettings(boolean z7, C2131o c2131o) {
            long initialWindowSize;
            int i;
            C2126j[] c2126jArr;
            AbstractC2980h.m5136e("settings", c2131o);
            C2986n c2986n = new C2986n();
            C2127k writer = this.this$0.getWriter();
            C2122f c2122f = this.this$0;
            synchronized (writer) {
                synchronized (c2122f) {
                    try {
                        C2131o peerSettings = c2122f.getPeerSettings();
                        if (!z7) {
                            C2131o c2131o2 = new C2131o();
                            c2131o2.merge(peerSettings);
                            c2131o2.merge(c2131o);
                            c2131o = c2131o2;
                        }
                        c2986n.f11117j = c2131o;
                        initialWindowSize = c2131o.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                        c2126jArr = (initialWindowSize == 0 || c2122f.getStreams$okhttp().isEmpty()) ? null : (C2126j[]) c2122f.getStreams$okhttp().values().toArray(new C2126j[0]);
                        c2122f.setPeerSettings((C2131o) c2986n.f11117j);
                        c2122f.settingsListenerQueue.schedule(new a(c2122f.getConnectionName$okhttp() + " onSettings", true, c2122f, c2986n), 0L);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    c2122f.getWriter().applyAndAckSettings((C2131o) c2986n.f11117j);
                } catch (IOException e) {
                    c2122f.failConnection(e);
                }
            }
            if (c2126jArr != null) {
                for (C2126j c2126j : c2126jArr) {
                    synchronized (c2126j) {
                        c2126j.addBytesToWriteWindow(initialWindowSize);
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.InterfaceC2125i
        public void data(boolean z7, int i, InterfaceC2577l interfaceC2577l, int i4) {
            AbstractC2980h.m5136e("source", interfaceC2577l);
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushDataLater$okhttp(i, interfaceC2577l, i4, z7);
                return;
            }
            C2126j stream = this.this$0.getStream(i);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i, EnumC2118b.PROTOCOL_ERROR);
                long j = i4;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                interfaceC2577l.skip(j);
                return;
            }
            stream.receiveData(interfaceC2577l, i4);
            if (z7) {
                stream.receiveHeaders(AbstractC2278c.EMPTY_HEADERS, true);
            }
        }

        public final C2124h getReader$okhttp() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.InterfaceC2125i
        public void goAway(int i, EnumC2118b enumC2118b, C2579m c2579m) {
            int i4;
            Object[] array;
            AbstractC2980h.m5136e("errorCode", enumC2118b);
            AbstractC2980h.m5136e("debugData", c2579m);
            c2579m.mo4634d();
            C2122f c2122f = this.this$0;
            synchronized (c2122f) {
                array = c2122f.getStreams$okhttp().values().toArray(new C2126j[0]);
                c2122f.isShutdown = true;
            }
            for (C2126j c2126j : (C2126j[]) array) {
                if (c2126j.getId() > i && c2126j.isLocallyInitiated()) {
                    c2126j.receiveRstStream(EnumC2118b.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(c2126j.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.InterfaceC2125i
        public void headers(boolean z7, int i, int i4, List<C2119c> list) {
            AbstractC2980h.m5136e("headerBlock", list);
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushHeadersLater$okhttp(i, list, z7);
                return;
            }
            C2122f c2122f = this.this$0;
            synchronized (c2122f) {
                C2126j stream = c2122f.getStream(i);
                if (stream != null) {
                    stream.receiveHeaders(AbstractC2278c.toHeaders(list), z7);
                    return;
                }
                if (c2122f.isShutdown) {
                    return;
                }
                if (i <= c2122f.getLastGoodStreamId$okhttp()) {
                    return;
                }
                if (i % 2 == c2122f.getNextStreamId$okhttp() % 2) {
                    return;
                }
                C2126j c2126j = new C2126j(i, c2122f, false, z7, AbstractC2278c.toHeaders(list));
                c2122f.setLastGoodStreamId$okhttp(i);
                c2122f.getStreams$okhttp().put(Integer.valueOf(i), c2126j);
                c2122f.taskRunner.newQueue().schedule(new b(c2122f.getConnectionName$okhttp() + '[' + i + "] onStream", true, c2122f, c2126j), 0L);
            }
        }

        @Override // p212y6.InterfaceC2840a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m5232invoke();
            return C1693j.f6497a;
        }

        @Override // okhttp3.internal.http2.InterfaceC2125i
        public void ping(boolean z7, int i, int i4) {
            if (!z7) {
                this.this$0.writerQueue.schedule(new c(this.this$0.getConnectionName$okhttp() + " ping", true, this.this$0, i, i4), 0L);
                return;
            }
            C2122f c2122f = this.this$0;
            synchronized (c2122f) {
                try {
                    if (i == 1) {
                        c2122f.intervalPongsReceived++;
                    } else if (i == 2) {
                        c2122f.degradedPongsReceived++;
                    } else if (i == 3) {
                        c2122f.awaitPongsReceived++;
                        AbstractC2980h.m5134c("null cannot be cast to non-null type java.lang.Object", c2122f);
                        c2122f.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.InterfaceC2125i
        public void priority(int i, int i4, int i8, boolean z7) {
        }

        @Override // okhttp3.internal.http2.InterfaceC2125i
        public void pushPromise(int i, int i4, List<C2119c> list) throws Throwable {
            AbstractC2980h.m5136e("requestHeaders", list);
            this.this$0.pushRequestLater$okhttp(i4, list);
        }

        @Override // okhttp3.internal.http2.InterfaceC2125i
        public void rstStream(int i, EnumC2118b enumC2118b) {
            AbstractC2980h.m5136e("errorCode", enumC2118b);
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushResetLater$okhttp(i, enumC2118b);
                return;
            }
            C2126j c2126jRemoveStream$okhttp = this.this$0.removeStream$okhttp(i);
            if (c2126jRemoveStream$okhttp != null) {
                c2126jRemoveStream$okhttp.receiveRstStream(enumC2118b);
            }
        }

        @Override // okhttp3.internal.http2.InterfaceC2125i
        public void settings(boolean z7, C2131o c2131o) {
            AbstractC2980h.m5136e("settings", c2131o);
            this.this$0.writerQueue.schedule(new C2993d(this.this$0.getConnectionName$okhttp() + " applyAndAckSettings", true, this, z7, c2131o), 0L);
        }

        @Override // okhttp3.internal.http2.InterfaceC2125i
        public void windowUpdate(int i, long j) {
            if (i == 0) {
                C2122f c2122f = this.this$0;
                synchronized (c2122f) {
                    c2122f.writeBytesMaximum = c2122f.getWriteBytesMaximum() + j;
                    c2122f.notifyAll();
                }
                return;
            }
            C2126j stream = this.this$0.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.h] */
        /* renamed from: invoke, reason: collision with other method in class */
        public void m5232invoke() throws Throwable {
            EnumC2118b enumC2118b;
            EnumC2118b enumC2118b2 = EnumC2118b.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    EnumC2118b enumC2118b3 = EnumC2118b.NO_ERROR;
                    try {
                        this.this$0.close$okhttp(enumC2118b3, EnumC2118b.CANCEL, null);
                        enumC2118b = enumC2118b3;
                    } catch (IOException e8) {
                        e = e8;
                        EnumC2118b enumC2118b4 = EnumC2118b.PROTOCOL_ERROR;
                        C2122f c2122f = this.this$0;
                        c2122f.close$okhttp(enumC2118b4, enumC2118b4, e);
                        enumC2118b = c2122f;
                        enumC2118b2 = this.reader;
                        AbstractC2278c.closeQuietly((Closeable) enumC2118b2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.this$0.close$okhttp(enumC2118b, enumC2118b2, e);
                    AbstractC2278c.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
            } catch (Throwable th2) {
                th = th2;
                enumC2118b = enumC2118b2;
                this.this$0.close$okhttp(enumC2118b, enumC2118b2, e);
                AbstractC2278c.closeQuietly(this.reader);
                throw th;
            }
            enumC2118b2 = this.reader;
            AbstractC2278c.closeQuietly((Closeable) enumC2118b2);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.f$e */
    public static final class e extends AbstractC2086a {
        final /* synthetic */ C2573j $buffer$inlined;
        final /* synthetic */ int $byteCount$inlined;
        final /* synthetic */ boolean $inFinished$inlined;
        final /* synthetic */ int $streamId$inlined;
        final /* synthetic */ C2122f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z7, C2122f c2122f, int i, C2573j c2573j, int i4, boolean z8) {
            super(str, z7);
            this.this$0 = c2122f;
            this.$streamId$inlined = i;
            this.$buffer$inlined = c2573j;
            this.$byteCount$inlined = i4;
            this.$inFinished$inlined = z8;
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() {
            try {
                boolean zOnData = this.this$0.pushObserver.onData(this.$streamId$inlined, this.$buffer$inlined, this.$byteCount$inlined, this.$inFinished$inlined);
                if (zOnData) {
                    this.this$0.getWriter().rstStream(this.$streamId$inlined, EnumC2118b.CANCEL);
                }
                if (!zOnData && !this.$inFinished$inlined) {
                    return -1L;
                }
                synchronized (this.this$0) {
                    this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.f$f */
    public static final class f extends AbstractC2086a {
        final /* synthetic */ boolean $inFinished$inlined;
        final /* synthetic */ List $requestHeaders$inlined;
        final /* synthetic */ int $streamId$inlined;
        final /* synthetic */ C2122f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z7, C2122f c2122f, int i, List list, boolean z8) {
            super(str, z7);
            this.this$0 = c2122f;
            this.$streamId$inlined = i;
            this.$requestHeaders$inlined = list;
            this.$inFinished$inlined = z8;
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() {
            boolean zOnHeaders = this.this$0.pushObserver.onHeaders(this.$streamId$inlined, this.$requestHeaders$inlined, this.$inFinished$inlined);
            if (zOnHeaders) {
                try {
                    this.this$0.getWriter().rstStream(this.$streamId$inlined, EnumC2118b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zOnHeaders && !this.$inFinished$inlined) {
                return -1L;
            }
            synchronized (this.this$0) {
                this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
            }
            return -1L;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.f$g */
    public static final class g extends AbstractC2086a {
        final /* synthetic */ List $requestHeaders$inlined;
        final /* synthetic */ int $streamId$inlined;
        final /* synthetic */ C2122f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z7, C2122f c2122f, int i, List list) {
            super(str, z7);
            this.this$0 = c2122f;
            this.$streamId$inlined = i;
            this.$requestHeaders$inlined = list;
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() {
            if (!this.this$0.pushObserver.onRequest(this.$streamId$inlined, this.$requestHeaders$inlined)) {
                return -1L;
            }
            try {
                this.this$0.getWriter().rstStream(this.$streamId$inlined, EnumC2118b.CANCEL);
                synchronized (this.this$0) {
                    this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.f$h */
    public static final class h extends AbstractC2086a {
        final /* synthetic */ EnumC2118b $errorCode$inlined;
        final /* synthetic */ int $streamId$inlined;
        final /* synthetic */ C2122f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z7, C2122f c2122f, int i, EnumC2118b enumC2118b) {
            super(str, z7);
            this.this$0 = c2122f;
            this.$streamId$inlined = i;
            this.$errorCode$inlined = enumC2118b;
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() {
            this.this$0.pushObserver.onReset(this.$streamId$inlined, this.$errorCode$inlined);
            synchronized (this.this$0) {
                this.this$0.currentPushRequests.remove(Integer.valueOf(this.$streamId$inlined));
            }
            return -1L;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.f$i */
    public static final class i extends AbstractC2086a {
        final /* synthetic */ C2122f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z7, C2122f c2122f) {
            super(str, z7);
            this.this$0 = c2122f;
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() throws IOException {
            this.this$0.writePing(false, 2, 0);
            return -1L;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.f$j */
    public static final class j extends AbstractC2086a {
        final /* synthetic */ long $pingIntervalNanos$inlined;
        final /* synthetic */ C2122f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, C2122f c2122f, long j) {
            super(str, false, 2, null);
            this.this$0 = c2122f;
            this.$pingIntervalNanos$inlined = j;
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() throws IOException {
            boolean z7;
            synchronized (this.this$0) {
                if (this.this$0.intervalPongsReceived < this.this$0.intervalPingsSent) {
                    z7 = true;
                } else {
                    this.this$0.intervalPingsSent++;
                    z7 = false;
                }
            }
            if (z7) {
                this.this$0.failConnection(null);
                return -1L;
            }
            this.this$0.writePing(false, 1, 0);
            return this.$pingIntervalNanos$inlined;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.f$k */
    public static final class k extends AbstractC2086a {
        final /* synthetic */ EnumC2118b $errorCode$inlined;
        final /* synthetic */ int $streamId$inlined;
        final /* synthetic */ C2122f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z7, C2122f c2122f, int i, EnumC2118b enumC2118b) {
            super(str, z7);
            this.this$0 = c2122f;
            this.$streamId$inlined = i;
            this.$errorCode$inlined = enumC2118b;
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() throws IOException {
            try {
                this.this$0.writeSynReset$okhttp(this.$streamId$inlined, this.$errorCode$inlined);
                return -1L;
            } catch (IOException e) {
                this.this$0.failConnection(e);
                return -1L;
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.f$l */
    public static final class l extends AbstractC2086a {
        final /* synthetic */ int $streamId$inlined;
        final /* synthetic */ long $unacknowledgedBytesRead$inlined;
        final /* synthetic */ C2122f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z7, C2122f c2122f, int i, long j) {
            super(str, z7);
            this.this$0 = c2122f;
            this.$streamId$inlined = i;
            this.$unacknowledgedBytesRead$inlined = j;
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() throws IOException {
            try {
                this.this$0.getWriter().windowUpdate(this.$streamId$inlined, this.$unacknowledgedBytesRead$inlined);
                return -1L;
            } catch (IOException e) {
                this.this$0.failConnection(e);
                return -1L;
            }
        }
    }

    static {
        C2131o c2131o = new C2131o();
        c2131o.set(7, C2131o.DEFAULT_INITIAL_WINDOW_SIZE);
        c2131o.set(5, 16384);
        DEFAULT_SETTINGS = c2131o;
    }

    public C2122f(a aVar) {
        AbstractC2980h.m5136e("builder", aVar);
        boolean client$okhttp = aVar.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = aVar.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = aVar.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = aVar.getClient$okhttp() ? 3 : 2;
        C2090e taskRunner$okhttp = aVar.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        C2088c c2088cNewQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = c2088cNewQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = aVar.getPushObserver$okhttp();
        C2131o c2131o = new C2131o();
        if (aVar.getClient$okhttp()) {
            c2131o.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = c2131o;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = r2.getInitialWindowSize();
        this.socket = aVar.getSocket$okhttp();
        this.writer = new C2127k(aVar.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new d(this, new C2124h(aVar.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (aVar.getPingIntervalMillis$okhttp() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(aVar.getPingIntervalMillis$okhttp());
            c2088cNewQueue.schedule(new j(AbstractC0008a1.m16l(connectionName$okhttp, " ping"), this, nanos), nanos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(IOException iOException) throws IOException {
        EnumC2118b enumC2118b = EnumC2118b.PROTOCOL_ERROR;
        close$okhttp(enumC2118b, enumC2118b, iOException);
    }

    public static /* synthetic */ void start$default(C2122f c2122f, boolean z7, C2090e c2090e, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z7 = true;
        }
        if ((i4 & 2) != 0) {
            c2090e = C2090e.INSTANCE;
        }
        c2122f.start(z7, c2090e);
    }

    public final synchronized void awaitPong() {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        close$okhttp(EnumC2118b.NO_ERROR, EnumC2118b.CANCEL, null);
    }

    public final void close$okhttp(EnumC2118b enumC2118b, EnumC2118b enumC2118b2, IOException iOException) throws IOException {
        int i4;
        Object[] array;
        AbstractC2980h.m5136e("connectionCode", enumC2118b);
        AbstractC2980h.m5136e("streamCode", enumC2118b2);
        if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(enumC2118b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.streams.isEmpty()) {
                array = null;
            } else {
                array = this.streams.values().toArray(new C2126j[0]);
                this.streams.clear();
            }
        }
        C2126j[] c2126jArr = (C2126j[]) array;
        if (c2126jArr != null) {
            for (C2126j c2126j : c2126jArr) {
                try {
                    c2126j.close(enumC2118b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final c getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final C2131o getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final C2131o getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final d getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized C2126j getStream(int i4) {
        return this.streams.get(Integer.valueOf(i4));
    }

    public final Map<Integer, C2126j> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final C2127k getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j8) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j8 >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    public final C2126j newStream(List<C2119c> list, boolean z7) {
        AbstractC2980h.m5136e("requestHeaders", list);
        return newStream(0, list, z7);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(int i4, InterfaceC2577l interfaceC2577l, int i8, boolean z7) {
        AbstractC2980h.m5136e("source", interfaceC2577l);
        C2573j c2573j = new C2573j();
        long j8 = i8;
        interfaceC2577l.mo4623y(j8);
        interfaceC2577l.read(c2573j, j8);
        this.pushQueue.schedule(new e(this.connectionName + '[' + i4 + "] onData", true, this, i4, c2573j, i8, z7), 0L);
    }

    public final void pushHeadersLater$okhttp(int i4, List<C2119c> list, boolean z7) {
        AbstractC2980h.m5136e("requestHeaders", list);
        this.pushQueue.schedule(new f(this.connectionName + '[' + i4 + "] onHeaders", true, this, i4, list, z7), 0L);
    }

    public final void pushRequestLater$okhttp(int i4, List<C2119c> list) throws Throwable {
        Throwable th;
        AbstractC2980h.m5136e("requestHeaders", list);
        synchronized (this) {
            try {
                if (this.currentPushRequests.contains(Integer.valueOf(i4))) {
                    try {
                        writeSynResetLater$okhttp(i4, EnumC2118b.PROTOCOL_ERROR);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.currentPushRequests.add(Integer.valueOf(i4));
                this.pushQueue.schedule(new g(this.connectionName + '[' + i4 + "] onRequest", true, this, i4, list), 0L);
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void pushResetLater$okhttp(int i4, EnumC2118b enumC2118b) {
        AbstractC2980h.m5136e("errorCode", enumC2118b);
        this.pushQueue.schedule(new h(this.connectionName + '[' + i4 + "] onReset", true, this, i4, enumC2118b), 0L);
    }

    public final C2126j pushStream(int i4, List<C2119c> list, boolean z7) {
        AbstractC2980h.m5136e("requestHeaders", list);
        if (this.client) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return newStream(i4, list, z7);
    }

    public final boolean pushedStream$okhttp(int i4) {
        return i4 != 0 && (i4 & 1) == 0;
    }

    public final synchronized C2126j removeStream$okhttp(int i4) {
        C2126j c2126jRemove;
        c2126jRemove = this.streams.remove(Integer.valueOf(i4));
        notifyAll();
        return c2126jRemove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j8 = this.degradedPongsReceived;
            long j9 = this.degradedPingsSent;
            if (j8 < j9) {
                return;
            }
            this.degradedPingsSent = j9 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + DEGRADED_PONG_TIMEOUT_NS;
            this.writerQueue.schedule(new i(AbstractC0008a1.m18n(new StringBuilder(), this.connectionName, " ping"), true, this), 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i4) {
        this.lastGoodStreamId = i4;
    }

    public final void setNextStreamId$okhttp(int i4) {
        this.nextStreamId = i4;
    }

    public final void setPeerSettings(C2131o c2131o) {
        AbstractC2980h.m5136e("<set-?>", c2131o);
        this.peerSettings = c2131o;
    }

    public final void setSettings(C2131o c2131o) {
        AbstractC2980h.m5136e("settings", c2131o);
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new C2117a();
                }
                this.okHttpSettings.merge(c2131o);
            }
            this.writer.settings(c2131o);
        }
    }

    public final void shutdown(EnumC2118b enumC2118b) {
        AbstractC2980h.m5136e("statusCode", enumC2118b);
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                this.writer.goAway(this.lastGoodStreamId, enumC2118b, AbstractC2278c.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start() {
        start$default(this, false, null, 3, null);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j8) {
        long j9 = this.readBytesTotal + j8;
        this.readBytesTotal = j9;
        long j10 = j9 - this.readBytesAcknowledged;
        if (j10 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j10);
            this.readBytesAcknowledged += j10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.maxDataLength());
        r6 = r2;
        r8.writeBytesTotal += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeData(int i4, boolean z7, C2573j c2573j, long j8) {
        int iMin;
        long j9;
        if (j8 == 0) {
            this.writer.data(z7, i4, c2573j, 0);
            return;
        }
        while (j8 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j10 = this.writeBytesTotal;
                            long j11 = this.writeBytesMaximum;
                            if (j10 < j11) {
                                break;
                            } else {
                                if (!this.streams.containsKey(Integer.valueOf(i4))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j8 -= j9;
            this.writer.data(z7 && j8 == 0, i4, c2573j, iMin);
        }
    }

    public final void writeHeaders$okhttp(int i4, boolean z7, List<C2119c> list) {
        AbstractC2980h.m5136e("alternating", list);
        this.writer.headers(z7, i4, list);
    }

    public final void writePing(boolean z7, int i4, int i8) throws IOException {
        try {
            this.writer.ping(z7, i4, i8);
        } catch (IOException e8) {
            failConnection(e8);
        }
    }

    public final void writePingAndAwaitPong() throws IOException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i4, EnumC2118b enumC2118b) {
        AbstractC2980h.m5136e("statusCode", enumC2118b);
        this.writer.rstStream(i4, enumC2118b);
    }

    public final void writeSynResetLater$okhttp(int i4, EnumC2118b enumC2118b) {
        AbstractC2980h.m5136e("errorCode", enumC2118b);
        this.writerQueue.schedule(new k(this.connectionName + '[' + i4 + "] writeSynReset", true, this, i4, enumC2118b), 0L);
    }

    public final void writeWindowUpdateLater$okhttp(int i4, long j8) {
        this.writerQueue.schedule(new l(this.connectionName + '[' + i4 + "] windowUpdate", true, this, i4, j8), 0L);
    }

    private final C2126j newStream(int i4, List<C2119c> list, boolean z7) throws Throwable {
        Throwable th;
        boolean z8 = !z7;
        synchronized (this.writer) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.nextStreamId > 1073741823) {
                                try {
                                    shutdown(EnumC2118b.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                if (this.isShutdown) {
                                    throw new C2117a();
                                }
                                int i8 = this.nextStreamId;
                                this.nextStreamId = i8 + 2;
                                C2126j c2126j = new C2126j(i8, this, z8, false, null);
                                boolean z9 = !z7 || this.writeBytesTotal >= this.writeBytesMaximum || c2126j.getWriteBytesTotal() >= c2126j.getWriteBytesMaximum();
                                if (c2126j.isOpen()) {
                                    this.streams.put(Integer.valueOf(i8), c2126j);
                                }
                                if (i4 == 0) {
                                    this.writer.headers(z8, i8, list);
                                } else {
                                    if (this.client) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.writer.pushPromise(i4, i8, list);
                                }
                                if (z9) {
                                    this.writer.flush();
                                }
                                return c2126j;
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    public final void start(boolean z7) {
        start$default(this, z7, null, 2, null);
    }

    public final void start(boolean z7, C2090e c2090e) {
        AbstractC2980h.m5136e("taskRunner", c2090e);
        if (z7) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r5 - C2131o.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        c2090e.newQueue().schedule(new C2088c.b(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void writePing() throws IOException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
