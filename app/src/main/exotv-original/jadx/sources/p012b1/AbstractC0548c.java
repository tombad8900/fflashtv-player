package p012b1;

import android.util.Log;
import p002a1.AbstractComponentCallbacksC0050v;
import p002a1.C0035n0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0548c {

    /* renamed from: a */
    public static final C0547b f2224a = C0547b.f2223a;

    /* renamed from: a */
    public static C0547b m1277a(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        while (abstractComponentCallbacksC0050v != null) {
            if (abstractComponentCallbacksC0050v.m233n()) {
                abstractComponentCallbacksC0050v.m229j();
            }
            abstractComponentCallbacksC0050v = abstractComponentCallbacksC0050v.f212D;
        }
        return f2224a;
    }

    /* renamed from: b */
    public static void m1278b(C0546a c0546a) {
        if (C0035n0.m106G(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c0546a.f2222j.getClass().getName()), c0546a);
        }
    }

    /* renamed from: c */
    public static final void m1279c(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v, String str) {
        AbstractC2980h.m5136e("previousFragmentId", str);
        m1278b(new C0546a(abstractComponentCallbacksC0050v, "Attempting to reuse fragment " + abstractComponentCallbacksC0050v + " with previous ID " + str));
        m1277a(abstractComponentCallbacksC0050v).getClass();
    }
}
