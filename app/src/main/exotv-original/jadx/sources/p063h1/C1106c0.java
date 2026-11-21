package p063h1;

import java.util.Arrays;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.c0 */
/* loaded from: classes.dex */
public final class C1106c0 {

    /* renamed from: a */
    public long[] f4719a = new long[10];

    /* renamed from: b */
    public Object[] f4720b = new Object[10];

    /* renamed from: c */
    public int f4721c;

    /* renamed from: d */
    public int f4722d;

    /* renamed from: a */
    public final synchronized void m2387a(Object obj, long j) {
        if (this.f4722d > 0) {
            if (j <= this.f4719a[((this.f4721c + r0) - 1) % this.f4720b.length]) {
                m2388b();
            }
        }
        m2389c();
        int i = this.f4721c;
        int i4 = this.f4722d;
        Object[] objArr = this.f4720b;
        int length = (i + i4) % objArr.length;
        this.f4719a[length] = j;
        objArr[length] = obj;
        this.f4722d = i4 + 1;
    }

    /* renamed from: b */
    public final synchronized void m2388b() {
        this.f4721c = 0;
        this.f4722d = 0;
        Arrays.fill(this.f4720b, (Object) null);
    }

    /* renamed from: c */
    public final void m2389c() {
        int length = this.f4720b.length;
        if (this.f4722d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i4 = this.f4721c;
        int i8 = length - i4;
        System.arraycopy(this.f4719a, i4, jArr, 0, i8);
        System.arraycopy(this.f4720b, this.f4721c, objArr, 0, i8);
        int i9 = this.f4721c;
        if (i9 > 0) {
            System.arraycopy(this.f4719a, 0, jArr, i8, i9);
            System.arraycopy(this.f4720b, 0, objArr, i8, this.f4721c);
        }
        this.f4719a = jArr;
        this.f4720b = objArr;
        this.f4721c = 0;
    }

    /* renamed from: d */
    public final Object m2390d(long j, boolean z7) {
        Object objM2393g = null;
        long j8 = Long.MAX_VALUE;
        while (this.f4722d > 0) {
            long j9 = j - this.f4719a[this.f4721c];
            if (j9 < 0 && (z7 || (-j9) >= j8)) {
                break;
            }
            objM2393g = m2393g();
            j8 = j9;
        }
        return objM2393g;
    }

    /* renamed from: e */
    public final synchronized Object m2391e() {
        return this.f4722d == 0 ? null : m2393g();
    }

    /* renamed from: f */
    public final synchronized Object m2392f(long j) {
        return m2390d(j, true);
    }

    /* renamed from: g */
    public final Object m2393g() {
        AbstractC1101a.m2359j(this.f4722d > 0);
        Object[] objArr = this.f4720b;
        int i = this.f4721c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f4721c = (i + 1) % objArr.length;
        this.f4722d--;
        return obj;
    }

    /* renamed from: h */
    public final synchronized int m2394h() {
        return this.f4722d;
    }
}
