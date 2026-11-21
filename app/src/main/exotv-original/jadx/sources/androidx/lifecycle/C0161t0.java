package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.t0 */
/* loaded from: classes.dex */
public final class C0161t0 {

    /* renamed from: a */
    public final LinkedHashMap f946a = new LinkedHashMap();

    /* renamed from: a */
    public final void m581a() {
        LinkedHashMap linkedHashMap = this.f946a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0157r0) it.next()).m580a();
        }
        linkedHashMap.clear();
    }
}
