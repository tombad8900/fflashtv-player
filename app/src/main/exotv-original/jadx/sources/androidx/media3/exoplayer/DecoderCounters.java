package androidx.media3.exoplayer;

import java.util.Locale;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DecoderCounters {
    public int decoderInitCount;
    public int decoderReleaseCount;
    public int droppedBufferCount;
    public int droppedInputBufferCount;
    public int droppedToKeyframeCount;
    public int maxConsecutiveDroppedBufferCount;
    public int queuedInputBufferCount;
    public int renderedOutputBufferCount;
    public int skippedInputBufferCount;
    public int skippedOutputBufferCount;
    public long totalVideoFrameProcessingOffsetUs;
    public int videoFrameProcessingOffsetCount;

    private void addVideoFrameProcessingOffsets(long j, int i) {
        this.totalVideoFrameProcessingOffsetUs += j;
        this.videoFrameProcessingOffsetCount += i;
    }

    public void addVideoFrameProcessingOffset(long j) {
        addVideoFrameProcessingOffsets(j, 1);
    }

    public synchronized void ensureUpdated() {
    }

    public void merge(DecoderCounters decoderCounters) {
        this.decoderInitCount += decoderCounters.decoderInitCount;
        this.decoderReleaseCount += decoderCounters.decoderReleaseCount;
        this.queuedInputBufferCount += decoderCounters.queuedInputBufferCount;
        this.skippedInputBufferCount += decoderCounters.skippedInputBufferCount;
        this.renderedOutputBufferCount += decoderCounters.renderedOutputBufferCount;
        this.skippedOutputBufferCount += decoderCounters.skippedOutputBufferCount;
        this.droppedBufferCount += decoderCounters.droppedBufferCount;
        this.droppedInputBufferCount += decoderCounters.droppedInputBufferCount;
        this.maxConsecutiveDroppedBufferCount = Math.max(this.maxConsecutiveDroppedBufferCount, decoderCounters.maxConsecutiveDroppedBufferCount);
        this.droppedToKeyframeCount += decoderCounters.droppedToKeyframeCount;
        addVideoFrameProcessingOffsets(decoderCounters.totalVideoFrameProcessingOffsetUs, decoderCounters.videoFrameProcessingOffsetCount);
    }

    public String toString() {
        int i = this.decoderInitCount;
        int i4 = this.decoderReleaseCount;
        int i8 = this.queuedInputBufferCount;
        int i9 = this.skippedInputBufferCount;
        int i10 = this.renderedOutputBufferCount;
        int i11 = this.skippedOutputBufferCount;
        int i12 = this.droppedBufferCount;
        int i13 = this.droppedInputBufferCount;
        int i14 = this.maxConsecutiveDroppedBufferCount;
        int i15 = this.droppedToKeyframeCount;
        long j = this.totalVideoFrameProcessingOffsetUs;
        int i16 = this.videoFrameProcessingOffsetCount;
        int i17 = AbstractC1118i0.f4750a;
        Locale locale = Locale.US;
        StringBuilder sbM19o = AbstractC0008a1.m19o(i, i4, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        sbM19o.append(i8);
        sbM19o.append("\n skippedInputBuffers=");
        sbM19o.append(i9);
        sbM19o.append("\n renderedOutputBuffers=");
        sbM19o.append(i10);
        sbM19o.append("\n skippedOutputBuffers=");
        sbM19o.append(i11);
        sbM19o.append("\n droppedBuffers=");
        sbM19o.append(i12);
        sbM19o.append("\n droppedInputBuffers=");
        sbM19o.append(i13);
        sbM19o.append("\n maxConsecutiveDroppedBuffers=");
        sbM19o.append(i14);
        sbM19o.append("\n droppedToKeyframeEvents=");
        sbM19o.append(i15);
        sbM19o.append("\n totalVideoFrameProcessingOffsetUs=");
        sbM19o.append(j);
        sbM19o.append("\n videoFrameProcessingOffsetCount=");
        sbM19o.append(i16);
        sbM19o.append("\n}");
        return sbM19o.toString();
    }
}
