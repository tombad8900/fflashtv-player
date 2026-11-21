package p089k1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p052f6.AbstractC1006u;
import p052f6.C1008u1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.o */
/* loaded from: classes.dex */
public final class C1571o implements Map {

    /* renamed from: j */
    public final Map f6016j;

    public C1571o(Map map) {
        this.f6016j = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f6016j.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f6016j.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((C1008u1) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return AbstractC1006u.m2192g(this.f6016j.entrySet(), new C1570n(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && AbstractC1006u.m2190e(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f6016j.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC1006u.m2196k(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f6016j;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC1006u.m2192g(this.f6016j.keySet(), new C1570n(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f6016j.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f6016j.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f6016j.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f6016j;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.f6016j.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f6016j.values();
    }
}
