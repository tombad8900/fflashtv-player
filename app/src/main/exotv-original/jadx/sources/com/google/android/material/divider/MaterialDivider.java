package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.exotv.net.R;
import p034d5.AbstractC0847a;
import p035d6.AbstractC0848a;
import p162s5.AbstractC2374l;
import p168t2.AbstractC2429w;
import p211y5.C2823j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class MaterialDivider extends View {

    /* renamed from: j */
    public final C2823j f3332j;

    /* renamed from: k */
    public int f3333k;

    /* renamed from: l */
    public int f3334l;

    /* renamed from: m */
    public int f3335m;

    /* renamed from: n */
    public int f3336n;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(AbstractC0848a.m2015b(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f3332j = new C2823j();
        TypedArray typedArrayM4215e = AbstractC2374l.m4215e(context2, attributeSet, AbstractC0847a.f3756r, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f3333k = typedArrayM4215e.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f3335m = typedArrayM4215e.getDimensionPixelOffset(2, 0);
        this.f3336n = typedArrayM4215e.getDimensionPixelOffset(1, 0);
        setDividerColor(AbstractC2429w.m4301f(context2, typedArrayM4215e, 0).getDefaultColor());
        typedArrayM4215e.recycle();
    }

    public int getDividerColor() {
        return this.f3334l;
    }

    public int getDividerInsetEnd() {
        return this.f3336n;
    }

    public int getDividerInsetStart() {
        return this.f3335m;
    }

    public int getDividerThickness() {
        return this.f3333k;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z7 = getLayoutDirection() == 1;
        int i4 = z7 ? this.f3336n : this.f3335m;
        if (z7) {
            width = getWidth();
            i = this.f3335m;
        } else {
            width = getWidth();
            i = this.f3336n;
        }
        int i8 = width - i;
        int bottom = getBottom() - getTop();
        C2823j c2823j = this.f3332j;
        c2823j.setBounds(i4, 0, i8, bottom);
        c2823j.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int mode = View.MeasureSpec.getMode(i4);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i8 = this.f3333k;
            if (i8 > 0 && measuredHeight != i8) {
                measuredHeight = i8;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.f3334l != i) {
            this.f3334l = i;
            this.f3332j.m4945q(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.f3336n = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.f3335m = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.f3333k != i) {
            this.f3333k = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
