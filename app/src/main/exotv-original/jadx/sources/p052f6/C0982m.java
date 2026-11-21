package p052f6;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.m */
/* loaded from: classes.dex */
public final class C0982m extends C0958e implements ListIterator {

    /* renamed from: n */
    public final /* synthetic */ C0985n f4214n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0982m(C0985n c0985n) {
        super(c0985n);
        this.f4214n = c0985n;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0985n c0985n = this.f4214n;
        boolean zIsEmpty = c0985n.isEmpty();
        m2162b().add(obj);
        c0985n.f4222o.f4161o++;
        if (zIsEmpty) {
            c0985n.m2172a();
        }
    }

    /* renamed from: b */
    public final ListIterator m2162b() {
        m2138a();
        return (ListIterator) this.f4178k;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m2162b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m2162b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m2162b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m2162b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m2162b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0982m(C0985n c0985n, int i) {
        super(c0985n, ((List) c0985n.f4218k).listIterator(i));
        this.f4214n = c0985n;
    }
}
