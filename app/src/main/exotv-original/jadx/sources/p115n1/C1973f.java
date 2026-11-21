package p115n1;

import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.f */
/* loaded from: classes.dex */
public final class C1973f {

    /* renamed from: a */
    public final long f7326a;

    /* renamed from: b */
    public final long f7327b;

    /* renamed from: c */
    public final long f7328c;

    /* renamed from: d */
    public long f7329d = 0;

    /* renamed from: e */
    public long f7330e;

    /* renamed from: f */
    public long f7331f;

    /* renamed from: g */
    public long f7332g;

    /* renamed from: h */
    public long f7333h;

    public C1973f(long j, long j8, long j9, long j10, long j11, long j12) {
        this.f7326a = j;
        this.f7327b = j8;
        this.f7330e = j9;
        this.f7331f = j10;
        this.f7332g = j11;
        this.f7328c = j12;
        this.f7333h = m3850a(j8, 0L, j9, j10, j11, j12);
    }

    /* renamed from: a */
    public static long m3850a(long j, long j8, long j9, long j10, long j11, long j12) {
        if (j10 + 1 >= j11 || j8 + 1 >= j9) {
            return j10;
        }
        long j13 = (long) ((j - j8) * ((j11 - j10) / (j9 - j8)));
        return AbstractC1118i0.m2452k(((j13 + j10) - j12) - (j13 / 20), j10, j11 - 1);
    }
}
