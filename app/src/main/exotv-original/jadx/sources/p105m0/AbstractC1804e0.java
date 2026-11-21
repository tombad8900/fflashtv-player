package p105m0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.exotv.net.R;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC1804e0 {
    /* renamed from: a */
    public static void m3529a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* renamed from: b */
    public static C1844r1 m3530b(View view, C1844r1 c1844r1, Rect rect) {
        WindowInsets windowInsetsM3626f = c1844r1.m3626f();
        if (windowInsetsM3626f != null) {
            return C1844r1.m3621g(view, view.computeSystemWindowInsets(windowInsetsM3626f, rect));
        }
        rect.setEmpty();
        return c1844r1;
    }

    /* renamed from: c */
    public static ColorStateList m3531c(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: d */
    public static PorterDuff.Mode m3532d(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: e */
    public static String m3533e(View view) {
        return view.getTransitionName();
    }

    /* renamed from: f */
    public static float m3534f(View view) {
        return view.getZ();
    }

    /* renamed from: g */
    public static void m3535g(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: h */
    public static void m3536h(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: i */
    public static void m3537i(View view, float f8) {
        view.setElevation(f8);
    }

    /* renamed from: j */
    public static void m3538j(View view, InterfaceC1833o interfaceC1833o) {
        ViewOnApplyWindowInsetsListenerC1801d0 viewOnApplyWindowInsetsListenerC1801d0 = interfaceC1833o != null ? new ViewOnApplyWindowInsetsListenerC1801d0(view, interfaceC1833o) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC1801d0);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC1801d0 != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC1801d0);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    /* renamed from: k */
    public static void m3539k(View view) {
        view.stopNestedScroll();
    }
}
