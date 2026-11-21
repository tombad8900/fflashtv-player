package p076i7;

import java.io.Serializable;
import p024c5.C0654c1;
import p102l6.C1693j;
import p138p7.C2229a;
import p138p7.C2230b;
import p138p7.C2235g;
import p212y6.InterfaceC2856q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C1292f implements InterfaceC2856q {

    /* renamed from: j */
    public final /* synthetic */ int f5317j;

    /* renamed from: k */
    public final /* synthetic */ Object f5318k;

    public /* synthetic */ C1292f(int i, Object obj) {
        this.f5317j = i;
        this.f5318k = obj;
    }

    @Override // p212y6.InterfaceC2856q
    /* renamed from: b */
    public final Object mo2793b(Serializable serializable, Object obj, Object obj2) {
        switch (this.f5317j) {
            case 0:
                ((C0654c1) this.f5318k).invoke((Throwable) serializable);
                break;
            case 1:
                C2230b c2230b = (C2230b) this.f5318k;
                C2230b.f7750h.set(c2230b, null);
                c2230b.m4008c(null);
                break;
            default:
                ((C2235g) this.f5318k).m4010b();
                break;
        }
        return C1693j.f6497a;
    }

    public /* synthetic */ C1292f(C2230b c2230b, C2229a c2229a) {
        this.f5317j = 1;
        this.f5318k = c2230b;
    }
}
