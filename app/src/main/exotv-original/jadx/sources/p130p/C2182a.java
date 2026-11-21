package p130p;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p008a7.InterfaceC0113a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p.a */
/* loaded from: classes.dex */
public final class C2182a implements Iterator, InterfaceC0113a {

    /* renamed from: j */
    public int f7620j;

    /* renamed from: k */
    public int f7621k;

    /* renamed from: l */
    public boolean f7622l;

    /* renamed from: m */
    public final /* synthetic */ int f7623m;

    /* renamed from: n */
    public final /* synthetic */ Object f7624n;

    public C2182a(int i) {
        this.f7620j = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7621k < this.f7620j;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM3992f;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f7621k;
        switch (this.f7623m) {
            case 0:
                objM3992f = ((C2186e) this.f7624n).m3992f(i);
                break;
            case 1:
                objM3992f = ((C2186e) this.f7624n).m3996j(i);
                break;
            default:
                objM3992f = ((C2187f) this.f7624n).f7635k[i];
                break;
        }
        this.f7621k++;
        this.f7622l = true;
        return objM3992f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7622l) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f7621k - 1;
        this.f7621k = i;
        switch (this.f7623m) {
            case 0:
                ((C2186e) this.f7624n).mo3994h(i);
                break;
            case 1:
                ((C2186e) this.f7624n).mo3994h(i);
                break;
            default:
                ((C2187f) this.f7624n).m3963a(i);
                break;
        }
        this.f7620j--;
        this.f7622l = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2182a(C2187f c2187f) {
        this(c2187f.f7636l);
        this.f7623m = 2;
        this.f7624n = c2187f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2182a(C2186e c2186e, int i) {
        this(c2186e.f7656l);
        this.f7623m = i;
        switch (i) {
            case 1:
                this.f7624n = c2186e;
                this(c2186e.f7656l);
                break;
            default:
                this.f7624n = c2186e;
                break;
        }
    }
}
