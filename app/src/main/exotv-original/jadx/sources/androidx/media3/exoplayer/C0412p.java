package androidx.media3.exoplayer;

import androidx.media3.common.InterfaceC0185b1;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.p */
/* loaded from: classes.dex */
public final /* synthetic */ class C0412p implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1796j;

    /* renamed from: k */
    public final /* synthetic */ int f1797k;

    public /* synthetic */ C0412p(int i, int i4) {
        this.f1796j = i4;
        this.f1797k = i;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1796j) {
            case 0:
                ((InterfaceC0185b1) obj).onAudioSessionIdChanged(this.f1797k);
                break;
            default:
                ((InterfaceC0185b1) obj).onRepeatModeChanged(this.f1797k);
                break;
        }
    }
}
