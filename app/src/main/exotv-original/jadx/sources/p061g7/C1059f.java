package p061g7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p008a7.InterfaceC0113a;
import p026c7.AbstractC0711e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g7.f */
/* loaded from: classes.dex */
public final class C1059f implements Iterator, InterfaceC0113a {

    /* renamed from: j */
    public Object f4482j;

    /* renamed from: k */
    public int f4483k = -2;

    /* renamed from: l */
    public final /* synthetic */ C1060g f4484l;

    public C1059f(C1060g c1060g) {
        this.f4484l = c1060g;
    }

    /* renamed from: a */
    public final void m2246a() {
        Object objInvoke;
        if (this.f4483k == -2) {
            objInvoke = Integer.valueOf(AbstractC0711e.f2770k.mo1479d().nextInt(2147418112) + 65536);
        } else {
            C1065l c1065l = (C1065l) this.f4484l.f4486b;
            Object obj = this.f4482j;
            AbstractC2980h.m5133b(obj);
            objInvoke = c1065l.invoke(obj);
        }
        this.f4482j = objInvoke;
        this.f4483k = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4483k < 0) {
            m2246a();
        }
        return this.f4483k == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4483k < 0) {
            m2246a();
        }
        if (this.f4483k == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f4482j;
        AbstractC2980h.m5134c("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence", obj);
        this.f4483k = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
