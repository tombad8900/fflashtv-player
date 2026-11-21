package p076i7;

import p112m7.C1943s;
import p112m7.C1945u;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.j0 */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1305j0 implements Runnable, Comparable, InterfaceC1293f0 {
    private volatile Object _heap;

    /* renamed from: j */
    public long f5335j;

    /* renamed from: k */
    public int f5336k = -1;

    public AbstractRunnableC1305j0(long j) {
        this.f5335j = j;
    }

    /* renamed from: b */
    public final int m2820b(long j, C1308k0 c1308k0, AbstractC1311l0 abstractC1311l0) {
        synchronized (this) {
            if (this._heap == AbstractC1339x.f5376b) {
                return 2;
            }
            synchronized (c1308k0) {
                try {
                    AbstractRunnableC1305j0[] abstractRunnableC1305j0Arr = c1308k0.f7236a;
                    AbstractRunnableC1305j0 abstractRunnableC1305j0 = abstractRunnableC1305j0Arr != null ? abstractRunnableC1305j0Arr[0] : null;
                    if (AbstractC1311l0.f5343q.get(abstractC1311l0) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC1305j0 == null) {
                        c1308k0.f5339c = j;
                    } else {
                        long j8 = abstractRunnableC1305j0.f5335j;
                        if (j8 - j < 0) {
                            j = j8;
                        }
                        if (j - c1308k0.f5339c > 0) {
                            c1308k0.f5339c = j;
                        }
                    }
                    long j9 = this.f5335j;
                    long j10 = c1308k0.f5339c;
                    if (j9 - j10 < 0) {
                        this.f5335j = j10;
                    }
                    c1308k0.m3800a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p076i7.InterfaceC1293f0
    /* renamed from: c */
    public final void mo2783c() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C1943s c1943s = AbstractC1339x.f5376b;
                if (obj == c1943s) {
                    return;
                }
                C1308k0 c1308k0 = obj instanceof C1308k0 ? (C1308k0) obj : null;
                if (c1308k0 != null) {
                    synchronized (c1308k0) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C1945u ? (C1945u) obj2 : null) != null) {
                            c1308k0.m3801b(this.f5336k);
                        }
                    }
                }
                this._heap = c1943s;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f5335j - ((AbstractRunnableC1305j0) obj).f5335j;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* renamed from: d */
    public final void m2821d(C1308k0 c1308k0) {
        if (this._heap == AbstractC1339x.f5376b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c1308k0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f5335j + ']';
    }
}
