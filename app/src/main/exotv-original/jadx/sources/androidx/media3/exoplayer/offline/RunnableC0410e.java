package androidx.media3.exoplayer.offline;

import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.offline.DownloadService;
import java.io.IOException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.offline.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0410e implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1791j;

    /* renamed from: k */
    public final /* synthetic */ Object f1792k;

    /* renamed from: l */
    public final /* synthetic */ Object f1793l;

    public /* synthetic */ RunnableC0410e(Object obj, int i, Object obj2) {
        this.f1791j = i;
        this.f1792k = obj;
        this.f1793l = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1791j) {
            case 0:
                ((DownloadService.DownloadManagerHelper) this.f1792k).lambda$attachService$0((DownloadService) this.f1793l);
                break;
            case 1:
                ((DownloadHelper) this.f1792k).lambda$onMediaPreparationFailed$5((IOException) this.f1793l);
                break;
            default:
                ((DownloadHelper) this.f1792k).lambda$prepare$3((DownloadHelper.Callback) this.f1793l);
                break;
        }
    }
}
