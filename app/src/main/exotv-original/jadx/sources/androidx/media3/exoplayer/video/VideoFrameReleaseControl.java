package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1135z;
import p063h1.InterfaceC1103b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class VideoFrameReleaseControl {
    public static final int FRAME_RELEASE_DROP = 2;
    public static final int FRAME_RELEASE_IGNORE = 4;
    public static final int FRAME_RELEASE_IMMEDIATELY = 0;
    public static final int FRAME_RELEASE_SCHEDULED = 1;
    public static final int FRAME_RELEASE_SKIP = 3;
    public static final int FRAME_RELEASE_TRY_AGAIN_LATER = 5;
    private static final long MAX_EARLY_US_THRESHOLD = 50000;
    private final long allowedJoiningTimeMs;
    private final VideoFrameReleaseHelper frameReleaseHelper;
    private final FrameTimingEvaluator frameTimingEvaluator;
    private boolean joiningRenderNextFrameImmediately;
    private long lastReleaseRealtimeUs;
    private boolean started;
    private int firstFrameState = 0;
    private long initialPositionUs = -9223372036854775807L;
    private long lastPresentationTimeUs = -9223372036854775807L;
    private long joiningDeadlineMs = -9223372036854775807L;
    private float playbackSpeed = 1.0f;
    private InterfaceC1103b clock = InterfaceC1103b.f4713a;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FrameReleaseAction {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class FrameReleaseInfo {
        private long earlyUs = -9223372036854775807L;
        private long releaseTimeNs = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.earlyUs = -9223372036854775807L;
            this.releaseTimeNs = -9223372036854775807L;
        }

        public long getEarlyUs() {
            return this.earlyUs;
        }

        public long getReleaseTimeNs() {
            return this.releaseTimeNs;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface FrameTimingEvaluator {
        boolean shouldDropFrame(long j, long j8, boolean z7);

        boolean shouldForceReleaseFrame(long j, long j8);

        boolean shouldIgnoreFrame(long j, long j8, long j9, boolean z7, boolean z8);
    }

    public VideoFrameReleaseControl(Context context, FrameTimingEvaluator frameTimingEvaluator, long j) {
        this.frameTimingEvaluator = frameTimingEvaluator;
        this.allowedJoiningTimeMs = j;
        this.frameReleaseHelper = new VideoFrameReleaseHelper(context);
    }

    private long calculateEarlyTimeUs(long j, long j8, long j9) {
        long j10 = (long) ((j9 - j) / this.playbackSpeed);
        if (!this.started) {
            return j10;
        }
        ((C1135z) this.clock).getClass();
        return j10 - (AbstractC1118i0.m2428S(SystemClock.elapsedRealtime()) - j8);
    }

    private void lowerFirstFrameState(int i) {
        this.firstFrameState = Math.min(this.firstFrameState, i);
    }

    private boolean shouldForceRelease(long j, long j8, long j9) {
        if (this.joiningDeadlineMs != -9223372036854775807L && !this.joiningRenderNextFrameImmediately) {
            return false;
        }
        int i = this.firstFrameState;
        if (i == 0) {
            return this.started;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return j >= j9;
        }
        if (i != 3) {
            throw new IllegalStateException();
        }
        ((C1135z) this.clock).getClass();
        return this.started && this.frameTimingEvaluator.shouldForceReleaseFrame(j8, AbstractC1118i0.m2428S(SystemClock.elapsedRealtime()) - this.lastReleaseRealtimeUs);
    }

    public void allowReleaseFirstFrameBeforeStarted() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    public int getFrameReleaseAction(long j, long j8, long j9, long j10, boolean z7, FrameReleaseInfo frameReleaseInfo) {
        frameReleaseInfo.reset();
        if (this.initialPositionUs == -9223372036854775807L) {
            this.initialPositionUs = j8;
        }
        if (this.lastPresentationTimeUs != j) {
            this.frameReleaseHelper.onNextFrame(j);
            this.lastPresentationTimeUs = j;
        }
        frameReleaseInfo.earlyUs = calculateEarlyTimeUs(j8, j9, j);
        if (shouldForceRelease(j8, frameReleaseInfo.earlyUs, j10)) {
            return 0;
        }
        if (!this.started || j8 == this.initialPositionUs) {
            return 5;
        }
        ((C1135z) this.clock).getClass();
        long jNanoTime = System.nanoTime();
        frameReleaseInfo.releaseTimeNs = this.frameReleaseHelper.adjustReleaseTime((frameReleaseInfo.earlyUs * 1000) + jNanoTime);
        frameReleaseInfo.earlyUs = (frameReleaseInfo.releaseTimeNs - jNanoTime) / 1000;
        boolean z8 = (this.joiningDeadlineMs == -9223372036854775807L || this.joiningRenderNextFrameImmediately) ? false : true;
        if (this.frameTimingEvaluator.shouldIgnoreFrame(frameReleaseInfo.earlyUs, j8, j9, z7, z8)) {
            return 4;
        }
        return this.frameTimingEvaluator.shouldDropFrame(frameReleaseInfo.earlyUs, j9, z7) ? z8 ? 3 : 2 : frameReleaseInfo.earlyUs > MAX_EARLY_US_THRESHOLD ? 5 : 1;
    }

    public boolean isReady(boolean z7) {
        if (z7 && this.firstFrameState == 3) {
            this.joiningDeadlineMs = -9223372036854775807L;
            return true;
        }
        if (this.joiningDeadlineMs == -9223372036854775807L) {
            return false;
        }
        ((C1135z) this.clock).getClass();
        if (SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = -9223372036854775807L;
        return false;
    }

    public void join(boolean z7) {
        long jElapsedRealtime;
        this.joiningRenderNextFrameImmediately = z7;
        if (this.allowedJoiningTimeMs > 0) {
            ((C1135z) this.clock).getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.joiningDeadlineMs = jElapsedRealtime;
    }

    public void onDisabled() {
        lowerFirstFrameState(0);
    }

    public void onEnabled(boolean z7) {
        this.firstFrameState = z7 ? 1 : 0;
    }

    public boolean onFrameReleasedIsFirstFrame() {
        boolean z7 = this.firstFrameState != 3;
        this.firstFrameState = 3;
        ((C1135z) this.clock).getClass();
        this.lastReleaseRealtimeUs = AbstractC1118i0.m2428S(SystemClock.elapsedRealtime());
        return z7;
    }

    public void onProcessedStreamChange() {
        lowerFirstFrameState(2);
    }

    public void onStarted() {
        this.started = true;
        ((C1135z) this.clock).getClass();
        this.lastReleaseRealtimeUs = AbstractC1118i0.m2428S(SystemClock.elapsedRealtime());
        this.frameReleaseHelper.onStarted();
    }

    public void onStopped() {
        this.started = false;
        this.joiningDeadlineMs = -9223372036854775807L;
        this.frameReleaseHelper.onStopped();
    }

    public void reset() {
        this.frameReleaseHelper.onPositionReset();
        this.lastPresentationTimeUs = -9223372036854775807L;
        this.initialPositionUs = -9223372036854775807L;
        lowerFirstFrameState(1);
        this.joiningDeadlineMs = -9223372036854775807L;
    }

    public void setChangeFrameRateStrategy(int i) {
        this.frameReleaseHelper.setChangeFrameRateStrategy(i);
    }

    public void setClock(InterfaceC1103b interfaceC1103b) {
        this.clock = interfaceC1103b;
    }

    public void setFrameRate(float f8) {
        this.frameReleaseHelper.onFormatChanged(f8);
    }

    public void setOutputSurface(Surface surface) {
        this.frameReleaseHelper.onSurfaceChanged(surface);
        lowerFirstFrameState(1);
    }

    public void setPlaybackSpeed(float f8) {
        AbstractC1101a.m2353d(f8 > 0.0f);
        if (f8 == this.playbackSpeed) {
            return;
        }
        this.playbackSpeed = f8;
        this.frameReleaseHelper.onPlaybackSpeed(f8);
    }
}
