package p174u;

import java.util.ArrayList;
import p182v.AbstractC2493h;
import p182v.C2499n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u.i */
/* loaded from: classes.dex */
public abstract class AbstractC2447i extends C2442d {

    /* renamed from: q0 */
    public C2442d[] f8970q0 = new C2442d[4];

    /* renamed from: r0 */
    public int f8971r0 = 0;

    /* renamed from: R */
    public final void m4424R(int i, ArrayList arrayList, C2499n c2499n) {
        for (int i4 = 0; i4 < this.f8971r0; i4++) {
            C2442d c2442d = this.f8970q0[i4];
            ArrayList arrayList2 = c2499n.f9117a;
            if (!arrayList2.contains(c2442d)) {
                arrayList2.add(c2442d);
            }
        }
        for (int i8 = 0; i8 < this.f8971r0; i8++) {
            AbstractC2493h.m4481b(this.f8970q0[i8], i, arrayList, c2499n);
        }
    }

    /* renamed from: S */
    public void mo4418S() {
    }
}
