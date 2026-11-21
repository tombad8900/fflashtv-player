package p127o7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o7.m */
/* loaded from: classes.dex */
public final class C2062m {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7613b = AtomicReferenceFieldUpdater.newUpdater(C2062m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7614c = AtomicIntegerFieldUpdater.newUpdater(C2062m.class, "producerIndex$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7615d = AtomicIntegerFieldUpdater.newUpdater(C2062m.class, "consumerIndex$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7616e = AtomicIntegerFieldUpdater.newUpdater(C2062m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a */
    public final AtomicReferenceArray f7617a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* renamed from: a */
    public final AbstractRunnableC2058i m3955a() {
        AbstractRunnableC2058i abstractRunnableC2058i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7615d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f7614c.get(this) == 0) {
                return null;
            }
            int i4 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC2058i = (AbstractRunnableC2058i) this.f7617a.getAndSet(i4, null)) != null) {
                if (abstractRunnableC2058i.f7604k) {
                    f7616e.decrementAndGet(this);
                }
                return abstractRunnableC2058i;
            }
        }
    }

    /* renamed from: b */
    public final AbstractRunnableC2058i m3956b(int i, boolean z7) {
        int i4 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f7617a;
        AbstractRunnableC2058i abstractRunnableC2058i = (AbstractRunnableC2058i) atomicReferenceArray.get(i4);
        if (abstractRunnableC2058i != null && abstractRunnableC2058i.f7604k == z7) {
            while (!atomicReferenceArray.compareAndSet(i4, abstractRunnableC2058i, null)) {
                if (atomicReferenceArray.get(i4) != abstractRunnableC2058i) {
                }
            }
            if (z7) {
                f7616e.decrementAndGet(this);
            }
            return abstractRunnableC2058i;
        }
        return null;
    }
}
