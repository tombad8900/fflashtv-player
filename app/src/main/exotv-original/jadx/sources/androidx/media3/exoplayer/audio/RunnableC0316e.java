package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.audio.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0316e implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1665j;

    /* renamed from: k */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f1666k;

    /* renamed from: l */
    public final /* synthetic */ Exception f1667l;

    public /* synthetic */ RunnableC0316e(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc, int i) {
        this.f1665j = i;
        this.f1666k = eventDispatcher;
        this.f1667l = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1665j) {
            case 0:
                this.f1666k.lambda$audioCodecError$9(this.f1667l);
                break;
            default:
                this.f1666k.lambda$audioSinkError$8(this.f1667l);
                break;
        }
    }
}
