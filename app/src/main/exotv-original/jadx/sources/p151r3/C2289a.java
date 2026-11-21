package p151r3;

import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.InterfaceC0164v;
import p076i7.AbstractC1339x;
import p076i7.InterfaceC1330s0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r3.a */
/* loaded from: classes.dex */
public final class C2289a implements InterfaceC2305q {

    /* renamed from: j */
    public final AbstractC0150o f7987j;

    /* renamed from: k */
    public final InterfaceC1330s0 f7988k;

    public C2289a(AbstractC0150o abstractC0150o, InterfaceC1330s0 interfaceC1330s0) {
        this.f7987j = abstractC0150o;
        this.f7988k = interfaceC1330s0;
    }

    @Override // p151r3.InterfaceC2305q
    /* renamed from: k */
    public final void mo4093k() {
        this.f7987j.mo575i(this);
    }

    @Override // androidx.lifecycle.InterfaceC0128d
    public final void onDestroy(InterfaceC0164v interfaceC0164v) {
        AbstractC1339x.m2841b(this.f7988k);
    }

    @Override // p151r3.InterfaceC2305q
    public final void start() {
        this.f7987j.mo568a(this);
    }
}
