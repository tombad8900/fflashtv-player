package p085j6;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j6.j */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1520j {
    /* renamed from: a */
    public static /* synthetic */ boolean m3200a(Unsafe unsafe, AbstractC1524n abstractC1524n, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC1524n, j, obj, obj2)) {
            if (unsafe.getObject(abstractC1524n, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
