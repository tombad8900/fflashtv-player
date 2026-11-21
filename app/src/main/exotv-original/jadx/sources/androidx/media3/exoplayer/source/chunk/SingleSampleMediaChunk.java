package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import com.bumptech.glide.AbstractC0715d;
import p089k1.C1568l;
import p089k1.InterfaceC1564h;
import p115n1.C1983k;
import p115n1.InterfaceC1980i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@Deprecated
/* loaded from: classes.dex */
public final class SingleSampleMediaChunk extends BaseMediaChunk {
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final C0249w sampleFormat;
    private final int trackType;

    public SingleSampleMediaChunk(InterfaceC1564h interfaceC1564h, C1568l c1568l, C0249w c0249w, int i, Object obj, long j, long j8, long j9, int i4, C0249w c0249w2) {
        super(interfaceC1564h, c1568l, c0249w, i, obj, j, j8, -9223372036854775807L, -9223372036854775807L, j9);
        this.trackType = i4;
        this.sampleFormat = c0249w2;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() {
        BaseMediaChunkOutput output = getOutput();
        output.setSampleOffsetUs(0L);
        InterfaceC1980i0 interfaceC1980i0Track = output.track(0, this.trackType);
        interfaceC1980i0Track.format(this.sampleFormat);
        try {
            long jOpen = this.dataSource.open(this.dataSpec.m3238b(this.nextLoadPosition));
            if (jOpen != -1) {
                jOpen += this.nextLoadPosition;
            }
            C1983k c1983k = new C1983k(this.dataSource, this.nextLoadPosition, jOpen);
            for (int iSampleData = 0; iSampleData != -1; iSampleData = interfaceC1980i0Track.sampleData((InterfaceC0219m) c1983k, Integer.MAX_VALUE, true)) {
                this.nextLoadPosition += iSampleData;
            }
            interfaceC1980i0Track.sampleMetadata(this.startTimeUs, 1, (int) this.nextLoadPosition, 0, null);
            AbstractC0715d.m1568p(this.dataSource);
            this.loadCompleted = true;
        } catch (Throwable th) {
            AbstractC0715d.m1568p(this.dataSource);
            throw th;
        }
    }
}
