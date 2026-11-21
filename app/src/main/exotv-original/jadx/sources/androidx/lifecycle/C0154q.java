package androidx.lifecycle;

import p076i7.C1279a1;
import p076i7.C1329s;
import p076i7.C1332t0;
import p076i7.InterfaceC1330s0;
import p076i7.InterfaceC1333u;
import p137p6.InterfaceC2227h;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.q */
/* loaded from: classes.dex */
public final class C0154q implements InterfaceC0160t, InterfaceC1333u {

    /* renamed from: j */
    public final AbstractC0150o f942j;

    /* renamed from: k */
    public final InterfaceC2227h f943k;

    public C0154q(AbstractC0150o abstractC0150o, InterfaceC2227h interfaceC2227h) {
        InterfaceC1330s0 interfaceC1330s0;
        AbstractC2980h.m5136e("coroutineContext", interfaceC2227h);
        this.f942j = abstractC0150o;
        this.f943k = interfaceC2227h;
        if (abstractC0150o.mo569b() != EnumC0148n.f925j || (interfaceC1330s0 = (InterfaceC1330s0) interfaceC2227h.mo2760b(C1329s.f5369k)) == null) {
            return;
        }
        C1279a1 c1279a1 = (C1279a1) interfaceC1330s0;
        c1279a1.m2765m(new C1332t0(c1279a1.mo2742o(), null, c1279a1));
    }

    @Override // androidx.lifecycle.InterfaceC0160t
    /* renamed from: c */
    public final void mo249c(InterfaceC0164v interfaceC0164v, EnumC0146m enumC0146m) {
        AbstractC0150o abstractC0150o = this.f942j;
        if (abstractC0150o.mo569b().compareTo(EnumC0148n.f925j) <= 0) {
            abstractC0150o.mo575i(this);
            InterfaceC1330s0 interfaceC1330s0 = (InterfaceC1330s0) this.f943k.mo2760b(C1329s.f5369k);
            if (interfaceC1330s0 != null) {
                C1279a1 c1279a1 = (C1279a1) interfaceC1330s0;
                c1279a1.m2765m(new C1332t0(c1279a1.mo2742o(), null, c1279a1));
            }
        }
    }

    @Override // p076i7.InterfaceC1333u
    /* renamed from: h */
    public final InterfaceC2227h mo579h() {
        return this.f943k;
    }
}
