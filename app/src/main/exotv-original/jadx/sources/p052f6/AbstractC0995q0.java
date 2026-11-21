package p052f6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.q0 */
/* loaded from: classes.dex */
public abstract class AbstractC0995q0 implements Map, Serializable {

    /* renamed from: j */
    public transient C0987n1 f4243j;

    /* renamed from: k */
    public transient C0990o1 f4244k;

    /* renamed from: l */
    public transient C0993p1 f4245l;

    /* renamed from: a */
    public static AbstractC0995q0 m2182a(Map map) {
        if ((map instanceof AbstractC0995q0) && !(map instanceof SortedMap)) {
            return (AbstractC0995q0) map;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        C0992p0 c0992p0 = new C0992p0(setEntrySet != null ? setEntrySet.size() : 4);
        if (setEntrySet != null) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = c0992p0.f4233a;
            if (size > objArr.length) {
                c0992p0.f4233a = Arrays.copyOf(objArr, AbstractC0965g0.m2140e(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            c0992p0.m2180b(entry.getKey(), entry.getValue());
        }
        return c0992p0.m2179a();
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1013w0 entrySet() {
        C0987n1 c0987n1 = this.f4243j;
        if (c0987n1 != null) {
            return c0987n1;
        }
        C0996q1 c0996q1 = (C0996q1) this;
        C0987n1 c0987n12 = new C0987n1(c0996q1, c0996q1.f4248n, c0996q1.f4249o);
        this.f4243j = c0987n12;
        return c0987n12;
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC1013w0 keySet() {
        C0990o1 c0990o1 = this.f4244k;
        if (c0990o1 != null) {
            return c0990o1;
        }
        C0996q1 c0996q1 = (C0996q1) this;
        C0990o1 c0990o12 = new C0990o1(c0996q1, new C0993p1(c0996q1.f4248n, 0, c0996q1.f4249o));
        this.f4244k = c0990o12;
        return c0990o12;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final AbstractC0968h0 values() {
        C0993p1 c0993p1 = this.f4245l;
        if (c0993p1 != null) {
            return c0993p1;
        }
        C0996q1 c0996q1 = (C0996q1) this;
        C0993p1 c0993p12 = new C0993p1(c0996q1.f4248n, 1, c0996q1.f4249o);
        this.f4245l = c0993p12;
        return c0993p12;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC1006u.m2190e(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC1006u.m2196k(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C0996q1) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((C0996q1) this).f4249o;
        AbstractC1006u.m2188c(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        AbstractC1023z1 it = ((C0987n1) entrySet()).iterator();
        boolean z7 = true;
        while (true) {
            AbstractC0946a abstractC0946a = (AbstractC0946a) it;
            if (!abstractC0946a.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) abstractC0946a.next();
            if (!z7) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z7 = false;
        }
    }
}
