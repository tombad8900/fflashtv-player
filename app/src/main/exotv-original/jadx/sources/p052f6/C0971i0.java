package p052f6;

import java.io.Serializable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.i0 */
/* loaded from: classes.dex */
public final class C0971i0 extends AbstractC0988o implements Serializable {

    /* renamed from: j */
    public final Object f4198j;

    /* renamed from: k */
    public final Object f4199k;

    public C0971i0(Object obj, Object obj2) {
        this.f4198j = obj;
        this.f4199k = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4198j;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4199k;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
