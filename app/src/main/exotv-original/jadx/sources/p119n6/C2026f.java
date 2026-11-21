package p119n6;

import com.bumptech.glide.AbstractC0715d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p008a7.InterfaceC0115c;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n6.f */
/* loaded from: classes.dex */
public final class C2026f implements Map, Serializable, InterfaceC0115c {

    /* renamed from: w */
    public static final C2026f f7471w;

    /* renamed from: j */
    public Object[] f7472j;

    /* renamed from: k */
    public Object[] f7473k;

    /* renamed from: l */
    public int[] f7474l;

    /* renamed from: m */
    public int[] f7475m;

    /* renamed from: n */
    public int f7476n;

    /* renamed from: o */
    public int f7477o;

    /* renamed from: p */
    public int f7478p;

    /* renamed from: q */
    public int f7479q;

    /* renamed from: r */
    public int f7480r;

    /* renamed from: s */
    public C2027g f7481s;

    /* renamed from: t */
    public C2028h f7482t;

    /* renamed from: u */
    public C2027g f7483u;

    /* renamed from: v */
    public boolean f7484v;

    static {
        C2026f c2026f = new C2026f(0);
        c2026f.f7484v = true;
        f7471w = c2026f;
    }

    public C2026f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f7472j = objArr;
        this.f7473k = null;
        this.f7474l = iArr;
        this.f7475m = new int[iHighestOneBit];
        this.f7476n = 2;
        this.f7477o = 0;
        this.f7478p = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    /* renamed from: a */
    public final int m3910a(Object obj) {
        m3911b();
        while (true) {
            int iM3918i = m3918i(obj);
            int i = this.f7476n * 2;
            int length = this.f7475m.length / 2;
            if (i > length) {
                i = length;
            }
            int i4 = 0;
            while (true) {
                int[] iArr = this.f7475m;
                int i8 = iArr[iM3918i];
                if (i8 <= 0) {
                    int i9 = this.f7477o;
                    Object[] objArr = this.f7472j;
                    if (i9 < objArr.length) {
                        int i10 = i9 + 1;
                        this.f7477o = i10;
                        objArr[i9] = obj;
                        this.f7474l[i9] = iM3918i;
                        iArr[iM3918i] = i10;
                        this.f7480r++;
                        this.f7479q++;
                        if (i4 > this.f7476n) {
                            this.f7476n = i4;
                        }
                        return i9;
                    }
                    m3915f(1);
                } else {
                    if (AbstractC2980h.m5132a(this.f7472j[i8 - 1], obj)) {
                        return -i8;
                    }
                    i4++;
                    if (i4 > i) {
                        m3919j(this.f7475m.length * 2);
                        break;
                    }
                    iM3918i = iM3918i == 0 ? this.f7475m.length - 1 : iM3918i - 1;
                }
            }
        }
    }

