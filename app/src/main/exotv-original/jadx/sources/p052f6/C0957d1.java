package p052f6;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p043e6.InterfaceC0916d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.d1 */
/* loaded from: classes.dex */
public final class C0957d1 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: j */
    public final List f4175j;

    /* renamed from: k */
    public final InterfaceC0916d f4176k;

    public C0957d1(InterfaceC0916d interfaceC0916d, List list) {
        list.getClass();
        this.f4175j = list;
        this.f4176k = interfaceC0916d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f4176k.apply(this.f4175j.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4175j.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C0954c1(this, this.f4175j.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f4176k.apply(this.f4175j.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        this.f4175j.subList(i, i4).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4175j.size();
    }
}
