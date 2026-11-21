package p105m0;

import android.view.View;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC1813h0 {
    /* renamed from: a */
    public static CharSequence m3548a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* renamed from: b */
    public static boolean m3549b(View view) {
        return view.isAccessibilityHeading();
    }

    /* renamed from: c */
    public static boolean m3550c(View view) {
        return view.isScreenReaderFocusable();
    }

    /* renamed from: d */
    public static void m3551d(View view, boolean z7) {
        view.setAccessibilityHeading(z7);
    }

    /* renamed from: e */
    public static void m3552e(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* renamed from: f */
    public static void m3553f(View view, boolean z7) {
        view.setScreenReaderFocusable(z7);
    }
}
