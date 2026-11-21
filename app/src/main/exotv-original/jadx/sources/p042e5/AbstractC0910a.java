package p042e5;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p020c1.C0629a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e5.a */
/* loaded from: classes.dex */
public abstract class AbstractC0910a {

    /* renamed from: a */
    public static final LinearInterpolator f3956a = new LinearInterpolator();

    /* renamed from: b */
    public static final C0629a f3957b = new C0629a(C0629a.f2509d);

    /* renamed from: c */
    public static final C0629a f3958c = new C0629a();

    /* renamed from: d */
    public static final C0629a f3959d = new C0629a(C0629a.f2510e);

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    public static float m2077a(float f8, float f9, float f10) {
        return ((f9 - f8) * f10) + f8;
    }

    /* renamed from: b */
    public static float m2078b(float f8, float f9, float f10, float f11, float f12) {
        return f12 <= f10 ? f8 : f12 >= f11 ? f9 : m2077a(f8, f9, (f12 - f10) / (f11 - f10));
    }

    /* renamed from: c */
    public static int m2079c(float f8, int i, int i4) {
        return Math.round(f8 * (i4 - i)) + i;
    }
}
