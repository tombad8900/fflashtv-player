package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import p043e6.InterfaceC0921i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0354e implements InterfaceC0921i {

    /* renamed from: j */
    public final /* synthetic */ int f1747j;

    /* renamed from: k */
    public final /* synthetic */ RenderersFactory f1748k;

    public /* synthetic */ C0354e(RenderersFactory renderersFactory, int i) {
        this.f1747j = i;
        this.f1748k = renderersFactory;
    }

    @Override // p043e6.InterfaceC0921i
    public final Object get() {
        switch (this.f1747j) {
            case 0:
                return ExoPlayer.Builder.lambda$setRenderersFactory$16(this.f1748k);
            case 1:
                return ExoPlayer.Builder.lambda$new$6(this.f1748k);
            case 2:
                return ExoPlayer.Builder.lambda$new$2(this.f1748k);
            default:
                return ExoPlayer.Builder.lambda$new$8(this.f1748k);
        }
    }
}
