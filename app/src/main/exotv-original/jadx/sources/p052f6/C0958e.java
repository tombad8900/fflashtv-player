package p052f6;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.e */
/* loaded from: classes.dex */
public class C0958e implements Iterator {

    /* renamed from: j */
    public final /* synthetic */ int f4177j = 0;

    /* renamed from: k */
    public final Iterator f4178k;

    /* renamed from: l */
    public Object f4179l;

    /* renamed from: m */
    public final /* synthetic */ Object f4180m;

    public C0958e(C0985n c0985n) {
        this.f4180m = c0985n;
        Collection collection = c0985n.f4218k;
        this.f4179l = collection;
        this.f4178k = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* renamed from: a */
    public void m2138a() {
        C0985n c0985n = (C0985n) this.f4180m;
        c0985n.m2173b();
        if (c0985n.f4218k != ((Collection) this.f4179l)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4177j) {
            case 0:
                break;
            case 1:
                break;
            default:
                m2138a();
                break;
        }
        return this.f4178k.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4177j) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f4178k.next();
                this.f4179l = (Collection) entry.getValue();
                return ((C0961f) this.f4180m).m2139a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f4178k.next();
                this.f4179l = entry2;
                return entry2.getKey();
            default:
                m2138a();
                return this.f4178k.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4177j) {
            case 0:
                if (!(((Collection) this.f4179l) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f4178k.remove();
                ((C0961f) this.f4180m).f4187m.f4161o -= ((Collection) this.f4179l).size();
                ((Collection) this.f4179l).clear();
                this.f4179l = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.f4179l;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.f4178k.remove();
                ((C0964g) this.f4180m).f4190k.f4161o -= collection.size();
                collection.clear();
                this.f4179l = null;
                return;
            default:
                this.f4178k.remove();
                C0985n c0985n = (C0985n) this.f4180m;
                AbstractC0949b abstractC0949b = c0985n.f4221n;
                abstractC0949b.f4161o--;
                c0985n.m2174c();
                return;
        }
    }

    public C0958e(C0985n c0985n, ListIterator listIterator) {
        this.f4180m = c0985n;
        this.f4179l = c0985n.f4218k;
        this.f4178k = listIterator;
    }

    public C0958e(C0964g c0964g, Iterator it) {
        this.f4178k = it;
        this.f4180m = c0964g;
    }

    public C0958e(C0961f c0961f) {
        this.f4180m = c0961f;
        this.f4178k = c0961f.f4186l.entrySet().iterator();
    }
}
