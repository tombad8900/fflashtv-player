package androidx.media3.exoplayer;

import android.os.SystemClock;
import androidx.media3.common.C0256y0;
import p063h1.AbstractC1118i0;
import p063h1.C1135z;
import p063h1.InterfaceC1103b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class StandaloneMediaClock implements MediaClock {
    private long baseElapsedMs;
    private long baseUs;
    private final InterfaceC1103b clock;
    private C0256y0 playbackParameters = C0256y0.f1548d;
    private boolean started;

    public StandaloneMediaClock(InterfaceC1103b interfaceC1103b) {
        this.clock = interfaceC1103b;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public C0256y0 getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        long j = this.baseUs;
        if (!this.started) {
            return j;
        }
        ((C1135z) this.clock).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.baseElapsedMs;
        return (this.playbackParameters.f1549a == 1.0f ? AbstractC1118i0.m2428S(jElapsedRealtime) : jElapsedRealtime * r4.f1551c) + j;
    }

    public void resetPosition(long j) {
        this.baseUs = j;
        if (this.started) {
            ((C1135z) this.clock).getClass();
            this.baseElapsedMs = SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(C0256y0 c0256y0) {
        if (this.started) {
            resetPosition(getPositionUs());
        }
        this.playbackParameters = c0256y0;
    }

    public void start() {
        if (this.started) {
            return;
        }
        ((C1135z) this.clock).getClass();
        this.baseElapsedMs = SystemClock.elapsedRealtime();
        this.started = true;
    }

    public void stop() {
        if (this.started) {
            resetPosition(getPositionUs());
            this.started = false;
        }
    }
}
