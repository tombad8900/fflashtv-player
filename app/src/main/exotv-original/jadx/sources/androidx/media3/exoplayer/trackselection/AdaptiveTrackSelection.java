package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0969h1;
import p052f6.C0972i1;
import p052f6.C0974j0;
import p052f6.C0975j1;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1135z;
import p063h1.InterfaceC1103b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MAX_HEIGHT_TO_DISCARD = 719;
    public static final int DEFAULT_MAX_WIDTH_TO_DISCARD = 1279;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final long MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 1000;
    private static final String TAG = "AdaptiveTrackSelection";
    private final AbstractC0983m0 adaptationCheckpoints;
    private final float bandwidthFraction;
    private final BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final InterfaceC1103b clock;
    private MediaChunk lastBufferEvaluationMediaChunk;
    private long lastBufferEvaluationMs;
    private long latestBitrateEstimate;
    private final long maxDurationForQualityDecreaseUs;
    private final int maxHeightToDiscard;
    private final int maxWidthToDiscard;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class AdaptationCheckpoint {
        public final long allocatedBandwidth;
        public final long totalBandwidth;

        public AdaptationCheckpoint(long j, long j8) {
            this.totalBandwidth = j;
            this.allocatedBandwidth = j8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            return this.totalBandwidth == adaptationCheckpoint.totalBandwidth && this.allocatedBandwidth == adaptationCheckpoint.allocatedBandwidth;
        }

        public int hashCode() {
            return (((int) this.totalBandwidth) * 31) + ((int) this.allocatedBandwidth);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class Factory implements ExoTrackSelection.Factory {
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final InterfaceC1103b clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int maxHeightToDiscard;
        private final int maxWidthToDiscard;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;

        public Factory() {
            this(10000, 25000, 25000, 0.7f);
        }

        public AdaptiveTrackSelection createAdaptiveTrackSelection(C0233q1 c0233q1, int[] iArr, int i, BandwidthMeter bandwidthMeter, AbstractC0983m0 abstractC0983m0) {
            return new AdaptiveTrackSelection(c0233q1, iArr, i, bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.maxWidthToDiscard, this.maxHeightToDiscard, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, abstractC0983m0, this.clock);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, AbstractC0230p1 abstractC0230p1) {
            BandwidthMeter bandwidthMeter2;
            ExoTrackSelection exoTrackSelectionCreateAdaptiveTrackSelection;
            AbstractC0983m0 adaptationCheckpoints = AdaptiveTrackSelection.getAdaptationCheckpoints(definitionArr);
            ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
            int i = 0;
            while (i < definitionArr.length) {
                ExoTrackSelection.Definition definition = definitionArr[i];
                if (definition != null) {
                    int[] iArr = definition.tracks;
                    if (iArr.length == 0) {
                        bandwidthMeter2 = bandwidthMeter;
                    } else {
                        if (iArr.length == 1) {
                            exoTrackSelectionCreateAdaptiveTrackSelection = new FixedTrackSelection(definition.group, iArr[0], definition.type);
                            bandwidthMeter2 = bandwidthMeter;
                        } else {
                            bandwidthMeter2 = bandwidthMeter;
                            exoTrackSelectionCreateAdaptiveTrackSelection = createAdaptiveTrackSelection(definition.group, iArr, definition.type, bandwidthMeter2, (AbstractC0983m0) adaptationCheckpoints.get(i));
                        }
                        exoTrackSelectionArr[i] = exoTrackSelectionCreateAdaptiveTrackSelection;
                    }
                }
                i++;
                bandwidthMeter = bandwidthMeter2;
            }
            return exoTrackSelectionArr;
        }

        public Factory(int i, int i4, int i8, float f8) {
            this(i, i4, i8, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, f8, 0.75f, InterfaceC1103b.f4713a);
        }

        public Factory(int i, int i4, int i8, int i9, int i10, float f8) {
            this(i, i4, i8, i9, i10, f8, 0.75f, InterfaceC1103b.f4713a);
        }

        public Factory(int i, int i4, int i8, float f8, float f9, InterfaceC1103b interfaceC1103b) {
            this(i, i4, i8, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, f8, f9, interfaceC1103b);
        }

        public Factory(int i, int i4, int i8, int i9, int i10, float f8, float f9, InterfaceC1103b interfaceC1103b) {
            this.minDurationForQualityIncreaseMs = i;
            this.maxDurationForQualityDecreaseMs = i4;
            this.minDurationToRetainAfterDiscardMs = i8;
            this.maxWidthToDiscard = i9;
            this.maxHeightToDiscard = i10;
            this.bandwidthFraction = f8;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f9;
            this.clock = interfaceC1103b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdaptiveTrackSelection(C0233q1 c0233q1, int[] iArr, BandwidthMeter bandwidthMeter) {
        this(c0233q1, iArr, 0, bandwidthMeter, Renderer.DEFAULT_DURATION_TO_PROGRESS_US, 25000L, 25000L, DEFAULT_MAX_WIDTH_TO_DISCARD, DEFAULT_MAX_HEIGHT_TO_DISCARD, 0.7f, 0.75f, C0981l1.f4211n, InterfaceC1103b.f4713a);
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
    }

    private static void addCheckpoint(List<C0974j0> list, long[] jArr) {
        long j = 0;
        for (long j8 : jArr) {
            j += j8;
        }
        for (int i = 0; i < list.size(); i++) {
            C0974j0 c0974j0 = list.get(i);
            if (c0974j0 != null) {
                c0974j0.m2141a(new AdaptationCheckpoint(j, jArr[i]));
            }
        }
    }

    private int determineIdealSelectedIndex(long j, long j8) {
        long allocatedBandwidth = getAllocatedBandwidth(j8);
        int i = 0;
        for (int i4 = 0; i4 < this.length; i4++) {
            if (j == Long.MIN_VALUE || !isTrackExcluded(i4, j)) {
                C0249w format = getFormat(i4);
                if (canSelectFormat(format, format.f1518j, allocatedBandwidth)) {
                    return i4;
                }
                i = i4;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC0983m0 getAdaptationCheckpoints(ExoTrackSelection.Definition[] definitionArr) {
        ArrayList arrayList = new ArrayList();
        for (ExoTrackSelection.Definition definition : definitionArr) {
            if (definition == null || definition.tracks.length <= 1) {
                arrayList.add(null);
            } else {
                C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
                c0974j0M2164i.m2141a(new AdaptationCheckpoint(0L, 0L));
                arrayList.add(c0974j0M2164i);
            }
        }
        long[][] sortedTrackBitrates = getSortedTrackBitrates(definitionArr);
        int[] iArr = new int[sortedTrackBitrates.length];
        long[] jArr = new long[sortedTrackBitrates.length];
        for (int i = 0; i < sortedTrackBitrates.length; i++) {
            long[] jArr2 = sortedTrackBitrates[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        addCheckpoint(arrayList, jArr);
        AbstractC0983m0 switchOrder = getSwitchOrder(sortedTrackBitrates);
        for (int i4 = 0; i4 < switchOrder.size(); i4++) {
            int iIntValue = ((Integer) switchOrder.get(i4)).intValue();
            int i8 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i8;
            jArr[iIntValue] = sortedTrackBitrates[iIntValue][i8];
            addCheckpoint(arrayList, jArr);
        }
        for (int i9 = 0; i9 < definitionArr.length; i9++) {
            if (arrayList.get(i9) != null) {
                jArr[i9] = jArr[i9] * 2;
            }
        }
        addCheckpoint(arrayList, jArr);
        C0974j0 c0974j0M2164i2 = AbstractC0983m0.m2164i();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C0974j0 c0974j0 = (C0974j0) arrayList.get(i10);
            c0974j0M2164i2.m2141a(c0974j0 == null ? C0981l1.f4211n : c0974j0.m2159f());
        }
        return c0974j0M2164i2.m2159f();
    }

    private long getAllocatedBandwidth(long j) {
        long totalAllocatableBandwidth = getTotalAllocatableBandwidth(j);
        if (this.adaptationCheckpoints.isEmpty()) {
            return totalAllocatableBandwidth;
        }
        int i = 1;
        while (i < this.adaptationCheckpoints.size() - 1 && ((AdaptationCheckpoint) this.adaptationCheckpoints.get(i)).totalBandwidth < totalAllocatableBandwidth) {
            i++;
        }
        AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) this.adaptationCheckpoints.get(i - 1);
        AdaptationCheckpoint adaptationCheckpoint2 = (AdaptationCheckpoint) this.adaptationCheckpoints.get(i);
        long j8 = adaptationCheckpoint.totalBandwidth;
        float f8 = (totalAllocatableBandwidth - j8) / (adaptationCheckpoint2.totalBandwidth - j8);
        return adaptationCheckpoint.allocatedBandwidth + ((long) (f8 * (adaptationCheckpoint2.allocatedBandwidth - r2)));
    }

    private long getLastChunkDurationUs(List<? extends MediaChunk> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        MediaChunk mediaChunk = (MediaChunk) AbstractC1006u.m2194i(list);
        long j = mediaChunk.startTimeUs;
        if (j != -9223372036854775807L) {
            long j8 = mediaChunk.endTimeUs;
            if (j8 != -9223372036854775807L) {
                return j8 - j;
            }
        }
        return -9223372036854775807L;
    }

    private long getNextChunkDurationUs(MediaChunkIterator[] mediaChunkIteratorArr, List<? extends MediaChunk> list) {
        int i = this.selectedIndex;
        if (i < mediaChunkIteratorArr.length && mediaChunkIteratorArr[i].next()) {
            MediaChunkIterator mediaChunkIterator = mediaChunkIteratorArr[this.selectedIndex];
            return mediaChunkIterator.getChunkEndTimeUs() - mediaChunkIterator.getChunkStartTimeUs();
        }
        for (MediaChunkIterator mediaChunkIterator2 : mediaChunkIteratorArr) {
            if (mediaChunkIterator2.next()) {
                return mediaChunkIterator2.getChunkEndTimeUs() - mediaChunkIterator2.getChunkStartTimeUs();
            }
        }
        return getLastChunkDurationUs(list);
    }

    private static long[][] getSortedTrackBitrates(ExoTrackSelection.Definition[] definitionArr) {
        long[][] jArr = new long[definitionArr.length][];
        for (int i = 0; i < definitionArr.length; i++) {
            ExoTrackSelection.Definition definition = definitionArr[i];
            if (definition == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[definition.tracks.length];
                int i4 = 0;
                while (true) {
                    int[] iArr = definition.tracks;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    long j = definition.group.f1322d[iArr[i4]].f1518j;
                    long[] jArr2 = jArr[i];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i4] = j;
                    i4++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    private static AbstractC0983m0 getSwitchOrder(long[][] jArr) {
        AbstractC1006u.m2188c(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(C0975j1.f4201k);
        C0969h1 c0969h1 = new C0969h1();
        C0972i1 c0972i1 = new C0972i1(treeMap);
        c0972i1.f4200p = c0969h1;
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i4 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    double dLog = 0.0d;
                    if (i4 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i4];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i4] = dLog;
                    i4++;
                }
                int i8 = length - 1;
                double d8 = dArr[i8] - dArr[0];
                int i9 = 0;
                while (i9 < i8) {
                    double d9 = dArr[i9];
                    i9++;
                    c0972i1.put(Double.valueOf(d8 == 0.0d ? 1.0d : (((d9 + dArr[i9]) * 0.5d) - dArr[0]) / d8), Integer.valueOf(i));
                }
            }
        }
        return AbstractC0983m0.m2165j(c0972i1.values());
    }

    private long getTotalAllocatableBandwidth(long j) {
        long bitrateEstimate = this.bandwidthMeter.getBitrateEstimate();
        this.latestBitrateEstimate = bitrateEstimate;
        long j8 = (long) (bitrateEstimate * this.bandwidthFraction);
        long timeToFirstByteEstimateUs = this.bandwidthMeter.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == -9223372036854775807L || j == -9223372036854775807L) {
            return (long) (j8 / this.playbackSpeed);
        }
        float f8 = j;
        return (long) ((j8 * Math.max((f8 / this.playbackSpeed) - timeToFirstByteEstimateUs, 0.0f)) / f8);
    }

    private long minDurationForQualityIncreaseUs(long j, long j8) {
        if (j == -9223372036854775807L) {
            return this.minDurationForQualityIncreaseUs;
        }
        if (j8 != -9223372036854775807L) {
            j -= j8;
        }
        return Math.min((long) (j * this.bufferedFractionToLiveEdgeForQualityIncrease), this.minDurationForQualityIncreaseUs);
    }

    public boolean canSelectFormat(C0249w c0249w, int i, long j) {
        return ((long) i) <= j;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
        this.lastBufferEvaluationMs = -9223372036854775807L;
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j, List<? extends MediaChunk> list) {
        int i;
        int i4;
        ((C1135z) this.clock).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!shouldEvaluateQueueSize(jElapsedRealtime, list)) {
            return list.size();
        }
        this.lastBufferEvaluationMs = jElapsedRealtime;
        this.lastBufferEvaluationMediaChunk = list.isEmpty() ? null : (MediaChunk) AbstractC1006u.m2194i(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM2415F = AbstractC1118i0.m2415F(list.get(size - 1).startTimeUs - j, this.playbackSpeed);
        long minDurationToRetainAfterDiscardUs = getMinDurationToRetainAfterDiscardUs();
        if (jM2415F >= minDurationToRetainAfterDiscardUs) {
            C0249w format = getFormat(determineIdealSelectedIndex(jElapsedRealtime, getLastChunkDurationUs(list)));
            for (int i8 = 0; i8 < size; i8++) {
                MediaChunk mediaChunk = list.get(i8);
                C0249w c0249w = mediaChunk.trackFormat;
                if (AbstractC1118i0.m2415F(mediaChunk.startTimeUs - j, this.playbackSpeed) >= minDurationToRetainAfterDiscardUs && c0249w.f1518j < format.f1518j && (i = c0249w.f1530v) != -1 && i <= this.maxHeightToDiscard && (i4 = c0249w.f1529u) != -1 && i4 <= this.maxWidthToDiscard && i < format.f1530v) {
                    return i8;
                }
            }
        }
        return size;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public long getLatestBitrateEstimate() {
        return this.latestBitrateEstimate;
    }

    public long getMinDurationToRetainAfterDiscardUs() {
        return this.minDurationToRetainAfterDiscardUs;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public Object getSelectionData() {
        return null;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f8) {
        this.playbackSpeed = f8;
    }

    public boolean shouldEvaluateQueueSize(long j, List<? extends MediaChunk> list) {
        long j8 = this.lastBufferEvaluationMs;
        if (j8 == -9223372036854775807L || j - j8 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((MediaChunk) AbstractC1006u.m2194i(list)).equals(this.lastBufferEvaluationMediaChunk)) ? false : true;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j, long j8, long j9, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        ((C1135z) this.clock).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(mediaChunkIteratorArr, list);
        int i = this.reason;
        if (i == 0) {
            this.reason = 1;
            this.selectedIndex = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
            return;
        }
        int i4 = this.selectedIndex;
        int iIndexOf = list.isEmpty() ? -1 : indexOf(((MediaChunk) AbstractC1006u.m2194i(list)).trackFormat);
        if (iIndexOf != -1) {
            i = ((MediaChunk) AbstractC1006u.m2194i(list)).trackSelectionReason;
            i4 = iIndexOf;
        }
        int iDetermineIdealSelectedIndex = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
        if (iDetermineIdealSelectedIndex != i4 && !isTrackExcluded(i4, jElapsedRealtime)) {
            C0249w format = getFormat(i4);
            C0249w format2 = getFormat(iDetermineIdealSelectedIndex);
            long jMinDurationForQualityIncreaseUs = minDurationForQualityIncreaseUs(j9, nextChunkDurationUs);
            int i8 = format2.f1518j;
            int i9 = format.f1518j;
            if ((i8 > i9 && j8 < jMinDurationForQualityIncreaseUs) || (i8 < i9 && j8 >= this.maxDurationForQualityDecreaseUs)) {
                iDetermineIdealSelectedIndex = i4;
            }
        }
        if (iDetermineIdealSelectedIndex != i4) {
            i = 3;
        }
        this.reason = i;
        this.selectedIndex = iDetermineIdealSelectedIndex;
    }

    public AdaptiveTrackSelection(C0233q1 c0233q1, int[] iArr, int i, BandwidthMeter bandwidthMeter, long j, long j8, long j9, int i4, int i8, float f8, float f9, List<AdaptationCheckpoint> list, InterfaceC1103b interfaceC1103b) {
        long j10;
        super(c0233q1, iArr, i);
        if (j9 < j) {
            AbstractC1101a.m2348F(TAG, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j10 = j;
        } else {
            j10 = j9;
        }
        this.bandwidthMeter = bandwidthMeter;
        this.minDurationForQualityIncreaseUs = j * 1000;
        this.maxDurationForQualityDecreaseUs = j8 * 1000;
        this.minDurationToRetainAfterDiscardUs = j10 * 1000;
        this.maxWidthToDiscard = i4;
        this.maxHeightToDiscard = i8;
        this.bandwidthFraction = f8;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f9;
        this.adaptationCheckpoints = AbstractC0983m0.m2165j(list);
        this.clock = interfaceC1103b;
        this.playbackSpeed = 1.0f;
        this.reason = 0;
        this.lastBufferEvaluationMs = -9223372036854775807L;
        this.latestBitrateEstimate = -2147483647L;
    }
}
