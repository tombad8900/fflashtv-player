package p032d3;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.s */
/* loaded from: classes.dex */
public final class C0834s extends AbstractC0830o {

    /* renamed from: a */
    public final /* synthetic */ int f3714a = 1;

    /* renamed from: b */
    public AbstractC0829n f3715b;

    public /* synthetic */ C0834s() {
    }

    @Override // p032d3.AbstractC0830o, p032d3.InterfaceC0827l
    /* renamed from: c */
    public void mo1975c(AbstractC0829n abstractC0829n) {
        switch (this.f3714a) {
            case 1:
                C0809a c0809a = (C0809a) this.f3715b;
                if (!c0809a.f3624M) {
                    c0809a.m1991F();
                    c0809a.f3624M = true;
                    break;
                }
                break;
        }
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: d */
    public final void mo1973d(AbstractC0829n abstractC0829n) {
        switch (this.f3714a) {
            case 0:
                this.f3715b.mo1964y();
                abstractC0829n.mo1962w(this);
                break;
            default:
                C0809a c0809a = (C0809a) this.f3715b;
                int i = c0809a.f3623L - 1;
                c0809a.f3623L = i;
                if (i == 0) {
                    c0809a.f3624M = false;
                    c0809a.m1996l();
                }
                abstractC0829n.mo1962w(this);
                break;
        }
    }

    public C0834s(AbstractC0829n abstractC0829n) {
        this.f3715b = abstractC0829n;
    }
}
