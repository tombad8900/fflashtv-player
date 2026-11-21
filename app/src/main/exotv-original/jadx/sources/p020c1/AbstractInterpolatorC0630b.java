package p020c1;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c1.b */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0630b implements Interpolator {

    /* renamed from: a */
    public final float[] f2511a;

    /* renamed from: b */
    public final float f2512b;

    public AbstractInterpolatorC0630b(float[] fArr) {
        this.f2511a = fArr;
        this.f2512b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f8) {
        if (f8 >= 1.0f) {
            return 1.0f;
        }
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2511a;
        int iMin = Math.min((int) ((fArr.length - 1) * f8), fArr.length - 2);
        float f9 = this.f2512b;
        float f10 = (f8 - (iMin * f9)) / f9;
        float f11 = fArr[iMin];
        return ((fArr[iMin + 1] - f11) * f10) + f11;
    }
}
