package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AbstractC0178f;
import androidx.media3.common.audio.C0174b;
import androidx.media3.common.audio.C0175c;
import java.nio.ByteBuffer;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class SilenceSkippingAudioProcessor extends AbstractC0178f {
    private static final int AVOID_TRUNCATION_FACTOR = 1000;
    public static final long DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US = 2000000;
    public static final long DEFAULT_MINIMUM_SILENCE_DURATION_US = 100000;
    public static final int DEFAULT_MIN_VOLUME_TO_KEEP_PERCENTAGE = 10;

    @Deprecated
    public static final long DEFAULT_PADDING_SILENCE_US = 20000;
    public static final float DEFAULT_SILENCE_RETENTION_RATIO = 0.2f;
    public static final short DEFAULT_SILENCE_THRESHOLD_LEVEL = 1024;
    private static final int DO_NOT_CHANGE_VOLUME = 3;
    private static final int FADE_IN = 2;
    private static final int FADE_OUT = 0;
    private static final int MUTE = 1;
    private static final int STATE_NOISY = 0;
    private static final int STATE_SHORTENING_SILENCE = 1;
    private int bytesPerFrame;
    private byte[] contiguousOutputBuffer;
    private boolean enabled;
    private final long maxSilenceToKeepDurationUs;
    private byte[] maybeSilenceBuffer;
    private int maybeSilenceBufferContentsSize;
    private int maybeSilenceBufferStartIndex;
    private final int minVolumeToKeepPercentageWhenMuting;
    private final long minimumSilenceDurationUs;
    private int outputSilenceFramesSinceNoise;
    private final float silenceRetentionRatio;
    private final short silenceThresholdLevel;
    private long skippedFrames;
    private int state;

    public SilenceSkippingAudioProcessor() {
        this(DEFAULT_MINIMUM_SILENCE_DURATION_US, 0.2f, DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US, 10, DEFAULT_SILENCE_THRESHOLD_LEVEL);
    }

    private int alignToBytePerFrameBoundary(int i) {
        int i4 = this.bytesPerFrame;
        return (i / i4) * i4;
    }

    private int calculateFadeInPercentage(int i, int i4) {
        int i8 = this.minVolumeToKeepPercentageWhenMuting;
        return ((((i * 1000) * (100 - i8)) / i4) / 1000) + i8;
    }

    private int calculateFadeOutPercentage(int i, int i4) {
        return ((((i * 1000) / i4) * (this.minVolumeToKeepPercentageWhenMuting - 100)) / 1000) + 100;
    }

    private int calculateShortenedSilenceLength(int i) {
        int iDurationUsToFrames = ((durationUsToFrames(this.maxSilenceToKeepDurationUs) - this.outputSilenceFramesSinceNoise) * this.bytesPerFrame) - (this.maybeSilenceBuffer.length / 2);
        AbstractC1101a.m2359j(iDurationUsToFrames >= 0);
        return alignToBytePerFrameBoundary(Math.min((i * this.silenceRetentionRatio) + 0.5f, iDurationUsToFrames));
    }

    private int durationUsToFrames(long j) {
        return (int) ((j * this.inputAudioFormat.f981a) / 1000000);
    }

    private int findNoiseLimit(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (isNoise(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i = this.bytesPerFrame;
                return ((iLimit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    private int findNoisePosition(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (isNoise(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i = this.bytesPerFrame;
                return (iPosition / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    private boolean isNoise(byte b7, byte b8) {
        return Math.abs(twoByteSampleToInt(b7, b8)) > this.silenceThresholdLevel;
    }

    private void modifyVolume(byte[] bArr, int i, int i4) {
        if (i4 == 3) {
            return;
        }
        for (int i8 = 0; i8 < i; i8 += 2) {
            sampleIntToTwoBigEndianBytes(bArr, i8, (twoByteSampleToInt(bArr[i8 + 1], bArr[i8]) * (i4 == 0 ? calculateFadeOutPercentage(i8, i - 1) : i4 == 2 ? calculateFadeInPercentage(i8, i - 1) : this.minVolumeToKeepPercentageWhenMuting)) / 100);
        }
    }

    private void output(ByteBuffer byteBuffer) {
        replaceOutputBuffer(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void outputRange(byte[] bArr, int i, int i4) {
        AbstractC1101a.m2352c("byteOutput size is not aligned to frame size " + i, i % this.bytesPerFrame == 0);
        modifyVolume(bArr, i, i4);
        replaceOutputBuffer(i).put(bArr, 0, i).flip();
    }

    private void outputShortenedSilenceBuffer(boolean z7) {
        int length;
        int iCalculateShortenedSilenceLength;
        int i = this.maybeSilenceBufferContentsSize;
        byte[] bArr = this.maybeSilenceBuffer;
        if (i == bArr.length || z7) {
            if (this.outputSilenceFramesSinceNoise == 0) {
                if (z7) {
                    outputSilence(i, 3);
                    length = i;
                } else {
                    AbstractC1101a.m2359j(i >= bArr.length / 2);
                    length = this.maybeSilenceBuffer.length / 2;
                    outputSilence(length, 0);
                }
                iCalculateShortenedSilenceLength = length;
            } else if (z7) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iCalculateShortenedSilenceLength2 = calculateShortenedSilenceLength(length2) + (this.maybeSilenceBuffer.length / 2);
                outputSilence(iCalculateShortenedSilenceLength2, 2);
                iCalculateShortenedSilenceLength = iCalculateShortenedSilenceLength2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iCalculateShortenedSilenceLength = calculateShortenedSilenceLength(length);
                outputSilence(iCalculateShortenedSilenceLength, 1);
            }
            AbstractC1101a.m2358i("bytesConsumed is not aligned to frame size: %s" + length, length % this.bytesPerFrame == 0);
            AbstractC1101a.m2359j(i >= iCalculateShortenedSilenceLength);
            this.maybeSilenceBufferContentsSize -= length;
            int i4 = this.maybeSilenceBufferStartIndex + length;
            this.maybeSilenceBufferStartIndex = i4;
            this.maybeSilenceBufferStartIndex = i4 % this.maybeSilenceBuffer.length;
            this.outputSilenceFramesSinceNoise = (iCalculateShortenedSilenceLength / this.bytesPerFrame) + this.outputSilenceFramesSinceNoise;
            this.skippedFrames += (length - iCalculateShortenedSilenceLength) / r2;
        }
    }

    private void outputSilence(int i, int i4) {
        if (i == 0) {
            return;
        }
        AbstractC1101a.m2353d(this.maybeSilenceBufferContentsSize >= i);
        if (i4 == 2) {
            int i8 = this.maybeSilenceBufferStartIndex;
            int i9 = this.maybeSilenceBufferContentsSize;
            int i10 = i8 + i9;
            byte[] bArr = this.maybeSilenceBuffer;
            if (i10 <= bArr.length) {
                System.arraycopy(bArr, i10 - i, this.contiguousOutputBuffer, 0, i);
            } else {
                int length = i9 - (bArr.length - i8);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.contiguousOutputBuffer, 0, i);
                } else {
                    int i11 = i - length;
                    System.arraycopy(bArr, bArr.length - i11, this.contiguousOutputBuffer, 0, i11);
                    System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, i11, length);
                }
            }
        } else {
            int i12 = this.maybeSilenceBufferStartIndex;
            int i13 = i12 + i;
            byte[] bArr2 = this.maybeSilenceBuffer;
            if (i13 <= bArr2.length) {
                System.arraycopy(bArr2, i12, this.contiguousOutputBuffer, 0, i);
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr2, i12, this.contiguousOutputBuffer, 0, length2);
                System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, length2, i - length2);
            }
        }
        AbstractC1101a.m2352c("sizeToOutput is not aligned to frame size: " + i, i % this.bytesPerFrame == 0);
        AbstractC1101a.m2359j(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
        outputRange(this.contiguousOutputBuffer, i, i4);
    }

    private void processNoisy(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.maybeSilenceBuffer.length));
        int iFindNoiseLimit = findNoiseLimit(byteBuffer);
        if (iFindNoiseLimit == byteBuffer.position()) {
            this.state = 1;
        } else {
            byteBuffer.limit(Math.min(iFindNoiseLimit, byteBuffer.capacity()));
            output(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private static void sampleIntToTwoBigEndianBytes(byte[] bArr, int i, int i4) {
        if (i4 >= 32767) {
            bArr[i] = -1;
            bArr[i + 1] = Byte.MAX_VALUE;
        } else if (i4 <= -32768) {
            bArr[i] = 0;
            bArr[i + 1] = Byte.MIN_VALUE;
        } else {
            bArr[i] = (byte) (i4 & 255);
            bArr[i + 1] = (byte) (i4 >> 8);
        }
    }

    private void shortenSilenceSilenceUntilNoise(ByteBuffer byteBuffer) {
        int length;
        int i;
        AbstractC1101a.m2359j(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
        int iLimit = byteBuffer.limit();
        int iFindNoisePosition = findNoisePosition(byteBuffer);
        int iPosition = iFindNoisePosition - byteBuffer.position();
        int i4 = this.maybeSilenceBufferStartIndex;
        int i8 = this.maybeSilenceBufferContentsSize;
        int i9 = i4 + i8;
        byte[] bArr = this.maybeSilenceBuffer;
        if (i9 < bArr.length) {
            length = bArr.length - (i8 + i4);
            i = i4 + i8;
        } else {
            int length2 = i8 - (bArr.length - i4);
            length = i4 - length2;
            i = length2;
        }
        boolean z7 = iFindNoisePosition < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.maybeSilenceBuffer, i, iMin);
        int i10 = this.maybeSilenceBufferContentsSize + iMin;
        this.maybeSilenceBufferContentsSize = i10;
        AbstractC1101a.m2359j(i10 <= this.maybeSilenceBuffer.length);
        boolean z8 = z7 && iPosition < length;
        outputShortenedSilenceBuffer(z8);
        if (z8) {
            this.state = 0;
            this.outputSilenceFramesSinceNoise = 0;
        }
        byteBuffer.limit(iLimit);
    }

    private static int twoByteSampleToInt(byte b7, byte b8) {
        return (b7 << 8) | (b8 & 255);
    }

    public long getDurationAfterProcessorApplied(long j) {
        return j;
    }

    public long getSkippedFrames() {
        return this.skippedFrames;
    }

    @Override // androidx.media3.common.audio.AbstractC0178f, androidx.media3.common.audio.InterfaceC0176d
    public boolean isActive() {
        return super.isActive() && this.enabled;
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public C0174b onConfigure(C0174b c0174b) throws C0175c {
        if (c0174b.f983c == 2) {
            return c0174b.f981a == -1 ? C0174b.f980e : c0174b;
        }
        throw new C0175c(c0174b);
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public void onFlush() {
        if (isActive()) {
            this.bytesPerFrame = this.inputAudioFormat.f982b * 2;
            int iAlignToBytePerFrameBoundary = alignToBytePerFrameBoundary(durationUsToFrames(this.minimumSilenceDurationUs) / 2) * 2;
            if (this.maybeSilenceBuffer.length != iAlignToBytePerFrameBoundary) {
                this.maybeSilenceBuffer = new byte[iAlignToBytePerFrameBoundary];
                this.contiguousOutputBuffer = new byte[iAlignToBytePerFrameBoundary];
            }
        }
        this.state = 0;
        this.skippedFrames = 0L;
        this.outputSilenceFramesSinceNoise = 0;
        this.maybeSilenceBufferStartIndex = 0;
        this.maybeSilenceBufferContentsSize = 0;
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public void onQueueEndOfStream() {
        if (this.maybeSilenceBufferContentsSize > 0) {
            outputShortenedSilenceBuffer(true);
            this.outputSilenceFramesSinceNoise = 0;
        }
    }

    @Override // androidx.media3.common.audio.AbstractC0178f
    public void onReset() {
        this.enabled = false;
        byte[] bArr = AbstractC1118i0.f4755f;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !hasPendingOutput()) {
            int i = this.state;
            if (i == 0) {
                processNoisy(byteBuffer);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                shortenSilenceSilenceUntilNoise(byteBuffer);
            }
        }
    }

    public void setEnabled(boolean z7) {
        this.enabled = z7;
    }

    @Deprecated
    public SilenceSkippingAudioProcessor(long j, long j8, short s8) {
        this(j, j8 / j, j, 0, s8);
    }

    private int alignToBytePerFrameBoundary(float f8) {
        return alignToBytePerFrameBoundary((int) f8);
    }

    public SilenceSkippingAudioProcessor(long j, float f8, long j8, int i, short s8) {
        boolean z7 = false;
        this.outputSilenceFramesSinceNoise = 0;
        this.maybeSilenceBufferStartIndex = 0;
        this.maybeSilenceBufferContentsSize = 0;
        if (f8 >= 0.0f && f8 <= 1.0f) {
            z7 = true;
        }
        AbstractC1101a.m2353d(z7);
        this.minimumSilenceDurationUs = j;
        this.silenceRetentionRatio = f8;
        this.maxSilenceToKeepDurationUs = j8;
        this.minVolumeToKeepPercentageWhenMuting = i;
        this.silenceThresholdLevel = s8;
        byte[] bArr = AbstractC1118i0.f4755f;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }
}
