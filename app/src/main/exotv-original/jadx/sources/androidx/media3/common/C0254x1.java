package androidx.media3.common;

import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.x1 */
/* loaded from: classes.dex */
public final class C0254x1 {

    /* renamed from: b */
    public static final C0254x1 f1546b;

    /* renamed from: a */
    public final AbstractC0983m0 f1547a;

    static {
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        f1546b = new C0254x1(C0981l1.f4211n);
        AbstractC1118i0.m2422M(0);
    }

    public C0254x1(C0981l1 c0981l1) {
        this.f1547a = AbstractC0983m0.m2165j(c0981l1);
    }

    /* renamed from: a */
    public final boolean m698a(int i) {
        int i4 = 0;
        while (true) {
            AbstractC0983m0 abstractC0983m0 = this.f1547a;
            if (i4 >= abstractC0983m0.size()) {
                return false;
            }
            C0251w1 c0251w1 = (C0251w1) abstractC0983m0.get(i4);
            boolean[] zArr = c0251w1.f1541e;
            int length = zArr.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (!zArr[i8]) {
                    i8++;
                } else if (c0251w1.f1538b.f1321c == i) {
                    return true;
                }
            }
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0254x1.class != obj.getClass()) {
            return false;
        }
        return this.f1547a.equals(((C0254x1) obj).f1547a);
    }

    public final int hashCode() {
        return this.f1547a.hashCode();
    }
}
