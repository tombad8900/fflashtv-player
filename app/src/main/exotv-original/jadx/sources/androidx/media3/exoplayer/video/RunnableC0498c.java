package androidx.media3.exoplayer.video;

import androidx.media3.common.C0194d2;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0257y1;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.VideoSink;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.video.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0498c implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1890j;

    /* renamed from: k */
    public final /* synthetic */ Object f1891k;

    /* renamed from: l */
    public final /* synthetic */ Object f1892l;

    /* renamed from: m */
    public final /* synthetic */ Object f1893m;

    public /* synthetic */ RunnableC0498c(Object obj, Object obj2, Object obj3, int i) {
        this.f1890j = i;
        this.f1891k = obj;
        this.f1892l = obj2;
        this.f1893m = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1890j) {
            case 0:
                ((PlaybackVideoGraphWrapper.InputVideoSink) this.f1891k).lambda$onVideoSizeChanged$2((VideoSink.Listener) this.f1892l, (C0194d2) this.f1893m);
                break;
            case 1:
                ((PlaybackVideoGraphWrapper.InputVideoSink) this.f1891k).lambda$onError$3((VideoSink.Listener) this.f1892l, (C0257y1) this.f1893m);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.f1891k).lambda$inputFormatChanged$2((C0249w) this.f1892l, (DecoderReuseEvaluation) this.f1893m);
                break;
        }
    }
}
