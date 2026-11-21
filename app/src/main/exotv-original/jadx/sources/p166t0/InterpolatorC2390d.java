package p166t0;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t0.d */
/* loaded from: classes.dex */
public final class InterpolatorC2390d implements Interpolator {

    /* renamed from: a */
    public final /* synthetic */ int f8394a;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f8) {
        switch (this.f8394a) {
        }
        float f9 = f8 - 1.0f;
        return (f9 * f9 * f9 * f9 * f9) + 1.0f;
    }
}
