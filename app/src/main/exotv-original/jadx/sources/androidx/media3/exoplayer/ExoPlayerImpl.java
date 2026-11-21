package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.AbstractC0203g1;
import androidx.media3.common.AbstractC0206h1;
import androidx.media3.common.AbstractC0207i;
import androidx.media3.common.AbstractC0229p0;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0171a1;
import androidx.media3.common.C0189c1;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0204h;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0227o1;
import androidx.media3.common.C0228p;
import androidx.media3.common.C0231q;
import androidx.media3.common.C0232q0;
import androidx.media3.common.C0235r0;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0243u;
import androidx.media3.common.C0248v1;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0254x1;
import androidx.media3.common.C0255y;
import androidx.media3.common.C0256y0;
import androidx.media3.common.C0259z0;
import androidx.media3.common.InterfaceC0185b1;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.common.InterfaceC0238s0;
import androidx.media3.common.InterfaceC0260z1;
import androidx.media3.exoplayer.AudioBecomingNoisyManager;
import androidx.media3.exoplayer.AudioFocusManager;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.StreamVolumeManager;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TimelineWithUpdatedMediaItem;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p002a1.C0036o;
import p005a4.C0088j0;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p056g1.C1029b;
import p056g1.C1030c;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1104b0;
import p063h1.C1109e;
import p063h1.C1125p;
import p063h1.C1134y;
import p063h1.C1135z;
import p063h1.InterfaceC1103b;
import p063h1.InterfaceC1120k;
import p063h1.InterfaceC1122m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class ExoPlayerImpl extends AbstractC0207i implements ExoPlayer, ExoPlayer.AudioComponent, ExoPlayer.VideoComponent, ExoPlayer.TextComponent, ExoPlayer.DeviceComponent {
    private static final String TAG = "ExoPlayerImpl";
    private final AnalyticsCollector analyticsCollector;
    private final Context applicationContext;
    private final Looper applicationLooper;
    private C0201g audioAttributes;
    private final AudioBecomingNoisyManager audioBecomingNoisyManager;
    private DecoderCounters audioDecoderCounters;
    private final AudioFocusManager audioFocusManager;
    private C0249w audioFormat;
    private AudioManager audioManager;
    private final CopyOnWriteArraySet<ExoPlayer.AudioOffloadListener> audioOffloadListeners;
    private int audioSessionId;
    private C0259z0 availableCommands;
    private final BandwidthMeter bandwidthMeter;
    private CameraMotionListener cameraMotionListener;
    private final InterfaceC1103b clock;
    private final ComponentListener componentListener;
    private final C1109e constructorFinished = new C1109e();
    private C1030c currentCueGroup;
    private final long detachSurfaceTimeoutMs;
    private C0231q deviceInfo;
    final TrackSelectorResult emptyTrackSelectorResult;
    private boolean foregroundMode;
    private final FrameMetadataListener frameMetadataListener;
    private boolean hasNotifiedFullWrongThreadWarning;
    private final ExoPlayerImplInternal internalPlayer;
    private boolean isPriorityTaskManagerRegistered;
    private final C1125p listeners;
    private int maskingPeriodIndex;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private final long maxSeekToPreviousPositionMs;
    private C0235r0 mediaMetadata;
    private final MediaSource.Factory mediaSourceFactory;
    private final List<MediaSourceHolderSnapshot> mediaSourceHolderSnapshots;
    private Surface ownedSurface;
    private boolean pauseAtEndOfMediaItems;
    private boolean pendingDiscontinuity;
    private int pendingDiscontinuityReason;
    private int pendingOperationAcks;
    private final C0221m1 period;
    final C0259z0 permanentAvailableCommands;
    private PlaybackInfo playbackInfo;
    private final InterfaceC1120k playbackInfoUpdateHandler;
    private final ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private boolean playerReleased;
    private C0235r0 playlistMetadata;
    private ExoPlayer.PreloadConfiguration preloadConfiguration;
    private int priority;
    private AbstractC0203g1 priorityTaskManager;
    private final Renderer[] renderers;
    private int repeatMode;
    private final long seekBackIncrementMs;
    private final long seekForwardIncrementMs;
    private SeekParameters seekParameters;
    private boolean shuffleModeEnabled;
    private ShuffleOrder shuffleOrder;
    private boolean skipSilenceEnabled;
    private SphericalGLSurfaceView sphericalGLSurfaceView;
    private C0235r0 staticAndDynamicMediaMetadata;
    private final StreamVolumeManager streamVolumeManager;
    private final SuitableOutputChecker suitableOutputChecker;
    private final boolean suppressPlaybackOnUnsuitableOutput;
    private SurfaceHolder surfaceHolder;
    private boolean surfaceHolderSurfaceIsVideoOutput;
    private C1134y surfaceSize;
    private TextureView textureView;
    private boolean throwsWhenUsingWrongThread;
    private final TrackSelector trackSelector;
    private final boolean useLazyPreparation;
    private int videoChangeFrameRateStrategy;
    private DecoderCounters videoDecoderCounters;
    private C0249w videoFormat;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private Object videoOutput;
    private int videoScalingMode;
    private C0194d2 videoSize;
    private float volume;
    private final WakeLockManager wakeLockManager;
    private final WifiLockManager wifiLockManager;
    private final InterfaceC0193d1 wrappingPlayer;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Api23 {
        private Api23() {
        }

        public static boolean isSuitableExternalAudioOutputPresentInAudioDeviceInfoList(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
            int i = AbstractC1118i0.f4750a;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                return true;
            }
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i4 = AbstractC1118i0.f4750a;
                if (i4 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i4 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i4 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i4 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        public static void registerAudioDeviceCallback(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Api31 {
        private Api31() {
        }

        public static PlayerId registerMediaMetricsListener(Context context, ExoPlayerImpl exoPlayerImpl, boolean z7, String str) {
            MediaMetricsListener mediaMetricsListenerCreate = MediaMetricsListener.create(context);
            if (mediaMetricsListenerCreate == null) {
                AbstractC1101a.m2348F(ExoPlayerImpl.TAG, "MediaMetricsService unavailable.");
                return new PlayerId(LogSessionId.LOG_SESSION_ID_NONE, str);
            }
            if (z7) {
                exoPlayerImpl.addAnalyticsListener(mediaMetricsListenerCreate);
            }
            return new PlayerId(mediaMetricsListenerCreate.getLogSessionId(), str);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class ComponentListener implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.VideoSurfaceListener, AudioFocusManager.PlayerControl, AudioBecomingNoisyManager.EventListener, StreamVolumeManager.Listener, ExoPlayer.AudioOffloadListener {
        private ComponentListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMetadata$4(InterfaceC0185b1 interfaceC0185b1) {
            interfaceC0185b1.onMediaMetadataChanged(ExoPlayerImpl.this.mediaMetadata);
        }

        @Override // androidx.media3.exoplayer.AudioFocusManager.PlayerControl
        public void executePlayerCommand(int i) {
            ExoPlayerImpl.this.updatePlayWhenReady(ExoPlayerImpl.this.getPlayWhenReady(), i, ExoPlayerImpl.getPlayWhenReadyChangeReason(i));
        }

        @Override // androidx.media3.exoplayer.AudioBecomingNoisyManager.EventListener
        public void onAudioBecomingNoisy() {
            ExoPlayerImpl.this.updatePlayWhenReady(false, -1, 3);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioCodecError(Exception exc) {
            ExoPlayerImpl.this.analyticsCollector.onAudioCodecError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDecoderInitialized(String str, long j, long j8) {
            ExoPlayerImpl.this.analyticsCollector.onAudioDecoderInitialized(str, j, j8);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDecoderReleased(String str) {
            ExoPlayerImpl.this.analyticsCollector.onAudioDecoderReleased(str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDisabled(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.analyticsCollector.onAudioDisabled(decoderCounters);
            ExoPlayerImpl.this.audioFormat = null;
            ExoPlayerImpl.this.audioDecoderCounters = null;
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioEnabled(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.audioDecoderCounters = decoderCounters;
            ExoPlayerImpl.this.analyticsCollector.onAudioEnabled(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioInputFormatChanged(C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation) {
            ExoPlayerImpl.this.audioFormat = c0249w;
            ExoPlayerImpl.this.analyticsCollector.onAudioInputFormatChanged(c0249w, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioPositionAdvancing(long j) {
            ExoPlayerImpl.this.analyticsCollector.onAudioPositionAdvancing(j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioSinkError(Exception exc) {
            ExoPlayerImpl.this.analyticsCollector.onAudioSinkError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
            ExoPlayerImpl.this.analyticsCollector.onAudioTrackInitialized(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
            ExoPlayerImpl.this.analyticsCollector.onAudioTrackReleased(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioUnderrun(int i, long j, long j8) {
            ExoPlayerImpl.this.analyticsCollector.onAudioUnderrun(i, j, j8);
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public void onCues(List<C1029b> list) {
            ExoPlayerImpl.this.listeners.m2474f(27, new C0380k(6, list));
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onDroppedFrames(int i, long j) {
            ExoPlayerImpl.this.analyticsCollector.onDroppedFrames(i, j);
        }

        @Override // androidx.media3.exoplayer.metadata.MetadataOutput
        public void onMetadata(C0241t0 c0241t0) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            C0232q0 c0232q0M666a = exoPlayerImpl.staticAndDynamicMediaMetadata.m666a();
            int i = 0;
            while (true) {
                InterfaceC0238s0[] interfaceC0238s0Arr = c0241t0.f1412j;
                if (i >= interfaceC0238s0Arr.length) {
                    break;
                }
                interfaceC0238s0Arr[i].populateMediaMetadata(c0232q0M666a);
                i++;
            }
            exoPlayerImpl.staticAndDynamicMediaMetadata = new C0235r0(c0232q0M666a);
            C0235r0 c0235r0BuildUpdatedMediaMetadata = ExoPlayerImpl.this.buildUpdatedMediaMetadata();
            if (!c0235r0BuildUpdatedMediaMetadata.equals(ExoPlayerImpl.this.mediaMetadata)) {
                ExoPlayerImpl.this.mediaMetadata = c0235r0BuildUpdatedMediaMetadata;
                ExoPlayerImpl.this.listeners.m2471c(14, new C0380k(4, this));
            }
            ExoPlayerImpl.this.listeners.m2471c(28, new C0380k(5, c0241t0));
            ExoPlayerImpl.this.listeners.m2470b();
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onRenderedFirstFrame(Object obj, long j) {
            ExoPlayerImpl.this.analyticsCollector.onRenderedFirstFrame(obj, j);
            if (ExoPlayerImpl.this.videoOutput == obj) {
                ExoPlayerImpl.this.listeners.m2474f(26, new C0413q(6));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onSkipSilenceEnabledChanged(boolean z7) {
            if (ExoPlayerImpl.this.skipSilenceEnabled == z7) {
                return;
            }
            ExoPlayerImpl.this.skipSilenceEnabled = z7;
            ExoPlayerImpl.this.listeners.m2474f(23, new C0382m(z7, 2));
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener
        public void onSleepingForOffloadChanged(boolean z7) {
            ExoPlayerImpl.this.updateWakeAndWifiLock();
        }

        @Override // androidx.media3.exoplayer.StreamVolumeManager.Listener
        public void onStreamTypeChanged(int i) {
            C0231q c0231qCreateDeviceInfo = ExoPlayerImpl.createDeviceInfo(ExoPlayerImpl.this.streamVolumeManager);
            if (c0231qCreateDeviceInfo.equals(ExoPlayerImpl.this.deviceInfo)) {
                return;
            }
            ExoPlayerImpl.this.deviceInfo = c0231qCreateDeviceInfo;
            ExoPlayerImpl.this.listeners.m2474f(29, new C0380k(8, c0231qCreateDeviceInfo));
        }

        @Override // androidx.media3.exoplayer.StreamVolumeManager.Listener
        public void onStreamVolumeChanged(final int i, final boolean z7) {
            ExoPlayerImpl.this.listeners.m2474f(30, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.v
                @Override // p063h1.InterfaceC1122m
                public final void invoke(Object obj) {
                    ((InterfaceC0185b1) obj).onDeviceVolumeChanged(i, z7);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i4) {
            ExoPlayerImpl.this.setSurfaceTextureInternal(surfaceTexture);
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i, i4);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ExoPlayerImpl.this.setVideoOutputInternal(null);
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i4) {
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i, i4);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoCodecError(Exception exc) {
            ExoPlayerImpl.this.analyticsCollector.onVideoCodecError(exc);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDecoderInitialized(String str, long j, long j8) {
            ExoPlayerImpl.this.analyticsCollector.onVideoDecoderInitialized(str, j, j8);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDecoderReleased(String str) {
            ExoPlayerImpl.this.analyticsCollector.onVideoDecoderReleased(str);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDisabled(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.analyticsCollector.onVideoDisabled(decoderCounters);
            ExoPlayerImpl.this.videoFormat = null;
            ExoPlayerImpl.this.videoDecoderCounters = null;
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoEnabled(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.videoDecoderCounters = decoderCounters;
            ExoPlayerImpl.this.analyticsCollector.onVideoEnabled(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoFrameProcessingOffset(long j, int i) {
            ExoPlayerImpl.this.analyticsCollector.onVideoFrameProcessingOffset(j, i);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoInputFormatChanged(C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation) {
            ExoPlayerImpl.this.videoFormat = c0249w;
            ExoPlayerImpl.this.analyticsCollector.onVideoInputFormatChanged(c0249w, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoSizeChanged(C0194d2 c0194d2) {
            ExoPlayerImpl.this.videoSize = c0194d2;
            ExoPlayerImpl.this.listeners.m2474f(25, new C0380k(7, c0194d2));
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceCreated(Surface surface) {
            ExoPlayerImpl.this.setVideoOutputInternal(surface);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceDestroyed(Surface surface) {
            ExoPlayerImpl.this.setVideoOutputInternal(null);
        }

        @Override // androidx.media3.exoplayer.AudioFocusManager.PlayerControl
        public void setVolumeMultiplier(float f8) {
            ExoPlayerImpl.this.sendVolumeToRenderers();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i4, int i8) {
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i4, i8);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (ExoPlayerImpl.this.surfaceHolderSurfaceIsVideoOutput) {
                ExoPlayerImpl.this.setVideoOutputInternal(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (ExoPlayerImpl.this.surfaceHolderSurfaceIsVideoOutput) {
                ExoPlayerImpl.this.setVideoOutputInternal(null);
            }
            ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(0, 0);
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public void onCues(C1030c c1030c) {
            ExoPlayerImpl.this.currentCueGroup = c1030c;
            ExoPlayerImpl.this.listeners.m2474f(27, new C0380k(3, c1030c));
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class FrameMetadataListener implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {
        public static final int MSG_SET_CAMERA_MOTION_LISTENER = 8;
        public static final int MSG_SET_SPHERICAL_SURFACE_VIEW = 10000;
        public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 7;
        private CameraMotionListener cameraMotionListener;
        private CameraMotionListener internalCameraMotionListener;
        private VideoFrameMetadataListener internalVideoFrameMetadataListener;
        private VideoFrameMetadataListener videoFrameMetadataListener;

        private FrameMetadataListener() {
        }

        @Override // androidx.media3.exoplayer.PlayerMessage.Target
        public void handleMessage(int i, Object obj) {
            if (i == 7) {
                this.videoFrameMetadataListener = (VideoFrameMetadataListener) obj;
                return;
            }
            if (i == 8) {
                this.cameraMotionListener = (CameraMotionListener) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.internalVideoFrameMetadataListener = null;
                this.internalCameraMotionListener = null;
            } else {
                this.internalVideoFrameMetadataListener = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.internalCameraMotionListener = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public void onCameraMotion(long j, float[] fArr) {
            CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotion(j, fArr);
            }
            CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotion(j, fArr);
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public void onCameraMotionReset() {
            CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotionReset();
            }
            CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotionReset();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
        public void onVideoFrameAboutToBeRendered(long j, long j8, C0249w c0249w, MediaFormat mediaFormat) {
            long j9;
            long j10;
            C0249w c0249w2;
            MediaFormat mediaFormat2;
            VideoFrameMetadataListener videoFrameMetadataListener = this.internalVideoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j8, c0249w, mediaFormat);
                mediaFormat2 = mediaFormat;
                c0249w2 = c0249w;
                j10 = j8;
                j9 = j;
            } else {
                j9 = j;
                j10 = j8;
                c0249w2 = c0249w;
                mediaFormat2 = mediaFormat;
            }
            VideoFrameMetadataListener videoFrameMetadataListener2 = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener2 != null) {
                videoFrameMetadataListener2.onVideoFrameAboutToBeRendered(j9, j10, c0249w2, mediaFormat2);
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class MediaSourceHolderSnapshot implements MediaSourceInfoHolder {
        private final MediaSource mediaSource;
        private AbstractC0230p1 timeline;
        private final Object uid;

        public MediaSourceHolderSnapshot(Object obj, MaskingMediaSource maskingMediaSource) {
            this.uid = obj;
            this.mediaSource = maskingMediaSource;
            this.timeline = maskingMediaSource.getTimeline();
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public AbstractC0230p1 getTimeline() {
            return this.timeline;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public Object getUid() {
            return this.uid;
        }

        public void updateTimeline(AbstractC0230p1 abstractC0230p1) {
            this.timeline = abstractC0230p1;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class NoSuitableOutputPlaybackSuppressionAudioDeviceCallback extends AudioDeviceCallback {
        private NoSuitableOutputPlaybackSuppressionAudioDeviceCallback() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (ExoPlayerImpl.this.hasSupportedAudioOutput() && ExoPlayerImpl.this.playbackInfo.playbackSuppressionReason == 3) {
                ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
                exoPlayerImpl.updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(exoPlayerImpl.playbackInfo.playWhenReady, 1, 0);
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (ExoPlayerImpl.this.hasSupportedAudioOutput()) {
                return;
            }
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(exoPlayerImpl.playbackInfo.playWhenReady, 1, 3);
        }
    }

    static {
        AbstractC0229p0.m658a("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public ExoPlayerImpl(ExoPlayer.Builder builder, InterfaceC0193d1 interfaceC0193d1) {
        try {
            AbstractC1101a.m2371v(TAG, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.1] [" + AbstractC1118i0.f4754e + "]");
            this.applicationContext = builder.context.getApplicationContext();
            this.analyticsCollector = (AnalyticsCollector) builder.analyticsCollectorFunction.apply(builder.clock);
            this.priority = builder.priority;
            this.audioAttributes = builder.audioAttributes;
            this.videoScalingMode = builder.videoScalingMode;
            this.videoChangeFrameRateStrategy = builder.videoChangeFrameRateStrategy;
            this.skipSilenceEnabled = builder.skipSilenceEnabled;
            this.detachSurfaceTimeoutMs = builder.detachSurfaceTimeoutMs;
            ComponentListener componentListener = new ComponentListener();
            this.componentListener = componentListener;
            this.frameMetadataListener = new FrameMetadataListener();
            Handler handler = new Handler(builder.looper);
            Renderer[] rendererArrCreateRenderers = ((RenderersFactory) builder.renderersFactorySupplier.get()).createRenderers(handler, componentListener, componentListener, componentListener, componentListener);
            this.renderers = rendererArrCreateRenderers;
            int i = 1;
            AbstractC1101a.m2359j(rendererArrCreateRenderers.length > 0);
            this.trackSelector = (TrackSelector) builder.trackSelectorSupplier.get();
            this.mediaSourceFactory = (MediaSource.Factory) builder.mediaSourceFactorySupplier.get();
            this.bandwidthMeter = (BandwidthMeter) builder.bandwidthMeterSupplier.get();
            this.useLazyPreparation = builder.useLazyPreparation;
            this.seekParameters = builder.seekParameters;
            this.seekBackIncrementMs = builder.seekBackIncrementMs;
            this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
            this.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
            this.pauseAtEndOfMediaItems = builder.pauseAtEndOfMediaItems;
            Looper looper = builder.looper;
            this.applicationLooper = looper;
            InterfaceC1103b interfaceC1103b = builder.clock;
            this.clock = interfaceC1103b;
            this.wrappingPlayer = interfaceC0193d1 == null ? this : interfaceC0193d1;
            this.suppressPlaybackOnUnsuitableOutput = builder.suppressPlaybackOnUnsuitableOutput;
            this.listeners = new C1125p(looper, interfaceC1103b, new C0465t(this, i));
            this.audioOffloadListeners = new CopyOnWriteArraySet<>();
            this.mediaSourceHolderSnapshots = new ArrayList();
            this.shuffleOrder = new ShuffleOrder.DefaultShuffleOrder(0);
            this.preloadConfiguration = ExoPlayer.PreloadConfiguration.DEFAULT;
            this.emptyTrackSelectorResult = new TrackSelectorResult(new RendererConfiguration[rendererArrCreateRenderers.length], new ExoTrackSelection[rendererArrCreateRenderers.length], C0254x1.f1546b, null);
            this.period = new C0221m1();
            C0088j0 c0088j0 = new C0088j0(1);
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i4 = 0; i4 < 20; i4++) {
                c0088j0.m323a(iArr[i4]);
            }
            if (this.trackSelector.isSetParametersSupported()) {
                c0088j0.m323a(29);
            }
            if (builder.deviceVolumeControlEnabled) {
                c0088j0.m323a(23);
            }
            if (builder.deviceVolumeControlEnabled) {
                c0088j0.m323a(25);
            }
            if (builder.deviceVolumeControlEnabled) {
                c0088j0.m323a(33);
            }
            if (builder.deviceVolumeControlEnabled) {
                c0088j0.m323a(26);
            }
            if (builder.deviceVolumeControlEnabled) {
                c0088j0.m323a(34);
            }
            C0243u c0243uM324b = c0088j0.m324b();
            this.permanentAvailableCommands = new C0259z0(c0243uM324b);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i8 = 0; i8 < c0243uM324b.f1421a.size(); i8++) {
                int iM671b = c0243uM324b.m671b(i8);
                AbstractC1101a.m2359j(!false);
                sparseBooleanArray.append(iM671b, true);
            }
            AbstractC1101a.m2359j(!false);
            sparseBooleanArray.append(4, true);
            AbstractC1101a.m2359j(!false);
            sparseBooleanArray.append(10, true);
            AbstractC1101a.m2359j(!false);
            this.availableCommands = new C0259z0(new C0243u(sparseBooleanArray));
            this.playbackInfoUpdateHandler = ((C1135z) this.clock).m2541a(this.applicationLooper, null);
            C0465t c0465t = new C0465t(this, 2);
            this.playbackInfoUpdateListener = c0465t;
            this.playbackInfo = PlaybackInfo.createDummy(this.emptyTrackSelectorResult);
            this.analyticsCollector.setPlayer(this.wrappingPlayer, this.applicationLooper);
            int i9 = AbstractC1118i0.f4750a;
            ExoPlayerImplInternal exoPlayerImplInternal = new ExoPlayerImplInternal(this.renderers, this.trackSelector, this.emptyTrackSelectorResult, (LoadControl) builder.loadControlSupplier.get(), this.bandwidthMeter, this.repeatMode, this.shuffleModeEnabled, this.analyticsCollector, this.seekParameters, builder.livePlaybackSpeedControl, builder.releaseTimeoutMs, this.pauseAtEndOfMediaItems, builder.dynamicSchedulingEnabled, this.applicationLooper, this.clock, c0465t, i9 < 31 ? new PlayerId(builder.playerName) : Api31.registerMediaMetricsListener(this.applicationContext, this, builder.usePlatformDiagnostics, builder.playerName), builder.playbackLooperProvider, this.preloadConfiguration);
            this.internalPlayer = exoPlayerImplInternal;
            this.volume = 1.0f;
            this.repeatMode = 0;
            C0235r0 c0235r0 = C0235r0.f1329K;
            this.mediaMetadata = c0235r0;
            this.playlistMetadata = c0235r0;
            this.staticAndDynamicMediaMetadata = c0235r0;
            int iGenerateAudioSessionId = -1;
            this.maskingWindowIndex = -1;
            AudioManager audioManager = (AudioManager) this.applicationContext.getSystemService("audio");
            if (audioManager != null) {
                iGenerateAudioSessionId = audioManager.generateAudioSessionId();
            }
            this.audioSessionId = iGenerateAudioSessionId;
            this.currentCueGroup = C1030c.f4387b;
            this.throwsWhenUsingWrongThread = true;
            addListener(this.analyticsCollector);
            this.bandwidthMeter.addEventListener(new Handler(this.applicationLooper), this.analyticsCollector);
            addAudioOffloadListener(this.componentListener);
            long j = builder.foregroundModeTimeoutMs;
            if (j > 0) {
                exoPlayerImplInternal.experimentalSetForegroundModeTimeoutMs(j);
            }
            AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(builder.context, handler, this.componentListener);
            this.audioBecomingNoisyManager = audioBecomingNoisyManager;
            audioBecomingNoisyManager.setEnabled(builder.handleAudioBecomingNoisy);
            AudioFocusManager audioFocusManager = new AudioFocusManager(builder.context, handler, this.componentListener);
            this.audioFocusManager = audioFocusManager;
            audioFocusManager.setAudioAttributes(builder.handleAudioFocus ? this.audioAttributes : null);
            SuitableOutputChecker suitableOutputChecker = builder.suitableOutputChecker;
            this.suitableOutputChecker = suitableOutputChecker;
            int i10 = 3;
            if (suitableOutputChecker != null && i9 >= 35) {
                suitableOutputChecker.enable(new C0465t(this, i10));
            } else if (this.suppressPlaybackOnUnsuitableOutput && i9 >= 23) {
                AudioManager audioManager2 = (AudioManager) this.applicationContext.getSystemService("audio");
                this.audioManager = audioManager2;
                Api23.registerAudioDeviceCallback(audioManager2, new NoSuitableOutputPlaybackSuppressionAudioDeviceCallback(), new Handler(this.applicationLooper));
            }
            if (builder.deviceVolumeControlEnabled) {
                Context context = builder.context;
                ComponentListener componentListener2 = this.componentListener;
                this.audioAttributes.getClass();
                this.streamVolumeManager = new StreamVolumeManager(context, handler, componentListener2, 3);
            } else {
                this.streamVolumeManager = null;
            }
            WakeLockManager wakeLockManager = new WakeLockManager(builder.context);
            this.wakeLockManager = wakeLockManager;
            wakeLockManager.setEnabled(builder.wakeMode != 0);
            WifiLockManager wifiLockManager = new WifiLockManager(builder.context);
            this.wifiLockManager = wifiLockManager;
            wifiLockManager.setEnabled(builder.wakeMode == 2);
            this.deviceInfo = createDeviceInfo(this.streamVolumeManager);
            this.videoSize = C0194d2.f1085d;
            this.surfaceSize = C1134y.f4802c;
            this.trackSelector.setAudioAttributes(this.audioAttributes);
            sendRendererMessage(1, 10, Integer.valueOf(this.audioSessionId));
            sendRendererMessage(2, 10, Integer.valueOf(this.audioSessionId));
            sendRendererMessage(1, 3, this.audioAttributes);
            sendRendererMessage(2, 4, Integer.valueOf(this.videoScalingMode));
            sendRendererMessage(2, 5, Integer.valueOf(this.videoChangeFrameRateStrategy));
            sendRendererMessage(1, 9, Boolean.valueOf(this.skipSilenceEnabled));
            sendRendererMessage(2, 7, this.frameMetadataListener);
            sendRendererMessage(6, 8, this.frameMetadataListener);
            sendRendererMessage(16, Integer.valueOf(this.priority));
            this.constructorFinished.m2405c();
        } catch (Throwable th) {
            this.constructorFinished.m2405c();
            throw th;
        }
    }

    private List<MediaSourceList.MediaSourceHolder> addMediaSourceHolders(int i, List<MediaSource> list) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = new MediaSourceList.MediaSourceHolder(list.get(i4), this.useLazyPreparation);
            arrayList.add(mediaSourceHolder);
            this.mediaSourceHolderSnapshots.add(i4 + i, new MediaSourceHolderSnapshot(mediaSourceHolder.uid, mediaSourceHolder.mediaSource));
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndInsert(i, arrayList.size());
        return arrayList;
    }

    private PlaybackInfo addMediaSourcesInternal(PlaybackInfo playbackInfo, int i, List<MediaSource> list) {
        AbstractC0230p1 abstractC0230p1 = playbackInfo.timeline;
        this.pendingOperationAcks++;
        List<MediaSourceList.MediaSourceHolder> listAddMediaSourceHolders = addMediaSourceHolders(i, list);
        AbstractC0230p1 abstractC0230p1CreateMaskingTimeline = createMaskingTimeline();
        PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, abstractC0230p1CreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(abstractC0230p1, abstractC0230p1CreateMaskingTimeline, getCurrentWindowIndexInternal(playbackInfo), getContentPositionInternal(playbackInfo)));
        this.internalPlayer.addMediaSources(i, listAddMediaSourceHolders, this.shuffleOrder);
        return playbackInfoMaskTimelineAndPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0235r0 buildUpdatedMediaMetadata() {
        AbstractC0230p1 currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return this.staticAndDynamicMediaMetadata;
        }
        C0226o0 c0226o0 = currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).f1262c;
        C0232q0 c0232q0M666a = this.staticAndDynamicMediaMetadata.m666a();
        C0235r0 c0235r0 = c0226o0.f1241d;
        if (c0235r0 != null) {
            AbstractC0983m0 abstractC0983m0 = c0235r0.f1374J;
            byte[] bArr = c0235r0.f1385k;
            CharSequence charSequence = c0235r0.f1375a;
            if (charSequence != null) {
                c0232q0M666a.f1291a = charSequence;
            }
            CharSequence charSequence2 = c0235r0.f1376b;
            if (charSequence2 != null) {
                c0232q0M666a.f1292b = charSequence2;
            }
            CharSequence charSequence3 = c0235r0.f1377c;
            if (charSequence3 != null) {
                c0232q0M666a.f1293c = charSequence3;
            }
            CharSequence charSequence4 = c0235r0.f1378d;
            if (charSequence4 != null) {
                c0232q0M666a.f1294d = charSequence4;
            }
            CharSequence charSequence5 = c0235r0.f1379e;
            if (charSequence5 != null) {
                c0232q0M666a.f1295e = charSequence5;
            }
            CharSequence charSequence6 = c0235r0.f1380f;
            if (charSequence6 != null) {
                c0232q0M666a.f1296f = charSequence6;
            }
            CharSequence charSequence7 = c0235r0.f1381g;
            if (charSequence7 != null) {
                c0232q0M666a.f1297g = charSequence7;
            }
            Long l8 = c0235r0.f1382h;
            if (l8 != null) {
                AbstractC1101a.m2353d(l8.longValue() >= 0);
                c0232q0M666a.f1298h = l8;
            }
            AbstractC0206h1 abstractC0206h1 = c0235r0.f1383i;
            if (abstractC0206h1 != null) {
                c0232q0M666a.f1299i = abstractC0206h1;
            }
            AbstractC0206h1 abstractC0206h12 = c0235r0.f1384j;
            if (abstractC0206h12 != null) {
                c0232q0M666a.f1300j = abstractC0206h12;
            }
            Uri uri = c0235r0.f1387m;
            if (uri != null || bArr != null) {
                c0232q0M666a.f1303m = uri;
                Integer num = c0235r0.f1386l;
                c0232q0M666a.f1301k = bArr == null ? null : (byte[]) bArr.clone();
                c0232q0M666a.f1302l = num;
            }
            Integer num2 = c0235r0.f1388n;
            if (num2 != null) {
                c0232q0M666a.f1304n = num2;
            }
            Integer num3 = c0235r0.f1389o;
            if (num3 != null) {
                c0232q0M666a.f1305o = num3;
            }
            Integer num4 = c0235r0.f1390p;
            if (num4 != null) {
                c0232q0M666a.f1306p = num4;
            }
            Boolean bool = c0235r0.f1391q;
            if (bool != null) {
                c0232q0M666a.f1307q = bool;
            }
            Boolean bool2 = c0235r0.f1392r;
            if (bool2 != null) {
                c0232q0M666a.f1308r = bool2;
            }
            Integer num5 = c0235r0.f1393s;
            if (num5 != null) {
                c0232q0M666a.f1309s = num5;
            }
            Integer num6 = c0235r0.f1394t;
            if (num6 != null) {
                c0232q0M666a.f1309s = num6;
            }
            Integer num7 = c0235r0.f1395u;
            if (num7 != null) {
                c0232q0M666a.f1310t = num7;
            }
            Integer num8 = c0235r0.f1396v;
            if (num8 != null) {
                c0232q0M666a.f1311u = num8;
            }
            Integer num9 = c0235r0.f1397w;
            if (num9 != null) {
                c0232q0M666a.f1312v = num9;
            }
            Integer num10 = c0235r0.f1398x;
            if (num10 != null) {
                c0232q0M666a.f1313w = num10;
            }
            Integer num11 = c0235r0.f1399y;
            if (num11 != null) {
                c0232q0M666a.f1314x = num11;
            }
            CharSequence charSequence8 = c0235r0.f1400z;
            if (charSequence8 != null) {
                c0232q0M666a.f1315y = charSequence8;
            }
            CharSequence charSequence9 = c0235r0.f1365A;
            if (charSequence9 != null) {
                c0232q0M666a.f1316z = charSequence9;
            }
            CharSequence charSequence10 = c0235r0.f1366B;
            if (charSequence10 != null) {
                c0232q0M666a.f1282A = charSequence10;
            }
            Integer num12 = c0235r0.f1367C;
            if (num12 != null) {
                c0232q0M666a.f1283B = num12;
            }
            Integer num13 = c0235r0.f1368D;
            if (num13 != null) {
                c0232q0M666a.f1284C = num13;
            }
            CharSequence charSequence11 = c0235r0.f1369E;
            if (charSequence11 != null) {
                c0232q0M666a.f1285D = charSequence11;
            }
            CharSequence charSequence12 = c0235r0.f1370F;
            if (charSequence12 != null) {
                c0232q0M666a.f1286E = charSequence12;
            }
            CharSequence charSequence13 = c0235r0.f1371G;
            if (charSequence13 != null) {
                c0232q0M666a.f1287F = charSequence13;
            }
            Integer num14 = c0235r0.f1372H;
            if (num14 != null) {
                c0232q0M666a.f1288G = num14;
            }
            Bundle bundle = c0235r0.f1373I;
            if (bundle != null) {
                c0232q0M666a.f1289H = bundle;
            }
            if (!abstractC0983m0.isEmpty()) {
                c0232q0M666a.f1290I = AbstractC0983m0.m2165j(abstractC0983m0);
            }
        }
        return new C0235r0(c0232q0M666a);
    }

    private boolean canUpdateMediaSourcesWithMediaItems(int i, int i4, List<C0226o0> list) {
        if (i4 - i != list.size()) {
            return false;
        }
        for (int i8 = i; i8 < i4; i8++) {
            if (!this.mediaSourceHolderSnapshots.get(i8).mediaSource.canUpdateMediaItem(list.get(i8 - i))) {
                return false;
            }
        }
        return true;
    }

    private int computePlaybackSuppressionReason(boolean z7, int i) {
        if (i == 0) {
            return 1;
        }
        if (!this.suppressPlaybackOnUnsuitableOutput) {
            return 0;
        }
        if (!z7 || hasSupportedAudioOutput()) {
            return (z7 || this.playbackInfo.playbackSuppressionReason != 3) ? 0 : 3;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C0231q createDeviceInfo(StreamVolumeManager streamVolumeManager) {
        C0228p c0228p = new C0228p();
        c0228p.f1276a = streamVolumeManager != null ? streamVolumeManager.getMinVolume() : 0;
        int maxVolume = streamVolumeManager != null ? streamVolumeManager.getMaxVolume() : 0;
        c0228p.f1277b = maxVolume;
        AbstractC1101a.m2353d(c0228p.f1276a <= maxVolume);
        return new C0231q(c0228p);
    }

    private AbstractC0230p1 createMaskingTimeline() {
        return new PlaylistTimeline(this.mediaSourceHolderSnapshots, this.shuffleOrder);
    }

    private List<MediaSource> createMediaSources(List<C0226o0> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.mediaSourceFactory.createMediaSource(list.get(i)));
        }
        return arrayList;
    }

    private PlayerMessage createMessageInternal(PlayerMessage.Target target) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        ExoPlayerImplInternal exoPlayerImplInternal = this.internalPlayer;
        AbstractC0230p1 abstractC0230p1 = this.playbackInfo.timeline;
        if (currentWindowIndexInternal == -1) {
            currentWindowIndexInternal = 0;
        }
        return new PlayerMessage(exoPlayerImplInternal, target, abstractC0230p1, currentWindowIndexInternal, this.clock, exoPlayerImplInternal.getPlaybackLooper());
    }

    private Pair<Boolean, Integer> evaluateMediaItemTransitionReason(PlaybackInfo playbackInfo, PlaybackInfo playbackInfo2, boolean z7, int i, boolean z8, boolean z9) {
        AbstractC0230p1 abstractC0230p1 = playbackInfo2.timeline;
        AbstractC0230p1 abstractC0230p12 = playbackInfo.timeline;
        if (abstractC0230p12.isEmpty() && abstractC0230p1.isEmpty()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i4 = 3;
        if (abstractC0230p12.isEmpty() != abstractC0230p1.isEmpty()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (abstractC0230p1.getWindow(abstractC0230p1.getPeriodByUid(playbackInfo2.periodId.periodUid, this.period).f1206c, this.window).f1260a.equals(abstractC0230p12.getWindow(abstractC0230p12.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).f1206c, this.window).f1260a)) {
            return (z7 && i == 0 && playbackInfo2.periodId.windowSequenceNumber < playbackInfo.periodId.windowSequenceNumber) ? new Pair<>(Boolean.TRUE, 0) : (z7 && i == 1 && z9) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z7 && i == 0) {
            i4 = 1;
        } else if (z7 && i == 1) {
            i4 = 2;
        } else if (!z8) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i4));
    }

    private long getContentPositionInternal(PlaybackInfo playbackInfo) {
        if (!playbackInfo.periodId.isAd()) {
            return AbstractC1118i0.m2447f0(getCurrentPositionUsInternal(playbackInfo));
        }
        playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period);
        if (playbackInfo.requestedContentPositionUs == -9223372036854775807L) {
            return AbstractC1118i0.m2447f0(playbackInfo.timeline.getWindow(getCurrentWindowIndexInternal(playbackInfo), this.window).f1271l);
        }
        return AbstractC1118i0.m2447f0(playbackInfo.requestedContentPositionUs) + AbstractC1118i0.m2447f0(this.period.f1208e);
    }

    private long getCurrentPositionUsInternal(PlaybackInfo playbackInfo) {
        if (playbackInfo.timeline.isEmpty()) {
            return AbstractC1118i0.m2428S(this.maskingWindowPositionMs);
        }
        long estimatedPositionUs = playbackInfo.sleepingForOffload ? playbackInfo.getEstimatedPositionUs() : playbackInfo.positionUs;
        return playbackInfo.periodId.isAd() ? estimatedPositionUs : periodPositionUsToWindowPositionUs(playbackInfo.timeline, playbackInfo.periodId, estimatedPositionUs);
    }

    private int getCurrentWindowIndexInternal(PlaybackInfo playbackInfo) {
        return playbackInfo.timeline.isEmpty() ? this.maskingWindowIndex : playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).f1206c;
    }

    private Pair<Object, Long> getPeriodPositionUsAfterTimelineChanged(AbstractC0230p1 abstractC0230p1, AbstractC0230p1 abstractC0230p12, int i, long j) {
        if (abstractC0230p1.isEmpty() || abstractC0230p12.isEmpty()) {
            boolean z7 = !abstractC0230p1.isEmpty() && abstractC0230p12.isEmpty();
            return maskWindowPositionMsOrGetPeriodPositionUs(abstractC0230p12, z7 ? -1 : i, z7 ? -9223372036854775807L : j);
        }
        Pair<Object, Long> periodPositionUs = abstractC0230p1.getPeriodPositionUs(this.window, this.period, i, AbstractC1118i0.m2428S(j));
        Object obj = periodPositionUs.first;
        if (abstractC0230p12.getIndexOfPeriod(obj) != -1) {
            return periodPositionUs;
        }
        int iResolveSubsequentPeriod = ExoPlayerImplInternal.resolveSubsequentPeriod(this.window, this.period, this.repeatMode, this.shuffleModeEnabled, obj, abstractC0230p1, abstractC0230p12);
        return iResolveSubsequentPeriod != -1 ? maskWindowPositionMsOrGetPeriodPositionUs(abstractC0230p12, iResolveSubsequentPeriod, AbstractC1118i0.m2447f0(abstractC0230p12.getWindow(iResolveSubsequentPeriod, this.window).f1271l)) : maskWindowPositionMsOrGetPeriodPositionUs(abstractC0230p12, -1, -9223372036854775807L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPlayWhenReadyChangeReason(int i) {
        return i == -1 ? 2 : 1;
    }

    private C0189c1 getPositionInfo(long j) {
        Object obj;
        int indexOfPeriod;
        C0226o0 c0226o0;
        Object obj2;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (this.playbackInfo.timeline.isEmpty()) {
            obj = null;
            indexOfPeriod = -1;
            c0226o0 = null;
            obj2 = null;
        } else {
            PlaybackInfo playbackInfo = this.playbackInfo;
            Object obj3 = playbackInfo.periodId.periodUid;
            playbackInfo.timeline.getPeriodByUid(obj3, this.period);
            indexOfPeriod = this.playbackInfo.timeline.getIndexOfPeriod(obj3);
            obj2 = obj3;
            obj = this.playbackInfo.timeline.getWindow(currentMediaItemIndex, this.window).f1260a;
            c0226o0 = this.window.f1262c;
        }
        int i = indexOfPeriod;
        long jM2447f0 = AbstractC1118i0.m2447f0(j);
        long jM2447f02 = this.playbackInfo.periodId.isAd() ? AbstractC1118i0.m2447f0(getRequestedContentPositionUs(this.playbackInfo)) : jM2447f0;
        MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
        return new C0189c1(obj, currentMediaItemIndex, c0226o0, obj2, i, jM2447f0, jM2447f02, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
    }

    private C0189c1 getPreviousPositionInfo(int i, PlaybackInfo playbackInfo, int i4) {
        int i8;
        Object obj;
        C0226o0 c0226o0;
        Object obj2;
        int i9;
        long requestedContentPositionUs;
        long requestedContentPositionUs2;
        C0221m1 c0221m1 = new C0221m1();
        if (playbackInfo.timeline.isEmpty()) {
            i8 = i4;
            obj = null;
            c0226o0 = null;
            obj2 = null;
            i9 = -1;
        } else {
            Object obj3 = playbackInfo.periodId.periodUid;
            playbackInfo.timeline.getPeriodByUid(obj3, c0221m1);
            int i10 = c0221m1.f1206c;
            int indexOfPeriod = playbackInfo.timeline.getIndexOfPeriod(obj3);
            Object obj4 = playbackInfo.timeline.getWindow(i10, this.window).f1260a;
            c0226o0 = this.window.f1262c;
            obj2 = obj3;
            i9 = indexOfPeriod;
            obj = obj4;
            i8 = i10;
        }
        if (i == 0) {
            if (playbackInfo.periodId.isAd()) {
                MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
                requestedContentPositionUs = c0221m1.m636a(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
                requestedContentPositionUs2 = getRequestedContentPositionUs(playbackInfo);
            } else {
                requestedContentPositionUs = playbackInfo.periodId.nextAdGroupIndex != -1 ? getRequestedContentPositionUs(this.playbackInfo) : c0221m1.f1208e + c0221m1.f1207d;
                requestedContentPositionUs2 = requestedContentPositionUs;
            }
        } else if (playbackInfo.periodId.isAd()) {
            requestedContentPositionUs = playbackInfo.positionUs;
            requestedContentPositionUs2 = getRequestedContentPositionUs(playbackInfo);
        } else {
            requestedContentPositionUs = c0221m1.f1208e + playbackInfo.positionUs;
            requestedContentPositionUs2 = requestedContentPositionUs;
        }
        long jM2447f0 = AbstractC1118i0.m2447f0(requestedContentPositionUs);
        long jM2447f02 = AbstractC1118i0.m2447f0(requestedContentPositionUs2);
        MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
        return new C0189c1(obj, i8, c0226o0, obj2, i9, jM2447f0, jM2447f02, mediaPeriodId2.adGroupIndex, mediaPeriodId2.adIndexInAdGroup);
    }

    private static long getRequestedContentPositionUs(PlaybackInfo playbackInfo) {
        C0227o1 c0227o1 = new C0227o1();
        C0221m1 c0221m1 = new C0221m1();
        playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, c0221m1);
        long j = playbackInfo.requestedContentPositionUs;
        return j == -9223372036854775807L ? playbackInfo.timeline.getWindow(c0221m1.f1206c, c0227o1).f1271l : c0221m1.f1208e + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handlePlaybackInfo, reason: merged with bridge method [inline-methods] */
    public void lambda$new$1(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        boolean z7;
        long jPeriodPositionUsToWindowPositionUs;
        int i = this.pendingOperationAcks - playbackInfoUpdate.operationAcks;
        this.pendingOperationAcks = i;
        boolean z8 = true;
        if (playbackInfoUpdate.positionDiscontinuity) {
            this.pendingDiscontinuityReason = playbackInfoUpdate.discontinuityReason;
            this.pendingDiscontinuity = true;
        }
        if (i == 0) {
            AbstractC0230p1 abstractC0230p1 = playbackInfoUpdate.playbackInfo.timeline;
            if (!this.playbackInfo.timeline.isEmpty() && abstractC0230p1.isEmpty()) {
                this.maskingWindowIndex = -1;
                this.maskingWindowPositionMs = 0L;
                this.maskingPeriodIndex = 0;
            }
            if (!abstractC0230p1.isEmpty()) {
                List<AbstractC0230p1> childTimelines = ((PlaylistTimeline) abstractC0230p1).getChildTimelines();
                AbstractC1101a.m2359j(childTimelines.size() == this.mediaSourceHolderSnapshots.size());
                for (int i4 = 0; i4 < childTimelines.size(); i4++) {
                    this.mediaSourceHolderSnapshots.get(i4).updateTimeline(childTimelines.get(i4));
                }
            }
            long j = -9223372036854775807L;
            if (this.pendingDiscontinuity) {
                if (playbackInfoUpdate.playbackInfo.periodId.equals(this.playbackInfo.periodId) && playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs == this.playbackInfo.positionUs) {
                    z8 = false;
                }
                if (z8) {
                    if (abstractC0230p1.isEmpty() || playbackInfoUpdate.playbackInfo.periodId.isAd()) {
                        jPeriodPositionUsToWindowPositionUs = playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs;
                    } else {
                        PlaybackInfo playbackInfo = playbackInfoUpdate.playbackInfo;
                        jPeriodPositionUsToWindowPositionUs = periodPositionUsToWindowPositionUs(abstractC0230p1, playbackInfo.periodId, playbackInfo.discontinuityStartPositionUs);
                    }
                    j = jPeriodPositionUsToWindowPositionUs;
                }
                z7 = z8;
            } else {
                z7 = false;
            }
            this.pendingDiscontinuity = false;
            updatePlaybackInfo(playbackInfoUpdate.playbackInfo, 1, z7, this.pendingDiscontinuityReason, j, -1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasSupportedAudioOutput() {
        AudioManager audioManager;
        SuitableOutputChecker suitableOutputChecker;
        int i = AbstractC1118i0.f4750a;
        if (i >= 35 && (suitableOutputChecker = this.suitableOutputChecker) != null) {
            return suitableOutputChecker.isSelectedOutputSuitableForPlayback();
        }
        if (i < 23 || (audioManager = this.audioManager) == null) {
            return true;
        }
        return Api23.isSuitableExternalAudioOutputPresentInAudioDeviceInfoList(this.applicationContext, audioManager.getDevices(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(InterfaceC0185b1 interfaceC0185b1, C0243u c0243u) {
        interfaceC0185b1.onEvents(this.wrappingPlayer, new C0171a1(c0243u));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        ((C1104b0) this.playbackInfoUpdateHandler).m2382e(new RunnableC0414s(this, 0, playbackInfoUpdate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$release$5(InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onPlayerError(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlaylistMetadata$7(InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onPlaylistMetadataChanged(this.playlistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateAvailableCommands$26(InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onAvailableCommandsChanged(this.availableCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$12(PlaybackInfo playbackInfo, int i, InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onTimelineChanged(playbackInfo.timeline, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$13(int i, C0189c1 c0189c1, C0189c1 c0189c12, InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onPositionDiscontinuity(i);
        interfaceC0185b1.onPositionDiscontinuity(c0189c1, c0189c12, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$15(PlaybackInfo playbackInfo, InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onPlayerErrorChanged(playbackInfo.playbackError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$16(PlaybackInfo playbackInfo, InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onPlayerError(playbackInfo.playbackError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$17(PlaybackInfo playbackInfo, InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onTracksChanged(playbackInfo.trackSelectorResult.tracks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$19(PlaybackInfo playbackInfo, InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onLoadingChanged(playbackInfo.isLoading);
        interfaceC0185b1.onIsLoadingChanged(playbackInfo.isLoading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$20(PlaybackInfo playbackInfo, InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onPlayerStateChanged(playbackInfo.playWhenReady, playbackInfo.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$21(PlaybackInfo playbackInfo, InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onPlaybackStateChanged(playbackInfo.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$22(PlaybackInfo playbackInfo, InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onPlayWhenReadyChanged(playbackInfo.playWhenReady, playbackInfo.playWhenReadyChangeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$23(PlaybackInfo playbackInfo, InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onPlaybackSuppressionReasonChanged(playbackInfo.playbackSuppressionReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$24(PlaybackInfo playbackInfo, InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onIsPlayingChanged(playbackInfo.isPlaying());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$25(PlaybackInfo playbackInfo, InterfaceC0185b1 interfaceC0185b1) {
        interfaceC0185b1.onPlaybackParametersChanged(playbackInfo.playbackParameters);
    }

    private PlaybackInfo maskTimelineAndPosition(PlaybackInfo playbackInfo, AbstractC0230p1 abstractC0230p1, Pair<Object, Long> pair) {
        List<C0241t0> list;
        AbstractC1101a.m2353d(abstractC0230p1.isEmpty() || pair != null);
        AbstractC0230p1 abstractC0230p12 = playbackInfo.timeline;
        long contentPositionInternal = getContentPositionInternal(playbackInfo);
        PlaybackInfo playbackInfoCopyWithTimeline = playbackInfo.copyWithTimeline(abstractC0230p1);
        if (abstractC0230p1.isEmpty()) {
            MediaSource.MediaPeriodId dummyPeriodForEmptyTimeline = PlaybackInfo.getDummyPeriodForEmptyTimeline();
            long jM2428S = AbstractC1118i0.m2428S(this.maskingWindowPositionMs);
            TrackGroupArray trackGroupArray = TrackGroupArray.EMPTY;
            TrackSelectorResult trackSelectorResult = this.emptyTrackSelectorResult;
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId = playbackInfoCopyWithTimeline.copyWithNewPosition(dummyPeriodForEmptyTimeline, jM2428S, jM2428S, jM2428S, 0L, trackGroupArray, trackSelectorResult, C0981l1.f4211n).copyWithLoadingMediaPeriodId(dummyPeriodForEmptyTimeline);
            playbackInfoCopyWithLoadingMediaPeriodId.bufferedPositionUs = playbackInfoCopyWithLoadingMediaPeriodId.positionUs;
            return playbackInfoCopyWithLoadingMediaPeriodId;
        }
        Object obj = playbackInfoCopyWithTimeline.periodId.periodUid;
        int i = AbstractC1118i0.f4750a;
        boolean zEquals = obj.equals(pair.first);
        MediaSource.MediaPeriodId mediaPeriodId = !zEquals ? new MediaSource.MediaPeriodId(pair.first) : playbackInfoCopyWithTimeline.periodId;
        long jLongValue = ((Long) pair.second).longValue();
        long jM2428S2 = AbstractC1118i0.m2428S(contentPositionInternal);
        if (!abstractC0230p12.isEmpty()) {
            jM2428S2 -= abstractC0230p12.getPeriodByUid(obj, this.period).f1208e;
        }
        if (!zEquals || jLongValue < jM2428S2) {
            MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
            AbstractC1101a.m2359j(!mediaPeriodId2.isAd());
            TrackGroupArray trackGroupArray2 = !zEquals ? TrackGroupArray.EMPTY : playbackInfoCopyWithTimeline.trackGroups;
            TrackSelectorResult trackSelectorResult2 = !zEquals ? this.emptyTrackSelectorResult : playbackInfoCopyWithTimeline.trackSelectorResult;
            if (zEquals) {
                list = playbackInfoCopyWithTimeline.staticMetadata;
            } else {
                C0977k0 c0977k02 = AbstractC0983m0.f4215k;
                list = C0981l1.f4211n;
            }
            PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId2 = playbackInfoCopyWithTimeline.copyWithNewPosition(mediaPeriodId2, jLongValue, jLongValue, jLongValue, 0L, trackGroupArray2, trackSelectorResult2, list).copyWithLoadingMediaPeriodId(mediaPeriodId2);
            playbackInfoCopyWithLoadingMediaPeriodId2.bufferedPositionUs = jLongValue;
            return playbackInfoCopyWithLoadingMediaPeriodId2;
        }
        if (jLongValue != jM2428S2) {
            MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId;
            AbstractC1101a.m2359j(!mediaPeriodId3.isAd());
            long jMax = Math.max(0L, playbackInfoCopyWithTimeline.totalBufferedDurationUs - (jLongValue - jM2428S2));
            long j = playbackInfoCopyWithTimeline.bufferedPositionUs;
            if (playbackInfoCopyWithTimeline.loadingMediaPeriodId.equals(playbackInfoCopyWithTimeline.periodId)) {
                j = jLongValue + jMax;
            }
            PlaybackInfo playbackInfoCopyWithNewPosition = playbackInfoCopyWithTimeline.copyWithNewPosition(mediaPeriodId3, jLongValue, jLongValue, jLongValue, jMax, playbackInfoCopyWithTimeline.trackGroups, playbackInfoCopyWithTimeline.trackSelectorResult, playbackInfoCopyWithTimeline.staticMetadata);
            playbackInfoCopyWithNewPosition.bufferedPositionUs = j;
            return playbackInfoCopyWithNewPosition;
        }
        int indexOfPeriod = abstractC0230p1.getIndexOfPeriod(playbackInfoCopyWithTimeline.loadingMediaPeriodId.periodUid);
        if (indexOfPeriod != -1 && abstractC0230p1.getPeriod(indexOfPeriod, this.period).f1206c == abstractC0230p1.getPeriodByUid(mediaPeriodId.periodUid, this.period).f1206c) {
            return playbackInfoCopyWithTimeline;
        }
        abstractC0230p1.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        long jM636a = mediaPeriodId.isAd() ? this.period.m636a(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) : this.period.f1207d;
        MediaSource.MediaPeriodId mediaPeriodId4 = mediaPeriodId;
        PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId3 = playbackInfoCopyWithTimeline.copyWithNewPosition(mediaPeriodId4, playbackInfoCopyWithTimeline.positionUs, playbackInfoCopyWithTimeline.positionUs, playbackInfoCopyWithTimeline.discontinuityStartPositionUs, jM636a - playbackInfoCopyWithTimeline.positionUs, playbackInfoCopyWithTimeline.trackGroups, playbackInfoCopyWithTimeline.trackSelectorResult, playbackInfoCopyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId4);
        playbackInfoCopyWithLoadingMediaPeriodId3.bufferedPositionUs = jM636a;
        return playbackInfoCopyWithLoadingMediaPeriodId3;
    }

    private Pair<Object, Long> maskWindowPositionMsOrGetPeriodPositionUs(AbstractC0230p1 abstractC0230p1, int i, long j) {
        if (abstractC0230p1.isEmpty()) {
            this.maskingWindowIndex = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.maskingWindowPositionMs = j;
            this.maskingPeriodIndex = 0;
            return null;
        }
        if (i == -1 || i >= abstractC0230p1.getWindowCount()) {
            i = abstractC0230p1.getFirstWindowIndex(this.shuffleModeEnabled);
            j = AbstractC1118i0.m2447f0(abstractC0230p1.getWindow(i, this.window).f1271l);
        }
        return abstractC0230p1.getPeriodPositionUs(this.window, this.period, i, AbstractC1118i0.m2428S(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeNotifySurfaceSizeChanged(final int i, final int i4) {
        C1134y c1134y = this.surfaceSize;
        if (i == c1134y.f4803a && i4 == c1134y.f4804b) {
            return;
        }
        this.surfaceSize = new C1134y(i, i4);
        this.listeners.m2474f(24, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.o
            @Override // p063h1.InterfaceC1122m
            public final void invoke(Object obj) {
                ((InterfaceC0185b1) obj).onSurfaceSizeChanged(i, i4);
            }
        });
        sendRendererMessage(2, 14, new C1134y(i, i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSelectedOutputSuitabilityChanged(boolean z7) {
        if (!z7) {
            updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(this.playbackInfo.playWhenReady, 1, 3);
            return;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackSuppressionReason == 3) {
            updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(playbackInfo.playWhenReady, 1, 0);
        }
    }

    private long periodPositionUsToWindowPositionUs(AbstractC0230p1 abstractC0230p1, MediaSource.MediaPeriodId mediaPeriodId, long j) {
        abstractC0230p1.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return j + this.period.f1208e;
    }

    private PlaybackInfo removeMediaItemsInternal(PlaybackInfo playbackInfo, int i, int i4) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(playbackInfo);
        long contentPositionInternal = getContentPositionInternal(playbackInfo);
        AbstractC0230p1 abstractC0230p1 = playbackInfo.timeline;
        int size = this.mediaSourceHolderSnapshots.size();
        this.pendingOperationAcks++;
        removeMediaSourceHolders(i, i4);
        AbstractC0230p1 abstractC0230p1CreateMaskingTimeline = createMaskingTimeline();
        PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, abstractC0230p1CreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(abstractC0230p1, abstractC0230p1CreateMaskingTimeline, currentWindowIndexInternal, contentPositionInternal));
        int i8 = playbackInfoMaskTimelineAndPosition.playbackState;
        if (i8 != 1 && i8 != 4 && i < i4 && i4 == size && currentWindowIndexInternal >= playbackInfoMaskTimelineAndPosition.timeline.getWindowCount()) {
            playbackInfoMaskTimelineAndPosition = playbackInfoMaskTimelineAndPosition.copyWithPlaybackState(4);
        }
        this.internalPlayer.removeMediaSources(i, i4, this.shuffleOrder);
        return playbackInfoMaskTimelineAndPosition;
    }

    private void removeMediaSourceHolders(int i, int i4) {
        for (int i8 = i4 - 1; i8 >= i; i8--) {
            this.mediaSourceHolderSnapshots.remove(i8);
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i, i4);
    }

    private void removeSurfaceCallbacks() {
        if (this.sphericalGLSurfaceView != null) {
            createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(null).send();
            this.sphericalGLSurfaceView.removeVideoSurfaceListener(this.componentListener);
            this.sphericalGLSurfaceView = null;
        }
        TextureView textureView = this.textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.componentListener) {
                AbstractC1101a.m2348F(TAG, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.textureView.setSurfaceTextureListener(null);
            }
            this.textureView = null;
        }
        SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.componentListener);
            this.surfaceHolder = null;
        }
    }

    private void sendRendererMessage(int i, Object obj) {
        sendRendererMessage(-1, i, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendVolumeToRenderers() {
        sendRendererMessage(1, 2, Float.valueOf(this.volume * this.audioFocusManager.getVolumeMultiplier()));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setMediaSourcesInternal(List<MediaSource> list, int i, long j, boolean z7) {
        long j8;
        int i4;
        int i8;
        int firstWindowIndex = i;
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        long currentPosition = getCurrentPosition();
        this.pendingOperationAcks++;
        if (!this.mediaSourceHolderSnapshots.isEmpty()) {
            removeMediaSourceHolders(0, this.mediaSourceHolderSnapshots.size());
        }
        List<MediaSourceList.MediaSourceHolder> listAddMediaSourceHolders = addMediaSourceHolders(0, list);
        AbstractC0230p1 abstractC0230p1CreateMaskingTimeline = createMaskingTimeline();
        if (!abstractC0230p1CreateMaskingTimeline.isEmpty() && firstWindowIndex >= abstractC0230p1CreateMaskingTimeline.getWindowCount()) {
            throw new C0255y();
        }
        if (z7) {
            firstWindowIndex = abstractC0230p1CreateMaskingTimeline.getFirstWindowIndex(this.shuffleModeEnabled);
            j8 = -9223372036854775807L;
        } else {
            if (firstWindowIndex == -1) {
                i4 = currentWindowIndexInternal;
                j8 = currentPosition;
                PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, abstractC0230p1CreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(abstractC0230p1CreateMaskingTimeline, i4, j8));
                i8 = playbackInfoMaskTimelineAndPosition.playbackState;
                if (i4 != -1 && i8 != 1) {
                    i8 = (!abstractC0230p1CreateMaskingTimeline.isEmpty() || i4 >= abstractC0230p1CreateMaskingTimeline.getWindowCount()) ? 4 : 2;
                }
                PlaybackInfo playbackInfoCopyWithPlaybackState = playbackInfoMaskTimelineAndPosition.copyWithPlaybackState(i8);
                this.internalPlayer.setMediaSources(listAddMediaSourceHolders, i4, AbstractC1118i0.m2428S(j8), this.shuffleOrder);
                updatePlaybackInfo(playbackInfoCopyWithPlaybackState, 0, this.playbackInfo.periodId.periodUid.equals(playbackInfoCopyWithPlaybackState.periodId.periodUid) && !this.playbackInfo.timeline.isEmpty(), 4, getCurrentPositionUsInternal(playbackInfoCopyWithPlaybackState), -1, false);
            }
            j8 = j;
        }
        i4 = firstWindowIndex;
        PlaybackInfo playbackInfoMaskTimelineAndPosition2 = maskTimelineAndPosition(this.playbackInfo, abstractC0230p1CreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(abstractC0230p1CreateMaskingTimeline, i4, j8));
        i8 = playbackInfoMaskTimelineAndPosition2.playbackState;
        if (i4 != -1) {
            if (abstractC0230p1CreateMaskingTimeline.isEmpty()) {
            }
        }
        PlaybackInfo playbackInfoCopyWithPlaybackState2 = playbackInfoMaskTimelineAndPosition2.copyWithPlaybackState(i8);
        this.internalPlayer.setMediaSources(listAddMediaSourceHolders, i4, AbstractC1118i0.m2428S(j8), this.shuffleOrder);
        updatePlaybackInfo(playbackInfoCopyWithPlaybackState2, 0, this.playbackInfo.periodId.periodUid.equals(playbackInfoCopyWithPlaybackState2.periodId.periodUid) && !this.playbackInfo.timeline.isEmpty(), 4, getCurrentPositionUsInternal(playbackInfoCopyWithPlaybackState2), -1, false);
    }

    private void setNonVideoOutputSurfaceHolderInternal(SurfaceHolder surfaceHolder) {
        this.surfaceHolderSurfaceIsVideoOutput = false;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        Surface surface = this.surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            Rect surfaceFrame = this.surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfaceTextureInternal(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        setVideoOutputInternal(surface);
        this.ownedSurface = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoOutputInternal(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (Renderer renderer : this.renderers) {
            if (renderer.getTrackType() == 2) {
                arrayList.add(createMessageInternal(renderer).setType(1).setPayload(obj).send());
            }
        }
        Object obj2 = this.videoOutput;
        if (obj2 != null && obj2 != obj) {
            try {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    ((PlayerMessage) obj3).blockUntilDelivered(this.detachSurfaceTimeoutMs);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z7 = true;
            }
            Object obj4 = this.videoOutput;
            Surface surface = this.ownedSurface;
            if (obj4 == surface) {
                surface.release();
                this.ownedSurface = null;
            }
        }
        this.videoOutput = obj;
        if (z7) {
            stopInternal(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(3), 1003));
        }
    }

    private void stopInternal(ExoPlaybackException exoPlaybackException) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId = playbackInfo.copyWithLoadingMediaPeriodId(playbackInfo.periodId);
        playbackInfoCopyWithLoadingMediaPeriodId.bufferedPositionUs = playbackInfoCopyWithLoadingMediaPeriodId.positionUs;
        playbackInfoCopyWithLoadingMediaPeriodId.totalBufferedDurationUs = 0L;
        PlaybackInfo playbackInfoCopyWithPlaybackState = playbackInfoCopyWithLoadingMediaPeriodId.copyWithPlaybackState(1);
        if (exoPlaybackException != null) {
            playbackInfoCopyWithPlaybackState = playbackInfoCopyWithPlaybackState.copyWithPlaybackError(exoPlaybackException);
        }
        this.pendingOperationAcks++;
        this.internalPlayer.stop();
        updatePlaybackInfo(playbackInfoCopyWithPlaybackState, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void updateAvailableCommands() {
        C0259z0 c0259z0 = this.availableCommands;
        InterfaceC0193d1 interfaceC0193d1 = this.wrappingPlayer;
        C0259z0 c0259z02 = this.permanentAvailableCommands;
        int i = AbstractC1118i0.f4750a;
        boolean zIsPlayingAd = interfaceC0193d1.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = interfaceC0193d1.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = interfaceC0193d1.hasPreviousMediaItem();
        boolean zHasNextMediaItem = interfaceC0193d1.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = interfaceC0193d1.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = interfaceC0193d1.isCurrentMediaItemDynamic();
        boolean zIsEmpty = interfaceC0193d1.getCurrentTimeline().isEmpty();
        C0036o c0036o = new C0036o(10);
        C0088j0 c0088j0 = (C0088j0) c0036o.f143k;
        C0243u c0243u = c0259z02.f1557a;
        c0088j0.getClass();
        for (int i4 = 0; i4 < c0243u.f1421a.size(); i4++) {
            c0088j0.m323a(c0243u.m671b(i4));
        }
        boolean z7 = !zIsPlayingAd;
        int i8 = 4;
        c0036o.m163b(4, z7);
        c0036o.m163b(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        c0036o.m163b(6, zHasPreviousMediaItem && !zIsPlayingAd);
        c0036o.m163b(7, !zIsEmpty && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd);
        c0036o.m163b(8, zHasNextMediaItem && !zIsPlayingAd);
        c0036o.m163b(9, !zIsEmpty && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd);
        c0036o.m163b(10, z7);
        c0036o.m163b(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        c0036o.m163b(12, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        C0259z0 c0259z03 = new C0259z0(c0088j0.m324b());
        this.availableCommands = c0259z03;
        if (c0259z03.equals(c0259z0)) {
            return;
        }
        this.listeners.m2471c(13, new C0465t(this, i8));
    }

    private void updateMediaSourcesWithMediaItems(int i, int i4, List<C0226o0> list) {
        this.pendingOperationAcks++;
        this.internalPlayer.updateMediaSourcesWithMediaItems(i, i4, list);
        for (int i8 = i; i8 < i4; i8++) {
            MediaSourceHolderSnapshot mediaSourceHolderSnapshot = this.mediaSourceHolderSnapshots.get(i8);
            mediaSourceHolderSnapshot.updateTimeline(new TimelineWithUpdatedMediaItem(mediaSourceHolderSnapshot.getTimeline(), list.get(i8 - i)));
        }
        updatePlaybackInfo(this.playbackInfo.copyWithTimeline(createMaskingTimeline()), 0, false, 4, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayWhenReady(boolean z7, int i, int i4) {
        boolean z8 = z7 && i != -1;
        int iComputePlaybackSuppressionReason = computePlaybackSuppressionReason(z8, i);
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playWhenReady == z8 && playbackInfo.playbackSuppressionReason == iComputePlaybackSuppressionReason && playbackInfo.playWhenReadyChangeReason == i4) {
            return;
        }
        updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(z8, i4, iComputePlaybackSuppressionReason);
    }

    private void updatePlaybackInfo(final PlaybackInfo playbackInfo, final int i, boolean z7, final int i4, long j, int i8, boolean z8) {
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        this.playbackInfo = playbackInfo;
        boolean zEquals = playbackInfo2.timeline.equals(playbackInfo.timeline);
        Pair<Boolean, Integer> pairEvaluateMediaItemTransitionReason = evaluateMediaItemTransitionReason(playbackInfo, playbackInfo2, z7, i4, !zEquals, z8);
        boolean zBooleanValue = ((Boolean) pairEvaluateMediaItemTransitionReason.first).booleanValue();
        final int iIntValue = ((Integer) pairEvaluateMediaItemTransitionReason.second).intValue();
        if (zBooleanValue) {
            c0226o0 = playbackInfo.timeline.isEmpty() ? null : playbackInfo.timeline.getWindow(playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).f1206c, this.window).f1262c;
            this.staticAndDynamicMediaMetadata = C0235r0.f1329K;
        }
        if (zBooleanValue || !playbackInfo2.staticMetadata.equals(playbackInfo.staticMetadata)) {
            C0232q0 c0232q0M666a = this.staticAndDynamicMediaMetadata.m666a();
            List<C0241t0> list = playbackInfo.staticMetadata;
            for (int i9 = 0; i9 < list.size(); i9++) {
                C0241t0 c0241t0 = list.get(i9);
                int i10 = 0;
                while (true) {
                    InterfaceC0238s0[] interfaceC0238s0Arr = c0241t0.f1412j;
                    if (i10 < interfaceC0238s0Arr.length) {
                        interfaceC0238s0Arr[i10].populateMediaMetadata(c0232q0M666a);
                        i10++;
                    }
                }
            }
            this.staticAndDynamicMediaMetadata = new C0235r0(c0232q0M666a);
        }
        C0235r0 c0235r0BuildUpdatedMediaMetadata = buildUpdatedMediaMetadata();
        boolean zEquals2 = c0235r0BuildUpdatedMediaMetadata.equals(this.mediaMetadata);
        this.mediaMetadata = c0235r0BuildUpdatedMediaMetadata;
        boolean z9 = playbackInfo2.playWhenReady != playbackInfo.playWhenReady;
        boolean z10 = playbackInfo2.playbackState != playbackInfo.playbackState;
        if (z10 || z9) {
            updateWakeAndWifiLock();
        }
        boolean z11 = playbackInfo2.isLoading;
        boolean z12 = playbackInfo.isLoading;
        boolean z13 = z11 != z12;
        if (z13) {
            updatePriorityTaskManagerForIsLoadingChange(z12);
        }
        if (!zEquals) {
            final int i11 = 0;
            this.listeners.m2471c(0, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.j
                @Override // p063h1.InterfaceC1122m
                public final void invoke(Object obj) {
                    switch (i11) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$12((PlaybackInfo) playbackInfo, i, (InterfaceC0185b1) obj);
                            break;
                        default:
                            ((InterfaceC0185b1) obj).onMediaItemTransition((C0226o0) playbackInfo, i);
                            break;
                    }
                }
            });
        }
        if (z7) {
            final C0189c1 previousPositionInfo = getPreviousPositionInfo(i4, playbackInfo2, i8);
            final C0189c1 positionInfo = getPositionInfo(j);
            this.listeners.m2471c(11, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.u
                @Override // p063h1.InterfaceC1122m
                public final void invoke(Object obj) {
                    ExoPlayerImpl.lambda$updatePlaybackInfo$13(i4, previousPositionInfo, positionInfo, (InterfaceC0185b1) obj);
                }
            });
        }
        if (zBooleanValue) {
            final int i12 = 1;
            this.listeners.m2471c(1, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.j
                @Override // p063h1.InterfaceC1122m
                public final void invoke(Object obj) {
                    switch (i12) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$12((PlaybackInfo) c0226o0, iIntValue, (InterfaceC0185b1) obj);
                            break;
                        default:
                            ((InterfaceC0185b1) obj).onMediaItemTransition((C0226o0) c0226o0, iIntValue);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.playbackError != playbackInfo.playbackError) {
            final int i13 = 7;
            this.listeners.m2471c(10, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.l
                @Override // p063h1.InterfaceC1122m
                public final void invoke(Object obj) {
                    switch (i13) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$19(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$23(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$15(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$16(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$17(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                    }
                }
            });
            if (playbackInfo.playbackError != null) {
                final int i14 = 8;
                this.listeners.m2471c(10, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.l
                    @Override // p063h1.InterfaceC1122m
                    public final void invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$19(playbackInfo, (InterfaceC0185b1) obj);
                                break;
                            case 1:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (InterfaceC0185b1) obj);
                                break;
                            case 2:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (InterfaceC0185b1) obj);
                                break;
                            case 3:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (InterfaceC0185b1) obj);
                                break;
                            case 4:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$23(playbackInfo, (InterfaceC0185b1) obj);
                                break;
                            case 5:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (InterfaceC0185b1) obj);
                                break;
                            case 6:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (InterfaceC0185b1) obj);
                                break;
                            case 7:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$15(playbackInfo, (InterfaceC0185b1) obj);
                                break;
                            case 8:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$16(playbackInfo, (InterfaceC0185b1) obj);
                                break;
                            default:
                                ExoPlayerImpl.lambda$updatePlaybackInfo$17(playbackInfo, (InterfaceC0185b1) obj);
                                break;
                        }
                    }
                });
            }
        }
        TrackSelectorResult trackSelectorResult = playbackInfo2.trackSelectorResult;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.trackSelectorResult;
        if (trackSelectorResult != trackSelectorResult2) {
            this.trackSelector.onSelectionActivated(trackSelectorResult2.info);
            final int i15 = 9;
            this.listeners.m2471c(2, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.l
                @Override // p063h1.InterfaceC1122m
                public final void invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$19(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$23(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$15(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$16(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$17(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.listeners.m2471c(14, new C0380k(0, this.mediaMetadata));
        }
        if (z13) {
            final int i16 = 0;
            this.listeners.m2471c(3, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.l
                @Override // p063h1.InterfaceC1122m
                public final void invoke(Object obj) {
                    switch (i16) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$19(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$23(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$15(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$16(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$17(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                    }
                }
            });
        }
        if (z10 || z9) {
            final int i17 = 1;
            this.listeners.m2471c(-1, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.l
                @Override // p063h1.InterfaceC1122m
                public final void invoke(Object obj) {
                    switch (i17) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$19(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$23(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$15(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$16(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$17(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                    }
                }
            });
        }
        if (z10) {
            final int i18 = 2;
            this.listeners.m2471c(4, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.l
                @Override // p063h1.InterfaceC1122m
                public final void invoke(Object obj) {
                    switch (i18) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$19(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$23(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$15(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$16(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$17(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                    }
                }
            });
        }
        if (z9 || playbackInfo2.playWhenReadyChangeReason != playbackInfo.playWhenReadyChangeReason) {
            final int i19 = 3;
            this.listeners.m2471c(5, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.l
                @Override // p063h1.InterfaceC1122m
                public final void invoke(Object obj) {
                    switch (i19) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$19(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$23(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$15(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$16(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$17(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.playbackSuppressionReason != playbackInfo.playbackSuppressionReason) {
            final int i20 = 4;
            this.listeners.m2471c(6, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.l
                @Override // p063h1.InterfaceC1122m
                public final void invoke(Object obj) {
                    switch (i20) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$19(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$23(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$15(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$16(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$17(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.isPlaying() != playbackInfo.isPlaying()) {
            final int i21 = 5;
            this.listeners.m2471c(7, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.l
                @Override // p063h1.InterfaceC1122m
                public final void invoke(Object obj) {
                    switch (i21) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$19(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$23(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$15(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$16(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$17(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                    }
                }
            });
        }
        if (!playbackInfo2.playbackParameters.equals(playbackInfo.playbackParameters)) {
            final int i22 = 6;
            this.listeners.m2471c(12, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.l
                @Override // p063h1.InterfaceC1122m
                public final void invoke(Object obj) {
                    switch (i22) {
                        case 0:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$19(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 1:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 2:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 3:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 4:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$23(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 5:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 6:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 7:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$15(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        case 8:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$16(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                        default:
                            ExoPlayerImpl.lambda$updatePlaybackInfo$17(playbackInfo, (InterfaceC0185b1) obj);
                            break;
                    }
                }
            });
        }
        updateAvailableCommands();
        this.listeners.m2470b();
        if (playbackInfo2.sleepingForOffload != playbackInfo.sleepingForOffload) {
            Iterator<ExoPlayer.AudioOffloadListener> it = this.audioOffloadListeners.iterator();
            while (it.hasNext()) {
                it.next().onSleepingForOffloadChanged(playbackInfo.sleepingForOffload);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackInfoForPlayWhenReadyAndSuppressionReasonStates(boolean z7, int i, int i4) {
        this.pendingOperationAcks++;
        PlaybackInfo playbackInfoCopyWithEstimatedPosition = this.playbackInfo;
        if (playbackInfoCopyWithEstimatedPosition.sleepingForOffload) {
            playbackInfoCopyWithEstimatedPosition = playbackInfoCopyWithEstimatedPosition.copyWithEstimatedPosition();
        }
        PlaybackInfo playbackInfoCopyWithPlayWhenReady = playbackInfoCopyWithEstimatedPosition.copyWithPlayWhenReady(z7, i, i4);
        this.internalPlayer.setPlayWhenReady(z7, i, i4);
        updatePlaybackInfo(playbackInfoCopyWithPlayWhenReady, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void updatePriorityTaskManagerForIsLoadingChange(boolean z7) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateWakeAndWifiLock() {
        int playbackState = getPlaybackState();
        boolean z7 = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                boolean zIsSleepingForOffload = isSleepingForOffload();
                WakeLockManager wakeLockManager = this.wakeLockManager;
                if (getPlayWhenReady() && !zIsSleepingForOffload) {
                    z7 = true;
                }
                wakeLockManager.setStayAwake(z7);
                this.wifiLockManager.setStayAwake(getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
    }

    private void verifyApplicationThread() {
        this.constructorFinished.m2404b();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = getApplicationLooper().getThread().getName();
            int i = AbstractC1118i0.f4750a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.throwsWhenUsingWrongThread) {
                throw new IllegalStateException(str);
            }
            AbstractC1101a.m2349G(TAG, str, this.hasNotifiedFullWrongThreadWarning ? null : new IllegalStateException());
            this.hasNotifiedFullWrongThreadWarning = true;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAnalyticsListener(AnalyticsListener analyticsListener) {
        AnalyticsCollector analyticsCollector = this.analyticsCollector;
        analyticsListener.getClass();
        analyticsCollector.addListener(analyticsListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        this.audioOffloadListeners.add(audioOffloadListener);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void addListener(InterfaceC0185b1 interfaceC0185b1) {
        C1125p c1125p = this.listeners;
        interfaceC0185b1.getClass();
        c1125p.m2469a(interfaceC0185b1);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void addMediaItems(int i, List<C0226o0> list) {
        verifyApplicationThread();
        addMediaSources(i, createMediaSources(list));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(List<MediaSource> list) {
        verifyApplicationThread();
        addMediaSources(this.mediaSourceHolderSnapshots.size(), list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void clearAuxEffectInfo() {
        verifyApplicationThread();
        setAuxEffectInfo(new C0204h());
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void clearCameraMotionListener(CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        if (this.cameraMotionListener != cameraMotionListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(null).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        if (this.videoFrameMetadataListener != videoFrameMetadataListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(null).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void clearVideoSurface() {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(null);
        maybeNotifySurfaceSizeChanged(0, 0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null || surfaceHolder != this.surfaceHolder) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        verifyApplicationThread();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void clearVideoTextureView(TextureView textureView) {
        verifyApplicationThread();
        if (textureView == null || textureView != this.textureView) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
        verifyApplicationThread();
        return createMessageInternal(target);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.DeviceComponent
    @Deprecated
    public void decreaseDeviceVolume() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(1);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public AnalyticsCollector getAnalyticsCollector() {
        verifyApplicationThread();
        return this.analyticsCollector;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public C0201g getAudioAttributes() {
        verifyApplicationThread();
        return this.audioAttributes;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public ExoPlayer.AudioComponent getAudioComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public DecoderCounters getAudioDecoderCounters() {
        verifyApplicationThread();
        return this.audioDecoderCounters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public C0249w getAudioFormat() {
        verifyApplicationThread();
        return this.audioFormat;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public int getAudioSessionId() {
        verifyApplicationThread();
        return this.audioSessionId;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public C0259z0 getAvailableCommands() {
        verifyApplicationThread();
        return this.availableCommands;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public long getBufferedPosition() {
        verifyApplicationThread();
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.loadingMediaPeriodId.equals(playbackInfo.periodId) ? AbstractC1118i0.m2447f0(this.playbackInfo.bufferedPositionUs) : getDuration();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public InterfaceC1103b getClock() {
        return this.clock;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public long getContentBufferedPosition() {
        verifyApplicationThread();
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowPositionMs;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.loadingMediaPeriodId.windowSequenceNumber != playbackInfo.periodId.windowSequenceNumber) {
            return AbstractC1118i0.m2447f0(playbackInfo.timeline.getWindow(getCurrentMediaItemIndex(), this.window).f1272m);
        }
        long j = playbackInfo.bufferedPositionUs;
        if (this.playbackInfo.loadingMediaPeriodId.isAd()) {
            PlaybackInfo playbackInfo2 = this.playbackInfo;
            C0221m1 periodByUid = playbackInfo2.timeline.getPeriodByUid(playbackInfo2.loadingMediaPeriodId.periodUid, this.period);
            long jM639d = periodByUid.m639d(this.playbackInfo.loadingMediaPeriodId.adGroupIndex);
            j = jM639d == Long.MIN_VALUE ? periodByUid.f1207d : jM639d;
        }
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        return AbstractC1118i0.m2447f0(periodPositionUsToWindowPositionUs(playbackInfo3.timeline, playbackInfo3.loadingMediaPeriodId, j));
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public long getContentPosition() {
        verifyApplicationThread();
        return getContentPositionInternal(this.playbackInfo);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adGroupIndex;
        }
        return -1;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adIndexInAdGroup;
        }
        return -1;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public C1030c getCurrentCues() {
        verifyApplicationThread();
        return this.currentCueGroup;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        if (currentWindowIndexInternal == -1) {
            return 0;
        }
        return currentWindowIndexInternal;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public int getCurrentPeriodIndex() {
        verifyApplicationThread();
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingPeriodIndex;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public long getCurrentPosition() {
        verifyApplicationThread();
        return AbstractC1118i0.m2447f0(getCurrentPositionUsInternal(this.playbackInfo));
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public AbstractC0230p1 getCurrentTimeline() {
        verifyApplicationThread();
        return this.playbackInfo.timeline;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public TrackGroupArray getCurrentTrackGroups() {
        verifyApplicationThread();
        return this.playbackInfo.trackGroups;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public TrackSelectionArray getCurrentTrackSelections() {
        verifyApplicationThread();
        return new TrackSelectionArray(this.playbackInfo.trackSelectorResult.selections);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public C0254x1 getCurrentTracks() {
        verifyApplicationThread();
        return this.playbackInfo.trackSelectorResult.tracks;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public ExoPlayer.DeviceComponent getDeviceComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.DeviceComponent
    public C0231q getDeviceInfo() {
        verifyApplicationThread();
        return this.deviceInfo;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.DeviceComponent
    public int getDeviceVolume() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            return streamVolumeManager.getVolume();
        }
        return 0;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public long getDuration() {
        verifyApplicationThread();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return AbstractC1118i0.m2447f0(this.period.m636a(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        return this.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public C0235r0 getMediaMetadata() {
        verifyApplicationThread();
        return this.mediaMetadata;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        verifyApplicationThread();
        return this.pauseAtEndOfMediaItems;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public boolean getPlayWhenReady() {
        verifyApplicationThread();
        return this.playbackInfo.playWhenReady;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.internalPlayer.getPlaybackLooper();
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public C0256y0 getPlaybackParameters() {
        verifyApplicationThread();
        return this.playbackInfo.playbackParameters;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public int getPlaybackState() {
        verifyApplicationThread();
        return this.playbackInfo.playbackState;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return this.playbackInfo.playbackSuppressionReason;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public C0235r0 getPlaylistMetadata() {
        verifyApplicationThread();
        return this.playlistMetadata;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public ExoPlayer.PreloadConfiguration getPreloadConfiguration() {
        return this.preloadConfiguration;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public Renderer getRenderer(int i) {
        verifyApplicationThread();
        return this.renderers[i];
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererCount() {
        verifyApplicationThread();
        return this.renderers.length;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererType(int i) {
        verifyApplicationThread();
        return this.renderers[i].getTrackType();
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public int getRepeatMode() {
        verifyApplicationThread();
        return this.repeatMode;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public long getSeekBackIncrement() {
        verifyApplicationThread();
        return this.seekBackIncrementMs;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public long getSeekForwardIncrement() {
        verifyApplicationThread();
        return this.seekForwardIncrementMs;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public SeekParameters getSeekParameters() {
        verifyApplicationThread();
        return this.seekParameters;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return this.shuffleModeEnabled;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public boolean getSkipSilenceEnabled() {
        verifyApplicationThread();
        return this.skipSilenceEnabled;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public C1134y getSurfaceSize() {
        verifyApplicationThread();
        return this.surfaceSize;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public ExoPlayer.TextComponent getTextComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public long getTotalBufferedDuration() {
        verifyApplicationThread();
        return AbstractC1118i0.m2447f0(this.playbackInfo.totalBufferedDurationUs);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public C0248v1 getTrackSelectionParameters() {
        verifyApplicationThread();
        return this.trackSelector.getParameters();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public TrackSelector getTrackSelector() {
        verifyApplicationThread();
        return this.trackSelector;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public int getVideoChangeFrameRateStrategy() {
        verifyApplicationThread();
        return this.videoChangeFrameRateStrategy;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public ExoPlayer.VideoComponent getVideoComponent() {
        verifyApplicationThread();
        return this;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public DecoderCounters getVideoDecoderCounters() {
        verifyApplicationThread();
        return this.videoDecoderCounters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public C0249w getVideoFormat() {
        verifyApplicationThread();
        return this.videoFormat;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public int getVideoScalingMode() {
        verifyApplicationThread();
        return this.videoScalingMode;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public C0194d2 getVideoSize() {
        verifyApplicationThread();
        return this.videoSize;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public float getVolume() {
        verifyApplicationThread();
        return this.volume;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.DeviceComponent
    @Deprecated
    public void increaseDeviceVolume() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(1);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.DeviceComponent
    public boolean isDeviceMuted() {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            return streamVolumeManager.isMuted();
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isLoading() {
        verifyApplicationThread();
        return this.playbackInfo.isLoading;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public boolean isPlayingAd() {
        verifyApplicationThread();
        return this.playbackInfo.periodId.isAd();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isReleased() {
        verifyApplicationThread();
        return this.playerReleased;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isSleepingForOffload() {
        verifyApplicationThread();
        return this.playbackInfo.sleepingForOffload;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isTunnelingEnabled() {
        verifyApplicationThread();
        for (RendererConfiguration rendererConfiguration : this.playbackInfo.trackSelectorResult.rendererConfigurations) {
            if (rendererConfiguration != null && rendererConfiguration.tunneling) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void moveMediaItems(int i, int i4, int i8) {
        verifyApplicationThread();
        AbstractC1101a.m2353d(i >= 0 && i <= i4 && i8 >= 0);
        int size = this.mediaSourceHolderSnapshots.size();
        int iMin = Math.min(i4, size);
        int iMin2 = Math.min(i8, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        AbstractC0230p1 currentTimeline = getCurrentTimeline();
        this.pendingOperationAcks++;
        AbstractC1118i0.m2427R(this.mediaSourceHolderSnapshots, i, iMin, iMin2);
        AbstractC0230p1 abstractC0230p1CreateMaskingTimeline = createMaskingTimeline();
        PlaybackInfo playbackInfo = this.playbackInfo;
        PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, abstractC0230p1CreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(currentTimeline, abstractC0230p1CreateMaskingTimeline, getCurrentWindowIndexInternal(playbackInfo), getContentPositionInternal(this.playbackInfo)));
        this.internalPlayer.moveMediaSources(i, iMin, iMin2, this.shuffleOrder);
        updatePlaybackInfo(playbackInfoMaskTimelineAndPosition, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void prepare() {
        verifyApplicationThread();
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = this.audioFocusManager.updateAudioFocus(playWhenReady, 2);
        updatePlayWhenReady(playWhenReady, iUpdateAudioFocus, getPlayWhenReadyChangeReason(iUpdateAudioFocus));
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != 1) {
            return;
        }
        PlaybackInfo playbackInfoCopyWithPlaybackError = playbackInfo.copyWithPlaybackError(null);
        PlaybackInfo playbackInfoCopyWithPlaybackState = playbackInfoCopyWithPlaybackError.copyWithPlaybackState(playbackInfoCopyWithPlaybackError.timeline.isEmpty() ? 4 : 2);
        this.pendingOperationAcks++;
        this.internalPlayer.prepare();
        updatePlaybackInfo(playbackInfoCopyWithPlaybackState, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void release() {
        String str;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.5.1] [");
        sb.append(AbstractC1118i0.f4754e);
        sb.append("] [");
        HashSet hashSet = AbstractC0229p0.f1278a;
        synchronized (AbstractC0229p0.class) {
            str = AbstractC0229p0.f1279b;
        }
        sb.append(str);
        sb.append("]");
        AbstractC1101a.m2371v(TAG, sb.toString());
        verifyApplicationThread();
        int i = 0;
        this.audioBecomingNoisyManager.setEnabled(false);
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.release();
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
        this.audioFocusManager.release();
        if (!this.internalPlayer.release()) {
            this.listeners.m2474f(10, new C0413q(i));
        }
        this.listeners.m2472d();
        ((C1104b0) this.playbackInfoUpdateHandler).f4715a.removeCallbacksAndMessages(null);
        this.bandwidthMeter.removeEventListener(this.analyticsCollector);
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.sleepingForOffload) {
            this.playbackInfo = playbackInfo.copyWithEstimatedPosition();
        }
        SuitableOutputChecker suitableOutputChecker = this.suitableOutputChecker;
        if (suitableOutputChecker != null && AbstractC1118i0.f4750a >= 35) {
            suitableOutputChecker.disable();
        }
        PlaybackInfo playbackInfoCopyWithPlaybackState = this.playbackInfo.copyWithPlaybackState(1);
        this.playbackInfo = playbackInfoCopyWithPlaybackState;
        PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId = playbackInfoCopyWithPlaybackState.copyWithLoadingMediaPeriodId(playbackInfoCopyWithPlaybackState.periodId);
        this.playbackInfo = playbackInfoCopyWithLoadingMediaPeriodId;
        playbackInfoCopyWithLoadingMediaPeriodId.bufferedPositionUs = playbackInfoCopyWithLoadingMediaPeriodId.positionUs;
        this.playbackInfo.totalBufferedDurationUs = 0L;
        this.analyticsCollector.release();
        this.trackSelector.release();
        removeSurfaceCallbacks();
        Surface surface = this.ownedSurface;
        if (surface != null) {
            surface.release();
            this.ownedSurface = null;
        }
        if (this.isPriorityTaskManagerRegistered) {
            throw null;
        }
        this.currentCueGroup = C1030c.f4387b;
        this.playerReleased = true;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAnalyticsListener(AnalyticsListener analyticsListener) {
        verifyApplicationThread();
        AnalyticsCollector analyticsCollector = this.analyticsCollector;
        analyticsListener.getClass();
        analyticsCollector.removeListener(analyticsListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        verifyApplicationThread();
        this.audioOffloadListeners.remove(audioOffloadListener);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void removeListener(InterfaceC0185b1 interfaceC0185b1) {
        verifyApplicationThread();
        C1125p c1125p = this.listeners;
        interfaceC0185b1.getClass();
        c1125p.m2473e(interfaceC0185b1);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void removeMediaItems(int i, int i4) {
        verifyApplicationThread();
        AbstractC1101a.m2353d(i >= 0 && i4 >= i);
        int size = this.mediaSourceHolderSnapshots.size();
        int iMin = Math.min(i4, size);
        if (i >= size || i == iMin) {
            return;
        }
        PlaybackInfo playbackInfoRemoveMediaItemsInternal = removeMediaItemsInternal(this.playbackInfo, i, iMin);
        updatePlaybackInfo(playbackInfoRemoveMediaItemsInternal, 0, !playbackInfoRemoveMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(playbackInfoRemoveMediaItemsInternal), -1, false);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void replaceMediaItems(int i, int i4, List<C0226o0> list) {
        verifyApplicationThread();
        AbstractC1101a.m2353d(i >= 0 && i4 >= i);
        int size = this.mediaSourceHolderSnapshots.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i4, size);
        if (canUpdateMediaSourcesWithMediaItems(i, iMin, list)) {
            updateMediaSourcesWithMediaItems(i, iMin, list);
            return;
        }
        List<MediaSource> listCreateMediaSources = createMediaSources(list);
        if (this.mediaSourceHolderSnapshots.isEmpty()) {
            setMediaSources(listCreateMediaSources, this.maskingWindowIndex == -1);
        } else {
            PlaybackInfo playbackInfoRemoveMediaItemsInternal = removeMediaItemsInternal(addMediaSourcesInternal(this.playbackInfo, iMin, listCreateMediaSources), i, iMin);
            updatePlaybackInfo(playbackInfoRemoveMediaItemsInternal, 0, !playbackInfoRemoveMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(playbackInfoRemoveMediaItemsInternal), -1, false);
        }
    }

    @Override // androidx.media3.common.AbstractC0207i
    public void seekTo(int i, long j, int i4, boolean z7) {
        verifyApplicationThread();
        if (i == -1) {
            return;
        }
        AbstractC1101a.m2353d(i >= 0);
        AbstractC0230p1 abstractC0230p1 = this.playbackInfo.timeline;
        if (abstractC0230p1.isEmpty() || i < abstractC0230p1.getWindowCount()) {
            this.analyticsCollector.notifySeekStarted();
            this.pendingOperationAcks++;
            if (isPlayingAd()) {
                AbstractC1101a.m2348F(TAG, "seekTo ignored because an ad is playing");
                ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new ExoPlayerImplInternal.PlaybackInfoUpdate(this.playbackInfo);
                playbackInfoUpdate.incrementPendingOperationAcks(1);
                this.playbackInfoUpdateListener.onPlaybackInfoUpdate(playbackInfoUpdate);
                return;
            }
            PlaybackInfo playbackInfoCopyWithPlaybackState = this.playbackInfo;
            int i8 = playbackInfoCopyWithPlaybackState.playbackState;
            if (i8 == 3 || (i8 == 4 && !abstractC0230p1.isEmpty())) {
                playbackInfoCopyWithPlaybackState = this.playbackInfo.copyWithPlaybackState(2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfoCopyWithPlaybackState, abstractC0230p1, maskWindowPositionMsOrGetPeriodPositionUs(abstractC0230p1, i, j));
            this.internalPlayer.seekTo(abstractC0230p1, i, AbstractC1118i0.m2428S(j));
            updatePlaybackInfo(playbackInfoMaskTimelineAndPosition, 0, true, 1, getCurrentPositionUsInternal(playbackInfoMaskTimelineAndPosition), currentMediaItemIndex, z7);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setAudioAttributes(C0201g c0201g, boolean z7) {
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        C0201g c0201g2 = this.audioAttributes;
        int i = AbstractC1118i0.f4750a;
        if (!Objects.equals(c0201g2, c0201g)) {
            this.audioAttributes = c0201g;
            int i4 = 1;
            sendRendererMessage(1, 3, c0201g);
            StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
            if (streamVolumeManager != null) {
                c0201g.getClass();
                streamVolumeManager.setStreamType(3);
            }
            this.listeners.m2471c(20, new C0380k(i4, c0201g));
        }
        this.audioFocusManager.setAudioAttributes(z7 ? c0201g : null);
        this.trackSelector.setAudioAttributes(c0201g);
        boolean playWhenReady = getPlayWhenReady();
        int iUpdateAudioFocus = this.audioFocusManager.updateAudioFocus(playWhenReady, getPlaybackState());
        updatePlayWhenReady(playWhenReady, iUpdateAudioFocus, getPlayWhenReadyChangeReason(iUpdateAudioFocus));
        this.listeners.m2470b();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setAudioSessionId(int i) {
        verifyApplicationThread();
        if (this.audioSessionId == i) {
            return;
        }
        if (i == 0) {
            Context context = this.applicationContext;
            int i4 = AbstractC1118i0.f4750a;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            i = audioManager == null ? -1 : audioManager.generateAudioSessionId();
        }
        this.audioSessionId = i;
        sendRendererMessage(1, 10, Integer.valueOf(i));
        sendRendererMessage(2, 10, Integer.valueOf(i));
        this.listeners.m2474f(21, new C0412p(i, 0));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setAuxEffectInfo(C0204h c0204h) {
        verifyApplicationThread();
        sendRendererMessage(1, 6, c0204h);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setCameraMotionListener(CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        this.cameraMotionListener = cameraMotionListener;
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(cameraMotionListener).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.DeviceComponent
    @Deprecated
    public void setDeviceMuted(boolean z7) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z7, 1);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.DeviceComponent
    @Deprecated
    public void setDeviceVolume(int i) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i, 1);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setForegroundMode(boolean z7) {
        verifyApplicationThread();
        if (this.foregroundMode != z7) {
            this.foregroundMode = z7;
            if (this.internalPlayer.setForegroundMode(z7)) {
                return;
            }
            stopInternal(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(2), 1003));
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z7) {
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        this.audioBecomingNoisyManager.setEnabled(z7);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput imageOutput) {
        verifyApplicationThread();
        sendRendererMessage(4, 15, imageOutput);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void setMediaItems(List<C0226o0> list, boolean z7) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), z7);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list) {
        verifyApplicationThread();
        setMediaSources(list, true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z7) {
        verifyApplicationThread();
        if (this.pauseAtEndOfMediaItems == z7) {
            return;
        }
        this.pauseAtEndOfMediaItems = z7;
        this.internalPlayer.setPauseAtEndOfWindow(z7);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void setPlayWhenReady(boolean z7) {
        verifyApplicationThread();
        int iUpdateAudioFocus = this.audioFocusManager.updateAudioFocus(z7, getPlaybackState());
        updatePlayWhenReady(z7, iUpdateAudioFocus, getPlayWhenReadyChangeReason(iUpdateAudioFocus));
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void setPlaybackParameters(C0256y0 c0256y0) {
        verifyApplicationThread();
        if (c0256y0 == null) {
            c0256y0 = C0256y0.f1548d;
        }
        if (this.playbackInfo.playbackParameters.equals(c0256y0)) {
            return;
        }
        PlaybackInfo playbackInfoCopyWithPlaybackParameters = this.playbackInfo.copyWithPlaybackParameters(c0256y0);
        this.pendingOperationAcks++;
        this.internalPlayer.setPlaybackParameters(c0256y0);
        updatePlaybackInfo(playbackInfoCopyWithPlaybackParameters, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPlaylistMetadata(C0235r0 c0235r0) {
        verifyApplicationThread();
        c0235r0.getClass();
        if (c0235r0.equals(this.playlistMetadata)) {
            return;
        }
        this.playlistMetadata = c0235r0;
        this.listeners.m2474f(15, new C0465t(this, 0));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 12, audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreloadConfiguration(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        verifyApplicationThread();
        if (this.preloadConfiguration.equals(preloadConfiguration)) {
            return;
        }
        this.preloadConfiguration = preloadConfiguration;
        this.internalPlayer.setPreloadConfiguration(preloadConfiguration);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriority(int i) {
        verifyApplicationThread();
        if (this.priority == i) {
            return;
        }
        if (this.isPriorityTaskManagerRegistered) {
            throw null;
        }
        this.priority = i;
        sendRendererMessage(16, Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriorityTaskManager(AbstractC0203g1 abstractC0203g1) {
        verifyApplicationThread();
        int i = AbstractC1118i0.f4750a;
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void setRepeatMode(int i) {
        verifyApplicationThread();
        if (this.repeatMode != i) {
            this.repeatMode = i;
            this.internalPlayer.setRepeatMode(i);
            this.listeners.m2471c(8, new C0412p(i, 1));
            updateAvailableCommands();
            this.listeners.m2470b();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSeekParameters(SeekParameters seekParameters) {
        verifyApplicationThread();
        if (seekParameters == null) {
            seekParameters = SeekParameters.DEFAULT;
        }
        if (this.seekParameters.equals(seekParameters)) {
            return;
        }
        this.seekParameters = seekParameters;
        this.internalPlayer.setSeekParameters(seekParameters);
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void setShuffleModeEnabled(boolean z7) {
        verifyApplicationThread();
        if (this.shuffleModeEnabled != z7) {
            this.shuffleModeEnabled = z7;
            this.internalPlayer.setShuffleModeEnabled(z7);
            this.listeners.m2471c(9, new C0382m(z7, 1));
            updateAvailableCommands();
            this.listeners.m2470b();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        verifyApplicationThread();
        AbstractC1101a.m2353d(shuffleOrder.getLength() == this.mediaSourceHolderSnapshots.size());
        this.shuffleOrder = shuffleOrder;
        AbstractC0230p1 abstractC0230p1CreateMaskingTimeline = createMaskingTimeline();
        PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, abstractC0230p1CreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(abstractC0230p1CreateMaskingTimeline, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.pendingOperationAcks++;
        this.internalPlayer.setShuffleOrder(shuffleOrder);
        updatePlaybackInfo(playbackInfoMaskTimelineAndPosition, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setSkipSilenceEnabled(boolean z7) {
        verifyApplicationThread();
        if (this.skipSilenceEnabled == z7) {
            return;
        }
        this.skipSilenceEnabled = z7;
        sendRendererMessage(1, 9, Boolean.valueOf(z7));
        this.listeners.m2474f(23, new C0382m(z7, 0));
    }

    public void setThrowsWhenUsingWrongThread(boolean z7) {
        this.throwsWhenUsingWrongThread = z7;
        this.listeners.f4779i = z7;
        AnalyticsCollector analyticsCollector = this.analyticsCollector;
        if (analyticsCollector instanceof DefaultAnalyticsCollector) {
            ((DefaultAnalyticsCollector) analyticsCollector).setThrowsWhenUsingWrongThread(z7);
        }
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void setTrackSelectionParameters(C0248v1 c0248v1) {
        verifyApplicationThread();
        if (!this.trackSelector.isSetParametersSupported() || c0248v1.equals(this.trackSelector.getParameters())) {
            return;
        }
        this.trackSelector.setParameters(c0248v1);
        this.listeners.m2474f(19, new C0380k(2, c0248v1));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoChangeFrameRateStrategy(int i) {
        verifyApplicationThread();
        if (this.videoChangeFrameRateStrategy == i) {
            return;
        }
        this.videoChangeFrameRateStrategy = i;
        sendRendererMessage(2, 5, Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoEffects(List<Object> list) throws NoSuchMethodException, SecurityException {
        verifyApplicationThread();
        try {
            Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC0260z1.class);
            sendRendererMessage(2, 13, list);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new IllegalStateException("Could not find required lib-effect dependencies.", e);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        this.videoFrameMetadataListener = videoFrameMetadataListener;
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(videoFrameMetadataListener).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoScalingMode(int i) {
        verifyApplicationThread();
        this.videoScalingMode = i;
        sendRendererMessage(2, 4, Integer.valueOf(i));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoSurface(Surface surface) {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(surface);
        int i = surface == null ? 0 : -1;
        maybeNotifySurfaceSizeChanged(i, i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.surfaceHolderSurfaceIsVideoOutput = true;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            setVideoOutputInternal(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void setVideoSurfaceView(SurfaceView surfaceView) {
        verifyApplicationThread();
        if (surfaceView instanceof VideoDecoderOutputBufferRenderer) {
            removeSurfaceCallbacks();
            setVideoOutputInternal(surfaceView);
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof SphericalGLSurfaceView)) {
                setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            removeSurfaceCallbacks();
            this.sphericalGLSurfaceView = (SphericalGLSurfaceView) surfaceView;
            createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(this.sphericalGLSurfaceView).send();
            this.sphericalGLSurfaceView.addVideoSurfaceListener(this.componentListener);
            setVideoOutputInternal(this.sphericalGLSurfaceView.getVideoSurface());
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
        }
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void setVideoTextureView(TextureView textureView) {
        verifyApplicationThread();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.textureView = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            AbstractC1101a.m2348F(TAG, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.componentListener);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            setSurfaceTextureInternal(surfaceTexture);
            maybeNotifySurfaceSizeChanged(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.AudioComponent
    public void setVolume(float f8) {
        verifyApplicationThread();
        final float fM2450i = AbstractC1118i0.m2450i(f8, 0.0f, 1.0f);
        if (this.volume == fM2450i) {
            return;
        }
        this.volume = fM2450i;
        sendVolumeToRenderers();
        this.listeners.m2474f(22, new InterfaceC1122m() { // from class: androidx.media3.exoplayer.n
            @Override // p063h1.InterfaceC1122m
            public final void invoke(Object obj) {
                ((InterfaceC0185b1) obj).onVolumeChanged(fM2450i);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setWakeMode(int i) {
        verifyApplicationThread();
        if (i == 0) {
            this.wakeLockManager.setEnabled(false);
            this.wifiLockManager.setEnabled(false);
        } else if (i == 1) {
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(false);
        } else {
            if (i != 2) {
                return;
            }
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(true);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void stop() {
        verifyApplicationThread();
        this.audioFocusManager.updateAudioFocus(getPlayWhenReady(), 1);
        stopInternal(null);
        C0981l1 c0981l1 = C0981l1.f4211n;
        long j = this.playbackInfo.positionUs;
        this.currentCueGroup = new C1030c(c0981l1);
    }

    private void sendRendererMessage(int i, int i4, Object obj) {
        for (Renderer renderer : this.renderers) {
            if (i == -1 || renderer.getTrackType() == i) {
                createMessageInternal(renderer).setType(i4).setPayload(obj).send();
            }
        }
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public ExoPlaybackException getPlayerError() {
        verifyApplicationThread();
        return this.playbackInfo.playbackError;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(int i, MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(i, Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(int i, List<MediaSource> list) {
        verifyApplicationThread();
        AbstractC1101a.m2353d(i >= 0);
        int iMin = Math.min(i, this.mediaSourceHolderSnapshots.size());
        if (this.mediaSourceHolderSnapshots.isEmpty()) {
            setMediaSources(list, this.maskingWindowIndex == -1);
        } else {
            updatePlaybackInfo(addMediaSourcesInternal(this.playbackInfo, iMin, list), 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    @Override // androidx.media3.common.InterfaceC0193d1
    public void setMediaItems(List<C0226o0> list, int i, long j) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), i, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, long j) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(mediaSource), 0, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list, boolean z7) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, -1, -9223372036854775807L, z7);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void decreaseDeviceVolume(int i) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(i);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void increaseDeviceVolume(int i) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(i);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setDeviceMuted(boolean z7, int i) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z7, i);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setDeviceVolume(int i, int i4) {
        verifyApplicationThread();
        StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i, i4);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer, androidx.media3.exoplayer.ExoPlayer.VideoComponent
    public void clearVideoSurface(Surface surface) {
        verifyApplicationThread();
        if (surface == null || surface != this.videoOutput) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(List<MediaSource> list, int i, long j) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, i, j, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, boolean z7) {
        verifyApplicationThread();
        setMediaSources(Collections.singletonList(mediaSource), z7);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSource(mediaSource);
        prepare();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource, boolean z7, boolean z8) {
        verifyApplicationThread();
        setMediaSource(mediaSource, z7);
        prepare();
    }
}
