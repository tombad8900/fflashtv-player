package p029d0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d0.l */
/* loaded from: classes.dex */
public final class C0796l {

    /* renamed from: k */
    public static final C0796l f3571k;

    /* renamed from: a */
    public final float f3572a;

    /* renamed from: b */
    public final float f3573b;

    /* renamed from: c */
    public final float f3574c;

    /* renamed from: d */
    public final float f3575d;

    /* renamed from: e */
    public final float f3576e;

    /* renamed from: f */
    public final float f3577f;

    /* renamed from: g */
    public final float[] f3578g;

    /* renamed from: h */
    public final float f3579h;

    /* renamed from: i */
    public final float f3580i;

    /* renamed from: j */
    public final float f3581j;

    static {
        float[] fArr = AbstractC0786b.f3545c;
        float fM1940l = (float) ((AbstractC0786b.m1940l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC0786b.f3543a;
        float f8 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f9 = fArr3[0] * f8;
        float f10 = fArr[1];
        float f11 = (fArr3[1] * f10) + f9;
        float f12 = fArr[2];
        float f13 = (fArr3[2] * f12) + f11;
        float[] fArr4 = fArr2[1];
        float f14 = (fArr4[2] * f12) + (fArr4[1] * f10) + (fArr4[0] * f8);
        float[] fArr5 = fArr2[2];
        float f15 = (f12 * fArr5[2]) + (f10 * fArr5[1]) + (f8 * fArr5[0]);
        float f16 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM1940l) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d8 = fExp;
        if (d8 > 1.0d) {
            fExp = 1.0f;
        } else if (d8 < 0.0d) {
            fExp = 0.0f;
        }
        float f17 = 1.0f / ((5.0f * fM1940l) + 1.0f);
        float f18 = f17 * f17 * f17 * f17;
        float f19 = 1.0f - f18;
        float fCbrt = (0.1f * f19 * f19 * ((float) Math.cbrt(fM1940l * 5.0d))) + (f18 * fM1940l);
        float fM1940l2 = AbstractC0786b.m1940l() / fArr[1];
        double d9 = fM1940l2;
        float fSqrt = ((float) Math.sqrt(d9)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d9, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * fCbrt) * f13) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * fCbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * fCbrt) * f15) / 100.0d, 0.42d)};
        float f20 = fArr6[0];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr6[1];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr6[2];
        float[] fArr7 = {f21, f23, (400.0f * f24) / (f24 + 27.13f)};
        f3571k = new C0796l(fM1940l2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * fPow, fPow, fPow, f16, 1.0f, new float[]{(((100.0f / f13) * fExp) + 1.0f) - fExp, (((100.0f / f14) * fExp) + 1.0f) - fExp, (((100.0f / f15) * fExp) + 1.0f) - fExp}, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public C0796l(float f8, float f9, float f10, float f11, float f12, float f13, float[] fArr, float f14, float f15, float f16) {
        this.f3577f = f8;
        this.f3572a = f9;
        this.f3573b = f10;
        this.f3574c = f11;
        this.f3575d = f12;
        this.f3576e = f13;
        this.f3578g = fArr;
        this.f3579h = f14;
        this.f3580i = f15;
        this.f3581j = f16;
    }
}
