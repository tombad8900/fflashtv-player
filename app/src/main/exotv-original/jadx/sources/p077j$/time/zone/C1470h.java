package p077j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j$.time.zone.h */
/* loaded from: classes2.dex */
public final class C1470h implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ List f5673a;

    public C1470h(List list) {
        this.f5673a = list;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                C1471i c1471i = (C1471i) C1471i.class.cast(Class.forName(property, true, C1471i.class.getClassLoader()).newInstance());
                C1471i.m3139b(c1471i);
                ((ArrayList) this.f5673a).add(c1471i);
                return null;
            } catch (Exception e) {
                throw new Error(e);
            }
        }
        C1471i.m3139b(new C1471i());
        return null;
    }
}
