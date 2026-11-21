package p052f6;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.s0 */
/* loaded from: classes.dex */
public final class C1001s0 extends AbstractC1023z1 {

    /* renamed from: j */
    public final AbstractC1023z1 f4261j;

    /* renamed from: k */
    public AbstractC1023z1 f4262k;

    public C1001s0(AbstractC0986n0 abstractC0986n0) {
        abstractC0986n0.getClass();
        this.f4261j = ((AbstractC0983m0) C0996q1.f4246p.values()).listIterator(0);
        this.f4262k = C1019y0.f4293m;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4262k.hasNext() || this.f4261j.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f4262k.hasNext()) {
            this.f4262k = ((AbstractC0968h0) this.f4261j.next()).iterator();
        }
        return this.f4262k.next();
    }
}
