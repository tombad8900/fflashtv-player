package androidx.media3.exoplayer;

import androidx.media3.common.C0194d2;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0231q;
import androidx.media3.common.C0235r0;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0248v1;
import androidx.media3.common.InterfaceC0185b1;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.MediaPeriodHolder;
import java.util.List;
import p056g1.C1030c;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C0380k implements InterfaceC1122m, MediaPeriodHolder.Factory {

    /* renamed from: j */
    public final /* synthetic */ int f1769j;

    /* renamed from: k */
    public final /* synthetic */ Object f1770k;

    public /* synthetic */ C0380k(int i, Object obj) {
        this.f1769j = i;
        this.f1770k = obj;
    }

    @Override // androidx.media3.exoplayer.MediaPeriodHolder.Factory
    public MediaPeriodHolder create(MediaPeriodInfo mediaPeriodInfo, long j) {
        return ((ExoPlayerImplInternal) this.f1770k).createMediaPeriodHolder(mediaPeriodInfo, j);
    }

    @Override // p063h1.InterfaceC1122m
    public void invoke(Object obj) {
        switch (this.f1769j) {
            case 0:
                ((InterfaceC0185b1) obj).onMediaMetadataChanged((C0235r0) this.f1770k);
                break;
            case 1:
                ((InterfaceC0185b1) obj).onAudioAttributesChanged((C0201g) this.f1770k);
                break;
            case 2:
                ((InterfaceC0185b1) obj).onTrackSelectionParametersChanged((C0248v1) this.f1770k);
                break;
            case 3:
                ((InterfaceC0185b1) obj).onCues((C1030c) this.f1770k);
                break;
            case 4:
                ((ExoPlayerImpl.ComponentListener) this.f1770k).lambda$onMetadata$4((InterfaceC0185b1) obj);
                break;
            case 5:
                ((InterfaceC0185b1) obj).onMetadata((C0241t0) this.f1770k);
                break;
            case 6:
                ((InterfaceC0185b1) obj).onCues((List) this.f1770k);
                break;
            case 7:
                ((InterfaceC0185b1) obj).onVideoSizeChanged((C0194d2) this.f1770k);
                break;
            default:
                ((InterfaceC0185b1) obj).onDeviceInfoChanged((C0231q) this.f1770k);
                break;
        }
    }
}
