package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C0290l implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1600j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1601k;

    /* renamed from: l */
    public final /* synthetic */ Exception f1602l;

    public /* synthetic */ C0290l(AnalyticsListener.EventTime eventTime, Exception exc, int i) {
        this.f1600j = i;
        this.f1601k = eventTime;
        this.f1602l = exc;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1600j) {
            case 0:
                ((AnalyticsListener) obj).onVideoCodecError(this.f1601k, this.f1602l);
                break;
            case 1:
                ((AnalyticsListener) obj).onDrmSessionManagerError(this.f1601k, this.f1602l);
                break;
            case 2:
                ((AnalyticsListener) obj).onAudioCodecError(this.f1601k, this.f1602l);
                break;
            default:
                ((AnalyticsListener) obj).onAudioSinkError(this.f1601k, this.f1602l);
                break;
        }
    }
}
