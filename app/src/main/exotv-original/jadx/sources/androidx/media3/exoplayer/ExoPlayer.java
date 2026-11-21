package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.AbstractC0203g1;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0204h;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0231q;
import androidx.media3.common.C0235r0;
import androidx.media3.common.C0248v1;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0254x1;
import androidx.media3.common.C0256y0;
import androidx.media3.common.C0259z0;
import androidx.media3.common.InterfaceC0185b1;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import java.util.List;
import okhttp3.C2181z;
import p043e6.InterfaceC0916d;
import p043e6.InterfaceC0921i;
import p056g1.C1030c;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1134y;
import p063h1.InterfaceC1103b;
import p115n1.C1985l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface ExoPlayer extends InterfaceC0193d1 {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Deprecated
    public interface AudioComponent {
        @Deprecated
        void clearAuxEffectInfo();

        @Deprecated
        C0201g getAudioAttributes();

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        boolean getSkipSilenceEnabled();

        @Deprecated
        float getVolume();

        @Deprecated
        void setAudioAttributes(C0201g c0201g, boolean z7);

        @Deprecated
        void setAudioSessionId(int i);

        @Deprecated
        void setAuxEffectInfo(C0204h c0204h);

        @Deprecated
        void setSkipSilenceEnabled(boolean z7);

        @Deprecated
        void setVolume(float f8);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface AudioOffloadListener {
        default void onOffloadedPlayback(boolean z7) {
        }

        default void onSleepingForOffloadChanged(boolean z7) {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Builder {
        InterfaceC0916d analyticsCollectorFunction;
        C0201g audioAttributes;
        InterfaceC0921i bandwidthMeterSupplier;
        boolean buildCalled;
        InterfaceC1103b clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        boolean deviceVolumeControlEnabled;
        boolean dynamicSchedulingEnabled;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        InterfaceC0921i loadControlSupplier;
        Looper looper;
        long maxSeekToPreviousPositionMs;
        InterfaceC0921i mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;
        PlaybackLooperProvider playbackLooperProvider;
        String playerName;
        int priority;
        AbstractC0203g1 priorityTaskManager;
        long releaseTimeoutMs;
        InterfaceC0921i renderersFactorySupplier;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        SuitableOutputChecker suitableOutputChecker;
        boolean suppressPlaybackOnUnsuitableOutput;
        InterfaceC0921i trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        public Builder(Context context) {
            this(context, new C0277a(context, 1), new C0277a(context, 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$0(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$1(Context context) {
            return new DefaultMediaSourceFactory(context, new C1985l());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$10(TrackSelector trackSelector) {
            return trackSelector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$new$11(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$new$12(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$new$13(AnalyticsCollector analyticsCollector, InterfaceC1103b interfaceC1103b) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$new$14(Context context) {
            return new DefaultTrackSelector(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$2(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$3(Context context) {
            return new DefaultMediaSourceFactory(context, new C1985l());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$4(Context context) {
            return new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$5(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$6(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$7(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$new$8(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$new$9(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AnalyticsCollector lambda$setAnalyticsCollector$21(AnalyticsCollector analyticsCollector, InterfaceC1103b interfaceC1103b) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$20(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ LoadControl lambda$setLoadControl$19(LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ MediaSource.Factory lambda$setMediaSourceFactory$17(MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ RenderersFactory lambda$setRenderersFactory$16(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackSelector lambda$setTrackSelector$18(TrackSelector trackSelector) {
            return trackSelector;
        }

        public ExoPlayer build() {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.buildCalled = true;
            if (this.suitableOutputChecker == null && AbstractC1118i0.f4750a >= 35 && this.suppressPlaybackOnUnsuitableOutput) {
                this.suitableOutputChecker = new DefaultSuitableOutputChecker(this.context, new Handler(this.looper));
            }
            return new ExoPlayerImpl(this, null);
        }

        public SimpleExoPlayer buildSimpleExoPlayer() {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }

        public Builder experimentalSetDynamicSchedulingEnabled(boolean z7) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.dynamicSchedulingEnabled = z7;
            return this;
        }

        public Builder experimentalSetForegroundModeTimeoutMs(long j) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.foregroundModeTimeoutMs = j;
            return this;
        }

        public Builder setAnalyticsCollector(AnalyticsCollector analyticsCollector) {
            AbstractC1101a.m2359j(!this.buildCalled);
            analyticsCollector.getClass();
            this.analyticsCollectorFunction = new C0330d(analyticsCollector, 0);
            return this;
        }

        public Builder setAudioAttributes(C0201g c0201g, boolean z7) {
            AbstractC1101a.m2359j(!this.buildCalled);
            c0201g.getClass();
            this.audioAttributes = c0201g;
            this.handleAudioFocus = z7;
            return this;
        }

        public Builder setBandwidthMeter(BandwidthMeter bandwidthMeter) {
            AbstractC1101a.m2359j(!this.buildCalled);
            bandwidthMeter.getClass();
            this.bandwidthMeterSupplier = new C0358g(bandwidthMeter, 0);
            return this;
        }

        public Builder setClock(InterfaceC1103b interfaceC1103b) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.clock = interfaceC1103b;
            return this;
        }

        public Builder setDetachSurfaceTimeoutMs(long j) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j;
            return this;
        }

        public Builder setDeviceVolumeControlEnabled(boolean z7) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.deviceVolumeControlEnabled = z7;
            return this;
        }

        public Builder setHandleAudioBecomingNoisy(boolean z7) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.handleAudioBecomingNoisy = z7;
            return this;
        }

        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            AbstractC1101a.m2359j(!this.buildCalled);
            livePlaybackSpeedControl.getClass();
            this.livePlaybackSpeedControl = livePlaybackSpeedControl;
            return this;
        }

        public Builder setLoadControl(LoadControl loadControl) {
            AbstractC1101a.m2359j(!this.buildCalled);
            loadControl.getClass();
            this.loadControlSupplier = new C0328c(loadControl, 0);
            return this;
        }

        public Builder setLooper(Looper looper) {
            AbstractC1101a.m2359j(!this.buildCalled);
            looper.getClass();
            this.looper = looper;
            return this;
        }

        public Builder setMaxSeekToPreviousPositionMs(long j) {
            AbstractC1101a.m2353d(j >= 0);
            AbstractC1101a.m2359j(!this.buildCalled);
            this.maxSeekToPreviousPositionMs = j;
            return this;
        }

        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            AbstractC1101a.m2359j(!this.buildCalled);
            factory.getClass();
            this.mediaSourceFactorySupplier = new C0356f(factory, 3);
            return this;
        }

        public Builder setName(String str) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.playerName = str;
            return this;
        }

        public Builder setPauseAtEndOfMediaItems(boolean z7) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z7;
            return this;
        }

        public Builder setPlaybackLooper(Looper looper) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.playbackLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        public Builder setPlaybackLooperProvider(PlaybackLooperProvider playbackLooperProvider) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.playbackLooperProvider = playbackLooperProvider;
            return this;
        }

        public Builder setPriority(int i) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.priority = i;
            return this;
        }

        public Builder setPriorityTaskManager(AbstractC0203g1 abstractC0203g1) {
            AbstractC1101a.m2359j(!this.buildCalled);
            return this;
        }

        public Builder setReleaseTimeoutMs(long j) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.releaseTimeoutMs = j;
            return this;
        }

        public Builder setRenderersFactory(RenderersFactory renderersFactory) {
            AbstractC1101a.m2359j(!this.buildCalled);
            renderersFactory.getClass();
            this.renderersFactorySupplier = new C0354e(renderersFactory, 0);
            return this;
        }

        public Builder setSeekBackIncrementMs(long j) {
            AbstractC1101a.m2353d(j > 0);
            AbstractC1101a.m2359j(!this.buildCalled);
            this.seekBackIncrementMs = j;
            return this;
        }

        public Builder setSeekForwardIncrementMs(long j) {
            AbstractC1101a.m2353d(j > 0);
            AbstractC1101a.m2359j(!this.buildCalled);
            this.seekForwardIncrementMs = j;
            return this;
        }

        public Builder setSeekParameters(SeekParameters seekParameters) {
            AbstractC1101a.m2359j(!this.buildCalled);
            seekParameters.getClass();
            this.seekParameters = seekParameters;
            return this;
        }

        public Builder setSkipSilenceEnabled(boolean z7) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.skipSilenceEnabled = z7;
            return this;
        }

        public Builder setSuitableOutputChecker(SuitableOutputChecker suitableOutputChecker) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.suitableOutputChecker = suitableOutputChecker;
            return this;
        }

        public Builder setSuppressPlaybackOnUnsuitableOutput(boolean z7) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.suppressPlaybackOnUnsuitableOutput = z7;
            return this;
        }

        public Builder setTrackSelector(TrackSelector trackSelector) {
            AbstractC1101a.m2359j(!this.buildCalled);
            trackSelector.getClass();
            this.trackSelectorSupplier = new C0359h(trackSelector, 1);
            return this;
        }

        public Builder setUseLazyPreparation(boolean z7) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.useLazyPreparation = z7;
            return this;
        }

        public Builder setUsePlatformDiagnostics(boolean z7) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.usePlatformDiagnostics = z7;
            return this;
        }

        public Builder setVideoChangeFrameRateStrategy(int i) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i;
            return this;
        }

        public Builder setVideoScalingMode(int i) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.videoScalingMode = i;
            return this;
        }

        public Builder setWakeMode(int i) {
            AbstractC1101a.m2359j(!this.buildCalled);
            this.wakeMode = i;
            return this;
        }

        public Builder(Context context, RenderersFactory renderersFactory) {
            this(context, new C0354e(renderersFactory, 2), new C0277a(context, 3));
            renderersFactory.getClass();
        }

        public Builder(Context context, MediaSource.Factory factory) {
            this(context, new C0277a(context, 6), new C0356f(factory, 2));
            factory.getClass();
        }

        public Builder(Context context, RenderersFactory renderersFactory, MediaSource.Factory factory) {
            this(context, new C0354e(renderersFactory, 1), new C0356f(factory, 0));
            renderersFactory.getClass();
            factory.getClass();
        }

        public Builder(Context context, RenderersFactory renderersFactory, MediaSource.Factory factory, TrackSelector trackSelector, LoadControl loadControl, BandwidthMeter bandwidthMeter, AnalyticsCollector analyticsCollector) {
            C0354e c0354e = new C0354e(renderersFactory, 3);
            C0356f c0356f = new C0356f(factory, 1);
            C0359h c0359h = new C0359h(trackSelector, 0);
            C0328c c0328c = new C0328c(loadControl, 1);
            int i = 1;
            this(context, c0354e, c0356f, c0359h, c0328c, new C0358g(bandwidthMeter, i), new C0330d(analyticsCollector, i));
            renderersFactory.getClass();
            factory.getClass();
            trackSelector.getClass();
            bandwidthMeter.getClass();
            analyticsCollector.getClass();
        }

        private Builder(Context context, InterfaceC0921i interfaceC0921i, InterfaceC0921i interfaceC0921i2) {
            this(context, interfaceC0921i, interfaceC0921i2, new C0277a(context, 4), new C0375i(), new C0277a(context, 5), new C0413q(4));
        }

        private Builder(Context context, InterfaceC0921i interfaceC0921i, InterfaceC0921i interfaceC0921i2, InterfaceC0921i interfaceC0921i3, InterfaceC0921i interfaceC0921i4, InterfaceC0921i interfaceC0921i5, InterfaceC0916d interfaceC0916d) {
            context.getClass();
            this.context = context;
            this.renderersFactorySupplier = interfaceC0921i;
            this.mediaSourceFactorySupplier = interfaceC0921i2;
            this.trackSelectorSupplier = interfaceC0921i3;
            this.loadControlSupplier = interfaceC0921i4;
            this.bandwidthMeterSupplier = interfaceC0921i5;
            this.analyticsCollectorFunction = interfaceC0916d;
            int i = AbstractC1118i0.f4750a;
            Looper looperMyLooper = Looper.myLooper();
            this.looper = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.audioAttributes = C0201g.f1098b;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
            this.seekForwardIncrementMs = 15000L;
            this.maxSeekToPreviousPositionMs = 3000L;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = InterfaceC1103b.f4713a;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
            this.usePlatformDiagnostics = true;
            this.playerName = C2181z.FRAGMENT_ENCODE_SET;
            this.priority = -1000;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Deprecated
    public interface DeviceComponent {
        @Deprecated
        void decreaseDeviceVolume();

        @Deprecated
        C0231q getDeviceInfo();

        @Deprecated
        int getDeviceVolume();

        @Deprecated
        void increaseDeviceVolume();

        @Deprecated
        boolean isDeviceMuted();

        @Deprecated
        void setDeviceMuted(boolean z7);

        @Deprecated
        void setDeviceVolume(int i);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class PreloadConfiguration {
        public static final PreloadConfiguration DEFAULT = new PreloadConfiguration(-9223372036854775807L);
        public final long targetPreloadDurationUs;

        public PreloadConfiguration(long j) {
            this.targetPreloadDurationUs = j;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Deprecated
    public interface TextComponent {
        @Deprecated
        C1030c getCurrentCues();
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Deprecated
    public interface VideoComponent {
        @Deprecated
        void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void clearVideoSurface();

        @Deprecated
        void clearVideoSurface(Surface surface);

        @Deprecated
        void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        @Deprecated
        void clearVideoSurfaceView(SurfaceView surfaceView);

        @Deprecated
        void clearVideoTextureView(TextureView textureView);

        @Deprecated
        int getVideoChangeFrameRateStrategy();

        @Deprecated
        int getVideoScalingMode();

        @Deprecated
        C0194d2 getVideoSize();

        @Deprecated
        void setCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void setVideoChangeFrameRateStrategy(int i);

        @Deprecated
        void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void setVideoScalingMode(int i);

        @Deprecated
        void setVideoSurface(Surface surface);

        @Deprecated
        void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        @Deprecated
        void setVideoSurfaceView(SurfaceView surfaceView);

        @Deprecated
        void setVideoTextureView(TextureView textureView);
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void addListener(InterfaceC0185b1 interfaceC0185b1);

    /* synthetic */ void addMediaItem(int i, C0226o0 c0226o0);

    /* synthetic */ void addMediaItem(C0226o0 c0226o0);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void addMediaItems(int i, List list);

    /* synthetic */ void addMediaItems(List list);

    void addMediaSource(int i, MediaSource mediaSource);

    void addMediaSource(MediaSource mediaSource);

    void addMediaSources(int i, List<MediaSource> list);

    void addMediaSources(List<MediaSource> list);

    /* synthetic */ boolean canAdvertiseSession();

    void clearAuxEffectInfo();

    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    /* synthetic */ void clearMediaItems();

    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    /* synthetic */ void clearVideoSurface();

    /* synthetic */ void clearVideoSurface(Surface surface);

    /* synthetic */ void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void clearVideoSurfaceView(SurfaceView surfaceView);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void clearVideoTextureView(TextureView textureView);

    PlayerMessage createMessage(PlayerMessage.Target target);

    @Deprecated
    /* synthetic */ void decreaseDeviceVolume();

    /* synthetic */ void decreaseDeviceVolume(int i);

    AnalyticsCollector getAnalyticsCollector();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ Looper getApplicationLooper();

    /* synthetic */ C0201g getAudioAttributes();

    @Deprecated
    AudioComponent getAudioComponent();

    DecoderCounters getAudioDecoderCounters();

    C0249w getAudioFormat();

    int getAudioSessionId();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ C0259z0 getAvailableCommands();

    /* synthetic */ int getBufferedPercentage();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ long getBufferedPosition();

    InterfaceC1103b getClock();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ long getContentBufferedPosition();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ long getContentDuration();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ long getContentPosition();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ int getCurrentAdGroupIndex();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ int getCurrentAdIndexInAdGroup();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ C1030c getCurrentCues();

    /* synthetic */ long getCurrentLiveOffset();

    /* synthetic */ Object getCurrentManifest();

    /* synthetic */ C0226o0 getCurrentMediaItem();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ int getCurrentMediaItemIndex();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ int getCurrentPeriodIndex();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ long getCurrentPosition();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ AbstractC0230p1 getCurrentTimeline();

    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ C0254x1 getCurrentTracks();

    @Deprecated
    /* synthetic */ int getCurrentWindowIndex();

    @Deprecated
    DeviceComponent getDeviceComponent();

    /* synthetic */ C0231q getDeviceInfo();

    /* synthetic */ int getDeviceVolume();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ long getDuration();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ long getMaxSeekToPreviousPosition();

    /* synthetic */ C0226o0 getMediaItemAt(int i);

    /* synthetic */ int getMediaItemCount();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ C0235r0 getMediaMetadata();

    /* synthetic */ int getNextMediaItemIndex();

    @Deprecated
    /* synthetic */ int getNextWindowIndex();

    boolean getPauseAtEndOfMediaItems();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ boolean getPlayWhenReady();

    Looper getPlaybackLooper();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ C0256y0 getPlaybackParameters();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ int getPlaybackState();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ int getPlaybackSuppressionReason();

    @Override // androidx.media3.common.InterfaceC0193d1
    ExoPlaybackException getPlayerError();

    /* synthetic */ C0235r0 getPlaylistMetadata();

    PreloadConfiguration getPreloadConfiguration();

    /* synthetic */ int getPreviousMediaItemIndex();

    @Deprecated
    /* synthetic */ int getPreviousWindowIndex();

    Renderer getRenderer(int i);

    int getRendererCount();

    int getRendererType(int i);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ int getRepeatMode();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ long getSeekBackIncrement();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ long getSeekForwardIncrement();

    SeekParameters getSeekParameters();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ boolean getShuffleModeEnabled();

    boolean getSkipSilenceEnabled();

    /* synthetic */ C1134y getSurfaceSize();

    @Deprecated
    TextComponent getTextComponent();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ long getTotalBufferedDuration();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ C0248v1 getTrackSelectionParameters();

    TrackSelector getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @Deprecated
    VideoComponent getVideoComponent();

    DecoderCounters getVideoDecoderCounters();

    C0249w getVideoFormat();

    int getVideoScalingMode();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ C0194d2 getVideoSize();

    /* synthetic */ float getVolume();

    @Deprecated
    /* synthetic */ boolean hasNext();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ boolean hasNextMediaItem();

    @Deprecated
    /* synthetic */ boolean hasNextWindow();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ boolean hasPreviousMediaItem();

    @Deprecated
    /* synthetic */ void increaseDeviceVolume();

    /* synthetic */ void increaseDeviceVolume(int i);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ boolean isCommandAvailable(int i);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ boolean isCurrentMediaItemDynamic();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ boolean isCurrentMediaItemLive();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ boolean isCurrentMediaItemSeekable();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowDynamic();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowLive();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowSeekable();

    /* synthetic */ boolean isDeviceMuted();

    /* synthetic */ boolean isLoading();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ boolean isPlaying();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ boolean isPlayingAd();

    boolean isReleased();

    boolean isSleepingForOffload();

    boolean isTunnelingEnabled();

    /* synthetic */ void moveMediaItem(int i, int i4);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void moveMediaItems(int i, int i4, int i8);

    @Deprecated
    /* synthetic */ void next();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void pause();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void play();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void prepare();

    @Deprecated
    void prepare(MediaSource mediaSource);

    @Deprecated
    void prepare(MediaSource mediaSource, boolean z7, boolean z8);

    void release();

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void removeListener(InterfaceC0185b1 interfaceC0185b1);

    /* synthetic */ void removeMediaItem(int i);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void removeMediaItems(int i, int i4);

    void replaceMediaItem(int i, C0226o0 c0226o0);

    @Override // androidx.media3.common.InterfaceC0193d1
    void replaceMediaItems(int i, int i4, List<C0226o0> list);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void seekBack();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void seekForward();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void seekTo(int i, long j);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void seekTo(long j);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void seekToDefaultPosition();

    /* synthetic */ void seekToDefaultPosition(int i);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void seekToNext();

    /* synthetic */ void seekToNextMediaItem();

    @Deprecated
    /* synthetic */ void seekToNextWindow();

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void seekToPrevious();

    /* synthetic */ void seekToPreviousMediaItem();

    @Deprecated
    /* synthetic */ void seekToPreviousWindow();

    /* synthetic */ void setAudioAttributes(C0201g c0201g, boolean z7);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(C0204h c0204h);

    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    @Deprecated
    /* synthetic */ void setDeviceMuted(boolean z7);

    /* synthetic */ void setDeviceMuted(boolean z7, int i);

    @Deprecated
    /* synthetic */ void setDeviceVolume(int i);

    /* synthetic */ void setDeviceVolume(int i, int i4);

    void setForegroundMode(boolean z7);

    void setHandleAudioBecomingNoisy(boolean z7);

    void setImageOutput(ImageOutput imageOutput);

    /* synthetic */ void setMediaItem(C0226o0 c0226o0);

    /* synthetic */ void setMediaItem(C0226o0 c0226o0, long j);

    /* synthetic */ void setMediaItem(C0226o0 c0226o0, boolean z7);

    /* synthetic */ void setMediaItems(List list);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void setMediaItems(List list, int i, long j);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void setMediaItems(List list, boolean z7);

    void setMediaSource(MediaSource mediaSource);

    void setMediaSource(MediaSource mediaSource, long j);

    void setMediaSource(MediaSource mediaSource, boolean z7);

    void setMediaSources(List<MediaSource> list);

    void setMediaSources(List<MediaSource> list, int i, long j);

    void setMediaSources(List<MediaSource> list, boolean z7);

    void setPauseAtEndOfMediaItems(boolean z7);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void setPlayWhenReady(boolean z7);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void setPlaybackParameters(C0256y0 c0256y0);

    /* synthetic */ void setPlaybackSpeed(float f8);

    /* synthetic */ void setPlaylistMetadata(C0235r0 c0235r0);

    void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo);

    void setPreloadConfiguration(PreloadConfiguration preloadConfiguration);

    void setPriority(int i);

    void setPriorityTaskManager(AbstractC0203g1 abstractC0203g1);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void setRepeatMode(int i);

    void setSeekParameters(SeekParameters seekParameters);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void setShuffleModeEnabled(boolean z7);

    void setShuffleOrder(ShuffleOrder shuffleOrder);

    void setSkipSilenceEnabled(boolean z7);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void setTrackSelectionParameters(C0248v1 c0248v1);

    void setVideoChangeFrameRateStrategy(int i);

    void setVideoEffects(List<Object> list);

    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    void setVideoScalingMode(int i);

    /* synthetic */ void setVideoSurface(Surface surface);

    /* synthetic */ void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void setVideoSurfaceView(SurfaceView surfaceView);

    @Override // androidx.media3.common.InterfaceC0193d1
    /* synthetic */ void setVideoTextureView(TextureView textureView);

    /* synthetic */ void setVolume(float f8);

    void setWakeMode(int i);

    /* synthetic */ void stop();
}
