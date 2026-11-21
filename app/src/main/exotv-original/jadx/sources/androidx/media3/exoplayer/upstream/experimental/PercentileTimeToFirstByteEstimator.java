package androidx.media3.exoplayer.upstream.experimental;

import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.SlidingPercentile;
import androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import java.util.LinkedHashMap;
import java.util.Map;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1135z;
import p063h1.InterfaceC1103b;
import p089k1.C1568l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class PercentileTimeToFirstByteEstimator implements TimeToFirstByteEstimator {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    public static final float DEFAULT_PERCENTILE = 0.5f;
    private static final int MAX_DATA_SPECS = 10;
    private final InterfaceC1103b clock;
    private final LinkedHashMap<C1568l, Long> initializedDataSpecs;
    private boolean isEmpty;
    private final float percentile;
    private final SlidingPercentile slidingPercentile;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
        private final int maxSize;

        public FixedSizeLinkedHashMap(int i) {
            this.maxSize = i;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.maxSize;
        }
    }

    public PercentileTimeToFirstByteEstimator() {
        this(10, 0.5f);
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public long getTimeToFirstByteEstimateUs() {
        if (this.isEmpty) {
            return -9223372036854775807L;
        }
        return (long) this.slidingPercentile.getPercentile(this.percentile);
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferInitializing(C1568l c1568l) {
        this.initializedDataSpecs.remove(c1568l);
        LinkedHashMap<C1568l, Long> linkedHashMap = this.initializedDataSpecs;
        ((C1135z) this.clock).getClass();
        linkedHashMap.put(c1568l, Long.valueOf(AbstractC1118i0.m2428S(SystemClock.elapsedRealtime())));
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferStart(C1568l c1568l) {
        if (this.initializedDataSpecs.remove(c1568l) == null) {
            return;
        }
        SlidingPercentile slidingPercentile = this.slidingPercentile;
        ((C1135z) this.clock).getClass();
        slidingPercentile.addSample(1, AbstractC1118i0.m2428S(SystemClock.elapsedRealtime()) - r6.longValue());
        this.isEmpty = false;
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void reset() {
        this.slidingPercentile.reset();
        this.isEmpty = true;
    }

    public PercentileTimeToFirstByteEstimator(int i, float f8) {
        this(i, f8, InterfaceC1103b.f4713a);
    }

    public PercentileTimeToFirstByteEstimator(int i, float f8, InterfaceC1103b interfaceC1103b) {
        AbstractC1101a.m2353d(i > 0 && f8 > 0.0f && f8 <= 1.0f);
        this.percentile = f8;
        this.clock = interfaceC1103b;
        this.initializedDataSpecs = new FixedSizeLinkedHashMap(10);
        this.slidingPercentile = new SlidingPercentile(i);
        this.isEmpty = true;
    }
}
