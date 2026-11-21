package p130p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p008a7.InterfaceC0113a;
import p111m6.AbstractC1912g;
import p139q.AbstractC2239a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p.f */
/* loaded from: classes.dex */
public final class C2187f implements Collection, Set, InterfaceC0113a {

    /* renamed from: j */
    public int[] f7634j = AbstractC2239a.f7768a;

    /* renamed from: k */
    public Object[] f7635k = AbstractC2239a.f7769b;

    /* renamed from: l */
    public int f7636l;

    public C2187f(int i) {
        if (i > 0) {
            AbstractC2190i.m3971a(this, i);
        }
    }

    /* renamed from: a */
    public final Object m3963a(int i) {
        int i4 = this.f7636l;
        Object[] objArr = this.f7635k;
        Object obj = objArr[i];
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i8 = i4 - 1;
        int[] iArr = this.f7634j;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i < i8) {
                int i9 = i + 1;
                AbstractC1912g.m3727k0(i, i9, i4, iArr, iArr);
                Object[] objArr2 = this.f7635k;
                AbstractC1912g.m3728l0(i, i9, i4, objArr2, objArr2);
            }
            this.f7635k[i8] = null;
        } else {
            int i10 = i4 > 8 ? i4 + (i4 >> 1) : 8;
            int[] iArr2 = new int[i10];
            this.f7634j = iArr2;
            this.f7635k = new Object[i10];
            if (i > 0) {
                AbstractC1912g.m3727k0(0, 0, i, iArr, iArr2);
                AbstractC1912g.m3729m0(0, i, 6, objArr, this.f7635k);
            }
            if (i < i8) {
                int i11 = i + 1;
                AbstractC1912g.m3727k0(i, i11, i4, iArr, this.f7634j);
                AbstractC1912g.m3728l0(i, i11, i4, objArr, this.f7635k);
            }
        }
        if (i4 != this.f7636l) {
            throw new ConcurrentModificationException();
        }
        this.f7636l = i8;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM3972b;
        int i4 = this.f7636l;
        if (obj == null) {
            iM3972b = AbstractC2190i.m3972b(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM3972b = AbstractC2190i.m3972b(this, obj, iHashCode);
        }
        if (iM3972b >= 0) {
            return false;
        }
        int i8 = ~iM3972b;
        int[] iArr = this.f7634j;
        if (i4 >= iArr.length) {
            int i9 = 8;
            if (i4 >= 8) {
                i9 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i9 = 4;
            }
            Object[] objArr = this.f7635k;
            int[] iArr2 = new int[i9];
            this.f7634j = iArr2;
            this.f7635k = new Object[i9];
            if (i4 != this.f7636l) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC1912g.m3727k0(0, 0, iArr.length, iArr, iArr2);
                AbstractC1912g.m3729m0(0, objArr.length, 6, objArr, this.f7635k);
            }
        }
        if (i8 < i4) {
            int[] iArr3 = this.f7634j;
            int i10 = i8 + 1;
            AbstractC1912g.m3727k0(i10, i8, i4, iArr3, iArr3);
            Object[] objArr2 = this.f7635k;
            AbstractC1912g.m3728l0(i10, i8, i4, objArr2, objArr2);
        }
        int i11 = this.f7636l;
        if (i4 == i11) {
            int[] iArr4 = this.f7634j;
            if (i8 < iArr4.length) {
                iArr4[i8] = i;
                this.f7635k[i8] = obj;
                this.f7636l = i11 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        int size = collection.size() + this.f7636l;
        int i = this.f7636l;
        int[] iArr = this.f7634j;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f7635k;
            int[] iArr2 = new int[size];
            this.f7634j = iArr2;
            this.f7635k = new Object[size];
            if (i > 0) {
                AbstractC1912g.m3727k0(0, 0, i, iArr, iArr2);
                AbstractC1912g.m3729m0(0, this.f7636l, 6, objArr, this.f7635k);
            }
        }
        if (this.f7636l != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f7636l != 0) {
            this.f7634j = AbstractC2239a.f7768a;
            this.f7635k = AbstractC2239a.f7769b;
            this.f7636l = 0;
        }
        if (this.f7636l != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC2190i.m3972b(this, null, 0) : AbstractC2190i.m3972b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f7636l != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f7636l;
            for (int i4 = 0; i4 < i; i4++) {
                if (!((Set) obj).contains(this.f7635k[i4])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f7634j;
        int i = this.f7636l;
        int i4 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            i4 += iArr[i8];
        }
        return i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7636l <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2182a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM3972b = obj == null ? AbstractC2190i.m3972b(this, null, 0) : AbstractC2190i.m3972b(this, obj, obj.hashCode());
        if (iM3972b < 0) {
            return false;
        }
        m3963a(iM3972b);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        boolean z7 = false;
        for (int i = this.f7636l - 1; -1 < i; i--) {
            if (!collection.contains(this.f7635k[i])) {
                m3963a(i);
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f7636l;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC1912g.m3731o0(this.f7635k, 0, this.f7636l);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7636l * 14);
        sb.append('{');
        int i = this.f7636l;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = this.f7635k[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC2980h.m5135d("StringBuilder(capacity).\u2026builderAction).toString()", string);
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        AbstractC2980h.m5136e("array", objArr);
        int i = this.f7636l;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC1912g.m3728l0(0, 0, this.f7636l, this.f7635k, objArr);
        return objArr;
    }
}
