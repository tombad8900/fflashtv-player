package p052f6;

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.c1 */
/* loaded from: classes.dex */
public final class C0954c1 extends AbstractC1020y1 implements ListIterator {

    /* renamed from: k */
    public final /* synthetic */ int f4169k;

    /* renamed from: l */
    public final /* synthetic */ AbstractList f4170l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0954c1(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f4169k = i;
        this.f4170l = abstractList;
    }

    @Override // p052f6.AbstractC1020y1
    /* renamed from: a */
    public final Object mo2137a(Object obj) {
        switch (this.f4169k) {
            case 0:
                return ((C0957d1) this.f4170l).f4176k.apply(obj);
            default:
                return ((C0960e1) this.f4170l).f4183k.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f4295j).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f4295j).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo2137a(((ListIterator) this.f4295j).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f4295j).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
