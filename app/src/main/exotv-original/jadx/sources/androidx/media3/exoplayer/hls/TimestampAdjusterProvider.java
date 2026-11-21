package androidx.media3.exoplayer.hls;

import android.util.SparseArray;
import p063h1.C1108d0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class TimestampAdjusterProvider {
    private final SparseArray<C1108d0> timestampAdjusters = new SparseArray<>();

    public C1108d0 getAdjuster(int i) {
        C1108d0 c1108d0 = this.timestampAdjusters.get(i);
        if (c1108d0 != null) {
            return c1108d0;
        }
        C1108d0 c1108d02 = new C1108d0(9223372036854775806L);
        this.timestampAdjusters.put(i, c1108d02);
        return c1108d02;
    }

    public void reset() {
        this.timestampAdjusters.clear();
    }
}
