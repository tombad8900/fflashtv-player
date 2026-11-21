package androidx.media3.exoplayer.video;

import androidx.media3.common.C0194d2;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.video.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0501f implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1897j;

    /* renamed from: k */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f1898k;

    /* renamed from: l */
    public final /* synthetic */ Object f1899l;

    public /* synthetic */ RunnableC0501f(VideoRendererEventListener.EventDispatcher eventDispatcher, Object obj, int i) {
        this.f1897j = i;
        this.f1898k = eventDispatcher;
        this.f1899l = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1897j) {
            case 0:
                this.f1898k.lambda$videoSizeChanged$5((C0194d2) this.f1899l);
                break;
            case 1:
                this.f1898k.lambda$videoCodecError$9((Exception) this.f1899l);
                break;
            default:
                this.f1898k.lambda$decoderReleased$7((String) this.f1899l);
                break;
        }
    }
}
