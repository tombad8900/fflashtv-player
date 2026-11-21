package androidx.media3.exoplayer.hls;

import androidx.media3.exoplayer.hls.HlsSampleStreamWrapper;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.hls.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0370c implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1762j;

    /* renamed from: k */
    public final /* synthetic */ Object f1763k;

    public /* synthetic */ RunnableC0370c(int i, Object obj) {
        this.f1762j = i;
        this.f1763k = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1762j) {
            case 0:
                ((HlsSampleStreamWrapper) this.f1763k).maybeFinishPrepare();
                break;
            case 1:
                ((HlsSampleStreamWrapper) this.f1763k).onTracksEnded();
                break;
            default:
                ((HlsSampleStreamWrapper.Callback) this.f1763k).onPrepared();
                break;
        }
    }
}
