package androidx.media3.common.audio;

import androidx.media3.common.C0256y0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.audio.e */
/* loaded from: classes.dex */
public interface InterfaceC0177e {
    C0256y0 applyPlaybackParameters(C0256y0 c0256y0);

    boolean applySkipSilenceEnabled(boolean z7);

    InterfaceC0176d[] getAudioProcessors();

    long getMediaDuration(long j);

    long getSkippedOutputFrameCount();
}
