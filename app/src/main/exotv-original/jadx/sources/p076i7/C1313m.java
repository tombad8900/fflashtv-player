package p076i7;

import com.bumptech.glide.AbstractC0715d;
import p146q6.EnumC2273a;
import p154r6.AbstractC2320c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.m */
/* loaded from: classes.dex */
public final class C1313m extends C1279a1 implements InterfaceC1310l {
    /* renamed from: T */
    public final Object m2829T(AbstractC2320c abstractC2320c) {
        Object objM2855p;
        while (true) {
            Object obj = C1279a1.f5307j.get(this);
            if (obj instanceof InterfaceC1323p0) {
                if (m2757P(obj) >= 0) {
                    C1340x0 c1340x0 = new C1340x0(AbstractC0715d.m1547P(abstractC2320c), this);
                    c1340x0.m2810v();
                    c1340x0.m2813y(new C1286d(1, AbstractC1339x.m2849j(this, true, new C1301i(3, c1340x0))));
                    objM2855p = c1340x0.m2809u();
                    EnumC2273a enumC2273a = EnumC2273a.f7953j;
                    break;
                }
            } else {
                if (obj instanceof C1319o) {
                    throw ((C1319o) obj).f5358a;
                }
                objM2855p = AbstractC1339x.m2855p(obj);
            }
        }
        EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
        return objM2855p;
    }
}
