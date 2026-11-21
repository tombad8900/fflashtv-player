package p032d3;

import android.view.ViewGroup;
import com.bumptech.glide.AbstractC0714c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.d */
/* loaded from: classes.dex */
public final class C0815d extends AbstractC0830o {

    /* renamed from: a */
    public boolean f3631a = false;

    /* renamed from: b */
    public final ViewGroup f3632b;

    public C0815d(ViewGroup viewGroup) {
        this.f3632b = viewGroup;
    }

    @Override // p032d3.AbstractC0830o, p032d3.InterfaceC0827l
    /* renamed from: a */
    public final void mo1971a() {
        AbstractC0714c.m1514c0(this.f3632b, false);
    }

    @Override // p032d3.AbstractC0830o, p032d3.InterfaceC0827l
    /* renamed from: b */
    public final void mo1972b(AbstractC0829n abstractC0829n) {
        AbstractC0714c.m1514c0(this.f3632b, false);
        this.f3631a = true;
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: d */
    public final void mo1973d(AbstractC0829n abstractC0829n) {
        if (!this.f3631a) {
            AbstractC0714c.m1514c0(this.f3632b, false);
        }
        abstractC0829n.mo1962w(this);
    }

    @Override // p032d3.AbstractC0830o, p032d3.InterfaceC0827l
    /* renamed from: f */
    public final void mo1974f() {
        AbstractC0714c.m1514c0(this.f3632b, true);
    }
}
