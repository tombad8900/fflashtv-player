package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0280b implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1569j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1570k;

    public /* synthetic */ C0280b(AnalyticsListener.EventTime eventTime, int i) {
        this.f1569j = i;
        this.f1570k = eventTime;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1569j) {
            case 0:
                ((AnalyticsListener) obj).onPlayerReleased(this.f1570k);
                break;
            case 1:
                ((AnalyticsListener) obj).onDrmKeysRemoved(this.f1570k);
                break;
            case 2:
                ((AnalyticsListener) obj).onDrmKeysRestored(this.f1570k);
                break;
            case 3:
                ((AnalyticsListener) obj).onSeekStarted(this.f1570k);
                break;
            case 4:
                ((AnalyticsListener) obj).onDrmKeysLoaded(this.f1570k);
                break;
            default:
                ((AnalyticsListener) obj).onDrmSessionReleased(this.f1570k);
                break;
        }
    }
}
