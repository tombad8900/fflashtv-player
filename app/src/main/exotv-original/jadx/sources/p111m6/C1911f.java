package p111m6;

import android.support.v4.media.session.AbstractC0120b;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002a1.AbstractC0008a1;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m6.f */
/* loaded from: classes.dex */
public final class C1911f extends AbstractC1909d {

    /* renamed from: m */
    public static final Object[] f7182m = new Object[0];

    /* renamed from: j */
    public int f7183j;

    /* renamed from: k */
    public Object[] f7184k = f7182m;

    /* renamed from: l */
    public int f7185l;

    @Override // p111m6.AbstractC1909d
    /* renamed from: a */
    public final int mo3715a() {
        return this.f7185l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i4 = this.f7185l;
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
        }
        if (i == i4) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m3723i();
        m3718d(this.f7185l + 1);
        int iM3722h = m3722h(this.f7183j + i);
        int i8 = this.f7185l;
        if (i < ((i8 + 1) >> 1)) {
            if (iM3722h == 0) {
                Object[] objArr = this.f7184k;
                AbstractC2980h.m5136e("<this>", objArr);
                iM3722h = objArr.length;
            }
            int i9 = iM3722h - 1;
            int i10 = this.f7183j;
            if (i10 == 0) {
                Object[] objArr2 = this.f7184k;
                AbstractC2980h.m5136e("<this>", objArr2);
                length = objArr2.length - 1;
            } else {
                length = i10 - 1;
            }
            int i11 = this.f7183j;
            if (i9 >= i11) {
                Object[] objArr3 = this.f7184k;
                objArr3[length] = objArr3[i11];
                AbstractC1912g.m3728l0(i11, i11 + 1, i9 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f7184k;
                AbstractC1912g.m3728l0(i11 - 1, i11, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f7184k;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC1912g.m3728l0(0, 1, i9 + 1, objArr5, objArr5);
            }
            this.f7184k[i9] = obj;
            this.f7183j = length;
        } else {
            int iM3722h2 = m3722h(i8 + this.f7183j);
            if (iM3722h < iM3722h2) {
                Object[] objArr6 = this.f7184k;
                AbstractC1912g.m3728l0(iM3722h + 1, iM3722h, iM3722h2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f7184k;
                AbstractC1912g.m3728l0(1, 0, iM3722h2, objArr7, objArr7);
                Object[] objArr8 = this.f7184k;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC1912g.m3728l0(iM3722h + 1, iM3722h, objArr8.length - 1, objArr8, objArr8);
            }
            this.f7184k[iM3722h] = obj;
        }
        this.f7185l++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        int i4 = this.f7185l;
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f7185l) {
            return addAll(collection);
        }
        m3723i();
        m3718d(collection.size() + this.f7185l);
        int iM3722h = m3722h(this.f7185l + this.f7183j);
        int iM3722h2 = m3722h(this.f7183j + i);
        int size = collection.size();
        if (i >= ((this.f7185l + 1) >> 1)) {
            int i8 = iM3722h2 + size;
            if (iM3722h2 < iM3722h) {
                int i9 = size + iM3722h;
                Object[] objArr = this.f7184k;
                if (i9 <= objArr.length) {
                    AbstractC1912g.m3728l0(i8, iM3722h2, iM3722h, objArr, objArr);
                } else if (i8 >= objArr.length) {
                    AbstractC1912g.m3728l0(i8 - objArr.length, iM3722h2, iM3722h, objArr, objArr);
                } else {
                    int length = iM3722h - (i9 - objArr.length);
                    AbstractC1912g.m3728l0(0, length, iM3722h, objArr, objArr);
                    Object[] objArr2 = this.f7184k;
                    AbstractC1912g.m3728l0(i8, iM3722h2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f7184k;
                AbstractC1912g.m3728l0(size, 0, iM3722h, objArr3, objArr3);
                Object[] objArr4 = this.f7184k;
                if (i8 >= objArr4.length) {
                    AbstractC1912g.m3728l0(i8 - objArr4.length, iM3722h2, objArr4.length, objArr4, objArr4);
                } else {
                    AbstractC1912g.m3728l0(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f7184k;
                    AbstractC1912g.m3728l0(i8, iM3722h2, objArr5.length - size, objArr5, objArr5);
                }
            }
            m3717c(iM3722h2, collection);
            return true;
        }
        int i10 = this.f7183j;
        int length2 = i10 - size;
        if (iM3722h2 < i10) {
            Object[] objArr6 = this.f7184k;
            AbstractC1912g.m3728l0(length2, i10, objArr6.length, objArr6, objArr6);
            if (size >= iM3722h2) {
                Object[] objArr7 = this.f7184k;
                AbstractC1912g.m3728l0(objArr7.length - size, 0, iM3722h2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f7184k;
                AbstractC1912g.m3728l0(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f7184k;
                AbstractC1912g.m3728l0(0, size, iM3722h2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f7184k;
            AbstractC1912g.m3728l0(length2, i10, iM3722h2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f7184k;
            length2 += objArr11.length;
            int i11 = iM3722h2 - i10;
            int length3 = objArr11.length - length2;
            if (length3 >= i11) {
                AbstractC1912g.m3728l0(length2, i10, iM3722h2, objArr11, objArr11);
            } else {
                AbstractC1912g.m3728l0(length2, i10, i10 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f7184k;
                AbstractC1912g.m3728l0(0, this.f7183j + length3, iM3722h2, objArr12, objArr12);
            }
        }
        this.f7183j = length2;
        m3717c(m3720f(iM3722h2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m3723i();
        m3718d(this.f7185l + 1);
        int length = this.f7183j;
        if (length == 0) {
            Object[] objArr = this.f7184k;
            AbstractC2980h.m5136e("<this>", objArr);
            length = objArr.length;
        }
        int i = length - 1;
        this.f7183j = i;
        this.f7184k[i] = obj;
        this.f7185l++;
    }

    public final void addLast(Object obj) {
        m3723i();
        m3718d(mo3715a() + 1);
        this.f7184k[m3722h(mo3715a() + this.f7183j)] = obj;
        this.f7185l = mo3715a() + 1;
    }

    @Override // p111m6.AbstractC1909d
    /* renamed from: b */
    public final Object mo3716b(int i) {
        int i4 = this.f7185l;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
        }
        if (i == AbstractC1914i.m3752s0(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m3723i();
        int iM3722h = m3722h(this.f7183j + i);
        Object[] objArr = this.f7184k;
        Object obj = objArr[iM3722h];
        if (i < (this.f7185l >> 1)) {
            int i8 = this.f7183j;
            if (iM3722h >= i8) {
                AbstractC1912g.m3728l0(i8 + 1, i8, iM3722h, objArr, objArr);
            } else {
                AbstractC1912g.m3728l0(1, 0, iM3722h, objArr, objArr);
                Object[] objArr2 = this.f7184k;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i9 = this.f7183j;
                AbstractC1912g.m3728l0(i9 + 1, i9, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f7184k;
            int i10 = this.f7183j;
            objArr3[i10] = null;
            this.f7183j = m3719e(i10);
        } else {
            int iM3722h2 = m3722h(AbstractC1914i.m3752s0(this) + this.f7183j);
            if (iM3722h <= iM3722h2) {
                Object[] objArr4 = this.f7184k;
                AbstractC1912g.m3728l0(iM3722h, iM3722h + 1, iM3722h2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f7184k;
                AbstractC1912g.m3728l0(iM3722h, iM3722h + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f7184k;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC1912g.m3728l0(0, 1, iM3722h2 + 1, objArr6, objArr6);
            }
            this.f7184k[iM3722h2] = null;
        }
        this.f7185l--;
        return obj;
    }

    /* renamed from: c */
    public final void m3717c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f7184k.length;
        while (i < length && it.hasNext()) {
            this.f7184k[i] = it.next();
            i++;
        }
        int i4 = this.f7183j;
        for (int i8 = 0; i8 < i4 && it.hasNext(); i8++) {
            this.f7184k[i8] = it.next();
        }
        this.f7185l = collection.size() + this.f7185l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m3723i();
            m3721g(this.f7183j, m3722h(mo3715a() + this.f7183j));
        }
        this.f7183j = 0;
        this.f7185l = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m3718d(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f7184k;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f7182m) {
            if (i < 10) {
                i = 10;
            }
            this.f7184k = new Object[i];
            return;
        }
        int length = objArr.length;
        int i4 = length + (length >> 1);
        if (i4 - i < 0) {
            i4 = i;
        }
        if (i4 - 2147483639 > 0) {
            i4 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i4];
        AbstractC1912g.m3728l0(0, this.f7183j, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f7184k;
        int length2 = objArr3.length;
        int i8 = this.f7183j;
        AbstractC1912g.m3728l0(length2 - i8, 0, i8, objArr3, objArr2);
        this.f7183j = 0;
        this.f7184k = objArr2;
    }

    /* renamed from: e */
    public final int m3719e(int i) {
        AbstractC2980h.m5136e("<this>", this.f7184k);
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: f */
    public final int m3720f(int i) {
        return i < 0 ? i + this.f7184k.length : i;
    }

    /* renamed from: g */
    public final void m3721g(int i, int i4) {
        if (i < i4) {
            AbstractC1912g.m3732p0(this.f7184k, i, i4);
            return;
        }
        Object[] objArr = this.f7184k;
        AbstractC1912g.m3732p0(objArr, i, objArr.length);
        AbstractC1912g.m3732p0(this.f7184k, 0, i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo3715a = mo3715a();
        if (i < 0 || i >= iMo3715a) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, iMo3715a, "index: ", ", size: "));
        }
        return this.f7184k[m3722h(this.f7183j + i)];
    }

    /* renamed from: h */
    public final int m3722h(int i) {
        Object[] objArr = this.f7184k;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* renamed from: i */
    public final void m3723i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM3722h = m3722h(mo3715a() + this.f7183j);
        int length = this.f7183j;
        if (length < iM3722h) {
            while (length < iM3722h) {
                if (AbstractC2980h.m5132a(obj, this.f7184k[length])) {
                    i = this.f7183j;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM3722h) {
            return -1;
        }
        int length2 = this.f7184k.length;
        while (true) {
            if (length >= length2) {
                for (int i4 = 0; i4 < iM3722h; i4++) {
                    if (AbstractC2980h.m5132a(obj, this.f7184k[i4])) {
                        length = i4 + this.f7184k.length;
                        i = this.f7183j;
                    }
                }
                return -1;
            }
            if (AbstractC2980h.m5132a(obj, this.f7184k[length])) {
                i = this.f7183j;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo3715a() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM3722h = m3722h(this.f7185l + this.f7183j);
        int i4 = this.f7183j;
        if (i4 < iM3722h) {
            length = iM3722h - 1;
            if (i4 <= length) {
                while (!AbstractC2980h.m5132a(obj, this.f7184k[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.f7183j;
                return length - i;
            }
            return -1;
        }
        if (i4 > iM3722h) {
            int i8 = iM3722h - 1;
            while (true) {
                if (-1 >= i8) {
                    Object[] objArr = this.f7184k;
                    AbstractC2980h.m5136e("<this>", objArr);
                    length = objArr.length - 1;
                    int i9 = this.f7183j;
                    if (i9 <= length) {
                        while (!AbstractC2980h.m5132a(obj, this.f7184k[length])) {
                            if (length != i9) {
                                length--;
                            }
                        }
                        i = this.f7183j;
                    }
                } else {
                    if (AbstractC2980h.m5132a(obj, this.f7184k[i8])) {
                        length = i8 + this.f7184k.length;
                        i = this.f7183j;
                        break;
                    }
                    i8--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo3716b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM3722h;
        AbstractC2980h.m5136e("elements", collection);
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f7184k.length != 0) {
            int iM3722h2 = m3722h(this.f7185l + this.f7183j);
            int i = this.f7183j;
            if (i < iM3722h2) {
                iM3722h = i;
                while (i < iM3722h2) {
                    Object obj = this.f7184k[i];
                    if (collection.contains(obj)) {
                        z7 = true;
                    } else {
                        this.f7184k[iM3722h] = obj;
                        iM3722h++;
                    }
                    i++;
                }
                AbstractC1912g.m3732p0(this.f7184k, iM3722h, iM3722h2);
            } else {
                int length = this.f7184k.length;
                boolean z8 = false;
                int i4 = i;
                while (i < length) {
                    Object[] objArr = this.f7184k;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z8 = true;
                    } else {
                        this.f7184k[i4] = obj2;
                        i4++;
                    }
                    i++;
                }
                iM3722h = m3722h(i4);
                for (int i8 = 0; i8 < iM3722h2; i8++) {
                    Object[] objArr2 = this.f7184k;
                    Object obj3 = objArr2[i8];
                    objArr2[i8] = null;
                    if (collection.contains(obj3)) {
                        z8 = true;
                    } else {
                        this.f7184k[iM3722h] = obj3;
                        iM3722h = m3719e(iM3722h);
                    }
                }
                z7 = z8;
            }
            if (z7) {
                m3723i();
                this.f7185l = m3720f(iM3722h - this.f7183j);
            }
        }
        return z7;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m3723i();
        Object[] objArr = this.f7184k;
        int i = this.f7183j;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f7183j = m3719e(i);
        this.f7185l = mo3715a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m3723i();
        int iM3722h = m3722h(AbstractC1914i.m3752s0(this) + this.f7183j);
        Object[] objArr = this.f7184k;
        Object obj = objArr[iM3722h];
        objArr[iM3722h] = null;
        this.f7185l = mo3715a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        AbstractC0120b.m412h(i, i4, this.f7185l);
        int i8 = i4 - i;
        if (i8 == 0) {
            return;
        }
        if (i8 == this.f7185l) {
            clear();
            return;
        }
        if (i8 == 1) {
            mo3716b(i);
            return;
        }
        m3723i();
        if (i < this.f7185l - i4) {
            int iM3722h = m3722h((i - 1) + this.f7183j);
            int iM3722h2 = m3722h((i4 - 1) + this.f7183j);
            while (i > 0) {
                int i9 = iM3722h + 1;
                int iMin = Math.min(i, Math.min(i9, iM3722h2 + 1));
                Object[] objArr = this.f7184k;
                int i10 = iM3722h2 - iMin;
                int i11 = iM3722h - iMin;
                AbstractC1912g.m3728l0(i10 + 1, i11 + 1, i9, objArr, objArr);
                iM3722h = m3720f(i11);
                iM3722h2 = m3720f(i10);
                i -= iMin;
            }
            int iM3722h3 = m3722h(this.f7183j + i8);
            m3721g(this.f7183j, iM3722h3);
            this.f7183j = iM3722h3;
        } else {
            int iM3722h4 = m3722h(this.f7183j + i4);
            int iM3722h5 = m3722h(this.f7183j + i);
            int i12 = this.f7185l;
            while (true) {
                i12 -= i4;
                if (i12 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f7184k;
                i4 = Math.min(i12, Math.min(objArr2.length - iM3722h4, objArr2.length - iM3722h5));
                Object[] objArr3 = this.f7184k;
                int i13 = iM3722h4 + i4;
                AbstractC1912g.m3728l0(iM3722h5, iM3722h4, i13, objArr3, objArr3);
                iM3722h4 = m3722h(i13);
                iM3722h5 = m3722h(iM3722h5 + i4);
            }
            int iM3722h6 = m3722h(this.f7185l + this.f7183j);
            m3721g(m3720f(iM3722h6 - i8), iM3722h6);
        }
        this.f7185l -= i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM3722h;
        AbstractC2980h.m5136e("elements", collection);
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f7184k.length != 0) {
            int iM3722h2 = m3722h(this.f7185l + this.f7183j);
            int i = this.f7183j;
            if (i < iM3722h2) {
                iM3722h = i;
                while (i < iM3722h2) {
                    Object obj = this.f7184k[i];
                    if (collection.contains(obj)) {
                        this.f7184k[iM3722h] = obj;
                        iM3722h++;
                    } else {
                        z7 = true;
                    }
                    i++;
                }
                AbstractC1912g.m3732p0(this.f7184k, iM3722h, iM3722h2);
            } else {
                int length = this.f7184k.length;
                boolean z8 = false;
                int i4 = i;
                while (i < length) {
                    Object[] objArr = this.f7184k;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f7184k[i4] = obj2;
                        i4++;
                    } else {
                        z8 = true;
                    }
                    i++;
                }
                iM3722h = m3722h(i4);
                for (int i8 = 0; i8 < iM3722h2; i8++) {
                    Object[] objArr2 = this.f7184k;
                    Object obj3 = objArr2[i8];
                    objArr2[i8] = null;
                    if (collection.contains(obj3)) {
                        this.f7184k[iM3722h] = obj3;
                        iM3722h = m3719e(iM3722h);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                m3723i();
                this.f7185l = m3720f(iM3722h - this.f7183j);
            }
        }
        return z7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo3715a = mo3715a();
        if (i < 0 || i >= iMo3715a) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, iMo3715a, "index: ", ", size: "));
        }
        int iM3722h = m3722h(this.f7183j + i);
        Object[] objArr = this.f7184k;
        Object obj2 = objArr[iM3722h];
        objArr[iM3722h] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo3715a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        AbstractC2980h.m5136e("array", objArr);
        int length = objArr.length;
        int i = this.f7185l;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            AbstractC2980h.m5134c("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", objNewInstance);
            objArr = (Object[]) objNewInstance;
        }
        int iM3722h = m3722h(this.f7185l + this.f7183j);
        int i4 = this.f7183j;
        if (i4 < iM3722h) {
            AbstractC1912g.m3729m0(i4, iM3722h, 2, this.f7184k, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f7184k;
            AbstractC1912g.m3728l0(0, this.f7183j, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f7184k;
            AbstractC1912g.m3728l0(objArr3.length - this.f7183j, 0, iM3722h, objArr3, objArr);
        }
        int i8 = this.f7185l;
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        m3723i();
        m3718d(collection.size() + mo3715a());
        m3717c(m3722h(mo3715a() + this.f7183j), collection);
        return true;
    }
}
