package p076i7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.u0 */
/* loaded from: classes.dex */
public class C1334u0 extends C1279a1 {

    /* renamed from: l */
    public final boolean f5371l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1334u0() {
        super(true);
        boolean z7 = true;
        m2746C(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1279a1.f5308k;
        InterfaceC1304j interfaceC1304j = (InterfaceC1304j) atomicReferenceFieldUpdater.get(this);
        C1307k c1307k = interfaceC1304j instanceof C1307k ? (C1307k) interfaceC1304j : null;
        if (c1307k == null) {
            z7 = false;
            break;
        }
        C1279a1 c1279a1M2839i = c1307k.m2839i();
        while (!c1279a1M2839i.mo2774x()) {
            InterfaceC1304j interfaceC1304j2 = (InterfaceC1304j) atomicReferenceFieldUpdater.get(c1279a1M2839i);
            C1307k c1307k2 = interfaceC1304j2 instanceof C1307k ? (C1307k) interfaceC1304j2 : null;
            if (c1307k2 == null) {
                z7 = false;
                break;
            }
            c1279a1M2839i = c1307k2.m2839i();
        }
        this.f5371l = z7;
    }

    @Override // p076i7.C1279a1
    /* renamed from: x */
    public final boolean mo2774x() {
        return this.f5371l;
    }

    @Override // p076i7.C1279a1
    /* renamed from: y */
    public final boolean mo2775y() {
        return true;
    }
}
