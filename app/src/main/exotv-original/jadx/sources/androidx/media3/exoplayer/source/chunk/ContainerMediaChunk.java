package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import com.bumptech.glide.AbstractC0715d;
import p063h1.C1132w;
import p089k1.C1555b0;
import p089k1.C1568l;
import p089k1.InterfaceC1564h;
import p115n1.C1983k;
import p115n1.InterfaceC1980i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class ContainerMediaChunk extends BaseMediaChunk {
    private final int chunkCount;
    private final ChunkExtractor chunkExtractor;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final long sampleOffsetUs;

    public ContainerMediaChunk(InterfaceC1564h interfaceC1564h, C1568l c1568l, C0249w c0249w, int i, Object obj, long j, long j8, long j9, long j10, long j11, int i4, long j12, ChunkExtractor chunkExtractor) {
        super(interfaceC1564h, c1568l, c0249w, i, obj, j, j8, j9, j10, j11);
        this.chunkCount = i4;
        this.sampleOffsetUs = j12;
        this.chunkExtractor = chunkExtractor;
    }

    private void maybeWriteEmptySamples(BaseMediaChunkOutput baseMediaChunkOutput) {
        if (AbstractC0244u0.m683l(this.trackFormat.f1521m)) {
            C0249w c0249w = this.trackFormat;
            int i = c0249w.f1505J;
            int i4 = c0249w.f1506K;
            if ((i <= 1 && i4 <= 1) || i == -1 || i4 == -1) {
                return;
            }
            InterfaceC1980i0 interfaceC1980i0Track = baseMediaChunkOutput.track(0, 4);
            C0249w c0249w2 = this.trackFormat;
            int i8 = c0249w2.f1505J * c0249w2.f1506K;
            long j = (this.endTimeUs - this.startTimeUs) / i8;
            for (int i9 = 1; i9 < i8; i9++) {
                interfaceC1980i0Track.sampleData(new C1132w(), 0);
                interfaceC1980i0Track.sampleMetadata(i9 * j, 0, 0, 0, null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public long getNextChunkIndex() {
        return this.chunkIndex + this.chunkCount;
    }

    public ChunkExtractor.TrackOutputProvider getTrackOutputProvider(BaseMediaChunkOutput baseMediaChunkOutput) {
        return baseMediaChunkOutput;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() {
        BaseMediaChunkOutput output = getOutput();
        if (this.nextLoadPosition == 0) {
            output.setSampleOffsetUs(this.sampleOffsetUs);
            ChunkExtractor chunkExtractor = this.chunkExtractor;
            ChunkExtractor.TrackOutputProvider trackOutputProvider = getTrackOutputProvider(output);
            long j = this.clippedStartTimeUs;
            long j8 = j == -9223372036854775807L ? -9223372036854775807L : j - this.sampleOffsetUs;
            long j9 = this.clippedEndTimeUs;
            chunkExtractor.init(trackOutputProvider, j8, j9 != -9223372036854775807L ? j9 - this.sampleOffsetUs : -9223372036854775807L);
        }
        try {
            C1568l c1568lM3238b = this.dataSpec.m3238b(this.nextLoadPosition);
            C1555b0 c1555b0 = this.dataSource;
            C1983k c1983k = new C1983k(c1555b0, c1568lM3238b.f6000e, c1555b0.open(c1568lM3238b));
            do {
                try {
                    if (this.loadCanceled) {
                        break;
                    }
                } finally {
                    this.nextLoadPosition = c1983k.f7358m - this.dataSpec.f6000e;
                }
            } while (this.chunkExtractor.read(c1983k));
            maybeWriteEmptySamples(output);
            this.nextLoadPosition = c1983k.f7358m - this.dataSpec.f6000e;
            AbstractC0715d.m1568p(this.dataSource);
            this.loadCompleted = !this.loadCanceled;
        } catch (Throwable th) {
            AbstractC0715d.m1568p(this.dataSource);
            throw th;
        }
    }
}
