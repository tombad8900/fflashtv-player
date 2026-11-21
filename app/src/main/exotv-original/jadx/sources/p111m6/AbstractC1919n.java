package p111m6;

import java.util.Collection;
import java.util.Iterator;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m6.n */
/* loaded from: classes.dex */
public abstract class AbstractC1919n extends AbstractC1918m {
    /* renamed from: x0 */
    public static void m3757x0(Collection collection, Iterable iterable) {
        AbstractC2980h.m5136e("<this>", collection);
        AbstractC2980h.m5136e("elements", iterable);
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
