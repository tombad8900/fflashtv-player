package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.common.InterfaceC0238s0;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.hls.HlsChunkSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import com.bumptech.glide.AbstractC0715d;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p002a1.AbstractC0008a1;
import p013b2.C0562n;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0974j0;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p089k1.C1579w;
import p106m1.C1872g;
import p115n1.C1978h0;
import p115n1.C1986m;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;
import p208y1.C2793a;
import p208y1.C2794b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class HlsSampleStreamWrapper implements Loader.Callback<Chunk>, Loader.ReleaseCallback, SequenceableLoader, InterfaceC1989p, SampleQueue.UpstreamFormatChangedListener {
    private static final Set<Integer> MAPPABLE_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_FATAL = -2;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_NON_FATAL = -3;
    public static final int SAMPLE_QUEUE_INDEX_PENDING = -1;
    private static final String TAG = "HlsSampleStreamWrapper";
    private final Allocator allocator;
    private final Callback callback;
    private final HlsChunkSource chunkSource;
    private C0249w downstreamTrackFormat;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private C0237s drmInitData;
    private final DrmSessionManager drmSessionManager;
    private InterfaceC1980i0 emsgUnwrappingTrackOutput;
    private int enabledTrackGroupCount;
    private final Handler handler;
    private boolean haveAudioVideoSampleQueues;
    private final ArrayList<HlsSampleStream> hlsSampleStreams;
    private long lastSeekPositionUs;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private Chunk loadingChunk;
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final ArrayList<HlsMediaChunk> mediaChunks;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final int metadataType;
    private final C0249w muxedAudioFormat;
    private final Runnable onTracksEndedRunnable;
    private Set<C0233q1> optionalTrackGroups;
    private final Map<String, C0237s> overridingDrmInitData;
    private long pendingResetPositionUs;
    private boolean pendingResetUpstreamFormats;
    private boolean prepared;
    private int primarySampleQueueIndex;
    private int primarySampleQueueType;
    private int primaryTrackGroupIndex;
    private final List<HlsMediaChunk> readOnlyMediaChunks;
    private boolean released;
    private long sampleOffsetUs;
    private SparseIntArray sampleQueueIndicesByType;
    private boolean[] sampleQueueIsAudioVideoFlags;
    private Set<Integer> sampleQueueMappingDoneByType;
    private HlsSampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private boolean[] sampleQueuesEnabledStates;
    private boolean seenFirstTrackSelection;
    private HlsMediaChunk sourceChunk;
    private int[] trackGroupToSampleQueueIndex;
    private TrackGroupArray trackGroups;
    private final int trackType;
    private boolean tracksEnded;
    private final String uid;
    private C0249w upstreamTrackFormat;
    private final Loader loader = new Loader("Loader:HlsSampleStreamWrapper");
    private final HlsChunkSource.HlsChunkHolder nextChunkHolder = new HlsChunkSource.HlsChunkHolder();
    private int[] sampleQueueTrackIds = new int[0];

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Callback extends SequenceableLoader.Callback<HlsSampleStreamWrapper> {
        void onPlaylistRefreshRequired(Uri uri);

        void onPrepared();
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class EmsgUnwrappingTrackOutput implements InterfaceC1980i0 {
        private static final C0249w EMSG_FORMAT;
        private static final C0249w ID3_FORMAT;
        private byte[] buffer;
        private int bufferPosition;
        private final InterfaceC1980i0 delegate;
        private final C0249w delegateFormat;
        private final C2794b emsgDecoder = new C2794b();
        private C0249w format;

        static {
            C0246v c0246v = new C0246v();
            c0246v.f1447m = AbstractC0244u0.m687p("application/id3");
            ID3_FORMAT = new C0249w(c0246v);
            C0246v c0246v2 = new C0246v();
            c0246v2.f1447m = AbstractC0244u0.m687p("application/x-emsg");
            EMSG_FORMAT = new C0249w(c0246v2);
        }

        public EmsgUnwrappingTrackOutput(InterfaceC1980i0 interfaceC1980i0, int i) {
            this.delegate = interfaceC1980i0;
            if (i == 1) {
                this.delegateFormat = ID3_FORMAT;
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Unknown metadataType: "));
                }
                this.delegateFormat = EMSG_FORMAT;
            }
            this.buffer = new byte[0];
            this.bufferPosition = 0;
        }

        private boolean emsgContainsExpectedWrappedFormat(C2793a c2793a) {
            C0249w wrappedMetadataFormat = c2793a.getWrappedMetadataFormat();
            return wrappedMetadataFormat != null && Objects.equals(this.delegateFormat.f1522n, wrappedMetadataFormat.f1522n);
        }

        private void ensureBufferCapacity(int i) {
            byte[] bArr = this.buffer;
            if (bArr.length < i) {
                this.buffer = Arrays.copyOf(bArr, (i / 2) + i);
            }
        }

        private C1132w getSampleAndTrimBuffer(int i, int i4) {
            int i8 = this.bufferPosition - i4;
            C1132w c1132w = new C1132w(Arrays.copyOfRange(this.buffer, i8 - i, i8));
            byte[] bArr = this.buffer;
            System.arraycopy(bArr, i8, bArr, 0, i4);
            this.bufferPosition = i4;
            return c1132w;
        }

        @Override // p115n1.InterfaceC1980i0
        public void format(C0249w c0249w) {
            this.format = c0249w;
            this.delegate.format(this.delegateFormat);
        }

        @Override // p115n1.InterfaceC1980i0
        public int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7) {
            return sampleData(interfaceC0219m, i, z7, 0);
        }

        @Override // p115n1.InterfaceC1980i0
        public void sampleMetadata(long j, int i, int i4, int i8, C1978h0 c1978h0) {
            this.format.getClass();
            C1132w sampleAndTrimBuffer = getSampleAndTrimBuffer(i4, i8);
            if (!Objects.equals(this.format.f1522n, this.delegateFormat.f1522n)) {
                if (!"application/x-emsg".equals(this.format.f1522n)) {
                    AbstractC1101a.m2348F(HlsSampleStreamWrapper.TAG, "Ignoring sample for unsupported format: " + this.format.f1522n);
                    return;
                }
                this.emsgDecoder.getClass();
                C2793a c2793aM4905v = C2794b.m4905v(sampleAndTrimBuffer);
                if (!emsgContainsExpectedWrappedFormat(c2793aM4905v)) {
                    AbstractC1101a.m2348F(HlsSampleStreamWrapper.TAG, "Ignoring EMSG. Expected it to contain wrapped " + this.delegateFormat.f1522n + " but actual wrapped format: " + c2793aM4905v.getWrappedMetadataFormat());
                    return;
                }
                byte[] wrappedMetadataBytes = c2793aM4905v.getWrappedMetadataBytes();
                wrappedMetadataBytes.getClass();
                sampleAndTrimBuffer = new C1132w(wrappedMetadataBytes);
            }
            int iM2515a = sampleAndTrimBuffer.m2515a();
            this.delegate.sampleData(sampleAndTrimBuffer, iM2515a);
            this.delegate.sampleMetadata(j, i, iM2515a, 0, c1978h0);
        }

        @Override // p115n1.InterfaceC1980i0
        public void sampleData(C1132w c1132w, int i) {
            sampleData(c1132w, i, 0);
        }

        @Override // p115n1.InterfaceC1980i0
        public int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7, int i4) throws EOFException {
            ensureBufferCapacity(this.bufferPosition + i);
            int i8 = interfaceC0219m.read(this.buffer, this.bufferPosition, i);
            if (i8 != -1) {
                this.bufferPosition += i8;
                return i8;
            }
            if (z7) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // p115n1.InterfaceC1980i0
        public void sampleData(C1132w c1132w, int i, int i4) {
            ensureBufferCapacity(this.bufferPosition + i);
            c1132w.m2519e(this.buffer, this.bufferPosition, i);
            this.bufferPosition += i;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class HlsSampleQueue extends SampleQueue {
        private C0237s drmInitData;
        private final Map<String, C0237s> overridingDrmInitData;

        private C0241t0 getAdjustedMetadata(C0241t0 c0241t0) {
            if (c0241t0 == null) {
                return null;
            }
            InterfaceC0238s0[] interfaceC0238s0Arr = c0241t0.f1412j;
            int length = interfaceC0238s0Arr.length;
            int i = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i4 = -1;
                    break;
                }
                InterfaceC0238s0 interfaceC0238s0 = interfaceC0238s0Arr[i4];
                if ((interfaceC0238s0 instanceof C0562n) && HlsMediaChunk.PRIV_TIMESTAMP_FRAME_OWNER.equals(((C0562n) interfaceC0238s0).f2263k)) {
                    break;
                }
                i4++;
            }
            if (i4 == -1) {
                return c0241t0;
            }
            if (length == 1) {
                return null;
            }
            InterfaceC0238s0[] interfaceC0238s0Arr2 = new InterfaceC0238s0[length - 1];
            while (i < length) {
                if (i != i4) {
                    interfaceC0238s0Arr2[i < i4 ? i : i - 1] = interfaceC0238s0Arr[i];
                }
                i++;
            }
            return new C0241t0(interfaceC0238s0Arr2);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public C0249w getAdjustedUpstreamFormat(C0249w c0249w) {
            C0237s c0237s;
            C0237s c0237s2 = this.drmInitData;
            if (c0237s2 == null) {
                c0237s2 = c0249w.f1526r;
            }
            if (c0237s2 != null && (c0237s = this.overridingDrmInitData.get(c0237s2.f1407l)) != null) {
                c0237s2 = c0237s;
            }
            C0241t0 adjustedMetadata = getAdjustedMetadata(c0249w.f1520l);
            if (c0237s2 != c0249w.f1526r || adjustedMetadata != c0249w.f1520l) {
                C0246v c0246vM692a = c0249w.m692a();
                c0246vM692a.f1451q = c0237s2;
                c0246vM692a.f1445k = adjustedMetadata;
                c0249w = new C0249w(c0246vM692a);
            }
            return super.getAdjustedUpstreamFormat(c0249w);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, p115n1.InterfaceC1980i0
        public int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7) {
            return sampleData(interfaceC0219m, i, z7, 0);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, p115n1.InterfaceC1980i0
        public void sampleMetadata(long j, int i, int i4, int i8, C1978h0 c1978h0) {
            super.sampleMetadata(j, i, i4, i8, c1978h0);
        }

        public void setDrmInitData(C0237s c0237s) {
            this.drmInitData = c0237s;
            invalidateUpstreamFormatAdjustment();
        }

        public void setSourceChunk(HlsMediaChunk hlsMediaChunk) {
            sourceId(hlsMediaChunk.uid);
        }

        private HlsSampleQueue(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, Map<String, C0237s> map) {
            super(allocator, drmSessionManager, eventDispatcher);
            this.overridingDrmInitData = map;
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, p115n1.InterfaceC1980i0
        public void sampleData(C1132w c1132w, int i) {
            sampleData(c1132w, i, 0);
        }
    }

    public HlsSampleStreamWrapper(String str, int i, Callback callback, HlsChunkSource hlsChunkSource, Map<String, C0237s> map, Allocator allocator, long j, C0249w c0249w, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, int i4) {
        this.uid = str;
        this.trackType = i;
        this.callback = callback;
        this.chunkSource = hlsChunkSource;
        this.overridingDrmInitData = map;
        this.allocator = allocator;
        this.muxedAudioFormat = c0249w;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.metadataType = i4;
        Set<Integer> set = MAPPABLE_TYPES;
        this.sampleQueueMappingDoneByType = new HashSet(set.size());
        this.sampleQueueIndicesByType = new SparseIntArray(set.size());
        this.sampleQueues = new HlsSampleQueue[0];
        this.sampleQueueIsAudioVideoFlags = new boolean[0];
        this.sampleQueuesEnabledStates = new boolean[0];
        ArrayList<HlsMediaChunk> arrayList = new ArrayList<>();
        this.mediaChunks = arrayList;
        this.readOnlyMediaChunks = Collections.unmodifiableList(arrayList);
        this.hlsSampleStreams = new ArrayList<>();
        this.maybeFinishPrepareRunnable = new RunnableC0370c(0, this);
        this.onTracksEndedRunnable = new RunnableC0370c(1, this);
        this.handler = AbstractC1118i0.m2457p(null);
        this.lastSeekPositionUs = j;
        this.pendingResetPositionUs = j;
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    private void assertIsPrepared() {
        AbstractC1101a.m2359j(this.prepared);
        this.trackGroups.getClass();
        this.optionalTrackGroups.getClass();
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    private void buildTracksFromSampleStreams() {
        C0249w c0249w;
        int length = this.sampleQueues.length;
        int i = -2;
        int i4 = -1;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                break;
            }
            C0249w upstreamFormat = this.sampleQueues[i8].getUpstreamFormat();
            AbstractC1101a.m2360k(upstreamFormat);
            String str = upstreamFormat.f1522n;
            int i9 = AbstractC0244u0.m686o(str) ? 2 : AbstractC0244u0.m682k(str) ? 1 : AbstractC0244u0.m685n(str) ? 3 : -2;
            if (getTrackTypeScore(i9) > getTrackTypeScore(i)) {
                i4 = i8;
                i = i9;
            } else if (i9 == i && i4 != -1) {
                i4 = -1;
            }
            i8++;
        }
        C0233q1 trackGroup = this.chunkSource.getTrackGroup();
        int i10 = trackGroup.f1319a;
        this.primaryTrackGroupIndex = -1;
        this.trackGroupToSampleQueueIndex = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            this.trackGroupToSampleQueueIndex[i11] = i11;
        }
        C0233q1[] c0233q1Arr = new C0233q1[length];
        int i12 = 0;
        while (i12 < length) {
            C0249w upstreamFormat2 = this.sampleQueues[i12].getUpstreamFormat();
            AbstractC1101a.m2360k(upstreamFormat2);
            if (i12 == i4) {
                C0249w[] c0249wArr = new C0249w[i10];
                for (int i13 = 0; i13 < i10; i13++) {
                    C0249w c0249wM695f = trackGroup.f1322d[i13];
                    if (i == 1 && (c0249w = this.muxedAudioFormat) != null) {
                        c0249wM695f = c0249wM695f.m695f(c0249w);
                    }
                    c0249wArr[i13] = i10 == 1 ? upstreamFormat2.m695f(c0249wM695f) : deriveFormat(c0249wM695f, upstreamFormat2, true);
                }
                c0233q1Arr[i12] = new C0233q1(this.uid, c0249wArr);
                this.primaryTrackGroupIndex = i12;
            } else {
                C0249w c0249w2 = (i == 2 && AbstractC0244u0.m682k(upstreamFormat2.f1522n)) ? this.muxedAudioFormat : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.uid);
                sb.append(":muxed:");
                sb.append(i12 < i4 ? i12 : i12 - 1);
                c0233q1Arr[i12] = new C0233q1(sb.toString(), deriveFormat(c0249w2, upstreamFormat2, false));
            }
            i12++;
        }
        this.trackGroups = createTrackGroupArrayWithDrmInfo(c0233q1Arr);
        AbstractC1101a.m2359j(this.optionalTrackGroups == null);
        this.optionalTrackGroups = Collections.EMPTY_SET;
    }

    private boolean canDiscardUpstreamMediaChunksFromIndex(int i) {
        for (int i4 = i; i4 < this.mediaChunks.size(); i4++) {
            if (this.mediaChunks.get(i4).shouldSpliceIn) {
                return false;
            }
        }
        HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(i);
        for (int i8 = 0; i8 < this.sampleQueues.length; i8++) {
            if (this.sampleQueues[i8].getReadIndex() > hlsMediaChunk.getFirstSampleIndex(i8)) {
                return false;
            }
        }
        return true;
    }

    private static C1986m createDiscardingTrackOutput(int i, int i4) {
        AbstractC1101a.m2348F(TAG, "Unmapped track with id " + i + " of type " + i4);
        return new C1986m();
    }

    private SampleQueue createSampleQueue(int i, int i4) {
        int length = this.sampleQueues.length;
        boolean z7 = i4 == 1 || i4 == 2;
        HlsSampleQueue hlsSampleQueue = new HlsSampleQueue(this.allocator, this.drmSessionManager, this.drmEventDispatcher, this.overridingDrmInitData);
        hlsSampleQueue.setStartTimeUs(this.lastSeekPositionUs);
        if (z7) {
            hlsSampleQueue.setDrmInitData(this.drmInitData);
        }
        hlsSampleQueue.setSampleOffsetUs(this.sampleOffsetUs);
        HlsMediaChunk hlsMediaChunk = this.sourceChunk;
        if (hlsMediaChunk != null) {
            hlsSampleQueue.setSourceChunk(hlsMediaChunk);
        }
        hlsSampleQueue.setUpstreamFormatChangeListener(this);
        int i8 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.sampleQueueTrackIds, i8);
        this.sampleQueueTrackIds = iArrCopyOf;
        iArrCopyOf[length] = i;
        HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
        int i9 = AbstractC1118i0.f4750a;
        Object[] objArrCopyOf = Arrays.copyOf(hlsSampleQueueArr, hlsSampleQueueArr.length + 1);
        objArrCopyOf[hlsSampleQueueArr.length] = hlsSampleQueue;
        this.sampleQueues = (HlsSampleQueue[]) objArrCopyOf;
        boolean[] zArrCopyOf = Arrays.copyOf(this.sampleQueueIsAudioVideoFlags, i8);
        this.sampleQueueIsAudioVideoFlags = zArrCopyOf;
        zArrCopyOf[length] = z7;
        this.haveAudioVideoSampleQueues |= z7;
        this.sampleQueueMappingDoneByType.add(Integer.valueOf(i4));
        this.sampleQueueIndicesByType.append(i4, length);
        if (getTrackTypeScore(i4) > getTrackTypeScore(this.primarySampleQueueType)) {
            this.primarySampleQueueIndex = length;
            this.primarySampleQueueType = i4;
        }
        this.sampleQueuesEnabledStates = Arrays.copyOf(this.sampleQueuesEnabledStates, i8);
        return hlsSampleQueue;
    }

    private TrackGroupArray createTrackGroupArrayWithDrmInfo(C0233q1[] c0233q1Arr) {
        for (int i = 0; i < c0233q1Arr.length; i++) {
            C0233q1 c0233q1 = c0233q1Arr[i];
            C0249w[] c0249wArr = new C0249w[c0233q1.f1319a];
            for (int i4 = 0; i4 < c0233q1.f1319a; i4++) {
                C0249w c0249w = c0233q1.f1322d[i4];
                int cryptoType = this.drmSessionManager.getCryptoType(c0249w);
                C0246v c0246vM692a = c0249w.m692a();
                c0246vM692a.f1434K = cryptoType;
                c0249wArr[i4] = new C0249w(c0246vM692a);
            }
            c0233q1Arr[i] = new C0233q1(c0233q1.f1320b, c0249wArr);
        }
        return new TrackGroupArray(c0233q1Arr);
    }

    private static C0249w deriveFormat(C0249w c0249w, C0249w c0249w2, boolean z7) {
        String strM674c;
        if (c0249w == null) {
            return c0249w2;
        }
        String str = c0249w.f1519k;
        String strM676e = c0249w2.f1522n;
        int iM680i = AbstractC0244u0.m680i(strM676e);
        if (AbstractC1118i0.m2463v(iM680i, str) == 1) {
            strM674c = AbstractC1118i0.m2464w(iM680i, str);
            strM676e = AbstractC0244u0.m676e(strM674c);
        } else {
            strM674c = AbstractC0244u0.m674c(str, strM676e);
        }
        C0246v c0246vM692a = c0249w2.m692a();
        c0246vM692a.f1435a = c0249w.f1509a;
        c0246vM692a.f1436b = c0249w.f1510b;
        c0246vM692a.f1437c = AbstractC0983m0.m2165j(c0249w.f1511c);
        c0246vM692a.f1438d = c0249w.f1512d;
        c0246vM692a.f1439e = c0249w.f1513e;
        c0246vM692a.f1440f = c0249w.f1514f;
        c0246vM692a.f1442h = z7 ? c0249w.f1516h : -1;
        c0246vM692a.f1443i = z7 ? c0249w.f1517i : -1;
        c0246vM692a.f1444j = strM674c;
        if (iM680i == 2) {
            c0246vM692a.f1454t = c0249w.f1529u;
            c0246vM692a.f1455u = c0249w.f1530v;
            c0246vM692a.f1456v = c0249w.f1531w;
        }
        if (strM676e != null) {
            c0246vM692a.f1447m = AbstractC0244u0.m687p(strM676e);
        }
        int i = c0249w.f1498C;
        if (i != -1 && iM680i == 1) {
            c0246vM692a.f1425B = i;
        }
        C0241t0 c0241t0M669b = c0249w.f1520l;
        if (c0241t0M669b != null) {
            C0241t0 c0241t0 = c0249w2.f1520l;
            if (c0241t0 != null) {
                c0241t0M669b = c0241t0.m669b(c0241t0M669b);
            }
            c0246vM692a.f1445k = c0241t0M669b;
        }
        return new C0249w(c0246vM692a);
    }

    private void discardUpstream(int i) {
        AbstractC1101a.m2359j(!this.loader.isLoading());
        while (true) {
            if (i >= this.mediaChunks.size()) {
                i = -1;
                break;
            } else if (canDiscardUpstreamMediaChunksFromIndex(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = getLastMediaChunk().endTimeUs;
        HlsMediaChunk hlsMediaChunkDiscardUpstreamMediaChunksFromIndex = discardUpstreamMediaChunksFromIndex(i);
        if (this.mediaChunks.isEmpty()) {
            this.pendingResetPositionUs = this.lastSeekPositionUs;
        } else {
            ((HlsMediaChunk) AbstractC1006u.m2194i(this.mediaChunks)).invalidateExtractor();
        }
        this.loadingFinished = false;
        this.mediaSourceEventDispatcher.upstreamDiscarded(this.primarySampleQueueType, hlsMediaChunkDiscardUpstreamMediaChunksFromIndex.startTimeUs, j);
    }

    private HlsMediaChunk discardUpstreamMediaChunksFromIndex(int i) {
        HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(i);
        ArrayList<HlsMediaChunk> arrayList = this.mediaChunks;
        AbstractC1118i0.m2433X(i, arrayList.size(), arrayList);
        for (int i4 = 0; i4 < this.sampleQueues.length; i4++) {
            this.sampleQueues[i4].discardUpstreamSamples(hlsMediaChunk.getFirstSampleIndex(i4));
        }
        return hlsMediaChunk;
    }

    private boolean finishedReadingChunk(HlsMediaChunk hlsMediaChunk) {
        int i = hlsMediaChunk.uid;
        int length = this.sampleQueues.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (this.sampleQueuesEnabledStates[i4] && this.sampleQueues[i4].peekSourceId() == i) {
                return false;
            }
        }
        return true;
    }

    private static boolean formatsMatch(C0249w c0249w, C0249w c0249w2) {
        String str = c0249w.f1522n;
        String str2 = c0249w2.f1522n;
        int iM680i = AbstractC0244u0.m680i(str);
        if (iM680i != 3) {
            return iM680i == AbstractC0244u0.m680i(str2);
        }
        int i = AbstractC1118i0.f4750a;
        if (Objects.equals(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c0249w.f1503H == c0249w2.f1503H;
        }
        return false;
    }

    private HlsMediaChunk getLastMediaChunk() {
        return this.mediaChunks.get(r0.size() - 1);
    }

    private InterfaceC1980i0 getMappedTrackOutput(int i, int i4) {
        AbstractC1101a.m2353d(MAPPABLE_TYPES.contains(Integer.valueOf(i4)));
        int i8 = this.sampleQueueIndicesByType.get(i4, -1);
        if (i8 == -1) {
            return null;
        }
        if (this.sampleQueueMappingDoneByType.add(Integer.valueOf(i4))) {
            this.sampleQueueTrackIds[i8] = i;
        }
        return this.sampleQueueTrackIds[i8] == i ? this.sampleQueues[i8] : createDiscardingTrackOutput(i, i4);
    }

    private static int getTrackTypeScore(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    private void initMediaChunkLoad(HlsMediaChunk hlsMediaChunk) {
        this.sourceChunk = hlsMediaChunk;
        this.upstreamTrackFormat = hlsMediaChunk.trackFormat;
        this.pendingResetPositionUs = -9223372036854775807L;
        this.mediaChunks.add(hlsMediaChunk);
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            c0974j0M2164i.m2141a(Integer.valueOf(hlsSampleQueue.getWriteIndex()));
        }
        hlsMediaChunk.init(this, c0974j0M2164i.m2159f());
        for (HlsSampleQueue hlsSampleQueue2 : this.sampleQueues) {
            hlsSampleQueue2.setSourceChunk(hlsMediaChunk);
            if (hlsMediaChunk.shouldSpliceIn) {
                hlsSampleQueue2.splice();
            }
        }
    }

    private static boolean isMediaChunk(Chunk chunk) {
        return chunk instanceof HlsMediaChunk;
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPlaylistUpdated$0(HlsMediaChunk hlsMediaChunk) {
        this.callback.onPlaylistRefreshRequired(hlsMediaChunk.playlistUrl);
    }

    @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @RequiresNonNull({"trackGroups"})
    private void mapSampleQueuesToMatchTrackGroups() {
        int i = this.trackGroups.length;
        int[] iArr = new int[i];
        this.trackGroupToSampleQueueIndex = iArr;
        Arrays.fill(iArr, -1);
        int i4 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = 0;
            while (true) {
                HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
                if (i9 < hlsSampleQueueArr.length) {
                    C0249w upstreamFormat = hlsSampleQueueArr[i9].getUpstreamFormat();
                    AbstractC1101a.m2360k(upstreamFormat);
                    if (formatsMatch(upstreamFormat, this.trackGroups.get(i8).f1322d[0])) {
                        this.trackGroupToSampleQueueIndex[i8] = i9;
                        break;
                    }
                    i9++;
                }
            }
        }
        ArrayList<HlsSampleStream> arrayList = this.hlsSampleStreams;
        int size = arrayList.size();
        while (i4 < size) {
            HlsSampleStream hlsSampleStream = arrayList.get(i4);
            i4++;
            hlsSampleStream.bindSampleQueue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (!this.released && this.trackGroupToSampleQueueIndex == null && this.sampleQueuesBuilt) {
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                if (hlsSampleQueue.getUpstreamFormat() == null) {
                    return;
                }
            }
            if (this.trackGroups != null) {
                mapSampleQueuesToMatchTrackGroups();
                return;
            }
            buildTracksFromSampleStreams();
            setIsPrepared();
            this.callback.onPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTracksEnded() {
        this.sampleQueuesBuilt = true;
        maybeFinishPrepare();
    }

    private void resetSampleQueues() {
        for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            hlsSampleQueue.reset(this.pendingResetUpstreamFormats);
        }
        this.pendingResetUpstreamFormats = false;
    }

    private boolean seekInsideBufferUs(long j, HlsMediaChunk hlsMediaChunk) {
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            HlsSampleQueue hlsSampleQueue = this.sampleQueues[i];
            if (!(hlsMediaChunk != null ? hlsSampleQueue.seekTo(hlsMediaChunk.getFirstSampleIndex(i)) : hlsSampleQueue.seekTo(j, false)) && (this.sampleQueueIsAudioVideoFlags[i] || !this.haveAudioVideoSampleQueues)) {
                return false;
            }
        }
        return true;
    }

    @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    private void setIsPrepared() {
        this.prepared = true;
    }

    private void updateSampleStreams(SampleStream[] sampleStreamArr) {
        this.hlsSampleStreams.clear();
        for (SampleStream sampleStream : sampleStreamArr) {
            if (sampleStream != null) {
                this.hlsSampleStreams.add((HlsSampleStream) sampleStream);
            }
        }
    }

    public int bindSampleQueueToSampleStream(int i) {
        assertIsPrepared();
        this.trackGroupToSampleQueueIndex.getClass();
        int i4 = this.trackGroupToSampleQueueIndex[i];
        if (i4 == -1) {
            return this.optionalTrackGroups.contains(this.trackGroups.get(i)) ? -3 : -2;
        }
        boolean[] zArr = this.sampleQueuesEnabledStates;
        if (zArr[i4]) {
            return -2;
        }
        zArr[i4] = true;
        return i4;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        List<HlsMediaChunk> list;
        long jMax;
        if (this.loadingFinished || this.loader.isLoading() || this.loader.hasFatalError()) {
            return false;
        }
        if (isPendingReset()) {
            list = Collections.EMPTY_LIST;
            jMax = this.pendingResetPositionUs;
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.setStartTimeUs(this.pendingResetPositionUs);
            }
        } else {
            list = this.readOnlyMediaChunks;
            HlsMediaChunk lastMediaChunk = getLastMediaChunk();
            jMax = lastMediaChunk.isLoadCompleted() ? lastMediaChunk.endTimeUs : Math.max(this.lastSeekPositionUs, lastMediaChunk.startTimeUs);
        }
        List<HlsMediaChunk> list2 = list;
        long j = jMax;
        this.nextChunkHolder.clear();
        this.chunkSource.getNextChunk(loadingInfo, j, list2, this.prepared || !list2.isEmpty(), this.nextChunkHolder);
        HlsChunkSource.HlsChunkHolder hlsChunkHolder = this.nextChunkHolder;
        boolean z7 = hlsChunkHolder.endOfStream;
        Chunk chunk = hlsChunkHolder.chunk;
        Uri uri = hlsChunkHolder.playlistUrl;
        if (z7) {
            this.pendingResetPositionUs = -9223372036854775807L;
            this.loadingFinished = true;
            return true;
        }
        if (chunk == null) {
            if (uri != null) {
                this.callback.onPlaylistRefreshRequired(uri);
            }
            return false;
        }
        if (isMediaChunk(chunk)) {
            initMediaChunkLoad((HlsMediaChunk) chunk);
        }
        this.loadingChunk = chunk;
        this.mediaSourceEventDispatcher.loadStarted(new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, this.loader.startLoading(chunk, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(chunk.type))), chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        return true;
    }

    public void continuePreparing() {
        if (this.prepared) {
            return;
        }
        continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
    }

    public void discardBuffer(long j, boolean z7) {
        if (!this.sampleQueuesBuilt || isPendingReset()) {
            return;
        }
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            this.sampleQueues[i].discardTo(j, z7, this.sampleQueuesEnabledStates[i]);
        }
    }

    @Override // p115n1.InterfaceC1989p
    public void endTracks() {
        this.tracksEnded = true;
        this.handler.post(this.onTracksEndedRunnable);
    }

    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        return this.chunkSource.getAdjustedSeekPositionUs(j, seekParameters);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        /*
            r7 = this;
            boolean r0 = r7.loadingFinished
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.isPendingReset()
            if (r0 == 0) goto L10
            long r0 = r7.pendingResetPositionUs
            return r0
        L10:
            long r0 = r7.lastSeekPositionUs
            androidx.media3.exoplayer.hls.HlsMediaChunk r2 = r7.getLastMediaChunk()
            boolean r3 = r2.isLoadCompleted()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList<androidx.media3.exoplayer.hls.HlsMediaChunk> r2 = r7.mediaChunks
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList<androidx.media3.exoplayer.hls.HlsMediaChunk> r2 = r7.mediaChunks
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            androidx.media3.exoplayer.hls.HlsMediaChunk r2 = (androidx.media3.exoplayer.hls.HlsMediaChunk) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.endTimeUs
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.sampleQueuesBuilt
            if (r2 == 0) goto L55
            androidx.media3.exoplayer.hls.HlsSampleStreamWrapper$HlsSampleQueue[] r2 = r7.sampleQueues
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.getLargestQueuedTimestampUs()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.getBufferedPositionUs():long");
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        return getLastMediaChunk().endTimeUs;
    }

    public int getPrimaryTrackGroupIndex() {
        return this.primaryTrackGroupIndex;
    }

    public TrackGroupArray getTrackGroups() {
        assertIsPrepared();
        return this.trackGroups;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading();
    }

    public boolean isReady(int i) {
        return !isPendingReset() && this.sampleQueues[i].isReady(this.loadingFinished);
    }

    public boolean isVideoSampleStream() {
        return this.primarySampleQueueType == 2;
    }

    public void maybeThrowError(int i) {
        maybeThrowError();
        this.sampleQueues[i].maybeThrowError();
    }

    public void maybeThrowPrepareError() throws C0247v0 {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw C0247v0.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
            hlsSampleQueue.release();
        }
    }

    public void onNewExtractor() {
        this.sampleQueueMappingDoneByType.clear();
    }

    public boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z7) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (!this.chunkSource.obtainsChunksForPlaylist(uri)) {
            return true;
        }
        long j = (z7 || (fallbackSelectionFor = this.loadErrorHandlingPolicy.getFallbackSelectionFor(TrackSelectionUtil.createFallbackOptions(this.chunkSource.getTrackSelection()), loadErrorInfo)) == null || fallbackSelectionFor.type != 2) ? -9223372036854775807L : fallbackSelectionFor.exclusionDurationMs;
        return this.chunkSource.onPlaylistError(uri, j) && j != -9223372036854775807L;
    }

    public void onPlaylistUpdated() {
        if (this.mediaChunks.isEmpty()) {
            return;
        }
        final HlsMediaChunk hlsMediaChunk = (HlsMediaChunk) AbstractC1006u.m2194i(this.mediaChunks);
        int chunkPublicationState = this.chunkSource.getChunkPublicationState(hlsMediaChunk);
        if (chunkPublicationState == 1) {
            hlsMediaChunk.publish();
            return;
        }
        if (chunkPublicationState == 0) {
            this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.hls.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1760j.lambda$onPlaylistUpdated$0(hlsMediaChunk);
                }
            });
        } else if (chunkPublicationState == 2 && !this.loadingFinished && this.loader.isLoading()) {
            this.loader.cancelLoading();
        }
    }

    @Override // androidx.media3.exoplayer.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(C0249w c0249w) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    public void prepareWithMultivariantPlaylistInfo(C0233q1[] c0233q1Arr, int i, int... iArr) {
        this.trackGroups = createTrackGroupArrayWithDrmInfo(c0233q1Arr);
        this.optionalTrackGroups = new HashSet();
        for (int i4 : iArr) {
            this.optionalTrackGroups.add(this.trackGroups.get(i4));
        }
        this.primaryTrackGroupIndex = i;
        Handler handler = this.handler;
        Callback callback = this.callback;
        Objects.requireNonNull(callback);
        handler.post(new RunnableC0370c(2, callback));
        setIsPrepared();
    }

    public int readData(int i, FormatHolder formatHolder, C1872g c1872g, int i4) {
        C0249w c0249w;
        if (isPendingReset()) {
            return -3;
        }
        int i8 = 0;
        if (!this.mediaChunks.isEmpty()) {
            int i9 = 0;
            while (i9 < this.mediaChunks.size() - 1 && finishedReadingChunk(this.mediaChunks.get(i9))) {
                i9++;
            }
            AbstractC1118i0.m2433X(0, i9, this.mediaChunks);
            HlsMediaChunk hlsMediaChunk = this.mediaChunks.get(0);
            C0249w c0249w2 = hlsMediaChunk.trackFormat;
            if (!c0249w2.equals(this.downstreamTrackFormat)) {
                this.mediaSourceEventDispatcher.downstreamFormatChanged(this.trackType, c0249w2, hlsMediaChunk.trackSelectionReason, hlsMediaChunk.trackSelectionData, hlsMediaChunk.startTimeUs);
            }
            this.downstreamTrackFormat = c0249w2;
        }
        if (!this.mediaChunks.isEmpty() && !this.mediaChunks.get(0).isPublished()) {
            return -3;
        }
        int i10 = this.sampleQueues[i].read(formatHolder, c1872g, i4, this.loadingFinished);
        if (i10 == -5) {
            C0249w c0249wM695f = formatHolder.format;
            c0249wM695f.getClass();
            if (i == this.primarySampleQueueIndex) {
                int iM1566m = AbstractC0715d.m1566m(this.sampleQueues[i].peekSourceId());
                while (i8 < this.mediaChunks.size() && this.mediaChunks.get(i8).uid != iM1566m) {
                    i8++;
                }
                if (i8 < this.mediaChunks.size()) {
                    c0249w = this.mediaChunks.get(i8).trackFormat;
                } else {
                    c0249w = this.upstreamTrackFormat;
                    c0249w.getClass();
                }
                c0249wM695f = c0249wM695f.m695f(c0249w);
            }
            formatHolder.format = c0249wM695f;
        }
        return i10;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        if (this.loader.hasFatalError() || isPendingReset()) {
            return;
        }
        if (this.loader.isLoading()) {
            this.loadingChunk.getClass();
            if (this.chunkSource.shouldCancelLoad(j, this.loadingChunk, this.readOnlyMediaChunks)) {
                this.loader.cancelLoading();
                return;
            }
            return;
        }
        int size = this.readOnlyMediaChunks.size();
        while (size > 0 && this.chunkSource.getChunkPublicationState(this.readOnlyMediaChunks.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.readOnlyMediaChunks.size()) {
            discardUpstream(size);
        }
        int preferredQueueSize = this.chunkSource.getPreferredQueueSize(j, this.readOnlyMediaChunks);
        if (preferredQueueSize < this.mediaChunks.size()) {
            discardUpstream(preferredQueueSize);
        }
    }

    public void release() {
        if (this.prepared) {
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.preRelease();
            }
        }
        this.chunkSource.reset();
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.released = true;
        this.hlsSampleStreams.clear();
    }

    @Override // p115n1.InterfaceC1989p
    public void seekMap(InterfaceC1968c0 interfaceC1968c0) {
    }

    public boolean seekToUs(long j, boolean z7) {
        HlsMediaChunk hlsMediaChunk;
        this.lastSeekPositionUs = j;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return true;
        }
        if (this.chunkSource.hasIndependentSegments()) {
            for (int i = 0; i < this.mediaChunks.size(); i++) {
                hlsMediaChunk = this.mediaChunks.get(i);
                if (hlsMediaChunk.startTimeUs == j) {
                    break;
                }
            }
            hlsMediaChunk = null;
        } else {
            hlsMediaChunk = null;
        }
        if (this.sampleQueuesBuilt && !z7 && seekInsideBufferUs(j, hlsMediaChunk)) {
            return false;
        }
        this.pendingResetPositionUs = j;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        if (this.loader.isLoading()) {
            if (this.sampleQueuesBuilt) {
                for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                    hlsSampleQueue.discardToEnd();
                }
            }
            this.loader.cancelLoading();
        } else {
            this.loader.clearFatalError();
            resetSampleQueues();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j, boolean z7) {
        boolean z8;
        assertIsPrepared();
        int i = this.enabledTrackGroupCount;
        int i4 = 0;
        for (int i8 = 0; i8 < exoTrackSelectionArr.length; i8++) {
            HlsSampleStream hlsSampleStream = (HlsSampleStream) sampleStreamArr[i8];
            if (hlsSampleStream != null && (exoTrackSelectionArr[i8] == null || !zArr[i8])) {
                this.enabledTrackGroupCount--;
                hlsSampleStream.unbindSampleQueue();
                sampleStreamArr[i8] = null;
            }
        }
        boolean z9 = z7 || (!this.seenFirstTrackSelection ? j == this.lastSeekPositionUs : i != 0);
        ExoTrackSelection trackSelection = this.chunkSource.getTrackSelection();
        boolean z10 = z9;
        ExoTrackSelection exoTrackSelection = trackSelection;
        for (int i9 = 0; i9 < exoTrackSelectionArr.length; i9++) {
            ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr[i9];
            if (exoTrackSelection2 != null) {
                int iIndexOf = this.trackGroups.indexOf(exoTrackSelection2.getTrackGroup());
                if (iIndexOf == this.primaryTrackGroupIndex) {
                    this.chunkSource.setTrackSelection(exoTrackSelection2);
                    exoTrackSelection = exoTrackSelection2;
                }
                if (sampleStreamArr[i9] == null) {
                    this.enabledTrackGroupCount++;
                    HlsSampleStream hlsSampleStream2 = new HlsSampleStream(this, iIndexOf);
                    sampleStreamArr[i9] = hlsSampleStream2;
                    zArr2[i9] = true;
                    if (this.trackGroupToSampleQueueIndex != null) {
                        hlsSampleStream2.bindSampleQueue();
                        if (!z10) {
                            HlsSampleQueue hlsSampleQueue = this.sampleQueues[this.trackGroupToSampleQueueIndex[iIndexOf]];
                            z10 = (hlsSampleQueue.getReadIndex() == 0 || hlsSampleQueue.seekTo(j, true)) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.enabledTrackGroupCount == 0) {
            this.chunkSource.reset();
            this.downstreamTrackFormat = null;
            this.pendingResetUpstreamFormats = true;
            this.mediaChunks.clear();
            if (this.loader.isLoading()) {
                if (this.sampleQueuesBuilt) {
                    HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
                    int length = hlsSampleQueueArr.length;
                    while (i4 < length) {
                        hlsSampleQueueArr[i4].discardToEnd();
                        i4++;
                    }
                }
                this.loader.cancelLoading();
            } else {
                resetSampleQueues();
            }
        } else if (!this.mediaChunks.isEmpty()) {
            int i10 = AbstractC1118i0.f4750a;
            if (Objects.equals(exoTrackSelection, trackSelection)) {
                z8 = z7;
                if (z10) {
                    seekToUs(j, z8);
                    while (i4 < sampleStreamArr.length) {
                        if (sampleStreamArr[i4] != null) {
                            zArr2[i4] = true;
                        }
                        i4++;
                    }
                }
            } else {
                if (!this.seenFirstTrackSelection) {
                    long j8 = j < 0 ? -j : 0L;
                    HlsMediaChunk lastMediaChunk = getLastMediaChunk();
                    ExoTrackSelection exoTrackSelection3 = exoTrackSelection;
                    exoTrackSelection3.updateSelectedTrack(j, j8, -9223372036854775807L, this.readOnlyMediaChunks, this.chunkSource.createMediaChunkIterators(lastMediaChunk, j));
                    if (exoTrackSelection3.getSelectedIndexInTrackGroup() != this.chunkSource.getTrackGroup().m663b(lastMediaChunk.trackFormat)) {
                    }
                    if (z10) {
                    }
                }
                this.pendingResetUpstreamFormats = true;
                z8 = true;
                z10 = true;
                if (z10) {
                }
            }
        }
        updateSampleStreams(sampleStreamArr);
        this.seenFirstTrackSelection = true;
        return z10;
    }

    public void setDrmInitData(C0237s c0237s) {
        C0237s c0237s2 = this.drmInitData;
        int i = AbstractC1118i0.f4750a;
        if (Objects.equals(c0237s2, c0237s)) {
            return;
        }
        this.drmInitData = c0237s;
        int i4 = 0;
        while (true) {
            HlsSampleQueue[] hlsSampleQueueArr = this.sampleQueues;
            if (i4 >= hlsSampleQueueArr.length) {
                return;
            }
            if (this.sampleQueueIsAudioVideoFlags[i4]) {
                hlsSampleQueueArr[i4].setDrmInitData(c0237s);
            }
            i4++;
        }
    }

    public void setIsPrimaryTimestampSource(boolean z7) {
        this.chunkSource.setIsPrimaryTimestampSource(z7);
    }

    public void setSampleOffsetUs(long j) {
        if (this.sampleOffsetUs != j) {
            this.sampleOffsetUs = j;
            for (HlsSampleQueue hlsSampleQueue : this.sampleQueues) {
                hlsSampleQueue.setSampleOffsetUs(j);
            }
        }
    }

    public int skipData(int i, long j) {
        if (isPendingReset()) {
            return 0;
        }
        HlsSampleQueue hlsSampleQueue = this.sampleQueues[i];
        int skipCount = hlsSampleQueue.getSkipCount(j, this.loadingFinished);
        HlsMediaChunk hlsMediaChunk = (HlsMediaChunk) AbstractC1006u.m2195j(this.mediaChunks);
        if (hlsMediaChunk != null && !hlsMediaChunk.isPublished()) {
            skipCount = Math.min(skipCount, hlsMediaChunk.getFirstSampleIndex(i) - hlsSampleQueue.getReadIndex());
        }
        hlsSampleQueue.skip(skipCount);
        return skipCount;
    }

    @Override // p115n1.InterfaceC1989p
    public InterfaceC1980i0 track(int i, int i4) {
        InterfaceC1980i0 interfaceC1980i0CreateSampleQueue;
        if (!MAPPABLE_TYPES.contains(Integer.valueOf(i4))) {
            int i8 = 0;
            while (true) {
                InterfaceC1980i0[] interfaceC1980i0Arr = this.sampleQueues;
                if (i8 >= interfaceC1980i0Arr.length) {
                    interfaceC1980i0CreateSampleQueue = null;
                    break;
                }
                if (this.sampleQueueTrackIds[i8] == i) {
                    interfaceC1980i0CreateSampleQueue = interfaceC1980i0Arr[i8];
                    break;
                }
                i8++;
            }
        } else {
            interfaceC1980i0CreateSampleQueue = getMappedTrackOutput(i, i4);
        }
        if (interfaceC1980i0CreateSampleQueue == null) {
            if (this.tracksEnded) {
                return createDiscardingTrackOutput(i, i4);
            }
            interfaceC1980i0CreateSampleQueue = createSampleQueue(i, i4);
        }
        if (i4 != 5) {
            return interfaceC1980i0CreateSampleQueue;
        }
        if (this.emsgUnwrappingTrackOutput == null) {
            this.emsgUnwrappingTrackOutput = new EmsgUnwrappingTrackOutput(interfaceC1980i0CreateSampleQueue, this.metadataType);
        }
        return this.emsgUnwrappingTrackOutput;
    }

    public void unbindSampleQueue(int i) {
        assertIsPrepared();
        this.trackGroupToSampleQueueIndex.getClass();
        int i4 = this.trackGroupToSampleQueueIndex[i];
        AbstractC1101a.m2359j(this.sampleQueuesEnabledStates[i4]);
        this.sampleQueuesEnabledStates[i4] = false;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCanceled(Chunk chunk, long j, long j8, boolean z7) {
        this.loadingChunk = null;
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j8, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (z7) {
            return;
        }
        if (isPendingReset() || this.enabledTrackGroupCount == 0) {
            resetSampleQueues();
        }
        if (this.enabledTrackGroupCount > 0) {
            this.callback.onContinueLoadingRequested(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public void onLoadCompleted(Chunk chunk, long j, long j8) {
        this.loadingChunk = null;
        this.chunkSource.onChunkLoadCompleted(chunk);
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j8, chunk.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        if (this.prepared) {
            this.callback.onContinueLoadingRequested(this);
        } else {
            continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(Chunk chunk, long j, long j8, IOException iOException, int i) {
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        int i4;
        boolean zIsMediaChunk = isMediaChunk(chunk);
        if (zIsMediaChunk && !((HlsMediaChunk) chunk).isPublished() && (iOException instanceof C1579w) && ((i4 = ((C1579w) iOException).f6043m) == 410 || i4 == 404)) {
            return Loader.RETRY;
        }
        long jBytesLoaded = chunk.bytesLoaded();
        LoadEventInfo loadEventInfo = new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, chunk.getUri(), chunk.getResponseHeaders(), j, j8, jBytesLoaded);
        LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, AbstractC1118i0.m2447f0(chunk.startTimeUs), AbstractC1118i0.m2447f0(chunk.endTimeUs)), iOException, i);
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor = this.loadErrorHandlingPolicy.getFallbackSelectionFor(TrackSelectionUtil.createFallbackOptions(this.chunkSource.getTrackSelection()), loadErrorInfo);
        boolean zMaybeExcludeTrack = (fallbackSelectionFor == null || fallbackSelectionFor.type != 2) ? false : this.chunkSource.maybeExcludeTrack(chunk, fallbackSelectionFor.exclusionDurationMs);
        if (zMaybeExcludeTrack) {
            if (zIsMediaChunk && jBytesLoaded == 0) {
                ArrayList<HlsMediaChunk> arrayList = this.mediaChunks;
                AbstractC1101a.m2359j(arrayList.remove(arrayList.size() - 1) == chunk);
                if (this.mediaChunks.isEmpty()) {
                    this.pendingResetPositionUs = this.lastSeekPositionUs;
                } else {
                    ((HlsMediaChunk) AbstractC1006u.m2194i(this.mediaChunks)).invalidateExtractor();
                }
            }
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY;
        } else {
            long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(loadErrorInfo);
            loadErrorActionCreateRetryAction = retryDelayMsFor != -9223372036854775807L ? Loader.createRetryAction(false, retryDelayMsFor) : Loader.DONT_RETRY_FATAL;
        }
        Loader.LoadErrorAction loadErrorAction = loadErrorActionCreateRetryAction;
        boolean zIsRetry = loadErrorAction.isRetry();
        this.mediaSourceEventDispatcher.loadError(loadEventInfo, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.loadingChunk = null;
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(chunk.loadTaskId);
        }
        if (zMaybeExcludeTrack) {
            if (!this.prepared) {
                continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(this.lastSeekPositionUs).build());
                return loadErrorAction;
            }
            this.callback.onContinueLoadingRequested(this);
        }
        return loadErrorAction;
    }

    public void maybeThrowError() {
        this.loader.maybeThrowError();
        this.chunkSource.maybeThrowError();
    }
}
