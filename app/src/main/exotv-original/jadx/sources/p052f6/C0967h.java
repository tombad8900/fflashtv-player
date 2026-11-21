package p052f6;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.h */
/* loaded from: classes.dex */
public final class C0967h extends C0976k implements NavigableMap {

    /* renamed from: p */
    public final /* synthetic */ C0972i1 f4194p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0967h(C0972i1 c0972i1, NavigableMap navigableMap) {
        super(c0972i1, navigableMap);
        this.f4194p = c0972i1;
    }

    @Override // p052f6.C0976k
    /* renamed from: b */
    public final SortedSet mo2145b() {
        return new C0970i(this.f4194p, mo2147d());
    }

    @Override // p052f6.C0976k
    /* renamed from: c */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = mo2147d().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m2139a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mo2147d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C0967h(this.f4194p, mo2147d().descendingMap());
    }

    /* renamed from: e */
    public final C0971i0 m2148e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionMo2129g = this.f4194p.mo2129g();
        collectionMo2129g.addAll((Collection) entry.getValue());
        it.remove();
        return new C0971i0(entry.getKey(), Collections.unmodifiableList((List) collectionMo2129g));
    }

    @Override // p052f6.C0976k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo2147d() {
        return (NavigableMap) ((SortedMap) this.f4186l);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = mo2147d().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m2139a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = mo2147d().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m2139a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mo2147d().floorKey(obj);
    }

    @Override // p052f6.C0976k, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = mo2147d().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m2139a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mo2147d().higherKey(obj);
    }

    @Override // p052f6.C0976k, p052f6.C0961f, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = mo2147d().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m2139a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = mo2147d().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m2139a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mo2147d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m2148e(((C0955d) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m2148e(((C0955d) ((C0961f) descendingMap()).entrySet()).iterator());
    }

    @Override // p052f6.C0976k, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // p052f6.C0976k, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z7) {
        return new C0967h(this.f4194p, mo2147d().headMap(obj, z7));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z7, Object obj2, boolean z8) {
        return new C0967h(this.f4194p, mo2147d().subMap(obj, z7, obj2, z8));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z7) {
        return new C0967h(this.f4194p, mo2147d().tailMap(obj, z7));
    }
}
