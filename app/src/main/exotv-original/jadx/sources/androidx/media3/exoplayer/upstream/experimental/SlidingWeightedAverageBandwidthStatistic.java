package androidx.media3.exoplayer.upstream.experimental;

import android.os.SystemClock;
import androidx.media3.exoplayer.analytics.C0282d;
import java.util.ArrayDeque;
import java.util.Deque;
import p063h1.AbstractC1118i0;
import p063h1.C1135z;
import p063h1.InterfaceC1103b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class SlidingWeightedAverageBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    private double bitrateWeightProductSum;
    private final InterfaceC1103b clock;
    private final SampleEvictionFunction sampleEvictionFunction;
    private final ArrayDeque<Sample> samples;
    private double weightSum;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class Sample {
        public final long bitrate;
        public final long timeAddedMs;
        public final double weight;

        public Sample(long j, double d8, long j8) {
            this.bitrate = j;
            this.weight = d8;
            this.timeAddedMs = j8;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface SampleEvictionFunction {
        boolean shouldEvictSample(Deque<Sample> deque);
    }

    public SlidingWeightedAverageBandwidthStatistic() {
        this(getMaxCountEvictionFunction(10L));
    }

    public static SampleEvictionFunction getAgeBasedEvictionFunction(long j) {
        return getAgeBasedEvictionFunction(j, InterfaceC1103b.f4713a);
    }

    public static SampleEvictionFunction getMaxCountEvictionFunction(final long j) {
        return new SampleEvictionFunction() { // from class: androidx.media3.exoplayer.upstream.experimental.a
            @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(Deque deque) {
                return SlidingWeightedAverageBandwidthStatistic.lambda$getMaxCountEvictionFunction$0(j, deque);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$getAgeBasedEvictionFunction$1(long j, InterfaceC1103b interfaceC1103b, Deque deque) {
        if (deque.isEmpty()) {
            return false;
        }
        Sample sample = (Sample) deque.peek();
        int i = AbstractC1118i0.f4750a;
        long j8 = sample.timeAddedMs + j;
        ((C1135z) interfaceC1103b).getClass();
        return j8 < SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getMaxCountEvictionFunction$0(long j, Deque deque) {
        return ((long) deque.size()) >= j;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j8) {
        while (this.sampleEvictionFunction.shouldEvictSample(this.samples)) {
            Sample sampleRemove = this.samples.remove();
            double d8 = this.bitrateWeightProductSum;
            double d9 = sampleRemove.bitrate;
            double d10 = sampleRemove.weight;
            this.bitrateWeightProductSum = d8 - (d9 * d10);
            this.weightSum -= d10;
        }
        double dSqrt = Math.sqrt(j);
        ((C1135z) this.clock).getClass();
        Sample sample = new Sample((j * 8000000) / j8, dSqrt, SystemClock.elapsedRealtime());
        this.samples.add(sample);
        double d11 = this.bitrateWeightProductSum;
        double d12 = sample.bitrate;
        double d13 = sample.weight;
        this.bitrateWeightProductSum = (d12 * d13) + d11;
        this.weightSum += d13;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.bitrateWeightProductSum / this.weightSum);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.bitrateWeightProductSum = 0.0d;
        this.weightSum = 0.0d;
    }

    public SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction) {
        this(sampleEvictionFunction, InterfaceC1103b.f4713a);
    }

    public static SampleEvictionFunction getAgeBasedEvictionFunction(long j, InterfaceC1103b interfaceC1103b) {
        return new C0282d(j, interfaceC1103b);
    }

    public SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction, InterfaceC1103b interfaceC1103b) {
        this.samples = new ArrayDeque<>();
        this.sampleEvictionFunction = sampleEvictionFunction;
        this.clock = interfaceC1103b;
    }
}
