package p120o;

import java.util.Iterator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o.d */
/* loaded from: classes.dex */
public final class C2032d extends AbstractC2033e implements Iterator {

    /* renamed from: j */
    public C2031c f7496j;

    /* renamed from: k */
    public boolean f7497k = true;

    /* renamed from: l */
    public final /* synthetic */ C2034f f7498l;

    public C2032d(C2034f c2034f) {
        this.f7498l = c2034f;
    }

    @Override // p120o.AbstractC2033e
    /* renamed from: a */
    public final void mo3923a(C2031c c2031c) {
        C2031c c2031c2 = this.f7496j;
        if (c2031c == c2031c2) {
            C2031c c2031c3 = c2031c2.f7495m;
            this.f7496j = c2031c3;
            this.f7497k = c2031c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7497k) {
            return this.f7498l.f7499j != null;
        }
        C2031c c2031c = this.f7496j;
        return (c2031c == null || c2031c.f7494l == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7497k) {
            this.f7497k = false;
            this.f7496j = this.f7498l.f7499j;
        } else {
            C2031c c2031c = this.f7496j;
            this.f7496j = c2031c != null ? c2031c.f7494l : null;
        }
        return this.f7496j;
    }
}
