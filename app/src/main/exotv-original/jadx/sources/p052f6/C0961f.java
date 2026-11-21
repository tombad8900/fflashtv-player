package p052f6;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.f */
/* loaded from: classes.dex */
public class C0961f extends AbstractMap {

    /* renamed from: j */
    public transient C0955d f4184j;

    /* renamed from: k */
    public transient C1018y f4185k;

    /* renamed from: l */
    public final transient Map f4186l;

    /* renamed from: m */
    public final /* synthetic */ AbstractC0949b f4187m;

    public C0961f(AbstractC0949b abstractC0949b, Map map) {
        this.f4187m = abstractC0949b;
        this.f4186l = map;
    }

    /* renamed from: a */
    public final C0971i0 m2139a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z7 = list instanceof RandomAccess;
        AbstractC0949b abstractC0949b = this.f4187m;
        return new C0971i0(key, z7 ? new C0973j(abstractC0949b, key, list, null) : new C0985n(abstractC0949b, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC0949b abstractC0949b = this.f4187m;
        if (this.f4186l == abstractC0949b.f4160n) {
            abstractC0949b.m2127e();
            return;
        }
        C0958e c0958e = new C0958e(this);
        while (c0958e.hasNext()) {
            c0958e.next();
            c0958e.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f4186l;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0955d c0955d = this.f4184j;
        if (c0955d != null) {
            return c0955d;
        }
        C0955d c0955d2 = new C0955d(this);
        this.f4184j = c0955d2;
        return c0955d2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f4186l.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f4186l;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z7 = list instanceof RandomAccess;
        AbstractC0949b abstractC0949b = this.f4187m;
        return z7 ? new C0973j(abstractC0949b, obj, list, null) : new C0985n(abstractC0949b, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f4186l.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        AbstractC0949b abstractC0949b = this.f4187m;
        Set set = abstractC0949b.f4240k;
        if (set != null) {
            return set;
        }
        Set setMo2130h = abstractC0949b.mo2130h();
        abstractC0949b.f4240k = setMo2130h;
        return setMo2130h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f4186l.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractC0949b abstractC0949b = this.f4187m;
        Collection collectionMo2129g = abstractC0949b.mo2129g();
        collectionMo2129g.addAll(collection);
        abstractC0949b.f4161o -= collection.size();
        collection.clear();
        return collectionMo2129g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4186l.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f4186l.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C1018y c1018y = this.f4185k;
        if (c1018y != null) {
            return c1018y;
        }
        C1018y c1018y2 = new C1018y(this);
        this.f4185k = c1018y2;
        return c1018y2;
    }
}
