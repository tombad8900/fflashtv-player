package p052f6;

import java.io.Serializable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.s1 */
/* loaded from: classes.dex */
public final class C1002s1 extends AbstractC0978k1 implements Serializable {

    /* renamed from: j */
    public final AbstractC0978k1 f4263j;

    public C1002s1(AbstractC0978k1 abstractC0978k1) {
        this.f4263j = abstractC0978k1;
    }

    @Override // p052f6.AbstractC0978k1
    /* renamed from: a */
    public final AbstractC0978k1 mo2160a() {
        return this.f4263j;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f4263j.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1002s1) {
            return this.f4263j.equals(((C1002s1) obj).f4263j);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f4263j.hashCode();
    }

    public final String toString() {
        return this.f4263j + ".reverse()";
    }
}
