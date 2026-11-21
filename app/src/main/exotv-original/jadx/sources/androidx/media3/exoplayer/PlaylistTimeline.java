package androidx.media3.exoplayer;

import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0187c;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0227o1;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.ShuffleOrder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class PlaylistTimeline extends AbstractConcatenatedTimeline {
    private final HashMap<Object, Integer> childIndexByUid;
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;
    private final int periodCount;
    private final AbstractC0230p1[] timelines;
    private final Object[] uids;
    private final int windowCount;

    public PlaylistTimeline(Collection<? extends MediaSourceInfoHolder> collection, ShuffleOrder shuffleOrder) {
        this(getTimelines(collection), getUids(collection), shuffleOrder);
    }

    private static AbstractC0230p1[] getTimelines(Collection<? extends MediaSourceInfoHolder> collection) {
        AbstractC0230p1[] abstractC0230p1Arr = new AbstractC0230p1[collection.size()];
        Iterator<? extends MediaSourceInfoHolder> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            abstractC0230p1Arr[i] = it.next().getTimeline();
            i++;
        }
        return abstractC0230p1Arr;
    }

    private static Object[] getUids(Collection<? extends MediaSourceInfoHolder> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends MediaSourceInfoHolder> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next().getUid();
            i++;
        }
        return objArr;
    }

    public PlaylistTimeline copyWithPlaceholderTimeline(ShuffleOrder shuffleOrder) {
        AbstractC0230p1[] abstractC0230p1Arr = new AbstractC0230p1[this.timelines.length];
        int i = 0;
        while (true) {
            AbstractC0230p1[] abstractC0230p1Arr2 = this.timelines;
            if (i >= abstractC0230p1Arr2.length) {
                return new PlaylistTimeline(abstractC0230p1Arr, this.uids, shuffleOrder);
            }
            abstractC0230p1Arr[i] = new ForwardingTimeline(abstractC0230p1Arr2[i]) { // from class: androidx.media3.exoplayer.PlaylistTimeline.1
                private final C0227o1 window = new C0227o1();

                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.AbstractC0230p1
                public C0221m1 getPeriod(int i4, C0221m1 c0221m1, boolean z7) {
                    C0221m1 period = super.getPeriod(i4, c0221m1, z7);
                    if (getWindow(period.f1206c, this.window).m654a()) {
                        period.m644i(c0221m1.f1204a, c0221m1.f1205b, c0221m1.f1206c, c0221m1.f1207d, c0221m1.f1208e, C0187c.f1044g, true);
                        return period;
                    }
                    period.f1209f = true;
                    return period;
                }
            };
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByChildUid(Object obj) {
        Integer num = this.childIndexByUid.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByPeriodIndex(int i) {
        return AbstractC1118i0.m2442d(this.firstPeriodInChildIndices, i + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getChildIndexByWindowIndex(int i) {
        return AbstractC1118i0.m2442d(this.firstWindowInChildIndices, i + 1, false, false);
    }

    public List<AbstractC0230p1> getChildTimelines() {
        return Arrays.asList(this.timelines);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public Object getChildUidByChildIndex(int i) {
        return this.uids[i];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getFirstPeriodIndexByChildIndex(int i) {
        return this.firstPeriodInChildIndices[i];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public int getFirstWindowIndexByChildIndex(int i) {
        return this.firstWindowInChildIndices[i];
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getPeriodCount() {
        return this.periodCount;
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public AbstractC0230p1 getTimelineByChildIndex(int i) {
        return this.timelines[i];
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getWindowCount() {
        return this.windowCount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private PlaylistTimeline(AbstractC0230p1[] abstractC0230p1Arr, Object[] objArr, ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int i = 0;
        int length = abstractC0230p1Arr.length;
        this.timelines = abstractC0230p1Arr;
        this.firstPeriodInChildIndices = new int[length];
        this.firstWindowInChildIndices = new int[length];
        this.uids = objArr;
        this.childIndexByUid = new HashMap<>();
        int length2 = abstractC0230p1Arr.length;
        int windowCount = 0;
        int periodCount = 0;
        int i4 = 0;
        while (i < length2) {
            AbstractC0230p1 abstractC0230p1 = abstractC0230p1Arr[i];
            this.timelines[i4] = abstractC0230p1;
            this.firstWindowInChildIndices[i4] = windowCount;
            this.firstPeriodInChildIndices[i4] = periodCount;
            windowCount += abstractC0230p1.getWindowCount();
            periodCount += this.timelines[i4].getPeriodCount();
            this.childIndexByUid.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.windowCount = windowCount;
        this.periodCount = periodCount;
    }
}
