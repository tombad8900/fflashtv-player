package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import p043e6.InterfaceC0921i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0356f implements InterfaceC0921i {

    /* renamed from: j */
    public final /* synthetic */ int f1752j;

    /* renamed from: k */
    public final /* synthetic */ MediaSource.Factory f1753k;

    public /* synthetic */ C0356f(MediaSource.Factory factory, int i) {
        this.f1752j = i;
        this.f1753k = factory;
    }

    @Override // p043e6.InterfaceC0921i
    public final Object get() {
        switch (this.f1752j) {
            case 0:
                return ExoPlayer.Builder.lambda$new$7(this.f1753k);
            case 1:
                return ExoPlayer.Builder.lambda$new$9(this.f1753k);
            case 2:
                return ExoPlayer.Builder.lambda$new$5(this.f1753k);
            default:
                return ExoPlayer.Builder.lambda$setMediaSourceFactory$17(this.f1753k);
        }
    }
}
