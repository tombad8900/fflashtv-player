package p005a4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p033d4.ExecutorServiceC0846e;
import p096l0.InterfaceC1642b;
import p144q4.C2270f;
import p178u4.AbstractC2470e;
import p186v4.C2548d;
import p186v4.InterfaceC2546b;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.u */
/* loaded from: classes.dex */
public final class C0100u implements InterfaceC2546b {

    /* renamed from: F */
    public static final C2819f f459F = new C2819f(2);

    /* renamed from: A */
    public boolean f460A;

    /* renamed from: B */
    public C0104y f461B;

    /* renamed from: C */
    public RunnableC0091l f462C;

    /* renamed from: D */
    public volatile boolean f463D;

    /* renamed from: E */
    public boolean f464E;

    /* renamed from: l */
    public final InterfaceC0103x f467l;

    /* renamed from: m */
    public final InterfaceC1642b f468m;

    /* renamed from: o */
    public final InterfaceC0101v f470o;

    /* renamed from: p */
    public final ExecutorServiceC0846e f471p;

    /* renamed from: q */
    public final ExecutorServiceC0846e f472q;

    /* renamed from: r */
    public final ExecutorServiceC0846e f473r;

    /* renamed from: t */
    public C0102w f475t;

    /* renamed from: u */
    public boolean f476u;

    /* renamed from: v */
    public boolean f477v;

    /* renamed from: w */
    public InterfaceC0080f0 f478w;

    /* renamed from: x */
    public int f479x;

    /* renamed from: y */
    public boolean f480y;

    /* renamed from: z */
    public C0070a0 f481z;

    /* renamed from: j */
    public final C0099t f465j = new C0099t(new ArrayList(2));

    /* renamed from: k */
    public final C2548d f466k = new C2548d();

    /* renamed from: s */
    public final AtomicInteger f474s = new AtomicInteger();

    /* renamed from: n */
    public final C2819f f469n = f459F;

    public C0100u(ExecutorServiceC0846e executorServiceC0846e, ExecutorServiceC0846e executorServiceC0846e2, ExecutorServiceC0846e executorServiceC0846e3, ExecutorServiceC0846e executorServiceC0846e4, C0096q c0096q, C0096q c0096q2, C0073c c0073c) {
        this.f471p = executorServiceC0846e;
        this.f472q = executorServiceC0846e2;
        this.f473r = executorServiceC0846e4;
        this.f470o = c0096q;
        this.f467l = c0096q2;
        this.f468m = c0073c;
    }

    @Override // p186v4.InterfaceC2546b
    /* renamed from: a */
    public final C2548d mo304a() {
        return this.f466k;
    }

    /* renamed from: b */
    public final synchronized void m361b(C2270f c2270f, Executor executor) {
        try {
            this.f466k.m4562a();
            this.f465j.f458j.add(new C0098s(c2270f, executor));
            if (this.f480y) {
                m364e(1);
                executor.execute(new RunnableC0097r(this, c2270f, 1));
            } else if (this.f460A) {
                m364e(1);
                executor.execute(new RunnableC0097r(this, c2270f, 0));
            } else {
                AbstractC2470e.m4444a("Cannot add callbacks to a cancelled EngineJob", !this.f463D);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public final void m362c() {
        if (m365f()) {
            return;
        }
        this.f463D = true;
        RunnableC0091l runnableC0091l = this.f462C;
        runnableC0091l.f408J = true;
        InterfaceC0083h interfaceC0083h = runnableC0091l.f406H;
        if (interfaceC0083h != null) {
            interfaceC0083h.cancel();
        }
        InterfaceC0101v interfaceC0101v = this.f470o;
        C0102w c0102w = this.f475t;
        C0096q c0096q = (C0096q) interfaceC0101v;
        synchronized (c0096q) {
            C0074c0 c0074c0 = c0096q.f446a;
            c0074c0.getClass();
            HashMap map = c0074c0.f327a;
            if (equals(map.get(c0102w))) {
                map.remove(c0102w);
            }
        }
    }

    /* renamed from: d */
    public final void m363d() {
        C0104y c0104y;
        synchronized (this) {
            try {
                this.f466k.m4562a();
                AbstractC2470e.m4444a("Not yet complete!", m365f());
                int iDecrementAndGet = this.f474s.decrementAndGet();
                AbstractC2470e.m4444a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c0104y = this.f461B;
                    m366g();
                } else {
                    c0104y = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0104y != null) {
            c0104y.m369e();
        }
    }

    /* renamed from: e */
    public final synchronized void m364e(int i) {
        C0104y c0104y;
        AbstractC2470e.m4444a("Not yet complete!", m365f());
        if (this.f474s.getAndAdd(i) == 0 && (c0104y = this.f461B) != null) {
            c0104y.m368a();
        }
    }

    /* renamed from: f */
    public final boolean m365f() {
        return this.f460A || this.f480y || this.f463D;
    }

    /* renamed from: g */
    public final synchronized void m366g() {
        boolean zM328a;
        if (this.f475t == null) {
            throw new IllegalArgumentException();
        }
        this.f465j.f458j.clear();
        this.f475t = null;
        this.f461B = null;
        this.f478w = null;
        this.f460A = false;
        this.f463D = false;
        this.f480y = false;
        this.f464E = false;
        RunnableC0091l runnableC0091l = this.f462C;
        C0089k c0089k = runnableC0091l.f419p;
        synchronized (c0089k) {
            c0089k.f389a = true;
            zM328a = c0089k.m328a();
        }
        if (zM328a) {
            runnableC0091l.m337k();
        }
        this.f462C = null;
        this.f481z = null;
        this.f479x = 0;
        this.f468m.mo285g(this);
    }

    /* renamed from: h */
    public final synchronized void m367h(C2270f c2270f) {
        try {
            this.f466k.m4562a();
            this.f465j.f458j.remove(new C0098s(c2270f, AbstractC2470e.f9056b));
            if (this.f465j.f458j.isEmpty()) {
                m362c();
                if (this.f480y || this.f460A) {
                    if (this.f474s.get() == 0) {
                        m366g();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
