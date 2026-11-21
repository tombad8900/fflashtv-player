package androidx.media3.exoplayer.upstream;

import androidx.media3.exoplayer.upstream.experimental.ExperimentalBandwidthMeter;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.upstream.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0481c {

    /* renamed from: a */
    public final /* synthetic */ int f1882a;

    /* renamed from: b */
    public final /* synthetic */ Object f1883b;

    public /* synthetic */ C0481c(int i, Object obj) {
        this.f1882a = i;
        this.f1883b = obj;
    }

    /* renamed from: a */
    public final void m1016a(int i) throws Throwable {
        switch (this.f1882a) {
            case 0:
                ((DefaultBandwidthMeter) this.f1883b).onNetworkTypeChanged(i);
                break;
            default:
                ((ExperimentalBandwidthMeter) this.f1883b).onNetworkTypeChanged(i);
                break;
        }
    }
}
