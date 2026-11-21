package p076i7;

import android.support.v4.media.session.AbstractC0120b;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p086j7.C1534d;
import p102l6.C1689f;
import p102l6.C1693j;
import p112m7.AbstractC1925a;
import p112m7.C1927c;
import p112m7.C1930f;
import p112m7.C1941q;
import p112m7.C1943s;
import p127o7.C2054e;
import p137p6.C2223d;
import p137p6.C2228i;
import p137p6.InterfaceC2222c;
import p137p6.InterfaceC2225f;
import p137p6.InterfaceC2227h;
import p146q6.C2274b;
import p146q6.C2275c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2318a;
import p154r6.AbstractC2320c;
import p154r6.InterfaceC2321d;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2989q;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.x */
/* loaded from: classes.dex */
public abstract class AbstractC1339x {

    /* renamed from: a */
    public static final C1943s f5375a = new C1943s("RESUME_TOKEN", 0);

    /* renamed from: b */
    public static final C1943s f5376b = new C1943s("REMOVED_TASK", 0);

    /* renamed from: c */
    public static final C1943s f5377c = new C1943s("CLOSED_EMPTY", 0);

    /* renamed from: d */
    public static final C1943s f5378d = new C1943s("COMPLETING_ALREADY", 0);

    /* renamed from: e */
    public static final C1943s f5379e = new C1943s("COMPLETING_WAITING_CHILDREN", 0);

    /* renamed from: f */
    public static final C1943s f5380f = new C1943s("COMPLETING_RETRY", 0);

    /* renamed from: g */
    public static final C1943s f5381g = new C1943s("TOO_LATE_TO_CANCEL", 0);

    /* renamed from: h */
    public static final C1943s f5382h = new C1943s("SEALED", 0);

    /* renamed from: i */
    public static final C1296g0 f5383i = new C1296g0(false);

    /* renamed from: j */
    public static final C1296g0 f5384j = new C1296g0(true);

    /* renamed from: a */
    public static final C1927c m2840a(InterfaceC2227h interfaceC2227h) {
        if (interfaceC2227h.mo2760b(C1329s.f5369k) == null) {
            interfaceC2227h = interfaceC2227h.mo2761c(new C1334u0());
        }
        return new C1927c(interfaceC2227h);
    }

    /* renamed from: b */
    public static void m2841b(InterfaceC1330s0 interfaceC1330s0) {
        C1279a1 c1279a1 = (C1279a1) interfaceC1330s0;
        c1279a1.getClass();
        c1279a1.m2765m(new C1332t0(c1279a1.mo2742o(), null, c1279a1));
    }

