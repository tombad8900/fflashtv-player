package androidx.media3.exoplayer;

import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import java.util.Objects;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.InterfaceC1103b;
import p106m1.C1872g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class BaseRenderer implements Renderer, RendererCapabilities {
    private InterfaceC1103b clock;
    private RendererConfiguration configuration;
    private int index;
    private long lastResetPositionUs;
    private PlayerId playerId;
    private RendererCapabilities.Listener rendererCapabilitiesListener;
    private int state;
    private SampleStream stream;
    private C0249w[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;
    private final Object lock = new Object();
    private final FormatHolder formatHolder = new FormatHolder();
    private long readingPositionUs = Long.MIN_VALUE;
    private AbstractC0230p1 timeline = AbstractC0230p1.EMPTY;

    public BaseRenderer(int i) {
        this.trackType = i;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void clearListener() {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = null;
        }
    }

    public final ExoPlaybackException createRendererException(Throwable th, C0249w c0249w, int i) {
        return createRendererException(th, c0249w, false, i);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void disable() {
        AbstractC1101a.m2359j(this.state == 1);
        this.formatHolder.clear();
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void enable(RendererConfiguration rendererConfiguration, C0249w[] c0249wArr, SampleStream sampleStream, long j, boolean z7, boolean z8, long j8, long j9, MediaSource.MediaPeriodId mediaPeriodId) {
        AbstractC1101a.m2359j(this.state == 0);
        this.configuration = rendererConfiguration;
        this.state = 1;
        onEnabled(z7, z8);
        replaceStream(c0249wArr, sampleStream, j8, j9, mediaPeriodId);
        resetPosition(j8, z7);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    public final InterfaceC1103b getClock() {
        InterfaceC1103b interfaceC1103b = this.clock;
        interfaceC1103b.getClass();
        return interfaceC1103b;
    }

    public final RendererConfiguration getConfiguration() {
        RendererConfiguration rendererConfiguration = this.configuration;
        rendererConfiguration.getClass();
        return rendererConfiguration;
    }

    public final FormatHolder getFormatHolder() {
        this.formatHolder.clear();
        return this.formatHolder;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getLastResetPositionUs() {
        return this.lastResetPositionUs;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public MediaClock getMediaClock() {
        return null;
    }

    public final PlayerId getPlayerId() {
        PlayerId playerId = this.playerId;
        playerId.getClass();
        return playerId;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long getReadingPositionUs() {
        return this.readingPositionUs;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.state;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final SampleStream getStream() {
        return this.stream;
    }

    public final C0249w[] getStreamFormats() {
        C0249w[] c0249wArr = this.streamFormats;
        c0249wArr.getClass();
        return c0249wArr;
    }

    public final long getStreamOffsetUs() {
        return this.streamOffsetUs;
    }

    public final AbstractC0230p1 getTimeline() {
        return this.timeline;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int getTrackType() {
        return this.trackType;
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean hasReadStreamToEnd() {
        return this.readingPositionUs == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void init(int i, PlayerId playerId, InterfaceC1103b interfaceC1103b) {
        this.index = i;
        this.playerId = playerId;
        this.clock = interfaceC1103b;
        onInit();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    public final boolean isSourceReady() {
        if (hasReadStreamToEnd()) {
            return this.streamIsFinal;
        }
        SampleStream sampleStream = this.stream;
        sampleStream.getClass();
        return sampleStream.isReady();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void maybeThrowStreamError() {
        SampleStream sampleStream = this.stream;
        sampleStream.getClass();
        sampleStream.maybeThrowError();
    }

    public void onDisabled() {
    }

    public void onEnabled(boolean z7, boolean z8) {
    }

    public void onInit() {
    }

    public void onPositionReset(long j, boolean z7) {
    }

    public void onRelease() {
    }

    public final void onRendererCapabilitiesChanged() {
        RendererCapabilities.Listener listener;
        synchronized (this.lock) {
            listener = this.rendererCapabilitiesListener;
        }
        if (listener != null) {
            listener.onRendererCapabilitiesChanged(this);
        }
    }

    public void onReset() {
    }

    public void onStarted() {
    }

    public void onStopped() {
    }

    public void onStreamChanged(C0249w[] c0249wArr, long j, long j8, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public void onTimelineChanged(AbstractC0230p1 abstractC0230p1) {
    }

    public final int readSource(FormatHolder formatHolder, C1872g c1872g, int i) {
        SampleStream sampleStream = this.stream;
        sampleStream.getClass();
        int data = sampleStream.readData(formatHolder, c1872g, i);
        if (data == -4) {
            if (c1872g.isEndOfStream()) {
                this.readingPositionUs = Long.MIN_VALUE;
                return this.streamIsFinal ? -4 : -3;
            }
            long j = c1872g.timeUs + this.streamOffsetUs;
            c1872g.timeUs = j;
            this.readingPositionUs = Math.max(this.readingPositionUs, j);
            return data;
        }
        if (data == -5) {
            C0249w c0249w = formatHolder.format;
            c0249w.getClass();
            long j8 = c0249w.f1527s;
            if (j8 != Long.MAX_VALUE) {
                C0246v c0246vM692a = c0249w.m692a();
                c0246vM692a.f1452r = j8 + this.streamOffsetUs;
                formatHolder.format = new C0249w(c0246vM692a);
            }
        }
        return data;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void release() {
        AbstractC1101a.m2359j(this.state == 0);
        onRelease();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void replaceStream(C0249w[] c0249wArr, SampleStream sampleStream, long j, long j8, MediaSource.MediaPeriodId mediaPeriodId) {
        AbstractC1101a.m2359j(!this.streamIsFinal);
        this.stream = sampleStream;
        if (this.readingPositionUs == Long.MIN_VALUE) {
            this.readingPositionUs = j;
        }
        this.streamFormats = c0249wArr;
        this.streamOffsetUs = j8;
        onStreamChanged(c0249wArr, j, j8, mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        AbstractC1101a.m2359j(this.state == 0);
        this.formatHolder.clear();
        onReset();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void resetPosition(long j) {
        resetPosition(j, false);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void setListener(RendererCapabilities.Listener listener) {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = listener;
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setTimeline(AbstractC0230p1 abstractC0230p1) {
        AbstractC0230p1 abstractC0230p12 = this.timeline;
        int i = AbstractC1118i0.f4750a;
        if (Objects.equals(abstractC0230p12, abstractC0230p1)) {
            return;
        }
        this.timeline = abstractC0230p1;
        onTimelineChanged(abstractC0230p1);
    }

    public int skipSource(long j) {
        SampleStream sampleStream = this.stream;
        sampleStream.getClass();
        return sampleStream.skipData(j - this.streamOffsetUs);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void start() {
        AbstractC1101a.m2359j(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void stop() {
        AbstractC1101a.m2359j(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    private void resetPosition(long j, boolean z7) {
        this.streamIsFinal = false;
        this.lastResetPositionUs = j;
        this.readingPositionUs = j;
        onPositionReset(j, z7);
    }

    public final ExoPlaybackException createRendererException(Throwable th, C0249w c0249w, boolean z7, int i) {
        int formatSupport;
        if (c0249w == null || this.throwRendererExceptionIsExecuting) {
            formatSupport = 4;
        } else {
            this.throwRendererExceptionIsExecuting = true;
            try {
                formatSupport = RendererCapabilities.getFormatSupport(supportsFormat(c0249w));
            } catch (ExoPlaybackException unused) {
            } finally {
                this.throwRendererExceptionIsExecuting = false;
            }
        }
        return ExoPlaybackException.createForRenderer(th, getName(), getIndex(), c0249w, formatSupport, z7, i);
    }
}
