package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C0292n implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1608j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1609k;

    /* renamed from: l */
    public final /* synthetic */ int f1610l;

    /* renamed from: m */
    public final /* synthetic */ boolean f1611m;

    public /* synthetic */ C0292n(AnalyticsListener.EventTime eventTime, int i, int i4, boolean z7) {
        this.f1608j = i4;
        this.f1609k = eventTime;
        this.f1611m = z7;
        this.f1610l = i;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1608j) {
            case 0:
                ((AnalyticsListener) obj).onPlayerStateChanged(this.f1609k, this.f1611m, this.f1610l);
                break;
            case 1:
                ((AnalyticsListener) obj).onDeviceVolumeChanged(this.f1609k, this.f1610l, this.f1611m);
                break;
            default:
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(this.f1609k, this.f1611m, this.f1610l);
                break;
        }
    }

    public /* synthetic */ C0292n(AnalyticsListener.EventTime eventTime, int i, boolean z7) {
        this.f1608j = 1;
        this.f1609k = eventTime;
        this.f1610l = i;
        this.f1611m = z7;
    }
}
