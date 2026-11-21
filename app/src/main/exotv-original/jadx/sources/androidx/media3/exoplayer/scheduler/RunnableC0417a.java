package androidx.media3.exoplayer.scheduler;

import androidx.media3.exoplayer.scheduler.RequirementsWatcher;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.scheduler.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0417a implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1802j;

    /* renamed from: k */
    public final /* synthetic */ RequirementsWatcher.NetworkCallback f1803k;

    public /* synthetic */ RunnableC0417a(RequirementsWatcher.NetworkCallback networkCallback, int i) {
        this.f1802j = i;
        this.f1803k = networkCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1802j) {
            case 0:
                this.f1803k.lambda$postCheckRequirements$0();
                break;
            default:
                this.f1803k.lambda$postRecheckNotMetNetworkRequirements$1();
                break;
        }
    }
}
