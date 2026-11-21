package p130p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p.b */
/* loaded from: classes.dex */
public final class C2183b implements Set {

    /* renamed from: j */
    public final /* synthetic */ C2186e f7625j;

    public C2183b(C2186e c2186e) {
        this.f7625j = c2186e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f7625j.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7625j.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f7625j.m3961k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C2186e c2186e = this.f7625j;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (c2186e.f7656l == set.size()) {
                return c2186e.m3961k(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C2186e c2186e = this.f7625j;
        int iHashCode = 0;
        for (int i = c2186e.f7656l - 1; i >= 0; i--) {
            Object objM3992f = c2186e.m3992f(i);
            iHashCode += objM3992f == null ? 0 : objM3992f.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f7625j.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2182a(this.f7625j, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C2186e c2186e = this.f7625j;
        int iM3990d = c2186e.m3990d(obj);
        if (iM3990d < 0) {
            return false;
        }
        c2186e.mo3994h(iM3990d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f7625j.m3962l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2186e c2186e = this.f7625j;
        int i = c2186e.f7656l;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            if (!collection.contains(c2186e.m3992f(i4))) {
                c2186e.mo3994h(i4);
            }
        }
        return i != c2186e.f7656l;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f7625j.f7656l;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C2186e c2186e = this.f7625j;
        int i = c2186e.f7656l;
        Object[] objArr = new Object[i];
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = c2186e.m3992f(i4);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2186e c2186e = this.f7625j;
        int i = c2186e.f7656l;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = c2186e.m3992f(i4);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
