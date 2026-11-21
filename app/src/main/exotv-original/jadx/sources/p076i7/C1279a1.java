package p076i7;

import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002a1.C0048u;
import p112m7.C1932h;
import p112m7.C1934j;
import p112m7.C1943s;
import p137p6.InterfaceC2225f;
import p137p6.InterfaceC2226g;
import p137p6.InterfaceC2227h;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.a1 */
/* loaded from: classes.dex */
public class C1279a1 implements InterfaceC1330s0, InterfaceC1291e1 {

    /* renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5307j = AtomicReferenceFieldUpdater.newUpdater(C1279a1.class, Object.class, "_state$volatile");

    /* renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5308k = AtomicReferenceFieldUpdater.newUpdater(C1279a1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C1279a1(boolean z7) {
        this._state$volatile = z7 ? AbstractC1339x.f5384j : AbstractC1339x.f5383i;
    }

    /* renamed from: J */
    public static C1307k m2744J(C1934j c1934j) {
        while (c1934j.mo2780h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1934j.f7216k;
            C1934j c1934jM3779e = c1934j.m3779e();
            if (c1934jM3779e == null) {
                Object obj = atomicReferenceFieldUpdater.get(c1934j);
                while (true) {
                    c1934j = (C1934j) obj;
                    if (!c1934j.mo2780h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c1934j);
                }
            } else {
                c1934j = c1934jM3779e;
            }
        }
        while (true) {
            c1934j = c1934j.m3781g();
            if (!c1934j.mo2780h()) {
                if (c1934j instanceof C1307k) {
                    return (C1307k) c1934j;
                }
                if (c1934j instanceof C1282b1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: Q */
    public static String m2745Q(Object obj) {
        if (!(obj instanceof C1344z0)) {
            return obj instanceof InterfaceC1323p0 ? ((InterfaceC1323p0) obj).isActive() ? "Active" : "New" : obj instanceof C1319o ? "Cancelled" : "Completed";
        }
        C1344z0 c1344z0 = (C1344z0) obj;
        return c1344z0.m2862d() ? "Cancelling" : C1344z0.f5393k.get(c1344z0) != 0 ? "Completing" : "Active";
    }

    /* renamed from: A */
    public boolean mo2743A(Throwable th) {
        return false;
    }

    /* renamed from: B */
    public void mo2739B(C0048u c0048u) {
        throw c0048u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [i7.k, i7.w0, java.lang.Object, m7.j] */
    /* JADX WARN: Type inference failed for: r3v3, types: [i7.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [i7.b1, m7.j] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2746C(InterfaceC1330s0 interfaceC1330s0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        int iM2757P;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5308k;
        C1285c1 c1285c1 = C1285c1.f5312j;
        if (interfaceC1330s0 == null) {
            atomicReferenceFieldUpdater2.set(this, c1285c1);
            return;
        }
        C1279a1 c1279a1 = (C1279a1) interfaceC1330s0;
        do {
            atomicReferenceFieldUpdater = f5307j;
            iM2757P = c1279a1.m2757P(atomicReferenceFieldUpdater.get(c1279a1));
            if (iM2757P == 0) {
                break;
            }
        } while (iM2757P != 1);
        ?? c1307k = new C1307k(this);
        c1307k.f5374m = c1279a1;
        loop1: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c1279a1);
            if (obj instanceof C1296g0) {
                C1296g0 c1296g0 = (C1296g0) obj;
                if (c1296g0.f5324j) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c1279a1, obj, c1307k)) {
                        if (atomicReferenceFieldUpdater.get(c1279a1) != obj) {
                            break;
                        }
                    }
                    break loop1;
                }
                c1279a1.m2755N(c1296g0);
            } else {
                if (obj instanceof InterfaceC1323p0) {
                    ?? Mo2779b = ((InterfaceC1323p0) obj).mo2779b();
                    if (Mo2779b == 0) {
                        c1279a1.m2756O((AbstractC1338w0) obj);
                    } else if (!Mo2779b.m3778d(c1307k, 7)) {
                        boolean zM3778d = Mo2779b.m3778d(c1307k, 3);
                        Object obj2 = atomicReferenceFieldUpdater.get(c1279a1);
                        if (obj2 instanceof C1344z0) {
                            thM2861c = ((C1344z0) obj2).m2861c();
                        } else {
                            C1319o c1319o = obj2 instanceof C1319o ? (C1319o) obj2 : null;
                            if (c1319o != null) {
                                thM2861c = c1319o.f5358a;
                            }
                        }
                        c1307k.mo2817k(thM2861c);
                        if (!zM3778d) {
                        }
                    }
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(c1279a1);
                    C1319o c1319o2 = obj3 instanceof C1319o ? (C1319o) obj3 : null;
                    c1307k.mo2817k(c1319o2 != null ? c1319o2.f5358a : null);
                }
            }
        }
        atomicReferenceFieldUpdater2.set(this, c1307k);
        if (m2748E()) {
            c1307k.mo2783c();
            atomicReferenceFieldUpdater2.set(this, c1285c1);
        }
    }

    /* renamed from: D */
    public final InterfaceC1293f0 m2747D(boolean z7, AbstractC1338w0 abstractC1338w0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1285c1 c1285c1;
        boolean z8;
        boolean zM3778d;
        abstractC1338w0.f5374m = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f5307j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z9 = obj instanceof C1296g0;
            c1285c1 = C1285c1.f5312j;
            z8 = true;
            if (!z9) {
                if (!(obj instanceof InterfaceC1323p0)) {
                    z8 = false;
                    break;
                }
                InterfaceC1323p0 interfaceC1323p0 = (InterfaceC1323p0) obj;
                C1282b1 c1282b1Mo2779b = interfaceC1323p0.mo2779b();
                if (c1282b1Mo2779b == null) {
                    m2756O((AbstractC1338w0) obj);
                } else {
                    if (abstractC1338w0.mo2816j()) {
                        C1344z0 c1344z0 = interfaceC1323p0 instanceof C1344z0 ? (C1344z0) interfaceC1323p0 : null;
                        Throwable thM2861c = c1344z0 != null ? c1344z0.m2861c() : null;
                        if (thM2861c == null) {
                            zM3778d = c1282b1Mo2779b.m3778d(abstractC1338w0, 5);
                        } else if (z7) {
                            abstractC1338w0.mo2817k(thM2861c);
                            return c1285c1;
                        }
                    } else {
                        zM3778d = c1282b1Mo2779b.m3778d(abstractC1338w0, 1);
                    }
                    if (zM3778d) {
                        break;
                    }
                }
            } else {
                C1296g0 c1296g0 = (C1296g0) obj;
                if (c1296g0.f5324j) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC1338w0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m2755N(c1296g0);
            }
        }
        if (z8) {
            return abstractC1338w0;
        }
        if (z7) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C1319o c1319o = obj2 instanceof C1319o ? (C1319o) obj2 : null;
            abstractC1338w0.mo2817k(c1319o != null ? c1319o.f5358a : null);
        }
        return c1285c1;
    }

    /* renamed from: E */
    public final boolean m2748E() {
        return !(f5307j.get(this) instanceof InterfaceC1323p0);
    }

    /* renamed from: F */
    public boolean mo2749F() {
        return false;
    }

    /* renamed from: G */
    public final boolean m2750G(Object obj) {
        Object objM2758R;
        do {
            objM2758R = m2758R(f5307j.get(this), obj);
            if (objM2758R == AbstractC1339x.f5378d) {
                return false;
            }
            if (objM2758R == AbstractC1339x.f5379e) {
                return true;
            }
        } while (objM2758R == AbstractC1339x.f5380f);
        mo2763k(objM2758R);
        return true;
    }

    /* renamed from: H */
    public final Object m2751H(Object obj) {
        Object objM2758R;
        do {
            objM2758R = m2758R(f5307j.get(this), obj);
            if (objM2758R == AbstractC1339x.f5378d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C1319o c1319o = obj instanceof C1319o ? (C1319o) obj : null;
                throw new IllegalStateException(str, c1319o != null ? c1319o.f5358a : null);
            }
        } while (objM2758R == AbstractC1339x.f5380f);
        return objM2758R;
    }

    /* renamed from: I */
    public String mo2752I() {
        return getClass().getSimpleName();
    }

    /* renamed from: K */
    public final void m2753K(C1282b1 c1282b1, Throwable th) {
        c1282b1.m3778d(new C1932h(4), 4);
        Object obj = C1934j.f7215j.get(c1282b1);
        AbstractC2980h.m5134c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj);
        C0048u c0048u = null;
        for (C1934j c1934jM3781g = (C1934j) obj; !c1934jM3781g.equals(c1282b1); c1934jM3781g = c1934jM3781g.m3781g()) {
            if ((c1934jM3781g instanceof AbstractC1338w0) && ((AbstractC1338w0) c1934jM3781g).mo2816j()) {
                try {
                    ((AbstractC1338w0) c1934jM3781g).mo2817k(th);
                } catch (Throwable th2) {
                    if (c0048u != null) {
                        AbstractC0715d.m1557e(c0048u, th2);
                    } else {
                        c0048u = new C0048u("Exception in completion handler " + c1934jM3781g + " for " + this, th2);
                    }
                }
            }
        }
        if (c0048u != null) {
            mo2739B(c0048u);
        }
        m2766n(th);
    }

    /* renamed from: L */
    public void mo2740L(Object obj) {
    }

    /* renamed from: M */
    public void m2754M() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [i7.o0] */
    /* renamed from: N */
    public final void m2755N(C1296g0 c1296g0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1282b1 c1282b1 = new C1282b1();
        if (!c1296g0.f5324j) {
            c1282b1 = new C1320o0(c1282b1);
        }
        do {
            atomicReferenceFieldUpdater = f5307j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c1296g0, c1282b1)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c1296g0);
    }

    /* renamed from: O */
    public final void m2756O(AbstractC1338w0 abstractC1338w0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1282b1 c1282b1 = new C1282b1();
        abstractC1338w0.getClass();
        C1934j.f7216k.set(c1282b1, abstractC1338w0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1934j.f7215j;
        atomicReferenceFieldUpdater2.set(c1282b1, abstractC1338w0);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC1338w0) == abstractC1338w0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC1338w0, abstractC1338w0, c1282b1)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC1338w0) != abstractC1338w0) {
                        break;
                    }
                }
                c1282b1.m3780f(abstractC1338w0);
                break loop0;
            }
            break;
        }
        C1934j c1934jM3781g = abstractC1338w0.m3781g();
        do {
            atomicReferenceFieldUpdater = f5307j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC1338w0, c1934jM3781g)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC1338w0);
    }

    /* renamed from: P */
    public final int m2757P(Object obj) {
        boolean z7 = obj instanceof C1296g0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5307j;
        if (z7) {
            if (((C1296g0) obj).f5324j) {
                return 0;
            }
            C1296g0 c1296g0 = AbstractC1339x.f5384j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1296g0)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof C1320o0)) {
            return 0;
        }
        C1282b1 c1282b1 = ((C1320o0) obj).f5359j;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1282b1)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    /* renamed from: R */
    public final Object m2758R(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC1323p0)) {
            return AbstractC1339x.f5378d;
        }
        if (((obj instanceof C1296g0) || (obj instanceof AbstractC1338w0)) && !(obj instanceof C1307k) && !(obj2 instanceof C1319o)) {
            InterfaceC1323p0 interfaceC1323p0 = (InterfaceC1323p0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5307j;
            Object c1326q0 = obj2 instanceof InterfaceC1323p0 ? new C1326q0((InterfaceC1323p0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1323p0, c1326q0)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC1323p0) {
                    return AbstractC1339x.f5380f;
                }
            }
            mo2740L(obj2);
            m2768r(interfaceC1323p0, obj2);
            return obj2;
        }
        InterfaceC1323p0 interfaceC1323p02 = (InterfaceC1323p0) obj;
        C1282b1 c1282b1M2776z = m2776z(interfaceC1323p02);
        if (c1282b1M2776z == null) {
            return AbstractC1339x.f5380f;
        }
        C1344z0 c1344z0 = interfaceC1323p02 instanceof C1344z0 ? (C1344z0) interfaceC1323p02 : null;
        if (c1344z0 == null) {
            c1344z0 = new C1344z0(c1282b1M2776z, null);
        }
        synchronized (c1344z0) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1344z0.f5393k;
            if (atomicIntegerFieldUpdater.get(c1344z0) != 0) {
                return AbstractC1339x.f5378d;
            }
            atomicIntegerFieldUpdater.set(c1344z0, 1);
            if (c1344z0 != interfaceC1323p02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5307j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC1323p02, c1344z0)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC1323p02) {
                        return AbstractC1339x.f5380f;
                    }
                }
            }
            boolean zM2862d = c1344z0.m2862d();
            C1319o c1319o = obj2 instanceof C1319o ? (C1319o) obj2 : null;
            if (c1319o != null) {
                c1344z0.m2860a(c1319o.f5358a);
            }
            Throwable thM2861c = zM2862d ? null : c1344z0.m2861c();
            if (thM2861c != null) {
                m2753K(c1282b1M2776z, thM2861c);
            }
            C1307k c1307kM2744J = m2744J(c1282b1M2776z);
            if (c1307kM2744J != null && m2759S(c1344z0, c1307kM2744J, obj2)) {
                return AbstractC1339x.f5379e;
            }
            c1282b1M2776z.m3778d(new C1932h(2), 2);
            C1307k c1307kM2744J2 = m2744J(c1282b1M2776z);
            return (c1307kM2744J2 == null || !m2759S(c1344z0, c1307kM2744J2, obj2)) ? m2771u(c1344z0, obj2) : AbstractC1339x.f5379e;
        }
    }

    /* renamed from: S */
    public final boolean m2759S(C1344z0 c1344z0, C1307k c1307k, Object obj) {
        while (AbstractC1339x.m2849j(c1307k.f5338n, false, new C1342y0(this, c1344z0, c1307k, obj)) == C1285c1.f5312j) {
            c1307k = m2744J(c1307k);
            if (c1307k == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p137p6.InterfaceC2227h
    /* renamed from: b */
    public final InterfaceC2225f mo2760b(InterfaceC2226g interfaceC2226g) {
        AbstractC2980h.m5136e("key", interfaceC2226g);
        if (AbstractC2980h.m5132a(C1329s.f5369k, interfaceC2226g)) {
            return this;
        }
        return null;
    }

    @Override // p137p6.InterfaceC2227h
    /* renamed from: c */
    public final InterfaceC2227h mo2761c(InterfaceC2227h interfaceC2227h) {
        return AbstractC0714c.m1508W(this, interfaceC2227h);
    }

    @Override // p137p6.InterfaceC2227h
    /* renamed from: g */
    public final InterfaceC2227h mo2762g(InterfaceC2226g interfaceC2226g) {
        return AbstractC0714c.m1507T(this, interfaceC2226g);
    }

    @Override // p137p6.InterfaceC2225f
    public final InterfaceC2226g getKey() {
        return C1329s.f5369k;
    }

    @Override // p076i7.InterfaceC1330s0
    public boolean isActive() {
        Object obj = f5307j.get(this);
        return (obj instanceof InterfaceC1323p0) && ((InterfaceC1323p0) obj).isActive();
    }

    /* renamed from: k */
    public void mo2763k(Object obj) {
    }

    /* renamed from: l */
    public void mo2764l(Object obj) {
        mo2763k(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2765m(Object obj) {
        C1943s c1943s;
        Object objM2758R = AbstractC1339x.f5378d;
        if (mo2775y()) {
            do {
                Object obj2 = f5307j.get(this);
                if (obj2 instanceof InterfaceC1323p0) {
                    if (obj2 instanceof C1344z0) {
                        if (C1344z0.f5393k.get((C1344z0) obj2) != 0) {
                        }
                    }
                    objM2758R = m2758R(obj2, new C1319o(m2769s(obj), false));
                }
                objM2758R = AbstractC1339x.f5378d;
                break;
            } while (objM2758R == AbstractC1339x.f5380f);
            if (objM2758R != AbstractC1339x.f5379e) {
                if (objM2758R == AbstractC1339x.f5378d) {
                    Throwable thM2769s = null;
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5307j;
                        Object obj3 = atomicReferenceFieldUpdater.get(this);
                        if (!(obj3 instanceof C1344z0)) {
                            if (!(obj3 instanceof InterfaceC1323p0)) {
                                c1943s = AbstractC1339x.f5381g;
                                break;
                            }
                            if (thM2769s == null) {
                                thM2769s = m2769s(obj);
                            }
                            InterfaceC1323p0 interfaceC1323p0 = (InterfaceC1323p0) obj3;
                            if (interfaceC1323p0.isActive()) {
                                C1282b1 c1282b1M2776z = m2776z(interfaceC1323p0);
                                if (c1282b1M2776z != null) {
                                    C1344z0 c1344z0 = new C1344z0(c1282b1M2776z, thM2769s);
                                    while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1323p0, c1344z0)) {
                                        if (atomicReferenceFieldUpdater.get(this) != interfaceC1323p0) {
                                            break;
                                        }
                                    }
                                    m2753K(c1282b1M2776z, thM2769s);
                                    c1943s = AbstractC1339x.f5378d;
                                    break loop1;
                                }
                                continue;
                            } else {
                                Object objM2758R2 = m2758R(obj3, new C1319o(thM2769s, false));
                                if (objM2758R2 == AbstractC1339x.f5378d) {
                                    throw new IllegalStateException(("Cannot happen in " + obj3).toString());
                                }
                                if (objM2758R2 != AbstractC1339x.f5380f) {
                                    objM2758R = objM2758R2;
                                    break;
                                }
                            }
                        } else {
                            synchronized (obj3) {
                                if (C1344z0.f5395m.get((C1344z0) obj3) == AbstractC1339x.f5382h) {
                                    c1943s = AbstractC1339x.f5381g;
                                } else {
                                    boolean zM2862d = ((C1344z0) obj3).m2862d();
                                    if (thM2769s == null) {
                                        thM2769s = m2769s(obj);
                                    }
                                    ((C1344z0) obj3).m2860a(thM2769s);
                                    Throwable thM2861c = zM2862d ? null : ((C1344z0) obj3).m2861c();
                                    if (thM2861c != null) {
                                        m2753K(((C1344z0) obj3).f5396j, thM2861c);
                                    }
                                    c1943s = AbstractC1339x.f5378d;
                                }
                            }
                        }
                    }
                }
                if (objM2758R != AbstractC1339x.f5378d && objM2758R != AbstractC1339x.f5379e) {
                    if (objM2758R == AbstractC1339x.f5381g) {
                        return false;
                    }
                    mo2763k(objM2758R);
                    return true;
                }
            }
        }
        return true;
    }

    /* renamed from: n */
    public final boolean m2766n(Throwable th) {
        if (mo2749F()) {
            return true;
        }
        boolean z7 = th instanceof CancellationException;
        InterfaceC1304j interfaceC1304j = (InterfaceC1304j) f5308k.get(this);
        return (interfaceC1304j == null || interfaceC1304j == C1285c1.f5312j) ? z7 : interfaceC1304j.mo2782a(th) || z7;
    }

    /* renamed from: o */
    public String mo2742o() {
        return "Job was cancelled";
    }

    /* renamed from: q */
    public boolean mo2767q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m2765m(th) && mo2774x();
    }

    /* renamed from: r */
    public final void m2768r(InterfaceC1323p0 interfaceC1323p0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5308k;
        InterfaceC1304j interfaceC1304j = (InterfaceC1304j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1304j != null) {
            interfaceC1304j.mo2783c();
            atomicReferenceFieldUpdater.set(this, C1285c1.f5312j);
        }
        C0048u c0048u = null;
        C1319o c1319o = obj instanceof C1319o ? (C1319o) obj : null;
        Throwable th = c1319o != null ? c1319o.f5358a : null;
        if (interfaceC1323p0 instanceof AbstractC1338w0) {
            try {
                ((AbstractC1338w0) interfaceC1323p0).mo2817k(th);
                return;
            } catch (Throwable th2) {
                mo2739B(new C0048u("Exception in completion handler " + interfaceC1323p0 + " for " + this, th2));
                return;
            }
        }
        C1282b1 c1282b1Mo2779b = interfaceC1323p0.mo2779b();
        if (c1282b1Mo2779b != null) {
            c1282b1Mo2779b.m3778d(new C1932h(1), 1);
            Object obj2 = C1934j.f7215j.get(c1282b1Mo2779b);
            AbstractC2980h.m5134c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj2);
            for (C1934j c1934jM3781g = (C1934j) obj2; !c1934jM3781g.equals(c1282b1Mo2779b); c1934jM3781g = c1934jM3781g.m3781g()) {
                if (c1934jM3781g instanceof AbstractC1338w0) {
                    try {
                        ((AbstractC1338w0) c1934jM3781g).mo2817k(th);
                    } catch (Throwable th3) {
                        if (c0048u != null) {
                            AbstractC0715d.m1557e(c0048u, th3);
                        } else {
                            c0048u = new C0048u("Exception in completion handler " + c1934jM3781g + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0048u != null) {
                mo2739B(c0048u);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    /* renamed from: s */
    public final Throwable m2769s(Object obj) {
        CancellationException cancellationExceptionM2861c;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C1279a1 c1279a1 = (C1279a1) ((InterfaceC1291e1) obj);
        Object obj2 = f5307j.get(c1279a1);
        if (obj2 instanceof C1344z0) {
            cancellationExceptionM2861c = ((C1344z0) obj2).m2861c();
        } else if (obj2 instanceof C1319o) {
            cancellationExceptionM2861c = ((C1319o) obj2).f5358a;
        } else {
            if (obj2 instanceof InterfaceC1323p0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionM2861c = null;
        }
        CancellationException cancellationException = cancellationExceptionM2861c instanceof CancellationException ? cancellationExceptionM2861c : null;
        return cancellationException == null ? new C1332t0("Parent job is ".concat(m2745Q(obj2)), cancellationExceptionM2861c, c1279a1) : cancellationException;
    }

    @Override // p137p6.InterfaceC2227h
    /* renamed from: t */
    public final Object mo2770t(Object obj, InterfaceC2855p interfaceC2855p) {
        return interfaceC2855p.mo576c(obj, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo2752I() + '{' + m2745Q(f5307j.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC1339x.m2845f(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final Object m2771u(C1344z0 c1344z0, Object obj) {
        Throwable thM2773w;
        C1319o c1319o = obj instanceof C1319o ? (C1319o) obj : null;
        Throwable th = c1319o != null ? c1319o.f5358a : null;
        synchronized (c1344z0) {
            c1344z0.m2862d();
            ArrayList arrayListM2863e = c1344z0.m2863e(th);
            thM2773w = m2773w(c1344z0, arrayListM2863e);
            if (thM2773w != null && arrayListM2863e.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM2863e.size()));
                int size = arrayListM2863e.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayListM2863e.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thM2773w && th2 != thM2773w && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC0715d.m1557e(thM2773w, th2);
                    }
                }
            }
        }
        if (thM2773w != null && thM2773w != th) {
            obj = new C1319o(thM2773w, false);
        }
        if (thM2773w != null && (m2766n(thM2773w) || mo2743A(thM2773w))) {
            AbstractC2980h.m5134c("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally", obj);
            C1319o.f5357b.compareAndSet((C1319o) obj, 0, 1);
        }
        mo2740L(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5307j;
        Object c1326q0 = obj instanceof InterfaceC1323p0 ? new C1326q0((InterfaceC1323p0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c1344z0, c1326q0) && atomicReferenceFieldUpdater.get(this) == c1344z0) {
        }
        m2768r(c1344z0, obj);
        return obj;
    }

    /* renamed from: v */
    public final CancellationException m2772v() {
        CancellationException cancellationException;
        Object obj = f5307j.get(this);
        if (!(obj instanceof C1344z0)) {
            if (obj instanceof InterfaceC1323p0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C1319o)) {
                return new C1332t0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C1319o) obj).f5358a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C1332t0(mo2742o(), th, this) : cancellationException;
        }
        Throwable thM2861c = ((C1344z0) obj).m2861c();
        if (thM2861c == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM2861c instanceof CancellationException ? (CancellationException) thM2861c : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo2742o();
        }
        return new C1332t0(strConcat, thM2861c, this);
    }

    /* renamed from: w */
    public final Throwable m2773w(C1344z0 c1344z0, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (c1344z0.m2862d()) {
                return new C1332t0(mo2742o(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof C1306j1) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof C1306j1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* renamed from: x */
    public boolean mo2774x() {
        return true;
    }

    /* renamed from: y */
    public boolean mo2775y() {
        return this instanceof C1313m;
    }

    /* renamed from: z */
    public final C1282b1 m2776z(InterfaceC1323p0 interfaceC1323p0) {
        C1282b1 c1282b1Mo2779b = interfaceC1323p0.mo2779b();
        if (c1282b1Mo2779b != null) {
            return c1282b1Mo2779b;
        }
        if (interfaceC1323p0 instanceof C1296g0) {
            return new C1282b1();
        }
        if (interfaceC1323p0 instanceof AbstractC1338w0) {
            m2756O((AbstractC1338w0) interfaceC1323p0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1323p0).toString());
    }
}
