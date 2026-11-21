package p148r;

import android.support.v4.media.session.AbstractC0120b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r.d */
/* loaded from: classes.dex */
public final class C2282d extends AbstractC0120b {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater f7964a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater f7965b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f7966c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f7967d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f7968e;

    public C2282d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f7964a = atomicReferenceFieldUpdater;
        this.f7965b = atomicReferenceFieldUpdater2;
        this.f7966c = atomicReferenceFieldUpdater3;
        this.f7967d = atomicReferenceFieldUpdater4;
        this.f7968e = atomicReferenceFieldUpdater5;
    }

    @Override // android.support.v4.media.session.AbstractC0120b
    /* renamed from: E */
    public final void mo431E(C2284f c2284f, C2284f c2284f2) {
        this.f7965b.lazySet(c2284f, c2284f2);
    }

    @Override // android.support.v4.media.session.AbstractC0120b
    /* renamed from: F */
    public final void mo432F(C2284f c2284f, Thread thread) {
        this.f7964a.lazySet(c2284f, thread);
    }

    @Override // android.support.v4.media.session.AbstractC0120b
    /* renamed from: d */
    public final boolean mo433d(AbstractC2285g abstractC2285g, C2281c c2281c, C2281c c2281c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7967d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2285g, c2281c, c2281c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2285g) == c2281c);
        return false;
    }

    @Override // android.support.v4.media.session.AbstractC0120b
    /* renamed from: e */
    public final boolean mo434e(AbstractC2285g abstractC2285g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7968e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2285g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2285g) == obj);
        return false;
    }

    @Override // android.support.v4.media.session.AbstractC0120b
    /* renamed from: f */
    public final boolean mo435f(AbstractC2285g abstractC2285g, C2284f c2284f, C2284f c2284f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7966c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2285g, c2284f, c2284f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2285g) == c2284f);
        return false;
    }
}
