package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0227o1;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.ProgressiveMediaPeriod;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import java.util.Objects;
import java.util.concurrent.Executor;
import p043e6.InterfaceC0921i;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.InterfaceC1111f;
import p089k1.InterfaceC1557c0;
import p089k1.InterfaceC1563g;
import p089k1.InterfaceC1564h;
import p115n1.C1985l;
import p115n1.InterfaceC1990q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ProgressiveMediaSource extends BaseMediaSource implements ProgressiveMediaPeriod.Listener {
    public static final int DEFAULT_LOADING_CHECK_INTERVAL_BYTES = 1048576;
    private final int continueLoadingCheckIntervalBytes;
    private final InterfaceC1563g dataSourceFactory;
    private final InterfaceC0921i downloadExecutorSupplier;
    private final DrmSessionManager drmSessionManager;
    private final LoadErrorHandlingPolicy loadableLoadErrorHandlingPolicy;
    private C0226o0 mediaItem;
    private final ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;
    private final boolean suppressPrepareError;
    private long timelineDurationUs;
    private boolean timelineIsLive;
    private boolean timelineIsPlaceholder;
    private boolean timelineIsSeekable;
    private InterfaceC1557c0 transferListener;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Factory implements MediaSourceFactory {
        private int continueLoadingCheckIntervalBytes;
        private final InterfaceC1563g dataSourceFactory;
        private InterfaceC0921i downloadExecutorSupplier;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;
        private boolean suppressPrepareError;

        public Factory(InterfaceC1563g interfaceC1563g) {
            this(interfaceC1563g, new C1985l());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ProgressiveMediaExtractor lambda$new$0(InterfaceC1990q interfaceC1990q, PlayerId playerId) {
            return new BundledExtractorsAdapter(interfaceC1990q);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ReleasableExecutor lambda$setDownloadExecutor$1(InterfaceC0921i interfaceC0921i, InterfaceC1111f interfaceC1111f) {
            return ReleasableExecutor.from((Executor) interfaceC0921i.get(), interfaceC1111f);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        public Factory setContinueLoadingCheckIntervalBytes(int i) {
            this.continueLoadingCheckIntervalBytes = i;
            return this;
        }

        public <T extends Executor> Factory setDownloadExecutor(InterfaceC0921i interfaceC0921i, InterfaceC1111f interfaceC1111f) {
            this.downloadExecutorSupplier = new C0444f(interfaceC0921i, 1, interfaceC1111f);
            return this;
        }

        public Factory setSuppressPrepareError(boolean z7) {
            this.suppressPrepareError = z7;
            return this;
        }

        public Factory(InterfaceC1563g interfaceC1563g, final InterfaceC1990q interfaceC1990q) {
            this(interfaceC1563g, new ProgressiveMediaExtractor.Factory() { // from class: androidx.media3.exoplayer.source.m
                @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
                public final ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
                    return ProgressiveMediaSource.Factory.lambda$new$0(interfaceC1990q, playerId);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public ProgressiveMediaSource createMediaSource(C0226o0 c0226o0) {
            c0226o0.f1239b.getClass();
            return new ProgressiveMediaSource(c0226o0, this.dataSourceFactory, this.progressiveMediaExtractorFactory, this.drmSessionManagerProvider.get(c0226o0), this.loadErrorHandlingPolicy, this.continueLoadingCheckIntervalBytes, this.suppressPrepareError, this.downloadExecutorSupplier);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            AbstractC1101a.m2357h("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.", drmSessionManagerProvider);
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            AbstractC1101a.m2357h("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.", loadErrorHandlingPolicy);
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        public Factory(InterfaceC1563g interfaceC1563g, ProgressiveMediaExtractor.Factory factory) {
            this(interfaceC1563g, factory, new DefaultDrmSessionManagerProvider(), new DefaultLoadErrorHandlingPolicy(), ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        }

        public Factory(InterfaceC1563g interfaceC1563g, ProgressiveMediaExtractor.Factory factory, DrmSessionManagerProvider drmSessionManagerProvider, LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i) {
            this.dataSourceFactory = interfaceC1563g;
            this.progressiveMediaExtractorFactory = factory;
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            this.continueLoadingCheckIntervalBytes = i;
        }
    }

    private C0211j0 getLocalConfiguration() {
        C0211j0 c0211j0 = getMediaItem().f1239b;
        c0211j0.getClass();
        return c0211j0;
    }

    private void notifySourceInfoRefreshed() {
        AbstractC0230p1 singlePeriodTimeline = new SinglePeriodTimeline(this.timelineDurationUs, this.timelineIsSeekable, false, this.timelineIsLive, (Object) null, getMediaItem());
        if (this.timelineIsPlaceholder) {
            singlePeriodTimeline = new ForwardingTimeline(singlePeriodTimeline) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaSource.1
                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.AbstractC0230p1
                public C0221m1 getPeriod(int i, C0221m1 c0221m1, boolean z7) {
                    super.getPeriod(i, c0221m1, z7);
                    c0221m1.f1209f = true;
                    return c0221m1;
                }

                @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.AbstractC0230p1
                public C0227o1 getWindow(int i, C0227o1 c0227o1, long j) {
                    super.getWindow(i, c0227o1, j);
                    c0227o1.f1270k = true;
                    return c0227o1;
                }
            };
        }
        refreshSourceInfo(singlePeriodTimeline);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(C0226o0 c0226o0) {
        C0211j0 localConfiguration = getLocalConfiguration();
        C0211j0 c0211j0 = c0226o0.f1239b;
        if (c0211j0 == null || !c0211j0.f1147a.equals(localConfiguration.f1147a) || c0211j0.f1155i != localConfiguration.f1155i) {
            return false;
        }
        String str = c0211j0.f1152f;
        String str2 = localConfiguration.f1152f;
        int i = AbstractC1118i0.f4750a;
        return Objects.equals(str, str2);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        InterfaceC1564h interfaceC1564hMo55l = this.dataSourceFactory.mo55l();
        InterfaceC1557c0 interfaceC1557c0 = this.transferListener;
        if (interfaceC1557c0 != null) {
            interfaceC1564hMo55l.addTransferListener(interfaceC1557c0);
        }
        C0211j0 localConfiguration = getLocalConfiguration();
        Uri uri = localConfiguration.f1147a;
        ProgressiveMediaExtractor progressiveMediaExtractorCreateProgressiveMediaExtractor = this.progressiveMediaExtractorFactory.createProgressiveMediaExtractor(getPlayerId());
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        DrmSessionEventListener.EventDispatcher eventDispatcherCreateDrmEventDispatcher = createDrmEventDispatcher(mediaPeriodId);
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadableLoadErrorHandlingPolicy;
        MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(mediaPeriodId);
        String str = localConfiguration.f1152f;
        int i = this.continueLoadingCheckIntervalBytes;
        boolean z7 = this.suppressPrepareError;
        long jM2428S = AbstractC1118i0.m2428S(localConfiguration.f1155i);
        InterfaceC0921i interfaceC0921i = this.downloadExecutorSupplier;
        return new ProgressiveMediaPeriod(uri, interfaceC1564hMo55l, progressiveMediaExtractorCreateProgressiveMediaExtractor, drmSessionManager, eventDispatcherCreateDrmEventDispatcher, loadErrorHandlingPolicy, eventDispatcherCreateEventDispatcher, this, allocator, str, i, z7, jM2428S, interfaceC0921i != null ? (ReleasableExecutor) interfaceC0921i.get() : null);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized C0226o0 getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaPeriod.Listener
    public void onSourceInfoRefreshed(long j, boolean z7, boolean z8) {
        if (j == -9223372036854775807L) {
            j = this.timelineDurationUs;
        }
        if (!this.timelineIsPlaceholder && this.timelineDurationUs == j && this.timelineIsSeekable == z7 && this.timelineIsLive == z8) {
            return;
        }
        this.timelineDurationUs = j;
        this.timelineIsSeekable = z7;
        this.timelineIsLive = z8;
        this.timelineIsPlaceholder = false;
        notifySourceInfoRefreshed();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(InterfaceC1557c0 interfaceC1557c0) {
        this.transferListener = interfaceC1557c0;
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        drmSessionManager.setPlayer(looperMyLooper, getPlayerId());
        this.drmSessionManager.prepare();
        notifySourceInfoRefreshed();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((ProgressiveMediaPeriod) mediaPeriod).release();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.drmSessionManager.release();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(C0226o0 c0226o0) {
        this.mediaItem = c0226o0;
    }

    private ProgressiveMediaSource(C0226o0 c0226o0, InterfaceC1563g interfaceC1563g, ProgressiveMediaExtractor.Factory factory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i, boolean z7, InterfaceC0921i interfaceC0921i) {
        this.mediaItem = c0226o0;
        this.dataSourceFactory = interfaceC1563g;
        this.progressiveMediaExtractorFactory = factory;
        this.drmSessionManager = drmSessionManager;
        this.loadableLoadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.continueLoadingCheckIntervalBytes = i;
        this.suppressPrepareError = z7;
        this.timelineIsPlaceholder = true;
        this.timelineDurationUs = -9223372036854775807L;
        this.downloadExecutorSupplier = interfaceC0921i;
    }
}
