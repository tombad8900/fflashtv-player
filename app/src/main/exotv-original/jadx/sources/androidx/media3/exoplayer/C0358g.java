package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import p043e6.InterfaceC0921i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C0358g implements InterfaceC0921i {

    /* renamed from: j */
    public final /* synthetic */ int f1755j;

    /* renamed from: k */
    public final /* synthetic */ BandwidthMeter f1756k;

    public /* synthetic */ C0358g(BandwidthMeter bandwidthMeter, int i) {
        this.f1755j = i;
        this.f1756k = bandwidthMeter;
    }

    @Override // p043e6.InterfaceC0921i
    public final Object get() {
        switch (this.f1755j) {
            case 0:
                return ExoPlayer.Builder.lambda$setBandwidthMeter$20(this.f1756k);
            default:
                return ExoPlayer.Builder.lambda$new$12(this.f1756k);
        }
    }
}
