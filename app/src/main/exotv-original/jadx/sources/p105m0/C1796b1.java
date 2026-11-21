package p105m0;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.b1 */
/* loaded from: classes.dex */
public final class C1796b1 {

    /* renamed from: a */
    public AbstractC1793a1 f6856a;

    public C1796b1(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f6856a = new C1865z0(AbstractC1861x0.m3651b(i, interpolator, j));
        } else {
            this.f6856a = new C1858w0(i, interpolator, j);
        }
    }
}
