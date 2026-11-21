package p111m6;

import android.support.v4.media.session.AbstractC0120b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import p102l6.C1687d;
import p204x4.EnumC2770m;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m6.s */
/* loaded from: classes.dex */
public abstract class AbstractC1924s extends AbstractC0120b {
    /* renamed from: S */
    public static Object m3758S(Map map, EnumC2770m enumC2770m) {
        AbstractC2980h.m5136e("<this>", map);
        Object obj = map.get(enumC2770m);
        if (obj != null || map.containsKey(enumC2770m)) {
            return obj;
        }
        throw new NoSuchElementException("Key " + enumC2770m + " is missing in the map.");
    }

    /* renamed from: T */
    public static int m3759T(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: U */
    public static Map m3760U(C1687d... c1687dArr) {
        if (c1687dArr.length <= 0) {
            return C1922q.f7188j;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3759T(c1687dArr.length));
        m3761V(linkedHashMap, c1687dArr);
        return linkedHashMap;
    }

    /* renamed from: V */
    public static final void m3761V(LinkedHashMap linkedHashMap, C1687d[] c1687dArr) {
        for (C1687d c1687d : c1687dArr) {
            linkedHashMap.put(c1687d.f6486j, c1687d.f6487k);
        }
    }

    /* renamed from: W */
    public static Map m3762W(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C1922q.f7188j;
        }
        if (size == 1) {
            C1687d c1687d = (C1687d) arrayList.get(0);
            AbstractC2980h.m5136e("pair", c1687d);
            Map mapSingletonMap = Collections.singletonMap(c1687d.f6486j, c1687d.f6487k);
            AbstractC2980h.m5135d("singletonMap(...)", mapSingletonMap);
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3759T(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            C1687d c1687d2 = (C1687d) obj;
            linkedHashMap.put(c1687d2.f6486j, c1687d2.f6487k);
        }
        return linkedHashMap;
    }

    /* renamed from: X */
    public static Map m3763X(Map map) {
        AbstractC2980h.m5136e("<this>", map);
        int size = map.size();
        if (size == 0) {
            return C1922q.f7188j;
        }
        if (size != 1) {
            return m3764Y(map);
        }
        AbstractC2980h.m5136e("<this>", map);
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC2980h.m5135d("with(...)", mapSingletonMap);
        return mapSingletonMap;
    }

    /* renamed from: Y */
    public static LinkedHashMap m3764Y(Map map) {
        AbstractC2980h.m5136e("<this>", map);
        return new LinkedHashMap(map);
    }
}
