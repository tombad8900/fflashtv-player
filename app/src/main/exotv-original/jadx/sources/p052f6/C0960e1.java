package p052f6;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import p043e6.InterfaceC0916d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.e1 */
/* loaded from: classes.dex */
public final class C0960e1 extends AbstractSequentialList implements Serializable {

    /* renamed from: j */
    public final List f4182j;

    /* renamed from: k */
    public final InterfaceC0916d f4183k;

    public C0960e1(InterfaceC0916d interfaceC0916d, List list) {
        list.getClass();
        this.f4182j = list;
        this.f4183k = interfaceC0916d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4182j.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C0954c1(this, this.f4182j.listIterator(i), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        this.f4182j.subList(i, i4).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4182j.size();
    }
}
