package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.C0249w;
import p089k1.C1568l;
import p089k1.InterfaceC1564h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class MediaChunk extends Chunk {
    public final long chunkIndex;

    public MediaChunk(InterfaceC1564h interfaceC1564h, C1568l c1568l, C0249w c0249w, int i, Object obj, long j, long j8, long j9) {
        super(interfaceC1564h, c1568l, 1, c0249w, i, obj, j, j8);
        c0249w.getClass();
        this.chunkIndex = j9;
    }

    public long getNextChunkIndex() {
        long j = this.chunkIndex;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();
}
