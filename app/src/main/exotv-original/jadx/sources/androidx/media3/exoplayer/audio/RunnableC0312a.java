package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.audio.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0312a implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1652j;

    /* renamed from: k */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f1653k;

    /* renamed from: l */
    public final /* synthetic */ DecoderCounters f1654l;

    public /* synthetic */ RunnableC0312a(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.f1652j = i;
        this.f1653k = eventDispatcher;
        this.f1654l = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1652j) {
            case 0:
                this.f1653k.lambda$enabled$0(this.f1654l);
                break;
            default:
                this.f1653k.lambda$disabled$6(this.f1654l);
                break;
        }
    }
}
