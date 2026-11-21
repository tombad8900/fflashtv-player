package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaLoadData;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.s */
/* loaded from: classes.dex */
public final /* synthetic */ class C0297s implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1628j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1629k;

    /* renamed from: l */
    public final /* synthetic */ MediaLoadData f1630l;

    public /* synthetic */ C0297s(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, int i) {
        this.f1628j = i;
        this.f1629k = eventTime;
        this.f1630l = mediaLoadData;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1628j) {
            case 0:
                ((AnalyticsListener) obj).onDownstreamFormatChanged(this.f1629k, this.f1630l);
                break;
            default:
                ((AnalyticsListener) obj).onUpstreamDiscarded(this.f1629k, this.f1630l);
                break;
        }
    }
}
