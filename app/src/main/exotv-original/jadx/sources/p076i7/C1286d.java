package p076i7;

import p212y6.InterfaceC2851l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.d */
/* loaded from: classes.dex */
public final class C1286d implements InterfaceC1288d1 {

    /* renamed from: a */
    public final /* synthetic */ int f5313a;

    /* renamed from: b */
    public final Object f5314b;

    public /* synthetic */ C1286d(int i, Object obj) {
        this.f5313a = i;
        this.f5314b = obj;
    }

    public final String toString() {
        switch (this.f5313a) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((InterfaceC2851l) this.f5314b).getClass().getSimpleName() + '@' + AbstractC1339x.m2845f(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC1293f0) this.f5314b) + ']';
        }
    }
}
