package p112m7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p076i7.AbstractC1339x;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.j */
/* loaded from: classes.dex */
public class C1934j {

    /* renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7215j = AtomicReferenceFieldUpdater.newUpdater(C1934j.class, Object.class, "_next$volatile");

    /* renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7216k = AtomicReferenceFieldUpdater.newUpdater(C1934j.class, Object.class, "_prev$volatile");

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7217l = AtomicReferenceFieldUpdater.newUpdater(C1934j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* renamed from: d */
    public final boolean m3778d(C1934j c1934j, int i) {
        while (true) {
            C1934j c1934jM3779e = m3779e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7216k;
            if (c1934jM3779e == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c1934jM3779e = (C1934j) obj;
                    if (!c1934jM3779e.mo2780h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c1934jM3779e);
                }
            }
            if (c1934jM3779e instanceof C1932h) {
                return (((C1932h) c1934jM3779e).f7213m & i) == 0 && c1934jM3779e.m3778d(c1934j, i);
            }
            atomicReferenceFieldUpdater.set(c1934j, c1934jM3779e);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7215j;
            atomicReferenceFieldUpdater2.set(c1934j, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(c1934jM3779e, this, c1934j)) {
                if (atomicReferenceFieldUpdater2.get(c1934jM3779e) != this) {
                    break;
                }
            }
            c1934j.m3780f(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((p112m7.C1939o) r6).f7228a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1934j m3779e() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7216k;
            C1934j c1934j = (C1934j) atomicReferenceFieldUpdater.get(this);
            C1934j c1934j2 = c1934j;
            while (true) {
                C1934j c1934j3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7215j;
                    Object obj = atomicReferenceFieldUpdater2.get(c1934j2);
                    if (obj == this) {
                        if (c1934j == c1934j2) {
                            return c1934j2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, c1934j, c1934j2)) {
                            if (atomicReferenceFieldUpdater.get(this) != c1934j) {
                                break;
                            }
                        }
                        return c1934j2;
                    }
                    if (mo2780h()) {
                        return null;
                    }
                    if (!(obj instanceof C1939o)) {
                        AbstractC2980h.m5134c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj);
                        c1934j3 = c1934j2;
                        c1934j2 = (C1934j) obj;
                    } else {
                        if (c1934j3 != null) {
                            break;
                        }
                        c1934j2 = (C1934j) atomicReferenceFieldUpdater.get(c1934j2);
                    }
                }
                c1934j2 = c1934j3;
            }
        }
    }

    /* renamed from: f */
    public final void m3780f(C1934j c1934j) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7216k;
            C1934j c1934j2 = (C1934j) atomicReferenceFieldUpdater.get(c1934j);
            if (f7215j.get(this) != c1934j) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c1934j, c1934j2, this)) {
                if (atomicReferenceFieldUpdater.get(c1934j) != c1934j2) {
                    break;
                }
            }
            if (mo2780h()) {
                c1934j.m3779e();
                return;
            }
            return;
        }
    }

    /* renamed from: g */
    public final C1934j m3781g() {
        C1934j c1934j;
        Object obj = f7215j.get(this);
        C1939o c1939o = obj instanceof C1939o ? (C1939o) obj : null;
        if (c1939o != null && (c1934j = c1939o.f7228a) != null) {
            return c1934j;
        }
        AbstractC2980h.m5134c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj);
        return (C1934j) obj;
    }

    /* renamed from: h */
    public boolean mo2780h() {
        return f7215j.get(this) instanceof C1939o;
    }

    public String toString() {
        return new C1933i(this) + '@' + AbstractC1339x.m2845f(this);
    }
}
