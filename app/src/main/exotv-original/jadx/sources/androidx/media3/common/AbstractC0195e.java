package androidx.media3.common;

import android.content.res.ColorStateList;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.PopupWindow;
import p104m.C1697a0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.e */
/* loaded from: classes.dex */
public abstract class AbstractC0195e {
    /* renamed from: a */
    public static void m611a(View view, Rect rect, Rect rect2) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }

    /* renamed from: b */
    public static ColorStateList m612b(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    /* renamed from: c */
    public static Insets m613c(int i, int i4, int i8, int i9) {
        return Insets.of(i, i4, i8, i9);
    }

    /* renamed from: d */
    public static void m614d(AudioAttributes.Builder builder) {
        builder.setAllowedCapturePolicy(1);
    }

    /* renamed from: e */
    public static void m615e(C1697a0 c1697a0, Rect rect) {
        c1697a0.setEpicenterBounds(rect);
    }

    /* renamed from: f */
    public static void m616f(C1697a0 c1697a0) {
        c1697a0.setIsClippedToScreen(true);
    }

    /* renamed from: g */
    public static void m617g(PopupWindow popupWindow) {
        popupWindow.setTouchModal(false);
    }
}
