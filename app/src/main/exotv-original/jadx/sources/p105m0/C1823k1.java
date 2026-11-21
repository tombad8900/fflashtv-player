package p105m0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.k1 */
/* loaded from: classes.dex */
public class C1823k1 extends C1820j1 {
    public C1823k1(C1844r1 c1844r1, WindowInsets windowInsets) {
        super(c1844r1, windowInsets);
    }

    @Override // p105m0.C1835o1
    /* renamed from: a */
    public C1844r1 mo3582a() {
        return C1844r1.m3621g(null, this.f6891c.consumeDisplayCutout());
    }

    @Override // p105m0.C1835o1
    /* renamed from: e */
    public C1818j mo3583e() {
        DisplayCutout displayCutout = this.f6891c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1818j(displayCutout);
    }

    @Override // p105m0.AbstractC1817i1, p105m0.C1835o1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1823k1)) {
            return false;
        }
        C1823k1 c1823k1 = (C1823k1) obj;
        return Objects.equals(this.f6891c, c1823k1.f6891c) && Objects.equals(this.f6895g, c1823k1.f6895g) && AbstractC1817i1.m3561z(this.f6896h, c1823k1.f6896h);
    }

    @Override // p105m0.C1835o1
    public int hashCode() {
        return this.f6891c.hashCode();
    }
}
