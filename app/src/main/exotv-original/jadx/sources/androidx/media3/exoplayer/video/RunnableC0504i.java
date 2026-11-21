package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.video.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0504i implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1907j;

    /* renamed from: k */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f1908k;

    /* renamed from: l */
    public final /* synthetic */ DecoderCounters f1909l;

    public /* synthetic */ RunnableC0504i(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.f1907j = i;
        this.f1908k = eventDispatcher;
        this.f1909l = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1907j) {
            case 0:
                this.f1908k.lambda$enabled$0(this.f1909l);
                break;
            default:
                this.f1908k.lambda$disabled$8(this.f1909l);
                break;
        }
    }
}
