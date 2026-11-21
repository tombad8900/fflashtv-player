package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.C2063a;
import okhttp3.C2162k0;
import okhttp3.C2165m;
import okhttp3.internal.concurrent.AbstractC2086a;
import okhttp3.internal.concurrent.C2088c;
import okhttp3.internal.concurrent.C2090e;
import okhttp3.internal.connection.C2095e;
import p002a1.AbstractC0008a1;
import p147q7.AbstractC2278c;
import p164s7.C2385h;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.connection.h */
/* loaded from: classes.dex */
public final class C2098h {
    public static final a Companion = new a(null);
    private final C2088c cleanupQueue;
    private final b cleanupTask;
    private final ConcurrentLinkedQueue<C2096f> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.connection.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public final C2098h get(C2165m c2165m) {
            AbstractC2980h.m5136e("connectionPool", c2165m);
            return c2165m.getDelegate$okhttp();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.connection.h$b */
    public static final class b extends AbstractC2086a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() {
            return C2098h.this.cleanup(System.nanoTime());
        }
    }

    public C2098h(C2090e c2090e, int i, long j, TimeUnit timeUnit) {
        AbstractC2980h.m5136e("taskRunner", c2090e);
        AbstractC2980h.m5136e("timeUnit", timeUnit);
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        this.cleanupQueue = c2090e.newQueue();
        this.cleanupTask = new b(AbstractC0008a1.m18n(new StringBuilder(), AbstractC2278c.okHttpName, " ConnectionPool"));
        this.connections = new ConcurrentLinkedQueue<>();
        if (j <= 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("keepAliveDuration <= 0: ", j).toString());
        }
    }

    private final int pruneAndGetAllocationCount(C2096f c2096f, long j) {
        if (AbstractC2278c.assertionsEnabled && !Thread.holdsLock(c2096f)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c2096f);
        }
        List<Reference<C2095e>> calls = c2096f.getCalls();
        int i = 0;
        while (i < calls.size()) {
            Reference<C2095e> reference = calls.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C2385h.Companion.get().logCloseableLeak("A connection to " + c2096f.route().address().url() + " was leaked. Did you forget to close a response body?", ((C2095e.b) reference).getCallStackTrace());
                calls.remove(i);
                c2096f.setNoNewExchanges(true);
                if (calls.isEmpty()) {
                    c2096f.setIdleAtNs$okhttp(j - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return calls.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean callAcquirePooledConnection(C2063a c2063a, C2095e c2095e, List<C2162k0> list, boolean z7) {
        AbstractC2980h.m5136e("address", c2063a);
        AbstractC2980h.m5136e("call", c2095e);
        Iterator<C2096f> it = this.connections.iterator();
        while (it.hasNext()) {
            C2096f next = it.next();
            AbstractC2980h.m5135d("connection", next);
            synchronized (next) {
                if (z7) {
                    try {
                        if (!next.isMultiplexed$okhttp()) {
                            continue;
                        } else if (!next.isEligible$okhttp(c2063a, list)) {
                            c2095e.acquireConnectionNoEvents(next);
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (!next.isEligible$okhttp(c2063a, list)) {
                }
            }
        }
        return false;
    }

    public final long cleanup(long j) throws IOException {
        Iterator<C2096f> it = this.connections.iterator();
        int i = 0;
        long j8 = Long.MIN_VALUE;
        C2096f c2096f = null;
        int i4 = 0;
        while (it.hasNext()) {
            C2096f next = it.next();
            AbstractC2980h.m5135d("connection", next);
            synchronized (next) {
                if (pruneAndGetAllocationCount(next, j) > 0) {
                    i4++;
                } else {
                    i++;
                    long idleAtNs$okhttp = j - next.getIdleAtNs$okhttp();
                    if (idleAtNs$okhttp > j8) {
                        c2096f = next;
                        j8 = idleAtNs$okhttp;
                    }
                }
            }
        }
        long j9 = this.keepAliveDurationNs;
        if (j8 < j9 && i <= this.maxIdleConnections) {
            if (i > 0) {
                return j9 - j8;
            }
            if (i4 > 0) {
                return j9;
            }
            return -1L;
        }
        AbstractC2980h.m5133b(c2096f);
        synchronized (c2096f) {
            if (!c2096f.getCalls().isEmpty()) {
                return 0L;
            }
            if (c2096f.getIdleAtNs$okhttp() + j8 != j) {
                return 0L;
            }
            c2096f.setNoNewExchanges(true);
            this.connections.remove(c2096f);
            AbstractC2278c.closeQuietly(c2096f.socket());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.cancelAll();
            }
            return 0L;
        }
    }

    public final boolean connectionBecameIdle(C2096f c2096f) {
        AbstractC2980h.m5136e("connection", c2096f);
        if (AbstractC2278c.assertionsEnabled && !Thread.holdsLock(c2096f)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c2096f);
        }
        if (!c2096f.getNoNewExchanges() && this.maxIdleConnections != 0) {
            C2088c.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        c2096f.setNoNewExchanges(true);
        this.connections.remove(c2096f);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
        return true;
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    public final void evictAll() {
        Socket socket;
        Iterator<C2096f> it = this.connections.iterator();
        AbstractC2980h.m5135d("connections.iterator()", it);
        while (it.hasNext()) {
            C2096f next = it.next();
            AbstractC2980h.m5135d("connection", next);
            synchronized (next) {
                if (next.getCalls().isEmpty()) {
                    it.remove();
                    next.setNoNewExchanges(true);
                    socket = next.socket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                AbstractC2278c.closeQuietly(socket);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }

    public final int idleConnectionCount() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue<C2096f> concurrentLinkedQueue = this.connections;
        int i = 0;
        if (concurrentLinkedQueue != null && concurrentLinkedQueue.isEmpty()) {
            return 0;
        }
        for (C2096f c2096f : concurrentLinkedQueue) {
            AbstractC2980h.m5135d("it", c2096f);
            synchronized (c2096f) {
                zIsEmpty = c2096f.getCalls().isEmpty();
            }
            if (zIsEmpty && (i = i + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    public final void put(C2096f c2096f) {
        AbstractC2980h.m5136e("connection", c2096f);
        if (!AbstractC2278c.assertionsEnabled || Thread.holdsLock(c2096f)) {
            this.connections.add(c2096f);
            C2088c.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c2096f);
        }
    }
}
