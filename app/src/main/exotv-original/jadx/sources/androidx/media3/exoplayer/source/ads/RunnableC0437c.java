package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.C0187c;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.ads.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0437c implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1818j;

    /* renamed from: k */
    public final /* synthetic */ Object f1819k;

    /* renamed from: l */
    public final /* synthetic */ Object f1820l;

    public /* synthetic */ RunnableC0437c(Object obj, int i, Object obj2) {
        this.f1818j = i;
        this.f1819k = obj;
        this.f1820l = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1818j) {
            case 0:
                ((AdsMediaSource.AdPrepareListener) this.f1819k).lambda$onPrepareComplete$0((MediaSource.MediaPeriodId) this.f1820l);
                break;
            default:
                ((AdsMediaSource.ComponentListener) this.f1819k).lambda$onAdPlaybackState$0((C0187c) this.f1820l);
                break;
        }
    }
}
