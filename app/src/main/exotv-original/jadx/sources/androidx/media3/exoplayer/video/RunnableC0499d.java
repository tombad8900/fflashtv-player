package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoSink;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.video.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0499d implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1894j;

    /* renamed from: k */
    public final /* synthetic */ PlaybackVideoGraphWrapper.InputVideoSink f1895k;

    /* renamed from: l */
    public final /* synthetic */ VideoSink.Listener f1896l;

    public /* synthetic */ RunnableC0499d(PlaybackVideoGraphWrapper.InputVideoSink inputVideoSink, VideoSink.Listener listener, int i) {
        this.f1894j = i;
        this.f1895k = inputVideoSink;
        this.f1896l = listener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1894j) {
            case 0:
                this.f1895k.lambda$onFirstFrameRendered$0(this.f1896l);
                break;
            default:
                this.f1895k.lambda$onFrameDropped$1(this.f1896l);
                break;
        }
    }
}
