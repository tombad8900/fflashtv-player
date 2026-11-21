package p140q0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q0.a */
/* loaded from: classes.dex */
public final class C2241a {

    /* renamed from: a */
    public int f7771a;

    /* renamed from: b */
    public int f7772b;

    /* renamed from: c */
    public float f7773c;

    /* renamed from: d */
    public float f7774d;

    /* renamed from: e */
    public long f7775e;

    /* renamed from: f */
    public long f7776f;

    /* renamed from: g */
    public long f7777g;

    /* renamed from: h */
    public float f7778h;

    /* renamed from: i */
    public int f7779i;

    /* renamed from: a */
    public final float m4013a(long j) {
        if (j < this.f7775e) {
            return 0.0f;
        }
        long j8 = this.f7777g;
        if (j8 < 0 || j < j8) {
            return ViewOnTouchListenerC2244d.m4018b((j - r0) / this.f7771a, 0.0f, 1.0f) * 0.5f;
        }
        float f8 = this.f7778h;
        return (ViewOnTouchListenerC2244d.m4018b((j - j8) / this.f7779i, 0.0f, 1.0f) * f8) + (1.0f - f8);
    }
}
