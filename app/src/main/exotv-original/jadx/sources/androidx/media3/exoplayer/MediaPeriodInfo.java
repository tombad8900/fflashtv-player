package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.MediaSource;
import java.util.Objects;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class MediaPeriodInfo {
    public final long durationUs;
    public final long endPositionUs;

    /* renamed from: id */
    public final MediaSource.MediaPeriodId f1558id;
    public final boolean isFinal;
    public final boolean isFollowedByTransitionToSameStream;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j, long j8, long j9, long j10, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11 = true;
        AbstractC1101a.m2353d(!z10 || z8);
        AbstractC1101a.m2353d(!z9 || z8);
        if (z7 && (z8 || z9 || z10)) {
            z11 = false;
        }
        AbstractC1101a.m2353d(z11);
        this.f1558id = mediaPeriodId;
        this.startPositionUs = j;
        this.requestedContentPositionUs = j8;
        this.endPositionUs = j9;
        this.durationUs = j10;
        this.isFollowedByTransitionToSameStream = z7;
        this.isLastInTimelinePeriod = z8;
        this.isLastInTimelineWindow = z9;
        this.isFinal = z10;
    }

    public MediaPeriodInfo copyWithRequestedContentPositionUs(long j) {
        return j == this.requestedContentPositionUs ? this : new MediaPeriodInfo(this.f1558id, this.startPositionUs, j, this.endPositionUs, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public MediaPeriodInfo copyWithStartPositionUs(long j) {
        return j == this.startPositionUs ? this : new MediaPeriodInfo(this.f1558id, j, this.requestedContentPositionUs, this.endPositionUs, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MediaPeriodInfo.class == obj.getClass()) {
            MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
            if (this.startPositionUs == mediaPeriodInfo.startPositionUs && this.requestedContentPositionUs == mediaPeriodInfo.requestedContentPositionUs && this.endPositionUs == mediaPeriodInfo.endPositionUs && this.durationUs == mediaPeriodInfo.durationUs && this.isFollowedByTransitionToSameStream == mediaPeriodInfo.isFollowedByTransitionToSameStream && this.isLastInTimelinePeriod == mediaPeriodInfo.isLastInTimelinePeriod && this.isLastInTimelineWindow == mediaPeriodInfo.isLastInTimelineWindow && this.isFinal == mediaPeriodInfo.isFinal) {
                MediaSource.MediaPeriodId mediaPeriodId = this.f1558id;
                MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodInfo.f1558id;
                int i = AbstractC1118i0.f4750a;
                if (Objects.equals(mediaPeriodId, mediaPeriodId2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((this.f1558id.hashCode() + 527) * 31) + ((int) this.startPositionUs)) * 31) + ((int) this.requestedContentPositionUs)) * 31) + ((int) this.endPositionUs)) * 31) + ((int) this.durationUs)) * 31) + (this.isFollowedByTransitionToSameStream ? 1 : 0)) * 31) + (this.isLastInTimelinePeriod ? 1 : 0)) * 31) + (this.isLastInTimelineWindow ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }
}