    /* renamed from: b */
    public final void m3911b() {
        if (this.f7484v) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final void m3912c(boolean z7) {
        int i;
        Object[] objArr = this.f7473k;
        int i4 = 0;
        int i8 = 0;
        while (true) {
            i = this.f7477o;
            if (i4 >= i) {
                break;
            }
            int[] iArr = this.f7474l;
            int i9 = iArr[i4];
            if (i9 >= 0) {
                Object[] objArr2 = this.f7472j;
                objArr2[i8] = objArr2[i4];
                if (objArr != null) {
                    objArr[i8] = objArr[i4];
                }
                if (z7) {
                    iArr[i8] = i9;
                    this.f7475m[i9] = i8 + 1;
                }
                i8++;
            }
            i4++;
        }
        AbstractC0715d.m1556d0(this.f7472j, i8, i);
        if (objArr != null) {
            AbstractC0715d.m1556d0(objArr, i8, this.f7477o);
        }
        this.f7477o = i8;
    }

    @Override // java.util.Map
    public final void clear() {
        m3911b();
        int i = this.f7477o - 1;
        if (i >= 0) {
            int i4 = 0;
            while (true) {
                int[] iArr = this.f7474l;
                int i8 = iArr[i4];
                if (i8 >= 0) {
                    this.f7475m[i8] = 0;
                    iArr[i4] = -1;
                }
                if (i4 == i) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        AbstractC0715d.m1556d0(this.f7472j, 0, this.f7477o);
        Object[] objArr = this.f7473k;
        if (objArr != null) {
            AbstractC0715d.m1556d0(objArr, 0, this.f7477o);
        }
        this.f7480r = 0;
        this.f7477o = 0;
        this.f7479q++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m3916g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m3917h(obj) >= 0;
    }

    /* renamed from: d */
    public final boolean m3913d(Collection collection) {
        AbstractC2980h.m5136e("m", collection);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!m3914e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m3914e(Map.Entry entry) {
        AbstractC2980h.m5136e("entry", entry);
        int iM3916g = m3916g(entry.getKey());
        if (iM3916g < 0) {
            return false;
        }
        Object[] objArr = this.f7473k;
        AbstractC2980h.m5133b(objArr);
        return AbstractC2980h.m5132a(objArr[iM3916g], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2027g c2027g = this.f7483u;
        if (c2027g != null) {
            return c2027g;
        }
        C2027g c2027g2 = new C2027g(this, 0);
        this.f7483u = c2027g2;
        return c2027g2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f7480r == map.size() && m3913d(map.entrySet());
    }

    /* renamed from: f */
    public final void m3915f(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f7472j;
        int length = objArr.length;
        int i4 = this.f7477o;
        int i8 = length - i4;
        int i9 = i4 - this.f7480r;
        if (i8 < i && i8 + i9 >= i && i9 >= objArr.length / 4) {
            m3912c(true);
            return;
        }
        int i10 = i4 + i;
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > objArr.length) {
            int length2 = objArr.length;
            int i11 = length2 + (length2 >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i11);
            AbstractC2980h.m5135d("copyOf(...)", objArrCopyOf2);
            this.f7472j = objArrCopyOf2;
            Object[] objArr2 = this.f7473k;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i11);
                AbstractC2980h.m5135d("copyOf(...)", objArrCopyOf);
            } else {
                objArrCopyOf = null;
            }
            this.f7473k = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f7474l, i11);
            AbstractC2980h.m5135d("copyOf(...)", iArrCopyOf);
            this.f7474l = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i11 >= 1 ? i11 : 1) * 3);
            if (iHighestOneBit > this.f7475m.length) {
                m3919j(iHighestOneBit);
            }
        }
    }

    /* renamed from: g */
    public final int m3916g(Object obj) {
        int iM3918i = m3918i(obj);
        int i = this.f7476n;
        while (true) {
            int i4 = this.f7475m[iM3918i];
            if (i4 == 0) {
                return -1;
            }
            if (i4 > 0) {
                int i8 = i4 - 1;
                if (AbstractC2980h.m5132a(this.f7472j[i8], obj)) {
                    return i8;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM3918i = iM3918i == 0 ? this.f7475m.length - 1 : iM3918i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM3916g = m3916g(obj);
        if (iM3916g < 0) {
            return null;
        }
        Object[] objArr = this.f7473k;
        AbstractC2980h.m5133b(objArr);
        return objArr[iM3916g];
    }

    /* renamed from: h */
    public final int m3917h(Object obj) {
        int i = this.f7477o;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f7474l[i] >= 0) {
                Object[] objArr = this.f7473k;
                AbstractC2980h.m5133b(objArr);
                if (AbstractC2980h.m5132a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C2024d c2024d = new C2024d(this, 0);
        int i = 0;
        while (c2024d.hasNext()) {
            int i4 = c2024d.f6852j;
            C2026f c2026f = (C2026f) c2024d.f6855m;
            if (i4 >= c2026f.f7477o) {
                throw new NoSuchElementException();
            }
            c2024d.f6852j = i4 + 1;
            c2024d.f6853k = i4;
            Object obj = c2026f.f7472j[i4];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c2026f.f7473k;
            AbstractC2980h.m5133b(objArr);
            Object obj2 = objArr[c2024d.f6853k];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c2024d.m3510e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* renamed from: i */
    public final int m3918i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f7478p;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f7480r == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f7474l[r2] = r0;
        r2 = r6;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3919j(int i) {
        this.f7479q++;
        int i4 = 0;
        if (this.f7477o > this.f7480r) {
            m3912c(false);
        }
        this.f7475m = new int[i];
        this.f7478p = Integer.numberOfLeadingZeros(i) + 1;
        while (i4 < this.f7477o) {
            int i8 = i4 + 1;
            int iM3918i = m3918i(this.f7472j[i4]);
            int i9 = this.f7476n;
            while (true) {
                int[] iArr = this.f7475m;
                if (iArr[iM3918i] == 0) {
                    break;
                }
                i9--;
                if (i9 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM3918i = iM3918i == 0 ? iArr.length - 1 : iM3918i - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3920k(int i) {
        Object[] objArr = this.f7472j;
        AbstractC2980h.m5136e("<this>", objArr);
        objArr[i] = null;
        Object[] objArr2 = this.f7473k;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.f7474l[i];
        int i4 = this.f7476n * 2;
        int length2 = this.f7475m.length / 2;
        if (i4 > length2) {
            i4 = length2;
        }
        int i8 = i4;
        int i9 = 0;
        int i10 = length;
        while (true) {
            length = length == 0 ? this.f7475m.length - 1 : length - 1;
            i9++;
            if (i9 > this.f7476n) {
                this.f7475m[i10] = 0;
                break;
            }
            int[] iArr = this.f7475m;
            int i11 = iArr[length];
            if (i11 == 0) {
                iArr[i10] = 0;
                break;
            }
            if (i11 < 0) {
                iArr[i10] = -1;
            } else {
                int i12 = i11 - 1;
                int iM3918i = m3918i(this.f7472j[i12]) - length;
                int[] iArr2 = this.f7475m;
                if ((iM3918i & (iArr2.length - 1)) >= i9) {
                    iArr2[i10] = i11;
                    this.f7474l[i12] = i10;
                }
                i8--;
                if (i8 >= 0) {
                    this.f7475m[i10] = -1;
                    break;
                }
            }
            i10 = length;
            i9 = 0;
            i8--;
            if (i8 >= 0) {
            }
        }
        this.f7474l[i] = -1;
        this.f7480r--;
        this.f7479q++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2027g c2027g = this.f7481s;
        if (c2027g != null) {
            return c2027g;
        }
        C2027g c2027g2 = new C2027g(this, 1);
        this.f7481s = c2027g2;
        return c2027g2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m3911b();
        int iM3910a = m3910a(obj);
        Object[] objArr = this.f7473k;
        if (objArr == null) {
            int length = this.f7472j.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f7473k = objArr;
        }
        if (iM3910a >= 0) {
            objArr[iM3910a] = obj2;
            return null;
        }
        int i = (-iM3910a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        AbstractC2980h.m5136e("from", map);
        m3911b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m3915f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM3910a = m3910a(entry.getKey());
            Object[] objArr = this.f7473k;
            if (objArr == null) {
                int length = this.f7472j.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f7473k = objArr;
            }
            if (iM3910a >= 0) {
                objArr[iM3910a] = entry.getValue();
            } else {
                int i = (-iM3910a) - 1;
                if (!AbstractC2980h.m5132a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m3911b();
        int iM3916g = m3916g(obj);
        if (iM3916g < 0) {
            return null;
        }
        Object[] objArr = this.f7473k;
        AbstractC2980h.m5133b(objArr);
        Object obj2 = objArr[iM3916g];
        m3920k(iM3916g);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f7480r;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f7480r * 3) + 2);
        sb.append("{");
        int i = 0;
        C2024d c2024d = new C2024d(this, 0);
        while (c2024d.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i4 = c2024d.f6852j;
            C2026f c2026f = (C2026f) c2024d.f6855m;
            if (i4 >= c2026f.f7477o) {
                throw new NoSuchElementException();
            }
            c2024d.f6852j = i4 + 1;
            c2024d.f6853k = i4;
            Object obj = c2026f.f7472j[i4];
            if (obj == c2026f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c2026f.f7473k;
            AbstractC2980h.m5133b(objArr);
            Object obj2 = objArr[c2024d.f6853k];
            if (obj2 == c2026f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c2024d.m3510e();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        AbstractC2980h.m5135d("toString(...)", string);
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        C2028h c2028h = this.f7482t;
        if (c2028h != null) {
            return c2028h;
        }
        C2028h c2028h2 = new C2028h(this);
        this.f7482t = c2028h2;
        return c2028h2;
    }
}
