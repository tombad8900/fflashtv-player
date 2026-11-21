package androidx.media3.exoplayer.upstream;

import java.util.Iterator;
import java.util.TreeSet;
import p063h1.AbstractC1118i0;
import p097l1.AbstractC1649e;
import p097l1.InterfaceC1645a;
import p115n1.C1981j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class CachedRegionTracker {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;
    private static final String TAG = "CachedRegionTracker";
    private final InterfaceC1645a cache;
    private final String cacheKey;
    private final C1981j chunkIndex;
    private final TreeSet<Region> regions = new TreeSet<>();
    private final Region lookupRegion = new Region(0, 0);

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class Region implements Comparable<Region> {
        public long endOffset;
        public int endOffsetIndex;
        public long startOffset;

        public Region(long j, long j8) {
            this.startOffset = j;
            this.endOffset = j8;
        }

        @Override // java.lang.Comparable
        public int compareTo(Region region) {
            return AbstractC1118i0.m2449h(this.startOffset, region.startOffset);
        }
    }

    public CachedRegionTracker(InterfaceC1645a interfaceC1645a, String str, C1981j c1981j) {
        this.cacheKey = str;
        this.chunkIndex = c1981j;
        synchronized (this) {
            try {
                Iterator itDescendingIterator = interfaceC1645a.m3343a().descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    if (itDescendingIterator.next() != null) {
                        throw new ClassCastException();
                    }
                    mergeSpan(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void mergeSpan(AbstractC1649e abstractC1649e) {
        throw null;
    }

    private boolean regionsConnect(Region region, Region region2) {
        return (region == null || region2 == null || region.endOffset != region2.startOffset) ? false : true;
    }

    public synchronized int getRegionEndTimeMs(long j) {
        int i;
        Region region = this.lookupRegion;
        region.startOffset = j;
        Region regionFloor = this.regions.floor(region);
        if (regionFloor != null) {
            long j8 = regionFloor.endOffset;
            if (j <= j8 && (i = regionFloor.endOffsetIndex) != -1) {
                C1981j c1981j = this.chunkIndex;
                if (i == c1981j.f7342a - 1) {
                    if (j8 == c1981j.f7344c[i] + c1981j.f7343b[i]) {
                        return -2;
                    }
                }
                return (int) ((c1981j.f7346e[i] + (((j8 - c1981j.f7344c[i]) * c1981j.f7345d[i]) / c1981j.f7343b[i])) / 1000);
            }
        }
        return -1;
    }

    public synchronized void onSpanAdded(InterfaceC1645a interfaceC1645a, AbstractC1649e abstractC1649e) {
        mergeSpan(abstractC1649e);
    }

    public synchronized void onSpanRemoved(InterfaceC1645a interfaceC1645a, AbstractC1649e abstractC1649e) {
        throw null;
    }

    public void onSpanTouched(InterfaceC1645a interfaceC1645a, AbstractC1649e abstractC1649e, AbstractC1649e abstractC1649e2) {
    }

    public void release() {
        throw null;
    }
}
