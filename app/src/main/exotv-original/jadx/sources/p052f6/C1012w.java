package p052f6;

import android.support.v4.media.session.AbstractC0120b;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p130p.C2184c;
import p130p.C2186e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.w */
/* loaded from: classes.dex */
public final class C1012w extends AbstractSet {

    /* renamed from: j */
    public final /* synthetic */ int f4278j;

    /* renamed from: k */
    public final /* synthetic */ Map f4279k;

    public /* synthetic */ C1012w(int i, Map map) {
        this.f4278j = i;
        this.f4279k = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f4278j) {
            case 0:
                ((C1021z) this.f4279k).clear();
                break;
            case 1:
                ((C1021z) this.f4279k).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f4278j) {
            case 0:
                C1021z c1021z = (C1021z) this.f4279k;
                Map mapM2213b = c1021z.m2213b();
                if (mapM2213b != null) {
                    return mapM2213b.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM2215d = c1021z.m2215d(entry.getKey());
                    if (iM2215d != -1 && AbstractC0120b.m422r(c1021z.m2221j()[iM2215d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((C1021z) this.f4279k).containsKey(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4278j) {
            case 0:
                C1021z c1021z = (C1021z) this.f4279k;
                Map mapM2213b = c1021z.m2213b();
                return mapM2213b != null ? mapM2213b.entrySet().iterator() : new C1009v(c1021z, 1);
            case 1:
                C1021z c1021z2 = (C1021z) this.f4279k;
                Map mapM2213b2 = c1021z2.m2213b();
                return mapM2213b2 != null ? mapM2213b2.keySet().iterator() : new C1009v(c1021z2, 0);
            default:
                return new C2184c((C2186e) this.f4279k);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f4278j) {
            case 0:
                C1021z c1021z = (C1021z) this.f4279k;
                Map mapM2213b = c1021z.m2213b();
                if (mapM2213b != null) {
                    return mapM2213b.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c1021z.m2217f()) {
                        int iM2214c = c1021z.m2214c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c1021z.f4297j;
                        Objects.requireNonNull(obj2);
                        int iM2200o = AbstractC1006u.m2200o(key, value, iM2214c, obj2, c1021z.m2219h(), c1021z.m2220i(), c1021z.m2221j());
                        if (iM2200o != -1) {
                            c1021z.m2216e(iM2200o, iM2214c);
                            c1021z.f4302o--;
                            c1021z.f4301n += 32;
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                C1021z c1021z2 = (C1021z) this.f4279k;
                Map mapM2213b2 = c1021z2.m2213b();
                return mapM2213b2 != null ? mapM2213b2.keySet().remove(obj) : c1021z2.m2218g(obj) != C1021z.f4296s;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4278j) {
            case 0:
                return ((C1021z) this.f4279k).size();
            case 1:
                return ((C1021z) this.f4279k).size();
            default:
                return ((C2186e) this.f4279k).f7656l;
        }
    }
}
