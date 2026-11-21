package p052f6;

import java.io.Serializable;
import java.util.Collection;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.n0 */
/* loaded from: classes.dex */
public abstract class AbstractC0986n0 extends AbstractC1000s implements InterfaceC0951b1, Serializable {
    @Override // p052f6.InterfaceC0966g1
    /* renamed from: a */
    public final Collection mo2125a() {
        Collection c1004t0 = this.f4239j;
        if (c1004t0 == null) {
            c1004t0 = new C1004t0(this);
            this.f4239j = c1004t0;
        }
        return (AbstractC0968h0) c1004t0;
    }

    @Override // p052f6.AbstractC0994q
    /* renamed from: c */
    public final boolean mo2175c(Object obj) {
        return obj != null && super.mo2175c(obj);
    }

    @Override // p052f6.InterfaceC0966g1
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC0983m0 get(Object obj) {
        AbstractC0983m0 abstractC0983m0 = (AbstractC0983m0) C0996q1.f4246p.get(obj);
        if (abstractC0983m0 != null) {
            return abstractC0983m0;
        }
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        return C0981l1.f4211n;
    }

    @Override // p052f6.InterfaceC0966g1
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // p052f6.AbstractC0994q, p052f6.InterfaceC0966g1
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // p052f6.InterfaceC0966g1
    public final int size() {
        return 0;
    }

    @Override // p052f6.InterfaceC0966g1
    public final Collection values() {
        Collection c1007u0 = this.f4241l;
        if (c1007u0 == null) {
            c1007u0 = new C1007u0(this);
            this.f4241l = c1007u0;
        }
        return (AbstractC0968h0) c1007u0;
    }
}
