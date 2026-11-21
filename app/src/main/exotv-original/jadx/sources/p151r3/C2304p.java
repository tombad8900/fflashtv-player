package p151r3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p008a7.InterfaceC0113a;
import p102l6.C1687d;
import p111m6.C1922q;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r3.p */
/* loaded from: classes.dex */
public final class C2304p implements Iterable, InterfaceC0113a {

    /* renamed from: k */
    public static final C2304p f8070k = new C2304p(C1922q.f7188j);

    /* renamed from: j */
    public final Map f8071j;

    public C2304p(Map map) {
        this.f8071j = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2304p) {
            return AbstractC2980h.m5132a(this.f8071j, ((C2304p) obj).f8071j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8071j.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f8071j;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new C1687d(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f8071j + ')';
    }
}
