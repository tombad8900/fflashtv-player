package androidx.media3.exoplayer.analytics;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import p063h1.AbstractC1101a;
import p063h1.C1132w;
import p063h1.InterfaceC1111f;
import p063h1.InterfaceC1122m;
import p090k2.C1584b;
import p090k2.C1585c;
import p090k2.C1600r;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.p */
/* loaded from: classes.dex */
public final /* synthetic */ class C0294p implements InterfaceC1122m, InterfaceC1111f {

    /* renamed from: j */
    public final /* synthetic */ int f1617j;

    /* renamed from: k */
    public final /* synthetic */ Object f1618k;

    /* renamed from: l */
    public final /* synthetic */ long f1619l;

    /* renamed from: m */
    public final /* synthetic */ int f1620m;

    public /* synthetic */ C0294p(AnalyticsListener.EventTime eventTime, int i, long j) {
        this.f1617j = 0;
        this.f1618k = eventTime;
        this.f1620m = i;
        this.f1619l = j;
    }

    @Override // p063h1.InterfaceC1111f
    public void accept(Object obj) {
        C1600r c1600r = (C1600r) this.f1618k;
        C1585c c1585c = (C1585c) obj;
        AbstractC1101a.m2360k(c1600r.f6088h);
        byte[] bArrM3250o = C1584b.m3250o(c1585c.f6053a, c1585c.f6055c);
        C1132w c1132w = c1600r.f6083c;
        c1132w.getClass();
        c1132w.m2511E(bArrM3250o, bArrM3250o.length);
        c1600r.f6081a.sampleData(c1132w, bArrM3250o.length);
        long j = c1585c.f6054b;
        long j8 = this.f1619l;
        if (j == -9223372036854775807L) {
            AbstractC1101a.m2359j(c1600r.f6088h.f1527s == Long.MAX_VALUE);
        } else {
            long j9 = c1600r.f6088h.f1527s;
            j8 = j9 == Long.MAX_VALUE ? j8 + j : j + j9;
        }
        c1600r.f6081a.sampleMetadata(j8, this.f1620m, bArrM3250o.length, 0, null);
    }

    @Override // p063h1.InterfaceC1122m
    public void invoke(Object obj) {
        switch (this.f1617j) {
            case 0:
                ((AnalyticsListener) obj).onDroppedVideoFrames((AnalyticsListener.EventTime) this.f1618k, this.f1620m, this.f1619l);
                break;
            default:
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset((AnalyticsListener.EventTime) this.f1618k, this.f1619l, this.f1620m);
                break;
        }
    }

    public /* synthetic */ C0294p(Object obj, int i, int i4, long j) {
        this.f1617j = i4;
        this.f1618k = obj;
        this.f1619l = j;
        this.f1620m = i;
    }
}
