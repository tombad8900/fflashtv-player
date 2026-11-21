package p166t0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t0.e */
/* loaded from: classes.dex */
public final class InterpolatorC2391e implements Interpolator {

    /* renamed from: a */
    public final /* synthetic */ C2392f f8395a;

    public InterpolatorC2391e(C2392f c2392f) {
        this.f8395a = c2392f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f8) {
        return this.f8395a.f8417u.getInterpolation(f8);
    }
}
