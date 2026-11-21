package p052f6;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.t0 */
/* loaded from: classes.dex */
public final class C1004t0 extends AbstractC0968h0 {

    /* renamed from: k */
    public final AbstractC0986n0 f4266k;

    public C1004t0(AbstractC0986n0 abstractC0986n0) {
        this.f4266k = abstractC0986n0;
    }

    @Override // p052f6.AbstractC0968h0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.f4266k.getClass();
            Collection collection = (Collection) C0996q1.f4246p.get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: g */
    public final AbstractC1023z1 iterator() {
        AbstractC0986n0 abstractC0986n0 = this.f4266k;
        abstractC0986n0.getClass();
        return new C0998r0(abstractC0986n0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        this.f4266k.getClass();
        return 0;
    }
}
