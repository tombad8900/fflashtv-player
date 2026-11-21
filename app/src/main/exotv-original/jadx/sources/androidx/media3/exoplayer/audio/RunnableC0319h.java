package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.audio.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0319h implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1674j;

    /* renamed from: k */
    public final /* synthetic */ String f1675k;

    /* renamed from: l */
    public final /* synthetic */ long f1676l;

    /* renamed from: m */
    public final /* synthetic */ long f1677m;

    /* renamed from: n */
    public final /* synthetic */ Object f1678n;

    public /* synthetic */ RunnableC0319h(Object obj, String str, long j, long j8, int i) {
        this.f1674j = i;
        this.f1678n = obj;
        this.f1675k = str;
        this.f1676l = j;
        this.f1677m = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1674j) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.f1678n).lambda$decoderInitialized$1(this.f1675k, this.f1676l, this.f1677m);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.f1678n).lambda$decoderInitialized$1(this.f1675k, this.f1676l, this.f1677m);
                break;
        }
    }
}
