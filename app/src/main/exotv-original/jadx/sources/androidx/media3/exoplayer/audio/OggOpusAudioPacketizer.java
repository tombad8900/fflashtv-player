package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.InterfaceC0176d;
import com.bumptech.glide.AbstractC0714c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import p063h1.AbstractC1118i0;
import p106m1.C1872g;
import p115n1.AbstractC1965b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class OggOpusAudioPacketizer {
    private static final int CHECKSUM_INDEX = 22;
    private static final int FIRST_AUDIO_SAMPLE_PAGE_SEQUENCE_NUMBER = 2;
    private static final int OGG_PACKET_HEADER_LENGTH = 28;
    private static final int SERIAL_NUMBER = 0;
    private static final byte[] OGG_DEFAULT_ID_HEADER_PAGE = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] OGG_DEFAULT_COMMENT_HEADER_PAGE = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer outputBuffer = InterfaceC0176d.f985a;
    private int granulePosition = 0;
    private int pageSequenceNumber = 2;

    private ByteBuffer packetizeInternal(ByteBuffer byteBuffer, byte[] bArr) {
        int i;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i4 = iLimit - iPosition;
        int i8 = (i4 + 255) / 255;
        int length = i8 + 27 + i4;
        if (this.pageSequenceNumber == 2) {
            int length2 = bArr != null ? bArr.length + 28 : OGG_DEFAULT_ID_HEADER_PAGE.length;
            length += OGG_DEFAULT_COMMENT_HEADER_PAGE.length + length2;
            i = length2;
        } else {
            i = 0;
        }
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(length);
        if (this.pageSequenceNumber == 2) {
            if (bArr != null) {
                writeOggIdHeaderPage(byteBufferReplaceOutputBuffer, bArr);
            } else {
                byteBufferReplaceOutputBuffer.put(OGG_DEFAULT_ID_HEADER_PAGE);
            }
            byteBufferReplaceOutputBuffer.put(OGG_DEFAULT_COMMENT_HEADER_PAGE);
        }
        int iM3835k = this.granulePosition + ((int) ((AbstractC1965b.m3835k(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000));
        this.granulePosition = iM3835k;
        writeOggPacketHeader(byteBufferReplaceOutputBuffer, iM3835k, this.pageSequenceNumber, i8, false);
        for (int i9 = 0; i9 < i8; i9++) {
            if (i4 >= 255) {
                byteBufferReplaceOutputBuffer.put((byte) -1);
                i4 -= 255;
            } else {
                byteBufferReplaceOutputBuffer.put((byte) i4);
                i4 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
        if (this.pageSequenceNumber == 2) {
            byte[] bArrArray = byteBufferReplaceOutputBuffer.array();
            int iArrayOffset = byteBufferReplaceOutputBuffer.arrayOffset() + i;
            byte[] bArr2 = OGG_DEFAULT_COMMENT_HEADER_PAGE;
            byteBufferReplaceOutputBuffer.putInt(i + bArr2.length + 22, AbstractC1118i0.m2456o(iArrayOffset + bArr2.length, byteBufferReplaceOutputBuffer.limit() - byteBufferReplaceOutputBuffer.position(), 0, bArrArray));
        } else {
            byteBufferReplaceOutputBuffer.putInt(22, AbstractC1118i0.m2456o(byteBufferReplaceOutputBuffer.arrayOffset(), byteBufferReplaceOutputBuffer.limit() - byteBufferReplaceOutputBuffer.position(), 0, byteBufferReplaceOutputBuffer.array()));
        }
        this.pageSequenceNumber++;
        return byteBufferReplaceOutputBuffer;
    }

    private ByteBuffer replaceOutputBuffer(int i) {
        if (this.outputBuffer.capacity() < i) {
            this.outputBuffer = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.outputBuffer.clear();
        }
        return this.outputBuffer;
    }

    private void writeOggIdHeaderPage(ByteBuffer byteBuffer, byte[] bArr) {
        writeOggPacketHeader(byteBuffer, 0L, 0, 1, true);
        long length = bArr.length;
        AbstractC0714c.m1525k((length >> 8) == 0, "out of range: %s", length);
        byteBuffer.put((byte) length);
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, AbstractC1118i0.m2456o(byteBuffer.arrayOffset(), bArr.length + 28, 0, byteBuffer.array()));
        byteBuffer.position(bArr.length + 28);
    }

    private void writeOggPacketHeader(ByteBuffer byteBuffer, long j, int i, int i4, boolean z7) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z7 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j8 = i4;
        AbstractC0714c.m1525k((j8 >> 8) == 0, "out of range: %s", j8);
        byteBuffer.put((byte) j8);
    }

    public void packetize(C1872g c1872g, List<byte[]> list) {
        c1872g.data.getClass();
        if (c1872g.data.limit() - c1872g.data.position() == 0) {
            return;
        }
        this.outputBuffer = packetizeInternal(c1872g.data, (this.pageSequenceNumber == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        c1872g.clear();
        c1872g.ensureSpaceForWrite(this.outputBuffer.remaining());
        c1872g.data.put(this.outputBuffer);
        c1872g.flip();
    }

    public void reset() {
        this.outputBuffer = InterfaceC0176d.f985a;
        this.granulePosition = 0;
        this.pageSequenceNumber = 2;
    }
}
