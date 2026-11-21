package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0253x0;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1106c0;
import p063h1.C1135z;
import p106m1.AbstractC1870e;
import p106m1.AbstractC1877l;
import p106m1.C1872g;
import p106m1.InterfaceC1867b;
import p106m1.InterfaceC1869d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class DecoderVideoRenderer extends BaseRenderer {
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "DecoderVideoRenderer";
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private int consecutiveDroppedFrameCount;
    private InterfaceC1869d decoder;
    protected DecoderCounters decoderCounters;
    private DrmSession decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;
    private int firstFrameState;
    private final C1872g flagsOnlyBuffer;
    private final C1106c0 formatQueue;
    private VideoFrameMetadataListener frameMetadataListener;
    private long initialPositionUs;
    private C1872g inputBuffer;
    private C0249w inputFormat;
    private boolean inputStreamEnded;
    private long joiningDeadlineMs;
    private long lastRenderTimeUs;
    private final int maxDroppedFramesToNotify;
    private Object output;
    private AbstractC1877l outputBuffer;
    private VideoDecoderOutputBufferRenderer outputBufferRenderer;
    private C0249w outputFormat;
    private int outputMode;
    private boolean outputStreamEnded;
    private Surface outputSurface;
    private C0194d2 reportedVideoSize;
    private DrmSession sourceDrmSession;
    private boolean waitingForFirstSampleInFormat;

    public DecoderVideoRenderer(long j, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        super(2);
        this.allowedJoiningTimeMs = j;
        this.maxDroppedFramesToNotify = i;
        this.joiningDeadlineMs = -9223372036854775807L;
        this.formatQueue = new C1106c0();
        this.flagsOnlyBuffer = C1872g.newNoDataInstance();
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.decoderReinitializationState = 0;
        this.outputMode = -1;
        this.firstFrameState = 0;
        this.decoderCounters = new DecoderCounters();
    }

    private boolean drainOutputBuffer(long j, long j8) {
        InterfaceC1869d interfaceC1869d = this.decoder;
        interfaceC1869d.getClass();
        if (interfaceC1869d.dequeueOutputBuffer() == null) {
            return false;
        }
        throw new ClassCastException();
    }

    private boolean feedInputBuffer() throws ExoPlaybackException {
        InterfaceC1869d interfaceC1869d = this.decoder;
        if (interfaceC1869d == null || this.decoderReinitializationState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputBuffer == null) {
            C1872g c1872g = (C1872g) interfaceC1869d.dequeueInputBuffer();
            this.inputBuffer = c1872g;
            if (c1872g == null) {
                return false;
            }
        }
        C1872g c1872g2 = this.inputBuffer;
        c1872g2.getClass();
        if (this.decoderReinitializationState == 1) {
            c1872g2.setFlags(4);
            InterfaceC1869d interfaceC1869d2 = this.decoder;
            interfaceC1869d2.getClass();
            interfaceC1869d2.queueInputBuffer(c1872g2);
            this.inputBuffer = null;
            this.decoderReinitializationState = 2;
            return false;
        }
        FormatHolder formatHolder = getFormatHolder();
        int source = readSource(formatHolder, c1872g2, 0);
        if (source == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (source != -4) {
            if (source == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (c1872g2.isEndOfStream()) {
            this.inputStreamEnded = true;
            InterfaceC1869d interfaceC1869d3 = this.decoder;
            interfaceC1869d3.getClass();
            interfaceC1869d3.queueInputBuffer(c1872g2);
            this.inputBuffer = null;
            return false;
        }
        if (this.waitingForFirstSampleInFormat) {
            C1106c0 c1106c0 = this.formatQueue;
            long j = c1872g2.timeUs;
            C0249w c0249w = this.inputFormat;
            c0249w.getClass();
            c1106c0.m2387a(c0249w, j);
            this.waitingForFirstSampleInFormat = false;
        }
        c1872g2.flip();
        c1872g2.format = this.inputFormat;
        onQueueInputBuffer(c1872g2);
        InterfaceC1869d interfaceC1869d4 = this.decoder;
        interfaceC1869d4.getClass();
        interfaceC1869d4.queueInputBuffer(c1872g2);
        this.buffersInCodecCount++;
        this.decoderReceivedBuffers = true;
        this.decoderCounters.queuedInputBufferCount++;
        this.inputBuffer = null;
        return true;
    }

    private boolean hasOutput() {
        return this.outputMode != -1;
    }

    private static boolean isBufferLate(long j) {
        return j < -30000;
    }

    private static boolean isBufferVeryLate(long j) {
        return j < -500000;
    }

    private void lowerFirstFrameState(int i) {
        this.firstFrameState = Math.min(this.firstFrameState, i);
    }

    private void maybeInitDecoder() throws ExoPlaybackException {
        InterfaceC1867b cryptoConfig;
        if (this.decoder != null) {
            return;
        }
        setDecoderDrmSession(this.sourceDrmSession);
        DrmSession drmSession = this.decoderDrmSession;
        if (drmSession != null) {
            cryptoConfig = drmSession.getCryptoConfig();
            if (cryptoConfig == null && this.decoderDrmSession.getError() == null) {
                return;
            }
        } else {
            cryptoConfig = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C0249w c0249w = this.inputFormat;
            c0249w.getClass();
            InterfaceC1869d interfaceC1869dCreateDecoder = createDecoder(c0249w, cryptoConfig);
            this.decoder = interfaceC1869dCreateDecoder;
            interfaceC1869dCreateDecoder.setOutputStartTimeUs(getLastResetPositionUs());
            setDecoderOutputMode(this.outputMode);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.eventDispatcher;
            InterfaceC1869d interfaceC1869d = this.decoder;
            interfaceC1869d.getClass();
            eventDispatcher.decoderInitialized(interfaceC1869d.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.decoderCounters.decoderInitCount++;
        } catch (OutOfMemoryError e) {
            throw createRendererException(e, this.inputFormat, C0253x0.ERROR_CODE_DECODER_INIT_FAILED);
        } catch (AbstractC1870e e8) {
            AbstractC1101a.m2365p(TAG, "Video codec error", e8);
            this.eventDispatcher.videoCodecError(e8);
            throw createRendererException(e8, this.inputFormat, C0253x0.ERROR_CODE_DECODER_INIT_FAILED);
        }
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, jElapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = jElapsedRealtime;
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (this.firstFrameState != 3) {
            this.firstFrameState = 3;
            Object obj = this.output;
            if (obj != null) {
                this.eventDispatcher.renderedFirstFrame(obj);
            }
        }
    }

    private void maybeNotifyVideoSizeChanged(int i, int i4) {
        C0194d2 c0194d2 = this.reportedVideoSize;
        if (c0194d2 != null && c0194d2.f1086a == i && c0194d2.f1087b == i4) {
            return;
        }
        C0194d2 c0194d22 = new C0194d2(i, i4);
        this.reportedVideoSize = c0194d22;
        this.eventDispatcher.videoSizeChanged(c0194d22);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        Object obj;
        if (this.firstFrameState != 3 || (obj = this.output) == null) {
            return;
        }
        this.eventDispatcher.renderedFirstFrame(obj);
    }

    private void maybeRenotifyVideoSizeChanged() {
        C0194d2 c0194d2 = this.reportedVideoSize;
        if (c0194d2 != null) {
            this.eventDispatcher.videoSizeChanged(c0194d2);
        }
    }

    private void onOutputChanged() {
        maybeRenotifyVideoSizeChanged();
        lowerFirstFrameState(1);
        if (getState() == 2) {
            setJoiningDeadlineMs();
        }
    }

    private void onOutputRemoved() {
        this.reportedVideoSize = null;
        lowerFirstFrameState(1);
    }

    private void onOutputReset() {
        maybeRenotifyVideoSizeChanged();
        maybeRenotifyRenderedFirstFrame();
    }

    private boolean processOutputBuffer(long j, long j8) {
        if (this.initialPositionUs == -9223372036854775807L) {
            this.initialPositionUs = j;
        }
        throw null;
    }

    private void setDecoderDrmSession(DrmSession drmSession) {
        DrmSession.replaceSession(this.decoderDrmSession, drmSession);
        this.decoderDrmSession = drmSession;
    }

    private void setJoiningDeadlineMs() {
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs : -9223372036854775807L;
    }

    private void setSourceDrmSession(DrmSession drmSession) {
        DrmSession.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private boolean shouldForceRender(long j) {
        boolean z7 = getState() == 2;
        int i = this.firstFrameState;
        if (i == 0) {
            return z7;
        }
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            return z7 && shouldForceRenderOutputBuffer(j, AbstractC1118i0.m2428S(SystemClock.elapsedRealtime()) - this.lastRenderTimeUs);
        }
        throw new IllegalStateException();
    }

    public DecoderReuseEvaluation canReuseDecoder(String str, C0249w c0249w, C0249w c0249w2) {
        return new DecoderReuseEvaluation(str, c0249w, c0249w2, 0, 1);
    }

    public abstract InterfaceC1869d createDecoder(C0249w c0249w, InterfaceC1867b interfaceC1867b);

    public void dropOutputBuffer(AbstractC1877l abstractC1877l) {
        updateDroppedBufferCounters(0, 1);
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    public void flushDecoder() throws ExoPlaybackException {
        this.buffersInCodecCount = 0;
        if (this.decoderReinitializationState != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.inputBuffer = null;
        InterfaceC1869d interfaceC1869d = this.decoder;
        interfaceC1869d.getClass();
        interfaceC1869d.flush();
        interfaceC1869d.setOutputStartTimeUs(getLastResetPositionUs());
        this.decoderReceivedBuffers = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
        if (i == 1) {
            setOutput(obj);
        } else if (i == 7) {
            this.frameMetadataListener = (VideoFrameMetadataListener) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        if (this.inputFormat != null && isSourceReady() && (this.firstFrameState == 3 || !hasOutput())) {
            this.joiningDeadlineMs = -9223372036854775807L;
            return true;
        }
        if (this.joiningDeadlineMs == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = -9223372036854775807L;
        return false;
    }

    public boolean maybeDropBuffersToKeyframe(long j) throws ExoPlaybackException {
        int iSkipSource = skipSource(j);
        if (iSkipSource == 0) {
            return false;
        }
        this.decoderCounters.droppedToKeyframeCount++;
        updateDroppedBufferCounters(iSkipSource, this.buffersInCodecCount);
        flushDecoder();
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.inputFormat = null;
        this.reportedVideoSize = null;
        lowerFirstFrameState(0);
        try {
            setSourceDrmSession(null);
            releaseDecoder();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z7, boolean z8) {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.decoderCounters = decoderCounters;
        this.eventDispatcher.enabled(decoderCounters);
        this.firstFrameState = z8 ? 1 : 0;
    }

    public void onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        DecoderReuseEvaluation decoderReuseEvaluationCanReuseDecoder;
        this.waitingForFirstSampleInFormat = true;
        C0249w c0249w = formatHolder.format;
        c0249w.getClass();
        setSourceDrmSession(formatHolder.drmSession);
        C0249w c0249w2 = this.inputFormat;
        this.inputFormat = c0249w;
        InterfaceC1869d interfaceC1869d = this.decoder;
        if (interfaceC1869d == null) {
            maybeInitDecoder();
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.eventDispatcher;
            C0249w c0249w3 = this.inputFormat;
            c0249w3.getClass();
            eventDispatcher.inputFormatChanged(c0249w3, null);
            return;
        }
        if (this.sourceDrmSession != this.decoderDrmSession) {
            String name = interfaceC1869d.getName();
            c0249w2.getClass();
            decoderReuseEvaluationCanReuseDecoder = new DecoderReuseEvaluation(name, c0249w2, c0249w, 0, 128);
        } else {
            String name2 = interfaceC1869d.getName();
            c0249w2.getClass();
            decoderReuseEvaluationCanReuseDecoder = canReuseDecoder(name2, c0249w2, c0249w);
        }
        if (decoderReuseEvaluationCanReuseDecoder.result == 0) {
            if (this.decoderReceivedBuffers) {
                this.decoderReinitializationState = 1;
            } else {
                releaseDecoder();
                maybeInitDecoder();
            }
        }
        VideoRendererEventListener.EventDispatcher eventDispatcher2 = this.eventDispatcher;
        C0249w c0249w4 = this.inputFormat;
        c0249w4.getClass();
        eventDispatcher2.inputFormatChanged(c0249w4, decoderReuseEvaluationCanReuseDecoder);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z7) throws ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        lowerFirstFrameState(1);
        this.initialPositionUs = -9223372036854775807L;
        this.consecutiveDroppedFrameCount = 0;
        if (this.decoder != null) {
            flushDecoder();
        }
        if (z7) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = -9223372036854775807L;
        }
        this.formatQueue.m2388b();
    }

    public void onProcessedOutputBuffer(long j) {
        this.buffersInCodecCount--;
    }

    public void onQueueInputBuffer(C1872g c1872g) {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
        this.lastRenderTimeUs = AbstractC1118i0.m2428S(SystemClock.elapsedRealtime());
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
        this.joiningDeadlineMs = -9223372036854775807L;
        maybeNotifyDroppedFrames();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(C0249w[] c0249wArr, long j, long j8, MediaSource.MediaPeriodId mediaPeriodId) {
        super.onStreamChanged(c0249wArr, j, j8, mediaPeriodId);
    }

    public void releaseDecoder() {
        this.inputBuffer = null;
        this.decoderReinitializationState = 0;
        this.decoderReceivedBuffers = false;
        this.buffersInCodecCount = 0;
        InterfaceC1869d interfaceC1869d = this.decoder;
        if (interfaceC1869d != null) {
            this.decoderCounters.decoderReleaseCount++;
            interfaceC1869d.release();
            this.eventDispatcher.decoderReleased(this.decoder.getName());
            this.decoder = null;
        }
        setDecoderDrmSession(null);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j8) throws ExoPlaybackException {
        if (this.outputStreamEnded) {
            return;
        }
        if (this.inputFormat == null) {
            FormatHolder formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int source = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (source != -5) {
                if (source == -4) {
                    AbstractC1101a.m2359j(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    this.outputStreamEnded = true;
                    return;
                }
                return;
            }
            onInputFormatChanged(formatHolder);
        }
        maybeInitDecoder();
        if (this.decoder != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (drainOutputBuffer(j, j8)) {
                }
                while (feedInputBuffer()) {
                }
                Trace.endSection();
                this.decoderCounters.ensureUpdated();
            } catch (AbstractC1870e e) {
                AbstractC1101a.m2365p(TAG, "Video codec error", e);
                this.eventDispatcher.videoCodecError(e);
                throw createRendererException(e, this.inputFormat, C0253x0.ERROR_CODE_DECODING_FAILED);
            }
        }
    }

    public void renderOutputBuffer(AbstractC1877l abstractC1877l, long j, C0249w c0249w) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            ((C1135z) getClock()).getClass();
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, System.nanoTime(), c0249w, null);
        }
        this.lastRenderTimeUs = AbstractC1118i0.m2428S(SystemClock.elapsedRealtime());
        throw null;
    }

    public abstract void renderOutputBufferToSurface(AbstractC1877l abstractC1877l, Surface surface);

    public abstract void setDecoderOutputMode(int i);

    public final void setOutput(Object obj) {
        if (obj instanceof Surface) {
            this.outputSurface = (Surface) obj;
            this.outputBufferRenderer = null;
            this.outputMode = 1;
        } else if (obj instanceof VideoDecoderOutputBufferRenderer) {
            this.outputSurface = null;
            this.outputBufferRenderer = (VideoDecoderOutputBufferRenderer) obj;
            this.outputMode = 0;
        } else {
            this.outputSurface = null;
            this.outputBufferRenderer = null;
            this.outputMode = -1;
            obj = null;
        }
        if (this.output == obj) {
            if (obj != null) {
                onOutputReset();
                return;
            }
            return;
        }
        this.output = obj;
        if (obj == null) {
            onOutputRemoved();
            return;
        }
        if (this.decoder != null) {
            setDecoderOutputMode(this.outputMode);
        }
        onOutputChanged();
    }

    public boolean shouldDropBuffersToKeyframe(long j, long j8) {
        return isBufferVeryLate(j);
    }

    public boolean shouldDropOutputBuffer(long j, long j8) {
        return isBufferLate(j);
    }

    public boolean shouldForceRenderOutputBuffer(long j, long j8) {
        return isBufferLate(j) && j8 > SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    public void skipOutputBuffer(AbstractC1877l abstractC1877l) {
        this.decoderCounters.skippedOutputBufferCount++;
        throw null;
    }

    public void updateDroppedBufferCounters(int i, int i4) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedInputBufferCount += i;
        int i8 = i + i4;
        decoderCounters.droppedBufferCount += i8;
        this.droppedFrames += i8;
        int i9 = this.consecutiveDroppedFrameCount + i8;
        this.consecutiveDroppedFrameCount = i9;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i9, decoderCounters.maxConsecutiveDroppedBufferCount);
        int i10 = this.maxDroppedFramesToNotify;
        if (i10 <= 0 || this.droppedFrames < i10) {
            return;
        }
        maybeNotifyDroppedFrames();
    }
}
