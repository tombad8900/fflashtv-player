package p105m0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.lifecycle.AbstractC0150o;
import com.exotv.net.R;
import java.util.List;
import p002a1.C0016e;
import p020c1.C0629a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.w0 */
/* loaded from: classes.dex */
public final class C1858w0 extends AbstractC1793a1 {

    /* renamed from: e */
    public static final PathInterpolator f6952e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f */
    public static final C0629a f6953f = new C0629a();

    /* renamed from: g */
    public static final DecelerateInterpolator f6954g = new DecelerateInterpolator(1.5f);

    /* renamed from: h */
    public static final AccelerateInterpolator f6955h = new AccelerateInterpolator(1.5f);

    /* renamed from: f */
    public static void m3644f(View view, C1796b1 c1796b1) {
        AbstractC0150o abstractC0150oM3649k = m3649k(view);
        if (abstractC0150oM3649k != null) {
            abstractC0150oM3649k.mo571d(c1796b1);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3644f(viewGroup.getChildAt(i), c1796b1);
            }
        }
    }

    /* renamed from: g */
    public static void m3645g(View view, C1796b1 c1796b1, C1844r1 c1844r1, boolean z7) {
        AbstractC0150o abstractC0150oM3649k = m3649k(view);
        if (abstractC0150oM3649k != null) {
            abstractC0150oM3649k.f933j = c1844r1;
            if (!z7) {
                abstractC0150oM3649k.mo572e(c1796b1);
                z7 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3645g(viewGroup.getChildAt(i), c1796b1, c1844r1, z7);
            }
        }
    }

    /* renamed from: h */
    public static void m3646h(View view, C1844r1 c1844r1, List list) {
        AbstractC0150o abstractC0150oM3649k = m3649k(view);
        if (abstractC0150oM3649k != null) {
            abstractC0150oM3649k.mo573f(c1844r1, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3646h(viewGroup.getChildAt(i), c1844r1, list);
            }
        }
    }

    /* renamed from: i */
    public static void m3647i(View view, C1796b1 c1796b1, C0016e c0016e) {
        AbstractC0150o abstractC0150oM3649k = m3649k(view);
        if (abstractC0150oM3649k != null) {
            abstractC0150oM3649k.mo574h(c1796b1, c0016e);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m3647i(viewGroup.getChildAt(i), c1796b1, c0016e);
            }
        }
    }

    /* renamed from: j */
    public static WindowInsets m3648j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: k */
    public static AbstractC0150o m3649k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC1855v0) {
            return ((ViewOnApplyWindowInsetsListenerC1855v0) tag).f6950a;
        }
        return null;
    }
}
