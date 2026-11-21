package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.C0249w;
import p063h1.AbstractC1101a;
import p089k1.C1568l;
import p089k1.InterfaceC1564h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class BaseMediaChunk extends MediaChunk {
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;
    private int[] firstSampleIndices;
    private BaseMediaChunkOutput output;

    public BaseMediaChunk(InterfaceC1564h interfaceC1564h, C1568l c1568l, C0249w c0249w, int i, Object obj, long j, long j8, long j9, long j10, long j11) {
        super(interfaceC1564h, c1568l, c0249w, i, obj, j, j8, j11);
        this.clippedStartTimeUs = j9;
        this.clippedEndTimeUs = j10;
    }

    public final int getFirstSampleIndex(int i) {
        int[] iArr = this.firstSampleIndices;
        AbstractC1101a.m2360k(iArr);
        return iArr[i];
    }

    public final BaseMediaChunkOutput getOutput() {
        BaseMediaChunkOutput baseMediaChunkOutput = this.output;
        AbstractC1101a.m2360k(baseMediaChunkOutput);
        return baseMediaChunkOutput;
    }

    public void init(BaseMediaChunkOutput baseMediaChunkOutput) {
        this.output = baseMediaChunkOutput;
        this.firstSampleIndices = baseMediaChunkOutput.getWriteIndices();
    }
}
