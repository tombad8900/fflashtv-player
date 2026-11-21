package p061g7;

import com.bumptech.glide.AbstractC0714c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p008a7.InterfaceC0113a;
import p102l6.C1693j;
import p137p6.C2228i;
import p137p6.InterfaceC2222c;
import p137p6.InterfaceC2227h;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g7.i */
/* loaded from: classes.dex */
public final class C1062i implements Iterator, InterfaceC2222c, InterfaceC0113a {

    /* renamed from: j */
    public int f4487j;

    /* renamed from: k */
    public Object f4488k;

    /* renamed from: l */
    public Iterator f4489l;

    /* renamed from: m */
    public InterfaceC2222c f4490m;

    /* renamed from: a */
    public final RuntimeException m2247a() {
        int i = this.f4487j;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f4487j);
    }

    @Override // p137p6.InterfaceC2222c
    /* renamed from: d */
    public final void mo2248d(Object obj) throws Throwable {
        AbstractC0714c.m1516d0(obj);
        this.f4487j = 4;
    }

    @Override // p137p6.InterfaceC2222c
    /* renamed from: f */
    public final InterfaceC2227h mo2249f() {
        return C2228i.f7747j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f4487j;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m2247a();
                }
                Iterator it = this.f4489l;
                AbstractC2980h.m5133b(it);
                if (it.hasNext()) {
                    this.f4487j = 2;
                    return true;
                }
                this.f4489l = null;
            }
            this.f4487j = 5;
            InterfaceC2222c interfaceC2222c = this.f4490m;
            AbstractC2980h.m5133b(interfaceC2222c);
            this.f4490m = null;
            interfaceC2222c.mo2248d(C1693j.f6497a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4487j;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f4487j = 1;
            Iterator it = this.f4489l;
            AbstractC2980h.m5133b(it);
            return it.next();
        }
        if (i != 3) {
            throw m2247a();
        }
        this.f4487j = 0;
        Object obj = this.f4488k;
        this.f4488k = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
