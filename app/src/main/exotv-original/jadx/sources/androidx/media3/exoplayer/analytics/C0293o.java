package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.o */
/* loaded from: classes.dex */
public final /* synthetic */ class C0293o implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1612j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1613k;

    /* renamed from: l */
    public final /* synthetic */ String f1614l;

    /* renamed from: m */
    public final /* synthetic */ long f1615m;

    /* renamed from: n */
    public final /* synthetic */ long f1616n;

    public /* synthetic */ C0293o(AnalyticsListener.EventTime eventTime, String str, long j, long j8, int i) {
        this.f1612j = i;
        this.f1613k = eventTime;
        this.f1614l = str;
        this.f1615m = j;
        this.f1616n = j8;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1612j) {
            case 0:
                DefaultAnalyticsCollector.lambda$onAudioDecoderInitialized$5(this.f1613k, this.f1614l, this.f1615m, this.f1616n, (AnalyticsListener) obj);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onVideoDecoderInitialized$17(this.f1613k, this.f1614l, this.f1615m, this.f1616n, (AnalyticsListener) obj);
                break;
        }
    }
}
