package androidx.media3.exoplayer.upstream.experimental;

import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import java.util.LinkedHashMap;
import java.util.Map;
import p063h1.AbstractC1118i0;
import p063h1.C1135z;
import p063h1.InterfaceC1103b;
import p089k1.C1568l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ExponentialWeightedAverageTimeToFirstByteEstimator implements TimeToFirstByteEstimator {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.85d;
    private static final int MAX_DATA_SPECS = 10;
    private final InterfaceC1103b clock;
    private long estimateUs;
    private final LinkedHashMap<C1568l, Long> initializedDataSpecs;
    private final double smoothingFactor;

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

    public ExponentialWeightedAverageTimeToFirstByteEstimator() {
        this(0.85d, InterfaceC1103b.f4713a);
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public long getTimeToFirstByteEstimateUs() {
        return this.estimateUs;
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
        Long lRemove = this.initializedDataSpecs.remove(c1568l);
        if (lRemove == null) {
            return;
        }
        ((C1135z) this.clock).getClass();
        long jM2428S = AbstractC1118i0.m2428S(SystemClock.elapsedRealtime()) - lRemove.longValue();
        long j = this.estimateUs;
        if (j == -9223372036854775807L) {
            this.estimateUs = jM2428S;
            return;
        }
        double d8 = this.smoothingFactor;
        this.estimateUs = (long) (((1.0d - d8) * jM2428S) + (j * d8));
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void reset() {
        this.estimateUs = -9223372036854775807L;
    }

    public ExponentialWeightedAverageTimeToFirstByteEstimator(double d8) {
        this(d8, InterfaceC1103b.f4713a);
    }

    public ExponentialWeightedAverageTimeToFirstByteEstimator(double d8, InterfaceC1103b interfaceC1103b) {
        this.smoothingFactor = d8;
        this.clock = interfaceC1103b;
        this.initializedDataSpecs = new FixedSizeLinkedHashMap(10);
        this.estimateUs = -9223372036854775807L;
    }
}
