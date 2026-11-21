package p043e6;

import androidx.media3.exoplayer.analytics.C0304z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e6.k */
/* loaded from: classes.dex */
public final class C0923k implements InterfaceC0921i {

    /* renamed from: m */
    public static final C0304z f3982m = new C0304z(1);

    /* renamed from: j */
    public final Object f3983j = new Object();

    /* renamed from: k */
    public volatile InterfaceC0921i f3984k;

    /* renamed from: l */
    public Object f3985l;

    public C0923k(InterfaceC0921i interfaceC0921i) {
        this.f3984k = interfaceC0921i;
    }

    @Override // p043e6.InterfaceC0921i
    public final Object get() {
        InterfaceC0921i interfaceC0921i = this.f3984k;
        C0304z c0304z = f3982m;
        if (interfaceC0921i != c0304z) {
            synchronized (this.f3983j) {
                try {
                    if (this.f3984k != c0304z) {
                        Object obj = this.f3984k.get();
                        this.f3985l = obj;
                        this.f3984k = c0304z;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f3985l;
    }

    public final String toString() {
        Object obj = this.f3984k;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f3982m) {
            obj = "<supplier that returned " + this.f3985l + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
