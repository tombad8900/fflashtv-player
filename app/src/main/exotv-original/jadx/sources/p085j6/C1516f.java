package p085j6;

import com.bumptech.glide.AbstractC0715d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j6.f */
/* loaded from: classes.dex */
public final class C1516f extends AbstractC0715d {
    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: A */
    public final C1514d mo1575A(AbstractC1524n abstractC1524n) {
        C1514d c1514d;
        C1514d c1514d2 = C1514d.f5819d;
        synchronized (abstractC1524n) {
            try {
                c1514d = abstractC1524n.f5842k;
                if (c1514d != c1514d2) {
                    abstractC1524n.f5842k = c1514d2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1514d;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: B */
    public final C1523m mo1576B(AbstractC1524n abstractC1524n) {
        C1523m c1523m;
        C1523m c1523m2 = C1523m.f5834c;
        synchronized (abstractC1524n) {
            try {
                c1523m = abstractC1524n.f5843l;
                if (c1523m != c1523m2) {
                    abstractC1524n.f5843l = c1523m2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1523m;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: b0 */
    public final void mo1590b0(C1523m c1523m, C1523m c1523m2) {
        c1523m.f5836b = c1523m2;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: c0 */
    public final void mo1591c0(C1523m c1523m, Thread thread) {
        c1523m.f5835a = thread;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: i */
    public final boolean mo1593i(AbstractC1524n abstractC1524n, C1514d c1514d, C1514d c1514d2) {
        synchronized (abstractC1524n) {
            try {
                if (abstractC1524n.f5842k != c1514d) {
                    return false;
                }
                abstractC1524n.f5842k = c1514d2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: j */
    public final boolean mo1595j(AbstractC1524n abstractC1524n, Object obj, Object obj2) {
        synchronized (abstractC1524n) {
            try {
                if (abstractC1524n.f5841j != obj) {
                    return false;
                }
                abstractC1524n.f5841j = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: k */
    public final boolean mo1597k(AbstractC1524n abstractC1524n, C1523m c1523m, C1523m c1523m2) {
        synchronized (abstractC1524n) {
            try {
                if (abstractC1524n.f5843l != c1523m) {
                    return false;
                }
                abstractC1524n.f5843l = c1523m2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
