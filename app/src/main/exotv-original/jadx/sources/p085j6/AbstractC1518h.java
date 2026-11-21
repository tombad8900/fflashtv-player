package p085j6;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j6.h */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1518h {
    /* renamed from: a */
    public static /* synthetic */ boolean m3198a(Unsafe unsafe, AbstractC1524n abstractC1524n, long j, C1523m c1523m, C1523m c1523m2) {
        while (!unsafe.compareAndSwapObject(abstractC1524n, j, c1523m, c1523m2)) {
            if (unsafe.getObject(abstractC1524n, j) != c1523m) {
                return false;
            }
        }
        return true;
    }
}
