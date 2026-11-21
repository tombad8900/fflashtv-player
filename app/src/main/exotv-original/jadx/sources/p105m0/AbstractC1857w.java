package p105m0;

import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.w */
/* loaded from: classes.dex */
public abstract class AbstractC1857w {
    /* renamed from: a */
    public static AccessibilityNodeInfo.AccessibilityAction m3635a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* renamed from: b */
    public static float m3636b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    /* renamed from: c */
    public static void m3637c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* renamed from: d */
    public static CharSequence m3638d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* renamed from: e */
    public static int m3639e(ViewConfiguration viewConfiguration, int i, int i4, int i8) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i4, i8);
    }

    /* renamed from: f */
    public static int m3640f(ViewConfiguration viewConfiguration, int i, int i4, int i8) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i4, i8);
    }

    /* renamed from: g */
    public static boolean m3641g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* renamed from: h */
    public static void m3642h(TextView textView, int i, float f8) {
        textView.setLineHeight(i, f8);
    }

    /* renamed from: i */
    public static void m3643i(SurfaceView surfaceView) {
        surfaceView.setSurfaceLifecycle(2);
    }
}
