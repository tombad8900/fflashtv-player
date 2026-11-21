package androidx.media3.exoplayer;

import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class SeekParameters {
    public static final SeekParameters CLOSEST_SYNC;
    public static final SeekParameters DEFAULT;
    public static final SeekParameters EXACT;
    public static final SeekParameters NEXT_SYNC;
    public static final SeekParameters PREVIOUS_SYNC;
    public final long toleranceAfterUs;
    public final long toleranceBeforeUs;

    static {
        SeekParameters seekParameters = new SeekParameters(0L, 0L);
        EXACT = seekParameters;
        CLOSEST_SYNC = new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        PREVIOUS_SYNC = new SeekParameters(Long.MAX_VALUE, 0L);
        NEXT_SYNC = new SeekParameters(0L, Long.MAX_VALUE);
        DEFAULT = seekParameters;
    }

    public SeekParameters(long j, long j8) {
        AbstractC1101a.m2353d(j >= 0);
        AbstractC1101a.m2353d(j8 >= 0);
        this.toleranceBeforeUs = j;
        this.toleranceAfterUs = j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekParameters.class == obj.getClass()) {
            SeekParameters seekParameters = (SeekParameters) obj;
            if (this.toleranceBeforeUs == seekParameters.toleranceBeforeUs && this.toleranceAfterUs == seekParameters.toleranceAfterUs) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.toleranceBeforeUs) * 31) + ((int) this.toleranceAfterUs);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long resolveSeekPositionUs(long j, long j8, long j9) {
        long j10 = this.toleranceBeforeUs;
        if (j10 == 0 && this.toleranceAfterUs == 0) {
            return j;
        }
        int i = AbstractC1118i0.f4750a;
        long j11 = j - j10;
        if (((j10 ^ j) & (j ^ j11)) < 0) {
            j11 = Long.MIN_VALUE;
        }
        long j12 = this.toleranceAfterUs;
        long j13 = j + j12;
        if (((j12 ^ j13) & (j ^ j13)) < 0) {
            j13 = Long.MAX_VALUE;
        }
        boolean z7 = false;
        boolean z8 = j11 <= j8 && j8 <= j13;
        if (j11 <= j9 && j9 <= j13) {
            z7 = true;
        }
        if (!z8 || !z7) {
            if (!z8) {
                return z7 ? j9 : j11;
            }
            return j8;
        }
        if (Math.abs(j8 - j) <= Math.abs(j9 - j)) {
            return j8;
        }
    }
}
