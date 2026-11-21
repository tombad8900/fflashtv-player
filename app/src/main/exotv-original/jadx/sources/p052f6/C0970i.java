package p052f6;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.i */
/* loaded from: classes.dex */
public final class C0970i extends C0979l implements NavigableSet {

    /* renamed from: m */
    public final /* synthetic */ C0972i1 f4197m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0970i(C0972i1 c0972i1, NavigableMap navigableMap) {
        super(c0972i1, navigableMap);
        this.f4197m = c0972i1;
    }

    @Override // p052f6.C0979l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo2157a() {
        return (NavigableMap) ((SortedMap) this.f4189j);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mo2157a().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C0964g) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C0970i(this.f4197m, mo2157a().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mo2157a().floorKey(obj);
    }

    @Override // p052f6.C0979l, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mo2157a().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mo2157a().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C0958e c0958e = (C0958e) iterator();
        if (!c0958e.hasNext()) {
            return null;
        }
        Object next = c0958e.next();
        c0958e.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // p052f6.C0979l, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // p052f6.C0979l, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z7) {
        return new C0970i(this.f4197m, mo2157a().headMap(obj, z7));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z7, Object obj2, boolean z8) {
        return new C0970i(this.f4197m, mo2157a().subMap(obj, z7, obj2, z8));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z7) {
        return new C0970i(this.f4197m, mo2157a().tailMap(obj, z7));
    }
}
