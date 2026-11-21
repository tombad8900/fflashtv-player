package p052f6;

import com.bumptech.glide.AbstractC0714c;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.a */
/* loaded from: classes.dex */
public abstract class AbstractC0946a extends AbstractC1023z1 implements ListIterator {

    /* renamed from: j */
    public final int f4155j;

    /* renamed from: k */
    public int f4156k;

    public AbstractC0946a(int i, int i4) {
        AbstractC0714c.m1530p(i4, i);
        this.f4155j = i;
        this.f4156k = i4;
    }

    /* renamed from: a */
    public abstract Object mo2124a(int i);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4156k < this.f4155j;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4156k > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f4156k;
        this.f4156k = i + 1;
        return mo2124a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4156k;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f4156k - 1;
        this.f4156k = i;
        return mo2124a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4156k - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
