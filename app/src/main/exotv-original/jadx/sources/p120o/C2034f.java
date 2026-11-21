package p120o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o.f */
/* loaded from: classes.dex */
public class C2034f implements Iterable {

    /* renamed from: j */
    public C2031c f7499j;

    /* renamed from: k */
    public C2031c f7500k;

    /* renamed from: l */
    public final WeakHashMap f7501l = new WeakHashMap();

    /* renamed from: m */
    public int f7502m = 0;

    /* renamed from: a */
    public C2031c mo3921a(Object obj) {
        C2031c c2031c = this.f7499j;
        while (c2031c != null && !c2031c.f7492j.equals(obj)) {
            c2031c = c2031c.f7494l;
        }
        return c2031c;
    }

    /* renamed from: b */
    public Object mo3922b(Object obj) {
        C2031c c2031cMo3921a = mo3921a(obj);
        if (c2031cMo3921a == null) {
            return null;
        }
        this.f7502m--;
        WeakHashMap weakHashMap = this.f7501l;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC2033e) it.next()).mo3923a(c2031cMo3921a);
            }
        }
        C2031c c2031c = c2031cMo3921a.f7495m;
        if (c2031c != null) {
            c2031c.f7494l = c2031cMo3921a.f7494l;
        } else {
            this.f7499j = c2031cMo3921a.f7494l;
        }
        C2031c c2031c2 = c2031cMo3921a.f7494l;
        if (c2031c2 != null) {
            c2031c2.f7495m = c2031c;
        } else {
            this.f7500k = c2031c;
        }
        c2031cMo3921a.f7494l = null;
        c2031cMo3921a.f7495m = null;
        return c2031cMo3921a.f7493k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p120o.C2030b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2034f)) {
            return false;
        }
        C2034f c2034f = (C2034f) obj;
        if (this.f7502m != c2034f.f7502m) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c2034f.iterator();
        while (true) {
            C2030b c2030b = (C2030b) it;
            if (!c2030b.hasNext()) {
                break;
            }
            C2030b c2030b2 = (C2030b) it2;
            if (!c2030b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c2030b.next();
            Object next = c2030b2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                break;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C2030b c2030b = (C2030b) it;
            if (!c2030b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c2030b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2030b c2030b = new C2030b(this.f7499j, this.f7500k, 0);
        this.f7501l.put(c2030b, Boolean.FALSE);
        return c2030b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C2030b c2030b = (C2030b) it;
            if (!c2030b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c2030b.next()).toString());
            if (c2030b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
