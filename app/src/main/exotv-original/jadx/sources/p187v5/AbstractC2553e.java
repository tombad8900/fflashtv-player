package p187v5;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.media.session.AbstractC0120b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v5.e */
/* loaded from: classes.dex */
public abstract class AbstractC2553e {
    /* renamed from: a */
    public static Typeface m4569a(Configuration configuration, Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC0120b.m415k(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
