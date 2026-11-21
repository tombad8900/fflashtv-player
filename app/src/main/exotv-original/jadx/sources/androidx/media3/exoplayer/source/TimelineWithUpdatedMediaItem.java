package androidx.media3.exoplayer.source;

import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0227o1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class TimelineWithUpdatedMediaItem extends ForwardingTimeline {
    private final C0226o0 updatedMediaItem;

    public TimelineWithUpdatedMediaItem(AbstractC0230p1 abstractC0230p1, C0226o0 c0226o0) {
        super(abstractC0230p1);
        this.updatedMediaItem = c0226o0;
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.AbstractC0230p1
    public C0227o1 getWindow(int i, C0227o1 c0227o1, long j) {
        super.getWindow(i, c0227o1, j);
        C0226o0 c0226o0 = this.updatedMediaItem;
        c0227o1.f1262c = c0226o0;
        C0211j0 c0211j0 = c0226o0.f1239b;
        c0227o1.f1261b = c0211j0 != null ? c0211j0.f1154h : null;
        return c0227o1;
    }
}
