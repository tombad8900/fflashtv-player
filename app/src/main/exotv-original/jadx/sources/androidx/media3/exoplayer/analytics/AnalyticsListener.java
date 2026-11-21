package androidx.media3.exoplayer.analytics;

import android.support.v4.media.session.AbstractC0120b;
import android.util.SparseArray;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0189c1;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0231q;
import androidx.media3.common.C0235r0;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0243u;
import androidx.media3.common.C0248v1;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0253x0;
import androidx.media3.common.C0254x1;
import androidx.media3.common.C0256y0;
import androidx.media3.common.C0259z0;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;
import p056g1.C1029b;
import p056g1.C1030c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface AnalyticsListener {
    public static final int EVENT_AUDIO_ATTRIBUTES_CHANGED = 20;
    public static final int EVENT_AUDIO_CODEC_ERROR = 1029;
    public static final int EVENT_AUDIO_DECODER_INITIALIZED = 1008;
    public static final int EVENT_AUDIO_DECODER_RELEASED = 1012;
    public static final int EVENT_AUDIO_DISABLED = 1013;
    public static final int EVENT_AUDIO_ENABLED = 1007;
    public static final int EVENT_AUDIO_INPUT_FORMAT_CHANGED = 1009;
    public static final int EVENT_AUDIO_POSITION_ADVANCING = 1010;
    public static final int EVENT_AUDIO_SESSION_ID = 21;
    public static final int EVENT_AUDIO_SINK_ERROR = 1014;
    public static final int EVENT_AUDIO_TRACK_INITIALIZED = 1031;
    public static final int EVENT_AUDIO_TRACK_RELEASED = 1032;
    public static final int EVENT_AUDIO_UNDERRUN = 1011;
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 13;
    public static final int EVENT_BANDWIDTH_ESTIMATE = 1006;
    public static final int EVENT_CUES = 27;
    public static final int EVENT_DEVICE_INFO_CHANGED = 29;
    public static final int EVENT_DEVICE_VOLUME_CHANGED = 30;
    public static final int EVENT_DOWNSTREAM_FORMAT_CHANGED = 1004;
    public static final int EVENT_DRM_KEYS_LOADED = 1023;
    public static final int EVENT_DRM_KEYS_REMOVED = 1026;
    public static final int EVENT_DRM_KEYS_RESTORED = 1025;
    public static final int EVENT_DRM_SESSION_ACQUIRED = 1022;
    public static final int EVENT_DRM_SESSION_MANAGER_ERROR = 1024;
    public static final int EVENT_DRM_SESSION_RELEASED = 1027;
    public static final int EVENT_DROPPED_VIDEO_FRAMES = 1018;
    public static final int EVENT_IS_LOADING_CHANGED = 3;
    public static final int EVENT_IS_PLAYING_CHANGED = 7;
    public static final int EVENT_LOAD_CANCELED = 1002;
    public static final int EVENT_LOAD_COMPLETED = 1001;
    public static final int EVENT_LOAD_ERROR = 1003;
    public static final int EVENT_LOAD_STARTED = 1000;
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 18;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_MEDIA_METADATA_CHANGED = 14;
    public static final int EVENT_METADATA = 28;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 12;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 4;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 6;
    public static final int EVENT_PLAYER_ERROR = 10;
    public static final int EVENT_PLAYER_RELEASED = 1028;
    public static final int EVENT_PLAYLIST_METADATA_CHANGED = 15;
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 5;
    public static final int EVENT_POSITION_DISCONTINUITY = 11;
    public static final int EVENT_RENDERED_FIRST_FRAME = 26;
    public static final int EVENT_RENDERER_READY_CHANGED = 1033;
    public static final int EVENT_REPEAT_MODE_CHANGED = 8;
    public static final int EVENT_SEEK_BACK_INCREMENT_CHANGED = 16;
    public static final int EVENT_SEEK_FORWARD_INCREMENT_CHANGED = 17;
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 9;
    public static final int EVENT_SKIP_SILENCE_ENABLED_CHANGED = 23;
    public static final int EVENT_SURFACE_SIZE_CHANGED = 24;
    public static final int EVENT_TIMELINE_CHANGED = 0;
    public static final int EVENT_TRACKS_CHANGED = 2;
    public static final int EVENT_TRACK_SELECTION_PARAMETERS_CHANGED = 19;
    public static final int EVENT_UPSTREAM_DISCARDED = 1005;
    public static final int EVENT_VIDEO_CODEC_ERROR = 1030;
    public static final int EVENT_VIDEO_DECODER_INITIALIZED = 1016;
    public static final int EVENT_VIDEO_DECODER_RELEASED = 1019;
    public static final int EVENT_VIDEO_DISABLED = 1020;
    public static final int EVENT_VIDEO_ENABLED = 1015;
    public static final int EVENT_VIDEO_FRAME_PROCESSING_OFFSET = 1021;
    public static final int EVENT_VIDEO_INPUT_FORMAT_CHANGED = 1017;
    public static final int EVENT_VIDEO_SIZE_CHANGED = 25;
    public static final int EVENT_VOLUME_CHANGED = 22;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface EventFlags {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class EventTime {
        public final MediaSource.MediaPeriodId currentMediaPeriodId;
        public final long currentPlaybackPositionMs;
        public final AbstractC0230p1 currentTimeline;
        public final int currentWindowIndex;
        public final long eventPlaybackPositionMs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final long realtimeMs;
        public final AbstractC0230p1 timeline;
        public final long totalBufferedDurationMs;
        public final int windowIndex;

        public EventTime(long j, AbstractC0230p1 abstractC0230p1, int i, MediaSource.MediaPeriodId mediaPeriodId, long j8, AbstractC0230p1 abstractC0230p12, int i4, MediaSource.MediaPeriodId mediaPeriodId2, long j9, long j10) {
            this.realtimeMs = j;
            this.timeline = abstractC0230p1;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
            this.eventPlaybackPositionMs = j8;
            this.currentTimeline = abstractC0230p12;
            this.currentWindowIndex = i4;
            this.currentMediaPeriodId = mediaPeriodId2;
            this.currentPlaybackPositionMs = j9;
            this.totalBufferedDurationMs = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && EventTime.class == obj.getClass()) {
                EventTime eventTime = (EventTime) obj;
                if (this.realtimeMs == eventTime.realtimeMs && this.windowIndex == eventTime.windowIndex && this.eventPlaybackPositionMs == eventTime.eventPlaybackPositionMs && this.currentWindowIndex == eventTime.currentWindowIndex && this.currentPlaybackPositionMs == eventTime.currentPlaybackPositionMs && this.totalBufferedDurationMs == eventTime.totalBufferedDurationMs && AbstractC0120b.m422r(this.timeline, eventTime.timeline) && AbstractC0120b.m422r(this.mediaPeriodId, eventTime.mediaPeriodId) && AbstractC0120b.m422r(this.currentTimeline, eventTime.currentTimeline) && AbstractC0120b.m422r(this.currentMediaPeriodId, eventTime.currentMediaPeriodId)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.realtimeMs), this.timeline, Integer.valueOf(this.windowIndex), this.mediaPeriodId, Long.valueOf(this.eventPlaybackPositionMs), this.currentTimeline, Integer.valueOf(this.currentWindowIndex), this.currentMediaPeriodId, Long.valueOf(this.currentPlaybackPositionMs), Long.valueOf(this.totalBufferedDurationMs)});
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Events {
        private final SparseArray<EventTime> eventTimes;
        private final C0243u flags;

        public Events(C0243u c0243u, SparseArray<EventTime> sparseArray) {
            this.flags = c0243u;
            SparseArray<EventTime> sparseArray2 = new SparseArray<>(c0243u.f1421a.size());
            for (int i = 0; i < c0243u.f1421a.size(); i++) {
                int iM671b = c0243u.m671b(i);
                EventTime eventTime = sparseArray.get(iM671b);
                eventTime.getClass();
                sparseArray2.append(iM671b, eventTime);
            }
            this.eventTimes = sparseArray2;
        }

        public boolean contains(int i) {
            return this.flags.f1421a.get(i);
        }

        public boolean containsAny(int... iArr) {
            return this.flags.m670a(iArr);
        }

        public int get(int i) {
            return this.flags.m671b(i);
        }

        public EventTime getEventTime(int i) {
            EventTime eventTime = this.eventTimes.get(i);
            eventTime.getClass();
            return eventTime;
        }

        public int size() {
            return this.flags.f1421a.size();
        }
    }

    default void onAudioAttributesChanged(EventTime eventTime, C0201g c0201g) {
    }

    default void onAudioCodecError(EventTime eventTime, Exception exc) {
    }

    @Deprecated
    default void onAudioDecoderInitialized(EventTime eventTime, String str, long j) {
    }

    default void onAudioDecoderReleased(EventTime eventTime, String str) {
    }

    default void onAudioDisabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void onAudioEnabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void onAudioInputFormatChanged(EventTime eventTime, C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onAudioPositionAdvancing(EventTime eventTime, long j) {
    }

    default void onAudioSessionIdChanged(EventTime eventTime, int i) {
    }

    default void onAudioSinkError(EventTime eventTime, Exception exc) {
    }

    default void onAudioTrackInitialized(EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void onAudioTrackReleased(EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void onAudioUnderrun(EventTime eventTime, int i, long j, long j8) {
    }

    default void onAvailableCommandsChanged(EventTime eventTime, C0259z0 c0259z0) {
    }

    default void onBandwidthEstimate(EventTime eventTime, int i, long j, long j8) {
    }

    @Deprecated
    default void onCues(EventTime eventTime, List<C1029b> list) {
    }

    default void onDeviceInfoChanged(EventTime eventTime, C0231q c0231q) {
    }

    default void onDeviceVolumeChanged(EventTime eventTime, int i, boolean z7) {
    }

    default void onDownstreamFormatChanged(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    default void onDrmKeysLoaded(EventTime eventTime) {
    }

    default void onDrmKeysRemoved(EventTime eventTime) {
    }

    default void onDrmKeysRestored(EventTime eventTime) {
    }

    @Deprecated
    default void onDrmSessionAcquired(EventTime eventTime) {
    }

    default void onDrmSessionManagerError(EventTime eventTime, Exception exc) {
    }

    default void onDrmSessionReleased(EventTime eventTime) {
    }

    default void onDroppedVideoFrames(EventTime eventTime, int i, long j) {
    }

    default void onEvents(InterfaceC0193d1 interfaceC0193d1, Events events) {
    }

    default void onIsLoadingChanged(EventTime eventTime, boolean z7) {
    }

    default void onIsPlayingChanged(EventTime eventTime, boolean z7) {
    }

    default void onLoadCanceled(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadCompleted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadError(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z7) {
    }

    default void onLoadStarted(EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Deprecated
    default void onLoadingChanged(EventTime eventTime, boolean z7) {
    }

    default void onMaxSeekToPreviousPositionChanged(EventTime eventTime, long j) {
    }

    default void onMediaItemTransition(EventTime eventTime, C0226o0 c0226o0, int i) {
    }

    default void onMediaMetadataChanged(EventTime eventTime, C0235r0 c0235r0) {
    }

    default void onMetadata(EventTime eventTime, C0241t0 c0241t0) {
    }

    default void onPlayWhenReadyChanged(EventTime eventTime, boolean z7, int i) {
    }

    default void onPlaybackParametersChanged(EventTime eventTime, C0256y0 c0256y0) {
    }

    default void onPlaybackStateChanged(EventTime eventTime, int i) {
    }

    default void onPlaybackSuppressionReasonChanged(EventTime eventTime, int i) {
    }

    default void onPlayerError(EventTime eventTime, C0253x0 c0253x0) {
    }

    default void onPlayerErrorChanged(EventTime eventTime, C0253x0 c0253x0) {
    }

    default void onPlayerReleased(EventTime eventTime) {
    }

    @Deprecated
    default void onPlayerStateChanged(EventTime eventTime, boolean z7, int i) {
    }

    default void onPlaylistMetadataChanged(EventTime eventTime, C0235r0 c0235r0) {
    }

    @Deprecated
    default void onPositionDiscontinuity(EventTime eventTime, int i) {
    }

    default void onRenderedFirstFrame(EventTime eventTime, Object obj, long j) {
    }

    default void onRendererReadyChanged(EventTime eventTime, int i, int i4, boolean z7) {
    }

    default void onRepeatModeChanged(EventTime eventTime, int i) {
    }

    default void onSeekBackIncrementChanged(EventTime eventTime, long j) {
    }

    default void onSeekForwardIncrementChanged(EventTime eventTime, long j) {
    }

    @Deprecated
    default void onSeekStarted(EventTime eventTime) {
    }

    default void onShuffleModeChanged(EventTime eventTime, boolean z7) {
    }

    default void onSkipSilenceEnabledChanged(EventTime eventTime, boolean z7) {
    }

    default void onSurfaceSizeChanged(EventTime eventTime, int i, int i4) {
    }

    default void onTimelineChanged(EventTime eventTime, int i) {
    }

    default void onTrackSelectionParametersChanged(EventTime eventTime, C0248v1 c0248v1) {
    }

    default void onTracksChanged(EventTime eventTime, C0254x1 c0254x1) {
    }

    default void onUpstreamDiscarded(EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    default void onVideoCodecError(EventTime eventTime, Exception exc) {
    }

    @Deprecated
    default void onVideoDecoderInitialized(EventTime eventTime, String str, long j) {
    }

    default void onVideoDecoderReleased(EventTime eventTime, String str) {
    }

    default void onVideoDisabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void onVideoEnabled(EventTime eventTime, DecoderCounters decoderCounters) {
    }

    default void onVideoFrameProcessingOffset(EventTime eventTime, long j, int i) {
    }

    default void onVideoInputFormatChanged(EventTime eventTime, C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Deprecated
    default void onVideoSizeChanged(EventTime eventTime, int i, int i4, int i8, float f8) {
    }

    default void onVolumeChanged(EventTime eventTime, float f8) {
    }

    default void onAudioDecoderInitialized(EventTime eventTime, String str, long j, long j8) {
    }

    default void onCues(EventTime eventTime, C1030c c1030c) {
    }

    default void onDrmSessionAcquired(EventTime eventTime, int i) {
    }

    default void onPositionDiscontinuity(EventTime eventTime, C0189c1 c0189c1, C0189c1 c0189c12, int i) {
    }

    default void onVideoDecoderInitialized(EventTime eventTime, String str, long j, long j8) {
    }

    default void onVideoSizeChanged(EventTime eventTime, C0194d2 c0194d2) {
    }
}
