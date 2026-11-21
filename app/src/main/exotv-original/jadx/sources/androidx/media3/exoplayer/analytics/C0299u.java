package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.u */
/* loaded from: classes.dex */
public final /* synthetic */ class C0299u implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1635j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1636k;

    /* renamed from: l */
    public final /* synthetic */ AudioSink.AudioTrackConfig f1637l;

    public /* synthetic */ C0299u(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.f1635j = i;
        this.f1636k = eventTime;
        this.f1637l = audioTrackConfig;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1635j) {
            case 0:
                ((AnalyticsListener) obj).onAudioTrackInitialized(this.f1636k, this.f1637l);
                break;
            default:
                ((AnalyticsListener) obj).onAudioTrackReleased(this.f1636k, this.f1637l);
                break;
        }
    }
}
