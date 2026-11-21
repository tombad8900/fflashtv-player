package p154r6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p076i7.C1295g;
import p112m7.AbstractC1925a;
import p112m7.C1930f;
import p137p6.C2223d;
import p137p6.InterfaceC2222c;
import p137p6.InterfaceC2225f;
import p137p6.InterfaceC2227h;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r6.c */
/* loaded from: classes.dex */
public abstract class AbstractC2320c extends AbstractC2318a {

    /* renamed from: k */
    public final InterfaceC2227h f8131k;

    /* renamed from: l */
    public transient InterfaceC2222c f8132l;

    public AbstractC2320c(InterfaceC2222c interfaceC2222c, InterfaceC2227h interfaceC2227h) {
        super(interfaceC2222c);
        this.f8131k = interfaceC2227h;
    }

    @Override // p137p6.InterfaceC2222c
    /* renamed from: f */
    public final InterfaceC2227h mo2249f() {
        InterfaceC2227h interfaceC2227h = this.f8131k;
        AbstractC2980h.m5133b(interfaceC2227h);
        return interfaceC2227h;
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: k */
    public final void mo4102k() {
        InterfaceC2222c interfaceC2222c = this.f8132l;
        if (interfaceC2222c != null && interfaceC2222c != this) {
            InterfaceC2227h interfaceC2227h = this.f8131k;
            AbstractC2980h.m5133b(interfaceC2227h);
            InterfaceC2225f interfaceC2225fMo2760b = interfaceC2227h.mo2760b(C2223d.f7746j);
            AbstractC2980h.m5133b(interfaceC2225fMo2760b);
            C1930f c1930f = (C1930f) interfaceC2222c;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1930f.f7202q;
            while (atomicReferenceFieldUpdater.get(c1930f) == AbstractC1925a.f7192c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(c1930f);
            C1295g c1295g = obj instanceof C1295g ? (C1295g) obj : null;
            if (c1295g != null) {
                c1295g.m2806r();
            }
        }
        this.f8132l = C2319b.f8130j;
    }

    public AbstractC2320c(InterfaceC2222c interfaceC2222c) {
        this(interfaceC2222c, interfaceC2222c != null ? interfaceC2222c.mo2249f() : null);
    }
}
