package p130p;

import java.util.Arrays;
import p002a1.AbstractC0008a1;
import p111m6.AbstractC1912g;
import p139q.AbstractC2239a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p.h */
/* loaded from: classes.dex */
public final class C2189h implements Cloneable {

    /* renamed from: j */
    public /* synthetic */ boolean f7641j;

    /* renamed from: k */
    public /* synthetic */ long[] f7642k;

    /* renamed from: l */
    public /* synthetic */ Object[] f7643l;

    /* renamed from: m */
    public /* synthetic */ int f7644m;

    public C2189h() {
        int i;
        int i4 = 4;
        while (true) {
            i = 80;
            if (i4 >= 32) {
                break;
            }
            int i8 = (1 << i4) - 12;
            if (80 <= i8) {
                i = i8;
                break;
            }
            i4++;
        }
        int i9 = i / 8;
        this.f7642k = new long[i9];
        this.f7643l = new Object[i9];
    }

    /* renamed from: a */
    public final void m3965a() {
        int i = this.f7644m;
        Object[] objArr = this.f7643l;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        this.f7644m = 0;
        this.f7641j = false;
    }

    /* renamed from: b */
    public final Object m3966b(long j) {
        Object obj;
        int iM4012b = AbstractC2239a.m4012b(this.f7642k, this.f7644m, j);
        if (iM4012b < 0 || (obj = this.f7643l[iM4012b]) == AbstractC2190i.f7645a) {
            return null;
        }
        return obj;
    }

    /* renamed from: c */
    public final long m3967c(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.f7644m)) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f7641j) {
            long[] jArr = this.f7642k;
            Object[] objArr = this.f7643l;
            int i8 = 0;
            for (int i9 = 0; i9 < i4; i9++) {
                Object obj = objArr[i9];
                if (obj != AbstractC2190i.f7645a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f7641j = false;
            this.f7644m = i8;
        }
        return this.f7642k[i];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC2980h.m5134c("null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>", objClone);
        C2189h c2189h = (C2189h) objClone;
        c2189h.f7642k = (long[]) this.f7642k.clone();
        c2189h.f7643l = (Object[]) this.f7643l.clone();
        return c2189h;
    }

    /* renamed from: d */
    public final void m3968d(Object obj, long j) {
        Object obj2 = AbstractC2190i.f7645a;
        int iM4012b = AbstractC2239a.m4012b(this.f7642k, this.f7644m, j);
        if (iM4012b >= 0) {
            this.f7643l[iM4012b] = obj;
            return;
        }
        int i = ~iM4012b;
        int i4 = this.f7644m;
        if (i < i4) {
            Object[] objArr = this.f7643l;
            if (objArr[i] == obj2) {
                this.f7642k[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f7641j) {
            long[] jArr = this.f7642k;
            if (i4 >= jArr.length) {
                Object[] objArr2 = this.f7643l;
                int i8 = 0;
                for (int i9 = 0; i9 < i4; i9++) {
                    Object obj3 = objArr2[i9];
                    if (obj3 != obj2) {
                        if (i9 != i8) {
                            jArr[i8] = jArr[i9];
                            objArr2[i8] = obj3;
                            objArr2[i9] = null;
                        }
                        i8++;
                    }
                }
                this.f7641j = false;
                this.f7644m = i8;
                i = ~AbstractC2239a.m4012b(this.f7642k, i8, j);
            }
        }
        int i10 = this.f7644m;
        if (i10 >= this.f7642k.length) {
            int i11 = (i10 + 1) * 8;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f7642k, i14);
            AbstractC2980h.m5135d("copyOf(this, newSize)", jArrCopyOf);
            this.f7642k = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f7643l, i14);
            AbstractC2980h.m5135d("copyOf(this, newSize)", objArrCopyOf);
            this.f7643l = objArrCopyOf;
        }
        int i15 = this.f7644m - i;
        if (i15 != 0) {
            long[] jArr2 = this.f7642k;
            int i16 = i + 1;
            AbstractC2980h.m5136e("<this>", jArr2);
            System.arraycopy(jArr2, i, jArr2, i16, i15);
            Object[] objArr3 = this.f7643l;
            AbstractC1912g.m3728l0(i16, i, this.f7644m, objArr3, objArr3);
        }
        this.f7642k[i] = j;
        this.f7643l[i] = obj;
        this.f7644m++;
    }

    /* renamed from: e */
    public final int m3969e() {
        if (this.f7641j) {
            int i = this.f7644m;
            long[] jArr = this.f7642k;
            Object[] objArr = this.f7643l;
            int i4 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                Object obj = objArr[i8];
                if (obj != AbstractC2190i.f7645a) {
                    if (i8 != i4) {
                        jArr[i4] = jArr[i8];
                        objArr[i4] = obj;
                        objArr[i8] = null;
                    }
                    i4++;
                }
            }
            this.f7641j = false;
            this.f7644m = i4;
        }
        return this.f7644m;
    }

    /* renamed from: f */
    public final Object m3970f(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.f7644m)) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f7641j) {
            long[] jArr = this.f7642k;
            Object[] objArr = this.f7643l;
            int i8 = 0;
            for (int i9 = 0; i9 < i4; i9++) {
                Object obj = objArr[i9];
                if (obj != AbstractC2190i.f7645a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f7641j = false;
            this.f7644m = i8;
        }
        return this.f7643l[i];
    }

    public final String toString() {
        if (m3969e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7644m * 28);
        sb.append('{');
        int i = this.f7644m;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(m3967c(i4));
            sb.append('=');
            Object objM3970f = m3970f(i4);
            if (objM3970f != sb) {
                sb.append(objM3970f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC2980h.m5135d("StringBuilder(capacity).\u2026builderAction).toString()", string);
        return string;
    }
}
