package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0238s0;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.hls.HlsChunkSource;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p013b2.C0557i;
import p013b2.C0562n;
import p013b2.InterfaceC0555g;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.C1108d0;
import p063h1.C1132w;
import p089k1.C1568l;
import p089k1.InterfaceC1564h;
import p115n1.C1983k;
import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class HlsMediaChunk extends MediaChunk {
    public static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger uidSource = new AtomicInteger();
    public final int discontinuitySequenceNumber;
    private final C0237s drmInitData;
    private HlsMediaChunkExtractor extractor;
    private final HlsExtractorFactory extractorFactory;
    private boolean extractorInvalidated;
    private final boolean hasGapTag;
    private final C0557i id3Decoder;
    private boolean initDataLoadRequired;
    private final InterfaceC1564h initDataSource;
    private final C1568l initDataSpec;
    private final boolean initSegmentEncrypted;
    private final boolean isPrimaryTimestampSource;
    private boolean isPublished;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final boolean mediaSegmentEncrypted;
    private final List<C0249w> muxedCaptionFormats;
    private int nextLoadPosition;
    private HlsSampleStreamWrapper output;
    public final int partIndex;
    private final PlayerId playerId;
    public final Uri playlistUrl;
    private final HlsMediaChunkExtractor previousExtractor;
    private AbstractC0983m0 sampleQueueFirstSampleIndices;
    private final C1132w scratchId3Data;
    public final boolean shouldSpliceIn;
    private final C1108d0 timestampAdjuster;
    private final long timestampAdjusterInitializationTimeoutMs;
    public final int uid;

    private HlsMediaChunk(HlsExtractorFactory hlsExtractorFactory, InterfaceC1564h interfaceC1564h, C1568l c1568l, C0249w c0249w, boolean z7, InterfaceC1564h interfaceC1564h2, C1568l c1568l2, boolean z8, Uri uri, List<C0249w> list, int i, Object obj, long j, long j8, long j9, int i4, boolean z9, int i8, boolean z10, boolean z11, C1108d0 c1108d0, long j10, C0237s c0237s, HlsMediaChunkExtractor hlsMediaChunkExtractor, C0557i c0557i, C1132w c1132w, boolean z12, PlayerId playerId) {
        super(interfaceC1564h, c1568l, c0249w, i, obj, j, j8, j9);
        this.mediaSegmentEncrypted = z7;
        this.partIndex = i4;
        this.isPublished = z9;
        this.discontinuitySequenceNumber = i8;
        this.initDataSpec = c1568l2;
        this.initDataSource = interfaceC1564h2;
        this.initDataLoadRequired = c1568l2 != null;
        this.initSegmentEncrypted = z8;
        this.playlistUrl = uri;
        this.isPrimaryTimestampSource = z11;
        this.timestampAdjuster = c1108d0;
        this.timestampAdjusterInitializationTimeoutMs = j10;
        this.hasGapTag = z10;
        this.extractorFactory = hlsExtractorFactory;
        this.muxedCaptionFormats = list;
        this.drmInitData = c0237s;
        this.previousExtractor = hlsMediaChunkExtractor;
        this.id3Decoder = c0557i;
        this.scratchId3Data = c1132w;
        this.shouldSpliceIn = z12;
        this.playerId = playerId;
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        this.sampleQueueFirstSampleIndices = C0981l1.f4211n;
        this.uid = uidSource.getAndIncrement();
    }

    private static InterfaceC1564h buildDataSource(InterfaceC1564h interfaceC1564h, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return interfaceC1564h;
        }
        bArr2.getClass();
        return new Aes128DataSource(interfaceC1564h, bArr, bArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r48v0 */
    /* JADX WARN: Type inference failed for: r48v1, types: [androidx.media3.exoplayer.hls.HlsMediaChunkExtractor] */
    /* JADX WARN: Type inference failed for: r48v2 */
    public static HlsMediaChunk createInstance(HlsExtractorFactory hlsExtractorFactory, InterfaceC1564h interfaceC1564h, C0249w c0249w, long j, HlsMediaPlaylist hlsMediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, Uri uri, List<C0249w> list, int i, Object obj, boolean z7, TimestampAdjusterProvider timestampAdjusterProvider, long j8, HlsMediaChunk hlsMediaChunk, byte[] bArr, byte[] bArr2, boolean z8, PlayerId playerId, CmcdData.Factory factory) {
        byte[] encryptionIvArray;
        InterfaceC0555g interfaceC0555g;
        C1568l c1568l;
        InterfaceC1564h interfaceC1564hBuildDataSource;
        boolean z9;
        Uri uri2;
        C0557i c0557i;
        C1132w c1132w;
        ?? r48;
        byte[] encryptionIvArray2;
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        Map map = Collections.EMPTY_MAP;
        Uri uriM2345C = AbstractC1101a.m2345C(hlsMediaPlaylist.baseUri, segmentBase.url);
        long j9 = segmentBase.byteRangeOffset;
        long j10 = segmentBase.byteRangeLength;
        boolean z10 = false;
        int i4 = segmentBaseHolder.isPreload ? 8 : 0;
        AbstractC1101a.m2361l("The uri must be set.", uriM2345C);
        C1568l c1568l2 = new C1568l(uriM2345C, 1, null, map, j9, j10, null, i4);
        if (factory != null) {
            c1568l2 = factory.setChunkDurationUs(segmentBase.durationUs).createCmcdData().addToDataSpec(c1568l2);
        }
        C1568l c1568l3 = c1568l2;
        boolean z11 = bArr != null;
        if (z11) {
            String str = segmentBase.encryptionIV;
            str.getClass();
            encryptionIvArray = getEncryptionIvArray(str);
        } else {
            encryptionIvArray = null;
        }
        InterfaceC1564h interfaceC1564hBuildDataSource2 = buildDataSource(interfaceC1564h, bArr, encryptionIvArray);
        HlsMediaPlaylist.Segment segment = segmentBase.initializationSegment;
        if (segment != null) {
            boolean z12 = bArr2 != null;
            if (z12) {
                String str2 = segment.encryptionIV;
                str2.getClass();
                encryptionIvArray2 = getEncryptionIvArray(str2);
            } else {
                encryptionIvArray2 = null;
            }
            Uri uriM2345C2 = AbstractC1101a.m2345C(hlsMediaPlaylist.baseUri, segment.url);
            long j11 = segment.byteRangeOffset;
            byte[] bArr3 = encryptionIvArray2;
            long j12 = segment.byteRangeLength;
            AbstractC1101a.m2361l("The uri must be set.", uriM2345C2);
            interfaceC0555g = null;
            c1568l = new C1568l(uriM2345C2, 1, null, map, j11, j12, null, 0);
            if (factory != null) {
                c1568l = factory.setObjectType(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT).createCmcdData().addToDataSpec(c1568l);
            }
            interfaceC1564hBuildDataSource = buildDataSource(interfaceC1564h, bArr2, bArr3);
            z9 = z12;
        } else {
            interfaceC0555g = null;
            c1568l = null;
            interfaceC1564hBuildDataSource = null;
            z9 = false;
        }
        long j13 = j + segmentBase.relativeStartTimeUs;
        long j14 = j13 + segmentBase.durationUs;
        int i8 = hlsMediaPlaylist.discontinuitySequence + segmentBase.relativeDiscontinuitySequence;
        if (hlsMediaChunk != null) {
            C1568l c1568l4 = hlsMediaChunk.initDataSpec;
            boolean z13 = c1568l == c1568l4 || (c1568l != null && c1568l4 != null && c1568l.f5996a.equals(c1568l4.f5996a) && c1568l.f6000e == hlsMediaChunk.initDataSpec.f6000e);
            uri2 = uri;
            if (uri2.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) {
                z10 = true;
            }
            c0557i = hlsMediaChunk.id3Decoder;
            c1132w = hlsMediaChunk.scratchId3Data;
            r48 = (z13 && z10 && !hlsMediaChunk.extractorInvalidated && hlsMediaChunk.discontinuitySequenceNumber == i8) ? hlsMediaChunk.extractor : interfaceC0555g;
        } else {
            uri2 = uri;
            c0557i = new C0557i(interfaceC0555g);
            c1132w = new C1132w(10);
            r48 = interfaceC0555g;
        }
        return new HlsMediaChunk(hlsExtractorFactory, interfaceC1564hBuildDataSource2, c1568l3, c0249w, z11, interfaceC1564hBuildDataSource, c1568l, z9, uri2, list, i, obj, j13, j14, segmentBaseHolder.mediaSequence, segmentBaseHolder.partIndex, !segmentBaseHolder.isPreload, i8, segmentBase.hasGapTag, z7, timestampAdjusterProvider.getAdjuster(i8), j8, segmentBase.drmInitData, r48, c0557i, c1132w, z8, playerId);
    }

    @RequiresNonNull({"output"})
    private void feedDataToExtractor(InterfaceC1564h interfaceC1564h, C1568l c1568l, boolean z7, boolean z8) {
        C1568l c1568lM3238b;
        long j;
        if (z7) {
            z = this.nextLoadPosition != 0;
            c1568lM3238b = c1568l;
        } else {
            c1568lM3238b = c1568l.m3238b(this.nextLoadPosition);
        }
        try {
            C1983k c1983kPrepareExtraction = prepareExtraction(interfaceC1564h, c1568lM3238b, z8);
            if (z) {
                c1983kPrepareExtraction.mo3861h(this.nextLoadPosition);
            }
            while (!this.loadCanceled && this.extractor.read(c1983kPrepareExtraction)) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.trackFormat.f1514f & 16384) == 0) {
                            throw e;
                        }
                        this.extractor.onTruncatedSegmentParsed();
                        j = c1983kPrepareExtraction.f7358m;
                    }
                } catch (Throwable th) {
                    this.nextLoadPosition = (int) (c1983kPrepareExtraction.f7358m - c1568l.f6000e);
                    throw th;
                }
            }
            j = c1983kPrepareExtraction.f7358m;
            this.nextLoadPosition = (int) (j - c1568l.f6000e);
        } finally {
            AbstractC0715d.m1568p(interfaceC1564h);
        }
    }

    private static byte[] getEncryptionIvArray(String str) {
        if (AbstractC0714c.m1517e0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean isIndependent(HlsChunkSource.SegmentBaseHolder segmentBaseHolder, HlsMediaPlaylist hlsMediaPlaylist) {
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        if (!(segmentBase instanceof HlsMediaPlaylist.Part)) {
            return hlsMediaPlaylist.hasIndependentSegments;
        }
        if (((HlsMediaPlaylist.Part) segmentBase).isIndependent) {
            return true;
        }
        return segmentBaseHolder.partIndex == 0 && hlsMediaPlaylist.hasIndependentSegments;
    }

    @RequiresNonNull({"output"})
    private void loadMedia() {
        feedDataToExtractor(this.dataSource, this.dataSpec, this.mediaSegmentEncrypted, true);
    }

    @RequiresNonNull({"output"})
    private void maybeLoadInitData() {
        if (this.initDataLoadRequired) {
            this.initDataSource.getClass();
            this.initDataSpec.getClass();
            feedDataToExtractor(this.initDataSource, this.initDataSpec, this.initSegmentEncrypted, false);
            this.nextLoadPosition = 0;
            this.initDataLoadRequired = false;
        }
    }

    private long peekId3PrivTimestamp(InterfaceC1988o interfaceC1988o) throws Throwable {
        interfaceC1988o.mo3860g();
        try {
            this.scratchId3Data.m2510D(10);
            interfaceC1988o.mo3862i(this.scratchId3Data.f4799a, 0, 10);
            if (this.scratchId3Data.m2538x() != 4801587) {
                return -9223372036854775807L;
            }
            this.scratchId3Data.m2514H(3);
            int iM2534t = this.scratchId3Data.m2534t();
            int i = iM2534t + 10;
            C1132w c1132w = this.scratchId3Data;
            byte[] bArr = c1132w.f4799a;
            if (i > bArr.length) {
                c1132w.m2510D(i);
                System.arraycopy(bArr, 0, this.scratchId3Data.f4799a, 0, 10);
            }
            interfaceC1988o.mo3862i(this.scratchId3Data.f4799a, 10, iM2534t);
            C0241t0 c0241t0M1301v = this.id3Decoder.m1301v(this.scratchId3Data.f4799a, iM2534t);
            if (c0241t0M1301v == null) {
                return -9223372036854775807L;
            }
            for (InterfaceC0238s0 interfaceC0238s0 : c0241t0M1301v.f1412j) {
                if (interfaceC0238s0 instanceof C0562n) {
                    C0562n c0562n = (C0562n) interfaceC0238s0;
                    if (PRIV_TIMESTAMP_FRAME_OWNER.equals(c0562n.f2263k)) {
                        System.arraycopy(c0562n.f2264l, 0, this.scratchId3Data.f4799a, 0, 8);
                        this.scratchId3Data.m2513G(0);
                        this.scratchId3Data.m2512F(8);
                        return this.scratchId3Data.m2529o() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
            return -9223372036854775807L;
        }
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    private C1983k prepareExtraction(InterfaceC1564h interfaceC1564h, C1568l c1568l, boolean z7) throws Throwable {
        HlsMediaChunkExtractor hlsMediaChunkExtractorCreateExtractor;
        long jOpen = interfaceC1564h.open(c1568l);
        if (z7) {
            try {
                this.timestampAdjuster.m2402g(this.isPrimaryTimestampSource, this.startTimeUs, this.timestampAdjusterInitializationTimeoutMs);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        C1983k c1983k = new C1983k(interfaceC1564h, c1568l.f6000e, jOpen);
        if (this.extractor == null) {
            long jPeekId3PrivTimestamp = peekId3PrivTimestamp(c1983k);
            c1983k.f7360o = 0;
            HlsMediaChunkExtractor hlsMediaChunkExtractor = this.previousExtractor;
            if (hlsMediaChunkExtractor != null) {
                hlsMediaChunkExtractorCreateExtractor = hlsMediaChunkExtractor.recreate();
            } else {
                hlsMediaChunkExtractorCreateExtractor = this.extractorFactory.createExtractor(c1568l.f5996a, this.trackFormat, this.muxedCaptionFormats, this.timestampAdjuster, interfaceC1564h.getResponseHeaders(), c1983k, this.playerId);
                c1983k = c1983k;
            }
            this.extractor = hlsMediaChunkExtractorCreateExtractor;
            if (hlsMediaChunkExtractorCreateExtractor.isPackedAudioExtractor()) {
                this.output.setSampleOffsetUs(jPeekId3PrivTimestamp != -9223372036854775807L ? this.timestampAdjuster.m2397b(jPeekId3PrivTimestamp) : this.startTimeUs);
            } else {
                this.output.setSampleOffsetUs(0L);
            }
            this.output.onNewExtractor();
            this.extractor.init(this.output);
        }
        this.output.setDrmInitData(this.drmInitData);
        return c1983k;
    }

    public static boolean shouldSpliceIn(HlsMediaChunk hlsMediaChunk, Uri uri, HlsMediaPlaylist hlsMediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, long j) {
        if (hlsMediaChunk == null) {
            return false;
        }
        if (uri.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) {
            return false;
        }
        return !isIndependent(segmentBaseHolder, hlsMediaPlaylist) || j + segmentBaseHolder.segmentBase.relativeStartTimeUs < hlsMediaChunk.endTimeUs;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public int getFirstSampleIndex(int i) {
        AbstractC1101a.m2359j(!this.shouldSpliceIn);
        if (i >= this.sampleQueueFirstSampleIndices.size()) {
            return 0;
        }
        return ((Integer) this.sampleQueueFirstSampleIndices.get(i)).intValue();
    }

    public void init(HlsSampleStreamWrapper hlsSampleStreamWrapper, AbstractC0983m0 abstractC0983m0) {
        this.output = hlsSampleStreamWrapper;
        this.sampleQueueFirstSampleIndices = abstractC0983m0;
    }

    public void invalidateExtractor() {
        this.extractorInvalidated = true;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    public boolean isPublished() {
        return this.isPublished;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() {
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        this.output.getClass();
        if (this.extractor == null && (hlsMediaChunkExtractor = this.previousExtractor) != null && hlsMediaChunkExtractor.isReusable()) {
            this.extractor = this.previousExtractor;
            this.initDataLoadRequired = false;
        }
        maybeLoadInitData();
        if (this.loadCanceled) {
            return;
        }
        if (!this.hasGapTag) {
            loadMedia();
        }
        this.loadCompleted = !this.loadCanceled;
    }

    public void publish() {
        this.isPublished = true;
    }
}
