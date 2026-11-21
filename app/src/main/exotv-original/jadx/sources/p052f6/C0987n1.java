package p052f6;

import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.n1 */
/* loaded from: classes.dex */
public final class C0987n1 extends AbstractC1013w0 {

    /* renamed from: m */
    public final transient AbstractC0995q0 f4223m;

    /* renamed from: n */
    public final transient Object[] f4224n;

    /* renamed from: o */
    public final transient int f4225o;

    public C0987n1(AbstractC0995q0 abstractC0995q0, Object[] objArr, int i) {
        this.f4223m = abstractC0995q0;
        this.f4224n = objArr;
        this.f4225o = i;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: b */
    public final int mo2151b(int i, Object[] objArr) {
        return mo2150a().mo2151b(i, objArr);
    }

    @Override // p052f6.AbstractC0968h0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f4223m.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: f */
    public final boolean mo2155f() {
        return true;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: g */
    public final AbstractC1023z1 iterator() {
        return mo2150a().listIterator(0);
    }

    @Override // p052f6.AbstractC1013w0
    /* renamed from: k */
    public final AbstractC0983m0 mo2177k() {
        return new C0984m1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4225o;
    }
}
