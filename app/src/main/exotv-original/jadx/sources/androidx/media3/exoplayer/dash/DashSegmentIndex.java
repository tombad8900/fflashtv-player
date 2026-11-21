package androidx.media3.exoplayer.dash;

import androidx.media3.exoplayer.dash.manifest.RangedUri;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface DashSegmentIndex {
    public static final int INDEX_UNBOUNDED = -1;

    long getAvailableSegmentCount(long j, long j8);

    long getDurationUs(long j, long j8);

    long getFirstAvailableSegmentNum(long j, long j8);

    long getFirstSegmentNum();

    long getNextSegmentAvailableTimeUs(long j, long j8);

    long getSegmentCount(long j);

    long getSegmentNum(long j, long j8);

    RangedUri getSegmentUrl(long j);

    long getTimeUs(long j);

    boolean isExplicit();
}
