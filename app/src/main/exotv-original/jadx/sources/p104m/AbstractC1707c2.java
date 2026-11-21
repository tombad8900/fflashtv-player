package p104m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.media.session.AbstractC0120b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p037e0.AbstractC0850a;
import p054g.AbstractC1026a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.c2 */
/* loaded from: classes.dex */
public abstract class AbstractC1707c2 {

    /* renamed from: a */
    public static final ThreadLocal f6518a = new ThreadLocal();

    /* renamed from: b */
    public static final int[] f6519b = {-16842910};

    /* renamed from: c */
    public static final int[] f6520c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f6521d = {R.attr.state_pressed};

    /* renamed from: e */
    public static final int[] f6522e = {R.attr.state_checked};

    /* renamed from: f */
    public static final int[] f6523f = new int[0];

    /* renamed from: g */
    public static final int[] f6524g = new int[1];

    /* renamed from: a */
    public static void m3388a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC1026a.f4317j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m3389b(Context context, int i) {
        ColorStateList colorStateListM3391d = m3391d(context, i);
        if (colorStateListM3391d != null && colorStateListM3391d.isStateful()) {
            return colorStateListM3391d.getColorForState(f6519b, colorStateListM3391d.getDefaultColor());
        }
        ThreadLocal threadLocal = f6518a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f8 = typedValue.getFloat();
        return AbstractC0850a.m2019d(m3390c(context, i), Math.round(Color.alpha(r4) * f8));
    }

    /* renamed from: c */
    public static int m3390c(Context context, int i) {
        int[] iArr = f6524g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static ColorStateList m3391d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f6524g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0120b.m424t(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
