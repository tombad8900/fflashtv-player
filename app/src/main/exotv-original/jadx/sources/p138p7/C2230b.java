package p138p7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p076i7.AbstractC1339x;
import p112m7.C1943s;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p7.b */
/* loaded from: classes.dex */
public final class C2230b extends C2235g {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7750h = AtomicReferenceFieldUpdater.newUpdater(C2230b.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public C2230b() {
        super(1);
        this.owner$volatile = AbstractC2231c.f7751a;
    }

    /* renamed from: c */
    public final void m4008c(Object obj) {
        while (Math.max(C2235g.f7758g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7750h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C1943s c1943s = AbstractC2231c.f7751a;
            if (obj2 != c1943s) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c1943s)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    m4010b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC1339x.m2845f(this));
        sb.append("[isLocked=");
        sb.append(Math.max(C2235g.f7758g.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f7750h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
