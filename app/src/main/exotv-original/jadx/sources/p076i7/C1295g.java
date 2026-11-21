package p076i7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002a1.C0048u;
import p102l6.C1689f;
import p102l6.C1693j;
import p111m6.C1911f;
import p112m7.AbstractC1925a;
import p112m7.AbstractC1942r;
import p112m7.C1930f;
import p112m7.C1943s;
import p137p6.InterfaceC2222c;
import p137p6.InterfaceC2227h;
import p138p7.C2238j;
import p146q6.EnumC2273a;
import p154r6.InterfaceC2321d;
import p212y6.InterfaceC2851l;
import p212y6.InterfaceC2856q;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.g */
/* loaded from: classes.dex */
public class C1295g extends AbstractC1287d0 implements InterfaceC1289e, InterfaceC2321d, InterfaceC1324p1 {

    /* renamed from: o */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5319o = AtomicIntegerFieldUpdater.newUpdater(C1295g.class, "_decisionAndIndex$volatile");

    /* renamed from: p */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5320p = AtomicReferenceFieldUpdater.newUpdater(C1295g.class, Object.class, "_state$volatile");

    /* renamed from: q */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5321q = AtomicReferenceFieldUpdater.newUpdater(C1295g.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: m */
    public final InterfaceC2222c f5322m;

    /* renamed from: n */
    public final InterfaceC2227h f5323n;

    public C1295g(int i, InterfaceC2222c interfaceC2222c) {
        super(i);
        this.f5322m = interfaceC2222c;
        this.f5323n = interfaceC2222c.mo2249f();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1280b.f5309a;
    }

    /* renamed from: A */
    public static void m2794A(InterfaceC1288d1 interfaceC1288d1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC1288d1 + ", already has " + obj).toString());
    }

    /* renamed from: F */
    public static Object m2795F(InterfaceC1288d1 interfaceC1288d1, Object obj, int i, InterfaceC2856q interfaceC2856q) {
        if (obj instanceof C1319o) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC2856q != null || (interfaceC1288d1 instanceof C1286d)) {
            return new C1316n(obj, interfaceC1288d1 instanceof C1286d ? (C1286d) interfaceC1288d1 : null, interfaceC2856q, (CancellationException) null, 16);
        }
        return obj;
    }

    /* renamed from: B */
    public String mo2796B() {
        return "CancellableContinuation";
    }

    /* renamed from: C */
    public final void m2797C() {
        InterfaceC2222c interfaceC2222c = this.f5322m;
        Throwable th = null;
        C1930f c1930f = interfaceC2222c instanceof C1930f ? (C1930f) interfaceC2222c : null;
        if (c1930f != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1930f.f7202q;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c1930f);
                C1943s c1943s = AbstractC1925a.f7192c;
                if (obj == c1943s) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c1930f, c1943s, this)) {
                        if (atomicReferenceFieldUpdater.get(c1930f) != c1943s) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c1930f, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c1930f) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            m2806r();
            m2805q(th);
        }
    }

    /* renamed from: D */
    public final void m2798D(Object obj, int i, InterfaceC2856q interfaceC2856q) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5320p;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC1288d1) {
                Object objM2795F = m2795F((InterfaceC1288d1) obj2, obj, i, interfaceC2856q);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM2795F)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!m2814z()) {
                    m2806r();
                }
                m2807s(i);
                return;
            }
            if (obj2 instanceof C1298h) {
                C1298h c1298h = (C1298h) obj2;
                if (C1298h.f5325c.compareAndSet(c1298h, 0, 1)) {
                    if (interfaceC2856q != null) {
                        m2803o(interfaceC2856q, c1298h.f5358a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    /* renamed from: E */
    public final void m2799E(AbstractC1327r abstractC1327r) {
        InterfaceC2222c interfaceC2222c = this.f5322m;
        C1930f c1930f = interfaceC2222c instanceof C1930f ? (C1930f) interfaceC2222c : null;
        m2798D(C1693j.f6497a, (c1930f != null ? c1930f.f7203m : null) == abstractC1327r ? 4 : this.f5315l, null);
    }

    @Override // p154r6.InterfaceC2321d
    /* renamed from: a */
    public final InterfaceC2321d mo2800a() {
        InterfaceC2222c interfaceC2222c = this.f5322m;
        if (interfaceC2222c instanceof InterfaceC2321d) {
            return (InterfaceC2321d) interfaceC2222c;
        }
        return null;
    }

    @Override // p076i7.InterfaceC1324p1
    /* renamed from: b */
    public final void mo2801b(C2238j c2238j, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f5319o;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i));
        m2813y(c2238j);
    }

    @Override // p076i7.AbstractC1287d0
    /* renamed from: c */
    public final void mo2784c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5320p;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC1288d1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C1319o) {
                return;
            }
            if (!(obj instanceof C1316n)) {
                cancellationException2 = cancellationException;
                C1316n c1316n = new C1316n(obj, (C1286d) null, (InterfaceC2856q) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1316n)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C1316n c1316n2 = (C1316n) obj;
            if (c1316n2.f5355e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C1316n c1316nM2835a = C1316n.m2835a(c1316n2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1316nM2835a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            C1286d c1286d = c1316n2.f5352b;
            if (c1286d != null) {
                m2802n(c1286d, cancellationException);
            }
            InterfaceC2856q interfaceC2856q = c1316n2.f5353c;
            if (interfaceC2856q != null) {
                m2803o(interfaceC2856q, cancellationException, c1316n2.f5351a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // p137p6.InterfaceC2222c
    /* renamed from: d */
    public final void mo2248d(Object obj) {
        Throwable thM3382a = C1689f.m3382a(obj);
        if (thM3382a != null) {
            obj = new C1319o(thM3382a, false);
        }
        m2798D(obj, this.f5315l, null);
    }

    @Override // p076i7.InterfaceC1289e
    /* renamed from: e */
    public final C1943s mo2790e(InterfaceC2856q interfaceC2856q) {
        C1943s c1943s = AbstractC1339x.f5375a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5320p;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC1288d1)) {
                return null;
            }
            Object objM2795F = m2795F((InterfaceC1288d1) obj, C1693j.f6497a, this.f5315l, interfaceC2856q);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, objM2795F)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!m2814z()) {
                m2806r();
            }
            return c1943s;
        }
    }

    @Override // p137p6.InterfaceC2222c
    /* renamed from: f */
    public final InterfaceC2227h mo2249f() {
        return this.f5323n;
    }

    @Override // p076i7.AbstractC1287d0
    /* renamed from: g */
    public final InterfaceC2222c mo2785g() {
        return this.f5322m;
    }

    @Override // p076i7.AbstractC1287d0
    /* renamed from: h */
    public final Throwable mo2786h(Object obj) {
        Throwable thMo2786h = super.mo2786h(obj);
        if (thMo2786h != null) {
            return thMo2786h;
        }
        return null;
    }

    @Override // p076i7.InterfaceC1289e
    /* renamed from: i */
    public final void mo2791i(C1292f c1292f) {
        m2798D(C1693j.f6497a, this.f5315l, c1292f);
    }

    @Override // p076i7.InterfaceC1289e
    /* renamed from: j */
    public final void mo2792j(Object obj) {
        m2807s(this.f5315l);
    }

    @Override // p076i7.AbstractC1287d0
    /* renamed from: k */
    public final Object mo2787k(Object obj) {
        return obj instanceof C1316n ? ((C1316n) obj).f5351a : obj;
    }

    @Override // p076i7.AbstractC1287d0
    /* renamed from: m */
    public final Object mo2789m() {
        return f5320p.get(this);
    }

    /* renamed from: n */
    public final void m2802n(C1286d c1286d, Throwable th) {
        try {
            switch (c1286d.f5313a) {
                case 0:
                    ((InterfaceC2851l) c1286d.f5314b).invoke(th);
                    break;
                default:
                    ((InterfaceC1293f0) c1286d.f5314b).mo2783c();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC1339x.m2848i(this.f5323n, new C0048u("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: o */
    public final void m2803o(InterfaceC2856q interfaceC2856q, Throwable th, Object obj) {
        InterfaceC2227h interfaceC2227h = this.f5323n;
        try {
            interfaceC2856q.mo2793b(th, obj, interfaceC2227h);
        } catch (Throwable th2) {
            AbstractC1339x.m2848i(interfaceC2227h, new C0048u("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: p */
    public final void m2804p(AbstractC1942r abstractC1942r, Throwable th) {
        int i = f5319o.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC1942r.mo3795e(i);
        } catch (Throwable th2) {
            AbstractC1339x.m2848i(this.f5323n, new C0048u("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: q */
    public final void m2805q(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5320p;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC1288d1) {
                C1298h c1298h = new C1298h(this, th, (obj instanceof C1286d) || (obj instanceof AbstractC1942r));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1298h)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                InterfaceC1288d1 interfaceC1288d1 = (InterfaceC1288d1) obj;
                if (interfaceC1288d1 instanceof C1286d) {
                    m2802n((C1286d) obj, th);
                } else if (interfaceC1288d1 instanceof AbstractC1942r) {
                    m2804p((AbstractC1942r) obj, th);
                }
                if (!m2814z()) {
                    m2806r();
                }
                m2807s(this.f5315l);
                return;
            }
            return;
        }
    }

    /* renamed from: r */
    public final void m2806r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5321q;
        InterfaceC1293f0 interfaceC1293f0 = (InterfaceC1293f0) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1293f0 == null) {
            return;
        }
        interfaceC1293f0.mo2783c();
        atomicReferenceFieldUpdater.set(this, C1285c1.f5312j);
    }

    /* renamed from: s */
    public final void m2807s(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f5319o;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i8 = i4 >> 29;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z7 = i == 4;
                InterfaceC2222c interfaceC2222c = this.f5322m;
                if (!z7 && (interfaceC2222c instanceof C1930f)) {
                    boolean z8 = i == 1 || i == 2;
                    int i9 = this.f5315l;
                    if (z8 == (i9 == 1 || i9 == 2)) {
                        C1930f c1930f = (C1930f) interfaceC2222c;
                        AbstractC1327r abstractC1327r = c1930f.f7203m;
                        InterfaceC2227h interfaceC2227h = c1930f.f7204n.f8131k;
                        AbstractC2980h.m5133b(interfaceC2227h);
                        if (abstractC1327r.mo2838E(interfaceC2227h)) {
                            abstractC1327r.mo2822D(interfaceC2227h, this);
                            return;
                        }
                        AbstractC1314m0 abstractC1314m0M2815a = AbstractC1300h1.m2815a();
                        if (abstractC1314m0M2815a.f5347l >= 4294967296L) {
                            C1911f c1911f = abstractC1314m0M2815a.f5349n;
                            if (c1911f == null) {
                                c1911f = new C1911f();
                                abstractC1314m0M2815a.f5349n = c1911f;
                            }
                            c1911f.addLast(this);
                            return;
                        }
                        abstractC1314m0M2815a.m2832I(true);
                        try {
                            AbstractC1339x.m2852m(this, interfaceC2222c, true);
                            do {
                            } while (abstractC1314m0M2815a.m2833J());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC1339x.m2852m(this, interfaceC2222c, z7);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    /* renamed from: t */
    public Throwable mo2808t(C1279a1 c1279a1) {
        return c1279a1.m2772v();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo2796B());
        sb.append('(');
        sb.append(AbstractC1339x.m2854o(this.f5322m));
        sb.append("){");
        Object obj = f5320p.get(this);
        sb.append(obj instanceof InterfaceC1288d1 ? "Active" : obj instanceof C1298h ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC1339x.m2845f(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final Object m2809u() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        InterfaceC1330s0 interfaceC1330s0;
        boolean zM2814z = m2814z();
        do {
            atomicIntegerFieldUpdater = f5319o;
            i = atomicIntegerFieldUpdater.get(this);
            int i4 = i >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM2814z) {
                    m2797C();
                }
                Object obj = f5320p.get(this);
                if (obj instanceof C1319o) {
                    throw ((C1319o) obj).f5358a;
                }
                int i8 = this.f5315l;
                if ((i8 != 1 && i8 != 2) || (interfaceC1330s0 = (InterfaceC1330s0) this.f5323n.mo2760b(C1329s.f5369k)) == null || interfaceC1330s0.isActive()) {
                    return mo2787k(obj);
                }
                CancellationException cancellationExceptionM2772v = ((C1279a1) interfaceC1330s0).m2772v();
                mo2784c(cancellationExceptionM2772v);
                throw cancellationExceptionM2772v;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC1293f0) f5321q.get(this)) == null) {
            m2811w();
        }
        if (zM2814z) {
            m2797C();
        }
        return EnumC2273a.f7953j;
    }

    /* renamed from: v */
    public final void m2810v() {
        InterfaceC1293f0 interfaceC1293f0M2811w = m2811w();
        if (interfaceC1293f0M2811w == null || (f5320p.get(this) instanceof InterfaceC1288d1)) {
            return;
        }
        interfaceC1293f0M2811w.mo2783c();
        f5321q.set(this, C1285c1.f5312j);
    }

    /* renamed from: w */
    public final InterfaceC1293f0 m2811w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1330s0 interfaceC1330s0 = (InterfaceC1330s0) this.f5323n.mo2760b(C1329s.f5369k);
        if (interfaceC1330s0 == null) {
            return null;
        }
        InterfaceC1293f0 interfaceC1293f0M2849j = AbstractC1339x.m2849j(interfaceC1330s0, true, new C1301i(0, this));
        do {
            atomicReferenceFieldUpdater = f5321q;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC1293f0M2849j)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC1293f0M2849j;
    }

    /* renamed from: x */
    public final void m2812x(InterfaceC2851l interfaceC2851l) {
        m2813y(new C1286d(0, interfaceC2851l));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        m2794A(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        throw null;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2813y(InterfaceC1288d1 interfaceC1288d1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5320p;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C1280b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, interfaceC1288d1)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof C1286d) || (obj instanceof AbstractC1942r)) {
                break;
            }
            if (obj instanceof C1319o) {
                C1319o c1319o = (C1319o) obj;
                if (!C1319o.f5357b.compareAndSet(c1319o, 0, 1)) {
                    m2794A(interfaceC1288d1, obj);
                    throw null;
                }
                if (obj instanceof C1298h) {
                    Throwable th = c1319o.f5358a;
                    if (interfaceC1288d1 instanceof C1286d) {
                        m2802n((C1286d) interfaceC1288d1, th);
                        return;
                    } else {
                        m2804p((AbstractC1942r) interfaceC1288d1, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C1316n)) {
                if (interfaceC1288d1 instanceof AbstractC1942r) {
                    return;
                }
                C1316n c1316n = new C1316n(obj, (C1286d) interfaceC1288d1, (InterfaceC2856q) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1316n)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C1316n c1316n2 = (C1316n) obj;
            if (c1316n2.f5352b != null) {
                m2794A(interfaceC1288d1, obj);
                throw null;
            }
            if (interfaceC1288d1 instanceof AbstractC1942r) {
                return;
            }
            C1286d c1286d = (C1286d) interfaceC1288d1;
            Throwable th2 = c1316n2.f5355e;
            if (th2 != null) {
                m2802n(c1286d, th2);
                return;
            }
            C1316n c1316nM2835a = C1316n.m2835a(c1316n2, c1286d, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1316nM2835a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* renamed from: z */
    public final boolean m2814z() {
        if (this.f5315l != 2) {
            return false;
        }
        InterfaceC2222c interfaceC2222c = this.f5322m;
        AbstractC2980h.m5134c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", interfaceC2222c);
        return C1930f.f7202q.get((C1930f) interfaceC2222c) != null;
    }
}
