package p052f6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.q */
/* loaded from: classes.dex */
public abstract class AbstractC0994q implements InterfaceC0966g1 {

    /* renamed from: j */
    public transient Collection f4239j;

    /* renamed from: k */
    public transient Set f4240k;

    /* renamed from: l */
    public transient Collection f4241l;

    /* renamed from: m */
    public transient Map f4242m;

    /* renamed from: c */
    public boolean mo2175c(Object obj) {
        Iterator it = mo2126b().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void m2181d(ArrayList arrayList, String str) {
        if (arrayList.isEmpty()) {
            return;
        }
        get(str).addAll(arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC0966g1) {
            return mo2126b().equals(((InterfaceC0966g1) obj).mo2126b());
        }
        return false;
    }

    public final int hashCode() {
        return mo2126b().hashCode();
    }

    @Override // p052f6.InterfaceC0966g1
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) mo2126b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return mo2126b().toString();
    }
}
