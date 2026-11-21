package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;
import p106m1.C1868c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
interface MediaCodecBufferEnqueuer {
    void flush();

    void maybeThrowException();

    void queueInputBuffer(int i, int i4, int i8, long j, int i9);

    void queueSecureInputBuffer(int i, int i4, C1868c c1868c, long j, int i8);

    void setParameters(Bundle bundle);

    void shutdown();

    void start();

    void waitUntilQueueingComplete();
}
