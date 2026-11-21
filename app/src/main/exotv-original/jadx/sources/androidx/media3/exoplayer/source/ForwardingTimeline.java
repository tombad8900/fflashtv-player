package androidx.media3.exoplayer.source;

import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0227o1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class ForwardingTimeline extends AbstractC0230p1 {
    protected final AbstractC0230p1 timeline;

    public ForwardingTimeline(AbstractC0230p1 abstractC0230p1) {
        this.timeline = abstractC0230p1;
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getFirstWindowIndex(boolean z7) {
        return this.timeline.getFirstWindowIndex(z7);
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getIndexOfPeriod(Object obj) {
        return this.timeline.getIndexOfPeriod(obj);
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getLastWindowIndex(boolean z7) {
        return this.timeline.getLastWindowIndex(z7);
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getNextWindowIndex(int i, int i4, boolean z7) {
        return this.timeline.getNextWindowIndex(i, i4, z7);
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public C0221m1 getPeriod(int i, C0221m1 c0221m1, boolean z7) {
        return this.timeline.getPeriod(i, c0221m1, z7);
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getPeriodCount() {
        return this.timeline.getPeriodCount();
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getPreviousWindowIndex(int i, int i4, boolean z7) {
        return this.timeline.getPreviousWindowIndex(i, i4, z7);
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public Object getUidOfPeriod(int i) {
        return this.timeline.getUidOfPeriod(i);
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public C0227o1 getWindow(int i, C0227o1 c0227o1, long j) {
        return this.timeline.getWindow(i, c0227o1, j);
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getWindowCount() {
        return this.timeline.getWindowCount();
    }
}
