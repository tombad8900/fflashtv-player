package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import p043e6.InterfaceC0921i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0277a implements InterfaceC0921i {

    /* renamed from: j */
    public final /* synthetic */ int f1560j;

    /* renamed from: k */
    public final /* synthetic */ Context f1561k;

    public /* synthetic */ C0277a(Context context, int i) {
        this.f1560j = i;
        this.f1561k = context;
    }

    @Override // p043e6.InterfaceC0921i
    public final Object get() {
        switch (this.f1560j) {
            case 0:
                return AudioFocusManager.lambda$new$0(this.f1561k);
            case 1:
                return ExoPlayer.Builder.lambda$new$0(this.f1561k);
            case 2:
                return ExoPlayer.Builder.lambda$new$1(this.f1561k);
            case 3:
                return ExoPlayer.Builder.lambda$new$3(this.f1561k);
            case 4:
                return ExoPlayer.Builder.lambda$new$14(this.f1561k);
            case 5:
                return DefaultBandwidthMeter.getSingletonInstance(this.f1561k);
            default:
                return ExoPlayer.Builder.lambda$new$4(this.f1561k);
        }
    }
}
