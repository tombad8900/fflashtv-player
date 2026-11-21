package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.C0170a0;
import androidx.media3.common.C0187c;
import androidx.media3.common.InterfaceC0191d;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import java.io.IOException;
import p089k1.C1568l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface AdsLoader {

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface EventListener {
        default void onAdClicked() {
        }

        default void onAdLoadError(AdsMediaSource.AdLoadException adLoadException, C1568l c1568l) {
        }

        default void onAdPlaybackState(C0187c c0187c) {
        }

        default void onAdTapped() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Provider {
        AdsLoader getAdsLoader(C0170a0 c0170a0);
    }

    void handlePrepareComplete(AdsMediaSource adsMediaSource, int i, int i4);

    void handlePrepareError(AdsMediaSource adsMediaSource, int i, int i4, IOException iOException);

    void release();

    void setPlayer(InterfaceC0193d1 interfaceC0193d1);

    void setSupportedContentTypes(int... iArr);

    void start(AdsMediaSource adsMediaSource, C1568l c1568l, Object obj, InterfaceC0191d interfaceC0191d, EventListener eventListener);

    void stop(AdsMediaSource adsMediaSource, EventListener eventListener);
}
