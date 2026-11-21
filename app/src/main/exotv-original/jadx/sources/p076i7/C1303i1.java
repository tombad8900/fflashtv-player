package p076i7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.i1 */
/* loaded from: classes.dex */
public final class C1303i1 extends AbstractC1338w0 {

    /* renamed from: p */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5332p = AtomicIntegerFieldUpdater.newUpdater(C1303i1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: n */
    public final Thread f5333n = Thread.currentThread();

    /* renamed from: o */
    public InterfaceC1293f0 f5334o;

    /* renamed from: m */
    public static void m2818m(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // p076i7.AbstractC1338w0
    /* renamed from: j */
    public final boolean mo2816j() {
        return true;
    }

    @Override // p076i7.AbstractC1338w0
    /* renamed from: k */
    public final void mo2817k(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f5332p;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                m2818m(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f5333n.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* renamed from: l */
    public final void m2819l() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5332p;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m2818m(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                InterfaceC1293f0 interfaceC1293f0 = this.f5334o;
                if (interfaceC1293f0 != null) {
                    interfaceC1293f0.mo2783c();
                    return;
                }
                return;
            }
        }
    }
}
