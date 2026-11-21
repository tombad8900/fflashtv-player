package p085j6;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j6.t */
/* loaded from: classes.dex */
public final class C1530t extends AbstractC1524n implements InterfaceC1517g {
    @Override // p085j6.AbstractC1524n, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5841j instanceof C1511a;
    }

    /* renamed from: j */
    public final boolean m3212j(Object obj) {
        if (obj == null) {
            obj = AbstractC1524n.f5840p;
        }
        if (!AbstractC1524n.f5839o.mo1595j(this, null, obj)) {
            return false;
        }
        AbstractC1524n.m3202d(this);
        return true;
    }

    /* renamed from: k */
    public final boolean m3213k(Throwable th) {
        if (!AbstractC1524n.f5839o.mo1595j(this, null, new C1513c(th))) {
            return false;
        }
        AbstractC1524n.m3202d(this);
        return true;
    }
}
