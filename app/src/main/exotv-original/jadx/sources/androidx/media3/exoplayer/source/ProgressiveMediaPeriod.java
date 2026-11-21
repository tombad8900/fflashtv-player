package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.source.IcyDataSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import com.bumptech.glide.AbstractC0715d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p003a2.C0061b;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1109e;
import p063h1.C1132w;
import p089k1.C1555b0;
import p089k1.C1568l;
import p089k1.InterfaceC1564h;
import p106m1.C1872g;
import p115n1.AbstractC1994u;
import p115n1.C1964a0;
import p115n1.C1966b0;
import p115n1.C1986m;
import p115n1.C1992s;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class ProgressiveMediaPeriod implements MediaPeriod, InterfaceC1989p, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private static final C0249w ICY_FORMAT;
    private static final Map<String, String> ICY_METADATA_HEADERS = createIcyMetadataHeaders();
    private static final String TAG = "ProgressiveMediaPeriod";
    private final Allocator allocator;
    private MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;
    private final String customCacheKey;
    private final InterfaceC1564h dataSource;
    private int dataType;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private long durationUs;
    private int enabledTrackCount;
    private int extractedSamplesCountAtStartOfLoad;
    private final Handler handler;
    private boolean haveAudioVideoTracks;
    private C0061b icyHeaders;
    private boolean isLengthKnown;
    private boolean isLive;
    private boolean isSingleSample;
    private long lastSeekPositionUs;
    private final Listener listener;
    private final C1109e loadCondition;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final Loader loader;
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private boolean notifyDiscontinuity;
    private final Runnable onContinueLoadingRequestedRunnable;
    private boolean pendingDeferredRetry;
    private boolean pendingInitialDiscontinuity;
    private long pendingResetPositionUs;
    private boolean prepared;
    private final ProgressiveMediaExtractor progressiveMediaExtractor;
    private boolean released;
    private TrackId[] sampleQueueTrackIds;
    private SampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private InterfaceC1968c0 seekMap;
    private boolean seenFirstTrackSelection;
    private final long singleSampleDurationUs;
    private final boolean suppressPrepareError;
    private TrackState trackState;
    private final Uri uri;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {
        private final C1555b0 dataSource;
        private final InterfaceC1989p extractorOutput;
        private InterfaceC1980i0 icyTrackOutput;
        private volatile boolean loadCanceled;
        private final C1109e loadCondition;
        private final ProgressiveMediaExtractor progressiveMediaExtractor;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        private final Uri uri;
        private final C1964a0 positionHolder = new C1964a0();
        private boolean pendingExtractorSeek = true;
        private final long loadTaskId = LoadEventInfo.getNewId();
        private C1568l dataSpec = buildDataSpec(0);

        public ExtractingLoadable(Uri uri, InterfaceC1564h interfaceC1564h, ProgressiveMediaExtractor progressiveMediaExtractor, InterfaceC1989p interfaceC1989p, C1109e c1109e) {
            this.uri = uri;
            this.dataSource = new C1555b0(interfaceC1564h);
            this.progressiveMediaExtractor = progressiveMediaExtractor;
            this.extractorOutput = interfaceC1989p;
            this.loadCondition = c1109e;
        }

        private C1568l buildDataSpec(long j) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = this.uri;
            String str = ProgressiveMediaPeriod.this.customCacheKey;
            Map map2 = ProgressiveMediaPeriod.ICY_METADATA_HEADERS;
            AbstractC1101a.m2361l("The uri must be set.", uri);
            return new C1568l(uri, 1, null, map2, j, -1L, str, 6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadPosition(long j, long j8) {
            this.positionHolder.f7264a = j;
            this.seekTimeUs = j8;
            this.pendingExtractorSeek = true;
            this.seenIcyMetadata = false;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() {
            int i = 0;
            while (i == 0 && !this.loadCanceled) {
                try {
                    long j = this.positionHolder.f7264a;
                    C1568l c1568lBuildDataSpec = buildDataSpec(j);
                    this.dataSpec = c1568lBuildDataSpec;
                    long jOpen = this.dataSource.open(c1568lBuildDataSpec);
                    if (this.loadCanceled) {
                        if (i != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                            this.positionHolder.f7264a = this.progressiveMediaExtractor.getCurrentInputPosition();
                        }
                        AbstractC0715d.m1568p(this.dataSource);
                        return;
                    }
                    if (jOpen != -1) {
                        jOpen += j;
                        ProgressiveMediaPeriod.this.onLengthKnown();
                    }
                    long j8 = jOpen;
                    ProgressiveMediaPeriod.this.icyHeaders = C0061b.m248a(this.dataSource.f5953j.getResponseHeaders());
                    InterfaceC0219m icyDataSource = this.dataSource;
                    if (ProgressiveMediaPeriod.this.icyHeaders != null && ProgressiveMediaPeriod.this.icyHeaders.f298o != -1) {
                        icyDataSource = new IcyDataSource(this.dataSource, ProgressiveMediaPeriod.this.icyHeaders.f298o, this);
                        InterfaceC1980i0 interfaceC1980i0IcyTrack = ProgressiveMediaPeriod.this.icyTrack();
                        this.icyTrackOutput = interfaceC1980i0IcyTrack;
                        interfaceC1980i0IcyTrack.format(ProgressiveMediaPeriod.ICY_FORMAT);
                    }
                    this.progressiveMediaExtractor.init(icyDataSource, this.uri, this.dataSource.f5953j.getResponseHeaders(), j, j8, this.extractorOutput);
                    if (ProgressiveMediaPeriod.this.icyHeaders != null) {
                        this.progressiveMediaExtractor.disableSeekingOnMp3Streams();
                    }
                    if (this.pendingExtractorSeek) {
                        this.progressiveMediaExtractor.seek(j, this.seekTimeUs);
                        this.pendingExtractorSeek = false;
                    }
                    while (i == 0 && !this.loadCanceled) {
                        try {
                            this.loadCondition.m2403a();
                            i = this.progressiveMediaExtractor.read(this.positionHolder);
                            long currentInputPosition = this.progressiveMediaExtractor.getCurrentInputPosition();
                            if (currentInputPosition > ProgressiveMediaPeriod.this.continueLoadingCheckIntervalBytes + j) {
                                C1109e c1109e = this.loadCondition;
                                synchronized (c1109e) {
                                    c1109e.f4731a = false;
                                }
                                ProgressiveMediaPeriod.this.handler.post(ProgressiveMediaPeriod.this.onContinueLoadingRequestedRunnable);
                                j = currentInputPosition;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.f7264a = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    AbstractC0715d.m1568p(this.dataSource);
                } catch (Throwable th) {
                    if (i != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                        this.positionHolder.f7264a = this.progressiveMediaExtractor.getCurrentInputPosition();
                    }
                    AbstractC0715d.m1568p(this.dataSource);
                    throw th;
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.IcyDataSource.Listener
        public void onIcyMetadata(C1132w c1132w) {
            long jMax = !this.seenIcyMetadata ? this.seekTimeUs : Math.max(ProgressiveMediaPeriod.this.getLargestQueuedTimestampUs(true), this.seekTimeUs);
            int iM2515a = c1132w.m2515a();
            InterfaceC1980i0 interfaceC1980i0 = this.icyTrackOutput;
            interfaceC1980i0.getClass();
            interfaceC1980i0.sampleData(c1132w, iM2515a);
            interfaceC1980i0.sampleMetadata(jMax, 1, iM2515a, 0, null);
            this.seenIcyMetadata = true;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Listener {
        void onSourceInfoRefreshed(long j, boolean z7, boolean z8);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class SampleStreamImpl implements SampleStream {
        private final int track;

        public SampleStreamImpl(int i) {
            this.track = i;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return ProgressiveMediaPeriod.this.isReady(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
            ProgressiveMediaPeriod.this.maybeThrowError(this.track);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, C1872g c1872g, int i) {
            return ProgressiveMediaPeriod.this.readData(this.track, formatHolder, c1872g, i);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            return ProgressiveMediaPeriod.this.skipData(this.track, j);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class TrackId {

        /* renamed from: id */
        public final int f1807id;
        public final boolean isIcyTrack;

        public TrackId(int i, boolean z7) {
            this.f1807id = i;
            this.isIcyTrack = z7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && TrackId.class == obj.getClass()) {
                TrackId trackId = (TrackId) obj;
                if (this.f1807id == trackId.f1807id && this.isIcyTrack == trackId.isIcyTrack) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f1807id * 31) + (this.isIcyTrack ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class TrackState {
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final TrackGroupArray tracks;

        public TrackState(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.tracks = trackGroupArray;
            this.trackIsAudioVideoFlags = zArr;
            int i = trackGroupArray.length;
            this.trackEnabledStates = new boolean[i];
            this.trackNotifiedDownstreamFormats = new boolean[i];
        }
    }

    static {
        C0246v c0246v = new C0246v();
        c0246v.f1435a = "icy";
        c0246v.f1447m = AbstractC0244u0.m687p("application/x-icy");
        ICY_FORMAT = new C0249w(c0246v);
    }

    public ProgressiveMediaPeriod(Uri uri, InterfaceC1564h interfaceC1564h, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Listener listener, Allocator allocator, String str, int i, boolean z7, long j, ReleasableExecutor releasableExecutor) {
        this.uri = uri;
        this.dataSource = interfaceC1564h;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.listener = listener;
        this.allocator = allocator;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i;
        this.suppressPrepareError = z7;
        this.loader = releasableExecutor != null ? new Loader(releasableExecutor) : new Loader(TAG);
        this.progressiveMediaExtractor = progressiveMediaExtractor;
        this.singleSampleDurationUs = j;
        this.loadCondition = new C1109e();
        this.maybeFinishPrepareRunnable = new RunnableC0449k(this, 1);
        this.onContinueLoadingRequestedRunnable = new RunnableC0449k(this, 2);
        this.handler = AbstractC1118i0.m2457p(null);
        this.sampleQueueTrackIds = new TrackId[0];
        this.sampleQueues = new SampleQueue[0];
        this.pendingResetPositionUs = -9223372036854775807L;
        this.dataType = 1;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void assertPrepared() {
        AbstractC1101a.m2359j(this.prepared);
        this.trackState.getClass();
        this.seekMap.getClass();
    }

    private boolean configureRetry(ExtractingLoadable extractingLoadable, int i) {
        InterfaceC1968c0 interfaceC1968c0;
        if (this.isLengthKnown || !((interfaceC1968c0 = this.seekMap) == null || interfaceC1968c0.getDurationUs() == -9223372036854775807L)) {
            this.extractedSamplesCountAtStartOfLoad = i;
            return true;
        }
        if (this.prepared && !suppressRead()) {
            this.pendingDeferredRetry = true;
            return false;
        }
        this.notifyDiscontinuity = this.prepared;
        this.lastSeekPositionUs = 0L;
        this.extractedSamplesCountAtStartOfLoad = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        extractingLoadable.setLoadPosition(0L, 0L);
        return true;
    }

    private static Map<String, String> createIcyMetadataHeaders() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int getExtractedSamplesCount() {
        int writeIndex = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            writeIndex += sampleQueue.getWriteIndex();
        }
        return writeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long getLargestQueuedTimestampUs(boolean z7) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.sampleQueues.length; i++) {
            if (!z7) {
                TrackState trackState = this.trackState;
                trackState.getClass();
                if (trackState.trackEnabledStates[i]) {
                    jMax = Math.max(jMax, this.sampleQueues[i].getLargestQueuedTimestampUs());
                }
            }
        }
        return jMax;
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$0() {
        if (this.released) {
            return;
        }
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onContinueLoadingRequested(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLengthKnown$2() {
        this.isLengthKnown = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (this.released || this.prepared || !this.sampleQueuesBuilt || this.seekMap == null) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            if (sampleQueue.getUpstreamFormat() == null) {
                return;
            }
        }
        C1109e c1109e = this.loadCondition;
        synchronized (c1109e) {
            c1109e.f4731a = false;
        }
        int length = this.sampleQueues.length;
        C0233q1[] c0233q1Arr = new C0233q1[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            C0249w upstreamFormat = this.sampleQueues[i].getUpstreamFormat();
            upstreamFormat.getClass();
            String str = upstreamFormat.f1522n;
            boolean zM682k = AbstractC0244u0.m682k(str);
            boolean z7 = zM682k || AbstractC0244u0.m686o(str);
            zArr[i] = z7;
            this.haveAudioVideoTracks = z7 | this.haveAudioVideoTracks;
            this.isSingleSample = this.singleSampleDurationUs != -9223372036854775807L && length == 1 && AbstractC0244u0.m683l(str);
            C0061b c0061b = this.icyHeaders;
            if (c0061b != null) {
                int i4 = c0061b.f293j;
                if (zM682k || this.sampleQueueTrackIds[i].isIcyTrack) {
                    C0241t0 c0241t0 = upstreamFormat.f1520l;
                    C0241t0 c0241t02 = c0241t0 == null ? new C0241t0(c0061b) : c0241t0.m668a(c0061b);
                    C0246v c0246vM692a = upstreamFormat.m692a();
                    c0246vM692a.f1445k = c0241t02;
                    upstreamFormat = new C0249w(c0246vM692a);
                }
                if (zM682k && upstreamFormat.f1516h == -1 && upstreamFormat.f1517i == -1 && i4 != -1) {
                    C0246v c0246vM692a2 = upstreamFormat.m692a();
                    c0246vM692a2.f1442h = i4;
                    upstreamFormat = new C0249w(c0246vM692a2);
                }
            }
            int cryptoType = this.drmSessionManager.getCryptoType(upstreamFormat);
            C0246v c0246vM692a3 = upstreamFormat.m692a();
            c0246vM692a3.f1434K = cryptoType;
            C0249w c0249w = new C0249w(c0246vM692a3);
            c0233q1Arr[i] = new C0233q1(Integer.toString(i), c0249w);
            this.pendingInitialDiscontinuity = c0249w.f1528t | this.pendingInitialDiscontinuity;
        }
        this.trackState = new TrackState(new TrackGroupArray(c0233q1Arr), zArr);
        if (this.isSingleSample && this.durationUs == -9223372036854775807L) {
            this.durationUs = this.singleSampleDurationUs;
            this.seekMap = new AbstractC1994u(this.seekMap) { // from class: androidx.media3.exoplayer.source.ProgressiveMediaPeriod.1
                @Override // p115n1.AbstractC1994u, p115n1.InterfaceC1968c0
                public long getDurationUs() {
                    return ProgressiveMediaPeriod.this.durationUs;
                }
            };
        }
        this.listener.onSourceInfoRefreshed(this.durationUs, this.seekMap.isSeekable(), this.isLive);
        this.prepared = true;
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onPrepared(this);
    }

    private void maybeNotifyDownstreamFormat(int i) {
        assertPrepared();
        TrackState trackState = this.trackState;
        boolean[] zArr = trackState.trackNotifiedDownstreamFormats;
        if (zArr[i]) {
            return;
        }
        C0249w c0249w = trackState.tracks.get(i).f1322d[0];
        this.mediaSourceEventDispatcher.downstreamFormatChanged(AbstractC0244u0.m680i(c0249w.f1522n), c0249w, 0, null, this.lastSeekPositionUs);
        zArr[i] = true;
    }

    private void maybeStartDeferredRetry(int i) {
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (this.pendingDeferredRetry && zArr[i]) {
            if (this.sampleQueues[i].isReady(false)) {
                return;
            }
            this.pendingResetPositionUs = 0L;
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = true;
            this.lastSeekPositionUs = 0L;
            this.extractedSamplesCountAtStartOfLoad = 0;
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.reset();
            }
            MediaPeriod.Callback callback = this.callback;
            callback.getClass();
            callback.onContinueLoadingRequested(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLengthKnown() {
        this.handler.post(new RunnableC0449k(this, 0));
    }

    private InterfaceC1980i0 prepareTrackOutput(TrackId trackId) {
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            if (trackId.equals(this.sampleQueueTrackIds[i])) {
                return this.sampleQueues[i];
            }
        }
        if (this.sampleQueuesBuilt) {
            AbstractC1101a.m2348F(TAG, "Extractor added new track (id=" + trackId.f1807id + ") after finishing tracks.");
            return new C1986m();
        }
        SampleQueue sampleQueueCreateWithDrm = SampleQueue.createWithDrm(this.allocator, this.drmSessionManager, this.drmEventDispatcher);
        sampleQueueCreateWithDrm.setUpstreamFormatChangeListener(this);
        int i4 = length + 1;
        TrackId[] trackIdArr = (TrackId[]) Arrays.copyOf(this.sampleQueueTrackIds, i4);
        trackIdArr[length] = trackId;
        int i8 = AbstractC1118i0.f4750a;
        this.sampleQueueTrackIds = trackIdArr;
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.sampleQueues, i4);
        sampleQueueArr[length] = sampleQueueCreateWithDrm;
        this.sampleQueues = sampleQueueArr;
        return sampleQueueCreateWithDrm;
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j, boolean z7) {
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            SampleQueue sampleQueue = this.sampleQueues[i];
            if (sampleQueue.getReadIndex() != 0 || !z7) {
                if (!(this.isSingleSample ? sampleQueue.seekTo(sampleQueue.getFirstIndex()) : sampleQueue.seekTo(j, false)) && (zArr[i] || !this.haveAudioVideoTracks)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSeekMap, reason: merged with bridge method [inline-methods] */
    public void lambda$seekMap$1(InterfaceC1968c0 interfaceC1968c0) {
        this.seekMap = this.icyHeaders == null ? interfaceC1968c0 : new C1992s(-9223372036854775807L);
        this.durationUs = interfaceC1968c0.getDurationUs();
        boolean z7 = !this.isLengthKnown && interfaceC1968c0.getDurationUs() == -9223372036854775807L;
        this.isLive = z7;
        this.dataType = z7 ? 7 : 1;
        if (this.prepared) {
            this.listener.onSourceInfoRefreshed(this.durationUs, interfaceC1968c0.isSeekable(), this.isLive);
        } else {
            maybeFinishPrepare();
        }
    }

    private void startLoading() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.uri, this.dataSource, this.progressiveMediaExtractor, this, this.loadCondition);
        if (this.prepared) {
            AbstractC1101a.m2359j(isPendingReset());
            long j = this.durationUs;
            if (j != -9223372036854775807L && this.pendingResetPositionUs > j) {
                this.loadingFinished = true;
                this.pendingResetPositionUs = -9223372036854775807L;
                return;
            }
            InterfaceC1968c0 interfaceC1968c0 = this.seekMap;
            interfaceC1968c0.getClass();
            extractingLoadable.setLoadPosition(interfaceC1968c0.getSeekPoints(this.pendingResetPositionUs).f7290a.f7312b, this.pendingResetPositionUs);
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.setStartTimeUs(this.pendingResetPositionUs);
            }
            this.pendingResetPositionUs = -9223372036854775807L;
        }
        this.extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
        this.mediaSourceEventDispatcher.loadStarted(new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, this.loader.startLoading(extractingLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType))), 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
    }

    private boolean suppressRead() {
        return this.notifyDiscontinuity || isPendingReset();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.loadingFinished || this.loader.hasFatalError() || this.pendingDeferredRetry) {
            return false;
        }
        if (this.prepared && this.enabledTrackCount == 0) {
            return false;
        }
        boolean zM2405c = this.loadCondition.m2405c();
        if (this.loader.isLoading()) {
            return zM2405c;
        }
        startLoading();
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z7) {
        if (this.isSingleSample) {
            return;
        }
        assertPrepared();
        if (isPendingReset()) {
            return;
        }
        boolean[] zArr = this.trackState.trackEnabledStates;
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            this.sampleQueues[i].discardTo(j, z7, zArr[i]);
        }
    }

    @Override // p115n1.InterfaceC1989p
    public void endTracks() {
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        assertPrepared();
        if (!this.seekMap.isSeekable()) {
            return 0L;
        }
        C1966b0 seekPoints = this.seekMap.getSeekPoints(j);
        return seekParameters.resolveSeekPositionUs(j, seekPoints.f7290a.f7311a, seekPoints.f7291b.f7311a);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long largestQueuedTimestampUs;
        assertPrepared();
        if (this.loadingFinished || this.enabledTrackCount == 0) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.haveAudioVideoTracks) {
            int length = this.sampleQueues.length;
            largestQueuedTimestampUs = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                TrackState trackState = this.trackState;
                if (trackState.trackIsAudioVideoFlags[i] && trackState.trackEnabledStates[i] && !this.sampleQueues[i].isLastSampleQueued()) {
                    largestQueuedTimestampUs = Math.min(largestQueuedTimestampUs, this.sampleQueues[i].getLargestQueuedTimestampUs());
                }
            }
        } else {
            largestQueuedTimestampUs = Long.MAX_VALUE;
        }
        if (largestQueuedTimestampUs == Long.MAX_VALUE) {
            largestQueuedTimestampUs = getLargestQueuedTimestampUs(false);
        }
        return largestQueuedTimestampUs == Long.MIN_VALUE ? this.lastSeekPositionUs : largestQueuedTimestampUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        assertPrepared();
        return this.trackState.tracks;
    }

    public InterfaceC1980i0 icyTrack() {
        return prepareTrackOutput(new TrackId(0, true));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        boolean z7;
        if (!this.loader.isLoading()) {
            return false;
        }
        C1109e c1109e = this.loadCondition;
        synchronized (c1109e) {
            z7 = c1109e.f4731a;
        }
        return z7;
    }

    public boolean isReady(int i) {
        return !suppressRead() && this.sampleQueues[i].isReady(this.loadingFinished);
    }

    public void maybeThrowError(int i) {
        this.sampleQueues[i].maybeThrowError();
        maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        try {
            maybeThrowError();
        } catch (IOException e) {
            if (!this.suppressPrepareError) {
                throw e;
            }
            AbstractC1101a.m2365p(TAG, "Suppressing preparation error because suppressPrepareError=true", e);
            this.sampleQueuesBuilt = true;
            lambda$seekMap$1(new C1992s(-9223372036854775807L));
        }
        if (this.loadingFinished && !this.prepared) {
            throw C0247v0.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.release();
        }
        this.progressiveMediaExtractor.release();
    }

    @Override // androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(C0249w c0249w) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.loadCondition.m2405c();
        startLoading();
    }

    public int readData(int i, FormatHolder formatHolder, C1872g c1872g, int i4) {
        if (suppressRead()) {
            return -3;
        }
        maybeNotifyDownstreamFormat(i);
        int i8 = this.sampleQueues[i].read(formatHolder, c1872g, i4, this.loadingFinished);
        if (i8 == -3) {
            maybeStartDeferredRetry(i);
        }
        return i8;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        if (this.pendingInitialDiscontinuity) {
            this.pendingInitialDiscontinuity = false;
            return this.lastSeekPositionUs;
        }
        if (!this.notifyDiscontinuity) {
            return -9223372036854775807L;
        }
        if (!this.loadingFinished && getExtractedSamplesCount() <= this.extractedSamplesCountAtStartOfLoad) {
            return -9223372036854775807L;
        }
        this.notifyDiscontinuity = false;
        return this.lastSeekPositionUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
    }

    public void release() {
        if (this.prepared) {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.preRelease();
            }
        }
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.callback = null;
        this.released = true;
    }

    @Override // p115n1.InterfaceC1989p
    public void seekMap(InterfaceC1968c0 interfaceC1968c0) {
        this.handler.post(new RunnableC0450l(this, 0, interfaceC1968c0));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        assertPrepared();
        boolean[] zArr = this.trackState.trackIsAudioVideoFlags;
        if (!this.seekMap.isSeekable()) {
            j = 0;
        }
        int i = 0;
        this.notifyDiscontinuity = false;
        boolean z7 = this.lastSeekPositionUs == j;
        this.lastSeekPositionUs = j;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return j;
        }
        if (this.dataType == 7 || ((!this.loadingFinished && !this.loader.isLoading()) || !seekInsideBufferUs(zArr, j, z7))) {
            this.pendingDeferredRetry = false;
            this.pendingResetPositionUs = j;
            this.loadingFinished = false;
            this.pendingInitialDiscontinuity = false;
            if (this.loader.isLoading()) {
                SampleQueue[] sampleQueueArr = this.sampleQueues;
                int length = sampleQueueArr.length;
                while (i < length) {
                    sampleQueueArr[i].discardToEnd();
                    i++;
                }
                this.loader.cancelLoading();
                return j;
            }
            this.loader.clearFatalError();
            SampleQueue[] sampleQueueArr2 = this.sampleQueues;
            int length2 = sampleQueueArr2.length;
            while (i < length2) {
                sampleQueueArr2[i].reset();
                i++;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        ExoTrackSelection exoTrackSelection;
        assertPrepared();
        TrackState trackState = this.trackState;
        TrackGroupArray trackGroupArray = trackState.tracks;
        boolean[] zArr3 = trackState.trackEnabledStates;
        int i = this.enabledTrackCount;
        int i4 = 0;
        for (int i8 = 0; i8 < exoTrackSelectionArr.length; i8++) {
            SampleStream sampleStream = sampleStreamArr[i8];
            if (sampleStream != null && (exoTrackSelectionArr[i8] == null || !zArr[i8])) {
                int i9 = ((SampleStreamImpl) sampleStream).track;
                AbstractC1101a.m2359j(zArr3[i9]);
                this.enabledTrackCount--;
                zArr3[i9] = false;
                sampleStreamArr[i8] = null;
            }
        }
        boolean z7 = !this.seenFirstTrackSelection ? j == 0 || this.isSingleSample : i != 0;
        for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
            if (sampleStreamArr[i10] == null && (exoTrackSelection = exoTrackSelectionArr[i10]) != null) {
                AbstractC1101a.m2359j(exoTrackSelection.length() == 1);
                AbstractC1101a.m2359j(exoTrackSelection.getIndexInTrackGroup(0) == 0);
                int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
                AbstractC1101a.m2359j(!zArr3[iIndexOf]);
                this.enabledTrackCount++;
                zArr3[iIndexOf] = true;
                this.pendingInitialDiscontinuity = exoTrackSelection.getSelectedFormat().f1528t | this.pendingInitialDiscontinuity;
                sampleStreamArr[i10] = new SampleStreamImpl(iIndexOf);
                zArr2[i10] = true;
                if (!z7) {
                    SampleQueue sampleQueue = this.sampleQueues[iIndexOf];
                    z7 = (sampleQueue.getReadIndex() == 0 || sampleQueue.seekTo(j, true)) ? false : true;
                }
            }
        }
        if (this.enabledTrackCount == 0) {
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = false;
            this.pendingInitialDiscontinuity = false;
            if (this.loader.isLoading()) {
                SampleQueue[] sampleQueueArr = this.sampleQueues;
                int length = sampleQueueArr.length;
                while (i4 < length) {
                    sampleQueueArr[i4].discardToEnd();
                    i4++;
                }
                this.loader.cancelLoading();
            } else {
                this.loadingFinished = false;
                SampleQueue[] sampleQueueArr2 = this.sampleQueues;
                int length2 = sampleQueueArr2.length;
                while (i4 < length2) {
                    sampleQueueArr2[i4].reset();
                    i4++;
                }
            }
        } else if (z7) {
            j = seekToUs(j);
            while (i4 < sampleStreamArr.length) {
                if (sampleStreamArr[i4] != null) {
                    zArr2[i4] = true;
                }
                i4++;
            }
        }
        this.seenFirstTrackSelection = true;
        return j;
    }

    public int skipData(int i, long j) {
        if (suppressRead()) {
            return 0;
        }
        maybeNotifyDownstreamFormat(i);
        SampleQueue sampleQueue = this.sampleQueues[i];
        int skipCount = sampleQueue.getSkipCount(j, this.loadingFinished);
        sampleQueue.skip(skipCount);
        if (skipCount == 0) {
            maybeStartDeferredRetry(i);
        }
        return skipCount;
    }

    @Override // p115n1.InterfaceC1989p
    public InterfaceC1980i0 track(int i, int i4) {
        return prepareTrackOutput(new TrackId(i, false));
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(ExtractingLoadable extractingLoadable, long j, long j8, boolean z7) {
        C1555b0 c1555b0 = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, c1555b0.f5955l, c1555b0.f5956m, j, j8, c1555b0.f5954k);
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        if (z7) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        if (this.enabledTrackCount > 0) {
            MediaPeriod.Callback callback = this.callback;
            callback.getClass();
            callback.onContinueLoadingRequested(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(ExtractingLoadable extractingLoadable, long j, long j8) {
        InterfaceC1968c0 interfaceC1968c0;
        if (this.durationUs == -9223372036854775807L && (interfaceC1968c0 = this.seekMap) != null) {
            boolean zIsSeekable = interfaceC1968c0.isSeekable();
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs(true);
            long j9 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + 10000;
            this.durationUs = j9;
            this.listener.onSourceInfoRefreshed(j9, zIsSeekable, this.isLive);
        }
        C1555b0 c1555b0 = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, c1555b0.f5955l, c1555b0.f5956m, j, j8, c1555b0.f5954k);
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs);
        this.loadingFinished = true;
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(ExtractingLoadable extractingLoadable, long j, long j8, IOException iOException, int i) {
        ExtractingLoadable extractingLoadable2;
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        C1555b0 c1555b0 = extractingLoadable.dataSource;
        LoadEventInfo loadEventInfo = new LoadEventInfo(extractingLoadable.loadTaskId, extractingLoadable.dataSpec, c1555b0.f5955l, c1555b0.f5956m, j, j8, c1555b0.f5954k);
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(1, -1, null, 0, null, AbstractC1118i0.m2447f0(extractingLoadable.seekTimeUs), AbstractC1118i0.m2447f0(this.durationUs)), iOException, i));
        if (retryDelayMsFor == -9223372036854775807L) {
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY_FATAL;
            extractingLoadable2 = extractingLoadable;
        } else {
            int extractedSamplesCount = getExtractedSamplesCount();
            extractingLoadable2 = extractingLoadable;
            loadErrorActionCreateRetryAction = configureRetry(extractingLoadable2, extractedSamplesCount) ? Loader.createRetryAction(extractedSamplesCount > this.extractedSamplesCountAtStartOfLoad, retryDelayMsFor) : Loader.DONT_RETRY;
        }
        boolean zIsRetry = loadErrorActionCreateRetryAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, 1, -1, null, 0, null, extractingLoadable2.seekTimeUs, this.durationUs, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(extractingLoadable2.loadTaskId);
        }
        return loadErrorActionCreateRetryAction;
    }

    public void maybeThrowError() {
        this.loader.maybeThrowError(this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
    }
}
