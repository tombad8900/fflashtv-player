package p052f6;

import android.support.v4.media.session.AbstractC0120b;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.y */
/* loaded from: classes.dex */
public final class C1018y extends AbstractCollection {

    /* renamed from: j */
    public final /* synthetic */ int f4291j = 1;

    /* renamed from: k */
    public final AbstractMap f4292k;

    public C1018y(C1021z c1021z) {
        this.f4292k = c1021z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f4291j) {
            case 0:
                ((C1021z) this.f4292k).clear();
                break;
            default:
                ((C0961f) this.f4292k).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f4291j) {
            case 1:
                return ((C0961f) this.f4292k).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f4291j) {
            case 1:
                return ((C0961f) this.f4292k).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4291j) {
            case 0:
                C1021z c1021z = (C1021z) this.f4292k;
                Map mapM2213b = c1021z.m2213b();
                return mapM2213b != null ? mapM2213b.values().iterator() : new C1009v(c1021z, 2);
            default:
                return new C0963f1(((C0961f) this.f4292k).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f4291j) {
            case 1:
                C0961f c0961f = (C0961f) this.f4292k;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : c0961f.entrySet()) {
                        if (AbstractC0120b.m422r(obj, entry.getValue())) {
                            c0961f.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f4291j) {
            case 1:
                C0961f c0961f = (C0961f) this.f4292k;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : c0961f.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0961f.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f4291j) {
            case 1:
                C0961f c0961f = (C0961f) this.f4292k;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : c0961f.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0961f.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f4291j) {
            case 0:
                return ((C1021z) this.f4292k).size();
            default:
                return ((C0961f) this.f4292k).f4186l.size();
        }
    }

    public C1018y(C0961f c0961f) {
        this.f4292k = c0961f;
    }
}
