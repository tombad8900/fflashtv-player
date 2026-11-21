package p130p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p.d */
/* loaded from: classes.dex */
public final class C2185d implements Collection {

    /* renamed from: j */
    public final /* synthetic */ C2186e f7630j;

    public C2185d(C2186e c2186e) {
        this.f7630j = c2186e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f7630j.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7630j.m3987a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f7630j.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2182a(this.f7630j, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C2186e c2186e = this.f7630j;
        int iM3987a = c2186e.m3987a(obj);
        if (iM3987a < 0) {
            return false;
        }
        c2186e.mo3994h(iM3987a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2186e c2186e = this.f7630j;
        int i = c2186e.f7656l;
        int i4 = 0;
        boolean z7 = false;
        while (i4 < i) {
            if (collection.contains(c2186e.m3996j(i4))) {
                c2186e.mo3994h(i4);
                i4--;
                i--;
                z7 = true;
            }
            i4++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2186e c2186e = this.f7630j;
        int i = c2186e.f7656l;
        int i4 = 0;
        boolean z7 = false;
        while (i4 < i) {
            if (!collection.contains(c2186e.m3996j(i4))) {
                c2186e.mo3994h(i4);
                i4--;
                i--;
                z7 = true;
            }
            i4++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f7630j.f7656l;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C2186e c2186e = this.f7630j;
        int i = c2186e.f7656l;
        Object[] objArr = new Object[i];
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = c2186e.m3996j(i4);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2186e c2186e = this.f7630j;
        int i = c2186e.f7656l;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = c2186e.m3996j(i4);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
