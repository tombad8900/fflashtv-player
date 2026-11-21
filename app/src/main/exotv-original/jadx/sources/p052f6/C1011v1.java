package p052f6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import p043e6.InterfaceC0918f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.v1 */
/* loaded from: classes.dex */
public final class C1011v1 extends C1008u1 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f4270j).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f4270j.iterator();
        it.getClass();
        InterfaceC0918f interfaceC0918f = this.f4271k;
        interfaceC0918f.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC0918f.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C1011v1(((SortedSet) this.f4270j).headSet(obj), this.f4271k);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f4270j;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f4271k.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C1011v1(((SortedSet) this.f4270j).subSet(obj, obj2), this.f4271k);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C1011v1(((SortedSet) this.f4270j).tailSet(obj), this.f4271k);
    }
}
