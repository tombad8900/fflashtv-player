package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AbstractC0178f;
import androidx.media3.common.audio.C0174b;
import androidx.media3.common.audio.C0175c;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class ChannelMappingAudioProcessor extends AbstractC0178f {
    private int[] outputChannels;
    private int[] pendingOutputChannels;

    public long getDurationAfterProcessorApplied(long j) {
        return j;
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public C0174b onConfigure(C0174b c0174b) throws C0175c {
        int[] iArr = this.pendingOutputChannels;
        if (iArr == null) {
            return C0174b.f980e;
        }
        int i = c0174b.f983c;
        int i4 = c0174b.f982b;
        if (i != 2) {
            throw new C0175c(c0174b);
        }
        boolean z7 = i4 != iArr.length;
        int i8 = 0;
        while (i8 < iArr.length) {
            int i9 = iArr[i8];
            if (i9 >= i4) {
                throw new C0175c(c0174b);
            }
            z7 |= i9 != i8;
            i8++;
        }
        return z7 ? new C0174b(c0174b.f981a, iArr.length, 2) : C0174b.f980e;
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public void onFlush() {
        this.outputChannels = this.pendingOutputChannels;
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public void onReset() {
        this.outputChannels = null;
        this.pendingOutputChannels = null;
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = this.outputChannels;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(((iLimit - iPosition) / this.inputAudioFormat.f984d) * this.outputAudioFormat.f984d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferReplaceOutputBuffer.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.inputAudioFormat.f984d;
        }
        byteBuffer.position(iLimit);
        byteBufferReplaceOutputBuffer.flip();
    }

    public void setChannelMap(int[] iArr) {
        this.pendingOutputChannels = iArr;
    }
}
