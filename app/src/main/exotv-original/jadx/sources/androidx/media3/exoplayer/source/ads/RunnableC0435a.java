package androidx.media3.exoplayer.source.ads;

import androidx.media3.exoplayer.source.ads.AdsMediaSource;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.ads.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0435a implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1811j;

    /* renamed from: k */
    public final /* synthetic */ AdsMediaSource f1812k;

    /* renamed from: l */
    public final /* synthetic */ AdsMediaSource.ComponentListener f1813l;

    public /* synthetic */ RunnableC0435a(AdsMediaSource adsMediaSource, AdsMediaSource.ComponentListener componentListener, int i) {
        this.f1811j = i;
        this.f1812k = adsMediaSource;
        this.f1813l = componentListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1811j) {
            case 0:
                this.f1812k.lambda$prepareSourceInternal$0(this.f1813l);
                break;
            default:
                this.f1812k.lambda$releaseSourceInternal$1(this.f1813l);
                break;
        }
    }
}
