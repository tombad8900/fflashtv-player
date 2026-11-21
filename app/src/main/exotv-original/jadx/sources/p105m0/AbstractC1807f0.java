package p105m0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC1807f0 {
    /* renamed from: a */
    public static C1844r1 m3543a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C1844r1 c1844r1M3621g = C1844r1.m3621g(null, rootWindowInsets);
        C1835o1 c1835o1 = c1844r1M3621g.f6934a;
        c1835o1.mo3569q(c1844r1M3621g);
        c1835o1.mo3562d(view.getRootView());
        return c1844r1M3621g;
    }

    /* renamed from: b */
    public static void m3544b(View view, int i, int i4) {
        view.setScrollIndicators(i, i4);
    }
}
