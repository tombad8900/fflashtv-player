package p076i7;

import p111m6.C1911f;
import p112m7.AbstractC1925a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC1314m0 extends AbstractC1327r {

    /* renamed from: l */
    public long f5347l;

    /* renamed from: m */
    public boolean f5348m;

    /* renamed from: n */
    public C1911f f5349n;

    @Override // p076i7.AbstractC1327r
    /* renamed from: F */
    public final AbstractC1327r mo2830F(int i) {
        AbstractC1925a.m3765a(1);
        return this;
    }

    /* renamed from: G */
    public final void m2831G() {
        long j = this.f5347l - 4294967296L;
        this.f5347l = j;
        if (j <= 0 && this.f5348m) {
            shutdown();
        }
    }

    /* renamed from: H */
    public abstract Thread mo2781H();

    /* renamed from: I */
    public final void m2832I(boolean z7) {
        this.f5347l = (z7 ? 4294967296L : 1L) + this.f5347l;
        if (z7) {
            return;
        }
        this.f5348m = true;
    }

    /* renamed from: J */
    public final boolean m2833J() {
        C1911f c1911f = this.f5349n;
        if (c1911f == null) {
            return false;
        }
        AbstractC1287d0 abstractC1287d0 = (AbstractC1287d0) (c1911f.isEmpty() ? null : c1911f.removeFirst());
        if (abstractC1287d0 == null) {
            return false;
        }
        abstractC1287d0.run();
        return true;
    }

    /* renamed from: K */
    public void mo2834K(long j, AbstractRunnableC1305j0 abstractRunnableC1305j0) {
        RunnableC1341y.f5386r.m2828Q(j, abstractRunnableC1305j0);
    }

    public abstract void shutdown();
}
