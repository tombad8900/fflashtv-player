package p046f0;

import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import p104m.C1780w0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0928a {
    /* renamed from: a */
    public static Typeface m2086a(Typeface typeface, int i, boolean z7) {
        return Typeface.create(typeface, i, z7);
    }

    /* renamed from: b */
    public static String[] m2087b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* renamed from: c */
    public static int m2088c(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* renamed from: d */
    public static int m2089d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: e */
    public static int m2090e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: f */
    public static int m2091f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: g */
    public static int m2092g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* renamed from: h */
    public static int m2093h(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    /* renamed from: i */
    public static PrecomputedText.Params m2094i(C1780w0 c1780w0) {
        return c1780w0.getTextMetricsParams();
    }

    /* renamed from: j */
    public static void m2095j(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* renamed from: k */
    public static boolean m2096k(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
