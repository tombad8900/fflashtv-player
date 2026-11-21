package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.AbstractC0230p1;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import java.io.IOException;
import p052f6.AbstractC0995q0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.ads.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0436b implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1814j;

    /* renamed from: k */
    public final /* synthetic */ Object f1815k;

    /* renamed from: l */
    public final /* synthetic */ Object f1816l;

    /* renamed from: m */
    public final /* synthetic */ Object f1817m;

    public /* synthetic */ RunnableC0436b(Object obj, Object obj2, Object obj3, int i) {
        this.f1814j = i;
        this.f1815k = obj;
        this.f1816l = obj2;
        this.f1817m = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1814j) {
            case 0:
                ((AdsMediaSource.AdPrepareListener) this.f1815k).lambda$onPrepareError$1((MediaSource.MediaPeriodId) this.f1816l, (IOException) this.f1817m);
                break;
            default:
                ((ServerSideAdInsertionMediaSource) this.f1815k).lambda$setAdPlaybackStates$0((AbstractC0995q0) this.f1816l, (AbstractC0230p1) this.f1817m);
                break;
        }
    }
}
