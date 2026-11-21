package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0171a1;
import androidx.media3.common.C0189c1;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0231q;
import androidx.media3.common.C0235r0;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0248v1;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0253x0;
import androidx.media3.common.C0254x1;
import androidx.media3.common.C0256y0;
import androidx.media3.common.C0259z0;
import androidx.media3.common.InterfaceC0185b1;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;
import p056g1.C1030c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface AnalyticsCollector extends InterfaceC0185b1, MediaSourceEventListener, BandwidthMeter.EventListener, DrmSessionEventListener {
    void addListener(AnalyticsListener analyticsListener);

    void notifySeekStarted();

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onAudioAttributesChanged(C0201g c0201g) {
    }

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j, long j8);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long j);

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onAudioSessionIdChanged(int i) {
    }

    void onAudioSinkError(Exception exc);

    void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioUnderrun(int i, long j, long j8);

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onAvailableCommandsChanged(C0259z0 c0259z0) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onCues(C1030c c1030c) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onDeviceInfoChanged(C0231q c0231q) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onDeviceVolumeChanged(int i, boolean z7) {
    }

    void onDroppedFrames(int i, long j);

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onEvents(InterfaceC0193d1 interfaceC0193d1, C0171a1 c0171a1) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onIsLoadingChanged(boolean z7) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onIsPlayingChanged(boolean z7) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    @Deprecated
    /* bridge */ /* synthetic */ default void onLoadingChanged(boolean z7) {
    }

    /* bridge */ /* synthetic */ default void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onMediaItemTransition(C0226o0 c0226o0, int i) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onMediaMetadataChanged(C0235r0 c0235r0) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onMetadata(C0241t0 c0241t0) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onPlayWhenReadyChanged(boolean z7, int i) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onPlaybackParametersChanged(C0256y0 c0256y0) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onPlaybackStateChanged(int i) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onPlayerError(C0253x0 c0253x0) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onPlayerErrorChanged(C0253x0 c0253x0) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    @Deprecated
    /* bridge */ /* synthetic */ default void onPlayerStateChanged(boolean z7, int i) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onPlaylistMetadataChanged(C0235r0 c0235r0) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    @Deprecated
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(int i) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onRenderedFirstFrame() {
    }

    void onRenderedFirstFrame(Object obj, long j);

    void onRendererReadyChanged(int i, int i4, boolean z7);

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onRepeatModeChanged(int i) {
    }

    /* bridge */ /* synthetic */ default void onSeekBackIncrementChanged(long j) {
    }

    /* bridge */ /* synthetic */ default void onSeekForwardIncrementChanged(long j) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onShuffleModeEnabledChanged(boolean z7) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onSkipSilenceEnabledChanged(boolean z7) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onSurfaceSizeChanged(int i, int i4) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onTimelineChanged(AbstractC0230p1 abstractC0230p1, int i) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onTrackSelectionParametersChanged(C0248v1 c0248v1) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onTracksChanged(C0254x1 c0254x1) {
    }

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j, long j8);

    void onVideoDecoderReleased(String str);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoFrameProcessingOffset(long j, int i);

    void onVideoInputFormatChanged(C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation);

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onVideoSizeChanged(C0194d2 c0194d2) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onVolumeChanged(float f8) {
    }

    void release();

    void removeListener(AnalyticsListener analyticsListener);

    void setPlayer(InterfaceC0193d1 interfaceC0193d1, Looper looper);

    void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> list, MediaSource.MediaPeriodId mediaPeriodId);

    @Override // androidx.media3.common.InterfaceC0185b1
    @Deprecated
    /* bridge */ /* synthetic */ default void onCues(List list) {
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(C0189c1 c0189c1, C0189c1 c0189c12, int i) {
    }
}
