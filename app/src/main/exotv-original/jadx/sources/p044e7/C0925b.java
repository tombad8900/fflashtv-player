package p044e7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p008a7.InterfaceC0113a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e7.b */
/* loaded from: classes.dex */
public final class C0925b implements Iterator, InterfaceC0113a {

    /* renamed from: j */
    public final int f3989j;

    /* renamed from: k */
    public final int f3990k;

    /* renamed from: l */
    public boolean f3991l;

    /* renamed from: m */
    public int f3992m;

    public C0925b(int i, int i4, int i8) {
        this.f3989j = i8;
        this.f3990k = i4;
        boolean z7 = false;
        if (i8 <= 0 ? i >= i4 : i <= i4) {
            z7 = true;
        }
        this.f3991l = z7;
        this.f3992m = z7 ? i : i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3991l;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.f3992m;
        if (i != this.f3990k) {
            this.f3992m = this.f3989j + i;
            return i;
        }
        if (!this.f3991l) {
            throw new NoSuchElementException();
        }
        this.f3991l = false;
        return i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
