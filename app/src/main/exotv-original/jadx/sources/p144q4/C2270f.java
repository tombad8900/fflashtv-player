package p144q4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.AbstractC0715d;
import com.bumptech.glide.C0716e;
import com.bumptech.glide.EnumC0717f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p005a4.C0070a0;
import p005a4.C0073c;
import p005a4.C0093n;
import p005a4.C0096q;
import p005a4.C0100u;
import p005a4.InterfaceC0080f0;
import p062h.ExecutorC1088n;
import p152r4.InterfaceC2313d;
import p152r4.InterfaceC2314e;
import p161s4.C2361a;
import p178u4.AbstractC2470e;
import p178u4.AbstractC2472g;
import p178u4.AbstractC2478m;
import p178u4.C2467b;
import p186v4.C2548d;
import p210y3.C2804h;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q4.f */
/* loaded from: classes.dex */
public final class C2270f implements InterfaceC2267c, InterfaceC2313d {

    /* renamed from: B */
    public static final boolean f7912B = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    public int f7913A;

    /* renamed from: a */
    public final String f7914a;

    /* renamed from: b */
    public final C2548d f7915b;

    /* renamed from: c */
    public final Object f7916c;

    /* renamed from: d */
    public final InterfaceC2268d f7917d;

    /* renamed from: e */
    public final C0716e f7918e;

    /* renamed from: f */
    public final Object f7919f;

    /* renamed from: g */
    public final Class f7920g;

    /* renamed from: h */
    public final AbstractC2265a f7921h;

    /* renamed from: i */
    public final int f7922i;

    /* renamed from: j */
    public final int f7923j;

    /* renamed from: k */
    public final EnumC0717f f7924k;

    /* renamed from: l */
    public final InterfaceC2314e f7925l;

    /* renamed from: m */
    public final List f7926m;

    /* renamed from: n */
    public final C2361a f7927n;

    /* renamed from: o */
    public final ExecutorC1088n f7928o;

    /* renamed from: p */
    public InterfaceC0080f0 f7929p;

    /* renamed from: q */
    public C0073c f7930q;

    /* renamed from: r */
    public long f7931r;

    /* renamed from: s */
    public volatile C0096q f7932s;

    /* renamed from: t */
    public Drawable f7933t;

    /* renamed from: u */
    public Drawable f7934u;

    /* renamed from: v */
    public Drawable f7935v;

    /* renamed from: w */
    public int f7936w;

    /* renamed from: x */
    public int f7937x;

    /* renamed from: y */
    public boolean f7938y;

    /* renamed from: z */
    public final RuntimeException f7939z;

