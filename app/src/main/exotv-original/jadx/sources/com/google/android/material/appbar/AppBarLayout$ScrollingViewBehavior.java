package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.media.session.AbstractC0120b;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p034d5.AbstractC0847a;
import p051f5.AbstractC0944a;
import p105m0.AbstractC1828m0;
import p213z.C2866d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0944a {

    /* renamed from: b */
    public final int f3050b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* renamed from: s */
    public static void m1764s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: b */
    public final void mo1765b(View view) {
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: d */
    public boolean mo1766d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((C2866d) view2.getLayoutParams()).f10572a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.f3050b;
            int iM415k = bottom - (i == 0 ? 0 : AbstractC0120b.m415k((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            view.offsetTopAndBottom(iM415k);
        }
        return false;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: h */
    public final boolean mo1756h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i8) {
        int i9 = view.getLayoutParams().height;
        if (i9 != -1 && i9 != -2) {
            return false;
        }
        m1764s(coordinatorLayout.m509j(view));
        return false;
    }

    @Override // p213z.AbstractC2863a
    /* renamed from: l */
    public final boolean mo1767l(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        m1764s(coordinatorLayout.m509j(view));
        return false;
    }

    @Override // p051f5.AbstractC0944a
    /* renamed from: r */
    public final void mo1768r(CoordinatorLayout coordinatorLayout, View view, int i) {
        m1764s(coordinatorLayout.m509j(view));
        coordinatorLayout.m514q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0847a.f3764z);
        this.f3050b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
