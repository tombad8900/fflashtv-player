package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0204h;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0256y0;
import androidx.media3.common.audio.C0173a;
import androidx.media3.common.audio.C0174b;
import androidx.media3.common.audio.C0175c;
import androidx.media3.common.audio.C0181i;
import androidx.media3.common.audio.C0182j;
import androidx.media3.common.audio.InterfaceC0176d;
import androidx.media3.common.audio.InterfaceC0177e;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.AudioTrackPositionTracker;
import androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p002a1.AbstractC0008a1;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0974j0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p063h1.InterfaceC1103b;
import p063h1.ThreadFactoryC1114g0;
import p115n1.AbstractC1965b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {
    private static final int AUDIO_TRACK_SMALLER_BUFFER_RETRY_SIZE = 1000000;
    private static final int AUDIO_TRACK_VOLUME_RAMP_TIME_MS = 20;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    private static final int ERROR_NATIVE_DEAD_OBJECT = -32;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    private static final int MINIMUM_REPORT_SKIPPED_SILENCE_DURATION_US = 300000;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OUTPUT_MODE_OFFLOAD = 1;
    public static final int OUTPUT_MODE_PASSTHROUGH = 2;
    public static final int OUTPUT_MODE_PCM = 0;
    private static final int REPORT_SKIPPED_SILENCE_DELAY_MS = 100;
    private static final String TAG = "DefaultAudioSink";
    public static boolean failOnSpuriousAudioTimestamp;
    private static int pendingReleaseCount;
    private static ScheduledExecutorService releaseExecutor;
    private static final Object releaseExecutorLock = new Object();
    private long accumulatedSkippedSilenceDurationUs;
    private MediaPositionParameters afterDrainParameters;
    private C0201g audioAttributes;
    private AudioCapabilities audioCapabilities;
    private AudioCapabilitiesReceiver audioCapabilitiesReceiver;
    private final ExoPlayer.AudioOffloadListener audioOffloadListener;
    private final AudioOffloadSupportProvider audioOffloadSupportProvider;
    private C0173a audioProcessingPipeline;
    private final InterfaceC0177e audioProcessorChain;
    private int audioSessionId;
    private AudioTrack audioTrack;
    private final AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
    private final AudioTrackPositionTracker audioTrackPositionTracker;
    private final AudioTrackProvider audioTrackProvider;
    private C0204h auxEffectInfo;
    private ByteBuffer avSyncHeader;
    private int bytesUntilNextAvSync;
    private final ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private Configuration configuration;
    private final Context context;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private boolean handledOffloadOnPresentationEnded;
    private final PendingExceptionHolder<AudioSink.InitializationException> initializationExceptionPendingExceptionHolder;
    private ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;
    private long lastTunnelingAvSyncPresentationTimeUs;
    private AudioSink.Listener listener;
    private MediaPositionParameters mediaPositionParameters;
    private final ArrayDeque<MediaPositionParameters> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private int offloadMode;
    private StreamEventCallbackV29 offloadStreamEventCallbackV29;
    private OnRoutingChangedListenerApi24 onRoutingChangedListener;
    private ByteBuffer outputBuffer;
    private Configuration pendingConfiguration;
    private Looper playbackLooper;
    private C0256y0 playbackParameters;
    private PlayerId playerId;
    private boolean playing;
    private final boolean preferAudioTrackPlaybackParams;
    private AudioDeviceInfoApi23 preferredDevice;
    private Handler reportSkippedSilenceHandler;
    private boolean skipSilenceEnabled;
    private long skippedOutputFrameCountAtLastPosition;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioTrack;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final AbstractC0983m0 toFloatPcmAvailableAudioProcessors;
    private final AbstractC0983m0 toIntPcmAvailableAudioProcessors;
    private final TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private final PendingExceptionHolder<AudioSink.WriteException> writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Api23 {
        private Api23() {
        }

        public static void setPreferredDeviceOnAudioTrack(AudioTrack audioTrack, AudioDeviceInfoApi23 audioDeviceInfoApi23) {
            audioTrack.setPreferredDevice(audioDeviceInfoApi23 == null ? null : audioDeviceInfoApi23.audioDeviceInfo);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdOnAudioTrack(AudioTrack audioTrack, PlayerId playerId) {
            LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionId);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface AudioOffloadSupportProvider {
        AudioOffloadSupport getAudioOffloadSupport(C0249w c0249w, C0201g c0201g);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Deprecated
    public interface AudioProcessorChain extends InterfaceC0177e {
        @Override // androidx.media3.common.audio.InterfaceC0177e
        /* synthetic */ C0256y0 applyPlaybackParameters(C0256y0 c0256y0);

        @Override // androidx.media3.common.audio.InterfaceC0177e
        /* synthetic */ boolean applySkipSilenceEnabled(boolean z7);

        @Override // androidx.media3.common.audio.InterfaceC0177e
        /* synthetic */ InterfaceC0176d[] getAudioProcessors();

        @Override // androidx.media3.common.audio.InterfaceC0177e
        /* synthetic */ long getMediaDuration(long j);

        @Override // androidx.media3.common.audio.InterfaceC0177e
        /* synthetic */ long getSkippedOutputFrameCount();
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface AudioTrackBufferSizeProvider {
        public static final AudioTrackBufferSizeProvider DEFAULT = new DefaultAudioTrackBufferSizeProvider.Builder().build();

        int getBufferSizeInBytes(int i, int i4, int i8, int i9, int i10, int i11, double d8);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface AudioTrackProvider {
        public static final AudioTrackProvider DEFAULT = new DefaultAudioTrackProvider();

        AudioTrack getAudioTrack(AudioSink.AudioTrackConfig audioTrackConfig, C0201g c0201g, int i);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Configuration {
        public final C0173a audioProcessingPipeline;
        public final int bufferSize;
        public final boolean enableAudioTrackPlaybackParams;
        public final boolean enableOffloadGapless;
        public final C0249w inputFormat;
        public final int inputPcmFrameSize;
        public final int outputChannelConfig;
        public final int outputEncoding;
        public final int outputMode;
        public final int outputPcmFrameSize;
        public final int outputSampleRate;
        public final boolean tunneling;

        public Configuration(C0249w c0249w, int i, int i4, int i8, int i9, int i10, int i11, int i12, C0173a c0173a, boolean z7, boolean z8, boolean z9) {
            this.inputFormat = c0249w;
            this.inputPcmFrameSize = i;
            this.outputMode = i4;
            this.outputPcmFrameSize = i8;
            this.outputSampleRate = i9;
            this.outputChannelConfig = i10;
            this.outputEncoding = i11;
            this.bufferSize = i12;
            this.audioProcessingPipeline = c0173a;
            this.enableAudioTrackPlaybackParams = z7;
            this.enableOffloadGapless = z8;
            this.tunneling = z9;
        }

        public AudioSink.AudioTrackConfig buildAudioTrackConfig() {
            return new AudioSink.AudioTrackConfig(this.outputEncoding, this.outputSampleRate, this.outputChannelConfig, this.tunneling, this.outputMode == 1, this.bufferSize);
        }

        public boolean canReuseAudioTrack(Configuration configuration) {
            return configuration.outputMode == this.outputMode && configuration.outputEncoding == this.outputEncoding && configuration.outputSampleRate == this.outputSampleRate && configuration.outputChannelConfig == this.outputChannelConfig && configuration.outputPcmFrameSize == this.outputPcmFrameSize && configuration.enableAudioTrackPlaybackParams == this.enableAudioTrackPlaybackParams && configuration.enableOffloadGapless == this.enableOffloadGapless;
        }

        public Configuration copyWithBufferSize(int i) {
            return new Configuration(this.inputFormat, this.inputPcmFrameSize, this.outputMode, this.outputPcmFrameSize, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, i, this.audioProcessingPipeline, this.enableAudioTrackPlaybackParams, this.enableOffloadGapless, this.tunneling);
        }

        public long framesToDurationUs(long j) {
            return AbstractC1118i0.m2434Y(this.outputSampleRate, j);
        }

        public long inputFramesToDurationUs(long j) {
            return AbstractC1118i0.m2434Y(this.inputFormat.f1499D, j);
        }

        public boolean outputModeIsOffload() {
            return this.outputMode == 1;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final InterfaceC0176d[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final C0181i sonicAudioProcessor;

        public DefaultAudioProcessorChain(InterfaceC0176d... interfaceC0176dArr) {
            this(interfaceC0176dArr, new SilenceSkippingAudioProcessor(), new C0181i());
        }

        @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioProcessorChain, androidx.media3.common.audio.InterfaceC0177e
        public C0256y0 applyPlaybackParameters(C0256y0 c0256y0) {
            this.sonicAudioProcessor.setSpeed(c0256y0.f1549a);
            this.sonicAudioProcessor.setPitch(c0256y0.f1550b);
            return c0256y0;
        }

        @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioProcessorChain, androidx.media3.common.audio.InterfaceC0177e
        public boolean applySkipSilenceEnabled(boolean z7) {
            this.silenceSkippingAudioProcessor.setEnabled(z7);
            return z7;
        }

        @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioProcessorChain, androidx.media3.common.audio.InterfaceC0177e
        public InterfaceC0176d[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioProcessorChain, androidx.media3.common.audio.InterfaceC0177e
        public long getMediaDuration(long j) {
            return this.sonicAudioProcessor.isActive() ? this.sonicAudioProcessor.getMediaDuration(j) : j;
        }

        @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioProcessorChain, androidx.media3.common.audio.InterfaceC0177e
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }

        public DefaultAudioProcessorChain(InterfaceC0176d[] interfaceC0176dArr, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, C0181i c0181i) {
            InterfaceC0176d[] interfaceC0176dArr2 = new InterfaceC0176d[interfaceC0176dArr.length + 2];
            this.audioProcessors = interfaceC0176dArr2;
            System.arraycopy(interfaceC0176dArr, 0, interfaceC0176dArr2, 0, interfaceC0176dArr.length);
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            this.sonicAudioProcessor = c0181i;
            interfaceC0176dArr2[interfaceC0176dArr.length] = silenceSkippingAudioProcessor;
            interfaceC0176dArr2[interfaceC0176dArr.length + 1] = c0181i;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class MediaPositionParameters {
        public final long audioTrackPositionUs;
        public long mediaPositionDriftUs;
        public final long mediaTimeUs;
        public final C0256y0 playbackParameters;

        private MediaPositionParameters(C0256y0 c0256y0, long j, long j8) {
            this.playbackParameters = c0256y0;
            this.mediaTimeUs = j;
            this.audioTrackPositionUs = j8;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class OnRoutingChangedListenerApi24 {
        private final AudioTrack audioTrack;
        private final AudioCapabilitiesReceiver capabilitiesReceiver;
        private AudioRouting.OnRoutingChangedListener listener = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.m
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f1689a.onRoutingChanged(audioRouting);
            }
        };

        public OnRoutingChangedListenerApi24(AudioTrack audioTrack, AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
            this.audioTrack = audioTrack;
            this.capabilitiesReceiver = audioCapabilitiesReceiver;
            audioTrack.addOnRoutingChangedListener(this.listener, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onRoutingChanged(AudioRouting audioRouting) {
            if (this.listener == null || audioRouting.getRoutedDevice() == null) {
                return;
            }
            this.capabilitiesReceiver.setRoutedDevice(audioRouting.getRoutedDevice());
        }

        public void release() {
            AudioTrack audioTrack = this.audioTrack;
            AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.listener;
            onRoutingChangedListener.getClass();
            audioTrack.removeOnRoutingChangedListener(onRoutingChangedListener);
            this.listener = null;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class PendingExceptionHolder<T extends Exception> {
        private static final int RETRY_DELAY_MS = 50;
        private static final int RETRY_DURATION_MS = 200;
        private T pendingException;
        private long throwDeadlineMs = -9223372036854775807L;
        private long earliestNextRetryTimeMs = -9223372036854775807L;

        public void clear() {
            this.pendingException = null;
            this.throwDeadlineMs = -9223372036854775807L;
            this.earliestNextRetryTimeMs = -9223372036854775807L;
        }

        public boolean shouldWaitBeforeRetry() {
            if (this.pendingException == null) {
                return false;
            }
            return DefaultAudioSink.hasPendingAudioTrackReleases() || SystemClock.elapsedRealtime() < this.earliestNextRetryTimeMs;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void throwExceptionIfDeadlineIsReached(T t8) throws T {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.pendingException == null) {
                this.pendingException = t8;
            }
            if (this.throwDeadlineMs == -9223372036854775807L && !DefaultAudioSink.hasPendingAudioTrackReleases()) {
                this.throwDeadlineMs = 200 + jElapsedRealtime;
            }
            long j = this.throwDeadlineMs;
            if (j == -9223372036854775807L || jElapsedRealtime < j) {
                this.earliestNextRetryTimeMs = jElapsedRealtime + 50;
                return;
            }
            T t9 = this.pendingException;
            if (t9 != t8) {
                t9.addSuppressed(t8);
            }
            T t10 = this.pendingException;
            clear();
            throw t10;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        private PositionTrackerListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long j) {
            AbstractC1101a.m2348F(DefaultAudioSink.TAG, "Ignoring impossibly large audio latency: " + j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(long j) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onPositionAdvancing(j);
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long j, long j8, long j9, long j10) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j8 + ", " + j9 + ", " + j10 + ", " + DefaultAudioSink.this.getSubmittedFrames() + ", " + DefaultAudioSink.this.getWrittenFrames();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            AbstractC1101a.m2348F(DefaultAudioSink.TAG, str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long j, long j8, long j9, long j10) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j8 + ", " + j9 + ", " + j10 + ", " + DefaultAudioSink.this.getSubmittedFrames() + ", " + DefaultAudioSink.this.getWrittenFrames();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            AbstractC1101a.m2348F(DefaultAudioSink.TAG, str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onUnderrun(int i, long j) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onUnderrun(i, j, SystemClock.elapsedRealtime() - DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class StreamEventCallbackV29 {
        private final AudioTrack$StreamEventCallback callback;
        private final Handler handler = new Handler(Looper.myLooper());

        public StreamEventCallbackV29() {
            this.callback = new AudioTrack$StreamEventCallback() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink.StreamEventCallbackV29.1
                public void onDataRequest(AudioTrack audioTrack, int i) {
                    if (audioTrack.equals(DefaultAudioSink.this.audioTrack) && DefaultAudioSink.this.listener != null && DefaultAudioSink.this.playing) {
                        DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                    }
                }

                public void onPresentationEnded(AudioTrack audioTrack) {
                    if (audioTrack.equals(DefaultAudioSink.this.audioTrack)) {
                        DefaultAudioSink.this.handledOffloadOnPresentationEnded = true;
                    }
                }

                public void onTearDown(AudioTrack audioTrack) {
                    if (audioTrack.equals(DefaultAudioSink.this.audioTrack) && DefaultAudioSink.this.listener != null && DefaultAudioSink.this.playing) {
                        DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                    }
                }
            };
        }

        public void register(AudioTrack audioTrack) {
            Handler handler = this.handler;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC0325n(handler), this.callback);
        }

        public void unregister(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.callback);
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j) {
        C0256y0 c0256y0ApplyPlaybackParameters;
        if (useAudioTrackPlaybackParams()) {
            c0256y0ApplyPlaybackParameters = C0256y0.f1548d;
        } else {
            c0256y0ApplyPlaybackParameters = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applyPlaybackParameters(this.playbackParameters) : C0256y0.f1548d;
            this.playbackParameters = c0256y0ApplyPlaybackParameters;
        }
        C0256y0 c0256y0 = c0256y0ApplyPlaybackParameters;
        this.skipSilenceEnabled = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applySkipSilenceEnabled(this.skipSilenceEnabled) : false;
        this.mediaPositionParametersCheckpoints.add(new MediaPositionParameters(c0256y0, Math.max(0L, j), this.configuration.framesToDurationUs(getWrittenFrames())));
        setupAudioProcessors();
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(this.skipSilenceEnabled);
        }
    }

    private long applyMediaPositionParameters(long j) {
        while (!this.mediaPositionParametersCheckpoints.isEmpty() && j >= this.mediaPositionParametersCheckpoints.getFirst().audioTrackPositionUs) {
            this.mediaPositionParameters = this.mediaPositionParametersCheckpoints.remove();
        }
        MediaPositionParameters mediaPositionParameters = this.mediaPositionParameters;
        long j8 = j - mediaPositionParameters.audioTrackPositionUs;
        long jM2411B = AbstractC1118i0.m2411B(j8, mediaPositionParameters.playbackParameters.f1549a);
        if (!this.mediaPositionParametersCheckpoints.isEmpty()) {
            MediaPositionParameters mediaPositionParameters2 = this.mediaPositionParameters;
            return mediaPositionParameters2.mediaTimeUs + jM2411B + mediaPositionParameters2.mediaPositionDriftUs;
        }
        long mediaDuration = this.audioProcessorChain.getMediaDuration(j8);
        MediaPositionParameters mediaPositionParameters3 = this.mediaPositionParameters;
        long j9 = mediaPositionParameters3.mediaTimeUs + mediaDuration;
        mediaPositionParameters3.mediaPositionDriftUs = mediaDuration - jM2411B;
        return j9;
    }

    private long applySkipping(long j) {
        long skippedOutputFrameCount = this.audioProcessorChain.getSkippedOutputFrameCount();
        long jFramesToDurationUs = j + this.configuration.framesToDurationUs(skippedOutputFrameCount);
        long j8 = this.skippedOutputFrameCountAtLastPosition;
        if (skippedOutputFrameCount > j8) {
            long jFramesToDurationUs2 = this.configuration.framesToDurationUs(skippedOutputFrameCount - j8);
            this.skippedOutputFrameCountAtLastPosition = skippedOutputFrameCount;
            handleSkippedSilence(jFramesToDurationUs2);
        }
        return jFramesToDurationUs;
    }

    private AudioTrack buildAudioTrack(Configuration configuration) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackBuildAudioTrack = buildAudioTrack(configuration.buildAudioTrackConfig(), this.audioAttributes, this.audioSessionId, configuration.inputFormat);
            ExoPlayer.AudioOffloadListener audioOffloadListener = this.audioOffloadListener;
            if (audioOffloadListener == null) {
                return audioTrackBuildAudioTrack;
            }
            audioOffloadListener.onOffloadedPlayback(isOffloadedPlayback(audioTrackBuildAudioTrack));
            return audioTrackBuildAudioTrack;
        } catch (AudioSink.InitializationException e) {
            AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioSinkError(e);
            }
            throw e;
        }
    }

    private AudioTrack buildAudioTrackWithRetry() throws AudioSink.InitializationException {
        try {
            Configuration configuration = this.configuration;
            configuration.getClass();
            return buildAudioTrack(configuration);
        } catch (AudioSink.InitializationException e) {
            Configuration configuration2 = this.configuration;
            if (configuration2.bufferSize > 1000000) {
                Configuration configurationCopyWithBufferSize = configuration2.copyWithBufferSize(1000000);
                try {
                    AudioTrack audioTrackBuildAudioTrack = buildAudioTrack(configurationCopyWithBufferSize);
                    this.configuration = configurationCopyWithBufferSize;
                    return audioTrackBuildAudioTrack;
                } catch (AudioSink.InitializationException e8) {
                    e.addSuppressed(e8);
                    maybeDisableOffload();
                    throw e;
                }
            }
            maybeDisableOffload();
            throw e;
        }
    }

    private void drainOutputBuffer(long j) throws T, AudioSink.WriteException {
        DefaultAudioSink defaultAudioSink;
        int iWriteNonBlocking;
        AudioSink.Listener listener;
        if (this.outputBuffer == null || this.writeExceptionPendingExceptionHolder.shouldWaitBeforeRetry()) {
            return;
        }
        int iRemaining = this.outputBuffer.remaining();
        if (this.tunneling) {
            AbstractC1101a.m2359j(j != -9223372036854775807L);
            if (j == Long.MIN_VALUE) {
                j = this.lastTunnelingAvSyncPresentationTimeUs;
            } else {
                this.lastTunnelingAvSyncPresentationTimeUs = j;
            }
            defaultAudioSink = this;
            iWriteNonBlocking = defaultAudioSink.writeNonBlockingWithAvSync(this.audioTrack, this.outputBuffer, iRemaining, j);
        } else {
            defaultAudioSink = this;
            iWriteNonBlocking = writeNonBlocking(defaultAudioSink.audioTrack, defaultAudioSink.outputBuffer, iRemaining);
        }
        defaultAudioSink.lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
        if (iWriteNonBlocking < 0) {
            if (isAudioTrackDeadObject(iWriteNonBlocking)) {
                if (getWrittenFrames() > 0) {
                    z = true;
                } else if (isOffloadedPlayback(defaultAudioSink.audioTrack)) {
                    maybeDisableOffload();
                    z = true;
                }
            }
            AudioSink.WriteException writeException = new AudioSink.WriteException(iWriteNonBlocking, defaultAudioSink.configuration.inputFormat, z);
            AudioSink.Listener listener2 = defaultAudioSink.listener;
            if (listener2 != null) {
                listener2.onAudioSinkError(writeException);
            }
            if (writeException.isRecoverable) {
                defaultAudioSink.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
                throw writeException;
            }
            defaultAudioSink.writeExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(writeException);
            return;
        }
        defaultAudioSink.writeExceptionPendingExceptionHolder.clear();
        if (isOffloadedPlayback(defaultAudioSink.audioTrack)) {
            if (defaultAudioSink.writtenEncodedFrames > 0) {
                defaultAudioSink.isWaitingForOffloadEndOfStreamHandled = false;
            }
            if (defaultAudioSink.playing && (listener = defaultAudioSink.listener) != null && iWriteNonBlocking < iRemaining && !defaultAudioSink.isWaitingForOffloadEndOfStreamHandled) {
                listener.onOffloadBufferFull();
            }
        }
        int i = defaultAudioSink.configuration.outputMode;
        if (i == 0) {
            defaultAudioSink.writtenPcmBytes += iWriteNonBlocking;
        }
        if (iWriteNonBlocking == iRemaining) {
            if (i != 0) {
                AbstractC1101a.m2359j(defaultAudioSink.outputBuffer == defaultAudioSink.inputBuffer);
                defaultAudioSink.writtenEncodedFrames = (defaultAudioSink.framesPerEncodedSample * defaultAudioSink.inputBufferAccessUnitCount) + defaultAudioSink.writtenEncodedFrames;
            }
            defaultAudioSink.outputBuffer = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean drainToEndOfStream() throws T, AudioSink.WriteException {
        ByteBuffer byteBuffer;
        if (!this.audioProcessingPipeline.m596c()) {
            drainOutputBuffer(Long.MIN_VALUE);
            return this.outputBuffer == null;
        }
        C0173a c0173a = this.audioProcessingPipeline;
        if (c0173a.m596c() && !c0173a.f979d) {
            c0173a.f979d = true;
            ((InterfaceC0176d) c0173a.f977b.get(0)).queueEndOfStream();
        }
        processBuffers(Long.MIN_VALUE);
        if (!this.audioProcessingPipeline.m595b() || ((byteBuffer = this.outputBuffer) != null && byteBuffer.hasRemaining())) {
        }
    }

    private static int getAudioTrackMinBufferSize(int i, int i4, int i8) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i4, i8);
        AbstractC1101a.m2359j(minBufferSize != -2);
        return minBufferSize;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getFramesPerEncodedSample(int i, ByteBuffer byteBuffer) {
        int i4;
        int i8;
        byte b7;
        int i9;
        byte b8;
        int i10;
        int i11;
        int i12;
        int i13;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i4 = 0;
            } else {
                byte b9 = byteBuffer.get(26);
                int i14 = 28;
                int i15 = 28;
                for (int i16 = 0; i16 < b9; i16++) {
                    i15 += byteBuffer.get(i16 + 27);
                }
                byte b10 = byteBuffer.get(i15 + 26);
                for (int i17 = 0; i17 < b10; i17++) {
                    i14 += byteBuffer.get(i15 + 27 + i17);
                }
                i4 = i15 + i14;
            }
            int i18 = byteBuffer.get(i4 + 26) + 27 + i4;
            return (int) ((AbstractC1965b.m3835k(byteBuffer.get(i18), byteBuffer.limit() - i18 > 1 ? byteBuffer.get(i18 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    int i19 = AbstractC1118i0.f4750a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    if ((iReverseBytes & (-2097152)) != -2097152 || (i11 = (iReverseBytes >>> 19) & 3) == 1 || (i12 = (iReverseBytes >>> 17) & 3) == 0) {
                        i10 = -1;
                    } else {
                        int i20 = (iReverseBytes >>> 12) & 15;
                        int i21 = (iReverseBytes >>> 10) & 3;
                        if (i20 != 0 && i20 != 15 && i21 != 3) {
                            i10 = 1152;
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 != 3) {
                                        throw new IllegalArgumentException();
                                    }
                                    i10 = RendererCapabilities.DECODER_SUPPORT_MASK;
                                }
                            } else if (i11 != 3) {
                                i10 = 576;
                            }
                        }
                    }
                    if (i10 != -1) {
                        return i10;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int iPosition2 = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i22 = iPosition2;
                            while (true) {
                                if (i22 <= iLimit) {
                                    int i23 = AbstractC1118i0.f4750a;
                                    int iReverseBytes2 = byteBuffer.getInt(i22 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                    }
                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                        i13 = i22 - iPosition2;
                                    } else {
                                        i22++;
                                    }
                                } else {
                                    i13 = -1;
                                }
                            }
                            if (i13 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i13) + (((byteBuffer.get((byteBuffer.position() + i13) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                            byte[] bArr = new byte[16];
                            int iPosition3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition3);
                            return AbstractC1965b.m3837m(new C1131v(bArr, 16)).f2543c;
                        case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                            break;
                        default:
                            throw new IllegalStateException(AbstractC0008a1.m12h(i, "Unexpected audio encoding: "));
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return AbstractC1965b.f7267c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
        }
        int iPosition4 = byteBuffer.position();
        byte b11 = byteBuffer.get(iPosition4);
        if (b11 != -2) {
            if (b11 == -1) {
                i8 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                b8 = byteBuffer.get(iPosition4 + 7);
            } else if (b11 != 31) {
                i8 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                b7 = byteBuffer.get(iPosition4 + 5);
            } else {
                i8 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                b8 = byteBuffer.get(iPosition4 + 6);
            }
            i9 = b8 & 60;
            return (((i9 >> 2) | i8) + 1) * 32;
        }
        i8 = (byteBuffer.get(iPosition4 + 5) & 1) << 6;
        b7 = byteBuffer.get(iPosition4 + 4);
        i9 = b7 & 252;
        return (((i9 >> 2) | i8) + 1) * 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getSubmittedFrames() {
        return this.configuration.outputMode == 0 ? this.submittedPcmBytes / r0.inputPcmFrameSize : this.submittedEncodedFrames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        Configuration configuration = this.configuration;
        if (configuration.outputMode != 0) {
            return this.writtenEncodedFrames;
        }
        long j = this.writtenPcmBytes;
        long j8 = configuration.outputPcmFrameSize;
        int i = AbstractC1118i0.f4750a;
        return ((j + j8) - 1) / j8;
    }

    private void handleSkippedSilence(long j) {
        this.accumulatedSkippedSilenceDurationUs += j;
        if (this.reportSkippedSilenceHandler == null) {
            this.reportSkippedSilenceHandler = new Handler(Looper.myLooper());
        }
        this.reportSkippedSilenceHandler.removeCallbacksAndMessages(null);
        this.reportSkippedSilenceHandler.postDelayed(new Runnable() { // from class: androidx.media3.exoplayer.audio.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f1687j.maybeReportSkippedSilence();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasPendingAudioTrackReleases() {
        boolean z7;
        synchronized (releaseExecutorLock) {
            z7 = pendingReleaseCount > 0;
        }
        return z7;
    }

    private boolean initializeAudioTrack() throws AudioSink.InitializationException {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver;
        PlayerId playerId;
        if (this.initializationExceptionPendingExceptionHolder.shouldWaitBeforeRetry()) {
            return false;
        }
        AudioTrack audioTrackBuildAudioTrackWithRetry = buildAudioTrackWithRetry();
        this.audioTrack = audioTrackBuildAudioTrackWithRetry;
        if (isOffloadedPlayback(audioTrackBuildAudioTrackWithRetry)) {
            registerStreamEventCallbackV29(this.audioTrack);
            Configuration configuration = this.configuration;
            if (configuration.enableOffloadGapless) {
                AudioTrack audioTrack = this.audioTrack;
                C0249w c0249w = configuration.inputFormat;
                audioTrack.setOffloadDelayPadding(c0249w.f1501F, c0249w.f1502G);
            }
        }
        int i = AbstractC1118i0.f4750a;
        if (i >= 31 && (playerId = this.playerId) != null) {
            Api31.setLogSessionIdOnAudioTrack(this.audioTrack, playerId);
        }
        this.audioSessionId = this.audioTrack.getAudioSessionId();
        AudioTrackPositionTracker audioTrackPositionTracker = this.audioTrackPositionTracker;
        AudioTrack audioTrack2 = this.audioTrack;
        Configuration configuration2 = this.configuration;
        audioTrackPositionTracker.setAudioTrack(audioTrack2, configuration2.outputMode == 2, configuration2.outputEncoding, configuration2.outputPcmFrameSize, configuration2.bufferSize);
        setVolumeInternal();
        this.auxEffectInfo.getClass();
        AudioDeviceInfoApi23 audioDeviceInfoApi23 = this.preferredDevice;
        if (audioDeviceInfoApi23 != null && i >= 23) {
            Api23.setPreferredDeviceOnAudioTrack(this.audioTrack, audioDeviceInfoApi23);
            AudioCapabilitiesReceiver audioCapabilitiesReceiver2 = this.audioCapabilitiesReceiver;
            if (audioCapabilitiesReceiver2 != null) {
                audioCapabilitiesReceiver2.setRoutedDevice(this.preferredDevice.audioDeviceInfo);
            }
        }
        if (i >= 24 && (audioCapabilitiesReceiver = this.audioCapabilitiesReceiver) != null) {
            this.onRoutingChangedListener = new OnRoutingChangedListenerApi24(this.audioTrack, audioCapabilitiesReceiver);
        }
        this.startMediaTimeUsNeedsInit = true;
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioTrackInitialized(this.configuration.buildAudioTrackConfig());
        }
        return true;
    }

    private static boolean isAudioTrackDeadObject(int i) {
        return (AbstractC1118i0.f4750a >= 24 && i == -6) || i == ERROR_NATIVE_DEAD_OBJECT;
    }

    private boolean isAudioTrackInitialized() {
        return this.audioTrack != null;
    }

    private static boolean isOffloadedPlayback(AudioTrack audioTrack) {
        return AbstractC1118i0.f4750a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseAudioTrackAsync$1(AudioTrack audioTrack, AudioSink.Listener listener, Handler handler, AudioSink.AudioTrackConfig audioTrackConfig) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (listener != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC0320i(listener, 1, audioTrackConfig));
            }
            synchronized (releaseExecutorLock) {
                try {
                    int i = pendingReleaseCount - 1;
                    pendingReleaseCount = i;
                    if (i == 0) {
                        releaseExecutor.shutdown();
                        releaseExecutor = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (listener != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC0320i(listener, 1, audioTrackConfig));
            }
            synchronized (releaseExecutorLock) {
                try {
                    int i4 = pendingReleaseCount - 1;
                    pendingReleaseCount = i4;
                    if (i4 == 0) {
                        releaseExecutor.shutdown();
                        releaseExecutor = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    private void maybeDisableOffload() {
        if (this.configuration.outputModeIsOffload()) {
            this.offloadDisabledUntilNextConfiguration = true;
        }
    }

    private ByteBuffer maybeRampUpVolume(ByteBuffer byteBuffer) {
        if (this.configuration.outputMode == 0) {
            int iM2437a0 = (int) AbstractC1118i0.m2437a0(AbstractC1118i0.m2428S(20L), this.configuration.outputSampleRate, 1000000L, RoundingMode.UP);
            long writtenFrames = getWrittenFrames();
            if (writtenFrames < iM2437a0) {
                Configuration configuration = this.configuration;
                return PcmAudioUtil.rampUpVolume(byteBuffer, configuration.outputEncoding, configuration.outputPcmFrameSize, (int) writtenFrames, iM2437a0);
            }
        }
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReportSkippedSilence() {
        if (this.accumulatedSkippedSilenceDurationUs >= 300000) {
            this.listener.onSilenceSkipped();
            this.accumulatedSkippedSilenceDurationUs = 0L;
        }
    }

    private void maybeStartAudioCapabilitiesReceiver() {
        if (this.audioCapabilitiesReceiver != null || this.context == null) {
            return;
        }
        this.playbackLooper = Looper.myLooper();
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = new AudioCapabilitiesReceiver(this.context, new AudioCapabilitiesReceiver.Listener() { // from class: androidx.media3.exoplayer.audio.l
            @Override // androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener
            public final void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
                this.f1688a.onAudioCapabilitiesChanged(audioCapabilities);
            }
        }, this.audioAttributes, this.preferredDevice);
        this.audioCapabilitiesReceiver = audioCapabilitiesReceiver;
        this.audioCapabilities = audioCapabilitiesReceiver.register();
    }

    private void playPendingData() throws IllegalStateException {
        if (this.stoppedAudioTrack) {
            return;
        }
        this.stoppedAudioTrack = true;
        this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
        if (isOffloadedPlayback(this.audioTrack)) {
            this.handledOffloadOnPresentationEnded = false;
        }
        this.audioTrack.stop();
        this.bytesUntilNextAvSync = 0;
    }

    private void processBuffers(long j) throws T, AudioSink.WriteException {
        ByteBuffer byteBuffer;
        drainOutputBuffer(j);
        if (this.outputBuffer != null) {
            return;
        }
        if (!this.audioProcessingPipeline.m596c()) {
            ByteBuffer byteBuffer2 = this.inputBuffer;
            if (byteBuffer2 != null) {
                setOutputBuffer(byteBuffer2);
                drainOutputBuffer(j);
                return;
            }
            return;
        }
        while (!this.audioProcessingPipeline.m595b()) {
            do {
                C0173a c0173a = this.audioProcessingPipeline;
                if (c0173a.m596c()) {
                    ByteBuffer byteBuffer3 = c0173a.f978c[c0173a.m594a()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c0173a.m597d(InterfaceC0176d.f985a);
                        byteBuffer = c0173a.f978c[c0173a.m594a()];
                    }
                } else {
                    byteBuffer = InterfaceC0176d.f985a;
                }
                if (byteBuffer.hasRemaining()) {
                    setOutputBuffer(byteBuffer);
                    drainOutputBuffer(j);
                } else {
                    ByteBuffer byteBuffer4 = this.inputBuffer;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C0173a c0173a2 = this.audioProcessingPipeline;
                    ByteBuffer byteBuffer5 = this.inputBuffer;
                    if (c0173a2.m596c() && !c0173a2.f979d) {
                        c0173a2.m597d(byteBuffer5);
                    }
                }
            } while (this.outputBuffer == null);
            return;
        }
    }

    private void registerStreamEventCallbackV29(AudioTrack audioTrack) {
        if (this.offloadStreamEventCallbackV29 == null) {
            this.offloadStreamEventCallbackV29 = new StreamEventCallbackV29();
        }
        this.offloadStreamEventCallbackV29.register(audioTrack);
    }

    private static void releaseAudioTrackAsync(AudioTrack audioTrack, AudioSink.Listener listener, AudioSink.AudioTrackConfig audioTrackConfig) {
        Handler handler = new Handler(Looper.myLooper());
        synchronized (releaseExecutorLock) {
            try {
                if (releaseExecutor == null) {
                    int i = AbstractC1118i0.f4750a;
                    releaseExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC1114g0());
                }
                pendingReleaseCount++;
                releaseExecutor.schedule(new RunnableC0321j(audioTrack, listener, handler, audioTrackConfig, 0), 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void resetSinkStateForFlush() {
        this.submittedPcmBytes = 0L;
        this.submittedEncodedFrames = 0L;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.isWaitingForOffloadEndOfStreamHandled = false;
        this.framesPerEncodedSample = 0;
        this.mediaPositionParameters = new MediaPositionParameters(this.playbackParameters, 0L, 0L);
        this.startMediaTimeUs = 0L;
        this.afterDrainParameters = null;
        this.mediaPositionParametersCheckpoints.clear();
        this.inputBuffer = null;
        this.inputBufferAccessUnitCount = 0;
        this.outputBuffer = null;
        this.stoppedAudioTrack = false;
        this.handledEndOfStream = false;
        this.handledOffloadOnPresentationEnded = false;
        this.avSyncHeader = null;
        this.bytesUntilNextAvSync = 0;
        this.trimmingAudioProcessor.resetTrimmedFrameCount();
        setupAudioProcessors();
    }

    private void setAudioProcessorPlaybackParameters(C0256y0 c0256y0) {
        MediaPositionParameters mediaPositionParameters = new MediaPositionParameters(c0256y0, -9223372036854775807L, -9223372036854775807L);
        if (isAudioTrackInitialized()) {
            this.afterDrainParameters = mediaPositionParameters;
        } else {
            this.mediaPositionParameters = mediaPositionParameters;
        }
    }

    private void setAudioTrackPlaybackParametersV23() {
        if (isAudioTrackInitialized()) {
            try {
                this.audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.playbackParameters.f1549a).setPitch(this.playbackParameters.f1550b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                AbstractC1101a.m2349G(TAG, "Failed to set playback params", e);
            }
            C0256y0 c0256y0 = new C0256y0(this.audioTrack.getPlaybackParams().getSpeed(), this.audioTrack.getPlaybackParams().getPitch());
            this.playbackParameters = c0256y0;
            this.audioTrackPositionTracker.setAudioTrackPlaybackSpeed(c0256y0.f1549a);
        }
    }

    private void setOutputBuffer(ByteBuffer byteBuffer) {
        AbstractC1101a.m2359j(this.outputBuffer == null);
        if (byteBuffer.hasRemaining()) {
            this.outputBuffer = maybeRampUpVolume(byteBuffer);
        }
    }

    private void setVolumeInternal() {
        if (isAudioTrackInitialized()) {
            this.audioTrack.setVolume(this.volume);
        }
    }

    private void setupAudioProcessors() {
        C0173a c0173a = this.configuration.audioProcessingPipeline;
        this.audioProcessingPipeline = c0173a;
        AbstractC0983m0 abstractC0983m0 = c0173a.f976a;
        ArrayList arrayList = c0173a.f977b;
        arrayList.clear();
        c0173a.f979d = false;
        for (int i = 0; i < abstractC0983m0.size(); i++) {
            InterfaceC0176d interfaceC0176d = (InterfaceC0176d) abstractC0983m0.get(i);
            interfaceC0176d.flush();
            if (interfaceC0176d.isActive()) {
                arrayList.add(interfaceC0176d);
            }
        }
        c0173a.f978c = new ByteBuffer[arrayList.size()];
        for (int i4 = 0; i4 <= c0173a.m594a(); i4++) {
            c0173a.f978c[i4] = ((InterfaceC0176d) arrayList.get(i4)).getOutput();
        }
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        if (this.tunneling) {
            return false;
        }
        Configuration configuration = this.configuration;
        return configuration.outputMode == 0 && !shouldUseFloatOutput(configuration.inputFormat.f1500E);
    }

    private boolean shouldUseFloatOutput(int i) {
        if (!this.enableFloatOutput) {
            return false;
        }
        int i4 = AbstractC1118i0.f4750a;
        return i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    private boolean useAudioTrackPlaybackParams() {
        Configuration configuration = this.configuration;
        return configuration != null && configuration.enableAudioTrackPlaybackParams && AbstractC1118i0.f4750a >= 23;
    }

    private static int writeNonBlocking(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int writeNonBlockingWithAvSync(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (AbstractC1118i0.f4750a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.avSyncHeader == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.avSyncHeader = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, i);
            this.avSyncHeader.putLong(8, j * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = i;
        }
        int iRemaining = this.avSyncHeader.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.avSyncHeader, iRemaining, 1);
            if (iWrite < 0) {
                this.bytesUntilNextAvSync = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iWriteNonBlocking = writeNonBlocking(audioTrack, byteBuffer, i);
        if (iWriteNonBlocking < 0) {
            this.bytesUntilNextAvSync = 0;
            return iWriteNonBlocking;
        }
        this.bytesUntilNextAvSync -= iWriteNonBlocking;
        return iWriteNonBlocking;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void configure(C0249w c0249w, int i, int[] iArr) throws C0175c, AudioSink.ConfigurationException {
        C0173a c0173a;
        int iIntValue;
        boolean z7;
        int i4;
        int i8;
        int i9;
        int i10;
        boolean z8;
        int i11;
        int bufferSizeInBytes;
        maybeStartAudioCapabilitiesReceiver();
        String str = c0249w.f1522n;
        int i12 = c0249w.f1499D;
        int i13 = c0249w.f1498C;
        int i14 = c0249w.f1500E;
        if ("audio/raw".equals(str)) {
            AbstractC1101a.m2353d(AbstractC1118i0.m2423N(i14));
            int iM2414E = AbstractC1118i0.m2414E(i14, i13);
            C0974j0 c0974j0 = new C0974j0(4);
            if (shouldUseFloatOutput(i14)) {
                c0974j0.m2143c(this.toFloatPcmAvailableAudioProcessors);
            } else {
                c0974j0.m2143c(this.toIntPcmAvailableAudioProcessors);
                InterfaceC0176d[] audioProcessors = this.audioProcessorChain.getAudioProcessors();
                int length = audioProcessors.length;
                AbstractC1006u.m2187b(length, audioProcessors);
                c0974j0.m2144d(length);
                System.arraycopy(audioProcessors, 0, c0974j0.f4191a, c0974j0.f4192b, length);
                c0974j0.f4192b += length;
            }
            c0173a = new C0173a(c0974j0.m2159f());
            if (c0173a.equals(this.audioProcessingPipeline)) {
                c0173a = this.audioProcessingPipeline;
            }
            this.trimmingAudioProcessor.setTrimFrameCount(c0249w.f1501F, c0249w.f1502G);
            this.channelMappingAudioProcessor.setChannelMap(iArr);
            C0174b c0174b = new C0174b(i12, i13, i14);
            try {
                AbstractC0983m0 abstractC0983m0 = c0173a.f976a;
                if (c0174b.equals(C0174b.f980e)) {
                    throw new C0175c(c0174b);
                }
                for (int i15 = 0; i15 < abstractC0983m0.size(); i15++) {
                    InterfaceC0176d interfaceC0176d = (InterfaceC0176d) abstractC0983m0.get(i15);
                    C0174b c0174bConfigure = interfaceC0176d.configure(c0174b);
                    if (interfaceC0176d.isActive()) {
                        AbstractC1101a.m2359j(!c0174bConfigure.equals(C0174b.f980e));
                        c0174b = c0174bConfigure;
                    }
                }
                int i16 = c0174b.f982b;
                int i17 = c0174b.f983c;
                int i18 = c0174b.f981a;
                iIntValue = AbstractC1118i0.m2462u(i16);
                int iM2414E2 = AbstractC1118i0.m2414E(i17, i16);
                z7 = this.preferAudioTrackPlaybackParams;
                i10 = iM2414E2;
                i12 = i18;
                i9 = iM2414E;
                i8 = i17;
                z8 = false;
                i4 = 0;
            } catch (C0175c e) {
                throw new AudioSink.ConfigurationException(e, c0249w);
            }
        } else {
            c0173a = new C0173a(C0981l1.f4211n);
            AudioOffloadSupport formatOffloadSupport = this.offloadMode != 0 ? getFormatOffloadSupport(c0249w) : AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            if (this.offloadMode == 0 || !formatOffloadSupport.isFormatSupported) {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = this.audioCapabilities.getEncodingAndChannelConfigForPassthrough(c0249w, this.audioAttributes);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + c0249w, c0249w);
                }
                int iIntValue2 = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                iIntValue = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                z7 = this.preferAudioTrackPlaybackParams;
                i4 = 2;
                i8 = iIntValue2;
                i9 = -1;
                i10 = -1;
                z8 = false;
            } else {
                str.getClass();
                int iM675d = AbstractC0244u0.m675d(str, c0249w.f1519k);
                iIntValue = AbstractC1118i0.m2462u(i13);
                z8 = formatOffloadSupport.isGaplessSupported;
                i8 = iM675d;
                z7 = true;
                i4 = 1;
                i9 = -1;
                i10 = -1;
            }
        }
        if (i8 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i4 + ") for: " + c0249w, c0249w);
        }
        if (iIntValue == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i4 + ") for: " + c0249w, c0249w);
        }
        int i19 = c0249w.f1518j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i19 == -1) {
            i19 = 768000;
        }
        int i20 = i19;
        if (i != 0) {
            bufferSizeInBytes = i;
            i11 = i12;
        } else {
            i11 = i12;
            bufferSizeInBytes = this.audioTrackBufferSizeProvider.getBufferSizeInBytes(getAudioTrackMinBufferSize(i12, iIntValue, i8), i8, i4, i10 != -1 ? i10 : 1, i11, i20, z7 ? 8.0d : 1.0d);
        }
        this.offloadDisabledUntilNextConfiguration = false;
        Configuration configuration = new Configuration(c0249w, i9, i4, i10, i11, iIntValue, i8, bufferSizeInBytes, c0173a, z7, z8, this.tunneling);
        if (isAudioTrackInitialized()) {
            this.pendingConfiguration = configuration;
        } else {
            this.configuration = configuration;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void disableTunneling() throws IllegalStateException {
        if (this.tunneling) {
            this.tunneling = false;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() throws IllegalStateException {
        AbstractC1101a.m2359j(this.externalAudioSessionIdProvided);
        if (this.tunneling) {
            return;
        }
        this.tunneling = true;
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() throws IllegalStateException {
        OnRoutingChangedListenerApi24 onRoutingChangedListenerApi24;
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            if (isOffloadedPlayback(this.audioTrack)) {
                StreamEventCallbackV29 streamEventCallbackV29 = this.offloadStreamEventCallbackV29;
                streamEventCallbackV29.getClass();
                streamEventCallbackV29.unregister(this.audioTrack);
            }
            AudioSink.AudioTrackConfig audioTrackConfigBuildAudioTrackConfig = this.configuration.buildAudioTrackConfig();
            Configuration configuration = this.pendingConfiguration;
            if (configuration != null) {
                this.configuration = configuration;
                this.pendingConfiguration = null;
            }
            this.audioTrackPositionTracker.reset();
            if (AbstractC1118i0.f4750a >= 24 && (onRoutingChangedListenerApi24 = this.onRoutingChangedListener) != null) {
                onRoutingChangedListenerApi24.release();
                this.onRoutingChangedListener = null;
            }
            releaseAudioTrackAsync(this.audioTrack, this.listener, audioTrackConfigBuildAudioTrackConfig);
            this.audioTrack = null;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
        this.skippedOutputFrameCountAtLastPosition = 0L;
        this.accumulatedSkippedSilenceDurationUs = 0L;
        Handler handler = this.reportSkippedSilenceHandler;
        if (handler != null) {
            handler.getClass();
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public C0201g getAudioAttributes() {
        return this.audioAttributes;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z7) {
        if (!isAudioTrackInitialized() || this.startMediaTimeUsNeedsInit) {
            return Long.MIN_VALUE;
        }
        return applySkipping(applyMediaPositionParameters(Math.min(this.audioTrackPositionTracker.getCurrentPositionUs(z7), this.configuration.framesToDurationUs(getWrittenFrames()))));
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public AudioOffloadSupport getFormatOffloadSupport(C0249w c0249w) {
        return this.offloadDisabledUntilNextConfiguration ? AudioOffloadSupport.DEFAULT_UNSUPPORTED : this.audioOffloadSupportProvider.getAudioOffloadSupport(c0249w, this.audioAttributes);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(C0249w c0249w) {
        maybeStartAudioCapabilitiesReceiver();
        String str = c0249w.f1522n;
        int i = c0249w.f1500E;
        if (!"audio/raw".equals(str)) {
            return this.audioCapabilities.isPassthroughPlaybackSupported(c0249w, this.audioAttributes) ? 2 : 0;
        }
        if (AbstractC1118i0.m2423N(i)) {
            return (i == 2 || (this.enableFloatOutput && i == 4)) ? 2 : 1;
        }
        AbstractC1101a.m2348F(TAG, "Invalid PCM encoding: " + i);
        return 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public C0256y0 getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return this.skipSilenceEnabled;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j, int i) throws IllegalStateException, T, AudioSink.WriteException, AudioSink.InitializationException {
        ByteBuffer byteBuffer2 = this.inputBuffer;
        AbstractC1101a.m2353d(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.pendingConfiguration != null) {
            if (!drainToEndOfStream()) {
                return false;
            }
            if (this.pendingConfiguration.canReuseAudioTrack(this.configuration)) {
                this.configuration = this.pendingConfiguration;
                this.pendingConfiguration = null;
                AudioTrack audioTrack = this.audioTrack;
                if (audioTrack != null && isOffloadedPlayback(audioTrack) && this.configuration.enableOffloadGapless) {
                    if (this.audioTrack.getPlayState() == 3) {
                        this.audioTrack.setOffloadEndOfStream();
                        this.audioTrackPositionTracker.expectRawPlaybackHeadReset();
                    }
                    AudioTrack audioTrack2 = this.audioTrack;
                    C0249w c0249w = this.configuration.inputFormat;
                    audioTrack2.setOffloadDelayPadding(c0249w.f1501F, c0249w.f1502G);
                    this.isWaitingForOffloadEndOfStreamHandled = true;
                }
            } else {
                playPendingData();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
        }
        if (!isAudioTrackInitialized()) {
            try {
                if (!initializeAudioTrack()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e) {
                if (e.isRecoverable) {
                    throw e;
                }
                this.initializationExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(e);
                return false;
            }
        }
        this.initializationExceptionPendingExceptionHolder.clear();
        if (this.startMediaTimeUsNeedsInit) {
            this.startMediaTimeUs = Math.max(0L, j);
            this.startMediaTimeUsNeedsSync = false;
            this.startMediaTimeUsNeedsInit = false;
            if (useAudioTrackPlaybackParams()) {
                setAudioTrackPlaybackParametersV23();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
            if (this.playing) {
                play();
            }
        }
        if (!this.audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames())) {
            return false;
        }
        if (this.inputBuffer == null) {
            AbstractC1101a.m2353d(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            Configuration configuration = this.configuration;
            if (configuration.outputMode != 0 && this.framesPerEncodedSample == 0) {
                int framesPerEncodedSample = getFramesPerEncodedSample(configuration.outputEncoding, byteBuffer);
                this.framesPerEncodedSample = framesPerEncodedSample;
                if (framesPerEncodedSample == 0) {
                    return true;
                }
            }
            if (this.afterDrainParameters != null) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                this.afterDrainParameters = null;
            }
            long jInputFramesToDurationUs = this.startMediaTimeUs + this.configuration.inputFramesToDurationUs(getSubmittedFrames() - this.trimmingAudioProcessor.getTrimmedFrameCount());
            if (!this.startMediaTimeUsNeedsSync && Math.abs(jInputFramesToDurationUs - j) > 200000) {
                AudioSink.Listener listener = this.listener;
                if (listener != null) {
                    listener.onAudioSinkError(new AudioSink.UnexpectedDiscontinuityException(j, jInputFramesToDurationUs));
                }
                this.startMediaTimeUsNeedsSync = true;
            }
            if (this.startMediaTimeUsNeedsSync) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                long j8 = j - jInputFramesToDurationUs;
                this.startMediaTimeUs += j8;
                this.startMediaTimeUsNeedsSync = false;
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                AudioSink.Listener listener2 = this.listener;
                if (listener2 != null && j8 != 0) {
                    listener2.onPositionDiscontinuity();
                }
            }
            if (this.configuration.outputMode == 0) {
                this.submittedPcmBytes += byteBuffer.remaining();
            } else {
                this.submittedEncodedFrames = (this.framesPerEncodedSample * i) + this.submittedEncodedFrames;
            }
            this.inputBuffer = byteBuffer;
            this.inputBufferAccessUnitCount = i;
        }
        processBuffers(j);
        if (!this.inputBuffer.hasRemaining()) {
            this.inputBuffer = null;
            this.inputBufferAccessUnitCount = 0;
            return true;
        }
        if (!this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
            return false;
        }
        AbstractC1101a.m2348F(TAG, "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        this.startMediaTimeUsNeedsSync = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        if (isAudioTrackInitialized()) {
            return !(AbstractC1118i0.f4750a >= 29 && this.audioTrack.isOffloadedPlayback() && this.handledOffloadOnPresentationEnded) && this.audioTrackPositionTracker.hasPendingData(getWrittenFrames());
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        if (isAudioTrackInitialized()) {
            return this.handledEndOfStream && !hasPendingData();
        }
        return true;
    }

    public void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.playbackLooper;
        if (looper != looperMyLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (looperMyLooper != null ? looperMyLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
        }
        if (audioCapabilities.equals(this.audioCapabilities)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioCapabilitiesChanged();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() throws IllegalStateException {
        this.playing = false;
        if (isAudioTrackInitialized()) {
            if (this.audioTrackPositionTracker.pause() || isOffloadedPlayback(this.audioTrack)) {
                this.audioTrack.pause();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() throws IllegalStateException {
        this.playing = true;
        if (isAudioTrackInitialized()) {
            this.audioTrackPositionTracker.start();
            this.audioTrack.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() throws IllegalStateException {
        if (!this.handledEndOfStream && isAudioTrackInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.handledEndOfStream = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.unregister();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() throws IllegalStateException {
        flush();
        C0977k0 c0977k0M2171l = this.toIntPcmAvailableAudioProcessors.listIterator(0);
        while (c0977k0M2171l.hasNext()) {
            ((InterfaceC0176d) c0977k0M2171l.next()).reset();
        }
        C0977k0 c0977k0M2171l2 = this.toFloatPcmAvailableAudioProcessors.listIterator(0);
        while (c0977k0M2171l2.hasNext()) {
            ((InterfaceC0176d) c0977k0M2171l2.next()).reset();
        }
        C0173a c0173a = this.audioProcessingPipeline;
        if (c0173a != null) {
            AbstractC0983m0 abstractC0983m0 = c0173a.f976a;
            for (int i = 0; i < abstractC0983m0.size(); i++) {
                InterfaceC0176d interfaceC0176d = (InterfaceC0176d) abstractC0983m0.get(i);
                interfaceC0176d.flush();
                interfaceC0176d.reset();
            }
            c0173a.f978c = new ByteBuffer[0];
            C0174b c0174b = C0174b.f980e;
            c0173a.f979d = false;
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(C0201g c0201g) throws IllegalStateException {
        if (this.audioAttributes.equals(c0201g)) {
            return;
        }
        this.audioAttributes = c0201g;
        if (this.tunneling) {
            return;
        }
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.setAudioAttributes(c0201g);
        }
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i) throws IllegalStateException {
        if (this.audioSessionId != i) {
            this.audioSessionId = i;
            this.externalAudioSessionIdProvided = i != 0;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(C0204h c0204h) {
        if (this.auxEffectInfo.equals(c0204h)) {
            return;
        }
        c0204h.getClass();
        if (this.audioTrack != null) {
            this.auxEffectInfo.getClass();
        }
        this.auxEffectInfo = c0204h;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setClock(InterfaceC1103b interfaceC1103b) {
        this.audioTrackPositionTracker.setClock(interfaceC1103b);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadDelayPadding(int i, int i4) {
        Configuration configuration;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null || !isOffloadedPlayback(audioTrack) || (configuration = this.configuration) == null || !configuration.enableOffloadGapless) {
            return;
        }
        this.audioTrack.setOffloadDelayPadding(i, i4);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadMode(int i) {
        AbstractC1101a.m2359j(AbstractC1118i0.f4750a >= 29);
        this.offloadMode = i;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(C0256y0 c0256y0) {
        this.playbackParameters = new C0256y0(AbstractC1118i0.m2450i(c0256y0.f1549a, 0.1f, 8.0f), AbstractC1118i0.m2450i(c0256y0.f1550b, 0.1f, 8.0f));
        if (useAudioTrackPlaybackParams()) {
            setAudioTrackPlaybackParametersV23();
        } else {
            setAudioProcessorPlaybackParameters(c0256y0);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlayerId(PlayerId playerId) {
        this.playerId = playerId;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.preferredDevice = audioDeviceInfo == null ? null : new AudioDeviceInfoApi23(audioDeviceInfo);
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.setRoutedDevice(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            Api23.setPreferredDeviceOnAudioTrack(audioTrack, this.preferredDevice);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z7) {
        this.skipSilenceEnabled = z7;
        setAudioProcessorPlaybackParameters(useAudioTrackPlaybackParams() ? C0256y0.f1548d : this.playbackParameters);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVolume(float f8) {
        if (this.volume != f8) {
            this.volume = f8;
            setVolumeInternal();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(C0249w c0249w) {
        return getFormatSupport(c0249w) != 0;
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    private DefaultAudioSink(Builder builder) {
        Context context = builder.context;
        this.context = context;
        C0201g c0201g = C0201g.f1098b;
        this.audioAttributes = c0201g;
        this.audioCapabilities = context != null ? AudioCapabilities.getCapabilities(context, c0201g, null) : builder.audioCapabilities;
        this.audioProcessorChain = builder.audioProcessorChain;
        this.enableFloatOutput = builder.enableFloatOutput;
        this.preferAudioTrackPlaybackParams = AbstractC1118i0.f4750a >= 23 && builder.enableAudioTrackPlaybackParams;
        this.offloadMode = 0;
        this.audioTrackBufferSizeProvider = builder.audioTrackBufferSizeProvider;
        AudioOffloadSupportProvider audioOffloadSupportProvider = builder.audioOffloadSupportProvider;
        audioOffloadSupportProvider.getClass();
        this.audioOffloadSupportProvider = audioOffloadSupportProvider;
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new PositionTrackerListener());
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.channelMappingAudioProcessor = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        this.trimmingAudioProcessor = trimmingAudioProcessor;
        C0182j c0182j = new C0182j();
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        Object[] objArr = {c0182j, channelMappingAudioProcessor, trimmingAudioProcessor};
        AbstractC1006u.m2187b(3, objArr);
        this.toIntPcmAvailableAudioProcessors = AbstractC0983m0.m2163h(3, objArr);
        this.toFloatPcmAvailableAudioProcessors = AbstractC0983m0.m2168n(new ToFloatPcmAudioProcessor());
        this.volume = 1.0f;
        this.audioSessionId = 0;
        this.auxEffectInfo = new C0204h();
        C0256y0 c0256y0 = C0256y0.f1548d;
        this.mediaPositionParameters = new MediaPositionParameters(c0256y0, 0L, 0L);
        this.playbackParameters = c0256y0;
        this.skipSilenceEnabled = false;
        this.mediaPositionParametersCheckpoints = new ArrayDeque<>();
        this.initializationExceptionPendingExceptionHolder = new PendingExceptionHolder<>();
        this.writeExceptionPendingExceptionHolder = new PendingExceptionHolder<>();
        this.audioOffloadListener = builder.audioOffloadListener;
        this.audioTrackProvider = builder.audioTrackProvider;
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Builder {
        private AudioCapabilities audioCapabilities;
        private ExoPlayer.AudioOffloadListener audioOffloadListener;
        private AudioOffloadSupportProvider audioOffloadSupportProvider;
        private InterfaceC0177e audioProcessorChain;
        private AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
        private AudioTrackProvider audioTrackProvider;
        private boolean buildCalled;
        private final Context context;
        private boolean enableAudioTrackPlaybackParams;
        private boolean enableFloatOutput;

        @Deprecated
        public Builder() {
            this.context = null;
            this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            this.audioTrackBufferSizeProvider = AudioTrackBufferSizeProvider.DEFAULT;
            this.audioTrackProvider = AudioTrackProvider.DEFAULT;
        }

        public DefaultAudioSink build() {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.buildCalled = true;
            if (this.audioProcessorChain == null) {
                this.audioProcessorChain = new DefaultAudioProcessorChain(new InterfaceC0176d[0]);
            }
            if (this.audioOffloadSupportProvider == null) {
                this.audioOffloadSupportProvider = new DefaultAudioOffloadSupportProvider(this.context);
            }
            return new DefaultAudioSink(this);
        }

        @Deprecated
        public Builder setAudioCapabilities(AudioCapabilities audioCapabilities) {
            audioCapabilities.getClass();
            this.audioCapabilities = audioCapabilities;
            return this;
        }

        public Builder setAudioOffloadSupportProvider(AudioOffloadSupportProvider audioOffloadSupportProvider) {
            this.audioOffloadSupportProvider = audioOffloadSupportProvider;
            return this;
        }

        public Builder setAudioProcessorChain(InterfaceC0177e interfaceC0177e) {
            interfaceC0177e.getClass();
            this.audioProcessorChain = interfaceC0177e;
            return this;
        }

        public Builder setAudioProcessors(InterfaceC0176d[] interfaceC0176dArr) {
            interfaceC0176dArr.getClass();
            return setAudioProcessorChain(new DefaultAudioProcessorChain(interfaceC0176dArr));
        }

        public Builder setAudioTrackBufferSizeProvider(AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.audioTrackBufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        public Builder setAudioTrackProvider(AudioTrackProvider audioTrackProvider) {
            this.audioTrackProvider = audioTrackProvider;
            return this;
        }

        public Builder setEnableAudioTrackPlaybackParams(boolean z7) {
            this.enableAudioTrackPlaybackParams = z7;
            return this;
        }

        public Builder setEnableFloatOutput(boolean z7) {
            this.enableFloatOutput = z7;
            return this;
        }

        public Builder setExperimentalAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
            this.audioOffloadListener = audioOffloadListener;
            return this;
        }

        public Builder(Context context) {
            this.context = context;
            this.audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            this.audioTrackBufferSizeProvider = AudioTrackBufferSizeProvider.DEFAULT;
            this.audioTrackProvider = AudioTrackProvider.DEFAULT;
        }
    }

    private AudioTrack buildAudioTrack(AudioSink.AudioTrackConfig audioTrackConfig, C0201g c0201g, int i, C0249w c0249w) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrack = this.audioTrackProvider.getAudioTrack(audioTrackConfig, c0201g, i);
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new AudioSink.InitializationException(state, audioTrackConfig.sampleRate, audioTrackConfig.channelConfig, audioTrackConfig.encoding, c0249w, audioTrackConfig.offload, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new AudioSink.InitializationException(0, audioTrackConfig.sampleRate, audioTrackConfig.channelConfig, audioTrackConfig.encoding, c0249w, audioTrackConfig.offload, e);
        }
    }
}
