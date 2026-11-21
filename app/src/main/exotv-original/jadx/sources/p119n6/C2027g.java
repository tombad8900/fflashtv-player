package p119n6;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p008a7.InterfaceC0113a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n6.g */
/* loaded from: classes.dex */
public final class C2027g extends AbstractSet implements Set, InterfaceC0113a {

    /* renamed from: j */
    public final /* synthetic */ int f7485j;

    /* renamed from: k */
    public final C2026f f7486k;

    public /* synthetic */ C2027g(C2026f c2026f, int i) {
        this.f7485j = i;
        this.f7486k = c2026f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f7485j) {
            case 0:
                AbstractC2980h.m5136e("element", (Map.Entry) obj);
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f7485j) {
            case 0:
                AbstractC2980h.m5136e("elements", collection);
                throw new UnsupportedOperationException();
            default:
                AbstractC2980h.m5136e("elements", collection);
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f7485j) {
            case 0:
                this.f7486k.clear();
                break;
            default:
                this.f7486k.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f7485j) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f7486k.m3914e((Map.Entry) obj);
            default:
                return this.f7486k.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f7485j) {
            case 0:
                AbstractC2980h.m5136e("elements", collection);
                return this.f7486k.m3913d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f7485j) {
        }
        return this.f7486k.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7485j) {
            case 0:
                C2026f c2026f = this.f7486k;
                c2026f.getClass();
                return new C2024d(c2026f, 0);
            default:
                C2026f c2026f2 = this.f7486k;
                c2026f2.getClass();
                return new C2024d(c2026f2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f7485j) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C2026f c2026f = this.f7486k;
                    c2026f.getClass();
                    c2026f.m3911b();
                    int iM3916g = c2026f.m3916g(entry.getKey());
                    if (iM3916g >= 0) {
                        Object[] objArr = c2026f.f7473k;
                        AbstractC2980h.m5133b(objArr);
                        if (AbstractC2980h.m5132a(objArr[iM3916g], entry.getValue())) {
                            c2026f.m3920k(iM3916g);
                            break;
                        }
                    }
                }
                break;
            default:
                C2026f c2026f2 = this.f7486k;
                c2026f2.m3911b();
                int iM3916g2 = c2026f2.m3916g(obj);
                if (iM3916g2 >= 0) {
                    c2026f2.m3920k(iM3916g2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f7485j) {
            case 0:
                AbstractC2980h.m5136e("elements", collection);
                this.f7486k.m3911b();
                break;
            default:
                AbstractC2980h.m5136e("elements", collection);
                this.f7486k.m3911b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f7485j) {
            case 0:
                AbstractC2980h.m5136e("elements", collection);
                this.f7486k.m3911b();
                break;
            default:
                AbstractC2980h.m5136e("elements", collection);
                this.f7486k.m3911b();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f7485j) {
        }
        return this.f7486k.f7480r;
    }
}
