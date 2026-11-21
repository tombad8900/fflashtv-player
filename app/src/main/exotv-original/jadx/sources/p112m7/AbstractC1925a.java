package p112m7;

import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1213o;
import p076i7.AbstractC1300h1;
import p076i7.AbstractC1314m0;
import p076i7.AbstractC1327r;
import p076i7.AbstractC1339x;
import p076i7.C1279a1;
import p076i7.C1318n1;
import p076i7.C1319o;
import p076i7.C1322p;
import p076i7.C1329s;
import p076i7.InterfaceC1297g1;
import p076i7.InterfaceC1330s0;
import p076i7.InterfaceC1331t;
import p102l6.C1689f;
import p111m6.C1911f;
import p137p6.InterfaceC2222c;
import p137p6.InterfaceC2227h;
import p138p7.C2238j;
import p154r6.AbstractC2320c;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.a */
/* loaded from: classes.dex */
public abstract class AbstractC1925a {

    /* renamed from: a */
    public static final C1943s f7190a = new C1943s("CLOSED", 0);

    /* renamed from: b */
    public static final C1943s f7191b = new C1943s("UNDEFINED", 0);

    /* renamed from: c */
    public static final C1943s f7192c = new C1943s("REUSABLE_CLAIMED", 0);

    /* renamed from: d */
    public static final C1943s f7193d = new C1943s("NO_THREAD_ELEMENTS", 0);

    /* renamed from: e */
    public static final C1322p f7194e = new C1322p(3);

    /* renamed from: f */
    public static final C1322p f7195f = new C1322p(4);

    /* renamed from: g */
    public static final C1322p f7196g = new C1322p(5);

