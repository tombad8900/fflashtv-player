package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AbstractC0178f;
import androidx.media3.common.audio.C0174b;
import androidx.media3.common.audio.C0175c;
import java.nio.ByteBuffer;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class TrimmingAudioProcessor extends AbstractC0178f {
    private static final int OUTPUT_ENCODING = 2;
    private byte[] endBuffer = AbstractC1118i0.f4755f;
    private int endBufferSize;
    private int pendingTrimStartBytes;
    private boolean reconfigurationPending;
    private int trimEndFrames;
    private int trimStartFrames;
    private long trimmedFrameCount;

    public long getDurationAfterProcessorApplied(long j) {
        return j - AbstractC1118i0.m2434Y(this.inputAudioFormat.f981a, this.trimEndFrames + this.trimStartFrames);
    }

    @Override // androidx.media3.common.audio.AbstractC0178f, androidx.media3.common.audio.InterfaceC0176d
    public ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.endBufferSize) > 0) {
            replaceOutputBuffer(i).put(this.endBuffer, 0, this.endBufferSize).flip();
            this.endBufferSize = 0;
        }
        return super.getOutput();
    }

    public long getTrimmedFrameCount() {
        return this.trimmedFrameCount;
    }

    @Override // androidx.media3.common.audio.AbstractC0178f, androidx.media3.common.audio.InterfaceC0176d
    public boolean isEnded() {
        return super.isEnded() && this.endBufferSize == 0;
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public C0174b onConfigure(C0174b c0174b) throws C0175c {
        if (c0174b.f983c != 2) {
            throw new C0175c(c0174b);
        }
        this.reconfigurationPending = true;
        return (this.trimStartFrames == 0 && this.trimEndFrames == 0) ? C0174b.f980e : c0174b;
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public void onFlush() {
        if (this.reconfigurationPending) {
            this.reconfigurationPending = false;
            int i = this.trimEndFrames;
            int i4 = this.inputAudioFormat.f984d;
            this.endBuffer = new byte[i * i4];
            this.pendingTrimStartBytes = this.trimStartFrames * i4;
        }
        this.endBufferSize = 0;
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public void onQueueEndOfStream() {
        if (this.reconfigurationPending) {
            if (this.endBufferSize > 0) {
                this.trimmedFrameCount += r0 / this.inputAudioFormat.f984d;
            }
            this.endBufferSize = 0;
        }
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public void onReset() {
        this.endBuffer = AbstractC1118i0.f4755f;
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.pendingTrimStartBytes);
        this.trimmedFrameCount += iMin / this.inputAudioFormat.f984d;
        this.pendingTrimStartBytes -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.pendingTrimStartBytes > 0) {
            return;
        }
        int i4 = i - iMin;
        int length = (this.endBufferSize + i4) - this.endBuffer.length;
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(length);
        int iM2451j = AbstractC1118i0.m2451j(length, 0, this.endBufferSize);
        byteBufferReplaceOutputBuffer.put(this.endBuffer, 0, iM2451j);
        int iM2451j2 = AbstractC1118i0.m2451j(length - iM2451j, 0, i4);
        byteBuffer.limit(byteBuffer.position() + iM2451j2);
        byteBufferReplaceOutputBuffer.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i8 = i4 - iM2451j2;
        int i9 = this.endBufferSize - iM2451j;
        this.endBufferSize = i9;
        byte[] bArr = this.endBuffer;
        System.arraycopy(bArr, iM2451j, bArr, 0, i9);
        byteBuffer.get(this.endBuffer, this.endBufferSize, i8);
        this.endBufferSize += i8;
        byteBufferReplaceOutputBuffer.flip();
    }

    public void resetTrimmedFrameCount() {
        this.trimmedFrameCount = 0L;
    }

    public void setTrimFrameCount(int i, int i4) {
        this.trimStartFrames = i;
        this.trimEndFrames = i4;
    }
}
