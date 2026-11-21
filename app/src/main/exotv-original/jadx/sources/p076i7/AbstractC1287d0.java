package p076i7;

import com.bumptech.glide.AbstractC0714c;
import java.util.concurrent.CancellationException;
import p112m7.AbstractC1925a;
import p112m7.C1930f;
import p127o7.AbstractRunnableC2058i;
import p137p6.InterfaceC2222c;
import p137p6.InterfaceC2227h;
import p154r6.AbstractC2320c;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC1287d0 extends AbstractRunnableC2058i {

    /* renamed from: l */
    public int f5315l;

    public AbstractC1287d0(int i) {
        super(0L, false);
        this.f5315l = i;
    }

    /* renamed from: c */
    public void mo2784c(CancellationException cancellationException) {
    }

    /* renamed from: g */
    public abstract InterfaceC2222c mo2785g();

    /* renamed from: h */
    public Throwable mo2786h(Object obj) {
        C1319o c1319o = obj instanceof C1319o ? (C1319o) obj : null;
        if (c1319o != null) {
            return c1319o.f5358a;
        }
        return null;
    }

    /* renamed from: k */
    public Object mo2787k(Object obj) {
        return obj;
    }

    /* renamed from: l */
    public final void m2788l(Throwable th) {
        AbstractC1339x.m2848i(mo2785g().mo2249f(), new C1337w("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: m */
    public abstract Object mo2789m();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC2222c interfaceC2222cMo2785g = mo2785g();
            AbstractC2980h.m5134c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>", interfaceC2222cMo2785g);
            C1930f c1930f = (C1930f) interfaceC2222cMo2785g;
            AbstractC2320c abstractC2320c = c1930f.f7204n;
            InterfaceC2227h interfaceC2227h = abstractC2320c.f8131k;
            Object obj = c1930f.f7206p;
            AbstractC2980h.m5133b(interfaceC2227h);
            Object objM3773i = AbstractC1925a.m3773i(interfaceC2227h, obj);
            InterfaceC1330s0 interfaceC1330s0 = null;
            C1318n1 c1318n1M2856q = objM3773i != AbstractC1925a.f7193d ? AbstractC1339x.m2856q(abstractC2320c, interfaceC2227h, objM3773i) : null;
            try {
                AbstractC2980h.m5133b(interfaceC2227h);
                Object objMo2789m = mo2789m();
                Throwable thMo2786h = mo2786h(objMo2789m);
                if (thMo2786h == null) {
                    int i = this.f5315l;
                    boolean z7 = true;
                    if (i != 1 && i != 2) {
                        z7 = false;
                    }
                    if (z7) {
                        interfaceC1330s0 = (InterfaceC1330s0) interfaceC2227h.mo2760b(C1329s.f5369k);
                    }
                }
                if (interfaceC1330s0 != null && !interfaceC1330s0.isActive()) {
                    CancellationException cancellationExceptionM2772v = ((C1279a1) interfaceC1330s0).m2772v();
                    mo2784c(cancellationExceptionM2772v);
                    abstractC2320c.mo2248d(AbstractC0714c.m1539y(cancellationExceptionM2772v));
                } else if (thMo2786h != null) {
                    abstractC2320c.mo2248d(AbstractC0714c.m1539y(thMo2786h));
                } else {
                    abstractC2320c.mo2248d(mo2787k(objMo2789m));
                }
                if (c1318n1M2856q != null && !c1318n1M2856q.m2836U()) {
                    return;
                }
                AbstractC1925a.m3769e(interfaceC2227h, objM3773i);
            } catch (Throwable th) {
                if (c1318n1M2856q == null || c1318n1M2856q.m2836U()) {
                    AbstractC1925a.m3769e(interfaceC2227h, objM3773i);
                }
                throw th;
            }
        } catch (Throwable th2) {
            m2788l(th2);
        }
    }
}
