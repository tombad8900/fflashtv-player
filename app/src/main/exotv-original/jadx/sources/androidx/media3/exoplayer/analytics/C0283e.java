package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0283e implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1577j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1578k;

    /* renamed from: l */
    public final /* synthetic */ boolean f1579l;

    public /* synthetic */ C0283e(AnalyticsListener.EventTime eventTime, int i, boolean z7) {
        this.f1577j = i;
        this.f1578k = eventTime;
        this.f1579l = z7;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1577j) {
            case 0:
                DefaultAnalyticsCollector.lambda$onIsLoadingChanged$35(this.f1578k, this.f1579l, (AnalyticsListener) obj);
                break;
            case 1:
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(this.f1578k, this.f1579l);
                break;
            case 2:
                ((AnalyticsListener) obj).onIsPlayingChanged(this.f1578k, this.f1579l);
                break;
            default:
                ((AnalyticsListener) obj).onShuffleModeChanged(this.f1578k, this.f1579l);
                break;
        }
    }
}
