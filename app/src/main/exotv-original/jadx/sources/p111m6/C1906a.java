package p111m6;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p002a1.AbstractC0008a1;
import p061g7.C1055b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m6.a */
/* loaded from: classes.dex */
public final class C1906a extends C1055b implements ListIterator {

    /* renamed from: m */
    public final /* synthetic */ AbstractC1908c f7177m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1906a(AbstractC1908c abstractC1908c, int i) {
        super(2, abstractC1908c);
        this.f7177m = abstractC1908c;
        int iMo2621a = abstractC1908c.mo2621a();
        if (i < 0 || i > iMo2621a) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, iMo2621a, "index: ", ", size: "));
        }
        this.f4471k = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4471k > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4471k;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f4471k - 1;
        this.f4471k = i;
        return this.f7177m.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4471k - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
