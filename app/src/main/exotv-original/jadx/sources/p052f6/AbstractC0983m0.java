package p052f6;

import android.support.v4.media.session.AbstractC0120b;
import com.bumptech.glide.AbstractC0714c;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC0983m0 extends AbstractC0968h0 implements List, RandomAccess {

    /* renamed from: k */
    public static final C0977k0 f4215k = new C0977k0(C0981l1.f4211n, 0);

    /* renamed from: h */
    public static C0981l1 m2163h(int i, Object[] objArr) {
        return i == 0 ? C0981l1.f4211n : new C0981l1(i, objArr);
    }

    /* renamed from: i */
    public static C0974j0 m2164i() {
        return new C0974j0(4);
    }

    /* renamed from: j */
    public static AbstractC0983m0 m2165j(Collection collection) {
        if (!(collection instanceof AbstractC0968h0)) {
            Object[] array = collection.toArray();
            AbstractC1006u.m2187b(array.length, array);
            return m2163h(array.length, array);
        }
        AbstractC0983m0 abstractC0983m0Mo2150a = ((AbstractC0968h0) collection).mo2150a();
        if (!abstractC0983m0Mo2150a.mo2155f()) {
            return abstractC0983m0Mo2150a;
        }
        Object[] array2 = abstractC0983m0Mo2150a.toArray(AbstractC0968h0.f4195j);
        return m2163h(array2.length, array2);
    }

    /* renamed from: k */
    public static C0981l1 m2166k(Object[] objArr) {
        if (objArr.length == 0) {
            return C0981l1.f4211n;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC1006u.m2187b(objArr2.length, objArr2);
        return m2163h(objArr2.length, objArr2);
    }

    /* renamed from: m */
    public static C0981l1 m2167m(Long l8, Long l9, Long l10, Long l11, Long l12) {
        Object[] objArr = {l8, l9, l10, l11, l12};
        AbstractC1006u.m2187b(5, objArr);
        return m2163h(5, objArr);
    }

    /* renamed from: n */
    public static C0981l1 m2168n(Object obj) {
        Object[] objArr = {obj};
        AbstractC1006u.m2187b(1, objArr);
        return m2163h(1, objArr);
    }

    /* renamed from: o */
    public static C0981l1 m2169o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC1006u.m2187b(2, objArr);
        return m2163h(2, objArr);
    }

    /* renamed from: p */
    public static C0981l1 m2170p(AbstractC0978k1 abstractC0978k1, AbstractCollection abstractCollection) {
        abstractC0978k1.getClass();
        if (abstractCollection == null) {
            Iterator it = abstractCollection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            abstractCollection = arrayList;
        }
        Object[] array = abstractCollection.toArray();
        AbstractC1006u.m2187b(array.length, array);
        Arrays.sort(array, abstractC0978k1);
        return m2163h(array.length, array);
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: a */
    public final AbstractC0983m0 mo2150a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: b */
    public int mo2151b(int i, Object[] objArr) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i + i4] = get(i4);
        }
        return i + size;
    }

    @Override // p052f6.AbstractC0968h0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && AbstractC0120b.m422r(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (AbstractC0120b.m422r(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: g */
    public final AbstractC1023z1 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i4 = 0; i4 < size; i4++) {
            i = ~(~(get(i4).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // p052f6.AbstractC0968h0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C0977k0 listIterator(int i) {
        AbstractC0714c.m1530p(i, size());
        return isEmpty() ? f4215k : new C0977k0(this, i);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC0983m0 subList(int i, int i4) {
        AbstractC0714c.m1531q(i, i4, size());
        int i8 = i4 - i;
        return i8 == size() ? this : i8 == 0 ? C0981l1.f4211n : new C0980l0(this, i, i8);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
