package p130p;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p002a1.AbstractC0008a1;
import p111m6.AbstractC1912g;
import p139q.AbstractC2239a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p.k */
/* loaded from: classes.dex */
public class C2192k {

    /* renamed from: j */
    public int[] f7654j;

    /* renamed from: k */
    public Object[] f7655k;

    /* renamed from: l */
    public int f7656l;

    public C2192k(int i) {
        this.f7654j = i == 0 ? AbstractC2239a.f7768a : new int[i];
        this.f7655k = i == 0 ? AbstractC2239a.f7769b : new Object[i << 1];
    }

    /* renamed from: a */
    public final int m3987a(Object obj) {
        int i = this.f7656l * 2;
        Object[] objArr = this.f7655k;
        if (obj == null) {
            for (int i4 = 1; i4 < i; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i8 = 1; i8 < i; i8 += 2) {
            if (obj.equals(objArr[i8])) {
                return i8 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final void m3988b(int i) {
        int i4 = this.f7656l;
        int[] iArr = this.f7654j;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            AbstractC2980h.m5135d("copyOf(this, newSize)", iArrCopyOf);
            this.f7654j = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f7655k, i * 2);
            AbstractC2980h.m5135d("copyOf(this, newSize)", objArrCopyOf);
            this.f7655k = objArrCopyOf;
        }
        if (this.f7656l != i4) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public final int m3989c(int i, Object obj) {
        int i4 = this.f7656l;
        if (i4 == 0) {
            return -1;
        }
        int iM4011a = AbstractC2239a.m4011a(i4, i, this.f7654j);
        if (iM4011a < 0 || AbstractC2980h.m5132a(obj, this.f7655k[iM4011a << 1])) {
            return iM4011a;
        }
        int i8 = iM4011a + 1;
        while (i8 < i4 && this.f7654j[i8] == i) {
            if (AbstractC2980h.m5132a(obj, this.f7655k[i8 << 1])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iM4011a - 1; i9 >= 0 && this.f7654j[i9] == i; i9--) {
            if (AbstractC2980h.m5132a(obj, this.f7655k[i9 << 1])) {
                return i9;
            }
        }
        return ~i8;
    }

    public void clear() {
        if (this.f7656l > 0) {
            this.f7654j = AbstractC2239a.f7768a;
            this.f7655k = AbstractC2239a.f7769b;
            this.f7656l = 0;
        }
        if (this.f7656l > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m3990d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m3987a(obj) >= 0;
    }

    /* renamed from: d */
    public final int m3990d(Object obj) {
        return obj == null ? m3991e() : m3989c(obj.hashCode(), obj);
    }

    /* renamed from: e */
    public final int m3991e() {
        int i = this.f7656l;
        if (i == 0) {
            return -1;
        }
        int iM4011a = AbstractC2239a.m4011a(i, 0, this.f7654j);
        if (iM4011a < 0 || this.f7655k[iM4011a << 1] == null) {
            return iM4011a;
        }
        int i4 = iM4011a + 1;
        while (i4 < i && this.f7654j[i4] == 0) {
            if (this.f7655k[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i8 = iM4011a - 1; i8 >= 0 && this.f7654j[i8] == 0; i8--) {
            if (this.f7655k[i8 << 1] == null) {
                return i8;
            }
        }
        return ~i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C2192k) {
                int i = this.f7656l;
                if (i != ((C2192k) obj).f7656l) {
                    return false;
                }
                C2192k c2192k = (C2192k) obj;
                for (int i4 = 0; i4 < i; i4++) {
                    Object objM3992f = m3992f(i4);
                    Object objM3996j = m3996j(i4);
                    Object obj2 = c2192k.get(objM3992f);
                    if (objM3996j == null) {
                        if (obj2 != null || !c2192k.containsKey(objM3992f)) {
                            return false;
                        }
                    } else if (!objM3996j.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f7656l != ((Map) obj).size()) {
                return false;
            }
            int i8 = this.f7656l;
            for (int i9 = 0; i9 < i8; i9++) {
                Object objM3992f2 = m3992f(i9);
                Object objM3996j2 = m3996j(i9);
                Object obj3 = ((Map) obj).get(objM3992f2);
                if (objM3996j2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM3992f2)) {
                        return false;
                    }
                } else if (!objM3996j2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: f */
    public final Object m3992f(int i) {
        if (i < 0 || i >= this.f7656l) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f7655k[i << 1];
    }

    /* renamed from: g */
    public void mo3993g(C2186e c2186e) {
        int i = c2186e.f7656l;
        m3988b(this.f7656l + i);
        if (this.f7656l != 0) {
            for (int i4 = 0; i4 < i; i4++) {
                put(c2186e.m3992f(i4), c2186e.m3996j(i4));
            }
        } else if (i > 0) {
            AbstractC1912g.m3727k0(0, 0, i, c2186e.f7654j, this.f7654j);
            AbstractC1912g.m3728l0(0, 0, i << 1, c2186e.f7655k, this.f7655k);
            this.f7656l = i;
        }
    }

    public Object get(Object obj) {
        int iM3990d = m3990d(obj);
        if (iM3990d >= 0) {
            return this.f7655k[(iM3990d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM3990d = m3990d(obj);
        return iM3990d >= 0 ? this.f7655k[(iM3990d << 1) + 1] : obj2;
    }

    /* renamed from: h */
    public Object mo3994h(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.f7656l)) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f7655k;
        int i8 = i << 1;
        Object obj = objArr[i8 + 1];
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i9 = i4 - 1;
        int[] iArr = this.f7654j;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i < i9) {
                int i10 = i + 1;
                AbstractC1912g.m3727k0(i, i10, i4, iArr, iArr);
                Object[] objArr2 = this.f7655k;
                AbstractC1912g.m3728l0(i8, i10 << 1, i4 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f7655k;
            int i11 = i9 << 1;
            objArr3[i11] = null;
            objArr3[i11 + 1] = null;
        } else {
            int i12 = i4 > 8 ? i4 + (i4 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            AbstractC2980h.m5135d("copyOf(this, newSize)", iArrCopyOf);
            this.f7654j = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f7655k, i12 << 1);
            AbstractC2980h.m5135d("copyOf(this, newSize)", objArrCopyOf);
            this.f7655k = objArrCopyOf;
            if (i4 != this.f7656l) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                AbstractC1912g.m3727k0(0, 0, i, iArr, this.f7654j);
                AbstractC1912g.m3728l0(0, 0, i8, objArr, this.f7655k);
            }
            if (i < i9) {
                int i13 = i + 1;
                AbstractC1912g.m3727k0(i, i13, i4, iArr, this.f7654j);
                AbstractC1912g.m3728l0(i8, i13 << 1, i4 << 1, objArr, this.f7655k);
            }
        }
        if (i4 != this.f7656l) {
            throw new ConcurrentModificationException();
        }
        this.f7656l = i9;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f7654j;
        Object[] objArr = this.f7655k;
        int i = this.f7656l;
        int i4 = 1;
        int i8 = 0;
        int iHashCode = 0;
        while (i8 < i) {
            Object obj = objArr[i4];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i8];
            i8++;
            i4 += 2;
        }
        return iHashCode;
    }

    /* renamed from: i */
    public Object mo3995i(int i, Object obj) {
        if (i < 0 || i >= this.f7656l) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i4 = (i << 1) + 1;
        Object[] objArr = this.f7655k;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f7656l <= 0;
    }

    /* renamed from: j */
    public final Object m3996j(int i) {
        if (i < 0 || i >= this.f7656l) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f7655k[(i << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f7656l;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM3989c = obj != null ? m3989c(iHashCode, obj) : m3991e();
        if (iM3989c >= 0) {
            int i4 = (iM3989c << 1) + 1;
            Object[] objArr = this.f7655k;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i8 = ~iM3989c;
        int[] iArr = this.f7654j;
        if (i >= iArr.length) {
            int i9 = 8;
            if (i >= 8) {
                i9 = (i >> 1) + i;
            } else if (i < 4) {
                i9 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i9);
            AbstractC2980h.m5135d("copyOf(this, newSize)", iArrCopyOf);
            this.f7654j = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f7655k, i9 << 1);
            AbstractC2980h.m5135d("copyOf(this, newSize)", objArrCopyOf);
            this.f7655k = objArrCopyOf;
            if (i != this.f7656l) {
                throw new ConcurrentModificationException();
            }
        }
        if (i8 < i) {
            int[] iArr2 = this.f7654j;
            int i10 = i8 + 1;
            AbstractC1912g.m3727k0(i10, i8, i, iArr2, iArr2);
            Object[] objArr2 = this.f7655k;
            AbstractC1912g.m3728l0(i10 << 1, i8 << 1, this.f7656l << 1, objArr2, objArr2);
        }
        int i11 = this.f7656l;
        if (i == i11) {
            int[] iArr3 = this.f7654j;
            if (i8 < iArr3.length) {
                iArr3[i8] = iHashCode;
                Object[] objArr3 = this.f7655k;
                int i12 = i8 << 1;
                objArr3[i12] = obj;
                objArr3[i12 + 1] = obj2;
                this.f7656l = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM3990d = m3990d(obj);
        if (iM3990d >= 0) {
            return mo3994h(iM3990d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM3990d = m3990d(obj);
        if (iM3990d >= 0) {
            return mo3995i(iM3990d, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f7656l;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7656l * 28);
        sb.append('{');
        int i = this.f7656l;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object objM3992f = m3992f(i4);
            if (objM3992f != sb) {
                sb.append(objM3992f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM3996j = m3996j(i4);
            if (objM3996j != sb) {
                sb.append(objM3996j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC2980h.m5135d("StringBuilder(capacity).\u2026builderAction).toString()", string);
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM3990d = m3990d(obj);
        if (iM3990d < 0 || !AbstractC2980h.m5132a(obj2, m3996j(iM3990d))) {
            return false;
        }
        mo3994h(iM3990d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM3990d = m3990d(obj);
        if (iM3990d < 0 || !AbstractC2980h.m5132a(obj2, m3996j(iM3990d))) {
            return false;
        }
        mo3995i(iM3990d, obj3);
        return true;
    }
}
