package p075i6;

import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i6.b */
/* loaded from: classes.dex */
public final class C1275b extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: j */
    public final int[] f5301j;

    /* renamed from: k */
    public final int f5302k;

    /* renamed from: l */
    public final int f5303l;

    public C1275b(int i, int i4, int[] iArr) {
        this.f5301j = iArr;
        this.f5302k = i;
        this.f5303l = i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return AbstractC0715d.m1544M(this.f5301j, ((Integer) obj).intValue(), this.f5302k, this.f5303l) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1275b)) {
            return super.equals(obj);
        }
        C1275b c1275b = (C1275b) obj;
        int size = size();
        if (c1275b.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f5301j[this.f5302k + i] != c1275b.f5301j[c1275b.f5302k + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        AbstractC0714c.m1527m(i, size());
        return Integer.valueOf(this.f5301j[this.f5302k + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = this.f5302k; i4 < this.f5303l; i4++) {
            i = (i * 31) + this.f5301j[i4];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f5303l;
        int[] iArr = this.f5301j;
        int i4 = this.f5302k;
        int iM1544M = AbstractC0715d.m1544M(iArr, iIntValue, i4, i);
        if (iM1544M >= 0) {
            return iM1544M - i4;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i4 = this.f5303l;
            while (true) {
                i4--;
                i = this.f5302k;
                if (i4 < i) {
                    i4 = -1;
                    break;
                }
                if (this.f5301j[i4] == iIntValue) {
                    break;
                }
            }
            if (i4 >= 0) {
                return i4 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        AbstractC0714c.m1527m(i, size());
        int i4 = this.f5302k + i;
        int[] iArr = this.f5301j;
        int i8 = iArr[i4];
        num.getClass();
        iArr[i4] = num.intValue();
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5303l - this.f5302k;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        AbstractC0714c.m1531q(i, i4, size());
        if (i == i4) {
            return Collections.EMPTY_LIST;
        }
        int i8 = this.f5302k;
        return new C1275b(i + i8, i8 + i4, this.f5301j);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f5301j;
        int i = this.f5302k;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.f5303l) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
