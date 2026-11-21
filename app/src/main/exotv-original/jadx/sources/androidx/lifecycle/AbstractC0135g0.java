package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.FragmentC0139i0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC0135g0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m557a(Activity activity, EnumC0146m enumC0146m) {
        AbstractC2980h.m5136e("event", enumC0146m);
        if (activity instanceof InterfaceC0164v) {
            AbstractC0150o abstractC0150oMo224e = ((InterfaceC0164v) activity).mo224e();
            if (abstractC0150oMo224e instanceof C0166x) {
                ((C0166x) abstractC0150oMo224e).m585l(enumC0146m);
            }
        }
    }

    /* renamed from: b */
    public static void m558b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC0139i0.a.Companion.getClass();
            C0137h0.m559a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0139i0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
