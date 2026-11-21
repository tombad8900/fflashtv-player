package p085j6;

import com.bumptech.glide.AbstractC0715d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j6.e */
/* loaded from: classes.dex */
public final class C1515e extends AbstractC0715d {

    /* renamed from: n */
    public final AtomicReferenceFieldUpdater f5823n;

    /* renamed from: o */
    public final AtomicReferenceFieldUpdater f5824o;

    /* renamed from: p */
    public final AtomicReferenceFieldUpdater f5825p;

    /* renamed from: q */
    public final AtomicReferenceFieldUpdater f5826q;

    /* renamed from: r */
    public final AtomicReferenceFieldUpdater f5827r;

    public C1515e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f5823n = atomicReferenceFieldUpdater;
        this.f5824o = atomicReferenceFieldUpdater2;
        this.f5825p = atomicReferenceFieldUpdater3;
        this.f5826q = atomicReferenceFieldUpdater4;
        this.f5827r = atomicReferenceFieldUpdater5;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: A */
    public final C1514d mo1575A(AbstractC1524n abstractC1524n) {
        return (C1514d) this.f5826q.getAndSet(abstractC1524n, C1514d.f5819d);
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: B */
    public final C1523m mo1576B(AbstractC1524n abstractC1524n) {
        return (C1523m) this.f5825p.getAndSet(abstractC1524n, C1523m.f5834c);
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: b0 */
    public final void mo1590b0(C1523m c1523m, C1523m c1523m2) {
        this.f5824o.lazySet(c1523m, c1523m2);
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: c0 */
    public final void mo1591c0(C1523m c1523m, Thread thread) {
        this.f5823n.lazySet(c1523m, thread);
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: i */
    public final boolean mo1593i(AbstractC1524n abstractC1524n, C1514d c1514d, C1514d c1514d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5826q;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1524n, c1514d, c1514d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1524n) == c1514d);
        return false;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: j */
    public final boolean mo1595j(AbstractC1524n abstractC1524n, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5827r;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1524n, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1524n) == obj);
        return false;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: k */
    public final boolean mo1597k(AbstractC1524n abstractC1524n, C1523m c1523m, C1523m c1523m2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5825p;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1524n, c1523m, c1523m2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1524n) == c1523m);
        return false;
    }
}
