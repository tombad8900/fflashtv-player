package p151r3;

import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.InterfaceC0164v;
import java.util.concurrent.CancellationException;
import p065h3.C1163h;
import p076i7.AbstractC1339x;
import p076i7.InterfaceC1330s0;
import p169t3.C2433a;
import p185v3.AbstractC2536f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r3.t */
/* loaded from: classes.dex */
public final class C2308t implements InterfaceC2305q {

    /* renamed from: j */
    public final C1163h f8081j;

    /* renamed from: k */
    public final C2299k f8082k;

    /* renamed from: l */
    public final C2433a f8083l;

    /* renamed from: m */
    public final AbstractC0150o f8084m;

    /* renamed from: n */
    public final InterfaceC1330s0 f8085n;

    public C2308t(C1163h c1163h, C2299k c2299k, C2433a c2433a, AbstractC0150o abstractC0150o, InterfaceC1330s0 interfaceC1330s0) {
        this.f8081j = c1163h;
        this.f8082k = c2299k;
        this.f8083l = c2433a;
        this.f8084m = abstractC0150o;
        this.f8085n = interfaceC1330s0;
    }

    @Override // p151r3.InterfaceC2305q
    /* renamed from: g */
    public final void mo4097g() {
        C2433a c2433a = this.f8083l;
        if (c2433a.f8786k.isAttachedToWindow()) {
            return;
        }
        ViewOnAttachStateChangeListenerC2309u viewOnAttachStateChangeListenerC2309uM4556c = AbstractC2536f.m4556c(c2433a.f8786k);
        C2308t c2308t = viewOnAttachStateChangeListenerC2309uM4556c.f8089m;
        if (c2308t != null) {
            AbstractC0150o abstractC0150o = c2308t.f8084m;
            AbstractC1339x.m2841b(c2308t.f8085n);
            C2433a c2433a2 = c2308t.f8083l;
            if (c2433a2 != null) {
                abstractC0150o.mo575i(c2433a2);
            }
            abstractC0150o.mo575i(c2308t);
        }
        viewOnAttachStateChangeListenerC2309uM4556c.f8089m = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // androidx.lifecycle.InterfaceC0128d
    public final void onDestroy(InterfaceC0164v interfaceC0164v) {
        AbstractC2536f.m4556c(this.f8083l.f8786k).m4098a();
    }

    @Override // p151r3.InterfaceC2305q
    public final void start() {
        AbstractC0150o abstractC0150o = this.f8084m;
        abstractC0150o.mo568a(this);
        C2433a c2433a = this.f8083l;
        if (c2433a != null) {
            abstractC0150o.mo575i(c2433a);
            abstractC0150o.mo568a(c2433a);
        }
        ViewOnAttachStateChangeListenerC2309u viewOnAttachStateChangeListenerC2309uM4556c = AbstractC2536f.m4556c(c2433a.f8786k);
        C2308t c2308t = viewOnAttachStateChangeListenerC2309uM4556c.f8089m;
        if (c2308t != null) {
            AbstractC0150o abstractC0150o2 = c2308t.f8084m;
            AbstractC1339x.m2841b(c2308t.f8085n);
            C2433a c2433a2 = c2308t.f8083l;
            if (c2433a2 != null) {
                abstractC0150o2.mo575i(c2433a2);
            }
            abstractC0150o2.mo575i(c2308t);
        }
        viewOnAttachStateChangeListenerC2309uM4556c.f8089m = this;
    }
}
