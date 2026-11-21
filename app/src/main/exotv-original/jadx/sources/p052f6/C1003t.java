package p052f6;

import java.io.Serializable;
import java.util.Arrays;
import p043e6.InterfaceC0916d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.t */
/* loaded from: classes.dex */
public final class C1003t extends AbstractC0978k1 implements Serializable {

    /* renamed from: j */
    public final InterfaceC0916d f4264j;

    /* renamed from: k */
    public final AbstractC0978k1 f4265k;

    public C1003t(InterfaceC0916d interfaceC0916d, AbstractC0978k1 abstractC0978k1) {
        this.f4264j = interfaceC0916d;
        this.f4265k = abstractC0978k1;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC0916d interfaceC0916d = this.f4264j;
        return this.f4265k.compare(interfaceC0916d.apply(obj), interfaceC0916d.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1003t) {
            C1003t c1003t = (C1003t) obj;
            if (this.f4264j.equals(c1003t.f4264j) && this.f4265k.equals(c1003t.f4265k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4264j, this.f4265k});
    }

    public final String toString() {
        return this.f4265k + ".onResultOf(" + this.f4264j + ")";
    }
}
