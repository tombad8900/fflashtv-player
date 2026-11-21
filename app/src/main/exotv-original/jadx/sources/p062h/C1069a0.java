package p062h;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p104m.C1705c0;
import p104m.C1752o;
import p104m.C1760q;
import p104m.C1764r;
import p104m.C1780w0;
import p130p.C2192k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.a0 */
/* loaded from: classes.dex */
public class C1069a0 {

    /* renamed from: b */
    public static final Class[] f4498b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f4499c = {R.attr.onClick};

    /* renamed from: d */
    public static final int[] f4500d = {R.attr.accessibilityHeading};

    /* renamed from: e */
    public static final int[] f4501e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f */
    public static final int[] f4502f = {R.attr.screenReaderFocusable};

    /* renamed from: g */
    public static final String[] f4503g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final C2192k f4504h = new C2192k(0);

    /* renamed from: a */
    public final Object[] f4505a = new Object[2];

    /* renamed from: a */
    public C1752o mo1917a(Context context, AttributeSet attributeSet) {
        return new C1752o(context, attributeSet);
    }

    /* renamed from: b */
    public C1760q mo1918b(Context context, AttributeSet attributeSet) {
        return new C1760q(context, attributeSet, com.exotv.net.R.attr.buttonStyle);
    }

    /* renamed from: c */
    public C1764r mo1919c(Context context, AttributeSet attributeSet) {
        return new C1764r(context, attributeSet, com.exotv.net.R.attr.checkboxStyle);
    }

    /* renamed from: d */
    public C1705c0 mo1920d(Context context, AttributeSet attributeSet) {
        return new C1705c0(context, attributeSet);
    }

    /* renamed from: e */
    public C1780w0 mo1921e(Context context, AttributeSet attributeSet) {
        return new C1780w0(context, attributeSet);
    }

    /* renamed from: f */
    public final View m2251f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        C2192k c2192k = f4504h;
        Constructor constructor = (Constructor) c2192k.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f4498b);
            c2192k.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f4505a);
    }
}
