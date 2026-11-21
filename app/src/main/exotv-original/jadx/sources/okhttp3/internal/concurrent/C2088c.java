package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import p002a1.AbstractC0008a1;
import p111m6.AbstractC1913h;
import p147q7.AbstractC2278c;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.concurrent.c */
/* loaded from: classes.dex */
public final class C2088c {
    private AbstractC2086a activeTask;
    private boolean cancelActiveTask;
    private final List<AbstractC2086a> futureTasks;
    private final String name;
    private boolean shutdown;
    private final C2090e taskRunner;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.concurrent.c$a */
    public static final class a extends AbstractC2086a {
        private final CountDownLatch latch;

        public a() {
            super(AbstractC0008a1.m18n(new StringBuilder(), AbstractC2278c.okHttpName, " awaitIdle"), false);
            this.latch = new CountDownLatch(1);
        }

        public final CountDownLatch getLatch() {
            return this.latch;
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() {
            this.latch.countDown();
            return -1L;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.concurrent.c$b */
    public static final class b extends AbstractC2086a {
        final /* synthetic */ InterfaceC2840a $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z7, InterfaceC2840a interfaceC2840a) {
            super(str, z7);
            this.$block = interfaceC2840a;
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() {
            this.$block.invoke();
            return -1L;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.concurrent.c$c */
    public static final class c extends AbstractC2086a {
        final /* synthetic */ InterfaceC2840a $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC2840a interfaceC2840a) {
            super(str, false, 2, null);
            this.$block = interfaceC2840a;
        }

        @Override // okhttp3.internal.concurrent.AbstractC2086a
        public long runOnce() {
            return ((Number) this.$block.invoke()).longValue();
        }
    }

    public C2088c(C2090e c2090e, String str) {
        AbstractC2980h.m5136e("taskRunner", c2090e);
        AbstractC2980h.m5136e("name", str);
        this.taskRunner = c2090e;
        this.name = str;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void execute$default(C2088c c2088c, String str, long j, boolean z7, InterfaceC2840a interfaceC2840a, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            z7 = true;
        }
        AbstractC2980h.m5136e("name", str);
        AbstractC2980h.m5136e("block", interfaceC2840a);
        c2088c.schedule(new b(str, z7, interfaceC2840a), j);
    }

    public static /* synthetic */ void schedule$default(C2088c c2088c, AbstractC2086a abstractC2086a, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c2088c.schedule(abstractC2086a, j);
    }

    public final void cancelAll() {
        if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            if (cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
        }
    }

    public final boolean cancelAllAndDecide$okhttp() {
        AbstractC2086a abstractC2086a = this.activeTask;
        if (abstractC2086a != null) {
            AbstractC2980h.m5133b(abstractC2086a);
            if (abstractC2086a.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z7 = false;
        for (int size = this.futureTasks.size() - 1; -1 < size; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                AbstractC2086a abstractC2086a2 = this.futureTasks.get(size);
                if (C2090e.Companion.getLogger().isLoggable(Level.FINE)) {
                    AbstractC2087b.log(abstractC2086a2, this, "canceled");
                }
                this.futureTasks.remove(size);
                z7 = true;
            }
        }
        return z7;
    }

    public final void execute(String str, long j, boolean z7, InterfaceC2840a interfaceC2840a) {
        AbstractC2980h.m5136e("name", str);
        AbstractC2980h.m5136e("block", interfaceC2840a);
        schedule(new b(str, z7, interfaceC2840a), j);
    }

    public final AbstractC2086a getActiveTask$okhttp() {
        return this.activeTask;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }

    public final List<AbstractC2086a> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    public final String getName$okhttp() {
        return this.name;
    }

    public final List<AbstractC2086a> getScheduledTasks() {
        List<AbstractC2086a> listM3747L0;
        synchronized (this.taskRunner) {
            listM3747L0 = AbstractC1913h.m3747L0(this.futureTasks);
        }
        return listM3747L0;
    }

    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }

    public final C2090e getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    public final CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (this.activeTask == null && this.futureTasks.isEmpty()) {
                return new CountDownLatch(0);
            }
            AbstractC2086a abstractC2086a = this.activeTask;
            if (abstractC2086a instanceof a) {
                return ((a) abstractC2086a).getLatch();
            }
            for (AbstractC2086a abstractC2086a2 : this.futureTasks) {
                if (abstractC2086a2 instanceof a) {
                    return ((a) abstractC2086a2).getLatch();
                }
            }
            a aVar = new a();
            if (scheduleAndDecide$okhttp(aVar, 0L, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            return aVar.getLatch();
        }
    }

    public final void schedule(AbstractC2086a abstractC2086a, long j) {
        AbstractC2980h.m5136e("task", abstractC2086a);
        synchronized (this.taskRunner) {
            if (!this.shutdown) {
                if (scheduleAndDecide$okhttp(abstractC2086a, j, false)) {
                    this.taskRunner.kickCoordinator$okhttp(this);
                }
            } else if (abstractC2086a.getCancelable()) {
                if (C2090e.Companion.getLogger().isLoggable(Level.FINE)) {
                    AbstractC2087b.log(abstractC2086a, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C2090e.Companion.getLogger().isLoggable(Level.FINE)) {
                    AbstractC2087b.log(abstractC2086a, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean scheduleAndDecide$okhttp(AbstractC2086a abstractC2086a, long j, boolean z7) {
        String str;
        AbstractC2980h.m5136e("task", abstractC2086a);
        abstractC2086a.initQueue$okhttp(this);
        long jNanoTime = this.taskRunner.getBackend().nanoTime();
        long j8 = jNanoTime + j;
        int iIndexOf = this.futureTasks.indexOf(abstractC2086a);
        if (iIndexOf != -1) {
            if (abstractC2086a.getNextExecuteNanoTime$okhttp() <= j8) {
                if (C2090e.Companion.getLogger().isLoggable(Level.FINE)) {
                    AbstractC2087b.log(abstractC2086a, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(iIndexOf);
        }
        abstractC2086a.setNextExecuteNanoTime$okhttp(j8);
        if (C2090e.Companion.getLogger().isLoggable(Level.FINE)) {
            if (z7) {
                str = "run again after " + AbstractC2087b.formatDuration(j8 - jNanoTime);
            } else {
                str = "scheduled after " + AbstractC2087b.formatDuration(j8 - jNanoTime);
            }
            AbstractC2087b.log(abstractC2086a, this, str);
        }
        Iterator<AbstractC2086a> it = this.futureTasks.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime$okhttp() - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.futureTasks.size();
        }
        this.futureTasks.add(size, abstractC2086a);
        return size == 0;
    }

    public final void setActiveTask$okhttp(AbstractC2086a abstractC2086a) {
        this.activeTask = abstractC2086a;
    }

    public final void setCancelActiveTask$okhttp(boolean z7) {
        this.cancelActiveTask = z7;
    }

    public final void setShutdown$okhttp(boolean z7) {
        this.shutdown = z7;
    }

    public final void shutdown() {
        if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            this.shutdown = true;
            if (cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
        }
    }

    public String toString() {
        return this.name;
    }

    public static /* synthetic */ void schedule$default(C2088c c2088c, String str, long j, InterfaceC2840a interfaceC2840a, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        AbstractC2980h.m5136e("name", str);
        AbstractC2980h.m5136e("block", interfaceC2840a);
        c2088c.schedule(new c(str, interfaceC2840a), j);
    }

    public final void schedule(String str, long j, InterfaceC2840a interfaceC2840a) {
        AbstractC2980h.m5136e("name", str);
        AbstractC2980h.m5136e("block", interfaceC2840a);
        schedule(new c(str, interfaceC2840a), j);
    }
}
