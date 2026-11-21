package androidx.media3.exoplayer.offline;

import androidx.media3.exoplayer.offline.DownloadService;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.offline.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0411f implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1794j;

    /* renamed from: k */
    public final /* synthetic */ Object f1795k;

    public /* synthetic */ RunnableC0411f(int i, Object obj) {
        this.f1794j = i;
        this.f1795k = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1794j) {
            case 0:
                ((DownloadService.ForegroundNotificationUpdater) this.f1795k).update();
                break;
            default:
                ((DownloadHelper) this.f1795k).lambda$onMediaPrepared$4();
                break;
        }
    }
}
