package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.C0249w;
import com.bumptech.glide.AbstractC0715d;
import java.util.Arrays;
import p063h1.AbstractC1118i0;
import p089k1.C1568l;
import p089k1.InterfaceC1564h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class DataChunk extends Chunk {
    private static final int READ_GRANULARITY = 16384;
    private byte[] data;
    private volatile boolean loadCanceled;

    public DataChunk(InterfaceC1564h interfaceC1564h, C1568l c1568l, int i, C0249w c0249w, int i4, Object obj, byte[] bArr) {
        super(interfaceC1564h, c1568l, i, c0249w, i4, obj, -9223372036854775807L, -9223372036854775807L);
        this.data = bArr == null ? AbstractC1118i0.f4755f : bArr;
    }

    private void maybeExpandData(int i) {
        byte[] bArr = this.data;
        if (bArr.length < i + 16384) {
            this.data = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    public abstract void consume(byte[] bArr, int i);

    public byte[] getDataHolder() {
        return this.data;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() {
        try {
            this.dataSource.open(this.dataSpec);
            int i = 0;
            int i4 = 0;
            while (i != -1 && !this.loadCanceled) {
                maybeExpandData(i4);
                i = this.dataSource.read(this.data, i4, 16384);
                if (i != -1) {
                    i4 += i;
                }
            }
            if (!this.loadCanceled) {
                consume(this.data, i4);
            }
            AbstractC0715d.m1568p(this.dataSource);
        } catch (Throwable th) {
            AbstractC0715d.m1568p(this.dataSource);
            throw th;
        }
    }
}
