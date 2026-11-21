package p077j$.time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

/* renamed from: j$.time.b */
/* loaded from: classes2.dex */
public abstract class AbstractC1352b {
    /* renamed from: a */
    public static /* synthetic */ List m2922a(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public static C1350a m2923b() {
        String id = TimeZone.getDefault().getID();
        Map map = AbstractC1462z.f5642a;
        Objects.requireNonNull(id, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        String str = (String) map.get(id);
        if (str != null) {
            id = str;
        }
        return new C1350a(AbstractC1462z.m3121A(id, true));
    }
}
