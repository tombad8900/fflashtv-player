package androidx.media3.exoplayer.upstream.experimental;

import android.os.Handler;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import p089k1.InterfaceC1564h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface BandwidthEstimator {
    public static final long ESTIMATE_NOT_AVAILABLE = Long.MIN_VALUE;

    void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener);

    long getBandwidthEstimate();

    void onBytesTransferred(InterfaceC1564h interfaceC1564h, int i);

    void onNetworkTypeChange(long j);

    void onTransferEnd(InterfaceC1564h interfaceC1564h);

    void onTransferInitializing(InterfaceC1564h interfaceC1564h);

    void onTransferStart(InterfaceC1564h interfaceC1564h);

    void removeEventListener(BandwidthMeter.EventListener eventListener);
}
