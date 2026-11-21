package p196w5;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w5.a */
/* loaded from: classes.dex */
public abstract class AbstractC2703a {

    /* renamed from: a */
    public static final int[] f9820a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: b */
    public static final String f9821b = AbstractC2703a.class.getSimpleName();

    /* renamed from: a */
    public static ColorStateList m4755a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f9820a, 0)) != 0) {
            Log.w(f9821b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }
}
