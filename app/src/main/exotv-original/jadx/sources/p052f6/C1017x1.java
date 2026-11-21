package p052f6;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.x1 */
/* loaded from: classes.dex */
public final class C1017x1 extends AbstractC1013w0 {

    /* renamed from: m */
    public final transient Object f4290m;

    public C1017x1(Object obj) {
        obj.getClass();
        this.f4290m = obj;
    }

    @Override // p052f6.AbstractC1013w0, p052f6.AbstractC0968h0
    /* renamed from: a */
    public final AbstractC0983m0 mo2150a() {
        return AbstractC0983m0.m2168n(this.f4290m);
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: b */
    public final int mo2151b(int i, Object[] objArr) {
        objArr[i] = this.f4290m;
        return i + 1;
    }

    @Override // p052f6.AbstractC0968h0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4290m.equals(obj);
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: f */
    public final boolean mo2155f() {
        return false;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: g */
    public final AbstractC1023z1 iterator() {
        return new C0948a1(this.f4290m);
    }

    @Override // p052f6.AbstractC1013w0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4290m.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f4290m.toString() + ']';
    }
}
