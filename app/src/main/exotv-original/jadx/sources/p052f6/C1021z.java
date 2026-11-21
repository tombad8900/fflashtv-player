package p052f6;

import android.support.v4.media.session.AbstractC0120b;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.z */
/* loaded from: classes.dex */
public final class C1021z extends AbstractMap implements Serializable {

    /* renamed from: s */
    public static final Object f4296s = new Object();

    /* renamed from: j */
    public transient Object f4297j;

    /* renamed from: k */
    public transient int[] f4298k;

    /* renamed from: l */
    public transient Object[] f4299l;

    /* renamed from: m */
    public transient Object[] f4300m;

    /* renamed from: n */
    public transient int f4301n;

    /* renamed from: o */
    public transient int f4302o;

    /* renamed from: p */
    public transient C1012w f4303p;

    /* renamed from: q */
    public transient C1012w f4304q;

    /* renamed from: r */
    public transient C1018y f4305r;

    /* renamed from: a */
    public static C1021z m2212a(int i) {
        C1021z c1021z = new C1021z();
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        c1021z.f4301n = Math.min(Math.max(i, 1), 1073741823);
        return c1021z;
    }

    /* renamed from: b */
    public final Map m2213b() {
        Object obj = this.f4297j;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: c */
    public final int m2214c() {
        return (1 << (this.f4301n & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m2217f()) {
            return;
        }
        this.f4301n += 32;
        Map mapM2213b = m2213b();
        if (mapM2213b != null) {
            this.f4301n = Math.min(Math.max(size(), 3), 1073741823);
            mapM2213b.clear();
            this.f4297j = null;
            this.f4302o = 0;
            return;
        }
        Arrays.fill(m2220i(), 0, this.f4302o, (Object) null);
        Arrays.fill(m2221j(), 0, this.f4302o, (Object) null);
        Object obj = this.f4297j;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m2219h(), 0, this.f4302o, 0);
        this.f4302o = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM2213b = m2213b();
        return mapM2213b != null ? mapM2213b.containsKey(obj) : m2215d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM2213b = m2213b();
        if (mapM2213b != null) {
            return mapM2213b.containsValue(obj);
        }
        for (int i = 0; i < this.f4302o; i++) {
            if (AbstractC0120b.m422r(obj, m2221j()[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final int m2215d(Object obj) {
        if (m2217f()) {
            return -1;
        }
        int iM2203r = AbstractC1006u.m2203r(obj);
        int iM2214c = m2214c();
        Object obj2 = this.f4297j;
        Objects.requireNonNull(obj2);
        int iM2204s = AbstractC1006u.m2204s(iM2203r & iM2214c, obj2);
        if (iM2204s == 0) {
            return -1;
        }
        int i = ~iM2214c;
        int i4 = iM2203r & i;
        do {
            int i8 = iM2204s - 1;
            int i9 = m2219h()[i8];
            if ((i9 & i) == i4 && AbstractC0120b.m422r(obj, m2220i()[i8])) {
                return i8;
            }
            iM2204s = i9 & iM2214c;
        } while (iM2204s != 0);
        return -1;
    }

    /* renamed from: e */
    public final void m2216e(int i, int i4) {
        Object obj = this.f4297j;
        Objects.requireNonNull(obj);
        int[] iArrM2219h = m2219h();
        Object[] objArrM2220i = m2220i();
        Object[] objArrM2221j = m2221j();
        int size = size();
        int i8 = size - 1;
        if (i >= i8) {
            objArrM2220i[i] = null;
            objArrM2221j[i] = null;
            iArrM2219h[i] = 0;
            return;
        }
        Object obj2 = objArrM2220i[i8];
        objArrM2220i[i] = obj2;
        objArrM2221j[i] = objArrM2221j[i8];
        objArrM2220i[i8] = null;
        objArrM2221j[i8] = null;
        iArrM2219h[i] = iArrM2219h[i8];
        iArrM2219h[i8] = 0;
        int iM2203r = AbstractC1006u.m2203r(obj2) & i4;
        int iM2204s = AbstractC1006u.m2204s(iM2203r, obj);
        if (iM2204s == size) {
            AbstractC1006u.m2205t(iM2203r, i + 1, obj);
            return;
        }
        while (true) {
            int i9 = iM2204s - 1;
            int i10 = iArrM2219h[i9];
            int i11 = i10 & i4;
            if (i11 == size) {
                iArrM2219h[i9] = AbstractC1006u.m2198m(i10, i + 1, i4);
                return;
            }
            iM2204s = i11;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1012w c1012w = this.f4304q;
        if (c1012w != null) {
            return c1012w;
        }
        C1012w c1012w2 = new C1012w(0, this);
        this.f4304q = c1012w2;
        return c1012w2;
    }

    /* renamed from: f */
    public final boolean m2217f() {
        return this.f4297j == null;
    }

    /* renamed from: g */
    public final Object m2218g(Object obj) {
        if (!m2217f()) {
            int iM2214c = m2214c();
            Object obj2 = this.f4297j;
            Objects.requireNonNull(obj2);
            int iM2200o = AbstractC1006u.m2200o(obj, null, iM2214c, obj2, m2219h(), m2220i(), null);
            if (iM2200o != -1) {
                Object obj3 = m2221j()[iM2200o];
                m2216e(iM2200o, iM2214c);
                this.f4302o--;
                this.f4301n += 32;
                return obj3;
            }
        }
        return f4296s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM2213b = m2213b();
        if (mapM2213b != null) {
            return mapM2213b.get(obj);
        }
        int iM2215d = m2215d(obj);
        if (iM2215d == -1) {
            return null;
        }
        return m2221j()[iM2215d];
    }

    /* renamed from: h */
    public final int[] m2219h() {
        int[] iArr = this.f4298k;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: i */
    public final Object[] m2220i() {
        Object[] objArr = this.f4299l;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final Object[] m2221j() {
        Object[] objArr = this.f4300m;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: k */
    public final int m2222k(int i, int i4, int i8, int i9) {
        Object objM2189d = AbstractC1006u.m2189d(i4);
        int i10 = i4 - 1;
        if (i9 != 0) {
            AbstractC1006u.m2205t(i8 & i10, i9 + 1, objM2189d);
        }
        Object obj = this.f4297j;
        Objects.requireNonNull(obj);
        int[] iArrM2219h = m2219h();
        for (int i11 = 0; i11 <= i; i11++) {
            int iM2204s = AbstractC1006u.m2204s(i11, obj);
            while (iM2204s != 0) {
                int i12 = iM2204s - 1;
                int i13 = iArrM2219h[i12];
                int i14 = ((~i) & i13) | i11;
                int i15 = i14 & i10;
                int iM2204s2 = AbstractC1006u.m2204s(i15, objM2189d);
                AbstractC1006u.m2205t(i15, iM2204s, objM2189d);
                iArrM2219h[i12] = AbstractC1006u.m2198m(i14, iM2204s2, i10);
                iM2204s = i13 & i;
            }
        }
        this.f4297j = objM2189d;
        this.f4301n = AbstractC1006u.m2198m(this.f4301n, 32 - Integer.numberOfLeadingZeros(i10), 31);
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C1012w c1012w = this.f4303p;
        if (c1012w != null) {
            return c1012w;
        }
        C1012w c1012w2 = new C1012w(1, this);
        this.f4303p = c1012w2;
        return c1012w2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0104 -> B:41:0x00ea). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i;
        int i4 = 32;
        int i8 = 1;
        if (m2217f()) {
            if (!m2217f()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i9 = this.f4301n;
            int iMax = Math.max(i9 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (1.0d * iHighestOneBit)) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f4297j = AbstractC1006u.m2189d(iMax2);
            this.f4301n = AbstractC1006u.m2198m(this.f4301n, 32 - Integer.numberOfLeadingZeros(iMax2 - 1), 31);
            this.f4298k = new int[i9];
            this.f4299l = new Object[i9];
            this.f4300m = new Object[i9];
        }
        Map mapM2213b = m2213b();
        if (mapM2213b != null) {
            return mapM2213b.put(obj, obj2);
        }
        int[] iArrM2219h = m2219h();
        Object[] objArrM2220i = m2220i();
        Object[] objArrM2221j = m2221j();
        int i10 = this.f4302o;
        int i11 = i10 + 1;
        int iM2203r = AbstractC1006u.m2203r(obj);
        int iM2214c = m2214c();
        int i12 = iM2203r & iM2214c;
        Object obj3 = this.f4297j;
        Objects.requireNonNull(obj3);
        int iM2204s = AbstractC1006u.m2204s(i12, obj3);
        if (iM2204s == 0) {
            if (i11 > iM2214c) {
                iM2214c = m2222k(iM2214c, (iM2214c + 1) * (iM2214c < 32 ? 4 : 2), iM2203r, i10);
            } else {
                Object obj4 = this.f4297j;
                Objects.requireNonNull(obj4);
                AbstractC1006u.m2205t(i12, i11, obj4);
            }
            i = 1;
        } else {
            int i13 = ~iM2214c;
            int i14 = iM2203r & i13;
            int i15 = 0;
            while (true) {
                int i16 = iM2204s - i8;
                i = i8;
                int i17 = iArrM2219h[i16];
                int i18 = i4;
                if ((i17 & i13) == i14 && AbstractC0120b.m422r(obj, objArrM2220i[i16])) {
                    Object obj5 = objArrM2221j[i16];
                    objArrM2221j[i16] = obj2;
                    return obj5;
                }
                int i19 = i17 & iM2214c;
                int i20 = i15 + 1;
                if (i19 != 0) {
                    i15 = i20;
                    iM2204s = i19;
                    i8 = i;
                    i4 = i18;
                } else {
                    if (i20 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m2214c() + 1, 1.0f);
                        int i21 = isEmpty() ? -1 : 0;
                        while (i21 >= 0) {
                            linkedHashMap.put(m2220i()[i21], m2221j()[i21]);
                            int i22 = i21 + 1;
                            if (i22 < this.f4302o) {
                                i21 = i22;
                            } else {
                                while (i21 >= 0) {
                                }
                            }
                        }
                        this.f4297j = linkedHashMap;
                        this.f4298k = null;
                        this.f4299l = null;
                        this.f4300m = null;
                        this.f4301n += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i11 > iM2214c) {
                        iM2214c = m2222k(iM2214c, (iM2214c + 1) * (iM2214c < i18 ? 4 : 2), iM2203r, i10);
                    } else {
                        iArrM2219h[i16] = AbstractC1006u.m2198m(i17, i11, iM2214c);
                    }
                }
            }
        }
        int length = m2219h().length;
        if (i11 > length) {
            int i23 = i;
            int iMin = Math.min(1073741823, (Math.max(i23, length >>> 1) + length) | i23);
            if (iMin != length) {
                this.f4298k = Arrays.copyOf(m2219h(), iMin);
                this.f4299l = Arrays.copyOf(m2220i(), iMin);
                this.f4300m = Arrays.copyOf(m2221j(), iMin);
            }
        }
        m2219h()[i10] = AbstractC1006u.m2198m(iM2203r, 0, iM2214c);
        m2220i()[i10] = obj;
        m2221j()[i10] = obj2;
        this.f4302o = i11;
        this.f4301n += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM2213b = m2213b();
        if (mapM2213b != null) {
            return mapM2213b.remove(obj);
        }
        Object objM2218g = m2218g(obj);
        if (objM2218g == f4296s) {
            return null;
        }
        return objM2218g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM2213b = m2213b();
        return mapM2213b != null ? mapM2213b.size() : this.f4302o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C1018y c1018y = this.f4305r;
        if (c1018y != null) {
            return c1018y;
        }
        C1018y c1018y2 = new C1018y(this);
        this.f4305r = c1018y2;
        return c1018y2;
    }
}
