package p033d4;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p085j6.RunnableC1527q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d4.c */
/* loaded from: classes.dex */
public final class ThreadFactoryC0844c implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactoryC0843b f3723a;

    /* renamed from: b */
    public final String f3724b;

    /* renamed from: d */
    public final boolean f3726d;

    /* renamed from: e */
    public final AtomicInteger f3727e = new AtomicInteger();

    /* renamed from: c */
    public final C0845d f3725c = C0845d.f3728a;

    public ThreadFactoryC0844c(ThreadFactoryC0843b threadFactoryC0843b, String str, boolean z7) {
        this.f3723a = threadFactoryC0843b;
        this.f3724b = str;
        this.f3726d = z7;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC1527q runnableC1527q = new RunnableC1527q(this, runnable, 5, false);
        this.f3723a.getClass();
        C0842a c0842a = new C0842a(runnableC1527q);
        c0842a.setName("glide-" + this.f3724b + "-thread-" + this.f3727e.getAndIncrement());
        return c0842a;
    }
}
