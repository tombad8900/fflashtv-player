package p076i7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p111m6.C1911f;
import p112m7.C1937m;
import p112m7.C1943s;
import p112m7.C1945u;
import p137p6.InterfaceC2227h;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC1311l0 extends AbstractC1314m0 implements InterfaceC1281b0 {

    /* renamed from: o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5341o = AtomicReferenceFieldUpdater.newUpdater(AbstractC1311l0.class, Object.class, "_queue$volatile");

    /* renamed from: p */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5342p = AtomicReferenceFieldUpdater.newUpdater(AbstractC1311l0.class, Object.class, "_delayed$volatile");

    /* renamed from: q */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5343q = AtomicIntegerFieldUpdater.newUpdater(AbstractC1311l0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // p076i7.AbstractC1327r
    /* renamed from: D */
    public final void mo2822D(InterfaceC2227h interfaceC2227h, Runnable runnable) {
        mo2823L(runnable);
    }

    /* renamed from: L */
    public void mo2823L(Runnable runnable) {
        m2824M();
        if (!m2825N(runnable)) {
            RunnableC1341y.f5386r.mo2823L(runnable);
            return;
        }
        Thread threadMo2781H = mo2781H();
        if (Thread.currentThread() != threadMo2781H) {
            LockSupport.unpark(threadMo2781H);
        }
    }

    /* renamed from: M */
    public final void m2824M() {
        AbstractRunnableC1305j0 abstractRunnableC1305j0M3801b;
        C1308k0 c1308k0 = (C1308k0) f5342p.get(this);
        if (c1308k0 == null || C1945u.f7235b.get(c1308k0) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c1308k0) {
                try {
                    AbstractRunnableC1305j0[] abstractRunnableC1305j0Arr = c1308k0.f7236a;
                    AbstractRunnableC1305j0 abstractRunnableC1305j0 = abstractRunnableC1305j0Arr != null ? abstractRunnableC1305j0Arr[0] : null;
                    if (abstractRunnableC1305j0 != null) {
                        abstractRunnableC1305j0M3801b = ((jNanoTime - abstractRunnableC1305j0.f5335j) > 0L ? 1 : ((jNanoTime - abstractRunnableC1305j0.f5335j) == 0L ? 0 : -1)) >= 0 ? m2825N(abstractRunnableC1305j0) : false ? c1308k0.m3801b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC1305j0M3801b != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2825N(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5341o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f5343q.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof C1937m)) {
                        if (obj != AbstractC1339x.f5377c) {
                            C1937m c1937m = new C1937m(8, true);
                            c1937m.m3786a((Runnable) obj);
                            c1937m.m3786a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1937m)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    C1937m c1937m2 = (C1937m) obj;
                    int iM3786a = c1937m2.m3786a(runnable);
                    if (iM3786a == 0) {
                        break;
                    }
                    if (iM3786a == 1) {
                        C1937m c1937mM3788c = c1937m2.m3788c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1937mM3788c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iM3786a == 2) {
                        break;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2826O() {
        C1911f c1911f = this.f5349n;
        if (c1911f != null ? c1911f.isEmpty() : true) {
            C1308k0 c1308k0 = (C1308k0) f5342p.get(this);
            if (c1308k0 == null) {
                Object obj = f5341o.get(this);
                if (obj != null) {
                    if (obj instanceof C1937m) {
                        long j = C1937m.f7221f.get((C1937m) obj);
                        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                    }
                    if (obj == AbstractC1339x.f5377c) {
                    }
                }
                return true;
            }
            if (C1945u.f7235b.get(c1308k0) == 0) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m2827P() {
        Runnable runnable;
        AbstractRunnableC1305j0 abstractRunnableC1305j0;
        C1943s c1943s = AbstractC1339x.f5377c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5341o;
        if (!m2833J()) {
            m2824M();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof C1937m)) {
                    if (obj != c1943s) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                C1937m c1937m = (C1937m) obj;
                Object objM3789d = c1937m.m3789d();
                if (objM3789d != C1937m.f7222g) {
                    runnable = (Runnable) objM3789d;
                    break;
                }
                C1937m c1937mM3788c = c1937m.m3788c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1937mM3788c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C1911f c1911f = this.f5349n;
            if (((c1911f == null || c1911f.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C1937m) {
                        long j = C1937m.f7221f.get((C1937m) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c1943s) {
                        return Long.MAX_VALUE;
                    }
                }
                C1308k0 c1308k0 = (C1308k0) f5342p.get(this);
                if (c1308k0 != null) {
                    synchronized (c1308k0) {
                        AbstractRunnableC1305j0[] abstractRunnableC1305j0Arr = c1308k0.f7236a;
                        abstractRunnableC1305j0 = abstractRunnableC1305j0Arr != null ? abstractRunnableC1305j0Arr[0] : null;
                    }
                    if (abstractRunnableC1305j0 != null) {
                        long jNanoTime = abstractRunnableC1305j0.f5335j - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* renamed from: Q */
    public final void m2828Q(long j, AbstractRunnableC1305j0 abstractRunnableC1305j0) {
        int iM2820b;
        Thread threadMo2781H;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5342p;
        if (f5343q.get(this) != 0) {
            iM2820b = 1;
        } else {
            C1308k0 c1308k0 = (C1308k0) atomicReferenceFieldUpdater.get(this);
            if (c1308k0 == null) {
                C1308k0 c1308k02 = new C1308k0();
                c1308k02.f5339c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1308k02) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC2980h.m5133b(obj);
                c1308k0 = (C1308k0) obj;
            }
            iM2820b = abstractRunnableC1305j0.m2820b(j, c1308k0, this);
        }
        if (iM2820b != 0) {
            if (iM2820b == 1) {
                mo2834K(j, abstractRunnableC1305j0);
                return;
            } else {
                if (iM2820b != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C1308k0 c1308k03 = (C1308k0) atomicReferenceFieldUpdater.get(this);
        if (c1308k03 != null) {
            synchronized (c1308k03) {
                AbstractRunnableC1305j0[] abstractRunnableC1305j0Arr = c1308k03.f7236a;
                abstractRunnableC1305j0 = abstractRunnableC1305j0Arr != null ? abstractRunnableC1305j0Arr[0] : null;
            }
        }
        if (abstractRunnableC1305j0 != abstractRunnableC1305j0 || Thread.currentThread() == (threadMo2781H = mo2781H())) {
            return;
        }
        LockSupport.unpark(threadMo2781H);
    }

    @Override // p076i7.InterfaceC1281b0
    /* renamed from: k */
    public InterfaceC1293f0 mo2777k(long j, RunnableC1309k1 runnableC1309k1, InterfaceC2227h interfaceC2227h) {
        return AbstractC1343z.f5392a.mo2777k(j, runnableC1309k1, interfaceC2227h);
    }

    @Override // p076i7.AbstractC1314m0
    public void shutdown() {
        AbstractRunnableC1305j0 abstractRunnableC1305j0M3801b;
        AbstractC1300h1.f5328a.set(null);
        f5343q.set(this, 1);
        C1943s c1943s = AbstractC1339x.f5377c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5341o;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof C1937m)) {
                    if (obj != c1943s) {
                        C1937m c1937m = new C1937m(8, true);
                        c1937m.m3786a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1937m)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C1937m) obj).m3787b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1943s)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (m2827P() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C1308k0 c1308k0 = (C1308k0) f5342p.get(this);
            if (c1308k0 == null) {
                return;
            }
            synchronized (c1308k0) {
                abstractRunnableC1305j0M3801b = C1945u.f7235b.get(c1308k0) > 0 ? c1308k0.m3801b(0) : null;
            }
            if (abstractRunnableC1305j0M3801b == null) {
                return;
            } else {
                mo2834K(jNanoTime, abstractRunnableC1305j0M3801b);
            }
        }
    }

    @Override // p076i7.InterfaceC1281b0
    /* renamed from: x */
    public final void mo2778x(C1295g c1295g) {
        long jNanoTime = System.nanoTime();
        C1299h0 c1299h0 = new C1299h0(this, 400000000 + jNanoTime, c1295g);
        m2828Q(jNanoTime, c1299h0);
        c1295g.m2813y(new C1286d(1, c1299h0));
    }
}
