package p076i7;

import com.bumptech.glide.AbstractC0714c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p112m7.AbstractC1925a;
import p112m7.C1930f;
import p112m7.C1943s;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.i */
/* loaded from: classes.dex */
public final class C1301i extends AbstractC1338w0 {

    /* renamed from: n */
    public final /* synthetic */ int f5329n;

    /* renamed from: o */
    public final Object f5330o;

    public /* synthetic */ C1301i(int i, Object obj) {
        this.f5329n = i;
        this.f5330o = obj;
    }

    @Override // p076i7.AbstractC1338w0
    /* renamed from: j */
    public final boolean mo2816j() {
        switch (this.f5329n) {
        }
        return false;
    }

    @Override // p076i7.AbstractC1338w0
    /* renamed from: k */
    public final void mo2817k(Throwable th) {
        switch (this.f5329n) {
            case 0:
                C1295g c1295g = (C1295g) this.f5330o;
                Throwable thMo2808t = c1295g.mo2808t(m2839i());
                if (c1295g.m2814z()) {
                    C1930f c1930f = (C1930f) c1295g.f5322m;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1930f.f7202q;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c1930f);
                        C1943s c1943s = AbstractC1925a.f7192c;
                        if (AbstractC2980h.m5132a(obj, c1943s)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c1930f, c1943s, thMo2808t)) {
                                if (atomicReferenceFieldUpdater.get(c1930f) != c1943s) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c1930f, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(c1930f) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c1295g.m2805q(thMo2808t);
                if (!c1295g.m2814z()) {
                    c1295g.m2806r();
                    break;
                }
                break;
            case 1:
                ((InterfaceC1293f0) this.f5330o).mo2783c();
                break;
            case 2:
                ((C1336v0) this.f5330o).invoke(th);
                break;
            default:
                C1340x0 c1340x0 = (C1340x0) this.f5330o;
                Object obj2 = C1279a1.f5307j.get(m2839i());
                if (!(obj2 instanceof C1319o)) {
                    c1340x0.mo2248d(AbstractC1339x.m2855p(obj2));
                    break;
                } else {
                    c1340x0.mo2248d(AbstractC0714c.m1539y(((C1319o) obj2).f5358a));
                    break;
                }
        }
    }
}
