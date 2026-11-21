package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.audio.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0313b implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1655j;

    /* renamed from: k */
    public final /* synthetic */ long f1656k;

    /* renamed from: l */
    public final /* synthetic */ Object f1657l;

    public /* synthetic */ RunnableC0313b(Object obj, long j, int i) {
        this.f1655j = i;
        this.f1657l = obj;
        this.f1656k = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1655j) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.f1657l).lambda$positionAdvancing$3(this.f1656k);
                break;
            default:
                ((PreloadMediaSource) this.f1657l).lambda$preload$0(this.f1656k);
                break;
        }
    }
}
