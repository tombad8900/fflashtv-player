package androidx.media3.exoplayer.analytics;

import androidx.media3.common.C0235r0;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.v */
/* loaded from: classes.dex */
public final /* synthetic */ class C0300v implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1638j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1639k;

    /* renamed from: l */
    public final /* synthetic */ C0235r0 f1640l;

    public /* synthetic */ C0300v(AnalyticsListener.EventTime eventTime, C0235r0 c0235r0, int i) {
        this.f1638j = i;
        this.f1639k = eventTime;
        this.f1640l = c0235r0;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1638j) {
            case 0:
                ((AnalyticsListener) obj).onPlaylistMetadataChanged(this.f1639k, this.f1640l);
                break;
            default:
                ((AnalyticsListener) obj).onMediaMetadataChanged(this.f1639k, this.f1640l);
                break;
        }
    }
}
