package p010b;

import p102l6.C1693j;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2981i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.p */
/* loaded from: classes.dex */
public final class C0526p extends AbstractC2981i implements InterfaceC2840a {

    /* renamed from: j */
    public final /* synthetic */ int f2163j;

    /* renamed from: k */
    public final /* synthetic */ C0534x f2164k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0526p(C0534x c0534x, int i) {
        super(0);
        this.f2163j = i;
        this.f2164k = c0534x;
    }

    @Override // p212y6.InterfaceC2840a
    public final Object invoke() {
        switch (this.f2163j) {
            case 0:
                this.f2164k.m1257c();
                break;
            case 1:
                this.f2164k.m1256b();
                break;
            default:
                this.f2164k.m1257c();
                break;
        }
        return C1693j.f6497a;
    }
}
