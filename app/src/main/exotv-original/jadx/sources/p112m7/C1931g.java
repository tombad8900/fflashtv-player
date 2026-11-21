package p112m7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p076i7.AbstractC1327r;
import p076i7.AbstractC1343z;
import p076i7.C1295g;
import p076i7.InterfaceC1281b0;
import p076i7.InterfaceC1293f0;
import p076i7.RunnableC1309k1;
import p085j6.RunnableC1527q;
import p137p6.InterfaceC2227h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.g */
/* loaded from: classes.dex */
public final class C1931g extends AbstractC1327r implements InterfaceC1281b0 {

    /* renamed from: q */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7207q = AtomicIntegerFieldUpdater.newUpdater(C1931g.class, "runningWorkers$volatile");

    /* renamed from: l */
    public final /* synthetic */ InterfaceC1281b0 f7208l;

    /* renamed from: m */
    public final AbstractC1327r f7209m;

    /* renamed from: n */
    public final int f7210n;

    /* renamed from: o */
    public final C1935k f7211o;

    /* renamed from: p */
    public final Object f7212p;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C1931g(AbstractC1327r abstractC1327r, int i) {
        InterfaceC1281b0 interfaceC1281b0 = abstractC1327r instanceof InterfaceC1281b0 ? (InterfaceC1281b0) abstractC1327r : null;
        this.f7208l = interfaceC1281b0 == null ? AbstractC1343z.f5392a : interfaceC1281b0;
        this.f7209m = abstractC1327r;
        this.f7210n = i;
        this.f7211o = new C1935k();
        this.f7212p = new Object();
    }

    @Override // p076i7.AbstractC1327r
    /* renamed from: D */
    public final void mo2822D(InterfaceC2227h interfaceC2227h, Runnable runnable) {
        this.f7211o.m3782a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7207q;
        if (atomicIntegerFieldUpdater.get(this) < this.f7210n) {
            synchronized (this.f7212p) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f7210n) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableM3776G = m3776G();
                if (runnableM3776G == null) {
                    return;
                }
                this.f7209m.mo2822D(this, new RunnableC1527q(this, runnableM3776G, 10, false));
            }
        }
    }

    @Override // p076i7.AbstractC1327r
    /* renamed from: F */
    public final AbstractC1327r mo2830F(int i) {
        AbstractC1925a.m3765a(1);
        return 1 >= this.f7210n ? this : super.mo2830F(1);
    }

    /* renamed from: G */
    public final Runnable m3776G() {
        while (true) {
            Runnable runnable = (Runnable) this.f7211o.m3785d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f7212p) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7207q;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f7211o.m3784c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // p076i7.InterfaceC1281b0
    /* renamed from: k */
    public final InterfaceC1293f0 mo2777k(long j, RunnableC1309k1 runnableC1309k1, InterfaceC2227h interfaceC2227h) {
        return this.f7208l.mo2777k(j, runnableC1309k1, interfaceC2227h);
    }

    @Override // p076i7.AbstractC1327r
    public final String toString() {
        return this.f7209m + ".limitedParallelism(" + this.f7210n + ')';
    }

    @Override // p076i7.InterfaceC1281b0
    /* renamed from: x */
    public final void mo2778x(C1295g c1295g) {
        this.f7208l.mo2778x(c1295g);
    }
}
