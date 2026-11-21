package p005a4;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C0716e;
import com.bumptech.glide.EnumC0717f;
import com.bumptech.glide.load.data.InterfaceC0728e;
import com.bumptech.glide.load.data.InterfaceC0730g;
import java.util.ArrayList;
import java.util.Collections;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p066h4.C1181o;
import p096l0.InterfaceC1642b;
import p156s.AbstractC2334g;
import p178u4.AbstractC2472g;
import p178u4.C2467b;
import p186v4.C2548d;
import p186v4.InterfaceC2546b;
import p210y3.C2803g;
import p210y3.C2804h;
import p210y3.InterfaceC2801e;
import p210y3.InterfaceC2807k;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.l */
/* loaded from: classes.dex */
public final class RunnableC0091l implements InterfaceC0081g, Runnable, Comparable, InterfaceC2546b {

    /* renamed from: A */
    public long f399A;

    /* renamed from: B */
    public Object f400B;

    /* renamed from: C */
    public Thread f401C;

    /* renamed from: D */
    public InterfaceC2801e f402D;

    /* renamed from: E */
    public InterfaceC2801e f403E;

    /* renamed from: F */
    public Object f404F;

    /* renamed from: G */
    public InterfaceC0728e f405G;

    /* renamed from: H */
    public volatile InterfaceC0083h f406H;

    /* renamed from: I */
    public volatile boolean f407I;

    /* renamed from: J */
    public volatile boolean f408J;

    /* renamed from: K */
    public boolean f409K;

    /* renamed from: L */
    public int f410L;

    /* renamed from: M */
    public int f411M;

    /* renamed from: N */
    public int f412N;

    /* renamed from: m */
    public final C0095p f416m;

    /* renamed from: n */
    public final InterfaceC1642b f417n;

    /* renamed from: q */
    public C0716e f420q;

    /* renamed from: r */
    public InterfaceC2801e f421r;

    /* renamed from: s */
    public EnumC0717f f422s;

    /* renamed from: t */
    public C0102w f423t;

    /* renamed from: u */
    public int f424u;

    /* renamed from: v */
    public int f425v;

    /* renamed from: w */
    public C0093n f426w;

    /* renamed from: x */
    public C2804h f427x;

    /* renamed from: y */
    public C0100u f428y;

    /* renamed from: z */
    public int f429z;

    /* renamed from: j */
    public final C0085i f413j = new C0085i();

    /* renamed from: k */
    public final ArrayList f414k = new ArrayList();

    /* renamed from: l */
    public final C2548d f415l = new C2548d();

    /* renamed from: o */
    public final C0073c f418o = new C0073c(2);

    /* renamed from: p */
    public final C0089k f419p = new C0089k();

    public RunnableC0091l(C0095p c0095p, C0073c c0073c) {
        this.f416m = c0095p;
        this.f417n = c0073c;
    }

    @Override // p186v4.InterfaceC2546b
    /* renamed from: a */
    public final C2548d mo304a() {
        return this.f415l;
    }

    @Override // p005a4.InterfaceC0081g
    /* renamed from: b */
    public final void mo310b(InterfaceC2801e interfaceC2801e, Object obj, InterfaceC0728e interfaceC0728e, int i, InterfaceC2801e interfaceC2801e2) {
        this.f402D = interfaceC2801e;
        this.f404F = obj;
        this.f405G = interfaceC0728e;
        this.f412N = i;
        this.f403E = interfaceC2801e2;
        this.f409K = interfaceC2801e != this.f413j.m312a().get(0);
        if (Thread.currentThread() != this.f401C) {
            m338l(3);
        } else {
            m332f();
        }
    }

