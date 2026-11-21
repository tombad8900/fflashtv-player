package androidx.media3.exoplayer;

import androidx.media3.common.AbstractC0230p1;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface LoadControl {

    @Deprecated
    public static final MediaSource.MediaPeriodId EMPTY_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Parameters {
        public final long bufferedDurationUs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final boolean playWhenReady;
        public final long playbackPositionUs;
        public final float playbackSpeed;
        public final PlayerId playerId;
        public final boolean rebuffering;
        public final long targetLiveOffsetUs;
        public final AbstractC0230p1 timeline;

        public Parameters(PlayerId playerId, AbstractC0230p1 abstractC0230p1, MediaSource.MediaPeriodId mediaPeriodId, long j, long j8, float f8, boolean z7, boolean z8, long j9) {
            this.playerId = playerId;
            this.timeline = abstractC0230p1;
            this.mediaPeriodId = mediaPeriodId;
            this.playbackPositionUs = j;
            this.bufferedDurationUs = j8;
            this.playbackSpeed = f8;
            this.playWhenReady = z7;
            this.rebuffering = z8;
            this.targetLiveOffsetUs = j9;
        }
    }

    Allocator getAllocator();

    default long getBackBufferDurationUs(PlayerId playerId) {
        return getBackBufferDurationUs();
    }

    default void onPrepared(PlayerId playerId) {
        onPrepared();
    }

    default void onReleased(PlayerId playerId) {
        onReleased();
    }

    default void onStopped(PlayerId playerId) {
        onStopped();
    }

    default void onTracksSelected(Parameters parameters, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default boolean retainBackBufferFromKeyframe(PlayerId playerId) {
        return retainBackBufferFromKeyframe();
    }

    default boolean shouldContinueLoading(Parameters parameters) {
        return shouldContinueLoading(parameters.playbackPositionUs, parameters.bufferedDurationUs, parameters.playbackSpeed);
    }

    default boolean shouldContinuePreloading(AbstractC0230p1 abstractC0230p1, MediaSource.MediaPeriodId mediaPeriodId, long j) {
        AbstractC1101a.m2348F("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default boolean shouldStartPlayback(Parameters parameters) {
        return shouldStartPlayback(parameters.timeline, parameters.mediaPeriodId, parameters.bufferedDurationUs, parameters.playbackSpeed, parameters.rebuffering, parameters.targetLiveOffsetUs);
    }

    @Deprecated
    default long getBackBufferDurationUs() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    @Deprecated
    default void onPrepared() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    @Deprecated
    default void onReleased() {
        throw new IllegalStateException("onReleased not implemented");
    }

    @Deprecated
    default void onStopped() {
        throw new IllegalStateException("onStopped not implemented");
    }

    @Deprecated
    default void onTracksSelected(PlayerId playerId, AbstractC0230p1 abstractC0230p1, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        onTracksSelected(abstractC0230p1, mediaPeriodId, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Deprecated
    default boolean retainBackBufferFromKeyframe() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    @Deprecated
    default boolean shouldContinueLoading(long j, long j8, float f8) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    @Deprecated
    default boolean shouldStartPlayback(AbstractC0230p1 abstractC0230p1, MediaSource.MediaPeriodId mediaPeriodId, long j, float f8, boolean z7, long j8) {
        return shouldStartPlayback(j, f8, z7, j8);
    }

    @Deprecated
    default void onTracksSelected(AbstractC0230p1 abstractC0230p1, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        onTracksSelected(rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Deprecated
    default boolean shouldStartPlayback(long j, float f8, boolean z7, long j8) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    @Deprecated
    default void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }
}
