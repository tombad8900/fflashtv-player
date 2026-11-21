package p112m7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.k */
/* loaded from: classes.dex */
public class C1935k {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7218a = AtomicReferenceFieldUpdater.newUpdater(C1935k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C1937m(8, false);

    /* renamed from: a */
    public final boolean m3782a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7218a;
            C1937m c1937m = (C1937m) atomicReferenceFieldUpdater.get(this);
            int iM3786a = c1937m.m3786a(runnable);
            if (iM3786a == 0) {
                return true;
            }
            if (iM3786a == 1) {
                C1937m c1937mM3788c = c1937m.m3788c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c1937m, c1937mM3788c) && atomicReferenceFieldUpdater.get(this) == c1937m) {
                }
            } else if (iM3786a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m3783b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7218a;
            C1937m c1937m = (C1937m) atomicReferenceFieldUpdater.get(this);
            if (c1937m.m3787b()) {
                return;
            }
            C1937m c1937mM3788c = c1937m.m3788c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1937m, c1937mM3788c) && atomicReferenceFieldUpdater.get(this) == c1937m) {
            }
        }
    }

    /* renamed from: c */
    public final int m3784c() {
        C1937m c1937m = (C1937m) f7218a.get(this);
        c1937m.getClass();
        long j = C1937m.f7221f.get(c1937m);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    /* renamed from: d */
    public final Object m3785d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7218a;
            C1937m c1937m = (C1937m) atomicReferenceFieldUpdater.get(this);
            Object objM3789d = c1937m.m3789d();
            if (objM3789d != C1937m.f7222g) {
                return objM3789d;
            }
            C1937m c1937mM3788c = c1937m.m3788c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1937m, c1937mM3788c) && atomicReferenceFieldUpdater.get(this) == c1937m) {
            }
        }
    }
}
