package p127o7;

import androidx.media3.exoplayer.Renderer;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import p002a1.AbstractC0008a1;
import p002a1.C0048u;
import p076i7.AbstractC1339x;
import p112m7.C1940p;
import p112m7.C1943s;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o7.c */
/* loaded from: classes.dex */
public final class ExecutorC2052c implements Executor, Closeable {

    /* renamed from: q */
    public static final /* synthetic */ AtomicLongFieldUpdater f7587q = AtomicLongFieldUpdater.newUpdater(ExecutorC2052c.class, "parkedWorkersStack$volatile");

    /* renamed from: r */
    public static final /* synthetic */ AtomicLongFieldUpdater f7588r = AtomicLongFieldUpdater.newUpdater(ExecutorC2052c.class, "controlState$volatile");

    /* renamed from: s */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7589s = AtomicIntegerFieldUpdater.newUpdater(ExecutorC2052c.class, "_isTerminated$volatile");

    /* renamed from: t */
    public static final C1943s f7590t = new C1943s("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: j */
    public final int f7591j;

    /* renamed from: k */
    public final int f7592k;

    /* renamed from: l */
    public final long f7593l;

    /* renamed from: m */
    public final String f7594m;

    /* renamed from: n */
    public final C2055f f7595n;

    /* renamed from: o */
    public final C2055f f7596o;

    /* renamed from: p */
    public final C1940p f7597p;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public ExecutorC2052c(int i, int i4, long j, String str) {
        this.f7591j = i;
        this.f7592k = i4;
        this.f7593l = j;
        this.f7594m = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0008a1.m14j("Core pool size ", i, " should be at least 1").toString());
        }
        if (i4 < i) {
            throw new IllegalArgumentException(AbstractC0008a1.m11g(i4, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(AbstractC0008a1.m14j("Max pool size ", i4, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f7595n = new C2055f();
        this.f7596o = new C2055f();
        this.f7597p = new C1940p((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    /* renamed from: b */
    public final int m3950b() {
        synchronized (this.f7597p) {
            try {
                if (f7589s.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f7588r;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i4 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f7591j) {
                    return 0;
                }
                if (i >= this.f7592k) {
                    return 0;
                }
                int i8 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i8 <= 0 || this.f7597p.m3791b(i8) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C2050a c2050a = new C2050a(this, i8);
                this.f7597p.m3792c(i8, c2050a);
                if (i8 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i9 = i4 + 1;
                c2050a.start();
                return i9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m3951c(Runnable runnable, boolean z7) {
        AbstractRunnableC2058i c2059j;
        EnumC2051b enumC2051b;
        AbstractC2060k.f7611f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC2058i) {
            c2059j = (AbstractRunnableC2058i) runnable;
            c2059j.f7603j = jNanoTime;
            c2059j.f7604k = z7;
        } else {
            c2059j = new C2059j(runnable, jNanoTime, z7);
        }
        boolean z8 = c2059j.f7604k;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7588r;
        long jAddAndGet = z8 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C2050a c2050a = threadCurrentThread instanceof C2050a ? (C2050a) threadCurrentThread : null;
        if (c2050a == null || !AbstractC2980h.m5132a(c2050a.f7580q, this)) {
            c2050a = null;
        }
        if (c2050a != null && (enumC2051b = c2050a.f7575l) != EnumC2051b.f7585n && (c2059j.f7604k || enumC2051b != EnumC2051b.f7582k)) {
            c2050a.f7579p = true;
            C2062m c2062m = c2050a.f7573j;
            c2062m.getClass();
            c2059j = (AbstractRunnableC2058i) C2062m.f7613b.getAndSet(c2062m, c2059j);
            if (c2059j == null) {
                c2059j = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = c2062m.f7617a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C2062m.f7614c;
                if (atomicIntegerFieldUpdater.get(c2062m) - C2062m.f7615d.get(c2062m) != 127) {
                    if (c2059j.f7604k) {
                        C2062m.f7616e.incrementAndGet(c2062m);
                    }
                    int i = atomicIntegerFieldUpdater.get(c2062m) & 127;
                    while (atomicReferenceArray.get(i) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i, c2059j);
                    atomicIntegerFieldUpdater.incrementAndGet(c2062m);
                    c2059j = null;
                }
            }
        }
        if (c2059j != null) {
            if (!(c2059j.f7604k ? this.f7596o.m3782a(c2059j) : this.f7595n.m3782a(c2059j))) {
                throw new RejectedExecutionException(AbstractC0008a1.m18n(new StringBuilder(), this.f7594m, " was terminated"));
            }
        }
        if (z8) {
            if (m3954p() || m3953k(jAddAndGet)) {
                return;
            }
            m3954p();
            return;
        }
        if (m3954p() || m3953k(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m3954p();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC2058i abstractRunnableC2058iM3941a;
        if (f7589s.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C2050a c2050a = threadCurrentThread instanceof C2050a ? (C2050a) threadCurrentThread : null;
            if (c2050a == null || !AbstractC2980h.m5132a(c2050a.f7580q, this)) {
                c2050a = null;
            }
            synchronized (this.f7597p) {
                i = (int) (f7588r.get(this) & 2097151);
            }
            if (1 <= i) {
                int i4 = 1;
                while (true) {
                    Object objM3791b = this.f7597p.m3791b(i4);
                    AbstractC2980h.m5133b(objM3791b);
                    C2050a c2050a2 = (C2050a) objM3791b;
                    if (c2050a2 != c2050a) {
                        while (c2050a2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c2050a2);
                            c2050a2.join(Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
                        }
                        C2062m c2062m = c2050a2.f7573j;
                        C2055f c2055f = this.f7596o;
                        c2062m.getClass();
                        AbstractRunnableC2058i abstractRunnableC2058i = (AbstractRunnableC2058i) C2062m.f7613b.getAndSet(c2062m, null);
                        if (abstractRunnableC2058i != null) {
                            c2055f.m3782a(abstractRunnableC2058i);
                        }
                        while (true) {
                            AbstractRunnableC2058i abstractRunnableC2058iM3955a = c2062m.m3955a();
                            if (abstractRunnableC2058iM3955a == null) {
                                break;
                            } else {
                                c2055f.m3782a(abstractRunnableC2058iM3955a);
                            }
                        }
                    }
                    if (i4 == i) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.f7596o.m3783b();
            this.f7595n.m3783b();
            while (true) {
                if (c2050a == null) {
                    abstractRunnableC2058iM3941a = (AbstractRunnableC2058i) this.f7595n.m3785d();
                    if (abstractRunnableC2058iM3941a == null && (abstractRunnableC2058iM3941a = (AbstractRunnableC2058i) this.f7596o.m3785d()) == null) {
                        break;
                    }
                } else {
                    abstractRunnableC2058iM3941a = c2050a.m3941a(true);
                    if (abstractRunnableC2058iM3941a == null) {
                    }
                }
                try {
                    abstractRunnableC2058iM3941a.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c2050a != null) {
                c2050a.m3948h(EnumC2051b.f7585n);
            }
            f7587q.set(this, 0L);
            f7588r.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m3951c(runnable, false);
    }

    /* renamed from: g */
    public final void m3952g(C2050a c2050a, int i, int i4) {
        while (true) {
            long j = f7587q.get(this);
            int i8 = (int) (2097151 & j);
            long j8 = (2097152 + j) & (-2097152);
            if (i8 == i) {
                if (i4 == 0) {
                    Object objM3943c = c2050a.m3943c();
                    while (true) {
                        if (objM3943c == f7590t) {
                            i8 = -1;
                            break;
                        }
                        if (objM3943c == null) {
                            i8 = 0;
                            break;
                        }
                        C2050a c2050a2 = (C2050a) objM3943c;
                        int iM3942b = c2050a2.m3942b();
                        if (iM3942b != 0) {
                            i8 = iM3942b;
                            break;
                        }
                        objM3943c = c2050a2.m3943c();
                    }
                } else {
                    i8 = i4;
                }
            }
            if (i8 >= 0) {
                if (f7587q.compareAndSet(this, j, i8 | j8)) {
                    return;
                }
            }
        }
    }

    /* renamed from: k */
    public final boolean m3953k(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i4 = this.f7591j;
        if (i < i4) {
            int iM3950b = m3950b();
            if (iM3950b == 1 && i4 > 1) {
                m3950b();
            }
            if (iM3950b > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m3954p() {
        C1943s c1943s;
        int iM3942b;
        while (true) {
            long j = f7587q.get(this);
            C2050a c2050a = (C2050a) this.f7597p.m3791b((int) (2097151 & j));
            if (c2050a == null) {
                c2050a = null;
            } else {
                long j8 = (2097152 + j) & (-2097152);
                Object objM3943c = c2050a.m3943c();
                while (true) {
                    c1943s = f7590t;
                    if (objM3943c == c1943s) {
                        iM3942b = -1;
                        break;
                    }
                    if (objM3943c == null) {
                        iM3942b = 0;
                        break;
                    }
                    C2050a c2050a2 = (C2050a) objM3943c;
                    iM3942b = c2050a2.m3942b();
                    if (iM3942b != 0) {
                        break;
                    }
                    objM3943c = c2050a2.m3943c();
                }
                if (iM3942b >= 0) {
                    if (f7587q.compareAndSet(this, j, iM3942b | j8)) {
                        c2050a.m3947g(c1943s);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c2050a == null) {
                return false;
            }
            if (C2050a.f7572r.compareAndSet(c2050a, -1, 0)) {
                LockSupport.unpark(c2050a);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C1940p c1940p = this.f7597p;
        int iM3790a = c1940p.m3790a();
        int i = 0;
        int i4 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 1; i11 < iM3790a; i11++) {
            C2050a c2050a = (C2050a) c1940p.m3791b(i11);
            if (c2050a != null) {
                C2062m c2062m = c2050a.f7573j;
                c2062m.getClass();
                int i12 = C2062m.f7613b.get(c2062m) != null ? (C2062m.f7614c.get(c2062m) - C2062m.f7615d.get(c2062m)) + 1 : C2062m.f7614c.get(c2062m) - C2062m.f7615d.get(c2062m);
                int iOrdinal = c2050a.f7575l.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i12);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i8++;
                } else if (iOrdinal == 3) {
                    i9++;
                    if (i12 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i12);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new C0048u();
                    }
                    i10++;
                }
            }
        }
        long j = f7588r.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f7594m);
        sb4.append('@');
        sb4.append(AbstractC1339x.m2845f(this));
        sb4.append("[Pool Size {core = ");
        int i13 = this.f7591j;
        sb4.append(i13);
        sb4.append(", max = ");
        sb4.append(this.f7592k);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i4);
        sb4.append(", parked = ");
        sb4.append(i8);
        sb4.append(", dormant = ");
        sb4.append(i9);
        sb4.append(", terminated = ");
        sb4.append(i10);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f7595n.m3784c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f7596o.m3784c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i13 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
