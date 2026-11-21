package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import p043e6.InterfaceC0921i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0328c implements InterfaceC0921i {

    /* renamed from: j */
    public final /* synthetic */ int f1696j;

    /* renamed from: k */
    public final /* synthetic */ LoadControl f1697k;

    public /* synthetic */ C0328c(LoadControl loadControl, int i) {
        this.f1696j = i;
        this.f1697k = loadControl;
    }

    @Override // p043e6.InterfaceC0921i
    public final Object get() {
        switch (this.f1696j) {
            case 0:
                return ExoPlayer.Builder.lambda$setLoadControl$19(this.f1697k);
            default:
                return ExoPlayer.Builder.lambda$new$11(this.f1697k);
        }
    }
}
