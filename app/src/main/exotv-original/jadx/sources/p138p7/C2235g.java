package p138p7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002a1.AbstractC0008a1;
import p076i7.C1292f;
import p076i7.InterfaceC1289e;
import p076i7.InterfaceC1324p1;
import p112m7.AbstractC1925a;
import p112m7.AbstractC1926b;
import p112m7.AbstractC1942r;
import p112m7.C1943s;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p7.g */
/* loaded from: classes.dex */
public class C2235g {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7754c = AtomicReferenceFieldUpdater.newUpdater(C2235g.class, Object.class, "head$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f7755d = AtomicLongFieldUpdater.newUpdater(C2235g.class, "deqIdx$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7756e = AtomicReferenceFieldUpdater.newUpdater(C2235g.class, Object.class, "tail$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f7757f = AtomicLongFieldUpdater.newUpdater(C2235g.class, "enqIdx$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7758g = AtomicIntegerFieldUpdater.newUpdater(C2235g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a */
    public final int f7759a;

    /* renamed from: b */
    public final C1292f f7760b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public C2235g(int i) {
        this.f7759a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "The number of acquired permits should be in 0..").toString());
        }
        C2238j c2238j = new C2238j(0L, null, 2);
        this.head$volatile = c2238j;
        this.tail$volatile = c2238j;
        this._availablePermits$volatile = i;
        this.f7760b = new C1292f(2, this);
    }

    /* renamed from: a */
    public final boolean m4009a(InterfaceC1324p1 interfaceC1324p1) {
        Object objM3766b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7756e;
        C2238j c2238j = (C2238j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f7757f.getAndIncrement(this);
        C2233e c2233e = C2233e.f7752r;
        long j = andIncrement / AbstractC2237i.f7766f;
        loop0: while (true) {
            objM3766b = AbstractC1925a.m3766b(c2238j, j, c2233e);
            if (objM3766b != AbstractC1925a.f7190a) {
                AbstractC1942r abstractC1942rM3767c = AbstractC1925a.m3767c(objM3766b);
                while (true) {
                    AbstractC1942r abstractC1942r = (AbstractC1942r) atomicReferenceFieldUpdater.get(this);
                    if (abstractC1942r.f7231c >= abstractC1942rM3767c.f7231c) {
                        break loop0;
                    }
                    if (!abstractC1942rM3767c.m3796f()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC1942r, abstractC1942rM3767c)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC1942r) {
                            if (abstractC1942rM3767c.m3793c()) {
                                abstractC1942rM3767c.m3775b();
                            }
                        }
                    }
                    if (abstractC1942r.m3793c()) {
                        abstractC1942r.m3775b();
                    }
                }
            } else {
                break;
            }
        }
        C2238j c2238j2 = (C2238j) AbstractC1925a.m3767c(objM3766b);
        AtomicReferenceArray atomicReferenceArray = c2238j2.f7767e;
        int i = (int) (andIncrement % AbstractC2237i.f7766f);
        while (!atomicReferenceArray.compareAndSet(i, null, interfaceC1324p1)) {
            if (atomicReferenceArray.get(i) != null) {
                C1943s c1943s = AbstractC2237i.f7762b;
                C1943s c1943s2 = AbstractC2237i.f7763c;
                while (!atomicReferenceArray.compareAndSet(i, c1943s, c1943s2)) {
                    if (atomicReferenceArray.get(i) != c1943s) {
                        return false;
                    }
                }
                ((InterfaceC1289e) interfaceC1324p1).mo2791i(this.f7760b);
                return true;
            }
        }
        interfaceC1324p1.mo2801b(c2238j2, i);
        return true;
    }

    /* renamed from: b */
    public final void m4010b() {
        int i;
        Object objM3766b;
        boolean z7;
        C2238j c2238j;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7758g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i4 = this.f7759a;
            if (andIncrement >= i4) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i4) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i4));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i4).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7754c;
            C2238j c2238j2 = (C2238j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f7755d.getAndIncrement(this);
            long j = andIncrement2 / AbstractC2237i.f7766f;
            C2234f c2234f = C2234f.f7753r;
            while (true) {
                objM3766b = AbstractC1925a.m3766b(c2238j2, j, c2234f);
                if (objM3766b == AbstractC1925a.f7190a) {
                    break;
                }
                AbstractC1942r abstractC1942rM3767c = AbstractC1925a.m3767c(objM3766b);
                while (true) {
                    AbstractC1942r abstractC1942r = (AbstractC1942r) atomicReferenceFieldUpdater.get(this);
                    c2238j = c2238j2;
                    if (abstractC1942r.f7231c >= abstractC1942rM3767c.f7231c) {
                        break;
                    }
                    if (!abstractC1942rM3767c.m3796f()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC1942r, abstractC1942rM3767c)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC1942r) {
                            if (abstractC1942rM3767c.m3793c()) {
                                abstractC1942rM3767c.m3775b();
                            }
                            c2238j2 = c2238j;
                        }
                    }
                    if (abstractC1942r.m3793c()) {
                        abstractC1942r.m3775b();
                    }
                }
                c2238j2 = c2238j;
            }
            C2238j c2238j3 = (C2238j) AbstractC1925a.m3767c(objM3766b);
            AtomicReferenceArray atomicReferenceArray = c2238j3.f7767e;
            AbstractC1926b.f7198b.set(c2238j3, null);
            z7 = false;
            if (c2238j3.f7231c <= j) {
                int i8 = (int) (andIncrement2 % AbstractC2237i.f7766f);
                Object andSet = atomicReferenceArray.getAndSet(i8, AbstractC2237i.f7762b);
                if (andSet == null) {
                    int i9 = AbstractC2237i.f7761a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (atomicReferenceArray.get(i8) == AbstractC2237i.f7763c) {
                            z7 = true;
                            break;
                        }
                    }
                    C1943s c1943s = AbstractC2237i.f7762b;
                    C1943s c1943s2 = AbstractC2237i.f7764d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i8, c1943s, c1943s2)) {
                            if (atomicReferenceArray.get(i8) != c1943s) {
                                break;
                            }
                        } else {
                            z7 = true;
                            break;
                        }
                    }
                    z7 = !z7;
                } else if (andSet != AbstractC2237i.f7765e) {
                    if (!(andSet instanceof InterfaceC1289e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC1289e interfaceC1289e = (InterfaceC1289e) andSet;
                    C1943s c1943sMo2790e = interfaceC1289e.mo2790e(this.f7760b);
                    if (c1943sMo2790e != null) {
                        interfaceC1289e.mo2792j(c1943sMo2790e);
                        z7 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z7);
    }
}
