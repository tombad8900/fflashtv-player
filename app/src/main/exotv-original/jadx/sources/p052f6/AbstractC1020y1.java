package p052f6;

import java.util.Iterator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.y1 */
/* loaded from: classes.dex */
public abstract class AbstractC1020y1 implements Iterator {

    /* renamed from: j */
    public final Iterator f4295j;

    public AbstractC1020y1(Iterator it) {
        it.getClass();
        this.f4295j = it;
    }

    /* renamed from: a */
    public abstract Object mo2137a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4295j.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo2137a(this.f4295j.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4295j.remove();
    }
}
