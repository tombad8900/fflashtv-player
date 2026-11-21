package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C0286h implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1587j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1588k;

    /* renamed from: l */
    public final /* synthetic */ int f1589l;

    public /* synthetic */ C0286h(AnalyticsListener.EventTime eventTime, int i, int i4) {
        this.f1587j = i4;
        this.f1588k = eventTime;
        this.f1589l = i;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1587j) {
            case 0:
                ((AnalyticsListener) obj).onTimelineChanged(this.f1588k, this.f1589l);
                break;
            case 1:
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(this.f1588k, this.f1589l);
                break;
            case 2:
                ((AnalyticsListener) obj).onPlaybackStateChanged(this.f1588k, this.f1589l);
                break;
            case 3:
                DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$64(this.f1588k, this.f1589l, (AnalyticsListener) obj);
                break;
            case 4:
                ((AnalyticsListener) obj).onAudioSessionIdChanged(this.f1588k, this.f1589l);
                break;
            default:
                ((AnalyticsListener) obj).onRepeatModeChanged(this.f1588k, this.f1589l);
                break;
        }
    }
}
