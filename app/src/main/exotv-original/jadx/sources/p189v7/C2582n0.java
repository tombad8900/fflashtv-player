package p189v7;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import p002a1.AbstractC0008a1;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.n0 */
/* loaded from: classes.dex */
public class C2582n0 {
    public static final C2580m0 Companion = new C2580m0();
    public static final C2582n0 NONE = new C2578l0();
    private volatile Object cancelMark;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public void awaitSignal(Condition condition) throws InterruptedException, InterruptedIOException {
        AbstractC2980h.m5136e("condition", condition);
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            if (!zHasDeadline && jTimeoutNanos == 0) {
                condition.await();
                return;
            }
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - System.nanoTime());
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - System.nanoTime();
            }
            if (jTimeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.cancelMark;
            if (condition.awaitNanos(jTimeoutNanos) <= 0 && this.cancelMark == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void cancel() {
        this.cancelMark = new Object();
    }

    public C2582n0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public C2582n0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final C2582n0 deadline(long j, TimeUnit timeUnit) {
        AbstractC2980h.m5136e("unit", timeUnit);
        if (j <= 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("duration <= 0: ", j).toString());
        }
        return deadlineNanoTime(timeUnit.toNanos(j) + System.nanoTime());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(C2582n0 c2582n0, InterfaceC2840a interfaceC2840a) {
        AbstractC2980h.m5136e("other", c2582n0);
        AbstractC2980h.m5136e("block", interfaceC2840a);
        long jTimeoutNanos = timeoutNanos();
        C2580m0 c2580m0 = Companion;
        long jTimeoutNanos2 = c2582n0.timeoutNanos();
        long jTimeoutNanos3 = timeoutNanos();
        c2580m0.getClass();
        if (jTimeoutNanos2 == 0 || (jTimeoutNanos3 != 0 && jTimeoutNanos2 >= jTimeoutNanos3)) {
            jTimeoutNanos2 = jTimeoutNanos3;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(jTimeoutNanos2, timeUnit);
        if (!hasDeadline()) {
            if (c2582n0.hasDeadline()) {
                deadlineNanoTime(c2582n0.deadlineNanoTime());
            }
            try {
                T t8 = (T) interfaceC2840a.invoke();
                timeout(jTimeoutNanos, timeUnit);
                if (c2582n0.hasDeadline()) {
                    clearDeadline();
                }
                return t8;
            } catch (Throwable th) {
                timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (c2582n0.hasDeadline()) {
                    clearDeadline();
                }
                throw th;
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (c2582n0.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), c2582n0.deadlineNanoTime()));
        }
        try {
            T t9 = (T) interfaceC2840a.invoke();
            timeout(jTimeoutNanos, timeUnit);
            if (c2582n0.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            return t9;
        } catch (Throwable th2) {
            timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (c2582n0.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            throw th2;
        }
    }

    public void throwIfReached() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C2582n0 timeout(long j, TimeUnit timeUnit) {
        AbstractC2980h.m5136e("unit", timeUnit);
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m15k("timeout < 0: ", j).toString());
        }
        this.timeoutNanos = timeUnit.toNanos(j);
        return this;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public void waitUntilNotified(Object obj) throws InterruptedException, InterruptedIOException {
        AbstractC2980h.m5136e("monitor", obj);
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            if (!zHasDeadline && jTimeoutNanos == 0) {
                obj.wait();
                return;
            }
            long jNanoTime = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime;
            }
            if (jTimeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj2 = this.cancelMark;
            long j = jTimeoutNanos / 1000000;
            obj.wait(j, (int) (jTimeoutNanos - (1000000 * j)));
            if (System.nanoTime() - jNanoTime >= jTimeoutNanos && this.cancelMark == obj2) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public C2582n0 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
