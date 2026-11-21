package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p002a1.AbstractC0008a1;
import p111m6.AbstractC1913h;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.concurrent.e */
/* loaded from: classes.dex */
public final class C2090e {
    public static final a Companion = new a(null);
    public static final C2090e INSTANCE = new C2090e(new b(AbstractC2278c.threadFactory(AbstractC2278c.okHttpName + " TaskRunner", true)));
    private static final Logger logger;
    private final InterfaceC2089d backend;
    private final List<C2088c> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName;
    private final List<C2088c> readyQueues;
    private final Runnable runnable;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.concurrent.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public final Logger getLogger() {
            return C2090e.logger;
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.concurrent.e$b */
    public static final class b implements InterfaceC2089d {
        private final ThreadPoolExecutor executor;

        public b(ThreadFactory threadFactory) {
            AbstractC2980h.m5136e("threadFactory", threadFactory);
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.InterfaceC2089d
        public void beforeTask(C2090e c2090e) {
            AbstractC2980h.m5136e("taskRunner", c2090e);
        }

        @Override // okhttp3.internal.concurrent.InterfaceC2089d
        public void coordinatorNotify(C2090e c2090e) {
            AbstractC2980h.m5136e("taskRunner", c2090e);
            c2090e.notify();
        }

        @Override // okhttp3.internal.concurrent.InterfaceC2089d
        public void coordinatorWait(C2090e c2090e, long j) throws InterruptedException {
            AbstractC2980h.m5136e("taskRunner", c2090e);
            long j8 = j / 1000000;
            long j9 = j - (1000000 * j8);
            if (j8 > 0 || j > 0) {
                c2090e.wait(j8, (int) j9);
            }
        }

        @Override // okhttp3.internal.concurrent.InterfaceC2089d
        public void execute(Runnable runnable) {
            AbstractC2980h.m5136e("runnable", runnable);
            this.executor.execute(runnable);
        }

        @Override // okhttp3.internal.concurrent.InterfaceC2089d
        public long nanoTime() {
            return System.nanoTime();
        }

        public final void shutdown() {
            this.executor.shutdown();
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.concurrent.e$c */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2086a abstractC2086aAwaitTaskToRun;
            long jNanoTime;
            while (true) {
                C2090e c2090e = C2090e.this;
                synchronized (c2090e) {
                    abstractC2086aAwaitTaskToRun = c2090e.awaitTaskToRun();
                }
                if (abstractC2086aAwaitTaskToRun == null) {
                    return;
                }
                C2088c queue$okhttp = abstractC2086aAwaitTaskToRun.getQueue$okhttp();
                AbstractC2980h.m5133b(queue$okhttp);
                C2090e c2090e2 = C2090e.this;
                boolean zIsLoggable = C2090e.Companion.getLogger().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                    AbstractC2087b.log(abstractC2086aAwaitTaskToRun, queue$okhttp, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    c2090e2.runTask(abstractC2086aAwaitTaskToRun);
                    if (zIsLoggable) {
                        AbstractC2087b.log(abstractC2086aAwaitTaskToRun, queue$okhttp, "finished run in " + AbstractC2087b.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
                    }
                } finally {
                }
            }
        }
    }

    static {
        Logger logger2 = Logger.getLogger(C2090e.class.getName());
        AbstractC2980h.m5135d("getLogger(TaskRunner::class.java.name)", logger2);
        logger = logger2;
    }

    public C2090e(InterfaceC2089d interfaceC2089d) {
        AbstractC2980h.m5136e("backend", interfaceC2089d);
        this.backend = interfaceC2089d;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new c();
    }

    private final void afterRun(AbstractC2086a abstractC2086a, long j) {
        if (AbstractC2278c.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        C2088c queue$okhttp = abstractC2086a.getQueue$okhttp();
        AbstractC2980h.m5133b(queue$okhttp);
        if (queue$okhttp.getActiveTask$okhttp() != abstractC2086a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean cancelActiveTask$okhttp = queue$okhttp.getCancelActiveTask$okhttp();
        queue$okhttp.setCancelActiveTask$okhttp(false);
        queue$okhttp.setActiveTask$okhttp(null);
        this.busyQueues.remove(queue$okhttp);
        if (j != -1 && !cancelActiveTask$okhttp && !queue$okhttp.getShutdown$okhttp()) {
            queue$okhttp.scheduleAndDecide$okhttp(abstractC2086a, j, true);
        }
        if (queue$okhttp.getFutureTasks$okhttp().isEmpty()) {
            return;
        }
        this.readyQueues.add(queue$okhttp);
    }

    private final void beforeRun(AbstractC2086a abstractC2086a) {
        if (AbstractC2278c.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        abstractC2086a.setNextExecuteNanoTime$okhttp(-1L);
        C2088c queue$okhttp = abstractC2086a.getQueue$okhttp();
        AbstractC2980h.m5133b(queue$okhttp);
        queue$okhttp.getFutureTasks$okhttp().remove(abstractC2086a);
        this.readyQueues.remove(queue$okhttp);
        queue$okhttp.setActiveTask$okhttp(abstractC2086a);
        this.busyQueues.add(queue$okhttp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runTask(AbstractC2086a abstractC2086a) {
        if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC2086a.getName());
        try {
            long jRunOnce = abstractC2086a.runOnce();
            synchronized (this) {
                afterRun(abstractC2086a, jRunOnce);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                afterRun(abstractC2086a, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final List<C2088c> activeQueues() {
        ArrayList arrayListM3743H0;
        synchronized (this) {
            arrayListM3743H0 = AbstractC1913h.m3743H0(this.busyQueues, this.readyQueues);
        }
        return arrayListM3743H0;
    }

    public final AbstractC2086a awaitTaskToRun() {
        boolean z7;
        if (AbstractC2278c.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.readyQueues.isEmpty()) {
            long jNanoTime = this.backend.nanoTime();
            Iterator<C2088c> it = this.readyQueues.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC2086a abstractC2086a = null;
            while (true) {
                if (!it.hasNext()) {
                    z7 = false;
                    break;
                }
                AbstractC2086a abstractC2086a2 = it.next().getFutureTasks$okhttp().get(0);
                long jMax = Math.max(0L, abstractC2086a2.getNextExecuteNanoTime$okhttp() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC2086a != null) {
                        z7 = true;
                        break;
                    }
                    abstractC2086a = abstractC2086a2;
                }
            }
            if (abstractC2086a != null) {
                beforeRun(abstractC2086a);
                if (z7 || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                    this.backend.execute(this.runnable);
                }
                return abstractC2086a;
            }
            if (this.coordinatorWaiting) {
                if (jMin < this.coordinatorWakeUpAt - jNanoTime) {
                    this.backend.coordinatorNotify(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = jNanoTime + jMin;
            try {
                try {
                    this.backend.coordinatorWait(this, jMin);
                } catch (InterruptedException unused) {
                    cancelAll();
                }
            } finally {
                this.coordinatorWaiting = false;
            }
        }
        return null;
    }

    public final void cancelAll() {
        int size = this.busyQueues.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.busyQueues.get(size).cancelAllAndDecide$okhttp();
            }
        }
        for (int size2 = this.readyQueues.size() - 1; -1 < size2; size2--) {
            C2088c c2088c = this.readyQueues.get(size2);
            c2088c.cancelAllAndDecide$okhttp();
            if (c2088c.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    public final InterfaceC2089d getBackend() {
        return this.backend;
    }

    public final void kickCoordinator$okhttp(C2088c c2088c) {
        AbstractC2980h.m5136e("taskQueue", c2088c);
        if (AbstractC2278c.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (c2088c.getActiveTask$okhttp() == null) {
            if (c2088c.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.remove(c2088c);
            } else {
                AbstractC2278c.addIfAbsent(this.readyQueues, c2088c);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.coordinatorNotify(this);
        } else {
            this.backend.execute(this.runnable);
        }
    }

    public final C2088c newQueue() {
        int i;
        synchronized (this) {
            i = this.nextQueueName;
            this.nextQueueName = i + 1;
        }
        return new C2088c(this, AbstractC0008a1.m12h(i, "Q"));
    }
}
