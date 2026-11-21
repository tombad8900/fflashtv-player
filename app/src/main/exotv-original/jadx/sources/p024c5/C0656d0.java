package p024c5;

import java.util.List;
import p073i3.C1256e;
import p212y6.InterfaceC2840a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.d0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0656d0 implements InterfaceC2840a {

    /* renamed from: j */
    public final /* synthetic */ int f2585j;

    /* renamed from: k */
    public final /* synthetic */ Object f2586k;

    public /* synthetic */ C0656d0(int i, Object obj) {
        this.f2585j = i;
        this.f2586k = obj;
    }

    @Override // p212y6.InterfaceC2840a
    public final Object invoke() {
        switch (this.f2585j) {
            case 0:
                return Integer.valueOf(((List) this.f2586k).size());
            default:
                return C1256e.m2734a((C1256e) this.f2586k);
        }
    }
}
