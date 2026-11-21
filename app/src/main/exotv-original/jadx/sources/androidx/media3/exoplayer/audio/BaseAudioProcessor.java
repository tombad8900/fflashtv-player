package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AbstractC0178f;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@Deprecated
/* loaded from: classes.dex */
public abstract class BaseAudioProcessor extends AbstractC0178f {
    public long getDurationAfterProcessorApplied(long j) {
        return j;
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public abstract /* synthetic */ void queueInput(ByteBuffer byteBuffer);
}
