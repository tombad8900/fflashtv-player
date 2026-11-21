package p062h;

import java.util.concurrent.Executor;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.n */
/* loaded from: classes.dex */
public final class ExecutorC1088n implements Executor {

    /* renamed from: j */
    public final /* synthetic */ int f4611j;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4611j) {
            case 0:
                new Thread(runnable).start();
                break;
            case 1:
                AbstractC2478m.m4458f().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