    @Override // p005a4.InterfaceC0081g
    /* renamed from: c */
    public final void mo311c(InterfaceC2801e interfaceC2801e, Exception exc, InterfaceC0728e interfaceC0728e, int i) {
        interfaceC0728e.mo1646b();
        C0070a0 c0070a0 = new C0070a0("Fetching data failed", Collections.singletonList(exc));
        Class clsMo1641a = interfaceC0728e.mo1641a();
        c0070a0.f315k = interfaceC2801e;
        c0070a0.f316l = i;
        c0070a0.f317m = clsMo1641a;
        this.f414k.add(c0070a0);
        if (Thread.currentThread() != this.f401C) {
            m338l(2);
        } else {
            m339m();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC0091l runnableC0091l = (RunnableC0091l) obj;
        int iOrdinal = this.f422s.ordinal() - runnableC0091l.f422s.ordinal();
        return iOrdinal == 0 ? this.f429z - runnableC0091l.f429z : iOrdinal;
    }

    /* renamed from: d */
    public final InterfaceC0080f0 m330d(InterfaceC0728e interfaceC0728e, Object obj, int i) {
        if (obj == null) {
            return null;
        }
        try {
            int i4 = AbstractC2472g.f9058b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC0080f0 interfaceC0080f0M331e = m331e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                m335i(jElapsedRealtimeNanos, "Decoded result " + interfaceC0080f0M331e, null);
            }
            return interfaceC0080f0M331e;
        } finally {
            interfaceC0728e.mo1646b();
        }
    }

