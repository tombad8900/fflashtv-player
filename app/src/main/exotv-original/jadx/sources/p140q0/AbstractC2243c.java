package p140q0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q0.c */
/* loaded from: classes.dex */
public abstract class AbstractC2243c {
    /* renamed from: a */
    public static EdgeEffect m4015a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* renamed from: b */
    public static float m4016b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* renamed from: c */
    public static float m4017c(EdgeEffect edgeEffect, float f8, float f9) {
        try {
            return edgeEffect.onPullDistance(f8, f9);
        } catch (Throwable unused) {
            edgeEffect.onPull(f8, f9);
            return 0.0f;
        }
    }
}
