package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0284f implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1580j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1581k;

    /* renamed from: l */
    public final /* synthetic */ String f1582l;

    public /* synthetic */ C0284f(AnalyticsListener.EventTime eventTime, String str, int i) {
        this.f1580j = i;
        this.f1581k = eventTime;
        this.f1582l = str;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1580j) {
            case 0:
                ((AnalyticsListener) obj).onAudioDecoderReleased(this.f1581k, this.f1582l);
                break;
            default:
                ((AnalyticsListener) obj).onVideoDecoderReleased(this.f1581k, this.f1582l);
                break;
        }
    }
}
