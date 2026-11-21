package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import p043e6.InterfaceC0921i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C0359h implements InterfaceC0921i {

    /* renamed from: j */
    public final /* synthetic */ int f1757j;

    /* renamed from: k */
    public final /* synthetic */ TrackSelector f1758k;

    public /* synthetic */ C0359h(TrackSelector trackSelector, int i) {
        this.f1757j = i;
        this.f1758k = trackSelector;
    }

    @Override // p043e6.InterfaceC0921i
    public final Object get() {
        switch (this.f1757j) {
            case 0:
                return ExoPlayer.Builder.lambda$new$10(this.f1758k);
            default:
                return ExoPlayer.Builder.lambda$setTrackSelector$18(this.f1758k);
        }
    }
}
