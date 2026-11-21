package p057g2;

import p063h1.AbstractC1118i0;
import p115n1.C1966b0;
import p115n1.C1970d0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g2.h */
/* loaded from: classes.dex */
public final class C1044h implements InterfaceC1043g {

    /* renamed from: a */
    public final long[] f4442a;

    /* renamed from: b */
    public final long[] f4443b;

    /* renamed from: c */
    public final long f4444c;

    /* renamed from: d */
    public final long f4445d;

    /* renamed from: e */
    public final int f4446e;

    public C1044h(long[] jArr, long[] jArr2, long j, long j8, int i) {
        this.f4442a = jArr;
        this.f4443b = jArr2;
        this.f4444c = j;
        this.f4445d = j8;
        this.f4446e = i;
    }

    @Override // p057g2.InterfaceC1043g
    /* renamed from: a */
    public final long mo2228a() {
        return this.f4445d;
    }

    @Override // p057g2.InterfaceC1043g
    /* renamed from: b */
    public final int mo2229b() {
        return this.f4446e;
    }

    @Override // p115n1.InterfaceC1968c0
    public final long getDurationUs() {
        return this.f4444c;
    }

    @Override // p115n1.InterfaceC1968c0
    public final C1966b0 getSeekPoints(long j) {
        long[] jArr = this.f4442a;
        int iM2444e = AbstractC1118i0.m2444e(jArr, j, true);
        long j8 = jArr[iM2444e];
        long[] jArr2 = this.f4443b;
        C1970d0 c1970d0 = new C1970d0(j8, jArr2[iM2444e]);
        if (j8 >= j || iM2444e == jArr.length - 1) {
            return new C1966b0(c1970d0, c1970d0);
        }
        int i = iM2444e + 1;
        return new C1966b0(c1970d0, new C1970d0(jArr[i], jArr2[i]));
    }

    @Override // p057g2.InterfaceC1043g
    public final long getTimeUs(long j) {
        return this.f4442a[AbstractC1118i0.m2444e(this.f4443b, j, true)];
    }

    @Override // p115n1.InterfaceC1968c0
    public final boolean isSeekable() {
        return true;
    }
}
