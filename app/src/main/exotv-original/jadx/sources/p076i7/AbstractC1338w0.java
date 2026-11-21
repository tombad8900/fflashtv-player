package p076i7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p112m7.C1934j;
import p112m7.C1939o;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.w0 */
/* loaded from: classes.dex */
public abstract class AbstractC1338w0 extends C1934j implements InterfaceC1293f0, InterfaceC1323p0 {

    /* renamed from: m */
    public C1279a1 f5374m;

    @Override // p076i7.InterfaceC1323p0
    /* renamed from: b */
    public final C1282b1 mo2779b() {
        return null;
    }

    @Override // p076i7.InterfaceC1293f0
    /* renamed from: c */
    public final void mo2783c() {
        C1279a1 c1279a1M2839i = m2839i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1279a1.f5307j;
            Object obj = atomicReferenceFieldUpdater.get(c1279a1M2839i);
            if (obj instanceof AbstractC1338w0) {
                if (obj != this) {
                    return;
                }
                C1296g0 c1296g0 = AbstractC1339x.f5384j;
                while (!atomicReferenceFieldUpdater.compareAndSet(c1279a1M2839i, obj, c1296g0)) {
                    if (atomicReferenceFieldUpdater.get(c1279a1M2839i) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC1323p0) || ((InterfaceC1323p0) obj).mo2779b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1934j.f7215j;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C1939o) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                AbstractC2980h.m5134c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj2);
                C1934j c1934j = (C1934j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C1934j.f7217l;
                C1939o c1939o = (C1939o) atomicReferenceFieldUpdater3.get(c1934j);
                if (c1939o == null) {
                    c1939o = new C1939o(c1934j);
                    atomicReferenceFieldUpdater3.set(c1934j, c1939o);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c1939o)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                c1934j.m3779e();
                return;
            }
        }
    }

    /* renamed from: i */
    public final C1279a1 m2839i() {
        C1279a1 c1279a1 = this.f5374m;
        if (c1279a1 != null) {
            return c1279a1;
        }
        AbstractC2980h.m5139h("job");
        throw null;
    }

    @Override // p076i7.InterfaceC1323p0
    public final boolean isActive() {
        return true;
    }

    /* renamed from: j */
    public abstract boolean mo2816j();

    /* renamed from: k */
    public abstract void mo2817k(Throwable th);

    @Override // p112m7.C1934j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1339x.m2845f(this) + "[job@" + AbstractC1339x.m2845f(m2839i()) + ']';
    }
}
