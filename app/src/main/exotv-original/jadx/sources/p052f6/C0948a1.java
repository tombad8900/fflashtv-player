package p052f6;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.a1 */
/* loaded from: classes.dex */
public final class C0948a1 extends AbstractC1023z1 {

    /* renamed from: j */
    public final Object f4158j;

    /* renamed from: k */
    public boolean f4159k;

    public C0948a1(Object obj) {
        this.f4158j = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f4159k;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4159k) {
            throw new NoSuchElementException();
        }
        this.f4159k = true;
        return this.f4158j;
    }
}
