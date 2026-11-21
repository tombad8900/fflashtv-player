package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C0288j implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1593j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1594k;

    /* renamed from: l */
    public final /* synthetic */ int f1595l;

    /* renamed from: m */
    public final /* synthetic */ long f1596m;

    /* renamed from: n */
    public final /* synthetic */ long f1597n;

    public /* synthetic */ C0288j(AnalyticsListener.EventTime eventTime, int i, long j, long j8, int i4) {
        this.f1593j = i4;
        this.f1594k = eventTime;
        this.f1595l = i;
        this.f1596m = j;
        this.f1597n = j8;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1593j) {
            case 0:
                ((AnalyticsListener) obj).onBandwidthEstimate(this.f1594k, this.f1595l, this.f1596m, this.f1597n);
                break;
            default:
                ((AnalyticsListener) obj).onAudioUnderrun(this.f1594k, this.f1595l, this.f1596m, this.f1597n);
                break;
        }
    }
}
