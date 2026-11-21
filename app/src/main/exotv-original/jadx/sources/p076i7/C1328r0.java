package p076i7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.r0 */
/* loaded from: classes.dex */
public final class C1328r0 extends AbstractC1338w0 {

    /* renamed from: o */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5366o = AtomicIntegerFieldUpdater.newUpdater(C1328r0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: n */
    public final C1336v0 f5367n;

    public C1328r0(C1336v0 c1336v0) {
        this.f5367n = c1336v0;
    }

    @Override // p076i7.AbstractC1338w0
    /* renamed from: j */
    public final boolean mo2816j() {
        return true;
    }

    @Override // p076i7.AbstractC1338w0
    /* renamed from: k */
    public final void mo2817k(Throwable th) {
        if (f5366o.compareAndSet(this, 0, 1)) {
            this.f5367n.invoke(th);
        }
    }
}
