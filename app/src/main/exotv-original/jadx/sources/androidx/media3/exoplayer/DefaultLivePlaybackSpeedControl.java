package androidx.media3.exoplayer;

import android.os.SystemClock;
import androidx.media3.common.C0208i0;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {
    public static final float DEFAULT_FALLBACK_MAX_PLAYBACK_SPEED = 1.03f;
    public static final float DEFAULT_FALLBACK_MIN_PLAYBACK_SPEED = 0.97f;
    public static final long DEFAULT_MAX_LIVE_OFFSET_ERROR_MS_FOR_UNIT_SPEED = 20;
    public static final float DEFAULT_MIN_POSSIBLE_LIVE_OFFSET_SMOOTHING_FACTOR = 0.999f;
    public static final long DEFAULT_MIN_UPDATE_INTERVAL_MS = 1000;
    public static final float DEFAULT_PROPORTIONAL_CONTROL_FACTOR = 0.1f;
    public static final long DEFAULT_TARGET_LIVE_OFFSET_INCREMENT_ON_REBUFFER_MS = 500;
    private float adjustedPlaybackSpeed;
    private long currentTargetLiveOffsetUs;
    private final float fallbackMaxPlaybackSpeed;
    private final float fallbackMinPlaybackSpeed;
    private long idealTargetLiveOffsetUs;
    private long lastPlaybackSpeedUpdateMs;
    private final long maxLiveOffsetErrorUsForUnitSpeed;
    private float maxPlaybackSpeed;
    private long maxTargetLiveOffsetUs;
    private long mediaConfigurationTargetLiveOffsetUs;
    private float minPlaybackSpeed;
    private final float minPossibleLiveOffsetSmoothingFactor;
    private long minTargetLiveOffsetUs;
    private final long minUpdateIntervalMs;
    private final float proportionalControlFactor;
    private long smoothedMinPossibleLiveOffsetDeviationUs;
    private long smoothedMinPossibleLiveOffsetUs;
    private long targetLiveOffsetOverrideUs;
    private final long targetLiveOffsetRebufferDeltaUs;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Builder {
        private float fallbackMinPlaybackSpeed = 0.97f;
        private float fallbackMaxPlaybackSpeed = 1.03f;
        private long minUpdateIntervalMs = 1000;
        private float proportionalControlFactorUs = 1.0E-7f;
        private long maxLiveOffsetErrorUsForUnitSpeed = AbstractC1118i0.m2428S(20);
        private long targetLiveOffsetIncrementOnRebufferUs = AbstractC1118i0.m2428S(500);
        private float minPossibleLiveOffsetSmoothingFactor = 0.999f;

        public DefaultLivePlaybackSpeedControl build() {
            return new DefaultLivePlaybackSpeedControl(this.fallbackMinPlaybackSpeed, this.fallbackMaxPlaybackSpeed, this.minUpdateIntervalMs, this.proportionalControlFactorUs, this.maxLiveOffsetErrorUsForUnitSpeed, this.targetLiveOffsetIncrementOnRebufferUs, this.minPossibleLiveOffsetSmoothingFactor);
        }

        public Builder setFallbackMaxPlaybackSpeed(float f8) {
            AbstractC1101a.m2353d(f8 >= 1.0f);
            this.fallbackMaxPlaybackSpeed = f8;
            return this;
        }

        public Builder setFallbackMinPlaybackSpeed(float f8) {
            AbstractC1101a.m2353d(0.0f < f8 && f8 <= 1.0f);
            this.fallbackMinPlaybackSpeed = f8;
            return this;
        }

        public Builder setMaxLiveOffsetErrorMsForUnitSpeed(long j) {
            AbstractC1101a.m2353d(j > 0);
            this.maxLiveOffsetErrorUsForUnitSpeed = AbstractC1118i0.m2428S(j);
            return this;
        }

        public Builder setMinPossibleLiveOffsetSmoothingFactor(float f8) {
            AbstractC1101a.m2353d(f8 >= 0.0f && f8 < 1.0f);
            this.minPossibleLiveOffsetSmoothingFactor = f8;
            return this;
        }

        public Builder setMinUpdateIntervalMs(long j) {
            AbstractC1101a.m2353d(j > 0);
            this.minUpdateIntervalMs = j;
            return this;
        }

        public Builder setProportionalControlFactor(float f8) {
            AbstractC1101a.m2353d(f8 > 0.0f);
            this.proportionalControlFactorUs = f8 / 1000000.0f;
            return this;
        }

        public Builder setTargetLiveOffsetIncrementOnRebufferMs(long j) {
            AbstractC1101a.m2353d(j >= 0);
            this.targetLiveOffsetIncrementOnRebufferUs = AbstractC1118i0.m2428S(j);
            return this;
        }
    }

    private void adjustTargetLiveOffsetUs(long j) {
        long j8 = (this.smoothedMinPossibleLiveOffsetDeviationUs * 3) + this.smoothedMinPossibleLiveOffsetUs;
        if (this.currentTargetLiveOffsetUs <= j8) {
            long jM2452k = AbstractC1118i0.m2452k(j - ((long) (Math.max(0.0f, this.adjustedPlaybackSpeed - 1.0f) / this.proportionalControlFactor)), this.currentTargetLiveOffsetUs, j8);
            this.currentTargetLiveOffsetUs = jM2452k;
            long j9 = this.maxTargetLiveOffsetUs;
            if (j9 == -9223372036854775807L || jM2452k <= j9) {
                return;
            }
            this.currentTargetLiveOffsetUs = j9;
            return;
        }
        float fM2428S = AbstractC1118i0.m2428S(this.minUpdateIntervalMs);
        long[] jArr = {j8, this.idealTargetLiveOffsetUs, this.currentTargetLiveOffsetUs - (((long) ((this.adjustedPlaybackSpeed - 1.0f) * fM2428S)) + ((long) ((this.maxPlaybackSpeed - 1.0f) * fM2428S)))};
        long j10 = jArr[0];
        for (int i = 1; i < 3; i++) {
            long j11 = jArr[i];
            if (j11 > j10) {
                j10 = j11;
            }
        }
        this.currentTargetLiveOffsetUs = j10;
    }

    private void maybeResetTargetLiveOffsetUs() {
        long j;
        long j8 = this.mediaConfigurationTargetLiveOffsetUs;
        if (j8 != -9223372036854775807L) {
            j = this.targetLiveOffsetOverrideUs;
            if (j == -9223372036854775807L) {
                long j9 = this.minTargetLiveOffsetUs;
                if (j9 != -9223372036854775807L && j8 < j9) {
                    j8 = j9;
                }
                j = this.maxTargetLiveOffsetUs;
                if (j == -9223372036854775807L || j8 <= j) {
                    j = j8;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.idealTargetLiveOffsetUs == j) {
            return;
        }
        this.idealTargetLiveOffsetUs = j;
        this.currentTargetLiveOffsetUs = j;
        this.smoothedMinPossibleLiveOffsetUs = -9223372036854775807L;
        this.smoothedMinPossibleLiveOffsetDeviationUs = -9223372036854775807L;
        this.lastPlaybackSpeedUpdateMs = -9223372036854775807L;
    }

    private static long smooth(long j, long j8, float f8) {
        return (long) (((1.0f - f8) * j8) + (j * f8));
    }

    private void updateSmoothedMinPossibleLiveOffsetUs(long j, long j8) {
        long j9 = j - j8;
        long j10 = this.smoothedMinPossibleLiveOffsetUs;
        if (j10 == -9223372036854775807L) {
            this.smoothedMinPossibleLiveOffsetUs = j9;
            this.smoothedMinPossibleLiveOffsetDeviationUs = 0L;
        } else {
            long jMax = Math.max(j9, smooth(j10, j9, this.minPossibleLiveOffsetSmoothingFactor));
            this.smoothedMinPossibleLiveOffsetUs = jMax;
            this.smoothedMinPossibleLiveOffsetDeviationUs = smooth(this.smoothedMinPossibleLiveOffsetDeviationUs, Math.abs(j9 - jMax), this.minPossibleLiveOffsetSmoothingFactor);
        }
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public float getAdjustedPlaybackSpeed(long j, long j8) {
        if (this.mediaConfigurationTargetLiveOffsetUs == -9223372036854775807L) {
            return 1.0f;
        }
        updateSmoothedMinPossibleLiveOffsetUs(j, j8);
        if (this.lastPlaybackSpeedUpdateMs != -9223372036854775807L && SystemClock.elapsedRealtime() - this.lastPlaybackSpeedUpdateMs < this.minUpdateIntervalMs) {
            return this.adjustedPlaybackSpeed;
        }
        this.lastPlaybackSpeedUpdateMs = SystemClock.elapsedRealtime();
        adjustTargetLiveOffsetUs(j);
        long j9 = j - this.currentTargetLiveOffsetUs;
        if (Math.abs(j9) < this.maxLiveOffsetErrorUsForUnitSpeed) {
            this.adjustedPlaybackSpeed = 1.0f;
        } else {
            this.adjustedPlaybackSpeed = AbstractC1118i0.m2450i((this.proportionalControlFactor * j9) + 1.0f, this.minPlaybackSpeed, this.maxPlaybackSpeed);
        }
        return this.adjustedPlaybackSpeed;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public long getTargetLiveOffsetUs() {
        return this.currentTargetLiveOffsetUs;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void notifyRebuffer() {
        long j = this.currentTargetLiveOffsetUs;
        if (j == -9223372036854775807L) {
            return;
        }
        long j8 = j + this.targetLiveOffsetRebufferDeltaUs;
        this.currentTargetLiveOffsetUs = j8;
        long j9 = this.maxTargetLiveOffsetUs;
        if (j9 != -9223372036854775807L && j8 > j9) {
            this.currentTargetLiveOffsetUs = j9;
        }
        this.lastPlaybackSpeedUpdateMs = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void setLiveConfiguration(C0208i0 c0208i0) {
        this.mediaConfigurationTargetLiveOffsetUs = AbstractC1118i0.m2428S(c0208i0.f1128a);
        this.minTargetLiveOffsetUs = AbstractC1118i0.m2428S(c0208i0.f1129b);
        this.maxTargetLiveOffsetUs = AbstractC1118i0.m2428S(c0208i0.f1130c);
        float f8 = c0208i0.f1131d;
        if (f8 == -3.4028235E38f) {
            f8 = this.fallbackMinPlaybackSpeed;
        }
        this.minPlaybackSpeed = f8;
        float f9 = c0208i0.f1132e;
        if (f9 == -3.4028235E38f) {
            f9 = this.fallbackMaxPlaybackSpeed;
        }
        this.maxPlaybackSpeed = f9;
        if (f8 == 1.0f && f9 == 1.0f) {
            this.mediaConfigurationTargetLiveOffsetUs = -9223372036854775807L;
        }
        maybeResetTargetLiveOffsetUs();
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public void setTargetLiveOffsetOverrideUs(long j) {
        this.targetLiveOffsetOverrideUs = j;
        maybeResetTargetLiveOffsetUs();
    }

    private DefaultLivePlaybackSpeedControl(float f8, float f9, long j, float f10, long j8, long j9, float f11) {
        this.fallbackMinPlaybackSpeed = f8;
        this.fallbackMaxPlaybackSpeed = f9;
        this.minUpdateIntervalMs = j;
        this.proportionalControlFactor = f10;
        this.maxLiveOffsetErrorUsForUnitSpeed = j8;
        this.targetLiveOffsetRebufferDeltaUs = j9;
        this.minPossibleLiveOffsetSmoothingFactor = f11;
        this.mediaConfigurationTargetLiveOffsetUs = -9223372036854775807L;
        this.targetLiveOffsetOverrideUs = -9223372036854775807L;
        this.minTargetLiveOffsetUs = -9223372036854775807L;
        this.maxTargetLiveOffsetUs = -9223372036854775807L;
        this.minPlaybackSpeed = f8;
        this.maxPlaybackSpeed = f9;
        this.adjustedPlaybackSpeed = 1.0f;
        this.lastPlaybackSpeedUpdateMs = -9223372036854775807L;
        this.idealTargetLiveOffsetUs = -9223372036854775807L;
        this.currentTargetLiveOffsetUs = -9223372036854775807L;
        this.smoothedMinPossibleLiveOffsetUs = -9223372036854775807L;
        this.smoothedMinPossibleLiveOffsetDeviationUs = -9223372036854775807L;
    }
}
