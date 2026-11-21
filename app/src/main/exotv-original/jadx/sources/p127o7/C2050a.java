package p127o7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p112m7.C1943s;
import p220z6.AbstractC2980h;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o7.a */
/* loaded from: classes.dex */
public final class C2050a extends Thread {

    /* renamed from: r */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7572r = AtomicIntegerFieldUpdater.newUpdater(C2050a.class, "workerCtl$volatile");
    private volatile int indexInArray;

    /* renamed from: j */
    public final C2062m f7573j;

    /* renamed from: k */
    public final C2986n f7574k;

    /* renamed from: l */
    public EnumC2051b f7575l;

    /* renamed from: m */
    public long f7576m;

    /* renamed from: n */
    public long f7577n;
    private volatile Object nextParkedWorker;

    /* renamed from: o */
    public int f7578o;

    /* renamed from: p */
    public boolean f7579p;

    /* renamed from: q */
    public final /* synthetic */ ExecutorC2052c f7580q;
    private volatile /* synthetic */ int workerCtl$volatile;

    public C2050a(ExecutorC2052c executorC2052c, int i) {
        this.f7580q = executorC2052c;
        setDaemon(true);
        setContextClassLoader(ExecutorC2052c.class.getClassLoader());
        this.f7573j = new C2062m();
        this.f7574k = new C2986n();
        this.f7575l = EnumC2051b.f7584m;
        this.nextParkedWorker = ExecutorC2052c.f7590t;
        int iNanoTime = (int) System.nanoTime();
        this.f7578o = iNanoTime == 0 ? 42 : iNanoTime;
        m3946f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = p127o7.C2062m.f7615d.get(r10);
        r0 = p127o7.C2062m.f7614c.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (p127o7.C2062m.f7616e.get(r10) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r10.m3956b(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r8 = r1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC2058i m3941a(boolean z7) {
        AbstractRunnableC2058i abstractRunnableC2058iM3945e;
        AbstractRunnableC2058i abstractRunnableC2058iM3945e2;
        long j;
        EnumC2051b enumC2051b = this.f7575l;
        EnumC2051b enumC2051b2 = EnumC2051b.f7581j;
        ExecutorC2052c executorC2052c = this.f7580q;
        AbstractRunnableC2058i abstractRunnableC2058i = null;
        C2062m c2062m = this.f7573j;
        if (enumC2051b != enumC2051b2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC2052c.f7588r;
            do {
                j = atomicLongFieldUpdater.get(executorC2052c);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    c2062m.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2062m.f7613b;
                        AbstractRunnableC2058i abstractRunnableC2058i2 = (AbstractRunnableC2058i) atomicReferenceFieldUpdater.get(c2062m);
                        if (abstractRunnableC2058i2 == null || !abstractRunnableC2058i2.f7604k) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(c2062m, abstractRunnableC2058i2, null)) {
                            if (atomicReferenceFieldUpdater.get(c2062m) != abstractRunnableC2058i2) {
                                break;
                            }
                        }
                        abstractRunnableC2058i = abstractRunnableC2058i2;
                        break loop1;
                    }
                    if (abstractRunnableC2058i != null) {
                        return abstractRunnableC2058i;
                    }
                    AbstractRunnableC2058i abstractRunnableC2058i3 = (AbstractRunnableC2058i) executorC2052c.f7596o.m3785d();
                    return abstractRunnableC2058i3 == null ? m3949i(1) : abstractRunnableC2058i3;
                }
            } while (!ExecutorC2052c.f7588r.compareAndSet(executorC2052c, j, j - 4398046511104L));
            this.f7575l = EnumC2051b.f7581j;
        }
        if (z7) {
            boolean z8 = m3944d(executorC2052c.f7591j * 2) == 0;
            if (z8 && (abstractRunnableC2058iM3945e2 = m3945e()) != null) {
                return abstractRunnableC2058iM3945e2;
            }
            c2062m.getClass();
            AbstractRunnableC2058i abstractRunnableC2058iM3955a = (AbstractRunnableC2058i) C2062m.f7613b.getAndSet(c2062m, null);
            if (abstractRunnableC2058iM3955a == null) {
                abstractRunnableC2058iM3955a = c2062m.m3955a();
            }
            if (abstractRunnableC2058iM3955a != null) {
                return abstractRunnableC2058iM3955a;
            }
            if (!z8 && (abstractRunnableC2058iM3945e = m3945e()) != null) {
                return abstractRunnableC2058iM3945e;
            }
        } else {
            AbstractRunnableC2058i abstractRunnableC2058iM3945e3 = m3945e();
            if (abstractRunnableC2058iM3945e3 != null) {
                return abstractRunnableC2058iM3945e3;
            }
        }
        return m3949i(3);
    }

    /* renamed from: b */
    public final int m3942b() {
        return this.indexInArray;
    }

    /* renamed from: c */
    public final Object m3943c() {
        return this.nextParkedWorker;
    }

