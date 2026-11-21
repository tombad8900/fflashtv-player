package p061g7;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p008a7.InterfaceC0113a;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p195w4.C2658e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g7.n */
/* loaded from: classes.dex */
public final class C1067n implements Iterator, InterfaceC0113a {

    /* renamed from: j */
    public final /* synthetic */ int f4493j;

    /* renamed from: k */
    public Iterator f4494k;

    /* renamed from: l */
    public final Object f4495l;

    public C1067n(C1055b c1055b) {
        this.f4493j = 1;
        this.f4495l = new ArrayList();
        this.f4494k = c1055b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4493j) {
        }
        return this.f4494k.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4493j) {
            case 0:
                return ((C2658e) ((C1058e) this.f4495l).f4481c).invoke(this.f4494k.next());
            default:
                Object next = this.f4494k.next();
                ArrayList arrayList = (ArrayList) this.f4495l;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                C1055b c1055b = viewGroup != null ? new C1055b(1, viewGroup) : null;
                if (c1055b == null || !c1055b.hasNext()) {
                    while (!this.f4494k.hasNext() && !arrayList.isEmpty()) {
                        this.f4494k = (Iterator) AbstractC1913h.m3741F0(arrayList);
                        if (arrayList.isEmpty()) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        arrayList.remove(AbstractC1914i.m3752s0(arrayList));
                    }
                } else {
                    arrayList.add(this.f4494k);
                    this.f4494k = c1055b;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4493j) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1067n(C1058e c1058e) {
        this.f4493j = 0;
        this.f4495l = c1058e;
        this.f4494k = ((Iterable) ((C1060g) c1058e.f4480b).f4486b).iterator();
    }
}
