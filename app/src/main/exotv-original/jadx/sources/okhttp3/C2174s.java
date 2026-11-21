package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.C2095e;
import p002a1.AbstractC0008a1;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1915j;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.s */
/* loaded from: classes.dex */
public final class C2174s {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<C2095e.a> readyAsyncCalls;
    private final ArrayDeque<C2095e.a> runningAsyncCalls;
    private final ArrayDeque<C2095e> runningSyncCalls;

    public C2174s() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final C2095e.a findExistingCallWithHost(String str) {
        Iterator<C2095e.a> it = this.runningAsyncCalls.iterator();
        while (it.hasNext()) {
            C2095e.a next = it.next();
            if (AbstractC2980h.m5132a(next.getHost(), str)) {
                return next;
            }
        }
        Iterator<C2095e.a> it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            C2095e.a next2 = it2.next();
            if (AbstractC2980h.m5132a(next2.getHost(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void finished(Deque<T> deque, T t8) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t8)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.idleCallback;
        }
        if (promoteAndExecute() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean promoteAndExecute() {
        int i;
        boolean z7;
        if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<C2095e.a> it = this.readyAsyncCalls.iterator();
                AbstractC2980h.m5135d("readyAsyncCalls.iterator()", it);
                while (it.hasNext()) {
                    C2095e.a next = it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    }
                    if (next.getCallsPerHost().get() < this.maxRequestsPerHost) {
                        it.remove();
                        next.getCallsPerHost().incrementAndGet();
                        arrayList.add(next);
                        this.runningAsyncCalls.add(next);
                    }
                }
                z7 = runningCallsCount() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C2095e.a) arrayList.get(i)).executeOn(executorService());
        }
        return z7;
    }

    /* renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m5254deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        try {
            Iterator<C2095e.a> it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                it.next().getCall().cancel();
            }
            Iterator<C2095e.a> it2 = this.runningAsyncCalls.iterator();
            while (it2.hasNext()) {
                it2.next().getCall().cancel();
            }
            Iterator<C2095e> it3 = this.runningSyncCalls.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void enqueue$okhttp(C2095e.a aVar) {
        C2095e.a aVarFindExistingCallWithHost;
        AbstractC2980h.m5136e("call", aVar);
        synchronized (this) {
            this.readyAsyncCalls.add(aVar);
            if (!aVar.getCall().getForWebSocket() && (aVarFindExistingCallWithHost = findExistingCallWithHost(aVar.getHost())) != null) {
                aVar.reuseCallsPerHostFrom(aVarFindExistingCallWithHost);
            }
        }
        promoteAndExecute();
    }

    public final synchronized void executed$okhttp(C2095e c2095e) {
        AbstractC2980h.m5136e("call", c2095e);
        this.runningSyncCalls.add(c2095e);
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        try {
            if (this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC2278c.threadFactory(AbstractC2278c.okHttpName + " Dispatcher", false));
            }
            executorService = this.executorServiceOrNull;
            AbstractC2980h.m5133b(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void finished$okhttp(C2095e.a aVar) {
        AbstractC2980h.m5136e("call", aVar);
        aVar.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, aVar);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List<InterfaceC2075g> queuedCalls() {
        List<InterfaceC2075g> listUnmodifiableList;
        try {
            ArrayDeque<C2095e.a> arrayDeque = this.readyAsyncCalls;
            ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(arrayDeque));
            Iterator<T> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2095e.a) it.next()).getCall());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC2980h.m5135d("unmodifiableList(readyAsyncCalls.map { it.call })", listUnmodifiableList);
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized List<InterfaceC2075g> runningCalls() {
        List<InterfaceC2075g> listUnmodifiableList;
        try {
            ArrayDeque<C2095e> arrayDeque = this.runningSyncCalls;
            ArrayDeque<C2095e.a> arrayDeque2 = this.runningAsyncCalls;
            ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(arrayDeque2));
            Iterator<T> it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2095e.a) it.next()).getCall());
            }
            listUnmodifiableList = Collections.unmodifiableList(AbstractC1913h.m3743H0(arrayDeque, arrayList));
            AbstractC2980h.m5135d("unmodifiableList(running\u2026yncCalls.map { it.call })", listUnmodifiableList);
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "max < 1: ").toString());
        }
        synchronized (this) {
            this.maxRequests = i;
        }
        promoteAndExecute();
    }

    public final void setMaxRequestsPerHost(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "max < 1: ").toString());
        }
        synchronized (this) {
            this.maxRequestsPerHost = i;
        }
        promoteAndExecute();
    }

    public final void finished$okhttp(C2095e c2095e) {
        AbstractC2980h.m5136e("call", c2095e);
        finished(this.runningSyncCalls, c2095e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2174s(ExecutorService executorService) {
        this();
        AbstractC2980h.m5136e("executorService", executorService);
        this.executorServiceOrNull = executorService;
    }
}
