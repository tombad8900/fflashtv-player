package p105m0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC1798c0 {
    /* renamed from: a */
    public static WindowInsets m3514a(View view, WindowInsets windowInsets) {
        int i = AbstractC1834o0.f6919a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: b */
    public static WindowInsets m3515b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: c */
    public static void m3516c(View view) {
        view.requestApplyInsets();
    }
}
