package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayerImplInternal;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.s */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0414s implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1799j;

    /* renamed from: k */
    public final /* synthetic */ Object f1800k;

    /* renamed from: l */
    public final /* synthetic */ Object f1801l;

    public /* synthetic */ RunnableC0414s(Object obj, int i, Object obj2) {
        this.f1799j = i;
        this.f1800k = obj;
        this.f1801l = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1799j) {
            case 0:
                ((ExoPlayerImpl) this.f1800k).lambda$new$1((ExoPlayerImplInternal.PlaybackInfoUpdate) this.f1801l);
                break;
            default:
                ((ExoPlayerImplInternal) this.f1800k).lambda$sendMessageToTargetThread$2((PlayerMessage) this.f1801l);
                break;
        }
    }
}
