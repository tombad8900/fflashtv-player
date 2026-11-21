package p105m0;

import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.t0 */
/* loaded from: classes.dex */
public abstract class AbstractC1849t0 {
    /* renamed from: a */
    public static CharSequence m3629a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* renamed from: b */
    public static void m3630b(Window window, boolean z7) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z7 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z7);
    }

    /* renamed from: c */
    public static void m3631c(Window window, boolean z7) {
        window.setDecorFitsSystemWindows(z7);
    }

    /* renamed from: d */
    public static void m3632d(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
