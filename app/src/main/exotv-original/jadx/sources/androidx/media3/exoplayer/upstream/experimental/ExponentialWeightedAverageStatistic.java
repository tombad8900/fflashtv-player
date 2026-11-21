package androidx.media3.exoplayer.upstream.experimental;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class ExponentialWeightedAverageStatistic implements BandwidthStatistic {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.9999d;
    private long bitrateEstimate;
    private final double smoothingFactor;

    public ExponentialWeightedAverageStatistic() {
        this(0.9999d);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j, long j8) {
        long j9 = (8000000 * j) / j8;
        if (this.bitrateEstimate == Long.MIN_VALUE) {
            this.bitrateEstimate = j9;
            return;
        }
        double dPow = Math.pow(this.smoothingFactor, Math.sqrt(j));
        this.bitrateEstimate = (long) (((1.0d - dPow) * j9) + (this.bitrateEstimate * dPow));
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    public ExponentialWeightedAverageStatistic(double d8) {
        this.smoothingFactor = d8;
        this.bitrateEstimate = Long.MIN_VALUE;
    }
}
