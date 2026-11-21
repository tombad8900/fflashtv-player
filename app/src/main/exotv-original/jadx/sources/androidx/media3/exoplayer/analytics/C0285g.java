package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C0285g implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1583j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1584k;

    /* renamed from: l */
    public final /* synthetic */ LoadEventInfo f1585l;

    /* renamed from: m */
    public final /* synthetic */ MediaLoadData f1586m;

    public /* synthetic */ C0285g(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f1583j = i;
        this.f1584k = eventTime;
        this.f1585l = loadEventInfo;
        this.f1586m = mediaLoadData;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1583j) {
            case 0:
                ((AnalyticsListener) obj).onLoadStarted(this.f1584k, this.f1585l, this.f1586m);
                break;
            case 1:
                ((AnalyticsListener) obj).onLoadCanceled(this.f1584k, this.f1585l, this.f1586m);
                break;
            default:
                ((AnalyticsListener) obj).onLoadCompleted(this.f1584k, this.f1585l, this.f1586m);
                break;
        }
    }
}
