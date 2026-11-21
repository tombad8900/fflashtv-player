package p052f6;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.k */
/* loaded from: classes.dex */
public class C0976k extends C0961f implements SortedMap {

    /* renamed from: n */
    public SortedSet f4204n;

    /* renamed from: o */
    public final /* synthetic */ C0972i1 f4205o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0976k(C0972i1 c0972i1, SortedMap sortedMap) {
        super(c0972i1, sortedMap);
        this.f4205o = c0972i1;
    }

    /* renamed from: b */
    public SortedSet mo2145b() {
        return new C0979l(this.f4205o, mo2147d());
    }

    @Override // p052f6.C0961f, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f4204n;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo2145b = mo2145b();
        this.f4204n = sortedSetMo2145b;
        return sortedSetMo2145b;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo2147d().comparator();
    }

    /* renamed from: d */
    public SortedMap mo2147d() {
        return (SortedMap) this.f4186l;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo2147d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0976k(this.f4205o, mo2147d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo2147d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0976k(this.f4205o, mo2147d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0976k(this.f4205o, mo2147d().tailMap(obj));
    }
}
