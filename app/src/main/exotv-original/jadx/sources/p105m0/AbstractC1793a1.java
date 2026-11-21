package p105m0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.a1 */
/* loaded from: classes.dex */
public abstract class AbstractC1793a1 {

    /* renamed from: a */
    public final int f6845a;

    /* renamed from: b */
    public float f6846b;

    /* renamed from: c */
    public final Interpolator f6847c;

    /* renamed from: d */
    public final long f6848d;

    public AbstractC1793a1(int i, Interpolator interpolator, long j) {
        this.f6845a = i;
        this.f6847c = interpolator;
        this.f6848d = j;
    }

    /* renamed from: a */
    public float mo3496a() {
        return 1.0f;
    }

    /* renamed from: b */
    public long mo3497b() {
        return this.f6848d;
    }

    /* renamed from: c */
    public float mo3498c() {
        Interpolator interpolator = this.f6847c;
        return interpolator != null ? interpolator.getInterpolation(this.f6846b) : this.f6846b;
    }

    /* renamed from: d */
    public int mo3499d() {
        return this.f6845a;
    }

    /* renamed from: e */
    public void mo3500e(float f8) {
        this.f6846b = f8;
    }
}
