package p200x0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import p183v0.C2510j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x0.j */
/* loaded from: classes.dex */
public final class C2742j implements TransformationMethod {

    /* renamed from: j */
    public final TransformationMethod f10119j;

    public C2742j(TransformationMethod transformationMethod) {
        this.f10119j = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f10119j;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C2510j.m4522a().m4523b() != 1) {
            return charSequence;
        }
        C2510j c2510jM4522a = C2510j.m4522a();
        c2510jM4522a.getClass();
        return c2510jM4522a.m4526e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z7, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f10119j;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z7, i, rect);
        }
    }
}
