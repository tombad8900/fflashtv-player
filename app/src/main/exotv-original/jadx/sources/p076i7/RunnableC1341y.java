package p076i7;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p137p6.InterfaceC2227h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.y */
/* loaded from: classes.dex */
public final class RunnableC1341y extends AbstractC1311l0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: r */
    public static final RunnableC1341y f5386r;

    /* renamed from: s */
    public static final long f5387s;

    static {
        Long l8;
        RunnableC1341y runnableC1341y = new RunnableC1341y();
        f5386r = runnableC1341y;
        runnableC1341y.m2832I(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l8 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l8 = 1000L;
        }
        f5387s = timeUnit.toNanos(l8.longValue());
    }

    @Override // p076i7.AbstractC1314m0
    /* renamed from: H */
    public final Thread mo2781H() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f5386r.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p076i7.AbstractC1314m0
    /* renamed from: K */
    public final void mo2834K(long j, AbstractRunnableC1305j0 abstractRunnableC1305j0) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p076i7.AbstractC1311l0
    /* renamed from: L */
    public final void mo2823L(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo2823L(runnable);
    }

    /* renamed from: R */
    public final synchronized void m2859R() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC1311l0.f5341o.set(this, null);
            AbstractC1311l0.f5342p.set(this, null);
            notifyAll();
        }
    }

    @Override // p076i7.AbstractC1311l0, p076i7.InterfaceC1281b0
    /* renamed from: k */
    public final InterfaceC1293f0 mo2777k(long j, RunnableC1309k1 runnableC1309k1, InterfaceC2227h interfaceC2227h) {
        long j8 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j8 >= 4611686018427387903L) {
            return C1285c1.f5312j;
        }
        long jNanoTime = System.nanoTime();
        C1302i0 c1302i0 = new C1302i0(j8 + jNanoTime, runnableC1309k1);
        m2828Q(jNanoTime, c1302i0);
        return c1302i0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM2826O;
        AbstractC1300h1.f5328a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM2826O) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM2827P = m2827P();
                    if (jM2827P == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f5387s + jNanoTime;
                        }
                        long j8 = j - jNanoTime;
                        if (j8 <= 0) {
                            _thread = null;
                            m2859R();
                            if (m2826O()) {
                                return;
                            }
                            mo2781H();
                            return;
                        }
                        if (jM2827P > j8) {
                            jM2827P = j8;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM2827P > 0) {
                        int i4 = debugStatus;
                        if (i4 == 2 || i4 == 3) {
                            _thread = null;
                            m2859R();
                            if (m2826O()) {
                                return;
                            }
                            mo2781H();
                            return;
                        }
                        LockSupport.parkNanos(this, jM2827P);
                    }
                }
            }
        } finally {
            _thread = null;
            m2859R();
            if (!m2826O()) {
                mo2781H();
            }
        }
    }

    @Override // p076i7.AbstractC1311l0, p076i7.AbstractC1314m0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p076i7.AbstractC1327r
    public final String toString() {
        return "DefaultExecutor";
    }
}
