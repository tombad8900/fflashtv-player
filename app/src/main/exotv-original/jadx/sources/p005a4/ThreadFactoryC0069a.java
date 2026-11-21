package p005a4;

import java.util.concurrent.ThreadFactory;
import p002a1.RunnableC0018f;
import p079j0.C1483k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.a */
/* loaded from: classes.dex */
public final class ThreadFactoryC0069a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f312a;

    public /* synthetic */ ThreadFactoryC0069a(int i) {
        this.f312a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f312a) {
            case 0:
                return new Thread(new RunnableC0018f(3, runnable), "glide-active-resources");
            default:
                return new C1483k(runnable);
        }
    }
}
