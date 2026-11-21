package p105m0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC1816i0 {
    /* renamed from: a */
    public static View.AccessibilityDelegate m3555a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* renamed from: b */
    public static void m3556b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i4) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i4);
    }
}
