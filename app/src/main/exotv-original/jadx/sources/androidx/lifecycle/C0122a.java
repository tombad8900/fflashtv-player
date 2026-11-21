package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
public final class C0122a {

    /* renamed from: a */
    public final HashMap f886a = new HashMap();

    /* renamed from: b */
    public final HashMap f887b;

    public C0122a(HashMap map) {
        this.f887b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0146m enumC0146m = (EnumC0146m) entry.getValue();
            List arrayList = (List) this.f886a.get(enumC0146m);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f886a.put(enumC0146m, arrayList);
            }
            arrayList.add((C0124b) entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m547a(List list, InterfaceC0164v interfaceC0164v, EnumC0146m enumC0146m, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0124b c0124b = (C0124b) list.get(size);
                Method method = c0124b.f899b;
                try {
                    int i = c0124b.f898a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC0164v);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC0164v, enumC0146m);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException("Failed to call observer method", e8.getCause());
                }
            }
        }
    }
}
