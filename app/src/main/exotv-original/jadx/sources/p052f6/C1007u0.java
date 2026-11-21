package p052f6;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.u0 */
/* loaded from: classes.dex */
public final class C1007u0 extends AbstractC0968h0 {

    /* renamed from: k */
    public final transient AbstractC0986n0 f4269k;

    public C1007u0(AbstractC0986n0 abstractC0986n0) {
        this.f4269k = abstractC0986n0;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: b */
    public final int mo2151b(int i, Object[] objArr) {
        this.f4269k.getClass();
        C0977k0 c0977k0ListIterator = ((AbstractC0983m0) C0996q1.f4246p.values()).listIterator(0);
        while (c0977k0ListIterator.hasNext()) {
            i = ((AbstractC0968h0) c0977k0ListIterator.next()).mo2151b(i, objArr);
        }
        return i;
    }

    @Override // p052f6.AbstractC0968h0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4269k.mo2175c(obj);
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: g */
    public final AbstractC1023z1 iterator() {
        AbstractC0986n0 abstractC0986n0 = this.f4269k;
        abstractC0986n0.getClass();
        return new C1001s0(abstractC0986n0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        this.f4269k.getClass();
        return 0;
    }
}
