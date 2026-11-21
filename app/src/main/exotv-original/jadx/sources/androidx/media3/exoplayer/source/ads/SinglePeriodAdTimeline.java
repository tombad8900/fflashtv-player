package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0187c;
import androidx.media3.common.C0221m1;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class SinglePeriodAdTimeline extends ForwardingTimeline {
    private final C0187c adPlaybackState;

    public SinglePeriodAdTimeline(AbstractC0230p1 abstractC0230p1, C0187c c0187c) {
        super(abstractC0230p1);
        AbstractC1101a.m2359j(abstractC0230p1.getPeriodCount() == 1);
        AbstractC1101a.m2359j(abstractC0230p1.getWindowCount() == 1);
        this.adPlaybackState = c0187c;
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.AbstractC0230p1
    public C0221m1 getPeriod(int i, C0221m1 c0221m1, boolean z7) {
        this.timeline.getPeriod(i, c0221m1, z7);
        long j = c0221m1.f1207d;
        if (j == -9223372036854775807L) {
            j = this.adPlaybackState.f1053d;
        }
        c0221m1.m644i(c0221m1.f1204a, c0221m1.f1205b, c0221m1.f1206c, j, c0221m1.f1208e, this.adPlaybackState, c0221m1.f1209f);
        return c0221m1;
    }
}
