package p119n6;

import android.support.v4.media.session.AbstractC0120b;
import com.bumptech.glide.AbstractC0715d;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p002a1.AbstractC0008a1;
import p111m6.AbstractC1909d;
import p111m6.AbstractC1912g;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n6.c */
/* loaded from: classes.dex */
public final class C2023c extends AbstractC1909d implements RandomAccess, Serializable {

    /* renamed from: m */
    public static final C2023c f7463m;

    /* renamed from: j */
    public Object[] f7464j;

    /* renamed from: k */
    public int f7465k;

    /* renamed from: l */
    public boolean f7466l;

    static {
        C2023c c2023c = new C2023c(0);
        c2023c.f7466l = true;
        f7463m = c2023c;
    }

    public C2023c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f7464j = new Object[i];
    }

    @Override // p111m6.AbstractC1909d
    /* renamed from: a */
    public final int mo3715a() {
        return this.f7465k;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3904f();
        int i = this.f7465k;
        ((AbstractList) this).modCount++;
        m3905g(i, 1);
        this.f7464j[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        m3904f();
        int size = collection.size();
        m3902d(this.f7465k, collection, size);
        return size > 0;
    }

    @Override // p111m6.AbstractC1909d
    /* renamed from: b */
    public final Object mo3716b(int i) {
        m3904f();
        int i4 = this.f7465k;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
        }
        return m3906h(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3904f();
        m3907i(0, this.f7465k);
    }

    /* renamed from: d */
    public final void m3902d(int i, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        m3905g(i, i4);
        Iterator it = collection.iterator();
        for (int i8 = 0; i8 < i4; i8++) {
            this.f7464j[i + i8] = it.next();
        }
    }

    /* renamed from: e */
    public final void m3903e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m3905g(i, 1);
        this.f7464j[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f7464j;
            int i = this.f7465k;
            if (i == list.size()) {
                for (int i4 = 0; i4 < i; i4++) {
                    if (AbstractC2980h.m5132a(objArr[i4], list.get(i4))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m3904f() {
        if (this.f7466l) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    public final void m3905g(int i, int i4) {
        int i8 = this.f7465k + i4;
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f7464j;
        if (i8 > objArr.length) {
            int length = objArr.length;
            int i9 = length + (length >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - 2147483639 > 0) {
                i9 = i8 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i9);
            AbstractC2980h.m5135d("copyOf(...)", objArrCopyOf);
            this.f7464j = objArrCopyOf;
        }
        Object[] objArr2 = this.f7464j;
        AbstractC1912g.m3728l0(i + i4, i, this.f7465k, objArr2, objArr2);
        this.f7465k += i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i4 = this.f7465k;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
        }
        return this.f7464j[i];
    }

    /* renamed from: h */
    public final Object m3906h(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f7464j;
        Object obj = objArr[i];
        AbstractC1912g.m3728l0(i, i + 1, this.f7465k, objArr, objArr);
        Object[] objArr2 = this.f7464j;
        int i4 = this.f7465k - 1;
        AbstractC2980h.m5136e("<this>", objArr2);
        objArr2[i4] = null;
        this.f7465k--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f7464j;
        int i = this.f7465k;
        int iHashCode = 1;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj = objArr[i4];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* renamed from: i */
    public final void m3907i(int i, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f7464j;
        AbstractC1912g.m3728l0(i, i + i4, this.f7465k, objArr, objArr);
        Object[] objArr2 = this.f7464j;
        int i8 = this.f7465k;
        AbstractC0715d.m1556d0(objArr2, i8 - i4, i8);
        this.f7465k -= i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f7465k; i++) {
            if (AbstractC2980h.m5132a(this.f7464j[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f7465k == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: j */
    public final int m3908j(int i, int i4, Collection collection, boolean z7) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < i4) {
            int i10 = i + i8;
            if (collection.contains(this.f7464j[i10]) == z7) {
                Object[] objArr = this.f7464j;
                i8++;
                objArr[i9 + i] = objArr[i10];
                i9++;
            } else {
                i8++;
            }
        }
        int i11 = i4 - i9;
        Object[] objArr2 = this.f7464j;
        AbstractC1912g.m3728l0(i + i9, i4 + i, this.f7465k, objArr2, objArr2);
        Object[] objArr3 = this.f7464j;
        int i12 = this.f7465k;
        AbstractC0715d.m1556d0(objArr3, i12 - i11, i12);
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f7465k -= i11;
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f7465k - 1; i >= 0; i--) {
            if (AbstractC2980h.m5132a(this.f7464j[i], obj)) {
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
        m3904f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo3716b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        m3904f();
        return m3908j(0, this.f7465k, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        m3904f();
        return m3908j(0, this.f7465k, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3904f();
        int i4 = this.f7465k;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
        }
        Object[] objArr = this.f7464j;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        AbstractC0120b.m412h(i, i4, this.f7465k);
        return new C2022b(this.f7464j, i, i4 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC2980h.m5136e("array", objArr);
        int length = objArr.length;
        int i = this.f7465k;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f7464j, 0, i, objArr.getClass());
            AbstractC2980h.m5135d("copyOfRange(...)", objArrCopyOfRange);
            return objArrCopyOfRange;
        }
        AbstractC1912g.m3728l0(0, 0, i, this.f7464j, objArr);
        int i4 = this.f7465k;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0715d.m1555d(this.f7464j, 0, this.f7465k, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i4 = this.f7465k;
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
        }
        return new C2021a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        m3904f();
        int i4 = this.f7465k;
        if (i >= 0 && i <= i4) {
            int size = collection.size();
            m3902d(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m3904f();
        int i4 = this.f7465k;
        if (i >= 0 && i <= i4) {
            ((AbstractList) this).modCount++;
            m3905g(i, 1);
            this.f7464j[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC1912g.m3731o0(this.f7464j, 0, this.f7465k);
    }
}
