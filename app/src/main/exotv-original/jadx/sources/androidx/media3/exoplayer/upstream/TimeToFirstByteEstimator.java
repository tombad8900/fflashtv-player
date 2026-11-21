package androidx.media3.exoplayer.upstream;

import p089k1.C1568l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface TimeToFirstByteEstimator {
    long getTimeToFirstByteEstimateUs();

    void onTransferInitializing(C1568l c1568l);

    void onTransferStart(C1568l c1568l);

    void reset();
}
