package androidx.media3.exoplayer.analytics;

import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.t */
/* loaded from: classes.dex */
public final /* synthetic */ class C0298t implements InterfaceC1122m {

    /* renamed from: j */
    public final /* synthetic */ int f1631j;

    /* renamed from: k */
    public final /* synthetic */ AnalyticsListener.EventTime f1632k;

    /* renamed from: l */
    public final /* synthetic */ C0249w f1633l;

    /* renamed from: m */
    public final /* synthetic */ DecoderReuseEvaluation f1634m;

    public /* synthetic */ C0298t(AnalyticsListener.EventTime eventTime, C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation, int i) {
        this.f1631j = i;
        this.f1632k = eventTime;
        this.f1633l = c0249w;
        this.f1634m = decoderReuseEvaluation;
    }

    @Override // p063h1.InterfaceC1122m
    public final void invoke(Object obj) {
        switch (this.f1631j) {
            case 0:
                ((AnalyticsListener) obj).onVideoInputFormatChanged(this.f1632k, this.f1633l, this.f1634m);
                break;
            default:
                ((AnalyticsListener) obj).onAudioInputFormatChanged(this.f1632k, this.f1633l, this.f1634m);
                break;
        }
    }
}
