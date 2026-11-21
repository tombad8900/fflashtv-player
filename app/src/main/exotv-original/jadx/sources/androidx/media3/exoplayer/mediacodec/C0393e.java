package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.mediacodec.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0393e implements MediaCodecUtil.ScoreProvider, LoudnessCodecController.LoudnessParameterUpdateListener, MediaCodecSelector {
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
    public List getDecoderInfos(String str, boolean z7, boolean z8) {
        return MediaCodecUtil.getDecoderInfos(str, z7, z8);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public int getScore(Object obj) {
        return MediaCodecUtil.lambda$applyWorkarounds$1((MediaCodecInfo) obj);
    }

    @Override // androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener
    public Bundle onLoudnessParameterUpdate(Bundle bundle) {
        return LoudnessCodecController.LoudnessParameterUpdateListener.lambda$static$0(bundle);
    }
}
