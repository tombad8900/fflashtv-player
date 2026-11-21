package p111m6;

import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2980h;

/* renamed from: m6.h */
/* loaded from: classes.dex */
public abstract class AbstractC1913h extends AbstractC1919n {
    /* renamed from: A0 */
    public static Object m3736A0(List list) {
        AbstractC2980h.m5136e("<this>", list);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* renamed from: B0 */
    public static Object m3737B0(List list) {
        AbstractC2980h.m5136e("<this>", list);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: C0 */
    public static Object m3738C0(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: D0 */
    public static final void m3739D0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC2851l interfaceC2851l) {
        AbstractC2980h.m5136e("<this>", iterable);
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC0714c.m1515d(sb, obj, interfaceC2851l);
        }
        sb.append(charSequence3);
    }

    /* renamed from: E0 */
    public static String m3740E0(Collection collection, String str, String str2, String str3, InterfaceC2851l interfaceC2851l, int i) {
        String str4 = (i & 2) != 0 ? C2181z.FRAGMENT_ENCODE_SET : str2;
        String str5 = (i & 4) != 0 ? C2181z.FRAGMENT_ENCODE_SET : str3;
        if ((i & 32) != 0) {
            interfaceC2851l = null;
        }
        AbstractC2980h.m5136e("<this>", collection);
        AbstractC2980h.m5136e("prefix", str4);
        AbstractC2980h.m5136e("postfix", str5);
        StringBuilder sb = new StringBuilder();
        m3739D0(collection, sb, str, str4, str5, "...", interfaceC2851l);
        return sb.toString();
    }

    /* renamed from: F0 */
    public static Object m3741F0(List list) {
        AbstractC2980h.m5136e("<this>", list);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC1914i.m3752s0(list));
    }

    /* renamed from: G0 */
    public static Object m3742G0(List list) {
        AbstractC2980h.m5136e("<this>", list);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: H0 */
    public static ArrayList m3743H0(Collection collection, Iterable iterable) {
        AbstractC2980h.m5136e("<this>", collection);
        AbstractC2980h.m5136e("elements", iterable);
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC1919n.m3757x0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* renamed from: I0 */
    public static ArrayList m3744I0(List list, Object obj) {
        AbstractC2980h.m5136e("<this>", list);
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: J0 */
    public static List m3745J0(ArrayList arrayList, Comparator comparator) {
        if (arrayList.size() <= 1) {
            return m3747L0(arrayList);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        AbstractC2980h.m5136e("<this>", array);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return AbstractC1912g.m3724h0(array);
    }

    /* renamed from: K0 */
    public static final void m3746K0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC2980h.m5136e("<this>", iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* renamed from: L0 */
    public static List m3747L0(Iterable iterable) {
        ArrayList arrayListM3748M0;
        AbstractC2980h.m5136e("<this>", iterable);
        boolean z7 = iterable instanceof Collection;
        if (!z7) {
            if (z7) {
                arrayListM3748M0 = m3748M0((Collection) iterable);
            } else {
                ArrayList arrayList = new ArrayList();
                m3746K0(iterable, arrayList);
                arrayListM3748M0 = arrayList;
            }
            return AbstractC1914i.m3754u0(arrayListM3748M0);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C1921p.f7187j;
        }
        if (size != 1) {
            return m3748M0(collection);
        }
        return AbstractC0715d.m1551T(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* renamed from: M0 */
    public static ArrayList m3748M0(Collection collection) {
        AbstractC2980h.m5136e("<this>", collection);
        return new ArrayList(collection);
    }

    /* renamed from: N0 */
    public static Set m3749N0(Iterable iterable) {
        AbstractC2980h.m5136e("<this>", iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1924s.m3759T(collection.size()));
                    m3746K0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                AbstractC2980h.m5135d("singleton(...)", setSingleton);
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m3746K0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                AbstractC2980h.m5135d("singleton(...)", setSingleton2);
                return setSingleton2;
            }
        }
        return C1923r.f7189j;
    }

    /* renamed from: y0 */
    public static List m3750y0(int i, List list) {
        AbstractC2980h.m5136e("<this>", list);
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0008a1.m14j("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return m3747L0(list);
        }
        int size = list.size() - i;
        if (size <= 0) {
            return C1921p.f7187j;
        }
        if (size == 1) {
            return AbstractC0715d.m1551T(m3741F0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i < size2) {
                arrayList.add(list.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* renamed from: z0 */
    public static Object m3751z0(Collection collection) {
        AbstractC2980h.m5136e("<this>", collection);
        if (collection instanceof List) {
            return m3736A0((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }
}
