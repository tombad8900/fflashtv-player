package p112m7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p138p7.C2238j;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.b */
/* loaded from: classes.dex */
public abstract class AbstractC1926b {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7197a = AtomicReferenceFieldUpdater.newUpdater(AbstractC1926b.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7198b = AtomicReferenceFieldUpdater.newUpdater(AbstractC1926b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC1926b(C2238j c2238j) {
        this._prev$volatile = c2238j;
    }

    /* renamed from: a */
    public abstract boolean mo3774a();

    /* renamed from: b */
    public final void m3775b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7197a;
        Object obj = atomicReferenceFieldUpdater.get(this);
        C1943s c1943s = AbstractC1925a.f7190a;
        if ((obj == c1943s ? null : (AbstractC1926b) obj) == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7198b;
            AbstractC1926b abstractC1926b = (AbstractC1926b) atomicReferenceFieldUpdater2.get(this);
            while (abstractC1926b != null && abstractC1926b.mo3774a()) {
                abstractC1926b = (AbstractC1926b) atomicReferenceFieldUpdater2.get(abstractC1926b);
            }
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            AbstractC1926b abstractC1926b2 = obj2 == c1943s ? null : (AbstractC1926b) obj2;
            AbstractC2980h.m5133b(abstractC1926b2);
            while (abstractC1926b2.mo3774a()) {
                Object obj3 = atomicReferenceFieldUpdater.get(abstractC1926b2);
                AbstractC1926b abstractC1926b3 = obj3 == c1943s ? null : (AbstractC1926b) obj3;
                if (abstractC1926b3 == null) {
                    break;
                } else {
                    abstractC1926b2 = abstractC1926b3;
                }
            }
            while (true) {
                Object obj4 = atomicReferenceFieldUpdater2.get(abstractC1926b2);
                AbstractC1926b abstractC1926b4 = ((AbstractC1926b) obj4) == null ? null : abstractC1926b;
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC1926b2, obj4, abstractC1926b4)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC1926b2) != obj4) {
                        break;
                    }
                }
            }
            if (abstractC1926b != null) {
                atomicReferenceFieldUpdater.set(abstractC1926b, abstractC1926b2);
            }
            if (abstractC1926b2.mo3774a()) {
                Object obj5 = atomicReferenceFieldUpdater.get(abstractC1926b2);
                if ((obj5 == c1943s ? null : (AbstractC1926b) obj5) != null) {
                    continue;
                }
            }
            if (abstractC1926b == null || !abstractC1926b.mo3774a()) {
                return;
            }
        }
    }
}
