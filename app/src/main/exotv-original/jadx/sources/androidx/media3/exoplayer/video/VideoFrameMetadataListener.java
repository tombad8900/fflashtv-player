package androidx.media3.exoplayer.video;

import android.media.MediaFormat;
import androidx.media3.common.C0249w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface VideoFrameMetadataListener {
    void onVideoFrameAboutToBeRendered(long j, long j8, C0249w c0249w, MediaFormat mediaFormat);
}
