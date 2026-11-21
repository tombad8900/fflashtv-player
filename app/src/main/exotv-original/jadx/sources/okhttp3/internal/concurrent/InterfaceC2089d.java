package okhttp3.internal.concurrent;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.concurrent.d */
/* loaded from: classes.dex */
public interface InterfaceC2089d {
    void beforeTask(C2090e c2090e);

    void coordinatorNotify(C2090e c2090e);

    void coordinatorWait(C2090e c2090e, long j);

    void execute(Runnable runnable);

    long nanoTime();
}
