package p151r3;

import p177u3.InterfaceC2464d;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r3.d */
/* loaded from: classes.dex */
public final class C2292d {

    /* renamed from: a */
    public final InterfaceC2464d f8005a;

    public C2292d(InterfaceC2464d interfaceC2464d) {
        this.f8005a = interfaceC2464d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2292d) && AbstractC2980h.m5132a(this.f8005a, ((C2292d) obj).f8005a);
    }

    public final int hashCode() {
        InterfaceC2464d interfaceC2464d = this.f8005a;
        return (interfaceC2464d != null ? interfaceC2464d.hashCode() : 0) * 1742810335;
    }
}
