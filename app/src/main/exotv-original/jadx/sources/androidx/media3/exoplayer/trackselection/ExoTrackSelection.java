package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface ExoTrackSelection extends TrackSelection {

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Definition {
        private static final String TAG = "ETSDefinition";
        public final C0233q1 group;
        public final int[] tracks;
        public final int type;

        public Definition(C0233q1 c0233q1, int... iArr) {
            this(c0233q1, iArr, 0);
        }

        public Definition(C0233q1 c0233q1, int[] iArr, int i) {
            if (iArr.length == 0) {
                AbstractC1101a.m2365p(TAG, "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.group = c0233q1;
            this.tracks = iArr;
            this.type = i;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Factory {
        ExoTrackSelection[] createTrackSelections(Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, AbstractC0230p1 abstractC0230p1);
    }

    void disable();

    void enable();

    int evaluateQueueSize(long j, List<? extends MediaChunk> list);

    boolean excludeTrack(int i, long j);

    default long getLatestBitrateEstimate() {
        return -2147483647L;
    }

    C0249w getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    boolean isTrackExcluded(int i, long j);

    default void onDiscontinuity() {
    }

    default void onPlayWhenReadyChanged(boolean z7) {
    }

    void onPlaybackSpeed(float f8);

    default void onRebuffer() {
    }

    default boolean shouldCancelChunkLoad(long j, Chunk chunk, List<? extends MediaChunk> list) {
        return false;
    }

    void updateSelectedTrack(long j, long j8, long j9, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr);
}
