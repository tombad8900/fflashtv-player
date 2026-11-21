package p052f6;

import com.bumptech.glide.AbstractC0714c;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import p043e6.InterfaceC0918f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.u1 */
/* loaded from: classes.dex */
public class C1008u1 extends AbstractCollection implements Set {

    /* renamed from: j */
    public final Set f4270j;

    /* renamed from: k */
    public final InterfaceC0918f f4271k;

    public C1008u1(Set set, InterfaceC0918f interfaceC0918f) {
        this.f4270j = set;
        this.f4271k = interfaceC0918f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f4271k.apply(obj)) {
            return this.f4270j.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f4271k.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f4270j.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f4270j;
        boolean z7 = set instanceof RandomAccess;
        InterfaceC0918f interfaceC0918f = this.f4271k;
        if (!z7 || !(set instanceof List)) {
            Iterator it = set.iterator();
            interfaceC0918f.getClass();
            while (it.hasNext()) {
                if (interfaceC0918f.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        interfaceC0918f.getClass();
        int i = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Object obj = list.get(i4);
            if (!interfaceC0918f.apply(obj)) {
                if (i4 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC1006u.m2201p(list, interfaceC0918f, i, i4);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC1006u.m2201p(list, interfaceC0918f, i, i4);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f4270j;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f4271k.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC1006u.m2191f(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC1006u.m2196k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f4270j.iterator();
        InterfaceC0918f interfaceC0918f = this.f4271k;
        AbstractC0714c.m1528n("predicate", interfaceC0918f);
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (interfaceC0918f.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f4270j.iterator();
        it.getClass();
        InterfaceC0918f interfaceC0918f = this.f4271k;
        interfaceC0918f.getClass();
        return new C1016x0(it, interfaceC0918f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f4270j.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f4270j.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f4271k.apply(next) && collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f4270j.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f4271k.apply(next) && !collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f4270j.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f4271k.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C1016x0 c1016x0 = (C1016x0) it;
            if (!c1016x0.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(c1016x0.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C1016x0 c1016x0 = (C1016x0) it;
            if (c1016x0.hasNext()) {
                arrayList.add(c1016x0.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
