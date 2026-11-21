package androidx.media3.exoplayer;

import androidx.media3.common.C0208i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface LivePlaybackSpeedControl {
    float getAdjustedPlaybackSpeed(long j, long j8);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(C0208i0 c0208i0);

    void setTargetLiveOffsetOverrideUs(long j);
}
