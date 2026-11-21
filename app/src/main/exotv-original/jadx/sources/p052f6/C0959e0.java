package p052f6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.e0 */
/* loaded from: classes.dex */
public final class C0959e0 extends AbstractC0978k1 implements Serializable {

    /* renamed from: j */
    public final Comparator[] f4181j;

    public C0959e0(C1003t c1003t, C1003t c1003t2) {
        this.f4181j = new Comparator[]{c1003t, c1003t2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f4181j;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0959e0) {
            return Arrays.equals(this.f4181j, ((C0959e0) obj).f4181j);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4181j);
    }

    public final String toString() {
        return AbstractC0008a1.m18n(new StringBuilder("Ordering.compound("), Arrays.toString(this.f4181j), ")");
    }
}
