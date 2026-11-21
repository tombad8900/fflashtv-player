package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0227o1;
import androidx.media3.exoplayer.source.ShuffleOrder;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class AbstractConcatenatedTimeline extends AbstractC0230p1 {
    private final int childCount;
    private final boolean isAtomic;
    private final ShuffleOrder shuffleOrder;

    public AbstractConcatenatedTimeline(boolean z7, ShuffleOrder shuffleOrder) {
        this.isAtomic = z7;
        this.shuffleOrder = shuffleOrder;
        this.childCount = shuffleOrder.getLength();
    }

    public static Object getChildPeriodUidFromConcatenatedUid(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object getChildTimelineUidFromConcatenatedUid(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object getConcatenatedUid(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int getNextChildIndex(int i, boolean z7) {
        if (z7) {
            return this.shuffleOrder.getNextIndex(i);
        }
        if (i < this.childCount - 1) {
            return i + 1;
        }
        return -1;
    }

    private int getPreviousChildIndex(int i, boolean z7) {
        if (z7) {
            return this.shuffleOrder.getPreviousIndex(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    public abstract int getChildIndexByChildUid(Object obj);

    public abstract int getChildIndexByPeriodIndex(int i);

    public abstract int getChildIndexByWindowIndex(int i);

    public abstract Object getChildUidByChildIndex(int i);

    public abstract int getFirstPeriodIndexByChildIndex(int i);

    @Override // androidx.media3.common.AbstractC0230p1
    public int getFirstWindowIndex(boolean z7) {
        if (this.childCount == 0) {
            return -1;
        }
        if (this.isAtomic) {
            z7 = false;
        }
        int firstIndex = z7 ? this.shuffleOrder.getFirstIndex() : 0;
        while (getTimelineByChildIndex(firstIndex).isEmpty()) {
            firstIndex = getNextChildIndex(firstIndex, z7);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return getTimelineByChildIndex(firstIndex).getFirstWindowIndex(z7) + getFirstWindowIndexByChildIndex(firstIndex);
    }

    public abstract int getFirstWindowIndexByChildIndex(int i);

    @Override // androidx.media3.common.AbstractC0230p1
    public final int getIndexOfPeriod(Object obj) {
        int indexOfPeriod;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int childIndexByChildUid = getChildIndexByChildUid(childTimelineUidFromConcatenatedUid);
        if (childIndexByChildUid == -1 || (indexOfPeriod = getTimelineByChildIndex(childIndexByChildUid).getIndexOfPeriod(childPeriodUidFromConcatenatedUid)) == -1) {
            return -1;
        }
        return getFirstPeriodIndexByChildIndex(childIndexByChildUid) + indexOfPeriod;
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getLastWindowIndex(boolean z7) {
        int i = this.childCount;
        if (i == 0) {
            return -1;
        }
        if (this.isAtomic) {
            z7 = false;
        }
        int lastIndex = z7 ? this.shuffleOrder.getLastIndex() : i - 1;
        while (getTimelineByChildIndex(lastIndex).isEmpty()) {
            lastIndex = getPreviousChildIndex(lastIndex, z7);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return getTimelineByChildIndex(lastIndex).getLastWindowIndex(z7) + getFirstWindowIndexByChildIndex(lastIndex);
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getNextWindowIndex(int i, int i4, boolean z7) {
        if (this.isAtomic) {
            if (i4 == 1) {
                i4 = 2;
            }
            z7 = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int nextWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getNextWindowIndex(i - firstWindowIndexByChildIndex, i4 != 2 ? i4 : 0, z7);
        if (nextWindowIndex != -1) {
            return firstWindowIndexByChildIndex + nextWindowIndex;
        }
        int nextChildIndex = getNextChildIndex(childIndexByWindowIndex, z7);
        while (nextChildIndex != -1 && getTimelineByChildIndex(nextChildIndex).isEmpty()) {
            nextChildIndex = getNextChildIndex(nextChildIndex, z7);
        }
        if (nextChildIndex != -1) {
            return getTimelineByChildIndex(nextChildIndex).getFirstWindowIndex(z7) + getFirstWindowIndexByChildIndex(nextChildIndex);
        }
        if (i4 == 2) {
            return getFirstWindowIndex(z7);
        }
        return -1;
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public final C0221m1 getPeriod(int i, C0221m1 c0221m1, boolean z7) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByPeriodIndex);
        getTimelineByChildIndex(childIndexByPeriodIndex).getPeriod(i - getFirstPeriodIndexByChildIndex(childIndexByPeriodIndex), c0221m1, z7);
        c0221m1.f1206c += firstWindowIndexByChildIndex;
        if (z7) {
            Object childUidByChildIndex = getChildUidByChildIndex(childIndexByPeriodIndex);
            Object obj = c0221m1.f1205b;
            obj.getClass();
            c0221m1.f1205b = getConcatenatedUid(childUidByChildIndex, obj);
        }
        return c0221m1;
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public final C0221m1 getPeriodByUid(Object obj, C0221m1 c0221m1) {
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int childIndexByChildUid = getChildIndexByChildUid(childTimelineUidFromConcatenatedUid);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByChildUid);
        getTimelineByChildIndex(childIndexByChildUid).getPeriodByUid(childPeriodUidFromConcatenatedUid, c0221m1);
        c0221m1.f1206c += firstWindowIndexByChildIndex;
        c0221m1.f1205b = obj;
        return c0221m1;
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public int getPreviousWindowIndex(int i, int i4, boolean z7) {
        if (this.isAtomic) {
            if (i4 == 1) {
                i4 = 2;
            }
            z7 = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int previousWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getPreviousWindowIndex(i - firstWindowIndexByChildIndex, i4 != 2 ? i4 : 0, z7);
        if (previousWindowIndex != -1) {
            return firstWindowIndexByChildIndex + previousWindowIndex;
        }
        int previousChildIndex = getPreviousChildIndex(childIndexByWindowIndex, z7);
        while (previousChildIndex != -1 && getTimelineByChildIndex(previousChildIndex).isEmpty()) {
            previousChildIndex = getPreviousChildIndex(previousChildIndex, z7);
        }
        if (previousChildIndex != -1) {
            return getTimelineByChildIndex(previousChildIndex).getLastWindowIndex(z7) + getFirstWindowIndexByChildIndex(previousChildIndex);
        }
        if (i4 == 2) {
            return getLastWindowIndex(z7);
        }
        return -1;
    }

    public abstract AbstractC0230p1 getTimelineByChildIndex(int i);

    @Override // androidx.media3.common.AbstractC0230p1
    public final Object getUidOfPeriod(int i) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
        return getConcatenatedUid(getChildUidByChildIndex(childIndexByPeriodIndex), getTimelineByChildIndex(childIndexByPeriodIndex).getUidOfPeriod(i - getFirstPeriodIndexByChildIndex(childIndexByPeriodIndex)));
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public final C0227o1 getWindow(int i, C0227o1 c0227o1, long j) {
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int firstPeriodIndexByChildIndex = getFirstPeriodIndexByChildIndex(childIndexByWindowIndex);
        getTimelineByChildIndex(childIndexByWindowIndex).getWindow(i - firstWindowIndexByChildIndex, c0227o1, j);
        Object childUidByChildIndex = getChildUidByChildIndex(childIndexByWindowIndex);
        if (!C0227o1.f1250q.equals(c0227o1.f1260a)) {
            childUidByChildIndex = getConcatenatedUid(childUidByChildIndex, c0227o1.f1260a);
        }
        c0227o1.f1260a = childUidByChildIndex;
        c0227o1.f1273n += firstPeriodIndexByChildIndex;
        c0227o1.f1274o += firstPeriodIndexByChildIndex;
        return c0227o1;
    }
}
