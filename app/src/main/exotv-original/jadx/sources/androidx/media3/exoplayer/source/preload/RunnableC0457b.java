package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaSource;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.preload.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0457b implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1851j;

    /* renamed from: k */
    public final /* synthetic */ BasePreloadManager f1852k;

    /* renamed from: l */
    public final /* synthetic */ MediaSource f1853l;

    public /* synthetic */ RunnableC0457b(BasePreloadManager basePreloadManager, MediaSource mediaSource, int i) {
        this.f1851j = i;
        this.f1852k = basePreloadManager;
        this.f1853l = mediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1851j) {
            case 0:
                this.f1852k.lambda$onPreloadCompleted$2(this.f1853l);
                break;
            default:
                this.f1852k.lambda$onPreloadSkipped$5(this.f1853l);
                break;
        }
    }
}
