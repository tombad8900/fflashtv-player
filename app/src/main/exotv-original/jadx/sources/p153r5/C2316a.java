package p153r5;

import android.util.FloatProperty;
import com.google.android.material.focus.FocusRingDrawable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r5.a */
/* loaded from: classes.dex */
public final class C2316a extends FloatProperty {
    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((FocusRingDrawable) obj).f3351t);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f8) {
        FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
        focusRingDrawable.f3351t = f8;
        focusRingDrawable.invalidateSelf();
    }
}
