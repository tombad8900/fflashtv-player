package p151r3;

import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.EnumC0148n;
import androidx.lifecycle.InterfaceC0128d;
import androidx.lifecycle.InterfaceC0162u;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r3.h */
/* loaded from: classes.dex */
public final class C2296h extends AbstractC0150o {

    /* renamed from: k */
    public static final C2296h f8009k = new C2296h(0);

    /* renamed from: l */
    public static final C2295g f8010l = new C2295g();

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: a */
    public final void mo568a(InterfaceC0162u interfaceC0162u) {
        if (!(interfaceC0162u instanceof InterfaceC0128d)) {
            throw new IllegalArgumentException((interfaceC0162u + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        InterfaceC0128d interfaceC0128d = (InterfaceC0128d) interfaceC0162u;
        C2295g c2295g = f8010l;
        AbstractC2980h.m5136e("owner", c2295g);
        interfaceC0128d.onStart(c2295g);
        interfaceC0128d.mo554b(c2295g);
    }

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: b */
    public final EnumC0148n mo569b() {
        return EnumC0148n.f929n;
    }

    @Override // androidx.lifecycle.AbstractC0150o
    /* renamed from: i */
    public final void mo575i(InterfaceC0162u interfaceC0162u) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
