package androidx.media3.exoplayer.smoothstreaming;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.smoothstreaming.SsChunkSource;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifest;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.chunk.BaseMediaChunkIterator;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.chunk.ChunkHolder;
import androidx.media3.exoplayer.source.chunk.ContainerMediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.C2181z;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p064h2.C1144i;
import p064h2.C1152q;
import p064h2.C1153r;
import p089k1.C1568l;
import p089k1.InterfaceC1557c0;
import p089k1.InterfaceC1563g;
import p089k1.InterfaceC1564h;
import p090k2.C1587e;
import p090k2.InterfaceC1597o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class DefaultSsChunkSource implements SsChunkSource {
    private final ChunkExtractor[] chunkExtractors;
    private final CmcdConfiguration cmcdConfiguration;
    private int currentManifestChunkOffset;
    private final InterfaceC1564h dataSource;
    private IOException fatalError;
    private long lastChunkRequestRealtimeMs = -9223372036854775807L;
    private SsManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int streamElementIndex;
    private ExoTrackSelection trackSelection;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Factory implements SsChunkSource.Factory {
        private final InterfaceC1563g dataSourceFactory;
        private boolean parseSubtitlesDuringExtraction;
        private InterfaceC1597o subtitleParserFactory = new C1587e();

        public Factory(InterfaceC1563g interfaceC1563g) {
            this.dataSourceFactory = interfaceC1563g;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.SsChunkSource.Factory
        public SsChunkSource createChunkSource(LoaderErrorThrower loaderErrorThrower, SsManifest ssManifest, int i, ExoTrackSelection exoTrackSelection, InterfaceC1557c0 interfaceC1557c0, CmcdConfiguration cmcdConfiguration) {
            InterfaceC1564h interfaceC1564hMo55l = this.dataSourceFactory.mo55l();
            if (interfaceC1557c0 != null) {
                interfaceC1564hMo55l.addTransferListener(interfaceC1557c0);
            }
            return new DefaultSsChunkSource(loaderErrorThrower, ssManifest, i, exoTrackSelection, interfaceC1564hMo55l, cmcdConfiguration, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.SsChunkSource.Factory
        public C0249w getOutputTextFormat(C0249w c0249w) {
            if (!this.parseSubtitlesDuringExtraction || !this.subtitleParserFactory.supportsFormat(c0249w)) {
                return c0249w;
            }
            C0246v c0246vM692a = c0249w.m692a();
            String str = c0249w.f1519k;
            c0246vM692a.f1447m = AbstractC0244u0.m687p("application/x-media3-cues");
            c0246vM692a.f1431H = this.subtitleParserFactory.mo3257c(c0249w);
            StringBuilder sb = new StringBuilder();
            sb.append(c0249w.f1522n);
            sb.append(str != null ? " ".concat(str) : C2181z.FRAGMENT_ENCODE_SET);
            c0246vM692a.f1444j = sb.toString();
            c0246vM692a.f1452r = Long.MAX_VALUE;
            return new C0249w(c0246vM692a);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.SsChunkSource.Factory
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z7) {
            this.parseSubtitlesDuringExtraction = z7;
            return this;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.SsChunkSource.Factory
        public Factory setSubtitleParserFactory(InterfaceC1597o interfaceC1597o) {
            this.subtitleParserFactory = interfaceC1597o;
            return this;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class StreamElementIterator extends BaseMediaChunkIterator {
        private final SsManifest.StreamElement streamElement;
        private final int trackIndex;

        public StreamElementIterator(SsManifest.StreamElement streamElement, int i, int i4) {
            super(i4, streamElement.chunkCount - 1);
            this.streamElement = streamElement;
            this.trackIndex = i;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            return this.streamElement.getChunkDurationUs((int) getCurrentIndex()) + getChunkStartTimeUs();
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.streamElement.getStartTimeUs((int) getCurrentIndex());
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public C1568l getDataSpec() {
            checkInBounds();
            return new C1568l(this.streamElement.buildRequestUri(this.trackIndex, (int) getCurrentIndex()));
        }
    }

    public DefaultSsChunkSource(LoaderErrorThrower loaderErrorThrower, SsManifest ssManifest, int i, ExoTrackSelection exoTrackSelection, InterfaceC1564h interfaceC1564h, CmcdConfiguration cmcdConfiguration, InterfaceC1597o interfaceC1597o, boolean z7) {
        C1153r[] c1153rArr;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = ssManifest;
        this.streamElementIndex = i;
        this.trackSelection = exoTrackSelection;
        this.dataSource = interfaceC1564h;
        this.cmcdConfiguration = cmcdConfiguration;
        SsManifest.StreamElement streamElement = ssManifest.streamElements[i];
        this.chunkExtractors = new ChunkExtractor[exoTrackSelection.length()];
        for (int i4 = 0; i4 < this.chunkExtractors.length; i4++) {
            int indexInTrackGroup = exoTrackSelection.getIndexInTrackGroup(i4);
            C0249w c0249w = streamElement.formats[indexInTrackGroup];
            if (c0249w.f1526r != null) {
                SsManifest.ProtectionElement protectionElement = ssManifest.protectionElement;
                protectionElement.getClass();
                c1153rArr = protectionElement.trackEncryptionBoxes;
            } else {
                c1153rArr = null;
            }
            C1153r[] c1153rArr2 = c1153rArr;
            int i8 = streamElement.type;
            int i9 = i8 == 2 ? 4 : 0;
            long j = streamElement.timescale;
            long j8 = ssManifest.durationUs;
            this.chunkExtractors[i4] = new BundledChunkExtractor(new C1144i(interfaceC1597o, !z7 ? 35 : 3, null, new C1152q(indexInTrackGroup, i8, j, -9223372036854775807L, j8, j8, c0249w, 0, c1153rArr2, i9, null, null), C0981l1.f4211n, null), streamElement.type, c0249w);
        }
    }

    private static MediaChunk newMediaChunk(C0249w c0249w, InterfaceC1564h interfaceC1564h, Uri uri, int i, long j, long j8, long j9, int i4, Object obj, ChunkExtractor chunkExtractor, CmcdData.Factory factory) {
        Map map = Collections.EMPTY_MAP;
        AbstractC1101a.m2361l("The uri must be set.", uri);
        C1568l c1568l = new C1568l(uri, 1, null, map, 0L, -1L, null, 0);
        if (factory != null) {
            c1568l = factory.createCmcdData().addToDataSpec(c1568l);
        }
        return new ContainerMediaChunk(interfaceC1564h, c1568l, c0249w, i4, obj, j, j8, j9, -9223372036854775807L, i, 1, j, chunkExtractor);
    }

    private long resolveTimeToLiveEdgeUs(long j) {
        SsManifest ssManifest = this.manifest;
        if (!ssManifest.isLive) {
            return -9223372036854775807L;
        }
        SsManifest.StreamElement streamElement = ssManifest.streamElements[this.streamElementIndex];
        int i = streamElement.chunkCount - 1;
        return (streamElement.getChunkDurationUs(i) + streamElement.getStartTimeUs(i)) - j;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        SsManifest.StreamElement streamElement = this.manifest.streamElements[this.streamElementIndex];
        int chunkIndex = streamElement.getChunkIndex(j);
        long startTimeUs = streamElement.getStartTimeUs(chunkIndex);
        return seekParameters.resolveSeekPositionUs(j, startTimeUs, (startTimeUs >= j || chunkIndex >= streamElement.chunkCount + (-1)) ? startTimeUs : streamElement.getStartTimeUs(chunkIndex + 1));
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public final void getNextChunk(LoadingInfo loadingInfo, long j, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        List<? extends MediaChunk> list2;
        int nextChunkIndex;
        CmcdData.Factory objectType;
        if (this.fatalError != null) {
            return;
        }
        SsManifest.StreamElement streamElement = this.manifest.streamElements[this.streamElementIndex];
        if (streamElement.chunkCount == 0) {
            chunkHolder.endOfStream = !r5.isLive;
            return;
        }
        if (list.isEmpty()) {
            nextChunkIndex = streamElement.getChunkIndex(j);
            list2 = list;
        } else {
            list2 = list;
            nextChunkIndex = (int) (list2.get(list.size() - 1).getNextChunkIndex() - this.currentManifestChunkOffset);
            if (nextChunkIndex < 0) {
                this.fatalError = new BehindLiveWindowException();
                return;
            }
        }
        if (nextChunkIndex >= streamElement.chunkCount) {
            chunkHolder.endOfStream = !this.manifest.isLive;
            return;
        }
        long j8 = loadingInfo.playbackPositionUs;
        long j9 = j - j8;
        long jResolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j8);
        int length = this.trackSelection.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        int i = 0;
        while (i < length) {
            int i4 = i;
            mediaChunkIteratorArr[i4] = new StreamElementIterator(streamElement, this.trackSelection.getIndexInTrackGroup(i), nextChunkIndex);
            i = i4 + 1;
        }
        this.trackSelection.updateSelectedTrack(j8, j9, jResolveTimeToLiveEdgeUs, list2, mediaChunkIteratorArr);
        long startTimeUs = streamElement.getStartTimeUs(nextChunkIndex);
        long chunkDurationUs = streamElement.getChunkDurationUs(nextChunkIndex) + startTimeUs;
        long j10 = list.isEmpty() ? j : -9223372036854775807L;
        int i8 = nextChunkIndex + this.currentManifestChunkOffset;
        int selectedIndex = this.trackSelection.getSelectedIndex();
        ChunkExtractor chunkExtractor = this.chunkExtractors[selectedIndex];
        int indexInTrackGroup = this.trackSelection.getIndexInTrackGroup(selectedIndex);
        Uri uriBuildRequestUri = streamElement.buildRequestUri(indexInTrackGroup, nextChunkIndex);
        if (this.cmcdConfiguration != null) {
            objectType = new CmcdData.Factory(this.cmcdConfiguration, this.trackSelection, Math.max(0L, j9), loadingInfo.playbackSpeed, CmcdData.Factory.STREAMING_FORMAT_SS, this.manifest.isLive, loadingInfo.rebufferedSince(this.lastChunkRequestRealtimeMs), list.isEmpty()).setChunkDurationUs(chunkDurationUs - startTimeUs).setObjectType(CmcdData.Factory.getObjectType(this.trackSelection));
            int i9 = nextChunkIndex + 1;
            if (i9 < streamElement.chunkCount) {
                objectType.setNextObjectRequest(AbstractC1101a.m2368s(uriBuildRequestUri, streamElement.buildRequestUri(indexInTrackGroup, i9)));
            }
        } else {
            objectType = null;
        }
        CmcdData.Factory factory = objectType;
        this.lastChunkRequestRealtimeMs = SystemClock.elapsedRealtime();
        chunkHolder.chunk = newMediaChunk(this.trackSelection.getSelectedFormat(), this.dataSource, uriBuildRequestUri, i8, startTimeUs, chunkDurationUs, j10, this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), chunkExtractor, factory);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public int getPreferredQueueSize(long j, List<? extends MediaChunk> list) {
        return (this.fatalError != null || this.trackSelection.length() < 2) ? list.size() : this.trackSelection.evaluateQueueSize(j, list);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean z7, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor = loadErrorHandlingPolicy.getFallbackSelectionFor(TrackSelectionUtil.createFallbackOptions(this.trackSelection), loadErrorInfo);
        if (!z7 || fallbackSelectionFor == null || fallbackSelectionFor.type != 2) {
            return false;
        }
        ExoTrackSelection exoTrackSelection = this.trackSelection;
        return exoTrackSelection.excludeTrack(exoTrackSelection.indexOf(chunk.trackFormat), fallbackSelectionFor.exclusionDurationMs);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public void release() {
        for (ChunkExtractor chunkExtractor : this.chunkExtractors) {
            chunkExtractor.release();
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long j, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j, chunk, list);
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.SsChunkSource
    public void updateManifest(SsManifest ssManifest) {
        SsManifest.StreamElement[] streamElementArr = this.manifest.streamElements;
        int i = this.streamElementIndex;
        SsManifest.StreamElement streamElement = streamElementArr[i];
        int i4 = streamElement.chunkCount;
        SsManifest.StreamElement streamElement2 = ssManifest.streamElements[i];
        if (i4 == 0 || streamElement2.chunkCount == 0) {
            this.currentManifestChunkOffset += i4;
        } else {
            int i8 = i4 - 1;
            long chunkDurationUs = streamElement.getChunkDurationUs(i8) + streamElement.getStartTimeUs(i8);
            long startTimeUs = streamElement2.getStartTimeUs(0);
            if (chunkDurationUs <= startTimeUs) {
                this.currentManifestChunkOffset += i4;
            } else {
                this.currentManifestChunkOffset = streamElement.getChunkIndex(startTimeUs) + this.currentManifestChunkOffset;
            }
        }
        this.manifest = ssManifest;
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.SsChunkSource
    public void updateTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }
}
