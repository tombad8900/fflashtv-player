package p119n6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p008a7.InterfaceC0113a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n6.h */
/* loaded from: classes.dex */
public final class C2028h extends AbstractCollection implements Collection, InterfaceC0113a {

    /* renamed from: j */
    public final C2026f f7487j;

    public C2028h(C2026f c2026f) {
        this.f7487j = c2026f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f7487j.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7487j.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f7487j.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C2026f c2026f = this.f7487j;
        c2026f.getClass();
        return new C2024d(c2026f, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C2026f c2026f = this.f7487j;
        c2026f.m3911b();
        int iM3917h = c2026f.m3917h(obj);
        if (iM3917h < 0) {
            return false;
        }
        c2026f.m3920k(iM3917h);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        this.f7487j.m3911b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC2980h.m5136e("elements", collection);
        this.f7487j.m3911b();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f7487j.f7480r;
    }
}
