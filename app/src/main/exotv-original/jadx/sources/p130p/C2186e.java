package p130p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p052f6.C1012w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p.e */
/* loaded from: classes.dex */
public class C2186e extends C2192k implements Map {

    /* renamed from: m */
    public C1012w f7631m;

    /* renamed from: n */
    public C2183b f7632n;

    /* renamed from: o */
    public C2185d f7633o;

    public C2186e(C2186e c2186e) {
        super(0);
        mo3993g(c2186e);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1012w c1012w = this.f7631m;
        if (c1012w != null) {
            return c1012w;
        }
        C1012w c1012w2 = new C1012w(2, this);
        this.f7631m = c1012w2;
        return c1012w2;
    }

    /* renamed from: k */
    public final boolean m3961k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2183b c2183b = this.f7632n;
        if (c2183b != null) {
            return c2183b;
        }
        C2183b c2183b2 = new C2183b(this);
        this.f7632n = c2183b2;
        return c2183b2;
    }

    /* renamed from: l */
    public final boolean m3962l(Collection collection) {
        int i = this.f7656l;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f7656l;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m3988b(map.size() + this.f7656l);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C2185d c2185d = this.f7633o;
        if (c2185d != null) {
            return c2185d;
        }
        C2185d c2185d2 = new C2185d(this);
        this.f7633o = c2185d2;
        return c2185d2;
    }
}
