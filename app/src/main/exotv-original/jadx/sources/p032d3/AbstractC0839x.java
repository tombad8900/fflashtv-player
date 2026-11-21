package p032d3;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.x */
/* loaded from: classes.dex */
public abstract class AbstractC0839x {

    /* renamed from: a */
    public static final C0814c0 f3720a;

    /* renamed from: b */
    public static final C0811b f3721b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3720a = new C0816d0();
        } else {
            f3720a = new C0814c0();
        }
        f3721b = new C0811b(Float.class, "translationAlpha", 5);
        new C0811b(Rect.class, "clipBounds", 6);
    }

    /* renamed from: a */
    public static void m2007a(View view, int i, int i4, int i8, int i9) {
        f3720a.mo1968s0(view, i, i4, i8, i9);
    }

    /* renamed from: b */
    public static void m2008b(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f3720a.mo1599m0(view, i);
    }
}
