package p005a4;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C0716e;
import com.bumptech.glide.EnumC0717f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p002a1.C0036o;
import p023c4.C0642f;
import p033d4.ExecutorServiceC0846e;
import p062h.ExecutorC1088n;
import p104m.C1755o2;
import p144q4.C2270f;
import p178u4.AbstractC2472g;
import p178u4.C2467b;
import p178u4.C2473h;
import p210y3.C2804h;
import p210y3.InterfaceC2801e;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.q */
/* loaded from: classes.dex */
public final class C0096q implements InterfaceC0101v, InterfaceC0103x {

    /* renamed from: h */
    public static final boolean f445h = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C0074c0 f446a;

    /* renamed from: b */
    public final C2819f f447b;

    /* renamed from: c */
    public final C0642f f448c;

    /* renamed from: d */
    public final C1755o2 f449d;

    /* renamed from: e */
    public final C0088j0 f450e;

    /* renamed from: f */
    public final C0094o f451f;

    /* renamed from: g */
    public final C0073c f452g;

    public C0096q(C0642f c0642f, C0036o c0036o, ExecutorServiceC0846e executorServiceC0846e, ExecutorServiceC0846e executorServiceC0846e2, ExecutorServiceC0846e executorServiceC0846e3, ExecutorServiceC0846e executorServiceC0846e4) throws Throwable {
        this.f448c = c0642f;
        C0095p c0095p = new C0095p(c0036o);
        C0073c c0073c = new C0073c();
        this.f452g = c0073c;
        synchronized (this) {
            try {
                synchronized (c0073c) {
                    try {
                        try {
                            c0073c.f326m = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.f447b = new C2819f(3);
                this.f446a = new C0074c0(0);
                this.f449d = new C1755o2(executorServiceC0846e, executorServiceC0846e2, executorServiceC0846e3, executorServiceC0846e4, this, this);
                this.f451f = new C0094o(c0095p);
                this.f450e = new C0088j0(0);
                c0642f.f2535d = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* renamed from: c */
    public static void m354c(String str, long j, C0102w c0102w) {
        Log.v("Engine", str + " in " + AbstractC2472g.m4447a(j) + "ms, key: " + c0102w);
    }

    /* renamed from: f */
    public static void m355f(InterfaceC0080f0 interfaceC0080f0) {
        if (!(interfaceC0080f0 instanceof C0104y)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C0104y) interfaceC0080f0).m369e();
    }

    /* renamed from: a */
    public final C0073c m356a(C0716e c0716e, Object obj, InterfaceC2801e interfaceC2801e, int i, int i4, Class cls, Class cls2, EnumC0717f enumC0717f, C0093n c0093n, C2467b c2467b, boolean z7, boolean z8, C2804h c2804h, boolean z9, boolean z10, C2270f c2270f, ExecutorC1088n executorC1088n) {
        long jElapsedRealtimeNanos;
        if (f445h) {
            int i8 = AbstractC2472g.f9058b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f447b.getClass();
        C0102w c0102w = new C0102w(obj, interfaceC2801e, i, i4, c2467b, cls, cls2, c2804h);
        synchronized (this) {
            try {
                C0104y c0104yM357b = m357b(c0102w, z9, jElapsedRealtimeNanos);
                if (c0104yM357b == null) {
                    return m360g(c0716e, obj, interfaceC2801e, i, i4, cls, cls2, enumC0717f, c0093n, c2467b, z7, z8, c2804h, z9, z10, c2270f, executorC1088n, c0102w, jElapsedRealtimeNanos);
                }
                c2270f.m4080j(c0104yM357b, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final C0104y m357b(C0102w c0102w, boolean z7, long j) throws Throwable {
        Throwable th;
        C0104y c0104y;
        Object obj;
        C0096q c0096q;
        C0102w c0102w2;
        C0104y c0104y2;
        if (z7) {
            C0073c c0073c = this.f452g;
            synchronized (c0073c) {
                try {
                    C0071b c0071b = (C0071b) ((HashMap) c0073c.f324k).get(c0102w);
                    if (c0071b == null) {
                        c0104y = null;
                    } else {
                        c0104y = (C0104y) c0071b.get();
                        if (c0104y == null) {
                            try {
                                c0073c.m295r(c0071b);
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                }
                            }
                        }
                    }
                    if (c0104y != null) {
                        c0104y.m368a();
                    }
                    if (c0104y != null) {
                        if (f445h) {
                            m354c("Loaded resource from active resources", j, c0102w);
                        }
                        return c0104y;
                    }
                    C0642f c0642f = this.f448c;
                    synchronized (c0642f) {
                        try {
                            C2473h c2473h = (C2473h) c0642f.f9061a.remove(c0102w);
                            if (c2473h == null) {
                                obj = null;
                            } else {
                                c0642f.f9063c -= c2473h.f9060b;
                                obj = c2473h.f9059a;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                        }
                    }
                    InterfaceC0080f0 interfaceC0080f0 = (InterfaceC0080f0) obj;
                    if (interfaceC0080f0 == null) {
                        c0096q = this;
                        c0102w2 = c0102w;
                        c0104y2 = null;
                    } else if (interfaceC0080f0 instanceof C0104y) {
                        c0104y2 = (C0104y) interfaceC0080f0;
                        c0096q = this;
                        c0102w2 = c0102w;
                    } else {
                        c0096q = this;
                        c0102w2 = c0102w;
                        c0104y2 = new C0104y(interfaceC0080f0, true, true, c0102w2, c0096q);
                    }
                    if (c0104y2 != null) {
                        c0104y2.m368a();
                        c0096q.f452g.m294q(c0102w2, c0104y2);
                    }
                    if (c0104y2 != null) {
                        if (f445h) {
                            m354c("Loaded resource from cache", j, c0102w2);
                        }
                        return c0104y2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public final synchronized void m358d(C0100u c0100u, InterfaceC2801e interfaceC2801e, C0104y c0104y) {
        if (c0104y != null) {
            try {
                if (c0104y.f491j) {
                    this.f452g.m294q(interfaceC2801e, c0104y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0074c0 c0074c0 = this.f446a;
        c0074c0.getClass();
        c0100u.getClass();
        HashMap map = c0074c0.f327a;
        if (c0100u.equals(map.get(interfaceC2801e))) {
            map.remove(interfaceC2801e);
        }
    }

    /* renamed from: e */
    public final void m359e(InterfaceC2801e interfaceC2801e, C0104y c0104y) {
        C0073c c0073c = this.f452g;
        synchronized (c0073c) {
            C0071b c0071b = (C0071b) ((HashMap) c0073c.f324k).remove(interfaceC2801e);
            if (c0071b != null) {
                c0071b.f321c = null;
                c0071b.clear();
            }
        }
        if (c0104y.f491j) {
        } else {
            this.f450e.m327e(c0104y, false);
        }
    }

    /* renamed from: g */
    public final C0073c m360g(C0716e c0716e, Object obj, InterfaceC2801e interfaceC2801e, int i, int i4, Class cls, Class cls2, EnumC0717f enumC0717f, C0093n c0093n, Map map, boolean z7, boolean z8, C2804h c2804h, boolean z9, boolean z10, C2270f c2270f, Executor executor, C0102w c0102w, long j) {
        C0100u c0100u = (C0100u) this.f446a.f327a.get(c0102w);
        if (c0100u != null) {
            c0100u.m361b(c2270f, executor);
            if (f445h) {
                m354c("Added to existing load", j, c0102w);
            }
            return new C0073c(this, c2270f, c0100u);
        }
        C0100u c0100u2 = (C0100u) ((C0073c) this.f449d.f6700g).acquire();
        synchronized (c0100u2) {
            c0100u2.f475t = c0102w;
            c0100u2.f476u = z9;
            c0100u2.f477v = z10;
        }
        C0094o c0094o = this.f451f;
        RunnableC0091l runnableC0091l = (RunnableC0091l) ((C0073c) c0094o.f442l).acquire();
        int i8 = c0094o.f440j;
        c0094o.f440j = i8 + 1;
        C0085i c0085i = runnableC0091l.f413j;
        C0095p c0095p = runnableC0091l.f416m;
        c0085i.f368c = c0716e;
        c0085i.f369d = obj;
        c0085i.f379n = interfaceC2801e;
        c0085i.f370e = i;
        c0085i.f371f = i4;
        c0085i.f381p = c0093n;
        c0085i.f372g = cls;
        c0085i.f373h = c0095p;
        c0085i.f376k = cls2;
        c0085i.f380o = enumC0717f;
        c0085i.f374i = c2804h;
        c0085i.f375j = map;
        c0085i.f382q = z7;
        c0085i.f383r = z8;
        runnableC0091l.f420q = c0716e;
        runnableC0091l.f421r = interfaceC2801e;
        runnableC0091l.f422s = enumC0717f;
        runnableC0091l.f423t = c0102w;
        runnableC0091l.f424u = i;
        runnableC0091l.f425v = i4;
        runnableC0091l.f426w = c0093n;
        runnableC0091l.f427x = c2804h;
        runnableC0091l.f428y = c0100u2;
        runnableC0091l.f429z = i8;
        runnableC0091l.f411M = 1;
        runnableC0091l.f400B = obj;
        C0074c0 c0074c0 = this.f446a;
        c0074c0.getClass();
        c0074c0.f327a.put(c0102w, c0100u2);
        c0100u2.m361b(c2270f, executor);
        synchronized (c0100u2) {
            c0100u2.f462C = runnableC0091l;
            int iM334h = runnableC0091l.m334h(1);
            ((iM334h == 2 || iM334h == 3) ? c0100u2.f471p : c0100u2.f477v ? c0100u2.f473r : c0100u2.f472q).execute(runnableC0091l);
        }
        if (f445h) {
            m354c("Started new load", j, c0102w);
        }
        return new C0073c(this, c2270f, c0100u2);
    }
}
