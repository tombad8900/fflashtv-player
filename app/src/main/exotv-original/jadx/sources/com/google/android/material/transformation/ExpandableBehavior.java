package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import p213z.AbstractC2863a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC2863a {
    public ExpandableBehavior() {
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: b */
    public abstract void mo1765b(View view);

    @Override // p213z.AbstractC2863a
    /* renamed from: d */
    public final boolean mo1766d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: g */
    public final boolean mo1755g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!view.isLaidOut()) {
            ArrayList arrayListM509j = coordinatorLayout.m509j(view);
            int size = arrayListM509j.size();
            for (int i4 = 0; i4 < size; i4++) {
                mo1765b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
