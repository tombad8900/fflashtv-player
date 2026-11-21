package p085j6;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j6.i */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1519i {
    /* renamed from: a */
    public static /* synthetic */ boolean m3199a(Unsafe unsafe, AbstractC1524n abstractC1524n, long j, C1514d c1514d, C1514d c1514d2) {
        while (!unsafe.compareAndSwapObject(abstractC1524n, j, c1514d, c1514d2)) {
            if (unsafe.getObject(abstractC1524n, j) != c1514d) {
                return false;
            }
        }
        return true;
    }
}
