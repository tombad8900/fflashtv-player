package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import java.util.Deque;
import p063h1.InterfaceC1103b;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0282d implements InterfaceC1122m, SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction {

    /* renamed from: j */
    public final /* synthetic */ int f1574j;

    /* renamed from: k */
    public final /* synthetic */ Object f1575k;

    /* renamed from: l */
    public final /* synthetic */ long f1576l;

    public /* synthetic */ C0282d(long j, InterfaceC1103b interfaceC1103b) {
        this.f1574j = 4;
        this.f1576l = j;
        this.f1575k = interfaceC1103b;
    }

    @Override // p063h1.InterfaceC1122m
    public void invoke(Object obj) {
        switch (this.f1574j) {
            case 0:
                ((AnalyticsListener) obj).onSeekForwardIncrementChanged((AnalyticsListener.EventTime) this.f1575k, this.f1576l);
                break;
            case 1:
                ((AnalyticsListener) obj).onAudioPositionAdvancing((AnalyticsListener.EventTime) this.f1575k, this.f1576l);
                break;
            case 2:
                ((AnalyticsListener) obj).onSeekBackIncrementChanged((AnalyticsListener.EventTime) this.f1575k, this.f1576l);
                break;
            default:
                ((AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged((AnalyticsListener.EventTime) this.f1575k, this.f1576l);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(Deque deque) {
        return SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(this.f1576l, (InterfaceC1103b) this.f1575k, deque);
    }

    public /* synthetic */ C0282d(AnalyticsListener.EventTime eventTime, int i, long j) {
        this.f1574j = i;
        this.f1575k = eventTime;
        this.f1576l = j;
    }
}
