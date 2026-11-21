package p052f6;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC0968h0 extends AbstractCollection implements Serializable {

    /* renamed from: j */
    public static final Object[] f4195j = new Object[0];

    /* renamed from: a */
    public AbstractC0983m0 mo2150a() {
        if (isEmpty()) {
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            return C0981l1.f4211n;
        }
        Object[] array = toArray(f4195j);
        C0977k0 c0977k02 = AbstractC0983m0.f4215k;
        return AbstractC0983m0.m2163h(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo2151b(int i, Object[] objArr) {
        AbstractC1023z1 it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    /* renamed from: c */
    public Object[] mo2152c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    public int mo2153d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public int mo2154e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public abstract boolean mo2155f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC1023z1 iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f4195j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo2152c = mo2152c();
            if (objArrMo2152c != null) {
                return Arrays.copyOfRange(objArrMo2152c, mo2154e(), mo2153d(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo2151b(0, objArr);
        return objArr;
    }
}
