package p061g7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p008a7.InterfaceC0113a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g7.d */
/* loaded from: classes.dex */
public final class C1057d implements Iterator, InterfaceC0113a {

    /* renamed from: j */
    public final Iterator f4475j;

    /* renamed from: k */
    public int f4476k = -1;

    /* renamed from: l */
    public Object f4477l;

    /* renamed from: m */
    public final /* synthetic */ C1058e f4478m;

    public C1057d(C1058e c1058e) {
        this.f4478m = c1058e;
        this.f4475j = new C1067n((C1058e) c1058e.f4480b);
    }

    /* renamed from: a */
    public final void m2245a() {
        Object next;
        do {
            Iterator it = this.f4475j;
            if (!it.hasNext()) {
                this.f4476k = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((C1065l) this.f4478m.f4481c).invoke(next)).booleanValue());
        this.f4477l = next;
        this.f4476k = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4476k == -1) {
            m2245a();
        }
        return this.f4476k == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4476k == -1) {
            m2245a();
        }
        if (this.f4476k == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f4477l;
        this.f4477l = null;
        this.f4476k = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