    /* renamed from: e */
    public final InterfaceC0080f0 m331e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        C0085i c0085i = this.f413j;
        C0076d0 c0076d0M314c = c0085i.m314c(cls);
        C2804h c2804h = this.f427x;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z7 = i == 4 || c0085i.f383r;
            C2803g c2803g = C1181o.f5040i;
            Boolean bool = (Boolean) c2804h.m4908c(c2803g);
            if (bool == null || (bool.booleanValue() && !z7)) {
                c2804h = new C2804h();
                C2467b c2467b = this.f427x.f10424b;
                C2467b c2467b2 = c2804h.f10424b;
                c2467b2.mo3993g(c2467b);
                c2467b2.put(c2803g, Boolean.valueOf(z7));
            }
        }
        C2804h c2804h2 = c2804h;
        InterfaceC0730g interfaceC0730gM1617g = this.f420q.m1610a().m1617g(obj);
        try {
            return c0076d0M314c.m302a(this.f424u, this.f425v, new C0087j(i, this), interfaceC0730gM1617g, c2804h2);
        } finally {
            interfaceC0730gM1617g.mo1652b();
        }
    }

    /* renamed from: f */
    public final void m332f() {
        InterfaceC0080f0 interfaceC0080f0M330d;
        boolean zM328a;
        if (Log.isLoggable("DecodeJob", 2)) {
            m335i(this.f399A, "Retrieved data", "data: " + this.f404F + ", cache key: " + this.f402D + ", fetcher: " + this.f405G);
        }
        C0078e0 c0078e0 = null;
        try {
            interfaceC0080f0M330d = m330d(this.f405G, this.f404F, this.f412N);
        } catch (C0070a0 e) {
            InterfaceC2801e interfaceC2801e = this.f403E;
            int i = this.f412N;
            e.f315k = interfaceC2801e;
            e.f316l = i;
            e.f317m = null;
            this.f414k.add(e);
            interfaceC0080f0M330d = null;
        }
        if (interfaceC0080f0M330d == null) {
            m339m();
            return;
        }
        int i4 = this.f412N;
        boolean z7 = this.f409K;
        if (interfaceC0080f0M330d instanceof InterfaceC0072b0) {
            ((InterfaceC0072b0) interfaceC0080f0M330d).mo261a();
        }
        if (((C0078e0) this.f418o.f326m) != null) {
            c0078e0 = (C0078e0) C0078e0.f340n.acquire();
            c0078e0.f344m = false;
            c0078e0.f343l = true;
            c0078e0.f342k = interfaceC0080f0M330d;
            interfaceC0080f0M330d = c0078e0;
        }
        m341o();
        C0100u c0100u = this.f428y;
        synchronized (c0100u) {
            c0100u.f478w = interfaceC0080f0M330d;
            c0100u.f479x = i4;
            c0100u.f464E = z7;
        }
        synchronized (c0100u) {
            try {
                c0100u.f466k.m4562a();
                if (c0100u.f463D) {
                    c0100u.f478w.mo305b();
                    c0100u.m366g();
                } else {
                    if (c0100u.f465j.f458j.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (c0100u.f480y) {
                        throw new IllegalStateException("Already have resource");
                    }
                    C2819f c2819f = c0100u.f469n;
                    InterfaceC0080f0 interfaceC0080f0 = c0100u.f478w;
                    boolean z8 = c0100u.f476u;
                    C0102w c0102w = c0100u.f475t;
                    InterfaceC0103x interfaceC0103x = c0100u.f467l;
                    c2819f.getClass();
                    c0100u.f461B = new C0104y(interfaceC0080f0, z8, true, c0102w, interfaceC0103x);
                    c0100u.f480y = true;
                    C0099t c0099t = c0100u.f465j;
                    c0099t.getClass();
                    ArrayList arrayList = new ArrayList(c0099t.f458j);
                    c0100u.m364e(arrayList.size() + 1);
                    ((C0096q) c0100u.f470o).m358d(c0100u, c0100u.f475t, c0100u.f461B);
                    int size = arrayList.size();
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj = arrayList.get(i8);
                        i8++;
                        C0098s c0098s = (C0098s) obj;
                        c0098s.f457b.execute(new RunnableC0097r(c0100u, c0098s.f456a, 1));
                    }
                    c0100u.m363d();
                }
            } finally {
            }
        }
        this.f410L = 5;
        try {
            C0073c c0073c = this.f418o;
            if (((C0078e0) c0073c.f326m) != null) {
                C0095p c0095p = this.f416m;
                C2804h c2804h = this.f427x;
                c0073c.getClass();
                try {
                    c0095p.m353a().mo1421h((InterfaceC2801e) c0073c.f324k, new C0073c((InterfaceC2807k) c0073c.f325l, (C0078e0) c0073c.f326m, c2804h, 1));
                    ((C0078e0) c0073c.f326m).m308e();
                } catch (Throwable th) {
                    ((C0078e0) c0073c.f326m).m308e();
                    throw th;
                }
            }
            C0089k c0089k = this.f419p;
            synchronized (c0089k) {
                c0089k.f390b = true;
                zM328a = c0089k.m328a();
            }
            if (zM328a) {
                m337k();
            }
        } finally {
            if (c0078e0 != null) {
                c0078e0.m308e();
            }
        }
    }

    /* renamed from: g */
    public final InterfaceC0083h m333g() {
        int iM4162a = AbstractC2334g.m4162a(this.f410L);
        C0085i c0085i = this.f413j;
        if (iM4162a == 1) {
            return new C0082g0(c0085i, this);
        }
        if (iM4162a == 2) {
            return new C0077e(c0085i.m312a(), c0085i, this);
        }
        if (iM4162a == 3) {
            return new C0090k0(c0085i, this);
        }
        if (iM4162a == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC0008a1.m29y(this.f410L)));
    }

    /* renamed from: h */
    public final int m334h(int i) {
        boolean z7;
        boolean z8;
        int iM4162a = AbstractC2334g.m4162a(i);
        if (iM4162a == 0) {
            switch (this.f426w.f439a) {
                case 0:
                default:
                    z7 = true;
                    break;
                case 1:
                case 2:
                    z7 = false;
                    break;
            }
            if (z7) {
                return 2;
            }
            return m334h(2);
        }
        if (iM4162a != 1) {
            if (iM4162a == 2) {
                return 4;
            }
            if (iM4162a == 3 || iM4162a == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC0008a1.m29y(i)));
        }
        switch (this.f426w.f439a) {
            case 0:
            case 2:
            default:
                z8 = true;
                break;
            case 1:
                z8 = false;
                break;
        }
        if (z8) {
            return 3;
        }
        return m334h(3);
    }

    /* renamed from: i */
    public final void m335i(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(AbstractC2472g.m4447a(j));
        sb.append(", load key: ");
        sb.append(this.f423t);
        sb.append(str2 != null ? ", ".concat(str2) : C2181z.FRAGMENT_ENCODE_SET);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* renamed from: j */
    public final void m336j() {
        boolean zM328a;
        m341o();
        C0070a0 c0070a0 = new C0070a0("Failed to load resource", new ArrayList(this.f414k));
        C0100u c0100u = this.f428y;
        synchronized (c0100u) {
            c0100u.f481z = c0070a0;
        }
        synchronized (c0100u) {
            try {
                c0100u.f466k.m4562a();
                if (c0100u.f463D) {
                    c0100u.m366g();
                } else {
                    if (c0100u.f465j.f458j.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c0100u.f460A) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c0100u.f460A = true;
                    C0102w c0102w = c0100u.f475t;
                    C0099t c0099t = c0100u.f465j;
                    c0099t.getClass();
                    ArrayList arrayList = new ArrayList(c0099t.f458j);
                    c0100u.m364e(arrayList.size() + 1);
                    ((C0096q) c0100u.f470o).m358d(c0100u, c0102w, null);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        C0098s c0098s = (C0098s) obj;
                        c0098s.f457b.execute(new RunnableC0097r(c0100u, c0098s.f456a, 0));
                    }
                    c0100u.m363d();
                }
            } finally {
            }
        }
        C0089k c0089k = this.f419p;
        synchronized (c0089k) {
            c0089k.f391c = true;
            zM328a = c0089k.m328a();
        }
        if (zM328a) {
            m337k();
        }
    }

    /* renamed from: k */
    public final void m337k() {
        C0089k c0089k = this.f419p;
        synchronized (c0089k) {
            c0089k.f390b = false;
            c0089k.f389a = false;
            c0089k.f391c = false;
        }
        C0073c c0073c = this.f418o;
        c0073c.f324k = null;
        c0073c.f325l = null;
        c0073c.f326m = null;
        C0085i c0085i = this.f413j;
        c0085i.f368c = null;
        c0085i.f369d = null;
        c0085i.f379n = null;
        c0085i.f372g = null;
        c0085i.f376k = null;
        c0085i.f374i = null;
        c0085i.f380o = null;
        c0085i.f375j = null;
        c0085i.f381p = null;
        c0085i.f366a.clear();
        c0085i.f377l = false;
        c0085i.f367b.clear();
        c0085i.f378m = false;
        this.f407I = false;
        this.f420q = null;
        this.f421r = null;
        this.f427x = null;
        this.f422s = null;
        this.f423t = null;
        this.f428y = null;
        this.f410L = 0;
        this.f406H = null;
        this.f401C = null;
        this.f402D = null;
        this.f404F = null;
        this.f412N = 0;
        this.f405G = null;
        this.f399A = 0L;
        this.f408J = false;
        this.f400B = null;
        this.f414k.clear();
        this.f417n.mo285g(this);
    }

    /* renamed from: l */
    public final void m338l(int i) {
        this.f411M = i;
        C0100u c0100u = this.f428y;
        (c0100u.f477v ? c0100u.f473r : c0100u.f472q).execute(this);
    }

    /* renamed from: m */
    public final void m339m() {
        this.f401C = Thread.currentThread();
        int i = AbstractC2472g.f9058b;
        this.f399A = SystemClock.elapsedRealtimeNanos();
        boolean zMo303a = false;
        while (!this.f408J && this.f406H != null && !(zMo303a = this.f406H.mo303a())) {
            this.f410L = m334h(this.f410L);
            this.f406H = m333g();
            if (this.f410L == 4) {
                m338l(2);
                return;
            }
        }
        if ((this.f410L == 6 || this.f408J) && !zMo303a) {
            m336j();
        }
    }

    /* renamed from: n */
    public final void m340n() {
        int iM4162a = AbstractC2334g.m4162a(this.f411M);
        if (iM4162a == 0) {
            this.f410L = m334h(1);
            this.f406H = m333g();
            m339m();
        } else if (iM4162a == 1) {
            m339m();
        } else if (iM4162a == 2) {
            m332f();
        } else {
            int i = this.f411M;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    /* renamed from: o */
    public final void m341o() {
        Throwable th;
        this.f415l.m4562a();
        if (!this.f407I) {
            this.f407I = true;
            return;
        }
        if (this.f414k.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f414k;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0728e interfaceC0728e = this.f405G;
        try {
            try {
                if (this.f408J) {
                    m336j();
                    if (interfaceC0728e != null) {
                        interfaceC0728e.mo1646b();
                        return;
                    }
                    return;
                }
                m340n();
                if (interfaceC0728e != null) {
                    interfaceC0728e.mo1646b();
                }
            } catch (Throwable th) {
                if (interfaceC0728e != null) {
                    interfaceC0728e.mo1646b();
                }
                throw th;
            }
        } catch (C0075d e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f408J + ", stage: " + AbstractC0008a1.m29y(this.f410L), th2);
            }
            if (this.f410L != 5) {
                this.f414k.add(th2);
                m336j();
            }
            if (!this.f408J) {
                throw th2;
            }
            throw th2;
        }
    }
}
