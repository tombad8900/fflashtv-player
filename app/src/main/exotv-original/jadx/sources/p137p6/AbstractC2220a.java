package p137p6;

import com.bumptech.glide.AbstractC0714c;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p6.a */
/* loaded from: classes.dex */
public abstract class AbstractC2220a implements InterfaceC2225f {

    /* renamed from: j */
    public final InterfaceC2226g f7743j;

    public AbstractC2220a(InterfaceC2226g interfaceC2226g) {
        this.f7743j = interfaceC2226g;
    }

    @Override // p137p6.InterfaceC2227h
    /* renamed from: b */
    public InterfaceC2225f mo2760b(InterfaceC2226g interfaceC2226g) {
        AbstractC2980h.m5136e("key", interfaceC2226g);
        if (AbstractC2980h.m5132a(getKey(), interfaceC2226g)) {
            return this;
        }
        return null;
    }

    @Override // p137p6.InterfaceC2227h
    /* renamed from: c */
    public final InterfaceC2227h mo2761c(InterfaceC2227h interfaceC2227h) {
        return AbstractC0714c.m1508W(this, interfaceC2227h);
    }

    @Override // p137p6.InterfaceC2227h
    /* renamed from: g */
    public InterfaceC2227h mo2762g(InterfaceC2226g interfaceC2226g) {
        return AbstractC0714c.m1507T(this, interfaceC2226g);
    }

    @Override // p137p6.InterfaceC2225f
    public final InterfaceC2226g getKey() {
        return this.f7743j;
    }

    @Override // p137p6.InterfaceC2227h
    /* renamed from: t */
    public final Object mo2770t(Object obj, InterfaceC2855p interfaceC2855p) {
        return interfaceC2855p.mo576c(obj, this);
    }
}
