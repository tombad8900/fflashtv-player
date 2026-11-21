package androidx.media3.exoplayer.hls;

import java.io.IOException;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(String str) {
        super(AbstractC0008a1.m17m("Unable to bind a sample queue to TrackGroup with MIME type ", str, "."));
    }
}
