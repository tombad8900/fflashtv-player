package androidx.media3.exoplayer.video;

import android.view.Surface;
import p063h1.C1134y;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface VideoSinkProvider {
    void clearOutputSurfaceInfo();

    VideoSink getSink();

    void release();

    void setOutputSurfaceInfo(Surface surface, C1134y c1134y);
}
