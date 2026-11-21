package p052f6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.w0 */
/* loaded from: classes.dex */
public abstract class AbstractC1013w0 extends AbstractC0968h0 implements Set {

    /* renamed from: l */
    public static final /* synthetic */ int f4280l = 0;

    /* renamed from: k */
    public transient AbstractC0983m0 f4281k;

    /* renamed from: h */
    public static int m2208h(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* renamed from: i */
    public static AbstractC1013w0 m2209i(int i, Object... objArr) {
        if (i == 0) {
            return C0999r1.f4255s;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C1017x1(obj);
        }
        int iM2208h = m2208h(i);
        Object[] objArr2 = new Object[iM2208h];
        int i4 = iM2208h - 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC0008a1.m12h(i10, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iM2202q = AbstractC1006u.m2202q(iHashCode);
            while (true) {
                int i11 = iM2202q & i4;
                Object obj3 = objArr2[i11];
                if (obj3 == null) {
                    objArr[i9] = obj2;
                    objArr2[i11] = obj2;
                    i8 += iHashCode;
                    i9++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM2202q++;
            }
        }
        Arrays.fill(objArr, i9, i, (Object) null);
        if (i9 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C1017x1(obj4);
        }
        if (m2208h(i9) < iM2208h / 2) {
            return m2209i(i9, objArr);
        }
        int length = objArr.length;
        if (i9 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i9);
        }
        return new C0999r1(i8, i4, i9, objArr, objArr2);
    }

    /* renamed from: j */
    public static AbstractC1013w0 m2210j(Collection collection) {
        if ((collection instanceof AbstractC1013w0) && !(collection instanceof SortedSet)) {
            AbstractC1013w0 abstractC1013w0 = (AbstractC1013w0) collection;
            if (!abstractC1013w0.mo2155f()) {
                return abstractC1013w0;
            }
        }
        Object[] array = collection.toArray();
        return m2209i(array.length, array);
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: a */
    public AbstractC0983m0 mo2150a() {
        AbstractC0983m0 abstractC0983m0 = this.f4281k;
        if (abstractC0983m0 != null) {
            return abstractC0983m0;
        }
        AbstractC0983m0 abstractC0983m0Mo2177k = mo2177k();
        this.f4281k = abstractC0983m0Mo2177k;
        return abstractC0983m0Mo2177k;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1013w0) && (this instanceof C0999r1) && (((AbstractC1013w0) obj) instanceof C0999r1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC1006u.m2191f(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC1006u.m2196k(this);
    }

    /* renamed from: k */
    public AbstractC0983m0 mo2177k() {
        Object[] array = toArray(AbstractC0968h0.f4195j);
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        return AbstractC0983m0.m2163h(array.length, array);
    }
}
