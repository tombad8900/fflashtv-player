package p061g7;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g7.a */
/* loaded from: classes.dex */
public final class C1054a implements InterfaceC1061h {

    /* renamed from: a */
    public final AtomicReference f4469a;

    public C1054a(InterfaceC1061h interfaceC1061h) {
        this.f4469a = new AtomicReference(interfaceC1061h);
    }

    @Override // p061g7.InterfaceC1061h
    public final Iterator iterator() {
        InterfaceC1061h interfaceC1061h = (InterfaceC1061h) this.f4469a.getAndSet(null);
        if (interfaceC1061h != null) {
            return interfaceC1061h.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
