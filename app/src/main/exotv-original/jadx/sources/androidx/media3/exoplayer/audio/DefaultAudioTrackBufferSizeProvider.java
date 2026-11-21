package androidx.media3.exoplayer.audio;

import androidx.media3.common.C0253x0;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.bumptech.glide.AbstractC0715d;
import java.math.RoundingMode;
import p063h1.AbstractC1118i0;
import p068h6.AbstractC1197d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class DefaultAudioTrackBufferSizeProvider implements DefaultAudioSink.AudioTrackBufferSizeProvider {
    private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
    private static final int DTSHD_BUFFER_MULTIPLICATION_FACTOR = 4;
    private static final int MAX_PCM_BUFFER_DURATION_US = 750000;
    private static final int MIN_PCM_BUFFER_DURATION_US = 250000;
    private static final int OFFLOAD_BUFFER_DURATION_US = 50000000;
    private static final int PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int PCM_BUFFER_MULTIPLICATION_FACTOR = 4;
    public final int ac3BufferMultiplicationFactor;
    public final int dtshdBufferMultiplicationFactor;
    protected final int maxPcmBufferDurationUs;
    protected final int minPcmBufferDurationUs;
    protected final int offloadBufferDurationUs;
    protected final int passthroughBufferDurationUs;
    protected final int pcmBufferMultiplicationFactor;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class Builder {
        private int minPcmBufferDurationUs = 250000;
        private int maxPcmBufferDurationUs = DefaultAudioTrackBufferSizeProvider.MAX_PCM_BUFFER_DURATION_US;
        private int pcmBufferMultiplicationFactor = 4;
        private int passthroughBufferDurationUs = 250000;
        private int offloadBufferDurationUs = DefaultAudioTrackBufferSizeProvider.OFFLOAD_BUFFER_DURATION_US;
        private int ac3BufferMultiplicationFactor = 2;
        private int dtshdBufferMultiplicationFactor = 4;

        public DefaultAudioTrackBufferSizeProvider build() {
            return new DefaultAudioTrackBufferSizeProvider(this);
        }

        public Builder setAc3BufferMultiplicationFactor(int i) {
            this.ac3BufferMultiplicationFactor = i;
            return this;
        }

        public Builder setDtshdBufferMultiplicationFactor(int i) {
            this.dtshdBufferMultiplicationFactor = i;
            return this;
        }

        public Builder setMaxPcmBufferDurationUs(int i) {
            this.maxPcmBufferDurationUs = i;
            return this;
        }

        public Builder setMinPcmBufferDurationUs(int i) {
            this.minPcmBufferDurationUs = i;
            return this;
        }

        public Builder setOffloadBufferDurationUs(int i) {
            this.offloadBufferDurationUs = i;
            return this;
        }

        public Builder setPassthroughBufferDurationUs(int i) {
            this.passthroughBufferDurationUs = i;
            return this;
        }

        public Builder setPcmBufferMultiplicationFactor(int i) {
            this.pcmBufferMultiplicationFactor = i;
            return this;
        }
    }

    public DefaultAudioTrackBufferSizeProvider(Builder builder) {
        this.minPcmBufferDurationUs = builder.minPcmBufferDurationUs;
        this.maxPcmBufferDurationUs = builder.maxPcmBufferDurationUs;
        this.pcmBufferMultiplicationFactor = builder.pcmBufferMultiplicationFactor;
        this.passthroughBufferDurationUs = builder.passthroughBufferDurationUs;
        this.offloadBufferDurationUs = builder.offloadBufferDurationUs;
        this.ac3BufferMultiplicationFactor = builder.ac3BufferMultiplicationFactor;
        this.dtshdBufferMultiplicationFactor = builder.dtshdBufferMultiplicationFactor;
    }

    public static int durationUsToBytes(int i, int i4, int i8) {
        return AbstractC0715d.m1566m(((i * i4) * i8) / 1000000);
    }

    public static int getMaximumEncodedRateBytesPerSecond(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return C0253x0.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                        return 336000;
                    case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public int get1xBufferSizeInBytes(int i, int i4, int i8, int i9, int i10, int i11) {
        if (i8 == 0) {
            return getPcmBufferSizeInBytes(i, i10, i9);
        }
        if (i8 == 1) {
            return getOffloadBufferSizeInBytes(i4);
        }
        if (i8 == 2) {
            return getPassthroughBufferSizeInBytes(i4, i11);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider
    public int getBufferSizeInBytes(int i, int i4, int i8, int i9, int i10, int i11, double d8) {
        return (((Math.max(i, (int) (get1xBufferSizeInBytes(i, i4, i8, i9, i10, i11) * d8)) + i9) - 1) / i9) * i9;
    }

    public int getOffloadBufferSizeInBytes(int i) {
        return AbstractC0715d.m1566m((this.offloadBufferDurationUs * getMaximumEncodedRateBytesPerSecond(i)) / 1000000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getPassthroughBufferSizeInBytes(int i, int i4) {
        int i8;
        int maximumEncodedRateBytesPerSecond;
        int i9 = this.passthroughBufferDurationUs;
        if (i != 5) {
            if (i == 8) {
                i8 = this.dtshdBufferMultiplicationFactor;
            }
            if (i4 == -1) {
                RoundingMode roundingMode = RoundingMode.CEILING;
                roundingMode.getClass();
                maximumEncodedRateBytesPerSecond = i4 / 8;
                int i10 = i4 - (8 * maximumEncodedRateBytesPerSecond);
                if (i10 != 0) {
                    int i11 = ((i4 ^ 8) >> 31) | 1;
                    switch (AbstractC1197d.f5075a[roundingMode.ordinal()]) {
                        case 1:
                            if (i10 != 0) {
                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            if (i11 < 0) {
                                maximumEncodedRateBytesPerSecond += i11;
                                break;
                            }
                            break;
                        case 4:
                            break;
                        case 5:
                            if (i11 > 0) {
                            }
                            break;
                        case 6:
                        case 7:
                        case 8:
                            int iAbs = Math.abs(i10);
                            int iAbs2 = iAbs - (Math.abs(8) - iAbs);
                            if (iAbs2 == 0) {
                                RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                                break;
                            } else if (iAbs2 > 0) {
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
            } else {
                maximumEncodedRateBytesPerSecond = getMaximumEncodedRateBytesPerSecond(i);
            }
            return AbstractC0715d.m1566m((i9 * maximumEncodedRateBytesPerSecond) / 1000000);
        }
        i8 = this.ac3BufferMultiplicationFactor;
        i9 *= i8;
        if (i4 == -1) {
        }
        return AbstractC0715d.m1566m((i9 * maximumEncodedRateBytesPerSecond) / 1000000);
    }

    public int getPcmBufferSizeInBytes(int i, int i4, int i8) {
        return AbstractC1118i0.m2451j(i * this.pcmBufferMultiplicationFactor, durationUsToBytes(this.minPcmBufferDurationUs, i4, i8), durationUsToBytes(this.maxPcmBufferDurationUs, i4, i8));
    }
}
