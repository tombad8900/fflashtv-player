package p148r;

import android.support.v4.media.session.AbstractC0120b;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p002a1.AbstractC0008a1;
import p085j6.EnumC1525o;
import p085j6.InterfaceFutureC1529s;
import p085j6.RunnableC1527q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r.g */
/* loaded from: classes.dex */
public abstract class AbstractC2285g implements InterfaceFutureC1529s {

    /* renamed from: m */
    public static final boolean f7972m = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: n */
    public static final Logger f7973n = Logger.getLogger(AbstractC2285g.class.getName());

    /* renamed from: o */
    public static final AbstractC0120b f7974o;

    /* renamed from: p */
    public static final Object f7975p;

    /* renamed from: j */
    public volatile Object f7976j;

    /* renamed from: k */
    public volatile C2281c f7977k;

    /* renamed from: l */
    public volatile C2284f f7978l;

    static {
        AbstractC0120b c2283e;
        try {
            c2283e = new C2282d(AtomicReferenceFieldUpdater.newUpdater(C2284f.class, Thread.class, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY), AtomicReferenceFieldUpdater.newUpdater(C2284f.class, C2284f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2285g.class, C2284f.class, CmcdData.Factory.STREAM_TYPE_LIVE), AtomicReferenceFieldUpdater.newUpdater(AbstractC2285g.class, C2281c.class, "k"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2285g.class, Object.class, "j"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c2283e = new C2283e();
        }
        f7974o = c2283e;
        if (th != null) {
            f7973n.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7975p = new Object();
    }

    /* renamed from: c */
    public static void m4085c(AbstractC2285g abstractC2285g) {
        C2284f c2284f;
        C2281c c2281c;
        C2281c c2281c2;
        C2281c c2281c3;
        do {
            c2284f = abstractC2285g.f7978l;
        } while (!f7974o.mo435f(abstractC2285g, c2284f, C2284f.f7969c));
        while (true) {
            c2281c = null;
            if (c2284f == null) {
                break;
            }
            Thread thread = c2284f.f7970a;
            if (thread != null) {
                c2284f.f7970a = null;
                LockSupport.unpark(thread);
            }
            c2284f = c2284f.f7971b;
        }
        do {
            c2281c2 = abstractC2285g.f7977k;
        } while (!f7974o.mo433d(abstractC2285g, c2281c2, C2281c.f7960d));
        while (true) {
            c2281c3 = c2281c;
            c2281c = c2281c2;
            if (c2281c == null) {
                break;
            }
            c2281c2 = c2281c.f7963c;
            c2281c.f7963c = c2281c3;
        }
        while (c2281c3 != null) {
            C2281c c2281c4 = c2281c3.f7963c;
            m4086d(c2281c3.f7961a, c2281c3.f7962b);
            c2281c3 = c2281c4;
        }
    }

    /* renamed from: d */
    public static void m4086d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f7973n.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: e */
    public static Object m4087e(Object obj) throws ExecutionException {
        if (obj instanceof C2279a) {
            Throwable th = ((C2279a) obj).f7959a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC2280b) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f7975p) {
            return null;
        }
        return obj;
    }

    /* renamed from: f */
    public static Object m4088f(AbstractC2285g abstractC2285g) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = abstractC2285g.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // p085j6.InterfaceFutureC1529s
    /* renamed from: a */
    public final void mo3206a(RunnableC1527q runnableC1527q) {
        EnumC1525o enumC1525o = EnumC1525o.f5844j;
        C2281c c2281c = this.f7977k;
        C2281c c2281c2 = C2281c.f7960d;
        if (c2281c != c2281c2) {
            C2281c c2281c3 = new C2281c(runnableC1527q, enumC1525o);
            do {
                c2281c3.f7963c = c2281c;
                if (f7974o.mo433d(this, c2281c, c2281c3)) {
                    return;
                } else {
                    c2281c = this.f7977k;
                }
            } while (c2281c != c2281c2);
        }
        m4086d(runnableC1527q, enumC1525o);
    }

    /* renamed from: b */
    public final void m4089b(StringBuilder sb) {
        try {
            Object objM4088f = m4088f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM4088f == this ? "this future" : String.valueOf(objM4088f));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.f7976j;
        if (obj != null) {
            return false;
        }
        if (!f7974o.mo434e(this, obj, f7972m ? new C2279a(new CancellationException("Future.cancel() was called."), z7) : z7 ? C2279a.f7957b : C2279a.f7958c)) {
            return false;
        }
        m4085c(this);
        return true;
    }

    /* renamed from: g */
    public final void m4090g(C2284f c2284f) {
        c2284f.f7970a = null;
        while (true) {
            C2284f c2284f2 = this.f7978l;
            if (c2284f2 == C2284f.f7969c) {
                return;
            }
            C2284f c2284f3 = null;
            while (c2284f2 != null) {
                C2284f c2284f4 = c2284f2.f7971b;
                if (c2284f2.f7970a != null) {
                    c2284f3 = c2284f2;
                } else if (c2284f3 != null) {
                    c2284f3.f7971b = c2284f4;
                    if (c2284f3.f7970a == null) {
                        break;
                    }
                } else if (!f7974o.mo435f(this, c2284f2, c2284f4)) {
                    break;
                }
                c2284f2 = c2284f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C2284f c2284f = C2284f.f7969c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f7976j;
        if (obj != null) {
            return m4087e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2284f c2284f2 = this.f7978l;
            if (c2284f2 != c2284f) {
                C2284f c2284f3 = new C2284f();
                do {
                    AbstractC0120b abstractC0120b = f7974o;
                    abstractC0120b.mo431E(c2284f3, c2284f2);
                    if (abstractC0120b.mo435f(this, c2284f2, c2284f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m4090g(c2284f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f7976j;
                            if (obj2 != null) {
                                return m4087e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m4090g(c2284f3);
                    } else {
                        c2284f2 = this.f7978l;
                    }
                } while (c2284f2 != c2284f);
            }
            return m4087e(this.f7976j);
        }
        while (nanos > 0) {
            Object obj3 = this.f7976j;
            if (obj3 != null) {
                return m4087e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strM16l = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strM16l2 = AbstractC0008a1.m16l(strM16l, " (plus ");
            long j8 = -nanos;
            long jConvert = timeUnit.convert(j8, TimeUnit.NANOSECONDS);
            long nanos2 = j8 - timeUnit.toNanos(jConvert);
            boolean z7 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM16l3 = strM16l2 + jConvert + " " + lowerCase;
                if (z7) {
                    strM16l3 = AbstractC0008a1.m16l(strM16l3, ",");
                }
                strM16l2 = AbstractC0008a1.m16l(strM16l3, " ");
            }
            if (z7) {
                strM16l2 = strM16l2 + nanos2 + " nanoseconds ";
            }
            strM16l = AbstractC0008a1.m16l(strM16l2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0008a1.m16l(strM16l, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strM16l + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7976j instanceof C2279a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7976j != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f7976j instanceof C2279a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m4089b(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m4089b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C2284f c2284f = C2284f.f7969c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7976j;
            if (obj2 != null) {
                return m4087e(obj2);
            }
            C2284f c2284f2 = this.f7978l;
            if (c2284f2 != c2284f) {
                C2284f c2284f3 = new C2284f();
                do {
                    AbstractC0120b abstractC0120b = f7974o;
                    abstractC0120b.mo431E(c2284f3, c2284f2);
                    if (abstractC0120b.mo435f(this, c2284f2, c2284f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7976j;
                            } else {
                                m4090g(c2284f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m4087e(obj);
                    }
                    c2284f2 = this.f7978l;
                } while (c2284f2 != c2284f);
            }
            return m4087e(this.f7976j);
        }
        throw new InterruptedException();
    }
}
