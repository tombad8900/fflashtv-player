package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.video.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0502g implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1900j = 0;

    /* renamed from: k */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f1901k;

    /* renamed from: l */
    public final /* synthetic */ long f1902l;

    /* renamed from: m */
    public final /* synthetic */ int f1903m;

    public /* synthetic */ RunnableC0502g(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.f1901k = eventDispatcher;
        this.f1903m = i;
        this.f1902l = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1900j) {
            case 0:
                this.f1901k.lambda$droppedFrames$3(this.f1903m, this.f1902l);
                break;
            default:
                this.f1901k.lambda$reportVideoFrameProcessingOffset$4(this.f1902l, this.f1903m);
                break;
        }
    }

    public /* synthetic */ RunnableC0502g(VideoRendererEventListener.EventDispatcher eventDispatcher, long j, int i) {
        this.f1901k = eventDispatcher;
        this.f1902l = j;
        this.f1903m = i;
    }
}
