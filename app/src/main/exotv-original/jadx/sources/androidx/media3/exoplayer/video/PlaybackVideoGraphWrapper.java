package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.support.v4.media.session.AbstractC0120b;
import android.util.Pair;
import android.view.Surface;
import androidx.lifecycle.RunnableC0127c0;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0216l;
import androidx.media3.common.C0222n;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0257y1;
import androidx.media3.common.InterfaceC0172a2;
import androidx.media3.common.InterfaceC0186b2;
import androidx.media3.common.InterfaceC0190c2;
import androidx.media3.common.InterfaceC0197e1;
import androidx.media3.common.InterfaceC0200f1;
import androidx.media3.common.InterfaceC0225o;
import androidx.media3.common.InterfaceC0260z1;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;
import androidx.media3.exoplayer.video.VideoFrameRenderControl;
import androidx.media3.exoplayer.video.VideoSink;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p002a1.AbstractC0008a1;
import p043e6.InterfaceC0921i;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1104b0;
import p063h1.C1134y;
import p063h1.C1135z;
import p063h1.InterfaceC1103b;
import p063h1.InterfaceC1110e0;
import p063h1.InterfaceC1120k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class PlaybackVideoGraphWrapper implements VideoSinkProvider, InterfaceC0190c2 {
    private static final Executor NO_OP_EXECUTOR = new ExecutorC0496a();
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 2;
    private long bufferTimestampAdjustmentUs;
    private final InterfaceC1103b clock;
    private final List<Object> compositionEffects;
    private final Context context;
    private Pair<Surface, C1134y> currentSurfaceAndSize;
    private final VideoSink defaultVideoSink;
    private InterfaceC1120k handler;
    private final InputVideoSink inputVideoSink;
    private final CopyOnWriteArraySet<Listener> listeners;
    private C0249w outputFormat;
    private int pendingFlushCount;
    private final InterfaceC0197e1 previewingVideoGraphFactory;
    private int state;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameRenderControl videoFrameRenderControl;
    private InterfaceC0200f1 videoGraph;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Builder {
        private boolean built;
        private InterfaceC1103b clock;
        private List<Object> compositionEffects;
        private final Context context;
        private InterfaceC0197e1 previewingVideoGraphFactory;
        private InterfaceC0260z1 videoFrameProcessorFactory;
        private final VideoFrameReleaseControl videoFrameReleaseControl;

        public Builder(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
            this.context = context.getApplicationContext();
            this.videoFrameReleaseControl = videoFrameReleaseControl;
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            this.compositionEffects = C0981l1.f4211n;
            this.clock = InterfaceC1103b.f4713a;
        }

        public PlaybackVideoGraphWrapper build() {
            AbstractC1101a.m2359j(!this.built);
            if (this.previewingVideoGraphFactory == null) {
                if (this.videoFrameProcessorFactory == null) {
                    this.videoFrameProcessorFactory = new ReflectiveDefaultVideoFrameProcessorFactory();
                }
                this.previewingVideoGraphFactory = new ReflectivePreviewingSingleInputVideoGraphFactory(this.videoFrameProcessorFactory);
            }
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = new PlaybackVideoGraphWrapper(this);
            this.built = true;
            return playbackVideoGraphWrapper;
        }

        public Builder setClock(InterfaceC1103b interfaceC1103b) {
            this.clock = interfaceC1103b;
            return this;
        }

        public Builder setCompositionEffects(List<Object> list) {
            this.compositionEffects = list;
            return this;
        }

        public Builder setPreviewingVideoGraphFactory(InterfaceC0197e1 interfaceC0197e1) {
            this.previewingVideoGraphFactory = interfaceC0197e1;
            return this;
        }

        public Builder setVideoFrameProcessorFactory(InterfaceC0260z1 interfaceC0260z1) {
            this.videoFrameProcessorFactory = interfaceC0260z1;
            return this;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class FrameRendererImpl implements VideoFrameRenderControl.FrameRenderer {
        private FrameRendererImpl() {
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void dropFrame() {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFrameDropped(PlaybackVideoGraphWrapper.this);
            }
            PlaybackVideoGraphWrapper.access$2600(PlaybackVideoGraphWrapper.this);
            AbstractC1101a.m2360k(null);
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void onVideoSizeChanged(C0194d2 c0194d2) {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            C0246v c0246v = new C0246v();
            c0246v.f1454t = c0194d2.f1086a;
            c0246v.f1455u = c0194d2.f1087b;
            c0246v.f1447m = AbstractC0244u0.m687p("video/raw");
            playbackVideoGraphWrapper.outputFormat = new C0249w(c0246v);
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onVideoSizeChanged(PlaybackVideoGraphWrapper.this, c0194d2);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void renderFrame(long j, long j8, long j9, boolean z7) {
            if (z7 && PlaybackVideoGraphWrapper.this.currentSurfaceAndSize != null) {
                Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
                while (it.hasNext()) {
                    ((Listener) it.next()).onFirstFrameRendered(PlaybackVideoGraphWrapper.this);
                }
            }
            if (PlaybackVideoGraphWrapper.this.videoFrameMetadataListener != null) {
                C0249w c0249w = PlaybackVideoGraphWrapper.this.outputFormat == null ? new C0249w(new C0246v()) : PlaybackVideoGraphWrapper.this.outputFormat;
                VideoFrameMetadataListener videoFrameMetadataListener = PlaybackVideoGraphWrapper.this.videoFrameMetadataListener;
                ((C1135z) PlaybackVideoGraphWrapper.this.clock).getClass();
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j8, System.nanoTime(), c0249w, null);
            }
            PlaybackVideoGraphWrapper.access$2600(PlaybackVideoGraphWrapper.this);
            AbstractC1101a.m2360k(null);
            throw null;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class InputVideoSink implements VideoSink, Listener {
        private long finalBufferPresentationTimeUs;
        private final VideoFrameReleaseControl.FrameReleaseInfo frameReleaseInfo;
        private boolean hasRegisteredFirstInputStream;
        private long inputBufferTimestampAdjustmentUs;
        private C0249w inputFormat;
        private long inputStreamOffsetUs;
        private long inputStreamStartPositionUs;
        private int inputType;
        private boolean isInputStreamChangePending;
        private long lastBufferPresentationTimeUs;
        private long lastResetPositionUs;
        private VideoSink.Listener listener;
        private Executor listenerExecutor;
        private long pendingInputStreamBufferPresentationTimeUs;
        private boolean pendingInputStreamOffsetChange;
        private final ArrayList<Object> videoEffects;
        private InterfaceC0186b2 videoFrameProcessor;
        private final int videoFrameProcessorMaxPendingFrameCount;

        public InputVideoSink(Context context) {
            this.videoFrameProcessorMaxPendingFrameCount = AbstractC1118i0.m2424O(context) ? 1 : 5;
            this.videoEffects = new ArrayList<>();
            this.frameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
            this.finalBufferPresentationTimeUs = -9223372036854775807L;
            this.lastBufferPresentationTimeUs = -9223372036854775807L;
            this.listener = VideoSink.Listener.NO_OP;
            this.listenerExecutor = PlaybackVideoGraphWrapper.NO_OP_EXECUTOR;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$3(VideoSink.Listener listener, C0257y1 c0257y1) {
            C0249w c0249w = this.inputFormat;
            AbstractC1101a.m2360k(c0249w);
            listener.onError(this, new VideoSink.VideoSinkException(c0257y1, c0249w));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFirstFrameRendered$0(VideoSink.Listener listener) {
            listener.onFirstFrameRendered(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onFrameDropped$1(VideoSink.Listener listener) {
            listener.onFrameDropped(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoSizeChanged$2(VideoSink.Listener listener, C0194d2 c0194d2) {
            listener.onVideoSizeChanged(this, c0194d2);
        }

        private void maybeRegisterInputStream() {
            if (this.inputFormat == null) {
                return;
            }
            new ArrayList(this.videoEffects);
            C0249w c0249w = this.inputFormat;
            c0249w.getClass();
            AbstractC1101a.m2360k(null);
            PlaybackVideoGraphWrapper.getAdjustedInputColorInfo(c0249w.f1497B);
            int i = c0249w.f1529u;
            int i4 = c0249w.f1530v;
            AbstractC1101a.m2352c("width must be positive, but is: " + i, i > 0);
            AbstractC1101a.m2352c("height must be positive, but is: " + i4, i4 > 0);
            throw null;
        }

        private boolean maybeRegisterPendingInputStream() {
            if (!this.isInputStreamChangePending) {
                return true;
            }
            long j = this.pendingInputStreamBufferPresentationTimeUs;
            if (j != -9223372036854775807L && !PlaybackVideoGraphWrapper.this.hasReleasedFrame(j)) {
                return false;
            }
            maybeRegisterInputStream();
            this.isInputStreamChangePending = false;
            this.pendingInputStreamBufferPresentationTimeUs = -9223372036854775807L;
            return true;
        }

        private void maybeSetStreamOffsetChange(long j) {
            if (this.pendingInputStreamOffsetChange) {
                PlaybackVideoGraphWrapper.this.onStreamOffsetChange(this.inputBufferTimestampAdjustmentUs, j, this.inputStreamOffsetUs);
                this.pendingInputStreamOffsetChange = false;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void clearOutputSurfaceInfo() {
            PlaybackVideoGraphWrapper.this.clearOutputSurfaceInfo();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void enableMayRenderStartOfStream() {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.enableMayRenderStartOfStream();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void flush(boolean z7) {
            if (isInitialized()) {
                throw null;
            }
            this.hasRegisteredFirstInputStream = false;
            this.finalBufferPresentationTimeUs = -9223372036854775807L;
            this.lastBufferPresentationTimeUs = -9223372036854775807L;
            PlaybackVideoGraphWrapper.this.flush(z7);
            this.pendingInputStreamBufferPresentationTimeUs = -9223372036854775807L;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface getInputSurface() {
            AbstractC1101a.m2359j(isInitialized());
            AbstractC1101a.m2360k(null);
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputBitmap(Bitmap bitmap, InterfaceC1110e0 interfaceC1110e0) {
            AbstractC1101a.m2359j(isInitialized());
            if (!maybeRegisterPendingInputStream()) {
                return false;
            }
            AbstractC1101a.m2360k(null);
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputFrame(long j, boolean z7, long j8, long j9, VideoSink.VideoFrameHandler videoFrameHandler) throws VideoSink.VideoSinkException {
            AbstractC1101a.m2359j(isInitialized());
            long j10 = j - this.inputBufferTimestampAdjustmentUs;
            try {
                if (PlaybackVideoGraphWrapper.this.videoFrameReleaseControl.getFrameReleaseAction(j10, j8, j9, this.inputStreamStartPositionUs, z7, this.frameReleaseInfo) != 4) {
                    if (j10 < this.lastResetPositionUs && !z7) {
                        videoFrameHandler.skip();
                        return true;
                    }
                    render(j8, j9);
                    if (this.isInputStreamChangePending) {
                        long j11 = this.pendingInputStreamBufferPresentationTimeUs;
                        if (j11 == -9223372036854775807L || PlaybackVideoGraphWrapper.this.hasReleasedFrame(j11)) {
                            maybeRegisterInputStream();
                            this.isInputStreamChangePending = false;
                            this.pendingInputStreamBufferPresentationTimeUs = -9223372036854775807L;
                        }
                    }
                    AbstractC1101a.m2360k(null);
                    throw null;
                }
                return false;
            } catch (ExoPlaybackException e) {
                C0249w c0249w = this.inputFormat;
                AbstractC1101a.m2360k(c0249w);
                throw new VideoSink.VideoSinkException(e, c0249w);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void initialize(C0249w c0249w) throws VideoSink.VideoSinkException {
            AbstractC1101a.m2359j(!isInitialized());
            PlaybackVideoGraphWrapper.access$1000(PlaybackVideoGraphWrapper.this, c0249w);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            if (!isInitialized()) {
                return false;
            }
            long j = this.finalBufferPresentationTimeUs;
            return j != -9223372036854775807L && PlaybackVideoGraphWrapper.this.hasReleasedFrame(j);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        @EnsuresNonNullIf(expression = {"videoFrameProcessor"}, result = true)
        public boolean isInitialized() {
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady(boolean z7) {
            return PlaybackVideoGraphWrapper.this.isReady(z7 && isInitialized());
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void join(boolean z7) {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.join(z7);
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onError(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, C0257y1 c0257y1) {
            this.listenerExecutor.execute(new RunnableC0498c(this, this.listener, c0257y1, 1));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFirstFrameRendered(PlaybackVideoGraphWrapper playbackVideoGraphWrapper) {
            this.listenerExecutor.execute(new RunnableC0499d(this, this.listener, 0));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFrameDropped(PlaybackVideoGraphWrapper playbackVideoGraphWrapper) {
            this.listenerExecutor.execute(new RunnableC0499d(this, this.listener, 1));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onInputStreamChanged(int i, C0249w c0249w) {
            AbstractC1101a.m2359j(isInitialized());
            if (i != 1 && i != 2) {
                throw new UnsupportedOperationException(AbstractC0008a1.m12h(i, "Unsupported input type "));
            }
            PlaybackVideoGraphWrapper.this.videoFrameReleaseControl.setFrameRate(c0249w.f1531w);
            this.inputType = i;
            this.inputFormat = c0249w;
            if (this.hasRegisteredFirstInputStream) {
                AbstractC1101a.m2359j(this.lastBufferPresentationTimeUs != -9223372036854775807L);
                this.isInputStreamChangePending = true;
                this.pendingInputStreamBufferPresentationTimeUs = this.lastBufferPresentationTimeUs;
            } else {
                maybeRegisterInputStream();
                this.hasRegisteredFirstInputStream = true;
                this.isInputStreamChangePending = false;
                this.pendingInputStreamBufferPresentationTimeUs = -9223372036854775807L;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererDisabled() {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.onRendererDisabled();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererEnabled(boolean z7) {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.onRendererEnabled(z7);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererStarted() {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.onRendererStarted();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererStopped() {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.onRendererStopped();
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onVideoSizeChanged(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, C0194d2 c0194d2) {
            this.listenerExecutor.execute(new RunnableC0498c(this, this.listener, c0194d2, 0));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            PlaybackVideoGraphWrapper.this.release();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void render(long j, long j8) throws VideoSink.VideoSinkException {
            try {
                PlaybackVideoGraphWrapper.this.render(j, j8);
            } catch (ExoPlaybackException e) {
                C0249w c0249w = this.inputFormat;
                if (c0249w == null) {
                    c0249w = new C0249w(new C0246v());
                }
                throw new VideoSink.VideoSinkException(e, c0249w);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setChangeFrameRateStrategy(int i) {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.setChangeFrameRateStrategy(i);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setListener(VideoSink.Listener listener, Executor executor) {
            this.listener = listener;
            this.listenerExecutor = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setOutputSurfaceInfo(Surface surface, C1134y c1134y) {
            PlaybackVideoGraphWrapper.this.setOutputSurfaceInfo(surface, c1134y);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPendingVideoEffects(List<Object> list) {
            this.videoEffects.clear();
            this.videoEffects.addAll(list);
            this.videoEffects.addAll(PlaybackVideoGraphWrapper.this.compositionEffects);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPlaybackSpeed(float f8) {
            PlaybackVideoGraphWrapper.this.setPlaybackSpeed(f8);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setStreamTimestampInfo(long j, long j8, long j9, long j10) {
            this.pendingInputStreamOffsetChange |= (this.inputStreamOffsetUs == j8 && this.inputBufferTimestampAdjustmentUs == j9) ? false : true;
            this.inputStreamStartPositionUs = j;
            this.inputStreamOffsetUs = j8;
            this.inputBufferTimestampAdjustmentUs = j9;
            this.lastResetPositionUs = j10;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoEffects(List<Object> list) {
            if (this.videoEffects.equals(list)) {
                return;
            }
            setPendingVideoEffects(list);
            maybeRegisterInputStream();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
            PlaybackVideoGraphWrapper.this.setVideoFrameMetadataListener(videoFrameMetadataListener);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Listener {
        void onError(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, C0257y1 c0257y1);

        void onFirstFrameRendered(PlaybackVideoGraphWrapper playbackVideoGraphWrapper);

        void onFrameDropped(PlaybackVideoGraphWrapper playbackVideoGraphWrapper);

        void onVideoSizeChanged(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, C0194d2 c0194d2);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class ReflectiveDefaultVideoFrameProcessorFactory implements InterfaceC0260z1 {
        private static final InterfaceC0921i VIDEO_FRAME_PROCESSOR_FACTORY_SUPPLIER = AbstractC0120b.m393A(new C0500e());

        private ReflectiveDefaultVideoFrameProcessorFactory() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InterfaceC0260z1 lambda$static$0() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                objInvoke.getClass();
                return (InterfaceC0260z1) objInvoke;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // androidx.media3.common.InterfaceC0260z1
        public InterfaceC0186b2 create(Context context, InterfaceC0225o interfaceC0225o, C0216l c0216l, boolean z7, Executor executor, InterfaceC0172a2 interfaceC0172a2) {
            ((InterfaceC0260z1) VIDEO_FRAME_PROCESSOR_FACTORY_SUPPLIER.get()).create(context, interfaceC0225o, c0216l, z7, executor, interfaceC0172a2);
            return null;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class ReflectivePreviewingSingleInputVideoGraphFactory implements InterfaceC0197e1 {
        private final InterfaceC0260z1 videoFrameProcessorFactory;

        public ReflectivePreviewingSingleInputVideoGraphFactory(InterfaceC0260z1 interfaceC0260z1) {
            this.videoFrameProcessorFactory = interfaceC0260z1;
        }

        @Override // androidx.media3.common.InterfaceC0197e1
        public InterfaceC0200f1 create(Context context, C0216l c0216l, InterfaceC0225o interfaceC0225o, InterfaceC0190c2 interfaceC0190c2, Executor executor, List<Object> list, long j) throws C0257y1 {
            try {
                ((InterfaceC0197e1) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC0260z1.class).newInstance(this.videoFrameProcessorFactory)).create(context, c0216l, interfaceC0225o, interfaceC0190c2, executor, list, j);
                return null;
            } catch (Exception e) {
                if (!(e instanceof C0257y1)) {
                    throw new C0257y1(e);
                }
                int i = C0257y1.f1552j;
                throw ((C0257y1) e);
            }
        }
    }

    public static /* synthetic */ InterfaceC0186b2 access$1000(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, C0249w c0249w) throws VideoSink.VideoSinkException {
        playbackVideoGraphWrapper.initialize(c0249w);
        return null;
    }

    public static /* synthetic */ InterfaceC0200f1 access$2600(PlaybackVideoGraphWrapper playbackVideoGraphWrapper) {
        playbackVideoGraphWrapper.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush(boolean z7) {
        if (isInitialized()) {
            this.pendingFlushCount++;
            this.defaultVideoSink.flush(z7);
            InterfaceC1120k interfaceC1120k = this.handler;
            AbstractC1101a.m2360k(interfaceC1120k);
            ((C1104b0) interfaceC1120k).m2382e(new RunnableC0127c0(4, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C0216l getAdjustedInputColorInfo(C0216l c0216l) {
        return (c0216l == null || !c0216l.m634d()) ? C0216l.f1178h : c0216l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasReleasedFrame(long j) {
        return this.pendingFlushCount == 0 && this.videoFrameRenderControl.hasReleasedFrame(j);
    }

    private InterfaceC0186b2 initialize(C0249w c0249w) throws VideoSink.VideoSinkException {
        AbstractC1101a.m2359j(this.state == 0);
        C0216l adjustedInputColorInfo = getAdjustedInputColorInfo(c0249w.f1497B);
        C0216l c0216l = (adjustedInputColorInfo.f1187c != 7 || AbstractC1118i0.f4750a >= 34) ? adjustedInputColorInfo : new C0216l(adjustedInputColorInfo.f1185a, adjustedInputColorInfo.f1186b, 6, adjustedInputColorInfo.f1189e, adjustedInputColorInfo.f1190f, adjustedInputColorInfo.f1188d);
        InterfaceC1103b interfaceC1103b = this.clock;
        Looper looperMyLooper = Looper.myLooper();
        AbstractC1101a.m2360k(looperMyLooper);
        final C1104b0 c1104b0M2541a = ((C1135z) interfaceC1103b).m2541a(looperMyLooper, null);
        this.handler = c1104b0M2541a;
        try {
            InterfaceC0197e1 interfaceC0197e1 = this.previewingVideoGraphFactory;
            Context context = this.context;
            C0222n c0222n = InterfaceC0225o.f1230a;
            Executor executor = new Executor() { // from class: androidx.media3.exoplayer.video.b
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    c1104b0M2541a.m2382e(runnable);
                }
            };
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            try {
                interfaceC0197e1.create(context, c0216l, c0222n, this, executor, C0981l1.f4211n, 0L);
                Pair<Surface, C1134y> pair = this.currentSurfaceAndSize;
                if (pair == null) {
                    throw null;
                }
                Surface surface = (Surface) pair.first;
                C1134y c1134y = (C1134y) pair.second;
                maybeSetOutputSurfaceInfo(surface, c1134y.f4803a, c1134y.f4804b);
                throw null;
            } catch (C0257y1 e) {
                e = e;
                throw new VideoSink.VideoSinkException(e, c0249w);
            }
        } catch (C0257y1 e8) {
            e = e8;
        }
    }

    private boolean isInitialized() {
        return this.state == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReady(boolean z7) {
        return this.defaultVideoSink.isReady(z7 && this.pendingFlushCount == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$flush$1() {
        this.pendingFlushCount--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Runnable runnable) {
    }

    private void maybeSetOutputSurfaceInfo(Surface surface, int i, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStreamOffsetChange(long j, long j8, long j9) {
        this.bufferTimestampAdjustmentUs = j;
        this.videoFrameRenderControl.onStreamOffsetChange(j8, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(long j, long j8) {
        this.videoFrameRenderControl.render(j, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f8) {
        this.defaultVideoSink.setPlaybackSpeed(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void clearOutputSurfaceInfo() {
        C1134y c1134y = C1134y.f4802c;
        maybeSetOutputSurfaceInfo(null, c1134y.f4803a, c1134y.f4804b);
        this.currentSurfaceAndSize = null;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public VideoSink getSink() {
        return this.inputVideoSink;
    }

    public void onEnded(long j) {
        throw new UnsupportedOperationException();
    }

    public void onError(C0257y1 c0257y1) {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(this, c0257y1);
        }
    }

    public void onOutputFrameAvailableForRendering(long j) {
        if (this.pendingFlushCount > 0) {
            return;
        }
        this.videoFrameRenderControl.onOutputFrameAvailableForRendering(j - this.bufferTimestampAdjustmentUs);
    }

    public void onOutputSizeChanged(int i, int i4) {
        C0246v c0246v = new C0246v();
        c0246v.f1454t = i;
        c0246v.f1455u = i4;
        this.defaultVideoSink.onInputStreamChanged(1, new C0249w(c0246v));
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void release() {
        if (this.state == 2) {
            return;
        }
        InterfaceC1120k interfaceC1120k = this.handler;
        if (interfaceC1120k != null) {
            ((C1104b0) interfaceC1120k).f4715a.removeCallbacksAndMessages(null);
        }
        this.currentSurfaceAndSize = null;
        this.state = 2;
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setOutputSurfaceInfo(Surface surface, C1134y c1134y) {
        Pair<Surface, C1134y> pair = this.currentSurfaceAndSize;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C1134y) this.currentSurfaceAndSize.second).equals(c1134y)) {
            return;
        }
        this.currentSurfaceAndSize = Pair.create(surface, c1134y);
        maybeSetOutputSurfaceInfo(surface, c1134y.f4803a, c1134y.f4804b);
    }

    private PlaybackVideoGraphWrapper(Builder builder) {
        Context context = builder.context;
        this.context = context;
        InputVideoSink inputVideoSink = new InputVideoSink(context);
        this.inputVideoSink = inputVideoSink;
        InterfaceC1103b interfaceC1103b = builder.clock;
        this.clock = interfaceC1103b;
        VideoFrameReleaseControl videoFrameReleaseControl = builder.videoFrameReleaseControl;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        videoFrameReleaseControl.setClock(interfaceC1103b);
        VideoFrameRenderControl videoFrameRenderControl = new VideoFrameRenderControl(new FrameRendererImpl(), videoFrameReleaseControl);
        this.videoFrameRenderControl = videoFrameRenderControl;
        InterfaceC0197e1 interfaceC0197e1 = builder.previewingVideoGraphFactory;
        AbstractC1101a.m2360k(interfaceC0197e1);
        this.previewingVideoGraphFactory = interfaceC0197e1;
        this.compositionEffects = builder.compositionEffects;
        this.defaultVideoSink = new DefaultVideoSink(videoFrameReleaseControl, videoFrameRenderControl);
        this.listeners = new CopyOnWriteArraySet<>();
        this.state = 0;
        addListener(inputVideoSink);
    }
}
