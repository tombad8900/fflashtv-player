package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.C0249w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p063h1.AbstractC1118i0;
import p068h6.AbstractC1194a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class SegmentBase {
    final RangedUri initialization;
    final long presentationTimeOffset;
    final long timescale;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static abstract class MultiSegmentBase extends SegmentBase {
        final long availabilityTimeOffsetUs;
        final long duration;
        private final long periodStartUnixTimeUs;
        final List<SegmentTimelineElement> segmentTimeline;
        final long startNumber;
        private final long timeShiftBufferDepthUs;

        public MultiSegmentBase(RangedUri rangedUri, long j, long j8, long j9, long j10, List<SegmentTimelineElement> list, long j11, long j12, long j13) {
            super(rangedUri, j, j8);
            this.startNumber = j9;
            this.duration = j10;
            this.segmentTimeline = list;
            this.availabilityTimeOffsetUs = j11;
            this.timeShiftBufferDepthUs = j12;
            this.periodStartUnixTimeUs = j13;
        }

        public long getAvailableSegmentCount(long j, long j8) {
            long segmentCount = getSegmentCount(j);
            return segmentCount != -1 ? segmentCount : (int) (getSegmentNum((j8 - this.periodStartUnixTimeUs) + this.availabilityTimeOffsetUs, j) - getFirstAvailableSegmentNum(j, j8));
        }

        public long getFirstAvailableSegmentNum(long j, long j8) {
            if (getSegmentCount(j) == -1) {
                long j9 = this.timeShiftBufferDepthUs;
                if (j9 != -9223372036854775807L) {
                    return Math.max(getFirstSegmentNum(), getSegmentNum((j8 - this.periodStartUnixTimeUs) - j9, j));
                }
            }
            return getFirstSegmentNum();
        }

        public long getFirstSegmentNum() {
            return this.startNumber;
        }

        public long getNextSegmentAvailableTimeUs(long j, long j8) {
            if (this.segmentTimeline != null) {
                return -9223372036854775807L;
            }
            long availableSegmentCount = getAvailableSegmentCount(j, j8) + getFirstAvailableSegmentNum(j, j8);
            return (getSegmentDurationUs(availableSegmentCount, j) + getSegmentTimeUs(availableSegmentCount)) - this.availabilityTimeOffsetUs;
        }

        public abstract long getSegmentCount(long j);

        public final long getSegmentDurationUs(long j, long j8) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return (list.get((int) (j - this.startNumber)).duration * 1000000) / this.timescale;
            }
            long segmentCount = getSegmentCount(j8);
            return (segmentCount == -1 || j != (getFirstSegmentNum() + segmentCount) - 1) ? (this.duration * 1000000) / this.timescale : j8 - getSegmentTimeUs(j);
        }

        public long getSegmentNum(long j, long j8) {
            long firstSegmentNum = getFirstSegmentNum();
            long segmentCount = getSegmentCount(j8);
            if (segmentCount != 0) {
                if (this.segmentTimeline != null) {
                    long j9 = (segmentCount + firstSegmentNum) - 1;
                    long j10 = firstSegmentNum;
                    while (j10 <= j9) {
                        long j11 = ((j9 - j10) / 2) + j10;
                        long segmentTimeUs = getSegmentTimeUs(j11);
                        if (segmentTimeUs < j) {
                            j10 = j11 + 1;
                        } else {
                            if (segmentTimeUs <= j) {
                                return j11;
                            }
                            j9 = j11 - 1;
                        }
                    }
                    return j10 == firstSegmentNum ? j10 : j9;
                }
                long j12 = (j / ((this.duration * 1000000) / this.timescale)) + this.startNumber;
                if (j12 >= firstSegmentNum) {
                    return segmentCount == -1 ? j12 : Math.min(j12, (firstSegmentNum + segmentCount) - 1);
                }
            }
            return firstSegmentNum;
        }

        public final long getSegmentTimeUs(long j) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            long j8 = list != null ? list.get((int) (j - this.startNumber)).startTime - this.presentationTimeOffset : (j - this.startNumber) * this.duration;
            long j9 = this.timescale;
            int i = AbstractC1118i0.f4750a;
            return AbstractC1118i0.m2437a0(j8, 1000000L, j9, RoundingMode.DOWN);
        }

        public abstract RangedUri getSegmentUrl(Representation representation, long j);

        public boolean isExplicit() {
            return this.segmentTimeline != null;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class SegmentList extends MultiSegmentBase {
        final List<RangedUri> mediaSegments;

        public SegmentList(RangedUri rangedUri, long j, long j8, long j9, long j10, List<SegmentTimelineElement> list, long j11, List<RangedUri> list2, long j12, long j13) {
            super(rangedUri, j, j8, j9, j10, list, j11, j12, j13);
            this.mediaSegments = list2;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j) {
            return this.mediaSegments.size();
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j) {
            return this.mediaSegments.get((int) (j - this.startNumber));
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public boolean isExplicit() {
            return true;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class SegmentTemplate extends MultiSegmentBase {
        final long endNumber;
        final UrlTemplate initializationTemplate;
        final UrlTemplate mediaTemplate;

        public SegmentTemplate(RangedUri rangedUri, long j, long j8, long j9, long j10, long j11, List<SegmentTimelineElement> list, long j12, UrlTemplate urlTemplate, UrlTemplate urlTemplate2, long j13, long j14) {
            super(rangedUri, j, j8, j9, j11, list, j12, j13, j14);
            this.initializationTemplate = urlTemplate;
            this.mediaTemplate = urlTemplate2;
            this.endNumber = j10;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase
        public RangedUri getInitialization(Representation representation) {
            UrlTemplate urlTemplate = this.initializationTemplate;
            if (urlTemplate == null) {
                return super.getInitialization(representation);
            }
            C0249w c0249w = representation.format;
            return new RangedUri(urlTemplate.buildUri(c0249w.f1509a, 0L, c0249w.f1518j, 0L), 0L, -1L);
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j) {
            if (this.segmentTimeline != null) {
                return r0.size();
            }
            long j8 = this.endNumber;
            if (j8 != -1) {
                return (j8 - this.startNumber) + 1;
            }
            if (j == -9223372036854775807L) {
                return -1L;
            }
            BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.timescale));
            BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.duration).multiply(BigInteger.valueOf(1000000L));
            RoundingMode roundingMode = RoundingMode.CEILING;
            int i = AbstractC1194a.f5072a;
            return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            long j8 = list != null ? list.get((int) (j - this.startNumber)).startTime : (j - this.startNumber) * this.duration;
            UrlTemplate urlTemplate = this.mediaTemplate;
            C0249w c0249w = representation.format;
            return new RangedUri(urlTemplate.buildUri(c0249w.f1509a, j, c0249w.f1518j, j8), 0L, -1L);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class SegmentTimelineElement {
        final long duration;
        final long startTime;

        public SegmentTimelineElement(long j, long j8) {
            this.startTime = j;
            this.duration = j8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SegmentTimelineElement.class == obj.getClass()) {
                SegmentTimelineElement segmentTimelineElement = (SegmentTimelineElement) obj;
                if (this.startTime == segmentTimelineElement.startTime && this.duration == segmentTimelineElement.duration) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.startTime) * 31) + ((int) this.duration);
        }
    }

    public SegmentBase(RangedUri rangedUri, long j, long j8) {
        this.initialization = rangedUri;
        this.timescale = j;
        this.presentationTimeOffset = j8;
    }

    public RangedUri getInitialization(Representation representation) {
        return this.initialization;
    }

    public long getPresentationTimeOffsetUs() {
        long j = this.presentationTimeOffset;
        long j8 = this.timescale;
        int i = AbstractC1118i0.f4750a;
        return AbstractC1118i0.m2437a0(j, 1000000L, j8, RoundingMode.DOWN);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class SingleSegmentBase extends SegmentBase {
        final long indexLength;
        final long indexStart;

        public SingleSegmentBase(RangedUri rangedUri, long j, long j8, long j9, long j10) {
            super(rangedUri, j, j8);
            this.indexStart = j9;
            this.indexLength = j10;
        }

        public RangedUri getIndex() {
            long j = this.indexLength;
            if (j <= 0) {
                return null;
            }
            return new RangedUri(null, this.indexStart, j);
        }

        public SingleSegmentBase() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
