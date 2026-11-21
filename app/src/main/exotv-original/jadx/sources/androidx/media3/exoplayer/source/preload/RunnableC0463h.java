package androidx.media3.exoplayer.source.preload;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.preload.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0463h implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1860j;

    /* renamed from: k */
    public final /* synthetic */ PreloadMediaSource f1861k;

    public /* synthetic */ RunnableC0463h(PreloadMediaSource preloadMediaSource, int i) {
        this.f1860j = i;
        this.f1861k = preloadMediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1860j) {
            case 0:
                this.f1861k.lambda$releasePreloadMediaSource$3();
                break;
            case 1:
                this.f1861k.lambda$clear$1();
                break;
            default:
                this.f1861k.checkForPreloadError();
                break;
        }
    }
}
