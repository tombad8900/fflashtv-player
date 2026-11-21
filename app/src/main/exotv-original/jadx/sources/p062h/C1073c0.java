package p062h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.c0 */
/* loaded from: classes.dex */
public final class C1073c0 {

    /* renamed from: d */
    public static C1073c0 f4523d;

    /* renamed from: a */
    public long f4524a;

    /* renamed from: b */
    public long f4525b;

    /* renamed from: c */
    public int f4526c;

    /* renamed from: a */
    public final void m2252a(double d8, double d9, long j) {
        double d10 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d10) * 0.03341960161924362d) + d10 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d10) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d9) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d11 = 0.01745329238474369d * d8;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d11))) / (Math.cos(dAsin) * Math.cos(d11));
        if (dSin3 >= 1.0d) {
            this.f4526c = 1;
            this.f4524a = -1L;
            this.f4525b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f4526c = 0;
                this.f4524a = -1L;
                this.f4525b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f4524a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f4525b = jRound;
            if (jRound >= j || this.f4524a <= j) {
                this.f4526c = 1;
            } else {
                this.f4526c = 0;
            }
        }
    }
}
