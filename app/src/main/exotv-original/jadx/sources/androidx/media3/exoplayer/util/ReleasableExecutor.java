package androidx.media3.exoplayer.util;

import java.util.concurrent.Executor;
import p063h1.InterfaceC1111f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface ReleasableExecutor extends Executor {
    static <T extends Executor> ReleasableExecutor from(final T t8, final InterfaceC1111f interfaceC1111f) {
        return new ReleasableExecutor() { // from class: androidx.media3.exoplayer.util.ReleasableExecutor.1
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                t8.execute(runnable);
            }

            @Override // androidx.media3.exoplayer.util.ReleasableExecutor
            public void release() {
                interfaceC1111f.accept(t8);
            }
        };
    }

    void release();
}
