package p102l6;

import java.io.Serializable;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l6.k */
/* loaded from: classes.dex */
public final class C1694k implements InterfaceC1685b, Serializable {

    /* renamed from: j */
    public InterfaceC2840a f6498j;

    /* renamed from: k */
    public Object f6499k;

    @Override // p102l6.InterfaceC1685b
    public final Object getValue() {
        if (this.f6499k == C1692i.f6496a) {
            InterfaceC2840a interfaceC2840a = this.f6498j;
            AbstractC2980h.m5133b(interfaceC2840a);
            this.f6499k = interfaceC2840a.invoke();
            this.f6498j = null;
        }
        return this.f6499k;
    }

    public final String toString() {
        return this.f6499k != C1692i.f6496a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
