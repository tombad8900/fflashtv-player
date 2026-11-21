package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0281c implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1571j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1572k;

    /* renamed from: l */
    public final /* synthetic */ DecoderCounters f1573l;

    public /* synthetic */ C0281c(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, int i) {
        this.f1571j = i;
        this.f1572k = eventTime;
        this.f1573l = decoderCounters;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1571j) {
            case 0:
                ((AnalyticsListener) obj).onAudioEnabled(this.f1572k, this.f1573l);
                break;
            case 1:
                ((AnalyticsListener) obj).onAudioDisabled(this.f1572k, this.f1573l);
                break;
            case 2:
                ((AnalyticsListener) obj).onVideoDisabled(this.f1572k, this.f1573l);
                break;
            default:
                ((AnalyticsListener) obj).onVideoEnabled(this.f1572k, this.f1573l);
                break;
        }
    }
}
