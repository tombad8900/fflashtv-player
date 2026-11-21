package p052f6;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.v */
/* loaded from: classes.dex */
public final class C1009v implements Iterator {

    /* renamed from: j */
    public int f4272j;

    /* renamed from: k */
    public int f4273k;

    /* renamed from: l */
    public int f4274l;

    /* renamed from: m */
    public final /* synthetic */ C1021z f4275m;

    /* renamed from: n */
    public final /* synthetic */ int f4276n;

    /* renamed from: o */
    public final /* synthetic */ C1021z f4277o;

    public C1009v(C1021z c1021z, int i) {
        this.f4276n = i;
        this.f4277o = c1021z;
        this.f4275m = c1021z;
        this.f4272j = c1021z.f4301n;
        this.f4273k = c1021z.isEmpty() ? -1 : 0;
        this.f4274l = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4273k >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c1015x;
        C1021z c1021z = this.f4275m;
        if (c1021z.f4301n != this.f4272j) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f4273k;
        this.f4274l = i;
        switch (this.f4276n) {
            case 0:
                c1015x = this.f4277o.m2220i()[i];
                break;
            case 1:
                c1015x = new C1015x(this.f4277o, i);
                break;
            default:
                c1015x = this.f4277o.m2221j()[i];
                break;
        }
        int i4 = this.f4273k + 1;
        if (i4 >= c1021z.f4302o) {
            i4 = -1;
        }
        this.f4273k = i4;
        return c1015x;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1021z c1021z = this.f4275m;
        int i = c1021z.f4301n;
        int i4 = this.f4272j;
        if (i != i4) {
            throw new ConcurrentModificationException();
        }
        int i8 = this.f4274l;
        if (!(i8 >= 0)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f4272j = i4 + 32;
        c1021z.remove(c1021z.m2220i()[i8]);
        this.f4273k--;
        this.f4274l = -1;
    }
}
