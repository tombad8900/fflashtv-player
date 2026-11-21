package p052f6;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.b */
/* loaded from: classes.dex */
public abstract class AbstractC0949b extends AbstractC0994q implements InterfaceC0951b1, Serializable {

    /* renamed from: n */
    public final transient Map f4160n;

    /* renamed from: o */
    public transient int f4161o;

    public AbstractC0949b(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f4160n = map;
    }

    @Override // p052f6.InterfaceC0966g1
    /* renamed from: a */
    public final Collection mo2125a() {
        Collection collection = this.f4239j;
        if (collection != null) {
            return collection;
        }
        C0991p c0991p = new C0991p(this, 0);
        this.f4239j = c0991p;
        return c0991p;
    }

    @Override // p052f6.InterfaceC0966g1
    /* renamed from: b */
    public final Map mo2126b() {
        Map map = this.f4242m;
        if (map != null) {
            return map;
        }
        Map mapMo2128f = mo2128f();
        this.f4242m = mapMo2128f;
        return mapMo2128f;
    }

    /* renamed from: e */
    public final void m2127e() {
        Map map = this.f4160n;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f4161o = 0;
    }

    /* renamed from: f */
    public Map mo2128f() {
        return new C0961f(this, this.f4160n);
    }

    /* renamed from: g */
    public abstract Collection mo2129g();

    /* renamed from: h */
    public Set mo2130h() {
        return new C0964g(this, this.f4160n);
    }

    @Override // p052f6.InterfaceC0966g1
    public final boolean put(Object obj, Object obj2) {
        Map map = this.f4160n;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f4161o++;
            return true;
        }
        Collection collectionMo2129g = mo2129g();
        if (!collectionMo2129g.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f4161o++;
        map.put(obj, collectionMo2129g);
        return true;
    }

    @Override // p052f6.InterfaceC0966g1
    public final int size() {
        return this.f4161o;
    }

    @Override // p052f6.InterfaceC0966g1
    public final Collection values() {
        Collection collection = this.f4241l;
        if (collection != null) {
            return collection;
        }
        C0991p c0991p = new C0991p(this, 1);
        this.f4241l = c0991p;
        return c0991p;
    }

    @Override // p052f6.InterfaceC0966g1
    public final List get(Object obj) {
        Collection collectionMo2129g = (Collection) this.f4160n.get(obj);
        if (collectionMo2129g == null) {
            collectionMo2129g = mo2129g();
        }
        List list = (List) collectionMo2129g;
        return list instanceof RandomAccess ? new C0973j(this, obj, list, null) : new C0985n(this, obj, list, null);
    }
}
