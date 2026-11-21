package p057g2;

import android.util.Pair;
import p063h1.AbstractC1118i0;
import p115n1.C1966b0;
import p115n1.C1970d0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g2.c */
/* loaded from: classes.dex */
public final class C1039c implements InterfaceC1043g {

    /* renamed from: a */
    public final long[] f4418a;

    /* renamed from: b */
    public final long[] f4419b;

    /* renamed from: c */
    public final long f4420c;

    public C1039c(long j, long[] jArr, long[] jArr2) {
        this.f4418a = jArr;
        this.f4419b = jArr2;
        this.f4420c = j == -9223372036854775807L ? AbstractC1118i0.m2428S(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: c */
    public static Pair m2230c(long j, long[] jArr, long[] jArr2) {
        int iM2444e = AbstractC1118i0.m2444e(jArr, j, true);
        long j8 = jArr[iM2444e];
        long j9 = jArr2[iM2444e];
        int i = iM2444e + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j8), Long.valueOf(j9));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j8 ? 0.0d : (j - j8) / (r6 - j8)) * (jArr2[i] - j9))) + j9));
    }

    @Override // p057g2.InterfaceC1043g
    /* renamed from: a */
    public final long mo2228a() {
        return -1L;
    }

    @Override // p057g2.InterfaceC1043g
    /* renamed from: b */
    public final int mo2229b() {
        return -2147483647;
    }

    @Override // p115n1.InterfaceC1968c0
    public final long getDurationUs() {
        return this.f4420c;
    }

    @Override // p115n1.InterfaceC1968c0
    public final C1966b0 getSeekPoints(long j) {
        Pair pairM2230c = m2230c(AbstractC1118i0.m2447f0(AbstractC1118i0.m2452k(j, 0L, this.f4420c)), this.f4419b, this.f4418a);
        C1970d0 c1970d0 = new C1970d0(AbstractC1118i0.m2428S(((Long) pairM2230c.first).longValue()), ((Long) pairM2230c.second).longValue());
        return new C1966b0(c1970d0, c1970d0);
    }

    @Override // p057g2.InterfaceC1043g
    public final long getTimeUs(long j) {
        return AbstractC1118i0.m2428S(((Long) m2230c(j, this.f4418a, this.f4419b).second).longValue());
    }

    @Override // p115n1.InterfaceC1968c0
    public final boolean isSeekable() {
        return true;
    }
}
