package p127o7;

import java.util.concurrent.Executor;
import p076i7.AbstractC1317n0;
import p076i7.AbstractC1327r;
import p112m7.AbstractC1925a;
import p112m7.AbstractC1944t;
import p137p6.C2228i;
import p137p6.InterfaceC2227h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o7.d */
/* loaded from: classes.dex */
public final class ExecutorC2053d extends AbstractC1317n0 implements Executor {

    /* renamed from: l */
    public static final ExecutorC2053d f7598l = new ExecutorC2053d();

    /* renamed from: m */
    public static final AbstractC1327r f7599m;

    static {
        C2061l c2061l = C2061l.f7612l;
        int i = AbstractC1944t.f7234a;
        if (64 >= i) {
            i = 64;
        }
        f7599m = c2061l.mo2830F(AbstractC1925a.m3772h("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // p076i7.AbstractC1327r
    /* renamed from: D */
    public final void mo2822D(InterfaceC2227h interfaceC2227h, Runnable runnable) {
        f7599m.mo2822D(interfaceC2227h, runnable);
    }

    @Override // p076i7.AbstractC1327r
    /* renamed from: F */
    public final AbstractC1327r mo2830F(int i) {
        return C2061l.f7612l.mo2830F(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo2822D(C2228i.f7747j, runnable);
    }

    @Override // p076i7.AbstractC1327r
    public final String toString() {
        return "Dispatchers.IO";
    }
}
