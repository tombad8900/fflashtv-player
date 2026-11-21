package p010b;

import p002a1.C0019f0;
import p111m6.C1911f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.v */
/* loaded from: classes.dex */
public final class C0532v implements InterfaceC0513c {

    /* renamed from: j */
    public final C0019f0 f2177j;

    /* renamed from: k */
    public final /* synthetic */ C0534x f2178k;

    public C0532v(C0534x c0534x, C0019f0 c0019f0) {
        AbstractC2980h.m5136e("onBackPressedCallback", c0019f0);
        this.f2178k = c0534x;
        this.f2177j = c0019f0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [y6.a, z6.g] */
    @Override // p010b.InterfaceC0513c
    public final void cancel() {
        C0534x c0534x = this.f2178k;
        C1911f c1911f = c0534x.f2181b;
        C0019f0 c0019f0 = this.f2177j;
        c1911f.remove(c0019f0);
        if (AbstractC2980h.m5132a(c0534x.f2182c, c0019f0)) {
            c0019f0.getClass();
            c0534x.f2182c = null;
        }
        c0019f0.f69b.remove(this);
        ?? r02 = c0019f0.f70c;
        if (r02 != 0) {
            r02.invoke();
        }
        c0019f0.f70c = null;
    }
}
