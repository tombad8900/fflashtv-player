package p052f6;

import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.v0 */
/* loaded from: classes.dex */
public final class C1010v0 extends AbstractC0965g0 {
    @Override // p052f6.AbstractC0965g0
    /* renamed from: b */
    public final AbstractC0965g0 mo2142b(Object obj) {
        obj.getClass();
        m2141a(obj);
        return this;
    }

    /* renamed from: f */
    public final AbstractC1013w0 m2207f() {
        int i = this.f4192b;
        if (i == 0) {
            int i4 = AbstractC1013w0.f4280l;
            return C0999r1.f4255s;
        }
        if (i != 1) {
            AbstractC1013w0 abstractC1013w0M2209i = AbstractC1013w0.m2209i(i, this.f4191a);
            this.f4192b = abstractC1013w0M2209i.size();
            this.f4193c = true;
            return abstractC1013w0M2209i;
        }
        Object obj = this.f4191a[0];
        Objects.requireNonNull(obj);
        int i8 = AbstractC1013w0.f4280l;
        return new C1017x1(obj);
    }
}
