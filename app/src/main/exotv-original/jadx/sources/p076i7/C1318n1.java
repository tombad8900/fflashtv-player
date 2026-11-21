package p076i7;

import p102l6.C1687d;
import p112m7.AbstractC1925a;
import p112m7.C1941q;
import p137p6.C2223d;
import p137p6.InterfaceC2222c;
import p137p6.InterfaceC2227h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.n1 */
/* loaded from: classes.dex */
public final class C1318n1 extends C1941q {

    /* renamed from: n */
    public final ThreadLocal f5356n;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1318n1(InterfaceC2222c interfaceC2222c, InterfaceC2227h interfaceC2227h) {
        C1321o1 c1321o1 = C1321o1.f5360j;
        super(interfaceC2222c, interfaceC2227h.mo2760b(c1321o1) == null ? interfaceC2227h.mo2761c(c1321o1) : interfaceC2227h);
        this.f5356n = new ThreadLocal();
        if (interfaceC2222c.mo2249f().mo2760b(C2223d.f7746j) instanceof AbstractC1327r) {
            return;
        }
        Object objM3773i = AbstractC1925a.m3773i(interfaceC2227h, null);
        AbstractC1925a.m3769e(interfaceC2227h, objM3773i);
        m2837V(interfaceC2227h, objM3773i);
    }

    /* renamed from: U */
    public final boolean m2836U() {
        boolean z7 = this.threadLocalIsSet && this.f5356n.get() == null;
        this.f5356n.remove();
        return !z7;
    }

    /* renamed from: V */
    public final void m2837V(InterfaceC2227h interfaceC2227h, Object obj) {
        this.threadLocalIsSet = true;
        this.f5356n.set(new C1687d(interfaceC2227h, obj));
    }

    @Override // p112m7.C1941q, p076i7.C1279a1
    /* renamed from: l */
    public final void mo2764l(Object obj) {
        if (this.threadLocalIsSet) {
            C1687d c1687d = (C1687d) this.f5356n.get();
            if (c1687d != null) {
                AbstractC1925a.m3769e((InterfaceC2227h) c1687d.f6486j, c1687d.f6487k);
            }
            this.f5356n.remove();
        }
        Object objM2851l = AbstractC1339x.m2851l(obj);
        InterfaceC2222c interfaceC2222c = this.f7229m;
        InterfaceC2227h interfaceC2227hMo2249f = interfaceC2222c.mo2249f();
        Object objM3773i = AbstractC1925a.m3773i(interfaceC2227hMo2249f, null);
        C1318n1 c1318n1M2856q = objM3773i != AbstractC1925a.f7193d ? AbstractC1339x.m2856q(interfaceC2222c, interfaceC2227hMo2249f, objM3773i) : null;
        try {
            this.f7229m.mo2248d(objM2851l);
            if (c1318n1M2856q == null || c1318n1M2856q.m2836U()) {
                AbstractC1925a.m3769e(interfaceC2227hMo2249f, objM3773i);
            }
        } catch (Throwable th) {
            if (c1318n1M2856q == null || c1318n1M2856q.m2836U()) {
                AbstractC1925a.m3769e(interfaceC2227hMo2249f, objM3773i);
            }
            throw th;
        }
    }
}
