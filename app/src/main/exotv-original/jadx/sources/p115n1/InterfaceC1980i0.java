package p115n1;

import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import p063h1.C1132w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.i0 */
/* loaded from: classes.dex */
public interface InterfaceC1980i0 {
    void format(C0249w c0249w);

    default int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7) {
        return sampleData(interfaceC0219m, i, z7, 0);
    }

    int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7, int i4);

    void sampleData(C1132w c1132w, int i, int i4);

    void sampleMetadata(long j, int i, int i4, int i8, C1978h0 c1978h0);

    default void sampleData(C1132w c1132w, int i) {
        sampleData(c1132w, i, 0);
    }
}
