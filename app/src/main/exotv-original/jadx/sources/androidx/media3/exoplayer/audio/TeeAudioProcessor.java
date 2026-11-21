package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AbstractC0178f;
import androidx.media3.common.audio.C0174b;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class TeeAudioProcessor extends AbstractC0178f {
    private final AudioBufferSink audioBufferSink;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface AudioBufferSink {
        void flush(int i, int i4, int i8);

        void handleBuffer(ByteBuffer byteBuffer);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class WavFileAudioBufferSink implements AudioBufferSink {
        private static final int FILE_SIZE_MINUS_44_OFFSET = 40;
        private static final int FILE_SIZE_MINUS_8_OFFSET = 4;
        private static final int HEADER_LENGTH = 44;
        private static final String TAG = "WaveFileAudioBufferSink";
        private int bytesWritten;
        private int channelCount;
        private int counter;
        private int encoding;
        private final String outputFileNamePrefix;
        private RandomAccessFile randomAccessFile;
        private int sampleRateHz;
        private final byte[] scratchBuffer;
        private final ByteBuffer scratchByteBuffer;

        public WavFileAudioBufferSink(String str) {
            this.outputFileNamePrefix = str;
            byte[] bArr = new byte[1024];
            this.scratchBuffer = bArr;
            this.scratchByteBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        }

        private String getNextOutputFileName() {
            String str = this.outputFileNamePrefix;
            int i = this.counter;
            this.counter = i + 1;
            Object[] objArr = {str, Integer.valueOf(i)};
            int i4 = AbstractC1118i0.f4750a;
            return String.format(Locale.US, "%s-%04d.wav", objArr);
        }

        private void maybePrepareFile() throws IOException {
            if (this.randomAccessFile != null) {
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(getNextOutputFileName(), "rw");
            writeFileHeader(randomAccessFile);
            this.randomAccessFile = randomAccessFile;
            this.bytesWritten = HEADER_LENGTH;
        }

        private void reset() throws IOException {
            RandomAccessFile randomAccessFile = this.randomAccessFile;
            if (randomAccessFile == null) {
                return;
            }
            try {
                this.scratchByteBuffer.clear();
                this.scratchByteBuffer.putInt(this.bytesWritten - 8);
                randomAccessFile.seek(4L);
                randomAccessFile.write(this.scratchBuffer, 0, 4);
                this.scratchByteBuffer.clear();
                this.scratchByteBuffer.putInt(this.bytesWritten - 44);
                randomAccessFile.seek(40L);
                randomAccessFile.write(this.scratchBuffer, 0, 4);
            } catch (IOException e) {
                AbstractC1101a.m2349G(TAG, "Error updating file size", e);
            }
            try {
                randomAccessFile.close();
            } finally {
                this.randomAccessFile = null;
            }
        }

        private void writeBuffer(ByteBuffer byteBuffer) throws IOException {
            RandomAccessFile randomAccessFile = this.randomAccessFile;
            randomAccessFile.getClass();
            while (byteBuffer.hasRemaining()) {
                int iMin = Math.min(byteBuffer.remaining(), this.scratchBuffer.length);
                byteBuffer.get(this.scratchBuffer, 0, iMin);
                randomAccessFile.write(this.scratchBuffer, 0, iMin);
                this.bytesWritten += iMin;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void writeFileHeader(RandomAccessFile randomAccessFile) throws IOException {
            int i;
            randomAccessFile.writeInt(1380533830);
            randomAccessFile.writeInt(-1);
            randomAccessFile.writeInt(1463899717);
            randomAccessFile.writeInt(1718449184);
            this.scratchByteBuffer.clear();
            this.scratchByteBuffer.putInt(16);
            ByteBuffer byteBuffer = this.scratchByteBuffer;
            int i4 = this.encoding;
            if (i4 != 2) {
                i = 3;
                if (i4 == 3) {
                    i = 1;
                } else if (i4 != 4) {
                    if (i4 != 21 && i4 != 22) {
                        throw new IllegalArgumentException();
                    }
                    i = 1;
                }
            }
            byteBuffer.putShort((short) i);
            this.scratchByteBuffer.putShort((short) this.channelCount);
            this.scratchByteBuffer.putInt(this.sampleRateHz);
            int iM2414E = AbstractC1118i0.m2414E(this.encoding, this.channelCount);
            this.scratchByteBuffer.putInt(this.sampleRateHz * iM2414E);
            this.scratchByteBuffer.putShort((short) iM2414E);
            this.scratchByteBuffer.putShort((short) ((iM2414E * 8) / this.channelCount));
            randomAccessFile.write(this.scratchBuffer, 0, this.scratchByteBuffer.position());
            randomAccessFile.writeInt(1684108385);
            randomAccessFile.writeInt(-1);
        }

        @Override // androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink
        public void flush(int i, int i4, int i8) {
            try {
                reset();
            } catch (IOException e) {
                AbstractC1101a.m2365p(TAG, "Error resetting", e);
            }
            this.sampleRateHz = i;
            this.channelCount = i4;
            this.encoding = i8;
        }

        @Override // androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink
        public void handleBuffer(ByteBuffer byteBuffer) {
            try {
                maybePrepareFile();
                writeBuffer(byteBuffer);
            } catch (IOException e) {
                AbstractC1101a.m2365p(TAG, "Error writing data", e);
            }
        }
    }

    public TeeAudioProcessor(AudioBufferSink audioBufferSink) {
        audioBufferSink.getClass();
        this.audioBufferSink = audioBufferSink;
    }

    private void flushSinkIfActive() {
        if (isActive()) {
            AudioBufferSink audioBufferSink = this.audioBufferSink;
            C0174b c0174b = this.inputAudioFormat;
            audioBufferSink.flush(c0174b.f981a, c0174b.f982b, c0174b.f983c);
        }
    }

    public long getDurationAfterProcessorApplied(long j) {
        return j;
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public C0174b onConfigure(C0174b c0174b) {
        return c0174b;
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public void onFlush() {
        flushSinkIfActive();
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public void onQueueEndOfStream() {
        flushSinkIfActive();
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public void onReset() {
        flushSinkIfActive();
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public void queueInput(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        AudioBufferSink audioBufferSink = this.audioBufferSink;
        int i = AbstractC1118i0.f4750a;
        audioBufferSink.handleBuffer(byteBuffer.asReadOnlyBuffer().order(byteBuffer.order()));
        replaceOutputBuffer(iRemaining).put(byteBuffer).flip();
    }
}
