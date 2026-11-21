package p010b;

import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.EnumC0146m;
import androidx.lifecycle.InterfaceC0160t;
import androidx.lifecycle.InterfaceC0164v;
import p002a1.C0019f0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.u */
/* loaded from: classes.dex */
public final class C0531u implements InterfaceC0160t, InterfaceC0513c {

    /* renamed from: j */
    public final AbstractC0150o f2173j;

    /* renamed from: k */
    public final C0019f0 f2174k;

    /* renamed from: l */
    public C0532v f2175l;

    /* renamed from: m */
    public final /* synthetic */ C0534x f2176m;

    public C0531u(C0534x c0534x, AbstractC0150o abstractC0150o, C0019f0 c0019f0) {
        AbstractC2980h.m5136e("onBackPressedCallback", c0019f0);
        this.f2176m = c0534x;
        this.f2173j = abstractC0150o;
        this.f2174k = c0019f0;
        abstractC0150o.mo568a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0160t
    /* renamed from: c */
    public final void mo249c(InterfaceC0164v interfaceC0164v, EnumC0146m enumC0146m) {
        if (enumC0146m != EnumC0146m.ON_START) {
            if (enumC0146m != EnumC0146m.ON_STOP) {
                if (enumC0146m == EnumC0146m.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0532v c0532v = this.f2175l;
                if (c0532v != null) {
                    c0532v.cancel();
                    return;
                }
                return;
            }
        }
        C0534x c0534x = this.f2176m;
        c0534x.getClass();
        C0019f0 c0019f0 = this.f2174k;
        AbstractC2980h.m5136e("onBackPressedCallback", c0019f0);
        c0534x.f2181b.addLast(c0019f0);
        C0532v c0532v2 = new C0532v(c0534x, c0019f0);
        c0019f0.f69b.add(c0532v2);
        c0534x.m1259e();
        c0019f0.f70c = new C0533w(0, c0534x, C0534x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
        this.f2175l = c0532v2;
    }

    @Override // p010b.InterfaceC0513c
    public final void cancel() {
        this.f2173j.mo575i(this);
        this.f2174k.f69b.remove(this);
        C0532v c0532v = this.f2175l;
        if (c0532v != null) {
            c0532v.cancel();
        }
        this.f2175l = null;
    }
}