    /* renamed from: d */
    public final int m3944d(int i) {
        int i4 = this.f7578o;
        int i8 = i4 ^ (i4 << 13);
        int i9 = i8 ^ (i8 >> 17);
        int i10 = i9 ^ (i9 << 5);
        this.f7578o = i10;
        int i11 = i - 1;
        return (i11 & i) == 0 ? i10 & i11 : (i10 & Integer.MAX_VALUE) % i;
    }

    /* renamed from: e */
    public final AbstractRunnableC2058i m3945e() {
        int iM3944d = m3944d(2);
        ExecutorC2052c executorC2052c = this.f7580q;
        if (iM3944d == 0) {
            AbstractRunnableC2058i abstractRunnableC2058i = (AbstractRunnableC2058i) executorC2052c.f7595n.m3785d();
            return abstractRunnableC2058i != null ? abstractRunnableC2058i : (AbstractRunnableC2058i) executorC2052c.f7596o.m3785d();
        }
        AbstractRunnableC2058i abstractRunnableC2058i2 = (AbstractRunnableC2058i) executorC2052c.f7596o.m3785d();
        return abstractRunnableC2058i2 != null ? abstractRunnableC2058i2 : (AbstractRunnableC2058i) executorC2052c.f7595n.m3785d();
    }

    /* renamed from: f */
    public final void m3946f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7580q.f7594m);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* renamed from: g */
    public final void m3947g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* renamed from: h */
    public final boolean m3948h(EnumC2051b enumC2051b) {
        EnumC2051b enumC2051b2 = this.f7575l;
        boolean z7 = enumC2051b2 == EnumC2051b.f7581j;
        if (z7) {
            ExecutorC2052c.f7588r.addAndGet(this.f7580q, 4398046511104L);
        }
        if (enumC2051b2 != enumC2051b) {
            this.f7575l = enumC2051b;
        }
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC2058i m3949i(int i) {
        long j;
        AbstractRunnableC2058i abstractRunnableC2058iM3956b;
        long j8;
        long j9;
        AbstractRunnableC2058i abstractRunnableC2058i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC2052c.f7588r;
        ExecutorC2052c executorC2052c = this.f7580q;
        int i4 = (int) (atomicLongFieldUpdater.get(executorC2052c) & 2097151);
        AbstractRunnableC2058i abstractRunnableC2058i2 = null;
        if (i4 < 2) {
            return null;
        }
        int iM3944d = m3944d(i4);
        int i8 = 0;
        long jMin = Long.MAX_VALUE;
        while (i8 < i4) {
            iM3944d++;
            if (iM3944d > i4) {
                iM3944d = 1;
            }
            C2050a c2050a = (C2050a) executorC2052c.f7597p.m3791b(iM3944d);
            if (c2050a != null && c2050a != this) {
                C2062m c2062m = c2050a.f7573j;
                if (i != 3) {
                    c2062m.getClass();
                    int i9 = C2062m.f7615d.get(c2062m);
                    int i10 = C2062m.f7614c.get(c2062m);
                    boolean z7 = i == 1;
                    while (true) {
                        if (i9 == i10) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z7 || C2062m.f7616e.get(c2062m) != 0) {
                            int i11 = i9 + 1;
                            abstractRunnableC2058iM3956b = c2062m.m3956b(i9, z7);
                            if (abstractRunnableC2058iM3956b != null) {
                                break;
                            }
                            i9 = i11;
                        } else {
                            break;
                        }
                    }
                } else {
                    abstractRunnableC2058iM3956b = c2062m.m3955a();
                    j = 0;
                }
                C2986n c2986n = this.f7574k;
                if (abstractRunnableC2058iM3956b != null) {
                    c2986n.f11117j = abstractRunnableC2058iM3956b;
                    abstractRunnableC2058i = abstractRunnableC2058i2;
                    j9 = -1;
                    j8 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2062m.f7613b;
                        AbstractRunnableC2058i abstractRunnableC2058i3 = (AbstractRunnableC2058i) atomicReferenceFieldUpdater.get(c2062m);
                        if (abstractRunnableC2058i3 == null) {
                            j8 = -1;
                            break;
                        }
                        j8 = -1;
                        if (((abstractRunnableC2058i3.f7604k ? 1 : 2) & i) == 0) {
                            break;
                        }
                        AbstractC2060k.f7611f.getClass();
                        C2062m c2062m2 = c2062m;
                        long jNanoTime = System.nanoTime() - abstractRunnableC2058i3.f7603j;
                        long j10 = AbstractC2060k.f7607b;
                        if (jNanoTime < j10) {
                            j9 = j10 - jNanoTime;
                            abstractRunnableC2058i = null;
                            break;
                        }
                        do {
                            abstractRunnableC2058i = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(c2062m2, abstractRunnableC2058i3, null)) {
                                c2986n.f11117j = abstractRunnableC2058i3;
                                j9 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(c2062m2) == abstractRunnableC2058i3);
                        c2062m = c2062m2;
                        abstractRunnableC2058i2 = null;
                    }
                }
                if (j9 == j8) {
                    AbstractRunnableC2058i abstractRunnableC2058i4 = (AbstractRunnableC2058i) c2986n.f11117j;
                    c2986n.f11117j = abstractRunnableC2058i;
                    return abstractRunnableC2058i4;
                }
                if (j9 > j) {
                    jMin = Math.min(jMin, j9);
                }
            }
            i8++;
            abstractRunnableC2058i2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f7577n = jMin;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z7 = false;
            while (ExecutorC2052c.f7589s.get(this.f7580q) == 0) {
                EnumC2051b enumC2051b = this.f7575l;
                EnumC2051b enumC2051b2 = EnumC2051b.f7585n;
                if (enumC2051b == enumC2051b2) {
                    break loop0;
                }
                AbstractRunnableC2058i abstractRunnableC2058iM3941a = m3941a(this.f7579p);
                if (abstractRunnableC2058iM3941a != null) {
                    this.f7577n = 0L;
                    ExecutorC2052c executorC2052c = this.f7580q;
                    this.f7576m = 0L;
                    if (this.f7575l == EnumC2051b.f7583l) {
                        this.f7575l = EnumC2051b.f7582k;
                    }
                    if (abstractRunnableC2058iM3941a.f7604k) {
                        if (m3948h(EnumC2051b.f7582k) && !executorC2052c.m3954p() && !executorC2052c.m3953k(ExecutorC2052c.f7588r.get(executorC2052c))) {
                            executorC2052c.m3954p();
                        }
                        try {
                            abstractRunnableC2058iM3941a.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        ExecutorC2052c.f7588r.addAndGet(executorC2052c, -2097152L);
                        if (this.f7575l != enumC2051b2) {
                            this.f7575l = EnumC2051b.f7584m;
                        }
                    } else {
                        try {
                            abstractRunnableC2058iM3941a.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                    }
                } else {
                    this.f7579p = false;
                    if (this.f7577n == 0) {
                        Object obj = this.nextParkedWorker;
                        C1943s c1943s = ExecutorC2052c.f7590t;
                        if (obj != c1943s) {
                            f7572r.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC2052c.f7590t) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7572r;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    ExecutorC2052c executorC2052c2 = this.f7580q;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC2052c.f7589s;
                                    if (atomicIntegerFieldUpdater2.get(executorC2052c2) != 0) {
                                        break;
                                    }
                                    EnumC2051b enumC2051b3 = this.f7575l;
                                    EnumC2051b enumC2051b4 = EnumC2051b.f7585n;
                                    if (enumC2051b3 == enumC2051b4) {
                                        break;
                                    }
                                    m3948h(EnumC2051b.f7583l);
                                    Thread.interrupted();
                                    if (this.f7576m == 0) {
                                        j = 2097151;
                                        this.f7576m = System.nanoTime() + this.f7580q.f7593l;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f7580q.f7593l);
                                    if (System.nanoTime() - this.f7576m >= 0) {
                                        this.f7576m = 0L;
                                        ExecutorC2052c executorC2052c3 = this.f7580q;
                                        synchronized (executorC2052c3.f7597p) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(executorC2052c3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC2052c.f7588r;
                                                    if (((int) (atomicLongFieldUpdater.get(executorC2052c3) & j)) > executorC2052c3.f7591j) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            m3946f(0);
                                                            executorC2052c3.m3952g(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC2052c3) & j);
                                                            if (andDecrement != i) {
                                                                Object objM3791b = executorC2052c3.f7597p.m3791b(andDecrement);
                                                                AbstractC2980h.m5133b(objM3791b);
                                                                C2050a c2050a = (C2050a) objM3791b;
                                                                executorC2052c3.f7597p.m3792c(i, c2050a);
                                                                c2050a.m3946f(i);
                                                                executorC2052c3.m3952g(c2050a, andDecrement, i);
                                                            }
                                                            executorC2052c3.f7597p.m3792c(andDecrement, null);
                                                            this.f7575l = enumC2051b4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ExecutorC2052c executorC2052c4 = this.f7580q;
                            if (this.nextParkedWorker == c1943s) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC2052c.f7587q;
                                while (true) {
                                    long j8 = atomicLongFieldUpdater2.get(executorC2052c4);
                                    int i4 = this.indexInArray;
                                    this.nextParkedWorker = executorC2052c4.f7597p.m3791b((int) (j8 & 2097151));
                                    ExecutorC2052c executorC2052c5 = executorC2052c4;
                                    if (ExecutorC2052c.f7587q.compareAndSet(executorC2052c5, j8, ((j8 + 2097152) & (-2097152)) | i4)) {
                                        break;
                                    } else {
                                        executorC2052c4 = executorC2052c5;
                                    }
                                }
                            }
                        }
                    } else if (z7) {
                        m3948h(EnumC2051b.f7583l);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f7577n);
                        this.f7577n = 0L;
                    } else {
                        z7 = true;
                    }
                }
            }
            break loop0;
        }
        m3948h(EnumC2051b.f7585n);
    }
}
