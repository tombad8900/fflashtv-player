package p130p;

import java.util.Arrays;
import p111m6.AbstractC1912g;
import p139q.AbstractC2239a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p.l */
/* loaded from: classes.dex */
public final class C2193l implements Cloneable {

    /* renamed from: j */
    public /* synthetic */ int[] f7657j;

    /* renamed from: k */
    public /* synthetic */ Object[] f7658k;

    /* renamed from: l */
    public /* synthetic */ int f7659l;

    public C2193l() {
        int i;
        int i4 = 4;
        while (true) {
            i = 40;
            if (i4 >= 32) {
                break;
            }
            int i8 = (1 << i4) - 12;
            if (40 <= i8) {
                i = i8;
                break;
            }
            i4++;
        }
        int i9 = i / 4;
        this.f7657j = new int[i9];
        this.f7658k = new Object[i9];
    }

    /* renamed from: a */
    public final void m3997a(int i, Object obj) {
        int i4 = this.f7659l;
        if (i4 != 0 && i <= this.f7657j[i4 - 1]) {
            m3999c(i, obj);
            return;
        }
        if (i4 >= this.f7657j.length) {
            int i8 = (i4 + 1) * 4;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f7657j, i11);
            AbstractC2980h.m5135d("copyOf(this, newSize)", iArrCopyOf);
            this.f7657j = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f7658k, i11);
            AbstractC2980h.m5135d("copyOf(this, newSize)", objArrCopyOf);
            this.f7658k = objArrCopyOf;
        }
        this.f7657j[i4] = i;
        this.f7658k[i4] = obj;
        this.f7659l = i4 + 1;
    }

    /* renamed from: b */
    public final Object m3998b(int i) {
        Object obj;
        int iM4011a = AbstractC2239a.m4011a(this.f7659l, i, this.f7657j);
        if (iM4011a < 0 || (obj = this.f7658k[iM4011a]) == AbstractC2190i.f7646b) {
            return null;
        }
        return obj;
    }

    /* renamed from: c */
    public final void m3999c(int i, Object obj) {
        int iM4011a = AbstractC2239a.m4011a(this.f7659l, i, this.f7657j);
        if (iM4011a >= 0) {
            this.f7658k[iM4011a] = obj;
            return;
        }
        int i4 = ~iM4011a;
        int i8 = this.f7659l;
        if (i4 < i8) {
            Object[] objArr = this.f7658k;
            if (objArr[i4] == AbstractC2190i.f7646b) {
                this.f7657j[i4] = i;
                objArr[i4] = obj;
                return;
            }
        }
        if (i8 >= this.f7657j.length) {
            int i9 = (i8 + 1) * 4;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f7657j, i12);
            AbstractC2980h.m5135d("copyOf(this, newSize)", iArrCopyOf);
            this.f7657j = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f7658k, i12);
            AbstractC2980h.m5135d("copyOf(this, newSize)", objArrCopyOf);
            this.f7658k = objArrCopyOf;
        }
        int i13 = this.f7659l;
        if (i13 - i4 != 0) {
            int[] iArr = this.f7657j;
            int i14 = i4 + 1;
            AbstractC1912g.m3727k0(i14, i4, i13, iArr, iArr);
            Object[] objArr2 = this.f7658k;
            AbstractC1912g.m3728l0(i14, i4, this.f7659l, objArr2, objArr2);
        }
        this.f7657j[i4] = i;
        this.f7658k[i4] = obj;
        this.f7659l++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC2980h.m5134c("null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>", objClone);
        C2193l c2193l = (C2193l) objClone;
        c2193l.f7657j = (int[]) this.f7657j.clone();
        c2193l.f7658k = (Object[]) this.f7658k.clone();
        return c2193l;
    }

    public final String toString() {
        int i = this.f7659l;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i4 = this.f7659l;
        for (int i8 = 0; i8 < i4; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(this.f7657j[i8]);
            sb.append('=');
            Object obj = this.f7658k[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC2980h.m5135d("buffer.toString()", string);
        return string;
    }
}
