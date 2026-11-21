package p052f6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.n */
/* loaded from: classes.dex */
public class C0985n extends AbstractCollection implements List {

    /* renamed from: j */
    public final Object f4217j;

    /* renamed from: k */
    public Collection f4218k;

    /* renamed from: l */
    public final C0985n f4219l;

    /* renamed from: m */
    public final Collection f4220m;

    /* renamed from: n */
    public final /* synthetic */ AbstractC0949b f4221n;

    /* renamed from: o */
    public final /* synthetic */ AbstractC0949b f4222o;

    public C0985n(AbstractC0949b abstractC0949b, Object obj, List list, C0985n c0985n) {
        this.f4222o = abstractC0949b;
        this.f4221n = abstractC0949b;
        this.f4217j = obj;
        this.f4218k = list;
        this.f4219l = c0985n;
        this.f4220m = c0985n == null ? null : c0985n.f4218k;
    }

    /* renamed from: a */
    public final void m2172a() {
        C0985n c0985n = this.f4219l;
        if (c0985n != null) {
            c0985n.m2172a();
        } else {
            this.f4221n.f4160n.put(this.f4217j, this.f4218k);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2173b();
        boolean zIsEmpty = this.f4218k.isEmpty();
        boolean zAdd = this.f4218k.add(obj);
        if (zAdd) {
            this.f4221n.f4161o++;
            if (zIsEmpty) {
                m2172a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f4218k.addAll(collection);
        if (zAddAll) {
            this.f4221n.f4161o += this.f4218k.size() - size;
            if (size == 0) {
                m2172a();
            }
        }
        return zAddAll;
    }

    /* renamed from: b */
    public final void m2173b() {
        Collection collection;
        C0985n c0985n = this.f4219l;
        if (c0985n != null) {
            c0985n.m2173b();
            if (c0985n.f4218k != this.f4220m) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f4218k.isEmpty() || (collection = (Collection) this.f4221n.f4160n.get(this.f4217j)) == null) {
                return;
            }
            this.f4218k = collection;
        }
    }

    /* renamed from: c */
    public final void m2174c() {
        C0985n c0985n = this.f4219l;
        if (c0985n != null) {
            c0985n.m2174c();
        } else if (this.f4218k.isEmpty()) {
            this.f4221n.f4160n.remove(this.f4217j);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f4218k.clear();
        this.f4221n.f4161o -= size;
        m2174c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        m2173b();
        return this.f4218k.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        m2173b();
        return this.f4218k.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m2173b();
        return this.f4218k.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        m2173b();
        return ((List) this.f4218k).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        m2173b();
        return this.f4218k.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m2173b();
        return ((List) this.f4218k).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m2173b();
        return new C0958e(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m2173b();
        return ((List) this.f4218k).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m2173b();
        return new C0982m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m2173b();
        boolean zRemove = this.f4218k.remove(obj);
        if (zRemove) {
            AbstractC0949b abstractC0949b = this.f4221n;
            abstractC0949b.f4161o--;
            m2174c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f4218k.removeAll(collection);
        if (zRemoveAll) {
            this.f4221n.f4161o += this.f4218k.size() - size;
            m2174c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f4218k.retainAll(collection);
        if (zRetainAll) {
            this.f4221n.f4161o += this.f4218k.size() - size;
            m2174c();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m2173b();
        return ((List) this.f4218k).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        m2173b();
        return this.f4218k.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i4) {
        m2173b();
        List listSubList = ((List) this.f4218k).subList(i, i4);
        C0985n c0985n = this.f4219l;
        if (c0985n == null) {
            c0985n = this;
        }
        boolean z7 = listSubList instanceof RandomAccess;
        AbstractC0949b abstractC0949b = this.f4222o;
        Object obj = this.f4217j;
        return z7 ? new C0973j(abstractC0949b, obj, listSubList, c0985n) : new C0985n(abstractC0949b, obj, listSubList, c0985n);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m2173b();
        return this.f4218k.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m2173b();
        return new C0982m(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m2173b();
        Object objRemove = ((List) this.f4218k).remove(i);
        AbstractC0949b abstractC0949b = this.f4222o;
        abstractC0949b.f4161o--;
        m2174c();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m2173b();
        boolean zIsEmpty = this.f4218k.isEmpty();
        ((List) this.f4218k).add(i, obj);
        this.f4222o.f4161o++;
        if (zIsEmpty) {
            m2172a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f4218k).addAll(i, collection);
        if (zAddAll) {
            this.f4222o.f4161o += this.f4218k.size() - size;
            if (size == 0) {
                m2172a();
            }
        }
        return zAddAll;
    }
}
