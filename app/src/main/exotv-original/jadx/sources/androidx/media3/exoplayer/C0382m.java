package androidx.media3.exoplayer;

import androidx.media3.common.InterfaceC0185b1;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.m */
/* loaded from: classes.dex */
public final /* synthetic */ class C0382m implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1773j;

    /* renamed from: k */
    public final /* synthetic */ boolean f1774k;

    public /* synthetic */ C0382m(boolean z7, int i) {
        this.f1773j = i;
        this.f1774k = z7;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1773j) {
            case 0:
                ((InterfaceC0185b1) obj).onSkipSilenceEnabledChanged(this.f1774k);
                break;
            case 1:
                ((InterfaceC0185b1) obj).onShuffleModeEnabledChanged(this.f1774k);
                break;
            default:
                ((InterfaceC0185b1) obj).onSkipSilenceEnabledChanged(this.f1774k);
                break;
        }
    }
}
