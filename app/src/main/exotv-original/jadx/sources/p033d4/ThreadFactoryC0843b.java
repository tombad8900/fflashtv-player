package p033d4;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d4.b */
/* loaded from: classes.dex */
public final class ThreadFactoryC0843b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C0842a(runnable);
    }
}
