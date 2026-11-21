package p056g1;

import android.os.Bundle;
import android.text.Spanned;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g1.d */
/* loaded from: classes.dex */
public abstract class AbstractC1031d {

    /* renamed from: a */
    public static final String f4389a;

    /* renamed from: b */
    public static final String f4390b;

    /* renamed from: c */
    public static final String f4391c;

    /* renamed from: d */
    public static final String f4392d;

    /* renamed from: e */
    public static final String f4393e;

    static {
        int i = AbstractC1118i0.f4750a;
        f4389a = Integer.toString(0, 36);
        f4390b = Integer.toString(1, 36);
        f4391c = Integer.toString(2, 36);
        f4392d = Integer.toString(3, 36);
        f4393e = Integer.toString(4, 36);
    }

    /* renamed from: a */
    public static Bundle m2227a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f4389a, spanned.getSpanStart(obj));
        bundle2.putInt(f4390b, spanned.getSpanEnd(obj));
        bundle2.putInt(f4391c, spanned.getSpanFlags(obj));
        bundle2.putInt(f4392d, i);
        if (bundle != null) {
            bundle2.putBundle(f4393e, bundle);
        }
        return bundle2;
    }
}
