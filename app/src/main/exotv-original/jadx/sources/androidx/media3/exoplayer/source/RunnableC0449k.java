package androidx.media3.exoplayer.source;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0449k implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1843j;

    /* renamed from: k */
    public final /* synthetic */ ProgressiveMediaPeriod f1844k;

    public /* synthetic */ RunnableC0449k(ProgressiveMediaPeriod progressiveMediaPeriod, int i) {
        this.f1843j = i;
        this.f1844k = progressiveMediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1843j) {
            case 0:
                this.f1844k.lambda$onLengthKnown$2();
                break;
            case 1:
                this.f1844k.maybeFinishPrepare();
                break;
            default:
                this.f1844k.lambda$new$0();
                break;
        }
    }
}
