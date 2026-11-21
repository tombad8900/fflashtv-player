package p076i7;

import com.bumptech.glide.AbstractC0714c;
import p137p6.InterfaceC2225f;
import p137p6.InterfaceC2226g;
import p137p6.InterfaceC2227h;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.o1 */
/* loaded from: classes.dex */
public final class C1321o1 implements InterfaceC2225f, InterfaceC2226g {

    /* renamed from: j */
    public static final C1321o1 f5360j = new C1321o1();

    @Override // p137p6.InterfaceC2227h
    /* renamed from: b */
    public final InterfaceC2225f mo2760b(InterfaceC2226g interfaceC2226g) {
        AbstractC2980h.m5136e("key", interfaceC2226g);
        if (AbstractC2980h.m5132a(this, interfaceC2226g)) {
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
    public final InterfaceC2227h mo2762g(InterfaceC2226g interfaceC2226g) {
        return AbstractC0714c.m1507T(this, interfaceC2226g);
    }

    @Override // p137p6.InterfaceC2225f
    public final InterfaceC2226g getKey() {
        return this;
    }

    @Override // p137p6.InterfaceC2227h
    /* renamed from: t */
    public final Object mo2770t(Object obj, InterfaceC2855p interfaceC2855p) {
        return interfaceC2855p.mo576c(obj, this);
    }
}
