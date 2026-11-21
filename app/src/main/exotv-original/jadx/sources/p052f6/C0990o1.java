package p052f6;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.o1 */
/* loaded from: classes.dex */
public final class C0990o1 extends AbstractC1013w0 {

    /* renamed from: m */
    public final transient AbstractC0995q0 f4229m;

    /* renamed from: n */
    public final transient C0993p1 f4230n;

    public C0990o1(AbstractC0995q0 abstractC0995q0, C0993p1 c0993p1) {
        this.f4229m = abstractC0995q0;
        this.f4230n = c0993p1;
    }

    @Override // p052f6.AbstractC1013w0, p052f6.AbstractC0968h0
    /* renamed from: a */
    public final AbstractC0983m0 mo2150a() {
        return this.f4230n;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: b */
    public final int mo2151b(int i, Object[] objArr) {
        return this.f4230n.mo2151b(i, objArr);
    }

    @Override // p052f6.AbstractC0968h0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4229m.get(obj) != null;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: f */
    public final boolean mo2155f() {
        return true;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: g */
    public final AbstractC1023z1 iterator() {
        return this.f4230n.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((C0996q1) this.f4229m).f4249o;
    }
}
