package p115n1;

import p002a1.C0016e;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p132p1.C2199b;
import p132p1.C2202e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.s */
/* loaded from: classes.dex */
public class C1992s implements InterfaceC1968c0 {

    /* renamed from: a */
    public final /* synthetic */ int f7375a;

    /* renamed from: b */
    public final long f7376b;

    /* renamed from: c */
    public final Object f7377c;

    public /* synthetic */ C1992s(Object obj, long j, int i) {
        this.f7375a = i;
        this.f7377c = obj;
        this.f7376b = j;
    }

    @Override // p115n1.InterfaceC1968c0
    public final long getDurationUs() {
        switch (this.f7375a) {
        }
        return this.f7376b;
    }

    @Override // p115n1.InterfaceC1968c0
    public final C1966b0 getSeekPoints(long j) {
        switch (this.f7375a) {
            case 0:
                C1993t c1993t = (C1993t) this.f7377c;
                AbstractC1101a.m2360k(c1993t.f7388k);
                C0016e c0016e = c1993t.f7388k;
                long[] jArr = (long[]) c0016e.f62k;
                long[] jArr2 = (long[]) c0016e.f63l;
                int iM2444e = AbstractC1118i0.m2444e(jArr, AbstractC1118i0.m2452k((c1993t.f7382e * j) / 1000000, 0L, c1993t.f7387j - 1), false);
                long j8 = iM2444e == -1 ? 0L : jArr[iM2444e];
                long j9 = iM2444e != -1 ? jArr2[iM2444e] : 0L;
                int i = c1993t.f7382e;
                long j10 = (j8 * 1000000) / i;
                long j11 = this.f7376b;
                C1970d0 c1970d0 = new C1970d0(j10, j9 + j11);
                if (j10 == j || iM2444e == jArr.length - 1) {
                    return new C1966b0(c1970d0, c1970d0);
                }
                int i4 = iM2444e + 1;
                return new C1966b0(c1970d0, new C1970d0((jArr[i4] * 1000000) / i, j11 + jArr2[i4]));
            case 1:
                return (C1966b0) this.f7377c;
            default:
                C2199b c2199b = (C2199b) this.f7377c;
                C1966b0 c1966b0M4001b = c2199b.f7681i[0].m4001b(j);
                int i8 = 1;
                while (true) {
                    C2202e[] c2202eArr = c2199b.f7681i;
                    if (i8 >= c2202eArr.length) {
                        return c1966b0M4001b;
                    }
                    C1966b0 c1966b0M4001b2 = c2202eArr[i8].m4001b(j);
                    if (c1966b0M4001b2.f7290a.f7312b < c1966b0M4001b.f7290a.f7312b) {
                        c1966b0M4001b = c1966b0M4001b2;
                    }
                    i8++;
                }
        }
    }

    @Override // p115n1.InterfaceC1968c0
    public final boolean isSeekable() {
        switch (this.f7375a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1992s(long j) {
        this(j, 0L);
        this.f7375a = 1;
    }

    public C1992s(long j, long j8) {
        this.f7375a = 1;
        this.f7376b = j;
        C1970d0 c1970d0 = j8 == 0 ? C1970d0.f7310c : new C1970d0(0L, j8);
        this.f7377c = new C1966b0(c1970d0, c1970d0);
    }
}
