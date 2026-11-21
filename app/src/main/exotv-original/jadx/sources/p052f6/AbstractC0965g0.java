package p052f6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC0965g0 {

    /* renamed from: a */
    public Object[] f4191a;

    /* renamed from: b */
    public int f4192b;

    /* renamed from: c */
    public boolean f4193c;

    public AbstractC0965g0(int i) {
        AbstractC1006u.m2188c(i, "initialCapacity");
        this.f4191a = new Object[i];
        this.f4192b = 0;
    }

    /* renamed from: e */
    public static int m2140e(int i, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i4 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i4) {
            iHighestOneBit = Integer.highestOneBit(i4 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    /* renamed from: a */
    public final void m2141a(Object obj) {
        obj.getClass();
        m2144d(1);
        Object[] objArr = this.f4191a;
        int i = this.f4192b;
        this.f4192b = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: b */
    public abstract AbstractC0965g0 mo2142b(Object obj);

    /* renamed from: c */
    public final void m2143c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m2144d(collection.size());
            if (collection instanceof AbstractC0968h0) {
                this.f4192b = ((AbstractC0968h0) collection).mo2151b(this.f4192b, this.f4191a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo2142b(it.next());
        }
    }

    /* renamed from: d */
    public final void m2144d(int i) {
        Object[] objArr = this.f4191a;
        int iM2140e = m2140e(objArr.length, this.f4192b + i);
        if (iM2140e > objArr.length || this.f4193c) {
            this.f4191a = Arrays.copyOf(this.f4191a, iM2140e);
            this.f4193c = false;
        }
    }
}
