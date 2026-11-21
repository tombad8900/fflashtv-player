package p132p1;

import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p115n1.C1966b0;
import p115n1.C1970d0;
import p115n1.InterfaceC1980i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p1.e */
/* loaded from: classes.dex */
public final class C2202e {

    /* renamed from: a */
    public final InterfaceC1980i0 f7697a;

    /* renamed from: b */
    public final int f7698b;

    /* renamed from: c */
    public final int f7699c;

    /* renamed from: d */
    public final long f7700d;

    /* renamed from: e */
    public final int f7701e;

    /* renamed from: f */
    public int f7702f;

    /* renamed from: g */
    public int f7703g;

    /* renamed from: h */
    public int f7704h;

    /* renamed from: i */
    public int f7705i;

    /* renamed from: j */
    public int f7706j;

    /* renamed from: k */
    public long f7707k;

    /* renamed from: l */
    public long[] f7708l;

    /* renamed from: m */
    public int[] f7709m;

    public C2202e(int i, int i4, long j, int i8, InterfaceC1980i0 interfaceC1980i0) {
        boolean z7 = true;
        if (i4 != 1 && i4 != 2) {
            z7 = false;
        }
        AbstractC1101a.m2353d(z7);
        this.f7700d = j;
        this.f7701e = i8;
        this.f7697a = interfaceC1980i0;
        int i9 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f7698b = (i4 == 2 ? 1667497984 : 1651965952) | i9;
        this.f7699c = i4 == 2 ? i9 | 1650720768 : -1;
        this.f7707k = -1L;
        this.f7708l = new long[512];
        this.f7709m = new int[512];
    }

    /* renamed from: a */
    public final C1970d0 m4000a(int i) {
        return new C1970d0(((this.f7700d * 1) / this.f7701e) * this.f7709m[i], this.f7708l[i]);
    }

    /* renamed from: b */
    public final C1966b0 m4001b(long j) {
        if (this.f7706j == 0) {
            C1970d0 c1970d0 = new C1970d0(0L, this.f7707k);
            return new C1966b0(c1970d0, c1970d0);
        }
        int i = (int) (j / ((this.f7700d * 1) / this.f7701e));
        int iM2442d = AbstractC1118i0.m2442d(this.f7709m, i, true, true);
        if (this.f7709m[iM2442d] == i) {
            C1970d0 c1970d0M4000a = m4000a(iM2442d);
            return new C1966b0(c1970d0M4000a, c1970d0M4000a);
        }
        C1970d0 c1970d0M4000a2 = m4000a(iM2442d);
        int i4 = iM2442d + 1;
        return i4 < this.f7708l.length ? new C1966b0(c1970d0M4000a2, m4000a(i4)) : new C1966b0(c1970d0M4000a2, c1970d0M4000a2);
    }
}
