package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p034d5.AbstractC0847a;
import p213z.AbstractC2863a;
import p213z.C2866d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* loaded from: classes.dex */
public class C0769xe6e79f6<T> extends AbstractC2863a {
    public C0769xe6e79f6() {
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: a */
    public final /* synthetic */ boolean mo1878a(View view) {
        throw new ClassCastException();
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: c */
    public final void mo1790c(C2866d c2866d) {
        if (c2866d.f10579h == 0) {
            c2866d.f10579h = 80;
        }
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: d */
    public final boolean mo1766d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: g */
    public final boolean mo1755g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public C0769xe6e79f6(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0847a.f3744f);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
