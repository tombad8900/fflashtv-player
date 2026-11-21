package p057g2;

import p115n1.C1966b0;
import p115n1.C1970d0;
import p115n1.InterfaceC1968c0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g2.a */
/* loaded from: classes.dex */
public final class C1037a implements InterfaceC1043g, InterfaceC1968c0 {

    /* renamed from: a */
    public final long f4406a;

    /* renamed from: b */
    public final long f4407b;

    /* renamed from: c */
    public final int f4408c;

    /* renamed from: d */
    public final long f4409d;

    /* renamed from: e */
    public final int f4410e;

    /* renamed from: f */
    public final long f4411f;

    /* renamed from: g */
    public final boolean f4412g;

    /* renamed from: h */
    public final long f4413h;

    /* renamed from: i */
    public final int f4414i;

    /* renamed from: j */
    public final int f4415j;

    /* renamed from: k */
    public final boolean f4416k;

    /* renamed from: l */
    public final long f4417l;

    public C1037a(long j, long j8, int i, int i4, boolean z7) {
        this.f4406a = j;
        this.f4407b = j8;
        this.f4408c = i4 == -1 ? 1 : i4;
        this.f4410e = i;
        this.f4412g = z7;
        if (j == -1) {
            this.f4409d = -1L;
            this.f4411f = -9223372036854775807L;
        } else {
            long j9 = j - j8;
            this.f4409d = j9;
            this.f4411f = (Math.max(0L, j9) * 8000000) / i;
        }
        this.f4413h = j8;
        this.f4414i = i;
        this.f4415j = i4;
        this.f4416k = z7;
        this.f4417l = j == -1 ? -1L : j;
    }

    @Override // p057g2.InterfaceC1043g
    /* renamed from: a */
    public final long mo2228a() {
        return this.f4417l;
    }

    @Override // p057g2.InterfaceC1043g
    /* renamed from: b */
    public final int mo2229b() {
        return this.f4414i;
    }

    @Override // p115n1.InterfaceC1968c0
    public final long getDurationUs() {
        return this.f4411f;
    }

    @Override // p115n1.InterfaceC1968c0
    public final C1966b0 getSeekPoints(long j) {
        long j8 = this.f4409d;
        long j9 = this.f4407b;
        if (j8 == -1 && !this.f4412g) {
            C1970d0 c1970d0 = new C1970d0(0L, j9);
            return new C1966b0(c1970d0, c1970d0);
        }
        int i = this.f4410e;
        long j10 = this.f4408c;
        long jMin = (((i * j) / 8000000) / j10) * j10;
        if (j8 != -1) {
            jMin = Math.min(jMin, j8 - j10);
        }
        long jMax = Math.max(jMin, 0L) + j9;
        long jMax2 = (Math.max(0L, jMax - j9) * 8000000) / i;
        C1970d0 c1970d02 = new C1970d0(jMax2, jMax);
        if (j8 != -1 && jMax2 < j) {
            long j11 = jMax + j10;
            if (j11 < this.f4406a) {
                return new C1966b0(c1970d02, new C1970d0((Math.max(0L, j11 - j9) * 8000000) / i, j11));
            }
        }
        return new C1966b0(c1970d02, c1970d02);
    }

    @Override // p057g2.InterfaceC1043g
    public final long getTimeUs(long j) {
        return (Math.max(0L, j - this.f4407b) * 8000000) / this.f4410e;
    }

    @Override // p115n1.InterfaceC1968c0
    public final boolean isSeekable() {
        return this.f4409d != -1 || this.f4412g;
    }
}
