package p195w4;

import com.exotv.net.MainActivity;
import java.util.Set;
import p024c5.C0672j;
import p085j6.RunnableC1527q;
import p086j7.C1534d;
import p102l6.C1693j;
import p204x4.C2769l;
import p204x4.EnumC2770m;
import p212y6.InterfaceC2851l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.r */
/* loaded from: classes.dex */
public final /* synthetic */ class C2685r implements InterfaceC2851l {

    /* renamed from: j */
    public final /* synthetic */ int f9752j;

    /* renamed from: k */
    public final /* synthetic */ Object f9753k;

    /* renamed from: l */
    public final /* synthetic */ Object f9754l;

    public /* synthetic */ C2685r(Object obj, int i, Object obj2) {
        this.f9752j = i;
        this.f9754l = obj;
        this.f9753k = obj2;
    }

    @Override // p212y6.InterfaceC2851l
    public final Object invoke(Object obj) {
        int i = this.f9752j;
        C1693j c1693j = C1693j.f6497a;
        Object obj2 = this.f9753k;
        Object obj3 = this.f9754l;
        switch (i) {
            case 0:
                MainActivity.m1672r((MainActivity) obj3, (C2769l) obj, (EnumC2770m) obj2);
                break;
            case 1:
                MainActivity mainActivity = (MainActivity) obj3;
                C2769l c2769l = (C2769l) obj;
                if (((EnumC2770m) obj2) == EnumC2770m.f10247j) {
                    Set set = MainActivity.f2882p0;
                    C0672j.m1452l(mainActivity, String.valueOf(c2769l.f10241a), c2769l.f10242b, null, 120);
                    break;
                }
                break;
            case 2:
                MainActivity.m1672r((MainActivity) obj3, (C2769l) obj, (EnumC2770m) obj2);
                break;
            case 3:
                MainActivity mainActivity2 = (MainActivity) obj3;
                C2769l c2769l2 = (C2769l) obj;
                if (((EnumC2770m) obj2) == EnumC2770m.f10247j) {
                    Set set2 = MainActivity.f2882p0;
                    C0672j.m1452l(mainActivity2, String.valueOf(c2769l2.f10241a), c2769l2.f10242b, null, 120);
                    break;
                }
                break;
            default:
                ((C1534d) obj3).f5854l.removeCallbacks((RunnableC1527q) obj2);
                break;
        }
        return c1693j;
    }

    public /* synthetic */ C2685r(EnumC2770m enumC2770m, MainActivity mainActivity, int i) {
        this.f9752j = i;
        this.f9753k = enumC2770m;
        this.f9754l = mainActivity;
    }
}
