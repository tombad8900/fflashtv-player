package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import p043e6.InterfaceC0916d;
import p063h1.InterfaceC1103b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0330d implements InterfaceC0916d {

    /* renamed from: j */
    public final /* synthetic */ int f1704j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsCollector f1705k;

    public /* synthetic */ C0330d(AnalyticsCollector analyticsCollector, int i) {
        this.f1704j = i;
        this.f1705k = analyticsCollector;
    }

    @Override // p043e6.InterfaceC0916d
    public final Object apply(Object obj) {
        switch (this.f1704j) {
            case 0:
                return ExoPlayer.Builder.lambda$setAnalyticsCollector$21(this.f1705k, (InterfaceC1103b) obj);
            default:
                return ExoPlayer.Builder.lambda$new$13(this.f1705k, (InterfaceC1103b) obj);
        }
    }
}
