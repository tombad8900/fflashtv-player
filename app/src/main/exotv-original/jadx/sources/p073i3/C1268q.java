package p073i3;

import com.bumptech.glide.AbstractC0714c;
import p185v3.AbstractC2536f;
import p189v7.AbstractC2585p;
import p189v7.C2592w;
import p189v7.InterfaceC2577l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i3.q */
/* loaded from: classes.dex */
public final class C1268q extends AbstractC1266o {

    /* renamed from: j */
    public final AbstractC0714c f5275j;

    /* renamed from: k */
    public boolean f5276k;

    /* renamed from: l */
    public final InterfaceC2577l f5277l;

    public C1268q(InterfaceC2577l interfaceC2577l, AbstractC0714c abstractC0714c) {
        this.f5275j = abstractC0714c;
        this.f5277l = interfaceC2577l;
    }

    @Override // p073i3.AbstractC1266o
    /* renamed from: b */
    public final AbstractC0714c mo2736b() {
        return this.f5275j;
    }

    @Override // p073i3.AbstractC1266o
    /* renamed from: c */
    public final synchronized InterfaceC2577l mo2737c() {
        InterfaceC2577l interfaceC2577l;
        try {
            if (this.f5276k) {
                throw new IllegalStateException("closed");
            }
            interfaceC2577l = this.f5277l;
            if (interfaceC2577l == null) {
                C2592w c2592w = AbstractC2585p.f9330a;
                AbstractC2980h.m5133b(null);
                c2592w.mo3163l(null);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC2577l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f5276k = true;
        InterfaceC2577l interfaceC2577l = this.f5277l;
        if (interfaceC2577l != null) {
            AbstractC2536f.m4554a(interfaceC2577l);
        }
    }
}