    public C2270f(Context context, C0716e c0716e, Object obj, Object obj2, Class cls, AbstractC2265a abstractC2265a, int i, int i4, EnumC0717f enumC0717f, InterfaceC2314e interfaceC2314e, ArrayList arrayList, InterfaceC2268d interfaceC2268d, C0096q c0096q, C2361a c2361a) {
        ExecutorC1088n executorC1088n = AbstractC2470e.f9055a;
        this.f7914a = f7912B ? String.valueOf(hashCode()) : null;
        this.f7915b = new C2548d();
        this.f7916c = obj;
        this.f7918e = c0716e;
        this.f7919f = obj2;
        this.f7920g = cls;
        this.f7921h = abstractC2265a;
        this.f7922i = i;
        this.f7923j = i4;
        this.f7924k = enumC0717f;
        this.f7925l = interfaceC2314e;
        this.f7926m = arrayList;
        this.f7917d = interfaceC2268d;
        this.f7932s = c0096q;
        this.f7927n = c2361a;
        this.f7928o = executorC1088n;
        this.f7913A = 1;
        if (this.f7939z == null && ((Map) c0716e.f2808h.f143k).containsKey(AbstractC0715d.class)) {
            this.f7939z = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // p144q4.InterfaceC2267c
    /* renamed from: a */
    public final boolean mo4066a() {
        boolean z7;
        synchronized (this.f7916c) {
            z7 = this.f7913A == 4;
        }
        return z7;
    }

    /* renamed from: b */
    public final void m4076b() {
        if (this.f7938y) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f7915b.m4562a();
        this.f7925l.mo1635g(this);
        C0073c c0073c = this.f7930q;
        if (c0073c != null) {
            synchronized (((C0096q) c0073c.f326m)) {
                ((C0100u) c0073c.f324k).m367h((C2270f) c0073c.f325l);
            }
            this.f7930q = null;
        }
    }

    /* renamed from: c */
    public final Drawable m4077c() {
        if (this.f7934u == null) {
            this.f7921h.getClass();
            this.f7934u = null;
        }
        return this.f7934u;
    }

    @Override // p144q4.InterfaceC2267c
    public final void clear() {
        synchronized (this.f7916c) {
            try {
                if (this.f7938y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f7915b.m4562a();
                if (this.f7913A == 6) {
                    return;
                }
                m4076b();
                InterfaceC0080f0 interfaceC0080f0 = this.f7929p;
                if (interfaceC0080f0 != null) {
                    this.f7929p = null;
                } else {
                    interfaceC0080f0 = null;
                }
                InterfaceC2268d interfaceC2268d = this.f7917d;
                if (interfaceC2268d == null || interfaceC2268d.mo4068c(this)) {
                    this.f7925l.mo1638j(m4077c());
                }
                this.f7913A = 6;
                if (interfaceC0080f0 != null) {
                    this.f7932s.getClass();
                    C0096q.m355f(interfaceC0080f0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void m4078d(String str) {
        Log.v("GlideRequest", str + " this: " + this.f7914a);
    }

    /* renamed from: e */
    public final void m4079e(C0070a0 c0070a0, int i) {
        Drawable drawableM4077c;
        this.f7915b.m4562a();
        synchronized (this.f7916c) {
            try {
                c0070a0.getClass();
                int i4 = this.f7918e.f2809i;
                if (i4 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f7919f + "] with dimensions [" + this.f7936w + "x" + this.f7937x + "]", c0070a0);
                    if (i4 <= 4) {
                        c0070a0.m259d();
                    }
                }
                this.f7930q = null;
                this.f7913A = 5;
                InterfaceC2268d interfaceC2268d = this.f7917d;
                if (interfaceC2268d != null) {
                    interfaceC2268d.mo4070e(this);
                }
                boolean z7 = true;
                this.f7938y = true;
                try {
                    List list = this.f7926m;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            InterfaceC2268d interfaceC2268d2 = this.f7917d;
                            if (interfaceC2268d2 == null) {
                                throw null;
                            }
                            interfaceC2268d2.getRoot().mo4066a();
                            throw null;
                        }
                    }
                    InterfaceC2268d interfaceC2268d3 = this.f7917d;
                    if (interfaceC2268d3 != null && !interfaceC2268d3.mo4067b(this)) {
                        z7 = false;
                    }
                    if (z7) {
                        if (this.f7919f == null) {
                            if (this.f7935v == null) {
                                this.f7921h.getClass();
                                this.f7935v = null;
                            }
                            drawableM4077c = this.f7935v;
                        } else {
                            drawableM4077c = null;
                        }
                        if (drawableM4077c == null) {
                            if (this.f7933t == null) {
                                this.f7921h.getClass();
                                this.f7933t = null;
                            }
                            drawableM4077c = this.f7933t;
                        }
                        if (drawableM4077c == null) {
                            drawableM4077c = m4077c();
                        }
                        this.f7925l.mo1633e(drawableM4077c);
                    }
                } finally {
                    this.f7938y = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p144q4.InterfaceC2267c
    /* renamed from: f */
    public final boolean mo4071f() {
        boolean z7;
        synchronized (this.f7916c) {
            z7 = this.f7913A == 6;
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2267c
    /* renamed from: g */
    public final boolean mo4072g(InterfaceC2267c interfaceC2267c) {
        int i;
        int i4;
        Object obj;
        Class cls;
        AbstractC2265a abstractC2265a;
        EnumC0717f enumC0717f;
        int size;
        int i8;
        int i9;
        Object obj2;
        Class cls2;
        AbstractC2265a abstractC2265a2;
        EnumC0717f enumC0717f2;
        int size2;
        if (!(interfaceC2267c instanceof C2270f)) {
            return false;
        }
        synchronized (this.f7916c) {
            try {
                i = this.f7922i;
                i4 = this.f7923j;
                obj = this.f7919f;
                cls = this.f7920g;
                abstractC2265a = this.f7921h;
                enumC0717f = this.f7924k;
                List list = this.f7926m;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        C2270f c2270f = (C2270f) interfaceC2267c;
        synchronized (c2270f.f7916c) {
            try {
                i8 = c2270f.f7922i;
                i9 = c2270f.f7923j;
                obj2 = c2270f.f7919f;
                cls2 = c2270f.f7920g;
                abstractC2265a2 = c2270f.f7921h;
                enumC0717f2 = c2270f.f7924k;
                List list2 = c2270f.f7926m;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i8 && i4 == i9) {
            char[] cArr = AbstractC2478m.f9069a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((abstractC2265a == null ? abstractC2265a2 == null : abstractC2265a.m4055e(abstractC2265a2)) && enumC0717f == enumC0717f2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p144q4.InterfaceC2267c
    /* renamed from: h */
    public final void mo4073h() {
        synchronized (this.f7916c) {
            try {
                if (this.f7938y) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f7915b.m4562a();
                int i = AbstractC2472g.f9058b;
                this.f7931r = SystemClock.elapsedRealtimeNanos();
                if (this.f7919f == null) {
                    if (AbstractC2478m.m4461i(this.f7922i, this.f7923j)) {
                        this.f7936w = this.f7922i;
                        this.f7937x = this.f7923j;
                    }
                    if (this.f7935v == null) {
                        this.f7921h.getClass();
                        this.f7935v = null;
                    }
                    m4079e(new C0070a0("Received null model"), this.f7935v == null ? 5 : 3);
                    return;
                }
                int i4 = this.f7913A;
                if (i4 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i4 == 4) {
                    m4080j(this.f7929p, 5, false);
                    return;
                }
                List list = this.f7926m;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                this.f7913A = 3;
                if (AbstractC2478m.m4461i(this.f7922i, this.f7923j)) {
                    m4082l(this.f7922i, this.f7923j);
                } else {
                    this.f7925l.mo1629a(this);
                }
                int i8 = this.f7913A;
                if (i8 == 2 || i8 == 3) {
                    InterfaceC2268d interfaceC2268d = this.f7917d;
                    if (interfaceC2268d == null || interfaceC2268d.mo4067b(this)) {
                        this.f7925l.mo1636h(m4077c());
                    }
                }
                if (f7912B) {
                    m4078d("finished run method in " + AbstractC2472g.m4447a(this.f7931r));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p144q4.InterfaceC2267c
    /* renamed from: i */
    public final boolean mo4074i() {
        boolean z7;
        synchronized (this.f7916c) {
            z7 = this.f7913A == 4;
        }
        return z7;
    }

    @Override // p144q4.InterfaceC2267c
    public final boolean isRunning() {
        boolean z7;
        synchronized (this.f7916c) {
            int i = this.f7913A;
            z7 = i == 2 || i == 3;
        }
        return z7;
    }

    /* renamed from: j */
    public final void m4080j(InterfaceC0080f0 interfaceC0080f0, int i, boolean z7) {
        this.f7915b.m4562a();
        InterfaceC0080f0 interfaceC0080f02 = null;
        try {
            synchronized (this.f7916c) {
                try {
                    this.f7930q = null;
                    if (interfaceC0080f0 == null) {
                        m4079e(new C0070a0("Expected to receive a Resource<R> with an object of " + this.f7920g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC0080f0.get();
                    try {
                        if (obj == null || !this.f7920g.isAssignableFrom(obj.getClass())) {
                            this.f7929p = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f7920g);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : C2181z.FRAGMENT_ENCODE_SET);
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC0080f0);
                            sb.append("}.");
                            sb.append(obj != null ? C2181z.FRAGMENT_ENCODE_SET : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            m4079e(new C0070a0(sb.toString()), 5);
                        } else {
                            InterfaceC2268d interfaceC2268d = this.f7917d;
                            if (interfaceC2268d == null || interfaceC2268d.mo4069d(this)) {
                                m4081k(interfaceC0080f0, obj, i);
                                return;
                            } else {
                                this.f7929p = null;
                                this.f7913A = 4;
                            }
                        }
                        this.f7932s.getClass();
                        C0096q.m355f(interfaceC0080f0);
                    } catch (Throwable th) {
                        interfaceC0080f02 = interfaceC0080f0;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC0080f02 != null) {
                this.f7932s.getClass();
                C0096q.m355f(interfaceC0080f02);
            }
            throw th3;
        }
    }

    /* renamed from: k */
    public final void m4081k(InterfaceC0080f0 interfaceC0080f0, Object obj, int i) {
        InterfaceC2268d interfaceC2268d = this.f7917d;
        if (interfaceC2268d != null) {
            interfaceC2268d.getRoot().mo4066a();
        }
        this.f7913A = 4;
        this.f7929p = interfaceC0080f0;
        if (this.f7918e.f2809i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + AbstractC0008a1.m30z(i) + " for " + this.f7919f + " with size [" + this.f7936w + "x" + this.f7937x + "] in " + AbstractC2472g.m4447a(this.f7931r) + " ms");
        }
        if (interfaceC2268d != null) {
            interfaceC2268d.mo4075j(this);
        }
        this.f7938y = true;
        try {
            List list = this.f7926m;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            this.f7927n.getClass();
            this.f7925l.mo1631c(obj);
            this.f7938y = false;
        } catch (Throwable th) {
            this.f7938y = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public final void m4082l(int i, int i4) throws Throwable {
        C2270f c2270f = this;
        int iRound = i;
        c2270f.f7915b.m4562a();
        Object obj = c2270f.f7916c;
        synchronized (obj) {
            try {
                try {
                    boolean z7 = f7912B;
                    if (z7) {
                        c2270f.m4078d("Got onSizeReady in " + AbstractC2472g.m4447a(c2270f.f7931r));
                    }
                    if (c2270f.f7913A == 3) {
                        c2270f.f7913A = 2;
                        c2270f.f7921h.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        c2270f.f7936w = iRound;
                        c2270f.f7937x = i4 == Integer.MIN_VALUE ? i4 : Math.round(1.0f * i4);
                        if (z7) {
                            c2270f.m4078d("finished setup for calling load in " + AbstractC2472g.m4447a(c2270f.f7931r));
                        }
                        C0096q c0096q = c2270f.f7932s;
                        C0716e c0716e = c2270f.f7918e;
                        Object obj2 = c2270f.f7919f;
                        AbstractC2265a abstractC2265a = c2270f.f7921h;
                        InterfaceC2801e interfaceC2801e = abstractC2265a.f7897p;
                        try {
                            int i8 = c2270f.f7936w;
                            int i9 = c2270f.f7937x;
                            Class cls = abstractC2265a.f7901t;
                            try {
                                Class cls2 = c2270f.f7920g;
                                EnumC0717f enumC0717f = c2270f.f7924k;
                                C0093n c0093n = abstractC2265a.f7892k;
                                try {
                                    C2467b c2467b = abstractC2265a.f7900s;
                                    boolean z8 = abstractC2265a.f7898q;
                                    boolean z9 = abstractC2265a.f7904w;
                                    try {
                                        C2804h c2804h = abstractC2265a.f7899r;
                                        boolean z10 = abstractC2265a.f7894m;
                                        boolean z11 = abstractC2265a.f7905x;
                                        ExecutorC1088n executorC1088n = c2270f.f7928o;
                                        c2270f = obj;
                                        try {
                                            c2270f.f7930q = c0096q.m356a(c0716e, obj2, interfaceC2801e, i8, i9, cls, cls2, enumC0717f, c0093n, c2467b, z8, z9, c2804h, z10, z11, c2270f, executorC1088n);
                                            if (c2270f.f7913A != 2) {
                                                c2270f.f7930q = null;
                                            }
                                            if (z7) {
                                                c2270f.m4078d("finished onSizeReady in " + AbstractC2472g.m4447a(c2270f.f7931r));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c2270f = obj;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c2270f = obj;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                c2270f = obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c2270f = obj;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                c2270f = obj;
            }
        }
    }

    @Override // p144q4.InterfaceC2267c
    public final void pause() {
        synchronized (this.f7916c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f7916c) {
            obj = this.f7919f;
            cls = this.f7920g;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
