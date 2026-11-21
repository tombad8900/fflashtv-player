package p104m;

import p095l.InterfaceC1616d0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.g0 */
/* loaded from: classes.dex */
public final class C1721g0 extends AbstractViewOnTouchListenerC1742l1 {

    /* renamed from: s */
    public final /* synthetic */ C1737k0 f6548s;

    /* renamed from: t */
    public final /* synthetic */ C1749n0 f6549t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721g0(C1749n0 c1749n0, C1749n0 c1749n02, C1737k0 c1737k0) {
        super(c1749n02);
        this.f6549t = c1749n0;
        this.f6548s = c1737k0;
    }

    @Override // p104m.AbstractViewOnTouchListenerC1742l1
    /* renamed from: b */
    public final InterfaceC1616d0 mo3271b() {
        return this.f6548s;
    }

    @Override // p104m.AbstractViewOnTouchListenerC1742l1
    /* renamed from: c */
    public final boolean mo3272c() {
        C1749n0 c1749n0 = this.f6549t;
        if (c1749n0.getInternalPopup().mo3400a()) {
            return true;
        }
        c1749n0.f6655o.mo3409m(c1749n0.getTextDirection(), c1749n0.getTextAlignment());
        return true;
    }
}
