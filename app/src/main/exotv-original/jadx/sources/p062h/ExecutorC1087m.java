package p062h;

import androidx.media3.exoplayer.audio.RunnableC0320i;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.m */
/* loaded from: classes.dex */
public final class ExecutorC1087m implements Executor {

    /* renamed from: j */
    public final Object f4607j = new Object();

    /* renamed from: k */
    public final ArrayDeque f4608k = new ArrayDeque();

    /* renamed from: l */
    public final ExecutorC1088n f4609l;

    /* renamed from: m */
    public Runnable f4610m;

    public ExecutorC1087m(ExecutorC1088n executorC1088n) {
        this.f4609l = executorC1088n;
    }

    /* renamed from: a */
    public final void m2304a() {
        synchronized (this.f4607j) {
            try {
                Runnable runnable = (Runnable) this.f4608k.poll();
                this.f4610m = runnable;
                if (runnable != null) {
                    this.f4609l.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f4607j) {
            try {
                this.f4608k.add(new RunnableC0320i(this, 7, runnable));
                if (this.f4610m == null) {
                    m2304a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
