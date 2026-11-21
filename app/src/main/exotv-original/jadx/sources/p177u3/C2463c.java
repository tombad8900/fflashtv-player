package p177u3;

import p002a1.C0048u;
import p151r3.AbstractC2300l;
import p151r3.C2294f;
import p151r3.C2306r;
import p169t3.C2433a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u3.c */
/* loaded from: classes.dex */
public final class C2463c implements InterfaceC2465e {

    /* renamed from: j */
    public final C2433a f9045j;

    /* renamed from: k */
    public final AbstractC2300l f9046k;

    public C2463c(C2433a c2433a, AbstractC2300l abstractC2300l) {
        this.f9045j = c2433a;
        this.f9046k = abstractC2300l;
    }

    @Override // p177u3.InterfaceC2465e
    /* renamed from: a */
    public final void mo346a() {
        AbstractC2300l abstractC2300l = this.f9046k;
        boolean z7 = abstractC2300l instanceof C2306r;
        C2433a c2433a = this.f9045j;
        if (z7) {
            c2433a.m4328d(((C2306r) abstractC2300l).f8072a);
        } else {
            if (!(abstractC2300l instanceof C2294f)) {
                throw new C0048u();
            }
            c2433a.m4328d(((C2294f) abstractC2300l).f8006a);
        }
    }
}
