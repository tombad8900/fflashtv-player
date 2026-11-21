package androidx.media3.exoplayer.analytics;

import androidx.media3.common.C0253x0;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C0295q implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1621j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1622k;

    /* renamed from: l */
    public final /* synthetic */ C0253x0 f1623l;

    public /* synthetic */ C0295q(AnalyticsListener.EventTime eventTime, C0253x0 c0253x0, int i) {
        this.f1621j = i;
        this.f1622k = eventTime;
        this.f1623l = c0253x0;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1621j) {
            case 0:
                ((AnalyticsListener) obj).onPlayerErrorChanged(this.f1622k, this.f1623l);
                break;
            default:
                ((AnalyticsListener) obj).onPlayerError(this.f1622k, this.f1623l);
                break;
        }
    }
}
