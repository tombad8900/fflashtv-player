package p052f6;

import android.support.v4.media.session.AbstractC0120b;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import p002a1.AbstractC0008a1;
import p043e6.C0919g;
import p043e6.InterfaceC0916d;
import p043e6.InterfaceC0918f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.u */
/* loaded from: classes.dex */
public abstract class AbstractC1006u {
    /* renamed from: a */
    public static int m2186a(int i) {
        if (i < 3) {
            m2188c(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static void m2187b(int i, Object[] objArr) {
        for (int i4 = 0; i4 < i; i4++) {
            if (objArr[i4] == null) {
                throw new NullPointerException(AbstractC0008a1.m12h(i4, "at index "));
            }
        }
    }

    /* renamed from: c */
    public static void m2188c(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: d */
    public static Object m2189d(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    /* renamed from: e */
    public static boolean m2190e(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m2191f(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static C1008u1 m2192g(Set set, InterfaceC0918f interfaceC0918f) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof C1008u1)) {
                return new C1011v1(set2, interfaceC0918f);
            }
            C1008u1 c1008u1 = (C1008u1) set2;
            InterfaceC0918f interfaceC0918f2 = c1008u1.f4271k;
            interfaceC0918f2.getClass();
            return new C1011v1((SortedSet) c1008u1.f4270j, new C0919g(Arrays.asList(interfaceC0918f2, interfaceC0918f)));
        }
        if (!(set instanceof C1008u1)) {
            set.getClass();
            return new C1008u1(set, interfaceC0918f);
        }
        C1008u1 c1008u12 = (C1008u1) set;
        InterfaceC0918f interfaceC0918f3 = c1008u12.f4271k;
        interfaceC0918f3.getClass();
        return new C1008u1(c1008u12.f4270j, new C0919g(Arrays.asList(interfaceC0918f3, interfaceC0918f)));
    }

    /* renamed from: h */
    public static Object m2193h(Collection collection, String str) {
        Iterator it = collection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    /* renamed from: i */
    public static Object m2194i(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: j */
    public static Object m2195j(Iterable iterable) {
        Object next;
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return null;
            }
            if (iterable instanceof List) {
                return ((List) iterable).get(r2.size() - 1);
            }
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: k */
    public static int m2196k(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: l */
    public static C1005t1 m2197l(Set set, AbstractC1013w0 abstractC1013w0) {
        AbstractC0714c.m1528n("set1", set);
        AbstractC0714c.m1528n("set2", abstractC1013w0);
        return new C1005t1(set, abstractC1013w0);
    }

    /* renamed from: m */
    public static int m2198m(int i, int i4, int i8) {
        return (i & (~i8)) | (i4 & i8);
    }

    /* renamed from: n */
    public static ArrayList m2199n(Object... objArr) {
        int length = objArr.length;
        m2188c(length, "arraySize");
        ArrayList arrayList = new ArrayList(AbstractC0715d.m1562g0(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* renamed from: o */
    public static int m2200o(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i4;
        int i8;
        int iM2203r = m2203r(obj);
        int i9 = iM2203r & i;
        int iM2204s = m2204s(i9, obj3);
        if (iM2204s != 0) {
            int i10 = ~i;
            int i11 = iM2203r & i10;
            int i12 = -1;
            while (true) {
                i4 = iM2204s - 1;
                i8 = iArr[i4];
                if ((i8 & i10) == i11 && AbstractC0120b.m422r(obj, objArr[i4]) && (objArr2 == null || AbstractC0120b.m422r(obj2, objArr2[i4]))) {
                    break;
                }
                int i13 = i8 & i;
                if (i13 == 0) {
                    break;
                }
                i12 = i4;
                iM2204s = i13;
            }
            int i14 = i8 & i;
            if (i12 == -1) {
                m2205t(i9, i14, obj3);
                return i4;
            }
            iArr[i12] = m2198m(iArr[i12], i14, i);
            return i4;
        }
        return -1;
    }

    /* renamed from: p */
    public static void m2201p(List list, InterfaceC0918f interfaceC0918f, int i, int i4) {
        for (int size = list.size() - 1; size > i4; size--) {
            if (interfaceC0918f.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i8 = i4 - 1; i8 >= i; i8--) {
            list.remove(i8);
        }
    }

    /* renamed from: q */
    public static int m2202q(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* renamed from: r */
    public static int m2203r(Object obj) {
        return m2202q(obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: s */
    public static int m2204s(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    /* renamed from: t */
    public static void m2205t(int i, int i4, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i4;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i4;
        } else {
            ((int[]) obj)[i] = i4;
        }
    }

    /* renamed from: u */
    public static AbstractList m2206u(InterfaceC0916d interfaceC0916d, List list) {
        return list instanceof RandomAccess ? new C0957d1(interfaceC0916d, list) : new C0960e1(interfaceC0916d, list);
    }
}
