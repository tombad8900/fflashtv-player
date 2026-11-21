package androidx.media3.exoplayer.util;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0171a1;
import androidx.media3.common.C0189c1;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0216l;
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
import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;
import java.util.Locale;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p056g1.C1030c;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class DebugTextViewHelper {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final ExoPlayer player;
    private boolean started;
    private final TextView textView;
    private final Updater updater;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class Updater implements InterfaceC0185b1, Runnable {
        private Updater() {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(C0201g c0201g) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(C0259z0 c0259z0) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onCues(C1030c c1030c) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(C0231q c0231q) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z7) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onEvents(InterfaceC0193d1 interfaceC0193d1, C0171a1 c0171a1) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z7) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z7) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z7) {
        }

        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onMediaItemTransition(C0226o0 c0226o0, int i) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(C0235r0 c0235r0) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onMetadata(C0241t0 c0241t0) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public void onPlayWhenReadyChanged(boolean z7, int i) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(C0256y0 c0256y0) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public void onPlaybackStateChanged(int i) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onPlayerError(C0253x0 c0253x0) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(C0253x0 c0253x0) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z7, int i) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(C0235r0 c0235r0) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
        }

        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
        }

        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z7) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z7) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i4) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onTimelineChanged(AbstractC0230p1 abstractC0230p1, int i) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(C0248v1 c0248v1) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onTracksChanged(C0254x1 c0254x1) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(C0194d2 c0194d2) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public /* bridge */ /* synthetic */ void onVolumeChanged(float f8) {
        }

        @Override // java.lang.Runnable
        public void run() {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        @Deprecated
        public /* bridge */ /* synthetic */ void onCues(List list) {
        }

        @Override // androidx.media3.common.InterfaceC0185b1
        public void onPositionDiscontinuity(C0189c1 c0189c1, C0189c1 c0189c12, int i) {
            DebugTextViewHelper.this.updateAndPost();
        }
    }

    public DebugTextViewHelper(ExoPlayer exoPlayer, TextView textView) {
        AbstractC1101a.m2353d(exoPlayer.getApplicationLooper() == Looper.getMainLooper());
        this.player = exoPlayer;
        this.textView = textView;
        this.updater = new Updater();
    }

    private static String getColorInfoString(C0216l c0216l) {
        if (c0216l == null) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
        if ((c0216l.f1189e == -1 || c0216l.f1190f == -1) && !c0216l.m634d()) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
        return " colr:" + c0216l.m635h();
    }

    private static String getDecoderCountersBufferCountString(DecoderCounters decoderCounters) {
        if (decoderCounters == null) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
        decoderCounters.ensureUpdated();
        return " sib:" + decoderCounters.skippedInputBufferCount + " sb:" + decoderCounters.skippedOutputBufferCount + " rb:" + decoderCounters.renderedOutputBufferCount + " db:" + decoderCounters.droppedBufferCount + " mcdb:" + decoderCounters.maxConsecutiveDroppedBufferCount + " dk:" + decoderCounters.droppedToKeyframeCount;
    }

    private static String getPixelAspectRatioString(float f8) {
        return (f8 == -1.0f || f8 == 1.0f) ? C2181z.FRAGMENT_ENCODE_SET : " par:".concat(String.format(Locale.US, "%.02f", Float.valueOf(f8)));
    }

    private static String getVideoFrameProcessingOffsetAverageString(long j, int i) {
        return i == 0 ? "N/A" : String.valueOf((long) (j / i));
    }

    public String getAudioString() {
        C0249w audioFormat = this.player.getAudioFormat();
        DecoderCounters audioDecoderCounters = this.player.getAudioDecoderCounters();
        if (audioFormat == null || audioDecoderCounters == null) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder("\n");
        sb.append(audioFormat.f1522n);
        sb.append("(id:");
        sb.append(audioFormat.f1509a);
        sb.append(" hz:");
        sb.append(audioFormat.f1499D);
        sb.append(" ch:");
        sb.append(audioFormat.f1498C);
        return AbstractC0008a1.m18n(sb, getDecoderCountersBufferCountString(audioDecoderCounters), ")");
    }

    public String getDebugString() {
        return getPlayerStateString() + getVideoString() + getAudioString();
    }

    public String getPlayerStateString() {
        int playbackState = this.player.getPlaybackState();
        String str = playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : "ended" : "ready" : "buffering" : "idle";
        return "playWhenReady:" + this.player.getPlayWhenReady() + " playbackState:" + str + " item:" + this.player.getCurrentMediaItemIndex();
    }

    public String getVideoString() {
        C0249w videoFormat = this.player.getVideoFormat();
        C0194d2 videoSize = this.player.getVideoSize();
        DecoderCounters videoDecoderCounters = this.player.getVideoDecoderCounters();
        if (videoFormat == null || videoDecoderCounters == null) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder("\n");
        sb.append(videoFormat.f1522n);
        sb.append("(id:");
        sb.append(videoFormat.f1509a);
        sb.append(" r:");
        sb.append(videoSize.f1086a);
        sb.append("x");
        sb.append(videoSize.f1087b);
        sb.append(getColorInfoString(videoFormat.f1497B));
        sb.append(getPixelAspectRatioString(videoSize.f1088c));
        sb.append(getDecoderCountersBufferCountString(videoDecoderCounters));
        sb.append(" vfpo: ");
        return AbstractC0008a1.m18n(sb, getVideoFrameProcessingOffsetAverageString(videoDecoderCounters.totalVideoFrameProcessingOffsetUs, videoDecoderCounters.videoFrameProcessingOffsetCount), ")");
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        this.player.addListener(this.updater);
        updateAndPost();
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            this.player.removeListener(this.updater);
            this.textView.removeCallbacks(this.updater);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this.updater);
        this.textView.postDelayed(this.updater, 1000L);
    }
}
