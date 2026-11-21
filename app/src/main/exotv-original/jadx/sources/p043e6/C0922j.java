package p043e6;

import java.io.Serializable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e6.j */
/* loaded from: classes.dex */
public final class C0922j implements InterfaceC0921i, Serializable {

    /* renamed from: j */
    public final transient Object f3978j = new Object();

    /* renamed from: k */
    public final InterfaceC0921i f3979k;

    /* renamed from: l */
    public volatile transient boolean f3980l;

    /* renamed from: m */
    public transient Object f3981m;

    public C0922j(InterfaceC0921i interfaceC0921i) {
        this.f3979k = interfaceC0921i;
    }

    @Override // p043e6.InterfaceC0921i
    public final Object get() {
        if (!this.f3980l) {
            synchronized (this.f3978j) {
                try {
                    if (!this.f3980l) {
                        Object obj = this.f3979k.get();
                        this.f3981m = obj;
                        this.f3980l = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f3981m;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f3980l) {
            obj = "<supplier that returned " + this.f3981m + ">";
        } else {
            obj = this.f3979k;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
