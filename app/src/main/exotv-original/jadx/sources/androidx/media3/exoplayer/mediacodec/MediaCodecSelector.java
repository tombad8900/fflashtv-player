package androidx.media3.exoplayer.mediacodec;

import java.util.List;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new C0393e();

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z7, boolean z8);
}
