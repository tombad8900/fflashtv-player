package p112m7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p076i7.AbstractC1287d0;
import p076i7.AbstractC1300h1;
import p076i7.AbstractC1314m0;
import p076i7.AbstractC1327r;
import p076i7.AbstractC1339x;
import p076i7.C1319o;
import p102l6.C1689f;
import p111m6.C1911f;
import p137p6.InterfaceC2222c;
import p137p6.InterfaceC2227h;
import p154r6.AbstractC2320c;
import p154r6.InterfaceC2321d;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.f */
/* loaded from: classes.dex */
public final class C1930f extends AbstractC1287d0 implements InterfaceC2321d, InterfaceC2222c {

    /* renamed from: q */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7202q = AtomicReferenceFieldUpdater.newUpdater(C1930f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: m */
    public final AbstractC1327r f7203m;

    /* renamed from: n */
    public final AbstractC2320c f7204n;

    /* renamed from: o */
    public Object f7205o;

    /* renamed from: p */
    public final Object f7206p;

    public C1930f(AbstractC1327r abstractC1327r, AbstractC2320c abstractC2320c) {
        super(-1);
        this.f7203m = abstractC1327r;
        this.f7204n = abstractC2320c;
        this.f7205o = AbstractC1925a.f7191b;
        InterfaceC2227h interfaceC2227h = abstractC2320c.f8131k;
        AbstractC2980h.m5133b(interfaceC2227h);
        Object objMo2770t = interfaceC2227h.mo2770t(0, AbstractC1925a.f7194e);
        AbstractC2980h.m5133b(objMo2770t);
        this.f7206p = objMo2770t;
    }

    @Override // p154r6.InterfaceC2321d
    /* renamed from: a */
    public final InterfaceC2321d mo2800a() {
        return this.f7204n;
    }

    @Override // p137p6.InterfaceC2222c
    /* renamed from: d */
    public final void mo2248d(Object obj) {
        Throwable thM3382a = C1689f.m3382a(obj);
        Object c1319o = thM3382a == null ? obj : new C1319o(thM3382a, false);
        AbstractC2320c abstractC2320c = this.f7204n;
        InterfaceC2227h interfaceC2227h = abstractC2320c.f8131k;
        AbstractC2980h.m5133b(interfaceC2227h);
        AbstractC1327r abstractC1327r = this.f7203m;
        if (abstractC1327r.mo2838E(interfaceC2227h)) {
            this.f7205o = c1319o;
            this.f5315l = 0;
            AbstractC2980h.m5133b(interfaceC2227h);
            abstractC1327r.mo2822D(interfaceC2227h, this);
            return;
        }
        AbstractC1314m0 abstractC1314m0M2815a = AbstractC1300h1.m2815a();
        if (abstractC1314m0M2815a.f5347l >= 4294967296L) {
            this.f7205o = c1319o;
            this.f5315l = 0;
            C1911f c1911f = abstractC1314m0M2815a.f5349n;
            if (c1911f == null) {
                c1911f = new C1911f();
                abstractC1314m0M2815a.f5349n = c1911f;
            }
            c1911f.addLast(this);
            return;
        }
        abstractC1314m0M2815a.m2832I(true);
        try {
            AbstractC2980h.m5133b(interfaceC2227h);
            Object objM3773i = AbstractC1925a.m3773i(interfaceC2227h, this.f7206p);
            try {
                abstractC2320c.mo2248d(obj);
                while (abstractC1314m0M2815a.m2833J()) {
                }
            } finally {
                AbstractC1925a.m3769e(interfaceC2227h, objM3773i);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p137p6.InterfaceC2222c
    /* renamed from: f */
    public final InterfaceC2227h mo2249f() {
        InterfaceC2227h interfaceC2227h = this.f7204n.f8131k;
        AbstractC2980h.m5133b(interfaceC2227h);
        return interfaceC2227h;
    }

    @Override // p076i7.AbstractC1287d0
    /* renamed from: g */
    public final InterfaceC2222c mo2785g() {
        return this;
    }

    @Override // p076i7.AbstractC1287d0
    /* renamed from: m */
    public final Object mo2789m() {
        Object obj = this.f7205o;
        this.f7205o = AbstractC1925a.f7191b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f7203m + ", " + AbstractC1339x.m2854o(this.f7204n) + ']';
    }
}
