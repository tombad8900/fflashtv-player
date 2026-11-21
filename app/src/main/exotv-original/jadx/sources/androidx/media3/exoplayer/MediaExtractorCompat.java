package androidx.media3.exoplayer;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaDataSource;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import com.bumptech.glide.AbstractC0715d;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p002a1.AbstractC0008a1;
import p002a1.C0016e;
import p043e6.C0917e;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p064h2.C1148m;
import p089k1.C1568l;
import p089k1.C1575s;
import p089k1.C1581y;
import p089k1.InterfaceC1563g;
import p089k1.InterfaceC1564h;
import p106m1.C1872g;
import p115n1.C1964a0;
import p115n1.C1966b0;
import p115n1.C1970d0;
import p115n1.C1978h0;
import p115n1.C1983k;
import p115n1.C1985l;
import p115n1.C1986m;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;
import p115n1.InterfaceC1990q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class MediaExtractorCompat {
    public static final int SEEK_TO_CLOSEST_SYNC = 2;
    public static final int SEEK_TO_NEXT_SYNC = 1;
    public static final int SEEK_TO_PREVIOUS_SYNC = 0;
    private static final String TAG = "MediaExtractorCompat";
    private final Allocator allocator;
    private InterfaceC1564h currentDataSource;
    private InterfaceC1987n currentExtractor;
    private InterfaceC1988o currentExtractorInput;
    private final InterfaceC1563g dataSourceFactory;
    private final InterfaceC1990q extractorsFactory;
    private final FormatHolder formatHolder;
    private boolean hasBeenPrepared;
    private Map<String, String> httpRequestHeaders;
    private final C1872g noDataBuffer;
    private long offsetInCurrentFile;
    private C1970d0 pendingSeek;
    private final C1964a0 positionHolder;
    private final C1872g sampleHolderWithBufferReplacementDirect;
    private final C1872g sampleHolderWithBufferReplacementDisabled;
    private final SparseArray<MediaExtractorSampleQueue> sampleQueues;
    private InterfaceC1968c0 seekMap;
    private final Set<Integer> selectedTrackIndices;
    private final ArrayDeque<Integer> trackIndicesPerSampleInQueuedOrder;
    private final ArrayList<MediaExtractorTrack> tracks;
    private boolean tracksEnded;
    private int upstreamFormatsCount;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class ExtractorOutputImpl implements InterfaceC1989p {
        private ExtractorOutputImpl() {
        }

        @Override // p115n1.InterfaceC1989p
        public void endTracks() {
            MediaExtractorCompat.this.tracksEnded = true;
        }

        @Override // p115n1.InterfaceC1989p
        public void seekMap(InterfaceC1968c0 interfaceC1968c0) {
            MediaExtractorCompat.this.seekMap = interfaceC1968c0;
        }

        @Override // p115n1.InterfaceC1989p
        public InterfaceC1980i0 track(int i, int i4) {
            MediaExtractorSampleQueue mediaExtractorSampleQueue = (MediaExtractorSampleQueue) MediaExtractorCompat.this.sampleQueues.get(i);
            if (mediaExtractorSampleQueue != null) {
                return mediaExtractorSampleQueue;
            }
            if (MediaExtractorCompat.this.tracksEnded) {
                return new C1986m();
            }
            MediaExtractorCompat mediaExtractorCompat = MediaExtractorCompat.this;
            MediaExtractorSampleQueue mediaExtractorSampleQueue2 = mediaExtractorCompat.new MediaExtractorSampleQueue(mediaExtractorCompat.allocator, i);
            MediaExtractorCompat.this.sampleQueues.put(i, mediaExtractorSampleQueue2);
            return mediaExtractorSampleQueue2;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class MediaExtractorSampleQueue extends SampleQueue {
        private int compatibilityTrackIndex;
        private int mainTrackIndex;
        public final int trackId;

        public MediaExtractorSampleQueue(Allocator allocator, int i) {
            super(allocator, null, null);
            this.trackId = i;
            this.mainTrackIndex = -1;
            this.compatibilityTrackIndex = -1;
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public C0249w getAdjustedUpstreamFormat(C0249w c0249w) {
            if (getUpstreamFormat() == null) {
                MediaExtractorCompat.this.onSampleQueueFormatInitialized(this, c0249w);
            }
            return super.getAdjustedUpstreamFormat(c0249w);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, p115n1.InterfaceC1980i0
        public int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7) {
            return sampleData(interfaceC0219m, i, z7, 0);
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, p115n1.InterfaceC1980i0
        public void sampleMetadata(long j, int i, int i4, int i8, C1978h0 c1978h0) {
            int i9 = i & (-536870913);
            AbstractC1101a.m2359j(this.mainTrackIndex != -1);
            int writeIndex = getWriteIndex();
            super.sampleMetadata(j, i9, i4, i8, c1978h0);
            if (getWriteIndex() == writeIndex + 1) {
                if (this.compatibilityTrackIndex != -1) {
                    MediaExtractorCompat.this.trackIndicesPerSampleInQueuedOrder.addLast(Integer.valueOf(this.compatibilityTrackIndex));
                }
                MediaExtractorCompat.this.trackIndicesPerSampleInQueuedOrder.addLast(Integer.valueOf(this.mainTrackIndex));
            }
        }

        public void setCompatibilityTrackIndex(int i) {
            this.compatibilityTrackIndex = i;
        }

        public void setMainTrackIndex(int i) {
            this.mainTrackIndex = i;
        }

        public String toString() {
            int i = this.trackId;
            int i4 = this.mainTrackIndex;
            int i8 = this.compatibilityTrackIndex;
            StringBuilder sbM19o = AbstractC0008a1.m19o(i, i4, "trackId: ", ", mainTrackIndex: ", ", compatibilityTrackIndex: ");
            sbM19o.append(i8);
            return sbM19o.toString();
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue, p115n1.InterfaceC1980i0
        public void sampleData(C1132w c1132w, int i) {
            sampleData(c1132w, i, 0);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class MediaExtractorTrack {
        public final String compatibilityTrackMimeType;
        public final boolean isCompatibilityTrack;
        public final MediaExtractorSampleQueue sampleQueue;

        public MediaFormat createDownstreamMediaFormat(FormatHolder formatHolder, C1872g c1872g) {
            int i;
            formatHolder.clear();
            this.sampleQueue.read(formatHolder, c1872g, 2, false);
            C0249w c0249w = formatHolder.format;
            c0249w.getClass();
            MediaFormat mediaFormat = new MediaFormat();
            AbstractC1101a.m2375z(mediaFormat, "bitrate", c0249w.f1518j);
            AbstractC1101a.m2375z(mediaFormat, "max-bitrate", c0249w.f1517i);
            AbstractC1101a.m2375z(mediaFormat, "channel-count", c0249w.f1498C);
            AbstractC1101a.m2374y(mediaFormat, c0249w.f1497B);
            String str = c0249w.f1522n;
            if (str != null) {
                mediaFormat.setString("mime", str);
            }
            String str2 = c0249w.f1519k;
            if (str2 != null) {
                mediaFormat.setString("codecs-string", str2);
            }
            float f8 = c0249w.f1531w;
            if (f8 != -1.0f) {
                mediaFormat.setFloat("frame-rate", f8);
            }
            AbstractC1101a.m2375z(mediaFormat, "width", c0249w.f1529u);
            AbstractC1101a.m2375z(mediaFormat, "height", c0249w.f1530v);
            AbstractC1101a.m2346D(mediaFormat, c0249w.f1525q);
            int i4 = c0249w.f1500E;
            if (i4 != -1) {
                AbstractC1101a.m2375z(mediaFormat, "exo-pcm-encoding-int", i4);
                if (i4 == 0) {
                    i = 0;
                } else if (i4 != 2) {
                    i = 3;
                    if (i4 != 3) {
                        i = 4;
                        if (i4 != 4) {
                            i = 21;
                            if (i4 != 21) {
                                i = 22;
                                if (i4 == 22) {
                                }
                            }
                        }
                    }
                } else {
                    i = 2;
                }
                mediaFormat.setInteger("pcm-encoding", i);
            }
            String str3 = c0249w.f1512d;
            if (str3 != null) {
                mediaFormat.setString("language", str3);
            }
            AbstractC1101a.m2375z(mediaFormat, "max-input-size", c0249w.f1523o);
            AbstractC1101a.m2375z(mediaFormat, "sample-rate", c0249w.f1499D);
            AbstractC1101a.m2375z(mediaFormat, "caption-service-number", c0249w.f1503H);
            mediaFormat.setInteger("rotation-degrees", c0249w.f1532x);
            int i8 = c0249w.f1513e;
            int i9 = 1;
            mediaFormat.setInteger("is-autoselect", (i8 & 4) != 0 ? 1 : 0);
            mediaFormat.setInteger("is-default", (i8 & 1) != 0 ? 1 : 0);
            mediaFormat.setInteger("is-forced-subtitle", (2 & i8) != 0 ? 1 : 0);
            mediaFormat.setInteger("encoder-delay", c0249w.f1501F);
            mediaFormat.setInteger("encoder-padding", c0249w.f1502G);
            float f9 = c0249w.f1533y;
            mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f9);
            int i10 = 1073741824;
            if (f9 < 1.0f) {
                i9 = (int) (f9 * 1073741824);
            } else if (f9 > 1.0f) {
                i9 = 1073741824;
                i10 = (int) (1073741824 / f9);
            } else {
                i10 = 1;
            }
            mediaFormat.setInteger("sar-width", i9);
            mediaFormat.setInteger("sar-height", i10);
            formatHolder.clear();
            if (this.compatibilityTrackMimeType != null) {
                if (AbstractC1118i0.f4750a >= 29) {
                    mediaFormat.removeKey("codecs-string");
                }
                mediaFormat.setString("mime", this.compatibilityTrackMimeType);
            }
            return mediaFormat;
        }

        public void discardFrontSample() {
            this.sampleQueue.skip(1);
            this.sampleQueue.discardToRead();
        }

        public int getIdOfBackingTrack() {
            return this.sampleQueue.trackId;
        }

        public String toString() {
            return "MediaExtractorSampleQueue: " + this.sampleQueue + ", isCompatibilityTrack: " + this.isCompatibilityTrack + ", compatibilityTrackMimeType: " + this.compatibilityTrackMimeType;
        }

        private MediaExtractorTrack(MediaExtractorSampleQueue mediaExtractorSampleQueue, boolean z7, String str) {
            this.sampleQueue = mediaExtractorSampleQueue;
            this.isCompatibilityTrack = z7;
            this.compatibilityTrackMimeType = str;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SeekMode {
    }

    public MediaExtractorCompat(Context context) {
        this(new C1985l(), new C0016e(context));
    }

    @EnsuresNonNullIf(expression = {"trackIndicesPerSampleInQueuedOrder.peekFirst()"}, result = true)
    private boolean advanceToSampleOrEndOfInput() {
        int i;
        try {
            maybeResolvePendingSeek();
            boolean z7 = false;
            while (true) {
                if (this.trackIndicesPerSampleInQueuedOrder.isEmpty()) {
                    if (z7) {
                        return false;
                    }
                    try {
                        InterfaceC1987n interfaceC1987n = this.currentExtractor;
                        interfaceC1987n.getClass();
                        InterfaceC1988o interfaceC1988o = this.currentExtractorInput;
                        interfaceC1988o.getClass();
                        i = interfaceC1987n.read(interfaceC1988o, this.positionHolder);
                    } catch (Exception | OutOfMemoryError e) {
                        AbstractC1101a.m2349G(TAG, "Treating exception as the end of input.", e);
                    }
                    if (i == -1) {
                        z7 = true;
                    } else if (i == 1) {
                        this.currentExtractorInput = reopenCurrentDataSource(this.positionHolder.f7264a);
                    }
                } else {
                    if (this.selectedTrackIndices.contains(this.trackIndicesPerSampleInQueuedOrder.peekFirst())) {
                        return true;
                    }
                    skipOneSample();
                }
            }
        } catch (IOException e8) {
            AbstractC1101a.m2349G(TAG, "Treating exception as the end of input.", e8);
            return false;
        }
    }

    private C1568l buildDataSpec(Uri uri, long j) {
        Map<String, String> map = Collections.EMPTY_MAP;
        Map<String, String> map2 = this.httpRequestHeaders;
        Map<String, String> map3 = map2 != null ? map2 : map;
        AbstractC1101a.m2361l("The uri must be set.", uri);
        return new C1568l(uri, 1, null, map3, j, -1L, null, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$selectExtractor$0(InterfaceC1987n interfaceC1987n) {
        return interfaceC1987n.getUnderlyingImplementation().getClass().getSimpleName();
    }

    private void maybeResolvePendingSeek() {
        C1970d0 c1970d0 = this.pendingSeek;
        if (c1970d0 == null) {
            return;
        }
        c1970d0.getClass();
        long j = c1970d0.f7312b;
        InterfaceC1987n interfaceC1987n = this.currentExtractor;
        interfaceC1987n.getClass();
        interfaceC1987n.seek(j, c1970d0.f7311a);
        this.currentExtractorInput = reopenCurrentDataSource(j);
        this.pendingSeek = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void onSampleQueueFormatInitialized(MediaExtractorSampleQueue mediaExtractorSampleQueue, C0249w c0249w) {
        boolean z7 = true;
        this.upstreamFormatsCount++;
        mediaExtractorSampleQueue.setMainTrackIndex(this.tracks.size());
        Object[] objArr = 0;
        this.tracks.add(new MediaExtractorTrack(mediaExtractorSampleQueue, false, null));
        String alternativeCodecMimeType = MediaCodecUtil.getAlternativeCodecMimeType(c0249w);
        if (alternativeCodecMimeType != null) {
            mediaExtractorSampleQueue.setCompatibilityTrackIndex(this.tracks.size());
            this.tracks.add(new MediaExtractorTrack(mediaExtractorSampleQueue, z7, alternativeCodecMimeType));
        }
    }

    private void peekNextSelectedTrackSample(C1872g c1872g, boolean z7) {
        ArrayList<MediaExtractorTrack> arrayList = this.tracks;
        Integer numPeekFirst = this.trackIndicesPerSampleInQueuedOrder.peekFirst();
        numPeekFirst.getClass();
        MediaExtractorSampleQueue mediaExtractorSampleQueue = arrayList.get(numPeekFirst.intValue()).sampleQueue;
        int i = (z7 ? 4 : 0) | 1;
        int i4 = mediaExtractorSampleQueue.read(this.formatHolder, c1872g, i, false);
        if (i4 == -5) {
            i4 = mediaExtractorSampleQueue.read(this.formatHolder, c1872g, i, false);
        }
        this.formatHolder.clear();
        AbstractC1101a.m2359j(i4 == -4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void prepareDataSource(InterfaceC1564h interfaceC1564h, C1568l c1568l) throws C0247v0 {
        int i;
        AbstractC1101a.m2359j(!this.hasBeenPrepared);
        this.hasBeenPrepared = true;
        this.offsetInCurrentFile = c1568l.f6000e;
        this.currentDataSource = interfaceC1564h;
        InterfaceC1988o c1983k = new C1983k(this.currentDataSource, 0L, interfaceC1564h.open(c1568l));
        InterfaceC1987n interfaceC1987nSelectExtractor = selectExtractor(c1983k);
        Throwable e = null;
        interfaceC1987nSelectExtractor.init(new ExtractorOutputImpl());
        boolean z7 = true;
        while (z7) {
            try {
                i = interfaceC1987nSelectExtractor.read(c1983k, this.positionHolder);
            } catch (Exception | OutOfMemoryError e8) {
                e = e8;
                i = -1;
            }
            boolean z8 = !this.tracksEnded || this.upstreamFormatsCount < this.sampleQueues.size() || this.seekMap == null;
            if (e != null || (z8 && i == -1)) {
                release();
                throw C0247v0.createForMalformedContainer(e != null ? "Exception encountered while parsing input media." : "Reached end of input before preparation completed.", e);
            }
            if (i == 1) {
                c1983k = reopenCurrentDataSource(this.positionHolder.f7264a);
            }
            z7 = z8;
        }
        this.currentExtractorInput = c1983k;
        this.currentExtractor = interfaceC1987nSelectExtractor;
    }

    private InterfaceC1988o reopenCurrentDataSource(long j) {
        InterfaceC1564h interfaceC1564h = this.currentDataSource;
        interfaceC1564h.getClass();
        Uri uri = interfaceC1564h.getUri();
        uri.getClass();
        AbstractC0715d.m1568p(interfaceC1564h);
        long jOpen = interfaceC1564h.open(buildDataSpec(uri, this.offsetInCurrentFile + j));
        if (jOpen != -1) {
            jOpen += j;
        }
        return new C1983k(interfaceC1564h, j, jOpen);
    }

    private InterfaceC1987n selectExtractor(InterfaceC1988o interfaceC1988o) throws UnrecognizedInputFormatException {
        InterfaceC1987n interfaceC1987n;
        InterfaceC1987n[] interfaceC1987nArrMo967a = this.extractorsFactory.mo967a();
        int length = interfaceC1987nArrMo967a.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                interfaceC1987n = null;
                break;
            }
            interfaceC1987n = interfaceC1987nArrMo967a[i];
            try {
                if (interfaceC1987n.sniff(interfaceC1988o)) {
                    interfaceC1988o.mo3860g();
                    break;
                }
            } catch (EOFException unused) {
            } catch (Throwable th) {
                interfaceC1988o.mo3860g();
                throw th;
            }
            interfaceC1988o.mo3860g();
            i++;
        }
        if (interfaceC1987n != null) {
            return interfaceC1987n;
        }
        String str = "None of the available extractors (" + new C0917e(", ").m2085b(AbstractC1006u.m2206u(new C0413q(7), AbstractC0983m0.m2166k(interfaceC1987nArrMo967a))) + ") could read the stream.";
        InterfaceC1564h interfaceC1564h = this.currentDataSource;
        interfaceC1564h.getClass();
        Uri uri = interfaceC1564h.getUri();
        uri.getClass();
        throw new UnrecognizedInputFormatException(str, uri, C0981l1.f4211n);
    }

    private void skipOneSample() {
        MediaExtractorTrack mediaExtractorTrack = this.tracks.get(this.trackIndicesPerSampleInQueuedOrder.removeFirst().intValue());
        if (mediaExtractorTrack.isCompatibilityTrack) {
            return;
        }
        mediaExtractorTrack.discardFrontSample();
    }

    public boolean advance() {
        if (!advanceToSampleOrEndOfInput()) {
            return false;
        }
        skipOneSample();
        return advanceToSampleOrEndOfInput();
    }

    public Allocator getAllocator() {
        return this.allocator;
    }

    public int getSampleFlags() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        peekNextSelectedTrackSample(this.noDataBuffer, true);
        return (this.noDataBuffer.isEncrypted() ? 2 : 0) | (this.noDataBuffer.isKeyFrame() ? 1 : 0);
    }

    public long getSampleSize() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1L;
        }
        peekNextSelectedTrackSample(this.sampleHolderWithBufferReplacementDirect, false);
        ByteBuffer byteBuffer = this.sampleHolderWithBufferReplacementDirect.data;
        byteBuffer.getClass();
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    public long getSampleTime() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1L;
        }
        peekNextSelectedTrackSample(this.noDataBuffer, true);
        return this.noDataBuffer.timeUs;
    }

    public int getSampleTrackIndex() {
        if (advanceToSampleOrEndOfInput()) {
            return this.trackIndicesPerSampleInQueuedOrder.peekFirst().intValue();
        }
        return -1;
    }

    public int getTrackCount() {
        return this.tracks.size();
    }

    public MediaFormat getTrackFormat(int i) {
        return this.tracks.get(i).createDownstreamMediaFormat(this.formatHolder, this.noDataBuffer);
    }

    public int readSampleData(ByteBuffer byteBuffer, int i) {
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        byteBuffer.position(i);
        byteBuffer.limit(byteBuffer.capacity());
        C1872g c1872g = this.sampleHolderWithBufferReplacementDisabled;
        c1872g.data = byteBuffer;
        peekNextSelectedTrackSample(c1872g, false);
        byteBuffer.flip();
        byteBuffer.position(i);
        this.sampleHolderWithBufferReplacementDisabled.data = null;
        return byteBuffer.remaining();
    }

    public void release() {
        for (int i = 0; i < this.sampleQueues.size(); i++) {
            this.sampleQueues.valueAt(i).release();
        }
        this.sampleQueues.clear();
        InterfaceC1987n interfaceC1987n = this.currentExtractor;
        if (interfaceC1987n != null) {
            interfaceC1987n.release();
            this.currentExtractor = null;
        }
        this.currentExtractorInput = null;
        this.pendingSeek = null;
        AbstractC0715d.m1568p(this.currentDataSource);
        this.currentDataSource = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void seekTo(long j, int i) {
        C1966b0 c1966b0M2561c;
        C1970d0 c1970d0;
        if (this.seekMap == null) {
            return;
        }
        if (this.selectedTrackIndices.size() == 1) {
            InterfaceC1987n interfaceC1987n = this.currentExtractor;
            c1966b0M2561c = interfaceC1987n instanceof C1148m ? ((C1148m) interfaceC1987n).m2561c(this.tracks.get(this.selectedTrackIndices.iterator().next().intValue()).getIdOfBackingTrack(), j) : this.seekMap.getSeekPoints(j);
        }
        if (i == 0) {
            c1970d0 = c1966b0M2561c.f7290a;
        } else if (i == 1) {
            c1970d0 = c1966b0M2561c.f7291b;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            C1970d0 c1970d02 = c1966b0M2561c.f7291b;
            c1970d0 = c1966b0M2561c.f7290a;
            if (Math.abs(j - c1970d02.f7311a) < Math.abs(j - c1970d0.f7311a)) {
                c1970d0 = c1966b0M2561c.f7291b;
            }
        }
        this.trackIndicesPerSampleInQueuedOrder.clear();
        for (int i4 = 0; i4 < this.sampleQueues.size(); i4++) {
            this.sampleQueues.valueAt(i4).reset();
        }
        this.pendingSeek = c1970d0;
    }

    public void selectTrack(int i) {
        this.selectedTrackIndices.add(Integer.valueOf(i));
    }

    public void setDataSource(Uri uri, long j) throws C0247v0 {
        prepareDataSource(this.dataSourceFactory.mo55l(), buildDataSpec(uri, j));
    }

    public void unselectTrack(int i) {
        this.selectedTrackIndices.remove(Integer.valueOf(i));
    }

    public MediaExtractorCompat(InterfaceC1990q interfaceC1990q, InterfaceC1563g interfaceC1563g) {
        this.extractorsFactory = interfaceC1990q;
        this.dataSourceFactory = interfaceC1563g;
        this.positionHolder = new C1964a0();
        this.allocator = new DefaultAllocator(true, 65536);
        this.tracks = new ArrayList<>();
        this.sampleQueues = new SparseArray<>();
        this.trackIndicesPerSampleInQueuedOrder = new ArrayDeque<>();
        this.formatHolder = new FormatHolder();
        this.sampleHolderWithBufferReplacementDisabled = new C1872g(0);
        this.sampleHolderWithBufferReplacementDirect = new C1872g(2);
        this.noDataBuffer = C1872g.newNoDataInstance();
        this.selectedTrackIndices = new HashSet();
    }

    public void setDataSource(AssetFileDescriptor assetFileDescriptor) throws C0247v0 {
        if (assetFileDescriptor.getDeclaredLength() == -1) {
            setDataSource(assetFileDescriptor.getFileDescriptor());
        } else {
            setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor) throws C0247v0 {
        setDataSource(fileDescriptor, 0L, -1L);
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j8) throws C0247v0 {
        prepareDataSource(new C1575s(fileDescriptor, j, j8), buildDataSpec(Uri.EMPTY, 0L));
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        String scheme = uri.getScheme();
        String path = uri.getPath();
        if ((scheme == null || scheme.equals("file")) && path != null) {
            setDataSource(path);
            return;
        }
        try {
            assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
        } catch (FileNotFoundException | SecurityException unused) {
        }
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            try {
                setDataSource(assetFileDescriptorOpenAssetFileDescriptor);
                assetFileDescriptorOpenAssetFileDescriptor.close();
                return;
            } catch (Throwable th) {
                try {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            assetFileDescriptorOpenAssetFileDescriptor.close();
        }
        setDataSource(uri.toString(), map);
    }

    public void setDataSource(String str) throws C0247v0 {
        setDataSource(str, (Map<String, String>) null);
    }

    public void setDataSource(String str, Map<String, String> map) throws C0247v0 {
        this.httpRequestHeaders = map;
        prepareDataSource(this.dataSourceFactory.mo55l(), buildDataSpec(Uri.parse(str), 0L));
    }

    public void setDataSource(MediaDataSource mediaDataSource) throws C0247v0 {
        prepareDataSource(new C1581y(mediaDataSource), buildDataSpec(Uri.EMPTY, 0L));
    }
}
