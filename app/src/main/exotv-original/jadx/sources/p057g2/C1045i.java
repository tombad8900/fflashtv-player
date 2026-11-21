package p057g2;

import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p115n1.C1966b0;
import p115n1.C1970d0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g2.i */
/* loaded from: classes.dex */
public final class C1045i implements InterfaceC1043g {

    /* renamed from: a */
    public final long f4447a;

    /* renamed from: b */
    public final int f4448b;

    /* renamed from: c */
    public final long f4449c;

    /* renamed from: d */
    public final int f4450d;

    /* renamed from: e */
    public final long f4451e;

    /* renamed from: f */
    public final long f4452f;

    /* renamed from: g */
    public final long[] f4453g;

    public C1045i(long j, int i, long j8, int i4, long j9, long[] jArr) {
        this.f4447a = j;
        this.f4448b = i;
        this.f4449c = j8;
        this.f4450d = i4;
        this.f4451e = j9;
        this.f4453g = jArr;
        this.f4452f = j9 != -1 ? j + j9 : -1L;
    }

    @Override // p057g2.InterfaceC1043g
    /* renamed from: a */
    public final long mo2228a() {
        return this.f4452f;
    }

    @Override // p057g2.InterfaceC1043g
    /* renamed from: b */
    public final int mo2229b() {
        return this.f4450d;
    }

    @Override // p115n1.InterfaceC1968c0
    public final long getDurationUs() {
        return this.f4449c;
    }

    @Override // p115n1.InterfaceC1968c0
    public final C1966b0 getSeekPoints(long j) {
        double d8;
        double d9;
        boolean zIsSeekable = isSeekable();
        int i = this.f4448b;
        long j8 = this.f4447a;
        if (!zIsSeekable) {
            C1970d0 c1970d0 = new C1970d0(0L, j8 + i);
            return new C1966b0(c1970d0, c1970d0);
        }
        long jM2452k = AbstractC1118i0.m2452k(j, 0L, this.f4449c);
        double d10 = (jM2452k * 100.0d) / this.f4449c;
        double d11 = 0.0d;
        if (d10 <= 0.0d) {
            d8 = 256.0d;
        } else if (d10 >= 100.0d) {
            d8 = 256.0d;
            d11 = 256.0d;
        } else {
            int i4 = (int) d10;
            long[] jArr = this.f4453g;
            AbstractC1101a.m2360k(jArr);
            double d12 = jArr[i4];
            if (i4 == 99) {
                d8 = 256.0d;
                d9 = 256.0d;
            } else {
                d8 = 256.0d;
                d9 = jArr[i4 + 1];
            }
            d11 = ((d9 - d12) * (d10 - i4)) + d12;
        }
        long j9 = this.f4451e;
        C1970d0 c1970d02 = new C1970d0(jM2452k, j8 + AbstractC1118i0.m2452k(Math.round((d11 / d8) * j9), i, j9 - 1));
        return new C1966b0(c1970d02, c1970d02);
    }

    @Override // p057g2.InterfaceC1043g
    public final long getTimeUs(long j) {
        long j8 = j - this.f4447a;
        if (!isSeekable() || j8 <= this.f4448b) {
            return 0L;
        }
        long[] jArr = this.f4453g;
        AbstractC1101a.m2360k(jArr);
        double d8 = (j8 * 256.0d) / this.f4451e;
        int iM2444e = AbstractC1118i0.m2444e(jArr, (long) d8, true);
        long j9 = this.f4449c;
        long j10 = (iM2444e * j9) / 100;
        long j11 = jArr[iM2444e];
        int i = iM2444e + 1;
        long j12 = (j9 * i) / 100;
        return Math.round((j11 == (iM2444e == 99 ? 256L : jArr[i]) ? 0.0d : (d8 - j11) / (r0 - j11)) * (j12 - j10)) + j10;
    }

    @Override // p115n1.InterfaceC1968c0
    public final boolean isSeekable() {
        return this.f4453g != null;
    }
}
