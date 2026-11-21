package p085j6;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.bumptech.glide.AbstractC0715d;
import java.util.Locale;
import java.util.Objects;
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
import p093k6.AbstractC1607a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j6.n */
/* loaded from: classes.dex */
public abstract class AbstractC1524n extends AbstractC1607a implements InterfaceFutureC1529s {

    /* renamed from: m */
    public static final boolean f5837m;

    /* renamed from: n */
    public static final C1528r f5838n;

    /* renamed from: o */
    public static final AbstractC0715d f5839o;

    /* renamed from: p */
    public static final Object f5840p;

    /* renamed from: j */
    public volatile Object f5841j;

    /* renamed from: k */
    public volatile C1514d f5842k;

    /* renamed from: l */
    public volatile C1523m f5843l;

    static {
        boolean z7;
        Throwable th;
        AbstractC0715d c1516f;
        try {
            z7 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z7 = false;
        }
        f5837m = z7;
        f5838n = new C1528r();
        Throwable th2 = null;
        try {
            c1516f = new C1522l();
            th = null;
        } catch (Error | Exception e) {
            th = e;
            try {
                c1516f = new C1515e(AtomicReferenceFieldUpdater.newUpdater(C1523m.class, Thread.class, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY), AtomicReferenceFieldUpdater.newUpdater(C1523m.class, C1523m.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1524n.class, C1523m.class, CmcdData.Factory.STREAM_TYPE_LIVE), AtomicReferenceFieldUpdater.newUpdater(AbstractC1524n.class, C1514d.class, "k"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1524n.class, Object.class, "j"));
            } catch (Error | Exception e8) {
                th2 = e8;
                c1516f = new C1516f();
            }
        }
        f5839o = c1516f;
        if (th2 != null) {
            C1528r c1528r = f5838n;
            Logger loggerM3211a = c1528r.m3211a();
            Level level = Level.SEVERE;
            loggerM3211a.log(level, "UnsafeAtomicHelper is broken!", th);
            c1528r.m3211a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        f5840p = new Object();
    }

    /* renamed from: d */
    public static void m3202d(AbstractC1524n abstractC1524n) {
        for (C1523m c1523mMo1576B = f5839o.mo1576B(abstractC1524n); c1523mMo1576B != null; c1523mMo1576B = c1523mMo1576B.f5836b) {
            Thread thread = c1523mMo1576B.f5835a;
            if (thread != null) {
                c1523mMo1576B.f5835a = null;
                LockSupport.unpark(thread);
            }
        }
        C1514d c1514dMo1575A = f5839o.mo1575A(abstractC1524n);
        C1514d c1514d = null;
        while (c1514dMo1575A != null) {
            C1514d c1514d2 = c1514dMo1575A.f5822c;
            c1514dMo1575A.f5822c = c1514d;
            c1514d = c1514dMo1575A;
            c1514dMo1575A = c1514d2;
        }
        while (c1514d != null) {
            C1514d c1514d3 = c1514d.f5822c;
            RunnableC1527q runnableC1527q = c1514d.f5820a;
            Objects.requireNonNull(runnableC1527q);
            EnumC1525o enumC1525o = c1514d.f5821b;
            Objects.requireNonNull(enumC1525o);
            m3203e(runnableC1527q, enumC1525o);
            c1514d = c1514d3;
        }
    }

    /* renamed from: e */
    public static void m3203e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f5838n.m3211a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: f */
    public static Object m3204f(Object obj) throws ExecutionException {
        if (obj instanceof C1511a) {
            Throwable th = ((C1511a) obj).f5817a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C1513c) {
            throw new ExecutionException(((C1513c) obj).f5818a);
        }
        if (obj == f5840p) {
            return null;
        }
        return obj;
    }

    /* renamed from: g */
    public static Object m3205g(AbstractC1524n abstractC1524n) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = abstractC1524n.get();
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
    public void mo3206a(RunnableC1527q runnableC1527q) {
        C1514d c1514d;
        EnumC1525o enumC1525o = EnumC1525o.f5844j;
        C1514d c1514d2 = C1514d.f5819d;
        if (!isDone() && (c1514d = this.f5842k) != c1514d2) {
            C1514d c1514d3 = new C1514d(runnableC1527q);
            do {
                c1514d3.f5822c = c1514d;
                if (f5839o.mo1593i(this, c1514d, c1514d3)) {
                    return;
                } else {
                    c1514d = this.f5842k;
                }
            } while (c1514d != c1514d2);
        }
        m3203e(runnableC1527q, enumC1525o);
    }

    /* renamed from: b */
    public final void m3207b(StringBuilder sb) {
        try {
            Object objM3205g = m3205g(this);
            sb.append("SUCCESS, result=[");
            m3208c(sb, objM3205g);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: c */
    public final void m3208c(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z7) {
        C1511a c1511a;
        Object obj = this.f5841j;
        if (obj != null) {
            return false;
        }
        if (f5837m) {
            c1511a = new C1511a(new CancellationException("Future.cancel() was called."), z7);
        } else {
            c1511a = z7 ? C1511a.f5815b : C1511a.f5816c;
            Objects.requireNonNull(c1511a);
        }
        if (!f5839o.mo1595j(this, obj, c1511a)) {
            return false;
        }
        m3202d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j8;
        C1523m c1523m = C1523m.f5834c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5841j;
        if (obj != null) {
            return m3204f(obj);
        }
        long j9 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1523m c1523m2 = this.f5843l;
            if (c1523m2 != c1523m) {
                C1523m c1523m3 = new C1523m();
                while (true) {
                    AbstractC0715d abstractC0715d = f5839o;
                    abstractC0715d.mo1590b0(c1523m3, c1523m2);
                    if (abstractC0715d.mo1597k(this, c1523m2, c1523m3)) {
                        j8 = j9;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m3210i(c1523m3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f5841j;
                            if (obj2 != null) {
                                return m3204f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m3210i(c1523m3);
                    } else {
                        long j10 = j9;
                        c1523m2 = this.f5843l;
                        if (c1523m2 == c1523m) {
                            break;
                        }
                        j9 = j10;
                    }
                }
            }
            Object obj3 = this.f5841j;
            Objects.requireNonNull(obj3);
            return m3204f(obj3);
        }
        j8 = 0;
        while (nanos > j8) {
            Object obj4 = this.f5841j;
            if (obj4 != null) {
                return m3204f(obj4);
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
        if (nanos + 1000 < j8) {
            String strM16l2 = AbstractC0008a1.m16l(strM16l, " (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z7 = jConvert == j8 || nanos2 > 1000;
            if (jConvert > j8) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final String m3209h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: i */
    public final void m3210i(C1523m c1523m) {
        c1523m.f5835a = null;
        while (true) {
            C1523m c1523m2 = this.f5843l;
            if (c1523m2 == C1523m.f5834c) {
                return;
            }
            C1523m c1523m3 = null;
            while (c1523m2 != null) {
                C1523m c1523m4 = c1523m2.f5836b;
                if (c1523m2.f5835a != null) {
                    c1523m3 = c1523m2;
                } else if (c1523m3 != null) {
                    c1523m3.f5836b = c1523m4;
                    if (c1523m3.f5835a == null) {
                        break;
                    }
                } else if (!f5839o.mo1597k(this, c1523m2, c1523m4)) {
                    break;
                }
                c1523m2 = c1523m4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f5841j instanceof C1511a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f5841j != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String strM3209h;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m3207b(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                strM3209h = m3209h();
            } catch (Exception | StackOverflowError e) {
                strM3209h = "Exception thrown from implementation: " + e.getClass();
            }
            if (strM3209h != null) {
                if (strM3209h.isEmpty()) {
                    strM3209h = null;
                }
                if (strM3209h != null) {
                    sb.append(", info=[");
                    sb.append(strM3209h);
                    sb.append("]");
                }
                if (isDone()) {
                    sb.delete(length, sb.length());
                    m3207b(sb);
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        C1523m c1523m = C1523m.f5834c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5841j;
            if (obj2 != null) {
                return m3204f(obj2);
            }
            C1523m c1523m2 = this.f5843l;
            if (c1523m2 != c1523m) {
                C1523m c1523m3 = new C1523m();
                do {
                    AbstractC0715d abstractC0715d = f5839o;
                    abstractC0715d.mo1590b0(c1523m3, c1523m2);
                    if (abstractC0715d.mo1597k(this, c1523m2, c1523m3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5841j;
                            } else {
                                m3210i(c1523m3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m3204f(obj);
                    }
                    c1523m2 = this.f5843l;
                } while (c1523m2 != c1523m);
            }
            Object obj3 = this.f5841j;
            Objects.requireNonNull(obj3);
            return m3204f(obj3);
        }
        throw new InterruptedException();
    }
}
