package p119n6;

import android.support.v4.media.session.AbstractC0120b;
import com.bumptech.glide.AbstractC0715d;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p002a1.AbstractC0008a1;
import p111m6.AbstractC1909d;
import p111m6.AbstractC1912g;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n6.b */
/* loaded from: classes.dex */
public final class C2022b extends AbstractC1909d implements RandomAccess, Serializable {

    /* renamed from: j */
    public Object[] f7458j;

    /* renamed from: k */
    public final int f7459k;

    /* renamed from: l */
    public int f7460l;

    /* renamed from: m */
    public final C2022b f7461m;

    /* renamed from: n */
    public final C2023c f7462n;

    public C2022b(Object[] objArr, int i, int i4, C2022b c2022b, C2023c c2023c) {
        AbstractC2980h.m5136e("backing", objArr);
        AbstractC2980h.m5136e("root", c2023c);
        this.f7458j = objArr;
        this.f7459k = i;
        this.f7460l = i4;
        this.f7461m = c2022b;
        this.f7462n = c2023c;
        ((AbstractList) this).modCount = ((AbstractList) c2023c).modCount;
    }

    @Override // p111m6.AbstractC1909d
    /* renamed from: a */
    public final int mo3715a() {
        m3896f();
        return this.f7460l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3897g();
        m3896f();
        m3895e(this.f7459k + this.f7460l, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        m3897g();
        m3896f();
        int size = collection.size();
        m3894d(this.f7459k + this.f7460l, collection, size);
        return size > 0;
    }

    @Override // p111m6.AbstractC1909d
    /* renamed from: b */
    public final Object mo3716b(int i) {
        m3897g();
        m3896f();
        int i4 = this.f7460l;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
        }
        return m3898h(this.f7459k + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3897g();
        m3896f();
        m3899i(this.f7459k, this.f7460l);
    }

    /* renamed from: d */
    public final void m3894d(int i, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        C2023c c2023c = this.f7462n;
        C2022b c2022b = this.f7461m;
        if (c2022b != null) {
            c2022b.m3894d(i, collection, i4);
        } else {
            C2023c c2023c2 = C2023c.f7463m;
            c2023c.m3902d(i, collection, i4);
        }
        this.f7458j = c2023c.f7464j;
        this.f7460l += i4;
    }

    /* renamed from: e */
    public final void m3895e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C2023c c2023c = this.f7462n;
        C2022b c2022b = this.f7461m;
        if (c2022b != null) {
            c2022b.m3895e(i, obj);
        } else {
            C2023c c2023c2 = C2023c.f7463m;
            c2023c.m3903e(i, obj);
        }
        this.f7458j = c2023c.f7464j;
        this.f7460l++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m3896f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f7458j;
            int i = this.f7460l;
            if (i == list.size()) {
                for (int i4 = 0; i4 < i; i4++) {
                    if (AbstractC2980h.m5132a(objArr[this.f7459k + i4], list.get(i4))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m3896f() {
        if (((AbstractList) this.f7462n).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public final void m3897g() {
        if (this.f7462n.f7466l) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3896f();
        int i4 = this.f7460l;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
        }
        return this.f7458j[this.f7459k + i];
    }

    /* renamed from: h */
    public final Object m3898h(int i) {
        Object objM3906h;
        ((AbstractList) this).modCount++;
        C2022b c2022b = this.f7461m;
        if (c2022b != null) {
            objM3906h = c2022b.m3898h(i);
        } else {
            C2023c c2023c = C2023c.f7463m;
            objM3906h = this.f7462n.m3906h(i);
        }
        this.f7460l--;
        return objM3906h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m3896f();
        Object[] objArr = this.f7458j;
        int i = this.f7460l;
        int iHashCode = 1;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj = objArr[this.f7459k + i4];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* renamed from: i */
    public final void m3899i(int i, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        C2022b c2022b = this.f7461m;
        if (c2022b != null) {
            c2022b.m3899i(i, i4);
        } else {
            C2023c c2023c = C2023c.f7463m;
            this.f7462n.m3907i(i, i4);
        }
        this.f7460l -= i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m3896f();
        for (int i = 0; i < this.f7460l; i++) {
            if (AbstractC2980h.m5132a(this.f7458j[this.f7459k + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m3896f();
        return this.f7460l == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: j */
    public final int m3900j(int i, int i4, Collection collection, boolean z7) {
        int iM3908j;
        C2022b c2022b = this.f7461m;
        if (c2022b != null) {
            iM3908j = c2022b.m3900j(i, i4, collection, z7);
        } else {
            C2023c c2023c = C2023c.f7463m;
            iM3908j = this.f7462n.m3908j(i, i4, collection, z7);
        }
        if (iM3908j > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f7460l -= iM3908j;
        return iM3908j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m3896f();
        for (int i = this.f7460l - 1; i >= 0; i--) {
            if (AbstractC2980h.m5132a(this.f7458j[this.f7459k + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3897g();
        m3896f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo3716b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        m3897g();
        m3896f();
        return m3900j(this.f7459k, this.f7460l, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        m3897g();
        m3896f();
        return m3900j(this.f7459k, this.f7460l, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3897g();
        m3896f();
        int i4 = this.f7460l;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
        }
        Object[] objArr = this.f7458j;
        int i8 = this.f7459k;
        Object obj2 = objArr[i8 + i];
        objArr[i8 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        AbstractC0120b.m412h(i, i4, this.f7460l);
        return new C2022b(this.f7458j, this.f7459k + i, i4 - i, this, this.f7462n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC2980h.m5136e("array", objArr);
        m3896f();
        int length = objArr.length;
        int i = this.f7460l;
        int i4 = this.f7459k;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f7458j, i4, i + i4, objArr.getClass());
            AbstractC2980h.m5135d("copyOfRange(...)", objArrCopyOfRange);
            return objArrCopyOfRange;
        }
        AbstractC1912g.m3728l0(0, i4, i + i4, this.f7458j, objArr);
        int i8 = this.f7460l;
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m3896f();
        return AbstractC0715d.m1555d(this.f7458j, this.f7459k, this.f7460l, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m3896f();
        int i4 = this.f7460l;
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
        }
        return new C2021a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m3897g();
        m3896f();
        int i4 = this.f7460l;
        if (i >= 0 && i <= i4) {
            m3895e(this.f7459k + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        m3897g();
        m3896f();
        int i4 = this.f7460l;
        if (i >= 0 && i <= i4) {
            int size = collection.size();
            m3894d(this.f7459k + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m3896f();
        Object[] objArr = this.f7458j;
        int i = this.f7460l;
        int i4 = this.f7459k;
        return AbstractC1912g.m3731o0(objArr, i4, i + i4);
    }
}
