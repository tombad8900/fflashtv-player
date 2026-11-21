package p178u4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u4.i */
/* loaded from: classes.dex */
public class C2474i {

    /* renamed from: a */
    public final LinkedHashMap f9061a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f9062b;

    /* renamed from: c */
    public long f9063c;

    public C2474i(long j) {
        this.f9062b = j;
    }

    /* renamed from: a */
    public final synchronized Object m4448a(Object obj) {
        C2473h c2473h;
        c2473h = (C2473h) this.f9061a.get(obj);
        return c2473h != null ? c2473h.f9059a : null;
    }

    /* renamed from: b */
    public int mo1425b(Object obj) {
        return 1;
    }

    /* renamed from: c */
    public void mo1426c(Object obj, Object obj2) {
    }

    /* renamed from: d */
    public final synchronized Object m4449d(Object obj, Object obj2) {
        int iMo1425b = mo1425b(obj2);
        long j = iMo1425b;
        if (j >= this.f9062b) {
            mo1426c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f9063c += j;
        }
        C2473h c2473h = (C2473h) this.f9061a.put(obj, obj2 == null ? null : new C2473h(iMo1425b, obj2));
        if (c2473h != null) {
            this.f9063c -= c2473h.f9060b;
            if (!c2473h.f9059a.equals(obj2)) {
                mo1426c(obj, c2473h.f9059a);
            }
        }
        m4450e(this.f9062b);
        return c2473h != null ? c2473h.f9059a : null;
    }

    /* renamed from: e */
    public final synchronized void m4450e(long j) {
        while (this.f9063c > j) {
            Iterator it = this.f9061a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C2473h c2473h = (C2473h) entry.getValue();
            this.f9063c -= c2473h.f9060b;
            Object key = entry.getKey();
            it.remove();
            mo1426c(key, c2473h.f9059a);
        }
    }
}
