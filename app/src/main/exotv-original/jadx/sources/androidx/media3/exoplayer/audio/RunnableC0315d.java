package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.audio.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0315d implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1662j;

    /* renamed from: k */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f1663k;

    /* renamed from: l */
    public final /* synthetic */ AudioSink.AudioTrackConfig f1664l;

    public /* synthetic */ RunnableC0315d(AudioRendererEventListener.EventDispatcher eventDispatcher, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.f1662j = i;
        this.f1663k = eventDispatcher;
        this.f1664l = audioTrackConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1662j) {
            case 0:
                this.f1663k.lambda$audioTrackInitialized$10(this.f1664l);
                break;
            default:
                this.f1663k.lambda$audioTrackReleased$11(this.f1664l);
                break;
        }
    }
}
