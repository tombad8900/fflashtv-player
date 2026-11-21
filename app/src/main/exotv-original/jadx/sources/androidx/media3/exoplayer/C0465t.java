package androidx.media3.exoplayer;

import androidx.media3.common.C0243u;
import androidx.media3.common.InterfaceC0185b1;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.SuitableOutputChecker;
import p063h1.InterfaceC1122m;
import p063h1.InterfaceC1123n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.t */
/* loaded from: classes.dex */
public final /* synthetic */ class C0465t implements InterfaceC1122m, InterfaceC1123n, ExoPlayerImplInternal.PlaybackInfoUpdateListener, SuitableOutputChecker.Callback {

    /* renamed from: j */
    public final /* synthetic */ int f1865j;

    /* renamed from: k */
    public final /* synthetic */ ExoPlayerImpl f1866k;

    public /* synthetic */ C0465t(ExoPlayerImpl exoPlayerImpl, int i) {
        this.f1865j = i;
        this.f1866k = exoPlayerImpl;
    }

    @Override // p063h1.InterfaceC1123n
    /* renamed from: c */
    public void mo648c(Object obj, C0243u c0243u) {
        this.f1866k.lambda$new$0((InterfaceC0185b1) obj, c0243u);
    }

    @Override // p063h1.InterfaceC1122m
    public void invoke(Object obj) {
        switch (this.f1865j) {
            case 0:
                this.f1866k.lambda$setPlaylistMetadata$7((InterfaceC0185b1) obj);
                break;
            default:
                this.f1866k.lambda$updateAvailableCommands$26((InterfaceC0185b1) obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener
    public void onPlaybackInfoUpdate(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.f1866k.lambda$new$2(playbackInfoUpdate);
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker.Callback
    public void onSelectedOutputSuitabilityChanged(boolean z7) {
        this.f1866k.onSelectedOutputSuitabilityChanged(z7);
    }
}
