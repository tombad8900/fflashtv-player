package p063h1;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.f0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1112f0 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f4732a;

    /* renamed from: b */
    public final /* synthetic */ String f4733b;

    public /* synthetic */ ThreadFactoryC1112f0(String str, int i) {
        this.f4732a = i;
        this.f4733b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f4732a) {
            case 0:
                return new Thread(runnable, this.f4733b);
            default:
                Thread thread = new Thread(runnable, this.f4733b);
                thread.setPriority(10);
                return thread;
        }
    }
}
