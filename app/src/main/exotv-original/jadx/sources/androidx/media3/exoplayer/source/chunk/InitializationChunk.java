package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import com.bumptech.glide.AbstractC0715d;
import p089k1.C1555b0;
import p089k1.C1568l;
import p089k1.InterfaceC1564h;
import p115n1.C1981j;
import p115n1.C1983k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class InitializationChunk extends Chunk {
    private final ChunkExtractor chunkExtractor;
    private C1981j chunkIndex;
    private volatile boolean loadCanceled;
    private long nextLoadPosition;
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;

    public InitializationChunk(InterfaceC1564h interfaceC1564h, C1568l c1568l, C0249w c0249w, int i, Object obj, ChunkExtractor chunkExtractor) {
        super(interfaceC1564h, c1568l, 2, c0249w, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.chunkExtractor = chunkExtractor;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public C1981j getChunkIndex() {
        return this.chunkIndex;
    }

    public void init(ChunkExtractor.TrackOutputProvider trackOutputProvider) {
        this.trackOutputProvider = trackOutputProvider;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() {
        if (this.nextLoadPosition == 0) {
            this.chunkExtractor.init(this.trackOutputProvider, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C1568l c1568lM3238b = this.dataSpec.m3238b(this.nextLoadPosition);
            C1555b0 c1555b0 = this.dataSource;
            C1983k c1983k = new C1983k(c1555b0, c1568lM3238b.f6000e, c1555b0.open(c1568lM3238b));
            while (!this.loadCanceled && this.chunkExtractor.read(c1983k)) {
                try {
                } finally {
                    this.nextLoadPosition = c1983k.f7358m - this.dataSpec.f6000e;
                    this.chunkIndex = this.chunkExtractor.getChunkIndex();
                }
            }
        } finally {
            AbstractC0715d.m1568p(this.dataSource);
        }
    }
}
