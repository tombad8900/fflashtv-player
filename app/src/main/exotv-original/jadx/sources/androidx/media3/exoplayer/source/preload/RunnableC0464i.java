package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.AbstractC0230p1;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.preload.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0464i implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1862j;

    /* renamed from: k */
    public final /* synthetic */ Object f1863k;

    /* renamed from: l */
    public final /* synthetic */ Object f1864l;

    public /* synthetic */ RunnableC0464i(Object obj, int i, Object obj2) {
        this.f1862j = i;
        this.f1863k = obj;
        this.f1864l = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1862j) {
            case 0:
                ((PreloadMediaSource.PreloadMediaPeriodCallback) this.f1863k).lambda$onPrepared$0((MediaPeriod) this.f1864l);
                break;
            case 1:
                ((PreloadMediaSource.PreloadMediaPeriodCallback) this.f1863k).lambda$onContinueLoadingRequested$1((MediaPeriod) this.f1864l);
                break;
            default:
                ((PreloadMediaSource) this.f1863k).lambda$onChildSourceInfoRefreshed$2((AbstractC0230p1) this.f1864l);
                break;
        }
    }
}
