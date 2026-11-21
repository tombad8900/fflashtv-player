package p064h2;

import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h2.t */
/* loaded from: classes.dex */
public final class C1155t {

    /* renamed from: a */
    public final C1152q f4962a;

    /* renamed from: b */
    public final int f4963b;

    /* renamed from: c */
    public final long[] f4964c;

    /* renamed from: d */
    public final int[] f4965d;

    /* renamed from: e */
    public final int f4966e;

    /* renamed from: f */
    public final long[] f4967f;

    /* renamed from: g */
    public final int[] f4968g;

    /* renamed from: h */
    public final long f4969h;

    public C1155t(C1152q c1152q, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        AbstractC1101a.m2353d(iArr.length == jArr2.length);
        AbstractC1101a.m2353d(jArr.length == jArr2.length);
        AbstractC1101a.m2353d(iArr2.length == jArr2.length);
        this.f4962a = c1152q;
        this.f4964c = jArr;
        this.f4965d = iArr;
        this.f4966e = i;
        this.f4967f = jArr2;
        this.f4968g = iArr2;
        this.f4969h = j;
        this.f4963b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public final int m2575a(long j) {
        long[] jArr = this.f4967f;
        for (int iM2436a = AbstractC1118i0.m2436a(jArr, j, true); iM2436a < jArr.length; iM2436a++) {
            if ((this.f4968g[iM2436a] & 1) != 0) {
                return iM2436a;
            }
        }
        return -1;
    }
}
