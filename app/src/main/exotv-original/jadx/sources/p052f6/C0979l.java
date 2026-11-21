package p052f6;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.l */
/* loaded from: classes.dex */
public class C0979l extends C0964g implements SortedSet {

    /* renamed from: l */
    public final /* synthetic */ C0972i1 f4207l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0979l(C0972i1 c0972i1, SortedMap sortedMap) {
        super(c0972i1, sortedMap);
        this.f4207l = c0972i1;
    }

    /* renamed from: a */
    public SortedMap mo2157a() {
        return (SortedMap) this.f4189j;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo2157a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo2157a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0979l(this.f4207l, mo2157a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo2157a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0979l(this.f4207l, mo2157a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0979l(this.f4207l, mo2157a().tailMap(obj));
    }
}
