package p077j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: j$.time.format.t */
/* loaded from: classes2.dex */
public final class C1415t {

    /* renamed from: a */
    public final Map f5550a;

    /* renamed from: b */
    public final Map f5551b;

    public C1415t(Map map) {
        this.f5550a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l8 = (Long) entry2.getKey();
                C1414s c1414s = C1396a.f5500b;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l8));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, C1396a.f5500b);
            map2.put((EnumC1420y) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, C1396a.f5500b);
        this.f5551b = map2;
    }

    /* renamed from: a */
    public final String m3044a(long j, EnumC1420y enumC1420y) {
        Map map = (Map) this.f5550a.get(enumC1420y);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
