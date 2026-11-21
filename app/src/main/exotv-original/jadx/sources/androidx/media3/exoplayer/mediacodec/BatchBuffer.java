package androidx.media3.exoplayer.mediacodec;

import java.nio.ByteBuffer;
import p063h1.AbstractC1101a;
import p106m1.C1872g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class BatchBuffer extends C1872g {
    public static final int DEFAULT_MAX_SAMPLE_COUNT = 32;
    static final int MAX_SIZE_BYTES = 3072000;
    private long lastSampleTimeUs;
    private int maxSampleCount;
    private int sampleCount;

    public BatchBuffer() {
        super(2);
        this.maxSampleCount = 32;
    }

    private boolean canAppendSampleBuffer(C1872g c1872g) {
        ByteBuffer byteBuffer;
        if (!hasSamples()) {
            return true;
        }
        if (this.sampleCount >= this.maxSampleCount) {
            return false;
        }
        ByteBuffer byteBuffer2 = c1872g.data;
        if (byteBuffer2 != null && (byteBuffer = this.data) != null) {
            if (byteBuffer2.remaining() + byteBuffer.position() > MAX_SIZE_BYTES) {
                return false;
            }
        }
        return true;
    }

    public boolean append(C1872g c1872g) {
        AbstractC1101a.m2353d(!c1872g.isEncrypted());
        AbstractC1101a.m2353d(!c1872g.hasSupplementalData());
        AbstractC1101a.m2353d(!c1872g.isEndOfStream());
        if (!canAppendSampleBuffer(c1872g)) {
            return false;
        }
        int i = this.sampleCount;
        this.sampleCount = i + 1;
        if (i == 0) {
            this.timeUs = c1872g.timeUs;
            if (c1872g.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer = c1872g.data;
        if (byteBuffer != null) {
            ensureSpaceForWrite(byteBuffer.remaining());
            this.data.put(byteBuffer);
        }
        this.lastSampleTimeUs = c1872g.timeUs;
        return true;
    }

    @Override // p106m1.C1872g, p106m1.AbstractC1866a
    public void clear() {
        super.clear();
        this.sampleCount = 0;
    }

    public long getFirstSampleTimeUs() {
        return this.timeUs;
    }

    public long getLastSampleTimeUs() {
        return this.lastSampleTimeUs;
    }

    public int getSampleCount() {
        return this.sampleCount;
    }

    public boolean hasSamples() {
        return this.sampleCount > 0;
    }

    public void setMaxSampleCount(int i) {
        AbstractC1101a.m2353d(i > 0);
        this.maxSampleCount = i;
    }
}