    /* renamed from: c */
    public static void m2842c(C1927c c1927c) {
        InterfaceC1330s0 interfaceC1330s0 = (InterfaceC1330s0) c1927c.f7199j.mo2760b(C1329s.f5369k);
        if (interfaceC1330s0 != null) {
            C1279a1 c1279a1 = (C1279a1) interfaceC1330s0;
            c1279a1.m2765m(new C1332t0(c1279a1.mo2742o(), null, c1279a1));
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + c1927c).toString());
        }
    }

    /* renamed from: d */
    public static final InterfaceC2227h m2843d(InterfaceC2227h interfaceC2227h, InterfaceC2227h interfaceC2227h2, boolean z7) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC2227h.mo2770t(bool, new C1322p(0))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC2227h2.mo2770t(bool, new C1322p(0))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC2227h.mo2761c(interfaceC2227h2);
        }
        C1322p c1322p = new C1322p(1);
        C2228i c2228i = C2228i.f7747j;
        InterfaceC2227h interfaceC2227h3 = (InterfaceC2227h) interfaceC2227h.mo2770t(c2228i, c1322p);
        Object objMo2770t = interfaceC2227h2;
        if (zBooleanValue2) {
            objMo2770t = interfaceC2227h2.mo2770t(c2228i, new C1322p(2));
        }
        return interfaceC2227h3.mo2761c((InterfaceC2227h) objMo2770t);
    }

    /* renamed from: e */
    public static final InterfaceC1281b0 m2844e(InterfaceC2227h interfaceC2227h) {
        InterfaceC2225f interfaceC2225fMo2760b = interfaceC2227h.mo2760b(C2223d.f7746j);
        InterfaceC1281b0 interfaceC1281b0 = interfaceC2225fMo2760b instanceof InterfaceC1281b0 ? (InterfaceC1281b0) interfaceC2225fMo2760b : null;
        return interfaceC1281b0 == null ? AbstractC1343z.f5392a : interfaceC1281b0;
    }

    /* renamed from: f */
    public static final String m2845f(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: g */
    public static final InterfaceC1330s0 m2846g(InterfaceC2227h interfaceC2227h) {
        InterfaceC1330s0 interfaceC1330s0 = (InterfaceC1330s0) interfaceC2227h.mo2760b(C1329s.f5369k);
        if (interfaceC1330s0 != null) {
            return interfaceC1330s0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC2227h).toString());
    }

    /* renamed from: h */
    public static final C1295g m2847h(InterfaceC2222c interfaceC2222c) {
        C1295g c1295g;
        C1295g c1295g2;
        if (!(interfaceC2222c instanceof C1930f)) {
            return new C1295g(1, interfaceC2222c);
        }
        C1930f c1930f = (C1930f) interfaceC2222c;
        C1943s c1943s = AbstractC1925a.f7192c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1930f.f7202q;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c1930f);
            c1295g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c1930f, c1943s);
                c1295g2 = null;
                break;
            }
            if (obj instanceof C1295g) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c1930f, obj, c1943s)) {
                    if (atomicReferenceFieldUpdater.get(c1930f) != obj) {
                        break;
                    }
                }
                c1295g2 = (C1295g) obj;
                break loop0;
            }
            if (obj != c1943s && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c1295g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1295g.f5320p;
            Object obj2 = atomicReferenceFieldUpdater2.get(c1295g2);
            if (!(obj2 instanceof C1316n) || ((C1316n) obj2).f5354d == null) {
                C1295g.f5319o.set(c1295g2, 536870911);
                atomicReferenceFieldUpdater2.set(c1295g2, C1280b.f5309a);
                c1295g = c1295g2;
            } else {
                c1295g2.m2806r();
            }
            if (c1295g != null) {
                return c1295g;
            }
        }
        return new C1295g(2, interfaceC2222c);
    }

    /* renamed from: i */
    public static final void m2848i(InterfaceC2227h interfaceC2227h, Throwable th) {
        try {
            InterfaceC1331t interfaceC1331t = (InterfaceC1331t) interfaceC2227h.mo2760b(C1329s.f5368j);
            if (interfaceC1331t != null) {
                interfaceC1331t.mo2578p(th);
            } else {
                AbstractC1925a.m3768d(interfaceC2227h, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0715d.m1557e(runtimeException, th);
                th = runtimeException;
            }
            AbstractC1925a.m3768d(interfaceC2227h, th);
        }
    }

    /* renamed from: j */
    public static final InterfaceC1293f0 m2849j(InterfaceC1330s0 interfaceC1330s0, boolean z7, AbstractC1338w0 abstractC1338w0) {
        if (interfaceC1330s0 instanceof C1279a1) {
            return ((C1279a1) interfaceC1330s0).m2747D(z7, abstractC1338w0);
        }
        boolean zMo2816j = abstractC1338w0.mo2816j();
        C1336v0 c1336v0 = new C1336v0(1, abstractC1338w0, AbstractC1338w0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0);
        return ((C1279a1) interfaceC1330s0).m2747D(z7, zMo2816j ? new C1328r0(c1336v0) : new C1301i(2, c1336v0));
    }

    /* renamed from: k */
    public static C1278a0 m2850k(InterfaceC1333u interfaceC1333u, C1534d c1534d, InterfaceC2855p interfaceC2855p, int i) {
        boolean z7 = true;
        boolean z8 = true;
        InterfaceC2227h interfaceC2227h = c1534d;
        if ((i & 1) != 0) {
            interfaceC2227h = C2228i.f7747j;
        }
        EnumC1335v enumC1335v = EnumC1335v.f5372j;
        InterfaceC2227h interfaceC2227hM2843d = m2843d(interfaceC1333u.mo579h(), interfaceC2227h, true);
        C2054e c2054e = AbstractC1290e0.f5316a;
        if (interfaceC2227hM2843d != c2054e && interfaceC2227hM2843d.mo2760b(C2223d.f7746j) == null) {
            interfaceC2227hM2843d = interfaceC2227hM2843d.mo2761c(c2054e);
        }
        EnumC1335v enumC1335v2 = EnumC1335v.f5372j;
        C1278a0 c1278a0 = new C1278a0(interfaceC2227hM2843d, z7, z8 ? 1 : 0);
        c1278a0.m2741T(enumC1335v, c1278a0, interfaceC2855p);
        return c1278a0;
    }

    /* renamed from: l */
    public static final Object m2851l(Object obj) {
        return obj instanceof C1319o ? AbstractC0714c.m1539y(((C1319o) obj).f5358a) : obj;
    }

    /* renamed from: m */
    public static final void m2852m(C1295g c1295g, InterfaceC2222c interfaceC2222c, boolean z7) {
        Object obj = C1295g.f5320p.get(c1295g);
        Throwable thMo2786h = c1295g.mo2786h(obj);
        Object objM1539y = thMo2786h != null ? AbstractC0714c.m1539y(thMo2786h) : c1295g.mo2787k(obj);
        if (!z7) {
            interfaceC2222c.mo2248d(objM1539y);
            return;
        }
        AbstractC2980h.m5134c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>", interfaceC2222c);
        C1930f c1930f = (C1930f) interfaceC2222c;
        AbstractC2320c abstractC2320c = c1930f.f7204n;
        Object obj2 = c1930f.f7206p;
        InterfaceC2227h interfaceC2227h = abstractC2320c.f8131k;
        AbstractC2980h.m5133b(interfaceC2227h);
        Object objM3773i = AbstractC1925a.m3773i(interfaceC2227h, obj2);
        C1318n1 c1318n1M2856q = objM3773i != AbstractC1925a.f7193d ? m2856q(abstractC2320c, interfaceC2227h, objM3773i) : null;
        try {
            abstractC2320c.mo2248d(objM1539y);
            if (c1318n1M2856q == null || c1318n1M2856q.m2836U()) {
                AbstractC1925a.m3769e(interfaceC2227h, objM3773i);
            }
        } catch (Throwable th) {
            if (c1318n1M2856q == null || c1318n1M2856q.m2836U()) {
                AbstractC1925a.m3769e(interfaceC2227h, objM3773i);
            }
            throw th;
        }
    }

    /* renamed from: n */
    public static final Object m2853n(RunnableC1309k1 runnableC1309k1, InterfaceC2855p interfaceC2855p) throws Throwable {
        Object c1319o;
        Object objM2751H;
        m2849j(runnableC1309k1, true, new C1301i(1, m2844e(runnableC1309k1.f7229m.mo2249f()).mo2777k(runnableC1309k1.f5340n, runnableC1309k1, runnableC1309k1.f5305l)));
        try {
            if (interfaceC2855p instanceof AbstractC2318a) {
                AbstractC2989q.m5145b(interfaceC2855p);
                c1319o = interfaceC2855p.mo576c(runnableC1309k1, runnableC1309k1);
            } else {
                AbstractC2980h.m5136e("<this>", interfaceC2855p);
                InterfaceC2227h interfaceC2227h = runnableC1309k1.f5305l;
                Object c2274b = interfaceC2227h == C2228i.f7747j ? new C2274b(runnableC1309k1) : new C2275c(runnableC1309k1, interfaceC2227h);
                AbstractC2989q.m5145b(interfaceC2855p);
                c1319o = interfaceC2855p.mo576c(runnableC1309k1, c2274b);
            }
        } catch (Throwable th) {
            c1319o = new C1319o(th, false);
        }
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        if (c1319o == enumC2273a || (objM2751H = runnableC1309k1.m2751H(c1319o)) == f5379e) {
            return enumC2273a;
        }
        if (objM2751H instanceof C1319o) {
            Throwable th2 = ((C1319o) objM2751H).f5358a;
            if (!(th2 instanceof C1306j1) || ((C1306j1) th2).f5337j != runnableC1309k1) {
                throw th2;
            }
            if (c1319o instanceof C1319o) {
                throw ((C1319o) c1319o).f5358a;
            }
        } else {
            c1319o = m2855p(objM2751H);
        }
        return c1319o;
    }

    /* renamed from: o */
    public static final String m2854o(InterfaceC2222c interfaceC2222c) {
        Object objM1539y;
        if (interfaceC2222c instanceof C1930f) {
            return ((C1930f) interfaceC2222c).toString();
        }
        try {
            objM1539y = interfaceC2222c + '@' + m2845f(interfaceC2222c);
        } catch (Throwable th) {
            objM1539y = AbstractC0714c.m1539y(th);
        }
        if (C1689f.m3382a(objM1539y) != null) {
            objM1539y = interfaceC2222c.getClass().getName() + '@' + m2845f(interfaceC2222c);
        }
        return (String) objM1539y;
    }

    /* renamed from: p */
    public static final Object m2855p(Object obj) {
        InterfaceC1323p0 interfaceC1323p0;
        C1326q0 c1326q0 = obj instanceof C1326q0 ? (C1326q0) obj : null;
        return (c1326q0 == null || (interfaceC1323p0 = c1326q0.f5364a) == null) ? obj : interfaceC1323p0;
    }

    /* renamed from: q */
    public static final C1318n1 m2856q(InterfaceC2222c interfaceC2222c, InterfaceC2227h interfaceC2227h, Object obj) {
        C1318n1 c1318n1 = null;
        if ((interfaceC2222c instanceof InterfaceC2321d) && interfaceC2227h.mo2760b(C1321o1.f5360j) != null) {
            InterfaceC2321d interfaceC2321dMo2800a = (InterfaceC2321d) interfaceC2222c;
            while (true) {
                if ((interfaceC2321dMo2800a instanceof C1284c0) || (interfaceC2321dMo2800a = interfaceC2321dMo2800a.mo2800a()) == null) {
                    break;
                }
                if (interfaceC2321dMo2800a instanceof C1318n1) {
                    c1318n1 = (C1318n1) interfaceC2321dMo2800a;
                    break;
                }
            }
            if (c1318n1 != null) {
                c1318n1.m2837V(interfaceC2227h, obj);
            }
        }
        return c1318n1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public static final Object m2857r(InterfaceC2227h interfaceC2227h, InterfaceC2855p interfaceC2855p, InterfaceC2222c interfaceC2222c) throws Throwable {
        Object objM2855p;
        InterfaceC2227h interfaceC2227hMo2249f = interfaceC2222c.mo2249f();
        InterfaceC2227h interfaceC2227hMo2761c = !((Boolean) interfaceC2227h.mo2770t(Boolean.FALSE, new C1322p(0))).booleanValue() ? interfaceC2227hMo2249f.mo2761c(interfaceC2227h) : m2843d(interfaceC2227hMo2249f, interfaceC2227h, false);
        InterfaceC1330s0 interfaceC1330s0 = (InterfaceC1330s0) interfaceC2227hMo2761c.mo2760b(C1329s.f5369k);
        if (interfaceC1330s0 != null && !interfaceC1330s0.isActive()) {
            throw ((C1279a1) interfaceC1330s0).m2772v();
        }
        if (interfaceC2227hMo2761c == interfaceC2227hMo2249f) {
            C1941q c1941q = new C1941q(interfaceC2222c, interfaceC2227hMo2761c);
            objM2855p = AbstractC0120b.m402M(c1941q, c1941q, interfaceC2855p);
        } else {
            C2223d c2223d = C2223d.f7746j;
            if (AbstractC2980h.m5132a(interfaceC2227hMo2761c.mo2760b(c2223d), interfaceC2227hMo2249f.mo2760b(c2223d))) {
                C1318n1 c1318n1 = new C1318n1(interfaceC2222c, interfaceC2227hMo2761c);
                InterfaceC2227h interfaceC2227h2 = c1318n1.f5305l;
                Object objM3773i = AbstractC1925a.m3773i(interfaceC2227h2, null);
                try {
                    Object objM402M = AbstractC0120b.m402M(c1318n1, c1318n1, interfaceC2855p);
                    AbstractC1925a.m3769e(interfaceC2227h2, objM3773i);
                    objM2855p = objM402M;
                } catch (Throwable th) {
                    AbstractC1925a.m3769e(interfaceC2227h2, objM3773i);
                    throw th;
                }
            } else {
                C1284c0 c1284c0 = new C1284c0(interfaceC2222c, interfaceC2227hMo2761c);
                try {
                    AbstractC1925a.m3770f(C1693j.f6497a, AbstractC0715d.m1547P(((AbstractC2318a) interfaceC2855p).mo577g(c1284c0, c1284c0)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1284c0.f5311n;
                    while (true) {
                        int i = atomicIntegerFieldUpdater.get(c1284c0);
                        if (i != 0) {
                            if (i != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objM2855p = m2855p(C1279a1.f5307j.get(c1284c0));
                            if (objM2855p instanceof C1319o) {
                                throw ((C1319o) objM2855p).f5358a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(c1284c0, 0, 1)) {
                            objM2855p = EnumC2273a.f7953j;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    c1284c0.mo2248d(AbstractC0714c.m1539y(th2));
                    throw th2;
                }
            }
        }
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        return objM2855p;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2858s(long j, InterfaceC2855p interfaceC2855p, AbstractC2320c abstractC2320c) throws Throwable {
        C1312l1 c1312l1;
        C2986n c2986n;
        if (abstractC2320c instanceof C1312l1) {
            c1312l1 = (C1312l1) abstractC2320c;
            int i = c1312l1.f5346o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1312l1.f5346o = i - Integer.MIN_VALUE;
            } else {
                c1312l1 = new C1312l1(abstractC2320c);
            }
        }
        Object obj = c1312l1.f5345n;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c1312l1.f5346o;
        if (i4 == 0) {
            AbstractC0714c.m1516d0(obj);
            if (j <= 0) {
                return null;
            }
            C2986n c2986n2 = new C2986n();
            try {
                c1312l1.f5344m = c2986n2;
                c1312l1.f5346o = 1;
                RunnableC1309k1 runnableC1309k1 = new RunnableC1309k1(j, c1312l1);
                c2986n2.f11117j = runnableC1309k1;
                Object objM2853n = m2853n(runnableC1309k1, interfaceC2855p);
                return objM2853n == enumC2273a ? enumC2273a : objM2853n;
            } catch (C1306j1 e) {
                e = e;
                c2986n = c2986n2;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2986n = c1312l1.f5344m;
            try {
                AbstractC0714c.m1516d0(obj);
                return obj;
            } catch (C1306j1 e8) {
                e = e8;
            }
        }
        if (e.f5337j == c2986n.f11117j) {
            return null;
        }
        throw e;
    }
}