    /* renamed from: a */
    public static final void m3765a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [m7.r] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, m7.r] */
    /* renamed from: b */
    public static final Object m3766b(C2238j c2238j, long j, InterfaceC2855p interfaceC2855p) {
        while (true) {
            if (c2238j.f7231c >= j && !c2238j.mo3774a()) {
                return c2238j;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC1926b.f7197a;
            Object obj = atomicReferenceFieldUpdater.get(c2238j);
            C1943s c1943s = f7190a;
            if (obj == c1943s) {
                return c1943s;
            }
            ?? r1 = (AbstractC1942r) ((AbstractC1926b) obj);
            if (r1 == 0) {
                r1 = (AbstractC1942r) interfaceC2855p.mo576c(Long.valueOf(c2238j.f7231c + 1), c2238j);
                while (!atomicReferenceFieldUpdater.compareAndSet(c2238j, null, r1)) {
                    if (atomicReferenceFieldUpdater.get(c2238j) != null) {
                        break;
                    }
                }
                if (c2238j.mo3774a()) {
                    c2238j.m3775b();
                }
            }
            c2238j = r1;
        }
    }

    /* renamed from: c */
    public static final AbstractC1942r m3767c(Object obj) {
        if (obj != f7190a) {
            return (AbstractC1942r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    /* renamed from: d */
    public static final void m3768d(InterfaceC2227h interfaceC2227h, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC1928d.f7200a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC1331t) it.next()).mo2578p(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0715d.m1557e(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC0715d.m1557e(th, new C1929e(interfaceC2227h));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* renamed from: e */
    public static final void m3769e(InterfaceC2227h interfaceC2227h, Object obj) {
        if (obj == f7193d) {
            return;
        }
        if (!(obj instanceof C1946v)) {
            Object objMo2770t = interfaceC2227h.mo2770t(null, f7195f);
            AbstractC2980h.m5134c("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>", objMo2770t);
            AbstractC0008a1.m22r(objMo2770t);
            throw null;
        }
        C1946v c1946v = (C1946v) obj;
        InterfaceC1297g1[] interfaceC1297g1Arr = c1946v.f7238b;
        int length = interfaceC1297g1Arr.length - 1;
        if (length < 0) {
            return;
        }
        InterfaceC1297g1 interfaceC1297g1 = interfaceC1297g1Arr[length];
        AbstractC2980h.m5133b(null);
        Object obj2 = c1946v.f7237a[length];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0095 A[Catch: all -> 0x0075, DONT_GENERATE, TryCatch #2 {all -> 0x0075, blocks: (B:19:0x0054, B:21:0x0061, B:23:0x0067, B:36:0x0098, B:26:0x0077, B:28:0x0084, B:33:0x008f, B:35:0x0095, B:41:0x00a5, B:44:0x00ae, B:43:0x00ab, B:31:0x008a), top: B:57:0x0054, inners: #0 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3770f(Object obj, InterfaceC2222c interfaceC2222c) {
        InterfaceC1330s0 interfaceC1330s0;
        if (!(interfaceC2222c instanceof C1930f)) {
            interfaceC2222c.mo2248d(obj);
            return;
        }
        C1930f c1930f = (C1930f) interfaceC2222c;
        AbstractC1327r abstractC1327r = c1930f.f7203m;
        AbstractC2320c abstractC2320c = c1930f.f7204n;
        InterfaceC2227h interfaceC2227h = abstractC2320c.f8131k;
        Throwable thM3382a = C1689f.m3382a(obj);
        Object c1319o = thM3382a == null ? obj : new C1319o(thM3382a, false);
        AbstractC2980h.m5133b(interfaceC2227h);
        if (abstractC1327r.mo2838E(interfaceC2227h)) {
            c1930f.f7205o = c1319o;
            c1930f.f5315l = 1;
            AbstractC2980h.m5133b(interfaceC2227h);
            abstractC1327r.mo2822D(interfaceC2227h, c1930f);
            return;
        }
        AbstractC1314m0 abstractC1314m0M2815a = AbstractC1300h1.m2815a();
        if (abstractC1314m0M2815a.f5347l >= 4294967296L) {
            c1930f.f7205o = c1319o;
            c1930f.f5315l = 1;
            C1911f c1911f = abstractC1314m0M2815a.f5349n;
            if (c1911f == null) {
                c1911f = new C1911f();
                abstractC1314m0M2815a.f5349n = c1911f;
            }
            c1911f.addLast(c1930f);
            return;
        }
        abstractC1314m0M2815a.m2832I(true);
        try {
            AbstractC2980h.m5133b(interfaceC2227h);
            interfaceC1330s0 = (InterfaceC1330s0) interfaceC2227h.mo2760b(C1329s.f5369k);
        } finally {
            try {
            } finally {
            }
        }
        if (interfaceC1330s0 == null || interfaceC1330s0.isActive()) {
            Object obj2 = c1930f.f7206p;
            AbstractC2980h.m5133b(interfaceC2227h);
            Object objM3773i = m3773i(interfaceC2227h, obj2);
            C1318n1 c1318n1M2856q = objM3773i != f7193d ? AbstractC1339x.m2856q(abstractC2320c, interfaceC2227h, objM3773i) : null;
            try {
                abstractC2320c.mo2248d(obj);
            } finally {
                if (c1318n1M2856q == null || c1318n1M2856q.m2836U()) {
                    m3769e(interfaceC2227h, objM3773i);
                }
            }
        }
        c1930f.mo2248d(AbstractC0714c.m1539y(((C1279a1) interfaceC1330s0).m2772v()));
        while (abstractC1314m0M2815a.m2833J()) {
        }
    }

    /* renamed from: g */
    public static final long m3771g(String str, long j, long j8, long j9) {
        String property;
        int i = AbstractC1944t.f7234a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM2659l0 = AbstractC1213o.m2659l0(property);
        if (lM2659l0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM2659l0.longValue();
        if (j8 <= jLongValue && jLongValue <= j9) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j8 + ".." + j9 + ", but is '" + jLongValue + '\'').toString());
    }

    /* renamed from: h */
    public static int m3772h(String str, int i, int i4) {
        return (int) m3771g(str, i, 1, (i4 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* renamed from: i */
    public static final Object m3773i(InterfaceC2227h interfaceC2227h, Object obj) {
        if (obj == null) {
            obj = interfaceC2227h.mo2770t(0, f7194e);
            AbstractC2980h.m5133b(obj);
        }
        if (obj == 0) {
            return f7193d;
        }
        if (obj instanceof Integer) {
            return interfaceC2227h.mo2770t(new C1946v(interfaceC2227h, ((Number) obj).intValue()), f7196g);
        }
        AbstractC0008a1.m22r(obj);
        throw null;
    }
}
