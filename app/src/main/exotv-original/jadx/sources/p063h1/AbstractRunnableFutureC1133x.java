package p063h1;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.x */
/* loaded from: classes.dex */
public abstract class AbstractRunnableFutureC1133x implements RunnableFuture {
    private boolean canceled;
    private Exception exception;
    private Object result;
    private Thread workThread;
    private final C1109e started = new C1109e();
    private final C1109e finished = new C1109e();
    private final Object cancelLock = new Object();

    public final void blockUntilFinished() {
        this.finished.m2404b();
    }

    public final void blockUntilStarted() {
        this.started.m2404b();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        boolean z8;
        synchronized (this.cancelLock) {
            try {
                if (!this.canceled) {
                    C1109e c1109e = this.finished;
                    synchronized (c1109e) {
                        z8 = c1109e.f4731a;
                    }
                    if (!z8) {
                        this.canceled = true;
                        cancelWork();
                        Thread thread = this.workThread;
                        if (thread == null) {
                            this.started.m2405c();
                            this.finished.m2405c();
                        } else if (z7) {
                            thread.interrupt();
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public void cancelWork() {
    }

    public abstract Object doWork();

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        this.finished.m2403a();
        if (this.canceled) {
            throw new CancellationException();
        }
        if (this.exception == null) {
            return this.result;
        }
        throw new ExecutionException(this.exception);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.canceled;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z7;
        C1109e c1109e = this.finished;
        synchronized (c1109e) {
            z7 = c1109e.f4731a;
        }
        return z7;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.cancelLock) {
            try {
                if (this.canceled) {
                    return;
                }
                this.workThread = Thread.currentThread();
                this.started.m2405c();
                try {
                    try {
                        this.result = doWork();
                        synchronized (this.cancelLock) {
                            this.finished.m2405c();
                            this.workThread = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.cancelLock) {
                            this.finished.m2405c();
                            this.workThread = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    this.exception = e;
                    synchronized (this.cancelLock) {
                        this.finished.m2405c();
                        this.workThread = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z7;
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        C1109e c1109e = this.finished;
        synchronized (c1109e) {
            if (jConvert <= 0) {
                z7 = c1109e.f4731a;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j8 = jConvert + jElapsedRealtime;
                if (j8 < jElapsedRealtime) {
                    c1109e.m2403a();
                } else {
                    while (!c1109e.f4731a && jElapsedRealtime < j8) {
                        c1109e.wait(j8 - jElapsedRealtime);
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z7 = c1109e.f4731a;
            }
        }
        if (z7) {
            if (!this.canceled) {
                if (this.exception == null) {
                    return this.result;
                }
                throw new ExecutionException(this.exception);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
