package p052f6;

import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.r0 */
/* loaded from: classes.dex */
public final class C0998r0 extends AbstractC1023z1 {

    /* renamed from: j */
    public final AbstractC1023z1 f4251j;

    /* renamed from: k */
    public Object f4252k;

    /* renamed from: l */
    public AbstractC1023z1 f4253l;

    public C0998r0(AbstractC0986n0 abstractC0986n0) {
        abstractC0986n0.getClass();
        this.f4251j = C0996q1.f4246p.entrySet().iterator();
        this.f4252k = null;
        this.f4253l = C1019y0.f4293m;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4253l.hasNext() || this.f4251j.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f4253l.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f4251j.next();
            this.f4252k = entry.getKey();
            this.f4253l = ((AbstractC0968h0) entry.getValue()).iterator();
        }
        Object obj = this.f4252k;
        Objects.requireNonNull(obj);
        return new C0971i0(obj, this.f4253l.next());
    }
}
