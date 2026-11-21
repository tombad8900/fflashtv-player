package p113n;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n.b */
/* loaded from: classes.dex */
public final class ThreadFactoryC1948b implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f7241a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f7241a.getAndIncrement());
        return thread;
    }
}
